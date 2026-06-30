package com.tencent.mm.plugin.appbrand.jsapi.finder;

/* loaded from: classes7.dex */
class JsApiShareCurrentLive$ShareCurrentLiveTask extends com.tencent.mm.plugin.appbrand.ipc.v implements androidx.lifecycle.x {
    private JsApiShareCurrentLive$ShareCurrentLiveTask() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ jz5.f0 b() {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.v
    public void handleRequest(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest appBrandProxyUIProcessTask$ProcessRequest) {
        org.json.JSONObject jSONObject;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject;
        r45.nw1 liveInfo;
        getActivityContext().mo133getLifecycle().a(this);
        com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiShareCurrentLive$ShareCurrentLiveResult jsApiShareCurrentLive$ShareCurrentLiveResult = new com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiShareCurrentLive$ShareCurrentLiveResult();
        if (!(appBrandProxyUIProcessTask$ProcessRequest instanceof com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiShareCurrentLive$ShareCurrentLiveRequest)) {
            com.tencent.mars.xlog.Log.w("JsApiShareCurrentLive", "handleRequest, request not instance of ShareCurrentLiveRequest");
            finishProcess(jsApiShareCurrentLive$ShareCurrentLiveResult);
            return;
        }
        java.lang.Long l17 = null;
        try {
            jSONObject = new org.json.JSONObject(((com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiShareCurrentLive$ShareCurrentLiveRequest) appBrandProxyUIProcessTask$ProcessRequest).f81169d);
        } catch (java.lang.Throwable unused) {
            jSONObject = null;
        }
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("JsApiShareCurrentLive", "data is null");
            finishProcess(jsApiShareCurrentLive$ShareCurrentLiveResult);
            return;
        }
        com.tencent.mars.xlog.Log.i("JsApiShareCurrentLive", "ShareCurrentLiveTask json:" + jSONObject);
        java.lang.String liveId = jSONObject.optString("liveID", "");
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("instantDiscountActivityExtra");
        if (optJSONObject != null) {
            java.lang.String optString = optJSONObject.optString("activityKey");
            java.lang.String optString2 = optJSONObject.optString("coverMaskImageURL");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("instantDiscountActivityKey", optString);
            bundle.putString("instantDiscountMaskUrl", optString2);
            s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
            com.tencent.mm.ui.MMActivity activity = getActivityContext();
            com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiShareCurrentLive$ShareCurrentLiveTask$$a jsApiShareCurrentLive$ShareCurrentLiveTask$$a = new com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiShareCurrentLive$ShareCurrentLiveTask$$a();
            ((com.tencent.mm.feature.finder.live.v4) w0Var).getClass();
            kotlin.jvm.internal.o.g(activity, "activity");
            kotlin.jvm.internal.o.g(liveId, "liveId");
            dk2.ef efVar = dk2.ef.f233372a;
            mm2.c1 c1Var = (mm2.c1) efVar.i(mm2.c1.class);
            if (c1Var != null && (finderObject = c1Var.f328846n) != null && (liveInfo = finderObject.getLiveInfo()) != null) {
                l17 = java.lang.Long.valueOf(liveInfo.getLong(0));
            }
            long Z = pm0.v.Z(liveId);
            if (l17 != null && Z == l17.longValue()) {
                efVar.l0(activity, bundle, jsApiShareCurrentLive$ShareCurrentLiveTask$$a);
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.FinderLiveFeatureService", "shareLiveToFriendFromJs failed, liveId " + Z + " does not match current liveId " + liveId);
            }
        }
        finishProcess(jsApiShareCurrentLive$ShareCurrentLiveResult);
    }
}
