package com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi;

/* loaded from: classes7.dex */
public final class t extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 1501;
    public static final java.lang.String NAME = "openEcsGiftReceivePage";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        if (lVar == null) {
            int i18 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.e("MicroMsg.OpenEcsGiftReceivePage", "env is null", null);
            return;
        }
        java.lang.String optString = jSONObject != null ? jSONObject.optString("orderId") : null;
        if (!(optString == null || optString.length() == 0)) {
            android.content.Context context = lVar.getContext();
            com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi.JsApiOpenEcsGiftReceivePage$OpenEcsGiftReceivePageRequest jsApiOpenEcsGiftReceivePage$OpenEcsGiftReceivePageRequest = new com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi.JsApiOpenEcsGiftReceivePage$OpenEcsGiftReceivePageRequest(optString);
            com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi.s sVar = new com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi.s(lVar, i17, this);
            java.util.Map map = com.tencent.mm.plugin.appbrand.ipc.d.f78400a;
            com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.W6(context, com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.class, jsApiOpenEcsGiftReceivePage$OpenEcsGiftReceivePageRequest, sVar, null);
            return;
        }
        int i19 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.e("MicroMsg.OpenEcsGiftReceivePage", "order id invalid", null);
        java.lang.String str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("errno", 101);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        lVar.a(i17, u(str, jSONObject2));
    }
}
