package com.tencent.mm.plugin.appbrand.jsapi.profile;

/* loaded from: classes7.dex */
public abstract class j extends com.tencent.mm.plugin.appbrand.jsapi.f {

    /* renamed from: g, reason: collision with root package name */
    public int f82809g = 3;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f82810h;

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        java.lang.String str2;
        ((mq0.s0) ((mq0.d0) i95.n0.c(mq0.d0.class))).wi(mq0.g0.f330564m);
        D(lVar, jSONObject, mq0.z.f330647u, "");
        if (lVar == null) {
            return;
        }
        android.content.Context context = lVar.getContext();
        if (context == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.OpenWeComUserProfile", "invoke, context is null");
            str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str2 = str != null ? str : "";
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 4);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            lVar.a(i17, u(str2, jSONObject2));
            return;
        }
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.OpenWeComUserProfile", "invoke, data is null");
            str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
            str2 = str != null ? str : "";
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 101);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            lVar.a(i17, u(str2, jSONObject3));
            return;
        }
        this.f82809g = jSONObject.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 3);
        this.f82810h = jSONObject.optString("bizInfo");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.OpenWeComUserProfile", "invoke, data: " + jSONObject);
        com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest C = C(lVar, jSONObject, i17);
        if (C == null) {
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.profile.i iVar = new com.tencent.mm.plugin.appbrand.jsapi.profile.i(this, lVar, i17, jSONObject);
        java.util.Map map = com.tencent.mm.plugin.appbrand.ipc.d.f78400a;
        com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.W6(context, com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.class, C, iVar, null);
    }

    public abstract com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest C(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17);

    public final void D(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, mq0.z zVar, java.lang.String str) {
        java.lang.String optString;
        if (jSONObject != null) {
            try {
                optString = jSONObject.optString("bizInfo", "");
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MBADFullLinkReporter", "[MBAd] report full-link failed", e17);
                return;
            }
        } else {
            optString = null;
        }
        if (optString == null) {
            optString = "";
        }
        java.lang.String optString2 = jSONObject != null ? jSONObject.optString("traceId", "") : null;
        java.lang.String str2 = optString2 == null ? "" : optString2;
        java.lang.String optString3 = jSONObject != null ? jSONObject.optString("frameSetName", "") : null;
        java.lang.String str3 = optString3 == null ? "" : optString3;
        java.lang.String optString4 = jSONObject != null ? jSONObject.optString("implType", "") : null;
        java.lang.String str4 = optString4 == null ? "" : optString4;
        java.lang.String optString5 = jSONObject != null ? jSONObject.optString("bizName", "") : null;
        java.lang.String str5 = optString5 == null ? "" : optString5;
        java.lang.String optString6 = jSONObject != null ? jSONObject.optString("bizScene", "") : null;
        java.lang.String str6 = optString6 == null ? "" : optString6;
        mq0.c0 c0Var = (mq0.c0) i95.n0.c(mq0.c0.class);
        if (c0Var == null) {
            return;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("apiName", "openWeComUserProfile");
        boolean z17 = true;
        if (optString.length() > 0) {
            linkedHashMap.put("uxinfo", optString);
        }
        if (str.length() <= 0) {
            z17 = false;
        }
        if (z17) {
            linkedHashMap.put("errMsg", str);
        }
        mq0.c0.ig(c0Var, zVar, str5, str6, str2, str3, str4, null, linkedHashMap, 64, null);
    }
}
