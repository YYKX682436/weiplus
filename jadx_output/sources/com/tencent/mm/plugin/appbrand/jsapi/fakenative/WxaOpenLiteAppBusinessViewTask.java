package com.tencent.mm.plugin.appbrand.jsapi.fakenative;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public class WxaOpenLiteAppBusinessViewTask extends com.tencent.mm.plugin.appbrand.ipc.v {

    /* renamed from: d, reason: collision with root package name */
    private static final java.lang.String f80921d = "MicroMsg.WxaOpenLiteAppBusinessViewTask";

    /* renamed from: e, reason: collision with root package name */
    private static final int f80922e = 2;

    /* renamed from: f, reason: collision with root package name */
    private static final java.lang.String f80923f = "WeAppLaunchLiteAppResult";

    /* renamed from: g, reason: collision with root package name */
    private static final int f80924g = 10000;

    /* renamed from: h, reason: collision with root package name */
    private static final int f80925h = 10001;

    /* renamed from: i, reason: collision with root package name */
    private static final int f80926i = 10002;

    /* renamed from: m, reason: collision with root package name */
    private static final int f80927m = 20000;

    /* renamed from: n, reason: collision with root package name */
    private static final int f80928n = 20001;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean d(long j17, java.lang.String str, java.lang.Object obj, int i17) {
        com.tencent.mars.xlog.Log.i(f80921d, "actionName:" + str + " data:" + obj);
        com.tencent.mm.plugin.appbrand.jsapi.fakenative.WxaOpenLiteAppBusinessViewResult wxaOpenLiteAppBusinessViewResult = new com.tencent.mm.plugin.appbrand.jsapi.fakenative.WxaOpenLiteAppBusinessViewResult();
        if (f80923f.equals(str)) {
            if (obj instanceof org.json.JSONObject) {
                org.json.JSONObject jSONObject = (org.json.JSONObject) obj;
                try {
                    int i18 = jSONObject.has("errno") ? jSONObject.getInt("errno") : 0;
                    java.lang.String string = jSONObject.has("errMsg") ? jSONObject.getString("errMsg") : "";
                    org.json.JSONObject jSONObject2 = jSONObject.has(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA) ? jSONObject.getJSONObject(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA) : new org.json.JSONObject();
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(i18 == 0 ? "ok: " : "fail: ");
                    sb6.append(string);
                    java.lang.String sb7 = sb6.toString();
                    wxaOpenLiteAppBusinessViewResult.f80918d = i18;
                    wxaOpenLiteAppBusinessViewResult.f80919e = sb7;
                    wxaOpenLiteAppBusinessViewResult.f80920f = jSONObject2;
                } catch (org.json.JSONException e17) {
                    com.tencent.mars.xlog.Log.e(f80921d, "fail: json parse fail:", e17);
                    wxaOpenLiteAppBusinessViewResult.f80918d = 20000;
                    wxaOpenLiteAppBusinessViewResult.f80919e = "fail: json parse fail";
                }
            } else {
                com.tencent.mars.xlog.Log.e(f80921d, "data is not json object");
                wxaOpenLiteAppBusinessViewResult.f80918d = 20001;
                wxaOpenLiteAppBusinessViewResult.f80919e = "fail: data is not json object";
            }
        }
        finishProcess(wxaOpenLiteAppBusinessViewResult);
        return false;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.v
    public void handleRequest(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest appBrandProxyUIProcessTask$ProcessRequest) {
        com.tencent.mm.plugin.appbrand.jsapi.fakenative.WxaOpenLiteAppBusinessViewResult wxaOpenLiteAppBusinessViewResult = new com.tencent.mm.plugin.appbrand.jsapi.fakenative.WxaOpenLiteAppBusinessViewResult();
        if (!(appBrandProxyUIProcessTask$ProcessRequest instanceof com.tencent.mm.plugin.appbrand.jsapi.fakenative.WxaOpenLiteAppBusinessViewRequest)) {
            com.tencent.mars.xlog.Log.e(f80921d, "handleRequest, request not instance of WxaOpenLiteAppBusinessViewTask");
            wxaOpenLiteAppBusinessViewResult.f80918d = 10000;
            wxaOpenLiteAppBusinessViewResult.f80919e = "fail: request not instance of WxaOpenLiteAppBusinessViewTask";
            finishProcess(wxaOpenLiteAppBusinessViewResult);
            return;
        }
        final com.tencent.mm.plugin.appbrand.jsapi.fakenative.WxaOpenLiteAppBusinessViewRequest wxaOpenLiteAppBusinessViewRequest = (com.tencent.mm.plugin.appbrand.jsapi.fakenative.WxaOpenLiteAppBusinessViewRequest) appBrandProxyUIProcessTask$ProcessRequest;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("appId", wxaOpenLiteAppBusinessViewRequest.f80914t);
        bundle.putString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, wxaOpenLiteAppBusinessViewRequest.f80915u);
        bundle.putString("query", wxaOpenLiteAppBusinessViewRequest.f80913s);
        bundle.putBoolean("isHalfScreen", wxaOpenLiteAppBusinessViewRequest.f80904g == 2);
        bundle.putLong("timeout", wxaOpenLiteAppBusinessViewRequest.f80901d);
        bundle.putBoolean(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_TRANSPARENT, wxaOpenLiteAppBusinessViewRequest.f80906i);
        bundle.putBoolean("withDownloadLoading", wxaOpenLiteAppBusinessViewRequest.f80910p);
        bundle.putBoolean("forbidRightGesture", wxaOpenLiteAppBusinessViewRequest.f80908n);
        bundle.putString("minVersion", wxaOpenLiteAppBusinessViewRequest.f80909o);
        if (wxaOpenLiteAppBusinessViewRequest.f80905h != 0) {
            ((android.view.WindowManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("window")).getDefaultDisplay().getMetrics(new android.util.DisplayMetrics());
            bundle.putDouble("heightPercent", wxaOpenLiteAppBusinessViewRequest.f80905h / r0.heightPixels);
        } else {
            float f17 = wxaOpenLiteAppBusinessViewRequest.f80912r;
            if (f17 != 0.0f) {
                bundle.putDouble("heightPercent", f17);
            }
        }
        com.tencent.liteapp.storage.LiteAppReferrerInfo liteAppReferrerInfo = new com.tencent.liteapp.storage.LiteAppReferrerInfo();
        liteAppReferrerInfo.scene = com.tencent.liteapp.gen.LiteAppOpenScene.WA_APP;
        liteAppReferrerInfo.sceneId = wxaOpenLiteAppBusinessViewRequest.f80916v;
        try {
            liteAppReferrerInfo.extraData = new org.json.JSONObject(wxaOpenLiteAppBusinessViewRequest.f80917w);
        } catch (org.json.JSONException unused) {
            com.tencent.mars.xlog.Log.e(f80921d, "parse extraData fail");
        }
        bundle.putParcelable("liteappReferrerInfo", liteAppReferrerInfo);
        com.tencent.mm.plugin.lite.s sVar = new com.tencent.mm.plugin.lite.s();
        sVar.f144167d = new com.tencent.mm.plugin.lite.r() { // from class: com.tencent.mm.plugin.appbrand.jsapi.fakenative.WxaOpenLiteAppBusinessViewTask$$a
            @Override // com.tencent.mm.plugin.lite.r
            public final boolean onDispatch(long j17, java.lang.String str, java.lang.Object obj, int i17) {
                boolean d17;
                d17 = com.tencent.mm.plugin.appbrand.jsapi.fakenative.WxaOpenLiteAppBusinessViewTask.this.d(j17, str, obj, i17);
                return d17;
            }
        };
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).jk(getActivityContext(), bundle, wxaOpenLiteAppBusinessViewRequest.f80902e, wxaOpenLiteAppBusinessViewRequest.f80903f, sVar, new com.tencent.mm.plugin.appbrand.jsapi.fakenative.n0(this));
        new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.LiteAppLifeCycleEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.appbrand.jsapi.fakenative.WxaOpenLiteAppBusinessViewTask.2
            {
                this.__eventId = 1907495603;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.LiteAppLifeCycleEvent liteAppLifeCycleEvent) {
                com.tencent.mm.autogen.events.LiteAppLifeCycleEvent liteAppLifeCycleEvent2 = liteAppLifeCycleEvent;
                am.ri riVar = liteAppLifeCycleEvent2.f54468g;
                if (riVar.f7817a != 3) {
                    return false;
                }
                java.lang.String str = riVar.f7819c;
                com.tencent.mm.plugin.appbrand.jsapi.fakenative.WxaOpenLiteAppBusinessViewRequest wxaOpenLiteAppBusinessViewRequest2 = wxaOpenLiteAppBusinessViewRequest;
                if (!com.tencent.mm.sdk.platformtools.t8.D0(str, wxaOpenLiteAppBusinessViewRequest2.f80914t)) {
                    return false;
                }
                com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.appbrand.jsapi.fakenative.WxaOpenLiteAppBusinessViewTask.f80921d, "close liteapp appId " + liteAppLifeCycleEvent2.f54468g.f7819c + ", " + wxaOpenLiteAppBusinessViewRequest2.f80914t);
                com.tencent.mm.plugin.appbrand.jsapi.fakenative.WxaOpenLiteAppBusinessViewResult wxaOpenLiteAppBusinessViewResult2 = new com.tencent.mm.plugin.appbrand.jsapi.fakenative.WxaOpenLiteAppBusinessViewResult();
                wxaOpenLiteAppBusinessViewResult2.f80918d = 10001;
                wxaOpenLiteAppBusinessViewResult2.f80919e = "fail: close liteapp";
                com.tencent.mm.plugin.appbrand.jsapi.fakenative.WxaOpenLiteAppBusinessViewTask.this.finishProcess(wxaOpenLiteAppBusinessViewResult2);
                dead();
                return false;
            }
        }.alive();
    }
}
