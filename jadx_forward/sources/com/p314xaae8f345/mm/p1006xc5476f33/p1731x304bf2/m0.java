package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2;

/* loaded from: classes8.dex */
public class m0 extends com.p314xaae8f345.mm.app.s2 {
    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppBackground */
    public void mo8889x3be51a90(java.lang.String str) {
        if (gm0.j1.a() && gm0.j1.b().f354787q) {
            gm0.j1.b();
            if (gm0.m.r()) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameEventListener", "appForegroundListener, onAppBackground(%s)", str);
            r53.d dVar = r53.b.f474173a;
            long j17 = dVar.f474182c.f474178d;
            if (j17 > 0 && j17 < java.lang.System.currentTimeMillis()) {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                r53.c cVar = dVar.f474182c;
                cVar.f474177c += currentTimeMillis - cVar.f474178d;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.n0.F.c(600000L, 0L);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("del_game_msg").getBoolean("del_mark", false)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameEventListener", "gamelog.dbClean, del mark: true");
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("del_game_msg").putBoolean("del_mark", false);
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.i1 Ai = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.n1) ((m33.r1) i95.n0.c(m33.r1.class))).Ai();
                Ai.getClass();
                ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.m1(Ai));
            }
        }
    }

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppForeground */
    public void mo8890x1952ea5(java.lang.String str) {
        if (gm0.j1.a() && gm0.j1.b().f354787q) {
            gm0.j1.b();
            if (gm0.m.r()) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameEventListener", "appForegroundListener, onAppForeground(%s)", str);
            r53.c cVar = r53.b.f474173a.f474182c;
            if (cVar.f474175a > 0) {
                cVar.f474178d = java.lang.System.currentTimeMillis();
            }
            java.lang.Long valueOf = java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.r1((java.lang.Long) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_GAME_PULL_GLOBAL_CONFIG_TIME_LONG, 0L)));
            if (valueOf.longValue() == 0 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1() <= valueOf.longValue()) {
                java.lang.String v17 = gm0.j1.u().c().v(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_GAME_PULL_GLOBAL_CONFIG_CLIENT_VERSION_STRING, "");
                if (v17 == null) {
                    v17 = "";
                }
                java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274644g;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameEventListener", "checkClientVersionChange preClientVersion:%s, currentClientVersion:%s", v17, str2);
                if (!str2.equals(v17)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.j.a().b(true, 5);
                }
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.j.a().b(true, 1);
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_GAME_LAST_SAVED_VERSION_CODE_INT;
            int intValue = ((java.lang.Integer) c17.m(u3Var, 0)).intValue();
            if (3120 != intValue) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameEventListener", "checkVersionChange lastVersion:%d, currentVersion:%d", java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(com.p314xaae8f345.mm.p639x2e3af2.C7183xce2ad330.f21567x85be6914));
                gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(com.p314xaae8f345.mm.p639x2e3af2.C7183xce2ad330.f21567x85be6914));
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5571xfff98751 c5571xfff98751 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5571xfff98751();
                am.le leVar = c5571xfff98751.f135891g;
                leVar.f88776a = 5;
                leVar.f88777b = java.lang.String.valueOf(5);
                c5571xfff98751.e();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.n0.F.d();
            d43.b bVar = d43.b.f307944d;
            b43.d dVar = d43.b.f307945e;
            synchronized (dVar) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameChatRoom.GetMyChatRoomKeepAliveService", "resumeKeepAlive");
                if (dVar.f99339h && dVar.f99338g) {
                    dVar.a(dVar.f99344p, dVar.f99341m, dVar.f99342n);
                    dVar.f99339h = false;
                }
            }
        }
    }
}
