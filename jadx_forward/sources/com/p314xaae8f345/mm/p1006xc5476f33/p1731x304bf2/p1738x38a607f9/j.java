package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9;

/* loaded from: classes8.dex */
public class j implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: f, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.j f220916f;

    /* renamed from: d, reason: collision with root package name */
    public boolean f220917d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f220918e = false;

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.j a() {
        if (f220916f == null) {
            synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.j.class) {
                if (f220916f == null) {
                    f220916f = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.j();
                }
            }
        }
        return f220916f;
    }

    public synchronized void b(boolean z17, int i17) {
        boolean z18;
        if (!z17) {
            if (java.lang.Math.abs(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H1(java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.r1((java.lang.Long) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_GAME_GLOBAL_CONFIG_UPDATE_TIME_LONG, 0L))).longValue())) <= 86400) {
                z18 = false;
                if ((!z18 || (!com.p314xaae8f345.mm.vfs.w6.j(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.c()))) && !this.f220917d) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameConfigUpdater", "Game config start update. force update(%b)", java.lang.Boolean.valueOf(z17));
                    this.f220917d = false;
                    gm0.j1.d().q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.s.f34650x366c91de, this);
                    this.f220917d = true;
                    this.f220918e = z17;
                    gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_GAME_PULL_GLOBAL_CONFIG_TIME_LONG, 0L);
                    gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_GAME_PULL_GLOBAL_CONFIG_CLIENT_VERSION_STRING, com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274644g);
                    gm0.j1.d().a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.s.f34650x366c91de, this);
                    gm0.j1.d().g(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.k(i17));
                }
            }
        }
        z18 = true;
        if (!z18) {
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameConfigUpdater", "Game config start update. force update(%b)", java.lang.Boolean.valueOf(z17));
        this.f220917d = false;
        gm0.j1.d().q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.s.f34650x366c91de, this);
        this.f220917d = true;
        this.f220918e = z17;
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_GAME_PULL_GLOBAL_CONFIG_TIME_LONG, 0L);
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_GAME_PULL_GLOBAL_CONFIG_CLIENT_VERSION_STRING, com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274644g);
        gm0.j1.d().a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.s.f34650x366c91de, this);
        gm0.j1.d().g(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.k(i17));
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var.mo808xfb85f7b0() == 1311) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameConfigUpdater", "getGameCenterGlobalSetting sceneEnd, %s, %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            if (gm0.j1.b().m()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameConfigUpdater", "updateTime, isForceUpdate: %b", java.lang.Boolean.valueOf(this.f220918e));
                if (!this.f220918e) {
                    gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_GAME_GLOBAL_CONFIG_UPDATE_TIME_LONG, java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()));
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GameConfigUpdater", "account not init.");
            }
            this.f220917d = false;
            gm0.j1.d().q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.s.f34650x366c91de, this);
        }
    }
}
