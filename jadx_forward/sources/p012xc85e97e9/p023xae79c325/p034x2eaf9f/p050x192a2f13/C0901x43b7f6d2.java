package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13;

/* renamed from: androidx.camera.core.processing.OpenGlRenderer */
/* loaded from: classes14.dex */
public class C0901x43b7f6d2 {
    private static final java.lang.String TAG = "OpenGlRenderer";

    /* renamed from: _hellAccFlag_ */
    private byte f2162x7f11beae;

    /* renamed from: mCurrentSurface */
    protected android.view.Surface f2165x397966c1;

    /* renamed from: mEglConfig */
    protected android.opengl.EGLConfig f2166x8f1591ff;

    /* renamed from: mGlThread */
    protected java.lang.Thread f2170xd6fdaedc;

    /* renamed from: mInitialized */
    protected final java.util.concurrent.atomic.AtomicBoolean f2171xf39ab827 = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: mOutputSurfaceMap */
    protected final java.util.Map<android.view.Surface, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0952x4073a84c> f2172xab8297dd = new java.util.HashMap();

    /* renamed from: mEglDisplay */
    protected android.opengl.EGLDisplay f2168x7e90e1a5 = android.opengl.EGL14.EGL_NO_DISPLAY;

    /* renamed from: mEglContext */
    protected android.opengl.EGLContext f2167x53a2fe92 = android.opengl.EGL14.EGL_NO_CONTEXT;

    /* renamed from: mSurfaceAttrib */
    protected int[] f2174x55911a6a = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.f2273x643cedb7;

    /* renamed from: mTempSurface */
    protected android.opengl.EGLSurface f2175xb111b8c = android.opengl.EGL14.EGL_NO_SURFACE;

    /* renamed from: mProgramHandles */
    protected java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.InputFormat, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.Program2D> f2173xa253df4 = java.util.Collections.emptyMap();

    /* renamed from: mCurrentProgram */
    protected p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.Program2D f2164x957e9898 = null;

    /* renamed from: mCurrentInputformat */
    protected p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.InputFormat f2163xdea52055 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.InputFormat.UNKNOWN;

    /* renamed from: mExternalTextureId */
    private int f2169x39535b1e = -1;

    /* renamed from: activateExternalTexture */
    private void m6298x36203d5d(int i17) {
        android.opengl.GLES20.glActiveTexture(33984);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.m6460x14d94048("glActiveTexture");
        android.opengl.GLES20.glBindTexture(36197, i17);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.m6460x14d94048("glBindTexture");
    }

