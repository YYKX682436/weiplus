package cl;

/* loaded from: classes7.dex */
public final class e0 extends cl.a {
    public com.eclipsesource.mmv8.MultiContextNodeJS A;
    public volatile cl.q0 B;
    public cl.f0 C;
    public com.tencent.mm.weapp_core.TimerBinding D;
    public long E;

    @Override // cl.a
    public void a() {
        ku5.u0 u0Var = ku5.t0.f312615d;
        cl.a$$b a__b = new cl.a$$b();
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.t(a__b, 30000L, null);
        com.tencent.mars.xlog.Log.i("MicroMsg.NodeJSRuntime", "cleanUpRuntimeWhenThreadEnd");
        try {
            com.tencent.mm.weapp_core.TimerBinding timerBinding = this.D;
            if (timerBinding != null) {
                timerBinding.destroy();
                this.D = null;
            }
            this.A.release();
            com.tencent.mars.xlog.Log.i("MicroMsg.NodeJSRuntime", "cleanUpRuntimeWhenThreadEnd done");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NodeJSRuntime", "cleanUpWhenThreadEnd exp = %s", e17);
        }
    }

    @Override // cl.a
    public cl.r d() {
        cl.c0 c0Var = new cl.c0(this);
        boolean z17 = this.f42589v.f53952j;
        java.lang.ThreadLocal threadLocal = cl.f0.f42626q;
        if (threadLocal.get() != null) {
            throw new java.lang.RuntimeException("Only one Looper may be created per thread");
        }
        cl.f0 f0Var = new cl.f0(c0Var, z17);
        threadLocal.set(f0Var);
        this.C = f0Var;
        return f0Var;
    }

    @Override // cl.a
    public com.eclipsesource.mmv8.MultiContextV8 e() {
        cl.o oVar = this.f42589v.f53959q;
        if (oVar != null) {
            oVar.a();
        }
        cl.p3 p3Var = cl.p3.f42719e;
        boolean z17 = false;
        int i17 = p3Var.r5() ? 0 : 2;
        boolean z18 = this.f42589v.f53960r;
        com.tencent.mars.xlog.Log.i("MicroMsg.NodeJSRuntime", "[no-node] prepareV8WhenThreadStart, skipNode=%b", java.lang.Boolean.valueOf(z18));
        int i18 = z18 ? com.eclipsesource.mmv8.snapshot.CreateSnapshotResult.Success.INVALID_CONTEXT_INDEX : this.f42579l;
        byte[] bArr = z18 ? null : this.f42576i;
        java.lang.String str = z18 ? null : this.f42577j;
        if (!z18 && !android.text.TextUtils.isEmpty(this.f42577j) && this.f42578k) {
            z17 = true;
        }
        boolean z19 = z17;
        if (p3Var.X6()) {
            synchronized (cl.e0.class) {
                this.A = com.eclipsesource.mmv8.MultiContextNodeJS.createMultiContextNodeJS(1, i18, this.f42575h, bArr, str, z19, this.f42581n, i17, z18);
            }
        } else {
            this.A = com.eclipsesource.mmv8.MultiContextNodeJS.createMultiContextNodeJS(1, i18, this.f42575h, bArr, str, z19, this.f42581n, i17, z18);
        }
        com.eclipsesource.mmv8.MultiContextNodeJS multiContextNodeJS = this.A;
        com.eclipsesource.mmv8.MultiContextNodeJS.CreateStats createStats = multiContextNodeJS.createStats;
        long ptr = multiContextNodeJS.getMainContext().getPtr();
        this.E = ptr;
        if (this.f42589v.f53960r && this.A != null && ptr != 0 && this.D == null) {
            sk1.b.a(com.tencent.mm.sdk.platformtools.x2.f193071a);
            com.tencent.mm.weapp_core.TimerBinding timerBinding = new com.tencent.mm.weapp_core.TimerBinding();
            timerBinding.bindTo(this.A.getRuntime().getIsolatePtr(), this.E, this.A.getRuntime().getUVLoopPtr());
            this.D = timerBinding;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NodeJSRuntime", "prepareV8WhenThreadStart, isolateCreateDurationMills: %d, mainContextCreateDurationMills: %d, nodeEnvCreateDurationMills: %d", java.lang.Long.valueOf(createStats.isolateCreateDurationMills), java.lang.Long.valueOf(createStats.mainContextCreateDurationMills), java.lang.Long.valueOf(createStats.nodeEnvCreateDurationMills));
        long j17 = createStats.isolateCreateDurationMills;
        long j18 = createStats.mainContextCreateDurationMills;
        cl.o oVar2 = this.f42589v.f53959q;
        if (oVar2 != null) {
            oVar2.b(j17, j18);
        }
        this.A.getRuntime().getV8().setNativeJavaCallback(new cl.a0(this));
        this.A.getRuntime().getV8().setJavaTaskScheduler(new cl.b0(this));
        this.f42576i = null;
        return this.A.getRuntime();
    }
}
