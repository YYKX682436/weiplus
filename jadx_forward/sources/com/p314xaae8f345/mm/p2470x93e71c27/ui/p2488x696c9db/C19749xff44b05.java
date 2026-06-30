package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.VideoTextureView */
/* loaded from: classes15.dex */
public class C19749xff44b05 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.C21518xd171d8a0 implements com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 {
    public static final /* synthetic */ int R = 0;
    public boolean A;
    public final android.media.MediaPlayer.OnVideoSizeChangedListener B;
    public final android.media.MediaPlayer.OnPreparedListener C;
    public final android.media.MediaPlayer.OnSeekCompleteListener D;
    public final android.media.MediaPlayer.OnBufferingUpdateListener E;
    public final android.media.MediaPlayer.OnInfoListener F;
    public final android.media.MediaPlayer.OnCompletionListener G;
    public final android.media.MediaPlayer.OnErrorListener H;
    public long I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f273015J;
    public boolean K;
    public boolean L;
    public final android.view.TextureView.SurfaceTextureListener M;
    public boolean N;
    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.o8 P;
    public float Q;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f273016h;

    /* renamed from: i, reason: collision with root package name */
    public int f273017i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.Surface f273018m;

    /* renamed from: n, reason: collision with root package name */
    public android.media.MediaPlayer f273019n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f273020o;

    /* renamed from: p, reason: collision with root package name */
    public int f273021p;

    /* renamed from: q, reason: collision with root package name */
    public int f273022q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f273023r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4 f273024s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e4 f273025t;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.c4 f273026u;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.b4 f273027v;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.d4 f273028w;

    /* renamed from: x, reason: collision with root package name */
    public long f273029x;

    /* renamed from: y, reason: collision with root package name */
    public long f273030y;

    /* renamed from: z, reason: collision with root package name */
    public int f273031z;

