package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class gc extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.gc f267739d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.gc();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        java.lang.String str = (java.lang.String) msg.f422323a.get("left");
        java.lang.String str2 = (java.lang.String) msg.f422323a.get("right");
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
        nw4.g gVar = env.f422396d;
        if (K0 && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            gVar.e(msg.f422546c, "setNavigationBarButtons:fail", null);
        } else {
            android.os.Bundle bundle = new android.os.Bundle();
            if (str != null) {
                try {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiSetNavigationBarButtons", "parsing left");
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                    org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                    java.lang.String e17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e9.e(jSONObject.optString("wxcolor", ""));
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e17)) {
                        e17 = jSONObject.optString("color", "");
                    }
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e17)) {
                        bundle.putString("set_navigation_bar_buttons_left_text_color", e17);
                    }
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiSetNavigationBarButtons", e18, "setNavigationBarButtons opt left ", new java.lang.Object[0]);
                }
            }
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiSetNavigationBarButtons", "parsing right");
                java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                org.json.JSONObject jSONObject2 = new org.json.JSONObject(str2);
                boolean optBoolean = jSONObject2.optBoolean("hidden", false);
                boolean optBoolean2 = jSONObject2.optBoolean("forceHiddenSearchIcon", false);
                java.lang.String optString = jSONObject2.optString(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24, "");
                java.lang.String k17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e9.k(jSONObject2.optString("iconData", ""));
                if (k17 == null) {
                    k17 = "";
                }
                java.lang.String e19 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e9.e(jSONObject2.optString("wxcolor", ""));
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e19)) {
                    e19 = jSONObject2.optString("color", "");
                }
                boolean optBoolean3 = jSONObject2.optBoolean("needClickEvent", false);
                if (optBoolean) {
                    bundle.putBoolean("set_navigation_bar_buttons_hide_right_button", true);
                } else {
                    bundle.putString("set_navigation_bar_buttons_text", optString);
                    bundle.putString("set_navigation_bar_buttons_icon_data", k17);
                    bundle.putString("set_navigation_bar_buttons_text_color", e19);
                    bundle.putBoolean("set_navigation_bar_buttons_need_click_event", optBoolean3);
                }
                bundle.putBoolean("set_navigation_bar_buttons_force_hide_right_search_icon", optBoolean2);
                bundle.putBoolean("set_navigation_bar_right_style", true);
            } catch (java.lang.Exception e27) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiSetNavigationBarButtons", e27, "setNavigationBarButtons opt right ", new java.lang.Object[0]);
            }
            if (bundle.size() < 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiSetNavigationBarButtons", "params size = 0");
                gVar.e(msg.f422546c, "setNavigationBarButtons:fail_invalid_params", null);
            } else {
                try {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0 b17 = env.b();
                    if (b17 != null) {
                        b17.i(44, bundle);
                    }
                    gVar.e(msg.f422546c, "setNavigationBarButtons:ok", null);
                } catch (java.lang.Exception e28) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiSetNavigationBarButtons", e28, "setNavigationBarButtons invoke ", new java.lang.Object[0]);
                    gVar.e(msg.f422546c, "setNavigationBarButtons:fail_invoke", null);
                }
            }
        }
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 195;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "setNavigationBarButtons";
    }
}
