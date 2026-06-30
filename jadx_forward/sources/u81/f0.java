package u81;

/* loaded from: classes7.dex */
public abstract class f0 extends u81.k0 {
    public static final java.util.concurrent.atomic.AtomicInteger I = new java.util.concurrent.atomic.AtomicInteger(0);
    public final java.util.concurrent.atomic.AtomicReference A;
    public final java.util.concurrent.atomic.AtomicReference B;
    public final u81.e0 C;
    public final java.util.Queue D;
    public final java.util.concurrent.atomic.AtomicBoolean E;
    public volatile k75.c F;
    public final java.lang.Runnable G;
    public final u81.w H;

    /* renamed from: i, reason: collision with root package name */
    public final u81.b0 f506947i;

    /* renamed from: m, reason: collision with root package name */
    public final u81.x f506948m;

    /* renamed from: n, reason: collision with root package name */
    public final u81.c0 f506949n;

    /* renamed from: o, reason: collision with root package name */
    public final u81.d0 f506950o;

    /* renamed from: p, reason: collision with root package name */
    public final u81.z f506951p;

    /* renamed from: q, reason: collision with root package name */
    public final u81.a0 f506952q;

    /* renamed from: r, reason: collision with root package name */
    public final u81.y f506953r;

    /* renamed from: s, reason: collision with root package name */
    public final k75.c[] f506954s;

    /* renamed from: t, reason: collision with root package name */
    public final k75.c[] f506955t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f506956u;

