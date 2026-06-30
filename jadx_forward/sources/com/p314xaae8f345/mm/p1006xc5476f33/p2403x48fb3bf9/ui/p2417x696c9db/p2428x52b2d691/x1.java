package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class x1 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.x1 f268182d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.x1();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetFinderRedDot", "JsApiGetFinderRedDot");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            java.lang.Object obj = msg.f422323a.get("businessType");
            if (obj != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetFinderRedDot", "businessType :" + obj);
                jSONObject.put("businessType", obj);
            }
            java.lang.Object obj2 = msg.f422323a.get("redDotPath");
            if (obj2 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetFinderRedDot", "redDotPath :" + obj2);
                jSONObject.put("redDotPath", obj2);
            }
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a;
            java.lang.String jSONObject2 = jSONObject.toString();
            if (jSONObject2 == null) {
                jSONObject2 = "";
            }
            com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(str, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.C19437xc8991dbd(jSONObject2), com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.v1.class, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.w1(env, msg));
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiGetFinderRedDot", e17, "handleMsg exception", new java.lang.Object[0]);
            return true;
        }
    }

    @Override // nw4.q2
    public int b() {
        return com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60881xdbee435;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "getFinderRedDot";
    }
}
