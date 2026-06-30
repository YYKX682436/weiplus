package com.tencent.mm.plugin.card.ui;

/* loaded from: classes4.dex */
public class a4 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.CardShopUI f94930d;

    public a4(com.tencent.mm.plugin.card.ui.CardShopUI cardShopUI) {
        this.f94930d = cardShopUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        wt1.j0 bj6 = xt1.t0.bj();
        com.tencent.mm.plugin.card.ui.CardShopUI cardShopUI = this.f94930d;
        bj6.a(cardShopUI.f94906h, cardShopUI);
        if (bj6.f449301h != null) {
            gm0.j1.n().f273288b.d(bj6.f449301h);
        }
    }
}
