package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes8.dex */
public final class g9 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.g9 f267650d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.g9();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenWebOnPC", "handleMsg!");
        java.lang.String str = (java.lang.String) msg.f422323a.get(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = (java.lang.String) msg.f422323a.get("url");
        java.lang.String str3 = str2 != null ? str2 : "";
        boolean z17 = str3.length() == 0;
        nw4.g gVar = env.f422396d;
        if (z17) {
            gVar.e(msg.f422546c, msg.f422552i + ":fail. url is nil or empty!", null);
            return true;
        }
        if (!((d73.i) i95.n0.c(d73.i.class)).Qg()) {
            gVar.e(msg.f422546c, msg.f422552i + "fail. canSendOpenCommand return fail!", null);
            return true;
        }
        if (e()) {
            gVar.e(msg.f422546c, msg.f422552i + ":fail. call too frequently!", null);
            return true;
        }
        if (str.length() == 0) {
            str = str3;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.C16092xbbe22aef c16092xbbe22aef = new com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.C16092xbbe22aef(str, str3, "", 0, null, null, null, null, 248, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenWebOnPC", "openUrlOnPc Success(send success) url:" + str3 + ", title:" + str);
        ((d73.i) i95.n0.c(d73.i.class)).f6(c16092xbbe22aef);
        gVar.e(msg.f422546c, msg.f422552i + ":success", null);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return md1.e1.f72846x366c91de;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "openWebOnPC";
    }

    public final boolean e() {
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_liteapp_open_web_on_pc_total_per_day, 10);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenWebOnPC", "limit count:" + Ni);
        java.lang.String format = new java.text.SimpleDateFormat("yyyy-MM-dd", java.util.Locale.getDefault()).format(new java.util.Date());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenWebOnPC", "currentDateString:" + format);
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEBVIEW_JSAPI_OPENWEBONPC_LAST_TIME_STRING;
        java.lang.String v17 = c17.v(u3Var, "1970-01-01");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(v17, "null cannot be cast to non-null type kotlin.String");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenWebOnPC", "lastCalledTime:".concat(v17));
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c18 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var2 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEBVIEW_JSAPI_OPENWEBONPC_CALLED_COUNT_INT;
        java.lang.Object m17 = c18.m(u3Var2, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m17, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) m17).intValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenWebOnPC", "calledCount:" + intValue);
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(format, v17)) {
            intValue = 0;
        }
        if (intValue < Ni) {
            gm0.j1.u().c().x(u3Var2, java.lang.Integer.valueOf(intValue + 1));
            gm0.j1.u().c().x(u3Var, format);
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenWebOnPC", "calledcount:" + intValue + " >= limit:" + Ni);
        return true;
    }
}
