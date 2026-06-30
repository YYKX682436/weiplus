package yn1;

/* loaded from: classes11.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final yn1.d0 f545168a = new yn1.d0();

    /* renamed from: b, reason: collision with root package name */
    public static yn1.c0 f545169b;

    public final synchronized void a() {
        java.lang.String str = "[initialize] scope = " + f545169b;
        int i17 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Mig.MigrationCoroutineScope", str, null);
        if (f545169b == null) {
            f545169b = new yn1.c0(new p3325xe03a0797.p3326xc267989b.g2(((ku5.t0) ku5.t0.f394148d).o("MigrationCoroutinePool", 4, 4, new java.util.concurrent.LinkedBlockingQueue(128))), null, "MM.Mig.MigrationCoroutineScope", 2, null);
        }
    }

    public final synchronized void b() {
        java.lang.String str = "[unInitialize] scope = " + f545169b;
        int i17 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Mig.MigrationCoroutineScope", str, null);
        yn1.c0 c0Var = f545169b;
        if (c0Var != null) {
            p3325xe03a0797.p3326xc267989b.z0.c(c0Var, null);
            p3325xe03a0797.p3326xc267989b.p0 p0Var = c0Var.f545153d;
            if (p0Var instanceof p3325xe03a0797.p3326xc267989b.f2) {
                ((p3325xe03a0797.p3326xc267989b.f2) p0Var).close();
            }
        }
        f545169b = null;
    }
}
