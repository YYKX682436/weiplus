package com.tencent.mm.plugin.card.ui.v3;

/* loaded from: classes9.dex */
public final class p0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v3.CouponCardListUI f95356d;

    public p0(com.tencent.mm.plugin.card.ui.v3.CouponCardListUI couponCardListUI) {
        this.f95356d = couponCardListUI;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.card.ui.v3.CouponCardListUI couponCardListUI = this.f95356d;
        com.tencent.mars.xlog.Log.i(couponCardListUI.f95253i, "click item: %s", java.lang.Integer.valueOf(itemId));
        if (itemId != 1) {
            couponCardListUI.F = couponCardListUI.E;
            couponCardListUI.E = itemId;
            couponCardListUI.D = java.lang.String.valueOf(menuItem.getTitle());
            couponCardListUI.Z6();
            couponCardListUI.Y6(true);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(19747, 2, 6);
            return;
        }
        if (!couponCardListUI.f95214f) {
            db5.e1.C(couponCardListUI.getContext(), couponCardListUI.getString(com.tencent.mm.R.string.at7), couponCardListUI.getString(com.tencent.mm.R.string.hht), couponCardListUI.getString(com.tencent.mm.R.string.g6z), couponCardListUI.getString(com.tencent.mm.R.string.baz), false, new com.tencent.mm.plugin.card.ui.v3.o0(couponCardListUI), null);
            return;
        }
        couponCardListUI.F = couponCardListUI.E;
        couponCardListUI.E = 1;
        couponCardListUI.D = java.lang.String.valueOf(menuItem.getTitle());
        couponCardListUI.Z6();
        couponCardListUI.Y6(true);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(19747, 2, 5);
    }
}
