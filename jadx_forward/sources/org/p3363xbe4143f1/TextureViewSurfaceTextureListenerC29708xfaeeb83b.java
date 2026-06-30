package org.p3363xbe4143f1;

/* renamed from: org.libpag.PAGView */
/* loaded from: classes13.dex */
public class TextureViewSurfaceTextureListenerC29708xfaeeb83b extends android.view.TextureView implements android.view.TextureView.SurfaceTextureListener, b56.d, org.p3363xbe4143f1.C29686x818ced7d.Listener {

    /* renamed from: a, reason: collision with root package name */
    private android.view.TextureView.SurfaceTextureListener f429339a;

    /* renamed from: b, reason: collision with root package name */
    private org.p3363xbe4143f1.C29699xf00d0af7 f429340b;

    /* renamed from: c, reason: collision with root package name */
    private org.p3363xbe4143f1.C29703xc0897f57 f429341c;

    /* renamed from: d, reason: collision with root package name */
    private org.p3363xbe4143f1.C29686x818ced7d f429342d;

    /* renamed from: e, reason: collision with root package name */
    private java.lang.String f429343e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f429344f;

    /* renamed from: g, reason: collision with root package name */
    private android.opengl.EGLContext f429345g;

    /* renamed from: h, reason: collision with root package name */
    private java.util.ArrayList f429346h;

    /* renamed from: i, reason: collision with root package name */
    private java.util.ArrayList f429347i;

    /* renamed from: j, reason: collision with root package name */
    private org.p3363xbe4143f1.TextureViewSurfaceTextureListenerC29708xfaeeb83b.PAGViewFrameUpdateListener f429348j;

    /* renamed from: k, reason: collision with root package name */
    private org.p3363xbe4143f1.TextureViewSurfaceTextureListenerC29708xfaeeb83b.SurfaceDestroyTaskExecutor f429349k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f429350l;

    @java.lang.Deprecated
    /* renamed from: org.libpag.PAGView$PAGFlushListener */
    /* loaded from: classes13.dex */
    public interface PAGFlushListener {
        /* renamed from: onFlush */
        void mo154991xaf961065();
    }

    /* renamed from: org.libpag.PAGView$PAGViewFrameUpdateListener */
    /* loaded from: classes13.dex */
    public interface PAGViewFrameUpdateListener {
        /* renamed from: onAnimationUpdateWithFrameInfo */
        void mo154992xbd4d3aa7(boolean z17, double d17);
    }

    /* renamed from: org.libpag.PAGView$PAGViewListener */
    /* loaded from: classes13.dex */
    public interface PAGViewListener {
        /* renamed from: onAnimationCancel */
        void mo154993x827d33f(org.p3363xbe4143f1.TextureViewSurfaceTextureListenerC29708xfaeeb83b textureViewSurfaceTextureListenerC29708xfaeeb83b);

        /* renamed from: onAnimationEnd */
        void mo154994xbb3aa236(org.p3363xbe4143f1.TextureViewSurfaceTextureListenerC29708xfaeeb83b textureViewSurfaceTextureListenerC29708xfaeeb83b);

        /* renamed from: onAnimationRepeat */
        void mo154995x21f9d260(org.p3363xbe4143f1.TextureViewSurfaceTextureListenerC29708xfaeeb83b textureViewSurfaceTextureListenerC29708xfaeeb83b);

        /* renamed from: onAnimationStart */
        void mo154996xd7e2f2fd(org.p3363xbe4143f1.TextureViewSurfaceTextureListenerC29708xfaeeb83b textureViewSurfaceTextureListenerC29708xfaeeb83b);

        /* renamed from: onAnimationUpdate */
        void mo154997x27addd8e(org.p3363xbe4143f1.TextureViewSurfaceTextureListenerC29708xfaeeb83b textureViewSurfaceTextureListenerC29708xfaeeb83b);
    }

