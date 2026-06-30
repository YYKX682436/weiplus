package q41;

/* loaded from: classes11.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f441571d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k41.g0 f441572e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f441573f;

    public d(java.lang.String str, k41.g0 g0Var, long j17) {
        this.f441571d = str;
        this.f441572e = g0Var;
        this.f441573f = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = this.f441571d;
        if (str == null) {
            str = "";
        }
        int i17 = 1;
        if (str.length() == 0) {
            i17 = 0;
        } else if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(str)) {
            i17 = 3;
        } else if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.p4(str)) {
            i17 = 6;
        } else if (c01.e2.E(str)) {
            i17 = 4;
        } else if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.q4(str)) {
            i17 = 5;
        } else if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str)) {
            i17 = 2;
        }
        j41.b0 b0Var = (j41.b0) i95.n0.c(j41.b0.class);
        k41.g0 g0Var = this.f441572e;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(23393, g0Var.f68613xdec927b, g0Var.f68604x21f9b213, g0Var.f68607xd03b1ae9, ((l41.q2) b0Var).fj(g0Var.f68607xd03b1ae9, g0Var.f68608x1223b30f), 13, 0, java.lang.Integer.valueOf(i17), this.f441571d, g0Var.f68597x553a5901, java.lang.Long.valueOf(this.f441573f), java.lang.Integer.valueOf(g0Var.f68600x1c5d3c28));
    }
}
