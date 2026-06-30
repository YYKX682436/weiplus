package m11;

/* loaded from: classes11.dex */
public class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f404230d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f404231e;

    public g0(m11.l0 l0Var, long j17, long j18) {
        this.f404230d = j17;
        this.f404231e = j18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = m11.k0.f404260b;
        long j17 = o4Var.getLong("last_report_time", 0L);
        long c17 = c01.id.c();
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20295xabd9b5c2()) != 1 || c17 - j17 <= 86400000) {
            return;
        }
        o4Var.putLong("last_report_time", c17);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6653x44f11e67 c6653x44f11e67 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6653x44f11e67();
        c6653x44f11e67.f139996e = this.f404230d;
        c6653x44f11e67.f139995d = this.f404231e;
        c6653x44f11e67.f139997f = 1;
        c6653x44f11e67.k();
        c6653x44f11e67.o();
    }
}
