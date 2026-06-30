package com.tencent.mm.plugin.card.ui;

/* loaded from: classes15.dex */
public class j0 extends lu1.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.l0 f95031a;

    public j0(com.tencent.mm.plugin.card.ui.l0 l0Var) {
        this.f95031a = l0Var;
    }

    @Override // lu1.p, lu1.q
    public void b(java.lang.String str) {
        com.tencent.mm.plugin.card.ui.s0 s0Var = this.f95031a.f95062d.f95074d.T;
        if (s0Var != null) {
            com.tencent.mm.plugin.card.ui.q qVar = (com.tencent.mm.plugin.card.ui.q) s0Var;
            qVar.getClass();
            int i17 = com.tencent.mm.plugin.card.ui.CardDetailUI.S;
            com.tencent.mm.plugin.card.ui.CardDetailUI cardDetailUI = qVar.f95124a;
            cardDetailUI.getClass();
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.add(cardDetailUI.f94765g);
            cardDetailUI.d7(true);
            gm0.j1.n().f273288b.g(new xt1.z(linkedList));
        }
    }
}
