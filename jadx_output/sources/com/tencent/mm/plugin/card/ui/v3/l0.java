package com.tencent.mm.plugin.card.ui.v3;

/* loaded from: classes9.dex */
public final class l0 extends ym5.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v3.CouponCardListUI f95341a;

    public l0(com.tencent.mm.plugin.card.ui.v3.CouponCardListUI couponCardListUI) {
        this.f95341a = couponCardListUI;
    }

    @Override // ym5.q3
    public void b(int i17) {
        com.tencent.mm.plugin.card.ui.v3.CouponCardListUI couponCardListUI = this.f95341a;
        java.lang.String str = couponCardListUI.f95253i;
        pm0.v.X(new com.tencent.mm.plugin.card.ui.v3.k0(couponCardListUI));
    }

    @Override // ym5.q3
    public void c(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        com.tencent.mm.plugin.card.ui.v3.CouponCardListUI couponCardListUI = this.f95341a;
        java.lang.String str = couponCardListUI.f95253i;
        couponCardListUI.getClass();
        if (couponCardListUI.f95262u) {
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = couponCardListUI.f95255n;
            if (refreshLoadMoreLayout != null) {
                refreshLoadMoreLayout.H(null);
            } else {
                kotlin.jvm.internal.o.o("mRefreshLayout");
                throw null;
            }
        }
    }
}
