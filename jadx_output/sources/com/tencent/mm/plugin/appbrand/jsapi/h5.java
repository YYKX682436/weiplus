package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public final class h5 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 763;
    private static final java.lang.String NAME = "downloadPageDataForFastLoad";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        java.lang.String str2;
        org.json.JSONArray optJSONArray = jSONObject != null ? jSONObject.optJSONArray("itemList") : null;
        if (optJSONArray == null) {
            if (lVar != null) {
                lVar.a(i17, o(NAME + ":fail itemList invalid"));
                return;
            }
            return;
        }
        int length = optJSONArray.length();
        boolean z17 = false;
        for (int i18 = 0; i18 < length; i18++) {
            org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i18);
            if (optJSONObject == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiDownloadPageDataForFastLoad", "downloadPageDataForFastLoad invalid item index: " + i18);
            } else {
                java.lang.String optString = optJSONObject.optString("url");
                int optInt = optJSONObject.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, -1);
                int optInt2 = optJSONObject.optInt("item_show_type", -1);
                java.lang.String optString2 = optJSONObject.optString("brand_user_name");
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiDownloadPageDataForFastLoad", "downloadPageDataForFastLoad itemShowType: " + optInt2 + ", openScene: " + optInt + ", url: %s", optString);
                ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).getClass();
                if (com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1.e(optInt)) {
                    kotlin.jvm.internal.o.d(optString);
                    if (optString.length() > 0) {
                        ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).c(optString, optInt2, optInt, optString2, new java.lang.Object[0]);
                        z17 = true;
                    }
                } else {
                    com.tencent.mars.xlog.Log.w("MicroMsg.JsApiDownloadPageDataForFastLoad", "downloadPageDataForFastLoad can not preload openScene: %d", java.lang.Integer.valueOf(optInt));
                }
            }
        }
        if (z17) {
            if (lVar != null) {
                str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
                str2 = str != null ? str : "";
                java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                try {
                    jSONObject2.put("errno", 0);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
                }
                lVar.a(i17, u(str2, jSONObject2));
                return;
            }
            return;
        }
        if (lVar != null) {
            str = android.text.TextUtils.isEmpty(null) ? "fail:invalid URL" : null;
            str2 = str != null ? str : "";
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 600009);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            lVar.a(i17, u(str2, jSONObject3));
        }
    }
}
