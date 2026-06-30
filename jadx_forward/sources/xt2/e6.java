package xt2;

/* loaded from: classes3.dex */
public final class e6 extends xt2.m implements xt2.p6, jf2.o, jf2.l, jf2.m {

    /* renamed from: o, reason: collision with root package name */
    public final android.view.ViewGroup f538260o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f538261p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f538262q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e6(android.view.ViewGroup root, qo0.c statusMonitor, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l basePlugin) {
        super(root, statusMonitor, basePlugin);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(basePlugin, "basePlugin");
        this.f538260o = root;
        root.setOnClickListener(new xt2.b6(this));
        this.f538261p = jz5.h.b(new xt2.c6(this));
        this.f538262q = jz5.h.b(new xt2.d6(this));
    }

    @Override // jf2.l
    public void F(int i17) {
        s();
    }

    @Override // xt2.p6
    public void a(boolean z17) {
    }

    @Override // jf2.o
    public void b() {
        if (this.f538260o.getVisibility() != 0) {
            s();
        }
        t(0);
    }

    @Override // xt2.p6
    public android.view.View c() {
        android.widget.ImageView imageView = (android.widget.ImageView) ((jz5.n) this.f538262q).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(imageView, "<get-entranceView>(...)");
        return imageView;
    }

    @Override // jf2.l
    public jz5.l d() {
        return new jz5.l(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f80309xebda304e), java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.dug));
    }

    @Override // jf2.m
    public void e(int i17) {
        r();
    }

    @Override // xt2.m6
    public android.view.View f() {
        return (android.view.View) ((jz5.n) this.f538261p).mo141623x754a37bb();
    }

    @Override // jf2.o
    public void g() {
        t(8);
    }

    @Override // xt2.m6
    public android.view.ViewGroup h() {
        return this.f538260o;
    }

    @Override // jf2.o
    public boolean i() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = this.f538410f;
        return ((mm2.f6) lVar.P0(mm2.f6.class)).f410568i && !zl2.r4.f555483a.X1(((mm2.e1) lVar.P0(mm2.e1.class)).f410522s);
    }

    @Override // xt2.p6
    /* renamed from: isVisible */
    public boolean mo175918xf94337e8() {
        return this.f538260o.getVisibility() == 0;
    }

    @Override // xt2.m6
    public android.widget.ImageView j() {
        android.widget.ImageView imageView = (android.widget.ImageView) ((jz5.n) this.f538262q).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(imageView, "<get-entranceView>(...)");
        return imageView;
    }

    @Override // xt2.m
    public java.lang.String k() {
        return "finder_live_shopping_entrance_fire.pag";
    }

    @Override // xt2.m
    public java.lang.String l() {
        return "FinderLiveVisitorShoppingEntrance";
    }

    @Override // xt2.m
    public com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b m() {
        android.view.View findViewById = this.f538260o.findViewById(com.p314xaae8f345.mm.R.id.f566347fm3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        return (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) findViewById;
    }

    public final void r() {
        xu2.u uVar;
        xu2.v vVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = this.f538410f;
        so2.j5 j5Var = ((mm2.f6) lVar.P0(mm2.f6.class)).f410582w;
        android.os.Bundle bundle = new android.os.Bundle();
        if (j5Var instanceof cm2.m0) {
            bundle.putLong("PARAM_FINDER_LIVE_BUBBLE_PRODUCTID", ((cm2.m0) j5Var).f124902w);
        }
        this.f538409e.mo46557x60d69242(qo0.b.f446882f2, bundle);
        if (!((mm2.c1) lVar.P0(mm2.c1.class)).M7() || (uVar = (xu2.u) lVar.X0(xu2.u.class)) == null || (vVar = uVar.f538765r) == null) {
            return;
        }
        vVar.a();
        vVar.c(2016);
    }

    public final void s() {
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0.Dj((ml2.r0) c17, ml2.f4.E, null, null, null, null, null, 0, 0L, null, null, null, null, false, null, 16376, null);
    }

    public void t(int i17) {
        boolean mo168058x74219ae7 = ((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7();
        android.view.ViewGroup viewGroup = this.f538260o;
        if (mo168058x74219ae7) {
            viewGroup.setVisibility(8);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.FinderLiveVisitorShoppingEntranceWidget", "setVisible return for isTeenMode");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = this.f538410f;
        if (((mm2.c1) lVar.P0(mm2.c1.class)).a8() || i17 != 0) {
            viewGroup.setVisibility(i17);
            return;
        }
        dk2.xf W0 = lVar.W0();
        if (W0 != null) {
            ((dk2.r4) W0).n(viewGroup, i17);
        }
    }

    @Override // jf2.o
    /* renamed from: type */
    public int mo57989x368f3a() {
        return 16;
    }
}
