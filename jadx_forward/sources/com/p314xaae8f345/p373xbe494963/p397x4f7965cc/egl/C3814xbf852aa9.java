package com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl;

@com.p314xaae8f345.p373xbe494963.p378x2e06d1.p379xc6ad7b24.InterfaceC3751x20efb56(m29314x6ac9171 = "liteav::video")
/* renamed from: com.tencent.liteav.videobase.egl.EGLCore */
/* loaded from: classes14.dex */
public class C3814xbf852aa9 {

    /* renamed from: DESTROY_EGL_CORE_DELAY_TIME_MS */
    private static final long f14911xcecced56 = 100;

    /* renamed from: MAX_EGL_CORE_COUNT */
    private static final int f14912xecc3981f = 50;
    private static final java.lang.String TAG = "EGLCore";

    /* renamed from: mEglHelper */
    private com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.e<?> f14915x97101e6b;

    /* renamed from: mIsOffScreen */
    private boolean f14916x44b49e04 = false;

    /* renamed from: mSharedContext */
    private java.lang.Object f14917x82565e1d;

    /* renamed from: sSequenceTaskRunner */
    private static final com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.l f14914x943b0589 = new com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.l();

    /* renamed from: sEGLCoreCount */
    private static final java.util.concurrent.atomic.AtomicInteger f14913x204863d9 = new java.util.concurrent.atomic.AtomicInteger();

    /* renamed from: create */
    public static com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.C3814xbf852aa9 m31003xaf65a0fc(java.lang.Object obj) {
        com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.C3814xbf852aa9 c3814xbf852aa9 = new com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.C3814xbf852aa9();
        try {
            c3814xbf852aa9.m31012x33ebcb90(obj, null, 128, 128);
            c3814xbf852aa9.m31013x900967ab();
            return c3814xbf852aa9;
        } catch (com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.d e17) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(TAG, "create EGLCore failed.", e17);
            return null;
        }
    }

    /* renamed from: destroy */
    public static void m31004x5cd39ffa(com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.C3814xbf852aa9 c3814xbf852aa9) {
        if (c3814xbf852aa9 == null) {
            return;
        }
        if (c3814xbf852aa9.f14916x44b49e04) {
            m31005xaffd5ea2(c3814xbf852aa9);
        } else {
            m31006x89d6a1b5(c3814xbf852aa9);
        }
    }

    /* renamed from: destroyAsync */
    public static void m31005xaffd5ea2(com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.C3814xbf852aa9 c3814xbf852aa9) {
        if (c3814xbf852aa9 == null) {
            return;
        }
        c3814xbf852aa9.m31016xe0406f72();
        f14914x943b0589.a(com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.c.a(c3814xbf852aa9), 100L);
    }

    /* renamed from: destroySync */
    public static void m31006x89d6a1b5(com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.C3814xbf852aa9 c3814xbf852aa9) {
        if (c3814xbf852aa9 == null) {
            return;
        }
        try {
            c3814xbf852aa9.m31016xe0406f72();
            c3814xbf852aa9.m31008xb2612ee9();
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(TAG, "EGLCore destroy sync success. ".concat(java.lang.String.valueOf(c3814xbf852aa9)));
        } catch (com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.d e17) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(TAG, "EGLCore destroy sync failed.", e17);
        }
    }

    /* renamed from: lambda$destroyAsync$0 */
    public static /* synthetic */ void m31007x29d8f92b(com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.C3814xbf852aa9 c3814xbf852aa9) {
        try {
            c3814xbf852aa9.m31016xe0406f72();
            c3814xbf852aa9.m31008xb2612ee9();
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(TAG, "EGLCore destroy async success. ".concat(java.lang.String.valueOf(c3814xbf852aa9)));
        } catch (com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.d e17) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(TAG, "EGLCore destroy async failed.", e17);
        }
    }

    /* renamed from: uninitialize */
    private void m31008xb2612ee9() {
        com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.e<?> eVar = this.f14915x97101e6b;
        if (eVar != null) {
            eVar.c();
            this.f14915x97101e6b = null;
        }
        this.f14917x82565e1d = null;
        f14913x204863d9.decrementAndGet();
    }

    /* renamed from: getEglContext */
    public java.lang.Object m31009x65b1be3b() {
        com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.e<?> eVar = this.f14915x97101e6b;
        if (eVar == null) {
            return null;
        }
        return eVar.f();
    }

    /* renamed from: getSharedContext */
    public java.lang.Object m31010xe4a811d4() {
        return this.f14917x82565e1d;
    }

    /* renamed from: getSurfaceSize */
    public com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421 m31011x86376918() {
        com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.e<?> eVar = this.f14915x97101e6b;
        return eVar == null ? new com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421(0, 0) : eVar.e();
    }

    /* renamed from: initialize */
    public void m31012x33ebcb90(java.lang.Object obj, android.view.Surface surface, int i17, int i18) {
        this.f14916x44b49e04 = surface == null;
        if (obj == null) {
            if (com.p314xaae8f345.p373xbe494963.p378x2e06d1.p386xcb1c722f.C3773x6d55e560.m29463x2c3e92a0() >= 17) {
                this.f14915x97101e6b = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.b.a((android.opengl.EGLContext) null, surface, i17, i18);
            } else {
                this.f14915x97101e6b = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.a.a((javax.microedition.khronos.egl.EGLContext) null, surface, i17, i18);
            }
        } else if (obj instanceof javax.microedition.khronos.egl.EGLContext) {
            this.f14915x97101e6b = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.a.a((javax.microedition.khronos.egl.EGLContext) obj, surface, i17, i18);
        } else {
            if (com.p314xaae8f345.p373xbe494963.p378x2e06d1.p386xcb1c722f.C3773x6d55e560.m29463x2c3e92a0() < 17 || !(obj instanceof android.opengl.EGLContext)) {
                throw new com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.d(0, "sharedContext isn't EGLContext");
            }
            this.f14915x97101e6b = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.b.a((android.opengl.EGLContext) obj, surface, i17, i18);
        }
        this.f14917x82565e1d = obj;
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(TAG, "EGLCore created in thread " + java.lang.Thread.currentThread().getId() + ", sharedContext: " + obj + ", Surface: " + surface + ", width: " + i17 + ", height: " + i18 + ", eglCoreCount: " + f14913x204863d9.incrementAndGet());
    }

    /* renamed from: makeCurrent */
    public void m31013x900967ab() {
        com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.e<?> eVar = this.f14915x97101e6b;
        if (eVar != null) {
            eVar.b();
        }
    }

    /* renamed from: setPresentationTime */
    public void m31014xab5ea589(long j17) {
        com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.e<?> eVar = this.f14915x97101e6b;
        if (eVar == null || !(eVar instanceof com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.b)) {
            return;
        }
        com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.b bVar = (com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.b) eVar;
        android.opengl.EGLExt.eglPresentationTimeANDROID(bVar.f128280a, bVar.f128281b, j17);
    }

    /* renamed from: swapBuffers */
    public void m31015x82211f20() {
        com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.e<?> eVar = this.f14915x97101e6b;
        if (eVar != null) {
            eVar.a();
        }
    }

    /* renamed from: unmakeCurrent */
    public void m31016xe0406f72() {
        com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.e<?> eVar = this.f14915x97101e6b;
        if (eVar != null) {
            eVar.d();
        }
    }
}
