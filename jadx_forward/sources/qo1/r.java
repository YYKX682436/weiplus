package qo1;

/* loaded from: classes5.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qo1.f0 f447075d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.z f447076e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f447077f;

    public r(qo1.f0 f0Var, com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.z zVar, java.lang.String str) {
        this.f447075d = f0Var;
        this.f447076e = zVar;
        this.f447077f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qo1.i0 a17;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0 state;
        qo1.f0 f0Var = this.f447075d;
        java.lang.Object obj = f0Var.f447017j;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.z zVar = this.f447076e;
        java.lang.String str = this.f447077f;
        synchronized (obj) {
            qo1.h0 h0Var = qo1.i0.f447034e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(zVar);
            a17 = h0Var.a(zVar);
            if (a17 != qo1.i0.f447035f) {
                java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0 n0Var = com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0.AFFROAM_TASK_STATE_ERROR;
                f0Var.g(n0Var, a17);
                f0Var.r(n0Var);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                if (r26.n0.B(str, "stopped", false)) {
                    java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                    com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0 n0Var2 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0.AFFROAM_TASK_STATE_STOPPED;
                    f0Var.g(n0Var2, a17);
                    f0Var.r(n0Var2);
                } else {
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                    com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0 n0Var3 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0.AFFROAM_TASK_STATE_COMPLETED;
                    f0Var.g(n0Var3, a17);
                    f0Var.r(n0Var3);
                }
            }
            f0Var.getClass();
            f0Var.f447019l = a17;
            state = f0Var.f447018k;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseRoamTask", "TaskCompletedEvent newState=" + state + ", newError=" + a17 + ", error=" + this.f447076e + ", pkgId=" + this.f447075d.f447016i);
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0 r0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0.f174217a;
        qo1.f0 task = this.f447075d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewRoamBackupManager", "[notifyTaskComplete] pkgId=" + task.f447016i + ", state=" + state + ", error=" + a17);
        r0Var.r(task, state, a17);
    }
}
