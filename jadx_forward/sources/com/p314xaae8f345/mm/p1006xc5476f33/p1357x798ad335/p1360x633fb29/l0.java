package com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29;

/* loaded from: classes8.dex */
public class l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Vector f178611a;

    static {
        java.util.Vector vector = new java.util.Vector();
        f178611a = vector;
        vector.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.c0());
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1[] a(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.l0 l0Var) {
        l0Var.getClass();
        java.util.Vector vector = f178611a;
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1[]) vector.toArray(new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1[vector.size()]);
    }

    public void b(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloaderCallbackManager", "notifyMd5Checking: %d", java.lang.Long.valueOf(j17));
        ((java.util.HashSet) com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.n0.f178621a).add(java.lang.Long.valueOf(j17));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.k0(this, j17));
    }

    public void c(long j17, int i17, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloaderCallbackManager", "notifyTaskFailed: %d, errCode : %d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17));
        ((java.util.HashSet) com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.n0.f178621a).remove(java.lang.Long.valueOf(j17));
        h02.a c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(j17);
        if (c17 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.api.f.d(c17.f68411x238eb002, c17.f68433xf9fba680);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.h0(this, j17, i17, z17));
    }

    public void d(long j17, java.lang.String str, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloaderCallbackManager", "notifyTaskFinished: %d", java.lang.Long.valueOf(j17));
        ((java.util.HashSet) com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.n0.f178621a).remove(java.lang.Long.valueOf(j17));
        h02.a c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(j17);
        if (c17 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.api.f.d(c17.f68411x238eb002, c17.f68433xf9fba680);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g0(this, j17, str, z17));
    }

    public void e(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloaderCallbackManager", "notifyTaskPaused: %d", java.lang.Long.valueOf(j17));
        h02.a c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(j17);
        if (c17 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.api.f.d(c17.f68411x238eb002, c17.f68433xf9fba680);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.i0(this, j17));
    }

    public void f(long j17, java.lang.String str, long j18, long j19) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.j0(this, j17, str, j18, j19));
    }

    public void g(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloaderCallbackManager", "notifyTaskRemoved: %d", java.lang.Long.valueOf(j17));
        h02.a c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(j17);
        if (c17 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.api.f.d(c17.f68411x238eb002, c17.f68433xf9fba680);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.f0(this, j17));
    }

    public void h(long j17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloaderCallbackManager", "notifyTaskResumed: %d, %s", java.lang.Long.valueOf(j17), str);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.e0(this, j17, str));
    }

    public void i(long j17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloaderCallbackManager", "notifyTaskStarted: %d, %s", java.lang.Long.valueOf(j17), str);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.d0(this, j17, str));
    }
}
