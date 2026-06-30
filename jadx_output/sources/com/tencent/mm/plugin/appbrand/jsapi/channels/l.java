package com.tencent.mm.plugin.appbrand.jsapi.channels;

/* loaded from: classes7.dex */
public class l extends com.tencent.mm.plugin.appbrand.jsapi.channels.o {
    private static final int CTRL_INDEX = 970;
    private static final java.lang.String NAME = "openChannelsActivity";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.channels.o
    public void D(com.tencent.mm.plugin.appbrand.jsapi.l env, int i17, android.content.Context context, org.json.JSONObject extInfoWrapperJsonObj) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(extInfoWrapperJsonObj, "extInfoWrapperJsonObj");
        com.tencent.mm.plugin.appbrand.jsapi.channels.OpenFinderFeedRequest openFinderFeedRequest = new com.tencent.mm.plugin.appbrand.jsapi.channels.OpenFinderFeedRequest(extInfoWrapperJsonObj);
        com.tencent.mm.plugin.appbrand.jsapi.channels.k kVar = new com.tencent.mm.plugin.appbrand.jsapi.channels.k(env, i17, this);
        java.util.Map map = com.tencent.mm.plugin.appbrand.ipc.d.f78400a;
        com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.W6(context, com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.class, openFinderFeedRequest, kVar, null);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.channels.o
    public java.lang.String E() {
        return "openFinderFeed";
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.channels.o
    public boolean J(org.json.JSONObject extInfoJsonObj, org.json.JSONObject jSONObject) {
        kotlin.jvm.internal.o.g(extInfoJsonObj, "extInfoJsonObj");
        try {
            extInfoJsonObj.put("feedID", extInfoJsonObj.optString("feedId"));
            extInfoJsonObj.put("nonceID", extInfoJsonObj.optString("nonceId"));
            extInfoJsonObj.put("shareScene", 18);
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiOpenChannelsActivity", "preProcessExtInfo, fail since " + e17);
            return false;
        }
    }
}
