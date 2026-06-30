package org.p3363xbe4143f1;

/* renamed from: org.libpag.PAGSurface */
/* loaded from: classes13.dex */
public class C29703xc0897f57 {

    /* renamed from: a, reason: collision with root package name */
    private android.view.Surface f429336a = null;

    /* renamed from: b, reason: collision with root package name */
    private boolean f429337b = false;

    /* renamed from: c, reason: collision with root package name */
    private int f429338c = 0;

    /* renamed from: nativeSurface */
    long f75032x58813c96;

    static {
        b56.a.a("pag");
        m154923xb90145c7();
    }

    private C29703xc0897f57(long j17) {
        this.f75032x58813c96 = j17;
    }

    /* renamed from: FromSurface */
    public static org.p3363xbe4143f1.C29703xc0897f57 m154910xf88c0183(android.view.Surface surface) {
        return m154911xf88c0183(surface, android.opengl.EGL14.EGL_NO_CONTEXT);
    }

    /* renamed from: FromSurfaceTexture */
    public static org.p3363xbe4143f1.C29703xc0897f57 m154912xaa114218(android.graphics.SurfaceTexture surfaceTexture) {
        return m154913xaa114218(surfaceTexture, android.opengl.EGL14.EGL_NO_CONTEXT);
    }

    /* renamed from: FromTexture */
    public static org.p3363xbe4143f1.C29703xc0897f57 m154914x127fe9f1(int i17, int i18, int i19) {
        return m154915x127fe9f1(i17, i18, i19, false);
    }

    /* renamed from: FromTextureForAsyncThread */
    public static org.p3363xbe4143f1.C29703xc0897f57 m154916x7a8b9f6e(int i17, int i18, int i19) {
        return m154917x7a8b9f6e(i17, i18, i19, false);
    }

    /* renamed from: MakeOffscreen */
    public static org.p3363xbe4143f1.C29703xc0897f57 m154918x46c0742d(int i17, int i18) {
        long m154921xc0378cbe = m154921xc0378cbe(i17, i18);
        if (m154921xc0378cbe == 0) {
            return null;
        }
        return new org.p3363xbe4143f1.C29703xc0897f57(m154921xc0378cbe);
    }

    /* renamed from: SetupFromSurfaceWithGLContext */
    private static native long m154919x4869f59e(android.view.Surface surface, long j17);

    /* renamed from: SetupFromTexture */
    public static native long m154920x60757374(int i17, int i18, int i19, boolean z17, boolean z18);

    /* renamed from: SetupOffscreen */
    private static native long m154921xc0378cbe(int i17, int i18);

    /* renamed from: nativeFinalize */
    private native void m154922xef578955();

    /* renamed from: nativeInit */
    private static native void m154923xb90145c7();

    /* renamed from: nativeRelease */
    private native void m154924x7f877f0();

    /* renamed from: clearAll */
    public native boolean m154925x2f1a8c14();

    /* renamed from: copyPixelsTo */
    public native boolean m154926x78aa609d(android.graphics.Bitmap bitmap);

    /* renamed from: finalize */
    public void m154927xd764dc1e() {
        m154922xef578955();
    }

    /* renamed from: freeCache */
    public native void m154928xe496cc76();

    /* renamed from: height */
    public native int m154929xb7389127();

    /* renamed from: makeSnapshot */
    public android.graphics.Bitmap m154930x5fd271d2() {
        android.util.Pair a17 = org.p3363xbe4143f1.a.a(m154933x6be2dc6(), m154929xb7389127(), true);
        if (a17.first == null) {
            return null;
        }
        java.lang.Object obj = a17.second;
        if (obj != null && android.os.Build.VERSION.SDK_INT >= 26) {
            ((android.hardware.HardwareBuffer) obj).close();
        }
        if (m154926x78aa609d((android.graphics.Bitmap) a17.first)) {
            return (android.graphics.Bitmap) a17.first;
        }
        return null;
    }

    /* renamed from: release */
    public void m154931x41012807() {
        android.view.Surface surface;
        m154928xe496cc76();
        if (this.f429337b && (surface = this.f429336a) != null) {
            surface.release();
        }
        m154924x7f877f0();
    }

    /* renamed from: updateSize */
    public native void m154932xee5c006a();

    /* renamed from: width */
    public native int m154933x6be2dc6();

    /* renamed from: FromSurface */
    public static org.p3363xbe4143f1.C29703xc0897f57 m154911xf88c0183(android.view.Surface surface, android.opengl.EGLContext eGLContext) {
        if (surface == null) {
            return null;
        }
        long m154919x4869f59e = m154919x4869f59e(surface, (eGLContext == null || eGLContext == android.opengl.EGL14.EGL_NO_CONTEXT) ? 0L : eGLContext.getNativeHandle());
        if (m154919x4869f59e == 0) {
            return null;
        }
        org.p3363xbe4143f1.C29703xc0897f57 c29703xc0897f57 = new org.p3363xbe4143f1.C29703xc0897f57(m154919x4869f59e);
        c29703xc0897f57.f429336a = surface;
        return c29703xc0897f57;
    }

    /* renamed from: FromSurfaceTexture */
    public static org.p3363xbe4143f1.C29703xc0897f57 m154913xaa114218(android.graphics.SurfaceTexture surfaceTexture, android.opengl.EGLContext eGLContext) {
        if (surfaceTexture == null) {
            return null;
        }
        org.p3363xbe4143f1.C29703xc0897f57 m154911xf88c0183 = m154911xf88c0183(new android.view.Surface(surfaceTexture), eGLContext);
        if (m154911xf88c0183 != null) {
            m154911xf88c0183.f429337b = true;
        }
        return m154911xf88c0183;
    }

    /* renamed from: FromTexture */
    public static org.p3363xbe4143f1.C29703xc0897f57 m154915x127fe9f1(int i17, int i18, int i19, boolean z17) {
        long m154920x60757374 = m154920x60757374(i17, i18, i19, z17, false);
        if (m154920x60757374 == 0) {
            return null;
        }
        org.p3363xbe4143f1.C29703xc0897f57 c29703xc0897f57 = new org.p3363xbe4143f1.C29703xc0897f57(m154920x60757374);
        c29703xc0897f57.f429338c = i17;
        return c29703xc0897f57;
    }

    /* renamed from: FromTextureForAsyncThread */
    public static org.p3363xbe4143f1.C29703xc0897f57 m154917x7a8b9f6e(int i17, int i18, int i19, boolean z17) {
        long m154920x60757374 = m154920x60757374(i17, i18, i19, z17, true);
        if (m154920x60757374 == 0) {
            return null;
        }
        org.p3363xbe4143f1.C29703xc0897f57 c29703xc0897f57 = new org.p3363xbe4143f1.C29703xc0897f57(m154920x60757374);
        c29703xc0897f57.f429338c = i17;
        return c29703xc0897f57;
    }
}
