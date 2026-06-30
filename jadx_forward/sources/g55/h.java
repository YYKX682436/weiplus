package g55;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f350528a;

    /* renamed from: b, reason: collision with root package name */
    public final int f350529b;

    /* renamed from: c, reason: collision with root package name */
    public int f350530c;

    public h(java.lang.String pageName, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageName, "pageName");
        this.f350528a = pageName;
        this.f350529b = i17;
    }

    /* renamed from: equals */
    public boolean m130931xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g55.h)) {
            return false;
        }
        g55.h hVar = (g55.h) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f350528a, hVar.f350528a) && this.f350529b == hVar.f350529b;
    }

    /* renamed from: hashCode */
    public int m130932x8cdac1b() {
        return (this.f350528a.hashCode() * 31) + java.lang.Integer.hashCode(this.f350529b);
    }

    /* renamed from: toString */
    public java.lang.String m130933x9616526c() {
        return "PageDelayInfo(pageName=" + this.f350528a + ", pageHashCode=" + this.f350529b + ')';
    }
}
