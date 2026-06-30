package u9;

/* loaded from: classes14.dex */
public class d extends android.os.HandlerThread implements android.graphics.SurfaceTexture.OnFrameAvailableListener, android.os.Handler.Callback {

    /* renamed from: d, reason: collision with root package name */
    public final int[] f507264d;

    /* renamed from: e, reason: collision with root package name */
    public android.opengl.EGLDisplay f507265e;

    /* renamed from: f, reason: collision with root package name */
    public android.opengl.EGLContext f507266f;

    /* renamed from: g, reason: collision with root package name */
    public android.opengl.EGLSurface f507267g;

    /* renamed from: h, reason: collision with root package name */
    public android.os.Handler f507268h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.SurfaceTexture f507269i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Error f507270m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.RuntimeException f507271n;

    /* renamed from: o, reason: collision with root package name */
    public com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p185x6b0147b.C1623x4a4ec705 f507272o;

    public d() {
        super("dummySurface");
        this.f507264d = new int[1];
    }

    public final void b(boolean z17) {
        android.opengl.EGLDisplay eglGetDisplay = android.opengl.EGL14.eglGetDisplay(0);
        this.f507265e = eglGetDisplay;
        t9.a.e(eglGetDisplay != null, "eglGetDisplay failed");
        int[] iArr = new int[2];
        t9.a.e(android.opengl.EGL14.eglInitialize(this.f507265e, iArr, 0, iArr, 1), "eglInitialize failed");
        android.opengl.EGLConfig[] eGLConfigArr = new android.opengl.EGLConfig[1];
        int[] iArr2 = new int[1];
        t9.a.e(android.opengl.EGL14.eglChooseConfig(this.f507265e, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0) && iArr2[0] > 0 && eGLConfigArr[0] != null, "eglChooseConfig failed");
        android.opengl.EGLConfig eGLConfig = eGLConfigArr[0];
        android.opengl.EGLContext eglCreateContext = android.opengl.EGL14.eglCreateContext(this.f507265e, eGLConfig, android.opengl.EGL14.EGL_NO_CONTEXT, z17 ? new int[]{12440, 2, 12992, 1, 12344} : new int[]{12440, 2, 12344}, 0);
        this.f507266f = eglCreateContext;
        t9.a.e(eglCreateContext != null, "eglCreateContext failed");
        android.opengl.EGLSurface eglCreatePbufferSurface = android.opengl.EGL14.eglCreatePbufferSurface(this.f507265e, eGLConfig, z17 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
        this.f507267g = eglCreatePbufferSurface;
        t9.a.e(eglCreatePbufferSurface != null, "eglCreatePbufferSurface failed");
        android.opengl.EGLDisplay eGLDisplay = this.f507265e;
        android.opengl.EGLSurface eGLSurface = this.f507267g;
        t9.a.e(android.opengl.EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f507266f), "eglMakeCurrent failed");
        int[] iArr3 = this.f507264d;
        android.opengl.GLES20.glGenTextures(1, iArr3, 0);
        android.graphics.SurfaceTexture surfaceTexture = new android.graphics.SurfaceTexture(iArr3[0]);
        this.f507269i = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
        this.f507272o = new com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p185x6b0147b.C1623x4a4ec705(this, this.f507269i, z17, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c() {
        try {
            android.graphics.SurfaceTexture surfaceTexture = this.f507269i;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                android.opengl.GLES20.glDeleteTextures(1, this.f507264d, 0);
            }
        } finally {
            android.opengl.EGLSurface eGLSurface = this.f507267g;
            if (eGLSurface != null) {
                android.opengl.EGL14.eglDestroySurface(this.f507265e, eGLSurface);
            }
            android.opengl.EGLContext eGLContext = this.f507266f;
            if (eGLContext != null) {
                android.opengl.EGL14.eglDestroyContext(this.f507265e, eGLContext);
            }
            this.f507267g = null;
            this.f507266f = null;
            this.f507265e = null;
            this.f507272o = null;
            this.f507269i = null;
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        int i17 = message.what;
        try {
            if (i17 != 1) {
                if (i17 == 2) {
                    this.f507269i.updateTexImage();
                    return true;
                }
                if (i17 != 3) {
                    return true;
                }
                try {
                    c();
                } catch (java.lang.Throwable unused) {
                }
                quit();
                return true;
            }
            try {
                b(message.arg1 != 0);
                synchronized (this) {
                    notify();
                }
            } catch (java.lang.Error e17) {
                this.f507270m = e17;
                synchronized (this) {
                    notify();
                }
            } catch (java.lang.RuntimeException e18) {
                this.f507271n = e18;
                synchronized (this) {
                    notify();
                }
            }
            return true;
        } catch (java.lang.Throwable th6) {
            synchronized (this) {
                notify();
                throw th6;
            }
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
        this.f507268h.sendEmptyMessage(2);
    }
}
