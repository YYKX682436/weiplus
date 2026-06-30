package com.tencent.mm.plugin.card.ui.v3;

/* loaded from: classes9.dex */
public final class b0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v3.CouponCardListUI f95292d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f95293e;

    public b0(com.tencent.mm.plugin.card.ui.v3.CouponCardListUI couponCardListUI, in5.s0 s0Var) {
        this.f95292d = couponCardListUI;
        this.f95293e = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/v3/CouponCardListUI$CouponCardConverter$onBindViewHolder$headerClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.card.ui.v3.CouponCardListUI couponCardListUI = this.f95292d;
        java.lang.String str = couponCardListUI.f95253i;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("click header view: ");
        in5.s0 s0Var = this.f95293e;
        sb6.append(s0Var.getAdapterPosition());
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        r45.wt a17 = ((com.tencent.mm.plugin.card.ui.v3.w) s0Var.f293125i).a();
        int i17 = a17.f389432i;
        if (i17 == 1) {
            couponCardListUI.f95265x = true;
            java.lang.String card_pack_merchant_id = a17.f389427d;
            kotlin.jvm.internal.o.f(card_pack_merchant_id, "card_pack_merchant_id");
            couponCardListUI.f95266y = card_pack_merchant_id;
            couponCardListUI.f95267z = a17.f389444x;
            androidx.appcompat.app.AppCompatActivity context = couponCardListUI.getContext();
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            lu1.d.j((com.tencent.mm.ui.MMActivity) context, a17.f389433m, 0);
        } else if (i17 == 2) {
            couponCardListUI.f95265x = true;
            java.lang.String card_pack_merchant_id2 = a17.f389427d;
            kotlin.jvm.internal.o.f(card_pack_merchant_id2, "card_pack_merchant_id");
            couponCardListUI.f95266y = card_pack_merchant_id2;
            couponCardListUI.f95267z = a17.f389444x;
            r45.iu iuVar = a17.f389434n;
            lu1.d.f(iuVar.f377328d, iuVar.f377329e, iuVar.f377330f);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/v3/CouponCardListUI$CouponCardConverter$onBindViewHolder$headerClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
