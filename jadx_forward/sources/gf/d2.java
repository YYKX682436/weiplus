package gf;

/* loaded from: classes5.dex */
public final class d2 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f352567a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f352568b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f352569c;

    public d2(boolean z17, java.util.List pathWhiteList, java.util.List exptList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pathWhiteList, "pathWhiteList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exptList, "exptList");
        this.f352567a = z17;
        this.f352568b = pathWhiteList;
        this.f352569c = exptList;
    }

    /* renamed from: equals */
    public boolean m131383xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf.d2)) {
            return false;
        }
        gf.d2 d2Var = (gf.d2) obj;
        return this.f352567a == d2Var.f352567a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f352568b, d2Var.f352568b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f352569c, d2Var.f352569c);
    }

    /* renamed from: hashCode */
    public int m131384x8cdac1b() {
        return (((java.lang.Boolean.hashCode(this.f352567a) * 31) + this.f352568b.hashCode()) * 31) + this.f352569c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m131385x9616526c() {
        return "SkylineExptGroup(isEnabled=" + this.f352567a + ", pathWhiteList=" + this.f352568b + ", exptList=" + this.f352569c + ')';
    }
}
