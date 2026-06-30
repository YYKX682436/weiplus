package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class ud extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ua implements com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.on, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.oy, com.tencent.mapsdk.internal.ua.m {

    /* renamed from: j, reason: collision with root package name */
    private final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr f133933j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f133934k;

    /* renamed from: l, reason: collision with root package name */
    private java.lang.Object f133935l;

    /* renamed from: m, reason: collision with root package name */
    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bd f133936m;

    /* renamed from: n, reason: collision with root package name */
    private int f133937n;

    /* renamed from: o, reason: collision with root package name */
    private int f133938o;

    public ud(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bd bdVar) {
        super(bdVar.mo36630x76847179());
        this.f133936m = bdVar;
        this.f133935l = bdVar.l();
        this.f133857g = bdVar.r();
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr) bdVar.d();
        this.f133933j = trVar;
        this.f133858h = trVar.f130551f;
        m37052xdbab8186(2);
        m37056xa3ea4a24(true);
        m37050x81a19c31(new com.tencent.mapsdk.internal.ua.b(8, 16, 8));
        m37053xa172aac3(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ud.AnonymousClass1());
        if (this.f133935l != null) {
            m37054xd8b55015(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ud.AnonymousClass2());
        }
        a(this, this.f133936m.p());
        m37057x638e3a5b(0);
        m37056xa3ea4a24(true);
        this.f133934k = true;
        setContentDescription(com.p314xaae8f345.map.lib.p496xc04b6a6a.AbstractC4234xc56d2fbc.f16298x95eb0155);
    }

    private void h() {
        m37052xdbab8186(2);
        m37056xa3ea4a24(true);
        m37050x81a19c31(new com.tencent.mapsdk.internal.ua.b(8, 16, 8));
        m37053xa172aac3(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ud.AnonymousClass1());
        if (this.f133935l != null) {
            m37054xd8b55015(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ud.AnonymousClass2());
        }
    }

    private static boolean k(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ua uaVar) {
        uaVar.m37056xa3ea4a24(true);
        return true;
    }

    @Override // com.tencent.mapsdk.internal.ua.m
    public final void ae() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar = this.f133933j;
        if (trVar != null) {
            trVar.ae();
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ua, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu
    public final void c() {
        super.c();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu
    public final void d() {
        if (getVisibility() == 0) {
            this.f133859i.c();
        }
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar = this.f133933j;
        if (trVar == null || !trVar.a(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu
    public final boolean e() {
        return false;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.on
    public final void f() {
        m37052xdbab8186(2);
        m37056xa3ea4a24(true);
        m37050x81a19c31(new com.tencent.mapsdk.internal.ua.b(8, 16, 8));
        m37053xa172aac3(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ud.AnonymousClass1());
        if (this.f133935l != null) {
            m37054xd8b55015(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ud.AnonymousClass2());
        }
        a(this, this.f133936m.p());
        m37057x638e3a5b(0);
        m37056xa3ea4a24(true);
        this.f133934k = true;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.oy
    /* renamed from: getEGLContextHash */
    public final int mo36527xd76ee1e9() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar = this.f133933j;
        if (trVar != null) {
            return trVar.mo36527xd76ee1e9();
        }
        return 0;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu
    /* renamed from: getMapHeight */
    public final int mo36661x223a1eed() {
        int i17 = this.f133938o;
        return i17 > 0 ? i17 : getHeight();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu
    /* renamed from: getMapWidth */
    public final int mo36662x8610cf40() {
        int i17 = this.f133937n;
        return i17 > 0 ? i17 : getWidth();
    }

    /* renamed from: getVectorMapDelegate */
    public final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.az m37059xdb90c108() {
        return this.f133933j;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu
    /* renamed from: getView */
    public final android.view.View mo36663xfb86a31b() {
        return this;
    }

    @Override // android.view.View, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu
    public final void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        this.f133937n = i17;
        this.f133938o = i18;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar = this.f133933j;
        if (trVar != null) {
            trVar.e(i17, i18);
        }
    }

    @Override // android.view.View, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        return false;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu
    /* renamed from: setMapOpaque */
    public final void mo36664x8b17525b(boolean z17) {
    }

    @Override // com.tencent.mapsdk.internal.ua.m
    public final void a(javax.microedition.khronos.opengles.GL10 gl10, javax.microedition.khronos.egl.EGLConfig eGLConfig) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar = this.f133933j;
        if (trVar != null) {
            trVar.a(gl10, eGLConfig);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ua, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu
    public final void b() {
        if (this.f133934k) {
            super.b();
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.ud$2, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass2 implements com.tencent.mapsdk.internal.ua.g {
        public AnonymousClass2() {
        }

        @Override // com.tencent.mapsdk.internal.ua.g
        public final javax.microedition.khronos.egl.EGLSurface a(javax.microedition.khronos.egl.EGL10 egl10, javax.microedition.khronos.egl.EGLDisplay eGLDisplay, javax.microedition.khronos.egl.EGLConfig eGLConfig, java.lang.Object obj) {
            javax.microedition.khronos.egl.EGLSurface eGLSurface = null;
            try {
                eGLSurface = egl10.eglCreateWindowSurface(eGLDisplay, eGLConfig, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ud.this.f133935l, null);
            } catch (java.lang.IllegalArgumentException | java.lang.OutOfMemoryError unused) {
            }
            if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ud.this.f133933j != null) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ud.this.f133933j.F();
            }
            return eGLSurface;
        }

        @Override // com.tencent.mapsdk.internal.ua.g
        public final void a(javax.microedition.khronos.egl.EGL10 egl10, javax.microedition.khronos.egl.EGLDisplay eGLDisplay, javax.microedition.khronos.egl.EGLSurface eGLSurface) {
            if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ud.this.f133933j != null) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ud.this.f133933j.G();
            }
            egl10.eglDestroySurface(eGLDisplay, eGLSurface);
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.ud$1, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass1 implements com.tencent.mapsdk.internal.ua.f {
        public AnonymousClass1() {
        }

        @Override // com.tencent.mapsdk.internal.ua.f
        public final void a(javax.microedition.khronos.egl.EGL10 egl10, javax.microedition.khronos.egl.EGLDisplay eGLDisplay, javax.microedition.khronos.egl.EGLContext eGLContext) {
            if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ud.this.f133933j != null) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ud.this.f133933j.G();
            }
            javax.microedition.khronos.egl.EGLSurface eGLSurface = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT);
            egl10.eglDestroyContext(eGLDisplay, eGLContext);
        }

        @Override // com.tencent.mapsdk.internal.ua.f
        public final javax.microedition.khronos.egl.EGLContext a(javax.microedition.khronos.egl.EGL10 egl10, javax.microedition.khronos.egl.EGLDisplay eGLDisplay, javax.microedition.khronos.egl.EGLConfig eGLConfig) {
            javax.microedition.khronos.egl.EGLContext eglCreateContext = egl10.eglCreateContext(eGLDisplay, eGLConfig, javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
            if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ud.this.f133933j != null) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ud.this.f133933j.F();
            }
            return eglCreateContext;
        }
    }

    @Override // com.tencent.mapsdk.internal.ua.m
    public final void a(javax.microedition.khronos.opengles.GL10 gl10, int i17, int i18) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar = this.f133933j;
        if (trVar != null) {
            trVar.a(gl10, i17, i18);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu
    public final void a(java.lang.Object obj, int i17, int i18) {
        this.f133937n = i17;
        this.f133938o = i18;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ua, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bu
    public final void a() {
        if (this.f133934k) {
            super.a();
        }
    }

    @Override // com.tencent.mapsdk.internal.ua.m
    public final boolean a(javax.microedition.khronos.opengles.GL10 gl10) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar = this.f133933j;
        if (trVar == null) {
            return false;
        }
        return trVar.a(gl10);
    }
}
