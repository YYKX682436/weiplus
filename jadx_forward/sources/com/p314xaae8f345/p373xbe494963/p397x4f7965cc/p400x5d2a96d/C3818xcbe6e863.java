package com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d;

@com.p314xaae8f345.p373xbe494963.p378x2e06d1.p379xc6ad7b24.InterfaceC3751x20efb56(m29314x6ac9171 = "liteav::video")
/* renamed from: com.tencent.liteav.videobase.frame.PixelFrameFactory */
/* loaded from: classes14.dex */
public class C3818xcbe6e863 {

    /* renamed from: mCallerEGLDrawSurface */
    private android.opengl.EGLSurface f14957xf32d1cd7;

    /* renamed from: mCallerEGLReadSurface */
    private android.opengl.EGLSurface f14958xfa3dd045;

    /* renamed from: mGLTexturePool */
    private com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.e f14959x5e1a4265;

    /* renamed from: mLastFrameSize */
    private final com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421 f14960x10979dab;

    /* renamed from: mPixelFrameRenderer */
    private com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.h f14961x68813b7;

    /* renamed from: mRenderEGLCore */
    private com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.C3814xbf852aa9 f14962x823d1ce6;

    /* renamed from: mThrottlers */
    private final com.p314xaae8f345.p373xbe494963.p378x2e06d1.b.b f14965xc7e76f38;

    /* renamed from: mTAG */
    private final java.lang.String f14964x32cfed = "PixelFrameFactory_" + hashCode();

    /* renamed from: mSharedEGLContext */
    private java.lang.Object f14963x631f6317 = null;

    /* renamed from: mCallerEGLDisplay */
    private android.opengl.EGLDisplay f14956x41e6c9d0 = android.opengl.EGL14.EGL_NO_DISPLAY;

    /* renamed from: mCallerEGLContext */
    private android.opengl.EGLContext f14955x16f8e6bd = android.opengl.EGL14.EGL_NO_CONTEXT;

    public C3818xcbe6e863() {
        android.opengl.EGLSurface eGLSurface = android.opengl.EGL14.EGL_NO_SURFACE;
        this.f14958xfa3dd045 = eGLSurface;
        this.f14957xf32d1cd7 = eGLSurface;
        this.f14960x10979dab = new com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421();
        this.f14965xc7e76f38 = new com.p314xaae8f345.p373xbe494963.p378x2e06d1.b.b();
    }

    /* renamed from: copyTexture */
    private com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.C3817x73c266a7 m31110x865e5fe6(com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.C3817x73c266a7 c3817x73c266a7) {
        if (this.f14959x5e1a4265 == null) {
            this.f14959x5e1a4265 = new com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.e();
        }
        com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.d a17 = this.f14959x5e1a4265.a(c3817x73c266a7.m31082x755bd410(), c3817x73c266a7.m31073x1c4fb41d());
        if (this.f14960x10979dab.f14764x6be2dc6 != c3817x73c266a7.m31082x755bd410() || this.f14960x10979dab.f14763xb7389127 != c3817x73c266a7.m31073x1c4fb41d()) {
            com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.h hVar = this.f14961x68813b7;
            if (hVar != null) {
                hVar.a();
                this.f14961x68813b7 = null;
            }
            this.f14960x10979dab.f14764x6be2dc6 = c3817x73c266a7.m31082x755bd410();
            this.f14960x10979dab.f14763xb7389127 = c3817x73c266a7.m31073x1c4fb41d();
        }
        if (this.f14961x68813b7 == null) {
            this.f14961x68813b7 = new com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.h(c3817x73c266a7.m31082x755bd410(), c3817x73c266a7.m31073x1c4fb41d());
        }
        this.f14961x68813b7.a(c3817x73c266a7, com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.GLScaleType.FILL, a17);
        com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.C3817x73c266a7 a18 = a17.a(c3817x73c266a7.m31071x19bf3a74());
        a17.mo31088x41012807();
        return a18;
    }

