package com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator;

/* loaded from: classes7.dex */
public final class z extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 1306;
    public static final java.lang.String NAME = "postMessageToReferrerMiniProgram";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject data, int i17) {
        java.lang.String str;
        int i18;
        jz5.f0 f0Var;
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime;
        jz5.f0 f0Var2;
        com.tencent.mm.plugin.appbrand.y env = (com.tencent.mm.plugin.appbrand.y) lVar;
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.Object opt = data.opt(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA);
        if (opt == null) {
            java.lang.String str2 = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
            java.lang.String str3 = str2 != null ? str2 : "";
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 101);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            env.a(i17, u(str3, jSONObject));
            return;
        }
        com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime = env.getRuntime();
        ze.n nVar = runtime instanceof ze.n ? (ze.n) runtime : null;
        if (nVar != null) {
            int i19 = nVar.u0().D.f77322d;
            f0Var = jz5.f0.f302826a;
            if (1 == i19) {
                try {
                    appBrandRuntime = nVar.B0();
                } catch (java.lang.IllegalAccessError unused) {
                    appBrandRuntime = nVar.f74804o;
                }
                if (appBrandRuntime != null) {
                    str = "";
                    i18 = 4;
                    appBrandRuntime.I1(new com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.y(appBrandRuntime, nVar, opt, env, i17, this));
                    f0Var2 = f0Var;
                } else {
                    str = "";
                    i18 = 4;
                    f0Var2 = null;
                }
                if (f0Var2 == null) {
                    java.lang.String str5 = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
                    if (str5 == null) {
                        str5 = str;
                    }
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    try {
                        jSONObject2.put("errno", i18);
                    } catch (java.lang.Exception e18) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
                    }
                    env.a(i17, u(str5, jSONObject2));
                    return;
                }
            } else {
                str = "";
                i18 = 4;
                java.lang.String str7 = android.text.TextUtils.isEmpty(null) ? "fail:require miniprogram navigation" : null;
                if (str7 == null) {
                    str7 = str;
                }
                java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                try {
                    jSONObject3.put("errno", 301004);
                } catch (java.lang.Exception e19) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
                }
                env.a(i17, u(str7, jSONObject3));
            }
        } else {
            str = "";
            i18 = 4;
            f0Var = null;
        }
        if (f0Var == null) {
            java.lang.String str9 = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            if (str9 == null) {
                str9 = str;
            }
            java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
            try {
                jSONObject4.put("errno", i18);
            } catch (java.lang.Exception e27) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e27);
            }
            env.a(i17, u(str9, jSONObject4));
        }
    }
}
