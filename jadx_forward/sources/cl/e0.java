package cl;

/* loaded from: classes7.dex */
public final class e0 extends cl.a {
    public com.p159x477cd522.p160x333422.C1459xa4933cc1 A;
    public volatile cl.q0 B;
    public cl.f0 C;
    public com.p314xaae8f345.mm.p2809x52b77bcb.C22922xb967cba0 D;
    public long E;

    @Override // cl.a
    public void a() {
        ku5.u0 u0Var = ku5.t0.f394148d;
        cl.RunnableC1397x2ca3e1 runnableC1397x2ca3e1 = new cl.RunnableC1397x2ca3e1();
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.t(runnableC1397x2ca3e1, 30000L, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NodeJSRuntime", "cleanUpRuntimeWhenThreadEnd");
        try {
            com.p314xaae8f345.mm.p2809x52b77bcb.C22922xb967cba0 c22922xb967cba0 = this.D;
            if (c22922xb967cba0 != null) {
                c22922xb967cba0.m83365x5cd39ffa();
                this.D = null;
            }
            this.A.m15857x41012807();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NodeJSRuntime", "cleanUpRuntimeWhenThreadEnd done");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NodeJSRuntime", "cleanUpWhenThreadEnd exp = %s", e17);
        }
    }

    @Override // cl.a
    public cl.r d() {
        cl.c0 c0Var = new cl.c0(this);
        boolean z17 = this.f124122v.f135485j;
        java.lang.ThreadLocal threadLocal = cl.f0.f124159q;
        if (threadLocal.get() != null) {
            throw new java.lang.RuntimeException("Only one Looper may be created per thread");
        }
        cl.f0 f0Var = new cl.f0(c0Var, z17);
        threadLocal.set(f0Var);
        this.C = f0Var;
        return f0Var;
    }

    @Override // cl.a
    public com.p159x477cd522.p160x333422.C1460x397c7778 e() {
        cl.o oVar = this.f124122v.f135492q;
        if (oVar != null) {
            oVar.a();
        }
        cl.p3 p3Var = cl.p3.f124252e;
        boolean z17 = false;
        int i17 = p3Var.r5() ? 0 : 2;
        boolean z18 = this.f124122v.f135493r;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NodeJSRuntime", "[no-node] prepareV8WhenThreadStart, skipNode=%b", java.lang.Boolean.valueOf(z18));
        int i18 = z18 ? com.p159x477cd522.p160x333422.p163x10fad5c4.AbstractC1516x4fd55f3d.Success.f5027x1f5f799a : this.f124112l;
        byte[] bArr = z18 ? null : this.f124109i;
        java.lang.String str = z18 ? null : this.f124110j;
        if (!z18 && !android.text.TextUtils.isEmpty(this.f124110j) && this.f124111k) {
            z17 = true;
        }
        boolean z19 = z17;
        if (p3Var.X6()) {
            synchronized (cl.e0.class) {
                this.A = com.p159x477cd522.p160x333422.C1459xa4933cc1.m15844x158916bd(1, i18, this.f124108h, bArr, str, z19, this.f124114n, i17, z18);
            }
        } else {
            this.A = com.p159x477cd522.p160x333422.C1459xa4933cc1.m15844x158916bd(1, i18, this.f124108h, bArr, str, z19, this.f124114n, i17, z18);
        }
        com.p159x477cd522.p160x333422.C1459xa4933cc1 c1459xa4933cc1 = this.A;
        com.p159x477cd522.p160x333422.C1459xa4933cc1.CreateStats createStats = c1459xa4933cc1.f4729xe1eb7103;
        long mo16390xb58863b8 = c1459xa4933cc1.m15851xddccdc80().mo16390xb58863b8();
        this.E = mo16390xb58863b8;
        if (this.f124122v.f135493r && this.A != null && mo16390xb58863b8 != 0 && this.D == null) {
            sk1.b.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            com.p314xaae8f345.mm.p2809x52b77bcb.C22922xb967cba0 c22922xb967cba0 = new com.p314xaae8f345.mm.p2809x52b77bcb.C22922xb967cba0();
            c22922xb967cba0.m83364xad361398(this.A.m15852x9a3f0ba2().m15872xc2f94e39(), this.E, this.A.m15852x9a3f0ba2().m15873x206d1933());
            this.D = c22922xb967cba0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NodeJSRuntime", "prepareV8WhenThreadStart, isolateCreateDurationMills: %d, mainContextCreateDurationMills: %d, nodeEnvCreateDurationMills: %d", java.lang.Long.valueOf(createStats.f4731x7907205c), java.lang.Long.valueOf(createStats.f4732xade10171), java.lang.Long.valueOf(createStats.f4733xf5a1497c));
        long j17 = createStats.f4731x7907205c;
        long j18 = createStats.f4732xade10171;
        cl.o oVar2 = this.f124122v.f135492q;
        if (oVar2 != null) {
            oVar2.b(j17, j18);
        }
        this.A.m15852x9a3f0ba2().m15874x5db1c78().m16270x5df80a40(new cl.a0(this));
        this.A.m15852x9a3f0ba2().m15874x5db1c78().m16268xa62c3172(new cl.b0(this));
        this.f124109i = null;
        return this.A.m15852x9a3f0ba2();
    }
}
