package com.tencent.mm.plugin.card.ui;

/* loaded from: classes5.dex */
public class s1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f95152d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.CardGiftVideoUI f95153e;

    public s1(com.tencent.mm.plugin.card.ui.CardGiftVideoUI cardGiftVideoUI, java.lang.String str) {
        this.f95153e = cardGiftVideoUI;
        this.f95152d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.card.ui.CardGiftVideoUI cardGiftVideoUI = this.f95153e;
        if (com.tencent.mm.sdk.platformtools.t8.K0(cardGiftVideoUI.f94844f)) {
            cardGiftVideoUI.f94849n.setVisibility(0);
            o11.f fVar = new o11.f();
            fVar.f342083g = lp0.b.D();
            java.lang.String str = this.f95152d;
            fVar.f342082f = xt1.q.m(str);
            fVar.f342085i = 1;
            fVar.f342078b = true;
            fVar.f342077a = true;
            n11.a.b().h(str, cardGiftVideoUI.f94849n, fVar.a());
        }
    }
}
