package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class za extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.za f268245d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.za();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.ya yaVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.ya(env);
        int i17 = ax4.f.f96660a;
        ax4.a.a(70);
        java.lang.String str = (java.lang.String) msg.f422323a.get("key_request_full_url_query");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            str = java.lang.String.format("&wx_header=1&pass_ticket=%s", str);
        }
        java.lang.String str2 = msg.f422323a.get("url") + str;
        java.lang.String str3 = (java.lang.String) msg.f422323a.get(ya.b.f77491x8758c4e1);
        if (str3 == null) {
            str3 = "GET";
        }
        java.lang.String str4 = str3;
        java.lang.String str5 = (java.lang.String) msg.f422323a.get("header");
        if (str5 == null) {
            str5 = "";
        }
        java.lang.String str6 = (java.lang.String) msg.f422323a.get(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TmplWebViewJsAPi", "[doRequest]url:%s", str2);
        java.lang.String str7 = (java.lang.String) msg.f422323a.get("key_request_header");
        if (str7 == null) {
            str7 = "";
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        try {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str7)) {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str7);
                java.util.Iterator<java.lang.String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    hashMap.put(next, jSONObject.optString(next));
                }
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5)) {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject(str5);
                java.util.Iterator<java.lang.String> keys2 = jSONObject2.keys();
                while (keys2.hasNext()) {
                    java.lang.String next2 = keys2.next();
                    hashMap.put(next2, jSONObject2.optString(next2));
                }
            }
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.TmplWebViewJsAPi", "", e17);
        }
        dw4.a.a(new ax4.d(str4, str2, hashMap, str6, yaVar, msg));
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 331;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "request";
    }
}
