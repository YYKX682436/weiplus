package on2;

/* loaded from: classes3.dex */
public final class d extends xt2.m6 implements jf2.o, jf2.l, jf2.m {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f428393d;

    /* renamed from: e, reason: collision with root package name */
    public final qo0.c f428394e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l f428395f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f428396g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f428397h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f428398i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f428399m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f428400n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f428401o;

    public d(android.view.ViewGroup root, qo0.c statusMonitor, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l basePlugin) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(basePlugin, "basePlugin");
        this.f428393d = root;
        this.f428394e = statusMonitor;
        this.f428395f = basePlugin;
        this.f428396g = "Finder.FinderLiveAnchorLotteryEntranceWidget";
        this.f428397h = true;
        this.f428398i = "anchorlive.bottom.lottery";
        this.f428399m = "anchorlive.bottom.lottery.lottery";
        this.f428400n = "anchorlive.bottom.lottery.redpacket";
        android.view.View findViewById = root.findViewById(com.p314xaae8f345.mm.R.id.f87);
        findViewById = findViewById == null ? root : findViewById;
        this.f428401o = findViewById;
        findViewById.setOnClickListener(new on2.a(this));
        android.view.View findViewById2 = root.findViewById(com.p314xaae8f345.mm.R.id.isg);
        android.widget.TextView textView = (android.widget.TextView) root.findViewById(com.p314xaae8f345.mm.R.id.ir7);
        ll2.e eVar = ll2.e.f400666a;
        java.lang.Object context = root.getContext();
        ll2.e.l(eVar, context instanceof p012xc85e97e9.p093xedfae76a.y ? (p012xc85e97e9.p093xedfae76a.y) context : null, "anchorlive.bottom.lottery", findViewById2, null, textView, 8, null);
    }

    @Override // jf2.l
    public void F(int i17) {
        l();
    }

    @Override // jf2.o
    public void b() {
        if (this.f428397h && this.f428393d.getVisibility() != 0) {
            this.f428397h = false;
            l();
            boolean z17 = ((mm2.c1) this.f428395f.P0(mm2.c1.class)).T;
            boolean z18 = ((mm2.n0) this.f428395f.P0(mm2.n0.class)).f410806r;
            if (z17 || z18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f428396g, "prepare lottery panel for assistant or co-live invitee anchor!");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.a(this.f428395f, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new on2.c(this, null), 2, null);
            }
        }
        this.f428393d.setVisibility(0);
    }

    @Override // jf2.l
    public jz5.l d() {
        return new jz5.l(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f79892x630439a8), java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.dol));
    }

    @Override // jf2.m
    public void e(int i17) {
        this.f428401o.performClick();
    }

    @Override // xt2.m6
    public android.view.View f() {
        return this.f428393d.findViewById(com.p314xaae8f345.mm.R.id.f87);
    }

    @Override // jf2.o
    public void g() {
        this.f428393d.setVisibility(8);
    }

    @Override // xt2.m6
    public android.view.ViewGroup h() {
        return this.f428393d;
    }

    @Override // jf2.o
    public boolean i() {
        return ((mm2.c1) this.f428395f.P0(mm2.c1.class)).T;
    }

    @Override // xt2.m6
    public android.widget.ImageView j() {
        android.view.View findViewById = this.f428393d.findViewById(com.p314xaae8f345.mm.R.id.f8c);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        return (android.widget.ImageView) findViewById;
    }

    public final void k() {
        if (this.f428394e.mo11219xd0598cf8() == 1) {
            ((ml2.j0) i95.n0.c(ml2.j0.class)).Fj(ml2.j1.f409125e, "");
        }
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb.T8((zy2.zb) c17, ml2.t1.T, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(ml2.s1.f409449f), null, null, null, null, false, 124, null);
        df2.gq gqVar = (df2.gq) this.f428395f.U0(df2.gq.class);
        if (gqVar != null) {
            gqVar.b7();
        }
    }

    public final void l() {
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb.I8((zy2.zb) c17, ml2.u1.T, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(ml2.s1.f409449f), null, null, null, null, false, 124, null);
        ll2.e.f400666a.j(this.f428398i, false);
    }

    @Override // jf2.o
    /* renamed from: type */
    public int mo57989x368f3a() {
        return 6;
    }

    @Override // jf2.o
    public boolean u() {
        return !zl2.r4.f555483a.w1();
    }
}
