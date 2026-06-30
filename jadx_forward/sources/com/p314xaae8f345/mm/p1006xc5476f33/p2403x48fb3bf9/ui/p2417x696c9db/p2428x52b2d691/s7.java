package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class s7 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.s7 f268053d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.s7();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenFinderPostView", "openFinderPostView");
        java.lang.String str = (java.lang.String) msg.f422323a.get("jumpInfo");
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = (java.lang.String) msg.f422323a.get("postInfo");
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str3 = (java.lang.String) msg.f422323a.get("callBackKey");
        if (str3 == null) {
            str3 = "";
        }
        java.lang.String str4 = (java.lang.String) msg.f422323a.get("optionalInfo");
        java.lang.String str5 = str4 != null ? str4 : "";
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("jumpInfo", new org.json.JSONObject(str));
        } catch (java.lang.Throwable unused) {
        }
        try {
            jSONObject.put("postInfo", new org.json.JSONObject(str2));
        } catch (java.lang.Throwable unused2) {
        }
        try {
            jSONObject.put("callBackKey", str3);
        } catch (java.lang.Throwable unused3) {
        }
        try {
            jSONObject.put("optionalInfo", new org.json.JSONObject(str5));
        } catch (java.lang.Throwable unused4) {
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenFinderPostView", "openFinderPostView jumpInfo: " + ((java.lang.String) msg.f422323a.get("jumpInfo")) + ", postInfo: " + ((java.lang.String) msg.f422323a.get("postInfo")));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("openFinderPostView json: ");
        sb6.append(jSONObject);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenFinderPostView", sb6.toString());
        java.lang.String str6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a;
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(str6, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.C19447x856f9e2(jSONObject2), com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p7.class, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.r7(env, msg));
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60852x9b1ed3e8;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "openFinderPostView";
    }
}
