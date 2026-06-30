package jb4;

/* loaded from: classes14.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f380336a;

    /* renamed from: b, reason: collision with root package name */
    public javax.microedition.khronos.egl.EGL10 f380337b;

    /* renamed from: c, reason: collision with root package name */
    public javax.microedition.khronos.egl.EGLDisplay f380338c;

    /* renamed from: d, reason: collision with root package name */
    public javax.microedition.khronos.egl.EGLSurface f380339d;

    /* renamed from: e, reason: collision with root package name */
    public javax.microedition.khronos.egl.EGLConfig f380340e;

    /* renamed from: f, reason: collision with root package name */
    public javax.microedition.khronos.egl.EGLContext f380341f;

    public i(java.lang.ref.WeakReference weakReference) {
        this.f380336a = weakReference;
    }

    public static java.lang.String d(java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("formatEglError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$EglHelper");
        java.lang.String str2 = str + " failed: " + i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("formatEglError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$EglHelper");
        return str2;
    }

    public javax.microedition.khronos.opengles.GL a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createGL", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$EglHelper");
        javax.microedition.khronos.opengles.GL gl6 = this.f380341f.getGL();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2180xd1075a44.p2181xd3691933.TextureViewSurfaceTextureListenerC17930x32ae0c3b textureViewSurfaceTextureListenerC17930x32ae0c3b = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2180xd1075a44.p2181xd3691933.TextureViewSurfaceTextureListenerC17930x32ae0c3b) this.f380336a.get();
        if (textureViewSurfaceTextureListenerC17930x32ae0c3b != null) {
            jb4.k kVar = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2180xd1075a44.p2181xd3691933.TextureViewSurfaceTextureListenerC17930x32ae0c3b.f247423r;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$700", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$700", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$800", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
            int i17 = textureViewSurfaceTextureListenerC17930x32ae0c3b.f247431n;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$800", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
            if ((i17 & 3) != 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$800", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
                int i18 = textureViewSurfaceTextureListenerC17930x32ae0c3b.f247431n;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$800", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
                int i19 = (i18 & 1) == 0 ? 0 : 1;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$800", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
                int i27 = textureViewSurfaceTextureListenerC17930x32ae0c3b.f247431n;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$800", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
                gl6 = android.opengl.GLDebugHelper.wrap(gl6, i19, (i27 & 2) != 0 ? new jb4.m() : null);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createGL", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$EglHelper");
        return gl6;
    }

    public boolean b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createSurface", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$EglHelper");
        if (this.f380337b == null) {
            java.lang.RuntimeException runtimeException = new java.lang.RuntimeException("egl not initialized");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createSurface", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$EglHelper");
            throw runtimeException;
        }
        if (this.f380338c == null) {
            java.lang.RuntimeException runtimeException2 = new java.lang.RuntimeException("eglDisplay not initialized");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createSurface", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$EglHelper");
            throw runtimeException2;
        }
        if (this.f380340e == null) {
            java.lang.RuntimeException runtimeException3 = new java.lang.RuntimeException("eglConfig not initialized");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createSurface", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$EglHelper");
            throw runtimeException3;
        }
        c();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2180xd1075a44.p2181xd3691933.TextureViewSurfaceTextureListenerC17930x32ae0c3b textureViewSurfaceTextureListenerC17930x32ae0c3b = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2180xd1075a44.p2181xd3691933.TextureViewSurfaceTextureListenerC17930x32ae0c3b) this.f380336a.get();
        javax.microedition.khronos.egl.EGLSurface eGLSurface = null;
        if (textureViewSurfaceTextureListenerC17930x32ae0c3b != null) {
            jb4.k kVar = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2180xd1075a44.p2181xd3691933.TextureViewSurfaceTextureListenerC17930x32ae0c3b.f247423r;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$600", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
            jb4.h hVar = textureViewSurfaceTextureListenerC17930x32ae0c3b.f247430m;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$600", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
            javax.microedition.khronos.egl.EGL10 egl10 = this.f380337b;
            javax.microedition.khronos.egl.EGLDisplay eGLDisplay = this.f380338c;
            javax.microedition.khronos.egl.EGLConfig eGLConfig = this.f380340e;
            android.graphics.SurfaceTexture surfaceTexture = textureViewSurfaceTextureListenerC17930x32ae0c3b.getSurfaceTexture();
            ((jb4.e) hVar).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createWindowSurface", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$DefaultWindowSurfaceFactory");
            try {
                eGLSurface = egl10.eglCreateWindowSurface(eGLDisplay, eGLConfig, surfaceTexture, null);
            } catch (java.lang.IllegalArgumentException unused) {
                jb4.k kVar2 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2180xd1075a44.p2181xd3691933.TextureViewSurfaceTextureListenerC17930x32ae0c3b.f247423r;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createWindowSurface", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$DefaultWindowSurfaceFactory");
            this.f380339d = eGLSurface;
        } else {
            this.f380339d = null;
        }
        javax.microedition.khronos.egl.EGLSurface eGLSurface2 = this.f380339d;
        if (eGLSurface2 == null || eGLSurface2 == javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE) {
            this.f380337b.eglGetError();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createSurface", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$EglHelper");
            return false;
        }
        if (this.f380337b.eglMakeCurrent(this.f380338c, eGLSurface2, eGLSurface2, this.f380341f)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createSurface", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$EglHelper");
            return true;
        }
        int eglGetError = this.f380337b.eglGetError();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("logEglErrorAsWarning", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$EglHelper");
        d("eglMakeCurrent", eglGetError);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("logEglErrorAsWarning", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$EglHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createSurface", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$EglHelper");
        return false;
    }

    public final void c() {
        javax.microedition.khronos.egl.EGLSurface eGLSurface;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("destroySurfaceImp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$EglHelper");
        javax.microedition.khronos.egl.EGLSurface eGLSurface2 = this.f380339d;
        if (eGLSurface2 != null && eGLSurface2 != (eGLSurface = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE)) {
            this.f380337b.eglMakeCurrent(this.f380338c, eGLSurface, eGLSurface, javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2180xd1075a44.p2181xd3691933.TextureViewSurfaceTextureListenerC17930x32ae0c3b textureViewSurfaceTextureListenerC17930x32ae0c3b = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2180xd1075a44.p2181xd3691933.TextureViewSurfaceTextureListenerC17930x32ae0c3b) this.f380336a.get();
            if (textureViewSurfaceTextureListenerC17930x32ae0c3b != null) {
                jb4.k kVar = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2180xd1075a44.p2181xd3691933.TextureViewSurfaceTextureListenerC17930x32ae0c3b.f247423r;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$600", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
                jb4.h hVar = textureViewSurfaceTextureListenerC17930x32ae0c3b.f247430m;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$600", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
                javax.microedition.khronos.egl.EGL10 egl10 = this.f380337b;
                javax.microedition.khronos.egl.EGLDisplay eGLDisplay = this.f380338c;
                javax.microedition.khronos.egl.EGLSurface eGLSurface3 = this.f380339d;
                ((jb4.e) hVar).getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("destroySurface", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$DefaultWindowSurfaceFactory");
                egl10.eglDestroySurface(eGLDisplay, eGLSurface3);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("destroySurface", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$DefaultWindowSurfaceFactory");
            }
            this.f380339d = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("destroySurfaceImp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$EglHelper");
    }

    public void e() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        javax.microedition.khronos.egl.EGLConfig eGLConfig;
        java.lang.String str4;
        javax.microedition.khronos.egl.EGL10 egl10;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("start", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$EglHelper");
        javax.microedition.khronos.egl.EGL10 egl102 = (javax.microedition.khronos.egl.EGL10) javax.microedition.khronos.egl.EGLContext.getEGL();
        this.f380337b = egl102;
        javax.microedition.khronos.egl.EGLDisplay eglGetDisplay = egl102.eglGetDisplay(javax.microedition.khronos.egl.EGL10.EGL_DEFAULT_DISPLAY);
        this.f380338c = eglGetDisplay;
        if (eglGetDisplay == javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY) {
            java.lang.RuntimeException runtimeException = new java.lang.RuntimeException("eglGetDisplay failed");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("start", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$EglHelper");
            throw runtimeException;
        }
        if (!this.f380337b.eglInitialize(eglGetDisplay, new int[2])) {
            java.lang.RuntimeException runtimeException2 = new java.lang.RuntimeException("eglInitialize failed");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("start", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$EglHelper");
            throw runtimeException2;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2180xd1075a44.p2181xd3691933.TextureViewSurfaceTextureListenerC17930x32ae0c3b textureViewSurfaceTextureListenerC17930x32ae0c3b = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2180xd1075a44.p2181xd3691933.TextureViewSurfaceTextureListenerC17930x32ae0c3b) this.f380336a.get();
        java.lang.String str5 = "createContext";
        if (textureViewSurfaceTextureListenerC17930x32ae0c3b == null) {
            this.f380340e = null;
            this.f380341f = null;
            str = "start";
            str2 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$EglHelper";
            str4 = "createContext";
        } else {
            jb4.k kVar = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2180xd1075a44.p2181xd3691933.TextureViewSurfaceTextureListenerC17930x32ae0c3b.f247423r;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
            jb4.f fVar = textureViewSurfaceTextureListenerC17930x32ae0c3b.f247428h;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
            javax.microedition.khronos.egl.EGL10 egl103 = this.f380337b;
            javax.microedition.khronos.egl.EGLDisplay eGLDisplay = this.f380338c;
            jb4.b bVar = (jb4.b) fVar;
            bVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("chooseConfig", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$BaseConfigChooser");
            int[] iArr = new int[1];
            str = "start";
            if (!egl103.eglChooseConfig(eGLDisplay, bVar.f380304a, null, 0, iArr)) {
                java.lang.IllegalArgumentException illegalArgumentException = new java.lang.IllegalArgumentException("eglChooseConfig failed");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("chooseConfig", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$BaseConfigChooser");
                throw illegalArgumentException;
            }
            int i17 = iArr[0];
            if (i17 <= 0) {
                java.lang.IllegalArgumentException illegalArgumentException2 = new java.lang.IllegalArgumentException("No configs match configSpec");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("chooseConfig", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$BaseConfigChooser");
                throw illegalArgumentException2;
            }
            javax.microedition.khronos.egl.EGLConfig[] eGLConfigArr = new javax.microedition.khronos.egl.EGLConfig[i17];
            str2 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$EglHelper";
            int i18 = i17;
            if (!egl103.eglChooseConfig(eGLDisplay, bVar.f380304a, eGLConfigArr, i17, iArr)) {
                java.lang.IllegalArgumentException illegalArgumentException3 = new java.lang.IllegalArgumentException("eglChooseConfig#2 failed");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("chooseConfig", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$BaseConfigChooser");
                throw illegalArgumentException3;
            }
            jb4.c cVar = (jb4.c) bVar;
            java.lang.String str6 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$ComponentSizeChooser";
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("chooseConfig", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$ComponentSizeChooser");
            int i19 = 0;
            while (true) {
                if (i19 >= i18) {
                    str3 = str5;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("chooseConfig", str6);
                    eGLConfig = null;
                    break;
                }
                javax.microedition.khronos.egl.EGLConfig eGLConfig2 = eGLConfigArr[i19];
                javax.microedition.khronos.egl.EGL10 egl104 = egl103;
                int i27 = i19;
                int i28 = i18;
                java.lang.String str7 = str6;
                int a17 = cVar.a(egl104, eGLDisplay, eGLConfig2, 12325, 0);
                str3 = str5;
                int a18 = cVar.a(egl104, eGLDisplay, eGLConfig2, 12326, 0);
                if (a17 >= cVar.f380313h && a18 >= cVar.f380314i) {
                    javax.microedition.khronos.egl.EGL10 egl105 = egl103;
                    int a19 = cVar.a(egl105, eGLDisplay, eGLConfig2, 12324, 0);
                    int a27 = cVar.a(egl105, eGLDisplay, eGLConfig2, 12323, 0);
                    int a28 = cVar.a(egl105, eGLDisplay, eGLConfig2, 12322, 0);
                    egl10 = egl103;
                    int a29 = cVar.a(egl105, eGLDisplay, eGLConfig2, 12321, 0);
                    if (a19 == cVar.f380309d && a27 == cVar.f380310e && a28 == cVar.f380311f && a29 == cVar.f380312g) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("chooseConfig", str7);
                        eGLConfig = eGLConfig2;
                        break;
                    }
                } else {
                    egl10 = egl103;
                }
                i19 = i27 + 1;
                str6 = str7;
                i18 = i28;
                egl103 = egl10;
                str5 = str3;
            }
            if (eGLConfig == null) {
                java.lang.IllegalArgumentException illegalArgumentException4 = new java.lang.IllegalArgumentException("No config chosen");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("chooseConfig", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$BaseConfigChooser");
                throw illegalArgumentException4;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("chooseConfig", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$BaseConfigChooser");
            this.f380340e = eGLConfig;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$500", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
            jb4.g gVar = textureViewSurfaceTextureListenerC17930x32ae0c3b.f247429i;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$500", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
            javax.microedition.khronos.egl.EGL10 egl106 = this.f380337b;
            javax.microedition.khronos.egl.EGLDisplay eGLDisplay2 = this.f380338c;
            javax.microedition.khronos.egl.EGLConfig eGLConfig3 = this.f380340e;
            jb4.d dVar = (jb4.d) gVar;
            dVar.getClass();
            str4 = str3;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(str4, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$DefaultContextFactory");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2180xd1075a44.p2181xd3691933.TextureViewSurfaceTextureListenerC17930x32ae0c3b textureViewSurfaceTextureListenerC17930x32ae0c3b2 = dVar.f380316a;
            int i29 = textureViewSurfaceTextureListenerC17930x32ae0c3b2.f247432o;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
            int[] iArr2 = {12440, i29, 12344};
            javax.microedition.khronos.egl.EGLContext eGLContext = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
            int i37 = textureViewSurfaceTextureListenerC17930x32ae0c3b2.f247432o;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView");
            if (i37 == 0) {
                iArr2 = null;
            }
            javax.microedition.khronos.egl.EGLContext eglCreateContext = egl106.eglCreateContext(eGLDisplay2, eGLConfig3, eGLContext, iArr2);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str4, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.GLTextureView$DefaultContextFactory");
            this.f380341f = eglCreateContext;
        }
        javax.microedition.khronos.egl.EGLContext eGLContext2 = this.f380341f;
        if (eGLContext2 != null && eGLContext2 != javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT) {
            this.f380339d = null;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, str2);
            return;
        }
        java.lang.String str8 = str2;
        this.f380341f = null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("throwEglException", str8);
        int eglGetError = this.f380337b.eglGetError();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("throwEglException", str8);
        java.lang.RuntimeException runtimeException3 = new java.lang.RuntimeException(d(str4, eglGetError));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("throwEglException", str8);
        throw runtimeException3;
    }
}
