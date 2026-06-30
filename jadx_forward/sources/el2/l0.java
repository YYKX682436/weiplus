package el2;

/* loaded from: classes3.dex */
public final class l0 extends xt2.m6 implements jf2.o, jf2.m, jf2.l {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f335378d;

    /* renamed from: e, reason: collision with root package name */
    public final qo0.c f335379e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l f335380f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f335381g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f335382h;

    public l0(android.view.ViewGroup root, qo0.c statusMonitor, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l basePlugin) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(basePlugin, "basePlugin");
        this.f335378d = root;
        this.f335379e = statusMonitor;
        this.f335380f = basePlugin;
        this.f335381g = (android.widget.ImageView) root.findViewById(com.p314xaae8f345.mm.R.id.f567965l65);
        this.f335382h = root.findViewById(com.p314xaae8f345.mm.R.id.f567964l64);
        root.setOnClickListener(new el2.j0(this));
        ym5.a1.h(root, new el2.k0(this));
    }

    @Override // jf2.l
    public void F(int i17) {
        bf2.c.b(bf2.c.f101131a, this.f335380f.S0(), 1, 0, null, 0, 28, null);
    }

    @Override // jf2.o
    public void b() {
        this.f335378d.setVisibility(0);
    }

    @Override // jf2.l
    public jz5.l d() {
        return new jz5.l(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f80145xebd70552), java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.mis));
    }

    @Override // jf2.m
    public void e(int i17) {
        this.f335378d.performClick();
    }

    @Override // xt2.m6
    public android.view.View f() {
        return this.f335382h;
    }

    @Override // jf2.o
    public void g() {
        this.f335378d.setVisibility(8);
    }

    @Override // xt2.m6
    public android.view.ViewGroup h() {
        return this.f335378d;
    }

    @Override // jf2.o
    public boolean i() {
        mm2.n0 n0Var = (mm2.n0) this.f335380f.S0().a(mm2.n0.class);
        boolean z17 = ((mm2.c1) this.f335380f.S0().a(mm2.c1.class)).T;
        boolean z18 = n0Var.f410806r;
        p3325xe03a0797.p3326xc267989b.p3328x30012e.f3 f3Var = n0Var.f410804p;
        boolean z19 = z17 && !((f3Var != null ? (r45.a84) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.l2) f3Var).mo144003x754a37bb() : null) != null);
        if (zl2.q4.f555466a.D(this.f335380f.S0())) {
            return z19 || z18;
        }
        return false;
    }

    @Override // xt2.m6
    public android.widget.ImageView j() {
        android.widget.ImageView imgView = this.f335381g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(imgView, "imgView");
        return imgView;
    }

    @Override // jf2.o
    /* renamed from: type */
    public int mo57989x368f3a() {
        return 4;
    }

    @Override // jf2.o
    public boolean u() {
        return !zl2.r4.f555483a.w1();
    }
}
