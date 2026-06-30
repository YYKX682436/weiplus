package com.tencent.mm.plugin.appbrand.jsapi.channels;

/* loaded from: classes7.dex */
public class i0 extends com.tencent.mm.plugin.appbrand.jsapi.channels.m {
    private static final int CTRL_INDEX = 1042;
    private static final java.lang.String NAME = "reserveChannelsLive";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.channels.m
    public void C(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, int i17) {
        java.lang.String str;
        if (lVar == null) {
            return;
        }
        android.content.Context context = lVar.getContext();
        if (context == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiReserveChannelsLive", "invoke, context is null");
            lVar.a(i17, o("fail:internal error invalid android context"));
            return;
        }
        if (jSONObject == null) {
            jSONObject = new org.json.JSONObject();
        }
        try {
            java.lang.String appId = lVar.getAppId();
            if (jSONObject2 == null || (str = jSONObject2.optString("appId", appId)) == null) {
                str = appId;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiReserveChannelsLive", "invoke, privateData: " + jSONObject2 + ", envAppId: " + appId + ", appId: " + str);
            jSONObject.put("appId", str);
        } catch (java.lang.Exception unused) {
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiReserveChannelsLive", "invoke, paramsJsonObj: " + jSONObject);
        java.lang.String jSONObject3 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
        com.tencent.mm.plugin.appbrand.jsapi.channels.ReserveChannelsLiveRequest reserveChannelsLiveRequest = new com.tencent.mm.plugin.appbrand.jsapi.channels.ReserveChannelsLiveRequest(jSONObject3);
        com.tencent.mm.plugin.appbrand.jsapi.channels.h0 h0Var = new com.tencent.mm.plugin.appbrand.jsapi.channels.h0(lVar, i17, this);
        java.util.Map map = com.tencent.mm.plugin.appbrand.ipc.d.f78400a;
        com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.W6(context, com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.class, reserveChannelsLiveRequest, h0Var, null);
    }
}