    /* renamed from: createEglContext */
    private void m6299xe4407861(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e c0491x2bb48c5e, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0950xf622290c.Builder builder) {
        android.opengl.EGLDisplay eglGetDisplay = android.opengl.EGL14.eglGetDisplay(0);
        this.f2168x7e90e1a5 = eglGetDisplay;
        if (java.util.Objects.equals(eglGetDisplay, android.opengl.EGL14.EGL_NO_DISPLAY)) {
            throw new java.lang.IllegalStateException("Unable to get EGL14 display");
        }
        int[] iArr = new int[2];
        if (!android.opengl.EGL14.eglInitialize(this.f2168x7e90e1a5, iArr, 0, iArr, 1)) {
            this.f2168x7e90e1a5 = android.opengl.EGL14.EGL_NO_DISPLAY;
            throw new java.lang.IllegalStateException("Unable to initialize EGL14");
        }
        if (builder != null) {
            builder.mo6433x7013f370(iArr[0] + "." + iArr[1]);
        }
        int i17 = c0491x2bb48c5e.m4388x10bf48d2() ? 10 : 8;
        int[] iArr2 = {12324, i17, 12323, i17, 12322, i17, 12321, c0491x2bb48c5e.m4388x10bf48d2() ? 2 : 8, 12325, 0, 12326, 0, 12352, c0491x2bb48c5e.m4388x10bf48d2() ? 64 : 4, org.p3371xd0ce3e8d.InterfaceC29759xf7e285db.f75309x5a4fb9b0, c0491x2bb48c5e.m4388x10bf48d2() ? -1 : 1, 12339, 5, 12344};
        android.opengl.EGLConfig[] eGLConfigArr = new android.opengl.EGLConfig[1];
        if (!android.opengl.EGL14.eglChooseConfig(this.f2168x7e90e1a5, iArr2, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            throw new java.lang.IllegalStateException("Unable to find a suitable EGLConfig");
        }
        android.opengl.EGLConfig eGLConfig = eGLConfigArr[0];
        int[] iArr3 = new int[3];
        iArr3[0] = 12440;
        iArr3[1] = c0491x2bb48c5e.m4388x10bf48d2() ? 3 : 2;
        iArr3[2] = 12344;
        android.opengl.EGLContext eglCreateContext = android.opengl.EGL14.eglCreateContext(this.f2168x7e90e1a5, eGLConfig, android.opengl.EGL14.EGL_NO_CONTEXT, iArr3, 0);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.m6459xaf700a9d("eglCreateContext");
        this.f2166x8f1591ff = eGLConfig;
        this.f2167x53a2fe92 = eglCreateContext;
        android.opengl.EGL14.eglQueryContext(this.f2168x7e90e1a5, eglCreateContext, 12440, new int[1], 0);
    }

    /* renamed from: createTempSurface */
    private void m6300x8e22db9d() {
        android.opengl.EGLDisplay eGLDisplay = this.f2168x7e90e1a5;
        android.opengl.EGLConfig eGLConfig = this.f2166x8f1591ff;
        java.util.Objects.requireNonNull(eGLConfig);
        this.f2175xb111b8c = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.m6467xe6bc11d9(eGLDisplay, eGLConfig, 1, 1);
    }

    /* renamed from: getExtensionsBeforeInitialized */
    private m3.d m6301x5d4d2aeb(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e c0491x2bb48c5e) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.m6462xb935a877(this.f2171xf39ab827, false);
        try {
            m6299xe4407861(c0491x2bb48c5e, null);
            m6300x8e22db9d();
            m6309x900967ab(this.f2175xb111b8c);
            java.lang.String glGetString = android.opengl.GLES20.glGetString(7939);
            java.lang.String eglQueryString = android.opengl.EGL14.eglQueryString(this.f2168x7e90e1a5, 12373);
            if (glGetString == null) {
                glGetString = "";
            }
            if (eglQueryString == null) {
                eglQueryString = "";
            }
            return new m3.d(glGetString, eglQueryString);
        } catch (java.lang.IllegalStateException e17) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.w(TAG, "Failed to get GL or EGL extensions: " + e17.getMessage(), e17);
            return new m3.d("", "");
        } finally {
            m6302x95125be4();
        }
    }

    /* renamed from: releaseInternal */
    private void m6302x95125be4() {
        java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.Program2D> it = this.f2173xa253df4.values().iterator();
        while (it.hasNext()) {
            it.next().m6486xb06685ab();
        }
        this.f2173xa253df4 = java.util.Collections.emptyMap();
        this.f2164x957e9898 = null;
        if (!java.util.Objects.equals(this.f2168x7e90e1a5, android.opengl.EGL14.EGL_NO_DISPLAY)) {
            android.opengl.EGLDisplay eGLDisplay = this.f2168x7e90e1a5;
            android.opengl.EGLSurface eGLSurface = android.opengl.EGL14.EGL_NO_SURFACE;
            android.opengl.EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, android.opengl.EGL14.EGL_NO_CONTEXT);
            for (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0952x4073a84c abstractC0952x4073a84c : this.f2172xab8297dd.values()) {
                if (!java.util.Objects.equals(abstractC0952x4073a84c.mo6448xbe847539(), android.opengl.EGL14.EGL_NO_SURFACE) && !android.opengl.EGL14.eglDestroySurface(this.f2168x7e90e1a5, abstractC0952x4073a84c.mo6448xbe847539())) {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.m6458xf94188bb("eglDestroySurface");
                }
            }
            this.f2172xab8297dd.clear();
            if (!java.util.Objects.equals(this.f2175xb111b8c, android.opengl.EGL14.EGL_NO_SURFACE)) {
                android.opengl.EGL14.eglDestroySurface(this.f2168x7e90e1a5, this.f2175xb111b8c);
                this.f2175xb111b8c = android.opengl.EGL14.EGL_NO_SURFACE;
            }
            if (!java.util.Objects.equals(this.f2167x53a2fe92, android.opengl.EGL14.EGL_NO_CONTEXT)) {
                android.opengl.EGL14.eglDestroyContext(this.f2168x7e90e1a5, this.f2167x53a2fe92);
                this.f2167x53a2fe92 = android.opengl.EGL14.EGL_NO_CONTEXT;
            }
            android.opengl.EGL14.eglReleaseThread();
            android.opengl.EGL14.eglTerminate(this.f2168x7e90e1a5);
            this.f2168x7e90e1a5 = android.opengl.EGL14.EGL_NO_DISPLAY;
        }
        this.f2166x8f1591ff = null;
        this.f2169x39535b1e = -1;
        this.f2163xdea52055 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.InputFormat.UNKNOWN;
        this.f2165x397966c1 = null;
        this.f2170xd6fdaedc = null;
    }

    /* renamed from: createOutputSurfaceInternal */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0952x4073a84c m6304x8278dbad(android.view.Surface surface) {
        try {
            android.opengl.EGLDisplay eGLDisplay = this.f2168x7e90e1a5;
            android.opengl.EGLConfig eGLConfig = this.f2166x8f1591ff;
            java.util.Objects.requireNonNull(eGLConfig);
            android.opengl.EGLSurface m6470x56846301 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.m6470x56846301(eGLDisplay, eGLConfig, surface, this.f2174x55911a6a);
            android.util.Size m6477x86376918 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.m6477x86376918(this.f2168x7e90e1a5, m6470x56846301);
            return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0952x4073a84c.of(m6470x56846301, m6477x86376918.getWidth(), m6477x86376918.getHeight());
        } catch (java.lang.IllegalArgumentException | java.lang.IllegalStateException e17) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.w(TAG, "Failed to create EGL surface: " + e17.getMessage(), e17);
            return null;
        }
    }

    /* renamed from: getOutSurfaceOrThrow */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0952x4073a84c m6305x157e7f8e(android.view.Surface surface) {
        m3.h.e(this.f2172xab8297dd.containsKey(surface), "The surface is not registered.");
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0952x4073a84c abstractC0952x4073a84c = this.f2172xab8297dd.get(surface);
        java.util.Objects.requireNonNull(abstractC0952x4073a84c);
        return abstractC0952x4073a84c;
    }

    /* renamed from: getTextureName */
    public int m6306x3a030510() {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.m6462xb935a877(this.f2171xf39ab827, true);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.m6461x4bb38a4c(this.f2170xd6fdaedc);
        return this.f2169x39535b1e;
    }

    /* renamed from: init */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0950xf622290c m6307x316510(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e c0491x2bb48c5e) {
        return mo6308x316510(c0491x2bb48c5e, java.util.Collections.emptyMap());
    }

    /* renamed from: makeCurrent */
    public void m6309x900967ab(android.opengl.EGLSurface eGLSurface) {
        this.f2168x7e90e1a5.getClass();
        this.f2167x53a2fe92.getClass();
        if (!android.opengl.EGL14.eglMakeCurrent(this.f2168x7e90e1a5, eGLSurface, eGLSurface, this.f2167x53a2fe92)) {
            throw new java.lang.IllegalStateException("eglMakeCurrent failed");
        }
    }

    /* renamed from: registerOutputSurface */
    public void m6310x19899a89(android.view.Surface surface) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.m6462xb935a877(this.f2171xf39ab827, true);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.m6461x4bb38a4c(this.f2170xd6fdaedc);
        if (this.f2172xab8297dd.containsKey(surface)) {
            return;
        }
        this.f2172xab8297dd.put(surface, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.f2276x86a2258d);
    }

    /* renamed from: release */
    public void mo6311x41012807() {
        if (this.f2171xf39ab827.getAndSet(false)) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.m6461x4bb38a4c(this.f2170xd6fdaedc);
            m6302x95125be4();
        }
    }

    /* renamed from: removeOutputSurfaceInternal */
    public void m6312x442b0925(android.view.Surface surface, boolean z17) {
        if (this.f2165x397966c1 == surface) {
            this.f2165x397966c1 = null;
            m6309x900967ab(this.f2175xb111b8c);
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0952x4073a84c remove = z17 ? this.f2172xab8297dd.remove(surface) : this.f2172xab8297dd.put(surface, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.f2276x86a2258d);
        if (remove == null || remove == p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.f2276x86a2258d) {
            return;
        }
        try {
            android.opengl.EGL14.eglDestroySurface(this.f2168x7e90e1a5, remove.mo6448xbe847539());
        } catch (java.lang.RuntimeException e17) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.w(TAG, "Failed to destroy EGL surface: " + e17.getMessage(), e17);
        }
    }

    /* renamed from: render */
    public void m6313xc84b4196(long j17, float[] fArr, android.view.Surface surface) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.m6462xb935a877(this.f2171xf39ab827, true);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.m6461x4bb38a4c(this.f2170xd6fdaedc);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0952x4073a84c m6305x157e7f8e = m6305x157e7f8e(surface);
        if (m6305x157e7f8e == p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.f2276x86a2258d) {
            m6305x157e7f8e = m6304x8278dbad(surface);
            if (m6305x157e7f8e == null) {
                return;
            } else {
                this.f2172xab8297dd.put(surface, m6305x157e7f8e);
            }
        }
        if (surface != this.f2165x397966c1) {
            m6309x900967ab(m6305x157e7f8e.mo6448xbe847539());
            this.f2165x397966c1 = surface;
            android.opengl.GLES20.glViewport(0, 0, m6305x157e7f8e.mo6450x755bd410(), m6305x157e7f8e.mo6449x1c4fb41d());
            android.opengl.GLES20.glScissor(0, 0, m6305x157e7f8e.mo6450x755bd410(), m6305x157e7f8e.mo6449x1c4fb41d());
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.Program2D program2D = this.f2164x957e9898;
        program2D.getClass();
        if (program2D instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.SamplerShaderProgram) {
            ((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.SamplerShaderProgram) program2D).m6491x3221e73(fArr);
        }
        android.opengl.GLES20.glDrawArrays(5, 0, 4);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.m6460x14d94048("glDrawArrays");
        android.opengl.EGLExt.eglPresentationTimeANDROID(this.f2168x7e90e1a5, m6305x157e7f8e.mo6448xbe847539(), j17);
        if (android.opengl.EGL14.eglSwapBuffers(this.f2168x7e90e1a5, m6305x157e7f8e.mo6448xbe847539())) {
            return;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.w(TAG, "Failed to swap buffers with EGL error: 0x" + java.lang.Integer.toHexString(android.opengl.EGL14.eglGetError()));
        m6312x442b0925(surface, false);
    }

    /* renamed from: setInputFormat */
    public void m6314x4789769f(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.InputFormat inputFormat) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.m6462xb935a877(this.f2171xf39ab827, true);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.m6461x4bb38a4c(this.f2170xd6fdaedc);
        if (this.f2163xdea52055 != inputFormat) {
            this.f2163xdea52055 = inputFormat;
            m6317x52f41ce7(this.f2169x39535b1e);
        }
    }

    /* renamed from: snapshot */
    public android.graphics.Bitmap m6315x10fad5c4(android.util.Size size, float[] fArr) {
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(size.getWidth() * size.getHeight() * 4);
        m6303x10fad5c4(allocateDirect, size, fArr);
        int width = size.getWidth();
        int height = size.getHeight();
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(height));
        arrayList.add(java.lang.Integer.valueOf(width));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "androidx/camera/core/processing/OpenGlRenderer", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.j0.f159978f, "(Landroid/util/Size;[F)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "androidx/camera/core/processing/OpenGlRenderer", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.j0.f159978f, "(Landroid/util/Size;[F)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        allocateDirect.rewind();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0532xed4713d0.m4623x4adb367(createBitmap, allocateDirect, size.getWidth() * 4);
        return createBitmap;
    }

    /* renamed from: unregisterOutputSurface */
    public void m6316xcfaad590(android.view.Surface surface) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.m6462xb935a877(this.f2171xf39ab827, true);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.m6461x4bb38a4c(this.f2170xd6fdaedc);
        m6312x442b0925(surface, true);
    }

    /* renamed from: useAndConfigureProgramWithTexture */
    public void m6317x52f41ce7(int i17) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.Program2D program2D = this.f2173xa253df4.get(this.f2163xdea52055);
        if (program2D == null) {
            throw new java.lang.IllegalStateException("Unable to configure program for input format: " + this.f2163xdea52055);
        }
        if (this.f2164x957e9898 != program2D) {
            this.f2164x957e9898 = program2D;
            program2D.use();
            java.util.Objects.toString(this.f2163xdea52055);
            java.util.Objects.toString(this.f2164x957e9898);
        }
        m6298x36203d5d(i17);
    }

    /* renamed from: init */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0950xf622290c mo6308x316510(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e c0491x2bb48c5e, java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.InputFormat, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.InterfaceC0904x6439f916> map) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.m6462xb935a877(this.f2171xf39ab827, false);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0950xf622290c.Builder m6492xdc3ef9b = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0950xf622290c.m6492xdc3ef9b();
        try {
            if (c0491x2bb48c5e.m4388x10bf48d2()) {
                m3.d m6301x5d4d2aeb = m6301x5d4d2aeb(c0491x2bb48c5e);
                java.lang.String str = (java.lang.String) m6301x5d4d2aeb.f404625a;
                str.getClass();
                java.lang.String str2 = (java.lang.String) m6301x5d4d2aeb.f404626b;
                str2.getClass();
                if (!str.contains("GL_EXT_YUV_target")) {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.w(TAG, "Device does not support GL_EXT_YUV_target. Fallback to SDR.");
                    c0491x2bb48c5e = p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e.SDR;
                }
                this.f2174x55911a6a = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.m6464xd041a900(str2, c0491x2bb48c5e);
                m6492xdc3ef9b.mo6434x8b28c85b(str);
                m6492xdc3ef9b.mo6432x5dd4ee7c(str2);
            }
            m6299xe4407861(c0491x2bb48c5e, m6492xdc3ef9b);
            m6300x8e22db9d();
            m6309x900967ab(this.f2175xb111b8c);
            m6492xdc3ef9b.mo6435x4e767df1(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.m6476xaa89b326());
            this.f2173xa253df4 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.m6468xfb51fb8b(c0491x2bb48c5e, map);
            int m6469x3164f87f = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.m6469x3164f87f();
            this.f2169x39535b1e = m6469x3164f87f;
            m6317x52f41ce7(m6469x3164f87f);
            this.f2170xd6fdaedc = java.lang.Thread.currentThread();
            this.f2171xf39ab827.set(true);
            return m6492xdc3ef9b.mo6431x59bc66e();
        } catch (java.lang.IllegalArgumentException | java.lang.IllegalStateException e17) {
            m6302x95125be4();
            throw e17;
        }
    }

    /* renamed from: snapshot */
    private void m6303x10fad5c4(java.nio.ByteBuffer byteBuffer, android.util.Size size, float[] fArr) {
        m3.h.b(byteBuffer.capacity() == (size.getWidth() * size.getHeight()) * 4, "ByteBuffer capacity is not equal to width * height * 4.");
        m3.h.b(byteBuffer.isDirect(), "ByteBuffer is not direct.");
        int m6474xe06639e6 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.m6474xe06639e6();
        android.opengl.GLES20.glActiveTexture(33985);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.m6460x14d94048("glActiveTexture");
        android.opengl.GLES20.glBindTexture(3553, m6474xe06639e6);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.m6460x14d94048("glBindTexture");
        android.opengl.GLES20.glTexImage2D(3553, 0, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5293x7d837a53, size.getWidth(), size.getHeight(), 0, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5293x7d837a53, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLType.f5295x7a6b238, null);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.m6460x14d94048("glTexImage2D");
        android.opengl.GLES20.glTexParameteri(3553, com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.f6064x20a7e2cb, 9729);
        android.opengl.GLES20.glTexParameteri(3553, 10241, 9729);
        int m6473x34da0d7e = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.m6473x34da0d7e();
        android.opengl.GLES20.glBindFramebuffer(36160, m6473x34da0d7e);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.m6460x14d94048("glBindFramebuffer");
        android.opengl.GLES20.glFramebufferTexture2D(36160, 36064, 3553, m6474xe06639e6, 0);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.m6460x14d94048("glFramebufferTexture2D");
        android.opengl.GLES20.glActiveTexture(33984);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.m6460x14d94048("glActiveTexture");
        android.opengl.GLES20.glBindTexture(36197, this.f2169x39535b1e);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.m6460x14d94048("glBindTexture");
        this.f2165x397966c1 = null;
        android.opengl.GLES20.glViewport(0, 0, size.getWidth(), size.getHeight());
        android.opengl.GLES20.glScissor(0, 0, size.getWidth(), size.getHeight());
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.Program2D program2D = this.f2164x957e9898;
        program2D.getClass();
        if (program2D instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.SamplerShaderProgram) {
            ((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.SamplerShaderProgram) program2D).m6491x3221e73(fArr);
        }
        android.opengl.GLES20.glDrawArrays(5, 0, 4);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.m6460x14d94048("glDrawArrays");
        android.opengl.GLES20.glReadPixels(0, 0, size.getWidth(), size.getHeight(), com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5294x32ebd04e, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLType.f5295x7a6b238, byteBuffer);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.m6460x14d94048("glReadPixels");
        android.opengl.GLES20.glBindFramebuffer(36160, 0);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.m6472x9f4940f0(m6474xe06639e6);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.m6471xea9e2988(m6473x34da0d7e);
        m6298x36203d5d(this.f2169x39535b1e);
    }
}
