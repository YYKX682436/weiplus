package ei3;

/* loaded from: classes10.dex */
public class k0 implements ei3.m {
    public final com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d A;
    public boolean B;
    public ei3.k H;

    /* renamed from: a, reason: collision with root package name */
    public ei3.j f334604a;

    /* renamed from: b, reason: collision with root package name */
    public ei3.y0 f334605b;

    /* renamed from: c, reason: collision with root package name */
    public final ei3.e1 f334606c;

    /* renamed from: e, reason: collision with root package name */
    public ei3.n f334608e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f334609f;

    /* renamed from: l, reason: collision with root package name */
    public int f334615l;

    /* renamed from: m, reason: collision with root package name */
    public int f334616m;

    /* renamed from: n, reason: collision with root package name */
    public final int f334617n;

    /* renamed from: d, reason: collision with root package name */
    public ei3.j0 f334607d = null;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f334610g = "";

    /* renamed from: h, reason: collision with root package name */
    public int f334611h = 0;

    /* renamed from: i, reason: collision with root package name */
    public float f334612i = 0.0f;

    /* renamed from: j, reason: collision with root package name */
    public int f334613j = -1;

    /* renamed from: k, reason: collision with root package name */
    public float f334614k = -1.0f;

    /* renamed from: o, reason: collision with root package name */
    public int f334618o = 480;

    /* renamed from: p, reason: collision with root package name */
    public int f334619p = 640;

    /* renamed from: q, reason: collision with root package name */
    public int f334620q = 0;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f334621r = null;

    /* renamed from: s, reason: collision with root package name */
    public android.os.HandlerThread f334622s = null;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f334623t = null;

    /* renamed from: u, reason: collision with root package name */
    public int f334624u = -1;

    /* renamed from: v, reason: collision with root package name */
    public int f334625v = -1;

    /* renamed from: w, reason: collision with root package name */
    public boolean f334626w = false;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f334627x = null;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f334628y = null;

    /* renamed from: z, reason: collision with root package name */
    public boolean f334629z = false;
    public int C = -1;
    public boolean D = false;
    public java.lang.String E = "";
    public boolean F = false;
    public int G = 0;
    public boolean I = false;

    /* renamed from: J, reason: collision with root package name */
    public boolean f334603J = false;
    public final di3.o K = new ei3.z(this);

    public k0(com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d) {
        this.f334615l = 480;
        this.f334616m = 640;
        this.f334617n = 1600000;
        this.B = false;
        this.A = c11120x15dce88d;
        this.f334615l = c11120x15dce88d.f152724d;
        this.f334616m = c11120x15dce88d.f152725e;
        int i17 = c11120x15dce88d.f152727g;
        this.f334617n = i17;
        int i18 = di3.w.f314303d.f314236d;
        if (i18 == -1) {
            this.f334617n = i17;
        } else {
            this.f334617n = i18;
        }
        this.f334606c = new ei3.e1();
        this.B = false;
    }

    public static void z(ei3.k0 k0Var, java.lang.Runnable runnable) {
        ei3.j0 j0Var;
        k0Var.f334606c.a(ei3.l.WaitStop);
        ei3.y0 y0Var = k0Var.f334605b;
        if (y0Var != null) {
            int i17 = y0Var.f334724a;
            float a17 = (y0Var.f334725b * 1000.0f) / ((float) k0Var.f334605b.a());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightFFMpegRecorder", "stop, bufID %d, frameCount %d, duration %dms, %.6ffps", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(k0Var.f334605b.f334725b), java.lang.Long.valueOf(k0Var.f334605b.a()), java.lang.Float.valueOf(a17));
            k0Var.f334611h = (int) k0Var.f334605b.a();
            k0Var.f334612i = a17;
            k0Var.f334605b.b();
            ei3.j0 j0Var2 = k0Var.f334607d;
            if (j0Var2 != null) {
                j0Var2.f334594g = a17;
                j0Var2.f334595h = k0Var.f334611h;
                j0Var2.f334601q = runnable;
                j0Var2.f334596i = true;
                j0Var2.b();
            }
        }
        ei3.j jVar = k0Var.f334604a;
        if (jVar != null && !k0Var.I) {
            jVar.f(new ei3.c0(k0Var));
        }
        k0Var.f334606c.a(ei3.l.Stop);
        k0Var.E = com.p314xaae8f345.mm.vfs.w6.p(k0Var.f334610g);
        if (k0Var.f334607d == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSightFFMpegRecorder", "encodeRunnable is null!, directly call stopcallback");
            k0Var.mo127748x6761d4f();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(runnable);
        }
        if (!k0Var.I || (j0Var = k0Var.f334607d) == null) {
            return;
        }
        j0Var.f334597m = true;
    }

