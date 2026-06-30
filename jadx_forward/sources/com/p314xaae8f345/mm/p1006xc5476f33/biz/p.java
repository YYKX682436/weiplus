package com.p314xaae8f345.mm.p1006xc5476f33.biz;

/* loaded from: classes11.dex */
public class p implements java.lang.Runnable {
    public p(com.p314xaae8f345.mm.p1006xc5476f33.biz.q qVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        p012xc85e97e9.p093xedfae76a.c1 a17;
        synchronized (jm0.k.f381803i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(c01.sa.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new p012xc85e97e9.p093xedfae76a.j1(gm0.j1.b().f354778h, new jm0.h()).a(c01.sa.class);
        }
        l75.k0 Q4 = ((c01.sa) a17).Q4();
        if (Q4 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("PluginBiz", "INewBizDataDB == null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        p75.n0 n0Var = dm.l1.Q;
        p75.l0 a18 = n0Var.h(dm.l1.R.h()).a();
        int m17 = a18.m(Q4);
        int m18 = a18.m(gm0.j1.u().f354686f);
        if (m17 >= 50 || m17 >= m18) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PluginBiz", "start migrateOldDb");
        p75.i0 i17 = n0Var.i();
        i17.e(dm.l1.S.u());
        i17.c(50, 0);
        java.util.List k17 = i17.a().k(gm0.j1.u().f354686f, com.p314xaae8f345.mm.p2621x8fb0427b.s1.class);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6344xfd0164d5 c6344xfd0164d5 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6344xfd0164d5();
        c6344xfd0164d5.f136945e = 1L;
        c6344xfd0164d5.k();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1378L, 21L, 1L, false);
        java.util.Iterator it = ((java.util.ArrayList) k17).iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p2621x8fb0427b.s1 s1Var = (com.p314xaae8f345.mm.p2621x8fb0427b.s1) it.next();
            s1Var.getClass();
            new m75.c(s1Var, true, null, null, "MicroMsg.SDK.BaseBizTimeLineInfo").a(Q4);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PluginBiz", "sql duration statistic: loop -> %s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        yq1.z zVar = (yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class));
        zVar.getClass();
        zVar.k().G(java.lang.String.valueOf("Biz_" + gm0.j1.b().j() + "_UserHasMigrateUnEncryptBizDb"), true);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6344xfd0164d5 c6344xfd0164d52 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6344xfd0164d5();
        c6344xfd0164d52.f136945e = 2L;
        c6344xfd0164d52.k();
        com.p314xaae8f345.mm.p2621x8fb0427b.b2 nj6 = r01.q3.nj();
        if (nj6 != null) {
            nj6.n1();
        }
    }
}