    public C19749xff44b05(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void E(android.graphics.SurfaceTexture surfaceTexture) {
        javax.microedition.khronos.egl.EGL10 egl10 = (javax.microedition.khronos.egl.EGL10) javax.microedition.khronos.egl.EGLContext.getEGL();
        javax.microedition.khronos.egl.EGLDisplay eglGetDisplay = egl10.eglGetDisplay(javax.microedition.khronos.egl.EGL10.EGL_DEFAULT_DISPLAY);
        egl10.eglInitialize(eglGetDisplay, null);
        javax.microedition.khronos.egl.EGLConfig[] eGLConfigArr = new javax.microedition.khronos.egl.EGLConfig[1];
        egl10.eglChooseConfig(eglGetDisplay, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344, 0, 12344}, eGLConfigArr, 1, new int[1]);
        javax.microedition.khronos.egl.EGLConfig eGLConfig = eGLConfigArr[0];
        javax.microedition.khronos.egl.EGLContext eglCreateContext = egl10.eglCreateContext(eglGetDisplay, eGLConfig, javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
        javax.microedition.khronos.egl.EGLSurface eglCreateWindowSurface = egl10.eglCreateWindowSurface(eglGetDisplay, eGLConfig, surfaceTexture, new int[]{12344});
        egl10.eglMakeCurrent(eglGetDisplay, eglCreateWindowSurface, eglCreateWindowSurface, eglCreateContext);
        android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        android.opengl.GLES20.glClear(16384);
        egl10.eglSwapBuffers(eglGetDisplay, eglCreateWindowSurface);
        egl10.eglDestroySurface(eglGetDisplay, eglCreateWindowSurface);
        javax.microedition.khronos.egl.EGLSurface eGLSurface = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE;
        egl10.eglMakeCurrent(eglGetDisplay, eGLSurface, eGLSurface, javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT);
        egl10.eglDestroyContext(eglGetDisplay, eglCreateContext);
        egl10.eglTerminate(eglGetDisplay);
    }

    public void F() {
        android.view.Surface surface;
        if (this.f273019n == null || !this.f273020o || (surface = this.f273018m) == null || !surface.isValid()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoTextureView", "%d flush surface start time[%d] ", java.lang.Integer.valueOf(hashCode()), java.lang.Integer.valueOf(mo69307x9746038c()));
        this.L = true;
        this.f273019n.setVolume(0.0f, 0.0f);
        this.f273019n.start();
    }

    public final void G() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f273016h) || this.f273018m == null) {
            return;
        }
        H();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoTextureView", "%d open video %s", java.lang.Integer.valueOf(hashCode()), this.f273016h);
        try {
            to.g gVar = new to.g();
            this.f273019n = gVar;
            gVar.setOnPreparedListener(this.C);
            this.f273019n.setOnVideoSizeChangedListener(this.B);
            this.f273020o = false;
            this.f273017i = -1;
            this.f273031z = 0;
            this.f273019n.setOnCompletionListener(this.G);
            this.f273019n.setOnErrorListener(this.H);
            this.f273019n.setOnSeekCompleteListener(this.D);
            this.f273019n.setOnBufferingUpdateListener(this.E);
            this.f273019n.setOnInfoListener(this.F);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f273016h)) {
                this.f273019n.setDataSource(this.f273016h);
            }
            this.f273019n.setSurface(this.f273018m);
            this.f273019n.setAudioStreamType(3);
            this.f273019n.setScreenOnWhilePlaying(true);
            this.f273019n.prepareAsync();
            this.f273022q = this.f273019n.getVideoHeight();
            this.f273021p = this.f273019n.getVideoWidth();
            mo69318x764d819b(this.N);
            I(this.Q);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoTextureView", "%d open video success player[%s] ", java.lang.Integer.valueOf(hashCode()), java.lang.Integer.valueOf(this.f273019n.hashCode()));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.VideoTextureView", e17, "prepare async error path", new java.lang.Object[0]);
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4 a4Var = this.f273024s;
            if (a4Var != null) {
                a4Var.mo9756xaf8aa769(-1, -1);
            }
        }
    }

    public final void H() {
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.valueOf(hashCode());
        objArr[1] = java.lang.Boolean.valueOf(this.f273020o);
        objArr[2] = java.lang.Boolean.valueOf(this.f273019n == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoTextureView", "%d release media player isPrepared[%b] player is null[%b] ", objArr);
        android.media.MediaPlayer mediaPlayer = this.f273019n;
        if (mediaPlayer != null) {
            mediaPlayer.setOnErrorListener(null);
            this.f273019n.setOnVideoSizeChangedListener(null);
            try {
                this.f273019n.stop();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.VideoTextureView", e17, "stop media player error", new java.lang.Object[0]);
            }
            try {
                this.f273019n.reset();
                this.f273019n.release();
                this.f273019n.setOnBufferingUpdateListener(null);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.VideoTextureView", e18, "reset media player error", new java.lang.Object[0]);
            }
        }
        this.f273019n = null;
    }

    public boolean I(float f17) {
        if (f17 <= 0.0f) {
            return false;
        }
        this.Q = f17;
        if (!fp.h.c(23)) {
            return false;
        }
        float f18 = this.Q;
        try {
            if (this.f273019n != null && fp.h.c(23)) {
                android.media.PlaybackParams playbackParams = this.f273019n.getPlaybackParams();
                if (playbackParams == null) {
                    playbackParams = new android.media.PlaybackParams();
                }
                this.f273019n.setPlaybackParams(playbackParams.setSpeed(f18));
            }
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.VideoTextureView", e17, "%s handle play rate error", java.lang.Integer.valueOf(hashCode()));
            return false;
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    public void a(double d17, boolean z17) {
        b(d17);
        this.f273023r = z17;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    public void b(double d17) {
        android.media.MediaPlayer mediaPlayer = this.f273019n;
        if (mediaPlayer != null) {
            mediaPlayer.seekTo((int) d17);
            this.f273023r = true;
            this.f273019n.getCurrentPosition();
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    public boolean c(android.content.Context context, boolean z17) {
        return mo69330x68ac462();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: getCurrentPosition */
    public int mo69307x9746038c() {
        android.media.MediaPlayer mediaPlayer = this.f273019n;
        return (mediaPlayer == null || !this.f273020o) ? mediaPlayer == null ? -1 : 0 : mediaPlayer.getCurrentPosition();
    }

    /* renamed from: getDownloadPercent */
    public int m75839xd376dc67() {
        return this.f273031z;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: getDuration */
    public int mo69286x51e8b0a() {
        android.media.MediaPlayer mediaPlayer = this.f273019n;
        if (mediaPlayer == null || !this.f273020o) {
            this.f273017i = -1;
            return -1;
        }
        int i17 = this.f273017i;
        if (i17 > 0) {
            return i17;
        }
        int duration = mediaPlayer.getDuration();
        this.f273017i = duration;
        return duration;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: getLastProgresstime */
    public double mo69308x9c2553a6() {
        return 0.0d;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: getLastSurfaceUpdateTime */
    public long mo69309x53bc4617() {
        return this.I;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: getVideoPath */
    public java.lang.String getF256131m() {
        return this.f273016h;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: isPlaying */
    public boolean mo69311xc00617a4() {
        android.media.MediaPlayer mediaPlayer = this.f273019n;
        boolean z17 = false;
        if (mediaPlayer != null && this.f273020o && !this.K && !this.L) {
            try {
                z17 = mediaPlayer.isPlaying();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.VideoTextureView", e17, "isPlaying", new java.lang.Object[0]);
            }
        }
        hashCode();
        return z17;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: onDetach */
    public void mo69312x3f5eee52() {
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        if (this.f273021p == 0 || this.f273022q == 0) {
            setMeasuredDimension(1, 1);
            return;
        }
        int defaultSize = android.view.View.getDefaultSize(1, i17);
        int defaultSize2 = android.view.View.getDefaultSize(1, i18);
        int i19 = this.f273021p;
        int i27 = this.f273022q;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.o8 o8Var = this.P;
        o8Var.a(defaultSize, defaultSize2, i19, i27);
        setMeasuredDimension(o8Var.f273351g, o8Var.f273352h);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: pause */
    public void mo69313x65825f6() {
        android.media.MediaPlayer mediaPlayer = this.f273019n;
        if (mediaPlayer != null && this.f273020o && mediaPlayer.isPlaying()) {
            this.f273019n.pause();
        }
        this.f273023r = false;
    }

    /* renamed from: setForceScaleFullScreen */
    public void m75840x772f3ddc(boolean z17) {
        this.P.f273345a = z17;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: setLoop */
    public void mo69317x764cf626(boolean z17) {
        android.media.MediaPlayer mediaPlayer = this.f273019n;
        if (mediaPlayer != null) {
            mediaPlayer.setLooping(z17);
        }
        this.A = true;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: setMute */
    public void mo69318x764d819b(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoTextureView", "%d set mute %b", java.lang.Integer.valueOf(hashCode()), java.lang.Boolean.valueOf(z17));
        this.N = z17;
        android.media.MediaPlayer mediaPlayer = this.f273019n;
        if (mediaPlayer != null) {
            if (z17) {
                mediaPlayer.setVolume(0.0f, 0.0f);
            } else {
                mediaPlayer.setVolume(1.0f, 1.0f);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: setOnInfoCallback */
    public void mo69319xe6781b94(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.b4 b4Var) {
        this.f273027v = b4Var;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: setOnSeekCompleteCallback */
    public void mo69320x87223eb7(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.c4 c4Var) {
        this.f273026u = c4Var;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: setOnSurfaceCallback */
    public void mo69321x146557f1(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.d4 d4Var) {
        this.f273028w = d4Var;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: setOneTimeVideoTextureUpdateCallback */
    public void mo69322xfae314df(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e4 e4Var) {
        this.f273025t = e4Var;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: setPlayProgressCallback */
    public void mo69323xc2339c68(boolean z17) {
    }

    /* renamed from: setScaleType */
    public void m75841xebd28962(com.p314xaae8f345.mm.p2470x93e71c27.ui.e1 e1Var) {
        this.P.d(e1Var);
        requestLayout();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: setThumb */
    public void mo69325x53bf7294(android.graphics.Bitmap bitmap) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: setVideoCallback */
    public void mo69326x360a109e(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4 a4Var) {
        this.f273024s = a4Var;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: setVideoPath */
    public void mo69327xab3268fe(java.lang.String str) {
        this.f273016h = str;
        this.f273023r = false;
        G();
        requestLayout();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: start */
    public boolean mo69330x68ac462() {
        if (this.f273018m == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.VideoTextureView", "%d it surface not ready, do not start", java.lang.Integer.valueOf(hashCode()));
            this.f273015J = true;
            this.f273023r = true;
            return false;
        }
        long j17 = this.f273029x;
        if (j17 == 0) {
            j17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        }
        this.f273029x = j17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoTextureView", "start %d mIsPrepared %b pauseWhenUpdated %b", java.lang.Long.valueOf(j17), java.lang.Boolean.valueOf(this.f273020o), java.lang.Boolean.valueOf(this.K));
        android.media.MediaPlayer mediaPlayer = this.f273019n;
        if (mediaPlayer != null && this.f273020o) {
            if (this.K) {
                this.K = false;
                mo69318x764d819b(this.N);
            }
            this.f273019n.start();
            this.f273023r = true;
            return true;
        }
        if (mediaPlayer != null || !this.f273020o) {
            this.f273023r = true;
            return false;
        }
        this.f273023r = true;
        G();
        requestLayout();
        return true;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: stop */
    public void mo69303x360802() {
        android.graphics.SurfaceTexture surfaceTexture;
        long j17 = this.f273030y;
        long j18 = j17 > 0 ? j17 - this.f273029x : 2147483647L;
        long i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1() - this.f273029x;
        int i18 = ((int) (j18 > i17 ? i17 : j18)) * 1000;
        if (i18 > mo69286x51e8b0a()) {
            i18 = mo69286x51e8b0a();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoTextureView", "stop : dur:%d stop:%d comp:%d", java.lang.Integer.valueOf(mo69286x51e8b0a()), java.lang.Long.valueOf(i17), java.lang.Long.valueOf(j18));
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4 a4Var = this.f273024s;
        if (a4Var != null) {
            a4Var.q(i18, mo69286x51e8b0a());
        }
        H();
        this.P.c();
        try {
            if (this.f273018m != null && this.f273020o && (surfaceTexture = getSurfaceTexture()) != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoTextureView", "%d releaseSurface", java.lang.Integer.valueOf(hashCode()));
                E(surfaceTexture);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.VideoTextureView", e17, "release surface", new java.lang.Object[0]);
        }
        this.f273016h = "";
        this.f273031z = 0;
        this.f273020o = false;
        this.f273023r = false;
        this.I = 0L;
    }

    public C19749xff44b05(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f273018m = null;
        this.f273019n = null;
        this.f273029x = 0L;
        this.f273030y = 0L;
        this.f273031z = 0;
        this.A = false;
        this.B = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f8(this);
        this.C = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.g8(this);
        this.D = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.h8(this);
        this.E = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.i8(this);
        this.F = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.j8(this);
        this.G = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.k8(this);
        this.H = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l8(this);
        this.I = 0L;
        this.f273015J = false;
        this.K = false;
        this.L = false;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.m8 m8Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.m8(this);
        this.M = m8Var;
        this.N = false;
        this.P = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.o8();
        this.Q = -1.0f;
        this.f273021p = 0;
        this.f273022q = 0;
        setSurfaceTextureListener(m8Var);
        setFocusable(true);
        setFocusableInTouchMode(true);
    }
}
