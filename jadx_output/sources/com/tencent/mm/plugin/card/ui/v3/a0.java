package com.tencent.mm.plugin.card.ui.v3;

/* loaded from: classes9.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v3.CouponCardListUI f95285d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.widget.MemberCardTopCropImageView f95286e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.tt f95287f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.tencent.mm.plugin.card.ui.v3.CouponCardListUI couponCardListUI, com.tencent.mm.plugin.card.widget.MemberCardTopCropImageView memberCardTopCropImageView, r45.tt ttVar) {
        super(0);
        this.f95285d = couponCardListUI;
        this.f95286e = memberCardTopCropImageView;
        this.f95287f = ttVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.card.ui.v3.CouponCardListUI couponCardListUI = this.f95285d;
        com.tencent.mars.xlog.Log.i(couponCardListUI.f95253i, "view height: " + couponCardListUI.H + ", view width: " + couponCardListUI.I);
        int dimensionPixelSize = couponCardListUI.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479714d7);
        com.tencent.mm.plugin.card.widget.MemberCardTopCropImageView memberCardTopCropImageView = this.f95286e;
        memberCardTopCropImageView.f95474e = dimensionPixelSize;
        memberCardTopCropImageView.f95473d = couponCardListUI.H;
        memberCardTopCropImageView.setRadius(couponCardListUI.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479646bl));
        android.view.ViewGroup.LayoutParams layoutParams = memberCardTopCropImageView.getLayoutParams();
        int i17 = couponCardListUI.H;
        layoutParams.height = i17;
        java.lang.String str = this.f95287f.f386770i;
        if (str == null) {
            return null;
        }
        lu1.b0.c(this.f95286e, str, 0.0f, false, 0, couponCardListUI.I, i17, 28, null);
        return jz5.f0.f302826a;
    }
}
