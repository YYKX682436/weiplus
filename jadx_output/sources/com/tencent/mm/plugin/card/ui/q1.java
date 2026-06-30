package com.tencent.mm.plugin.card.ui;

/* loaded from: classes12.dex */
public class q1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f95130d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f95131e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.CardGiftVideoUI f95132f;

    public q1(com.tencent.mm.plugin.card.ui.CardGiftVideoUI cardGiftVideoUI, int i17, int i18) {
        this.f95132f = cardGiftVideoUI;
        this.f95130d = i17;
        this.f95131e = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.card.ui.CardGiftVideoUI cardGiftVideoUI = this.f95132f;
        com.tencent.mm.ui.widget.MMPinProgressBtn mMPinProgressBtn = cardGiftVideoUI.f94852q;
        if (mMPinProgressBtn != null) {
            int i17 = this.f95130d;
            if (i17 == 0) {
                mMPinProgressBtn.setVisibility(8);
                return;
            }
            if (mMPinProgressBtn.getVisibility() != 0) {
                cardGiftVideoUI.f94852q.setVisibility(0);
            }
            int i18 = this.f95131e;
            com.tencent.mars.xlog.Log.i("MicroMsg.CardGiftVideoUI", "update progress %d %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17));
            if (cardGiftVideoUI.f94852q.getMax() != i17 && i17 > 0) {
                cardGiftVideoUI.f94852q.setMax(i17);
            }
            cardGiftVideoUI.f94852q.setProgress(i18);
        }
    }
}
