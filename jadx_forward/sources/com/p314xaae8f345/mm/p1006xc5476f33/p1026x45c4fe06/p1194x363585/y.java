package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585;

/* loaded from: classes7.dex */
public class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.x0 f170749d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.x6 f170750e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.v1 f170751f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f170752g;

    public y(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.x0 x0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.x6 x6Var, com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.v1 v1Var, int i17) {
        this.f170749d = x0Var;
        this.f170750e = x6Var;
        this.f170751f = v1Var;
        this.f170752g = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandProcessPreloader[applaunch][preload]", "preInit start");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.C12596x96aa9e2c c12596x96aa9e2c = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.C12596x96aa9e2c) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.r.f170697e.get(this.f170749d);
            c12596x96aa9e2c.getClass();
            c12596x96aa9e2c.f170516i = android.os.SystemClock.elapsedRealtime();
            ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.i0.f(true);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.m(-2);
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.e8.c(true);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.u1.a();
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.u1.c();
                if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y7.f157598a.d() && (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.e8.b() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11653xaba0e3b3)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandProcessPreloader[applaunch][preload]", "skip preload runtime, not find commLib");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.r.n(this.f170749d);
                } else if (this.f170749d == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.x0.WAGAME) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.r.a(this.f170750e, this.f170751f);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandProcessPreloader[applaunch][preload]", "[wagame] misc preload done");
                } else {
                    cf.d dVar = new cf.d(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.s(this), 2);
                    if (this.f170752g >= 2) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.t tVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.t(this, dVar);
                        boolean z18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.da.f159108a;
                        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.da.class) {
                            z17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.da.f159109b;
                        }
                        if (z17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandProcessPreloader[applaunch][preload]", "XWebPreloader preloaded, trigger preloadAppBrandRuntime");
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(tVar);
                        } else {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.da.c(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u(this, java.lang.System.currentTimeMillis(), tVar));
                        }
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandProcessPreloader[applaunch][preload]", "run: skip preload webView");
                        dVar.a();
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.w wVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.w(this, dVar);
                    if (this.f170752g < 2) {
                        wVar.run();
                    } else {
                        ((ku5.t0) ku5.t0.f394148d).h(wVar, "MicroMsg.AppBrandProcessPreloader[applaunch][preload]_AppBrandServicePreloadWorker");
                    }
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandProcessPreloader[applaunch][preload]", "skip preload runtime, load CommLib get exception %s", android.util.Log.getStackTraceString(th6));
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.r.n(this.f170749d);
            }
        } finally {
            try {
            } finally {
            }
        }
    }
}
