package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class u8 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.u8 f268092d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.u8();

    public static final void e(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.u8 u8Var, org.json.JSONObject jSONObject, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        u8Var.getClass();
        int optInt = jSONObject.optInt("type", 0);
        bw5.ar0 i17 = bw5.ar0.i(jSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, -1));
        bw5.ar0 i18 = bw5.ar0.i(i17 != null ? i17.f106955d : 2000);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(i18, "forNumber(...)");
        java.lang.Integer valueOf = jSONObject.has("highlighted_line_type") ? java.lang.Integer.valueOf(jSONObject.optInt("highlighted_line_type", 0)) : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenTingView", "openProfile type " + optInt + ", scene " + i18.f106955d);
        il4.e eVar = new il4.e(null, 0, i18.f106955d, false, null, null, 0, 0, false, false, null, null, null, null, null, null, false, false, null, null, false, null, false, null, false, 33554427, null);
        eVar.f373659w = true;
        rk4.z8 z8Var = (rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class));
        qk.f9.e(z8Var.aj(), z8Var.bj(), i18, eVar, optInt, valueOf, null, 32, null);
        if (rVar != null) {
            rVar.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c(true));
        }
    }

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenTingView", "OpenTingView");
        java.lang.String jSONObject = msg.f422547d.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
        com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(jSONObject), com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.r8.class, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.s8(env, msg));
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 489;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "openTingView";
    }
}
