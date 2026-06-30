package com.tencent.mm.plugin.card.ui.v3;

/* loaded from: classes9.dex */
public final class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.bu f95379d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v3.CardHomePageV3UI f95380e;

    public u(r45.bu buVar, com.tencent.mm.plugin.card.ui.v3.CardHomePageV3UI cardHomePageV3UI) {
        this.f95379d = buVar;
        this.f95380e = cardHomePageV3UI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/v3/CardHomePageV3UI$updateHeader$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.bu buVar = this.f95379d;
        int i17 = buVar.f371058g;
        com.tencent.mm.plugin.card.ui.v3.CardHomePageV3UI cardHomePageV3UI = this.f95380e;
        if (i17 == 1) {
            lu1.d.j((com.tencent.mm.ui.MMActivity) cardHomePageV3UI.getContext(), buVar.f371059h, 0);
        } else if (i17 == 2) {
            r45.iu iuVar = buVar.f371060i;
            if (iuVar != null) {
                lu1.d.f(iuVar.f377328d, iuVar.f377329e, iuVar.f377330f);
                cardHomePageV3UI.f95247t = true;
            }
        } else if (i17 != 3) {
            com.tencent.mars.xlog.Log.w(cardHomePageV3UI.f95234d, "unknown type " + buVar.f371058g);
        } else if ("weixin://mktcard/cert".equals(buVar.f371061m)) {
            com.tencent.mars.xlog.Log.i(cardHomePageV3UI.f95234d, "go to cert list");
            cardHomePageV3UI.startActivityForResult(new android.content.Intent(cardHomePageV3UI.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.card.ui.v2.CardTicketListUI.class), 2);
        } else if ("weixin://mktcard/membercard".equals(buVar.f371061m)) {
            com.tencent.mars.xlog.Log.i(cardHomePageV3UI.f95234d, "go to vip card list");
            cardHomePageV3UI.startActivityForResult(new android.content.Intent(cardHomePageV3UI.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.card.ui.v3.VipCardListUI.class), 1);
        } else if ("weixin://mktcard/coupon".equals(buVar.f371061m)) {
            java.lang.String str = buVar.f371056e;
            com.tencent.mars.xlog.Log.i(cardHomePageV3UI.f95234d, "go to vip card list");
            android.content.Intent intent = new android.content.Intent(cardHomePageV3UI.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.card.ui.v3.CouponCardListUI.class);
            intent.putExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, str);
            cardHomePageV3UI.startActivityForResult(intent, 3);
        } else if ("weixin://mktcard/couponv2".equals(buVar.f371061m)) {
            java.lang.String str2 = buVar.f371056e;
            com.tencent.mars.xlog.Log.i(cardHomePageV3UI.f95234d, "go to coupon gift card list");
            android.content.Intent intent2 = new android.content.Intent(cardHomePageV3UI.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.card.ui.v4.CouponAndGiftCardListV4UI.class);
            intent2.putExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, str2);
            cardHomePageV3UI.startActivityForResult(intent2, 5);
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(19673, buVar.f371056e, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() / 1000));
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/v3/CardHomePageV3UI$updateHeader$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
