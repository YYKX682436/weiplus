package tl;

/* loaded from: classes12.dex */
public class q0 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: t, reason: collision with root package name */
    public static boolean f501624t = true;

    /* renamed from: u, reason: collision with root package name */
    public static int f501625u;

    /* renamed from: d, reason: collision with root package name */
    public android.os.HandlerThread f501626d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f501627e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f501628f = false;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Queue f501629g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Queue f501630h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f501631i = new java.util.HashMap();

    /* renamed from: m, reason: collision with root package name */
    public boolean f501632m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f501633n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f501634o = false;

    /* renamed from: p, reason: collision with root package name */
    public int f501635p = 0;

    /* renamed from: q, reason: collision with root package name */
    public long f501636q = 0;

    /* renamed from: r, reason: collision with root package name */
    public final fp.j f501637r = new fp.j();

    /* renamed from: s, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f501638s = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(d().mo50280x23b2dd47(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new tl.u0(this), false);

    public q0() {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SceneVoiceService", "SceneVoiceService %s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true));
        gm0.j1.d().a(127, this);
        gm0.j1.d().a(128, this);
    }

    public static void a(tl.q0 q0Var) {
        synchronized (q0Var) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SceneVoiceService", "realStopThread");
            q0Var.f501627e = null;
            android.os.HandlerThread handlerThread = q0Var.f501626d;
            q0Var.f501626d = null;
            if (handlerThread != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SceneVoiceService", "finishThread " + handlerThread);
                handlerThread.quitSafely();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:168:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(tl.q0 r32) {
        /*
            Method dump skipped, instructions count: 1411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tl.q0.b(tl.q0):void");
    }

    public final void c() {
        ((java.util.HashMap) this.f501631i).clear();
        ((java.util.LinkedList) this.f501629g).clear();
        ((java.util.LinkedList) this.f501630h).clear();
        this.f501633n = false;
        this.f501632m = false;
        this.f501634o = false;
        f(false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SceneVoiceService", "Finish service use time(ms):" + this.f501637r.a() + "[" + toString() + "]");
    }

    public final synchronized com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 d() {
        if (!((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_enable_voicd_worker_handler_thread, true)) {
            return gm0.j1.e().d();
        }
        if (this.f501626d == null || this.f501627e == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SceneVoiceService", "getWorkerHandler create new handler thread");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SceneVoiceService-");
            int i17 = f501625u;
            f501625u = i17 + 1;
            sb6.append(i17);
            java.lang.String sb7 = sb6.toString();
            int i18 = pu5.i.f440006b;
            android.os.HandlerThread a17 = pu5.f.a(sb7, 0);
            this.f501626d = a17;
            a17.start();
            this.f501627e = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(this.f501626d.getLooper());
        }
        this.f501627e.mo50302x6b17ad39(111);
        return this.f501627e;
    }

    public void e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SceneVoiceService", "run() %s", toString());
        d().m77784x795fa299(new tl.t0(this));
    }

    public final synchronized void f(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SceneVoiceService", "tryFinishThread stopNow: %b", java.lang.Boolean.valueOf(z17));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f501627e;
        if (n3Var != null) {
            n3Var.mo50302x6b17ad39(111);
            if (z17) {
                n3Var.mo50303x856b99f0(0);
                n3Var.mo50293x3498a0(new java.lang.Runnable() { // from class: tl.q0$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        tl.q0.a(tl.q0.this);
                    }
                });
            } else {
                n3Var.mo50296x41bd0e60(new java.lang.Runnable() { // from class: tl.q0$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        tl.q0.a(tl.q0.this);
                    }
                }, 111, android.os.SystemClock.uptimeMillis() + 60000);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = toString();
        objArr[1] = java.lang.Integer.valueOf(i17);
        objArr[2] = java.lang.Integer.valueOf(i18);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        objArr[4] = m1Var != null ? m1Var.toString() : 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SceneVoiceService", "[%s]errType:%s errCode:%s errMsg:%s scene:%s", objArr);
        d().m77784x795fa299(new tl.s0(this, m1Var, i17, i18));
    }
}