    /* renamed from: v, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f506957v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f506958w;

    /* renamed from: x, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f506959x;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f506960y;

    /* renamed from: z, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f506961z;

    public f0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
        super(java.lang.String.format(java.util.Locale.ENGLISH, "Luggage.AppRunningStateMachine[%s][%d]", c11510xdd90c2f2.f156336n, java.lang.Integer.valueOf(I.incrementAndGet())), android.os.Looper.getMainLooper());
        this.f506959x = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f506960y = new java.util.concurrent.atomic.AtomicBoolean(false);
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f506961z = atomicBoolean;
        this.A = new java.util.concurrent.atomic.AtomicReference(null);
        this.B = new java.util.concurrent.atomic.AtomicReference(null);
        this.C = new u81.e0(this, null);
        this.D = new java.util.concurrent.LinkedBlockingQueue();
        this.E = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.F = null;
        this.G = new u81.l(this);
        this.H = new u81.w(this, null);
        this.f506956u = this.f386379d;
        this.f506957v = c11510xdd90c2f2;
        k75.j jVar = this.f386380e;
        if (jVar != null) {
            jVar.f386364b = false;
        }
        this.f506958w = c11510xdd90c2f2.T0();
        u81.y yVar = new u81.y(this, this);
        this.f506953r = yVar;
        u81.z zVar = new u81.z(this, this);
        this.f506951p = zVar;
        u81.a0 a0Var = new u81.a0(this, this);
        this.f506952q = a0Var;
        u81.x xVar = new u81.x(this, this, c11510xdd90c2f2);
        this.f506948m = xVar;
        this.f506947i = new u81.b0(this, this);
        u81.c0 c0Var = new u81.c0(this, this);
        this.f506949n = c0Var;
        u81.d0 d0Var = new u81.d0(this, this);
        this.f506950o = d0Var;
        this.f506954s = new k75.c[]{yVar, zVar, a0Var, xVar};
        this.f506955t = new k75.c[]{c0Var, d0Var};
        u81.k kVar = new u81.k(this);
        if (android.os.Looper.myLooper() == this.f386380e.getLooper()) {
            kVar.run();
        } else {
            atomicBoolean.set(true);
            this.f386380e.post(kVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void r(u81.f0 r6) {
        /*
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r0 = r6.f506957v
            java.lang.Class<com.tencent.mm.plugin.appbrand.backgroundrunning.y0> r1 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.y0.class
            com.tencent.mm.plugin.appbrand.jsapi.h0 r0 = r0.k(r1)
            com.tencent.mm.plugin.appbrand.backgroundrunning.y0 r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.y0) r0
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L61
            com.tencent.mm.plugin.appbrand.floatball.v r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1053x822d9a5b.v) r0
            java.lang.Class<pv.d0> r3 = pv.d0.class
            i95.m r3 = i95.n0.c(r3)
            pv.d0 r3 = (pv.d0) r3
            if (r3 != 0) goto L1b
            goto L49
        L1b:
            ov.i0 r3 = (ov.i0) r3
            gp1.v r3 = r3.Bi()
            if (r3 != 0) goto L2b
            java.lang.String r0 = "MicroMsg.AppBrandFloatBallLogic"
            java.lang.String r3 = "getFloatBallService() failed."
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r3)
            goto L49
        L2b:
            com.tencent.mm.plugin.ball.model.BallInfo r4 = new com.tencent.mm.plugin.ball.model.BallInfo
            com.tencent.mm.plugin.appbrand.o6 r5 = r0.f159698d
            java.lang.String r5 = r5.f156336n
            com.tencent.mm.plugin.appbrand.o6 r0 = r0.f159698d
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig r0 = r0.f156338p
            int r0 = r0.f158814g
            java.lang.String r0 = qp1.n.a(r5, r0)
            r5 = 0
            r4.<init>(r1, r0, r5)
            r4.f174581f = r1
            com.tencent.mm.plugin.ball.model.BallInfo r0 = r3.t0(r4)
            if (r0 == 0) goto L49
            r0 = r1
            goto L4a
        L49:
            r0 = r2
        L4a:
            java.lang.String r3 = r6.f506956u
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r5 = "addKeepFlagAppBrandFloatWindowIfNeed, isInFloatWindow:%s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r5, r4)
            if (r0 == 0) goto L61
            u81.e0 r0 = r6.C
            r3 = 4
            u81.e0.a(r0, r3)
        L61:
            u81.e0 r0 = r6.C
            int r0 = r0.f506945a
            if (r0 == 0) goto L68
            goto L69
        L68:
            r1 = r2
        L69:
            if (r1 == 0) goto L71
            u81.d0 r0 = r6.f506950o
            r6.x(r0)
            goto L76
        L71:
            u81.c0 r0 = r6.f506949n
            r6.x(r0)
        L76:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u81.f0.r(u81.f0):void");
    }

    @Override // k75.k
    public void i() {
        this.f506960y.set(true);
        u81.w wVar = this.H;
        java.util.Set set = wVar.f507017b;
        try {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.unregisterReceiver(wVar.f507016a);
        } catch (java.lang.Exception unused) {
        } catch (java.lang.Throwable th6) {
            ((x.d) set).clear();
            throw th6;
        }
        ((x.d) set).clear();
        if (this.f386380e.getLooper().getThread().getId() != android.os.Looper.getMainLooper().getThread().getId()) {
            this.f386380e.post(new u81.j(this));
        }
    }

    @Override // k75.k
    public boolean k(android.os.Message message) {
        int i17 = message.what;
        u81.u uVar = u81.u.NONE;
        return i17 != 1000;
    }

    @Override // k75.k
    public void n() {
        if (this.f506960y.get()) {
            return;
        }
        this.f506959x.set(true);
        if (android.os.Looper.myLooper() == this.f386380e.getLooper()) {
            super.n();
        } else {
            this.f386380e.post(new u81.m(this));
        }
    }

    @Override // k75.k
    public void p(android.os.Message message) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f386379d, " - unhandledMessage: msg.what=%d, msg.obj=%s", java.lang.Integer.valueOf(message.what), message.obj);
        this.f506961z.set(false);
    }

    public void s(u81.u uVar, java.lang.Object obj) {
        if (this.f386380e == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f506956u, "executeOrPostMessage with cmd[%s], null handler", uVar.name());
            return;
        }
        this.f386380e.removeCallbacks(this.G);
        if (uVar == u81.u.ON_BACKGROUND_AUDIO_STOPPED || uVar == u81.u.ON_BACKGROUND_AUDIO_PREEMPTED) {
            this.f386380e.removeMessages(23);
        }
        this.f506961z.set(true);
        if (android.os.Looper.myLooper() == this.f386380e.getLooper() && d() != null && d().what != -2 && !this.f506975h) {
            this.f386380e.dispatchMessage(android.os.Message.obtain(this.f386380e, uVar.f507014d, obj));
            ((u81.l) this.G).run();
            return;
        }
        android.os.Message obtain = android.os.Message.obtain(this.f386380e, uVar.f507014d, obj);
        k75.j jVar = this.f386380e;
        if (jVar != null) {
            jVar.sendMessage(obtain);
        }
        this.f386380e.post(this.G);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public u81.b t() {
        /*
            r10 = this;
            k75.j r0 = r10.f386380e
            u81.b r1 = u81.b.DESTROYED
            if (r0 != 0) goto L7
            return r1
        L7:
            r2 = -1
            boolean r2 = r0.hasMessages(r2)
            if (r2 == 0) goto Lf
            return r1
        Lf:
            java.util.concurrent.atomic.AtomicBoolean r2 = r10.f506960y
            boolean r2 = r2.get()
            if (r2 == 0) goto L18
            return r1
        L18:
            k75.j r2 = r10.f386380e
            r3 = 0
            if (r2 != 0) goto L1f
            r2 = r3
            goto L24
        L1f:
            r4 = -2
            boolean r2 = r2.hasMessages(r4)
        L24:
            u81.b r4 = u81.b.FOREGROUND
            if (r2 == 0) goto L29
            return r4
        L29:
            java.util.concurrent.atomic.AtomicBoolean r2 = r10.f506961z
            boolean r2 = r2.get()
            r5 = 1
            if (r2 == 0) goto Lbc
            android.os.Looper r2 = android.os.Looper.myLooper()
            android.os.Looper r6 = r0.getLooper()
            if (r2 == r6) goto Lbc
            android.os.Looper r2 = android.os.Looper.myLooper()
            android.os.Looper r6 = android.os.Looper.getMainLooper()
            r7 = 0
            if (r2 != r6) goto L4a
            java.lang.String r2 = "query from main-looper"
            goto L54
        L4a:
            java.util.concurrent.atomic.AtomicBoolean r2 = r10.E
            boolean r2 = r2.get()
            if (r2 == 0) goto L56
            java.lang.String r2 = "skip flag marked true by outer"
        L54:
            r6 = r5
            goto L58
        L56:
            r6 = r3
            r2 = r7
        L58:
            if (r6 == 0) goto L93
            java.util.concurrent.atomic.AtomicReference r3 = r10.B
            java.lang.Object r3 = r3.get()
            k75.c r3 = (k75.c) r3
            java.util.concurrent.atomic.AtomicBoolean r5 = r10.f506960y
            boolean r5 = r5.get()
            java.lang.String r6 = r10.f506956u
            android.os.Looper r0 = r0.getLooper()
            java.lang.Thread r0 = r0.getThread()
            long r7 = r0.getId()
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r5)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r2, r3, r7}
            java.lang.String r2 = "getRunningStateExport, pending change in sm-looper(%d) but %s, cached-state=%s, stopped=%b"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r6, r2, r0)
            if (r3 == 0) goto L8e
            u81.b r0 = r10.z(r3)
            return r0
        L8e:
            if (r5 == 0) goto L91
            goto L92
        L91:
            r1 = r4
        L92:
            return r1
        L93:
            u81.n r1 = new u81.n
            r8 = 500(0x1f4, double:2.47E-321)
            r1.<init>(r10, r8, r7)
            java.util.Queue r2 = r10.D
            r2.add(r1)
            com.tencent.mm.sdk.platformtools.n3 r2 = new com.tencent.mm.sdk.platformtools.n3
            android.os.Looper r0 = r0.getLooper()
            r2.<init>(r0)
            java.lang.Object r0 = r1.a(r2)
            u81.b r0 = (u81.b) r0
            java.util.Queue r2 = r10.D
            java.util.concurrent.LinkedBlockingQueue r2 = (java.util.concurrent.LinkedBlockingQueue) r2
            r2.remove(r1)
            if (r0 != 0) goto Lbc
            u81.b r0 = r10.u(r3)
            return r0
        Lbc:
            u81.b r0 = r10.u(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u81.f0.t():u81.b");
    }

    public final u81.b u(boolean z17) {
        if (this.f506960y.get()) {
            return u81.b.DESTROYED;
        }
        k75.c cVar = (k75.c) this.A.get();
        if (cVar != null) {
            return z(cVar);
        }
        k75.c cVar2 = (k75.c) this.B.get();
        if (cVar2 != null) {
            return z(cVar2);
        }
        if (z17) {
            return z(java.lang.Thread.currentThread().getId() != this.f386380e.getLooper().getThread().getId() ? (k75.a) new u81.o(this).a(new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(this.f386380e.getLooper())) : e());
        }
        return z(this.F);
    }

    public abstract void v(u81.b bVar, u81.b bVar2);

    public abstract void w();

    public final void x(u81.j0 j0Var) {
        this.f506961z.set(false);
        this.A.set(j0Var);
        this.B.set(null);
        o(j0Var);
    }

    public final u81.b z(k75.a aVar) {
        if (u46.a.b(this.f506954s, aVar) || (aVar instanceof u81.t)) {
            return u81.b.BACKGROUND;
        }
        if (u46.a.b(this.f506955t, aVar)) {
            return u81.b.SUSPEND;
        }
        u81.b0 b0Var = this.f506947i;
        u81.b bVar = u81.b.FOREGROUND;
        if (aVar == b0Var) {
            return bVar;
        }
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        return bVar;
    }
}
