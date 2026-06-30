package com.tencent.mm.plugin.appbrand.jsapi.channels;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0005\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/channels/JsApiEcdSaSign$SignRequest;", "kotlin.jvm.PlatformType", "request", "Lcom/tencent/mm/ipcinvoker/r;", "Lcom/tencent/mm/plugin/appbrand/jsapi/channels/JsApiEcdSaSign$SignResult;", "callback", "Ljz5/f0;", "invoke", "(Lcom/tencent/mm/plugin/appbrand/jsapi/channels/JsApiEcdSaSign$SignRequest;Lcom/tencent/mm/ipcinvoker/r;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class h<InputType, ResultType> implements com.tencent.mm.ipcinvoker.i {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.jsapi.channels.h f80235d = new com.tencent.mm.plugin.appbrand.jsapi.channels.h();

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        java.lang.Exception e17;
        java.lang.String str;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(((com.tencent.mm.plugin.appbrand.jsapi.channels.JsApiEcdSaSign$SignRequest) obj).f80203d);
            str = "|AppId=" + jSONObject.optString("appId");
            try {
                java.lang.String optString = jSONObject.optString("signText");
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiEcdSaSign", "signText :" + optString + str);
                byte[] bytes = com.tencent.mm.network.j.f72026e.c(optString + str).getBytes(r26.c.f368865a);
                kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
                java.lang.String encodeToString = android.util.Base64.encodeToString(bytes, 0);
                if (rVar != null) {
                    kotlin.jvm.internal.o.d(encodeToString);
                    rVar.a(new com.tencent.mm.plugin.appbrand.jsapi.channels.JsApiEcdSaSign$SignResult(encodeToString, str));
                }
            } catch (java.lang.Exception e18) {
                e17 = e18;
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrand.JsApiEcdSaSign", e17, "handleRequest fail", new java.lang.Object[0]);
                if (rVar != null) {
                    rVar.a(new com.tencent.mm.plugin.appbrand.jsapi.channels.JsApiEcdSaSign$SignResult("", str));
                }
            }
        } catch (java.lang.Exception e19) {
            e17 = e19;
            str = "";
        }
    }
}
