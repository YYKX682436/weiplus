package com.tencent.mm.plugin.card.ui.v3;

/* loaded from: classes9.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v3.CardHomePageV3UI f95296d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f95297e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.widget.MemberCardTopCropImageView f95298f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v3.a f95299g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.tencent.mm.plugin.card.ui.v3.CardHomePageV3UI cardHomePageV3UI, in5.s0 s0Var, com.tencent.mm.plugin.card.widget.MemberCardTopCropImageView memberCardTopCropImageView, com.tencent.mm.plugin.card.ui.v3.a aVar) {
        super(0);
        this.f95296d = cardHomePageV3UI;
        this.f95297e = s0Var;
        this.f95298f = memberCardTopCropImageView;
        this.f95299g = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.card.ui.v3.CardHomePageV3UI cardHomePageV3UI = this.f95296d;
        java.lang.String str = cardHomePageV3UI.f95234d;
        this.f95297e.w(com.tencent.mm.R.id.bvp, 0);
        com.tencent.mm.plugin.card.widget.MemberCardTopCropImageView memberCardTopCropImageView = this.f95298f;
        memberCardTopCropImageView.setVisibility(0);
        memberCardTopCropImageView.f95474e = cardHomePageV3UI.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479714d7);
        memberCardTopCropImageView.f95473d = cardHomePageV3UI.f95250w;
        memberCardTopCropImageView.setRadius(cardHomePageV3UI.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv));
        memberCardTopCropImageView.getLayoutParams().height = cardHomePageV3UI.f95250w;
        com.tencent.mm.plugin.card.ui.v3.a aVar = this.f95299g;
        java.lang.String str2 = aVar.a().f391345h;
        if (str2 == null || str2.length() == 0) {
            java.lang.String str3 = aVar.a().f391346i;
            if (!(str3 == null || str3.length() == 0)) {
                memberCardTopCropImageView.setImageDrawable(ju1.e.a(android.graphics.Color.parseColor(aVar.a().f391346i)));
            }
        } else {
            ju1.e.b(memberCardTopCropImageView, aVar.a().f391345h, cardHomePageV3UI.f95251x, cardHomePageV3UI.f95250w);
        }
        return jz5.f0.f302826a;
    }
}
