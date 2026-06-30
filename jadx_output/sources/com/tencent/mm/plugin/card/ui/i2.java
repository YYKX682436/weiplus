package com.tencent.mm.plugin.card.ui;

/* loaded from: classes15.dex */
public class i2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.CardHomePageUI f95027d;

    public i2(com.tencent.mm.plugin.card.ui.CardHomePageUI cardHomePageUI) {
        this.f95027d = cardHomePageUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = com.tencent.mm.plugin.card.ui.CardHomePageUI.P;
        com.tencent.mm.plugin.card.ui.CardHomePageUI cardHomePageUI = this.f95027d;
        cardHomePageUI.W6();
        if (cardHomePageUI.f94641q == null) {
            cardHomePageUI.W6();
        }
        i11.e eVar = cardHomePageUI.f94641q;
        if (eVar != null) {
            ((i11.h) eVar).k(cardHomePageUI.f94645u, true);
            com.tencent.mm.plugin.report.service.b1.f(22, 10);
        }
        cardHomePageUI.N = true;
    }
}
