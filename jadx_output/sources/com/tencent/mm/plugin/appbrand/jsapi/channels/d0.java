package com.tencent.mm.plugin.appbrand.jsapi.channels;

/* loaded from: classes7.dex */
public class d0 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 1065;
    private static final java.lang.String NAME = "openChannelsTopic";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l env, org.json.JSONObject jSONObject, int i17) {
        kotlin.jvm.internal.o.g(env, "env");
        android.content.Context context = env.getContext();
        if (context == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiOpenChannelsTopic", "invoke, context is null");
            java.lang.String str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 4);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            env.a(i17, u(str, jSONObject2));
            return;
        }
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        if (jSONObject == null) {
            jSONObject = new org.json.JSONObject();
        }
        try {
            jSONObject.put("entryScene", 15);
            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
            jSONObject4.put("appid", env.getAppId());
            jSONObject4.put("appname", C(env));
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_EXTRA_INFO, jSONObject4);
            jSONObject.put("KEY_JSAPI_SOURCE_TYPE", 1);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiOpenChannelsTopic", "invoke, put report info fail since " + e18);
        }
        jSONObject3.put("extInfo", jSONObject);
        java.lang.String jSONObject5 = jSONObject3.toString();
        kotlin.jvm.internal.o.f(jSONObject5, "toString(...)");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiOpenChannelsTopic", "invoke, openChannelsParams: ".concat(jSONObject5));
        com.tencent.mm.plugin.appbrand.jsapi.channels.OpenChannelsTopicRequest openChannelsTopicRequest = new com.tencent.mm.plugin.appbrand.jsapi.channels.OpenChannelsTopicRequest(jSONObject5);
        com.tencent.mm.plugin.appbrand.jsapi.channels.c0 c0Var = new com.tencent.mm.plugin.appbrand.jsapi.channels.c0(env, i17, this);
        java.util.Map map = com.tencent.mm.plugin.appbrand.ipc.d.f78400a;
        com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.W6(context, com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.class, openChannelsTopicRequest, c0Var, null);
    }

    public java.lang.String C(com.tencent.mm.plugin.appbrand.jsapi.l env) {
        kotlin.jvm.internal.o.g(env, "env");
        return "";
    }
}