    /* renamed from: org.libpag.PAGView$SurfaceDestroyTaskExecutor */
    /* loaded from: classes13.dex */
    public interface SurfaceDestroyTaskExecutor {
        /* renamed from: execute */
        void mo154998xb158f775(java.lang.Runnable runnable);
    }

    /* renamed from: org.libpag.PAGView$a */
    /* loaded from: classes13.dex */
    public class a implements java.lang.Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean isOpaque = org.p3363xbe4143f1.TextureViewSurfaceTextureListenerC29708xfaeeb83b.this.isOpaque();
            org.p3363xbe4143f1.TextureViewSurfaceTextureListenerC29708xfaeeb83b.this.setOpaque(!isOpaque);
            org.p3363xbe4143f1.TextureViewSurfaceTextureListenerC29708xfaeeb83b.this.setOpaque(isOpaque);
        }
    }

    /* renamed from: org.libpag.PAGView$b */
    /* loaded from: classes13.dex */
    public class b implements java.lang.Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.graphics.SurfaceTexture f429357a;

        public b(android.graphics.SurfaceTexture surfaceTexture) {
            this.f429357a = surfaceTexture;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f429357a.release();
        }
    }

    /* renamed from: org.libpag.PAGView$c */
    /* loaded from: classes13.dex */
    public class c implements java.lang.Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            java.util.ArrayList arrayList;
            synchronized (org.p3363xbe4143f1.TextureViewSurfaceTextureListenerC29708xfaeeb83b.this) {
                arrayList = new java.util.ArrayList(org.p3363xbe4143f1.TextureViewSurfaceTextureListenerC29708xfaeeb83b.this.f429347i);
            }
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((org.p3363xbe4143f1.TextureViewSurfaceTextureListenerC29708xfaeeb83b.PAGFlushListener) it.next()).mo154991xaf961065();
            }
        }
    }

    public TextureViewSurfaceTextureListenerC29708xfaeeb83b(android.content.Context context) {
        super(context);
        this.f429343e = "";
        this.f429344f = false;
        this.f429345g = null;
        this.f429346h = new java.util.ArrayList();
        this.f429347i = new java.util.ArrayList();
        this.f429348j = null;
        this.f429349k = null;
        this.f429350l = false;
        b();
    }

    private void c() {
        post(new org.p3363xbe4143f1.TextureViewSurfaceTextureListenerC29708xfaeeb83b.a());
    }

    /* renamed from: addListener */
    public void m154948x162a7075(org.p3363xbe4143f1.TextureViewSurfaceTextureListenerC29708xfaeeb83b.PAGViewListener pAGViewListener) {
        synchronized (this) {
            this.f429346h.add(pAGViewListener);
        }
    }

    @java.lang.Deprecated
    /* renamed from: addPAGFlushListener */
    public void m154949xfbe1a1a3(org.p3363xbe4143f1.TextureViewSurfaceTextureListenerC29708xfaeeb83b.PAGFlushListener pAGFlushListener) {
        synchronized (this) {
            this.f429347i.add(pAGFlushListener);
        }
    }

    /* renamed from: cacheEnabled */
    public boolean m154950x17ad5d5f() {
        return this.f429340b.m154872x17ad5d5f();
    }

    /* renamed from: cacheScale */
    public float m154951x10acae8() {
        return this.f429340b.m154873x10acae8();
    }

    /* renamed from: currentFrame */
    public long m154952x562c7f74() {
        return this.f429340b.m154874x562c7f74();
    }

    /* renamed from: duration */
    public long m154953x89444d94() {
        return this.f429340b.m154875x89444d94();
    }

    /* renamed from: flush */
    public boolean m154954x5d03b04() {
        return this.f429340b.m154877x5d03b04();
    }

    /* renamed from: freeCache */
    public void m154955xe496cc76() {
        org.p3363xbe4143f1.C29703xc0897f57 c29703xc0897f57 = this.f429341c;
        if (c29703xc0897f57 != null) {
            c29703xc0897f57.m154928xe496cc76();
        }
    }

    /* renamed from: getBounds */
    public android.graphics.RectF m154956x12a519ab(org.p3363xbe4143f1.C29697x62580a7b c29697x62580a7b) {
        return c29697x62580a7b != null ? this.f429340b.m154879x12a519ab(c29697x62580a7b) : new android.graphics.RectF();
    }

    /* renamed from: getComposition */
    public org.p3363xbe4143f1.C29687x78413754 m154957xa7d55074() {
        return this.f429340b.m154880xa7d55074();
    }

    /* renamed from: getLayersUnderPoint */
    public org.p3363xbe4143f1.C29697x62580a7b[] m154958x149c17f0(float f17, float f18) {
        return this.f429340b.m154881x149c17f0(f17, f18);
    }

    /* renamed from: getPath */
    public java.lang.String m154959xfb83cc9b() {
        return this.f429343e;
    }

    /* renamed from: getProgress */
    public double m154960x402effa3() {
        return this.f429340b.m154882x402effa3();
    }

    /* renamed from: isPlaying */
    public boolean m154961xc00617a4() {
        return this.f429342d.m154653x39e05d35();
    }

    /* renamed from: isSync */
    public boolean m154962xb9a8f6e5() {
        return this.f429342d.m154654xb9a8f6e5();
    }

    /* renamed from: makeSnapshot */
    public android.graphics.Bitmap m154963x5fd271d2() {
        org.p3363xbe4143f1.C29703xc0897f57 c29703xc0897f57 = this.f429341c;
        if (c29703xc0897f57 != null) {
            return c29703xc0897f57.m154930x5fd271d2();
        }
        return null;
    }

    /* renamed from: matrix */
    public android.graphics.Matrix m154964xbf8d97c1() {
        return this.f429340b.m154885xbf8d97c1();
    }

    /* renamed from: maxFrameRate */
    public float m154965xcba736e9() {
        return this.f429340b.m154886xcba736e9();
    }

    @Override // org.p3363xbe4143f1.C29686x818ced7d.Listener
    /* renamed from: onAnimationCancel */
    public void mo154662x827d33f(org.p3363xbe4143f1.C29686x818ced7d c29686x818ced7d) {
        java.util.ArrayList arrayList;
        synchronized (this) {
            arrayList = new java.util.ArrayList(this.f429346h);
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((org.p3363xbe4143f1.TextureViewSurfaceTextureListenerC29708xfaeeb83b.PAGViewListener) it.next()).mo154993x827d33f(this);
        }
    }

    @Override // org.p3363xbe4143f1.C29686x818ced7d.Listener
    /* renamed from: onAnimationEnd */
    public void mo154663xbb3aa236(org.p3363xbe4143f1.C29686x818ced7d c29686x818ced7d) {
        java.util.ArrayList arrayList;
        synchronized (this) {
            arrayList = new java.util.ArrayList(this.f429346h);
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((org.p3363xbe4143f1.TextureViewSurfaceTextureListenerC29708xfaeeb83b.PAGViewListener) it.next()).mo154994xbb3aa236(this);
        }
    }

    @Override // org.p3363xbe4143f1.C29686x818ced7d.Listener
    /* renamed from: onAnimationRepeat */
    public void mo154664x21f9d260(org.p3363xbe4143f1.C29686x818ced7d c29686x818ced7d) {
        java.util.ArrayList arrayList;
        synchronized (this) {
            arrayList = new java.util.ArrayList(this.f429346h);
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((org.p3363xbe4143f1.TextureViewSurfaceTextureListenerC29708xfaeeb83b.PAGViewListener) it.next()).mo154995x21f9d260(this);
        }
    }

    @Override // org.p3363xbe4143f1.C29686x818ced7d.Listener
    /* renamed from: onAnimationStart */
    public void mo154665xd7e2f2fd(org.p3363xbe4143f1.C29686x818ced7d c29686x818ced7d) {
        java.util.ArrayList arrayList;
        synchronized (this) {
            arrayList = new java.util.ArrayList(this.f429346h);
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((org.p3363xbe4143f1.TextureViewSurfaceTextureListenerC29708xfaeeb83b.PAGViewListener) it.next()).mo154996xd7e2f2fd(this);
        }
    }

    @Override // org.p3363xbe4143f1.C29686x818ced7d.Listener
    /* renamed from: onAnimationUpdate */
    public void mo154666x27addd8e(org.p3363xbe4143f1.C29686x818ced7d c29686x818ced7d) {
        java.util.ArrayList arrayList;
        this.f429340b.m154895x3ae760af(c29686x818ced7d.m154655xc454c22d());
        synchronized (this) {
            if (this.f429344f) {
                if (this.f429350l) {
                    c29686x818ced7d.m154657xffd6ec16(this.f429340b.m154875x89444d94());
                }
                double nanoTime = java.lang.System.nanoTime();
                boolean m154954x5d03b04 = m154954x5d03b04();
                double nanoTime2 = (java.lang.System.nanoTime() - nanoTime) / 1000000.0d;
                if (m154954x5d03b04) {
                    c();
                }
                org.p3363xbe4143f1.TextureViewSurfaceTextureListenerC29708xfaeeb83b.PAGViewFrameUpdateListener pAGViewFrameUpdateListener = this.f429348j;
                if (pAGViewFrameUpdateListener != null) {
                    pAGViewFrameUpdateListener.mo154992xbd4d3aa7(m154954x5d03b04, nanoTime2);
                }
                synchronized (this) {
                    arrayList = new java.util.ArrayList(this.f429346h);
                }
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((org.p3363xbe4143f1.TextureViewSurfaceTextureListenerC29708xfaeeb83b.PAGViewListener) it.next()).mo154997x27addd8e(this);
                }
                if (this.f429347i.isEmpty()) {
                    return;
                }
                post(new org.p3363xbe4143f1.TextureViewSurfaceTextureListenerC29708xfaeeb83b.c());
            }
        }
    }

    @Override // android.view.TextureView, android.view.View
    public void onAttachedToWindow() {
        this.f429344f = true;
        super.onAttachedToWindow();
        a();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        this.f429344f = false;
        super.onDetachedFromWindow();
        org.p3363xbe4143f1.C29703xc0897f57 c29703xc0897f57 = this.f429341c;
        if (c29703xc0897f57 != null) {
            c29703xc0897f57.m154931x41012807();
            this.f429341c = null;
        }
        a();
    }

    @Override // b56.d
    /* renamed from: onResume */
    public void mo9868x57429eec() {
        if (this.f429350l) {
            setVisibility(4);
            setVisibility(0);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        org.p3363xbe4143f1.C29703xc0897f57 c29703xc0897f57 = this.f429341c;
        if (c29703xc0897f57 != null) {
            c29703xc0897f57.m154931x41012807();
            this.f429341c = null;
        }
        org.p3363xbe4143f1.C29703xc0897f57 m154913xaa114218 = org.p3363xbe4143f1.C29703xc0897f57.m154913xaa114218(surfaceTexture, this.f429345g);
        this.f429341c = m154913xaa114218;
        this.f429340b.m154897x42c875eb(m154913xaa114218);
        org.p3363xbe4143f1.C29703xc0897f57 c29703xc0897f572 = this.f429341c;
        if (c29703xc0897f572 == null) {
            return;
        }
        c29703xc0897f572.m154925x2f1a8c14();
        this.f429342d.m154661xce0038c9();
        android.view.TextureView.SurfaceTextureListener surfaceTextureListener = this.f429339a;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureAvailable(surfaceTexture, i17, i18);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(final android.graphics.SurfaceTexture surfaceTexture) {
        org.p3363xbe4143f1.TextureViewSurfaceTextureListenerC29708xfaeeb83b.SurfaceDestroyTaskExecutor surfaceDestroyTaskExecutor = this.f429349k;
        if (surfaceDestroyTaskExecutor != null) {
            surfaceDestroyTaskExecutor.mo154998xb158f775(new java.lang.Runnable() { // from class: org.libpag.PAGView$$a
                @Override // java.lang.Runnable
                public final void run() {
                    org.p3363xbe4143f1.TextureViewSurfaceTextureListenerC29708xfaeeb83b.this.b(surfaceTexture);
                }
            });
        } else {
            b(surfaceTexture);
        }
        post(new org.p3363xbe4143f1.TextureViewSurfaceTextureListenerC29708xfaeeb83b.b(surfaceTexture));
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        org.p3363xbe4143f1.C29703xc0897f57 c29703xc0897f57 = this.f429341c;
        if (c29703xc0897f57 != null) {
            c29703xc0897f57.m154932xee5c006a();
            this.f429341c.m154925x2f1a8c14();
            this.f429342d.m154661xce0038c9();
        }
        android.view.TextureView.SurfaceTextureListener surfaceTextureListener = this.f429339a;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureSizeChanged(surfaceTexture, i17, i18);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
        android.view.TextureView.SurfaceTextureListener surfaceTextureListener = this.f429339a;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureUpdated(surfaceTexture);
        }
    }

    @Override // android.view.View
    public void onVisibilityAggregated(boolean z17) {
        super.onVisibilityAggregated(z17);
        a();
    }

    /* renamed from: pause */
    public void m154966x65825f6() {
        this.f429342d.m154650xae7a2e7a();
    }

    /* renamed from: play */
    public void m154967x348b34() {
        this.f429340b.m154887xed060d07();
        this.f429342d.a();
    }

    /* renamed from: release */
    public void m154968x41012807() {
        org.p3363xbe4143f1.C29699xf00d0af7 c29699xf00d0af7 = this.f429340b;
        if (c29699xf00d0af7 != null) {
            c29699xf00d0af7.m154888x41012807();
        }
    }

    /* renamed from: removeListener */
    public void m154969xf1335d58(org.p3363xbe4143f1.TextureViewSurfaceTextureListenerC29708xfaeeb83b.PAGViewListener pAGViewListener) {
        synchronized (this) {
            this.f429346h.remove(pAGViewListener);
        }
    }

    @java.lang.Deprecated
    /* renamed from: removePAGFlushListener */
    public void m154970xddecfb86(org.p3363xbe4143f1.TextureViewSurfaceTextureListenerC29708xfaeeb83b.PAGFlushListener pAGFlushListener) {
        synchronized (this) {
            this.f429347i.remove(pAGFlushListener);
        }
    }

    /* renamed from: repeatCount */
    public int m154971x5dab7c34() {
        return this.f429342d.m154656x5dab7c34();
    }

    /* renamed from: scaleMode */
    public int m154972x900e020d() {
        return this.f429340b.m154889x900e020d();
    }

    @Override // android.view.TextureView, android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
    }

    /* renamed from: setCacheEnabled */
    public void m154973xaee8eae1(boolean z17) {
        this.f429340b.m154890xaee8eae1(z17);
    }

    /* renamed from: setCacheScale */
    public void m154974x1d6fd0ea(float f17) {
        this.f429340b.m154891x1d6fd0ea(f17);
    }

    /* renamed from: setComposition */
    public void m154975x3e3ac3e8(org.p3363xbe4143f1.C29687x78413754 c29687x78413754) {
        this.f429343e = null;
        this.f429340b.m154892x3e3ac3e8(c29687x78413754);
        this.f429342d.m154658x3ae760af(this.f429340b.m154882x402effa3());
        if (this.f429350l) {
            this.f429342d.m154657xffd6ec16(this.f429340b.m154875x89444d94());
        }
    }

    /* renamed from: setFrameUpdateListener */
    public void m154976x78b917a8(org.p3363xbe4143f1.TextureViewSurfaceTextureListenerC29708xfaeeb83b.PAGViewFrameUpdateListener pAGViewFrameUpdateListener) {
        this.f429348j = pAGViewFrameUpdateListener;
    }

    /* renamed from: setMatrix */
    public void m154977x17d9eec3(android.graphics.Matrix matrix) {
        this.f429340b.m154893x17d9eec3(matrix);
    }

    /* renamed from: setMaxFrameRate */
    public void m154978x62e2c46b(float f17) {
        this.f429340b.m154894x62e2c46b(f17);
    }

    /* renamed from: setPath */
    public boolean m154979x764e93a7(java.lang.String str) {
        org.p3363xbe4143f1.C29690xfae77312 m154716x243906 = (str == null || !str.startsWith("assets://")) ? org.p3363xbe4143f1.C29690xfae77312.m154716x243906(str) : org.p3363xbe4143f1.C29690xfae77312.m154715x243906(getContext().getAssets(), str.substring(9));
        m154975x3e3ac3e8(m154716x243906);
        this.f429343e = str;
        return m154716x243906 != null;
    }

    /* renamed from: setPathAsync */
    public void m154980x4398af15(final java.lang.String str, final org.p3363xbe4143f1.C29690xfae77312.LoadListener loadListener) {
        org.p3363xbe4143f1.C29685x2fd7f25c.Run(new java.lang.Runnable() { // from class: org.libpag.PAGView$$b
            @Override // java.lang.Runnable
            public final void run() {
                org.p3363xbe4143f1.TextureViewSurfaceTextureListenerC29708xfaeeb83b.this.a(str, loadListener);
            }
        });
    }

    /* renamed from: setProgress */
    public void m154981x3ae760af(double d17) {
        this.f429340b.m154895x3ae760af(d17);
        this.f429342d.m154658x3ae760af(this.f429340b.m154882x402effa3());
        this.f429342d.m154661xce0038c9();
    }

    /* renamed from: setRepeatCount */
    public void m154982xcde73672(int i17) {
        this.f429342d.m154659xcde73672(i17);
    }

    /* renamed from: setScaleMode */
    public void m154983xebcf33cb(int i17) {
        this.f429340b.m154896xebcf33cb(i17);
    }

    /* renamed from: setSurfaceDestroyTaskExecutor */
    public void m154984x4f106a7(org.p3363xbe4143f1.TextureViewSurfaceTextureListenerC29708xfaeeb83b.SurfaceDestroyTaskExecutor surfaceDestroyTaskExecutor) {
        this.f429349k = surfaceDestroyTaskExecutor;
    }

    @Override // android.view.TextureView
    public void setSurfaceTextureListener(android.view.TextureView.SurfaceTextureListener surfaceTextureListener) {
        if (surfaceTextureListener == this) {
            super.setSurfaceTextureListener(surfaceTextureListener);
        } else {
            this.f429339a = surfaceTextureListener;
        }
    }

    /* renamed from: setSync */
    public void m154985x76504a1d(boolean z17) {
        this.f429342d.m154660x76504a1d(z17);
    }

    /* renamed from: setUseDiskCache */
    public void m154986xda8bdba0(boolean z17) {
        this.f429340b.m154898xda8bdba0(z17);
    }

    /* renamed from: setVideoEnabled */
    public void m154987x2e85abc8(boolean z17) {
        this.f429340b.m154899x2e85abc8(z17);
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        super.setVisibility(i17);
        a();
    }

    /* renamed from: stop */
    public void m154988x360802() {
        this.f429342d.m154650xae7a2e7a();
    }

    /* renamed from: useDiskCache */
    public boolean m154989x43504e1e() {
        return this.f429340b.m154900x43504e1e();
    }

    /* renamed from: videoEnabled */
    public boolean m154990x974a1e46() {
        return this.f429340b.m154901x974a1e46();
    }

    private void b() {
        b56.b bVar = b56.b.f99647f;
        bVar.getClass();
        if (getContext() instanceof android.app.Activity) {
            android.app.Activity activity = (android.app.Activity) getContext();
            if (!activity.isDestroyed()) {
                android.app.FragmentManager fragmentManager = activity.getFragmentManager();
                b56.c cVar = (b56.c) ((java.util.HashMap) bVar.f99649e).get(fragmentManager);
                if (cVar == null && (cVar = (b56.c) fragmentManager.findFragmentByTag("io.pag.manager")) == null) {
                    cVar = new b56.c();
                    ((java.util.HashMap) bVar.f99649e).put(fragmentManager, cVar);
                    fragmentManager.beginTransaction().add(cVar, "io.pag.manager").commitAllowingStateLoss();
                    bVar.f99648d.obtainMessage(1, fragmentManager).sendToTarget();
                }
                synchronized (cVar.f99651e) {
                    cVar.f99650d.add(this);
                }
            }
        }
        setOpaque(false);
        this.f429340b = new org.p3363xbe4143f1.C29699xf00d0af7();
        setSurfaceTextureListener(this);
        this.f429342d = org.p3363xbe4143f1.C29686x818ced7d.a(getContext(), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(java.lang.String str, org.p3363xbe4143f1.C29690xfae77312.LoadListener loadListener) {
        m154979x764e93a7(str);
        if (loadListener != null) {
            loadListener.m154741xc39c3f65((org.p3363xbe4143f1.C29690xfae77312) this.f429340b.m154880xa7d55074());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(android.graphics.SurfaceTexture surfaceTexture) {
        this.f429340b.m154897x42c875eb(null);
        android.view.TextureView.SurfaceTextureListener surfaceTextureListener = this.f429339a;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureDestroyed(surfaceTexture);
        }
        org.p3363xbe4143f1.C29703xc0897f57 c29703xc0897f57 = this.f429341c;
        if (c29703xc0897f57 != null) {
            c29703xc0897f57.m154928xe496cc76();
        }
    }

    private void a() {
        boolean z17 = this.f429344f && isShown();
        if (this.f429350l == z17) {
            return;
        }
        this.f429350l = z17;
        if (z17) {
            this.f429342d.m154657xffd6ec16(this.f429340b.m154875x89444d94());
            this.f429342d.m154661xce0038c9();
        } else {
            this.f429342d.m154657xffd6ec16(0L);
        }
    }

    public TextureViewSurfaceTextureListenerC29708xfaeeb83b(android.content.Context context, android.opengl.EGLContext eGLContext) {
        super(context);
        this.f429343e = "";
        this.f429344f = false;
        this.f429345g = null;
        this.f429346h = new java.util.ArrayList();
        this.f429347i = new java.util.ArrayList();
        this.f429348j = null;
        this.f429349k = null;
        this.f429350l = false;
        this.f429345g = eGLContext;
        b();
    }

    public TextureViewSurfaceTextureListenerC29708xfaeeb83b(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f429343e = "";
        this.f429344f = false;
        this.f429345g = null;
        this.f429346h = new java.util.ArrayList();
        this.f429347i = new java.util.ArrayList();
        this.f429348j = null;
        this.f429349k = null;
        this.f429350l = false;
        b();
    }

    public TextureViewSurfaceTextureListenerC29708xfaeeb83b(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f429343e = "";
        this.f429344f = false;
        this.f429345g = null;
        this.f429346h = new java.util.ArrayList();
        this.f429347i = new java.util.ArrayList();
        this.f429348j = null;
        this.f429349k = null;
        this.f429350l = false;
        b();
    }
}
