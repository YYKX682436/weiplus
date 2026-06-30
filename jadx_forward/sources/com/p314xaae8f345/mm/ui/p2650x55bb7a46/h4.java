package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes12.dex */
public class h4 implements com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.k5 {

    /* renamed from: w, reason: collision with root package name */
    public static boolean f283168w = true;

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 f283169a;

    /* renamed from: b, reason: collision with root package name */
    public bm5.x0 f283170b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f283171c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.z3 f283172d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f283173e;

    /* renamed from: f, reason: collision with root package name */
    public final bm5.x0 f283174f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f283175g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f283176h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f283177i;

    /* renamed from: j, reason: collision with root package name */
    public final yb5.d f283178j;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f283179k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f283180l = "";

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.e1 f283181m = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.m4(this);

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.f1 f283182n = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.n4(this);

    /* renamed from: o, reason: collision with root package name */
    public volatile boolean f283183o = false;

    /* renamed from: p, reason: collision with root package name */
    public volatile boolean f283184p = false;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.Object f283185q = new java.lang.Object();

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f283186r = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p4(this), true);

    /* renamed from: s, reason: collision with root package name */
    public boolean f283187s = false;

    /* renamed from: t, reason: collision with root package name */
    public int f283188t = 0;

    /* renamed from: u, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f283189u = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.q4(this), true);

    /* renamed from: v, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.u f283190v;

    public h4(yb5.d dVar, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33, java.lang.String str) {
        this.f283179k = "";
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.s4 s4Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.s4(this);
        this.f283190v = s4Var;
        this.f283178j = dVar;
        this.f283169a = c19666xfd6e2f33;
        this.f283171c = str;
        this.f283172d = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(str, true);
        boolean R4 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(dVar.x());
        this.f283175g = R4;
        this.f283176h = R4;
        this.f283174f = new bm5.x0(new bm5.w0() { // from class: com.tencent.mm.ui.chatting.h4$$a
            @Override // bm5.w0
            public final java.lang.Object a() {
                return (android.os.Vibrator) com.p314xaae8f345.mm.ui.p2650x55bb7a46.h4.this.f283178j.g().getSystemService("vibrator");
            }
        });
        this.f283170b = new bm5.x0(new bm5.w0() { // from class: com.tencent.mm.ui.chatting.h4$$c
            @Override // bm5.w0
            public final java.lang.Object a() {
                com.p314xaae8f345.mm.p944x882e457a.g1 p0Var;
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.h4 h4Var = com.p314xaae8f345.mm.ui.p2650x55bb7a46.h4.this;
                if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.I4(h4Var.f283171c)) {
                    p0Var = new zf4.w();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingFooterEventImpl", "initRecorder new VoiceRemindRecorder().");
                } else {
                    p0Var = new tl.p0(h4Var.f283178j.g(), false);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingFooterEventImpl", "initRecorder new SceneVoiceRecorder, not use Speex");
                }
                p0Var.h(h4Var.f283182n);
                p0Var.b(h4Var.f283181m);
                return p0Var;
            }
        });
        c19666xfd6e2f33.m75477x9496deb9(s4Var);
        ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_jump_to_record_media, true);
        this.f283179k = (java.lang.String) c01.d9.b().p().l(2, null);
    }

    public static com.p314xaae8f345.mm.ui.p2650x55bb7a46.a5 H(org.json.JSONObject jSONObject, java.lang.String str) {
        if (jSONObject == null || !jSONObject.has("wording")) {
            return null;
        }
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("wording");
        if (!optJSONObject.has(str)) {
            return null;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.a5 a5Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.a5();
        org.json.JSONObject optJSONObject2 = optJSONObject.optJSONObject(str);
        a5Var.f279896a = optJSONObject2.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
        a5Var.f279897b = optJSONObject2.optString("desc");
        return a5Var;
    }

    public static com.p314xaae8f345.mm.ui.p2650x55bb7a46.a5 J(com.p314xaae8f345.mm.ui.p2650x55bb7a46.b5 b5Var) {
        if (b5Var == null) {
            return null;
        }
        java.lang.String d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d();
        return "zh_CN".equals(d17) ? b5Var.f280020b : "zh_TW".equals(d17) ? b5Var.f280022d : "zh_HK".equals(d17) ? b5Var.f280021c : b5Var.f280023e;
    }

    public static boolean M(java.lang.String str) {
        java.lang.Integer num;
        boolean z17;
        ((pg0.s3) ((qg0.h0) i95.n0.c(qg0.h0.class))).getClass();
        java.util.HashMap hashMap = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.f226985a;
        if (c01.e2.S(str)) {
            num = (java.lang.Integer) c01.d9.b().p().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LUCKY_MONEY_NEWYEAR_UNION_SWITCH_INT_SYNC, 0);
        } else {
            ((pg0.s3) ((qg0.h0) i95.n0.c(qg0.h0.class))).getClass();
            num = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.s() ? (java.lang.Integer) c01.d9.b().p().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LUCKY_MONEY_HK_NEWYEAR_SWITCH_INT_SYNC, 0) : (java.lang.Integer) c01.d9.b().p().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LUCKY_MONEY_NEWYEAR_SWITCH_INT_SYNC, 0);
        }
        java.lang.Integer num2 = (java.lang.Integer) c01.d9.b().p().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LUCKY_MONEY_NEWYEAR_LOCAL_SWITCH_INT, 0);
        if (!(c01.z1.m() == 0)) {
            ((pg0.s3) ((qg0.h0) i95.n0.c(qg0.h0.class))).getClass();
            if (!com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.s()) {
                z17 = false;
                return (num.intValue() != 1 || num2.intValue() == 1) || !z17;
            }
        }
        z17 = true;
        if (num.intValue() != 1 || num2.intValue() == 1) {
        }
    }

    public static void O(int i17, int i18, java.lang.String str) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6366xdea69d8b c6366xdea69d8b = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6366xdea69d8b();
        c6366xdea69d8b.f137155d = i17;
        c6366xdea69d8b.f137158g = java.lang.System.currentTimeMillis();
        c6366xdea69d8b.f137156e = c6366xdea69d8b.b("SessionId", str, true);
        c6366xdea69d8b.f137157f = i18;
        c6366xdea69d8b.k();
    }

    public static void u(com.p314xaae8f345.mm.ui.p2650x55bb7a46.h4 h4Var, java.lang.String str, boolean z17) {
        h4Var.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("redenvelope_entry_has_reddot", java.lang.Boolean.valueOf(z17));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("redenvelope_entry_actionsheet_hb", str, hashMap, 34068);
    }

    public static void v(com.p314xaae8f345.mm.ui.p2650x55bb7a46.h4 h4Var, java.lang.String str) {
        h4Var.getClass();
        android.content.Intent intent = new android.content.Intent();
        int wi6 = ((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(h4Var.I());
        intent.putExtra("key_way", 1);
        intent.putExtra("key_chatroom_num", wi6);
        intent.putExtra("key_type", 1);
        intent.putExtra("key_from", 1);
        intent.putExtra("key_username", h4Var.I());
        intent.putExtra("key_session_id", str);
        intent.putExtra("pay_channel", 14);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        yb5.d dVar = h4Var.f283178j;
        g0Var.d(25925, 2, 3, java.lang.Float.valueOf(i65.a.q(dVar.g())), 0, 0);
        ((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).bj();
        j45.l.j(dVar.g(), "luckymoney", ".ui.LuckyMoneyNewPrepareUI", intent, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0106 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void w(com.p314xaae8f345.mm.ui.p2650x55bb7a46.h4 r23) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.h4.w(com.tencent.mm.ui.chatting.h4):void");
    }

    public static void x(com.p314xaae8f345.mm.ui.p2650x55bb7a46.h4 h4Var) {
        h4Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingFooterEventImpl", "do get config");
        java.lang.String I = h4Var.I();
        qg0.h0 h0Var = (qg0.h0) i95.n0.c(qg0.h0.class);
        java.lang.String I2 = h4Var.I();
        ((pg0.s3) h0Var).getClass();
        java.util.HashMap hashMap = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.f226985a;
        boolean S = c01.e2.S(I2);
        int i17 = 0;
        if (S) {
            int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LUCKY_MONEY_ENVELOPE_HAS_SOURCE_INT_SYNC, 0)).intValue();
            ((pg0.a3) ((qg0.b0) i95.n0.c(qg0.b0.class))).getClass();
            gm0.j1.d().g(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.y5("v1.0", intValue, I));
            return;
        }
        ((pg0.s3) ((qg0.h0) i95.n0.c(qg0.h0.class))).getClass();
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.s()) {
            ((pg0.a3) ((qg0.b0) i95.n0.c(qg0.b0.class))).getClass();
            gm0.j1.d().g(new yb3.f(I));
            return;
        }
        int intValue2 = ((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LUCKY_MONEY_ENVELOPE_HAS_SOURCE_INT_SYNC, 0)).intValue();
        boolean R4 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(I);
        yb5.d dVar = h4Var.f283178j;
        if (R4) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(25925, 2, 3, java.lang.Float.valueOf(i65.a.q(dVar.g())), 0, 0);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(25925, 1, 1, java.lang.Float.valueOf(i65.a.q(dVar.g())), 0, 0);
            i17 = 25;
        }
        ((pg0.a3) ((qg0.b0) i95.n0.c(qg0.b0.class))).getClass();
        gm0.j1.d().g(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.x5(i17, "v1.0", intValue2, I));
    }

    public static void y(com.p314xaae8f345.mm.ui.p2650x55bb7a46.h4 h4Var, java.lang.String str) {
        h4Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.d(11701, 1, 0, 0, 1, 1);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_way", 0);
        intent.putExtra("key_type", 0);
        intent.putExtra("key_from", 1);
        intent.putExtra("key_username", h4Var.I());
        intent.putExtra("key_session_id", str);
        intent.putExtra("pay_channel", 11);
        yb5.d dVar = h4Var.f283178j;
        g0Var.d(25925, 1, 1, java.lang.Float.valueOf(i65.a.q(dVar.g())), 0, 0);
        ((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).bj();
        j45.l.j(dVar.g(), "luckymoney", ".ui.LuckyMoneyNewPrepareUI", intent, null);
    }

    public void A() {
        boolean z17;
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        yb5.d dVar = this.f283178j;
        android.app.Activity g17 = dVar.g();
        ((sb0.f) jVar).getClass();
        boolean a17 = j35.u.a(g17, "android.permission.CAMERA", 22, "", "");
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(a17);
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingFooterEventImpl", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", valueOf, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3(), dVar.g());
        if (a17) {
            tb0.j jVar2 = (tb0.j) i95.n0.c(tb0.j.class);
            android.app.Activity g18 = dVar.g();
            ((sb0.f) jVar2).getClass();
            boolean a18 = j35.u.a(g18, "android.permission.RECORD_AUDIO", 22, "", "");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingFooterEventImpl", "summerper checkPermission checkmicrophone[%b], stack[%s], activity[%s]", java.lang.Boolean.valueOf(a18), new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3(), dVar.g());
            if (a18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingFooterEventImpl", "onEnterMultiTalk");
                android.content.Intent intent = new android.content.Intent();
                if (((va3.z0) q21.d.a()).f(I())) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingFooterEventImpl", "onEnterMultiTalk, but now is in share location!");
                    dp.a.m125853x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.f573854g16, 0).show();
                    return;
                }
                if (I() != null) {
                    java.util.List P6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y.class)).P6(I());
                    java.lang.String str = (java.lang.String) c01.d9.b().p().l(2, null);
                    boolean q47 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y.class)).q4(I());
                    java.util.Iterator it = P6.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z17 = false;
                            break;
                        }
                        java.lang.String str2 = (java.lang.String) it.next();
                        if (str != null && str.equals(str2)) {
                            z17 = true;
                            break;
                        }
                    }
                    if (P6.size() >= zj3.j.e() && !z17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingFooterEventImpl", "onEnterMultiTalk, but > max 9 members!");
                        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                        dp.a.m125854x26a183b(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574125h26, zj3.j.e() + ""), 0).show();
                        return;
                    }
                    if (z17) {
                        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y.class)).y8()) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingFooterEventImpl", "onEnterMultiTalk, but already in it!");
                            android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                            dp.a.m125854x26a183b(context2, context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.h1r), 0).show();
                            return;
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingFooterEventImpl", "onEnterMultiTalk, already inlist, but in fact not multitalking now!");
                    }
                    if (((com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y.class)).ff()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingFooterEventImpl", "onEnterMultiTalk, but already in VoIP or multitalk!");
                        android.content.Context context3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                        dp.a.m125854x26a183b(context3, context3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.h1r), 0).show();
                        return;
                    } else {
                        if (iq.b.e(dVar.g())) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingFooterEventImpl", "onEnterMultiTalk, but already in appbrand voice!");
                            return;
                        }
                        iq.b.s(dVar.g());
                        if (iq.b.m(dVar.g(), true, null) || iq.b.n(dVar.g(), true) || iq.b.q(dVar.g(), true)) {
                            return;
                        }
                        if (q47) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingFooterEventImpl", "onEnterMultiTalk, but this group already in multitalk, alter take in or not tips!");
                            db5.e1.A(dVar.g(), dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.h38), "", dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.h1_), dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574118h16), new com.p314xaae8f345.mm.ui.p2650x55bb7a46.k4(this), null);
                            return;
                        }
                    }
                }
                intent.putExtra("chatroomName", I());
                intent.putExtra("key_need_gallery", true);
                intent.putExtra("titile", dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.h2w));
                j45.l.j(dVar.g(), "multitalk", ".ui.MultiTalkSelectContactUI", intent, null);
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = this.f283169a;
                if (c19666xfd6e2f33.K0()) {
                    c19666xfd6e2f33.m75483x4f8b3b49(8);
                }
            }
        }
    }

    public void B() {
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        yb5.d dVar = this.f283178j;
        android.app.Activity g17 = dVar.g();
        ((sb0.f) jVar).getClass();
        boolean a17 = j35.u.a(g17, "android.permission.RECORD_AUDIO", 83, "", "");
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(a17);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingFooterEventImpl", "summerper checkPermission checkmicrophone[%b], stack[%s], activity[%s]", valueOf, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3(), dVar.g());
        if (a17) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = this.f283169a;
            if (c19666xfd6e2f33.K0()) {
                c19666xfd6e2f33.m75483x4f8b3b49(8);
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba c6231x4f3054ba = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba();
            am.y00 y00Var = c6231x4f3054ba.f136478g;
            y00Var.f89948b = 5;
            y00Var.f89951e = I();
            y00Var.f89950d = dVar.g();
            y00Var.f89952f = 3;
            c6231x4f3054ba.e();
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11033, 4, 2, 0);
        }
    }

    public void C() {
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        yb5.d dVar = this.f283178j;
        android.app.Activity g17 = dVar.g();
        ((sb0.f) jVar).getClass();
        boolean a17 = j35.u.a(g17, "android.permission.CAMERA", 21, "", "");
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(a17);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingFooterEventImpl", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", valueOf, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3(), dVar.g());
        if (a17) {
            tb0.j jVar2 = (tb0.j) i95.n0.c(tb0.j.class);
            android.app.Activity g18 = dVar.g();
            ((sb0.f) jVar2).getClass();
            boolean a18 = j35.u.a(g18, "android.permission.RECORD_AUDIO", 21, "", "");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingFooterEventImpl", "summerper checkPermission checkmicrophone[%b], stack[%s], activity[%s]", java.lang.Boolean.valueOf(a18), new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3(), dVar.g());
            if (a18) {
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = this.f283169a;
                if (c19666xfd6e2f33.K0()) {
                    c19666xfd6e2f33.m75483x4f8b3b49(8);
                }
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba c6231x4f3054ba = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba();
                am.y00 y00Var = c6231x4f3054ba.f136478g;
                y00Var.f89948b = 5;
                y00Var.f89951e = I();
                y00Var.f89950d = dVar.g();
                y00Var.f89952f = 2;
                c6231x4f3054ba.e();
            }
        }
    }

    public void D() {
        android.content.Intent intent = new android.content.Intent();
        yb5.d dVar = this.f283178j;
        intent.setClass(dVar.g(), com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19730xa7b9756f.class);
        intent.putExtra("TO_USER", this.f283171c);
        ((ot.i) ((pt.h0) i95.n0.c(pt.h0.class))).getClass();
        if (!(j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2551x5025ce89.C20545xf306af28()) == 1)) {
            intent.putExtra("INTENT_KEY_PUSH_DOWN_OUT_ANIMATION", true);
            dVar.f542242d.a(intent, 227, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.z4(this));
            dVar.g().overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559390df, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
            return;
        }
        intent.putExtra("is_use_vas", true);
        intent.putExtra("INTENT_KEY_PUSH_DOWN_OUT_ANIMATION", true);
        lk5.s.e(intent, true);
        sk5.a enterAnim = sk5.a.f490540c;
        sk5.h exitAnim = sk5.h.f490546c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(enterAnim, "enterAnim");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exitAnim, "exitAnim");
        ok5.d.b(intent, "KEY_VAS_START_ENTER_ANIM", enterAnim, new ok5.f());
        ok5.d.b(intent, "KEY_VAS_START_EXIT_ANIM", exitAnim, new ok5.f());
        ((com.p314xaae8f345.mm.ui.bd) ((com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) dVar.g()).m78751x5dc77fb5(intent)).f279410a = new com.p314xaae8f345.mm.ui.zc() { // from class: com.tencent.mm.ui.chatting.h4$$b
            @Override // com.p314xaae8f345.mm.ui.zc
            public final void a(int i17, android.content.Intent intent2) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.h4 h4Var = com.p314xaae8f345.mm.ui.p2650x55bb7a46.h4.this;
                h4Var.K(h4Var.f283178j, i17, intent2);
            }
        };
    }

    public void E(int i17) {
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        yb5.d dVar = this.f283178j;
        android.app.Activity g17 = dVar.g();
        ((sb0.f) jVar).getClass();
        boolean a17 = j35.u.a(g17, "android.permission.CAMERA", 18, "", "");
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(a17);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingFooterEventImpl", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", valueOf, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3(), dVar.g());
        if (a17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13822, 1, 1);
            com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d = new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.C16528xd9aafd63(1, i17).f230352f;
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 f17 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624.f(c11120x15dce88d, c11120x15dce88d.f152728h * 1000, 1);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getC2CVideoCompositionSwitch", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
            bm5.o1 o1Var = bm5.o1.f104252a;
            int g18 = o1Var.g(bm5.h0.RepairerConfig_Media_C2CRecordUseVideoComposition_Int, 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditorVideoCompositionConfig", "C2CVideoCompositionSwitch repairConfig: " + g18);
            if (fp.q.b("xlab")) {
                if (g18 == 0) {
                    f17.a(2, "com.tencent.mm.plugin.vlog.ui.video.EditorVideoCompositionPluginLayout");
                } else if (g18 == 1) {
                    f17.a(2, "com.tencent.mm.plugin.vlog.ui.video.EditorVideoCompositionPluginLayout");
                }
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("KEY_TEC_REPORTRemuxHevcEncode_SCENE", 1);
            bundle.putBoolean("key_edit_video_remux_show_progress", ((pc0.y1) ((qc0.b1) i95.n0.c(qc0.b1.class))).wi());
            f17.M = bundle;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getC2CVideoCompositionSwitch", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("c2cUseCameraKitRecord", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
            java.lang.Object b17 = o1Var.b(bm5.h0.RepairerConfig_Camera_Component_Int, 0);
            boolean z18 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(b17, 0) || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(b17, 1);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("c2cUseCameraKitRecord", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
            boolean z19 = this.f283176h;
            if (z18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingFooterEventImpl", "useCameraKitRecord");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.a aVar = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.a.f246359a;
                int i18 = aVar.i();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingFooterEventImpl", "useCameraKitImproveLayout >> %d", java.lang.Integer.valueOf(i18));
                fu3.e eVar = fu3.e.f348413a;
                if (i18 > 0) {
                    aVar.a(f17, i18);
                    f17.M.putInt("key_camera_instance", aVar.f());
                    f17.M.putBoolean("key_record_keep_ratio", true);
                    if (z19) {
                        f17.M.putInt("key_maas_template_scene", 8);
                    } else {
                        f17.M.putInt("key_maas_template_scene", 6);
                    }
                    f17.a(2, "com.tencent.mm.plugin.vlog.ui.video.improve.ImproveEditorVideoCompositionPluginLayout");
                    if (eVar.a()) {
                        f17.a(1, "com.tencent.mm.plugin.recordvideo.plugin.improve_photo.ImproveRecordEditPhotoPluginLayout");
                    } else {
                        f17.a(1, "com.tencent.mm.plugin.recordvideo.plugin.parent.RecordEditPhotoPluginLayout");
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingFooterEventImpl", "no useCameraKitImproveLayout");
                    f17.a(0, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17012x9e3c2e.class.getName());
                    if (eVar.a()) {
                        f17.a(1, "com.tencent.mm.plugin.recordvideo.plugin.improve_photo.ImproveBaseEditPhotoLayout");
                    }
                }
                int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_c2c_camerakit_multiple_kbps, -1);
                int i19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getInt("key_record_without_edit", 1);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.C2CRecordStrategy", "guessEditRecord time:" + i19 + " ratio:" + Ni);
                if (Ni < 1) {
                    Ni = i19 < 1 ? 5 : 1;
                }
                f17.M.putInt("key_record_bitrate_ratio", Ni);
                f17.M.putBoolean("key_edit_enable_emoji_search", true);
            }
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_c2c_ignore_remux_without_edit, false)) {
                f17.f237202d = 2;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16995x8ab634cd c16995x8ab634cd = new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16995x8ab634cd();
            c16995x8ab634cd.f237223d = 3;
            if (z19) {
                c16995x8ab634cd.f237223d = 4;
            }
            java.lang.String I = I();
            java.lang.String str = I != null ? I : "";
            c16995x8ab634cd.f237234r = str;
            c16995x8ab634cd.f237235s = z19 ? ((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(str) : 0;
            f17.I = c16995x8ab634cd;
            com.p314xaae8f345.mm.p665xac8f1cfd.api.p666xbb85ad5b.C10402x5bc41468 c10402x5bc41468 = new com.p314xaae8f345.mm.p665xac8f1cfd.api.p666xbb85ad5b.C10402x5bc41468((hp.a) null);
            java.util.Map map = c10402x5bc41468.f146312h;
            ((java.util.HashMap) map).put("plugin_filter", java.lang.Boolean.TRUE);
            ((java.util.HashMap) map).put("plugin_poi", true);
            ((java.util.HashMap) map).put("plugin_tip", true);
            ((java.util.HashMap) map).put("plugin_menu", true);
            f17.f237210o = c10402x5bc41468;
            ((pc0.e2) ((qc0.c1) i95.n0.c(qc0.c1.class))).wi((p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c) dVar.g(), f17, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.l4(this));
        }
    }

    public void F() {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba c6231x4f3054ba = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba();
        am.y00 y00Var = c6231x4f3054ba.f136478g;
        y00Var.f89948b = 5;
        y00Var.f89951e = I();
        y00Var.f89950d = this.f283178j.g();
        y00Var.f89952f = 4;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = this.f283169a;
        if (c19666xfd6e2f33.K0()) {
            c19666xfd6e2f33.m75483x4f8b3b49(8);
        }
        c6231x4f3054ba.e();
    }

    public void G() {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba c6231x4f3054ba = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba();
        am.y00 y00Var = c6231x4f3054ba.f136478g;
        y00Var.f89948b = 5;
        y00Var.f89951e = I();
        y00Var.f89950d = this.f283178j.g();
        y00Var.f89952f = 2;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = this.f283169a;
        if (c19666xfd6e2f33.K0()) {
            c19666xfd6e2f33.m75483x4f8b3b49(8);
        }
        c6231x4f3054ba.e();
    }

    public java.lang.String I() {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = this.f283172d;
        if (z3Var != null && com.p314xaae8f345.mm.p2621x8fb0427b.z3.H3(z3Var.d1())) {
            return this.f283171c;
        }
        if (z3Var == null) {
            return null;
        }
        return z3Var.d1();
    }

    public final void K(yb5.d dVar, int i17, android.content.Intent intent) {
        if (i17 != -1 || intent == null) {
            return;
        }
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.lk) ((sb5.w1) dVar.f542241c.a(sb5.w1.class))).n0(217, i17, intent);
        java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("selected_file_lst");
        java.util.ArrayList<java.lang.String> stringArrayListExtra2 = intent.getStringArrayListExtra("selected_file_title_lst");
        java.util.ArrayList<java.lang.Integer> integerArrayListExtra = intent.getIntegerArrayListExtra("selected_file_need_clean_lst");
        java.util.ArrayList<java.lang.String> stringArrayListExtra3 = intent.getStringArrayListExtra("key_file_thumb_path");
        boolean D = dVar.D();
        java.lang.String str = this.f283171c;
        if (D) {
            ((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(str);
        }
        if (stringArrayListExtra != null) {
            java.util.Iterator it = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(str.split(",")).iterator();
            while (it.hasNext()) {
                java.lang.String str2 = (java.lang.String) it.next();
                boolean z17 = true;
                java.lang.String f17 = stringArrayListExtra.size() > 1 ? dh3.c.f314022a.f(str2, dh3.d.f314031g) : "";
                int size = stringArrayListExtra.size();
                int i18 = 0;
                while (i18 < size) {
                    ut.s0 s0Var = new ut.s0(str2, stringArrayListExtra.get(i18));
                    if (stringArrayListExtra2 != null && i18 < stringArrayListExtra2.size() && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringArrayListExtra2.get(i18))) {
                        java.lang.String str3 = stringArrayListExtra2.get(i18);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str3, "<set-?>");
                        s0Var.f512252c = str3;
                    }
                    s0Var.f512258i = f17;
                    boolean z18 = (integerArrayListExtra == null || integerArrayListExtra.size() <= i18 || integerArrayListExtra.get(i18).intValue() != z17) ? false : z17;
                    if (stringArrayListExtra3 != null && stringArrayListExtra3.size() > i18) {
                        java.lang.String str4 = stringArrayListExtra3.get(i18);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str4, "<set-?>");
                        s0Var.f512262m = str4;
                    }
                    s0Var.f512261l = z18;
                    dk5.w.f316499a.c(s0Var);
                    i18++;
                    z17 = true;
                }
            }
        }
        java.lang.String stringExtra = intent.getStringExtra("with_text_content");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            return;
        }
        ((dk5.s5) tg3.t1.a()).Ui(stringExtra, str);
    }

    public void L(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.C16527xe4fc886 c16527xe4fc886;
        if (obj instanceof qc0.m1) {
            qc0.m1 m1Var = (qc0.m1) obj;
            int i17 = m1Var.f442944b;
            yb5.d dVar = this.f283178j;
            if (i17 != -1 || m1Var.f442945c != 0) {
                dVar.f542250l.mo7496x9d4787cb(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.j.f34051x366c91de, i17, new android.content.Intent());
                return;
            }
            r45.vh4 vh4Var = new r45.vh4();
            vh4Var.f469768e = true;
            vh4Var.f469767d = false;
            qc0.l1 a17 = m1Var.a();
            qc0.n1 n1Var = a17.f442928a;
            qc0.n1 n1Var2 = qc0.n1.f442951e;
            java.lang.String str = a17.f442929b;
            if (n1Var == n1Var2) {
                c16527xe4fc886 = new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.C16527xe4fc886(true, str);
            } else {
                java.lang.String q17 = com.p314xaae8f345.mm.vfs.w6.q(str);
                java.lang.String str2 = a17.f442929b;
                c16527xe4fc886 = new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.C16527xe4fc886(true, str2, a17.f442930c, q17, kk.k.e(str2), java.lang.Math.round((((float) a17.f442931d) * 1.0f) / 1000.0f), vh4Var);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16994x3ba8255 c16994x3ba8255 = m1Var.f442948f;
            if (c16994x3ba8255 != null) {
                boolean z17 = ((java.lang.Integer) c16994x3ba8255.b("KEY_ADD_EMOJI_COUNT_INT", 0)).intValue() != 0;
                boolean z18 = ((java.lang.Integer) c16994x3ba8255.b("KEY_ADD_TEXT_COUNT_INT", 0)).intValue() != 0;
                boolean z19 = ((java.lang.Integer) c16994x3ba8255.b("KEY_SELECT_MUSIC_INT", 0)).intValue() != 0;
                boolean z27 = z17 || z18;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.C2CRecordStrategy", "updateCurrentRecord stickerEdit:" + z27 + " musicEdit:" + z19);
                if (z27 || z19) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().putInt("key_record_without_edit", 0);
                } else {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().putInt("key_record_without_edit", com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getInt("key_record_without_edit", 1) + 1);
                }
            }
            android.content.Intent intent = new android.content.Intent();
            java.lang.String I = I();
            kk.l lVar = t21.w2.f496589c;
            c16527xe4fc886.f230344i = t21.c3.a(I);
            intent.putExtra("key_req_result", c16527xe4fc886);
            r15.b m75465xd0d4a36c = this.f283169a.m75465xd0d4a36c();
            if (m75465xd0d4a36c != null) {
                ok5.d.b(intent, "key_quote_extcommon", m75465xd0d4a36c, new ok5.h());
            }
            dVar.f542250l.mo7496x9d4787cb(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.j.f34051x366c91de, m1Var.f442944b, intent);
        }
    }

    public final void N(int i17) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5890x658ae60a c5890x658ae60a = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5890x658ae60a();
        c5890x658ae60a.f136198g.f88319a = i17;
        c5890x658ae60a.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean P() {
        /*
            r9 = this;
            yb5.d r0 = r9.f283178j
            com.tencent.mm.ui.chatting.BaseChattingUIFragment r1 = r0.f542250l
            r2 = 1
            r1.m78639x43e00957(r2)
            com.tencent.mm.ui.chatting.BaseChattingUIFragment r0 = r0.f542250l
            r0.m78637x92e71989(r2)
            bm5.x0 r0 = r9.f283170b
            java.lang.Object r0 = r0.d()
            java.lang.String r1 = "MicroMsg.ChattingFooterEventImpl"
            r3 = 0
            if (r0 == 0) goto Le1
            bm5.x0 r0 = r9.f283170b
            java.lang.Object r0 = r0.b()
            com.tencent.mm.modelbase.g1 r0 = (com.p314xaae8f345.mm.p944x882e457a.g1) r0
            boolean r0 = r0.i()
            java.lang.String r4 = "medianote"
            if (r0 == 0) goto L43
            com.tencent.mm.storage.z3 r0 = r9.f283172d
            java.lang.String r0 = r0.d1()
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L3e
            int r0 = c01.z1.p()
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 != 0) goto L3e
            r0 = r2
            goto L3f
        L3e:
            r0 = r3
        L3f:
            if (r0 == 0) goto L43
            r0 = r2
            goto L44
        L43:
            r0 = r3
        L44:
            bm5.x0 r5 = r9.f283170b
            java.lang.Object r5 = r5.b()
            com.tencent.mm.modelbase.g1 r5 = (com.p314xaae8f345.mm.p944x882e457a.g1) r5
            boolean r5 = r5.mo47960x360802()
            com.tencent.mm.sdk.platformtools.b4 r6 = r9.f283186r
            r6.d()
            com.tencent.mm.sdk.platformtools.b4 r6 = r9.f283189u
            r6.d()
            if (r0 == 0) goto Lda
            com.tencent.mm.storage.f9 r0 = new com.tencent.mm.storage.f9
            r0.<init>()
            r0.u1(r4)
            r6 = 34
            r0.m124850x7650bebc(r6)
            r0.j1(r2)
            pt0.e0 r2 = pt0.f0.f439742b1
            boolean r2 = r2.j()
            if (r2 != 0) goto L79
            java.lang.String r2 = r9.f283173e
            r0.i1(r2)
        L79:
            r2 = 2
            r0.r1(r2)
            java.lang.String r6 = c01.z1.r()
            bm5.x0 r7 = r9.f283170b
            java.lang.Object r7 = r7.b()
            com.tencent.mm.modelbase.g1 r7 = (com.p314xaae8f345.mm.p944x882e457a.g1) r7
            int r7 = r7.k()
            long r7 = (long) r7
            java.lang.String r3 = w21.u0.c(r6, r7, r3)
            r0.d1(r3)
            long r3 = c01.w9.o(r4)
            r0.e1(r3)
            bm5.x0 r3 = r9.f283170b
            java.lang.Object r3 = r3.b()
            com.tencent.mm.modelbase.g1 r3 = (com.p314xaae8f345.mm.p944x882e457a.g1) r3
            int r3 = r3.e()
            if (r3 != r2) goto Laf
            java.lang.String r2 = "SOURCE_SILK_FILE"
            r0.u3(r2)
        Laf:
            c01.f r2 = c01.d9.b()
            xg3.m0 r2 = r2.u()
            com.tencent.mm.storage.g9 r2 = (com.p314xaae8f345.mm.p2621x8fb0427b.g9) r2
            long r2 = r2.M9(r0)
            r6 = 0
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 > 0) goto Lc9
            java.lang.String r0 = "insertLocalMsg fail"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r0)
            goto Lda
        Lc9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "insertLocalMsg success, msgId = "
            r0.<init>(r4)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
        Lda:
            java.lang.String r0 = "keep_app_silent"
            com.p314xaae8f345.mm.sdk.p2603x2137b148.c3.b(r0)
            r3 = r5
            goto Le7
        Le1:
            java.lang.String r0 = "stopRecording recorder.get() == null"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
        Le7:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.h4.P():boolean");
    }

    public final void Q() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016();
        yb5.d dVar = this.f283178j;
        dVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingContext", "[smoothScrollBy] dis:%s duration:%s", 0, 0);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea c21628xcedb13ea = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea) dVar.f542251m;
        c21628xcedb13ea.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUIFragment", "[smoothScrollBy] dis:%d duration:%d", 0, 0);
        c21628xcedb13ea.f279802t.m75908xc291bbd2(0, 0);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.k5
    public java.lang.String a() {
        return this.f283170b.d() != null ? ((com.p314xaae8f345.mm.p944x882e457a.g1) this.f283170b.b()).a() : "";
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.k5
    public void b(android.view.View view) {
        this.f283178j.M(true, false, false);
        Q();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.k5
    public long c() {
        if (this.f283170b.d() != null) {
            return ((com.p314xaae8f345.mm.p944x882e457a.g1) this.f283170b.b()).c();
        }
        return 0L;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.k5
    public boolean d(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016();
        yb5.d dVar = this.f283178j;
        dVar.M(true, false, false);
        Q();
        return ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.sk) ((sb5.f2) dVar.f542241c.a(sb5.f2.class))).q0(str, null);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.k5
    public boolean e() {
        synchronized (this.f283185q) {
            this.f283183o = true;
        }
        if (!this.f283184p) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingFooterEventImpl", "jacks in voice rcd stop but not begin.");
            return false;
        }
        this.f283184p = false;
        this.f283178j.Q(false);
        o();
        this.f283169a.d1(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.f5.Cancel);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.v0 o07 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ro) ((sb5.q2) this.f283178j.f542241c.a(sb5.q2.class))).o0();
        if (o07 != null) {
            o07.l();
        }
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.gl) ((sb5.c2) this.f283178j.f542241c.a(sb5.c2.class))).n0(4);
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.gl) ((sb5.c2) this.f283178j.f542241c.a(sb5.c2.class))).q0();
        N(1);
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ro) ((sb5.q2) this.f283178j.f542241c.a(sb5.q2.class))).t0(this.f283178j.f542250l, false);
        return true;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.k5
    public boolean f(boolean z17) {
        synchronized (this.f283185q) {
            this.f283183o = true;
        }
        if (!this.f283184p) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingFooterEventImpl", "jacks in voice rcd stop but not begin.");
            return false;
        }
        this.f283184p = false;
        this.f283178j.Q(false);
        if (P()) {
            if (((com.p314xaae8f345.mm.p944x882e457a.g1) this.f283170b.b()).j() != null) {
                this.f283169a.v1(false, true);
            }
            this.f283169a.m75487xf80c9bfa(0);
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = this.f283169a;
            if (!c19666xfd6e2f33.S3) {
                if (1 == ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_trans_txt_edu_user_switch, 1)) {
                    android.content.SharedPreferences sharedPreferences = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33.A6, 0);
                    if (sharedPreferences.getInt("trans2txt_edu_key", 0) == 0) {
                        sharedPreferences.edit().putInt("trans2txt_edu_key", 1).apply();
                        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                        java.lang.String c17 = c19666xfd6e2f33.f271488a3.c();
                        f9Var.e1(c01.w9.o(c17));
                        f9Var.u1(c17);
                        f9Var.d1(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k8z));
                        f9Var.m124850x7650bebc(10000);
                        f9Var.r1(6);
                        f9Var.j1(0);
                        ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).M9(f9Var);
                    }
                }
            }
            if (z17) {
                this.f283169a.d1(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.f5.SendVoice);
            }
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.y2) ((sb5.p) this.f283178j.f542241c.a(sb5.p.class))).n0();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingFooterEventImpl", "record stop on stop request resetRcdStatus");
        } else {
            this.f283169a.n1();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingFooterEventImpl", "record stop on stop request setRcdTooShort");
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.v0 o07 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ro) ((sb5.q2) this.f283178j.f542241c.a(sb5.q2.class))).o0();
        if (o07 != null) {
            o07.l();
        }
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.gl) ((sb5.c2) this.f283178j.f542241c.a(sb5.c2.class))).n0(4);
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.gl) ((sb5.c2) this.f283178j.f542241c.a(sb5.c2.class))).q0();
        N(1);
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ro) ((sb5.q2) this.f283178j.f542241c.a(sb5.q2.class))).t0(this.f283178j.f542250l, false);
        return true;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.k5
    public boolean g() {
        synchronized (this.f283185q) {
            this.f283183o = true;
        }
        if (!this.f283184p) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingFooterEventImpl", "ever never begin.");
            return false;
        }
        this.f283184p = false;
        this.f283178j.Q(false);
        yb5.d dVar = this.f283178j;
        dVar.f542250l.m78639x43e00957(true);
        dVar.f542250l.m78637x92e71989(true);
        if (this.f283170b.d() != null) {
            ((com.p314xaae8f345.mm.p944x882e457a.g1) this.f283170b.b()).f();
            this.f283186r.d();
            this.f283189u.d();
        }
        this.f283169a.d1(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.f5.StopRecord);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.v0 o07 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ro) ((sb5.q2) this.f283178j.f542241c.a(sb5.q2.class))).o0();
        if (o07 != null) {
            o07.l();
        }
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.gl) ((sb5.c2) this.f283178j.f542241c.a(sb5.c2.class))).n0(4);
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.gl) ((sb5.c2) this.f283178j.f542241c.a(sb5.c2.class))).q0();
        N(1);
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ro) ((sb5.q2) this.f283178j.f542241c.a(sb5.q2.class))).t0(this.f283178j.f542250l, false);
        return true;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.k5
    public void h(java.lang.String str) {
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.sk) ((sb5.f2) this.f283178j.f542241c.a(sb5.f2.class))).m0(str);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.k5
    public void i(android.view.View view, android.view.MotionEvent motionEvent) {
        if (motionEvent == null || motionEvent.getAction() == 1) {
            yb5.d dVar = this.f283178j;
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) dVar.p().s().mo75871xfb80e389(dVar.p().s().mo8143x7444f759() - 1);
            if ((f9Var != null && f9Var.T1() == ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().m5(dVar.x())) || !dVar.h().d()) {
                dVar.M(true, false, false);
            } else {
                dVar.h().b(hd5.n.ACTION_LAST_PAGE, false);
            }
            Q();
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.k5
    public boolean j() {
        return this.f283188t < 1;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.k5
    public boolean k(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return false;
        }
        w21.x0.p(str);
        w21.p0.Bi().e();
        return true;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.k5
    public void l(boolean z17) {
        yb5.d dVar = this.f283178j;
        if (z17) {
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.gl) ((sb5.c2) dVar.f542241c.a(sb5.c2.class))).o0();
        } else {
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.gl) ((sb5.c2) dVar.f542241c.a(sb5.c2.class))).q0();
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.k5
    public void m() {
        this.f283178j.p().m75894x7c4d7ca2(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.r4(this), 100L);
        Q();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.k5
    public r15.b n() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = this.f283169a;
        if (c19666xfd6e2f33 != null) {
            return c19666xfd6e2f33.m75465xd0d4a36c();
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.k5
    public void o() {
        yb5.d dVar = this.f283178j;
        dVar.f542250l.m78639x43e00957(true);
        dVar.f542250l.m78637x92e71989(true);
        if (this.f283170b.d() != null) {
            ((com.p314xaae8f345.mm.p944x882e457a.g1) this.f283170b.b()).mo47958xae7a2e7a();
            this.f283186r.d();
            this.f283189u.d();
        }
        this.f283169a.d1(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.f5.Cancel);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.k5
    /* renamed from: onPause */
    public void mo75553xb01dfb57() {
        if (this.f283170b.d() != null) {
            if (!(ba5.a.f100235b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(ba5.a.f100234a, ((com.p314xaae8f345.mm.p944x882e457a.g1) this.f283170b.b()).a()))) {
                if (!(ba5.a.f100237d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(ba5.a.f100236c, ((com.p314xaae8f345.mm.p944x882e457a.g1) this.f283170b.b()).a()))) {
                    P();
                }
            }
        }
        this.f283186r.d();
        this.f283189u.d();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.k5
    /* renamed from: onResume */
    public void mo75554x57429eec() {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.k5
    public boolean p(java.lang.String str, int i17, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && i17 > 0) {
            boolean cj6 = ((ig0.o) ((dg0.f) i95.n0.c(dg0.f.class))).cj();
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = this.f283169a;
            yb5.d dVar = this.f283178j;
            if (cj6 || com.p314xaae8f345.mm.p2621x8fb0427b.z3.J3(dVar.u().d1())) {
                cg0.d dVar2 = new cg0.d(dVar.u().d1(), str);
                dVar2.f122589i = 0;
                dVar2.f122588h = i17;
                dVar2.f122590j = this.f283170b.b();
                if (f9Var != null) {
                    dVar2.f122591k = g45.b.f350379a.b(f9Var);
                }
                ((ig0.o) ((dg0.f) i95.n0.c(dg0.f.class))).getClass();
                ((ig0.o) ((dg0.f) i95.n0.c(dg0.f.class))).hj(new jg0.x(dVar2));
                if (((com.p314xaae8f345.mm.p944x882e457a.g1) this.f283170b.b()).j() != null) {
                    c19666xfd6e2f33.v1(false, true);
                }
                return true;
            }
            if (w21.x0.j(str) != null) {
                if (w21.x0.t(str, i17, 0, f9Var) && ((com.p314xaae8f345.mm.p944x882e457a.g1) this.f283170b.b()).j() != null) {
                    c19666xfd6e2f33.v1(false, true);
                }
                w21.p0.Bi().e();
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x011a A[RETURN] */
    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.k5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean q(boolean r10) {
        /*
            Method dump skipped, instructions count: 598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.h4.q(boolean):boolean");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.k5
    public void r() {
        this.f283188t = 0;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.k5
    /* renamed from: release */
    public void mo75555x41012807() {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.k5
    public void s(android.view.View view) {
        this.f283178j.M(true, false, false);
        Q();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.k5
    public void t() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = this.f283169a;
        if (c19666xfd6e2f33 != null) {
            c19666xfd6e2f33.v1(false, true);
        }
    }

    public boolean z() {
        vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
        yb5.d dVar = this.f283178j;
        if (((ub0.r) oVar).Ai(dVar.f542250l, lp0.b.K(), "microMsg." + java.lang.System.currentTimeMillis() + com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3376xf6c83dac.JPG, 201)) {
            return true;
        }
        dp.a.m125854x26a183b(dVar.g(), dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.igw), 1).show();
        return false;
    }
}
