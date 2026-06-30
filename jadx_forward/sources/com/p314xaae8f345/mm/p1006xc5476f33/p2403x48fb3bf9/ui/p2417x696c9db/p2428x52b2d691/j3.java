package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class j3 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.j3 f267802d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.j3();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        org.json.JSONObject jSONObject = msg.f422547d;
        if (jSONObject != null) {
            jSONObject.put("url", msg.f422323a.get("url"));
            ((b00.m2) ((c00.r3) i95.n0.c(c00.r3.class))).Bi(2, env.f422393a, jSONObject, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.i3(env, msg), null);
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiHandleEcsAction", "handleMsg rawParams null");
        env.f422396d.e(msg.f422546c, msg.f422552i + ":fail rawParams is empty", null);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return uc1.x1.f76938x366c91de;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ecs.p1085x60b7c31.m.f34130x24728b;
    }

    public final java.util.Map e(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return kz5.q0.f395534d;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator<java.lang.String> keys = jSONObject.keys();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keys, "keys(...)");
        while (keys.hasNext()) {
            java.lang.String next = keys.next();
            java.lang.Object obj = jSONObject.get(next);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(next);
            if (obj instanceof org.json.JSONObject) {
                obj = e((org.json.JSONObject) obj);
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
            linkedHashMap.put(next, obj);
        }
        return linkedHashMap;
    }
}
