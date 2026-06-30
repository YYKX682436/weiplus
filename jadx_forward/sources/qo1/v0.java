package qo1;

/* loaded from: classes5.dex */
public final class v0 extends qo1.f0 {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f447088y = 0;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f447089w;

    /* renamed from: x, reason: collision with root package name */
    public volatile boolean f447090x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g pkgInfo, com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.o0 taskType) {
        super(pkgInfo, taskType);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pkgInfo, "pkgInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskType, "taskType");
        this.f447089w = "MicroMsg.RoamBackupTask-" + this.f447016i;
    }

    @Override // qo1.j0
    public boolean b() {
        boolean z17;
        synchronized (this.f447017j) {
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0 n0Var = this.f447018k;
            if (n0Var != com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0.AFFROAM_TASK_STATE_PREPARING && n0Var != com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0.AFFROAM_TASK_STATE_DELETING) {
                z17 = n0Var == com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0.AFFROAM_TASK_STATE_RUNNING;
            }
        }
        return z17;
    }

    @Override // qo1.f0
    public java.lang.String n() {
        return this.f447089w;
    }

    @Override // qo1.f0
    public void s() {
        if (k()) {
            return;
        }
        this.f447023p = false;
        this.f447025r = this.f447008a;
        this.f447024q = new qo1.s0(this);
        i();
    }

    public final void t() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamBackupTask", "[stopSync] pkgId=" + this.f447016i);
        java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        ((ku5.t0) ku5.t0.f394148d).g(new qo1.u0(this, countDownLatch));
        countDownLatch.await();
    }
}
