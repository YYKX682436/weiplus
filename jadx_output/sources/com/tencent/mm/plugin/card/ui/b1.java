package com.tencent.mm.plugin.card.ui;

/* loaded from: classes12.dex */
public class b1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.CardGiftImageUI f94956d;

    public b1(com.tencent.mm.plugin.card.ui.CardGiftImageUI cardGiftImageUI) {
        this.f94956d = cardGiftImageUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.card.ui.CardGiftImageUI cardGiftImageUI = this.f94956d;
        if (cardGiftImageUI.f94808i.getVisibility() != 0) {
            cardGiftImageUI.f94808i.setVisibility(0);
        }
    }
}