    public final boolean A(int i17) {
        int i18;
        int i19;
        int i27;
        int i28;
        int i29;
        int i37;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        boolean z18 = di3.w.f314303d.f314237e;
        this.f334626w = z18;
        this.f334620q = i17;
        if (z18) {
            int i38 = (i17 == 0 || i17 == 180) ? this.f334618o : this.f334619p;
            int i39 = (i17 == 0 || i17 == 180) ? this.f334619p : this.f334618o;
            int i47 = (i17 == 0 || i17 == 180) ? this.f334615l : this.f334616m;
            i18 = (i17 == 0 || i17 == 180) ? this.f334616m : this.f334615l;
            i19 = i38;
            i27 = i39;
            i28 = i47;
        } else {
            int i48 = (i17 == 0 || i17 == 180) ? this.f334618o : this.f334619p;
            int i49 = (i17 == 0 || i17 == 180) ? this.f334619p : this.f334618o;
            i28 = this.f334615l;
            i18 = this.f334616m;
            int i57 = i48;
            i27 = i49;
            i19 = i57;
        }
        int i58 = this.f334617n;
        com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d = this.A;
        int m69200x909fa699 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69200x909fa699(i19, i27, i17, i28, i18, c11120x15dce88d.f152726f, i58, c11120x15dce88d.f152735r, 8, c11120x15dce88d.f152734q, 23.0f, c11120x15dce88d.N, 0, z18, true, c11120x15dce88d.f152728h, false, false, false);
        if (m69200x909fa699 < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSightFFMpegRecorder", "init failed!");
            di3.x.c();
            return false;
        }
        this.C = m69200x909fa699;
        ei3.y0 y0Var = new ei3.y0(this.f334626w, i17, i28, i18, false);
        this.f334605b = y0Var;
        if (m69200x909fa699 < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSightX264YUVRecorder", "init error, yuv buffer id error");
            i29 = -1;
        } else {
            y0Var.f334724a = m69200x909fa699;
            synchronized (ei3.y0.class) {
                y0Var.f334725b = 0;
            }
            y0Var.f334726c = 0L;
            i29 = 0;
        }
        int m66817xb58848b9 = com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1874x633fb29.BinderC16530x6b2d3ec8.m66802x9cf0d20b() != null ? com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1874x633fb29.BinderC16530x6b2d3ec8.m66802x9cf0d20b().m66817xb58848b9(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LOCAL_SIGHT_AUDIO_RECORDER_TYPE_INT_SYNC, -1) : -1;
        if (m66817xb58848b9 < 0) {
            ei3.p pVar = new ei3.p(c11120x15dce88d.f152732o, c11120x15dce88d.f152731n, c11120x15dce88d.f152733p, com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.c.a(true, c11120x15dce88d.K == 1));
            this.f334604a = pVar;
            pVar.f334667k = this.I;
            int c17 = pVar.c(m69200x909fa699, com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.a(this.f334610g));
            if (i29 < 0 || c17 < 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSightFFMpegRecorder", "init yuv or aac recorder error!! %d %d", java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(c17));
                if (c17 < 0 && i29 >= 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMSightFFMpegRecorder", "aac init error, try mediarecorder now");
                    this.f334604a.mo127741x5a5b64d();
                    ei3.w wVar = new ei3.w(c11120x15dce88d.f152732o, c11120x15dce88d.f152731n, c11120x15dce88d.f152733p);
                    this.f334604a = wVar;
                    wVar.f334688c = this.I;
                    int c18 = wVar.c(m69200x909fa699, com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.a(this.f334610g));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMSightFFMpegRecorder", "MMSightAACMediaRecorder init ret: %s", java.lang.Integer.valueOf(c18));
                    if (c18 >= 0) {
                        return true;
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69225x381fab99(m69200x909fa699);
                di3.x.c();
                return false;
            }
        } else {
            if (m66817xb58848b9 == 1) {
                ei3.p pVar2 = new ei3.p(c11120x15dce88d.f152732o, c11120x15dce88d.f152731n, c11120x15dce88d.f152733p, com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.c.a(true, c11120x15dce88d.K == 1));
                this.f334604a = pVar2;
                pVar2.f334667k = this.I;
                i37 = pVar2.c(m69200x909fa699, com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.a(this.f334610g));
            } else if (m66817xb58848b9 == 2) {
                ei3.w wVar2 = new ei3.w(c11120x15dce88d.f152732o, c11120x15dce88d.f152731n, c11120x15dce88d.f152733p);
                this.f334604a = wVar2;
                wVar2.f334688c = this.I;
                i37 = wVar2.c(m69200x909fa699, com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.a(this.f334610g));
            } else {
                i37 = 0;
            }
            if (i29 < 0 || i37 < 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSightFFMpegRecorder", "init yuv or aac recorder error!! %d %d", java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(i37));
                com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69225x381fab99(m69200x909fa699);
                di3.x.c();
                return false;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightFFMpegRecorder", "initImpl used %sms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        return true;
    }

    public final void B() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightFFMpegRecorder", "ashutest::pcm ready");
        ei3.j0 j0Var = this.f334607d;
        if (j0Var != null && !j0Var.f334599o) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSightFFMpegRecorder", "ashutest::OnPcmReady, last encode thread[%s] status error!!! MUST NOT BE HERE", j0Var);
            synchronized (this.f334607d.f334600p) {
                C(this.f334607d.f334592e);
            }
        }
        ei3.e1 e1Var = this.f334606c;
        if (e1Var.f334572a != ei3.l.Initialized) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMSightFFMpegRecorder", "ashutest::not MediaStatus.Initialized, maybe canceled by user");
            return;
        }
        e1Var.a(ei3.l.Start);
        ei3.j0 j0Var2 = new ei3.j0(this);
        this.f334607d = j0Var2;
        j0Var2.f334592e = this.C;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SightCustomAsyncMediaRecorder_encode_");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(android.os.SystemClock.elapsedRealtime());
        s75.d.c(j0Var2, sb6.toString(), 5);
    }

    public final boolean C(int i17) {
        ei3.j0 j0Var = this.f334607d;
        if (j0Var == null || j0Var.f334599o) {
            return false;
        }
        if (!j0Var.f334596i) {
            j0Var.f334601q = null;
            j0Var.f334598n = true;
            j0Var.f334597m = true;
            j0Var.b();
        }
        synchronized (this.f334607d.f334600p) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69225x381fab99(i17);
            int i18 = this.f334607d.f334592e;
            if (i18 != i17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69225x381fab99(i18);
            }
        }
        return true;
    }

