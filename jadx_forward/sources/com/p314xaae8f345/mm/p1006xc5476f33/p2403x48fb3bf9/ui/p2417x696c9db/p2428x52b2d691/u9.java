package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class u9 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.u9 f268093d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.u9();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        ((ly4.f) ((wc0.e) i95.n0.c(wc0.e.class))).getClass();
        ly4.e eVar = new ly4.e();
        eVar.f403823m = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.s9(env, msg);
        eVar.f403824n = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.t9(env, msg);
        java.util.Map map = msg.f422323a;
        if (map == null) {
            return true;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kz5.b1.d(map.size()));
        for (java.util.Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), entry.getValue().toString());
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject(linkedHashMap);
        xc0.a aVar = new xc0.a();
        aVar.m75931xb5cb93b2(jSONObject);
        eVar.k(env.f422393a, aVar);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 545;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "sendPcRemindMsg";
    }
}
