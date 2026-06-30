package qo1;

/* loaded from: classes5.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f447005d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qo1.f0 f447006e;

    public f(boolean z17, qo1.f0 f0Var) {
        this.f447005d = z17;
        this.f447006e = f0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0 n0Var;
        qo1.i0 i0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseRoamTask", "Continue start Task, isConnected=" + this.f447005d + ", runnable=" + this.f447006e.f447026s);
        qo1.f0 f0Var = this.f447006e;
        if (!f0Var.f447026s) {
            f0Var.g(com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0.AFFROAM_TASK_STATE_STOPPED, qo1.i0.f447035f);
            return;
        }
        if (this.f447005d) {
            f0Var.s();
            return;
        }
        f0Var.f447020m = 0;
        qo1.f0 f0Var2 = this.f447006e;
        synchronized (f0Var2.f447017j) {
            n0Var = com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0.AFFROAM_TASK_STATE_ERROR;
            i0Var = qo1.i0.f447042p;
            f0Var2.g(n0Var, i0Var);
            f0Var2.r(n0Var);
            f0Var2.f447019l = i0Var;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0.f174217a.o(this.f447006e, n0Var, i0Var);
    }
}
