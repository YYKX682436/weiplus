package org.p3363xbe4143f1;

/* renamed from: org.libpag.VideoSurface */
/* loaded from: classes13.dex */
class C29714x928fd3d2 implements android.graphics.SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: nativeContext */
    long f75070xffae8598 = 0;

    static {
        b56.a.a("pag");
        m155005xb90145c7();
    }

    private C29714x928fd3d2(int i17, int i18) {
        m155007x67b070a6(i17, i18);
    }

    public static org.p3363xbe4143f1.C29714x928fd3d2 a(int i17, int i18) {
        org.p3363xbe4143f1.C29714x928fd3d2 c29714x928fd3d2 = new org.p3363xbe4143f1.C29714x928fd3d2(i17, i18);
        if (c29714x928fd3d2.f75070xffae8598 == 0) {
            return null;
        }
        return c29714x928fd3d2;
    }

    /* renamed from: nativeFinalize */
    private native void m155004xef578955();

    /* renamed from: nativeInit */
    private static native void m155005xb90145c7();

    /* renamed from: nativeRelease */
    private native void m155006x7f877f0();

    /* renamed from: nativeSetup */
    private native void m155007x67b070a6(int i17, int i18);

    /* renamed from: notifyFrameAvailable */
    private native void m155008x2a5fbb85();

    /* renamed from: finalize */
    public void m155009xd764dc1e() {
        m155004xef578955();
    }

    /* renamed from: getInputSurface */
    public native android.view.Surface m155010x2d4747f9();

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
        m155008x2a5fbb85();
    }

    public void a() {
        m155006x7f877f0();
    }
}
