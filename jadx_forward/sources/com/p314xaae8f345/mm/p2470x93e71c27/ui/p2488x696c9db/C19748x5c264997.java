package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.VideoSurfaceView */
/* loaded from: classes15.dex */
public class C19748x5c264997 extends android.view.SurfaceView implements com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f273000d;

    /* renamed from: e, reason: collision with root package name */
    public int f273001e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.SurfaceHolder f273002f;

    /* renamed from: g, reason: collision with root package name */
    public android.media.MediaPlayer f273003g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f273004h;

    /* renamed from: i, reason: collision with root package name */
    public int f273005i;

    /* renamed from: m, reason: collision with root package name */
    public int f273006m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f273007n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4 f273008o;

    /* renamed from: p, reason: collision with root package name */
    public final android.media.MediaPlayer.OnVideoSizeChangedListener f273009p;

    /* renamed from: q, reason: collision with root package name */
    public final android.media.MediaPlayer.OnPreparedListener f273010q;

    /* renamed from: r, reason: collision with root package name */
    public final android.media.MediaPlayer.OnCompletionListener f273011r;

    /* renamed from: s, reason: collision with root package name */
    public final android.media.MediaPlayer.OnErrorListener f273012s;

    /* renamed from: t, reason: collision with root package name */
    public final android.view.SurfaceHolder.Callback f273013t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f273014u;

    public C19748x5c264997(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static void d(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19748x5c264997 c19748x5c264997) {
        int i17;
        int i18 = c19748x5c264997.f273006m;
        if (i18 == 0 || (i17 = c19748x5c264997.f273005i) == 0) {
            return;
        }
        c19748x5c264997.getWidth();
        c19748x5c264997.getHeight();
        int width = c19748x5c264997.getWidth();
        int height = c19748x5c264997.getHeight();
        if (width <= 0) {
            width = i17;
        }
        if (height <= 0) {
            height = i18;
        }
        float f17 = i17;
        float f18 = (width * 1.0f) / f17;
        float f19 = i18;
        float f27 = (height * 1.0f) / f19;
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) c19748x5c264997.getLayoutParams();
        if (f18 > f27) {
            layoutParams.width = (int) (f17 * f27);
            layoutParams.height = height;
        } else {
            layoutParams.width = width;
            layoutParams.height = (int) (f19 * f18);
        }
        layoutParams.addRule(13);
        c19748x5c264997.setLayoutParams(layoutParams);
        c19748x5c264997.f273003g.getVideoWidth();
        c19748x5c264997.f273003g.getVideoHeight();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    public void a(double d17, boolean z17) {
        b(d17);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    public void b(double d17) {
        android.media.MediaPlayer mediaPlayer = this.f273003g;
        if (mediaPlayer != null) {
            mediaPlayer.seekTo((int) d17);
            mo69330x68ac462();
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    public boolean c(android.content.Context context, boolean z17) {
        mo69330x68ac462();
        return true;
    }

    public final void e() {
        if (this.f273000d == null || this.f273002f == null) {
            return;
        }
        android.media.MediaPlayer mediaPlayer = this.f273003g;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.f273003g.release();
            this.f273003g = null;
        }
        try {
            to.g gVar = new to.g();
            this.f273003g = gVar;
            gVar.setOnPreparedListener(this.f273010q);
            this.f273003g.setOnVideoSizeChangedListener(this.f273009p);
            this.f273004h = false;
            this.f273001e = -1;
            this.f273003g.setOnCompletionListener(this.f273011r);
            this.f273003g.setOnErrorListener(this.f273012s);
            this.f273003g.setDataSource(this.f273000d);
            this.f273003g.setDisplay(this.f273002f);
            this.f273003g.setAudioStreamType(3);
            this.f273003g.setScreenOnWhilePlaying(true);
            this.f273003g.prepareAsync();
            this.f273006m = this.f273003g.getVideoHeight();
            this.f273005i = this.f273003g.getVideoWidth();
            mo69318x764d819b(this.f273014u);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.VideoSurfaceView", e17, "prepare async error %s", e17.getMessage());
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4 a4Var = this.f273008o;
            if (a4Var != null) {
                a4Var.mo9756xaf8aa769(-1, -1);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: getCurrentPosition */
    public int mo69307x9746038c() {
        android.media.MediaPlayer mediaPlayer = this.f273003g;
        if (mediaPlayer == null || !this.f273004h) {
            return 0;
        }
        return mediaPlayer.getCurrentPosition();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: getDuration */
    public int mo69286x51e8b0a() {
        android.media.MediaPlayer mediaPlayer = this.f273003g;
        if (mediaPlayer == null || !this.f273004h) {
            this.f273001e = -1;
            return -1;
        }
        int i17 = this.f273001e;
        if (i17 > 0) {
            return i17;
        }
        int duration = mediaPlayer.getDuration();
        this.f273001e = duration;
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
        return 0L;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: getVideoPath */
    public java.lang.String mo69310x4edea88a() {
        return this.f273000d;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: isPlaying */
    public boolean mo69311xc00617a4() {
        android.media.MediaPlayer mediaPlayer = this.f273003g;
        if (mediaPlayer == null || !this.f273004h) {
            return false;
        }
        return mediaPlayer.isPlaying();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: onDetach */
    public void mo69312x3f5eee52() {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: pause */
    public void mo69313x65825f6() {
        android.media.MediaPlayer mediaPlayer = this.f273003g;
        if (mediaPlayer != null && this.f273004h && mediaPlayer.isPlaying()) {
            this.f273003g.pause();
        }
        this.f273007n = false;
    }

    /* renamed from: setForceScaleFullScreen */
    public void m75838x772f3ddc(boolean z17) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: setLoop */
    public void mo69317x764cf626(boolean z17) {
        android.media.MediaPlayer mediaPlayer = this.f273003g;
        if (mediaPlayer != null) {
            mediaPlayer.setLooping(z17);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: setMute */
    public void mo69318x764d819b(boolean z17) {
        this.f273014u = z17;
        android.media.MediaPlayer mediaPlayer = this.f273003g;
        if (mediaPlayer != null) {
            if (z17) {
                mediaPlayer.setVolume(0.0f, 0.0f);
            } else {
                mediaPlayer.setVolume(0.5f, 0.5f);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: setOnInfoCallback */
    public void mo69319xe6781b94(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.b4 b4Var) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: setOnSeekCompleteCallback */
    public void mo69320x87223eb7(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.c4 c4Var) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: setOnSurfaceCallback */
    public void mo69321x146557f1(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.d4 d4Var) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: setOneTimeVideoTextureUpdateCallback */
    public void mo69322xfae314df(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e4 e4Var) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: setPlayProgressCallback */
    public void mo69323xc2339c68(boolean z17) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: setThumb */
    public void mo69325x53bf7294(android.graphics.Bitmap bitmap) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: setVideoCallback */
    public void mo69326x360a109e(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4 a4Var) {
        this.f273008o = a4Var;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: setVideoPath */
    public void mo69327xab3268fe(java.lang.String str) {
        this.f273000d = str;
        this.f273007n = false;
        e();
        requestLayout();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: start */
    public boolean mo69330x68ac462() {
        android.media.MediaPlayer mediaPlayer = this.f273003g;
        if (mediaPlayer == null || !this.f273004h) {
            this.f273007n = true;
        } else {
            mediaPlayer.start();
            this.f273007n = false;
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: stop */
    public void mo69303x360802() {
        android.media.MediaPlayer mediaPlayer = this.f273003g;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.f273003g.release();
            this.f273003g = null;
        }
    }

    public C19748x5c264997(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f273002f = null;
        this.f273003g = null;
        this.f273009p = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.y7(this);
        this.f273010q = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.z7(this);
        this.f273011r = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a8(this);
        this.f273012s = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.b8(this);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.c8 c8Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.c8(this);
        this.f273013t = c8Var;
        this.f273014u = false;
        this.f273005i = 0;
        this.f273006m = 0;
        getHolder().addCallback(c8Var);
        getHolder().setType(3);
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
    }
}
