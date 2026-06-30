package k24;

/* loaded from: classes11.dex */
public final class k implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2071xc2079749.C17590x59bbde0e f385295d;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2071xc2079749.C17590x59bbde0e c17590x59bbde0e) {
        this.f385295d = c17590x59bbde0e;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menuItem, "menuItem");
        if (menuItem.getItemId() == 1) {
            ip.l.r(false);
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
            f9Var.j1(2);
            f9Var.e1(java.lang.System.currentTimeMillis());
            f9Var.m124850x7650bebc(1);
            f9Var.u1("weixin");
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2071xc2079749.C17590x59bbde0e c17590x59bbde0e = this.f385295d;
            f9Var.d1(c17590x59bbde0e.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574594m52, wo.w0.m()));
            c01.w9.x(f9Var);
            com.p314xaae8f345.mm.p2621x8fb0427b.l4 p17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p("weixin");
            if (p17 != null) {
                p17.l1(c17590x59bbde0e.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574594m52, wo.w0.m()));
                p17.Y1(p17.d1() + 1);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().W(p17, "weixin");
            } else {
                com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var = new com.p314xaae8f345.mm.p2621x8fb0427b.l4();
                l4Var.l1(c17590x59bbde0e.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574594m52, wo.w0.m()));
                l4Var.b2("weixin");
                l4Var.Y1(1);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().G(l4Var);
            }
            l14.e.f396541a.b(l14.d.f396536e);
            c17590x59bbde0e.s7();
        }
    }
}
