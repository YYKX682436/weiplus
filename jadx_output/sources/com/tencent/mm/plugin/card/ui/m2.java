package com.tencent.mm.plugin.card.ui;

/* loaded from: classes8.dex */
public class m2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.ku f95076d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.CardHomePageUI f95077e;

    public m2(com.tencent.mm.plugin.card.ui.CardHomePageUI cardHomePageUI, r45.ku kuVar) {
        this.f95077e = cardHomePageUI;
        this.f95076d = kuVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/CardHomePageUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.ku kuVar = this.f95076d;
        int i17 = kuVar.f378950h;
        com.tencent.mm.plugin.card.ui.CardHomePageUI cardHomePageUI = this.f95077e;
        if (i17 == 1) {
            lu1.d.j(cardHomePageUI, kuVar.f378951i, 0);
        } else if (i17 == 2) {
            if (kuVar.f378952m != null) {
                com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent();
                r45.iu iuVar = kuVar.f378952m;
                java.lang.String str = iuVar.f377328d;
                am.nx nxVar = startAppBrandUIFromOuterEvent.f54857g;
                nxVar.f7466a = str;
                java.lang.String str2 = iuVar.f377329e;
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (str2 == null) {
                    str2 = "";
                }
                nxVar.f7467b = str2;
                nxVar.f7469d = 1028;
                startAppBrandUIFromOuterEvent.e();
            }
        } else if (i17 != 3) {
            com.tencent.mars.xlog.Log.w("MicroMsg.CardHomePageUI", "unknown op action: %s", java.lang.Integer.valueOf(i17));
        } else if ("weixin://wccard/sharecarddetail".equals(kuVar.f378953n)) {
            android.content.Intent intent = new android.content.Intent(cardHomePageUI, (java.lang.Class<?>) com.tencent.mm.plugin.card.sharecard.ui.ShareCardListUI.class);
            intent.putExtra("key_layout_buff", cardHomePageUI.C);
            com.tencent.mm.plugin.card.ui.CardHomePageUI cardHomePageUI2 = this.f95077e;
            cardHomePageUI2.D = true;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(cardHomePageUI2, arrayList2.toArray(), "com/tencent/mm/plugin/card/ui/CardHomePageUI$8", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            cardHomePageUI2.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(cardHomePageUI2, "com/tencent/mm/plugin/card/ui/CardHomePageUI$8", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11324, "ClickShareCard", 0, "", "", 0, 0, "", 0, 0);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/CardHomePageUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
