package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.TextureViewRenderer */
/* loaded from: classes16.dex */
public class TextureViewSurfaceTextureListenerC29879xa98b8b23 extends android.view.TextureView implements android.view.TextureView.SurfaceTextureListener, org.p3371xd0ce3e8d.InterfaceC29908xc6e4d18e, org.p3371xd0ce3e8d.C29847x54db44ae.RendererEvents, org.p3371xd0ce3e8d.InterfaceC29791x2ddf4c2c {
    private static final java.lang.String TAG = "SurfaceViewRenderer";

    /* renamed from: eglRenderer */
    private final org.p3371xd0ce3e8d.TextureViewSurfaceTextureListenerC29878x1ee662f2 f76019x7b0182ed;

    /* renamed from: rendererEvents */
    private org.p3371xd0ce3e8d.C29847x54db44ae.RendererEvents f76020x945d2fbc;

    /* renamed from: resourceName */
    private final java.lang.String f76021xe913fbb9;

    /* renamed from: rotatedFrameHeight */
    private int f76022x7fed8ecb;

    /* renamed from: rotatedFrameWidth */
    private int f76023xb260eba2;

    /* renamed from: surfaceHeight */
    private int f76024x59c7434;

    /* renamed from: surfaceWidth */
    private int f76025xdffb3519;

    /* renamed from: videoLayoutMeasure */
    private final org.p3371xd0ce3e8d.C29847x54db44ae.VideoLayoutMeasure f76026xa63bba19;

    public TextureViewSurfaceTextureListenerC29879xa98b8b23(android.content.Context context) {
        super(context);
        this.f76026xa63bba19 = new org.p3371xd0ce3e8d.C29847x54db44ae.VideoLayoutMeasure();
        java.lang.String m156455x4a068e2f = m156455x4a068e2f();
        this.f76021xe913fbb9 = m156455x4a068e2f;
        this.f76019x7b0182ed = new org.p3371xd0ce3e8d.TextureViewSurfaceTextureListenerC29878x1ee662f2(m156455x4a068e2f);
        setSurfaceTextureListener(this);
    }

