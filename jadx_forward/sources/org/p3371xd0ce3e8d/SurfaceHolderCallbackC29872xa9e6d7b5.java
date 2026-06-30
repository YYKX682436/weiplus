package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.SurfaceViewRenderer */
/* loaded from: classes16.dex */
public class SurfaceHolderCallbackC29872xa9e6d7b5 extends android.view.SurfaceView implements android.view.SurfaceHolder.Callback, org.p3371xd0ce3e8d.InterfaceC29908xc6e4d18e, org.p3371xd0ce3e8d.C29847x54db44ae.RendererEvents, org.p3371xd0ce3e8d.InterfaceC29791x2ddf4c2c {
    private static final java.lang.String TAG = "SurfaceViewRenderer";

    /* renamed from: eglRenderer */
    private final org.p3371xd0ce3e8d.SurfaceHolderCallbackC29862x92863c20 f75988x7b0182ed;

    /* renamed from: enableFixedSize */
    private boolean f75989xa7f8df52;

    /* renamed from: rendererEvents */
    private org.p3371xd0ce3e8d.C29847x54db44ae.RendererEvents f75990x945d2fbc;

    /* renamed from: resourceName */
    private final java.lang.String f75991xe913fbb9;

    /* renamed from: rotatedFrameHeight */
    private int f75992x7fed8ecb;

    /* renamed from: rotatedFrameWidth */
    private int f75993xb260eba2;

    /* renamed from: surfaceHeight */
    private int f75994x59c7434;

    /* renamed from: surfaceWidth */
    private int f75995xdffb3519;

    /* renamed from: videoLayoutMeasure */
    private final org.p3371xd0ce3e8d.C29847x54db44ae.VideoLayoutMeasure f75996xa63bba19;

    /* renamed from: org.webrtc.SurfaceViewRenderer$1, reason: invalid class name */
    /* loaded from: classes16.dex */
    public class AnonymousClass1 implements org.p3371xd0ce3e8d.AbstractC29764xde6b2acd.FrameListener {

        /* renamed from: called */
        private final java.util.concurrent.atomic.AtomicBoolean f75997xae79677d = new java.util.concurrent.atomic.AtomicBoolean(false);

        /* renamed from: val$onCaptureListener */
        final /* synthetic */ org.p3371xd0ce3e8d.InterfaceC29791x2ddf4c2c.OnCaptureListener f75999x79260778;

        public AnonymousClass1(org.p3371xd0ce3e8d.InterfaceC29791x2ddf4c2c.OnCaptureListener onCaptureListener) {
            this.f75999x79260778 = onCaptureListener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$onFrame$0 */
        public /* synthetic */ void m156439xa118773d(org.p3371xd0ce3e8d.InterfaceC29791x2ddf4c2c.OnCaptureListener onCaptureListener, android.graphics.Bitmap bitmap) {
            org.p3371xd0ce3e8d.SurfaceHolderCallbackC29872xa9e6d7b5.this.m156433xb797431d(this);
            onCaptureListener.mo145457x7095c867(bitmap);
        }

        @Override // org.p3371xd0ce3e8d.AbstractC29764xde6b2acd.FrameListener
        /* renamed from: onFrame */
        public void mo155504xaf987ece(final android.graphics.Bitmap bitmap) {
            if (this.f75997xae79677d.getAndSet(true)) {
                return;
            }
            org.p3371xd0ce3e8d.SurfaceHolderCallbackC29872xa9e6d7b5 surfaceHolderCallbackC29872xa9e6d7b5 = org.p3371xd0ce3e8d.SurfaceHolderCallbackC29872xa9e6d7b5.this;
            final org.p3371xd0ce3e8d.InterfaceC29791x2ddf4c2c.OnCaptureListener onCaptureListener = this.f75999x79260778;
            surfaceHolderCallbackC29872xa9e6d7b5.m156425x768020e8(new java.lang.Runnable() { // from class: org.webrtc.SurfaceViewRenderer$1$$a
                @Override // java.lang.Runnable
                public final void run() {
                    org.p3371xd0ce3e8d.SurfaceHolderCallbackC29872xa9e6d7b5.AnonymousClass1.this.m156439xa118773d(onCaptureListener, bitmap);
                }
            });
        }
    }

