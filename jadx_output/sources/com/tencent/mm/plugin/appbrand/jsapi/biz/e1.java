package com.tencent.mm.plugin.appbrand.jsapi.biz;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014¨\u0006\u000e"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/biz/e1;", "Lcom/tencent/mm/plugin/appbrand/ipc/v;", "Lorg/json/JSONObject;", "rawParams", "Ll81/b1;", "e", "", "d", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "request", "Ljz5/f0;", "handleRequest", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class e1 extends com.tencent.mm.plugin.appbrand.ipc.v {
    private final boolean d(org.json.JSONObject rawParams) {
        boolean optBoolean = rawParams.optBoolean("useDraft", false);
        if (!rawParams.has("draftType") || !rawParams.has("draftScene")) {
            return optBoolean;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenBizPublishImageForAppBrand", "has draftType and draftScene");
        tk.a Bi = ((ox.z) ((tk.r) i95.n0.c(tk.r.class))).Bi(e(rawParams));
        tk.s[] sVarArr = tk.s.f419870d;
        int optInt = rawParams.optInt("bizType", 1);
        rm.b0 b0Var = (rm.b0) i95.n0.c(rm.b0.class);
        int optInt2 = rawParams.optInt("draftType");
        java.lang.String optString = rawParams.optString("draftScene");
        kotlin.jvm.internal.o.f(optString, "optString(...)");
        return ((ur1.s) b0Var).Bi(optInt2, optString, optInt, Bi.f419858b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l81.b1 e(org.json.JSONObject rawParams) {
        l81.b1 b1Var = new l81.b1();
        b1Var.f317014b = "wx0b2ec076ec39c786";
        b1Var.f317032k = rawParams.has(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE) ? com.tencent.mm.sdk.platformtools.t8.D1(rawParams.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE), 0) : 1037;
        b1Var.f317034l = rawParams.optString("sceneNote");
        java.lang.String optString = rawParams.optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
        if (optString.length() == 0) {
            tk.o oVar = (tk.o) i95.n0.c(tk.o.class);
            tk.v vVar = tk.w.f419878e;
            tk.v vVar2 = tk.w.f419878e;
            java.lang.String optString2 = rawParams.optString("mpPublishAction", "openWeApp");
            kotlin.jvm.internal.o.f(optString2, "optString(...)");
            optString = ((ox.g) oVar).ij(vVar.a(optString2));
        }
        b1Var.f317022f = optString;
        b1Var.f317028i = new com.tencent.mm.plugin.appbrand.jsapi.biz.d1(rawParams);
        com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer appBrandLaunchReferrer = new com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer();
        appBrandLaunchReferrer.f77322d = 1;
        appBrandLaunchReferrer.f77325g = rawParams.optString("privateExtraData");
        appBrandLaunchReferrer.f77324f = rawParams.optString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA);
        appBrandLaunchReferrer.f77323e = rawParams.optString("sourceAppId");
        appBrandLaunchReferrer.f77329n = rawParams.optInt("sourceType");
        appBrandLaunchReferrer.f77328m = rawParams.optString("agentId");
        appBrandLaunchReferrer.f77335t = rawParams.optString("externalFileRefs");
        b1Var.f317041s = appBrandLaunchReferrer;
        return b1Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.v
    public void handleRequest(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest appBrandProxyUIProcessTask$ProcessRequest) {
        if (!(appBrandProxyUIProcessTask$ProcessRequest instanceof com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiOpenBizPublishImageForAppBrand$OpenBizPublishImageProcessRequest)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenBizPublishImageForAppBrand", "handleRequest, request is not OpenBizPublishImageProcessRequest");
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(((com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiOpenBizPublishImageForAppBrand$OpenBizPublishImageProcessRequest) appBrandProxyUIProcessTask$ProcessRequest).getCom.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA java.lang.String());
            boolean d17 = d(jSONObject);
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenBizPublishImageForAppBrand", "invoke in MM process， useDraft: " + d17);
            tk.o oVar = (tk.o) i95.n0.c(tk.o.class);
            com.tencent.mm.ui.MMActivity activityContext = getActivityContext();
            kotlin.jvm.internal.o.f(activityContext, "getActivityContext(...)");
            ((ox.g) oVar).Zi(activityContext, new com.tencent.mm.plugin.appbrand.jsapi.biz.c1(this, jSONObject, d17));
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenBizPublishImageForAppBrand", "parse json error");
            finishProcess(new com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiOpenBizPublishImageForAppBrand$OpenBizPublishImageProcessResponse(false, "parse json error", ""));
        }
    }
}
