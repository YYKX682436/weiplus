package qo1;

/* loaded from: classes5.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f447060d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qo1.f0 f447061e;

    public l(float f17, qo1.f0 f0Var) {
        this.f447060d = f17;
        this.f447061e = f0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.p0 c17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseRoamTask", "ProgressEvent percentage = %s", java.lang.Float.valueOf(this.f447060d));
        qo1.f0 f0Var = this.f447061e;
        if (!f0Var.f447015h) {
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.a2 a2Var = f0Var.f447012e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a2Var);
            long j17 = a2Var.c().f297483h;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            qo1.f0 f0Var2 = this.f447061e;
            long j18 = f0Var2.f447014g;
            if (j18 == -1 || j17 >= 10485760) {
                f0Var2.f447014g = currentTimeMillis;
            } else if (currentTimeMillis - j18 > 60000) {
                f0Var2.f447015h = true;
                com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0.f174217a.q(f0Var2.f447016i);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0 r0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0.f174217a;
        qo1.f0 task = this.f447061e;
        float f17 = this.f447060d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        java.util.Set refreshTaskUiListeners = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0.f174219c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(refreshTaskUiListeners, "refreshTaskUiListeners");
        synchronized (refreshTaskUiListeners) {
            java.util.Iterator it = refreshTaskUiListeners.iterator();
            while (it.hasNext()) {
                ((io1.c) it.next()).P5(task, f17);
            }
        }
        nv.v1 v1Var = (nv.v1) i95.n0.c(nv.v1.class);
        long j19 = task.f447016i;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.a2 a2Var2 = task.f447012e;
        v1Var.Bi(j19, (a2Var2 == null || (c17 = a2Var2.c()) == null) ? "" : fo1.r.b(c17), (int) (f17 * 100));
    }
}
