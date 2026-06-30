package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public final class u9 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 1502;
    private static final java.lang.String NAME = "openOfficialAccountChat";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject data, int i17) {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) lVar;
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenOfficialAccountChat", "invoke ", data);
        if (c0Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiOpenOfficialAccountChat", "openOfficialAccountChat fail, env is null");
            return;
        }
        java.lang.String optString = data.optString(dm.i4.COL_USERNAME);
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiOpenOfficialAccountChat", "openOfficialAccountChat fail, username is empty");
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
        if (((ox.g) ((tk.o) i95.n0.c(tk.o.class))).Ui() || !com.tencent.mm.storage.z3.F3(optString)) {
            com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCString(optString), com.tencent.mm.plugin.appbrand.jsapi.s9.class, new com.tencent.mm.plugin.appbrand.jsapi.t9(c0Var, i17, this, optString));
            return;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.JsApiOpenOfficialAccountChat", "openOfficialAccountChat fail, is photo account");
        com.tencent.mm.plugin.appbrand.jsapi.profile.b.a(c0Var.getF147807d(), com.tencent.mm.R.string.n7b);
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
