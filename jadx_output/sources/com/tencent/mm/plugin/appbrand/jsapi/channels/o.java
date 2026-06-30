package com.tencent.mm.plugin.appbrand.jsapi.channels;

/* loaded from: classes7.dex */
public abstract class o extends com.tencent.mm.plugin.appbrand.jsapi.channels.m {

    /* renamed from: g, reason: collision with root package name */
    public final boolean f80259g = true;

    public o() {
        si1.e.a(k());
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.channels.m
    public void C(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, int i17) {
        java.lang.String str;
        if (lVar == null) {
            return;
        }
        android.content.Context context = lVar.getContext();
        if (context == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiOpenChannelsCommon", "invoke, context is null");
            lVar.a(i17, o("fail:internal error invalid android context"));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiOpenChannelsCommon", "invoke, data: " + jSONObject);
        org.json.JSONObject jSONObject3 = jSONObject == null ? new org.json.JSONObject() : jSONObject;
        try {
            jSONObject3.put("action", E());
            java.lang.String appId = lVar.getAppId();
            if (jSONObject2 == null || (str = jSONObject2.optString("appId", appId)) == null) {
                str = appId;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiOpenChannelsCommon", "invoke, privateData: " + jSONObject2 + ", envAppId: " + appId + ", appId: " + str);
            jSONObject3.put("sourceId", str);
            if (F()) {
                org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                jSONObject4.put("appid", lVar.getAppId());
                if (jSONObject3.has("reportExtraInfo")) {
                    jSONObject4.put("passthrough", jSONObject3.opt("reportExtraInfo"));
                }
                org.json.JSONObject jSONObject5 = new org.json.JSONObject();
                jSONObject5.put("weapp_info", jSONObject4);
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiOpenChannelsCommon", "invoke, reportExtInfo: " + jSONObject5);
                jSONObject3.put("reportExtraInfo", jSONObject5);
            }
            if (!J(jSONObject3, jSONObject)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiOpenChannelsCommon", "invoke, preProcessExtInfo fail");
                lVar.a(i17, o("fail:internal error"));
                return;
            }
            org.json.JSONObject jSONObject6 = new org.json.JSONObject();
            try {
                jSONObject6.put("extInfo", jSONObject3);
                D(lVar, i17, context, jSONObject6);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiOpenChannelsCommon", "invoke, put extInfo fail since " + e17);
                lVar.a(i17, o("fail:internal error"));
            }
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiOpenChannelsCommon", "invoke, put fail since " + e18);
            lVar.a(i17, o("fail:internal error"));
        }
    }

    public void D(com.tencent.mm.plugin.appbrand.jsapi.l env, int i17, android.content.Context context, org.json.JSONObject extInfoWrapperJsonObj) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(extInfoWrapperJsonObj, "extInfoWrapperJsonObj");
        java.lang.String jSONObject = extInfoWrapperJsonObj.toString();
        kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
        com.tencent.mm.plugin.appbrand.jsapi.channels.EnterFinderRequest enterFinderRequest = new com.tencent.mm.plugin.appbrand.jsapi.channels.EnterFinderRequest(jSONObject, G());
        com.tencent.mm.plugin.appbrand.jsapi.channels.n nVar = new com.tencent.mm.plugin.appbrand.jsapi.channels.n(env, i17, this);
        android.content.Intent K = K(context);
        java.util.Map map = com.tencent.mm.plugin.appbrand.ipc.d.f78400a;
        com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.W6(context, com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.class, enterFinderRequest, nVar, K);
    }

    public abstract java.lang.String E();

    public boolean F() {
        return this.f80259g;
    }

    public boolean G() {
        return false;
    }

    public java.lang.String H(java.lang.String originErrMsg, int i17) {
        kotlin.jvm.internal.o.g(originErrMsg, "originErrMsg");
        return originErrMsg;
    }

    public org.json.JSONObject I(org.json.JSONObject jSONObject) {
        return jSONObject;
    }

    public boolean J(org.json.JSONObject extInfoJsonObj, org.json.JSONObject jSONObject) {
        kotlin.jvm.internal.o.g(extInfoJsonObj, "extInfoJsonObj");
        return true;
    }

    public android.content.Intent K(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        return null;
    }
}
