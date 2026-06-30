package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29;

/* loaded from: classes14.dex */
public final class s0 implements xq4.d {

    /* renamed from: d, reason: collision with root package name */
    public android.os.HandlerThread f231645d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f231646e;

    /* renamed from: f, reason: collision with root package name */
    public rs0.h f231647f;

    /* renamed from: g, reason: collision with root package name */
    public is0.c f231648g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.z f231649h;

    /* renamed from: i, reason: collision with root package name */
    public long f231650i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.r2 f231651m;

    /* renamed from: n, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f231652n;

    /* renamed from: o, reason: collision with root package name */
    public android.graphics.SurfaceTexture f231653o;

    /* renamed from: p, reason: collision with root package name */
    public is0.c f231654p;

    /* renamed from: q, reason: collision with root package name */
    public volatile android.util.Size f231655q;

    /* renamed from: r, reason: collision with root package name */
    public volatile boolean f231656r;

    /* renamed from: s, reason: collision with root package name */
    public final com.p314xaae8f345.mm.app.y2 f231657s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f231658t;

    /* renamed from: u, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.h0 f231659u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f231660v;

    public s0() {
        oz5.i a17 = p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null);
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        this.f231652n = p3325xe03a0797.p3326xc267989b.z0.a(((p3325xe03a0797.p3326xc267989b.c3) a17).mo7096x348d9a(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a));
        this.f231655q = new android.util.Size(0, 0);
        this.f231656r = true;
        this.f231657s = new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.n0(this);
        this.f231658t = zj3.j.g();
        this.f231659u = new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.h0();
        this.f231660v = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.r0.f231616d);
    }

    public static void h(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.s0 s0Var, boolean z17, int i17, java.lang.Object obj) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var;
        if ((i17 & 1) != 0) {
            z17 = true;
        }
        s0Var.getClass();
        boolean g17 = zj3.j.g();
        s0Var.f231658t = g17;
        if (g17) {
            p3325xe03a0797.p3326xc267989b.l.d(s0Var.f231652n, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.p0(s0Var, z17, null), 3, null);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.q0 q0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.q0(s0Var, z17);
        java.lang.String str = "MultiTalkCameraManager_Thread" + s0Var.hashCode();
        int i18 = pu5.i.f440006b;
        android.os.HandlerThread a17 = pu5.f.a(str, 5);
        s0Var.f231645d = a17;
        a17.start();
        android.os.HandlerThread handlerThread = s0Var.f231645d;
        s0Var.f231646e = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(handlerThread != null ? handlerThread.getLooper() : null);
        final com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.i0 i0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.i0(s0Var, q0Var);
        android.os.HandlerThread handlerThread2 = s0Var.f231645d;
        if (!(handlerThread2 != null && handlerThread2.isAlive()) || (n3Var = s0Var.f231646e) == null) {
            return;
        }
        n3Var.mo50293x3498a0(new java.lang.Runnable(i0Var) { // from class: com.tencent.mm.plugin.multitalk.model.m0

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ yz5.a f231577d;

            {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(i0Var, "function");
                this.f231577d = i0Var;
            }

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f231577d.mo152xb9724478();
            }
        });
    }

    public static /* synthetic */ void j(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.s0 s0Var, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = true;
        }
        s0Var.i(z17);
    }

    @Override // xq4.d
    public void Y(int i17, int i18) {
        this.f231655q = new android.util.Size(i17, i18);
        if (this.f231658t) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.a2 n17 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().n();
            if (n17 != null) {
                n17.g(i17, i18);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTalkCameraManager", "camera preview size applye is " + i17 + " and " + i18);
        }
    }

    public final void a() {
        this.f231650i = 0L;
        this.f231655q = new android.util.Size(0, 0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.r2 r2Var = this.f231651m;
        if (r2Var != null) {
            if (xq4.e.f537646a.f546114b < 2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Voip.CaptureRender", "ExchangeCapture...gCameraNum= " + xq4.e.f537646a.f546114b);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.CaptureRender", "ExchangeCapture start, gCameraNum= " + xq4.e.f537646a.f546114b);
                r2Var.e();
                r2Var.b(r2Var.f231628i, r2Var.f231620a ^ true);
                r2Var.d();
                gq4.v.Bi().J(r2Var.f231622c);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.v0 Ri = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri();
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.r2 r2Var2 = this.f231651m;
        Ri.f231699i = r2Var2 != null ? r2Var2.f231620a : true;
    }

    public final boolean b() {
        long j17 = this.f231650i;
        if (j17 == 0) {
            return false;
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (android.os.SystemClock.elapsedRealtime() - j17 <= ((java.lang.Number) ((jz5.n) this.f231660v).mo141623x754a37bb()).longValue()) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTalkCameraManager", "current camera is open but has no video ");
        return true;
    }

    public final boolean c() {
        return this.f231651m != null;
    }

    public final boolean d() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.r2 r2Var = this.f231651m;
        if (r2Var != null) {
            return r2Var.f231620a;
        }
        return true;
    }

    public final void f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTalkCameraManager", "release");
        this.f231650i = 0L;
        if (this.f231658t) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.r2 r2Var = this.f231651m;
            if (r2Var != null) {
                r2Var.e();
            }
            this.f231651m = null;
            this.f231653o = null;
        } else {
            android.graphics.SurfaceTexture surfaceTexture = this.f231653o;
            if (surfaceTexture != null) {
                surfaceTexture.release();
            }
            this.f231653o = null;
            is0.c cVar = this.f231648g;
            if (cVar != null) {
                cVar.close();
            }
            this.f231648g = null;
            rs0.h hVar = this.f231647f;
            if (hVar != null) {
                rs0.i.f480829a.u(hVar);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.r2 r2Var2 = this.f231651m;
            if (r2Var2 != null) {
                r2Var2.e();
            }
            this.f231651m = null;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f231646e;
            if (n3Var != null) {
                n3Var.m77787xbe88f509();
            }
            this.f231646e = null;
            android.os.HandlerThread handlerThread = this.f231645d;
            if (handlerThread != null) {
                handlerThread.quitSafely();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.h0 h0Var = this.f231659u;
        h0Var.getClass();
        h0Var.getClass();
        h0Var.getClass();
    }

    public final void g() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.r2 r2Var = this.f231651m;
        if (r2Var != null) {
            r2Var.e();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.r2 r2Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.r2(640, 480);
        this.f231651m = r2Var2;
        r2Var2.f231639t = !this.f231658t;
        r2Var2.b(this, com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231699i);
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.r2 r2Var3 = this.f231651m;
        if (r2Var3 != null) {
            r2Var3.f231637r = this.f231653o;
        }
        if (r2Var3 != null) {
            r2Var3.d();
        }
        java.lang.Object[] objArr = new java.lang.Object[3];
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.r2 r2Var4 = this.f231651m;
        objArr[0] = r2Var4 != null ? java.lang.Boolean.valueOf(r2Var4.f231620a) : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.r2 r2Var5 = this.f231651m;
        objArr[1] = r2Var5 != null ? r2Var5.f231621b : null;
        objArr[2] = this.f231653o;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTalkCameraManager", "captureRender.mIsCurrentFaceCamera=%b captureRender.mIsCameraRemote180=%b, texture %s", objArr);
    }

    public final void i(boolean z17) {
        if (z17) {
            com.p314xaae8f345.mm.app.w wVar = com.p314xaae8f345.mm.app.w.INSTANCE;
            com.p314xaae8f345.mm.app.y2 y2Var = this.f231657s;
            synchronized (wVar.f135421m) {
                ((java.util.HashSet) wVar.f135421m).remove(y2Var);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.a2 n17 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().n();
        if (n17 != null) {
            n17.c();
        }
        f();
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().Z(1, com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231701m);
    }

    @Override // xq4.d
    public void o() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.z zVar = this.f231649h;
        if (zVar != null) {
            zVar.v4();
        }
    }

    @Override // xq4.d
    public void v(byte[] bArr, long j17, int i17, int i18, int i19, int i27, double d17) {
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().y()) {
            return;
        }
        i(true);
    }
}
