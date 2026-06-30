package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public final class g8 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = -2;
    public static final java.lang.String NAME = "notifyDirectGameStabMask";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.y yVar = (com.tencent.mm.plugin.appbrand.y) lVar;
        com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime = yVar != null ? yVar.getRuntime() : null;
        if (runtime != null && runtime.M0() && (runtime instanceof com.tencent.mm.plugin.appbrand.o6)) {
            ((com.tencent.mm.plugin.appbrand.o6) runtime).m(new com.tencent.mm.plugin.appbrand.jsapi.f8(runtime, yVar, i17, this));
            return;
        }
        if (yVar != null) {
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
            yVar.a(i17, u(str, jSONObject2));
        }
    }
}
