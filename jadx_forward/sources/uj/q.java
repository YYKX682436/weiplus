package uj;

/* loaded from: classes3.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f509709a;

    /* renamed from: b, reason: collision with root package name */
    public final int f509710b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f509711c;

    public q(java.lang.String appId, int i17, java.lang.String moduleName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(moduleName, "moduleName");
        this.f509709a = appId;
        this.f509710b = i17;
        this.f509711c = moduleName;
    }

    /* renamed from: equals */
    public boolean m168102xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uj.q)) {
            return false;
        }
        uj.q qVar = (uj.q) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f509709a, qVar.f509709a) && this.f509710b == qVar.f509710b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f509711c, qVar.f509711c);
    }

    /* renamed from: hashCode */
    public int m168103x8cdac1b() {
        return (((this.f509709a.hashCode() * 31) + java.lang.Integer.hashCode(this.f509710b)) * 31) + this.f509711c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m168104x9616526c() {
        return "PlayablePkgInfo(appId=" + this.f509709a + ", versionType=" + this.f509710b + ", moduleName=" + this.f509711c + ')';
    }
}
