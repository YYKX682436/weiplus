package qo1;

/* loaded from: classes5.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qo1.f0 f447066d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0 f447067e;

    public o(qo1.f0 f0Var, com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0 n0Var) {
        this.f447066d = f0Var;
        this.f447067e = n0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qo1.i0 i0Var;
        qo1.f0 f0Var = this.f447066d;
        java.lang.Object obj = f0Var.f447017j;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0 n0Var = this.f447067e;
        synchronized (obj) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(n0Var);
            i0Var = qo1.i0.f447035f;
            f0Var.g(n0Var, i0Var);
            f0Var.r(n0Var);
            f0Var.f447019l = i0Var;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0 r0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0.f174217a;
        qo1.f0 f0Var2 = this.f447066d;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0 state = this.f447067e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(state, "$state");
        r0Var.o(f0Var2, state, i0Var);
    }
}
