package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b;

/* renamed from: com.tencent.mm.plugin.voip.video.OpenGlRender */
/* loaded from: classes14.dex */
public final class C18924x4c862f65 implements wq4.q {
    public static int A;
    public static final java.lang.Object B = new java.lang.Object();
    public static final java.lang.Object C = new java.lang.Object();
    public static final java.lang.Object D = new java.lang.Object();
    public static boolean E;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.ref.WeakReference f258590e;

    /* renamed from: f, reason: collision with root package name */
    public final int f258591f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f258592g;

    /* renamed from: h, reason: collision with root package name */
    public int f258593h;

    /* renamed from: i, reason: collision with root package name */
    public int f258594i;

    /* renamed from: j, reason: collision with root package name */
    public int f258595j;

    /* renamed from: k, reason: collision with root package name */
    public final ar4.b f258596k;

    /* renamed from: l, reason: collision with root package name */
    public final br4.g f258597l;

    /* renamed from: n, reason: collision with root package name */
    public byte[] f258599n;

    /* renamed from: o, reason: collision with root package name */
    public int f258600o;

    /* renamed from: p, reason: collision with root package name */
    public int f258601p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f258602q;

    /* renamed from: r, reason: collision with root package name */
    public final int f258603r;

    /* renamed from: s, reason: collision with root package name */
    public final int f258604s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f258605t;

    /* renamed from: u, reason: collision with root package name */
    public int f258606u;

    /* renamed from: a, reason: collision with root package name */
    public boolean f258586a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f258587b = false;

    /* renamed from: c, reason: collision with root package name */
    public int f258588c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f258589d = 0;

    /* renamed from: m, reason: collision with root package name */
    public p05.l4 f258598m = null;

    /* renamed from: v, reason: collision with root package name */
    public int f258607v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f258608w = 0;

    /* renamed from: x, reason: collision with root package name */
    public int f258609x = 0;

    /* renamed from: y, reason: collision with root package name */
    public boolean f258610y = false;

    /* renamed from: z, reason: collision with root package name */
    public boolean f258611z = false;

