package com.tencent.mm.plugin.card.ui;

/* loaded from: classes15.dex */
public class o implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.CardDetailUI f95093d;

    public o(com.tencent.mm.plugin.card.ui.CardDetailUI cardDetailUI) {
        this.f95093d = cardDetailUI;
    }

    @Override // i11.c
    public boolean onGetLocation(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        if (!z17) {
            return true;
        }
        com.tencent.mm.plugin.card.ui.CardDetailUI cardDetailUI = this.f95093d;
        if (cardDetailUI.M == -85.0f && cardDetailUI.N == -1000.0f) {
            cardDetailUI.M = f18;
            cardDetailUI.N = f17;
            wt1.g0 ij6 = xt1.t0.ij();
            float f19 = cardDetailUI.M;
            float f27 = cardDetailUI.N;
            ij6.f449280d = f19;
            ij6.f449281e = f27;
            ij6.f449282f = java.lang.System.currentTimeMillis() / 1000;
        }
        wt1.p pVar = cardDetailUI.Q;
        float f28 = cardDetailUI.N;
        float f29 = cardDetailUI.M;
        synchronized (pVar.f449324i) {
            pVar.f449327o = f29;
            pVar.f449328p = f28;
        }
        if (cardDetailUI.K) {
            cardDetailUI.T6();
            cardDetailUI.K = false;
        }
        i11.e eVar = cardDetailUI.L;
        if (eVar != null) {
            ((i11.h) eVar).m(cardDetailUI.R);
        }
        return false;
    }
}
