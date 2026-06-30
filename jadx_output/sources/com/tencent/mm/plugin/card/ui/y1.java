package com.tencent.mm.plugin.card.ui;

/* loaded from: classes12.dex */
public class y1 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.CardGiftVideoUI f95458d;

    public y1(com.tencent.mm.plugin.card.ui.CardGiftVideoUI cardGiftVideoUI) {
        this.f95458d = cardGiftVideoUI;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        com.tencent.mm.plugin.card.ui.CardGiftVideoUI cardGiftVideoUI = this.f95458d;
        cardGiftVideoUI.f94845g.getViewTreeObserver().removeOnPreDrawListener(this);
        cardGiftVideoUI.f94856u.c(cardGiftVideoUI.f94845g, cardGiftVideoUI.f94846h, null);
        return true;
    }
}
