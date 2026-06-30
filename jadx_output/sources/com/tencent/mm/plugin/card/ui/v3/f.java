package com.tencent.mm.plugin.card.ui.v3;

/* loaded from: classes9.dex */
public final class f implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v3.j f95316d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v3.a f95317e;

    public f(com.tencent.mm.plugin.card.ui.v3.j jVar, com.tencent.mm.plugin.card.ui.v3.a aVar) {
        this.f95316d = jVar;
        this.f95317e = aVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.plugin.card.ui.v3.a aVar = this.f95317e;
        java.lang.String card_id = aVar.a().f391341d;
        kotlin.jvm.internal.o.f(card_id, "card_id");
        java.lang.String user_card_id = aVar.a().f391342e;
        kotlin.jvm.internal.o.f(user_card_id, "user_card_id");
        com.tencent.mm.plugin.card.ui.v3.j jVar = this.f95316d;
        jVar.getClass();
        com.tencent.mm.plugin.card.ui.v3.CardHomePageV3UI cardHomePageV3UI = jVar.f95335e;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) cardHomePageV3UI.getContext(), 1, true);
        android.widget.TextView textView = new android.widget.TextView(cardHomePageV3UI.getContext());
        textView.setText(cardHomePageV3UI.getString(com.tencent.mm.R.string.f490793at3));
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(cardHomePageV3UI.getResources().getColor(com.tencent.mm.R.color.t_));
        textView.setGravity(17);
        int dimensionPixelSize = cardHomePageV3UI.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv);
        int dimensionPixelSize2 = cardHomePageV3UI.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn);
        textView.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        k0Var.s(textView, false);
        k0Var.f211872n = new com.tencent.mm.plugin.card.ui.v3.h(cardHomePageV3UI);
        k0Var.f211881s = new com.tencent.mm.plugin.card.ui.v3.i(cardHomePageV3UI, card_id, user_card_id);
        k0Var.v();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(19674, 2, java.lang.Integer.valueOf(aVar.a().f391347m), aVar.a().f391342e, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() / 1000));
    }
}
