package com.tencent.mm.plugin.card.ui.v3;

/* loaded from: classes9.dex */
public final class z implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v3.CouponCardListUI f95408d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.wt f95409e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.tt f95410f;

    public z(com.tencent.mm.plugin.card.ui.v3.CouponCardListUI couponCardListUI, r45.wt wtVar, r45.tt ttVar) {
        this.f95408d = couponCardListUI;
        this.f95409e = wtVar;
        this.f95410f = ttVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/v3/CouponCardListUI$CouponCardConverter$appendCouponView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.card.ui.v3.CouponCardListUI couponCardListUI = this.f95408d;
        couponCardListUI.f95265x = true;
        r45.wt wtVar = this.f95409e;
        java.lang.String card_pack_merchant_id = wtVar.f389427d;
        kotlin.jvm.internal.o.f(card_pack_merchant_id, "card_pack_merchant_id");
        couponCardListUI.f95266y = card_pack_merchant_id;
        couponCardListUI.f95267z = wtVar.f389444x;
        java.lang.String user_card_id = this.f95410f.f386765d;
        kotlin.jvm.internal.o.f(user_card_id, "user_card_id");
        com.tencent.mm.plugin.card.ui.v3.CouponCardListUI.X6(couponCardListUI, user_card_id);
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/v3/CouponCardListUI$CouponCardConverter$appendCouponView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
