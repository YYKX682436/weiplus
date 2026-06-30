package ho1;

/* loaded from: classes5.dex */
public final class y0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f364390d;

    public y0(boolean z17) {
        this.f364390d = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0 r0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0.f174217a;
        boolean z17 = this.f364390d;
        java.util.Set taskStateChangeListeners = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0.f174220d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(taskStateChangeListeners, "taskStateChangeListeners");
        synchronized (taskStateChangeListeners) {
            java.util.Iterator it = taskStateChangeListeners.iterator();
            while (it.hasNext()) {
                ((ho1.q1) ((io1.d) it.next())).b(z17, com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0.AFFROAM_TASK_STATE_COMPLETED, qo1.i0.f447035f);
            }
        }
    }
}
