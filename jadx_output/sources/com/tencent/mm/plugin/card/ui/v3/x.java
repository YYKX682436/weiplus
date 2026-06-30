package com.tencent.mm.plugin.card.ui.v3;

/* loaded from: classes9.dex */
public final class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v3.CouponCardListUI f95397d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.wt f95398e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.tt f95399f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f95400g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f95401h;

    public x(com.tencent.mm.plugin.card.ui.v3.CouponCardListUI couponCardListUI, r45.wt wtVar, r45.tt ttVar, int i17, int i18) {
        this.f95397d = couponCardListUI;
        this.f95398e = wtVar;
        this.f95399f = ttVar;
        this.f95400g = i17;
        this.f95401h = i18;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/v3/CouponCardListUI$CouponCardConverter$appendCouponView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.card.ui.v3.CouponCardListUI couponCardListUI = this.f95397d;
        couponCardListUI.f95265x = true;
        r45.wt wtVar = this.f95398e;
        java.lang.String card_pack_merchant_id = wtVar.f389427d;
        kotlin.jvm.internal.o.f(card_pack_merchant_id, "card_pack_merchant_id");
        couponCardListUI.f95266y = card_pack_merchant_id;
        couponCardListUI.f95267z = wtVar.f389444x;
        r45.tt ttVar = this.f95399f;
        java.lang.String user_card_id = ttVar.f386765d;
        kotlin.jvm.internal.o.f(user_card_id, "user_card_id");
        com.tencent.mm.plugin.card.ui.v3.CouponCardListUI.X6(couponCardListUI, user_card_id);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(19748, 1, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() / 1000), ttVar.f386765d, java.lang.Integer.valueOf(this.f95400g), java.lang.Integer.valueOf(this.f95401h), 1);
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/v3/CouponCardListUI$CouponCardConverter$appendCouponView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
