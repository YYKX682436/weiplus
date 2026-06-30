package ho1;

/* loaded from: classes11.dex */
public final class q1 implements com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.h0, io1.d {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g0 f364320a;

    /* renamed from: b, reason: collision with root package name */
    public java.util.concurrent.ExecutorService f364321b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f364322c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f364323d;

    /* renamed from: e, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.y0 f364324e;

    /* renamed from: f, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.f2 f364325f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.concurrent.ExecutorService f364326g;

    /* renamed from: h, reason: collision with root package name */
    public final do1.a f364327h = new do1.a(true, false);

    public final void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamBackup.RoamProviderImpl", "initRecover");
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.v1 v1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.v1.f174447a;
        java.io.File file = new java.io.File(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.v1.f174452f);
        vz5.q.d(file);
        file.mkdirs();
        long D = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        int i17 = j62.e.g().l("clicfg_roam_recover_thread_pool_4_num", false, true, true) ? 4 : D < 10 ? 8 : 12;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamBackup.RoamProviderImpl", "[initRecover] insertThreadNum=" + i17 + ", totalMemInGb=" + D);
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        this.f364325f = new p3325xe03a0797.p3326xc267989b.g2(new java.util.concurrent.ThreadPoolExecutor(i17, i17, 0L, timeUnit, new java.util.concurrent.LinkedBlockingQueue(64), new ho1.b1("Roam-Recover-Pool1")));
        oz5.i a17 = p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null);
        p3325xe03a0797.p3326xc267989b.f2 f2Var = this.f364325f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(f2Var);
        this.f364324e = p3325xe03a0797.p3326xc267989b.z0.a(oz5.g.a((p3325xe03a0797.p3326xc267989b.c3) a17, f2Var));
        this.f364326g = new java.util.concurrent.ThreadPoolExecutor(i17, i17, 0L, timeUnit, new java.util.concurrent.LinkedBlockingQueue(128), new ho1.b1("Roam-Recover-Pool2"));
        ((ku5.t0) ku5.t0.f394148d).r(fo1.i.f346410d, "RoamBackup.MediaPullObserver");
    }

    public void b(boolean z17, com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0 state, qo1.i0 error) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(error, "error");
        if (state == com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0.AFFROAM_TASK_STATE_PAUSED || state == com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0.AFFROAM_TASK_STATE_QUIT || state == com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0.AFFROAM_TASK_STATE_STOPPED || state == com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0.AFFROAM_TASK_STATE_COMPLETED) {
            if (z17) {
                if (!(qo1.j1.f447056a.b(qo1.f1.f447029d) > 0)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamBackup.RoamProviderImpl", "RoamBackupTask release, onTaskStateChanged state = " + state.name() + ", hasInitRecover = " + this.f364322c);
                    synchronized (this) {
                        if (this.f364323d) {
                            this.f364323d = false;
                            java.util.concurrent.ExecutorService executorService = this.f364321b;
                            if (executorService != null) {
                                executorService.shutdownNow();
                            }
                            this.f364321b = null;
                        }
                    }
                    return;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamBackup.RoamProviderImpl", "RoamRestoreTask release, onTaskStateChanged state = " + state.name() + ", hasInitRecover = " + this.f364322c);
            synchronized (this) {
                if (this.f364322c) {
                    this.f364322c = false;
                    p3325xe03a0797.p3326xc267989b.y0 y0Var = this.f364324e;
                    if (y0Var != null) {
                        p3325xe03a0797.p3326xc267989b.z0.c(y0Var, null);
                    }
                    this.f364324e = null;
                    p3325xe03a0797.p3326xc267989b.f2 f2Var = this.f364325f;
                    if (f2Var != null) {
                        ((p3325xe03a0797.p3326xc267989b.g2) f2Var).close();
                    }
                    this.f364325f = null;
                    java.util.concurrent.ExecutorService executorService2 = this.f364326g;
                    if (executorService2 != null) {
                        ((java.util.concurrent.ThreadPoolExecutor) executorService2).shutdownNow();
                    }
                    this.f364326g = null;
                }
            }
        }
    }
}
