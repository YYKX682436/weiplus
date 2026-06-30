package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* renamed from: com.tencent.mm.plugin.appbrand.w1$$a */
/* loaded from: classes7.dex */
public final /* synthetic */ class RunnableC12746x6a3bf07 implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        if (gm0.j1.b().f354787q) {
            try {
                boolean z17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.e4.g() && com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.e4.c();
                long j17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11807xf443363a.b().N.f158792d;
                com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
                com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_APP_BRAND_PRUNE_PKG_NEXT_TIME_SEC_LONG;
                long longValue = ((java.lang.Long) c17.m(u3Var, 0L)).longValue();
                long i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
                if (i17 < longValue && !z17) {
                    long j18 = i17 + j17;
                    if (j18 < longValue) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandPruner", "AccountScopedRunnable.run() invalid freq control mark, next:%d, now:%d, interval:%d", java.lang.Long.valueOf(longValue), java.lang.Long.valueOf(i17), java.lang.Long.valueOf(j17));
                        gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(j18));
                        return;
                    }
                    return;
                }
                gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(i17 + j17));
                long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                try {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.l3.f157174a.run();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.r1.c();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.c2.a();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.k1.a();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.s3.b(android.os.SystemClock.elapsedRealtime() - elapsedRealtime);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.i3.f157121a.run();
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.c4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.cc) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.cc.class))).Ri();
                    s81.b bVar = (s81.b) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(s81.b.class);
                    if (bVar != null) {
                        bVar.z0();
                    }
                    ri1.g.b();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.s0.a();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.g3.f157081a.run();
                    if (z17 && ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.j0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.j0.class)) != null && com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.g7.f157088b == null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.g7.f157088b = p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.f7(false, null), 2, null);
                    }
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.s3.b(android.os.SystemClock.elapsedRealtime() - elapsedRealtime);
                    throw th6;
                }
            } catch (java.lang.Exception e17) {
                if (!(e17 instanceof android.system.ErrnoException)) {
                    throw e17;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandPruner", "runNow() get ErrnoException:%s", e17);
            }
        }
    }
}
