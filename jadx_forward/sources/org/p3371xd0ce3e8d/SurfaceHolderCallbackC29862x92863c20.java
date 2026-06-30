package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.SurfaceEglRenderer */
/* loaded from: classes16.dex */
public class SurfaceHolderCallbackC29862x92863c20 extends org.p3371xd0ce3e8d.AbstractC29764xde6b2acd implements android.view.SurfaceHolder.Callback {
    private static final java.lang.String TAG = "SurfaceEglRenderer";

    /* renamed from: frameRotation */
    private int f75956x63b0600b;

    /* renamed from: isFirstFrameRendered */
    private boolean f75957xdbb75f3c;

    /* renamed from: isRenderingPaused */
    private boolean f75958x9d21c450;

    /* renamed from: layoutLock */
    private final java.lang.Object f75959x14598f75;

    /* renamed from: rendererEvents */
    private org.p3371xd0ce3e8d.C29847x54db44ae.RendererEvents f75960x945d2fbc;

    /* renamed from: rotatedFrameHeight */
    private int f75961x7fed8ecb;

    /* renamed from: rotatedFrameWidth */
    private int f75962xb260eba2;

    public SurfaceHolderCallbackC29862x92863c20(java.lang.String str) {
        super(str);
        this.f75959x14598f75 = new java.lang.Object();
    }

    /* renamed from: logD */
    private void m156377x32c580(java.lang.String str) {
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, this.f75354x337a8b + ": " + str);
    }

    /* renamed from: updateFrameDimensionsAndReportEvents */
    private void m156378xe866ad93(org.p3371xd0ce3e8d.C29904x150215d2 c29904x150215d2) {
        synchronized (this.f75959x14598f75) {
            if (this.f75958x9d21c450) {
                return;
            }
            if (!this.f75957xdbb75f3c) {
                this.f75957xdbb75f3c = true;
                m156377x32c580("Reporting first rendered frame.");
                org.p3371xd0ce3e8d.C29847x54db44ae.RendererEvents rendererEvents = this.f75960x945d2fbc;
                if (rendererEvents != null) {
                    rendererEvents.mo51494x452e7cb1();
                }
            }
            if (this.f75962xb260eba2 != c29904x150215d2.m156546xdcea9b53() || this.f75961x7fed8ecb != c29904x150215d2.m156545xa699d53a() || this.f75956x63b0600b != c29904x150215d2.m156547x79734cf4()) {
                m156377x32c580("Reporting frame resolution changed to " + c29904x150215d2.m156544x12f2b736().mo155645x755bd410() + "x" + c29904x150215d2.m156544x12f2b736().mo155641x1c4fb41d() + " with rotation " + c29904x150215d2.m156547x79734cf4());
                org.p3371xd0ce3e8d.C29847x54db44ae.RendererEvents rendererEvents2 = this.f75960x945d2fbc;
                if (rendererEvents2 != null) {
                    rendererEvents2.mo51495xd8b11f3a(c29904x150215d2.m156544x12f2b736().mo155645x755bd410(), c29904x150215d2.m156544x12f2b736().mo155641x1c4fb41d(), c29904x150215d2.m156547x79734cf4());
                }
                this.f75962xb260eba2 = c29904x150215d2.m156546xdcea9b53();
                this.f75961x7fed8ecb = c29904x150215d2.m156545xa699d53a();
                this.f75956x63b0600b = c29904x150215d2.m156547x79734cf4();
            }
        }
    }

    @Override // org.p3371xd0ce3e8d.AbstractC29764xde6b2acd
    /* renamed from: disableFpsReduction */
    public void mo155485x60da1692() {
        synchronized (this.f75959x14598f75) {
            this.f75958x9d21c450 = false;
        }
        super.mo155485x60da1692();
    }

    /* renamed from: init */
    public void m156379x316510(org.p3371xd0ce3e8d.InterfaceC29759xf7e285db.Context context, org.p3371xd0ce3e8d.C29847x54db44ae.RendererEvents rendererEvents, int[] iArr, org.p3371xd0ce3e8d.C29847x54db44ae.GlDrawer glDrawer) {
        org.p3371xd0ce3e8d.C29882xd5f5f0a7.m156473x7c0fa5d4();
        this.f75960x945d2fbc = rendererEvents;
        synchronized (this.f75959x14598f75) {
            this.f75957xdbb75f3c = false;
            this.f75962xb260eba2 = 0;
            this.f75961x7fed8ecb = 0;
            this.f75956x63b0600b = 0;
        }
        super.mo155487x316510(context, iArr, glDrawer);
    }

    @Override // org.p3371xd0ce3e8d.AbstractC29764xde6b2acd, org.p3371xd0ce3e8d.InterfaceC29908xc6e4d18e
    /* renamed from: onFrame */
    public void mo155128xaf987ece(org.p3371xd0ce3e8d.C29904x150215d2 c29904x150215d2) {
        m156378xe866ad93(c29904x150215d2);
        super.mo155128xaf987ece(c29904x150215d2);
    }

    @Override // org.p3371xd0ce3e8d.AbstractC29764xde6b2acd
    /* renamed from: onRenderStats */
    public void mo155489xbae2a94a(org.p3371xd0ce3e8d.C29838x24207153 c29838x24207153) {
        org.p3371xd0ce3e8d.C29847x54db44ae.RendererEvents rendererEvents = this.f75960x945d2fbc;
        if (rendererEvents != null) {
            rendererEvents.mo51496xbae2a94a(c29838x24207153);
        }
    }

    @Override // org.p3371xd0ce3e8d.AbstractC29764xde6b2acd
    /* renamed from: pauseVideo */
    public void mo155491xfcac4825() {
        synchronized (this.f75959x14598f75) {
            this.f75958x9d21c450 = true;
        }
        super.mo155491xfcac4825();
    }

    @Override // org.p3371xd0ce3e8d.AbstractC29764xde6b2acd
    /* renamed from: setFpsReduction */
    public void mo155497x7a11490c(float f17) {
        synchronized (this.f75959x14598f75) {
            this.f75958x9d21c450 = f17 == 0.0f;
        }
        super.mo155497x7a11490c(f17);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(android.view.SurfaceHolder surfaceHolder, int i17, int i18, int i19) {
        org.p3371xd0ce3e8d.C29882xd5f5f0a7.m156473x7c0fa5d4();
        m156377x32c580("surfaceChanged: format: " + i17 + " size: " + i18 + "x" + i19);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
        org.p3371xd0ce3e8d.C29882xd5f5f0a7.m156473x7c0fa5d4();
        m155484x3d132f5f(surfaceHolder.getSurface());
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(android.view.SurfaceHolder surfaceHolder) {
        org.p3371xd0ce3e8d.C29882xd5f5f0a7.m156473x7c0fa5d4();
        java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        m155494xc905a4aa(new org.p3371xd0ce3e8d.RunnableC29863x330f5bc1(countDownLatch));
        org.p3371xd0ce3e8d.C29882xd5f5f0a7.m156471x3f10571a(countDownLatch);
    }

    @Override // org.p3371xd0ce3e8d.AbstractC29764xde6b2acd
    /* renamed from: init */
    public void mo155487x316510(org.p3371xd0ce3e8d.InterfaceC29759xf7e285db.Context context, int[] iArr, org.p3371xd0ce3e8d.C29847x54db44ae.GlDrawer glDrawer) {
        m156379x316510(context, (org.p3371xd0ce3e8d.C29847x54db44ae.RendererEvents) null, iArr, glDrawer);
    }
}
