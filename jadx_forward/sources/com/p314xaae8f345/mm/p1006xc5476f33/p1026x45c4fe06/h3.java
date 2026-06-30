package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public class h3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final long f159793d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.i3 f159794e;

    public h3(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.i3 i3Var) {
        this.f159794e = i3Var;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f159793d = android.os.SystemClock.elapsedRealtime();
    }

    @Override // java.lang.Runnable
    public void run() {
        sj1.l.h(this.f159794e.f159863e.f156338p.f158811d, this.f159794e.f159863e.J1);
        sj1.l.h(this.f159794e.f159863e.f156338p.f158811d, this.f159794e.f159863e.f156338p.f158823s);
        if (this.f159794e.f159862d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandRuntime_$_RuntimePrepareAllDoneInitNotify", "PrepareAllDoneInitNotify.done() hash[%d] check2 dead appId[%s]", java.lang.Integer.valueOf(hashCode()), this.f159794e.f159863e.f156336n);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2 = this.f159794e.f159863e;
        c11510xdd90c2f2.L1 = null;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        c11510xdd90c2f2.K("RuntimePrepareAllDoneInitNotify run() waited %dms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - this.f159793d));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.i3 i3Var = this.f159794e;
        i3Var.getClass();
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f22 = i3Var.f159863e;
            c11510xdd90c2f22.f156332h.mo50278x2f39f4(c11510xdd90c2f22.f156333i, "AppBrandRuntimeProfile|dump mUiHandler");
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandRuntime_$_RuntimePrepareAllDoneInitNotify", "dumpUiThreadInQueueMessages get exception:%s", th6);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f23 = this.f159794e.f159863e;
        sj1.l.i(c11510xdd90c2f23.f156338p.f158811d, "internal:prepare", "AppBrandRuntime#initRuntime");
        if (!c11510xdd90c2f23.L0()) {
            if (c11510xdd90c2f23.J0()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandRuntime", "initRuntime, mInitialized TRUE !!!  go check callee %s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(new java.lang.Throwable()));
            } else {
                c11510xdd90c2f23.K("initRuntime", new java.lang.Object[0]);
                new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.c2(c11510xdd90c2f23).run();
            }
        }
        sj1.l.g(this.f159794e.f159863e.f156336n);
    }
}
