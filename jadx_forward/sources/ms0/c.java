package ms0;

/* loaded from: classes10.dex */
public abstract class c implements android.opengl.GLSurfaceView.Renderer {

    /* renamed from: a, reason: collision with root package name */
    public int f412478a;

    /* renamed from: b, reason: collision with root package name */
    public int f412479b;

    /* renamed from: c, reason: collision with root package name */
    public int f412480c;

    /* renamed from: d, reason: collision with root package name */
    public int f412481d;

    /* renamed from: e, reason: collision with root package name */
    public final int f412482e;

    /* renamed from: f, reason: collision with root package name */
    public final int f412483f;

    /* renamed from: g, reason: collision with root package name */
    public os0.a f412484g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f412485h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.SurfaceTexture f412486i;

    /* renamed from: j, reason: collision with root package name */
    public is0.c f412487j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f412488k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f412489l;

    /* renamed from: m, reason: collision with root package name */
    public int f412490m;

    /* renamed from: n, reason: collision with root package name */
    public int f412491n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f412492o;

    /* renamed from: p, reason: collision with root package name */
    public final ms0.a f412493p;

    /* renamed from: q, reason: collision with root package name */
    public yz5.l f412494q;

    /* renamed from: r, reason: collision with root package name */
    public yz5.a f412495r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f412496s;

