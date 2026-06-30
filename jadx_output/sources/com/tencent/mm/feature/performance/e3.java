package com.tencent.mm.feature.performance;

/* loaded from: classes12.dex */
public final class e3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public int f67559d;

    /* renamed from: e, reason: collision with root package name */
    public long f67560e;

    /* renamed from: f, reason: collision with root package name */
    public long f67561f;

    @Override // java.lang.Runnable
    public void run() {
        wh.t1 d17 = wh.u1.d(android.os.Process.myPid());
        if (d17 != null) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            long a17 = d17.a();
            long j17 = this.f67560e;
            boolean z17 = false;
            if (1 <= j17 && j17 < currentTimeMillis) {
                long j18 = this.f67561f;
                if (1 <= j18 && j18 < a17) {
                    z17 = true;
                }
                if (z17) {
                    com.tencent.mm.feature.performance.f3 f3Var = com.tencent.mm.feature.performance.f3.f67570a;
                    kotlin.jvm.internal.o.o("appContext");
                    throw null;
                }
            }
            com.tencent.mm.feature.performance.f3 f3Var2 = com.tencent.mm.feature.performance.f3.f67570a;
            java.lang.String text = "update cpuTime " + this.f67559d + " skip: last=" + this.f67561f + ", curr=" + a17;
            kotlin.jvm.internal.o.g(text, "text");
            if (com.tencent.mars.xlog.Log.getImpl() != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.proc.ProcCpuFeatureService", text);
            }
            this.f67560e = currentTimeMillis;
            this.f67561f = a17;
        }
        this.f67559d++;
        com.tencent.mm.feature.performance.f3 f3Var3 = com.tencent.mm.feature.performance.f3.f67570a;
        if (com.tencent.mm.feature.performance.f3.f67571b) {
            mm.k kVar = mm.k.Q;
            if (kVar.k(java.lang.String.valueOf(-1L)) * 1000 > 0) {
                ((android.os.Handler) ((jz5.n) com.tencent.mm.feature.performance.f3.f67572c).getValue()).postDelayed(this, kVar.k(java.lang.String.valueOf(-1L)) * 1000);
            }
        }
    }
}
