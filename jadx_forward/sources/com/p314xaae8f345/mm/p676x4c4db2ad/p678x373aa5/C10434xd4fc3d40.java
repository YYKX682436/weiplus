package com.p314xaae8f345.mm.p676x4c4db2ad.p678x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\u000f\u0010B\u001d\b\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\u0011"}, d2 = {"Lcom/tencent/mm/dynamicbackground/view/DynamicBackgroundGLSurfaceView;", "Lcom/tencent/mm/dynamicbackground/view/GameGLSurfaceView;", "", "show", "Ljz5/f0;", "setShowGradientView", "Landroid/view/View;", "gradientColorBackgroundView", "setGradientBackgroundView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "nq/f", "nq/g", "dynamicbg_release"}, k = 1, mv = {1, 4, 0})
/* renamed from: com.tencent.mm.dynamicbackground.view.DynamicBackgroundGLSurfaceView */
/* loaded from: classes8.dex */
public final class C10434xd4fc3d40 extends com.p314xaae8f345.mm.p676x4c4db2ad.p678x373aa5.SurfaceHolderCallback2C10435xb52e77fb {

    /* renamed from: t, reason: collision with root package name */
    public final nq.f f146411t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10434xd4fc3d40(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.h(context, "context");
        m43664xdbab8186(2);
        m43662x81a19c31(new nq.k(this, 8, 8, 8, 8, 16, 8));
        m43669xa3ea4a24(true);
        nq.f fVar = new nq.f(context);
        this.f146411t = fVar;
        m43671x5913df45(fVar);
        nq.s sVar = new nq.s(this.f146414e);
        this.f146415f = sVar;
        sVar.f420434e = new nq.i(this);
        sVar.start();
        getHolder().setFormat(-3);
        fVar.f420408i = this;
    }

    public void c() {
        mq.h.b("MicroMsg.GameGLSurfaceView", "onResume", new java.lang.Object[0]);
        nq.s sVar = this.f146415f;
        if (sVar.f420435f.isAlive()) {
            sVar.f420436g.sendEmptyMessage(3);
        }
    }

    @Override // com.p314xaae8f345.mm.p676x4c4db2ad.p678x373aa5.SurfaceHolderCallback2C10435xb52e77fb, android.view.SurfaceView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mq.h.b("MicroMsg.DynamicBgSurfaceView", "alvinluo onAttachedToWindow", new java.lang.Object[0]);
    }

    @Override // com.p314xaae8f345.mm.p676x4c4db2ad.p678x373aa5.SurfaceHolderCallback2C10435xb52e77fb, android.view.SurfaceView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mq.h.b("MicroMsg.DynamicBgSurfaceView", "alvinluo onDetachedFromWindow", new java.lang.Object[0]);
    }

    @Override // android.view.View
    public void onVisibilityChanged(android.view.View changedView, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.h(changedView, "changedView");
        super.onVisibilityChanged(changedView, i17);
        mq.h.b("MicroMsg.DynamicBgSurfaceView", "alvinluo onVisibilityChanged: %d", java.lang.Integer.valueOf(i17));
    }

    /* renamed from: setGradientBackgroundView */
    public final void m43652xa32f3f45(android.view.View gradientColorBackgroundView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.h(gradientColorBackgroundView, "gradientColorBackgroundView");
        nq.f fVar = this.f146411t;
        if (fVar != null) {
            fVar.f420404e = gradientColorBackgroundView;
        }
    }

    /* renamed from: setShowGradientView */
    public final void m43653x16ae2614(boolean z17) {
        nq.f fVar = this.f146411t;
        if (fVar != null) {
            fVar.f420405f = z17;
            if (z17) {
                return;
            }
            fVar.f420407h = false;
        }
    }

    @Override // com.p314xaae8f345.mm.p676x4c4db2ad.p678x373aa5.SurfaceHolderCallback2C10435xb52e77fb, android.view.SurfaceHolder.Callback
    public void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
        super.surfaceCreated(surfaceHolder);
        mq.h.b("MicroMsg.DynamicBgSurfaceView", "alvinluo surfaceCreated", new java.lang.Object[0]);
    }

    @Override // com.p314xaae8f345.mm.p676x4c4db2ad.p678x373aa5.SurfaceHolderCallback2C10435xb52e77fb, android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(android.view.SurfaceHolder surfaceHolder) {
        super.surfaceDestroyed(surfaceHolder);
        mq.h.b("MicroMsg.DynamicBgSurfaceView", "alvinluo surfaceDestroyed", new java.lang.Object[0]);
        nq.f fVar = this.f146411t;
        if (fVar != null) {
            fVar.f420406g = false;
        }
    }
}
