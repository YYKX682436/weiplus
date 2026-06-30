package yt3;

/* loaded from: classes10.dex */
public final class z2 extends yt3.b {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.RelativeLayout f547270d;

    /* renamed from: e, reason: collision with root package name */
    public final ju3.d0 f547271e;

    /* renamed from: f, reason: collision with root package name */
    public final zt3.a f547272f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16548x9f1d7908 f547273g;

    /* renamed from: h, reason: collision with root package name */
    public int f547274h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f547275i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f547276m;

    /* renamed from: n, reason: collision with root package name */
    public final int f547277n;

    /* renamed from: o, reason: collision with root package name */
    public long f547278o;

    public z2(android.widget.RelativeLayout layout, ju3.d0 status, zt3.a kitContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "layout");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kitContext, "kitContext");
        this.f547270d = layout;
        this.f547271e = status;
        this.f547272f = kitContext;
        android.view.View findViewById = layout.findViewById(com.p314xaae8f345.mm.R.id.lok);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f547273g = (com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16548x9f1d7908) findViewById;
        this.f547274h = 10000;
        this.f547276m = true;
        this.f547277n = 1000;
        this.f547278o = -1L;
        kitContext.R6(new yt3.t2(this));
    }

    @Override // yt3.b
    public void a() {
    }

    @Override // yt3.b
    public void b(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 config) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        this.f547274h = config.f237218w + 500;
        java.lang.Boolean enablePicture = config.f237214s;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(enablePicture, "enablePicture");
        this.f547275i = enablePicture.booleanValue();
        java.lang.Boolean enableVideo = config.f237215t;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(enableVideo, "enableVideo");
        boolean booleanValue = enableVideo.booleanValue();
        int i17 = this.f547274h;
        yt3.u2 u2Var = new yt3.u2(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16548x9f1d7908 c16548x9f1d7908 = this.f547273g;
        c16548x9f1d7908.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveMMSightRecordButton", "setInitData >> 100, " + i17);
        c16548x9f1d7908.D = 100;
        c16548x9f1d7908.E = i17;
        c16548x9f1d7908.F = u2Var;
        c16548x9f1d7908.I = booleanValue;
        java.lang.Boolean enablePicture2 = config.f237214s;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(enablePicture2, "enablePicture");
        if (enablePicture2.booleanValue()) {
            c16548x9f1d7908.m66957xee2457b4(new yt3.v2(this));
        }
        java.lang.Boolean enableVideo2 = config.f237215t;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(enableVideo2, "enableVideo");
        if (enableVideo2.booleanValue()) {
            c16548x9f1d7908.m66953x86d19c4a(new yt3.w2(this));
            c16548x9f1d7908.m66954x7f8af277(new yt3.x2(this));
        }
        c16548x9f1d7908.m66950xa393dd75(new yt3.y2(this));
        java.lang.Boolean enablePicture3 = config.f237214s;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(enablePicture3, "enablePicture");
        boolean booleanValue2 = enablePicture3.booleanValue();
        android.widget.RelativeLayout relativeLayout = this.f547270d;
        zt3.a aVar = this.f547272f;
        if (booleanValue2) {
            java.lang.Boolean enableVideo3 = config.f237215t;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(enableVideo3, "enableVideo");
            if (enableVideo3.booleanValue()) {
                aVar.X6(new ku3.n0(1, 2, i65.a.r(relativeLayout.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.f574076gw4)));
                return;
            }
        }
        java.lang.Boolean enablePicture4 = config.f237214s;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(enablePicture4, "enablePicture");
        if (enablePicture4.booleanValue()) {
            aVar.X6(new ku3.n0(1, 2, i65.a.r(relativeLayout.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.f574077gw5)));
            return;
        }
        java.lang.Boolean enableVideo4 = config.f237215t;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(enableVideo4, "enableVideo");
        if (enableVideo4.booleanValue()) {
            aVar.X6(new ku3.n0(1, 2, i65.a.r(relativeLayout.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.gw6)));
        }
    }

    @Override // yt3.b
    public boolean c() {
        return this.f547273g.f230695u;
    }

    @Override // yt3.b
    public void d() {
        if (this.f547275i) {
            ju3.d0.k(this.f547271e, ju3.c0.f383434s, null, 2, null);
        } else {
            this.f547272f.X6(new ku3.n0(1, 3, i65.a.r(this.f547270d.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.ht8)));
        }
    }

    @Override // yt3.b
    public void e(int i17) {
        this.f547273g.m66955x7bb34eee(i17);
    }

    @Override // yt3.b
    public void f(boolean z17) {
        this.f547273g.m66951xc0c9abea(z17);
    }

    @Override // yt3.b
    public void g(boolean z17) {
        this.f547276m = z17;
    }

    @Override // yt3.b
    public void h(int i17, int i18) {
        this.f547273g.g(i17, i18);
    }

    @Override // yt3.b
    public void i(boolean z17) {
        this.f547273g.m66958xbc91ffe0(z17);
    }

    @Override // yt3.b
    public void j(android.view.View.OnClickListener clickListener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clickListener, "clickListener");
    }

    @Override // yt3.b
    public void k() {
    }

    public final void m(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16548x9f1d7908 c16548x9f1d7908 = this.f547273g;
        c16548x9f1d7908.m66958xbc91ffe0(false);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_1_BOOLEAN", z17);
        this.f547271e.w(ju3.c0.f383420m, bundle);
        c16548x9f1d7908.announceForAccessibility(i65.a.r(c16548x9f1d7908.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.f571506h2));
    }

    public final void n(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveRecordButtonPlugin", "startRecord is Auto >> " + z17);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_1_BOOLEAN", z17);
        this.f547271e.w(ju3.c0.f383414i, bundle);
    }

    @Override // yt3.r2
    /* renamed from: onAttach */
    public void mo10988x3b13c504() {
        this.f547270d.setVisibility(0);
    }

    @Override // yt3.r2
    /* renamed from: onDetach */
    public void mo10989x3f5eee52() {
        this.f547270d.setVisibility(4);
    }

    @Override // yt3.r2
    /* renamed from: reset */
    public void mo9066x6761d4f() {
        this.f547273g.m66958xbc91ffe0(true);
    }

    @Override // yt3.r2
    /* renamed from: setVisibility */
    public void mo9067x901b6914(int i17) {
        this.f547273g.setVisibility(i17);
        if (this.f547276m) {
            this.f547270d.bringToFront();
        }
    }
}
