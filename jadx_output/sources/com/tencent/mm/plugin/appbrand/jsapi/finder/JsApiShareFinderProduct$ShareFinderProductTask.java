package com.tencent.mm.plugin.appbrand.jsapi.finder;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public class JsApiShareFinderProduct$ShareFinderProductTask extends com.tencent.mm.plugin.appbrand.ipc.v implements androidx.lifecycle.x {
    private JsApiShareFinderProduct$ShareFinderProductTask() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ jz5.f0 b(com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiShareFinderProduct$ShareFinderProductResult jsApiShareFinderProduct$ShareFinderProductResult, java.lang.String str) {
        jsApiShareFinderProduct$ShareFinderProductResult.f81178d = str;
        finishProcess(jsApiShareFinderProduct$ShareFinderProductResult);
        return null;
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_STOP)
    public final void doPause(androidx.lifecycle.y yVar) {
        finishProcess(null);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.v
    public void handleRequest(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest appBrandProxyUIProcessTask$ProcessRequest) {
        org.json.JSONObject jSONObject;
        getActivityContext().mo133getLifecycle().a(this);
        final com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiShareFinderProduct$ShareFinderProductResult jsApiShareFinderProduct$ShareFinderProductResult = new com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiShareFinderProduct$ShareFinderProductResult();
        if (!(appBrandProxyUIProcessTask$ProcessRequest instanceof com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiShareFinderProduct$ShareFinderProductRequest)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Finder.JsApiShareFinderProduct", "handleRequest, request not instance of ShareFinderProductRequest");
            finishProcess(jsApiShareFinderProduct$ShareFinderProductResult);
            return;
        }
        try {
            jSONObject = new org.json.JSONObject(((com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiShareFinderProduct$ShareFinderProductRequest) appBrandProxyUIProcessTask$ProcessRequest).f81177d);
        } catch (java.lang.Throwable unused) {
            jSONObject = null;
        }
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Finder.JsApiShareFinderProduct", "data is null");
            finishProcess(jsApiShareFinderProduct$ShareFinderProductResult);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Finder.JsApiShareFinderProduct", "JsApiShareFinderProduct json:" + jSONObject);
        r45.zc4 zc4Var = new r45.zc4();
        zc4Var.set(0, jSONObject.optString("appId"));
        zc4Var.set(1, jSONObject.optString("productID"));
        zc4Var.set(2, jSONObject.optString("realProductId"));
        zc4Var.set(3, java.lang.Boolean.valueOf(jSONObject.optString("showShareType").equals("0")));
        zc4Var.set(4, jSONObject.optString("esSource"));
        zc4Var.set(5, jSONObject.optString("finderLiveToken"));
        zc4Var.set(6, jSONObject.optString("finderUsername"));
        zc4Var.set(7, jSONObject.optString("entranceGMsgID"));
        zc4Var.set(8, jSONObject.optString("promoterKey"));
        zc4Var.set(9, java.lang.Boolean.valueOf(jSONObject.optBoolean("showQRCodeEntrance")));
        zc4Var.set(10, java.lang.Boolean.valueOf(jSONObject.optBoolean("showCopyLinkEntrance")));
        zc4Var.set(11, java.lang.Boolean.valueOf(jSONObject.optBoolean("showComplaintEntrance")));
        zc4Var.set(12, jSONObject.optString("liteAppId"));
        zc4Var.set(13, jSONObject.optString("liteQuery"));
        zc4Var.set(18, 0);
        zc4Var.set(20, java.lang.Boolean.valueOf(jSONObject.optBoolean("canShowGiveGiftEntrance")));
        zc4Var.set(21, java.lang.Boolean.valueOf(jSONObject.optBoolean("hideGiveGiftEntrance", true)));
        zc4Var.set(25, java.lang.Boolean.valueOf(jSONObject.optBoolean("showShareTimeline")));
        zc4Var.set(26, java.lang.Boolean.valueOf(jSONObject.optBoolean("enableShareTimeline")));
        zc4Var.set(22, java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.E1(jSONObject.optString("cpsProductId", "0"))));
        java.lang.String optString = jSONObject.optString("targetUsername");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            zc4Var.set(3, bool);
            zc4Var.set(14, optString);
            zc4Var.set(23, bool);
            zc4Var.set(24, java.lang.Boolean.FALSE);
        }
        zc4Var.set(27, jSONObject.optString("passBuffer"));
        s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
        com.tencent.mm.ui.MMActivity activity = getActivityContext();
        yz5.l lVar = new yz5.l() { // from class: com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiShareFinderProduct$ShareFinderProductTask$$a
            @Override // yz5.l
            public final java.lang.Object invoke(java.lang.Object obj) {
                jz5.f0 b17;
                b17 = com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiShareFinderProduct$ShareFinderProductTask.this.b(jsApiShareFinderProduct$ShareFinderProductResult, (java.lang.String) obj);
                return b17;
            }
        };
        com.tencent.mm.feature.finder.live.v4 v4Var = (com.tencent.mm.feature.finder.live.v4) w0Var;
        v4Var.getClass();
        kotlin.jvm.internal.o.g(activity, "activity");
        v65.i.c(new com.tencent.mm.sdk.coroutines.LifecycleScope("MicroMsg.FinderLiveFeatureService", activity, 0, 4, null), null, new com.tencent.mm.feature.finder.live.t4(zc4Var, activity, v4Var, lVar, null), 1, null);
    }
}
