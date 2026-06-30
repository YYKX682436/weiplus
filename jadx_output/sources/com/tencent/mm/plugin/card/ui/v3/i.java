package com.tencent.mm.plugin.card.ui.v3;

/* loaded from: classes9.dex */
public final class i implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v3.CardHomePageV3UI f95329d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f95330e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f95331f;

    public i(com.tencent.mm.plugin.card.ui.v3.CardHomePageV3UI cardHomePageV3UI, java.lang.String str, java.lang.String str2) {
        this.f95329d = cardHomePageV3UI;
        this.f95330e = str;
        this.f95331f = str2;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 1) {
            com.tencent.mm.plugin.card.ui.v3.CardHomePageV3UI cardHomePageV3UI = this.f95329d;
            cardHomePageV3UI.getClass();
            java.lang.String cardId = this.f95330e;
            kotlin.jvm.internal.o.g(cardId, "cardId");
            java.lang.String userCardId = this.f95331f;
            kotlin.jvm.internal.o.g(userCardId, "userCardId");
            com.tencent.mars.xlog.Log.i(cardHomePageV3UI.f95234d, "do remove recently: " + cardId + ", " + userCardId);
            bu1.d dVar = new bu1.d(cardId, userCardId);
            dVar.f70649i = true;
            pq5.g l17 = dVar.l();
            kotlin.jvm.internal.o.f(l17, "run(...)");
            pm0.v.T(l17, new com.tencent.mm.plugin.card.ui.v3.n(cardHomePageV3UI, userCardId)).f(cardHomePageV3UI);
        }
    }
}
