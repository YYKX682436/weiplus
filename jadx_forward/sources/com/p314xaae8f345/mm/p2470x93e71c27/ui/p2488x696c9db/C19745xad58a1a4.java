package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

@java.lang.Deprecated
/* renamed from: com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView */
/* loaded from: classes15.dex */
public class C19745xad58a1a4 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.C21518xd171d8a0 implements com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 {
    public ph3.b A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public android.graphics.SurfaceTexture F;
    public boolean G;
    public final ph3.d H;
    public final android.view.TextureView.SurfaceTextureListener I;

    /* renamed from: J, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.o8 f272980J;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f272981h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f272982i;

    /* renamed from: m, reason: collision with root package name */
    public ph3.k f272983m;

    /* renamed from: n, reason: collision with root package name */
    public int f272984n;

    /* renamed from: o, reason: collision with root package name */
    public int f272985o;

    /* renamed from: p, reason: collision with root package name */
    public int f272986p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f272987q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f272988r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f272989s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.Surface f272990t;

    /* renamed from: u, reason: collision with root package name */
    public long f272991u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f272992v;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4 f272993w;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e4 f272994x;

    /* renamed from: y, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.c4 f272995y;

    /* renamed from: z, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.d4 f272996z;

    public C19745xad58a1a4(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void E() {
        ph3.p pVar;
        if (this.f272983m == null || !this.f272987q || this.f272990t == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f272981h, "%d flush surface start ", java.lang.Integer.valueOf(hashCode()));
        ph3.o oVar = this.f272983m.f435961f;
        if (oVar == null || (pVar = oVar.f435982l) == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoPlayerImpl", "%s player flush surface", oVar.j());
        pVar.t(10);
        oVar.k(oVar.f435972b, android.os.SystemClock.elapsedRealtime(), 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ab A[Catch: Exception -> 0x00af, TRY_LEAVE, TryCatch #0 {Exception -> 0x00af, blocks: (B:3:0x002a, B:9:0x0057, B:11:0x005b, B:13:0x005f, B:14:0x0070, B:16:0x0079, B:19:0x007e, B:21:0x0087, B:22:0x009e, B:23:0x00a4, B:25:0x00ab, B:30:0x008d, B:31:0x00a1, B:32:0x0069, B:39:0x0050, B:5:0x0032, B:34:0x0037, B:36:0x003b, B:37:0x0043), top: B:2:0x002a, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void F(android.graphics.SurfaceTexture r4, int r5, int r6) {
        /*
            r3 = this;
            int r0 = r3.hashCode()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r1 = r4.hashCode()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            boolean r2 = r3.D
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.Object[] r5 = new java.lang.Object[]{r0, r1, r5, r6, r2}
            java.lang.String r6 = r3.f272981h
            java.lang.String r0 = "handleOnSurfaceTextureAvailable %d surface[%d] available [%d, %d] pauseByDestroyed[%b]"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r6, r0, r5)
            r5 = 0
            r3.C()     // Catch: java.lang.Exception -> Laf
            android.view.Surface r0 = r3.f272990t     // Catch: java.lang.Exception -> Laf
            r3.I(r0)     // Catch: java.lang.Exception -> Laf
            boolean r0 = r3.G     // Catch: java.lang.Throwable -> L4f
            if (r0 != 0) goto L37
            goto L57
        L37:
            android.graphics.SurfaceTexture r0 = r3.F     // Catch: java.lang.Throwable -> L4f
            if (r0 != 0) goto L43
            java.lang.String r0 = "first time to onSurfaceTextureAvailable"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r6, r0)     // Catch: java.lang.Throwable -> L4f
            r3.F = r4     // Catch: java.lang.Throwable -> L4f
            goto L57
        L43:
            java.lang.String r0 = "video view onSurfaceTextureAvailable from detach to attach"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r6, r0)     // Catch: java.lang.Throwable -> L4f
            android.graphics.SurfaceTexture r0 = r3.F     // Catch: java.lang.Throwable -> L4f
            r3.setSurfaceTexture(r0)     // Catch: java.lang.Throwable -> L4f
            goto L57
        L4f:
            r0 = move-exception
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> Laf
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r6, r0)     // Catch: java.lang.Exception -> Laf
        L57:
            boolean r0 = r3.G     // Catch: java.lang.Exception -> Laf
            if (r0 == 0) goto L69
            android.graphics.SurfaceTexture r0 = r3.F     // Catch: java.lang.Exception -> Laf
            if (r0 == 0) goto L69
            android.view.Surface r4 = new android.view.Surface     // Catch: java.lang.Exception -> Laf
            android.graphics.SurfaceTexture r0 = r3.F     // Catch: java.lang.Exception -> Laf
            r4.<init>(r0)     // Catch: java.lang.Exception -> Laf
            r3.f272990t = r4     // Catch: java.lang.Exception -> Laf
            goto L70
        L69:
            android.view.Surface r0 = new android.view.Surface     // Catch: java.lang.Exception -> Laf
            r0.<init>(r4)     // Catch: java.lang.Exception -> Laf
            r3.f272990t = r0     // Catch: java.lang.Exception -> Laf
        L70:
            android.view.Surface r4 = r3.f272990t     // Catch: java.lang.Exception -> Laf
            r4.hashCode()     // Catch: java.lang.Exception -> Laf
            ph3.k r4 = r3.f272983m     // Catch: java.lang.Exception -> Laf
            if (r4 == 0) goto La1
            boolean r0 = r3.f272987q     // Catch: java.lang.Exception -> Laf
            if (r0 != 0) goto L7e
            goto La1
        L7e:
            android.view.Surface r0 = r3.f272990t     // Catch: java.lang.Exception -> Laf
            r4.k(r0)     // Catch: java.lang.Exception -> Laf
            boolean r4 = r3.D     // Catch: java.lang.Exception -> Laf
            if (r4 == 0) goto L8d
            ph3.k r4 = r3.f272983m     // Catch: java.lang.Exception -> Laf
            r4.mo158546x68ac462()     // Catch: java.lang.Exception -> Laf
            goto L9e
        L8d:
            r4 = 1
            r3.E = r4     // Catch: java.lang.Exception -> Laf
            r0 = 0
            r3.f272991u = r0     // Catch: java.lang.Exception -> Laf
            ph3.k r0 = r3.f272983m     // Catch: java.lang.Exception -> Laf
            r0.mo158544x764d819b(r4)     // Catch: java.lang.Exception -> Laf
            ph3.k r4 = r3.f272983m     // Catch: java.lang.Exception -> Laf
            r4.mo158546x68ac462()     // Catch: java.lang.Exception -> Laf
        L9e:
            r3.D = r5     // Catch: java.lang.Exception -> Laf
            goto La4
        La1:
            r3.H()     // Catch: java.lang.Exception -> Laf
        La4:
            r3.J()     // Catch: java.lang.Exception -> Laf
            com.tencent.mm.pluginsdk.ui.tools.d4 r4 = r3.f272996z     // Catch: java.lang.Exception -> Laf
            if (r4 == 0) goto Lb7
            r4.mo48230xe037649b()     // Catch: java.lang.Exception -> Laf
            goto Lb7
        Laf:
            r4 = move-exception
            java.lang.String r0 = "onSurfaceTextureAvailable failed"
            java.lang.Object[] r5 = new java.lang.Object[r5]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r6, r4, r0, r5)
        Lb7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4.F(android.graphics.SurfaceTexture, int, int):void");
    }

    public void G(android.graphics.SurfaceTexture surfaceTexture) {
        ph3.k kVar;
        if (this.E && this.f272991u > 0 && (kVar = this.f272983m) != null) {
            kVar.mo158541x65825f6();
            this.f272983m.mo158544x764d819b(this.f272988r);
            this.E = false;
        }
        if (this.f272991u > 0 && this.f272994x != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f272981h, "%d notify surface update", java.lang.Integer.valueOf(hashCode()));
            this.f272994x.v();
            this.f272994x = null;
        }
        this.f272991u = java.lang.System.currentTimeMillis();
    }

    public void H() {
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(hashCode()), this.f272982i, this.f272990t};
        java.lang.String str = this.f272981h;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "%d open video [%s] [%s]", objArr);
        ph3.k kVar = this.f272983m;
        if (kVar != null) {
            kVar.f435962g = null;
            kVar.mo158547x360802();
            this.f272983m.mo158543x41012807();
            this.f272983m = null;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f272982i) || this.f272990t == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "%d open video but path is null or mSurface is null", java.lang.Integer.valueOf(hashCode()));
            return;
        }
        try {
            this.f272987q = false;
            this.f272983m = new ph3.k(android.os.Looper.getMainLooper(), false, 0);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f272982i)) {
                this.f272983m.h(this.f272982i);
            }
            ph3.k kVar2 = this.f272983m;
            ph3.b bVar = this.A;
            if (bVar != null) {
                ph3.o oVar = kVar2.f435961f;
                if (oVar != null) {
                    oVar.f435982l.f435940g = bVar;
                }
            } else {
                kVar2.getClass();
            }
            this.f272983m.q(this.B);
            this.f272983m.p(this.C);
            ph3.k kVar3 = this.f272983m;
            kVar3.f435962g = this.H;
            kVar3.mo158545x42c875eb(this.f272990t);
            this.f272983m.f435961f.f435982l.getClass();
            if (this.f272990t != null) {
                this.f272983m.mo158542xed060d07();
            } else if (this.f272992v) {
                this.f272983m.mo158542xed060d07();
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str, e17, "prepare async error %s", e17.getMessage());
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4 a4Var = this.f272993w;
            if (a4Var != null) {
                a4Var.mo9756xaf8aa769(-1, -1);
            }
        }
    }

    public void I(android.view.Surface surface) {
        java.util.Objects.toString(surface);
        if (surface != null) {
            surface.hashCode();
        }
        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.q7(this, surface));
    }

    public void J() {
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) getLayoutParams();
        if (layoutParams == null || layoutParams.getRule(13) == -1) {
            return;
        }
        layoutParams.addRule(13);
        setLayoutParams(layoutParams);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    public void a(double d17, boolean z17) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.valueOf(hashCode());
        objArr[1] = java.lang.Double.valueOf(d17);
        objArr[2] = java.lang.Boolean.valueOf(this.f272983m == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f272981h, "%d seekTo:%f  play is null?[%b", objArr);
        this.f272989s = z17;
        ph3.k kVar = this.f272983m;
        if (kVar != null) {
            kVar.o((int) d17, true);
        }
    }

    public void b(double d17) {
        a(d17, true);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    public boolean c(android.content.Context context, boolean z17) {
        return mo69330x68ac462();
    }

    /* renamed from: finalize */
    public void m75827xd764dc1e() {
        android.view.Surface surface = this.f272990t;
        if (surface == null || !surface.isValid()) {
            return;
        }
        this.f272990t.release();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: getCurrentPosition */
    public int mo69307x9746038c() {
        ph3.k kVar = this.f272983m;
        if (kVar != null) {
            return kVar.l();
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: getDuration */
    public int mo69286x51e8b0a() {
        ph3.k kVar = this.f272983m;
        if (kVar != null) {
            return (int) kVar.f435961f.f435976f;
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: getLastProgresstime */
    public double mo69308x9c2553a6() {
        return 0.0d;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: getLastSurfaceUpdateTime */
    public long mo69309x53bc4617() {
        return this.f272991u;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: getVideoPath */
    public java.lang.String getF256131m() {
        return this.f272982i;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: isPlaying */
    public boolean mo69311xc00617a4() {
        ph3.k kVar = this.f272983m;
        if (kVar != null) {
            return kVar.n();
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: onDetach */
    public void mo69312x3f5eee52() {
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        android.view.View.getDefaultSize(1, i17);
        android.view.View.getDefaultSize(1, i18);
        if (this.f272985o == 0 || this.f272984n == 0) {
            setMeasuredDimension(1, 1);
            return;
        }
        int defaultSize = android.view.View.getDefaultSize(1, i17);
        int defaultSize2 = android.view.View.getDefaultSize(1, i18);
        int i19 = this.f272985o;
        int i27 = this.f272984n;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.o8 o8Var = this.f272980J;
        o8Var.a(defaultSize, defaultSize2, i19, i27);
        int i28 = o8Var.f273351g;
        int i29 = o8Var.f273352h;
        int i37 = this.f272986p;
        if (i37 == 90 || i37 == 270) {
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            matrix.set(getMatrix());
            float f17 = i28;
            float f18 = f17 / 2.0f;
            float f19 = i29;
            float f27 = f19 / 2.0f;
            float f28 = f19 / f17;
            if (getScaleX() != 1.0f || getScaleY() != 1.0f) {
                matrix.setScale(getScaleX(), getScaleY(), f18, f27);
            }
            matrix.postRotate(this.f272986p, f18, f27);
            matrix.postScale(1.0f / f28, f28, f18, f27);
            setTransform(matrix);
        }
        setMeasuredDimension(i28, i29);
    }

    /* renamed from: pause */
    public void mo69313x65825f6() {
        ph3.k kVar = this.f272983m;
        if (kVar != null && kVar.n()) {
            this.f272983m.mo158541x65825f6();
        }
        this.D = false;
        this.f272989s = false;
    }

    /* renamed from: setForceScaleFullScreen */
    public void m75828x772f3ddc(boolean z17) {
        this.f272980J.f273345a = z17;
    }

    /* renamed from: setIOnlineCache */
    public void m75829x3c990e48(ph3.b bVar) {
        this.A = bVar;
    }

    /* renamed from: setIsOnlineVideoType */
    public void m75830x4a473e76(boolean z17) {
        this.C = z17;
        ph3.k kVar = this.f272983m;
        if (kVar != null) {
            kVar.p(z17);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: setLoop */
    public void mo69317x764cf626(boolean z17) {
    }

    /* renamed from: setMute */
    public void mo69318x764d819b(boolean z17) {
        this.f272988r = z17;
        try {
            if (this.f272983m != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f272981h, "%d set mute [%b]", java.lang.Integer.valueOf(hashCode()), java.lang.Boolean.valueOf(z17));
                this.f272983m.mo158544x764d819b(z17);
            }
        } catch (java.lang.Exception unused) {
        }
    }

    /* renamed from: setNeedOperateSurfaceTexture */
    public void m75831x3593491a(boolean z17) {
        this.G = z17;
    }

    /* renamed from: setNeedResetExtractor */
    public void m75832xcbe8d3cd(boolean z17) {
        this.B = z17;
        ph3.k kVar = this.f272983m;
        if (kVar != null) {
            kVar.q(z17);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: setOnInfoCallback */
    public void mo69319xe6781b94(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.b4 b4Var) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: setOnSeekCompleteCallback */
    public void mo69320x87223eb7(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.c4 c4Var) {
        this.f272995y = c4Var;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: setOnSurfaceCallback */
    public void mo69321x146557f1(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.d4 d4Var) {
        this.f272996z = d4Var;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: setOneTimeVideoTextureUpdateCallback */
    public void mo69322xfae314df(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e4 e4Var) {
        this.f272994x = e4Var;
    }

    /* renamed from: setOpenWithNoneSurface */
    public void m75833xe3743643(boolean z17) {
        this.f272992v = z17;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: setPlayProgressCallback */
    public void mo69323xc2339c68(boolean z17) {
    }

    /* renamed from: setScaleType */
    public void m75834xebd28962(com.p314xaae8f345.mm.p2470x93e71c27.ui.e1 e1Var) {
        if (this.f272980J.d(e1Var)) {
            requestLayout();
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: setThumb */
    public void mo69325x53bf7294(android.graphics.Bitmap bitmap) {
    }

    /* renamed from: setUseMp4Extrator */
    public void m75835x7db2aa53(boolean z17) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: setVideoCallback */
    public void mo69326x360a109e(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4 a4Var) {
        this.f272993w = a4Var;
    }

    /* renamed from: setVideoPath */
    public void mo69327xab3268fe(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f272981h, "%d set video path [%s]", java.lang.Integer.valueOf(hashCode()), str);
        this.f272982i = str;
        H();
        requestLayout();
    }

    /* renamed from: start */
    public boolean mo69330x68ac462() {
        ph3.k kVar = this.f272983m;
        java.lang.String str = this.f272981h;
        if (kVar == null || !this.f272987q) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = java.lang.Integer.valueOf(hashCode());
            objArr[1] = java.lang.Boolean.valueOf(this.f272983m == null);
            objArr[2] = java.lang.Boolean.valueOf(this.f272987q);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "%d player is null[%b] or it prepared [%b]", objArr);
            return false;
        }
        java.lang.Object[] objArr2 = new java.lang.Object[4];
        objArr2[0] = java.lang.Integer.valueOf(hashCode());
        objArr2[1] = java.lang.Boolean.valueOf(this.E);
        objArr2[2] = java.lang.Boolean.valueOf(this.D);
        objArr2[3] = java.lang.Boolean.valueOf(this.f272990t != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "%d player start pauseWhenUpdated[%b] pauseByDestroyed[%b] surface[%b]", objArr2);
        if (this.f272990t == null) {
            this.D = true;
            return true;
        }
        if (!this.E) {
            this.f272983m.mo158546x68ac462();
            return true;
        }
        this.D = true;
        this.E = false;
        mo69318x764d819b(this.f272988r);
        return true;
    }

    /* renamed from: stop */
    public void mo69303x360802() {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(hashCode());
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f272981h, "%d player stop [%s]", valueOf, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        ph3.k kVar = this.f272983m;
        if (kVar != null) {
            kVar.f435962g = null;
            kVar.mo158547x360802();
            this.f272983m.mo158543x41012807();
            this.f272983m = null;
        }
        this.f272986p = 0;
        this.f272984n = 0;
        this.f272985o = 0;
        this.f272980J.c();
        this.f272987q = false;
        this.f272982i = null;
        this.f272991u = 0L;
    }

    public C19745xad58a1a4(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f272981h = "MicroMsg.VideoPlayerTextureView@" + hashCode();
        this.f272986p = 0;
        this.f272987q = false;
        this.f272989s = true;
        this.f272991u = 0L;
        this.f272992v = false;
        this.B = false;
        this.C = false;
        this.D = false;
        this.E = false;
        this.G = false;
        this.H = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.o7(this);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.p7 p7Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.p7(this);
        this.I = p7Var;
        this.f272980J = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.o8();
        this.f272985o = 0;
        this.f272984n = 0;
        setSurfaceTextureListener(p7Var);
        setFocusable(true);
        setFocusableInTouchMode(true);
    }
}
