package com.tencent.mm.plugin.card.ui.v3;

/* loaded from: classes9.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f95302d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v3.CardHomePageV3UI f95303e;

    public d(in5.s0 s0Var, com.tencent.mm.plugin.card.ui.v3.CardHomePageV3UI cardHomePageV3UI) {
        this.f95302d = s0Var;
        this.f95303e = cardHomePageV3UI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/v3/CardHomePageV3UI$CardConverter$onCreateViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.card.ui.v3.a aVar = (com.tencent.mm.plugin.card.ui.v3.a) this.f95302d.f293125i;
        int i17 = aVar.a().f391349o;
        com.tencent.mm.plugin.card.ui.v3.CardHomePageV3UI cardHomePageV3UI = this.f95303e;
        if (i17 == 1) {
            lu1.d.j((com.tencent.mm.ui.MMActivity) cardHomePageV3UI.getContext(), aVar.a().f391350p, 0);
        } else if (i17 == 2) {
            r45.iu iuVar = aVar.a().f391351q;
            if (iuVar != null) {
                lu1.d.f(iuVar.f377328d, iuVar.f377329e, iuVar.f377330f);
            }
        } else if (i17 != 3) {
            com.tencent.mars.xlog.Log.w(cardHomePageV3UI.f95234d, "unknown type " + aVar.a().f391349o);
            java.lang.String user_card_id = aVar.a().f391342e;
            kotlin.jvm.internal.o.f(user_card_id, "user_card_id");
            com.tencent.mm.plugin.card.ui.v3.CardHomePageV3UI.T6(cardHomePageV3UI, user_card_id);
        } else {
            java.lang.String user_card_id2 = aVar.a().f391342e;
            kotlin.jvm.internal.o.f(user_card_id2, "user_card_id");
            com.tencent.mm.plugin.card.ui.v3.CardHomePageV3UI.T6(cardHomePageV3UI, user_card_id2);
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(19674, 1, java.lang.Integer.valueOf(aVar.a().f391347m), aVar.a().f391342e, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() / 1000));
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/v3/CardHomePageV3UI$CardConverter$onCreateViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
