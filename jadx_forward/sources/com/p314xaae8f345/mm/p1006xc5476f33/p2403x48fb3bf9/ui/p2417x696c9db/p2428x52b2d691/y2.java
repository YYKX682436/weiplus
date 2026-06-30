package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class y2 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.y2 f268206d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.y2();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        java.lang.String str = (java.lang.String) msg.f422323a.get("action");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleMPPageAction", "handleAdAction action: %s", str);
        boolean z17 = str == null || str.length() == 0;
        nw4.g gVar = env.f422396d;
        if (z17) {
            gVar.e(msg.f422546c, msg.f422552i + ":fail action is empty", null);
            return true;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "report")) {
            return false;
        }
        java.lang.String str2 = (java.lang.String) msg.f422323a.get(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
        if (str2 == null || str2.length() == 0) {
            gVar.e(msg.f422546c, msg.f422552i + ":fail data is empty", null);
        } else {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str2);
            int D1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(jSONObject.optString("logid"), 0);
            java.lang.String optString = jSONObject.optString("logstr");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
            if (optString.length() > 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(D1, optString);
            }
            gVar.e(msg.f422546c, msg.f422552i + ":ok", null);
        }
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 367;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "handleAdAction";
    }
}
