package com.p314xaae8f345.mm.p642xad8b531f;

/* loaded from: classes8.dex */
public abstract class h2 {
    public static void a() {
        try {
            if (gm0.j1.a() && !gm0.m.r()) {
                com.p314xaae8f345.mm.p2621x8fb0427b.n3 p17 = c01.d9.b().p();
                com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_OS_INFO_REPORT_LONG_SYNC;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H1(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.k1((java.lang.Long) p17.m(u3Var, null), 0L)) < 86400) {
                    return;
                }
                boolean a17 = wo.a1.a();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344(1776, 100, 1));
                if (a17) {
                    arrayList.add(new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344(1776, 101, 1));
                } else {
                    arrayList.add(new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344(1776, 102, 1));
                }
                jx3.f.INSTANCE.b(arrayList, false);
                c01.d9.b().p().x(u3Var, java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PostTaskReportOSInfo", "report PostTaskReportOSInfo done ");
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.PostTaskReportOSInfo", th6, "", new java.lang.Object[0]);
        }
    }
}
