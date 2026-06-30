package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8;

/* loaded from: classes9.dex */
public class x5 implements com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.b6 f284073a;

    public x5(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.b6 b6Var) {
        this.f284073a = b6Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.i0
    public void a(android.view.View view, int i17, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.f0 f0Var) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.z5 z5Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.z5) f0Var;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.b6 b6Var = this.f284073a;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(b6Var.f284075e, z5Var.f279944d);
        b6Var.getClass();
        de5.a.f310929a.k(5, 11, 12);
        int ordinal = z5Var.f284122j.ordinal();
        bw5.x8 x8Var = bw5.x8.ECS_REQ_SCENE_SEARCH;
        java.lang.String str = z5Var.f279945e;
        if (ordinal == 0) {
            int i18 = rl.b.f478676a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShopAndProductListPresenter", "click SHOP item", null);
            ((b00.r) ((c00.z2) i95.n0.c(c00.z2.class))).pj(view.getContext(), str, Li, x8Var);
            return;
        }
        if (ordinal != 1) {
            return;
        }
        int i19 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShopAndProductListPresenter", "click PRODUCT item", null);
        ((b00.r) ((c00.z2) i95.n0.c(c00.z2.class))).ij(view.getContext(), str, Li, x8Var);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.i0
    public void b(android.view.View view, int i17, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.f0 f0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShopAndProductListPresenter", "[onItemLongClick] position:%s", java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.b6 b6Var = this.f284073a;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(b6Var.f284075e, f0Var.f279944d);
        b6Var.getClass();
        de5.a.f310929a.k(14, 11, 12);
        new com.p314xaae8f345.mm.ui.p2740x696c9db.s6(view.getContext()).a(view, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.v5(this), new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.w5(this, Li), null);
    }
}
