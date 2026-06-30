package com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1;

@com.p314xaae8f345.p373xbe494963.p378x2e06d1.p379xc6ad7b24.InterfaceC3751x20efb56(m29314x6ac9171 = "liteav::video")
/* renamed from: com.tencent.liteav.videobase.utils.SurfaceTextureHolder */
/* loaded from: classes14.dex */
public class C3824x47b9471a implements android.graphics.SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: mCallbackHandler */
    private com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.HandlerC3775x958f0279 f14979xe0431718;

    /* renamed from: mOnFrameAvailableListener */
    private android.graphics.SurfaceTexture.OnFrameAvailableListener f14980xc6243efc;

    /* renamed from: mSurface */
    private android.view.Surface f14981x2fa29f80;

    /* renamed from: mSurfaceTexture */
    private android.graphics.SurfaceTexture f14982x30495d7b;

    /* renamed from: mTag */
    private final java.lang.String f14983x32d3ed = "SurfaceTextureHolder_" + java.lang.Integer.toHexString(hashCode());

    /* renamed from: mThrottlers */
    private final com.p314xaae8f345.p373xbe494963.p378x2e06d1.b.b f14984xc7e76f38 = new com.p314xaae8f345.p373xbe494963.p378x2e06d1.b.b();

    public C3824x47b9471a(int i17, boolean z17) {
        this.f14982x30495d7b = new android.graphics.SurfaceTexture(i17);
        if (z17) {
            this.f14981x2fa29f80 = new android.view.Surface(this.f14982x30495d7b);
        }
    }

    /* renamed from: lambda$onFrameAvailable$0 */
    public static /* synthetic */ void m31194xe282ad64(com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.C3824x47b9471a c3824x47b9471a, android.graphics.SurfaceTexture surfaceTexture) {
        android.graphics.SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener = c3824x47b9471a.f14980xc6243efc;
        if (onFrameAvailableListener != null) {
            onFrameAvailableListener.onFrameAvailable(surfaceTexture);
        }
    }

    /* renamed from: getSurface */
    public android.view.Surface m31195xcf572877() {
        return this.f14981x2fa29f80;
    }

    /* renamed from: getSurfaceTexture */
    public android.graphics.SurfaceTexture m31196x182e20a4() {
        return this.f14982x30495d7b;
    }

    /* renamed from: getTransformMatrix */
    public float[] m31197xb1778017(boolean z17, float f17, float f18, float f19, float f27) {
        android.graphics.SurfaceTexture surfaceTexture = this.f14982x30495d7b;
        if (surfaceTexture == null) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(this.f14984xc7e76f38.a("getTransformMatrix"), this.f14983x32d3ed, "getTransformMatrix, surface texture is released!", new java.lang.Object[0]);
            return null;
        }
        float[] fArr = new float[16];
        try {
            surfaceTexture.getTransformMatrix(fArr);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.w(this.f14984xc7e76f38.a("getTransformMatrix"), this.f14983x32d3ed, "updateTexImage exception: ".concat(java.lang.String.valueOf(th6)), new java.lang.Object[0]);
        }
        if (z17) {
            if (!com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.f.a(f17, 0.0f) || !com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.f.a(f18, 0.0f)) {
                android.opengl.Matrix.translateM(fArr, 0, f17, f18, 0.0f);
            }
            if (!com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.f.a(f19, 1.0f) || !com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.f.a(f27, 1.0f)) {
                android.opengl.Matrix.scaleM(fArr, 0, f19, f27, 1.0f);
            }
        }
        return fArr;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.HandlerC3775x958f0279 handlerC3775x958f0279 = this.f14979xe0431718;
        if (handlerC3775x958f0279 != null) {
            handlerC3775x958f0279.m29527xc88bc38e(com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.f.a(this, surfaceTexture));
        }
    }

    /* renamed from: release */
    public void m31198x41012807() {
        android.view.Surface surface = this.f14981x2fa29f80;
        if (surface != null) {
            surface.release();
            this.f14981x2fa29f80 = null;
        }
        android.graphics.SurfaceTexture surfaceTexture = this.f14982x30495d7b;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.f14982x30495d7b = null;
        }
    }

    /* renamed from: setDefaultBufferSize */
    public void m31199xb30cf140(int i17, int i18) {
        android.graphics.SurfaceTexture surfaceTexture = this.f14982x30495d7b;
        if (surfaceTexture == null) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(this.f14984xc7e76f38.a("setDefaultBufferSize"), this.f14983x32d3ed, "setDefaultBufferSize, surface texture is released!", new java.lang.Object[0]);
        } else {
            surfaceTexture.setDefaultBufferSize(i17, i18);
        }
    }

    /* renamed from: setOnFrameAvailableListener */
    public void m31200xdd9eabf1(android.graphics.SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener, android.os.Handler handler) {
        if (this.f14982x30495d7b == null) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(this.f14984xc7e76f38.a("setOnFrameAvailableListener"), this.f14983x32d3ed, "setOnFrameAvailableListener, surface texture is released!", new java.lang.Object[0]);
            return;
        }
        this.f14979xe0431718 = new com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.HandlerC3775x958f0279(handler != null ? handler.getLooper() : android.os.Looper.getMainLooper());
        this.f14980xc6243efc = onFrameAvailableListener;
        if (com.p314xaae8f345.p373xbe494963.p378x2e06d1.p386xcb1c722f.C3773x6d55e560.m29463x2c3e92a0() >= 21) {
            this.f14982x30495d7b.setOnFrameAvailableListener(this, this.f14979xe0431718);
        } else {
            this.f14982x30495d7b.setOnFrameAvailableListener(this);
        }
    }

    /* renamed from: updateTexImage */
    public void m31201xf5b8bd5d() {
        android.graphics.SurfaceTexture surfaceTexture = this.f14982x30495d7b;
        if (surfaceTexture == null) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(this.f14984xc7e76f38.a("updateTexImage"), this.f14983x32d3ed, "updateTexImage, surface texture is released!", new java.lang.Object[0]);
            return;
        }
        try {
            surfaceTexture.updateTexImage();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.w(this.f14984xc7e76f38.a("updateTexImage"), this.f14983x32d3ed, "updateTexImage exception: ".concat(java.lang.String.valueOf(th6)), new java.lang.Object[0]);
        }
    }
}
