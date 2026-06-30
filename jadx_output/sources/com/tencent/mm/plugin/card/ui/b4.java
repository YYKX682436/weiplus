package com.tencent.mm.plugin.card.ui;

/* loaded from: classes4.dex */
public class b4 extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.CardShopUI f94959a;

    public b4(com.tencent.mm.plugin.card.ui.CardShopUI cardShopUI) {
        this.f94959a = cardShopUI;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        java.lang.String action = intent.getAction();
        if (action == null || !action.equals("android.intent.action.LOCALE_CHANGED")) {
            return;
        }
        int i17 = com.tencent.mm.plugin.card.ui.CardShopUI.f94901s;
        com.tencent.mm.plugin.card.ui.CardShopUI cardShopUI = this.f94959a;
        cardShopUI.getClass();
        if (!((com.tencent.mm.sdk.platformtools.n2.a() || com.tencent.mm.sdk.platformtools.n2.b()) ? false : true)) {
            cardShopUI.U6();
        }
    }
}
