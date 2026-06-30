package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class p extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p f267951d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiCallFinderJsHandler", "callFinderJsHandler");
        java.lang.Object obj = msg.f422323a.get("businessType");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str == null) {
            str = "";
        }
        java.lang.Object obj2 = msg.f422323a.get("finderJumpId");
        java.lang.String str2 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
        if (str2 == null) {
            str2 = "";
        }
        java.lang.Object obj3 = msg.f422323a.get("commentScene");
        java.lang.String str3 = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
        if (str3 == null) {
            str3 = "";
        }
        java.lang.Object obj4 = msg.f422323a.get("status");
        java.lang.String str4 = obj4 instanceof java.lang.String ? (java.lang.String) obj4 : null;
        java.lang.String str5 = str4 != null ? str4 : "";
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("businessType", str);
            jSONObject.put("finderJumpId", str2);
            jSONObject.put("commentScene", str3);
            jSONObject.put("status", str5);
        } catch (org.json.JSONException unused) {
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiCallFinderJsHandler", "callFinderJsHandler json: " + jSONObject);
        java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a;
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(str6, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.C19434x50acbd74(jSONObject2), com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.m.class, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.o(env, msg));
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 480;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "callFinderJsHandler";
    }
}
