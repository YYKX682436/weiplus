package com.tencent.mm.plugin.appbrand.wxassistant;

/* loaded from: classes7.dex */
public final class n {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f92237b = {kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(com.tencent.mm.plugin.appbrand.wxassistant.n.class, "isHeadless", "isHeadless()Z", 0))};

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.wxassistant.n f92236a = new com.tencent.mm.plugin.appbrand.wxassistant.n();

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f92238c = jz5.h.b(com.tencent.mm.plugin.appbrand.wxassistant.c.f92143d);

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String f92239d = "";

    /* renamed from: e, reason: collision with root package name */
    public static final nf.r f92240e = new nf.r(java.lang.Boolean.FALSE);

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.List f92241f = kz5.c0.i(com.tencent.mm.plugin.appbrand.jsapi.z7.NAME, "openOfficialAccountProfile", "openOfficialAccountArticle", "shareVideoToGroup", "shareImageToGroup", "shareFileToGroup", "shareEmojiToGroup", "shareAppMessageToGroup", "selectGroupMembers", "showShareImageMenu", "shareVideoMessage", "shareFileMessage", "shareToOfficialAccount", com.tencent.mm.plugin.appbrand.jsapi.pay.k2.NAME, com.tencent.mm.plugin.appbrand.jsapi.pay.k2.NAME, "requestPluginPayment", com.tencent.mm.plugin.appbrand.jsapi.pay.y1.NAME, com.tencent.mm.plugin.appbrand.jsapi.pay.u1.NAME, "requestCommonPayment", com.tencent.mm.plugin.appbrand.jsapi.pay.c0.NAME, yd1.h.NAME, "chooseVideo", com.tencent.mm.plugin.appbrand.jsapi.media.z3.NAME, com.tencent.mm.plugin.appbrand.jsapi.lbs.h.NAME, com.tencent.mm.plugin.appbrand.jsapi.lbs.f.NAME, com.tencent.mm.plugin.appbrand.jsapi.y9.NAME, "chooseAddress", com.tencent.mm.plugin.appbrand.jsapi.k9.NAME, com.tencent.mm.plugin.appbrand.jsapi.b2.NAME, com.tencent.mm.plugin.appbrand.jsapi.u4.NAME, com.tencent.mm.plugin.appbrand.jsapi.s4.NAME, com.tencent.mm.plugin.appbrand.jsapi.bio.soter.k.NAME, "showRedPackage", "openStoreOrderDetail", "openStoreCouponDetail", "reserveChannelsLive", "openChannelsUserProfile", com.tencent.mm.plugin.appbrand.jsapi.channels.r.NAME, "openChannelsEvent", com.tencent.mm.plugin.appbrand.jsapi.channels.mbjsapi.f.NAME, "requirePrivacyAuthorize", "openPrivacyContract", "openCustomerServiceChat", com.tencent.mm.plugin.appbrand.jsapi.emoji.u.NAME, com.tencent.mm.plugin.appbrand.jsapi.emoji.t.NAME, com.tencent.mm.plugin.appbrand.jsapi.emoji.s.NAME, "chooseContact", com.tencent.mm.plugin.appbrand.jsapi.scanner.p.NAME, "sendSms", com.tencent.mm.plugin.appbrand.jsapi.share.c0.NAME);

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.Map f92242g = kz5.c1.k(new jz5.l(com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.i.NAME, 2), new jz5.l(com.tencent.mm.plugin.appbrand.jsapi.pay.l.NAME, 3), new jz5.l(com.tencent.mm.plugin.appbrand.jsapi.lbs.g0.NAME, 4), new jz5.l(com.tencent.mm.plugin.appbrand.jsapi.media.i6.NAME, 5), new jz5.l(com.tencent.mm.plugin.appbrand.jsapi.fakenative.f.NAME, 2), new jz5.l(xc1.l.NAME, 2), new jz5.l(qf1.e.NAME, 6));

    public static final void b(java.lang.String appId, yz5.a aVar) {
        kotlin.jvm.internal.o.g(appId, "appId");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandWxAssistantLogic", "reOpenForeground currentAppId:".concat(appId));
        if (appId.length() == 0) {
            pm0.v.X(com.tencent.mm.plugin.appbrand.wxassistant.h.f92206d);
            return;
        }
        com.tencent.mm.plugin.appbrand.service.h6 h6Var = (com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        l81.b1 b1Var = new l81.b1();
        b1Var.f317032k = com.tencent.liteav.TXLiteAVCode.WARNING_VIRTUAL_BACKGROUND_DEVICE_UNSURPORTED;
        b1Var.f317014b = appId;
        b1Var.f317031j0 = new com.tencent.mm.plugin.appbrand.config.AppBrandAssistantParams(true, "", 0.0d, 0.0d, 12, null);
        b1Var.L = new com.tencent.mm.plugin.appbrand.wxassistant.i(aVar);
        ((com.tencent.mm.plugin.appbrand.launching.xc) h6Var).bj(context, b1Var);
    }

    public final void d() {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.appbrand.wxassistant.AppBrandWxAssistantUI.class);
        intent.setFlags(268435456);
        pf5.j0.a(intent, gm1.e.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/wxassistant/AppBrandWxAssistantLogic", "showDebugWxAssistantDialog", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/appbrand/wxassistant/AppBrandWxAssistantLogic", "showDebugWxAssistantDialog", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
