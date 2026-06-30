package vh4;

/* loaded from: classes11.dex */
public class f2 implements com.p314xaae8f345.mm.p944x882e457a.u0 {
    public f2(vh4.t1 t1Var) {
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.j25 j25Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TeenModeService", "disable teen mode scene end errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (i17 == 0 && i18 == 0) {
            try {
                r45.i25 i25Var = ((e21.j) m1Var).f328070e.f328054b.f328061a;
                int i19 = i25Var.f458220d;
                if (i19 == 0 && (j25Var = i25Var.f458221e) != null && j25Var.f459051e != null) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
                    com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SETTING_TEEN_MODE_STATE_BOOLEAN_SYNC;
                    java.lang.Boolean bool = java.lang.Boolean.FALSE;
                    c17.x(u3Var, bool);
                    gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SETTING_TEEN_MODE_ENABLE_BY_SYS_BOOLEAN_SYNC, bool);
                    ((uh4.c0) i95.n0.c(uh4.c0.class)).b8();
                    ((uh4.c0) i95.n0.c(uh4.c0.class)).T(4);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TeenModeService", "summeroplog tryStartNetscene onSceneEnd Ret:%d  not ok and no retry.", java.lang.Integer.valueOf(i19));
                dp.a.m125853x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.f575378pb5, 0).show();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TeenModeService", "disable teen mode scene end handle error: %s", e17.toString());
            }
        }
    }
}
