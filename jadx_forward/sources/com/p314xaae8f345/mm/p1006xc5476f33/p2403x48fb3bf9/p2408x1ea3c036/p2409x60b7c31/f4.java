package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31;

/* loaded from: classes.dex */
public class f4 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return "setNavigationBarButtons";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public int c() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void d(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void e(sd.b bVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiSetNavigationBarButtons", "invokeInOwn");
        java.lang.String optString = bVar.f488130b.f426039c.optString("left");
        java.lang.String optString2 = bVar.f488130b.f426039c.optString("right");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2)) {
            bVar.c("fail", null);
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        if (optString != null) {
            try {
                if (!optString.isEmpty()) {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(optString);
                    java.lang.String e17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e9.e(jSONObject.optString("wxcolor", ""));
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e17)) {
                        e17 = jSONObject.optString("color", "");
                    }
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e17)) {
                        bundle.putString("set_navigation_bar_buttons_left_text_color", e17);
                    }
                }
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiSetNavigationBarButtons", e18, "setNavigationBarButtons opt left ", new java.lang.Object[0]);
            }
        }
        if (optString2 != null) {
            try {
                if (!optString2.isEmpty()) {
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject(optString2);
                    boolean optBoolean = jSONObject2.optBoolean("hidden", false);
                    java.lang.String optString3 = jSONObject2.optString(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24, "");
                    java.lang.String k17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e9.k(jSONObject2.optString("iconData", ""));
                    if (k17 == null) {
                        k17 = "";
                    }
                    java.lang.String e19 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e9.e(jSONObject2.optString("wxcolor", ""));
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e19)) {
                        e19 = jSONObject2.optString("color", "");
                    }
                    boolean optBoolean2 = jSONObject2.optBoolean("needClickEvent", false);
                    if (optBoolean) {
                        bundle.putBoolean("set_navigation_bar_buttons_hide_right_button", true);
                    } else {
                        bundle.putString("set_navigation_bar_buttons_text", optString3);
                        bundle.putString("set_navigation_bar_buttons_icon_data", k17);
                        bundle.putString("set_navigation_bar_buttons_text_color", e19);
                        bundle.putBoolean("set_navigation_bar_buttons_need_click_event", optBoolean2);
                    }
                }
            } catch (java.lang.Exception e27) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiSetNavigationBarButtons", e27, "setNavigationBarButtons opt right ", new java.lang.Object[0]);
            }
        }
        if (bundle.size() < 0) {
            bVar.c("fail", null);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.y1 y1Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0) bVar.f488129a).f263719t;
        if (y1Var == null) {
            bVar.c("fail", null);
        } else {
            y1Var.m74261x753cf8a4(bundle);
            bVar.a();
        }
    }
}