    public C18924x4c862f65(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.C18925x76a15034 c18925x76a15034, wq4.a0 a0Var, int i17) {
        this.f258591f = 0;
        this.f258592g = null;
        this.f258596k = null;
        this.f258602q = false;
        if (!E) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.C18924x4c862f65.class.getClassLoader();
            fp.d0.n("mm_gl_disp");
            E = true;
        }
        this.f258591f = i17;
        this.f258590e = new java.lang.ref.WeakReference(c18925x76a15034);
        android.os.Looper myLooper = android.os.Looper.myLooper();
        if (myLooper != null) {
            new wq4.z(this, myLooper);
        } else {
            android.os.Looper mainLooper = android.os.Looper.getMainLooper();
            if (mainLooper != null) {
                new wq4.z(this, mainLooper);
            }
        }
        if (a0Var != null) {
            new java.lang.ref.WeakReference(a0Var);
        }
        if (c() == 2) {
            this.f258596k = new ar4.b();
        }
        this.f258597l = new br4.g();
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.wevis_android_ilink_voip_skin_smooth_weight, 0);
        this.f258603r = Ni;
        int Ni2 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.wevis_android_ilink_voip_skin_bright_weight, 0);
        this.f258604s = Ni2;
        if (Ni < 0) {
            this.f258603r = 0;
        }
        if (this.f258603r >= 100) {
            this.f258603r = 100;
        }
        if (Ni2 < 0) {
            this.f258604s = 0;
        }
        if (this.f258604s >= 100) {
            this.f258604s = 100;
        }
        if (this.f258603r != 0 && this.f258604s != 0) {
            this.f258602q = true;
        }
        this.f258592g = null;
    }

    /* renamed from: Init */
    private native void m72904x22d930(int i17, java.lang.Object obj, int i18);

    /* renamed from: Uninit */
    private native void m72905x974b6b49(int i17);

    public static int c() {
        if (A == 0) {
            A = 2;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("OpenGlRender", "init gl version: %s", 2);
        }
        return A;
    }

    /* renamed from: render32 */
    private native void m72906xe2813a75(int[] iArr, int i17, int i18, int i19, int i27);

    /* renamed from: render8 */
    private native void m72907x411cf162(byte[] bArr, int i17, int i18, int i19, int i27);

    /* renamed from: setMode */
    private native void m72908x764d6925(int i17, int i18, int i19, int i27);

    /* renamed from: setParam */
    private native void m72909x5383d94b(float f17, float f18, float f19, int i17);

    public final void a(boolean z17) {
        java.lang.ref.WeakReference weakReference = this.f258590e;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        if (z17) {
            if (this.f258610y) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("OpenGlRender", "attachGLContext");
                this.f258610y = !this.f258597l.a();
                this.f258592g = null;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("OpenGlRender", "attach finish");
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.C18925x76a15034 c18925x76a15034 = (com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.C18925x76a15034) this.f258590e.get();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("OpenGlRender", "attachGLContext:%s", c18925x76a15034);
        c18925x76a15034.b(new wq4.y(this));
        java.lang.Object obj = C;
        synchronized (obj) {
            try {
                obj.wait(100L);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("OpenGlRender", "attachGLContext wait finish, bNeedAttach:%s", java.lang.Boolean.valueOf(this.f258610y));
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("OpenGlRender", e17, "", new java.lang.Object[0]);
            }
        }
    }

    public final void b(boolean z17) {
        java.lang.ref.WeakReference weakReference = this.f258590e;
        if (weakReference == null || weakReference.get() == null) {
            if (this.f258611z) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.C18925x76a15034) this.f258590e.get()).b(new wq4.x(this));
            }
        } else {
            if (z17) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.C18925x76a15034 c18925x76a15034 = (com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.C18925x76a15034) this.f258590e.get();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("OpenGlRender", "detachGLContext:%s", c18925x76a15034);
            c18925x76a15034.b(new wq4.w(this));
            java.lang.Object obj = B;
            synchronized (obj) {
                try {
                    obj.wait(100L);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("OpenGlRender", "detachGLContext wait finish, bNeedDetach:%s", java.lang.Boolean.valueOf(this.f258611z));
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("OpenGlRender", e17, "", new java.lang.Object[0]);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0286 A[Catch: all -> 0x01ca, TryCatch #0 {all -> 0x01ca, blocks: (B:66:0x0189, B:69:0x0191, B:71:0x019e, B:73:0x01a1, B:75:0x01a5, B:77:0x01a9, B:83:0x01c7, B:84:0x01cd, B:85:0x0202, B:86:0x022c, B:88:0x0235, B:89:0x025d, B:91:0x0260, B:93:0x026a, B:97:0x0275, B:99:0x0279, B:101:0x027b, B:108:0x0286, B:110:0x02bc, B:111:0x02e4), top: B:65:0x0189 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(javax.microedition.khronos.opengles.GL10 r28) {
        /*
            Method dump skipped, instructions count: 803
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.C18924x4c862f65.d(javax.microedition.khronos.opengles.GL10):void");
    }

    public void e(javax.microedition.khronos.opengles.GL10 gl10, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("OpenGlRender", "%s onSurfaceChanged, width: %s, height: %s, self:%b, UI:%dx%d,mode:%d, lastHWDecSize:%dx%d", java.lang.Integer.valueOf(hashCode()), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(this.f258605t), java.lang.Integer.valueOf(this.f258588c), java.lang.Integer.valueOf(this.f258589d), java.lang.Integer.valueOf(this.f258591f), java.lang.Integer.valueOf(this.f258608w), java.lang.Integer.valueOf(this.f258609x));
        if (this.f258588c != i17 || this.f258589d != i18) {
            gl10.glViewport(0, 0, i17, i18);
            this.f258588c = i17;
            this.f258589d = i18;
        }
        ar4.b bVar = this.f258596k;
        if (bVar != null) {
            bVar.getClass();
            bVar.getClass();
        }
        br4.g gVar = this.f258597l;
        if (gVar != null) {
            gVar.onSurfaceChanged(gl10, i17, i18);
        }
        if (this.f258598m == null) {
            boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_voip_xsetting_allow_checkgpu, true);
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_voip_facebeauty_gpu_rating_limited, 50);
            if (fj6) {
                int i19 = -1;
                try {
                    int c17 = rs0.n.f480839d.c();
                    if (c17 == -1) {
                        new rs0.n().a();
                    }
                    i19 = c17;
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.GpuDetectorUtil", "error happened " + e17, new java.lang.Object[0]);
                }
                if (i19 < Ni) {
                    this.f258602q = false;
                }
            }
        }
        if (this.f258602q) {
            if (this.f258598m == null) {
                p05.l4 l4Var = new p05.l4(1);
                this.f258598m = l4Var;
                l4Var.A(this.f258603r, -1, -1, this.f258604s, -1);
                this.f258598m.H(false);
                this.f258598m.K(true);
            }
            p05.l4 l4Var2 = this.f258598m;
            if (l4Var2 != null) {
                l4Var2.J(i17, i18);
                this.f258600o = i17;
                this.f258601p = i18;
            }
        }
        int i27 = this.f258607v;
        this.f258607v = i27;
        if (gVar != null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("OpenGlRender", "setShowMode, mode:%d, uiWidth: %s, uiHeight: %s", java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(this.f258588c), java.lang.Integer.valueOf(this.f258589d));
            if (i27 != 1) {
                this.f258611z = true;
                b(false);
            } else {
                if (this.f258611z) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("OpenGlRender", "is need to detach");
                    b(false);
                }
                this.f258610y = true;
                a(false);
            }
            gVar.f(this.f258607v);
        }
        int i28 = this.f258608w;
        int i29 = this.f258609x;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("OpenGlRender", "video=" + i28 + "x" + i29);
        if (i28 <= 0 || i29 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("OpenGlRender", "ERROR video size:%dx%d, lastviddeosize:%dx%d ", java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(this.f258608w), java.lang.Integer.valueOf(this.f258609x));
            return;
        }
        this.f258608w = i28;
        this.f258609x = i29;
        if (gVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipRenderer", "setHWDecVideoSize: width:%s, height:%s", java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i29));
            gVar.f105261g = i28;
            gVar.f105262h = i29;
            gVar.b(i28, i29, br4.b.f105218f, br4.b.f105219g);
        }
    }

    public void f(javax.microedition.khronos.opengles.GL10 gl10, javax.microedition.khronos.egl.EGLConfig eGLConfig) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("OpenGlRender", "onSurfaceCreated...");
        if (c() == 2) {
            android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
            android.opengl.GLES20.glDisable(2929);
        }
        br4.g gVar = this.f258597l;
        if (gVar != null) {
            gVar.onSurfaceCreated(gl10, eGLConfig);
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18912x54425f62.f258358l2 == null) {
            br4.e b17 = br4.e.b();
            b17.getClass();
            try {
                b17.f105253c = b17.a();
                b17.f105251a.set(false);
                android.view.Surface surface = new android.view.Surface(b17.f105253c);
                com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18912x54425f62.f258360n2 = b17.f105253c;
                com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18912x54425f62.f258359m2 = null;
                com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18912x54425f62.f258358l2 = surface;
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.m0) b17.f105254d).a();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.VoipHardDecodeUtil", e17, "initSurfaceTexutre error", new java.lang.Object[0]);
            }
        }
    }

    public void g() {
        if (this.f258590e.get() != null) {
            wq4.m mVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.C18925x76a15034) this.f258590e.get()).f258564e;
            mVar.getClass();
            wq4.n nVar = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.TextureViewSurfaceTextureListenerC18921x32ae0c3b.f258562r;
            synchronized (nVar) {
                mVar.f530208r = true;
                nVar.notifyAll();
            }
        }
    }
}
