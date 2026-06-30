package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29;

/* loaded from: classes8.dex */
public class i1 implements com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.j2 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.d2 f221868a;

    public i1() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.d2 d2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.d2();
        this.f221868a = d2Var;
        d2Var.f221796f = new java.lang.ref.WeakReference(this);
    }

    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 e1Var, int i17) {
        m53.z3 z3Var;
        int i18;
        int i19;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e1Var.f68458xd54c6aa5)) {
            e1Var.f68458xd54c6aa5 = e1Var.J2.f221778a;
        }
        if (e1Var.f68470x672cb5cf) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("reddot_strategy", com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.d.a() ? "1" : "0");
            hashMap.put("channel", java.lang.Integer.toString(e1Var.f68450xa09e2abe));
            dm.r5 y07 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Ni().y0(e1Var.f68453x825a2e6f);
            int i27 = 15;
            if (y07 != null) {
                hashMap.put("preContentId", e1Var.f68453x825a2e6f);
                hashMap.put("preSvrMsgId", java.lang.Long.toString(y07.f68170xd811b505));
                i18 = 15;
            } else {
                i18 = i17;
            }
            if (i18 == 0) {
                if (q(e1Var)) {
                    i18 = 8;
                } else {
                    m33.b1 a17 = m33.a1.a();
                    boolean Vi = a17 != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.h0) a17).Vi(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) : false;
                    boolean mo168058x74219ae7 = ((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7();
                    boolean z17 = (c01.z1.j() & 8388608) != 0;
                    if (mo168058x74219ae7) {
                        i27 = 10;
                    } else if (!Vi) {
                        i27 = 6;
                    } else if (z17) {
                        i27 = 9;
                    } else {
                        ((vd0.o2) ((wd0.s1) i95.n0.c(wd0.s1.class))).getClass();
                        if (!((c01.z1.h() & 2048) != 2048)) {
                            i27 = 7;
                        } else if (((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Ni().y0(e1Var.f68453x825a2e6f) == null) {
                            i27 = 0;
                        }
                    }
                    i19 = i27;
                    com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 0, 0, 0, 18, i19, e1Var.f68449x28d45f97, 0, e1Var.S2, e1Var.f68458xd54c6aa5, e1Var.T2, com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.a("resource", java.lang.String.valueOf(e1Var.f221812d2.f221943a), e1Var.U2, hashMap));
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(858L, 0L, 1L, false);
                }
            }
            i19 = i18;
            com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 0, 0, 0, 18, i19, e1Var.f68449x28d45f97, 0, e1Var.S2, e1Var.f68458xd54c6aa5, e1Var.T2, com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.a("resource", java.lang.String.valueOf(e1Var.f221812d2.f221943a), e1Var.U2, hashMap));
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(858L, 0L, 1L, false);
        }
        long j17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("del_game_msg").getLong("del_timestamp", 0L);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.e() != null) {
            z3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.f220914a.f36960xd7c0d538;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.s();
            z3Var = null;
        }
        if (z3Var == null || !z3Var.f405763d) {
            return;
        }
        if (currentTimeMillis - j17 > (z3Var.f405764e == 0 ? 1209600000 : r1 * com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26672xc5b068cb.f56198x1c9ff21c)) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("del_game_msg").putLong("del_timestamp", currentTimeMillis);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("del_game_msg").putBoolean("del_mark", true);
        }
    }

    public final void b(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 m17 = m();
        if (m17 != null) {
            java.lang.String str2 = m17.f68458xd54c6aa5;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str2 == null) {
                str2 = "";
            }
            if (str2.equals(str)) {
                g();
            }
        }
    }

    public void c(int i17) {
        boolean z17 = false;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((kj0.i) ((kj0.l) i95.n0.c(kj0.l.class))).Ai(e42.d0.clicfg_game_report_empty_redpoint, "0"), "0")) {
            long t17 = gm0.j1.u().c().t(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_GAME_REDDOT_LAST_EMPTY_REPORT_TIME_SEC_LONG, 0L);
            long t18 = gm0.j1.u().c().t(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_GAME_REDDOT_EMPTY_REPORT_MIN_DURATION_SEC_LONG, 86400L);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
            if (java.lang.Math.abs(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H1(t17)) >= t18) {
                z17 = true;
            }
        }
        if (z17) {
            m53.z4 z4Var = new m53.z4();
            z4Var.f405766d = "zh_CN";
            z4Var.f405767e = "";
            m53.g gVar = new m53.g();
            gVar.f405220d = android.os.Build.VERSION.SDK_INT;
            gVar.f405221e = oj.d.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).f427215d;
            z4Var.f405768f = gVar;
            z4Var.f405769g = i17;
            com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
            lVar.f152197a = z4Var;
            lVar.f152198b = new m53.a5();
            lVar.f152199c = "/cgi-bin/mmgame-bin/gamemsgpushappsvr/reportinactiveuser";
            lVar.f152200d = 5063;
            com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_GAME_REDDOT_LAST_EMPTY_REPORT_TIME_SEC_LONG, java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()));
            ((h80.i) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x.class))).wi(a17, new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.j1(this));
        }
    }

    public void d() {
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.GAME_INDEX_BANNER_MSGID_LONG_SYNC;
        long longValue = ((java.lang.Long) c17.m(u3Var, 0L)).longValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 L0 = longValue != 0 ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().L0(longValue) : null;
        if (L0 == null || L0.f68462xfd5e9919 != 0) {
            return;
        }
        gm0.j1.u().c().x(u3Var, 0L);
        b(L0.f68458xd54c6aa5);
    }

    public void e() {
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.GAME_INDEX_BUBBLE_MSGID_LONG_SYNC;
        long longValue = ((java.lang.Long) c17.m(u3Var, 0L)).longValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 L0 = longValue != 0 ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().L0(longValue) : null;
        if (L0 == null || L0.f68462xfd5e9919 != 0) {
            return;
        }
        gm0.j1.u().c().x(u3Var, 0L);
        b(L0.f68458xd54c6aa5);
    }

    public void f() {
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.GAME_INDEX_FLOATLAYER_MSGID_LONG_SYNC;
        long longValue = ((java.lang.Long) c17.m(u3Var, 0L)).longValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 L0 = longValue != 0 ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().L0(longValue) : null;
        if (L0 == null || L0.f68462xfd5e9919 != 0) {
            return;
        }
        gm0.j1.u().c().x(u3Var, 0L);
        b(L0.f68458xd54c6aa5);
    }

    public void g() {
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.GAME_DISCOVERY_ENTRANCE_MSGID_LONG_SYNC;
        long longValue = ((java.lang.Long) c17.m(u3Var, 0L)).longValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 L0 = longValue != 0 ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().L0(longValue) : null;
        if (L0 == null || L0.f68462xfd5e9919 != 0) {
            return;
        }
        gm0.j1.u().c().x(u3Var, 0L);
    }

    public void h(java.lang.String str, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 o17 = o();
        if (o17 != null) {
            java.lang.String str2 = o17.f68458xd54c6aa5;
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str2 == null) {
                str2 = "";
            }
            if (str2.equals(str)) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.n1) ((m33.r1) i95.n0.c(m33.r1.class))).Bi().c(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.n1.GAME_REDDOT_EXIT_REVOKE);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 b17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().b1(str);
        boolean z19 = false;
        if (b17 == null || !str.equals(b17.f68458xd54c6aa5)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameMessageService", "dont have msgId:%s for delete", str);
            b17 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1();
            b17.f68458xd54c6aa5 = str;
        } else {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().mo9951xb06685ab(b17, new java.lang.String[0]);
            z19 = true;
        }
        int i17 = z19 ? 101 : 102;
        if (z17) {
            com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 0, 0, 0, 403, i17, b17.f68449x28d45f97, 0, b17.S2, b17.f68458xd54c6aa5, b17.T2, com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.a("resource", java.lang.String.valueOf(b17.f221812d2.f221943a), b17.U2, null));
        }
    }

    public final void i(java.lang.String str, int i17, boolean z17) {
        long t17 = gm0.j1.u().c().t(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_GAME_REDDOT_LAST_PULL_MSG_TIME_SEC_LONG, 0L);
        long t18 = gm0.j1.u().c().t(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_GAME_REDDOT_PULL_MSG_MIN_DURATION_SEC_LONG, 0L);
        if (t18 != 0 && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H1(t17) < t18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GameMessageService", "gamelog.srv_msg, service, reddotScore, pullmsg need pull, but pullMsgMinDurationSec is too close , current interval = %d  , pullMsgMinDurationSec = %d", java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H1(t17)), java.lang.Long.valueOf(t18));
            return;
        }
        dm.q5 q5Var = new dm.q5();
        q5Var.f68047xe044d7dd = str;
        q5Var.f68048xffc900c5 = i17 + 1;
        if (z17) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Ui().mo880xb970c2b9(q5Var);
        } else {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Ui().mo9952xce0038c9(q5Var, new java.lang.String[0]);
        }
        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.l1(this, ""));
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 j() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 L0;
        long longValue = ((java.lang.Long) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.GAME_INDEX_BUBBLE_MSGID_LONG_SYNC, 0L)).longValue();
        if (longValue == 0 || (L0 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().L0(longValue)) == null || L0.f68462xfd5e9919 != 0 || r(L0)) {
            return null;
        }
        return L0;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 k() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 m17 = m();
        if (m17 == null) {
            m17 = l();
        }
        if (m17 == null) {
            m17 = j();
        }
        if (m17 == null) {
            long longValue = ((java.lang.Long) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.GAME_INDEX_BANNER_MSGID_LONG_SYNC, 0L)).longValue();
            if (longValue == 0 || (m17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().L0(longValue)) == null || m17.f68462xfd5e9919 != 0 || r(m17)) {
                m17 = null;
            }
        }
        if (m17 != null) {
            m17.t0();
        }
        return m17;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 l() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 L0;
        long longValue = ((java.lang.Long) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.GAME_INDEX_FLOATLAYER_MSGID_LONG_SYNC, 0L)).longValue();
        if (longValue == 0 || (L0 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().L0(longValue)) == null || L0.f68462xfd5e9919 != 0 || r(L0)) {
            return null;
        }
        return L0;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 m() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 n17 = n();
        if (n17 == null || r(n17)) {
            return null;
        }
        return n17;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 n() {
        long longValue = ((java.lang.Long) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.GAME_DISCOVERY_ENTRANCE_MSGID_LONG_SYNC, 0L)).longValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 L0 = longValue != 0 ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().L0(longValue) : null;
        if (L0 == null || L0.f68462xfd5e9919 != 0) {
            return null;
        }
        return L0;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 o() {
        long longValue = ((java.lang.Long) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.GAME_DISCOVERY_ENTRANCE_MSGID_LONG_SYNC, 0L)).longValue();
        if (longValue != 0) {
            return ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().L0(longValue);
        }
        return null;
    }

    public boolean p(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 e1Var) {
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_GAME_MESSAGE_SETTING_HIDE_CONF_STRING, "");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        java.lang.String str2 = str != null ? str : "";
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            try {
                org.json.JSONArray jSONArray = new org.json.JSONArray(str2);
                for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                    arrayList.add(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p.a(jSONArray.optString(i17)));
                }
            } catch (org.json.JSONException unused) {
            }
        }
        long i18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p pVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p) it.next();
            if (pVar.f221929a <= i18 && pVar.f221930b >= i18) {
                if (e1Var.f221812d2.f221955m == pVar.f221931c) {
                    return true;
                }
                if (((java.util.ArrayList) pVar.f221932d).contains(e1Var.f68458xd54c6aa5)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean q(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 e1Var) {
        if (e1Var == null) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.q0 q0Var = e1Var.f221812d2;
        if (q0Var.f221956n) {
            return false;
        }
        java.lang.String valueOf = java.lang.String.valueOf(q0Var.f221955m);
        java.lang.String a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.f.a();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17)) {
            return false;
        }
        for (java.lang.String str : a17.split(",")) {
            if (str.equals(valueOf)) {
                return true;
            }
        }
        return false;
    }

    public final boolean r(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 e1Var) {
        if (e1Var == null) {
            return true;
        }
        return e1Var.f68456x876650f1 < java.lang.System.currentTimeMillis() / 1000;
    }

    public void s(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 e1Var) {
        if (e1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameMessageService", "onReceiveNewReddotCmd message is null");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameMessageService", "onReceiveNewReddotCmd gameMsgId:%s msgType:%d", e1Var.f68458xd54c6aa5, java.lang.Integer.valueOf(e1Var.f68469xc4aab016));
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e1Var.f68458xd54c6aa5)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 k17 = k();
            if (k17 != null && e1Var.f68458xd54c6aa5.equals(k17.f68458xd54c6aa5)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameMessageService", "onReceiveNewReddotCmd same reddot already showing, gameMsgId:%s currentMsgId:%d newMsgId:%d", e1Var.f68458xd54c6aa5, java.lang.Long.valueOf(k17.f68468x297eb4f7), java.lang.Long.valueOf(e1Var.f68468x297eb4f7));
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.o1 Di = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di();
            java.lang.String str = e1Var.f68458xd54c6aa5;
            Di.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameMessageService", "onReceiveNewReddotCmd delete old message, gameMsgId:%s deleted:%b", e1Var.f68458xd54c6aa5, java.lang.Boolean.valueOf(Di.m145253xb158737d("GameRawMessage", "delete from GameRawMessage where gameMsgId = \"" + str + "\"")));
        }
        a(e1Var, u(e1Var));
    }

    public final void t(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 e1Var) {
        if (e1Var == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.q0 q0Var = e1Var.f221812d2;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(q0Var.f221944b)) {
            return;
        }
        if (q0Var.f221954l) {
            r53.f.B(q0Var.f221944b, 0.083333336f);
        } else {
            r53.f.B(q0Var.f221944b, 0.0f);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x04ca, code lost:
    
        if (r4.moveToFirst() != false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x04cc, code lost:
    
        r9 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1();
        r9.mo9015xbf5d97fd(r4);
        r10.add(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x04db, code lost:
    
        if (r4.moveToNext() != false) goto L427;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x04dd, code lost:
    
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x018b, code lost:
    
        if (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.r(r5, r0) == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x01bd, code lost:
    
        if (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.r(r5, r0) != false) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:124:0x075c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0760  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x098e  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x08b3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x08d4  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0954  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int u(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 r33) {
        /*
            Method dump skipped, instructions count: 2449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.i1.u(com.tencent.mm.plugin.game.model.e1):int");
    }

    public final void v(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 e1Var) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e1Var.G2.f221922a)) {
            d();
        } else {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.GAME_INDEX_BANNER_MSGID_LONG_SYNC, java.lang.Long.valueOf(e1Var.f68468x297eb4f7));
        }
    }

    public final void w(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 e1Var) {
        if (e1Var.f221813e2) {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.GAME_INDEX_BUBBLE_MSGID_LONG_SYNC, java.lang.Long.valueOf(e1Var.f68468x297eb4f7));
        } else {
            e();
        }
    }

    public void x(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 e1Var) {
        if ((java.lang.System.currentTimeMillis() - com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("game_redot").getLong("red_dot_exit_time", 0L)) / 1000 > com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.j().f405097h) {
            z(e1Var);
            y(e1Var);
            w(e1Var);
            v(e1Var);
        }
    }

    public final void y(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 e1Var) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e1Var.f221824p2.f221856a)) {
            f();
        } else {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.GAME_INDEX_FLOATLAYER_MSGID_LONG_SYNC, java.lang.Long.valueOf(e1Var.f68468x297eb4f7));
        }
    }

    public boolean z(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 e1Var) {
        if (!e1Var.f221810c2) {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.GAME_DISCOVERY_ENTRANCE_MSGID_LONG_SYNC, 0L);
            return false;
        }
        if (r53.f.n(e1Var.K2.f222094s)) {
            return false;
        }
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.GAME_DISCOVERY_ENTRANCE_MSGID_LONG_SYNC, java.lang.Long.valueOf(e1Var.f68468x297eb4f7));
        return true;
    }
}
