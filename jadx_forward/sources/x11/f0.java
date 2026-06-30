package x11;

/* loaded from: classes12.dex */
public final class f0 {

    /* renamed from: m, reason: collision with root package name */
    public static final x11.d0 f532892m = new x11.d0(null);

    /* renamed from: a, reason: collision with root package name */
    public final x11.t f532893a;

    /* renamed from: b, reason: collision with root package name */
    public final w11.k0 f532894b;

    /* renamed from: c, reason: collision with root package name */
    public fp.j f532895c;

    /* renamed from: d, reason: collision with root package name */
    public long f532896d;

    /* renamed from: e, reason: collision with root package name */
    public long f532897e;

    /* renamed from: f, reason: collision with root package name */
    public long f532898f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f532899g;

    /* renamed from: h, reason: collision with root package name */
    public int f532900h;

    /* renamed from: i, reason: collision with root package name */
    public int f532901i;

    /* renamed from: j, reason: collision with root package name */
    public long f532902j;

    /* renamed from: k, reason: collision with root package name */
    public long f532903k;

    /* renamed from: l, reason: collision with root package name */
    public int f532904l;

    public f0(x11.t controller, w11.k0 initScene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(controller, "controller");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initScene, "initScene");
        this.f532893a = controller;
        this.f532894b = initScene;
        this.f532899g = "";
    }

    public final long a() {
        fp.j jVar = this.f532895c;
        if (jVar != null) {
            return jVar.a();
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("testTime");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v9 */
    public final int b() {
        x11.t tVar = this.f532893a;
        boolean booleanValue = ((java.lang.Boolean) ((jz5.n) tVar.f532936t).mo141623x754a37bb()).booleanValue();
        ?? r17 = booleanValue;
        if (tVar.b()) {
            r17 = (booleanValue ? 1 : 0) | 2;
        }
        return p01.f.f431897a.a() ? r17 | 4 : r17;
    }

    public final void c(int i17, int i18, int i19, int i27) {
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - this.f532898f;
        long j17 = elapsedRealtime - this.f532897e;
        long j18 = i19 != 0 ? j17 / i19 : 0L;
        long j19 = i19 != 0 ? elapsedRealtime / i19 : 0L;
        x11.t tVar = this.f532893a;
        long j27 = tVar.f532939w;
        int i28 = tVar.f532931o;
        long j28 = j19;
        long j29 = this.f532903k + j27;
        x11.g gVar = x11.t.D;
        long j37 = j18;
        boolean b17 = gVar.b();
        boolean c17 = gVar.c();
        int b18 = b();
        x11.d0 d0Var = f532892m;
        int a17 = d0Var.a();
        long b19 = d0Var.b();
        java.util.HashMap hashMap = tVar.f532932p;
        java.lang.Integer num = (java.lang.Integer) hashMap.get(5);
        if (num == null) {
            num = 0;
        }
        int intValue = num.intValue();
        java.lang.Integer num2 = (java.lang.Integer) hashMap.get(2);
        if (num2 == null) {
            num2 = 0;
        }
        int intValue2 = num2.intValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneInit.dkInit", "INIT DONE: hash:" + this.f532894b.hashCode() + " time:" + elapsedRealtime + " netCost:" + j29 + " newInitCnt:" + i27 + " newInitCost:" + j27 + "initRequestTimes" + this.f532900h + " batchRequestTimes:" + this.f532901i + " initContactCost:" + this.f532902j + " initAndBatchCost:" + this.f532903k + " cmdCnt:" + i19 + " finishCmdCnt:" + i28 + " msgNum:" + intValue + " contactNum:" + intValue2 + " err:[" + i17 + ',' + i18 + "] wait:" + this.f532897e + " cExeTime:" + j17 + " cExeTimePer:" + j37 + ",tPer:" + j28 + " isGetExptBeforeInit:" + b17 + " forceInitContact:" + c17 + " innerVersion:" + b18 + " cpuCoreNum:" + a17 + " memorySize:" + b19 + " sessionId:" + this.f532899g);
        try {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6790x79ba4f55 c6790x79ba4f55 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6790x79ba4f55();
            c6790x79ba4f55.f141221e = b18;
            c6790x79ba4f55.f141222f = elapsedRealtime;
            c6790x79ba4f55.f141223g = j28;
            c6790x79ba4f55.f141224h = j17;
            c6790x79ba4f55.f141225i = j37;
            c6790x79ba4f55.f141220d = c6790x79ba4f55.b("reversion", com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e, true);
            c6790x79ba4f55.f141226j = i18;
            c6790x79ba4f55.f141227k = i19;
            c6790x79ba4f55.f141229m = i28;
            c6790x79ba4f55.f141228l = j29;
            c6790x79ba4f55.f141230n = this.f532904l;
            c6790x79ba4f55.f141231o = b17 ? 1L : 0L;
            c6790x79ba4f55.f141234r = a17;
            c6790x79ba4f55.f141235s = b19;
            c6790x79ba4f55.f141233q = c6790x79ba4f55.b("sessionid", this.f532899g, true);
            c6790x79ba4f55.f141240x = intValue;
            c6790x79ba4f55.f141241y = intValue2;
            x11.b0.f532883a.a(c6790x79ba4f55, null);
            c6790x79ba4f55.k();
            if (i18 == 0) {
                jz5.g gVar2 = p01.b.f431893a;
                ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) p01.b.f431893a).mo141623x754a37bb()).putInt("init_version", b18);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneInit.dkInit", th6, "report err", new java.lang.Object[0]);
        }
    }

    public final void d() {
        if (this.f532896d == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneInit.dkInit", "recordStartTimer ignore");
            return;
        }
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - this.f532896d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneInit.dkInit", "recordStartTimer waitTime:%s", java.lang.Long.valueOf(elapsedRealtime));
        this.f532897e += elapsedRealtime;
        this.f532896d = -1L;
    }
}
