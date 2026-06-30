package l33;

/* loaded from: classes2.dex */
public final class b implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public static final l33.b f396960d = new l33.b();

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public final int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        m53.o oVar2;
        m53.r rVar;
        m53.o oVar3;
        m53.r rVar2;
        if (i17 == 0 && i18 == 0 && (fVar = oVar.f152244b.f152233a) != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.game.protobuf.GetUserGameCenterAccountInfoResponse");
            m53.t2 t2Var = (m53.t2) fVar;
            m53.b bVar = t2Var.f405603d;
            long j17 = (bVar == null || (oVar3 = bVar.f405100d) == null || (rVar2 = oVar3.f405464d) == null) ? -1L : rVar2.f405529f;
            l33.c.f396962b = t2Var.f405604e;
            int i19 = (bVar == null || (oVar2 = bVar.f405100d) == null || (rVar = oVar2.f405464d) == null) ? 0 : rVar.f405528e;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameAccountManager", "gamelog.account, manage , handleCgiAccountState state = " + i19);
            if (i19 == 0) {
                if (j17 != -1) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
                    com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.GAME_ACCOUNT_APPLY_DEL_TIME_LONG_SYNC;
                    long t17 = c17.t(u3Var, -1L);
                    if (t17 != -1) {
                        if (j17 >= t17) {
                            l33.c.b();
                        } else {
                            gm0.j1.u().c().x(u3Var, -1L);
                        }
                    }
                } else {
                    com.p314xaae8f345.mm.p2621x8fb0427b.n3 c18 = gm0.j1.u().c();
                    com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var2 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.GAME_ACCOUNT_APPLY_DEL_TIME_LONG_SYNC;
                    if (c18.t(u3Var2, -1L) != -1) {
                        gm0.j1.u().c().x(u3Var2, -1L);
                    }
                }
                l33.c.f396961a = 0;
            } else if (i19 == 1) {
                l33.c.f396961a = 1;
                com.p314xaae8f345.mm.p2621x8fb0427b.n3 c19 = gm0.j1.u().c();
                com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var3 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.GAME_ACCOUNT_APPLY_DEL_TIME_LONG_SYNC;
                if (c19.t(u3Var3, -1L) == -1) {
                    gm0.j1.u().c().x(u3Var3, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() / 1000));
                    l33.c.a();
                }
            } else if (i19 == 2 || i19 == 3) {
                l33.c.b();
                l33.c.f396961a = 3;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("GameAccountManager", "gamelog.account, manage , handleCgiAccountState state = " + i19);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("GameAccountManager", "gamelog.cgi getusergamecenteraccountinfo CGI return, errType = " + i17 + ", errCode = " + str);
        }
        return 0;
    }
}