    public c(int i17, int i18, int i19, int i27, int i28, int i29) {
        this.f412478a = i17;
        this.f412479b = i18;
        this.f412480c = i19;
        this.f412481d = i27;
        this.f412482e = i28;
        this.f412483f = i29;
        this.f412490m = -1;
        this.f412493p = new ms0.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        if ((r3 != null && r3.length == r2.length) == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void l(ms0.c r1, byte[] r2, boolean r3, int r4, java.lang.Object r5) {
        /*
            if (r5 != 0) goto L42
            r4 = r4 & 2
            r5 = 1
            if (r4 == 0) goto L8
            r3 = r5
        L8:
            r1.getClass()
            java.lang.String r4 = "frame"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r2, r4)
            if (r3 == 0) goto L33
            byte[] r3 = r1.f412485h
            boolean r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(r3)
            r4 = 0
            if (r3 != 0) goto L27
            byte[] r3 = r1.f412485h
            if (r3 == 0) goto L24
            int r3 = r3.length
            int r0 = r2.length
            if (r3 != r0) goto L24
            goto L25
        L24:
            r5 = r4
        L25:
            if (r5 != 0) goto L2c
        L27:
            int r3 = r2.length
            byte[] r3 = new byte[r3]
            r1.f412485h = r3
        L2c:
            byte[] r3 = r1.f412485h
            int r5 = r2.length
            java.lang.System.arraycopy(r2, r4, r3, r4, r5)
            goto L35
        L33:
            r1.f412485h = r2
        L35:
            os0.a r2 = r1.f412484g
            if (r2 == 0) goto L41
            byte[] r1 = r1.f412485h
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r1)
            r2.q(r1)
        L41:
            return
        L42:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Super calls with default arguments not supported in this target, function: input"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ms0.c.l(ms0.c, byte[], boolean, int, java.lang.Object):void");
    }

    public static /* synthetic */ void o(ms0.c cVar, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: release");
        }
        if ((i17 & 1) != 0) {
            z17 = true;
        }
        cVar.n(z17);
    }

    public abstract os0.a f();

    public is0.c g() {
        return this.f412487j;
    }

    public int h() {
        os0.a aVar = this.f412484g;
        if (aVar != null) {
            return aVar.f429549y;
        }
        return 0;
    }

    public int i() {
        os0.a aVar = this.f412484g;
        if (aVar != null) {
            return aVar.f429548x;
        }
        return 0;
    }

    public is0.c j() {
        return this.f412487j;
    }

    public void k(boolean z17) {
        if (this.f412496s) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.Media.AbsSurfaceRenderer", hashCode() + " initRenderProcInGlesThread, already init", new java.lang.Object[0]);
            return;
        }
        this.f412489l = z17;
        this.f412484g = f();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.AbsSurfaceRenderer", hashCode() + " exec func initGLTextureRender  mirror : " + this.f412492o);
        t(this.f412480c, this.f412481d);
        u(this.f412478a, this.f412479b);
        r(this.f412491n);
        m(this.f412492o);
        if (this.f412489l && (this.f412486i == null || this.f412490m <= 0)) {
            this.f412487j = is0.b.b(false, 12L);
            android.opengl.GLES20.glFinish();
            is0.c cVar = this.f412487j;
            if (cVar != null) {
                android.graphics.SurfaceTexture surfaceTexture = new android.graphics.SurfaceTexture(cVar.f375928e);
                final yz5.l lVar = this.f412494q;
                surfaceTexture.setOnFrameAvailableListener(lVar != null ? new android.graphics.SurfaceTexture.OnFrameAvailableListener(lVar) { // from class: ms0.b

                    /* renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ yz5.l f412477d;

                    {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lVar, "function");
                        this.f412477d = lVar;
                    }

                    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
                    public final /* synthetic */ void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture2) {
                        this.f412477d.mo146xb9724478(surfaceTexture2);
                    }
                } : null);
                this.f412486i = surfaceTexture;
                is0.c cVar2 = this.f412487j;
                if ((cVar2 != null ? cVar2.f375928e : -1) <= 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.AbsSurfaceRenderer", "markCreateExternalTextureFailed");
                    jx3.f.INSTANCE.w(985L, 55L, 1L);
                }
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.Media.AbsSurfaceRenderer", hashCode() + " createSurfaceTexture:" + this.f412487j, new java.lang.Object[0]);
            }
            is0.c cVar3 = this.f412487j;
            int i17 = cVar3 != null ? cVar3.f375928e : -1;
            this.f412490m = i17;
            os0.a aVar = this.f412484g;
            if (aVar != null) {
                aVar.r(i17);
            }
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.Media.AbsSurfaceRenderer", hashCode() + " createSurfaceTexture:" + z17 + ", surfaceTexture:" + this.f412486i, new java.lang.Object[0]);
        this.f412496s = true;
    }

    public void m(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.AbsSurfaceRenderer", hashCode() + " set mirror: " + z17);
        this.f412492o = z17;
        os0.a aVar = this.f412484g;
        if (aVar != null) {
            aVar.j(z17);
        }
    }

    public void n(boolean z17) {
        android.graphics.SurfaceTexture surfaceTexture;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.Media.AbsSurfaceRenderer", hashCode() + " called release, shouldDestroySurfaceTexture: " + z17 + ", externalTextureObj:" + this.f412487j + ", surfaceTexture:" + this.f412486i, new java.lang.Object[0]);
        os0.a aVar = this.f412484g;
        if (aVar != null) {
            aVar.n();
        }
        is0.c cVar = this.f412487j;
        if (cVar != null) {
            cVar.close();
        }
        this.f412487j = null;
        android.opengl.GLES20.glFinish();
        if (z17 && (surfaceTexture = this.f412486i) != null) {
            surfaceTexture.release();
        }
        synchronized (this) {
            this.f412486i = null;
        }
        this.f412496s = false;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(javax.microedition.khronos.opengles.GL10 gl10) {
        if (this.f412488k) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.AbsSurfaceRenderer", "do clear frame");
            this.f412488k = false;
            return;
        }
        if (this.f412485h == null && this.f412490m == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Media.AbsSurfaceRenderer", hashCode() + " there is no input ,do you dismiss setting input");
            return;
        }
        ms0.a aVar = this.f412493p;
        aVar.getClass();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        aVar.f412474c = elapsedRealtime;
        if (aVar.f412475d == 0) {
            aVar.f412475d = elapsedRealtime;
        }
        p();
        ms0.a aVar2 = this.f412493p;
        aVar2.f412473b++;
        aVar2.f412472a += android.os.SystemClock.elapsedRealtime() - aVar2.f412474c;
        aVar2.f412476e = android.os.SystemClock.elapsedRealtime();
        if (this.f412489l) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b3 b3Var = qs0.a.f447740a;
            synchronized (b3Var) {
                try {
                    b3Var.c();
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.PreviewRenderSignal", e17, "markRendering error", new java.lang.Object[0]);
                }
            }
        }
        yz5.a aVar3 = this.f412495r;
        if (aVar3 != null) {
            aVar3.mo152xb9724478();
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(javax.microedition.khronos.opengles.GL10 gl10, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.AbsSurfaceRenderer", hashCode() + " onSurfaceChanged width:" + i17 + ", height:" + i18);
        t(i17, i18);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(javax.microedition.khronos.opengles.GL10 gl10, javax.microedition.khronos.egl.EGLConfig eGLConfig) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.AbsSurfaceRenderer", hashCode() + " onSurfaceCreated");
        rs0.i.f480829a.g();
    }

    public void p() {
        os0.a aVar = this.f412484g;
        if (aVar != null) {
            aVar.o();
        }
    }

    public void q(yz5.l listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("glTextureRenderProc is null ?");
        sb6.append(this.f412484g == null);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.Media.AbsSurfaceRenderer", sb6.toString(), new java.lang.Object[0]);
        os0.a aVar = this.f412484g;
        if (aVar == null) {
            return;
        }
        aVar.f429542r = listener;
    }

    public void r(int i17) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.Media.AbsSurfaceRenderer", hashCode() + " change rotate ,old degree : " + this.f412491n + " , new degree : " + i17, new java.lang.Object[0]);
        this.f412491n = i17;
        os0.a aVar = this.f412484g;
        if (aVar != null) {
            aVar.s(i17);
        }
    }

    public void s() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.AbsSurfaceRenderer", "takePhoto");
        os0.a aVar = this.f412484g;
        if (aVar != null) {
            aVar.f429546v = true;
        }
    }

