package com.tencent.mm.dynamicbackground.view;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\u000f\u0010B\u001d\b\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\u0011"}, d2 = {"Lcom/tencent/mm/dynamicbackground/view/DynamicBackgroundGLSurfaceView;", "Lcom/tencent/mm/dynamicbackground/view/GameGLSurfaceView;", "", "show", "Ljz5/f0;", "setShowGradientView", "Landroid/view/View;", "gradientColorBackgroundView", "setGradientBackgroundView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "nq/f", "nq/g", "dynamicbg_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes8.dex */
public final class DynamicBackgroundGLSurfaceView extends com.tencent.mm.dynamicbackground.view.GameGLSurfaceView {

    /* renamed from: t, reason: collision with root package name */
    public final nq.f f64878t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DynamicBackgroundGLSurfaceView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.h(context, "context");
        setEGLContextClientVersion(2);
        setEGLConfigChooser(new nq.k(this, 8, 8, 8, 8, 16, 8));
        setPreserveEGLContextOnPause(true);
        nq.f fVar = new nq.f(context);
        this.f64878t = fVar;
        setRenderer(fVar);
        nq.s sVar = new nq.s(this.f64881e);
        this.f64882f = sVar;
        sVar.f338901e = new nq.i(this);
        sVar.start();
        getHolder().setFormat(-3);
        fVar.f338875i = this;
    }

    public void c() {
        mq.h.b("MicroMsg.GameGLSurfaceView", "onResume", new java.lang.Object[0]);
        nq.s sVar = this.f64882f;
        if (sVar.f338902f.isAlive()) {
            sVar.f338903g.sendEmptyMessage(3);
        }
    }

    @Override // com.tencent.mm.dynamicbackground.view.GameGLSurfaceView, android.view.SurfaceView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mq.h.b("MicroMsg.DynamicBgSurfaceView", "alvinluo onAttachedToWindow", new java.lang.Object[0]);
    }

    @Override // com.tencent.mm.dynamicbackground.view.GameGLSurfaceView, android.view.SurfaceView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mq.h.b("MicroMsg.DynamicBgSurfaceView", "alvinluo onDetachedFromWindow", new java.lang.Object[0]);
    }

    @Override // android.view.View
    public void onVisibilityChanged(android.view.View changedView, int i17) {
        kotlin.jvm.internal.o.h(changedView, "changedView");
        super.onVisibilityChanged(changedView, i17);
        mq.h.b("MicroMsg.DynamicBgSurfaceView", "alvinluo onVisibilityChanged: %d", java.lang.Integer.valueOf(i17));
    }

    public final void setGradientBackgroundView(android.view.View gradientColorBackgroundView) {
        kotlin.jvm.internal.o.h(gradientColorBackgroundView, "gradientColorBackgroundView");
        nq.f fVar = this.f64878t;
        if (fVar != null) {
            fVar.f338871e = gradientColorBackgroundView;
        }
    }

    public final void setShowGradientView(boolean z17) {
        nq.f fVar = this.f64878t;
        if (fVar != null) {
            fVar.f338872f = z17;
            if (z17) {
                return;
            }
            fVar.f338874h = false;
        }
    }

    @Override // com.tencent.mm.dynamicbackground.view.GameGLSurfaceView, android.view.SurfaceHolder.Callback
    public void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
        super.surfaceCreated(surfaceHolder);
        mq.h.b("MicroMsg.DynamicBgSurfaceView", "alvinluo surfaceCreated", new java.lang.Object[0]);
    }

    @Override // com.tencent.mm.dynamicbackground.view.GameGLSurfaceView, android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(android.view.SurfaceHolder surfaceHolder) {
        super.surfaceDestroyed(surfaceHolder);
        mq.h.b("MicroMsg.DynamicBgSurfaceView", "alvinluo surfaceDestroyed", new java.lang.Object[0]);
        nq.f fVar = this.f64878t;
        if (fVar != null) {
            fVar.f338873g = false;
        }
    }
}
