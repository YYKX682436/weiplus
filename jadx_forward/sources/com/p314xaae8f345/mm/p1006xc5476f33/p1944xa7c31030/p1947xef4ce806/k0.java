package com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806;

/* loaded from: classes12.dex */
public final class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.l0 f234610d;

    public k0(com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.l0 l0Var) {
        this.f234610d = l0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4720x9bbc2403 c4720x9bbc2403 = new com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4720x9bbc2403(null, null, null, null, null, null, com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4723x52a73b7e.f134646s.b(), null, 191, null);
        c4720x9bbc2403.f134629d = java.lang.System.currentTimeMillis() - currentTimeMillis;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NativeOOMMonitor", "OOM mem info " + c4720x9bbc2403);
        if (this.f234610d.i(c4720x9bbc2403)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.l0 l0Var = this.f234610d;
            if (!(l0Var.f234641a >= 20)) {
                l0Var.k(c4720x9bbc2403);
                lr0.c.b(vp3.e.f520516d, true, 300, null, 4, null);
                ku5.u0 u0Var = ku5.t0.f394148d;
                long millis = this.f234610d.f234641a < 10 ? java.util.concurrent.TimeUnit.SECONDS.toMillis(10L) : java.util.concurrent.TimeUnit.SECONDS.toMillis(30L);
                ku5.t0 t0Var = (ku5.t0) u0Var;
                t0Var.getClass();
                t0Var.w(this, millis, null);
                return;
            }
        }
        if (!this.f234610d.i(c4720x9bbc2403)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NativeOOMMonitor", "memory reduced to a reasonable level, reset");
            com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.l0 l0Var2 = this.f234610d;
            l0Var2.f234611b = false;
            l0Var2.f();
            return;
        }
        this.f234610d.e();
        ku5.u0 u0Var2 = ku5.t0.f394148d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.j0 j0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.j0(this.f234610d);
        long millis2 = java.util.concurrent.TimeUnit.MINUTES.toMillis(30L);
        ku5.t0 t0Var2 = (ku5.t0) u0Var2;
        t0Var2.getClass();
        t0Var2.w(j0Var, millis2, null);
    }
}
