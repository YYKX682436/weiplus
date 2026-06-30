package com.tencent.mm.plugin.card.ui;

/* loaded from: classes15.dex */
public class f1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.CardGiftReceiveUI f95004d;

    public f1(com.tencent.mm.plugin.card.ui.CardGiftReceiveUI cardGiftReceiveUI) {
        this.f95004d = cardGiftReceiveUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/CardGiftReceiveUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.card.ui.CardGiftReceiveUI cardGiftReceiveUI = this.f95004d;
        if (com.tencent.mm.sdk.platformtools.t8.K0(cardGiftReceiveUI.f94822f.f94666x0)) {
            com.tencent.mm.plugin.card.model.CardGiftInfo cardGiftInfo = cardGiftReceiveUI.f94822f;
            int i17 = cardGiftInfo.X;
            if (i17 == 1) {
                if ("cardhomepage".equals(cardGiftInfo.Y)) {
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
            } else if (i17 == 2) {
                lu1.d.d(cardGiftInfo.H, cardGiftInfo.Z, cardGiftInfo.f94657p0, 1028, 0);
            }
        } else {
            androidx.appcompat.app.AppCompatActivity context = cardGiftReceiveUI.getContext();
            com.tencent.mm.ui.widget.dialog.a aVar = new com.tencent.mm.ui.widget.dialog.a();
            aVar.f211729s = cardGiftReceiveUI.f94822f.f94666x0;
            aVar.f211733w = of5.b.a(context).getString(com.tencent.mm.R.string.f490347sg);
            aVar.f211732v = of5.b.a(context).getString(com.tencent.mm.R.string.f490002i4);
            aVar.E = new com.tencent.mm.plugin.card.ui.e1(this);
            aVar.Z = true;
            com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(context, com.tencent.mm.R.style.f494791wd);
            j0Var.e(aVar);
            com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar.f211723m;
            if (d0Var != null) {
                d0Var.a(j0Var.f211837r);
            }
            j0Var.show();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/CardGiftReceiveUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
