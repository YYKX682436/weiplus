package com.tencent.mm.booter;

/* loaded from: classes8.dex */
public abstract class h2 {
    public static void a() {
        try {
            if (gm0.j1.a() && !gm0.m.r()) {
                com.tencent.mm.storage.n3 p17 = c01.d9.b().p();
                com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_OS_INFO_REPORT_LONG_SYNC;
                if (com.tencent.mm.sdk.platformtools.t8.H1(com.tencent.mm.sdk.platformtools.t8.k1((java.lang.Long) p17.m(u3Var, null), 0L)) < 86400) {
                    return;
                }
                boolean a17 = wo.a1.a();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(new com.tencent.mars.smc.IDKey(1776, 100, 1));
                if (a17) {
                    arrayList.add(new com.tencent.mars.smc.IDKey(1776, 101, 1));
                } else {
                    arrayList.add(new com.tencent.mars.smc.IDKey(1776, 102, 1));
                }
                jx3.f.INSTANCE.b(arrayList, false);
                c01.d9.b().p().x(u3Var, java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.i1()));
                com.tencent.mars.xlog.Log.i("MicroMsg.PostTaskReportOSInfo", "report PostTaskReportOSInfo done ");
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.PostTaskReportOSInfo", th6, "", new java.lang.Object[0]);
        }
    }
}
