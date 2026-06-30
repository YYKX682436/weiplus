package com.tencent.mm.plugin.card.ui;

/* loaded from: classes12.dex */
public class d2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.CardGiftVideoUI f94976d;

    public d2(com.tencent.mm.plugin.card.ui.CardGiftVideoUI cardGiftVideoUI) {
        this.f94976d = cardGiftVideoUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.card.ui.CardGiftVideoUI cardGiftVideoUI = this.f94976d;
        android.widget.ProgressBar progressBar = cardGiftVideoUI.f94851p;
        if (progressBar != null && progressBar.getVisibility() != 8) {
            cardGiftVideoUI.f94851p.setVisibility(8);
        }
        com.tencent.mm.ui.widget.MMPinProgressBtn mMPinProgressBtn = cardGiftVideoUI.f94852q;
        if (mMPinProgressBtn == null || mMPinProgressBtn.getVisibility() == 8) {
            return;
        }
        cardGiftVideoUI.f94852q.setVisibility(8);
    }
}
