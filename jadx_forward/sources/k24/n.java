package k24;

/* loaded from: classes11.dex */
public final class n implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2071xc2079749.C17590x59bbde0e f385298a;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2071xc2079749.C17590x59bbde0e c17590x59bbde0e) {
        this.f385298a = c17590x59bbde0e;
    }

    @Override // al5.c2
    /* renamed from: onStatusChange */
    public final void mo2289xd6191dc1(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2071xc2079749.C17590x59bbde0e c17590x59bbde0e = this.f385298a;
        c17590x59bbde0e.f243490i = z17;
        c17590x59bbde0e.t7(c17590x59bbde0e.m158354x19263085().getIntent());
        c17590x59bbde0e.f82418d = c17590x59bbde0e.v7();
        if (z17) {
            ip.l.r(true);
            l14.e.f396541a.b(l14.d.f396536e);
            c17590x59bbde0e.s7();
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = 3;
            objArr[1] = java.lang.Integer.valueOf(c17590x59bbde0e.f243489h ? 1 : 2);
            g0Var.d(29634, objArr);
        } else {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) c17590x59bbde0e.m80379x76847179(), 1, false);
            k0Var.s(com.p314xaae8f345.mm.ui.id.b(c17590x59bbde0e.m80379x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dmw, (android.view.ViewGroup) null), false);
            k0Var.f293405n = new k24.j(c17590x59bbde0e);
            k0Var.f293414s = new k24.k(c17590x59bbde0e);
            k0Var.m("取消");
            k0Var.C = new k24.l(c17590x59bbde0e);
            k0Var.f293387d = new k24.m(c17590x59bbde0e);
            k0Var.v();
        }
        if (!fp.h.c(26) || ip.b.u()) {
            if (c17590x59bbde0e.f243490i) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(500L, 0L, 1L, false);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(500L, 1L, 1L, false);
            }
            c01.a9.b(true, false);
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(c17590x59bbde0e.m80379x76847179());
        u1Var.g(c17590x59bbde0e.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f574523df4));
        u1Var.a(false);
        c17590x59bbde0e.f243490i = false;
        ip.l.r(false);
        u1Var.b(new k24.i(c17590x59bbde0e));
        u1Var.q(false);
    }
}
