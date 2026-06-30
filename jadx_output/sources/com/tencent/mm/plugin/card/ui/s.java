package com.tencent.mm.plugin.card.ui;

/* loaded from: classes15.dex */
public class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f95150d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.CardDetailUI f95151e;

    public s(com.tencent.mm.plugin.card.ui.CardDetailUI cardDetailUI, java.lang.String str) {
        this.f95151e = cardDetailUI;
        this.f95150d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.card.ui.CardDetailUI cardDetailUI = this.f95151e;
        java.lang.String str = this.f95150d;
        int i17 = com.tencent.mm.plugin.card.ui.CardDetailUI.S;
        synchronized (cardDetailUI) {
            if (cardDetailUI.f94779x) {
                com.tencent.mars.xlog.Log.e("MicroMsg.CardDetailUI", "has start CardConsumeSuccessUI!");
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.CardDetailUI", "startConsumedSuccUI() ");
            cardDetailUI.f94779x = true;
            android.content.Intent intent = new android.content.Intent(cardDetailUI, (java.lang.Class<?>) com.tencent.mm.plugin.card.sharecard.ui.CardConsumeSuccessUI.class);
            intent.putExtra("KEY_CARD_ID", cardDetailUI.f94764f.g());
            intent.putExtra("KEY_CARD_CONSUMED_JSON", str);
            intent.putExtra("KEY_CARD_COLOR", cardDetailUI.f94764f.s0().f388555p);
            intent.putExtra("key_stastic_scene", cardDetailUI.B);
            intent.putExtra("key_from_scene", 0);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(cardDetailUI, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/CardDetailUI", "startConsumedSuccUI", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            cardDetailUI.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(cardDetailUI, "com/tencent/mm/plugin/card/ui/CardDetailUI", "startConsumedSuccUI", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }
}
