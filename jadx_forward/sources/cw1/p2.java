package cw1;

/* loaded from: classes12.dex */
public final class p2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw1.o0 f304746d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f304747e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f304748f;

    public p2(cw1.o0 o0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, int i17) {
        this.f304746d = o0Var;
        this.f304747e = h0Var;
        this.f304748f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5189xf98047de c5189xf98047de = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5189xf98047de();
        int i17 = this.f304748f;
        am.p0 p0Var = c5189xf98047de.f135532g;
        p0Var.f89122a = i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanCacheUI", "triggering BeforeAggressiveCleanCacheEvent with groupFlags " + p0Var.f89122a);
        c5189xf98047de.e();
        if (this.f304746d.f304721f[5]) {
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
            cu2.x.f303982a.a();
        }
        java.lang.Runnable runnable = (java.lang.Runnable) this.f304747e.f391656d;
        if (runnable != null) {
            runnable.run();
        }
    }
}
