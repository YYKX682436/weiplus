package io.p3277xa1c40a32.p3283xc97dd6cb;

/* renamed from: io.clipworks.displaysys.DSRenderView */
/* loaded from: classes5.dex */
public class SurfaceHolderCallbackC28529xf54f34a extends android.view.SurfaceView implements android.view.SurfaceHolder.Callback {

    /* renamed from: proxy */
    private io.p3277xa1c40a32.p3283xc97dd6cb.SurfaceHolderCallbackC28529xf54f34a.Proxy f70388x65fca6e;

    /* renamed from: io.clipworks.displaysys.DSRenderView$Proxy */
    /* loaded from: classes5.dex */
    public static class Proxy extends io.p3277xa1c40a32.p3283xc97dd6cb.AbstractC28530xd96ac6fa {

        /* renamed from: dsRenderViewWeakRef */
        private final java.lang.ref.WeakReference<io.p3277xa1c40a32.p3283xc97dd6cb.SurfaceHolderCallbackC28529xf54f34a> f70389x82838751;

        public Proxy(java.lang.ref.WeakReference<io.p3277xa1c40a32.p3283xc97dd6cb.SurfaceHolderCallbackC28529xf54f34a> weakReference) {
            this.f70389x82838751 = weakReference;
        }

        @Override // io.p3277xa1c40a32.p3283xc97dd6cb.AbstractC28530xd96ac6fa
        /* renamed from: getHeight */
        public int mo136911x1c4fb41d() {
            io.p3277xa1c40a32.p3283xc97dd6cb.SurfaceHolderCallbackC28529xf54f34a surfaceHolderCallbackC28529xf54f34a = this.f70389x82838751.get();
            if (surfaceHolderCallbackC28529xf54f34a != null) {
                return surfaceHolderCallbackC28529xf54f34a.getHeight();
            }
            return 0;
        }

        @Override // io.p3277xa1c40a32.p3283xc97dd6cb.AbstractC28530xd96ac6fa
        /* renamed from: getScaleFactor */
        public float mo136912x91b49603() {
            io.p3277xa1c40a32.p3283xc97dd6cb.SurfaceHolderCallbackC28529xf54f34a surfaceHolderCallbackC28529xf54f34a = this.f70389x82838751.get();
            if (surfaceHolderCallbackC28529xf54f34a != null) {
                return surfaceHolderCallbackC28529xf54f34a.getResources().getDisplayMetrics().density;
            }
            return 0.0f;
        }

        @Override // io.p3277xa1c40a32.p3283xc97dd6cb.AbstractC28530xd96ac6fa
        /* renamed from: getVisibility */
        public int mo136914x61f71b08() {
            io.p3277xa1c40a32.p3283xc97dd6cb.SurfaceHolderCallbackC28529xf54f34a surfaceHolderCallbackC28529xf54f34a = this.f70389x82838751.get();
            if (surfaceHolderCallbackC28529xf54f34a != null) {
                return surfaceHolderCallbackC28529xf54f34a.getVisibility();
            }
            return 8;
        }

        @Override // io.p3277xa1c40a32.p3283xc97dd6cb.AbstractC28530xd96ac6fa
        /* renamed from: getWidth */
        public int mo136915x755bd410() {
            io.p3277xa1c40a32.p3283xc97dd6cb.SurfaceHolderCallbackC28529xf54f34a surfaceHolderCallbackC28529xf54f34a = this.f70389x82838751.get();
            if (surfaceHolderCallbackC28529xf54f34a != null) {
                return surfaceHolderCallbackC28529xf54f34a.getWidth();
            }
            return 0;
        }

        @Override // io.p3277xa1c40a32.p3283xc97dd6cb.AbstractC28530xd96ac6fa
        /* renamed from: getX */
        public float mo136916x305bc2() {
            io.p3277xa1c40a32.p3283xc97dd6cb.SurfaceHolderCallbackC28529xf54f34a surfaceHolderCallbackC28529xf54f34a = this.f70389x82838751.get();
            if (surfaceHolderCallbackC28529xf54f34a != null) {
                return surfaceHolderCallbackC28529xf54f34a.getX();
            }
            return 0.0f;
        }

        @Override // io.p3277xa1c40a32.p3283xc97dd6cb.AbstractC28530xd96ac6fa
        /* renamed from: getY */
        public float mo136917x305bc3() {
            io.p3277xa1c40a32.p3283xc97dd6cb.SurfaceHolderCallbackC28529xf54f34a surfaceHolderCallbackC28529xf54f34a = this.f70389x82838751.get();
            if (surfaceHolderCallbackC28529xf54f34a != null) {
                return surfaceHolderCallbackC28529xf54f34a.getY();
            }
            return 0.0f;
        }
    }

    public SurfaceHolderCallbackC28529xf54f34a(android.content.Context context) {
        this(context, null, 0, 0);
    }

    /* renamed from: getDSViewProxy */
    public io.p3277xa1c40a32.p3283xc97dd6cb.AbstractC28530xd96ac6fa m136921x4fd765e4() {
        return this.f70388x65fca6e;
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f70388x65fca6e.m136935xff4dcfe7();
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f70388x65fca6e.m136936x8e7862a4();
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        this.f70388x65fca6e.m136937x259503e6(i17, i18, i19, i27);
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return this.f70388x65fca6e.m136938xac03f7c3(motionEvent);
    }

    @Override // android.view.View
    public void onVisibilityAggregated(boolean z17) {
        super.onVisibilityAggregated(z17);
        this.f70388x65fca6e.m136939x97a7a1f5(z17);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(android.view.SurfaceHolder surfaceHolder, int i17, int i18, int i19) {
        this.f70388x65fca6e.mo136918xa36f50f0(i17, i18, i19);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
        this.f70388x65fca6e.m136940xb4b26d24(surfaceHolder.getSurface());
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(android.view.SurfaceHolder surfaceHolder) {
        this.f70388x65fca6e.m136941x26cc0ebf();
    }

    /* renamed from: teardown */
    public void m136922x9cd96604() {
    }

    public SurfaceHolderCallbackC28529xf54f34a(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SurfaceHolderCallbackC28529xf54f34a(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        this(context, attributeSet, i17, 0);
    }

    public SurfaceHolderCallbackC28529xf54f34a(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18) {
        super(context, attributeSet, i17, i18);
        this.f70388x65fca6e = new io.p3277xa1c40a32.p3283xc97dd6cb.SurfaceHolderCallbackC28529xf54f34a.Proxy(new java.lang.ref.WeakReference(this));
        getHolder().addCallback(this);
    }
}
