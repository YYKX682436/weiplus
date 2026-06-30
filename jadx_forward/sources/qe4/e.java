package qe4;

/* loaded from: classes9.dex */
public class e implements java.lang.Runnable {
    public e(qe4.f fVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SOTER_REPORT_TIMESTAMP_LONG_SYNC;
        long longValue = ((java.lang.Long) c17.m(u3Var, 0L)).longValue();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - longValue <= 86400000 || !cu5.b.c()) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1034, 1);
        gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(currentTimeMillis));
    }
}
