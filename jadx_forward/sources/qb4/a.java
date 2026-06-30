package qb4;

/* loaded from: classes4.dex */
public abstract class a {
    public static boolean a(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillEventInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
        if (c5303xc75d2f73 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, event is null or media id is null");
            if (c5303xc75d2f73 != null) {
                c5303xc75d2f73.f135623g.f87859l = com.p314xaae8f345.mm.R.C30867xcad56011.cac;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillEventInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
            return false;
        }
        if (c17933xe8d1b226 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, snsInfo is null");
            c5303xc75d2f73.f135623g.f87859l = com.p314xaae8f345.mm.R.C30867xcad56011.cad;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillEventInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
            return false;
        }
        r45.jj4 d17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.d(c17933xe8d1b226, str);
        if (d17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, mediaObj is null");
            c5303xc75d2f73.f135623g.f87859l = com.p314xaae8f345.mm.R.C30867xcad56011.cad;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillEventInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
            return false;
        }
        java.lang.String format = java.lang.String.format("%s#%s", ca4.z0.t0(c17933xe8d1b226.f68891x29d1292e), str);
        r45.bq0 bq0Var = new r45.bq0();
        r45.jq0 jq0Var = new r45.jq0();
        r45.gp0 gp0Var = new r45.gp0();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sns.GetFavDataSource", "fav sns image, from %s", c17933xe8d1b226.m70374x6bf53a6c());
        jq0Var.e(c17933xe8d1b226.m70374x6bf53a6c());
        jq0Var.j(c01.z1.r());
        jq0Var.g(2);
        jq0Var.c(c17933xe8d1b226.m70357x3fdd41df() * 1000);
        jq0Var.d(c17933xe8d1b226.m70367x7525eefd() + "");
        jq0Var.i(format);
        gp0Var.g0(format);
        gp0Var.A0(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1.l(d17));
        if (c17933xe8d1b226.m70371x485d7() != null) {
            gp0Var.Z(c17933xe8d1b226.m70371x485d7().f39021x5732e226);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17933xe8d1b226.m70371x485d7().f39021x5732e226)) {
                java.util.Map d18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(c17933xe8d1b226.m70371x485d7().f39021x5732e226, dm.n.f67493x36901555, null);
                if (d18.size() > 0) {
                    java.lang.String str2 = (java.lang.String) d18.get(".adxml.adCanvasInfo.shareTitle");
                    if (str2 == null) {
                        str2 = "";
                    }
                    gp0Var.O0(str2);
                    java.lang.String str3 = (java.lang.String) d18.get(".adxml.adCanvasInfo.shareDesc");
                    gp0Var.m0(str3 != null ? str3 : "");
                }
            }
        }
        h(gp0Var, c17933xe8d1b226);
        java.lang.String str4 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f6.d(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Di(), d17.f459388d) + ca4.z0.U(d17);
        if (!com.p314xaae8f345.mm.vfs.w6.j(gp0Var.V) && c17933xe8d1b226.m70374x6bf53a6c().endsWith(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.sj())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, mediaObj is null");
            c5303xc75d2f73.f135623g.f87859l = com.p314xaae8f345.mm.R.C30867xcad56011.cad;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillEventInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
            return false;
        }
        if (com.p314xaae8f345.mm.vfs.w6.j(str4)) {
            gp0Var.B0(str4);
        } else {
            gp0Var.z0(true);
            gp0Var.o0(d17.f459393i);
            r45.tq0 tq0Var = new r45.tq0();
            tq0Var.o(d17.f459393i);
            bq0Var.r(tq0Var);
        }
        gp0Var.h0(2);
        bq0Var.f452497f.add(gp0Var);
        bq0Var.o(jq0Var);
        am.c4 c4Var = c5303xc75d2f73.f135623g;
        c4Var.f87848a = bq0Var;
        c4Var.f87850c = 2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillEventInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
        return true;
    }

    public static boolean b(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73, java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillEventInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
        if (c5303xc75d2f73 == null || com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.f(str) || i17 < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, event is null or snsId error or position errro");
            if (c5303xc75d2f73 != null) {
                c5303xc75d2f73.f135623g.f87859l = com.p314xaae8f345.mm.R.C30867xcad56011.cac;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillEventInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
            return false;
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Xj()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, sns core is invalid");
            c5303xc75d2f73.f135623g.f87859l = com.p314xaae8f345.mm.R.C30867xcad56011.cau;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillEventInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 k17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().k1(str);
        if (k17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, snsInfo is null");
            c5303xc75d2f73.f135623g.f87859l = com.p314xaae8f345.mm.R.C30867xcad56011.cad;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillEventInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
            return false;
        }
        r45.jj4 c17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.c(k17, i17);
        if (c17 != null) {
            boolean a17 = a(c5303xc75d2f73, k17, c17.f459388d);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillEventInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
            return a17;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, media obj is null");
        c5303xc75d2f73.f135623g.f87859l = com.p314xaae8f345.mm.R.C30867xcad56011.cad;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillEventInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
        return false;
    }

    public static boolean c(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillEventInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillEventInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
        boolean z17 = false;
        if (c5303xc75d2f73 == null || !com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.h(str2) || str == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, event is null or snsId error or url is null");
            if (c5303xc75d2f73 != null) {
                c5303xc75d2f73.f135623g.f87859l = com.p314xaae8f345.mm.R.C30867xcad56011.cac;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillEventInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
        } else {
            boolean Xj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Xj();
            am.c4 c4Var = c5303xc75d2f73.f135623g;
            if (Xj) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, sns core is invalid");
                c4Var.f87859l = com.p314xaae8f345.mm.R.C30867xcad56011.cau;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillEventInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 b17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.l1.b(str2);
                if (b17 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, snsInfo is null");
                    c4Var.f87859l = com.p314xaae8f345.mm.R.C30867xcad56011.cad;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillEventInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
                } else if (b17.m70371x485d7().f39014x86965dde == null || b17.m70371x485d7().f39014x86965dde.f451370e != 26) {
                    r45.jj4 c17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.c(b17, 0);
                    java.lang.String format = java.lang.String.format("%s#%s", ca4.z0.t0(b17.f68891x29d1292e), c17 != null ? c17.f459388d : "0");
                    r45.bq0 bq0Var = new r45.bq0();
                    r45.jq0 jq0Var = new r45.jq0();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sns.GetFavDataSource", "fav sns url, from %s", b17.m70374x6bf53a6c());
                    jq0Var.e(b17.m70374x6bf53a6c());
                    jq0Var.j(c01.z1.r());
                    jq0Var.g(2);
                    jq0Var.c(b17.m70357x3fdd41df() * 1000);
                    jq0Var.d(b17.m70367x7525eefd() + "");
                    jq0Var.i(format);
                    jq0Var.f(str);
                    r45.gp0 gp0Var = new r45.gp0();
                    gp0Var.g0(format);
                    z17 = true;
                    if (c17 != null) {
                        java.lang.String str3 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f6.d(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Di(), c17.f459388d) + ca4.z0.U(c17);
                        if (com.p314xaae8f345.mm.vfs.w6.j(str3)) {
                            gp0Var.B0(str3);
                        } else {
                            gp0Var.z0(true);
                            gp0Var.o0(c17.f459393i);
                            r45.tq0 tq0Var = new r45.tq0();
                            tq0Var.o(c17.f459393i);
                            bq0Var.r(tq0Var);
                        }
                    } else {
                        gp0Var.z0(true);
                    }
                    gp0Var.h0(5);
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d7 = b17.m70371x485d7();
                    gp0Var.O0(m70371x485d7.f39014x86965dde.f451371f);
                    gp0Var.m0(m70371x485d7.f39014x86965dde.f451369d);
                    gp0Var.Z(m70371x485d7.f39021x5732e226);
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m70371x485d7.f39021x5732e226)) {
                        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(m70371x485d7.f39021x5732e226, dm.n.f67493x36901555, null);
                        if (d17.size() > 0) {
                            java.lang.String str4 = (java.lang.String) d17.get(".adxml.adCanvasInfo.shareTitle");
                            if (str4 == null) {
                                str4 = "";
                            }
                            gp0Var.O0(str4);
                            java.lang.String str5 = (java.lang.String) d17.get(".adxml.adCanvasInfo.shareDesc");
                            gp0Var.m0(str5 != null ? str5 : "");
                        }
                    }
                    i(gp0Var, m70371x485d7);
                    gp0Var.x0(true);
                    bq0Var.f452497f.add(gp0Var);
                    r45.tq0 tq0Var2 = new r45.tq0();
                    tq0Var2.f468207q = m70371x485d7.f39024xe8d429ea;
                    tq0Var2.f468208r = true;
                    tq0Var2.p(gp0Var.f456937d);
                    r45.y97 y97Var = m70371x485d7.f39045x33feb8ea;
                    if (y97Var != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(y97Var.f472431d)) {
                        su4.l2 l2Var = new su4.l2();
                        r45.y97 y97Var2 = m70371x485d7.f39045x33feb8ea;
                        l2Var.f494516b = y97Var2.f472431d;
                        l2Var.f494517c = y97Var2.f472432e;
                        l2Var.f494518d = y97Var2.f472433f;
                        l2Var.f494519e = y97Var2.f472434g;
                        l2Var.f494520f = y97Var2.f472435h;
                        l2Var.f494521g = y97Var2.f472437m;
                        l2Var.f494522h = y97Var2.f472438n;
                        l2Var.f494523i = y97Var2.f472439o;
                        l2Var.f494524j = y97Var2.f472440p;
                        l2Var.f494525k = y97Var2.f472441q;
                        l2Var.f494526l = y97Var2.f472442r;
                        l2Var.f494527m = y97Var2.f472443s;
                        l2Var.f494528n = y97Var2.f472444t;
                        l2Var.f494529o = y97Var2.f472436i;
                        l2Var.f494530p = y97Var2.f472445u;
                        l2Var.f494531q = y97Var2.f472446v;
                        l2Var.f494532r = y97Var2.f472447w;
                        l2Var.f494533s = y97Var2.f472448x;
                        l2Var.f494534t = y97Var2.f472449y;
                        l2Var.f494535u = y97Var2.f472450z;
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        l2Var.c(sb6, null, null, null, 0, 0);
                        tq0Var2.q(sb6.toString());
                    }
                    bq0Var.r(tq0Var2);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillMpMsgItem", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
                    r45.hh4 hh4Var = m70371x485d7.f39014x86965dde.f451376n;
                    if (hh4Var == null || hh4Var.f457682d == -1) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillMpMsgItem", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
                    } else {
                        r45.qp0 qp0Var = new r45.qp0();
                        bq0Var.k(qp0Var);
                        qp0Var.f465696e = m70371x485d7.f39014x86965dde.f451376n.f457683e;
                        qp0Var.f465695d = hh4Var.f457682d;
                        qp0Var.f465709u = hh4Var.f457692q;
                        qp0Var.f465699h = hh4Var.f457687i;
                        qp0Var.f465700i = hh4Var.f457688m;
                        qp0Var.f465704p = hh4Var.f457690o;
                        qp0Var.f465701m = hh4Var.f457689n;
                        qp0Var.f465697f = hh4Var.f457685g;
                        qp0Var.f465698g = hh4Var.f457686h;
                        qp0Var.f465702n = m70371x485d7.f39033x11f29a7f;
                        qp0Var.f465703o = m70371x485d7.f39038xb2e29dc9;
                        qp0Var.f465706r = hh4Var.f457691p;
                        tq0Var2.j(hh4Var.f457684f);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillMpMsgItem", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
                    }
                    bq0Var.o(jq0Var);
                    c4Var.f87848a = bq0Var;
                    c4Var.f87852e = m70371x485d7.f39014x86965dde.f451371f;
                    c4Var.f87850c = 5;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillEventInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
                } else {
                    z17 = g(c5303xc75d2f73, str2);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillEventInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillEventInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
        return z17;
    }

    public static boolean d(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillEventInfoImg", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
        if (c5303xc75d2f73 == null || str == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, event is null or snsId error or position errro");
            if (c5303xc75d2f73 != null) {
                c5303xc75d2f73.f135623g.f87859l = com.p314xaae8f345.mm.R.C30867xcad56011.cac;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillEventInfoImg", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
            return false;
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Xj()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, sns core is invalid");
            c5303xc75d2f73.f135623g.f87859l = com.p314xaae8f345.mm.R.C30867xcad56011.cau;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillEventInfoImg", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
            return false;
        }
        if (c17933xe8d1b226 != null) {
            boolean a17 = a(c5303xc75d2f73, c17933xe8d1b226, str);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillEventInfoImg", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
            return a17;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, snsInfo is null");
        c5303xc75d2f73.f135623g.f87859l = com.p314xaae8f345.mm.R.C30867xcad56011.cad;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillEventInfoImg", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0169 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean e(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 r18, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 r19) {
        /*
            Method dump skipped, instructions count: 730
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qb4.a.e(com.tencent.mm.autogen.events.DoFavoriteEvent, com.tencent.mm.plugin.sns.storage.SnsInfo):boolean");
    }

    public static boolean f(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73, java.lang.String str, java.lang.CharSequence charSequence, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillEventInfoText", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
        if (c5303xc75d2f73 == null || com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.f(str) || charSequence == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, event is null or snsId error or text is null");
            if (c5303xc75d2f73 != null) {
                c5303xc75d2f73.f135623g.f87859l = com.p314xaae8f345.mm.R.C30867xcad56011.cac;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillEventInfoText", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
            return false;
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Xj()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, sns core is invalid");
            c5303xc75d2f73.f135623g.f87859l = com.p314xaae8f345.mm.R.C30867xcad56011.cau;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillEventInfoText", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 k17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().k1(str);
        if (k17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, snsInfo is null");
            c5303xc75d2f73.f135623g.f87859l = com.p314xaae8f345.mm.R.C30867xcad56011.cad;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillEventInfoText", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
            return false;
        }
        long j17 = k17.f68891x29d1292e;
        if (0 == j17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, snsInfo.field_snsId is 0");
            c5303xc75d2f73.f135623g.f87859l = com.p314xaae8f345.mm.R.C30867xcad56011.cab;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillEventInfoText", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
            return false;
        }
        java.lang.String format = java.lang.String.format("%s#%d_%d", ca4.z0.t0(j17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        r45.bq0 bq0Var = new r45.bq0();
        r45.jq0 jq0Var = new r45.jq0();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sns.GetFavDataSource", "fav sns text, from %s, startOffset %d, endOffset %d", k17.m70374x6bf53a6c(), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        jq0Var.e(k17.m70374x6bf53a6c());
        jq0Var.j(c01.z1.r());
        jq0Var.g(2);
        jq0Var.c(k17.m70357x3fdd41df() * 1000);
        jq0Var.d(k17.m70367x7525eefd() + "");
        jq0Var.i(format);
        bq0Var.o(jq0Var);
        am.c4 c4Var = c5303xc75d2f73.f135623g;
        c4Var.f87848a = bq0Var;
        c4Var.f87852e = charSequence.toString();
        c5303xc75d2f73.f135623g.f87850c = 1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillEventInfoText", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
        return true;
    }

    public static boolean g(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73, java.lang.String str) {
        java.util.LinkedList linkedList;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillEventNoteLinkInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
        if (c5303xc75d2f73 == null || !com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.h(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, event is null or snsId error or url is null");
            if (c5303xc75d2f73 != null) {
                c5303xc75d2f73.f135623g.f87859l = com.p314xaae8f345.mm.R.C30867xcad56011.cac;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillEventNoteLinkInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
            return false;
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Xj()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, sns core is invalid");
            c5303xc75d2f73.f135623g.f87859l = com.p314xaae8f345.mm.R.C30867xcad56011.cau;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillEventNoteLinkInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 b17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.l1.b(str);
        if (b17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, snsInfo is null");
            c5303xc75d2f73.f135623g.f87859l = com.p314xaae8f345.mm.R.C30867xcad56011.cad;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillEventNoteLinkInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
            return false;
        }
        r45.jj4 c17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.c(b17, 0);
        java.lang.String format = java.lang.String.format("%s#%s", ca4.z0.t0(b17.f68891x29d1292e), c17 != null ? c17.f459388d : "0");
        r45.jq0 jq0Var = new r45.jq0();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d7 = b17.m70371x485d7();
        if (m70371x485d7 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sns.GetFavDataSource", "fav NoteLink, tlObj is null , return");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillEventNoteLinkInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sns.GetFavDataSource", "fav NoteLink, from %s", b17.m70374x6bf53a6c());
        jq0Var.e(b17.m70374x6bf53a6c());
        jq0Var.j(c01.z1.r());
        jq0Var.g(2);
        jq0Var.c(b17.m70357x3fdd41df() * 1000);
        jq0Var.d(b17.m70367x7525eefd() + "");
        jq0Var.i(format);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5432x35bb364f c5432x35bb364f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5432x35bb364f();
        am.z9 z9Var = c5432x35bb364f.f135776g;
        z9Var.f90061a = 30;
        z9Var.f90073m = 4;
        z9Var.f90063c = m70371x485d7.f39014x86965dde.f451375m;
        c5432x35bb364f.e();
        z9Var.f90064d.o(jq0Var);
        am.c4 c4Var = c5303xc75d2f73.f135623g;
        r45.bq0 bq0Var = z9Var.f90064d;
        c4Var.f87848a = bq0Var;
        if (bq0Var != null && (linkedList = bq0Var.f452497f) != null) {
            for (int i17 = 0; i17 < linkedList.size(); i17++) {
                r45.gp0 gp0Var = (r45.gp0) linkedList.get(i17);
                if (gp0Var != null) {
                    gp0Var.x0(true);
                    gp0Var.z0(true);
                }
            }
        }
        java.lang.String str2 = m70371x485d7.f39014x86965dde.f451371f;
        am.c4 c4Var2 = c5303xc75d2f73.f135623g;
        c4Var2.f87852e = str2;
        c4Var2.f87850c = 18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillEventNoteLinkInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
        return true;
    }

    public static void h(r45.gp0 gp0Var, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillFavData", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
        if (gp0Var != null && c17933xe8d1b226 != null) {
            i(gp0Var, c17933xe8d1b226.m70371x485d7());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillFavData", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
    }

    public static void i(r45.gp0 gp0Var, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillFavData", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
        if (gp0Var != null && c19807x593d1720 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19807x593d1720.f39040xbd345fc4)) {
            gp0Var.H0(c19807x593d1720.f39040xbd345fc4);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillFavData", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x015f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean j(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 r16, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 r17, r45.jj4 r18, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 r19, r45.xs4 r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qb4.a.j(com.tencent.mm.autogen.events.DoFavoriteEvent, com.tencent.mm.plugin.sns.storage.SnsInfo, r45.jj4, com.tencent.mm.protocal.protobuf.TimeLineObject, r45.xs4, java.lang.String):boolean");
    }
}
