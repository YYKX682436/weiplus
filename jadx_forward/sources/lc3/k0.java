package lc3;

/* loaded from: classes7.dex */
public final class k0 extends lc3.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f399438a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f399439b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(java.lang.String pkgPath, java.lang.String mainScriptName) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pkgPath, "pkgPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mainScriptName, "mainScriptName");
        this.f399438a = pkgPath;
        this.f399439b = mainScriptName;
    }

    /* renamed from: equals */
    public boolean m145573xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lc3.k0)) {
            return false;
        }
        lc3.k0 k0Var = (lc3.k0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f399438a, k0Var.f399438a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f399439b, k0Var.f399439b);
    }

    /* renamed from: hashCode */
    public int m145574x8cdac1b() {
        return (this.f399438a.hashCode() * 31) + this.f399439b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m145575x9616526c() {
        return "MBWxaPkgScriptDescriptor(pkgPath=" + this.f399438a + ", mainScriptName=" + this.f399439b + ')';
    }
}
