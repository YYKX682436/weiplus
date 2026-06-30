package qo1;

/* loaded from: classes5.dex */
public final class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qo1.f0 f446988d;

    public c0(qo1.f0 f0Var) {
        this.f446988d = f0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0 n0Var;
        qo1.i0 i0Var;
        qo1.f0 f0Var = this.f446988d;
        synchronized (f0Var.f447017j) {
            n0Var = com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0.AFFROAM_TASK_STATE_STOPPED;
            i0Var = qo1.i0.f447035f;
            f0Var.g(n0Var, i0Var);
            f0Var.f447019l = i0Var;
            f0Var.r(n0Var);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0.f174217a.o(this.f446988d, n0Var, i0Var);
    }
}
