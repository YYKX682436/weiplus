package xt2;

/* loaded from: classes3.dex */
public final class d extends xt2.m implements xt2.p6, jf2.j, jf2.o, jf2.l, jf2.m {

    /* renamed from: o, reason: collision with root package name */
    public final android.view.ViewGroup f538199o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f538200p;

    /* renamed from: q, reason: collision with root package name */
    public int f538201q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f538202r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f538203s;

    /* renamed from: t, reason: collision with root package name */
    public final android.view.View f538204t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f538205u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(android.view.ViewGroup root, qo0.c statusMonitor, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l basePlugin) {
        super(root, statusMonitor, basePlugin);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(basePlugin, "basePlugin");
        this.f538199o = root;
        this.f538200p = "FinderLiveAnchorShoppingEntranceWidget";
        this.f538202r = true;
        this.f538203s = jz5.h.b(new xt2.c(this));
        android.view.View findViewById = root.findViewById(com.p314xaae8f345.mm.R.id.f568442mv0);
        this.f538204t = findViewById;
        android.widget.TextView textView = (android.widget.TextView) root.findViewById(com.p314xaae8f345.mm.R.id.mum);
        this.f538205u = "anchorlive.bottom.shopping";
        root.setOnClickListener(new xt2.a(this));
        root.getViewTreeObserver().addOnGlobalLayoutListener(new xt2.b(basePlugin, this));
        ll2.e eVar = ll2.e.f400666a;
        java.lang.Object context = root.getContext();
        ll2.e.l(eVar, context instanceof p012xc85e97e9.p093xedfae76a.y ? (p012xc85e97e9.p093xedfae76a.y) context : null, "anchorlive.bottom.shopping", findViewById, null, textView, 8, null);
    }

    @Override // jf2.l
    public void F(int i17) {
        s();
    }

    @Override // xt2.p6
    public void a(boolean z17) {
    }

    @Override // jf2.h
    public void b() {
        android.view.ViewGroup viewGroup = this.f538199o;
        if (viewGroup.getVisibility() != 0 || this.f538202r) {
            this.f538202r = false;
            s();
        }
        viewGroup.setVisibility(0);
    }

    @Override // xt2.p6
    public android.view.View c() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) ((jz5.n) this.f538203s).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c22699x3dcdb352, "<get-entranceView>(...)");
        return c22699x3dcdb352;
    }

    @Override // jf2.j
    public jz5.l d() {
        return new jz5.l(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f80309xebda304e), java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.dug));
    }

    @Override // jf2.j
    public void e(int i17) {
        this.f538199o.performClick();
    }

    @Override // xt2.m6
    public android.view.View f() {
        return this.f538199o.findViewById(com.p314xaae8f345.mm.R.id.mut);
    }

    @Override // jf2.h
    public void g() {
        this.f538199o.setVisibility(8);
    }

    @Override // xt2.m6
    public android.view.ViewGroup h() {
        return this.f538199o;
    }

    @Override // jf2.h
    public boolean i() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = this.f538410f;
        return !((mm2.e1) lVar.P0(mm2.e1.class)).b7() && ((mm2.f6) lVar.P0(mm2.f6.class)).N6();
    }

    @Override // xt2.p6
    /* renamed from: isVisible */
    public boolean mo175918xf94337e8() {
        return this.f538199o.getVisibility() == 0;
    }

    @Override // xt2.m6
    public android.widget.ImageView j() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) ((jz5.n) this.f538203s).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c22699x3dcdb352, "<get-entranceView>(...)");
        return c22699x3dcdb352;
    }

    @Override // xt2.m
    public java.lang.String k() {
        return "finder_live_shopping_entrance_fire.pag";
    }

    @Override // xt2.m
    public java.lang.String l() {
        return "FinderLiveAnchorShoppingEntrance";
    }

    @Override // xt2.m
    public com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b m() {
        android.view.View findViewById = this.f538199o.findViewById(com.p314xaae8f345.mm.R.id.f566347fm3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        return (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) findViewById;
    }

    public final void r() {
        so2.j5 j5Var = ((mm2.f6) this.f538410f.P0(mm2.f6.class)).f410582w;
        android.os.Bundle bundle = new android.os.Bundle();
        if (j5Var instanceof cm2.m0) {
            bundle.putLong("PARAM_FINDER_LIVE_BUBBLE_PRODUCTID", ((cm2.m0) j5Var).f124902w);
        }
        bundle.putBoolean("PARAM_FINDER_LIVE_SHOPPING_SOURCE_CLICK", true);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb.T8((zy2.zb) c17, ml2.t1.N, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(ml2.s1.f409449f), null, null, null, null, false, 124, null);
        this.f538409e.mo46557x60d69242(qo0.b.f446882f2, bundle);
    }

    public final void s() {
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb.I8((zy2.zb) c17, ml2.u1.P, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(ml2.s1.f409449f), null, null, null, null, false, 124, null);
        ll2.e.f400666a.j(this.f538205u, false);
    }

    @Override // jf2.h
    /* renamed from: type */
    public int mo58036x368f3a() {
        return 16;
    }
}