    /* renamed from: deepCopyDataToPixelFrame */
    private com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.C3817x73c266a7 m31111x7070d8cd(com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.C3817x73c266a7 c3817x73c266a7, java.lang.Object obj) {
        if (obj instanceof byte[]) {
            byte[] a17 = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.d.a(((byte[]) obj).length);
            if (a17 == null) {
                return null;
            }
            java.lang.System.arraycopy(obj, 0, a17, 0, a17.length);
            c3817x73c266a7.m31095x76491f2c(a17);
        } else if (obj instanceof java.nio.ByteBuffer) {
            java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) obj;
            java.nio.ByteBuffer b17 = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.d.b(byteBuffer.capacity());
            if (b17 == null) {
                return null;
            }
            byteBuffer.rewind();
            b17.put(byteBuffer);
            b17.rewind();
            c3817x73c266a7.m31091x627eb42(b17);
        }
        c3817x73c266a7.mo31090xc84df105();
        return c3817x73c266a7;
    }

    /* renamed from: deepCopyTextureToPixelFrame */
    private com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.C3817x73c266a7 m31112x9ba7f3dc(com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.C3817x73c266a7 c3817x73c266a7, java.lang.Object obj) {
        m31116x282a87cd();
        android.opengl.GLES20.glFinish();
        if (!com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3774xbd6c7cad.m29498xb2c87fbf(this.f14963x631f6317, obj)) {
            m31120xa95ca66e();
            m31113x3aa7adab(obj);
        }
        if (!m31114x900967ab()) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(this.f14965xc7e76f38.a("makeCurrent"), this.f14964x32cfed, "use origin texture when makeCurrent error", new java.lang.Object[0]);
            c3817x73c266a7.mo31090xc84df105();
            return c3817x73c266a7;
        }
        com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.C3817x73c266a7 m31110x865e5fe6 = m31110x865e5fe6(c3817x73c266a7);
        android.opengl.GLES20.glFinish();
        m31115x26556de();
        return m31110x865e5fe6;
    }

    /* renamed from: initRenderEGLContext */
    private void m31113x3aa7adab(java.lang.Object obj) {
        if (this.f14962x823d1ce6 != null) {
            return;
        }
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(this.f14964x32cfed, "initRenderEGLContext");
        this.f14963x631f6317 = obj;
        com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.C3814xbf852aa9 c3814xbf852aa9 = new com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.C3814xbf852aa9();
        this.f14962x823d1ce6 = c3814xbf852aa9;
        try {
            c3814xbf852aa9.m31012x33ebcb90(obj, null, 128, 128);
        } catch (com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.d e17) {
            this.f14962x823d1ce6 = null;
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(this.f14965xc7e76f38.a("initEGLCore"), this.f14964x32cfed, "create EGLCore failed.", e17);
        }
    }

    /* renamed from: makeCurrent */
    private boolean m31114x900967ab() {
        com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.C3814xbf852aa9 c3814xbf852aa9 = this.f14962x823d1ce6;
        if (c3814xbf852aa9 == null) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(this.f14965xc7e76f38.a("makeCurrentNull"), this.f14964x32cfed, "makeCurrent on mEGLCore is null", new java.lang.Object[0]);
            return false;
        }
        try {
            c3814xbf852aa9.m31013x900967ab();
            return true;
        } catch (com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.d e17) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(this.f14965xc7e76f38.a("makeCurrentError"), this.f14964x32cfed, "make current failed.", e17);
            return false;
        }
    }

    /* renamed from: restoreCallerEGLContext */
    private void m31115x26556de() {
        if (!com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3774xbd6c7cad.m29498xb2c87fbf(this.f14955x16f8e6bd, android.opengl.EGL14.EGL_NO_CONTEXT)) {
            android.opengl.EGL14.eglMakeCurrent(this.f14956x41e6c9d0, this.f14957xf32d1cd7, this.f14958xfa3dd045, this.f14955x16f8e6bd);
            return;
        }
        android.opengl.EGLDisplay eglGetCurrentDisplay = android.opengl.EGL14.eglGetCurrentDisplay();
        android.opengl.EGLSurface eGLSurface = android.opengl.EGL14.EGL_NO_SURFACE;
        android.opengl.EGL14.eglMakeCurrent(eglGetCurrentDisplay, eGLSurface, eGLSurface, android.opengl.EGL14.EGL_NO_CONTEXT);
    }

    /* renamed from: saveCallerEGLContext */
    private void m31116x282a87cd() {
        android.opengl.EGLContext eglGetCurrentContext = android.opengl.EGL14.eglGetCurrentContext();
        if (com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3774xbd6c7cad.m29498xb2c87fbf(this.f14955x16f8e6bd, android.opengl.EGL14.EGL_NO_CONTEXT) || !com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3774xbd6c7cad.m29498xb2c87fbf(eglGetCurrentContext, this.f14955x16f8e6bd)) {
            this.f14955x16f8e6bd = eglGetCurrentContext;
            this.f14956x41e6c9d0 = android.opengl.EGL14.eglGetCurrentDisplay();
            this.f14958xfa3dd045 = android.opengl.EGL14.eglGetCurrentSurface(12378);
            this.f14957xf32d1cd7 = android.opengl.EGL14.eglGetCurrentSurface(12377);
        }
    }

    /* renamed from: shallowCopyDataToPixelFrame */
    private com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.C3817x73c266a7 m31117x8741f9f5(com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.C3817x73c266a7 c3817x73c266a7, java.lang.Object obj) {
        if (obj instanceof byte[]) {
            c3817x73c266a7.m31095x76491f2c((byte[]) obj);
        } else if (obj instanceof java.nio.ByteBuffer) {
            c3817x73c266a7.m31091x627eb42((java.nio.ByteBuffer) obj);
        }
        c3817x73c266a7.mo31090xc84df105();
        return c3817x73c266a7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        r2 = m31111x7070d8cd(r0, r11);
     */
    /* renamed from: create */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.C3817x73c266a7 m31118xaf65a0fc(int r2, int r3, int r4, long r5, int r7, int r8, int r9, java.lang.Object r10, java.lang.Object r11, boolean r12) {
        /*
            r1 = this;
            monitor-enter(r1)
            com.tencent.liteav.videobase.frame.PixelFrame r0 = new com.tencent.liteav.videobase.frame.PixelFrame     // Catch: java.lang.Throwable -> L4d
            r0.<init>()     // Catch: java.lang.Throwable -> L4d
            r0.m31108x53e9ee84(r2)     // Catch: java.lang.Throwable -> L4d
            r0.m31097xf84e829(r3)     // Catch: java.lang.Throwable -> L4d
            com.tencent.liteav.base.util.k r2 = com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.a(r4)     // Catch: java.lang.Throwable -> L4d
            r0.m31105x742bae00(r2)     // Catch: java.lang.Throwable -> L4d
            r0.m31107x5f0a5ad4(r5)     // Catch: java.lang.Throwable -> L4d
            r0.m31096x7612fae8(r10)     // Catch: java.lang.Throwable -> L4d
            r0.mo31106x1f1e3554(r9)     // Catch: java.lang.Throwable -> L4d
            com.tencent.liteav.videobase.base.GLConstants$a r2 = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.a.a(r7)     // Catch: java.lang.Throwable -> L4d
            r0.m31102x9e9ca1fe(r2)     // Catch: java.lang.Throwable -> L4d
            com.tencent.liteav.videobase.base.GLConstants$PixelFormatType r2 = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.PixelFormatType.a(r8)     // Catch: java.lang.Throwable -> L4d
            r0.m31103x404a5235(r2)     // Catch: java.lang.Throwable -> L4d
            com.tencent.liteav.videobase.base.GLConstants$a r2 = r0.m31076x67c6088a()     // Catch: java.lang.Throwable -> L4d
            com.tencent.liteav.videobase.base.GLConstants$a r3 = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.a.BYTE_ARRAY     // Catch: java.lang.Throwable -> L4d
            if (r2 == r3) goto L40
            com.tencent.liteav.videobase.base.GLConstants$a r2 = r0.m31076x67c6088a()     // Catch: java.lang.Throwable -> L4d
            com.tencent.liteav.videobase.base.GLConstants$a r3 = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.a.BYTE_BUFFER     // Catch: java.lang.Throwable -> L4d
            if (r2 != r3) goto L3b
            goto L40
        L3b:
            com.tencent.liteav.videobase.frame.PixelFrame r2 = r1.m31112x9ba7f3dc(r0, r10)     // Catch: java.lang.Throwable -> L4d
            goto L4b
        L40:
            if (r12 == 0) goto L47
            com.tencent.liteav.videobase.frame.PixelFrame r2 = r1.m31111x7070d8cd(r0, r11)     // Catch: java.lang.Throwable -> L4d
            goto L4b
        L47:
            com.tencent.liteav.videobase.frame.PixelFrame r2 = r1.m31117x8741f9f5(r0, r11)     // Catch: java.lang.Throwable -> L4d
        L4b:
            monitor-exit(r1)
            return r2
        L4d:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.C3818xcbe6e863.m31118xaf65a0fc(int, int, int, long, int, int, int, java.lang.Object, java.lang.Object, boolean):com.tencent.liteav.videobase.frame.PixelFrame");
    }

    /* renamed from: release */
    public synchronized void m31119x41012807(com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.C3817x73c266a7 c3817x73c266a7) {
        if (c3817x73c266a7 != null) {
            c3817x73c266a7.mo31088x41012807();
        }
    }

    /* renamed from: uninitOpenGLComponents */
    public synchronized void m31120xa95ca66e() {
        if (this.f14962x823d1ce6 == null) {
            return;
        }
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(this.f14964x32cfed, "uninitOpenGLComponents");
        if (m31114x900967ab()) {
            com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.e eVar = this.f14959x5e1a4265;
            if (eVar != null) {
                eVar.a();
                this.f14959x5e1a4265.b();
                this.f14959x5e1a4265 = null;
            }
            com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.h hVar = this.f14961x68813b7;
            if (hVar != null) {
                hVar.a();
                this.f14961x68813b7 = null;
            }
        }
        com.p314xaae8f345.p373xbe494963.p397x4f7965cc.egl.C3814xbf852aa9.m31004x5cd39ffa(this.f14962x823d1ce6);
        this.f14962x823d1ce6 = null;
    }
}
