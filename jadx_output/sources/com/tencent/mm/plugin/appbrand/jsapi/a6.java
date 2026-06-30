package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public final class a6 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 927;
    public static final java.lang.String NAME = "getAppContact";

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        k91.v5 b17;
        com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaDynamicInfo$Setting wxaAttributes$WxaDynamicInfo$Setting;
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        if (e9Var == null || jSONObject == null) {
            return;
        }
        java.lang.String optString = jSONObject.optString(dm.i4.COL_USERNAME);
        java.lang.String optString2 = jSONObject.optString("appid");
        if (!com.eclipsesource.mmv8.snapshot.Utils.isNullOrEmpty(optString) || !com.eclipsesource.mmv8.snapshot.Utils.isNullOrEmpty(optString2)) {
            if (com.eclipsesource.mmv8.snapshot.Utils.isNullOrEmpty(optString)) {
                b17 = k91.w5.f305813b.b(optString2, new java.lang.String[0]);
            } else {
                k91.w5 w5Var = k91.w5.f305813b;
                w5Var.getClass();
                b17 = w5Var.c(null, java.lang.String.format("%s=?", dm.i4.COL_USERNAME), new java.lang.String[]{optString});
            }
            k91.v5 v5Var = b17;
            java.util.HashMap hashMap = new java.util.HashMap();
            if (v5Var != null) {
                java.util.HashMap hashMap2 = new java.util.HashMap();
                hashMap2.put("nickName", v5Var.field_nickname);
                hashMap2.put("iconUrl", v5Var.field_brandIconURL);
                hashMap2.put("appId", v5Var.field_appId);
                hashMap2.put(dm.i4.COL_USERNAME, v5Var.field_username);
                com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaVersionInfo w07 = v5Var.w0();
                hashMap2.put("weappVersion", w07 != null ? java.lang.Integer.valueOf(w07.f77444d) : null);
                hashMap2.put("signature", v5Var.field_signature);
                hashMap2.put("debugMode", java.lang.Integer.valueOf(e9Var.getRuntime().u0().f77281g));
                k91.j5 u07 = v5Var.u0();
                k91.o5 v07 = v5Var.v0();
                java.util.HashMap hashMap3 = new java.util.HashMap();
                hashMap3.put("originalRedirectUrl", u07 != null ? u07.f305640o : null);
                hashMap3.put("appServiceType", u07 != null ? java.lang.Integer.valueOf(u07.f305629d) : null);
                hashMap3.put("originalFlag", u07 != null ? java.lang.Integer.valueOf(u07.f305639n) : null);
                hashMap3.put("brandOfficialFlag", (v07 == null || (wxaAttributes$WxaDynamicInfo$Setting = v07.f305706a) == null) ? null : java.lang.Integer.valueOf(wxaAttributes$WxaDynamicInfo$Setting.H));
                hashMap3.put("relievedBuyFlag", u07 != null ? java.lang.Integer.valueOf(u07.f305642q) : null);
                hashMap3.put("flagshipFlag", u07 != null ? java.lang.Integer.valueOf(u07.f305643r) : null);
                try {
                    hashMap3.put("gameIconFlagList", new org.json.JSONArray(u07 != null ? u07.f305641p : null));
                } catch (org.json.JSONException e17) {
                    com.tencent.mars.xlog.Log.e("JsApiGetAppContact", "gameIconFlagList Failed to parse JSON: " + e17.getMessage());
                }
                hashMap3.put("tagsInfo", c75.c.a(k91.n3.f305692a));
                hashMap2.put("appBrandInfo", hashMap3);
                com.tencent.mars.xlog.Log.i("JsApiGetAppContact", "get contact from profile, nickName=%s, iconUrl=%s, appId=%s, username=%s, weappVersion=%s, signature=%s, debugMode=%d", v5Var.field_nickname, v5Var.field_brandIconURL, v5Var.field_appId, v5Var.field_username, v5Var.field_versionInfo, v5Var.field_signature, java.lang.Integer.valueOf(e9Var.getRuntime().u0().f77281g));
                r8 = hashMap2;
            }
            hashMap.put(com.tencent.mm.plugin.lite.LiteAppCenter.FRAMEWORK_TYPE_BASE, r8);
            e9Var.a(i17, p("ok", hashMap));
            return;
        }
        java.lang.String optString3 = jSONObject.optString("keyPath");
        com.tencent.mars.xlog.Log.i("JsApiGetAppContact", "keyPath=" + optString3);
        k91.v5 b18 = k91.w5.f305813b.b(e9Var.getAppId(), new java.lang.String[0]);
        if (b18 != null) {
            kotlin.jvm.internal.o.d(optString3);
            java.util.List f07 = r26.n0.f0(optString3, new java.lang.String[]{"."}, false, 0, 6, null);
            try {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject(b18.z0());
                java.util.Iterator it = f07.iterator();
                java.lang.String str = null;
                while (true) {
                    if (!it.hasNext()) {
                        r8 = str;
                        break;
                    }
                    java.lang.String str2 = (java.lang.String) it.next();
                    if (jSONObject2 == null) {
                        break;
                    }
                    if (jSONObject2.has(str2)) {
                        java.lang.Object opt = jSONObject2.opt(str2);
                        str = opt;
                        if (opt == 0) {
                            str = "";
                        }
                    } else {
                        str = null;
                    }
                    jSONObject2 = str instanceof org.json.JSONObject ? (org.json.JSONObject) str : null;
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append("next=");
                sb6.append(r8 == null ? "is null" : java.lang.String.valueOf(r8));
                com.tencent.mars.xlog.Log.i("JsApiGetAppContact", sb6.toString());
                if (r8 == null) {
                    e9Var.a(i17, o("fail: keyPath not found"));
                    return;
                }
                java.util.HashMap hashMap4 = new java.util.HashMap();
                hashMap4.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, r8);
                e9Var.a(i17, p("ok", hashMap4));
            } catch (org.json.JSONException e18) {
                com.tencent.mars.xlog.Log.e("JsApiGetAppContact", e18.getMessage());
                e9Var.a(i17, o("fail:internal error"));
            }
        }
    }
}
