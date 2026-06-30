package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public final class rb extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 1568;
    private static final java.lang.String NAME = "privateGetProfileConfig";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject data, int i17) {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) lVar;
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiPrivateGetProfileConfig", "invoke ", data);
        if (c0Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiPrivateGetProfileConfig", "privateGetProfileConfig fail, env is null");
            return;
        }
        java.lang.String optString = data.optString(dm.i4.COL_USERNAME);
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiPrivateGetProfileConfig", "privateGetProfileConfig fail, username is empty");
            str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
            str2 = str != null ? str : "";
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 101);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            c0Var.a(i17, u(str2, jSONObject));
            return;
        }
        if (com.tencent.mm.storage.z3.z3(optString)) {
            com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.x2.f193072b, new com.tencent.mm.plugin.appbrand.jsapi.JsApiPrivateGetProfileConfig$MsgQueryTaskParam(optString), com.tencent.mm.plugin.appbrand.jsapi.pb.class, new com.tencent.mm.plugin.appbrand.jsapi.qb(c0Var, i17, this));
            return;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.JsApiPrivateGetProfileConfig", "privateGetProfileConfig fail, is not AppBrandContact");
        str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
        str2 = str != null ? str : "";
        java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("errno", 101);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
        }
        c0Var.a(i17, u(str2, jSONObject2));
    }
}
