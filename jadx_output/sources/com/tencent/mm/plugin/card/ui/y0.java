package com.tencent.mm.plugin.card.ui;

/* loaded from: classes12.dex */
public class y0 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.CardGiftImageUI f95457d;

    public y0(com.tencent.mm.plugin.card.ui.CardGiftImageUI cardGiftImageUI) {
        this.f95457d = cardGiftImageUI;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        com.tencent.mm.plugin.card.ui.CardGiftImageUI cardGiftImageUI = this.f95457d;
        cardGiftImageUI.f94806g.getViewTreeObserver().removeOnPreDrawListener(this);
        cardGiftImageUI.f94813q.c(cardGiftImageUI.f94806g, cardGiftImageUI.f94805f, null);
        return true;
    }
}
