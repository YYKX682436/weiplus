package qo1;

/* loaded from: classes5.dex */
public final class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qo1.f0 f447099d;

    public z(qo1.f0 f0Var) {
        this.f447099d = f0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0 n0Var;
        qo1.i0 i0Var;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.m0 a17;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0 n0Var2;
        if (this.f447099d.b()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BaseRoamTask", "State error. Try start a task at " + this.f447099d.f447018k);
            return;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.a2 a2Var = this.f447099d.f447012e;
        if (a2Var != null && (a17 = a2Var.a()) != null && (n0Var2 = a17.f297438g) != null && (n0Var2 == com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0.AFFROAM_TASK_STATE_PREPARING || n0Var2 == com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0.AFFROAM_TASK_STATE_RUNNING || n0Var2 == com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0.AFFROAM_TASK_STATE_IMPORTING)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BaseRoamTask", "State error. State of inner task is " + n0Var2);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseRoamTask", "There is no running task for pkgId=" + this.f447099d.f447016i + ". Now, we can start a new task or resume the exist task.");
        qo1.f0 f0Var = this.f447099d;
        ((ku5.t0) ku5.t0.f394148d).A(f0Var.n());
        f0Var.f447026s = true;
        f0Var.f447011d = java.lang.System.currentTimeMillis();
        f0Var.f447020m = 1;
        synchronized (f0Var.f447017j) {
            n0Var = com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0.AFFROAM_TASK_STATE_PREPARING;
            i0Var = qo1.i0.f447035f;
            f0Var.g(n0Var, i0Var);
            f0Var.r(n0Var);
            f0Var.f447019l = i0Var;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0.f174217a.o(f0Var, n0Var, i0Var);
        f0Var.j();
    }
}
