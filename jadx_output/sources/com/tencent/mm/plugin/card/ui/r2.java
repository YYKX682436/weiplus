package com.tencent.mm.plugin.card.ui;

/* loaded from: classes15.dex */
public class r2 extends lu1.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.CardInvalidCardUI f95147a;

    public r2(com.tencent.mm.plugin.card.ui.CardInvalidCardUI cardInvalidCardUI) {
        this.f95147a = cardInvalidCardUI;
    }

    @Override // lu1.p, lu1.q
    public void a() {
        int i17 = com.tencent.mm.plugin.card.ui.CardInvalidCardUI.f94871w;
        com.tencent.mm.plugin.card.ui.CardInvalidCardUI cardInvalidCardUI = this.f95147a;
        cardInvalidCardUI.f94637m = true;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (int i18 = 0; i18 < cardInvalidCardUI.f94632e.getCount(); i18++) {
            com.tencent.mm.plugin.card.model.CardInfo cardInfo = (com.tencent.mm.plugin.card.model.CardInfo) cardInvalidCardUI.f94639o.getItem(i18);
            if (cardInfo != null) {
                linkedList.add(cardInfo.field_card_id);
            }
        }
        cardInvalidCardUI.j7(true);
        gm0.j1.n().f273288b.g(new xt1.z(linkedList));
    }
}