    @Override // ei3.m
    public java.lang.String a() {
        return this.f334609f;
    }

    @Override // ei3.m
    public java.lang.String b() {
        return this.f334627x;
    }

    @Override // ei3.m
    public float c() {
        return this.f334612i;
    }

    @Override // ei3.m
    /* renamed from: cancel */
    public void mo127742xae7a2e7a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightFFMpegRecorder", "cancel");
        ei3.l lVar = ei3.l.WaitStop;
        ei3.e1 e1Var = this.f334606c;
        e1Var.a(lVar);
        mo127743x5a5b64d();
        e1Var.a(ei3.l.Stop);
    }

    @Override // ei3.m
    /* renamed from: clear */
    public void mo127743x5a5b64d() {
        int i17;
        ei3.y0 y0Var = this.f334605b;
        if (y0Var != null) {
            i17 = y0Var.f334724a;
            if (i17 < 0) {
                return;
            } else {
                y0Var.b();
            }
        } else {
            i17 = -1;
        }
        ei3.j jVar = this.f334604a;
        if (jVar != null) {
            jVar.f(null);
        }
        ei3.j0 j0Var = this.f334607d;
        if (j0Var != null) {
            boolean z17 = j0Var.f334598n;
        }
        if (i17 >= 0 && !C(i17)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69227xaa33f7ce("clear");
            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69225x381fab99(i17);
        }
        android.os.HandlerThread handlerThread = this.f334622s;
        if (handlerThread != null) {
            handlerThread.quit();
        }
    }

    @Override // ei3.m
    public int d() {
        return java.lang.Math.round(this.f334611h / 1000.0f);
    }

    @Override // ei3.m
    public void e(float f17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightFFMpegRecorder", "overrideFps: %s", java.lang.Float.valueOf(f17));
        this.f334614k = f17;
    }

    @Override // ei3.m
    public void f(java.lang.String str) {
        this.f334610g = str;
    }

    @Override // ei3.m
    public void g(java.lang.Runnable runnable) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var;
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Boolean.valueOf(this.f334607d == null);
        ei3.j0 j0Var = this.f334607d;
        objArr[1] = java.lang.Boolean.valueOf(j0Var != null && j0Var.f334596i);
        ei3.j0 j0Var2 = this.f334607d;
        objArr[2] = java.lang.Boolean.valueOf(j0Var2 != null && j0Var2.f334597m);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightFFMpegRecorder", "stop, encodeThread null ? %B, has trigger finish ? %B, has finish callback ? %B", objArr);
        ei3.j0 j0Var3 = this.f334607d;
        if (j0Var3 != null && j0Var3.f334596i) {
            synchronized (j0Var3.f334600p) {
                mo127748x6761d4f();
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(runnable);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightFFMpegRecorder", "stopOnCameraDataThread: %s, writeCameraDataHandler: %s", java.lang.Boolean.valueOf(this.f334603J), this.f334623t);
            if (!this.f334603J || (n3Var = this.f334623t) == null) {
                s75.d.b(new ei3.b0(this, runnable), "MMSightFFMpegRecorder_stop");
            } else {
                n3Var.mo50293x3498a0(new ei3.a0(this, runnable));
            }
        }
    }

    @Override // ei3.m
    /* renamed from: getFilePath */
    public java.lang.String mo127744x5000ed37() {
        return this.f334610g;
    }

    @Override // ei3.m
    /* renamed from: getFrameDataCallback */
    public di3.o mo127745x89bef366() {
        return this.K;
    }

    @Override // ei3.m
    /* renamed from: getMd5 */
    public java.lang.String mo127746xb5885648() {
        java.lang.String str = this.E;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        return str == null ? "" : str;
    }

    @Override // ei3.m
    public boolean h() {
        return this.F;
    }

    @Override // ei3.m
    public void i(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightFFMpegRecorder", "overrideDurationMs: %s", java.lang.Integer.valueOf(i17));
        this.f334613j = i17;
    }

    @Override // ei3.m
    public boolean j() {
        return this.D;
    }

    @Override // ei3.m
    public boolean k(int i17) {
        if (this.B) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightFFMpegRecorder", "preInit, cameraOrientation: %s", java.lang.Integer.valueOf(i17));
        boolean A = A(i17);
        this.B = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightFFMpegRecorder", "initImpl result: %s", java.lang.Boolean.valueOf(A));
        return A;
    }

    @Override // ei3.m
    public void l(int i17, int i18, int i19) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightFFMpegRecorder", "resume, cameraOrientation: %s", java.lang.Integer.valueOf(i17));
        ei3.e1 e1Var = this.f334606c;
        if (e1Var == null || e1Var.f334572a != ei3.l.Pause) {
            return;
        }
        ei3.y0 y0Var = this.f334605b;
        if (y0Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightX264YUVRecorder", "resume, newRotate: %s, frameWidth: %s, frameHeight: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
            y0Var.f334732i = i17;
        }
        e1Var.a(ei3.l.Start);
    }

    @Override // ei3.m
    public android.graphics.Point m() {
        return new android.graphics.Point(this.f334618o, this.f334619p);
    }

    @Override // ei3.m
    public long n() {
        return this.f334605b.a();
    }

    @Override // ei3.m
    public tl.c p() {
        ei3.j jVar = this.f334604a;
        if (jVar != null) {
            return jVar.e();
        }
        return null;
    }

    @Override // ei3.m
    /* renamed from: pause */
    public void mo127747x65825f6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightFFMpegRecorder", "pause");
        ei3.e1 e1Var = this.f334606c;
        if (e1Var == null || e1Var.f334572a != ei3.l.Start) {
            return;
        }
        e1Var.a(ei3.l.Pause);
    }

    @Override // ei3.m
    public java.lang.String q() {
        return this.f334628y;
    }

    @Override // ei3.m
    public void r(int i17, int i18, int i19, int i27) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightFFMpegRecorder", "setSize, width: %s, height: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        this.f334615l = i19;
        this.f334616m = i27;
        this.f334618o = i17;
        this.f334619p = i18;
        ei3.x.f334720d.m(java.lang.Integer.valueOf(((i17 * i18) * 3) / 2));
    }

    @Override // ei3.m
    /* renamed from: reset */
    public void mo127748x6761d4f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightFFMpegRecorder", "reset");
        this.f334606c.f334572a = ei3.l.Stop;
        this.D = false;
        ei3.j jVar = this.f334604a;
        if (jVar != null) {
            jVar.mo127741x5a5b64d();
        }
        ei3.y0 y0Var = this.f334605b;
        if (y0Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69225x381fab99(y0Var.f334724a);
            y0Var.f334724a = -1;
            synchronized (ei3.y0.class) {
                y0Var.f334725b = 0;
            }
            y0Var.f334726c = 0L;
        }
        mo127743x5a5b64d();
    }

    @Override // ei3.m
    public void s(java.lang.String str) {
        this.f334628y = str;
    }

    @Override // ei3.m
    /* renamed from: setMute */
    public void mo127749x764d819b(boolean z17) {
    }

    @Override // ei3.m
    public ei3.l t() {
        return this.f334606c.f334572a;
    }

    @Override // ei3.m
    public void u(ei3.k kVar) {
        this.H = kVar;
    }

    @Override // ei3.m
    public void v(boolean z17) {
        this.I = z17;
    }

    @Override // ei3.m
    public void w(java.lang.String str) {
        this.f334627x = str;
    }

    @Override // ei3.m
    public int x() {
        return this.f334620q;
    }

    @Override // ei3.m
    public int y(int i17, boolean z17, int i18) {
        ei3.e1 e1Var = this.f334606c;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightFFMpegRecorder", "request start, last status %s, cameraOrientation: %s, isLandscape: %s, degree: %s", e1Var.f334572a, java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i18));
        this.F = z17;
        this.f334611h = 0;
        this.G = i18;
        e1Var.a(ei3.l.WaitStart);
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = this.f334610g;
        objArr[1] = java.lang.Boolean.valueOf(this.f334607d == null);
        ei3.j0 j0Var = this.f334607d;
        objArr[2] = java.lang.Boolean.valueOf(j0Var == null || j0Var.f334599o);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightFFMpegRecorder", "initialize: filePath[%s], encodeThread null[%B], encodeThreadFinish[%B]", objArr);
        ei3.j0 j0Var2 = this.f334607d;
        if (j0Var2 != null && !j0Var2.f334599o) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMSightFFMpegRecorder", "ERROR, status, wait last encode thread finish!!! MUST NOT BE HERE");
            return -1;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f334610g)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSightFFMpegRecorder", "start error, mCurRecordPath is null!!");
            return -1;
        }
        this.f334609f = com.p314xaae8f345.mm.vfs.w6.q(this.f334610g);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightFFMpegRecorder", "mCurRecordPath: %s", this.f334610g);
        this.f334620q = i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightFFMpegRecorder", "start, cameraOrientation: %s", java.lang.Integer.valueOf(i17));
        if (!this.B) {
            A(i17);
            this.B = true;
        }
        ei3.y0 y0Var = this.f334605b;
        if (0 == y0Var.f334726c) {
            y0Var.f334726c = java.lang.System.currentTimeMillis();
        }
        int b17 = !this.I ? this.f334604a.b(new ei3.d0(this)) : 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightFFMpegRecorder", "start aac recorder ret: %d", java.lang.Integer.valueOf(b17));
        int i19 = pu5.i.f440006b;
        android.os.HandlerThread a17 = pu5.f.a("BigSightWriteCameraData", 0);
        this.f334622s = a17;
        a17.start();
        this.f334623t = new ei3.e0(this, this.f334622s.getLooper());
        this.D = false;
        if (b17 != 0) {
            e1Var.a(ei3.l.Error);
        } else {
            e1Var.a(ei3.l.Initialized);
        }
        di3.x.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightRecorderIDKeyStat", "markFFMpegCapture");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(440L, 1L, 1L, false);
        if (this.I) {
            B();
        }
        return b17;
    }
}
