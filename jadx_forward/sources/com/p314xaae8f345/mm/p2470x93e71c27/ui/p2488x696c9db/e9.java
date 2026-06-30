package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes8.dex */
public abstract class e9 extends com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.h9 {

    /* renamed from: a, reason: collision with root package name */
    public static com.p314xaae8f345.mm.sdk.p2603x2137b148.i6 f273141a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.regex.Pattern f273142b = java.util.regex.Pattern.compile("data:(image|img)/\\S+;base64,\\S+");

    /* renamed from: c, reason: collision with root package name */
    public static int f273143c = -1;

    /* renamed from: d, reason: collision with root package name */
    public static int f273144d = -1;

    public static java.lang.String b(android.content.Context context, java.lang.String str) {
        return ik1.l0.a(context, str, (ik1.k0) nd.f.a(ik1.k0.class));
    }

    public static final java.lang.String c(java.util.Map map) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (map != null) {
            for (java.lang.String str : map.keySet()) {
                java.lang.Object obj = map.get(str);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && obj != null && (!(obj instanceof java.lang.String) || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) obj))) {
                    if (sb6.length() > 0) {
                        sb6.append("&");
                    }
                    sb6.append(str);
                    sb6.append("=");
                    sb6.append(obj);
                }
            }
        }
        return sb6.toString();
    }

    public static final java.lang.String d(java.lang.String str, int i17) {
        byte[] bytes;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return str;
        }
        try {
            bytes = str.getBytes(com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
        } catch (java.io.UnsupportedEncodingException e17) {
            bytes = str.getBytes();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewUtil", "getBytes fail, throw : %s", e17.getMessage());
        }
        return android.util.Base64.encodeToString(bytes, i17);
    }

    public static java.lang.String e(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            return com.p314xaae8f345.mm.ui.bk.C() ? jSONObject.optString("dark") : jSONObject.optString("light");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewUtil", e17.getMessage());
            return null;
        }
    }

    public static void f(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.g9 g9Var) {
        if (f273141a == null) {
            f273141a = new com.p314xaae8f345.mm.sdk.p2603x2137b148.i6(1, "webview-save-image", 1);
        }
        f273141a.a(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.d9(context, str, str2, str3, z17, 1, g9Var, null));
    }

    public static void g(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.g9 g9Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f9 f9Var) {
        if (f273141a == null) {
            f273141a = new com.p314xaae8f345.mm.sdk.p2603x2137b148.i6(1, "webview-save-image", 1);
        }
        f273141a.a(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.d9(context, str, str2, str3, z17, 1, g9Var, f9Var));
    }

    public static void h(android.content.Context context, java.lang.String str, java.lang.String str2, boolean z17, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.g9 g9Var) {
        g(context, str, "", str2, z17, g9Var, null);
    }

    public static void i(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str, java.lang.String str2, boolean z17) {
        if (c27816xac2547f9 == null) {
            return;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.x8 x8Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.x8(c27816xac2547f9);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewUtil", "getJsResult fail, invalid argument, scheme = %s, jsCode = %s", str, str2);
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.w8(x8Var));
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.y8(z17, x8Var, str, str2));
        }
    }

    public static java.lang.String j() {
        android.net.NetworkInfo activeNetworkInfo;
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("connectivity");
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
            return "no";
        }
        if (activeNetworkInfo.getType() == 1) {
            return "WIFI";
        }
        activeNetworkInfo.getExtraInfo();
        activeNetworkInfo.getType();
        activeNetworkInfo.getExtraInfo();
        return activeNetworkInfo.getExtraInfo() != null ? activeNetworkInfo.getExtraInfo().toLowerCase() : "no";
    }

    public static java.lang.String k(java.lang.String str) {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && f273142b.matcher(str).matches()) {
            return str.substring(str.indexOf("base64,") + 7).trim();
        }
        return null;
    }

    public static boolean l() {
        int i17 = f273144d;
        if (i17 != -1) {
            return i17 == 1;
        }
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (z65.c.a() && 1 > com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016()) {
            return true;
        }
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_webview_mp_video_share_to_sns, 0);
        f273144d = Ni;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewUtil", "mpVideoShareToSns open=%d", java.lang.Integer.valueOf(Ni));
        return f273144d == 1;
    }

    public static void m(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f9 f9Var) {
        ((yb0.g) ((zb0.b0) i95.n0.c(zb0.b0.class))).Ni(context, new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.t8(context, str, str2, str3, z17, f9Var), new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.u8(context));
    }

    public static boolean n() {
        int i17 = f273143c;
        if (i17 != -1) {
            return i17 == 1;
        }
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_webview_pagecommit_update_random_str_v2, 1);
        f273143c = Ni;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewUtil", "updateRandomStr updateRandomStr=%d", java.lang.Integer.valueOf(Ni));
        return f273143c == 1;
    }
}
