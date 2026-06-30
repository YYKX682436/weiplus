package com.tencent.mm.plugin.card.ui;

/* loaded from: classes9.dex */
public class g1 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.CardGiftReceiveUI f95009d;

    public g1(com.tencent.mm.plugin.card.ui.CardGiftReceiveUI cardGiftReceiveUI) {
        this.f95009d = cardGiftReceiveUI;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.tencent.mm.plugin.card.ui.CardGiftReceiveUI cardGiftReceiveUI = this.f95009d;
        int b17 = i65.a.b(cardGiftReceiveUI.getContext(), 67);
        int height = cardGiftReceiveUI.f94824h.getChildAt(0).getHeight() + b17;
        int height2 = cardGiftReceiveUI.getWindow().findViewById(android.R.id.content).getHeight();
        com.tencent.mars.xlog.Log.i("MicroMsg.CardGiftReceiveUI", "bottomHeight: %d  totalViewHeight:%d  screenHeight:%d ", java.lang.Integer.valueOf(b17), java.lang.Integer.valueOf(height), java.lang.Integer.valueOf(height2));
        cardGiftReceiveUI.f94824h.setFillViewport(true);
        if (height > height2) {
            com.tencent.mm.plugin.card.ui.CardGiftReceiveUI.T6(cardGiftReceiveUI, true);
        } else {
            com.tencent.mm.plugin.card.ui.CardGiftReceiveUI.T6(cardGiftReceiveUI, false);
        }
        cardGiftReceiveUI.f94824h.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
