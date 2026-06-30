package yw;

/* loaded from: classes11.dex */
public final class l1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f547924d;

    public l1(java.lang.String str) {
        this.f547924d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.g0 c17;
        if (yw.w1.f548021b) {
            yw.w1.f548021b = false;
            yw.w1.f548022c = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizFlutterInstantsHelper", "killFlutterInstants from = " + this.f547924d);
            vw.m2 m2Var = (vw.m2) ((rv.k3) i95.n0.c(rv.k3.class));
            p3325xe03a0797.p3326xc267989b.l.d(m2Var.f522218e, null, null, new vw.k1(m2Var, null), 3, null);
            if (!yw.h1.f547865a.n() || (c17 = yw.q3.f547970a.c()) == null) {
                return;
            }
            c17.M(false, yw.k1.f547912a);
        }
    }
}
