package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public final class v1 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 1538;
    private static final java.lang.String NAME = "getMenuControlBytes";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.o6 runtime;
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) lVar;
        com.tencent.mm.plugin.appbrand.page.n7 V0 = c0Var != null ? c0Var.V0() : null;
        com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC E0 = (V0 == null || (runtime = V0.getRuntime()) == null) ? null : runtime.E0();
        byte[] bArr = E0 != null ? E0.f77342y1 : null;
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        if (bArr != null) {
            for (byte b17 : bArr) {
                jSONArray.put(b17 & 255);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JSApiGetMenuControlBytes", "getMenuControlBytes: " + jSONArray);
        if (c0Var != null) {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("controlBytes", jSONArray);
            java.lang.String str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            try {
                jSONObject2.put("errno", 0);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            c0Var.a(i17, u(str, jSONObject2));
        }
    }
}
