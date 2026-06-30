package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes8.dex */
public final class k5 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.k5 f267837d;

    /* renamed from: e, reason: collision with root package name */
    public static final int f267838e;

    /* renamed from: f, reason: collision with root package name */
    public static final int f267839f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String f267840g;

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f267841h;

    /* renamed from: i, reason: collision with root package name */
    public static final jz5.g f267842i;

    /* renamed from: m, reason: collision with root package name */
    public static final boolean f267843m;

    /* renamed from: n, reason: collision with root package name */
    public static final boolean f267844n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f267845o;

    static {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.k5 k5Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.k5();
        f267837d = k5Var;
        f267838e = cf.b.a(k5Var);
        f267839f = 345;
        f267840g = "handleMPPageAction";
        f267841h = true;
        f267842i = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.u4.f268090d);
        f267843m = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_can_share_url_exceprt, false);
        f267844n = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_biz_android_excerpt_share_image, 0) == 1;
        f267845o = 524288;
    }

    public static final int e(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.k5 k5Var, int i17, android.content.Intent intent) {
        k5Var.getClass();
        int i18 = 0;
        if (i17 == -1) {
            java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("SendMsgUsernames");
            if (!(stringArrayListExtra == null || stringArrayListExtra.isEmpty())) {
                java.util.Iterator<T> it = stringArrayListExtra.iterator();
                while (it.hasNext()) {
                    i18 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4((java.lang.String) it.next()) ? i18 | 1 : i18 | 2;
                }
            }
        }
        return i18;
    }

    public final boolean A(nw4.k kVar, nw4.y2 y2Var) {
        float f17;
        android.app.Activity a17 = q75.a.a(kVar.f422393a);
        nw4.g gVar = kVar.f422396d;
        if (a17 == null) {
            gVar.e(y2Var.f422546c, y2Var.f422552i + ":fail", null);
            return true;
        }
        int c17 = com.p314xaae8f345.mm.ui.bl.c(a17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleMPPageAction", "handleMPPageAction navBarHeight=" + c17);
        java.util.HashMap hashMap = new java.util.HashMap();
        float f18 = (float) c17;
        android.content.Context context = kVar.f422393a;
        if (context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) context).f265348f;
            f17 = c22633x83752a59 != null ? c22633x83752a59.m81401x1f106092() : j65.f.f();
        } else {
            f17 = j65.f.f();
        }
        hashMap.put("height", java.lang.Float.valueOf(f18 / f17));
        gVar.e(y2Var.f422546c, y2Var.f422552i + ":ok", hashMap);
        return true;
    }

    public final boolean B(nw4.k kVar, nw4.y2 y2Var) {
        boolean d17;
        nw4.g gVar;
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleMPPageAction", "getPosition");
            tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
            android.content.Context context = kVar.f422393a;
            ((sb0.f) jVar).getClass();
            d17 = j35.u.d(context, "android.permission.ACCESS_FINE_LOCATION", true);
            gVar = kVar.f422396d;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiHandleMPPageAction", "getPosition outer fail e:%s", e17.getMessage());
            kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":fail interal error", null);
        }
        if (!d17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleMPPageAction", "getPosition no system permission");
            gVar.e(y2Var.f422546c, y2Var.f422552i + ":fail permission denied", null);
            return true;
        }
        if (((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Ri(d85.g0.LOCAION, d85.f0.f308700r)) {
            com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0(), com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.d.class, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.q4(kVar, y2Var));
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleMPPageAction", "getPosition no business permission");
        gVar.e(y2Var.f422546c, y2Var.f422552i + ":fail business permission denied", null);
        return true;
    }

    public final boolean C(nw4.k kVar, nw4.y2 y2Var) {
        boolean z17;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            java.lang.Object l17 = gm0.j1.u().c().l(66832, java.lang.Boolean.FALSE);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(l17, "null cannot be cast to non-null type kotlin.Boolean");
            z17 = ((java.lang.Boolean) l17).booleanValue();
        } else {
            z17 = true;
        }
        boolean z18 = !z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleMPPageAction", "getSingleSendButton: useSingleSendButton: " + z18);
        nw4.g gVar = kVar.f422396d;
        java.lang.String str = y2Var.f422546c;
        java.lang.String str2 = y2Var.f422552i + ":ok";
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("useSingleSendButton", java.lang.Integer.valueOf(z18 ? 1 : 0));
        gVar.e(str, str2, hashMap);
        return true;
    }

    public final boolean D(nw4.k kVar, nw4.y2 y2Var) {
        qk.s6 s6Var = (qk.s6) gm0.j1.s(qk.s6.class);
        boolean z17 = false;
        boolean mo13794x74219ae7 = s6Var != null ? s6Var.mo13794x74219ae7() : false;
        if (!mo13794x74219ae7) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiHandleMPPageAction", "getTeenModeTemporaryVisitInfo isTeenMode = " + mo13794x74219ae7);
            kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":fail, not int teen mode now", null);
            return true;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        zg0.q2 a17 = kVar.a();
        java.lang.String Z = a17 != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0) a17).Z() : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        zq1.a0 a0Var = (zq1.a0) gm0.j1.s(zq1.a0.class);
        if ((a0Var != null && ((yq1.z) a0Var).o(Z)) || (a17 != null && ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0) a17).f263473m)) {
            z17 = true;
        }
        c0Var.f391645d = z17;
        hashMap.put("isValidVisitNoAccessPage", java.lang.Boolean.valueOf(z17));
        com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0(), com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.v3.class, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.r4(hashMap, c0Var, kVar, y2Var));
        return true;
    }

    public final void E(nw4.k kVar, nw4.y2 y2Var, int i17, long j17) {
        if (i17 == 1) {
            kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":ok", null);
        }
        if (i17 == 2) {
            kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":fail", null);
        }
        if (i17 == 3) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.t4 t4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.t4(kVar, y2Var);
            java.lang.String r17 = i65.a.r(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.c_d);
            o72.a5 a5Var = (o72.a5) i95.n0.c(o72.a5.class);
            android.content.Context context = kVar.f422393a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r17);
            ((com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.la) a5Var).getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            if (context instanceof android.app.Activity) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.j.c(r17, i65.a.r(context, com.p314xaae8f345.mm.R.C30867xcad56011.c_a), (android.app.Activity) context, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() ? com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ja.f182742a : new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ka(j17, context), t4Var);
            }
        }
    }

    public final boolean F(nw4.k env, nw4.y2 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        long V = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V((java.lang.String) msg.f422323a.get(dm.i4.f66865x76d1ec5a), 0L);
        long V2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V((java.lang.String) msg.f422323a.get("key"), 0L);
        long V3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V((java.lang.String) msg.f422323a.get("value"), 0L);
        nw4.g gVar = env.f422396d;
        if (V <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiHandleMPPageAction", "idKey id can't be 0");
            gVar.e(msg.f422546c, msg.f422552i + ":fail", null);
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(V, V2, V3);
        gVar.e(msg.f422546c, msg.f422552i + ":ok", null);
        return true;
    }

    public final boolean G(nw4.k kVar, nw4.y2 y2Var) {
        java.lang.Object obj = y2Var.f422323a.get("entrance");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str == null) {
            str = "0";
        }
        boolean Ni = ((sg0.e) ((tg0.f1) i95.n0.c(tg0.f1.class))).Ni(7, java.lang.Integer.parseInt(str));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleMPPageAction", "isEnabledForCircleToSearch status:" + Ni);
        if (Ni) {
            kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":ok", kz5.b1.e(new jz5.l("supportExtInfo", java.lang.Boolean.TRUE)));
            return true;
        }
        kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":fail", kz5.b1.e(new jz5.l("err_desc", "circleToSearch is not enabled.")));
        return true;
    }

    public final boolean H(nw4.k kVar, nw4.y2 y2Var) {
        boolean z17 = kVar.f422393a instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d;
        nw4.g gVar = kVar.f422396d;
        if (!z17) {
            gVar.e(y2Var.f422546c, y2Var.f422552i + ":fail", null);
            return true;
        }
        if (((ef0.y2) ((qk.o8) i95.n0.c(qk.o8.class))).Ai()) {
            gVar.e(y2Var.f422546c, y2Var.f422552i + ":ok", null);
        } else {
            gVar.e(y2Var.f422546c, y2Var.f422552i + ":fail", null);
        }
        return true;
    }

    public final boolean I(nw4.k kVar, nw4.y2 y2Var) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.w1 w1Var;
        java.lang.String str = (java.lang.String) y2Var.f422323a.get("roominfo");
        java.lang.String str2 = (java.lang.String) y2Var.f422323a.get("extinfo");
        if (str2 == null) {
            str2 = "";
        }
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiHandleMPPageAction", "joinChatBotRoom: roomInfo is empty");
            kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":fail roomInfo is empty", null);
            return true;
        }
        try {
            byte[] decode = android.util.Base64.decode(str, 0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decode, "decode(...)");
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.d0 d0Var = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.d0();
            d0Var.mo11468x92b714fd(decode);
            if (str2.length() > 0) {
                byte[] decode2 = android.util.Base64.decode(str2, 0);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decode2, "decode(...)");
                w1Var = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.w1();
                w1Var.mo11468x92b714fd(decode2);
            } else {
                w1Var = null;
            }
            ((wx.u) ((wx.e1) i95.n0.c(wx.e1.class))).wi(kVar.f422393a, d0Var, w1Var);
            kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":ok", null);
        } catch (java.lang.Exception e17) {
            kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":fail start chatbot", null);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("start chatbot fail: ");
            sb6.append(e17.getMessage());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiHandleMPPageAction", sb6.toString());
        }
        return true;
    }

    public final boolean J(nw4.k env, nw4.y2 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) msg.f422323a.get(dm.i4.f66865x76d1ec5a), 0);
        nw4.g gVar = env.f422396d;
        if (P <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiHandleMPPageAction", "kvStat id can't be 0");
            gVar.e(msg.f422546c, msg.f422552i + ":fail", null);
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(P, (java.lang.String) msg.f422323a.get(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306));
        gVar.e(msg.f422546c, msg.f422552i + ":ok", null);
        return true;
    }

    public final boolean K(nw4.k kVar, nw4.y2 y2Var) {
        android.content.Context context = kVar.f422393a;
        boolean z17 = context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d;
        nw4.g gVar = kVar.f422396d;
        if (!z17) {
            gVar.e(y2Var.f422546c, y2Var.f422552i + ":fail, is not WebviewUI", null);
            return true;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
        cw4.p0 p0Var = (cw4.p0) ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) context).f265399w2.f267189g.f263278h.mo3195x754a37bb();
        int i17 = p0Var != null ? p0Var.f305801d : 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleMPPageAction", "handleMPPageAction current trans status  = " + i17 + '}');
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("status", java.lang.Integer.valueOf(i17));
        gVar.e(y2Var.f422546c, y2Var.f422552i + ":ok", hashMap);
        return true;
    }

    public final boolean L(nw4.k kVar, nw4.y2 y2Var) {
        zq1.a0 a0Var = (zq1.a0) gm0.j1.s(zq1.a0.class);
        zg0.q2 a17 = kVar.a();
        java.lang.String Z = a17 != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0) a17).Z() : null;
        nw4.g gVar = kVar.f422396d;
        if (a0Var != null && (kVar.f422393a instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d)) {
            yq1.z zVar = (yq1.z) a0Var;
            if (zVar.o(Z)) {
                android.content.Context context = kVar.f422393a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
                java.lang.String stringExtra = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) context).getIntent().getStringExtra("srcUsername");
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleMPPageAction", "openFinderLive userName null)");
                    gVar.e(y2Var.f422546c, y2Var.f422552i + ":fail", null);
                    return true;
                }
                java.lang.String i17 = zVar.i(stringExtra);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(i17)) {
                    ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).s(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, stringExtra, i17, 16, ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).j(stringExtra), null);
                    return true;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleMPPageAction", "openFinderLive exportId null");
                gVar.e(y2Var.f422546c, y2Var.f422552i + ":fail", null);
                return true;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleMPPageAction", "openFinderLive service pre condition check fail. url:%s", Z);
        gVar.e(y2Var.f422546c, y2Var.f422552i + ":fail", null);
        return true;
    }

    public final boolean M(nw4.k kVar, nw4.y2 y2Var) {
        java.lang.Object obj = y2Var.f422323a.get("jumpUrl");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str == null) {
            str = "";
        }
        java.lang.Object obj2 = y2Var.f422323a.get(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
        java.lang.String str2 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
        java.lang.String str3 = str2 == null ? "" : str2;
        java.lang.Object obj3 = y2Var.f422323a.get("downloadTitle");
        java.lang.String str4 = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
        java.lang.String str5 = str4 == null ? "" : str4;
        java.lang.Object obj4 = y2Var.f422323a.get("confirmLabel");
        java.lang.String str6 = obj4 instanceof java.lang.String ? (java.lang.String) obj4 : null;
        java.lang.String str7 = str6 == null ? "" : str6;
        java.lang.Object obj5 = y2Var.f422323a.get("cancelLabel");
        java.lang.String str8 = obj5 instanceof java.lang.String ? (java.lang.String) obj5 : null;
        java.lang.String str9 = str8 != null ? str8 : "";
        if (r26.n0.N(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiHandleMPPageAction", "openMPApp: jumpUrl 为空");
            kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":fail jumpUrl invalid", null);
            return true;
        }
        rv.q2 q2Var = (rv.q2) i95.n0.c(rv.q2.class);
        android.content.Context context = kVar.f422393a;
        ((qv.i) q2Var).getClass();
        eq1.x xVar = eq1.x.f337408a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        xVar.a(context, str, 2, true, str3, str5, str7, str9);
        kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":ok", null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleMPPageAction", "openMPApp: jumpUrl=" + str + ", title=" + str3 + ", downloadTitle=" + str5 + ", confirmLabel=" + str7 + ", cancelLabel=" + str9);
        return true;
    }

    public final boolean N(nw4.k kVar, nw4.y2 y2Var) {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiHandleMPPageAction", "openPublishEditFromMoment not main process");
            kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":fail not main process", null);
            return true;
        }
        java.lang.String str = (java.lang.String) y2Var.f422323a.get("snsBizPublishUniqueId");
        if (str == null) {
            str = "";
        }
        if (str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiHandleMPPageAction", "openPublishEdit uniqueId is empty");
            kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":fail uniqueId is empty", null);
            return true;
        }
        java.util.List arrayList = new java.util.ArrayList();
        ((ox.g) ((tk.o) i95.n0.c(tk.o.class))).getClass();
        tk.y Bi = ((ox.e0) i95.n0.c(ox.e0.class)).Bi(str);
        if (Bi == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiHandleMPPageAction", "sns published info is empty");
            kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":fail sns published info is empty", null);
            return true;
        }
        java.util.List<tk.x> list = Bi.f501419a;
        if (list == null || list.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiHandleMPPageAction", "sns photos is empty");
            kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":fail sns photos is empty", null);
            return true;
        }
        for (tk.x xVar : list) {
            java.lang.String str2 = xVar.f501416a;
            if (str2.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleMPPageAction", "sns photo path is empty, uniqueId: ".concat(str));
            } else {
                arrayList.add(new com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23531x767fe49d(str2, null, null, null, null, java.lang.Boolean.valueOf(xVar.f501417b && xVar.f501418c != null), xVar.f501418c, null, null, null, null, null, null, null, null, null, 65438, null));
            }
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        tk.t tVar = tk.u.f501404e;
        jSONObject.put("mpPublishAction", 2);
        jSONObject.put("publishScene", "sns_new");
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 1410);
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        jSONObject3.put("content", Bi.f501420b);
        org.json.JSONObject jSONObject4 = new org.json.JSONObject();
        jSONObject4.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, Bi.f501421c);
        jSONObject4.put("address", Bi.f501422d);
        jSONObject4.put("longitude", java.lang.Float.valueOf(Bi.f501423e));
        jSONObject4.put("latitude", java.lang.Float.valueOf(Bi.f501424f));
        jSONObject4.put("poiid", Bi.f501425g);
        jSONObject3.put("poiInfo", jSONObject4);
        jSONObject2.put("nativeExtraData", jSONObject3);
        jSONObject.put("weAppParam", jSONObject2);
        ((ox.o) ((tk.q) i95.n0.c(tk.q.class))).Di(kVar.f422393a, jSONObject, arrayList, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.v4(kVar, y2Var, str));
        return true;
    }

    public final boolean O(nw4.k kVar, nw4.y2 y2Var) {
        java.lang.Object obj = y2Var.f422323a.get("appId");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        java.lang.Object obj2 = y2Var.f422323a.get(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
        java.lang.String str2 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
        if (!(str == null || str.length() == 0)) {
            if (!(str2 == null || str2.length() == 0)) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, str2);
                ((xc1.t) ((ft.q4) i95.n0.c(ft.q4.class))).Ai(str, jSONObject.toString());
                kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":ok", null);
                return true;
            }
        }
        kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":fail param is empty", null);
        return true;
    }

    public final boolean P(nw4.k kVar, nw4.y2 y2Var) {
        java.lang.String sb6;
        java.lang.Object obj = y2Var.f422323a.get("urlList");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str == null) {
            str = "";
        }
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray(str);
            int length = jSONArray.length();
            for (int i17 = 0; i17 < length; i17++) {
                java.lang.String string = jSONArray.getString(i17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleMPPageAction", "preloadImage url=" + string);
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                o11.f fVar = new o11.f();
                fVar.f423611b = true;
                fVar.f423610a = false;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
                    sb6 = "";
                } else {
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                    sb7.append(g83.a.d());
                    sb7.append("preview_");
                    char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
                    sb7.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(string.getBytes()));
                    sb6 = sb7.toString();
                }
                fVar.f423615f = sb6;
                n11.a.b().i(string, null, fVar.a(), new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.w4(currentTimeMillis));
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiHandleMPPageAction", e17, "preloadImage parse jsonArray error", new java.lang.Object[0]);
        }
        kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":ok", null);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Q(nw4.k r7, nw4.y2 r8) {
        /*
            r6 = this;
            java.lang.String r0 = "optString(...)"
            java.util.Map r1 = r8.f422323a
            java.lang.String r2 = "reportData"
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = ""
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Exception -> L29
            r3.<init>(r1)     // Catch: java.lang.Exception -> L29
            java.lang.String r1 = "data"
            java.lang.String r1 = r3.optString(r1, r2)     // Catch: java.lang.Exception -> L29
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r1, r0)     // Catch: java.lang.Exception -> L29
            java.lang.String r4 = "music_data"
            java.lang.String r3 = r3.optString(r4, r2)     // Catch: java.lang.Exception -> L27
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r3, r0)     // Catch: java.lang.Exception -> L27
            r2 = r3
            goto L3a
        L27:
            r0 = move-exception
            goto L2b
        L29:
            r0 = move-exception
            r1 = r2
        L2b:
            java.lang.String r0 = r0.getMessage()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r3 = "MicroMsg.JsApiHandleMPPageAction"
            java.lang.String r4 = "reportByLeaveForMPGateway, ex = %s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r3, r4, r0)
        L3a:
            cy4.b r0 = cy4.b.f306392a
            boolean r3 = r0.a()
            if (r3 != 0) goto L43
            goto L63
        L43:
            java.lang.String r3 = "MicroMsg.MPVideoPreviewDataMgr"
            java.lang.String r4 = "reportByLeaveForMPGateway"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r4)
            java.util.Map r4 = r8.f422323a
            java.lang.String r5 = "native_data"
            java.lang.Object r4 = r4.get(r5)
            java.lang.String r4 = (java.lang.String) r4
            boolean r5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r4)
            if (r5 == 0) goto L60
            java.lang.String r0 = "reportByLeaveForMPGateway native_data null"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r0)
            goto L63
        L60:
            r0.c(r4)
        L63:
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.f1.b(r1)
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.f1.c(r2)
            nw4.g r7 = r7.f422396d
            java.lang.String r0 = r8.f422546c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r8 = r8.f422552i
            r1.append(r8)
            java.lang.String r8 = ":ok"
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r1 = 0
            r7.e(r0, r8, r1)
            r7 = 1
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.k5.Q(nw4.k, nw4.y2):boolean");
    }

    public final boolean R(nw4.k kVar, nw4.y2 y2Var) {
        java.lang.Object obj = y2Var.f422323a.get(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24);
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str == null) {
            str = "";
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.d(kVar.f422393a, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24, str, null);
        kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":ok", null);
        return true;
    }

    public final boolean S(nw4.k kVar, nw4.y2 y2Var) {
        java.lang.String str = (java.lang.String) y2Var.f422323a.get("reportData");
        if (str == null || r26.n0.N(str)) {
            kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":fail", null);
            return true;
        }
        java.lang.String PROCESS_MAIN = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(PROCESS_MAIN, "PROCESS_MAIN");
        com.p314xaae8f345.mm.p794xb0fa9b5e.f.a(PROCESS_MAIN, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(str), com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.z4.f268239d, null);
        kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":ok", null);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0306  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean T(nw4.k r29, nw4.y2 r30) {
        /*
            Method dump skipped, instructions count: 955
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.k5.T(nw4.k, nw4.y2):boolean");
    }

    public final boolean U(nw4.k kVar, nw4.y2 y2Var) {
        java.lang.Object obj = y2Var.f422323a.get("buttons");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str == null || str.length() == 0) {
            kVar.f422396d.e(y2Var.f422546c, "handleMPPageAction:fail params invalid", null);
            return true;
        }
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray(str);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int length = jSONArray.length();
            for (int i17 = 0; i17 < length; i17++) {
                org.json.JSONObject optJSONObject = jSONArray.optJSONObject(i17);
                arrayList.add(new android.util.Pair(optJSONObject.optString(dm.i4.f66865x76d1ec5a), optJSONObject.optString("label")));
            }
            ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.e5(kVar, arrayList, y2Var));
        } catch (java.lang.Exception unused) {
        }
        return true;
    }

    public final boolean V(nw4.k kVar, nw4.y2 y2Var) {
        vh0.n1 n1Var = (vh0.n1) i95.n0.c(vh0.n1.class);
        java.lang.Object obj = ((java.util.HashMap) y2Var.f422323a).get(dm.i4.f66875xa013b0d5);
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = str;
        if (!(str2.length() == 0) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b("wxid_wi_1d142z0zdj03", str2)) {
            int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) ((java.util.HashMap) y2Var.f422323a).get("enter_scene"), 0);
            java.lang.String a17 = com.p314xaae8f345.mm.ui.l2.a(str2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleMPPageAction", "showChatBotPrivacyPageSheet enterType:" + P);
            ((vh0.f3) n1Var).bj(kVar.f422393a, str2, P, a17, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.f5(kVar, y2Var));
            return true;
        }
        java.lang.String concat = "chatbotUsername is invalid: ".concat(str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiHandleMPPageAction", concat);
        java.util.Map l17 = kz5.c1.l(new jz5.l("err_desc", concat));
        kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":fail", l17);
        return true;
    }

    public final boolean W(nw4.k kVar, nw4.y2 y2Var) {
        java.lang.Object obj = y2Var.f422323a.get("biz");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str == null) {
            str = "";
        }
        java.lang.Object obj2 = y2Var.f422323a.get("nickname");
        java.lang.String str2 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
        java.lang.String str3 = str2 == null ? "" : str2;
        java.lang.Object obj3 = y2Var.f422323a.get("identityName");
        java.lang.String str4 = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
        java.lang.String str5 = str4 == null ? "" : str4;
        java.lang.Object obj4 = y2Var.f422323a.get("identityType");
        java.lang.String str6 = obj4 instanceof java.lang.String ? (java.lang.String) obj4 : null;
        if (str6 == null) {
            str6 = "0";
        }
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str6, 0);
        java.lang.Object obj5 = y2Var.f422323a.get("headImgUrl");
        java.lang.String str7 = obj5 instanceof java.lang.String ? (java.lang.String) obj5 : null;
        java.lang.String str8 = str7 != null ? str7 : "";
        java.lang.Object obj6 = y2Var.f422323a.get("bizType");
        java.lang.String str9 = obj6 instanceof java.lang.String ? (java.lang.String) obj6 : null;
        int P2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str9 != null ? str9 : "0", 0);
        int i17 = P2 == 2 ? 5 : 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleMPPageAction", "showInteractiveHalfScreenProfile biz: " + str + ", nickname: " + str3 + ", identityName: " + str5 + ", identityType: " + P + ", headImgUrl: " + str8 + ", bizType: " + P2);
        zq1.y yVar = (zq1.y) i95.n0.c(zq1.y.class);
        android.content.Context context = kVar.f422393a;
        ((yq1.k) yVar).getClass();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5) || context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PluginBrandService", "showInteractiveHalfScreenProfile, identityName invalid or context is null, identityName:%s", str5);
            return true;
        }
        ir1.i1.R.a(context, new com.p314xaae8f345.p2845xc516c4b6.biz.C23135x54a4d828(str8, str3, str5, java.lang.Long.valueOf(P), java.lang.Long.valueOf(-1)), str, i17);
        return true;
    }

    public final boolean X(nw4.k kVar, nw4.y2 y2Var) {
        android.content.Context context = kVar.f422393a;
        boolean z17 = context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d;
        nw4.g gVar = kVar.f422396d;
        if (!z17) {
            gVar.e(y2Var.f422546c, y2Var.f422552i + ":fail", null);
            return true;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) context;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String str = (java.lang.String) y2Var.f422323a.get("menuItems");
        if (!(str == null || r26.n0.N(str))) {
            try {
                org.json.JSONArray jSONArray = new org.json.JSONArray(str);
                int length = jSONArray.length();
                for (int i17 = 0; i17 < length; i17++) {
                    java.lang.String string = jSONArray.getString(i17);
                    arrayList.add(string);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleMPPageAction", "showMenu:" + string);
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiHandleMPPageAction", e17, "", new java.lang.Object[0]);
                gVar.e(y2Var.f422546c, y2Var.f422552i + ":fail", null);
                return true;
            }
        }
        long V = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V((java.lang.String) y2Var.f422323a.get("forbidFlag"), 0L);
        boolean D0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0("dark", (java.lang.String) y2Var.f422323a.get("style"));
        int v76 = viewOnCreateContextMenuListenerC19337x37f3384d.v7();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.jd w76 = viewOnCreateContextMenuListenerC19337x37f3384d.w7();
        boolean z18 = w76 != null ? w76.f266411h : false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewUI", "isCurrentMPPageDisableMenuHeader  disableMenuHeader:" + z18);
        viewOnCreateContextMenuListenerC19337x37f3384d.f265382q2.h0(V, arrayList, D0, z18, v76, 1);
        gVar.e(y2Var.f422546c, y2Var.f422552i + ":ok", null);
        return true;
    }

    public final boolean Y(nw4.k kVar, nw4.y2 y2Var) {
        android.content.Context context = kVar.f422393a;
        boolean z17 = context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d;
        nw4.g gVar = kVar.f422396d;
        if (!z17) {
            gVar.e(y2Var.f422546c, y2Var.f422552i + ":fail", null);
            return true;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) context;
        java.lang.String str = (java.lang.String) y2Var.f422323a.get("color");
        java.lang.String str2 = (java.lang.String) y2Var.f422323a.get("traceId");
        if (str2 == null) {
            str2 = "";
        }
        float L = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L((java.lang.String) y2Var.f422323a.get("alpha"), 0.0f);
        if (L <= 0.0f || L > 1.0f) {
            gVar.e(y2Var.f422546c, y2Var.f422552i + ":fail alpha value is invalid", null);
            return true;
        }
        int i17 = 0;
        int c17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.a1.c(str, 0);
        android.view.View decorView = viewOnCreateContextMenuListenerC19337x37f3384d.getWindow().getDecorView();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decorView, "getDecorView(...)");
        if ((decorView instanceof android.view.ViewGroup) && decorView.findViewById(com.p314xaae8f345.mm.R.id.piu) == null) {
            android.view.View view = new android.view.View(viewOnCreateContextMenuListenerC19337x37f3384d);
            view.setBackgroundColor(c17);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(L));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiHandleMPPageAction", "showNavShadow", "(Lcom/tencent/mm/plugin/webview/jsapi/JsApiEnv;Lcom/tencent/mm/plugin/webview/jsapi/MsgWrapper;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiHandleMPPageAction", "showNavShadow", "(Lcom/tencent/mm/plugin/webview/jsapi/JsApiEnv;Lcom/tencent/mm/plugin/webview/jsapi/MsgWrapper;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setId(com.p314xaae8f345.mm.R.id.piu);
            view.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.g5(str2, kVar));
            fq1.e eVar = fq1.e.f347040a;
            android.view.View view2 = kVar.f422397e;
            if (view2 != null && decorView != view2) {
                while (view2 != decorView) {
                    i17 += view2.getTop();
                    if (!(view2.getParent() instanceof android.view.View)) {
                        break;
                    }
                    java.lang.Object parent = view2.getParent();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.view.View");
                    view2 = (android.view.View) parent;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleMPPageAction", "showNavShadow shadowHeight=" + i17);
            ((android.view.ViewGroup) decorView).addView(view, new android.widget.FrameLayout.LayoutParams(-1, i17));
        }
        gVar.e(y2Var.f422546c, y2Var.f422552i + ":ok", null);
        return true;
    }

    public final boolean Z(nw4.k kVar, nw4.y2 y2Var) {
        java.lang.Object obj = y2Var.f422323a.get("show");
        boolean y17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.y(obj instanceof java.lang.String ? (java.lang.String) obj : null, false);
        android.content.Context context = kVar.f422393a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d ? (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) context : null;
        if (viewOnCreateContextMenuListenerC19337x37f3384d != null) {
            nf.e.f(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.h5(y17, viewOnCreateContextMenuListenerC19337x37f3384d, kVar, y2Var));
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiHandleMPPageAction", "wrong ctx");
        kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":fail", null);
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        com.p314xaae8f345.p3210x3857dc.z0 mo120153xd15cf999;
        android.view.View j17;
        android.view.View j18;
        java.lang.String str;
        float f17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        java.lang.String str2 = (java.lang.String) ((java.util.HashMap) msg.f422323a).get("action");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleMPPageAction", "handleMPPageAction action=%s", str2);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            env.f422396d.e(msg.f422546c, msg.f422552i + ":fail action is empty", null);
            return true;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("holdGoBackAction", str2)) {
            android.content.Context context = env.f422393a;
            if (context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) context).C = true;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiHandleMPPageAction", "not in WebViewUI now!");
            }
            env.f422396d.e(msg.f422546c, msg.f422552i + ":ok", null);
            return true;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("enterEmbedMpVideo", str2)) {
            if (h(env, msg)) {
                ot0.m1 t17 = t(env, msg);
                android.content.Context context2 = env.f422393a;
                if (context2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) {
                    if (context2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) {
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) context2).f265348f;
                        f17 = c22633x83752a59 != null ? c22633x83752a59.m81401x1f106092() : j65.f.f();
                    } else {
                        f17 = j65.f.f();
                    }
                    int a17 = com.p314xaae8f345.mm.ui.bl.a(env.f422393a);
                    int h17 = com.p314xaae8f345.mm.ui.bl.h(env.f422393a);
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L((java.lang.String) ((java.util.HashMap) msg.f422323a).get("videoCurrTime"), 0.0f);
                    t17.f430116u = (int) (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L((java.lang.String) ((java.util.HashMap) msg.f422323a).get("playerX"), 0.0f) * f17);
                    t17.f430117v = (int) ((com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L((java.lang.String) ((java.util.HashMap) msg.f422323a).get("playerY"), 0.0f) * f17) + a17 + h17);
                    t17.f430118w = (int) (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L((java.lang.String) ((java.util.HashMap) msg.f422323a).get("playerWidth"), 0.0f) * f17);
                    t17.f430119x = (int) (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L((java.lang.String) ((java.util.HashMap) msg.f422323a).get("playerHeight"), 0.0f) * f17);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.ViewOnClickListenerC19428xb021cc2c I7 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) context2).I7();
                    synchronized (I7) {
                        I7.f267258x = t17;
                        I7.forbidForward = t17.C;
                        I7.m();
                        if (I7.U) {
                            I7.h();
                        }
                        I7.e();
                    }
                }
                env.f422396d.e(msg.f422546c, msg.f422552i + ":ok", null);
            }
            return true;
        }
        int i17 = 0;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("getBiz", str2)) {
            java.lang.Object obj = ((java.util.HashMap) msg.f422323a).get("bizType");
            java.lang.String str3 = obj instanceof java.lang.String ? (java.lang.String) obj : null;
            if (str3 == null) {
                str3 = "0";
            }
            int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str3, 1);
            java.lang.Object obj2 = ((java.util.HashMap) msg.f422323a).get("needCheckBiz");
            str = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
            if (str == null) {
                str = "false";
            }
            com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p646xf2865d2e.C10319x97e5a9d2(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.y(str, false), P, false), rm.a0.class, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.o4(env, msg));
            return true;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("getAllBiz", str2)) {
            java.lang.Object obj3 = ((java.util.HashMap) msg.f422323a).get("bizType");
            java.lang.String str4 = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
            if (str4 == null) {
                str4 = "0";
            }
            int P2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str4, 1);
            java.lang.Object obj4 = ((java.util.HashMap) msg.f422323a).get("needCheckBiz");
            str = obj4 instanceof java.lang.String ? (java.lang.String) obj4 : null;
            if (str == null) {
                str = "false";
            }
            com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p646xf2865d2e.C10319x97e5a9d2(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.y(str, false), P2, true), rm.a0.class, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.n4(env, msg));
            return true;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("getWxInfo", str2)) {
            com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0(), com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.e.class, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.s4(env, msg));
            return true;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("refreshTimelineFeed", str2)) {
            java.lang.Object obj5 = ((java.util.HashMap) msg.f422323a).get("triggerJson");
            java.lang.String str5 = obj5 instanceof java.lang.String ? (java.lang.String) obj5 : null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleMPPageAction", "refreshTimelineFeed triggerJson: " + str5);
            if (z40.e.l4() && ((y40.i0) z40.e.get()).Di()) {
                z40.e eVar = z40.e.get();
                if (str5 == null) {
                    str5 = "";
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.x4 x4Var = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.x4.f268187a;
                ((y40.i0) eVar).getClass();
                com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.c0 a18 = a50.e1.f83004a.a();
                if (a18 != null) {
                    a18.x(str5, new y40.c0(x4Var));
                }
            } else {
                com.p314xaae8f345.p3133xd0ce8b26.mm.biz.g0 g0Var = com.p314xaae8f345.p3133xd0ce8b26.mm.biz.g0.f299596b;
                if (str5 == null) {
                    str5 = "";
                }
                g0Var.C(str5, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.y4.f268209a);
            }
            env.f422396d.e(msg.f422546c, msg.f422552i + ":ok", null);
            return true;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("shareEmbedMpVideo", str2)) {
            if (h(env, msg)) {
                ot0.m1 t18 = t(env, msg);
                android.content.Context context3 = env.f422393a;
                if (context3 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context3, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
                    t18.f430120y = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) context3).f265346e2;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleMPPageAction", "shareEmbedMpVideo bizUsrName=" + t18.f454881p + ", mpUrl=" + t18.f454872d + ", videoUrl=" + t18.f454873e + ", width=" + t18.f454878m + ", height=" + t18.f454879n + ", videoDuration=" + t18.f454877i);
                }
                if (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e9.l()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.v0.f267362a.a(env.f422393a, t18, 2);
                } else {
                    android.content.Context context4 = env.f422393a;
                    if (context4 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) context4).f265344d3.f267340a = t18;
                        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.j0.f267319a.b(context4, t18.f454876h, "", t18.f454875g, t18.f454872d, 2);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiHandleMPPageAction", "not in WebViewUI now!");
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(18589, 14, 3);
                env.f422396d.e(msg.f422546c, msg.f422552i + ":ok", null);
            }
            return true;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(nd1.a2.f72910x24728b, str2)) {
            android.content.Context context5 = env.f422393a;
            boolean z17 = context5 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d;
            nw4.g gVar = env.f422396d;
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = z17 ? (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) context5 : null;
                if (viewOnCreateContextMenuListenerC19337x37f3384d != null) {
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.y((java.lang.String) ((java.util.HashMap) msg.f422323a).get("show"), true)) {
                        p012xc85e97e9.p016x746ad0e3.app.b bVar = viewOnCreateContextMenuListenerC19337x37f3384d.f265373o;
                        if (bVar != null && (j18 = bVar.j()) != null && j18.getVisibility() != 0) {
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                            arrayList.add(0);
                            java.util.Collections.reverse(arrayList);
                            yj0.a.d(j18, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/WebViewUI", "showActionBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            j18.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                            yj0.a.f(j18, "com/tencent/mm/plugin/webview/ui/tools/WebViewUI", "showActionBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                    } else {
                        p012xc85e97e9.p016x746ad0e3.app.b bVar2 = viewOnCreateContextMenuListenerC19337x37f3384d.f265373o;
                        if (bVar2 != null && (j17 = bVar2.j()) != null && j17.getVisibility() == 0) {
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                            arrayList2.add(4);
                            java.util.Collections.reverse(arrayList2);
                            yj0.a.d(j17, arrayList2.toArray(), "com/tencent/mm/plugin/webview/ui/tools/WebViewUI", "hideActionBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            j17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                            yj0.a.f(j17, "com/tencent/mm/plugin/webview/ui/tools/WebViewUI", "hideActionBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                    }
                }
                gVar.e(msg.f422546c, msg.f422552i + ":ok", null);
            } else {
                gVar.e(msg.f422546c, msg.f422552i + ":fail", null);
            }
            return true;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(ya.a.f77453x4b357bf, str2)) {
            android.content.Context context6 = env.f422393a;
            if (context6 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context6, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d2 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) context6;
                new android.os.Bundle().putString("extInfo", (java.lang.String) ((java.util.HashMap) msg.f422323a).get("extInfo"));
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.y((java.lang.String) ((java.util.HashMap) msg.f422323a).get("useScrollActionSheet"), false)) {
                    viewOnCreateContextMenuListenerC19337x37f3384d2.X8();
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6 c6Var = viewOnCreateContextMenuListenerC19337x37f3384d2.f265382q2;
                    if (c6Var.c() == null || c6Var.c().f265409z1 == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewMenuHelper", "showShareMenu params failed");
                    } else {
                        com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3 c17 = c6Var.c().f265409z1.c();
                        if (c6Var.A(c17, 21, 1) || c6Var.A(c17, 23, 2)) {
                            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) c6Var.c(), 1, false);
                            k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.b7(c6Var, c17);
                            k0Var.f293425z = c6Var;
                            k0Var.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c7(c6Var);
                            k0Var.q(" ", 1);
                            k0Var.X1 = c6Var.f265591o || c6Var.c().v7() == 16;
                            k0Var.v();
                        } else {
                            db5.e1.T(c6Var.c(), c6Var.c().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lan));
                        }
                    }
                }
            } else {
                java.lang.String str6 = (java.lang.String) ((java.util.HashMap) msg.f422323a).get("extInfo");
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("extInfo", str6);
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0 b17 = env.b();
                if (b17 != null) {
                    b17.i(88, bundle);
                }
            }
            return true;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("showToast", str2)) {
            android.content.Context context7 = env.f422393a;
            if (context7 instanceof bx4.a) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context7, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.preload.api.IMPShareWebView");
                android.os.Bundle bundle2 = new android.os.Bundle();
                java.lang.Object obj6 = ((java.util.HashMap) msg.f422323a).get("wording");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj6, "null cannot be cast to non-null type kotlin.String");
                java.lang.Object obj7 = ((java.util.HashMap) msg.f422323a).get("status");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj7, "null cannot be cast to non-null type kotlin.String");
                bundle2.putString("wording", (java.lang.String) obj6);
                bundle2.putString("status", (java.lang.String) obj7);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) ((bx4.a) context7)).Z8(bundle2);
            }
            return true;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("writeCommentReply", str2)) {
            android.content.Context context8 = env.f422393a;
            if (context8 instanceof bx4.a) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context8, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.preload.api.IMPShareWebView");
                android.os.Bundle bundle3 = new android.os.Bundle();
                java.lang.Object obj8 = ((java.util.HashMap) msg.f422323a).get("comment_id");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj8, "null cannot be cast to non-null type kotlin.String");
                long V = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V((java.lang.String) obj8, 0L);
                java.lang.Object obj9 = ((java.util.HashMap) msg.f422323a).get("reply_content");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj9, "null cannot be cast to non-null type kotlin.String");
                java.lang.Object obj10 = ((java.util.HashMap) msg.f422323a).get("personal_comment_id");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj10, "null cannot be cast to non-null type kotlin.String");
                int P3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) obj10, 0);
                bundle3.putLong("commentTopicId", V);
                bundle3.putString("reply_content", (java.lang.String) obj9);
                bundle3.putInt("personal_comment_id", P3);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) ((bx4.a) context8)).k9(bundle3);
            }
            return true;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("writeComment", str2)) {
            android.content.Context context9 = env.f422393a;
            if (context9 instanceof bx4.a) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context9, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.preload.api.IMPShareWebView");
                android.os.Bundle bundle4 = new android.os.Bundle();
                java.lang.Object obj11 = ((java.util.HashMap) msg.f422323a).get("style");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj11, "null cannot be cast to non-null type kotlin.String");
                java.lang.Object obj12 = ((java.util.HashMap) msg.f422323a).get("comment_id");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj12, "null cannot be cast to non-null type kotlin.String");
                long V2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V((java.lang.String) obj12, 0L);
                bundle4.putString("style", (java.lang.String) obj11);
                bundle4.putLong("commentTopicId", V2);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) ((bx4.a) context9)).j9(bundle4);
            }
            return true;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("longPressEmbedMpVideo", str2)) {
            if (h(env, msg)) {
                ot0.m1 t19 = t(env, msg);
                android.content.Context context10 = env.f422393a;
                if (context10 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context10, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
                    t19.f430120y = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) context10).f265346e2;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.v0.f267362a.a(env.f422393a, t19, 1);
                env.f422396d.e(msg.f422546c, msg.f422552i + ":ok", null);
            }
            return true;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("insertVideoNativeView", str2)) {
            env.f422396d.e(msg.f422546c, msg.f422552i + ":ok", null);
            return true;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("wxConfig", str2)) {
            java.lang.String str7 = (java.lang.String) ((java.util.HashMap) msg.f422323a).get("appid");
            java.lang.String str8 = (java.lang.String) ((java.util.HashMap) msg.f422323a).get("webComptList");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleMPPageAction", "wxConfig webComptList=" + str8 + ", appId=" + str7);
            try {
                org.json.JSONArray jSONArray = new org.json.JSONArray(str8);
                java.lang.String str9 = (java.lang.String) ((java.util.HashMap) msg.f422323a).get("url");
                if (str9 == null) {
                    env.f422396d.e(msg.f422546c, msg.f422552i + ":fail invalid params", null);
                } else {
                    java.util.LinkedList b18 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.h1.f269353a.b(str9, jSONArray);
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(b18)) {
                        env.f422396d.e(msg.f422546c, msg.f422552i + ":fail webComptList is null", null);
                    } else {
                        nw4.g gVar2 = env.f422396d;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(gVar2, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.jsapi.JsApiHandler");
                        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.y1 y17 = ((nw4.n) gVar2).y();
                        if (y17 != null) {
                            if (str7 == null) {
                                str7 = "";
                            }
                            y17.b(str7, str9, b18);
                        }
                        env.f422396d.e(msg.f422546c, msg.f422552i + ":ok", null);
                    }
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiHandleMPPageAction", "wxConfig ex " + e17.getMessage());
                env.f422396d.e(msg.f422546c, msg.f422552i + ":fail ex " + e17 + ".message", null);
            }
            return true;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("getFuncFlag", str2)) {
            android.content.Context context11 = env.f422393a;
            boolean z18 = context11 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d;
            nw4.g gVar3 = env.f422396d;
            if (z18) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context11, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("shareFuncFlag", java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) context11).f265382q2.x()));
                gVar3.e(msg.f422546c, msg.f422552i + ":ok", hashMap);
            } else {
                gVar3.e(msg.f422546c, msg.f422552i + ":fail", null);
            }
            return true;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("sendMPPageData", str2)) {
            android.os.Bundle bundle5 = new android.os.Bundle();
            bundle5.putString("action", "sendMPPageData");
            java.lang.Object obj13 = ((java.util.HashMap) msg.f422323a).get(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj13, "null cannot be cast to non-null type kotlin.String");
            bundle5.putString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, (java.lang.String) obj13);
            java.lang.Object obj14 = ((java.util.HashMap) msg.f422323a).get("sendTo");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj14, "null cannot be cast to non-null type kotlin.String");
            bundle5.putString("sendTo", (java.lang.String) obj14);
            if (((java.util.HashMap) msg.f422323a).containsKey("webviewId")) {
                java.lang.Object obj15 = ((java.util.HashMap) msg.f422323a).get("webviewId");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj15, "null cannot be cast to non-null type kotlin.String");
                i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) obj15, 0);
            }
            bundle5.putInt("webviewId", i17);
            env.f422396d.e(msg.f422546c, msg.f422552i + ":ok", null);
            return true;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("hasActivity", str2)) {
            boolean z19 = env.f422393a instanceof android.app.Activity;
            nw4.g gVar4 = env.f422396d;
            if (z19) {
                gVar4.e(msg.f422546c, msg.f422552i + ":ok", null);
            } else {
                gVar4.e(msg.f422546c, msg.f422552i + ":fail", null);
            }
            return true;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("showMenu", str2)) {
            X(env, msg);
            return true;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("doFavorite", str2)) {
            nw4.g gVar5 = env.f422396d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(gVar5, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.jsapi.JsApiHandler");
            ((nw4.n) gVar5).j("sendAppMessage", false);
            nw4.g gVar6 = env.f422396d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(gVar6, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.jsapi.JsApiHandler");
            ((nw4.n) gVar6).J(null, 1);
            gVar6.e(msg.f422546c, msg.f422552i + ":ok", null);
            return true;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("showNavShadow", str2)) {
            Y(env, msg);
            return true;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("hideNavShadow", str2)) {
            android.content.Context context12 = env.f422393a;
            boolean z27 = context12 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d;
            nw4.g gVar7 = env.f422396d;
            if (z27) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context12, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
                android.view.View decorView = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) context12).getWindow().getDecorView();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decorView, "getDecorView(...)");
                android.view.View findViewById = decorView.findViewById(com.p314xaae8f345.mm.R.id.piu);
                if (findViewById != null && (decorView instanceof android.view.ViewGroup)) {
                    ((android.view.ViewGroup) decorView).removeView(findViewById);
                }
                gVar7.e(msg.f422546c, msg.f422552i + ":ok", null);
            } else {
                gVar7.e(msg.f422546c, msg.f422552i + ":fail", null);
            }
            return true;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("syncReadState", str2)) {
            d0(env, msg);
            return true;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("reportRecommend", str2)) {
            S(env, msg);
            return true;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("getTeenModeTemporaryVisitInfo", str2)) {
            D(env, msg);
            return true;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("setLocalData", str2)) {
            java.lang.Object obj16 = ((java.util.HashMap) msg.f422323a).get("url");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj16, "null cannot be cast to non-null type kotlin.String");
            java.lang.String str10 = (java.lang.String) ((java.util.HashMap) msg.f422323a).get("key");
            java.lang.String str11 = (java.lang.String) ((java.util.HashMap) msg.f422323a).get(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
            ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((com.p314xaae8f345.mm.sdk.p2603x2137b148.v3) ((jz5.n) f267842i).mo141623x754a37bb()).i()).D(y((java.lang.String) obj16) + ':' + str10, str11);
            env.f422396d.e(msg.f422546c, msg.f422552i + ":ok", null);
            return true;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("getLocalData", str2)) {
            java.lang.Object obj17 = ((java.util.HashMap) msg.f422323a).get("url");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj17, "null cannot be cast to non-null type kotlin.String");
            java.lang.String str12 = (java.lang.String) ((java.util.HashMap) msg.f422323a).get("key");
            java.lang.String t27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.v3.t((com.p314xaae8f345.mm.sdk.p2603x2137b148.v3) ((jz5.n) f267842i).mo141623x754a37bb(), y((java.lang.String) obj17) + ':' + str12, null, 2, null);
            if (t27 == null) {
                t27 = "";
            }
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, t27);
            env.f422396d.e(msg.f422546c, msg.f422552i + ":ok", hashMap2);
            return true;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("reportByLeaveForMPGateway", str2)) {
            Q(env, msg);
            return true;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("getEnterTime", str2)) {
            x(env, msg);
            return true;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("getNavigationBarHeight", str2)) {
            A(env, msg);
            return true;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("kv", str2)) {
            J(env, msg);
            return true;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("idKey", str2)) {
            F(env, msg);
            return true;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("showActionSheet", str2)) {
            U(env, msg);
            return true;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.g5.f34325x24728b, str2)) {
            int i18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.y((java.lang.String) ((java.util.HashMap) msg.f422323a).get("disable"), false) ? Integer.MAX_VALUE : 0;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a592 = env.f422397e;
            if (c22633x83752a592 != null && (mo120153xd15cf999 = c22633x83752a592.mo120153xd15cf999()) != null) {
                mo120153xd15cf999.x(i18);
            }
            return true;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("getWebTransStatus", str2)) {
            K(env, msg);
            return true;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("doFavoriteExcerpt", str2)) {
            p(env, msg);
            return true;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("delFavoriteExcerpt", str2)) {
            return k(env, msg);
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("shareExcerpts", str2)) {
            T(env, msg);
            return true;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(be1.r0.f4233x24728b, str2)) {
            R(env, msg);
            return true;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("isSupportAddToTingPlayList", str2)) {
            H(env, msg);
            return true;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("getLiveStatus", str2)) {
            z(env, msg);
            return true;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("syncPhotoSwitch", str2)) {
            c0(env, msg);
            return true;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("checkCanCreatePhotoAccount", str2)) {
            g(env, msg);
            return true;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("openFinderLive", str2)) {
            L(env, msg);
            return true;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("deleteBrandOutboxMsgId", str2)) {
            return n(env, msg);
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("disableExposeAlert", str2)) {
            o(env, msg);
            return true;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("showTingEntry", str2)) {
            return Z(env, msg);
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("switchPublishImageEntry", str2)) {
            return b0(env, msg);
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("isEnabledForCircleToSearch", str2)) {
            G(env, msg);
            return true;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("getDraftData", str2)) {
            w(env, msg);
            return true;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.le.f34433x24728b, str2)) {
            a0(env, msg);
            return true;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("showChatBotPrivacyPageSheet", str2)) {
            V(env, msg);
            return true;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("preloadImage", str2)) {
            P(env, msg);
            return true;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("getClientLanguage", str2)) {
            u(env, msg);
            return true;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("getClientTranslateLanguage", str2)) {
            v(env, msg);
            return true;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("deleteBizArticle", str2)) {
            m(env, msg);
            return true;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("openMPApp", str2)) {
            M(env, msg);
            return true;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("showInteractiveHalfScreenProfile", str2)) {
            W(env, msg);
            return true;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("cleanPageData", str2)) {
            i(env, msg);
            return true;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("createWxInputConnection", str2)) {
            j(env, msg);
            return true;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("startMpKeyBoard", str2)) {
            r(env, msg, true);
            return true;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("stopMpKeyBoard", str2)) {
            r(env, msg, false);
            return true;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("joinChatBotRoom", str2)) {
            I(env, msg);
            return true;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("getSingleSendButton", str2)) {
            C(env, msg);
            return true;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("getPosition", str2)) {
            B(env, msg);
            return true;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("openPublishEditFromMoment", str2)) {
            N(env, msg);
            return true;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("postDataToMiniApp", str2)) {
            O(env, msg);
            return true;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("bizImagePreview", str2)) {
            f(env, msg);
            return true;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("paySuccess", str2)) {
            m0.g0.b(env, msg);
            return true;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("isGPVersion", str2)) {
            m0.g0.a(env, msg);
            return true;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("requestTeenModeTemporaryVisit", str2)) {
            m0.g0.d(env, msg);
            return true;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b("setScrollIndicatorVisable", str2)) {
            return false;
        }
        m0.g0.c(env, msg);
        return true;
    }

    public final boolean a0(nw4.k kVar, nw4.y2 y2Var) {
        java.lang.Object obj = y2Var.f422323a.get("entrance");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str == null) {
            str = "0";
        }
        int parseInt = java.lang.Integer.parseInt(str);
        tg0.f1 f1Var = (tg0.f1) i95.n0.c(tg0.f1.class);
        android.content.Context context = kVar.f422393a;
        tu4.a aVar = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.api.p2394xa67a4678.C19210xff3b4386.f262975u;
        java.util.Map params = y2Var.f422323a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(params, "params");
        org.json.JSONObject a17 = ri.l0.a(params);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a17);
        ((sg0.e) f1Var).Ai(context, 7, parseInt, aVar.a(a17).b());
        kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":ok", kz5.q0.f395534d);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return f267839f;
    }

    public final boolean b0(nw4.k kVar, nw4.y2 y2Var) {
        android.content.Context context = kVar.f422393a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d ? (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) context : null;
        if (viewOnCreateContextMenuListenerC19337x37f3384d != null) {
            java.lang.Object obj = y2Var.f422323a.get("show");
            nf.e.f(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.i5(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.y(obj instanceof java.lang.String ? (java.lang.String) obj : null, false), viewOnCreateContextMenuListenerC19337x37f3384d, kVar, y2Var));
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiHandleMPPageAction", "wrong ctx");
        kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":fail", kz5.b1.e(new jz5.l("err_desc", "context is not webviewUI")));
        return false;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return f267840g;
    }

    public final boolean c0(nw4.k kVar, nw4.y2 y2Var) {
        java.lang.Object obj = y2Var.f422323a.get("enable");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str == null) {
            str = "0";
        }
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str, 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleMPPageAction", "syncPhotoSwitch enable:" + P);
        com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p646xf2865d2e.C10321x9368f258(P == 1), rm.g0.class, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.j5.f267810d);
        kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":ok", null);
        return true;
    }

    @Override // qw4.a
    public boolean d() {
        return f267841h;
    }

    public final boolean d0(nw4.k kVar, nw4.y2 y2Var) {
        android.content.Context context = kVar.f422393a;
        boolean z17 = context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d;
        nw4.g gVar = kVar.f422396d;
        if (!z17) {
            gVar.e(y2Var.f422546c, y2Var.f422552i + ":fail", null);
            return true;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) y2Var.f422323a.get("state"), 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleMPPageAction", "handleMPPageAction syncReadState state=" + P);
        vx4.d dVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) context).F2;
        if (dVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebMultiTaskHelper", "sync Read State %d", java.lang.Integer.valueOf(P));
            dVar.f522852z = true;
            if (P == 0) {
                dVar.f522851y = false;
                dVar.j();
                dVar.m(null);
            } else {
                dVar.f522851y = true;
                dVar.D();
            }
        }
        gVar.e(y2Var.f422546c, y2Var.f422552i + ":ok", null);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x01d0, code lost:
    
        if ((r0.length() > 0) != false) goto L97;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0185 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(nw4.k r21, nw4.y2 r22) {
        /*
            Method dump skipped, instructions count: 655
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.k5.f(nw4.k, nw4.y2):boolean");
    }

    public final boolean g(nw4.k kVar, nw4.y2 y2Var) {
        java.lang.Object obj = y2Var.f422323a.get(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811);
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str == null) {
            str = "0";
        }
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str, 0);
        if (P == 0 || P == 1 || P == 3) {
            com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p646xf2865d2e.C10317x326182f0(P), rm.i.class, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.x3(P, kVar, y2Var));
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiHandleMPPageAction", "checkCanCreatePhotoAccount invalid scene=" + P);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("err_desc", "invalid scene: " + P);
        kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":fail", hashMap);
        return true;
    }

    public final boolean h(nw4.k kVar, nw4.y2 y2Var) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) y2Var.f422323a.get("mpUrl"))) {
            kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":fail, mpUrl is null", null);
            return false;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) y2Var.f422323a.get("bizUsrName"))) {
            kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":fail, bizUsrName is null", null);
            return false;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) y2Var.f422323a.get("videoUrl"))) {
            kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":fail, videoUrl is null", null);
            return false;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) y2Var.f422323a.get("videoVid"))) {
            return true;
        }
        kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":fail, videoVid is null", null);
        return false;
    }

    public final boolean i(nw4.k kVar, nw4.y2 y2Var) {
        java.lang.String str = (java.lang.String) ((java.util.HashMap) y2Var.f422323a).get("url");
        if (str == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiHandleMPPageAction", "cleanPageData: url is null");
            kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":fail url is null", null);
            return true;
        }
        if (((zq1.a0) gm0.j1.s(zq1.a0.class)) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiHandleMPPageAction", "cleanPageData: service is null");
            kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":fail service is null", null);
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleMPPageAction", "cleanPageData");
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t1.f175968a.l(str);
        kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":ok", null);
        return true;
    }

    public final boolean j(nw4.k kVar, nw4.y2 y2Var) {
        jz5.f0 f0Var;
        android.content.Context context = kVar.f422393a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d ? (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) context : null;
        nw4.g gVar = kVar.f422396d;
        if (viewOnCreateContextMenuListenerC19337x37f3384d != null) {
            if (viewOnCreateContextMenuListenerC19337x37f3384d.C2 == null) {
                viewOnCreateContextMenuListenerC19337x37f3384d.C2 = new fy4.e(viewOnCreateContextMenuListenerC19337x37f3384d);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = viewOnCreateContextMenuListenerC19337x37f3384d.f265348f;
            if (c22633x83752a59 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewUI", "initWebviewWxInputConnHelper viewWV is null");
            } else {
                c22633x83752a59.m81407xb4a4763b(viewOnCreateContextMenuListenerC19337x37f3384d.C2);
            }
            gVar.e(y2Var.f422546c, y2Var.f422552i + ":ok", null);
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var != null) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiHandleMPPageAction", "wrong ctx");
        gVar.e(y2Var.f422546c, y2Var.f422552i + ":fail", null);
        return true;
    }

    public final boolean k(nw4.k kVar, nw4.y2 y2Var) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.Object obj = y2Var.f422323a.get("excerptKeys");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.String");
        java.lang.String str3 = (java.lang.String) obj;
        java.lang.Object obj2 = y2Var.f422323a.get("pageKey");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
        java.lang.String str4 = (java.lang.String) obj2;
        java.lang.String str5 = (java.lang.String) y2Var.f422323a.get("url");
        java.lang.String str6 = (java.lang.String) y2Var.f422323a.get("src_displayname");
        java.lang.String str7 = (java.lang.String) y2Var.f422323a.get("itemShowType");
        java.lang.String str8 = (java.lang.String) y2Var.f422323a.get("src_username");
        java.lang.String str9 = (java.lang.String) y2Var.f422323a.get("userName");
        java.lang.String valueOf = java.lang.String.valueOf(str5);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5)) {
            zg0.q2 a17 = kVar.a();
            if (a17 == null || (str2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0) a17).f263497y) == null) {
                java.lang.Object obj3 = y2Var.f422323a.get("key_webview_init_url");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj3, "null cannot be cast to non-null type kotlin.String");
                str2 = (java.lang.String) obj3;
            }
            str = str2;
        } else {
            str = valueOf;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return false;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            int l17 = l(str3, str4, str, str6, str7, str8, str9);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleMPPageAction", "[delFavoriteExcerpt] main process result = " + l17);
            E(kVar, y2Var, l17, -1L);
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fav.api.C13541xc326d6f1 c13541xc326d6f1 = new com.p314xaae8f345.mm.p1006xc5476f33.fav.api.C13541xc326d6f1();
        c13541xc326d6f1.f181748d = str3;
        c13541xc326d6f1.f181749e = str4;
        c13541xc326d6f1.f181750f = str;
        if (str6 == null) {
            str6 = "";
        }
        c13541xc326d6f1.f181751g = str6;
        if (str7 == null) {
            str7 = "";
        }
        c13541xc326d6f1.f181752h = str7;
        if (str8 == null) {
            str8 = "";
        }
        c13541xc326d6f1.f181753i = str8;
        if (str9 == null) {
            str9 = "";
        }
        c13541xc326d6f1.f181754m = str9;
        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10754x630c9a2 c10754x630c9a2 = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10754x630c9a2) com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, c13541xc326d6f1, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.r3.class);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleMPPageAction", "[delFavoriteExcerpt] tools process result = " + c10754x630c9a2.f149937d);
        E(kVar, y2Var, c10754x630c9a2.f149937d, -1L);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00eb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int l(java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.k5.l(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):int");
    }

    public final boolean m(nw4.k kVar, nw4.y2 y2Var) {
        java.lang.Object obj = y2Var.f422323a.get("bizType");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str == null) {
            str = "0";
        }
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str, 1);
        java.lang.Object obj2 = y2Var.f422323a.get("msgId");
        java.lang.String str2 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
        java.lang.String str3 = str2 == null ? "0" : str2;
        int p07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p0(str3, 0);
        if (p07 == 0) {
            kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":fail invalid msgId", null);
            return true;
        }
        java.lang.Object obj3 = y2Var.f422323a.get("idx");
        java.lang.String str4 = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
        int P2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str4 != null ? str4 : "0", 0);
        java.lang.Object obj4 = y2Var.f422323a.get(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
        java.lang.String str5 = obj4 instanceof java.lang.String ? (java.lang.String) obj4 : null;
        if (str5 == null) {
            str5 = "";
        }
        java.lang.String str6 = str5;
        java.lang.Object obj5 = y2Var.f422323a.get("showSuccessToast");
        java.lang.String str7 = obj5 instanceof java.lang.String ? (java.lang.String) obj5 : null;
        if (str7 == null) {
            str7 = "false";
        }
        ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.l4(kVar, str6, p07, P2, P, y2Var, str3, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.y(str7, false)));
        return true;
    }

    public final boolean n(nw4.k kVar, nw4.y2 y2Var) {
        int i17;
        java.lang.Object obj = y2Var.f422323a.get("appMsgId");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        java.lang.Object obj2 = y2Var.f422323a.get("bizType");
        java.lang.Integer num = obj2 instanceof java.lang.Integer ? (java.lang.Integer) obj2 : null;
        if (num != null) {
            i17 = num.intValue();
        } else {
            tk.s[] sVarArr = tk.s.f501403d;
            i17 = 1;
        }
        if (str != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleMPPageAction", "appMsgId: ".concat(str));
            com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.C19441x5dcb5637(str, i17), com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.t3.class, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.m4(kVar, y2Var));
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleMPPageAction", "try deleteBrandOutbox, but appMsgId isInvalid: " + y2Var.f422323a.get("appMsgId"));
        kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":fail", kz5.b1.e(new jz5.l("err_desc", "appMsgId is invalid")));
        return false;
    }

    public final boolean o(nw4.k kVar, nw4.y2 y2Var) {
        android.content.Context context = kVar.f422393a;
        boolean z17 = context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d;
        nw4.g gVar = kVar.f422396d;
        if (!z17) {
            gVar.e(y2Var.f422546c, y2Var.f422552i + ":fail", null);
            return true;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) context;
        java.lang.Object obj = y2Var.f422323a.get("disable");
        java.lang.Boolean bool = obj instanceof java.lang.Boolean ? (java.lang.Boolean) obj : null;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6 c6Var = viewOnCreateContextMenuListenerC19337x37f3384d.f265382q2;
            if (c6Var != null) {
                c6Var.f265592p = booleanValue ? com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.m7.DISABLED : com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.m7.ENABLED;
            }
        }
        gVar.e(y2Var.f422546c, y2Var.f422552i + ":ok", null);
        return true;
    }

    public final boolean p(nw4.k kVar, nw4.y2 y2Var) {
        java.lang.Object obj = y2Var.f422323a.get(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.String");
        java.lang.String str = (java.lang.String) obj;
        java.lang.Object obj2 = y2Var.f422323a.get("excerptList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
        java.lang.String str2 = (java.lang.String) obj2;
        java.lang.Object obj3 = y2Var.f422323a.get("cover");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj3, "null cannot be cast to non-null type kotlin.String");
        java.lang.String str3 = (java.lang.String) obj3;
        java.lang.Object obj4 = y2Var.f422323a.get("key_webview_init_url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj4, "null cannot be cast to non-null type kotlin.String");
        java.lang.String str4 = (java.lang.String) obj4;
        java.lang.Object obj5 = y2Var.f422323a.get("pageKey");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj5, "null cannot be cast to non-null type kotlin.String");
        java.lang.String str5 = (java.lang.String) obj5;
        java.lang.String str6 = (java.lang.String) y2Var.f422323a.get("src_displayname");
        java.lang.String str7 = (java.lang.String) y2Var.f422323a.get("itemShowType");
        java.lang.String str8 = (java.lang.String) y2Var.f422323a.get("src_username");
        java.lang.String str9 = (java.lang.String) y2Var.f422323a.get("userName");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            int q17 = q(str, str2, str3, str4, str5, str6, str7, str8, str9);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleMPPageAction", "[doFavoriteExcerpt] main process result = " + q17);
            E(kVar, y2Var, q17, -1L);
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fav.api.C13542x92d0b3b1 c13542x92d0b3b1 = new com.p314xaae8f345.mm.p1006xc5476f33.fav.api.C13542x92d0b3b1();
        c13542x92d0b3b1.f181755d = str;
        c13542x92d0b3b1.f181756e = str2;
        c13542x92d0b3b1.f181757f = str3;
        c13542x92d0b3b1.f181758g = str4;
        c13542x92d0b3b1.f181759h = str5;
        if (str6 == null) {
            str6 = "";
        }
        c13542x92d0b3b1.f181760i = str6;
        if (str7 == null) {
            str7 = "";
        }
        c13542x92d0b3b1.f181761m = str7;
        if (str8 == null) {
            str8 = "";
        }
        c13542x92d0b3b1.f181762n = str8;
        if (str9 == null) {
            str9 = "";
        }
        c13542x92d0b3b1.f181763o = str9;
        android.os.Bundle bundle = (android.os.Bundle) com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, c13542x92d0b3b1, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.u3.class);
        if (bundle == null) {
            return true;
        }
        int i17 = bundle.getInt("key_result_code", 2);
        long j17 = bundle.getLong("key_result_id", -1L);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleMPPageAction", "[doFavoriteExcerpt] tools process result code = " + i17 + ", favId = " + j17);
        E(kVar, y2Var, i17, j17);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00e5 A[LOOP:1: B:30:0x00e0->B:32:0x00e5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0192 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0164  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int q(java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.k5.q(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):int");
    }

    public final boolean r(nw4.k kVar, nw4.y2 y2Var, boolean z17) {
        jz5.f0 f0Var;
        jz5.f0 f0Var2;
        android.content.Context context = kVar.f422393a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d ? (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) context : null;
        nw4.g gVar = kVar.f422396d;
        if (viewOnCreateContextMenuListenerC19337x37f3384d != null) {
            fy4.e eVar = viewOnCreateContextMenuListenerC19337x37f3384d.C2;
            f0Var = jz5.f0.f384359a;
            if (eVar != null) {
                eVar.f348793e = z17;
                gVar.e(y2Var.f422546c, y2Var.f422552i + ":ok", null);
                f0Var2 = f0Var;
            } else {
                f0Var2 = null;
            }
            if (f0Var2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiHandleMPPageAction", "webViewInputConnHelper is null");
                gVar.e(y2Var.f422546c, y2Var.f422552i + ":fail no inputConnection", null);
            }
        } else {
            f0Var = null;
        }
        if (f0Var != null) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiHandleMPPageAction", "wrong ctx");
        gVar.e(y2Var.f422546c, y2Var.f422552i + ":fail", null);
        return true;
    }

    public final boolean s(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.util.LinkedList linkedList, java.lang.String str6, java.lang.String str7, int i17) {
        if (ot0.f.f(i17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiHandleMPPageAction", "[favoriteUrl] itemShowType isBizVideo = " + i17);
            return false;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73();
        am.c4 c4Var = c5303xc75d2f73.f135623g;
        c4Var.f87861n = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.z zVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.z();
        zVar.f264750h = true;
        zVar.f264746d = str4;
        zVar.f264744b = str2;
        zVar.f264745c = str3;
        zVar.f264747e = "";
        zVar.f264748f = str5;
        zVar.f264749g = linkedList;
        zVar.f264743a = str;
        r45.qp0 qp0Var = new r45.qp0();
        zVar.f264752j = qp0Var;
        qp0Var.f465695d = i17;
        qp0Var.f465702n = str7;
        qp0Var.f465703o = java.lang.String.valueOf(str6);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.a0.a(c5303xc75d2f73, zVar);
        c4Var.f87864q = false;
        c5303xc75d2f73.e();
        if (c5303xc75d2f73.f135624h.f87966a == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleMPPageAction", "[favoriteUrl] do favorite success");
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiHandleMPPageAction", "[favoriteUrl] do favorite fail");
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0173  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ot0.m1 t(nw4.k r26, nw4.y2 r27) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.k5.t(nw4.k, nw4.y2):ot0.m1");
    }

    public final boolean u(nw4.k kVar, nw4.y2 y2Var) {
        boolean z17 = kVar.f422393a instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d;
        nw4.g gVar = kVar.f422396d;
        if (!z17) {
            gVar.e(y2Var.f422546c, y2Var.f422552i + ":fail", null);
            return true;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String f17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(f17);
        hashMap.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37655xccbf8c68, f17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleMPPageAction", "getClientLanguage lan: ".concat(f17));
        gVar.e(y2Var.f422546c, y2Var.f422552i + ":ok", hashMap);
        return true;
    }

    public final boolean v(nw4.k kVar, nw4.y2 y2Var) {
        boolean z17 = kVar.f422393a instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d;
        nw4.g gVar = kVar.f422396d;
        if (!z17) {
            gVar.e(y2Var.f422546c, y2Var.f422552i + ":fail", null);
            return true;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getActualTranslateLanguageIso(...)");
        hashMap.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37655xccbf8c68, c17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleMPPageAction", "getClientTranslateLanguage lan: ".concat(c17));
        gVar.e(y2Var.f422546c, y2Var.f422552i + ":ok", hashMap);
        return true;
    }

    public final boolean w(nw4.k kVar, nw4.y2 y2Var) {
        java.lang.Object obj = y2Var.f422323a.get("type");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str == null) {
            str = "0";
        }
        int D1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(str, 0);
        if (D1 == 0) {
            kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":fail draftType error", null);
            return true;
        }
        java.lang.Object obj2 = y2Var.f422323a.get("bizType");
        java.lang.String str2 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
        if (str2 == null) {
            str2 = "1";
        }
        int D12 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(str2, 0);
        java.lang.Object obj3 = y2Var.f422323a.get(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811);
        java.lang.String str3 = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
        if (str3 == null) {
            str3 = "";
        }
        ((ur1.s) ((rm.b0) i95.n0.c(rm.b0.class))).Vi(D1, str3, D12, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p4(kVar, y2Var));
        return true;
    }

    public final boolean x(nw4.k kVar, nw4.y2 y2Var) {
        hy4.k0 k0Var;
        hy4.k0 k0Var2;
        boolean z17 = kVar.f422393a instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d;
        nw4.g gVar = kVar.f422396d;
        if (!z17) {
            gVar.e(y2Var.f422546c, y2Var.f422552i + ":fail", null);
            return true;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        zg0.q2 a17 = kVar.a();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0 r0Var = a17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0 ? (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0) a17 : null;
        long j17 = 0;
        hashMap.put("clickTimeMs", java.lang.Long.valueOf((r0Var == null || (k0Var2 = r0Var.V) == null) ? 0L : k0Var2.f367670s));
        zg0.q2 a18 = kVar.a();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0 r0Var2 = a18 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0 ? (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0) a18 : null;
        if (r0Var2 != null && (k0Var = r0Var2.V) != null) {
            j17 = k0Var.f367673v;
        }
        hashMap.put("enterTimeMs", java.lang.Long.valueOf(j17));
        gVar.e(y2Var.f422546c, y2Var.f422552i + ":ok", hashMap);
        return true;
    }

    public final java.lang.String y(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<this>");
        try {
            java.lang.String host = android.net.Uri.parse(str).getHost();
            return host == null ? "unknow" : host;
        } catch (java.lang.Exception unused) {
            return "unknow";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean z(nw4.k kVar, nw4.y2 y2Var) {
        int i17;
        java.util.HashMap hashMap = new java.util.HashMap();
        zg0.q2 a17 = kVar.a();
        java.lang.String Z = a17 != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0) a17).Z() : null;
        zq1.a0 a0Var = (zq1.a0) gm0.j1.s(zq1.a0.class);
        if (a0Var != null && (kVar.f422393a instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d)) {
            yq1.z zVar = (yq1.z) a0Var;
            if (zVar.o(Z)) {
                android.content.Context context = kVar.f422393a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
                java.lang.String stringExtra = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) context).getIntent().getStringExtra("srcUsername");
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleMPPageAction", "doGetLiveStatus userName null)");
                } else {
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(zVar.i(stringExtra))) {
                        i17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0.f270730a.o(stringExtra);
                        hashMap.put("liveStatus", java.lang.Integer.valueOf(i17));
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleMPPageAction", "getLiveStatus status:" + hashMap.get("liveStatus"));
                        kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":ok", hashMap);
                        return true;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleMPPageAction", "doGetLiveStatus exportId null");
                }
                i17 = 0;
                hashMap.put("liveStatus", java.lang.Integer.valueOf(i17));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleMPPageAction", "getLiveStatus status:" + hashMap.get("liveStatus"));
                kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":ok", hashMap);
                return true;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleMPPageAction", "openFinderLive service pre condition check fail. url:%s", Z);
        i17 = 0;
        hashMap.put("liveStatus", java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleMPPageAction", "getLiveStatus status:" + hashMap.get("liveStatus"));
        kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":ok", hashMap);
        return true;
    }
}
