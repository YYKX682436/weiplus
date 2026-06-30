package com.tencent.mm.plugin.biz;

/* loaded from: classes11.dex */
public class p implements java.lang.Runnable {
    public p(com.tencent.mm.plugin.biz.q qVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        androidx.lifecycle.c1 a17;
        synchronized (jm0.k.f300270i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(c01.sa.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(c01.sa.class);
        }
        l75.k0 Q4 = ((c01.sa) a17).Q4();
        if (Q4 == null) {
            com.tencent.mars.xlog.Log.w("PluginBiz", "INewBizDataDB == null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        p75.n0 n0Var = dm.l1.Q;
        p75.l0 a18 = n0Var.h(dm.l1.R.h()).a();
        int m17 = a18.m(Q4);
        int m18 = a18.m(gm0.j1.u().f273153f);
        if (m17 >= 50 || m17 >= m18) {
            return;
        }
        com.tencent.mars.xlog.Log.i("PluginBiz", "start migrateOldDb");
        p75.i0 i17 = n0Var.i();
        i17.e(dm.l1.S.u());
        i17.c(50, 0);
        java.util.List k17 = i17.a().k(gm0.j1.u().f273153f, com.tencent.mm.storage.s1.class);
        com.tencent.mm.autogen.mmdata.rpt.BizQualityReportStruct bizQualityReportStruct = new com.tencent.mm.autogen.mmdata.rpt.BizQualityReportStruct();
        bizQualityReportStruct.f55412e = 1L;
        bizQualityReportStruct.k();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1378L, 21L, 1L, false);
        java.util.Iterator it = ((java.util.ArrayList) k17).iterator();
        while (it.hasNext()) {
            com.tencent.mm.storage.s1 s1Var = (com.tencent.mm.storage.s1) it.next();
            s1Var.getClass();
            new m75.c(s1Var, true, null, null, "MicroMsg.SDK.BaseBizTimeLineInfo").a(Q4);
        }
        com.tencent.mars.xlog.Log.i("PluginBiz", "sql duration statistic: loop -> %s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        yq1.z zVar = (yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class));
        zVar.getClass();
        zVar.k().G(java.lang.String.valueOf("Biz_" + gm0.j1.b().j() + "_UserHasMigrateUnEncryptBizDb"), true);
        com.tencent.mm.autogen.mmdata.rpt.BizQualityReportStruct bizQualityReportStruct2 = new com.tencent.mm.autogen.mmdata.rpt.BizQualityReportStruct();
        bizQualityReportStruct2.f55412e = 2L;
        bizQualityReportStruct2.k();
        com.tencent.mm.storage.b2 nj6 = r01.q3.nj();
        if (nj6 != null) {
            nj6.n1();
        }
    }
}
