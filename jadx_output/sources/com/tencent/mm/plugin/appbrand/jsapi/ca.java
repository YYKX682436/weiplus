package com.tencent.mm.plugin.appbrand.jsapi;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \b2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014¨\u0006\n"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/ca;", "Lcom/tencent/mm/plugin/appbrand/ipc/v;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "request", "Ljz5/f0;", "handleRequest", "<init>", "()V", "d", "com/tencent/mm/plugin/appbrand/jsapi/ba", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class ca extends com.tencent.mm.plugin.appbrand.ipc.v {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.jsapi.ba f80164d = new com.tencent.mm.plugin.appbrand.jsapi.ba(null);

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String f80165e = "CheckStrangerTask";

    @Override // com.tencent.mm.plugin.appbrand.ipc.v
    public void handleRequest(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest request) {
        org.json.JSONObject jSONObject;
        kotlin.jvm.internal.o.g(request, "request");
        com.tencent.mm.plugin.appbrand.jsapi.JsApiOpenTextStateMessage$OpenTextStateResult jsApiOpenTextStateMessage$OpenTextStateResult = new com.tencent.mm.plugin.appbrand.jsapi.JsApiOpenTextStateMessage$OpenTextStateResult();
        if (!(request instanceof com.tencent.mm.plugin.appbrand.jsapi.JsApiOpenTextStateMessage$OpenTextStateRequest)) {
            com.tencent.mars.xlog.Log.w("CheckStrangerTask", "handleRequest, request not instance of ProfileRequest");
            finishProcess(jsApiOpenTextStateMessage$OpenTextStateResult);
            return;
        }
        if (!gm0.j1.b().n()) {
            com.tencent.mars.xlog.Log.e("CheckStrangerTask", "handleRequest, MMKernel.account().hasLogin() is false");
            finishProcess(jsApiOpenTextStateMessage$OpenTextStateResult);
            return;
        }
        java.lang.String reqData = ((com.tencent.mm.plugin.appbrand.jsapi.JsApiOpenTextStateMessage$OpenTextStateRequest) request).getReqData();
        if (reqData == null) {
            reqData = "";
        }
        try {
            jSONObject = new org.json.JSONObject(reqData);
        } catch (java.lang.Throwable unused) {
            jSONObject = null;
        }
        org.json.JSONObject optJSONObject = jSONObject != null ? jSONObject.optJSONObject("param") : null;
        if (kotlin.jvm.internal.o.b(jSONObject != null ? jSONObject.optString("action") : null, "openChat")) {
            android.content.Context context = getActivityContext();
            if (context == null) {
                context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            }
            ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).getClass();
            kotlin.jvm.internal.o.g(context, "context");
            if (optJSONObject != null) {
                java.lang.String optString = optJSONObject.optString("hashUserName");
                java.lang.String optString2 = optJSONObject.optString("encodeUserName");
                optJSONObject.optString("nickName");
                optJSONObject.optString("headImageURL");
                java.lang.String optString3 = optJSONObject.optString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID);
                boolean z17 = true;
                java.lang.String Di = ((m73.q) ((n73.e) i95.n0.c(n73.e.class))).Di(optString, 1);
                com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusFeatureService", "openTextStateChatting hashUserName:%s changeUserName:%s", optString, Di);
                if (Di != null && !r26.n0.N(Di)) {
                    z17 = false;
                }
                qj4.s sVar = qj4.s.f363958a;
                if (z17) {
                    ((s50.g0) ((u50.v) i95.n0.c(u50.v.class))).getClass();
                    java.lang.String l17 = o13.n.l(2);
                    kotlin.jvm.internal.o.f(l17, "getUnsignedMd5UInt(...)");
                    hi4.m.f281556g = l17;
                    ((ki4.x) i95.n0.c(ki4.x.class)).Di(optString3, optString2, context);
                    java.lang.String str = hi4.m.f281556g;
                    qj4.s.o(sVar, 1L, "0", str == null ? "" : str, 7, null, 2, 0, 0, 0, null, null, null, null, null, 16336, null);
                } else {
                    ki4.x xVar = (ki4.x) i95.n0.c(ki4.x.class);
                    kotlin.jvm.internal.o.d(Di);
                    xVar.Ni(context, Di);
                    ((s50.g0) ((u50.v) i95.n0.c(u50.v.class))).getClass();
                    java.lang.String l18 = o13.n.l(2);
                    kotlin.jvm.internal.o.f(l18, "getUnsignedMd5UInt(...)");
                    qj4.s.o(sVar, 6L, null, l18, 10, null, 0, 0, 0, 0, Di, null, null, null, null, 15858, null);
                }
            }
            finishProcess(jsApiOpenTextStateMessage$OpenTextStateResult);
        }
    }
}
