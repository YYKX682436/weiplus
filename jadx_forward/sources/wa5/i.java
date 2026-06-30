package wa5;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f525854a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f525855b;

    public i(java.lang.String transitionName, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(transitionName, "transitionName");
        this.f525854a = transitionName;
        this.f525855b = obj;
    }

    /* renamed from: equals */
    public boolean m173427xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wa5.i)) {
            return false;
        }
        wa5.i iVar = (wa5.i) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f525854a, iVar.f525854a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f525855b, iVar.f525855b);
    }

    /* renamed from: hashCode */
    public int m173428x8cdac1b() {
        int hashCode = this.f525854a.hashCode() * 31;
        java.lang.Object obj = this.f525855b;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m173429x9616526c() {
        return "TransitionInfo(transitionName=" + this.f525854a + ", extraInfo=" + this.f525855b + ')';
    }
}
