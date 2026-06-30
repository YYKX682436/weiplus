package com.p314xaae8f345.p373xbe494963.p408xb069390d.p409x20efc746;

@com.p314xaae8f345.p373xbe494963.p378x2e06d1.p379xc6ad7b24.InterfaceC3751x20efb56(m29314x6ac9171 = "liteav::video")
/* renamed from: com.tencent.liteav.videoproducer.capture.CustomFrameToPixelFrameConverter */
/* loaded from: classes14.dex */
public class C3841xc9c58d62 {
    private static final java.lang.String TAG = "CustomFrameToPixelFrameConverter";

    /* renamed from: mSharedContext */
    private final java.lang.Object f15041x82565e1d;

    /* renamed from: mThrottlers */
    private final com.p314xaae8f345.p373xbe494963.p378x2e06d1.b.b f15042xc7e76f38 = new com.p314xaae8f345.p373xbe494963.p378x2e06d1.b.b();

    /* renamed from: mEGLCore */
    private com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.C3814xbf852aa9 f15037xfa65459c = null;

    /* renamed from: mPixelFrameRenderer */
    private com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.h f15040x68813b7 = null;

    /* renamed from: mGLTexturePool */
    private com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.e f15038x5e1a4265 = null;

    /* renamed from: mWidth */
    private int f15043xbefb7959 = 0;

    /* renamed from: mHeight */
    private int f15039x6a4b7f4 = 0;

    public C3841xc9c58d62(java.lang.Object obj) {
        this.f15041x82565e1d = obj;
    }

    /* renamed from: initializeGLComponents */
    private void m31389x6d97416b(int i17, int i18, com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.C3817x73c266a7 c3817x73c266a7) {
        if (this.f15037xfa65459c != null) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.w(this.f15042xc7e76f38.a("initGL"), TAG, "egl is initialized!", new java.lang.Object[0]);
            return;
        }
        java.lang.Object m31071x19bf3a74 = c3817x73c266a7.m31071x19bf3a74() != null ? c3817x73c266a7.m31071x19bf3a74() : this.f15041x82565e1d;
        try {
            com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.C3814xbf852aa9 c3814xbf852aa9 = new com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.C3814xbf852aa9();
            this.f15037xfa65459c = c3814xbf852aa9;
            c3814xbf852aa9.m31012x33ebcb90(m31071x19bf3a74, null, i17, i18);
            this.f15037xfa65459c.m31013x900967ab();
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(this.f15042xc7e76f38.a("initSuccess"), TAG, "initialize egl, width: " + i17 + ", height: " + i18 + ", sharedContext: " + m31071x19bf3a74, new java.lang.Object[0]);
        } catch (com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.d e17) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(this.f15042xc7e76f38.a("initError"), TAG, "initialize egl failed.", e17);
            this.f15037xfa65459c = null;
        }
        if (this.f15037xfa65459c != null) {
            this.f15038x5e1a4265 = new com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.e();
            if (this.f15040x68813b7 == null) {
                this.f15040x68813b7 = new com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.h(i17, i18);
            }
        }
    }

    /* renamed from: isNeedRecreateEGL */
    private boolean m31390x3888ab9b(com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.C3817x73c266a7 c3817x73c266a7, com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.C3814xbf852aa9 c3814xbf852aa9) {
        return (c3817x73c266a7.m31073x1c4fb41d() == this.f15039x6a4b7f4 && c3817x73c266a7.m31082x755bd410() == this.f15043xbefb7959 && !(c3817x73c266a7.m31071x19bf3a74() != null && !com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3774xbd6c7cad.m29498xb2c87fbf(c3817x73c266a7.m31071x19bf3a74(), c3814xbf852aa9.m31010xe4a811d4()))) ? false : true;
    }

    /* renamed from: uninitializedGLComponents */
    private void m31391x3dd4ebf6() {
        com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.C3814xbf852aa9 c3814xbf852aa9 = this.f15037xfa65459c;
        if (c3814xbf852aa9 == null) {
            return;
        }
        try {
            c3814xbf852aa9.m31013x900967ab();
        } catch (com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.d e17) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(this.f15042xc7e76f38.a("make"), TAG, "uninitialize egl, make current error ", e17);
        }
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(this.f15042xc7e76f38.a("uninitGL"), TAG, "uninitialize egl", new java.lang.Object[0]);
        com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.h hVar = this.f15040x68813b7;
        if (hVar != null) {
            hVar.a();
            this.f15040x68813b7 = null;
        }
        com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.e eVar = this.f15038x5e1a4265;
        if (eVar != null) {
            eVar.a();
            this.f15038x5e1a4265.b();
            this.f15038x5e1a4265 = null;
        }
        com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.C3814xbf852aa9.m31004x5cd39ffa(this.f15037xfa65459c);
        this.f15037xfa65459c = null;
    }

    /* renamed from: convertFrame */
    public com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.C3817x73c266a7 m31392x2c55337a(com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.C3817x73c266a7 c3817x73c266a7) {
        if (c3817x73c266a7 == null) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.w(TAG, "convertFrame: pixelFrame is null.");
            return null;
        }
        com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.C3814xbf852aa9 c3814xbf852aa9 = this.f15037xfa65459c;
        if (c3814xbf852aa9 == null || m31390x3888ab9b(c3817x73c266a7, c3814xbf852aa9)) {
            this.f15043xbefb7959 = c3817x73c266a7.m31082x755bd410();
            this.f15039x6a4b7f4 = c3817x73c266a7.m31073x1c4fb41d();
            m31391x3dd4ebf6();
            m31389x6d97416b(this.f15043xbefb7959, this.f15039x6a4b7f4, c3817x73c266a7);
        }
        com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.C3814xbf852aa9 c3814xbf852aa92 = this.f15037xfa65459c;
        if (c3814xbf852aa92 == null || this.f15038x5e1a4265 == null || this.f15040x68813b7 == null) {
            return null;
        }
        try {
            c3814xbf852aa92.m31013x900967ab();
        } catch (com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.d e17) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(TAG, "EGL makeCurrent error ", e17);
        }
        com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.C3821x5d7fad02.m31164x2199b4ab(0, 0, this.f15043xbefb7959, this.f15039x6a4b7f4);
        com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.d a17 = this.f15038x5e1a4265.a(this.f15043xbefb7959, this.f15039x6a4b7f4);
        this.f15040x68813b7.a(c3817x73c266a7, com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.GLScaleType.CENTER_CROP, a17);
        android.opengl.GLES20.glFinish();
        com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.C3817x73c266a7 a18 = a17.a(this.f15037xfa65459c.m31009x65b1be3b());
        a18.m31107x5f0a5ad4(c3817x73c266a7.m31081x2b69a60());
        a17.mo31088x41012807();
        return a18;
    }

    /* renamed from: release */
    public void m31393x41012807() {
        m31391x3dd4ebf6();
    }

    /* renamed from: releaseFrame */
    public void m31394x89797da6(com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.C3817x73c266a7 c3817x73c266a7) {
        if (c3817x73c266a7 != null) {
            c3817x73c266a7.mo31088x41012807();
        }
    }
}
