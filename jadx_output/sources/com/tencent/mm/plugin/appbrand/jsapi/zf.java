package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public final class zf extends com.tencent.mm.plugin.appbrand.jsapi.v5 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v25, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r12v38, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.StringBuilder] */
    @Override // com.tencent.mm.plugin.appbrand.jsapi.a1
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public java.lang.String A(com.tencent.mm.plugin.appbrand.y env, org.json.JSONObject jSONObject, com.tencent.mm.plugin.appbrand.jsruntime.c0 c0Var) {
        org.json.JSONObject jSONObject2;
        com.tencent.luggage.sdk.config.AppBrandSysConfigLU appBrandSysConfigLU;
        java.lang.String str;
        java.lang.String str2;
        org.json.JSONObject jSONObject3;
        com.tencent.luggage.sdk.config.AppBrandSysConfigLU appBrandSysConfigLU2;
        ?? r122;
        kotlin.jvm.internal.o.g(env, "env");
        java.lang.String optString = jSONObject != null ? jSONObject.optString("experimentType") : null;
        if (!u46.l.c("opConfig", optString)) {
            if (!u46.l.c("globalExpt", optString)) {
                java.lang.String z17 = super.z(env, jSONObject);
                kotlin.jvm.internal.o.f(z17, "invoke(...)");
                return z17;
            }
            com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime = env.getRuntime();
            if (runtime == null || (appBrandSysConfigLU = (com.tencent.luggage.sdk.config.AppBrandSysConfigLU) runtime.p0(com.tencent.luggage.sdk.config.AppBrandSysConfigLU.class, false)) == null || (str = appBrandSysConfigLU.A.f47309o) == null) {
                jSONObject2 = new org.json.JSONObject();
            } else {
                try {
                    if (android.text.TextUtils.isEmpty(str)) {
                        jSONObject2 = new org.json.JSONObject();
                    } else {
                        jSONObject2 = new org.json.JSONObject(str);
                        com.tencent.mars.xlog.Log.i("MicroMsg.WAJsApiGetABTestConfig", "getGlobalExpt, sysConfig return " + jSONObject2);
                    }
                } catch (org.json.JSONException e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.WAJsApiGetABTestConfig", "getGlobalExpt, parse " + str + " from sysConfig get exception:" + e17);
                    jSONObject2 = null;
                }
            }
            if (jSONObject2 != null) {
                java.util.HashMap i17 = kz5.c1.i(new jz5.l("globalExpt", jSONObject2));
                java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                i17.put("errno", 0);
                java.lang.String t17 = t("ok", i17);
                kotlin.jvm.internal.o.d(t17);
                return t17;
            }
            r13 = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            if (r13 == null) {
                r13 = "";
            }
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
            try {
                jSONObject4.put("errno", 4);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            java.lang.String u17 = u(r13, jSONObject4);
            kotlin.jvm.internal.o.d(u17);
            return u17;
        }
        com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime2 = env.getRuntime();
        if (runtime2 == null || (appBrandSysConfigLU2 = (com.tencent.luggage.sdk.config.AppBrandSysConfigLU) runtime2.p0(com.tencent.luggage.sdk.config.AppBrandSysConfigLU.class, false)) == null || (r122 = appBrandSysConfigLU2.A.f47303f) == 0) {
            com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime3 = env.getRuntime();
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig u07 = runtime3 != null ? runtime3.u0() : null;
            com.tencent.luggage.sdk.config.AppBrandInitConfigLU appBrandInitConfigLU = u07 instanceof com.tencent.luggage.sdk.config.AppBrandInitConfigLU ? (com.tencent.luggage.sdk.config.AppBrandInitConfigLU) u07 : null;
            if (appBrandInitConfigLU == null || (str2 = appBrandInitConfigLU.R1) == null) {
                com.tencent.mm.plugin.appbrand.service.c0 c0Var2 = env instanceof com.tencent.mm.plugin.appbrand.service.c0 ? (com.tencent.mm.plugin.appbrand.service.c0) env : null;
                if (c0Var2 != null) {
                    r13 = c0Var2.U1();
                }
            } else {
                r13 = str2;
            }
            if (r13 == null || r13.length() == 0) {
                jSONObject3 = new org.json.JSONObject();
            } else {
                try {
                    ?? jSONObject5 = new org.json.JSONObject(r13);
                    com.tencent.mars.xlog.Log.i("MicroMsg.WAJsApiGetABTestConfig", "getOpConfig(" + env.getAppId() + "), initConfig return " + r13);
                    r13 = jSONObject5;
                } catch (org.json.JSONException e19) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.WAJsApiGetABTestConfig", "getOpConfig(" + env.getAppId() + "), parse " + r13 + " from initConfig get exception:" + e19);
                }
                org.json.JSONObject jSONObject6 = new org.json.JSONObject();
                jSONObject6.put("expt_info", r13);
                jSONObject3 = jSONObject6;
            }
        } else {
            try {
                org.json.JSONObject jSONObject7 = new org.json.JSONObject((java.lang.String) r122);
                com.tencent.mars.xlog.Log.i("MicroMsg.WAJsApiGetABTestConfig", "getOpConfig(" + env.getAppId() + "), sysConfig return " + jSONObject7);
                jSONObject3 = jSONObject7;
            } catch (org.json.JSONException e27) {
                if (!android.text.TextUtils.isEmpty(r122)) {
                    com.tencent.mm.autogen.mmdata.rpt.AppBrandLegacyBizStruct appBrandLegacyBizStruct = new com.tencent.mm.autogen.mmdata.rpt.AppBrandLegacyBizStruct();
                    appBrandLegacyBizStruct.p("opconfig|".concat(r122));
                    appBrandLegacyBizStruct.k();
                }
                com.tencent.mars.xlog.Log.e("MicroMsg.WAJsApiGetABTestConfig", "getOpConfig(" + env.getAppId() + "), parse " + r122 + " from sysConfig get exception:" + e27);
                jSONObject3 = r122;
            }
        }
        java.util.HashMap i18 = kz5.c1.i(new jz5.l("opConfig", jSONObject3));
        java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
        i18.put("errno", 0);
        java.lang.String t18 = t("ok", i18);
        kotlin.jvm.internal.o.d(t18);
        return t18;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.v5, com.tencent.mm.plugin.appbrand.jsapi.a1
    public java.lang.String z(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.appbrand.y service = (com.tencent.mm.plugin.appbrand.y) lVar;
        kotlin.jvm.internal.o.g(service, "service");
        return A(service, jSONObject, service.getF147808e());
    }
}
