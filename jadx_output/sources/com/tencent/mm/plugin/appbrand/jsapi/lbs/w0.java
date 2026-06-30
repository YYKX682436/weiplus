package com.tencent.mm.plugin.appbrand.jsapi.lbs;

/* loaded from: classes7.dex */
public final class w0 implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.lbs.x0 f81509a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f81510b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f81511c;

    public w0(com.tencent.mm.plugin.appbrand.jsapi.lbs.x0 x0Var, com.tencent.mm.plugin.appbrand.e9 e9Var, int i17) {
        this.f81509a = x0Var;
        this.f81510b = e9Var;
        this.f81511c = i17;
    }

    @Override // nf.k
    public final boolean a(int i17, int i18, android.content.Intent intent) {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.appbrand.jsapi.lbs.x0 x0Var = this.f81509a;
        if (i17 != x0Var.f81513g) {
            return false;
        }
        int i19 = this.f81511c;
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f81510b;
        if (i18 != -1) {
            if (i18 != 0) {
                x0Var.getClass();
                str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
                str2 = str != null ? str : "";
                java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    jSONObject.put("errno", 4);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
                }
                e9Var.a(i19, x0Var.u(str2, jSONObject));
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiPrivateChoosePOI", "choose failed");
            } else {
                x0Var.getClass();
                java.lang.String str4 = android.text.TextUtils.isEmpty(null) ? "cancel" : null;
                str2 = str4 != null ? str4 : "";
                java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                try {
                    jSONObject2.put("errno", 1);
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
                }
                e9Var.a(i19, x0Var.u(str2, jSONObject2));
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiPrivateChoosePOI", "choose canceled");
            }
            return true;
        }
        if (intent == null) {
            x0Var.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str2 = str != null ? str : "";
            java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 4);
            } catch (java.lang.Exception e19) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
            }
            e9Var.a(i19, x0Var.u(str2, jSONObject3));
            return true;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        int intExtra = intent.getIntExtra("get_poi_data_type", 0);
        hashMap.put("type", java.lang.Integer.valueOf(intExtra));
        if (intExtra == 1) {
            java.lang.String stringExtra = intent.getStringExtra("get_city");
            if (stringExtra == null) {
                stringExtra = "";
            }
            hashMap.put("city", stringExtra);
            java.lang.String stringExtra2 = intent.getStringExtra("get_ad_code");
            hashMap.put("adcode", stringExtra2 != null ? stringExtra2 : "");
            hashMap.put("latitude", java.lang.Float.valueOf(intent.getFloatExtra("get_lat", -1.0f)));
            hashMap.put("longitude", java.lang.Float.valueOf(intent.getFloatExtra("get_lng", -1.0f)));
        } else if (intExtra == 2) {
            java.lang.String stringExtra3 = intent.getStringExtra("get_poi_name");
            if (stringExtra3 == null) {
                stringExtra3 = "";
            }
            hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, stringExtra3);
            java.lang.String stringExtra4 = intent.getStringExtra("get_poi_address");
            if (stringExtra4 == null) {
                stringExtra4 = "";
            }
            hashMap.put("address", stringExtra4);
            java.lang.String stringExtra5 = intent.getStringExtra("get_poi_classify_id");
            hashMap.put("poiid", stringExtra5 != null ? stringExtra5 : "");
            hashMap.put("latitude", java.lang.Float.valueOf(intent.getFloatExtra("get_lat", -1.0f)));
            hashMap.put("longitude", java.lang.Float.valueOf(intent.getFloatExtra("get_lng", -1.0f)));
        }
        x0Var.getClass();
        java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
        hashMap.put("errno", 0);
        e9Var.a(i19, x0Var.t("ok", hashMap));
        return true;
    }
}
