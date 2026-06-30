package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class c7 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.c7 f267544d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.c7();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenFinderLiveGetTicket", "karlfeng openFinderLiveGetTicket");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.lang.Object obj = msg.f422323a.get("noticeId");
        if (obj != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenFinderLiveGetTicket", "noticeId: " + obj);
            jSONObject.put("noticeId", obj);
        }
        java.lang.Object obj2 = msg.f422323a.get("appId");
        if (obj2 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenFinderLiveGetTicket", "appId: " + obj2);
            jSONObject.put("appId", obj2);
        }
        java.lang.Object obj3 = msg.f422323a.get("wxData");
        if (obj3 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenFinderLiveGetTicket", "wxData: " + obj3);
            jSONObject.put("wxData", obj3);
        }
        java.lang.Object obj4 = msg.f422323a.get("preferEnterLive");
        if (obj4 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenFinderLiveGetTicket", "preferEnterLive: " + obj4);
            jSONObject.put("preferEnterLive", obj4);
        }
        java.lang.Object obj5 = msg.f422323a.get("noticeBusinessDic");
        if (obj5 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenFinderLiveGetTicket", "noticeBusinessDic: " + obj5);
            jSONObject.put("noticeBusinessDic", obj5);
        }
        java.lang.Object obj6 = msg.f422323a.get(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811);
        if (obj6 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenFinderLiveGetTicket", "scene: " + obj6);
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, obj6);
        }
        java.lang.String optString = jSONObject.optString("noticeId");
        if (optString == null || optString.length() == 0) {
            env.f422396d.e(msg.f422546c, msg.f422552i + ":noticeId is empty", kz5.b1.e(new jz5.l("err_msg", "noticeId is empty")));
        }
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a;
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(str, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.C19444xc3c2db86(jSONObject2), com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.z6.class, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.b7(env, msg));
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 453;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "reserveChannelsLive";
    }
}
