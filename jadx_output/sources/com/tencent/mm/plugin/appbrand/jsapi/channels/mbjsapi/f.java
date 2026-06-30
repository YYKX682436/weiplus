package com.tencent.mm.plugin.appbrand.jsapi.channels.mbjsapi;

/* loaded from: classes7.dex */
public final class f extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final java.lang.String NAME = "openChannelsActivity";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l env, org.json.JSONObject data, int i17) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mars.xlog.Log.i("JsApiOpenChannelsActivityMB", "invoke, data: " + data);
        data.put("action", "openFinderFeed");
        data.put("sourceId", env.getAppId());
        if (!data.has("feedID")) {
            data.put("feedID", data.optString("feedId"));
        }
        if (!data.has("nonceID")) {
            data.put("nonceID", data.optString("nonceId"));
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("extInfo", data);
        android.content.Context context = env.getContext();
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        com.tencent.mm.plugin.appbrand.jsapi.channels.mbjsapi.JsApiOpenChannelsActivityMB$EnterChannelActivityRequest jsApiOpenChannelsActivityMB$EnterChannelActivityRequest = new com.tencent.mm.plugin.appbrand.jsapi.channels.mbjsapi.JsApiOpenChannelsActivityMB$EnterChannelActivityRequest(jSONObject2);
        com.tencent.mm.plugin.appbrand.jsapi.channels.mbjsapi.e eVar = new com.tencent.mm.plugin.appbrand.jsapi.channels.mbjsapi.e(env, i17, this);
        java.util.Map map = com.tencent.mm.plugin.appbrand.ipc.d.f78400a;
        com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.W6(context, com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.class, jsApiOpenChannelsActivityMB$EnterChannelActivityRequest, eVar, null);
    }
}
