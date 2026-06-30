package com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\"\u0010\f\u001a\u00020\n2\u001a\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bJ\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\tH\u0016R\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001d"}, d2 = {"Lcom/tencent/mm/live/core/view/LiveVideoView;", "Lcom/tencent/rtmp/ui/TXCloudVideoView;", "", "getSurfaceFormat", "Landroid/view/TextureView;", "getVideoView", "Landroid/view/SurfaceView;", "getSurfaceView", "Lkotlin/Function2;", "", "Ljz5/f0;", "callback", "setPreviewTouchListener", "alpha", "setAlpha", "Lcom/tencent/mm/live/core/view/DebugCanvasView;", "f", "Lcom/tencent/mm/live/core/view/DebugCanvasView;", "getDebugCanvasView", "()Lcom/tencent/mm/live/core/view/DebugCanvasView;", "setDebugCanvasView", "(Lcom/tencent/mm/live/core/view/DebugCanvasView;)V", "debugCanvasView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-core_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.live.core.view.LiveVideoView */
/* loaded from: classes3.dex */
public class C10850xc00cf614 extends com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf {

    /* renamed from: d, reason: collision with root package name */
    public long f150152d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.p f150153e;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10845x833056b0 debugCanvasView;

    /* renamed from: g, reason: collision with root package name */
    public android.view.SurfaceView f150155g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C10850xc00cf614(android.content.Context r2) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r2, r0)
            android.content.Context r2 = r2.getApplicationContext()
            java.lang.String r0 = "getApplicationContext(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r2, r0)
            r0 = 0
            r1.<init>(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10850xc00cf614.<init>(android.content.Context):void");
    }

    /* renamed from: getSurfaceFormat */
    private final int m46532xc023974e() {
        return (getContext().getResources().getConfiguration().orientation != 2 || com.p314xaae8f345.mm.ui.bk.A() || com.p314xaae8f345.mm.ui.bk.Q()) ? -3 : -1;
    }

    public final android.view.SurfaceView a(boolean z17) {
        android.view.View view;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[useSurfaceView] hasSurfaceView=");
        sb6.append(this.f150155g != null);
        sb6.append(" isTransparent=");
        sb6.append(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveVideoView", sb6.toString());
        android.view.SurfaceView surfaceView = this.f150155g;
        if (surfaceView == null) {
            surfaceView = new com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10846x3bc26740(getContext());
            if (z17) {
                if (android.os.Build.VERSION.SDK_INT >= 26) {
                    surfaceView.getHolder().setFormat(m46532xc023974e());
                }
                surfaceView.setAlpha(0.0f);
            } else {
                surfaceView.setAlpha(1.0f);
            }
        }
        removeView(mo46536x4ee17f0a());
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(surfaceView, this.f150155g) && (view = this.f150155g) != null) {
            removeView(view);
        }
        if (indexOfChild(surfaceView) < 0) {
            android.view.ViewGroup.LayoutParams layoutParams = surfaceView.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
            }
            addView(surfaceView, layoutParams);
        }
        this.f150155g = surfaceView;
        setAlpha(1.0f);
        return surfaceView;
    }

    @Override // com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf
    /* renamed from: addVideoView */
    public void mo46533x473bda1f(android.view.TextureView textureView) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("addVideoView(");
        sb6.append(hashCode());
        sb6.append(") TextureView:");
        sb6.append(textureView != null ? textureView.hashCode() : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveVideoView", sb6.toString());
        super.mo46533x473bda1f(textureView);
    }

    public final com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10845x833056b0 getDebugCanvasView() {
        return this.debugCanvasView;
    }

    @Override // com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf
    /* renamed from: getSurfaceView, reason: from getter */
    public android.view.SurfaceView getF150155g() {
        return this.f150155g;
    }

    @Override // com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf
    /* renamed from: getVideoView */
    public android.view.TextureView mo46536x4ee17f0a() {
        if (this.f150155g != null) {
            return null;
        }
        return super.mo46536x4ee17f0a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveVideoView", "onAttachedToWindow(" + hashCode() + ")!");
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveVideoView", "onDetachedFromWindow(" + hashCode() + ")!");
        super.onDetachedFromWindow();
    }

    @Override // com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        yz5.p pVar;
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (this.f150153e == null) {
            return onTouchEvent;
        }
        java.lang.Integer valueOf = motionEvent != null ? java.lang.Integer.valueOf(motionEvent.getAction()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            this.f150152d = java.lang.System.currentTimeMillis();
        } else if (valueOf != null && valueOf.intValue() == 1) {
            if (this.f150152d > 0 && java.lang.System.currentTimeMillis() - this.f150152d <= android.view.ViewConfiguration.getTapTimeout() && (pVar = this.f150153e) != null) {
                pVar.mo149xb9724478(java.lang.Float.valueOf(motionEvent.getRawX()), java.lang.Float.valueOf(motionEvent.getRawY()));
            }
            this.f150152d = -1L;
        }
        return true;
    }

    @Override // com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf
    /* renamed from: removeVideoView */
    public void mo46537xcd50899c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveVideoView", "removeVideoView(" + hashCode() + ")!");
        super.mo46537xcd50899c();
    }

    @Override // android.view.View
    public void setAlpha(float f17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setAlpha(");
        sb6.append(hashCode());
        sb6.append(") alpha:");
        sb6.append(f17);
        sb6.append(" isUseSurfaceView=");
        sb6.append(this.f150155g != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveVideoView", sb6.toString());
        if (this.f150155g != null) {
            super.setAlpha(1.0f);
        } else {
            super.setAlpha(f17);
        }
    }

    /* renamed from: setDebugCanvasView */
    public final void m46538xd9d60a0e(com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10845x833056b0 c10845x833056b0) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c10845x833056b0, "<set-?>");
        this.debugCanvasView = c10845x833056b0;
    }

    /* renamed from: setPreviewTouchListener */
    public final void m46539x74f9f5ad(yz5.p pVar) {
        this.f150153e = pVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10850xc00cf614(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context.getApplicationContext(), attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f150152d = -1L;
        this.debugCanvasView = new com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10845x833056b0(getContext());
        this.f150155g = super.getF150155g();
    }
}