    public SurfaceHolderCallbackC29872xa9e6d7b5(android.content.Context context) {
        super(context);
        this.f75996xa63bba19 = new org.p3371xd0ce3e8d.C29847x54db44ae.VideoLayoutMeasure();
        java.lang.String m156422x4a068e2f = m156422x4a068e2f();
        this.f75991xe913fbb9 = m156422x4a068e2f;
        org.p3371xd0ce3e8d.SurfaceHolderCallbackC29862x92863c20 surfaceHolderCallbackC29862x92863c20 = new org.p3371xd0ce3e8d.SurfaceHolderCallbackC29862x92863c20(m156422x4a068e2f);
        this.f75988x7b0182ed = surfaceHolderCallbackC29862x92863c20;
        getHolder().addCallback(this);
        getHolder().addCallback(surfaceHolderCallbackC29862x92863c20);
    }

    /* renamed from: getResourceName */
    private java.lang.String m156422x4a068e2f() {
        try {
            return getResources().getResourceEntryName(getId());
        } catch (android.content.res.Resources.NotFoundException unused) {
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onFrameResolutionChanged$0 */
    public /* synthetic */ void m156423xbd382043(int i17, int i18) {
        this.f75993xb260eba2 = i17;
        this.f75992x7fed8ecb = i18;
        m156426x687269c5();
        requestLayout();
    }

    /* renamed from: logD */
    private void m156424x32c580(java.lang.String str) {
        org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, this.f75991xe913fbb9 + ": " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: postOrRun */
    public void m156425x768020e8(java.lang.Runnable runnable) {
        if (java.lang.Thread.currentThread() == android.os.Looper.getMainLooper().getThread()) {
            runnable.run();
        } else {
            post(runnable);
        }
    }

    /* renamed from: updateSurfaceSize */
    private void m156426x687269c5() {
        org.p3371xd0ce3e8d.C29882xd5f5f0a7.m156473x7c0fa5d4();
        if (!this.f75989xa7f8df52 || this.f75993xb260eba2 == 0 || this.f75992x7fed8ecb == 0 || getWidth() == 0 || getHeight() == 0) {
            this.f75994x59c7434 = 0;
            this.f75995xdffb3519 = 0;
            getHolder().setSizeFromLayout();
            return;
        }
        float width = getWidth() / getHeight();
        int i17 = this.f75993xb260eba2;
        int i18 = this.f75992x7fed8ecb;
        if (i17 / i18 > width) {
            i17 = (int) (i18 * width);
        } else {
            i18 = (int) (i17 / width);
        }
        int min = java.lang.Math.min(getWidth(), i17);
        int min2 = java.lang.Math.min(getHeight(), i18);
        m156424x32c580("updateSurfaceSize. Layout size: " + getWidth() + "x" + getHeight() + ", frame size: " + this.f75993xb260eba2 + "x" + this.f75992x7fed8ecb + ", requested surface size: " + min + "x" + min2 + ", old surface size: " + this.f75995xdffb3519 + "x" + this.f75994x59c7434);
        if (min == this.f75995xdffb3519 && min2 == this.f75994x59c7434) {
            return;
        }
        this.f75995xdffb3519 = min;
        this.f75994x59c7434 = min2;
        getHolder().setFixedSize(min, min2);
    }

    /* renamed from: addFrameListener */
    public void m156428xb2909a20(org.p3371xd0ce3e8d.AbstractC29764xde6b2acd.FrameListener frameListener, float f17, org.p3371xd0ce3e8d.C29847x54db44ae.GlDrawer glDrawer) {
        this.f75988x7b0182ed.m155479xb2909a20(frameListener, f17, glDrawer);
    }

    /* renamed from: clearImage */
    public void m156429xd318eb0e() {
        this.f75988x7b0182ed.m155481xd318eb0e();
    }

    /* renamed from: disableFpsReduction */
    public void m156430x60da1692() {
        this.f75988x7b0182ed.mo155485x60da1692();
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29791x2ddf4c2c
    /* renamed from: getFrameWithGLCallback */
    public org.p3371xd0ce3e8d.AbstractC29764xde6b2acd.OnFrameInGLEnv mo155619x2fdd9927() {
        return this.f75988x7b0182ed.m155486x2fdd9927();
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29791x2ddf4c2c
    /* renamed from: init */
    public void mo155620x316510(org.p3371xd0ce3e8d.InterfaceC29759xf7e285db.Context context, org.p3371xd0ce3e8d.C29847x54db44ae.RendererEvents rendererEvents) {
        mo155621x316510(context, rendererEvents, org.p3371xd0ce3e8d.InterfaceC29759xf7e285db.f75304xe0dfc26d, new org.p3371xd0ce3e8d.C29781x502b66da());
    }

    @Override // org.p3371xd0ce3e8d.C29847x54db44ae.RendererEvents
    /* renamed from: onFirstFrameRendered */
    public void mo51494x452e7cb1() {
        org.p3371xd0ce3e8d.C29847x54db44ae.RendererEvents rendererEvents = this.f75990x945d2fbc;
        if (rendererEvents != null) {
            rendererEvents.mo51494x452e7cb1();
        }
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29908xc6e4d18e
    /* renamed from: onFrame */
    public void mo155128xaf987ece(org.p3371xd0ce3e8d.C29904x150215d2 c29904x150215d2) {
        this.f75988x7b0182ed.mo155128xaf987ece(c29904x150215d2);
    }

    @Override // org.p3371xd0ce3e8d.C29847x54db44ae.RendererEvents
    /* renamed from: onFrameResolutionChanged */
    public void mo51495xd8b11f3a(final int i17, int i18, int i19) {
        org.p3371xd0ce3e8d.C29847x54db44ae.RendererEvents rendererEvents = this.f75990x945d2fbc;
        if (rendererEvents != null) {
            rendererEvents.mo51495xd8b11f3a(i17, i18, i19);
        }
        final int i27 = (i19 == 0 || i19 == 180) ? i17 : i18;
        if (i19 == 0 || i19 == 180) {
            i17 = i18;
        }
        m156425x768020e8(new java.lang.Runnable() { // from class: org.webrtc.SurfaceViewRenderer$$a
            @Override // java.lang.Runnable
            public final void run() {
                org.p3371xd0ce3e8d.SurfaceHolderCallbackC29872xa9e6d7b5.this.m156423xbd382043(i27, i17);
            }
        });
    }

    @Override // android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        org.p3371xd0ce3e8d.C29882xd5f5f0a7.m156473x7c0fa5d4();
        this.f75988x7b0182ed.m155499x397cc4c7((i19 - i17) / (i27 - i18));
        m156426x687269c5();
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onMeasure(int i17, int i18) {
        org.p3371xd0ce3e8d.C29882xd5f5f0a7.m156473x7c0fa5d4();
        android.graphics.Point m156238x37eda55e = this.f75996xa63bba19.m156238x37eda55e(i17, i18, this.f75993xb260eba2, this.f75992x7fed8ecb);
        setMeasuredDimension(m156238x37eda55e.x, m156238x37eda55e.y);
        m156424x32c580("onMeasure(). New size: " + m156238x37eda55e.x + "x" + m156238x37eda55e.y);
    }

    @Override // org.p3371xd0ce3e8d.C29847x54db44ae.RendererEvents
    /* renamed from: onRenderStats */
    public void mo51496xbae2a94a(org.p3371xd0ce3e8d.C29838x24207153 c29838x24207153) {
        org.p3371xd0ce3e8d.C29847x54db44ae.RendererEvents rendererEvents = this.f75990x945d2fbc;
        if (rendererEvents != null) {
            rendererEvents.mo51496xbae2a94a(c29838x24207153);
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(android.view.View view, int i17) {
        super.onVisibilityChanged(view, i17);
        this.f75988x7b0182ed.m155490x4fca7ea6(i17);
    }

    /* renamed from: pauseVideo */
    public void m156431xfcac4825() {
        this.f75988x7b0182ed.mo155491xfcac4825();
    }

    /* renamed from: release */
    public void m156432x41012807() {
        this.f75988x7b0182ed.m155493x41012807();
    }

    /* renamed from: removeFrameListener */
    public void m156433xb797431d(org.p3371xd0ce3e8d.AbstractC29764xde6b2acd.FrameListener frameListener) {
        this.f75988x7b0182ed.m155495xb797431d(frameListener);
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29791x2ddf4c2c
    /* renamed from: requestCaptureOnce */
    public void mo155622x299f1cd8(org.p3371xd0ce3e8d.InterfaceC29791x2ddf4c2c.OnCaptureListener onCaptureListener) {
        m156427xb2909a20(new org.p3371xd0ce3e8d.SurfaceHolderCallbackC29872xa9e6d7b5.AnonymousClass1(onCaptureListener), 1.0f);
    }

    /* renamed from: setEnableHardwareScaler */
    public void m156434xd07e6055(boolean z17) {
        org.p3371xd0ce3e8d.C29882xd5f5f0a7.m156473x7c0fa5d4();
        this.f75989xa7f8df52 = z17;
        m156426x687269c5();
    }

    /* renamed from: setFpsReduction */
    public void m156435x7a11490c(float f17) {
        this.f75988x7b0182ed.mo155497x7a11490c(f17);
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29791x2ddf4c2c
    /* renamed from: setFrameWithGLCallback */
    public void mo155623x7e22589b(org.p3371xd0ce3e8d.AbstractC29764xde6b2acd.OnFrameInGLEnv onFrameInGLEnv) {
        this.f75988x7b0182ed.m155498x7e22589b(onFrameInGLEnv);
    }

    /* renamed from: setMirror */
    public void m156436x1849c2c1(boolean z17) {
        this.f75988x7b0182ed.m155500x1849c2c1(z17);
    }

    /* renamed from: setScalingType */
    public void m156437x40429d9f(org.p3371xd0ce3e8d.C29847x54db44ae.ScalingType scalingType) {
        org.p3371xd0ce3e8d.C29882xd5f5f0a7.m156473x7c0fa5d4();
        this.f75996xa63bba19.m156239x40429d9f(scalingType);
        requestLayout();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(android.view.SurfaceHolder surfaceHolder, int i17, int i18, int i19) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
        org.p3371xd0ce3e8d.C29882xd5f5f0a7.m156473x7c0fa5d4();
        this.f75994x59c7434 = 0;
        this.f75995xdffb3519 = 0;
        m156426x687269c5();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(android.view.SurfaceHolder surfaceHolder) {
    }

    /* renamed from: addFrameListener */
    public void m156427xb2909a20(org.p3371xd0ce3e8d.AbstractC29764xde6b2acd.FrameListener frameListener, float f17) {
        this.f75988x7b0182ed.m155478xb2909a20(frameListener, f17);
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29791x2ddf4c2c
    /* renamed from: init */
    public void mo155621x316510(org.p3371xd0ce3e8d.InterfaceC29759xf7e285db.Context context, org.p3371xd0ce3e8d.C29847x54db44ae.RendererEvents rendererEvents, int[] iArr, org.p3371xd0ce3e8d.C29847x54db44ae.GlDrawer glDrawer) {
        org.p3371xd0ce3e8d.C29882xd5f5f0a7.m156473x7c0fa5d4();
        this.f75990x945d2fbc = rendererEvents;
        this.f75993xb260eba2 = 0;
        this.f75992x7fed8ecb = 0;
        this.f75988x7b0182ed.m156379x316510(context, this, iArr, glDrawer);
    }

    /* renamed from: setScalingType */
    public void m156438x40429d9f(org.p3371xd0ce3e8d.C29847x54db44ae.ScalingType scalingType, org.p3371xd0ce3e8d.C29847x54db44ae.ScalingType scalingType2) {
        org.p3371xd0ce3e8d.C29882xd5f5f0a7.m156473x7c0fa5d4();
        this.f75996xa63bba19.m156240x40429d9f(scalingType, scalingType2);
        requestLayout();
    }

    public SurfaceHolderCallbackC29872xa9e6d7b5(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f75996xa63bba19 = new org.p3371xd0ce3e8d.C29847x54db44ae.VideoLayoutMeasure();
        java.lang.String m156422x4a068e2f = m156422x4a068e2f();
        this.f75991xe913fbb9 = m156422x4a068e2f;
        org.p3371xd0ce3e8d.SurfaceHolderCallbackC29862x92863c20 surfaceHolderCallbackC29862x92863c20 = new org.p3371xd0ce3e8d.SurfaceHolderCallbackC29862x92863c20(m156422x4a068e2f);
        this.f75988x7b0182ed = surfaceHolderCallbackC29862x92863c20;
        getHolder().addCallback(this);
        getHolder().addCallback(surfaceHolderCallbackC29862x92863c20);
    }
}
