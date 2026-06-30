package com.tencent.mm.live.core.view;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\"\u0010\f\u001a\u00020\n2\u001a\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bJ\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\tH\u0016R\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001d"}, d2 = {"Lcom/tencent/mm/live/core/view/LiveVideoView;", "Lcom/tencent/rtmp/ui/TXCloudVideoView;", "", "getSurfaceFormat", "Landroid/view/TextureView;", "getVideoView", "Landroid/view/SurfaceView;", "getSurfaceView", "Lkotlin/Function2;", "", "Ljz5/f0;", "callback", "setPreviewTouchListener", "alpha", "setAlpha", "Lcom/tencent/mm/live/core/view/DebugCanvasView;", "f", "Lcom/tencent/mm/live/core/view/DebugCanvasView;", "getDebugCanvasView", "()Lcom/tencent/mm/live/core/view/DebugCanvasView;", "setDebugCanvasView", "(Lcom/tencent/mm/live/core/view/DebugCanvasView;)V", "debugCanvasView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-core_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public class LiveVideoView extends com.tencent.rtmp.ui.TXCloudVideoView {

    /* renamed from: d, reason: collision with root package name */
    public long f68619d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.p f68620e;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public com.tencent.mm.live.core.view.DebugCanvasView debugCanvasView;

    /* renamed from: g, reason: collision with root package name */
    public android.view.SurfaceView f68622g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LiveVideoView(android.content.Context r2) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.g(r2, r0)
            android.content.Context r2 = r2.getApplicationContext()
            java.lang.String r0 = "getApplicationContext(...)"
            kotlin.jvm.internal.o.f(r2, r0)
            r0 = 0
            r1.<init>(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.live.core.view.LiveVideoView.<init>(android.content.Context):void");
    }

    private final int getSurfaceFormat() {
        return (getContext().getResources().getConfiguration().orientation != 2 || com.tencent.mm.ui.bk.A() || com.tencent.mm.ui.bk.Q()) ? -3 : -1;
    }

    public final android.view.SurfaceView a(boolean z17) {
        android.view.View view;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[useSurfaceView] hasSurfaceView=");
        sb6.append(this.f68622g != null);
        sb6.append(" isTransparent=");
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i("LiveVideoView", sb6.toString());
        android.view.SurfaceView surfaceView = this.f68622g;
        if (surfaceView == null) {
            surfaceView = new com.tencent.mm.live.core.view.FinderLiveSurfaceView(getContext());
            if (z17) {
                if (android.os.Build.VERSION.SDK_INT >= 26) {
                    surfaceView.getHolder().setFormat(getSurfaceFormat());
                }
                surfaceView.setAlpha(0.0f);
            } else {
                surfaceView.setAlpha(1.0f);
            }
        }
        removeView(getVideoView());
        if (!kotlin.jvm.internal.o.b(surfaceView, this.f68622g) && (view = this.f68622g) != null) {
            removeView(view);
        }
        if (indexOfChild(surfaceView) < 0) {
            android.view.ViewGroup.LayoutParams layoutParams = surfaceView.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
            }
            addView(surfaceView, layoutParams);
        }
        this.f68622g = surfaceView;
        setAlpha(1.0f);
        return surfaceView;
    }

    @Override // com.tencent.rtmp.ui.TXCloudVideoView
    public void addVideoView(android.view.TextureView textureView) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("addVideoView(");
        sb6.append(hashCode());
        sb6.append(") TextureView:");
        sb6.append(textureView != null ? textureView.hashCode() : 0);
        com.tencent.mars.xlog.Log.i("LiveVideoView", sb6.toString());
        super.addVideoView(textureView);
    }

    public final com.tencent.mm.live.core.view.DebugCanvasView getDebugCanvasView() {
        return this.debugCanvasView;
    }

    @Override // com.tencent.rtmp.ui.TXCloudVideoView
    /* renamed from: getSurfaceView, reason: from getter */
    public android.view.SurfaceView getF68622g() {
        return this.f68622g;
    }

    @Override // com.tencent.rtmp.ui.TXCloudVideoView
    public android.view.TextureView getVideoView() {
        if (this.f68622g != null) {
            return null;
        }
        return super.getVideoView();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        com.tencent.mars.xlog.Log.i("LiveVideoView", "onAttachedToWindow(" + hashCode() + ")!");
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        com.tencent.mars.xlog.Log.i("LiveVideoView", "onDetachedFromWindow(" + hashCode() + ")!");
        super.onDetachedFromWindow();
    }

    @Override // com.tencent.rtmp.ui.TXCloudVideoView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        yz5.p pVar;
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (this.f68620e == null) {
            return onTouchEvent;
        }
        java.lang.Integer valueOf = motionEvent != null ? java.lang.Integer.valueOf(motionEvent.getAction()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            this.f68619d = java.lang.System.currentTimeMillis();
        } else if (valueOf != null && valueOf.intValue() == 1) {
            if (this.f68619d > 0 && java.lang.System.currentTimeMillis() - this.f68619d <= android.view.ViewConfiguration.getTapTimeout() && (pVar = this.f68620e) != null) {
                pVar.invoke(java.lang.Float.valueOf(motionEvent.getRawX()), java.lang.Float.valueOf(motionEvent.getRawY()));
            }
            this.f68619d = -1L;
        }
        return true;
    }

    @Override // com.tencent.rtmp.ui.TXCloudVideoView
    public void removeVideoView() {
        com.tencent.mars.xlog.Log.i("LiveVideoView", "removeVideoView(" + hashCode() + ")!");
        super.removeVideoView();
    }

    @Override // android.view.View
    public void setAlpha(float f17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setAlpha(");
        sb6.append(hashCode());
        sb6.append(") alpha:");
        sb6.append(f17);
        sb6.append(" isUseSurfaceView=");
        sb6.append(this.f68622g != null);
        com.tencent.mars.xlog.Log.i("LiveVideoView", sb6.toString());
        if (this.f68622g != null) {
            super.setAlpha(1.0f);
        } else {
            super.setAlpha(f17);
        }
    }

    public final void setDebugCanvasView(com.tencent.mm.live.core.view.DebugCanvasView debugCanvasView) {
        kotlin.jvm.internal.o.g(debugCanvasView, "<set-?>");
        this.debugCanvasView = debugCanvasView;
    }

    public final void setPreviewTouchListener(yz5.p pVar) {
        this.f68620e = pVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveVideoView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context.getApplicationContext(), attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f68619d = -1L;
        this.debugCanvasView = new com.tencent.mm.live.core.view.DebugCanvasView(getContext());
        this.f68622g = super.getF68622g();
    }
}
