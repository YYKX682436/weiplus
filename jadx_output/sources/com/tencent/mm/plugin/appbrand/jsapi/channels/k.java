package com.tencent.mm.plugin.appbrand.jsapi.channels;

/* loaded from: classes7.dex */
public final class k implements com.tencent.mm.plugin.appbrand.ipc.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f80245a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f80246b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.channels.l f80247c;

    public k(com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, com.tencent.mm.plugin.appbrand.jsapi.channels.l lVar2) {
        this.f80245a = lVar;
        this.f80246b = i17;
        this.f80247c = lVar2;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.u
    public void onReceiveResult(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult appBrandProxyUIProcessTask$ProcessResult) {
        java.lang.String o17;
        com.tencent.mm.plugin.appbrand.jsapi.channels.OpenFinderFeedResult openFinderFeedResult = (com.tencent.mm.plugin.appbrand.jsapi.channels.OpenFinderFeedResult) appBrandProxyUIProcessTask$ProcessResult;
        if (openFinderFeedResult == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiOpenChannelsActivity", "onReceiveResult#IProcessResultReceiver, result is null");
            return;
        }
        int ordinal = openFinderFeedResult.f80218d.ordinal();
        com.tencent.mm.plugin.appbrand.jsapi.l component = this.f80245a;
        com.tencent.mm.plugin.appbrand.jsapi.channels.l lVar = this.f80247c;
        if (ordinal == 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onReceiveResult#IProcessResultReceiver, errCode: ");
            int i17 = openFinderFeedResult.f80219e;
            sb6.append(i17);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiOpenChannelsActivity", sb6.toString());
            if (i17 == 0) {
                o17 = lVar.o("ok");
            } else {
                lVar.getClass();
                o17 = lVar.o("fail:internal error");
            }
            component.a(this.f80246b, o17);
            return;
        }
        if (ordinal != 1) {
            return;
        }
        org.json.JSONObject navigateBackInfo = openFinderFeedResult.f80220f;
        lVar.getClass();
        try {
            navigateBackInfo.put("feedId", navigateBackInfo.optString("feedID"));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiOpenChannelsActivity", "preProcessNavigateBackInfo, fail since " + e17);
        }
        kotlin.jvm.internal.o.g(component, "component");
        kotlin.jvm.internal.o.g(navigateBackInfo, "navigateBackInfo");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiOpenChannelsActivity", "dispatch#JsEventOnNavigateBackFromChannelsActivity, navigateBackInfo: " + navigateBackInfo);
        com.tencent.mm.plugin.appbrand.jsapi.channels.j0 j0Var = new com.tencent.mm.plugin.appbrand.jsapi.channels.j0();
        j0Var.u(component);
        j0Var.f82374f = navigateBackInfo.toString();
        j0Var.m();
    }
}
