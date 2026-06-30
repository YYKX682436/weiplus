package com.tencent.mm.plugin.appbrand.app;

/* loaded from: classes7.dex */
public class r8 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f75253a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f75254b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.q5 f75255c;

    public r8(com.tencent.mm.plugin.appbrand.app.l8 l8Var, java.lang.String str, java.lang.String str2, com.tencent.mm.plugin.appbrand.service.q5 q5Var) {
        this.f75253a = str;
        this.f75254b = str2;
        this.f75255c = q5Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.lang.String str = this.f75254b;
        com.tencent.mm.plugin.appbrand.service.q5 q5Var = this.f75255c;
        java.lang.String uuid = this.f75253a;
        kotlin.jvm.internal.o.g(uuid, "uuid");
        new com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.c(uuid, 1, null, 4, null).l();
        try {
            cl0.g gVar = new cl0.g(str);
            if (!com.tencent.mm.plugin.appbrand.app.l8.wi(uuid, gVar)) {
                cl0.g gVar2 = new cl0.g(gVar.optString("invokeData"));
                java.lang.String optString = gVar2.optString("miniprogramAppID");
                int b17 = h3.a.b(gVar2.optInt("debugMode", 0), 0, 2);
                if (android.text.TextUtils.isEmpty(optString)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.ServiceForWebView", "privateOpenWeappFunctionalPage, invalid miniprogramAppId");
                    new com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.c(uuid, 4, null, 4, null).l();
                    if (q5Var != null) {
                        ((com.tencent.mm.plugin.webview.ui.tools.jsapi.k3) q5Var).a(false, "{}", 4);
                    }
                } else {
                    java.lang.String optString2 = gVar2.optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, "__wx__/open-api-redirecting-page");
                    java.lang.String optString3 = gVar2.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME);
                    java.lang.String optString4 = gVar.optString("runtimeAppid");
                    int optInt = gVar.optInt("runtimeLaunchScene", 1111);
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ServiceForWebView", "transferJson：%s, runtimeLaunchScene:%d", str, java.lang.Integer.valueOf(optInt));
                    com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject = new com.tencent.mm.plugin.appbrand.report.AppBrandStatObject();
                    appBrandStatObject.f87790f = optInt;
                    appBrandStatObject.f87791g = optString4 + ":" + optString3;
                    com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer appBrandLaunchReferrer = new com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer();
                    appBrandLaunchReferrer.f77322d = 7;
                    appBrandLaunchReferrer.f77323e = null;
                    appBrandLaunchReferrer.f77332q = gVar2.toString();
                    com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel launchParcel = new com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel();
                    launchParcel.f84902e = optString;
                    launchParcel.f84906i = optString2;
                    launchParcel.f84910o = appBrandStatObject;
                    launchParcel.f84911p = appBrandLaunchReferrer;
                    launchParcel.f84904g = b17;
                    launchParcel.f84924y = new com.tencent.mm.plugin.appbrand.app.q8(this);
                    ((com.tencent.mm.plugin.appbrand.launching.a) com.tencent.mm.plugin.appbrand.launching.precondition.x.f85032a).a(com.tencent.mm.sdk.platformtools.x2.f193071a, launchParcel);
                }
            } else if (q5Var != null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.ServiceForWebView", "interceptedByDirectApi done, cancel");
                ((com.tencent.mm.plugin.webview.ui.tools.jsapi.k3) q5Var).a(false, "{}", 4);
            }
            return null;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.ServiceForWebView", "privateOpenWeappFunctionalPage, parse failed e = %s, uuid = %s, json = %s", e17, uuid, str);
            new com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.c(uuid, 4, null, 4, null).l();
            if (q5Var == null) {
                return null;
            }
            ((com.tencent.mm.plugin.webview.ui.tools.jsapi.k3) q5Var).a(false, "{}", 4);
            return null;
        }
    }
}
