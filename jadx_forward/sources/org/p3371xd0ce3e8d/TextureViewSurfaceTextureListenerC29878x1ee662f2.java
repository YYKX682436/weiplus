package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.TextureEglRenderer */
/* loaded from: classes16.dex */
public class TextureViewSurfaceTextureListenerC29878x1ee662f2 extends org.p3371xd0ce3e8d.AbstractC29764xde6b2acd implements android.view.TextureView.SurfaceTextureListener {
    private static final java.lang.String TAG = "SurfaceEglRenderer";

    /* renamed from: frameRotation */
    private int f76012x63b0600b;

    /* renamed from: isFirstFrameRendered */
    private boolean f76013xdbb75f3c;

    /* renamed from: isRenderingPaused */
    private boolean f76014x9d21c450;

    /* renamed from: layoutLock */
    private final java.lang.Object f76015x14598f75;

    /* renamed from: rendererEvents */
    private org.p3371xd0ce3e8d.C29847x54db44ae.RendererEvents f76016x945d2fbc;

    /* renamed from: rotatedFrameHeight */
    private int f76017x7fed8ecb;

    /* renamed from: rotatedFrameWidth */
    private int f76018xb260eba2;

    public TextureViewSurfaceTextureListenerC29878x1ee662f2(java.lang.String str) {
        super(str);
        this.f76015x14598f75 = new java.lang.Object();
    }

    /* renamed from: logD */
    private void m156452x32c580(java.lang.String str) {
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, this.f75354x337a8b + ": " + str);
    }

    /* renamed from: updateFrameDimensionsAndReportEvents */
    private void m156453xe866ad93(org.p3371xd0ce3e8d.C29904x150215d2 c29904x150215d2) {
        synchronized (this.f76015x14598f75) {
            if (this.f76014x9d21c450) {
                return;
            }
            if (!this.f76013xdbb75f3c) {
                this.f76013xdbb75f3c = true;
                m156452x32c580("Reporting first rendered frame.");
                org.p3371xd0ce3e8d.C29847x54db44ae.RendererEvents rendererEvents = this.f76016x945d2fbc;
                if (rendererEvents != null) {
                    rendererEvents.mo51494x452e7cb1();
                }
            }
            if (this.f76018xb260eba2 != c29904x150215d2.m156546xdcea9b53() || this.f76017x7fed8ecb != c29904x150215d2.m156545xa699d53a() || this.f76012x63b0600b != c29904x150215d2.m156547x79734cf4()) {
                m156452x32c580("Reporting frame resolution changed to " + c29904x150215d2.m156544x12f2b736().mo155645x755bd410() + "x" + c29904x150215d2.m156544x12f2b736().mo155641x1c4fb41d() + " with rotation " + c29904x150215d2.m156547x79734cf4());
                org.p3371xd0ce3e8d.C29847x54db44ae.RendererEvents rendererEvents2 = this.f76016x945d2fbc;
                if (rendererEvents2 != null) {
                    rendererEvents2.mo51495xd8b11f3a(c29904x150215d2.m156544x12f2b736().mo155645x755bd410(), c29904x150215d2.m156544x12f2b736().mo155641x1c4fb41d(), c29904x150215d2.m156547x79734cf4());
                }
                this.f76018xb260eba2 = c29904x150215d2.m156546xdcea9b53();
                this.f76017x7fed8ecb = c29904x150215d2.m156545xa699d53a();
                this.f76012x63b0600b = c29904x150215d2.m156547x79734cf4();
            }
        }
    }

    @Override // org.p3371xd0ce3e8d.AbstractC29764xde6b2acd
    /* renamed from: disableFpsReduction */
    public void mo155485x60da1692() {
        synchronized (this.f76015x14598f75) {
            this.f76014x9d21c450 = false;
        }
        super.mo155485x60da1692();
    }

    /* renamed from: init */
    public void m156454x316510(org.p3371xd0ce3e8d.InterfaceC29759xf7e285db.Context context, org.p3371xd0ce3e8d.C29847x54db44ae.RendererEvents rendererEvents, int[] iArr, org.p3371xd0ce3e8d.C29847x54db44ae.GlDrawer glDrawer) {
        org.p3371xd0ce3e8d.C29882xd5f5f0a7.m156473x7c0fa5d4();
        this.f76016x945d2fbc = rendererEvents;
        synchronized (this.f76015x14598f75) {
            this.f76013xdbb75f3c = false;
            this.f76018xb260eba2 = 0;
            this.f76017x7fed8ecb = 0;
            this.f76012x63b0600b = 0;
        }
        super.mo155487x316510(context, iArr, glDrawer);
    }

    @Override // org.p3371xd0ce3e8d.AbstractC29764xde6b2acd, org.p3371xd0ce3e8d.InterfaceC29908xc6e4d18e
    /* renamed from: onFrame */
    public void mo155128xaf987ece(org.p3371xd0ce3e8d.C29904x150215d2 c29904x150215d2) {
        m156453xe866ad93(c29904x150215d2);
        super.mo155128xaf987ece(c29904x150215d2);
    }

    @Override // org.p3371xd0ce3e8d.AbstractC29764xde6b2acd
    /* renamed from: onRenderStats */
    public void mo155489xbae2a94a(org.p3371xd0ce3e8d.C29838x24207153 c29838x24207153) {
        org.p3371xd0ce3e8d.C29847x54db44ae.RendererEvents rendererEvents = this.f76016x945d2fbc;
        if (rendererEvents != null) {
            rendererEvents.mo51496xbae2a94a(c29838x24207153);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        org.p3371xd0ce3e8d.C29882xd5f5f0a7.m156473x7c0fa5d4();
        m155484x3d132f5f(new android.view.Surface(surfaceTexture));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        org.p3371xd0ce3e8d.C29882xd5f5f0a7.m156473x7c0fa5d4();
        java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        m155494xc905a4aa(new org.p3371xd0ce3e8d.RunnableC29863x330f5bc1(countDownLatch));
        org.p3371xd0ce3e8d.C29882xd5f5f0a7.m156471x3f10571a(countDownLatch);
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        org.p3371xd0ce3e8d.C29882xd5f5f0a7.m156473x7c0fa5d4();
        m156452x32c580("surfaceChanged: size: " + i17 + "x" + i18);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
    }

    @Override // org.p3371xd0ce3e8d.AbstractC29764xde6b2acd
    /* renamed from: pauseVideo */
    public void mo155491xfcac4825() {
        synchronized (this.f76015x14598f75) {
            this.f76014x9d21c450 = true;
        }
        super.mo155491xfcac4825();
    }

    @Override // org.p3371xd0ce3e8d.AbstractC29764xde6b2acd
    /* renamed from: setFpsReduction */
    public void mo155497x7a11490c(float f17) {
        synchronized (this.f76015x14598f75) {
            this.f76014x9d21c450 = f17 == 0.0f;
        }
        super.mo155497x7a11490c(f17);
    }

    @Override // org.p3371xd0ce3e8d.AbstractC29764xde6b2acd
    /* renamed from: init */
    public void mo155487x316510(org.p3371xd0ce3e8d.InterfaceC29759xf7e285db.Context context, int[] iArr, org.p3371xd0ce3e8d.C29847x54db44ae.GlDrawer glDrawer) {
        m156454x316510(context, (org.p3371xd0ce3e8d.C29847x54db44ae.RendererEvents) null, iArr, glDrawer);
    }
}
