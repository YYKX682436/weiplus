package com.tencent.mm.plugin.card.ui;

/* loaded from: classes12.dex */
public class c1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f94962d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.CardGiftImageUI f94963e;

    public c1(com.tencent.mm.plugin.card.ui.CardGiftImageUI cardGiftImageUI, java.lang.String str) {
        this.f94963e = cardGiftImageUI;
        this.f94962d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.card.ui.CardGiftImageUI cardGiftImageUI = this.f94963e;
        if (cardGiftImageUI.f94808i.getVisibility() != 8) {
            cardGiftImageUI.f94808i.setVisibility(8);
        }
        cardGiftImageUI.f94804e = this.f94962d;
        cardGiftImageUI.getClass();
        com.tencent.mm.ui.tools.s6 s6Var = new com.tencent.mm.ui.tools.s6(cardGiftImageUI);
        cardGiftImageUI.f94810n = s6Var;
        s6Var.f210722f = new com.tencent.mm.plugin.card.ui.w0(cardGiftImageUI);
        s6Var.f210723g = new com.tencent.mm.plugin.card.ui.x0(cardGiftImageUI);
        cardGiftImageUI.f94818v.notifyDataSetChanged();
    }
}
