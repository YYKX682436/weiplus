package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29;

/* loaded from: classes8.dex */
public abstract class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C16008xdb77bd65 f221788a;

    public static java.lang.String a(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 e1Var, android.content.Intent intent, boolean z17) {
        if (e1Var != null && !((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.n1) ((m33.r1) i95.n0.c(m33.r1.class))).Bi().b()) {
            e1Var.t0();
            if (intent != null && !intent.hasExtra("game_pre_inject_data")) {
                intent.putExtra("game_pre_inject_data", e1Var.N2.f221889a);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.h0 h0Var = e1Var.f221824p2;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h0Var.f221856a)) {
                if (z17) {
                    java.util.List list = h0Var.f221860e;
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(list)) {
                        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6276xb08681d3 c6276xb08681d3 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6276xb08681d3();
                        am.t20 t20Var = c6276xb08681d3.f136525g;
                        t20Var.f89502a = 8;
                        t20Var.f89508g = 1;
                        t20Var.f89509h = list;
                        c6276xb08681d3.e();
                    }
                }
                str = b(str, "h5FloatLayer=1");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameEntranceChecker", "after checking float, url = %s", str);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.o0 o0Var = e1Var.G2;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(o0Var.f221922a)) {
                if (z17) {
                    java.util.List list2 = o0Var.f221923b;
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(list2)) {
                        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6276xb08681d3 c6276xb08681d32 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6276xb08681d3();
                        am.t20 t20Var2 = c6276xb08681d32.f136525g;
                        t20Var2.f89502a = 8;
                        t20Var2.f89508g = 1;
                        t20Var2.f89509h = list2;
                        c6276xb08681d32.e();
                    }
                }
                try {
                    str = b(str, "h5BannerId=" + fp.s0.b(o0Var.f221922a, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c));
                } catch (java.io.UnsupportedEncodingException unused) {
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameEntranceChecker", "after checking banner, url = %s", str);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p0 p0Var = e1Var.f221814f2;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(p0Var.f221934b) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(p0Var.f221933a) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(p0Var.f221935c)) {
                str = b(str, "hasBubble=1");
            }
            str = b(b(str, "localMsgId=" + e1Var.f68468x297eb4f7), "gameMsgId=" + e1Var.f68458xd54c6aa5);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e1Var.V2)) {
                try {
                    str = b(str, "business_data=" + java.net.URLEncoder.encode(e1Var.V2, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6));
                } catch (java.io.UnsupportedEncodingException unused2) {
                }
            }
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.k() != null && com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.k().f405512h) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.q0 q0Var = e1Var.f221812d2;
                if (q0Var.f221950h == 1 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(q0Var.f221949g)) {
                    str = b(str, "fromReddotExternPage=1");
                }
            }
        }
        if (intent == null || !intent.hasExtra("key_game_url_ext_param")) {
            return str;
        }
        try {
            return b(str, "fromGameParam=" + fp.s0.b(intent.getStringExtra("key_game_url_ext_param"), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c));
        } catch (java.io.UnsupportedEncodingException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameEntranceChecker", e17.getMessage());
            return str;
        }
    }

    public static java.lang.String b(java.lang.String str, java.lang.String str2) {
        android.net.Uri parse = android.net.Uri.parse(str);
        java.lang.String query = parse.getQuery();
        if (query != null) {
            str2 = query + "&" + str2;
        }
        try {
            return new java.net.URI(parse.getScheme(), parse.getAuthority(), parse.getPath(), str2, parse.getFragment()).toString();
        } catch (java.net.URISyntaxException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.GameEntranceChecker", e17, "", new java.lang.Object[0]);
            return str;
        }
    }

    public static void c(android.content.Intent intent, java.lang.String str, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 e1Var, int i17, java.lang.String str2) {
        int i18;
        intent.putExtra("geta8key_scene", 32);
        intent.putExtra("KPublisherId", str);
        intent.putExtra("game_check_float", z17);
        if (!z17 || e1Var == null) {
            return;
        }
        e1Var.t0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.h0 h0Var = e1Var.f221824p2;
        if (h0Var != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h0Var.f221856a)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.C15871x7b988755 c15871x7b988755 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.C15871x7b988755();
            java.lang.String str3 = h0Var.f221856a;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                java.lang.String queryParameter = android.net.Uri.parse(str2).getQueryParameter("nav_color");
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(queryParameter)) {
                    str3 = b(str3, "nav_color=" + queryParameter);
                }
            }
            c15871x7b988755.f221007d = str3;
            c15871x7b988755.f221008e = h0Var.f221857b;
            int i19 = h0Var.f221858c;
            if (i19 != 1) {
                if (i19 != 2) {
                    if (i19 != 3) {
                        if (i19 != 4) {
                            i18 = -1;
                            c15871x7b988755.f221009f = i18;
                            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.C15873x8354f860 c15873x8354f860 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.C15873x8354f860();
                            c15873x8354f860.f221020d = c15871x7b988755;
                            intent.putExtra("launchParams", c15873x8354f860);
                            intent.putExtra("game_float_layer_url", h0Var.f221856a);
                        }
                    }
                }
                i18 = 1;
                c15871x7b988755.f221009f = i18;
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.C15873x8354f860 c15873x8354f8602 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.C15873x8354f860();
                c15873x8354f8602.f221020d = c15871x7b988755;
                intent.putExtra("launchParams", c15873x8354f8602);
                intent.putExtra("game_float_layer_url", h0Var.f221856a);
            }
            i18 = 0;
            c15871x7b988755.f221009f = i18;
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.C15873x8354f860 c15873x8354f86022 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.C15873x8354f860();
            c15873x8354f86022.f221020d = c15871x7b988755;
            intent.putExtra("launchParams", c15873x8354f86022);
            intent.putExtra("game_float_layer_url", h0Var.f221856a);
        }
        f(e1Var, i17, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02cb A[Catch: JSONException -> 0x02e7, TRY_LEAVE, TryCatch #5 {JSONException -> 0x02e7, blocks: (B:68:0x025c, B:70:0x026b, B:72:0x0277, B:74:0x0287, B:77:0x028e, B:80:0x0298, B:83:0x02b6, B:144:0x02cb, B:155:0x02ab), top: B:67:0x025c }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x025c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02b6 A[Catch: JSONException -> 0x02e7, TRY_ENTER, TryCatch #5 {JSONException -> 0x02e7, blocks: (B:68:0x025c, B:70:0x026b, B:72:0x0277, B:74:0x0287, B:77:0x028e, B:80:0x0298, B:83:0x02b6, B:144:0x02cb, B:155:0x02ab), top: B:67:0x025c }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0341 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean d(android.app.Activity r38, android.content.Intent r39) {
        /*
            Method dump skipped, instructions count: 1277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.d0.d(android.app.Activity, android.content.Intent):boolean");
    }

    public static void e(android.content.Context context, android.content.Intent intent, java.lang.String str, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 e1Var, int i17) {
        intent.putExtra("geta8key_scene", 32);
        intent.putExtra("KPublisherId", str);
        intent.putExtra("game_check_float", z17);
        if (z17 && e1Var != null) {
            e1Var.t0();
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.h0 h0Var = e1Var.f221824p2;
            if (h0Var.f221859d) {
                intent.putExtra("game_transparent_float_url", h0Var.f221856a);
            }
            intent.putExtra("game_sourceScene", i17);
            intent.putExtra("game_float_layer_url", h0Var.f221856a);
        }
        r53.f.E(intent, context);
    }

    public static void f(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 e1Var, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 l17;
        if (e1Var != null) {
            l17 = e1Var;
        } else {
            l17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.n1) ((m33.r1) i95.n0.c(m33.r1.class))).Ai().l();
            if (l17 == null) {
                return;
            }
        }
        l17.t0();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameEntranceChecker", "float layer report");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(l17.f221824p2.f221856a)) {
            com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 10, 1006, 1, 1, 0, l17.f68449x28d45f97, i17, l17.S2, l17.f68458xd54c6aa5, l17.T2, com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.a("resource", java.lang.String.valueOf(l17.f221812d2.f221943a), l17.U2, null));
            if (i18 == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(858L, 16L, 1L, false);
            } else if (i18 == 2) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(858L, 17L, 1L, false);
            }
            l17.f68463xff7b64c5 = true;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().mo9952xce0038c9(l17, new java.lang.String[0]);
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.n1) ((m33.r1) i95.n0.c(m33.r1.class))).Ai().f();
    }

    public static void g(int i17, boolean z17, java.lang.String str, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 m17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.n1) ((m33.r1) i95.n0.c(m33.r1.class))).Ai().m();
        java.util.HashMap hashMap = new java.util.HashMap();
        if (z17) {
            hashMap.put("luggage", "1");
        }
        if (str != null) {
            hashMap.put("entrance_url", str);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.a2 Bi = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.n1) ((m33.r1) i95.n0.c(m33.r1.class))).Bi();
        if (Bi != null && Bi.b()) {
            m17 = null;
        }
        if (m17 == null) {
            hashMap.put("function_type", "resource");
            hashMap.put("function_value", java.lang.String.valueOf(0));
            com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 9, 901, 1, i17, 0, n53.a.d(hashMap));
        } else {
            m17.t0();
            hashMap.put("reddot_strategy", com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.d.a() ? "1" : "0");
            hashMap.put("channel", java.lang.Integer.toString(m17.f68450xa09e2abe));
            com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 9, 901, 1, i17, 0, m17.f68449x28d45f97, i18, m17.S2, m17.f68458xd54c6aa5, m17.T2, com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.a("resource", java.lang.String.valueOf(m17.f221812d2.f221943a), m17.U2, hashMap));
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.n1) ((m33.r1) i95.n0.c(m33.r1.class))).Bi().c(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.n1.GAME_REDDOT_EXIT_USER_CLICK);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(858L, 3L, 1L, false);
        }
    }
}
