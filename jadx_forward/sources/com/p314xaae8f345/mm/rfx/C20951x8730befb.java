package com.p314xaae8f345.mm.rfx;

/* renamed from: com.tencent.mm.rfx.RfxPagSurface */
/* loaded from: classes13.dex */
public class C20951x8730befb {

    /* renamed from: nativeSurface */
    long f39099x58813c96;

    /* renamed from: surface */
    private android.view.Surface f39101x9189ecad = null;

    /* renamed from: needsReleaseSurface */
    private boolean f39100xc56796a3 = false;

    /* renamed from: textureID */
    private int f39102xc35d0376 = 0;

    static {
        tq5.k.a("xlabeffect");
        m77519xb90145c7();
    }

    private C20951x8730befb(long j17) {
        this.f39099x58813c96 = j17;
    }

    /* renamed from: FromSurface */
    public static com.p314xaae8f345.mm.rfx.C20951x8730befb m77506xf88c0183(android.view.Surface surface) {
        return m77507xf88c0183(surface, android.opengl.EGL14.EGL_NO_CONTEXT);
    }

    /* renamed from: FromSurfaceTexture */
    public static com.p314xaae8f345.mm.rfx.C20951x8730befb m77508xaa114218(android.graphics.SurfaceTexture surfaceTexture) {
        return m77509xaa114218(surfaceTexture, android.opengl.EGL14.EGL_NO_CONTEXT);
    }

    /* renamed from: FromTexture */
    public static com.p314xaae8f345.mm.rfx.C20951x8730befb m77510x127fe9f1(int i17, int i18, int i19) {
        return m77511x127fe9f1(i17, i18, i19, false);
    }

    /* renamed from: FromTextureForAsyncThread */
    public static com.p314xaae8f345.mm.rfx.C20951x8730befb m77512x7a8b9f6e(int i17, int i18, int i19) {
        return m77513x7a8b9f6e(i17, i18, i19, false);
    }

    /* renamed from: MakeOffscreen */
    public static com.p314xaae8f345.mm.rfx.C20951x8730befb m77514x46c0742d(int i17, int i18) {
        long m77517xc0378cbe = m77517xc0378cbe(i17, i18);
        if (m77517xc0378cbe == 0) {
            return null;
        }
        return new com.p314xaae8f345.mm.rfx.C20951x8730befb(m77517xc0378cbe);
    }

    /* renamed from: SetupFromSurfaceWithGLContext */
    private static native long m77515x4869f59e(android.view.Surface surface, long j17);

    /* renamed from: SetupFromTexture */
    public static native long m77516x60757374(int i17, int i18, int i19, boolean z17, boolean z18);

    /* renamed from: SetupOffscreen */
    private static native long m77517xc0378cbe(int i17, int i18);

    /* renamed from: nativeFinalize */
    private native void m77518xef578955();

    /* renamed from: nativeInit */
    private static native void m77519xb90145c7();

    /* renamed from: nativeRelease */
    private native void m77520x7f877f0();

    /* renamed from: finalize */
    public void m77521xd764dc1e() {
        m77518xef578955();
    }

    /* renamed from: freeCache */
    public native void m77522xe496cc76();

    /* renamed from: height */
    public native int m77523xb7389127();

    /* renamed from: release */
    public void m77524x41012807() {
        android.view.Surface surface;
        if (this.f39100xc56796a3 && (surface = this.f39101x9189ecad) != null) {
            surface.release();
        }
        m77520x7f877f0();
    }

    /* renamed from: updateSize */
    public native void m77525xee5c006a();

    /* renamed from: width */
    public native int m77526x6be2dc6();

    /* renamed from: FromSurface */
    public static com.p314xaae8f345.mm.rfx.C20951x8730befb m77507xf88c0183(android.view.Surface surface, android.opengl.EGLContext eGLContext) {
        if (surface == null) {
            return null;
        }
        long m77515x4869f59e = m77515x4869f59e(surface, (eGLContext == null || eGLContext == android.opengl.EGL14.EGL_NO_CONTEXT) ? 0L : eGLContext.getNativeHandle());
        if (m77515x4869f59e == 0) {
            return null;
        }
        com.p314xaae8f345.mm.rfx.C20951x8730befb c20951x8730befb = new com.p314xaae8f345.mm.rfx.C20951x8730befb(m77515x4869f59e);
        c20951x8730befb.f39101x9189ecad = surface;
        return c20951x8730befb;
    }

    /* renamed from: FromSurfaceTexture */
    public static com.p314xaae8f345.mm.rfx.C20951x8730befb m77509xaa114218(android.graphics.SurfaceTexture surfaceTexture, android.opengl.EGLContext eGLContext) {
        if (surfaceTexture == null) {
            return null;
        }
        com.p314xaae8f345.mm.rfx.C20951x8730befb m77507xf88c0183 = m77507xf88c0183(new android.view.Surface(surfaceTexture), eGLContext);
        if (m77507xf88c0183 != null) {
            m77507xf88c0183.f39100xc56796a3 = true;
        }
        return m77507xf88c0183;
    }

    /* renamed from: FromTexture */
    public static com.p314xaae8f345.mm.rfx.C20951x8730befb m77511x127fe9f1(int i17, int i18, int i19, boolean z17) {
        long m77516x60757374 = m77516x60757374(i17, i18, i19, z17, false);
        if (m77516x60757374 == 0) {
            return null;
        }
        com.p314xaae8f345.mm.rfx.C20951x8730befb c20951x8730befb = new com.p314xaae8f345.mm.rfx.C20951x8730befb(m77516x60757374);
        c20951x8730befb.f39102xc35d0376 = i17;
        return c20951x8730befb;
    }

    /* renamed from: FromTextureForAsyncThread */
    public static com.p314xaae8f345.mm.rfx.C20951x8730befb m77513x7a8b9f6e(int i17, int i18, int i19, boolean z17) {
        long m77516x60757374 = m77516x60757374(i17, i18, i19, z17, true);
        if (m77516x60757374 == 0) {
            return null;
        }
        com.p314xaae8f345.mm.rfx.C20951x8730befb c20951x8730befb = new com.p314xaae8f345.mm.rfx.C20951x8730befb(m77516x60757374);
        c20951x8730befb.f39102xc35d0376 = i17;
        return c20951x8730befb;
    }
}
