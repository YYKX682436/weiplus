package wq4;

/* loaded from: classes13.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f530190a;

    /* renamed from: b, reason: collision with root package name */
    public javax.microedition.khronos.egl.EGL10 f530191b;

    /* renamed from: c, reason: collision with root package name */
    public javax.microedition.khronos.egl.EGLDisplay f530192c;

    /* renamed from: d, reason: collision with root package name */
    public javax.microedition.khronos.egl.EGLSurface f530193d;

    /* renamed from: e, reason: collision with root package name */
    public javax.microedition.khronos.egl.EGLConfig f530194e;

    /* renamed from: f, reason: collision with root package name */
    public javax.microedition.khronos.egl.EGLContext f530195f;

    public l(java.lang.ref.WeakReference weakReference) {
        this.f530190a = weakReference;
    }

    public static java.lang.String c(java.lang.String str, int i17) {
        return str + " failed: " + i17;
    }

    public boolean a() {
        java.lang.Thread.currentThread().getId();
        if (this.f530191b == null) {
            throw new java.lang.RuntimeException("egl not initialized");
        }
        if (this.f530192c == null) {
            throw new java.lang.RuntimeException("eglDisplay not initialized");
        }
        if (this.f530194e == null) {
            throw new java.lang.RuntimeException("eglConfig not initialized");
        }
        b();
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.TextureViewSurfaceTextureListenerC18921x32ae0c3b textureViewSurfaceTextureListenerC18921x32ae0c3b = (com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.TextureViewSurfaceTextureListenerC18921x32ae0c3b) this.f530190a.get();
        javax.microedition.khronos.egl.EGLSurface eGLSurface = null;
        if (textureViewSurfaceTextureListenerC18921x32ae0c3b == null || textureViewSurfaceTextureListenerC18921x32ae0c3b.getSurfaceTexture() == null) {
            this.f530193d = null;
        } else {
            wq4.k kVar = textureViewSurfaceTextureListenerC18921x32ae0c3b.f258569m;
            javax.microedition.khronos.egl.EGL10 egl10 = this.f530191b;
            javax.microedition.khronos.egl.EGLDisplay eGLDisplay = this.f530192c;
            javax.microedition.khronos.egl.EGLConfig eGLConfig = this.f530194e;
            android.graphics.SurfaceTexture surfaceTexture = textureViewSurfaceTextureListenerC18921x32ae0c3b.getSurfaceTexture();
            ((wq4.h) kVar).getClass();
            try {
                eGLSurface = egl10.eglCreateWindowSurface(eGLDisplay, eGLConfig, surfaceTexture, null);
            } catch (java.lang.IllegalArgumentException unused) {
                wq4.n nVar = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.TextureViewSurfaceTextureListenerC18921x32ae0c3b.f258562r;
            }
            this.f530193d = eGLSurface;
        }
        javax.microedition.khronos.egl.EGLSurface eGLSurface2 = this.f530193d;
        if (eGLSurface2 == null || eGLSurface2 == javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE) {
            this.f530191b.eglGetError();
            return false;
        }
        if (this.f530191b.eglMakeCurrent(this.f530192c, eGLSurface2, eGLSurface2, this.f530195f)) {
            return true;
        }
        c("eglMakeCurrent", this.f530191b.eglGetError());
        return false;
    }

    public final void b() {
        javax.microedition.khronos.egl.EGLSurface eGLSurface;
        javax.microedition.khronos.egl.EGLSurface eGLSurface2 = this.f530193d;
        if (eGLSurface2 == null || eGLSurface2 == (eGLSurface = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE)) {
            return;
        }
        this.f530191b.eglMakeCurrent(this.f530192c, eGLSurface, eGLSurface, javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT);
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.TextureViewSurfaceTextureListenerC18921x32ae0c3b textureViewSurfaceTextureListenerC18921x32ae0c3b = (com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.TextureViewSurfaceTextureListenerC18921x32ae0c3b) this.f530190a.get();
        if (textureViewSurfaceTextureListenerC18921x32ae0c3b != null) {
            wq4.k kVar = textureViewSurfaceTextureListenerC18921x32ae0c3b.f258569m;
            javax.microedition.khronos.egl.EGL10 egl10 = this.f530191b;
            javax.microedition.khronos.egl.EGLDisplay eGLDisplay = this.f530192c;
            javax.microedition.khronos.egl.EGLSurface eGLSurface3 = this.f530193d;
            ((wq4.h) kVar).getClass();
            egl10.eglDestroySurface(eGLDisplay, eGLSurface3);
        }
        this.f530193d = null;
    }

    public void d() {
        java.lang.Thread.currentThread().getId();
        javax.microedition.khronos.egl.EGL10 egl10 = (javax.microedition.khronos.egl.EGL10) javax.microedition.khronos.egl.EGLContext.getEGL();
        this.f530191b = egl10;
        javax.microedition.khronos.egl.EGLDisplay eglGetDisplay = egl10.eglGetDisplay(javax.microedition.khronos.egl.EGL10.EGL_DEFAULT_DISPLAY);
        this.f530192c = eglGetDisplay;
        if (eglGetDisplay == javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY) {
            throw new java.lang.RuntimeException("eglGetDisplay failed");
        }
        if (!this.f530191b.eglInitialize(eglGetDisplay, new int[2])) {
            throw new java.lang.RuntimeException("eglInitialize failed");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.TextureViewSurfaceTextureListenerC18921x32ae0c3b textureViewSurfaceTextureListenerC18921x32ae0c3b = (com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.TextureViewSurfaceTextureListenerC18921x32ae0c3b) this.f530190a.get();
        if (textureViewSurfaceTextureListenerC18921x32ae0c3b == null) {
            this.f530194e = null;
            this.f530195f = null;
        } else {
            javax.microedition.khronos.egl.EGLConfig mo174319xadc0b839 = textureViewSurfaceTextureListenerC18921x32ae0c3b.f258567h.mo174319xadc0b839(this.f530191b, this.f530192c);
            this.f530194e = mo174319xadc0b839;
            this.f530195f = textureViewSurfaceTextureListenerC18921x32ae0c3b.f258568i.mo174320xbe9e5913(this.f530191b, this.f530192c, mo174319xadc0b839);
        }
        javax.microedition.khronos.egl.EGLContext eGLContext = this.f530195f;
        if (eGLContext == null || eGLContext == javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT) {
            this.f530195f = null;
            java.lang.String c17 = c("createContext", this.f530191b.eglGetError());
            java.lang.Thread.currentThread().getId();
            throw new java.lang.RuntimeException(c17);
        }
        java.util.Objects.toString(eGLContext);
        java.lang.Thread.currentThread().getId();
        this.f530193d = null;
    }
}
