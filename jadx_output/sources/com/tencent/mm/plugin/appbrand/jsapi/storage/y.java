package com.tencent.mm.plugin.appbrand.jsapi.storage;

/* loaded from: classes7.dex */
public final class y extends com.tencent.mm.plugin.appbrand.jsapi.f {

    @java.lang.Deprecated
    public static final int CTRL_INDEX = -2;

    @java.lang.Deprecated
    public static final java.lang.String NAME = "private_getBackgroundFetchData";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        int[] iArr;
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) lVar;
        if (c0Var == null) {
            return;
        }
        if (jSONObject == null) {
            str = android.text.TextUtils.isEmpty(null) ? "fail:empty request" : null;
            str2 = str != null ? str : "";
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 1002);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            c0Var.a(i17, u(str2, jSONObject2));
            return;
        }
        int optInt = jSONObject.optInt("fetchType", -1);
        com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC E0 = c0Var.t3().E0();
        byte[] bArr = E0.M;
        if ((bArr != null && kz5.z.D(bArr, (byte) optInt)) || ((iArr = E0.N) != null && kz5.z.F(iArr, optInt))) {
            ((ku5.t0) ku5.t0.f312615d).q(new com.tencent.mm.plugin.appbrand.jsapi.storage.x(c0Var, optInt, i17, this));
            return;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.JsApiPrivateGetBackgroundFetchData", "no matched type. prefetchType=" + optInt);
        str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
        str2 = str != null ? str : "";
        java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        try {
            jSONObject3.put("errno", 101);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
        }
        c0Var.a(i17, u(str2, jSONObject3));
    }
}