    public void t(int i17, int i18) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.Media.AbsSurfaceRenderer", hashCode() + " updateDrawViewSize ,width : " + i17 + " , height : " + i18, new java.lang.Object[0]);
        this.f412480c = i17;
        this.f412481d = i18;
        os0.a aVar = this.f412484g;
        if (aVar != null) {
            aVar.u(i17, i18);
        }
    }

    public void u(int i17, int i18) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.Media.AbsSurfaceRenderer", hashCode() + " updateTextureSize ,width : " + i17 + " , height : " + i18, new java.lang.Object[0]);
        this.f412478a = i17;
        this.f412479b = i18;
        os0.a aVar = this.f412484g;
        if (aVar != null) {
            aVar.w(i17, i18);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ c(int r5, int r6, int r7, int r8, int r9, int r10, int r11, p3321xbce91901.jvm.p3324x21ffc6bd.i r12) {
        /*
            r4 = this;
            r12 = r11 & 1
            r0 = 0
            if (r12 == 0) goto L7
            r12 = r0
            goto L8
        L7:
            r12 = r5
        L8:
            r5 = r11 & 2
            if (r5 == 0) goto Ld
            goto Le
        Ld:
            r0 = r6
        Le:
            r5 = r11 & 4
            if (r5 == 0) goto L14
            r1 = r12
            goto L15
        L14:
            r1 = r7
        L15:
            r5 = r11 & 8
            if (r5 == 0) goto L1b
            r2 = r0
            goto L1c
        L1b:
            r2 = r8
        L1c:
            r5 = r11 & 16
            r6 = 1
            if (r5 == 0) goto L23
            r3 = r6
            goto L24
        L23:
            r3 = r9
        L24:
            r5 = r11 & 32
            if (r5 == 0) goto L2a
            r11 = r6
            goto L2b
        L2a:
            r11 = r10
        L2b:
            r5 = r4
            r6 = r12
            r7 = r0
            r8 = r1
            r9 = r2
            r10 = r3
            r5.<init>(r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ms0.c.<init>(int, int, int, int, int, int, int, kotlin.jvm.internal.i):void");
    }
}
