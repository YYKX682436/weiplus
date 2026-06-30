package k24;

/* loaded from: classes11.dex */
public final class g implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2071xc2079749.C17589x51b26b56 f385291a;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2071xc2079749.C17589x51b26b56 c17589x51b26b56) {
        this.f385291a = c17589x51b26b56;
    }

    @Override // al5.c2
    /* renamed from: onStatusChange */
    public final void mo2289xd6191dc1(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2071xc2079749.C17589x51b26b56 c17589x51b26b56 = this.f385291a;
        c17589x51b26b56.f243488i = z17;
        c17589x51b26b56.t7(c17589x51b26b56.m158354x19263085().getIntent());
        c17589x51b26b56.f82418d = c17589x51b26b56.v7();
        if (!z17) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) c17589x51b26b56.m80379x76847179(), 1, false);
            k0Var.s(com.p314xaae8f345.mm.ui.id.b(c17589x51b26b56.m80379x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dmx, (android.view.ViewGroup) null), false);
            k0Var.f293405n = new k24.c(c17589x51b26b56);
            k0Var.f293414s = new k24.d(c17589x51b26b56);
            k0Var.m("取消");
            k0Var.C = new k24.e(c17589x51b26b56);
            k0Var.f293387d = new k24.f(c17589x51b26b56);
            k0Var.v();
            return;
        }
        ip.l.s(true);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.mo68477x336bdfd8(500L, 2L, 1L, false);
        c01.a9.b(false, true);
        l14.e.f396541a.b(l14.d.f396537f);
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = 4;
        objArr[1] = java.lang.Integer.valueOf(c17589x51b26b56.f243487h ? 1 : 2);
        g0Var.d(29634, objArr);
        c17589x51b26b56.s7();
    }
}