    /* renamed from: getResourceName */
    private java.lang.String m156455x4a068e2f() {
        try {
            return getResources().getResourceEntryName(getId());
        } catch (android.content.res.Resources.NotFoundException unused) {
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onFrameResolutionChanged$0 */
    public /* synthetic */ void m156456xbd382043(int i17, int i18) {
        this.f76023xb260eba2 = i17;
        this.f76022x7fed8ecb = i18;
        requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$requestCaptureOnce$1 */
    public /* synthetic */ void m156457x9a8e7022(org.p3371xd0ce3e8d.InterfaceC29791x2ddf4c2c.OnCaptureListener onCaptureListener) {
        onCaptureListener.mo145457x7095c867(getBitmap());
    }

    /* renamed from: logD */
    private void m156458x32c580(java.lang.String str) {
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, this.f76021xe913fbb9 + ": " + str);
    }

    /* renamed from: postOrRun */
    private void m156459x768020e8(java.lang.Runnable runnable) {
        if (java.lang.Thread.currentThread() == android.os.Looper.getMainLooper().getThread()) {
            runnable.run();
        } else {
            post(runnable);
        }
    }

    /* renamed from: addFrameListener */
    public void m156461xb2909a20(org.p3371xd0ce3e8d.AbstractC29764xde6b2acd.FrameListener frameListener, float f17, org.p3371xd0ce3e8d.C29847x54db44ae.GlDrawer glDrawer) {
        this.f76019x7b0182ed.m155479xb2909a20(frameListener, f17, glDrawer);
    }

    /* renamed from: clearImage */
    public void m156462xd318eb0e() {
        this.f76019x7b0182ed.m155481xd318eb0e();
    }

    /* renamed from: disableFpsReduction */
    public void m156463x60da1692() {
        this.f76019x7b0182ed.mo155485x60da1692();
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29791x2ddf4c2c
    /* renamed from: getFrameWithGLCallback */
    public org.p3371xd0ce3e8d.AbstractC29764xde6b2acd.OnFrameInGLEnv mo155619x2fdd9927() {
        return this.f76019x7b0182ed.m155486x2fdd9927();
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29791x2ddf4c2c
    /* renamed from: init */
    public void mo155620x316510(org.p3371xd0ce3e8d.InterfaceC29759xf7e285db.Context context, org.p3371xd0ce3e8d.C29847x54db44ae.RendererEvents rendererEvents) {
        mo155621x316510(context, rendererEvents, org.p3371xd0ce3e8d.InterfaceC29759xf7e285db.f75304xe0dfc26d, new org.p3371xd0ce3e8d.C29781x502b66da());
    }

    @Override // org.p3371xd0ce3e8d.C29847x54db44ae.RendererEvents
    /* renamed from: onFirstFrameRendered */
    public void mo51494x452e7cb1() {
        org.p3371xd0ce3e8d.C29847x54db44ae.RendererEvents rendererEvents = this.f76020x945d2fbc;
        if (rendererEvents != null) {
            rendererEvents.mo51494x452e7cb1();
        }
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29908xc6e4d18e
    /* renamed from: onFrame */
    public void mo155128xaf987ece(org.p3371xd0ce3e8d.C29904x150215d2 c29904x150215d2) {
        this.f76019x7b0182ed.mo155128xaf987ece(c29904x150215d2);
    }

    @Override // org.p3371xd0ce3e8d.C29847x54db44ae.RendererEvents
    /* renamed from: onFrameResolutionChanged */
    public void mo51495xd8b11f3a(final int i17, int i18, int i19) {
        org.p3371xd0ce3e8d.C29847x54db44ae.RendererEvents rendererEvents = this.f76020x945d2fbc;
        if (rendererEvents != null) {
            rendererEvents.mo51495xd8b11f3a(i17, i18, i19);
        }
        final int i27 = (i19 == 0 || i19 == 180) ? i17 : i18;
        if (i19 == 0 || i19 == 180) {
            i17 = i18;
        }
        m156459x768020e8(new java.lang.Runnable() { // from class: org.webrtc.TextureViewRenderer$$b
            @Override // java.lang.Runnable
            public final void run() {
                org.p3371xd0ce3e8d.TextureViewSurfaceTextureListenerC29879xa98b8b23.this.m156456xbd382043(i27, i17);
            }
        });
    }

    @Override // android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        org.p3371xd0ce3e8d.C29882xd5f5f0a7.m156473x7c0fa5d4();
        this.f76019x7b0182ed.m155499x397cc4c7((i19 - i17) / (i27 - i18));
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        org.p3371xd0ce3e8d.C29882xd5f5f0a7.m156473x7c0fa5d4();
        android.graphics.Point m156238x37eda55e = this.f76026xa63bba19.m156238x37eda55e(i17, i18, this.f76023xb260eba2, this.f76022x7fed8ecb);
        setMeasuredDimension(m156238x37eda55e.x, m156238x37eda55e.y);
        m156458x32c580("onMeasure(). New size: " + m156238x37eda55e.x + "x" + m156238x37eda55e.y);
    }

    @Override // org.p3371xd0ce3e8d.C29847x54db44ae.RendererEvents
    /* renamed from: onRenderStats */
    public void mo51496xbae2a94a(org.p3371xd0ce3e8d.C29838x24207153 c29838x24207153) {
        org.p3371xd0ce3e8d.C29847x54db44ae.RendererEvents rendererEvents = this.f76020x945d2fbc;
        if (rendererEvents != null) {
            rendererEvents.mo51496xbae2a94a(c29838x24207153);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        org.p3371xd0ce3e8d.C29882xd5f5f0a7.m156473x7c0fa5d4();
        this.f76024x59c7434 = 0;
        this.f76025xdffb3519 = 0;
        this.f76019x7b0182ed.onSurfaceTextureAvailable(surfaceTexture, i17, i18);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        this.f76019x7b0182ed.onSurfaceTextureDestroyed(surfaceTexture);
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        this.f76019x7b0182ed.onSurfaceTextureSizeChanged(surfaceTexture, i17, i18);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
        this.f76019x7b0182ed.onSurfaceTextureUpdated(surfaceTexture);
    }

    @Override // android.view.TextureView, android.view.View
    public void onVisibilityChanged(android.view.View view, int i17) {
        super.onVisibilityChanged(view, i17);
        this.f76019x7b0182ed.m155490x4fca7ea6(i17);
    }

    /* renamed from: pauseVideo */
    public void m156464xfcac4825() {
        this.f76019x7b0182ed.mo155491xfcac4825();
    }

    /* renamed from: release */
    public void m156465x41012807() {
        this.f76019x7b0182ed.m155493x41012807();
    }

    /* renamed from: removeFrameListener */
    public void m156466xb797431d(org.p3371xd0ce3e8d.AbstractC29764xde6b2acd.FrameListener frameListener) {
        this.f76019x7b0182ed.m155495xb797431d(frameListener);
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29791x2ddf4c2c
    /* renamed from: requestCaptureOnce */
    public void mo155622x299f1cd8(final org.p3371xd0ce3e8d.InterfaceC29791x2ddf4c2c.OnCaptureListener onCaptureListener) {
        post(new java.lang.Runnable() { // from class: org.webrtc.TextureViewRenderer$$a
            @Override // java.lang.Runnable
            public final void run() {
                org.p3371xd0ce3e8d.TextureViewSurfaceTextureListenerC29879xa98b8b23.this.m156457x9a8e7022(onCaptureListener);
            }
        });
    }

    /* renamed from: setFpsReduction */
    public void m156467x7a11490c(float f17) {
        this.f76019x7b0182ed.mo155497x7a11490c(f17);
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29791x2ddf4c2c
    /* renamed from: setFrameWithGLCallback */
    public void mo155623x7e22589b(org.p3371xd0ce3e8d.AbstractC29764xde6b2acd.OnFrameInGLEnv onFrameInGLEnv) {
        this.f76019x7b0182ed.m155498x7e22589b(onFrameInGLEnv);
    }

    /* renamed from: setMirror */
    public void m156468x1849c2c1(boolean z17) {
        this.f76019x7b0182ed.m155500x1849c2c1(z17);
    }

    /* renamed from: setScalingType */
    public void m156469x40429d9f(org.p3371xd0ce3e8d.C29847x54db44ae.ScalingType scalingType) {
        org.p3371xd0ce3e8d.C29882xd5f5f0a7.m156473x7c0fa5d4();
        this.f76026xa63bba19.m156239x40429d9f(scalingType);
        requestLayout();
    }

    /* renamed from: addFrameListener */
    public void m156460xb2909a20(org.p3371xd0ce3e8d.AbstractC29764xde6b2acd.FrameListener frameListener, float f17) {
        this.f76019x7b0182ed.m155478xb2909a20(frameListener, f17);
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29791x2ddf4c2c
    /* renamed from: init */
    public void mo155621x316510(org.p3371xd0ce3e8d.InterfaceC29759xf7e285db.Context context, org.p3371xd0ce3e8d.C29847x54db44ae.RendererEvents rendererEvents, int[] iArr, org.p3371xd0ce3e8d.C29847x54db44ae.GlDrawer glDrawer) {
        org.p3371xd0ce3e8d.C29882xd5f5f0a7.m156473x7c0fa5d4();
        this.f76020x945d2fbc = rendererEvents;
        this.f76023xb260eba2 = 0;
        this.f76022x7fed8ecb = 0;
        this.f76019x7b0182ed.m156454x316510(context, this, iArr, glDrawer);
    }

    /* renamed from: setScalingType */
    public void m156470x40429d9f(org.p3371xd0ce3e8d.C29847x54db44ae.ScalingType scalingType, org.p3371xd0ce3e8d.C29847x54db44ae.ScalingType scalingType2) {
        org.p3371xd0ce3e8d.C29882xd5f5f0a7.m156473x7c0fa5d4();
        this.f76026xa63bba19.m156240x40429d9f(scalingType, scalingType2);
        requestLayout();
    }

    public TextureViewSurfaceTextureListenerC29879xa98b8b23(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f76026xa63bba19 = new org.p3371xd0ce3e8d.C29847x54db44ae.VideoLayoutMeasure();
        java.lang.String m156455x4a068e2f = m156455x4a068e2f();
        this.f76021xe913fbb9 = m156455x4a068e2f;
        this.f76019x7b0182ed = new org.p3371xd0ce3e8d.TextureViewSurfaceTextureListenerC29878x1ee662f2(m156455x4a068e2f);
        setSurfaceTextureListener(this);
    }
}
