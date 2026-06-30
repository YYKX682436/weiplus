package vh0;

/* loaded from: classes8.dex */
public final class p1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f518468a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f518469b;

    public p1(java.lang.Object obj, java.lang.Object obj2) {
        this.f518468a = obj;
        this.f518469b = obj2;
    }

    /* renamed from: equals */
    public boolean m172094xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vh0.p1)) {
            return false;
        }
        vh0.p1 p1Var = (vh0.p1) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f518468a, p1Var.f518468a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f518469b, p1Var.f518469b);
    }

    /* renamed from: hashCode */
    public int m172095x8cdac1b() {
        java.lang.Object obj = this.f518468a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        java.lang.Object obj2 = this.f518469b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m172096x9616526c() {
        return "OpResult(status=" + this.f518468a + ", value=" + this.f518469b + ')';
    }
}
