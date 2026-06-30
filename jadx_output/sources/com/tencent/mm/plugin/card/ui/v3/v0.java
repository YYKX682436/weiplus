package com.tencent.mm.plugin.card.ui.v3;

/* loaded from: classes9.dex */
public final class v0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v3.VipCardListUI f95387d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.widget.MemberCardTopCropImageView f95388e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v3.t0 f95389f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(com.tencent.mm.plugin.card.ui.v3.VipCardListUI vipCardListUI, com.tencent.mm.plugin.card.widget.MemberCardTopCropImageView memberCardTopCropImageView, com.tencent.mm.plugin.card.ui.v3.t0 t0Var) {
        super(0);
        this.f95387d = vipCardListUI;
        this.f95388e = memberCardTopCropImageView;
        this.f95389f = t0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.card.ui.v3.VipCardListUI vipCardListUI = this.f95387d;
        java.lang.String str = vipCardListUI.f95269i;
        int dimensionPixelSize = vipCardListUI.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479714d7);
        com.tencent.mm.plugin.card.widget.MemberCardTopCropImageView memberCardTopCropImageView = this.f95388e;
        memberCardTopCropImageView.f95474e = dimensionPixelSize;
        memberCardTopCropImageView.f95473d = vipCardListUI.N;
        memberCardTopCropImageView.setRadius(vipCardListUI.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv));
        memberCardTopCropImageView.getLayoutParams().height = vipCardListUI.N;
        com.tencent.mm.plugin.card.ui.v3.t0 t0Var = this.f95389f;
        java.lang.String str2 = t0Var.a().f386770i;
        if (str2 == null || str2.length() == 0) {
            java.lang.String str3 = t0Var.a().f386769h;
            if (!(str3 == null || str3.length() == 0)) {
                memberCardTopCropImageView.setImageDrawable(ju1.e.a(android.graphics.Color.parseColor(t0Var.a().f386769h)));
            }
        } else {
            ju1.e.b(memberCardTopCropImageView, t0Var.a().f386770i, vipCardListUI.P, vipCardListUI.N);
        }
        return jz5.f0.f302826a;
    }
}
