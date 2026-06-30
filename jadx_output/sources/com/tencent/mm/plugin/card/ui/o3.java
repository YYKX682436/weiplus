package com.tencent.mm.plugin.card.ui;

/* loaded from: classes15.dex */
public class o3 extends lu1.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.CardNewMsgUI f95100a;

    public o3(com.tencent.mm.plugin.card.ui.CardNewMsgUI cardNewMsgUI) {
        this.f95100a = cardNewMsgUI;
    }

    @Override // lu1.p, lu1.q
    public void a() {
        wt1.f0 Ui = xt1.t0.Ui();
        java.util.List list = Ui.f449267b;
        java.util.ArrayList arrayList = (java.util.ArrayList) list;
        if (arrayList.size() != 0) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.addAll(list);
            for (int i17 = 0; i17 < arrayList2.size(); i17++) {
                xt1.k kVar = (xt1.k) arrayList2.get(i17);
                if (kVar != null) {
                    arrayList.remove(kVar);
                    Ui.c(kVar);
                }
            }
            arrayList2.clear();
        }
        int i18 = com.tencent.mm.plugin.card.ui.CardNewMsgUI.f94893n;
        com.tencent.mm.plugin.card.ui.CardNewMsgUI cardNewMsgUI = this.f95100a;
        cardNewMsgUI.T6();
        cardNewMsgUI.f94895e.f();
    }
}
