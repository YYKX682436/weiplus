package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class ud extends com.tencent.mapsdk.internal.ua implements com.tencent.mapsdk.internal.bu, com.tencent.mapsdk.internal.on, com.tencent.mapsdk.internal.oy, com.tencent.mapsdk.internal.ua.m {

    /* renamed from: j, reason: collision with root package name */
    private final com.tencent.mapsdk.internal.tr f52400j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f52401k;

    /* renamed from: l, reason: collision with root package name */
    private java.lang.Object f52402l;

    /* renamed from: m, reason: collision with root package name */
    private com.tencent.mapsdk.internal.bd f52403m;

    /* renamed from: n, reason: collision with root package name */
    private int f52404n;

    /* renamed from: o, reason: collision with root package name */
    private int f52405o;

    public ud(com.tencent.mapsdk.internal.bd bdVar) {
        super(bdVar.getContext());
        this.f52403m = bdVar;
        this.f52402l = bdVar.l();
        this.f52324g = bdVar.r();
        com.tencent.mapsdk.internal.tr trVar = (com.tencent.mapsdk.internal.tr) bdVar.d();
        this.f52400j = trVar;
        this.f52325h = trVar.f49018f;
        setEGLContextClientVersion(2);
        setPreserveEGLContextOnPause(true);
        setEGLConfigChooser(new com.tencent.mapsdk.internal.ua.b(8, 16, 8));
        setEGLContextFactory(new com.tencent.mapsdk.internal.ud.AnonymousClass1());
        if (this.f52402l != null) {
            setEGLWindowSurfaceFactory(new com.tencent.mapsdk.internal.ud.AnonymousClass2());
        }
        a(this, this.f52403m.p());
        setRenderMode(0);
        setPreserveEGLContextOnPause(true);
        this.f52401k = true;
        setContentDescription(com.tencent.map.lib.models.AccessibleTouchItem.MAP_DEFAULT_CONTENT_DESCRIPTION);
    }

    private void h() {
        setEGLContextClientVersion(2);
        setPreserveEGLContextOnPause(true);
        setEGLConfigChooser(new com.tencent.mapsdk.internal.ua.b(8, 16, 8));
        setEGLContextFactory(new com.tencent.mapsdk.internal.ud.AnonymousClass1());
        if (this.f52402l != null) {
            setEGLWindowSurfaceFactory(new com.tencent.mapsdk.internal.ud.AnonymousClass2());
        }
    }

    private static boolean k(com.tencent.mapsdk.internal.ua uaVar) {
        uaVar.setPreserveEGLContextOnPause(true);
        return true;
    }

    @Override // com.tencent.mapsdk.internal.ua.m
    public final void ae() {
        com.tencent.mapsdk.internal.tr trVar = this.f52400j;
        if (trVar != null) {
            trVar.ae();
        }
    }

    @Override // com.tencent.mapsdk.internal.ua, com.tencent.mapsdk.internal.bu
    public final void c() {
        super.c();
    }

    @Override // com.tencent.mapsdk.internal.bu
    public final void d() {
        if (getVisibility() == 0) {
            this.f52326i.c();
        }
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(android.view.MotionEvent motionEvent) {
        com.tencent.mapsdk.internal.tr trVar = this.f52400j;
        if (trVar == null || !trVar.a(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    @Override // com.tencent.mapsdk.internal.bu
    public final boolean e() {
        return false;
    }

    @Override // com.tencent.mapsdk.internal.on
    public final void f() {
        setEGLContextClientVersion(2);
        setPreserveEGLContextOnPause(true);
        setEGLConfigChooser(new com.tencent.mapsdk.internal.ua.b(8, 16, 8));
        setEGLContextFactory(new com.tencent.mapsdk.internal.ud.AnonymousClass1());
        if (this.f52402l != null) {
            setEGLWindowSurfaceFactory(new com.tencent.mapsdk.internal.ud.AnonymousClass2());
        }
        a(this, this.f52403m.p());
        setRenderMode(0);
        setPreserveEGLContextOnPause(true);
        this.f52401k = true;
    }

    @Override // com.tencent.mapsdk.internal.oy
    public final int getEGLContextHash() {
        com.tencent.mapsdk.internal.tr trVar = this.f52400j;
        if (trVar != null) {
            return trVar.getEGLContextHash();
        }
        return 0;
    }

    @Override // com.tencent.mapsdk.internal.bu
    public final int getMapHeight() {
        int i17 = this.f52405o;
        return i17 > 0 ? i17 : getHeight();
    }

    @Override // com.tencent.mapsdk.internal.bu
    public final int getMapWidth() {
        int i17 = this.f52404n;
        return i17 > 0 ? i17 : getWidth();
    }

    public final com.tencent.mapsdk.internal.az getVectorMapDelegate() {
        return this.f52400j;
    }

    @Override // com.tencent.mapsdk.internal.bu
    public final android.view.View getView() {
        return this;
    }

    @Override // android.view.View, com.tencent.mapsdk.internal.bu
    public final void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        this.f52404n = i17;
        this.f52405o = i18;
        com.tencent.mapsdk.internal.tr trVar = this.f52400j;
        if (trVar != null) {
            trVar.e(i17, i18);
        }
    }

    @Override // android.view.View, com.tencent.mapsdk.internal.bu
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        return false;
    }

    @Override // com.tencent.mapsdk.internal.bu
    public final void setMapOpaque(boolean z17) {
    }

    @Override // com.tencent.mapsdk.internal.ua.m
    public final void a(javax.microedition.khronos.opengles.GL10 gl10, javax.microedition.khronos.egl.EGLConfig eGLConfig) {
        com.tencent.mapsdk.internal.tr trVar = this.f52400j;
        if (trVar != null) {
            trVar.a(gl10, eGLConfig);
        }
    }

    @Override // com.tencent.mapsdk.internal.ua, com.tencent.mapsdk.internal.bu
    public final void b() {
        if (this.f52401k) {
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
                eGLSurface = egl10.eglCreateWindowSurface(eGLDisplay, eGLConfig, com.tencent.mapsdk.internal.ud.this.f52402l, null);
            } catch (java.lang.IllegalArgumentException | java.lang.OutOfMemoryError unused) {
            }
            if (com.tencent.mapsdk.internal.ud.this.f52400j != null) {
                com.tencent.mapsdk.internal.ud.this.f52400j.F();
            }
            return eGLSurface;
        }

        @Override // com.tencent.mapsdk.internal.ua.g
        public final void a(javax.microedition.khronos.egl.EGL10 egl10, javax.microedition.khronos.egl.EGLDisplay eGLDisplay, javax.microedition.khronos.egl.EGLSurface eGLSurface) {
            if (com.tencent.mapsdk.internal.ud.this.f52400j != null) {
                com.tencent.mapsdk.internal.ud.this.f52400j.G();
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
            if (com.tencent.mapsdk.internal.ud.this.f52400j != null) {
                com.tencent.mapsdk.internal.ud.this.f52400j.G();
            }
            javax.microedition.khronos.egl.EGLSurface eGLSurface = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT);
            egl10.eglDestroyContext(eGLDisplay, eGLContext);
        }

        @Override // com.tencent.mapsdk.internal.ua.f
        public final javax.microedition.khronos.egl.EGLContext a(javax.microedition.khronos.egl.EGL10 egl10, javax.microedition.khronos.egl.EGLDisplay eGLDisplay, javax.microedition.khronos.egl.EGLConfig eGLConfig) {
            javax.microedition.khronos.egl.EGLContext eglCreateContext = egl10.eglCreateContext(eGLDisplay, eGLConfig, javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
            if (com.tencent.mapsdk.internal.ud.this.f52400j != null) {
                com.tencent.mapsdk.internal.ud.this.f52400j.F();
            }
            return eglCreateContext;
        }
    }

    @Override // com.tencent.mapsdk.internal.ua.m
    public final void a(javax.microedition.khronos.opengles.GL10 gl10, int i17, int i18) {
        com.tencent.mapsdk.internal.tr trVar = this.f52400j;
        if (trVar != null) {
            trVar.a(gl10, i17, i18);
        }
    }

    @Override // com.tencent.mapsdk.internal.bu
    public final void a(java.lang.Object obj, int i17, int i18) {
        this.f52404n = i17;
        this.f52405o = i18;
    }

    @Override // com.tencent.mapsdk.internal.ua, com.tencent.mapsdk.internal.bu
    public final void a() {
        if (this.f52401k) {
            super.a();
        }
    }

    @Override // com.tencent.mapsdk.internal.ua.m
    public final boolean a(javax.microedition.khronos.opengles.GL10 gl10) {
        com.tencent.mapsdk.internal.tr trVar = this.f52400j;
        if (trVar == null) {
            return false;
        }
        return trVar.a(gl10);
    }
}
