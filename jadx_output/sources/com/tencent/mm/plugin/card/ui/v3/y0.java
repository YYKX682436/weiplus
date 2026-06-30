package com.tencent.mm.plugin.card.ui.v3;

/* loaded from: classes9.dex */
public final class y0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v3.c1 f95406d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v3.t0 f95407e;

    public y0(com.tencent.mm.plugin.card.ui.v3.c1 c1Var, com.tencent.mm.plugin.card.ui.v3.t0 t0Var) {
        this.f95406d = c1Var;
        this.f95407e = t0Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        java.lang.String user_card_id = this.f95407e.a().f386765d;
        kotlin.jvm.internal.o.f(user_card_id, "user_card_id");
        com.tencent.mm.plugin.card.ui.v3.c1 c1Var = this.f95406d;
        c1Var.getClass();
        com.tencent.mm.plugin.card.ui.v3.VipCardListUI vipCardListUI = c1Var.f95301e;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) vipCardListUI.getContext(), 1, true);
        android.widget.TextView textView = new android.widget.TextView(vipCardListUI.getContext());
        textView.setText(vipCardListUI.getString(com.tencent.mm.R.string.asw));
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(vipCardListUI.getResources().getColor(com.tencent.mm.R.color.t_));
        textView.setGravity(17);
        int dimensionPixelSize = vipCardListUI.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv);
        int dimensionPixelSize2 = vipCardListUI.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn);
        textView.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        k0Var.s(textView, false);
        k0Var.f211872n = new com.tencent.mm.plugin.card.ui.v3.a1(vipCardListUI);
        k0Var.f211881s = new com.tencent.mm.plugin.card.ui.v3.b1(vipCardListUI, user_card_id);
        k0Var.v();
    }
}
