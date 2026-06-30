package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29;

/* loaded from: classes8.dex */
public class r2 {
    public void a(android.content.Context context, org.json.JSONObject jSONObject) {
        if (context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15990xef42d2e4) {
            if (jSONObject.has("isShowTab")) {
                int optInt = jSONObject.optInt("isShowTab", -1);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteGameHomeTabService", "isShowTab:%d", java.lang.Integer.valueOf(optInt));
                if (optInt == 0) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15990xef42d2e4) context).runOnUiThread(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.k2(this, context));
                } else if (optInt == 1) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15990xef42d2e4) context).runOnUiThread(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.l2(this, context));
                }
            }
            if (jSONObject.has("isSwitchEnable")) {
                int optInt2 = jSONObject.optInt("isSwitchEnable", -1);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteGameHomeTabService", "isSwitchEnable:%d", java.lang.Integer.valueOf(optInt2));
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15990xef42d2e4) context).runOnUiThread(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.m2(this, optInt2, context));
            }
        }
    }

    public void b(android.content.Context context, org.json.JSONObject jSONObject) {
        java.lang.String optString = jSONObject.optString("left");
        java.lang.String optString2 = jSONObject.optString("right");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2)) {
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        try {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject(optString);
            java.lang.String e17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e9.e(jSONObject2.optString("wxcolor", ""));
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e17)) {
                e17 = jSONObject2.optString("color", "");
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e17)) {
                bundle.putString("set_navigation_bar_buttons_left_text_color", e17);
            }
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("LiteGameHomeTabService", e18, "setNavigationBarButtons opt left ", new java.lang.Object[0]);
        }
        try {
            org.json.JSONObject jSONObject3 = new org.json.JSONObject(optString2);
            boolean optBoolean = jSONObject3.optBoolean("hidden", false);
            java.lang.String optString3 = jSONObject3.optString(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24, "");
            java.lang.String k17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e9.k(jSONObject3.optString("iconData", ""));
            if (k17 == null) {
                k17 = "";
            }
            java.lang.String e19 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e9.e(jSONObject3.optString("wxcolor", ""));
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e19)) {
                e19 = jSONObject3.optString("color", "");
            }
            boolean optBoolean2 = jSONObject3.optBoolean("needClickEvent", false);
            if (optBoolean) {
                bundle.putBoolean("set_navigation_bar_buttons_hide_right_button", true);
            } else {
                bundle.putString("set_navigation_bar_buttons_text", optString3);
                bundle.putString("set_navigation_bar_buttons_icon_data", k17);
                bundle.putString("set_navigation_bar_buttons_text_color", e19);
                bundle.putBoolean("set_navigation_bar_buttons_need_click_event", optBoolean2);
            }
        } catch (java.lang.Exception e27) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("LiteGameHomeTabService", e27, "setNavigationBarButtons opt right ", new java.lang.Object[0]);
        }
        if (bundle.size() >= 0 && (context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15990xef42d2e4)) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15990xef42d2e4) context).runOnUiThread(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.q2(this, context, bundle));
        }
    }

    public void c(android.content.Context context, org.json.JSONObject jSONObject) {
        java.lang.String str;
        float f17;
        try {
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("wxcolor");
            str = optJSONObject != null ? com.p314xaae8f345.mm.ui.bk.C() ? optJSONObject.optString("dark") : optJSONObject.optString("light") : jSONObject.optString("color");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteGameHomeTabService", e17.getMessage());
            str = "";
        }
        java.lang.String str2 = str;
        try {
            f17 = (float) jSONObject.optDouble("alpha", -1.0d);
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteGameHomeTabService", e18.getMessage());
            f17 = -1.0f;
        }
        float f18 = f17;
        int optInt = jSONObject.optInt("iconDark", -1);
        if (context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15990xef42d2e4) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15990xef42d2e4) context).runOnUiThread(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.n2(this, context, str2, f18, optInt));
        }
    }

    public void d(android.content.Context context, org.json.JSONObject jSONObject) {
        if (context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15990xef42d2e4) {
            java.lang.String optString = jSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jSONObject.optString("color"))) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15990xef42d2e4) context).runOnUiThread(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p2(this, context, optString));
            } else {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15990xef42d2e4) context).runOnUiThread(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.o2(this, context, optString, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.a1.c(jSONObject.optString("color"), context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560120bl))));
            }
        }
    }
}
