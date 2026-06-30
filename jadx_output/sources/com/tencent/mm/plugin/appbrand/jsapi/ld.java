package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public final class ld extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 1373;
    public static final java.lang.String NAME = "showGuideDialogAfterClose";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) lVar;
        if (c0Var == null || jSONObject == null) {
            return;
        }
        int optInt = jSONObject.optInt("type", -1);
        if (optInt >= 0) {
            com.tencent.mm.plugin.appbrand.s0 s0Var = com.tencent.mm.plugin.appbrand.s0.f88438a;
            if (optInt < ((java.util.List) ((jz5.n) com.tencent.mm.plugin.appbrand.s0.f88439b).getValue()).size()) {
                java.lang.String appId = c0Var.getAppId();
                kotlin.jvm.internal.o.f(appId, "getAppId(...)");
                s0Var.a(appId, optInt, 1);
                java.lang.String str = c0Var.getAppId() + "_need_show_#" + optInt + "_guide_dialog";
                com.tencent.mm.plugin.appbrand.app.q0 q0Var = com.tencent.mm.plugin.appbrand.app.q0.f75227a;
                com.tencent.mm.sdk.platformtools.o4 a17 = q0Var.a();
                if (a17 != null && a17.getBoolean(str, true)) {
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.w9.f193053a;
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putString("key_appid", c0Var.getAppId());
                    bundle.putInt("key_type", optInt);
                    bundle.putString("key_app_icon", c0Var.t3().E0().f305843f);
                    com.tencent.mm.ipcinvoker.extension.l.a(str2, bundle, com.tencent.mm.plugin.appbrand.jsapi.jd.class, new com.tencent.mm.plugin.appbrand.jsapi.kd(c0Var, i17, this));
                    com.tencent.mm.sdk.platformtools.o4 a18 = q0Var.a();
                    if (a18 != null) {
                        a18.putBoolean(str, false);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShowGuideDialogAfterClose", "illegal params");
        java.lang.String str3 = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
        if (str3 == null) {
            str3 = "";
        }
        java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("errno", 101);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        c0Var.a(i17, u(str3, jSONObject2));
    }
}
