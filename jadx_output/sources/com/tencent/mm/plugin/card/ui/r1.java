package com.tencent.mm.plugin.card.ui;

/* loaded from: classes5.dex */
public class r1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f95145d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.CardGiftVideoUI f95146e;

    public r1(com.tencent.mm.plugin.card.ui.CardGiftVideoUI cardGiftVideoUI, java.lang.String str) {
        this.f95146e = cardGiftVideoUI;
        this.f95145d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.card.ui.CardGiftVideoUI cardGiftVideoUI = this.f95146e;
        cardGiftVideoUI.f94849n.setVisibility(8);
        java.lang.String str = this.f95145d;
        cardGiftVideoUI.f94844f = str;
        cardGiftVideoUI.T6(str);
        cardGiftVideoUI.U6();
    }
}
