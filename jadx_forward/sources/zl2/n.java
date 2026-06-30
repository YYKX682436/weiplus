package zl2;

/* loaded from: classes8.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f555427a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f555428b;

    /* renamed from: c, reason: collision with root package name */
    public final zl2.o f555429c;

    /* renamed from: d, reason: collision with root package name */
    public final zl2.m f555430d;

    public n(android.view.View view, boolean z17, zl2.o lpHeight, zl2.m alpha, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        lpHeight = (i17 & 4) != 0 ? new zl2.o(0, 0, 0) : lpHeight;
        alpha = (i17 & 8) != 0 ? new zl2.m(1.0f, 1.0f, 1.0f) : alpha;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lpHeight, "lpHeight");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(alpha, "alpha");
        this.f555427a = view;
        this.f555428b = z17;
        this.f555429c = lpHeight;
        this.f555430d = alpha;
    }

    /* renamed from: equals */
    public boolean m179114xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zl2.n)) {
            return false;
        }
        zl2.n nVar = (zl2.n) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f555427a, nVar.f555427a) && this.f555428b == nVar.f555428b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f555429c, nVar.f555429c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f555430d, nVar.f555430d);
    }

    /* renamed from: hashCode */
    public int m179115x8cdac1b() {
        return (((((this.f555427a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f555428b)) * 31) + this.f555429c.m179119x8cdac1b()) * 31) + this.f555430d.m179111x8cdac1b();
    }

    /* renamed from: toString */
    public java.lang.String m179116x9616526c() {
        return "InOutConf(view=" + this.f555427a + ", resetAfterFinish=" + this.f555428b + ", lpHeight=" + this.f555429c + ", alpha=" + this.f555430d + ')';
    }
}
