package com.tencent.mm.plugin.appbrand.jsapi.channels;

/* loaded from: classes7.dex */
public final class b0 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 1001;
    private static final java.lang.String NAME = "openChannelsRewardedVideoAd";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        ((mq0.s0) ((mq0.d0) i95.n0.c(mq0.d0.class))).wi(mq0.g0.f330558d);
        C(jSONObject, mq0.z.f330647u, kz5.q0.f314001d);
        if (lVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiOpenChannelsRewardedVideoAd", "invoke, env is null");
            return;
        }
        android.content.Context context = lVar.getContext();
        if (context == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiOpenChannelsRewardedVideoAd", "invoke, context is null");
            lVar.a(i17, o("fail:internal error invalid android context"));
            return;
        }
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiOpenChannelsRewardedVideoAd", "invoke, data is null");
            lVar.a(i17, o("fail:invalid data"));
            return;
        }
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject.put("action", NAME);
            jSONObject2.put("extInfo", jSONObject);
            java.lang.String jSONObject3 = jSONObject2.toString();
            kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
            android.content.Intent a17 = com.tencent.mm.plugin.appbrand.ipc.e.a(context);
            android.content.Context context2 = lVar.getContext();
            com.tencent.mm.plugin.appbrand.jsapi.channels.OpenChannelsRewardedVideoAdRequest openChannelsRewardedVideoAdRequest = new com.tencent.mm.plugin.appbrand.jsapi.channels.OpenChannelsRewardedVideoAdRequest(jSONObject3);
            com.tencent.mm.plugin.appbrand.jsapi.channels.a0 a0Var = new com.tencent.mm.plugin.appbrand.jsapi.channels.a0(lVar, i17, this, jSONObject);
            java.util.Map map = com.tencent.mm.plugin.appbrand.ipc.d.f78400a;
            com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.W6(context2, com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.class, openChannelsRewardedVideoAdRequest, a0Var, a17);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiOpenChannelsRewardedVideoAd", "invoke, put fail since " + e17);
            lVar.a(i17, o("fail:internal error"));
        }
    }

    public final void C(org.json.JSONObject jSONObject, mq0.z zVar, java.util.Map map) {
        java.lang.String optString;
        java.lang.String str = "";
        if (jSONObject != null) {
            try {
                optString = jSONObject.optString("implType", "");
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MBADFullLinkReporter", "[MBAd] report full-link failed", e17);
                return;
            }
        } else {
            optString = null;
        }
        java.lang.String str2 = optString == null ? "" : optString;
        java.lang.String optString2 = jSONObject != null ? jSONObject.optString("bizName", "") : null;
        java.lang.String str3 = optString2 == null ? "" : optString2;
        java.lang.String optString3 = jSONObject != null ? jSONObject.optString("bizScene", "") : null;
        java.lang.String str4 = optString3 == null ? "" : optString3;
        java.lang.String optString4 = jSONObject != null ? jSONObject.optString("traceId", "") : null;
        java.lang.String str5 = optString4 == null ? "" : optString4;
        java.lang.String optString5 = jSONObject != null ? jSONObject.optString("frameSetName", "") : null;
        java.lang.String str6 = optString5 == null ? "" : optString5;
        jz5.l[] lVarArr = new jz5.l[2];
        lVarArr[0] = new jz5.l("apiName", NAME);
        java.lang.String optString6 = jSONObject != null ? jSONObject.optString("reportExtraInfo", "") : null;
        if (optString6 != null) {
            str = optString6;
        }
        lVarArr[1] = new jz5.l("uxinfo", str);
        java.util.Map l17 = kz5.c1.l(lVarArr);
        l17.putAll(map);
        mq0.c0 c0Var = (mq0.c0) i95.n0.c(mq0.c0.class);
        if (c0Var != null) {
            mq0.c0.ig(c0Var, zVar, str3, str4, str5, str6, str2, null, l17, 64, null);
        }
    }
}
