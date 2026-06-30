package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public final class c5 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 762;
    private static final java.lang.String NAME = "createWebViewForFastLoad";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.util.ArrayList arrayList;
        int optInt = jSONObject != null ? jSONObject.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE) : -1;
        org.json.JSONArray optJSONArray = jSONObject != null ? jSONObject.optJSONArray("itemShowTypes") : null;
        if (optJSONArray == null || optJSONArray.length() == 0) {
            arrayList = new java.util.ArrayList();
        } else {
            arrayList = new java.util.ArrayList(optJSONArray.length());
            int length = optJSONArray.length();
            for (int i18 = 0; i18 < length; i18++) {
                java.lang.Object obj = optJSONArray.get(i18);
                kotlin.jvm.internal.o.f(obj, "get(...)");
                arrayList.add(java.lang.Integer.valueOf(obj instanceof java.lang.Integer ? ((java.lang.Number) obj).intValue() : obj instanceof java.lang.String ? com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) obj, 0) : -1));
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : arrayList) {
            if (((java.lang.Number) obj2).intValue() != -1) {
                arrayList2.add(obj2);
            }
        }
        java.util.List V0 = kz5.n0.V0(arrayList2);
        java.util.ArrayList arrayList3 = (java.util.ArrayList) V0;
        if (arrayList3.isEmpty()) {
            arrayList3.add(0);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCreateWebViewForFastLoad", "createWebViewForFastLoad openScene: %d, itemShowTypeList: %s", java.lang.Integer.valueOf(optInt), V0);
        ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).w(optInt, V0);
        if (lVar != null) {
            java.lang.String str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 0);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            lVar.a(i17, u(str, jSONObject2));
        }
    }
}
