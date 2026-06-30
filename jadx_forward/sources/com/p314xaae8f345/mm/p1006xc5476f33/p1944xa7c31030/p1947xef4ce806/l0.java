package com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806;

/* loaded from: classes12.dex */
public abstract class l0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.o0 {

    /* renamed from: b, reason: collision with root package name */
    public boolean f234611b;

    public final void h(ob0.s3 info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        if (!j(info) || this.f234611b) {
            return;
        }
        if (this.f234641a >= 20) {
            return;
        }
        this.f234611b = true;
        l(info);
        lr0.c.b(vp3.e.f520516d, true, 300, null, 4, null);
        ku5.u0 u0Var = ku5.t0.f394148d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.k0 k0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.k0(this);
        long millis = this.f234641a < 10 ? java.util.concurrent.TimeUnit.SECONDS.toMillis(10L) : java.util.concurrent.TimeUnit.SECONDS.toMillis(30L);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.w(k0Var, millis, null);
    }

    public abstract boolean i(com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4720x9bbc2403 c4720x9bbc2403);

    public abstract boolean j(ob0.s3 s3Var);

    public abstract void k(com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4720x9bbc2403 c4720x9bbc2403);

    public abstract void l(ob0.s3 s3Var);
}
