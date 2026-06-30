package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29;

/* loaded from: classes8.dex */
public class a2 {

    /* renamed from: a, reason: collision with root package name */
    public long f221731a = 0;

    /* renamed from: b, reason: collision with root package name */
    public long f221732b = 0;

    public boolean a() {
        boolean z17 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.m() != null ? com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.m().f405117f : false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameRedDotService", "disableFinderReddot:%b", java.lang.Boolean.valueOf(z17));
        return !z17;
    }

    public boolean b() {
        if (a()) {
            return ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().p("Game.Entrance", ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().L0("Game.Entrance"));
        }
        return false;
    }

    public void c(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.n1 n1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.n1) ((m33.r1) i95.n0.c(m33.r1.class))).Ai().n();
        if (n17 == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.o1 Di = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di();
        long j17 = n17.f68468x297eb4f7;
        Di.getClass();
        Di.m145253xb158737d("GameRawMessage", "update GameRawMessage set isRedDotExited=1 where msgId=" + j17);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("game_redot").putString("outer_color_text", "");
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.i1 Ai = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.n1) ((m33.r1) i95.n0.c(m33.r1.class))).Ai();
        Ai.g();
        Ai.f();
        Ai.e();
        Ai.d();
        if (n1Var == com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.n1.GAME_REDDOT_EXIT_USER_CLICK) {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LAST_CLICK_GAME_REDDOT_TIME_LONG, java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()));
        }
        n17.t0();
        e(n17, n1Var);
        if (this.f221732b == n17.f68468x297eb4f7) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("game_redot").putLong("red_dot_exit_time", java.lang.System.currentTimeMillis());
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("game_redot").putInt("red_dot_exit_reason", n1Var.ordinal());
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("game_redot").putString("red_dot_exit_gamemsgid", n17.f68458xd54c6aa5);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("game_redot").putLong("red_dot_exit_msgid", n17.f68468x297eb4f7);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameRedDotService", "gamelog.srv_msg, service, reddotExit, msgId: %d gameMsgId:%s exit with exposured cnt: %d, reason: %s, title:%s.", java.lang.Long.valueOf(n17.f68468x297eb4f7), n17.f68458xd54c6aa5, java.lang.Integer.valueOf(n17.f68457xd6b2d4b7), n1Var, n17.f221812d2.f221945c);
        if (a()) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5473x47b32e0a c5473x47b32e0a = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5473x47b32e0a();
            c5473x47b32e0a.f135811g.f88468a = 3;
            c5473x47b32e0a.e();
        }
    }

    public int d() {
        java.lang.String[] split = ((java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_GAME_SINGLE_DAY_REDDOT_EXPOSURED_CNT_STRING, "")).split("_");
        if (split.length != 2) {
            return 0;
        }
        try {
            boolean T0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.T0(java.lang.Long.parseLong(split[0]), java.lang.System.currentTimeMillis());
            int parseInt = java.lang.Integer.parseInt(split[1]);
            if (T0) {
                return parseInt;
            }
            return 0;
        } catch (java.lang.NumberFormatException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.GameRedDotService", e17, "", new java.lang.Object[0]);
            return 0;
        }
    }

    public boolean e(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 e1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.n1 n1Var) {
        if (e1Var == null || e1Var.f68458xd54c6aa5 == null) {
            return false;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("reddot_strategy", com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.d.a() ? "1" : "0");
        hashMap.put("channel", java.lang.Integer.toString(e1Var.f68450xa09e2abe));
        hashMap.put("expo_times", java.lang.String.valueOf(e1Var.f68457xd6b2d4b7));
        hashMap.put("cexpo_times", java.lang.String.valueOf(e1Var.f68452x595e0550));
        hashMap.put("exit_reason", java.lang.String.valueOf(n1Var.ordinal()));
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.k0 k0Var = e1Var.O2;
        if (k0Var != null) {
            hashMap.put("mt", java.lang.String.valueOf(k0Var.f221880a));
        }
        hashMap.put("iee", e1Var.Y2 ? "1" : "0");
        java.lang.String a17 = com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.a("resource", java.lang.String.valueOf(e1Var.f68469xc4aab016), e1Var.U2, hashMap);
        if (!e1Var.f68470x672cb5cf) {
            return true;
        }
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 9, 901, 1, 96, 0, e1Var.f68449x28d45f97, 0, e1Var.S2, e1Var.f68458xd54c6aa5, e1Var.T2, a17);
        return true;
    }

    public boolean f() {
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_game_reddot_newsync_ios, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameRedDotService", "shouldEnableGameNewSync:%b", java.lang.Boolean.valueOf(fj6));
        return fj6;
    }
}
