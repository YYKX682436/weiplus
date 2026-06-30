package io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f;

/* renamed from: io.flutter.embedding.android.SwapSurfaceViewRenderSurface */
/* loaded from: classes15.dex */
public class SurfaceHolderCallbackC28575x40f7bb38 extends android.view.SurfaceView implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28651x6b183344, android.view.SurfaceHolder.Callback {

    /* renamed from: controller */
    private io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28570xa4686eb6 f70772x25fe639c;

    /* renamed from: nextSurfaceUpdateCallback */
    private java.lang.Runnable f70773xfcfc9508;

    /* renamed from: surfaceAvailable */
    private boolean f70774x2e34b09c;

    public SurfaceHolderCallbackC28575x40f7bb38(android.content.Context context) {
        super(context);
        this.f70773xfcfc9508 = null;
        this.f70774x2e34b09c = true;
    }

    /* renamed from: invokeNextSurfaceUpdate */
    private void m137393x52eade0b() {
        if (this.f70773xfcfc9508 != null) {
            android.view.Choreographer.getInstance().postFrameCallback(new android.view.Choreographer.FrameCallback() { // from class: io.flutter.embedding.android.SwapSurfaceViewRenderSurface$$a
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j17) {
                    io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.SurfaceHolderCallbackC28575x40f7bb38.this.m137394xca42d53a(j17);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$invokeNextSurfaceUpdate$0 */
    public /* synthetic */ void m137394xca42d53a(long j17) {
        java.lang.Runnable runnable = this.f70773xfcfc9508;
        if (runnable != null) {
            runnable.run();
            this.f70773xfcfc9508 = null;
        }
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28651x6b183344
    /* renamed from: attachToFlutterView */
    public void mo137395x65cf2121(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1 c28553x45ef20c1) {
        this.f70772x25fe639c = new io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28570xa4686eb6(c28553x45ef20c1, this);
        c28553x45ef20c1.addView(this, new android.view.ViewGroup.LayoutParams(1, 1));
        setZOrderOnTop(false);
        getHolder().addCallback(this);
    }

    @Override // android.view.SurfaceView, android.view.View
    public boolean gatherTransparentRegion(android.graphics.Region region) {
        if (getAlpha() < 1.0f || !this.f70774x2e34b09c) {
            return false;
        }
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        int i17 = iArr[0];
        region.op(i17, iArr[1], (getRight() + i17) - getLeft(), (iArr[1] + getBottom()) - getTop(), android.graphics.Region.Op.DIFFERENCE);
        return true;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28651x6b183344
    /* renamed from: onNextSurfaceUpdate */
    public void mo137396xf93a2f84(java.lang.Runnable runnable) {
        this.f70773xfcfc9508 = runnable;
        if (this.f70774x2e34b09c) {
            m137393x52eade0b();
        }
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28651x6b183344
    /* renamed from: resumeSurface */
    public void mo137397xd9789fc0() {
        this.f70772x25fe639c.m137388xd9789fc0();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(android.view.SurfaceHolder surfaceHolder, int i17, int i18, int i19) {
        this.f70772x25fe639c.m137391xf2544486(i18, i19);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
        this.f70774x2e34b09c = true;
        this.f70772x25fe639c.m137389x2e34b09c(surfaceHolder.getSurface());
        m137393x52eade0b();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(android.view.SurfaceHolder surfaceHolder) {
        this.f70774x2e34b09c = false;
        this.f70772x25fe639c.m137390xd05ebbec();
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28651x6b183344
    /* renamed from: swapSurface */
    public void mo137398x614179a() {
        this.f70772x25fe639c.m137392x614179a();
    }

    public SurfaceHolderCallbackC28575x40f7bb38(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f70773xfcfc9508 = null;
        this.f70774x2e34b09c = true;
    }

    public SurfaceHolderCallbackC28575x40f7bb38(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f70773xfcfc9508 = null;
        this.f70774x2e34b09c = true;
    }
}
