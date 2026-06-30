package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes.dex */
public final class h5 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f34342x366c91de = 763;

    /* renamed from: NAME */
    private static final java.lang.String f34343x24728b = "downloadPageDataForFastLoad";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        java.lang.String str2;
        org.json.JSONArray optJSONArray = jSONObject != null ? jSONObject.optJSONArray("itemList") : null;
        if (optJSONArray == null) {
            if (lVar != null) {
                lVar.a(i17, o(f34343x24728b + ":fail itemList invalid"));
                return;
            }
            return;
        }
        int length = optJSONArray.length();
        boolean z17 = false;
        for (int i18 = 0; i18 < length; i18++) {
            org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i18);
            if (optJSONObject == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiDownloadPageDataForFastLoad", "downloadPageDataForFastLoad invalid item index: " + i18);
            } else {
                java.lang.String optString = optJSONObject.optString("url");
                int optInt = optJSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, -1);
                int optInt2 = optJSONObject.optInt("item_show_type", -1);
                java.lang.String optString2 = optJSONObject.optString("brand_user_name");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiDownloadPageDataForFastLoad", "downloadPageDataForFastLoad itemShowType: " + optInt2 + ", openScene: " + optInt + ", url: %s", optString);
                ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).getClass();
                if (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t1.e(optInt)) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
                    if (optString.length() > 0) {
                        ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).c(optString, optInt2, optInt, optString2, new java.lang.Object[0]);
                        z17 = true;
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiDownloadPageDataForFastLoad", "downloadPageDataForFastLoad can not preload openScene: %d", java.lang.Integer.valueOf(optInt));
                }
            }
        }
        if (z17) {
            if (lVar != null) {
                str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
                str2 = str != null ? str : "";
                java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                try {
                    jSONObject2.put("errno", 0);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
                }
                lVar.a(i17, u(str2, jSONObject2));
                return;
            }
            return;
        }
        if (lVar != null) {
            str = android.text.TextUtils.isEmpty(null) ? "fail:invalid URL" : null;
            str2 = str != null ? str : "";
            java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 600009);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            lVar.a(i17, u(str2, jSONObject3));
        }
    }
}
