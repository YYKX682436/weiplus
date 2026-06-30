package com.tencent.mm.plugin.card.ui.v3;

/* loaded from: classes9.dex */
public final class o1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v3.VipCardListUI f95354d;

    public o1(com.tencent.mm.plugin.card.ui.v3.VipCardListUI vipCardListUI) {
        this.f95354d = vipCardListUI;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.card.ui.v3.VipCardListUI vipCardListUI = this.f95354d;
        com.tencent.mars.xlog.Log.i(vipCardListUI.f95269i, "click item: %s", java.lang.Integer.valueOf(itemId));
        if (itemId != 1) {
            vipCardListUI.L = vipCardListUI.K;
            vipCardListUI.K = itemId;
            vipCardListUI.f95268J = java.lang.String.valueOf(menuItem.getTitle());
            vipCardListUI.c7();
            vipCardListUI.Z6(true);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(19747, 1, 6);
            return;
        }
        if (!vipCardListUI.f95214f) {
            db5.e1.C(vipCardListUI.getContext(), vipCardListUI.getString(com.tencent.mm.R.string.at7), vipCardListUI.getString(com.tencent.mm.R.string.hht), vipCardListUI.getString(com.tencent.mm.R.string.g6z), vipCardListUI.getString(com.tencent.mm.R.string.baz), false, new com.tencent.mm.plugin.card.ui.v3.m1(vipCardListUI), null);
            return;
        }
        if (((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Di(d85.g0.LOCAION, d85.f0.f227175z, new com.tencent.mm.plugin.card.ui.v3.n1(vipCardListUI, menuItem))) {
            return;
        }
        com.tencent.mm.plugin.card.ui.v3.VipCardListUI.Y6(vipCardListUI, menuItem);
    }
}
