package com.tencent.mm.plugin.card.ui;

/* loaded from: classes15.dex */
public class q implements com.tencent.mm.plugin.card.ui.s0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.CardDetailUI f95124a;

    public q(com.tencent.mm.plugin.card.ui.CardDetailUI cardDetailUI) {
        this.f95124a = cardDetailUI;
    }

    public void a(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CardDetailUI", "doMark()");
        com.tencent.mm.plugin.card.ui.CardDetailUI cardDetailUI = this.f95124a;
        cardDetailUI.f94774s = true;
        cardDetailUI.d7(true);
        cardDetailUI.f94775t = z17;
        if (cardDetailUI.f94764f.n0()) {
            xt1.t0.Ri().b(cardDetailUI.f94765g, lu1.a0.z(cardDetailUI.f94764f.a()), 1, 2);
        } else {
            xt1.t0.Ri().b(cardDetailUI.f94765g, lu1.a0.z(cardDetailUI.f94764f.a()), 1, 1);
        }
    }

    public void b(java.lang.String str) {
        int i17 = com.tencent.mm.plugin.card.ui.CardDetailUI.S;
        com.tencent.mm.plugin.card.ui.CardDetailUI cardDetailUI = this.f95124a;
        cardDetailUI.d7(true);
        gm0.j1.n().f273288b.g(new xt1.m0(cardDetailUI.f94764f.g(), str, 18));
    }
}
