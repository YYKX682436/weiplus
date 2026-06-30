package com.tencent.mm.plugin.appbrand.jsapi.channels;

/* loaded from: classes7.dex */
public final class t extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 1044;
    private static final java.lang.String NAME = "openChannelsLiveCollection";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        if (lVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiOpenChannelsLiveCollection", "invoke, env is null");
            return;
        }
        android.content.Context context = lVar.getContext();
        if (context == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiOpenChannelsLiveCollection", "invoke, context is null");
            lVar.a(i17, o("fail:internal error invalid android context"));
            return;
        }
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiOpenChannelsLiveCollection", "invoke, data is null");
            lVar.a(i17, o("fail:invalid data"));
            return;
        }
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject.put("action", "openFinderMultiMoreLive");
            jSONObject2.put("extInfo", jSONObject);
            java.lang.String jSONObject3 = jSONObject2.toString();
            kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
            com.tencent.mm.plugin.appbrand.jsapi.channels.OpenChannelsLiveCollectionRequest openChannelsLiveCollectionRequest = new com.tencent.mm.plugin.appbrand.jsapi.channels.OpenChannelsLiveCollectionRequest(jSONObject3);
            com.tencent.mm.plugin.appbrand.jsapi.channels.s sVar = new com.tencent.mm.plugin.appbrand.jsapi.channels.s(lVar, i17, this);
            android.content.Intent a17 = com.tencent.mm.plugin.appbrand.ipc.e.a(context);
            java.util.Map map = com.tencent.mm.plugin.appbrand.ipc.d.f78400a;
            com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.W6(context, com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.class, openChannelsLiveCollectionRequest, sVar, a17);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiOpenChannelsLiveCollection", "invoke, put fail since " + e17);
            lVar.a(i17, o("fail:internal error"));
        }
    }
}
