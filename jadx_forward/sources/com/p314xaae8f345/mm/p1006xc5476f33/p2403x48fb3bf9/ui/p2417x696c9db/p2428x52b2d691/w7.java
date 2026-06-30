package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class w7 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.w7 f268139d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.w7();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenFinderSearchView", "openFinderSearchView");
        java.lang.String str = (java.lang.String) msg.f422323a.get("allSearchWord");
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = (java.lang.String) msg.f422323a.get("selectIndex");
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str3 = (java.lang.String) msg.f422323a.get(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811);
        if (str3 == null) {
            str3 = "";
        }
        java.lang.String str4 = (java.lang.String) msg.f422323a.get("reportInfo");
        java.lang.String str5 = str4 != null ? str4 : "";
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("allSearchWord", new org.json.JSONArray(str));
            jSONObject.put("selectIndex", str2);
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, str3);
            jSONObject.put("reportInfo", str5);
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenFinderSearchView", "openFinderPostView json: " + jSONObject);
        java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a;
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(str6, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.C19448x629d8d62(jSONObject2), com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.t7.class, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.v7(env, msg));
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60877x93282336;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "openFinderSearchView";
    }
}
