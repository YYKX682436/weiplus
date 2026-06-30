package qo1;

/* loaded from: classes5.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qo1.f0 f447054d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qo1.i0 f447055e;

    public j(qo1.f0 f0Var, qo1.i0 i0Var) {
        this.f447054d = f0Var;
        this.f447055e = i0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0 n0Var;
        qo1.f0 f0Var = this.f447054d;
        java.lang.Object obj = f0Var.f447017j;
        qo1.i0 i0Var = this.f447055e;
        synchronized (obj) {
            n0Var = com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0.AFFROAM_TASK_STATE_ERROR;
            f0Var.g(n0Var, i0Var);
            f0Var.r(n0Var);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(i0Var, "<set-?>");
            f0Var.f447019l = i0Var;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0.f174217a.o(this.f447054d, n0Var, this.f447055e);
    }
}
