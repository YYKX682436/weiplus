package com.tencent.mm.plugin.card.ui;

/* loaded from: classes15.dex */
public class e1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.f1 f94987d;

    public e1(com.tencent.mm.plugin.card.ui.f1 f1Var) {
        this.f94987d = f1Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.card.ui.f1 f1Var = this.f94987d;
        com.tencent.mm.plugin.card.model.CardGiftInfo cardGiftInfo = f1Var.f95004d.f94822f;
        int i18 = cardGiftInfo.X;
        if (i18 != 1) {
            if (i18 == 2) {
                lu1.d.d(cardGiftInfo.H, cardGiftInfo.Z, cardGiftInfo.f94657p0, 1028, 0);
                return;
            }
            return;
        }
        boolean equals = "cardhomepage".equals(cardGiftInfo.Y);
        com.tencent.mm.plugin.card.ui.CardGiftReceiveUI cardGiftReceiveUI = f1Var.f95004d;
        if (equals) {
            com.tencent.mm.autogen.events.GotoCardHomePageEvent gotoCardHomePageEvent = new com.tencent.mm.autogen.events.GotoCardHomePageEvent();
            gotoCardHomePageEvent.f54425g.f6154a = cardGiftReceiveUI.getContext();
            gotoCardHomePageEvent.e();
        } else if ("cardhomepage/couponandgiftcard".equals(cardGiftReceiveUI.f94822f.Y)) {
            if (((java.lang.Boolean) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_CARD_ENTRANCE_SWITCH_V2_BOOLEAN_SYNC, java.lang.Boolean.TRUE)).booleanValue()) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1);
                j45.l.j(cardGiftReceiveUI.getContext(), "card", ".ui.v3.CouponCardListUI", intent, null);
            } else {
                com.tencent.mm.autogen.events.GotoCardHomePageEvent gotoCardHomePageEvent2 = new com.tencent.mm.autogen.events.GotoCardHomePageEvent();
                gotoCardHomePageEvent2.f54425g.f6154a = cardGiftReceiveUI.getContext();
                gotoCardHomePageEvent2.e();
            }
        }
    }
}
