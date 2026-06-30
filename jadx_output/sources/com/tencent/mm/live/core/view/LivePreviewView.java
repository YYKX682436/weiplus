package com.tencent.mm.live.core.view;

@kotlin.Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010'\u001a\u0004\u0018\u00010&\u0012\b\u0010)\u001a\u0004\u0018\u00010(¢\u0006\u0004\b*\u0010+J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0006J\u0006\u0010\u000b\u001a\u00020\nJ\u0012\u0010\f\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rJ\"\u0010\u0012\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0010J\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR'\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006,"}, d2 = {"Lcom/tencent/mm/live/core/view/LivePreviewView;", "Landroid/widget/RelativeLayout;", "Lio0/a;", "callback", "Ljz5/f0;", "setPluginCallback", "Landroid/view/TextureView;", "getCameraView", "cameraView", "setCameraView", "Landroid/view/ViewGroup;", "getCameraLayout", "setCameraOptionPreviewView", "", "enable", "setCameraOptionEnable", "Lkotlin/Function2;", "", "setPreviewTouchListener", "Ljava/util/ArrayList;", "Ljo0/a;", "getTRTCDataList", "Lcom/tencent/mm/live/core/trtc/TRTCVideoRatioLayout;", "e", "Lcom/tencent/mm/live/core/trtc/TRTCVideoRatioLayout;", "getRenderRatioLayout", "()Lcom/tencent/mm/live/core/trtc/TRTCVideoRatioLayout;", "setRenderRatioLayout", "(Lcom/tencent/mm/live/core/trtc/TRTCVideoRatioLayout;)V", "renderRatioLayout", "Ljava/util/LinkedList;", "Ljava/lang/ref/WeakReference;", "Lmo0/b;", "s", "Ljz5/g;", "getTouchCallbackWeakList", "()Ljava/util/LinkedList;", "touchCallbackWeakList", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-core_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public class LivePreviewView extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f68605d;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public com.tencent.mm.live.core.trtc.TRTCVideoRatioLayout renderRatioLayout;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.live.core.view.LiveCameraOptionView f68607f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.p f68608g;

    /* renamed from: h, reason: collision with root package name */
    public long f68609h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.l f68610i;

    /* renamed from: m, reason: collision with root package name */
    public yz5.p f68611m;

    /* renamed from: n, reason: collision with root package name */
    public yz5.p f68612n;

    /* renamed from: o, reason: collision with root package name */
    public yz5.a f68613o;

    /* renamed from: p, reason: collision with root package name */
    public yz5.a f68614p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.TextureView f68615q;

    /* renamed from: r, reason: collision with root package name */
    public volatile boolean f68616r;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public final jz5.g touchCallbackWeakList;

    /* renamed from: t, reason: collision with root package name */
    public final mo0.e f68618t;

    public LivePreviewView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f68605d = "MicroMsg.LiveCore";
        this.f68609h = -1L;
        this.touchCallbackWeakList = jz5.h.b(mo0.f.f330260d);
        this.f68618t = new mo0.e(this);
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f489226bs3, (android.view.ViewGroup) this, true);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.lxk);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.renderRatioLayout = (com.tencent.mm.live.core.trtc.TRTCVideoRatioLayout) findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.i9t);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f68607f = (com.tencent.mm.live.core.view.LiveCameraOptionView) inflate.findViewById(com.tencent.mm.R.id.i7_);
        gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_LIVE_DEBUG_VIEW_INT_SYNC, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.LinkedList<java.lang.ref.WeakReference<mo0.b>> getTouchCallbackWeakList() {
        return (java.util.LinkedList) ((jz5.n) this.touchCallbackWeakList).getValue();
    }

    public final void b(mo0.b callback, boolean z17) {
        com.tencent.mm.live.core.view.LiveCameraOptionView liveCameraOptionView;
        kotlin.jvm.internal.o.g(callback, "callback");
        boolean z18 = false;
        if (z17) {
            getTouchCallbackWeakList().add(0, new java.lang.ref.WeakReference<>(callback));
        } else {
            getTouchCallbackWeakList().add(new java.lang.ref.WeakReference<>(callback));
        }
        if (this.f68616r) {
            return;
        }
        this.f68616r = true;
        fn0.g gVar = fn0.g.f264195a;
        if (fn0.g.f264196b != null && zl2.r4.f473950a.x1()) {
            z18 = true;
        }
        if (!z18 || (liveCameraOptionView = this.f68607f) == null) {
            return;
        }
        liveCameraOptionView.setTouchCallback(new mo0.d(this));
    }

    public final com.tencent.rtmp.ui.TXCloudVideoView c(java.lang.String str, int i17) {
        com.tencent.mm.live.core.trtc.TRTCVideoRatioLayout tRTCVideoRatioLayout = this.renderRatioLayout;
        if (str == null) {
            str = "";
        }
        return tRTCVideoRatioLayout.a(str, i17).getVideoView();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(java.util.ArrayList r7, android.graphics.Rect r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.live.core.view.LivePreviewView.d(java.util.ArrayList, android.graphics.Rect, boolean):void");
    }

    public final void e(mo0.b callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        try {
            java.util.Iterator<java.lang.ref.WeakReference<mo0.b>> it = getTouchCallbackWeakList().iterator();
            kotlin.jvm.internal.o.f(it, "iterator(...)");
            while (it.hasNext()) {
                java.lang.ref.WeakReference<mo0.b> next = it.next();
                kotlin.jvm.internal.o.f(next, "next(...)");
                if (kotlin.jvm.internal.o.b(next.get(), callback)) {
                    it.remove();
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(this.f68605d, "removeTouchCallback " + e17.getMessage());
        }
    }

    public final void f(yz5.l lVar, yz5.p pVar) {
        this.f68610i = lVar;
        this.f68611m = pVar;
        android.view.TextureView textureView = this.f68615q;
        mo0.e eVar = this.f68618t;
        if (textureView == null) {
            getCameraView().setSurfaceTextureListener(eVar);
        } else if (textureView != null) {
            textureView.setSurfaceTextureListener(eVar);
        }
        com.tencent.mars.xlog.Log.i(this.f68605d, "setupSurface " + eVar + " cameraOptionPreviewView: " + this.f68615q);
    }

    public final android.view.ViewGroup getCameraLayout() {
        return this.renderRatioLayout.getF68576o();
    }

    public final android.view.TextureView getCameraView() {
        return this.renderRatioLayout.getCameraView();
    }

    public final com.tencent.mm.live.core.trtc.TRTCVideoRatioLayout getRenderRatioLayout() {
        return this.renderRatioLayout;
    }

    public final java.util.ArrayList<jo0.a> getTRTCDataList() {
        return this.renderRatioLayout.getTRTCDataList();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        yz5.p pVar;
        java.lang.Integer valueOf = motionEvent != null ? java.lang.Integer.valueOf(motionEvent.getAction()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            this.f68609h = java.lang.System.currentTimeMillis();
        } else if (valueOf != null && valueOf.intValue() == 1) {
            if (this.f68609h > 0 && java.lang.System.currentTimeMillis() - this.f68609h <= android.view.ViewConfiguration.getTapTimeout() && (pVar = this.f68608g) != null) {
                pVar.invoke(java.lang.Float.valueOf(motionEvent.getRawX()), java.lang.Float.valueOf(motionEvent.getRawY()));
            }
            this.f68609h = -1L;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (zl2.r4.f473950a.x1() == true) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setCameraOptionEnable(boolean r4) {
        /*
            r3 = this;
            fn0.g r0 = fn0.g.f264195a
            hn0.g r0 = fn0.g.f264196b
            r1 = 0
            if (r0 == 0) goto L11
            zl2.r4 r0 = zl2.r4.f473950a
            boolean r0 = r0.x1()
            r2 = 1
            if (r0 != r2) goto L11
            goto L12
        L11:
            r2 = r1
        L12:
            if (r2 == 0) goto L21
            com.tencent.mm.live.core.view.LiveCameraOptionView r0 = r3.f68607f
            if (r0 != 0) goto L19
            goto L21
        L19:
            if (r4 == 0) goto L1c
            goto L1e
        L1c:
            r1 = 8
        L1e:
            r0.setVisibility(r1)
        L21:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.live.core.view.LivePreviewView.setCameraOptionEnable(boolean):void");
    }

    public final void setCameraOptionPreviewView(android.view.TextureView textureView) {
        this.f68615q = textureView;
    }

    public final void setCameraView(android.view.TextureView cameraView) {
        kotlin.jvm.internal.o.g(cameraView, "cameraView");
        this.renderRatioLayout.setCameraView(cameraView);
    }

    public final void setPluginCallback(io0.a callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        this.renderRatioLayout.setPluginCallback(callback);
    }

    public final void setPreviewTouchListener(yz5.p pVar) {
        this.f68608g = pVar;
    }

    public final void setRenderRatioLayout(com.tencent.mm.live.core.trtc.TRTCVideoRatioLayout tRTCVideoRatioLayout) {
        kotlin.jvm.internal.o.g(tRTCVideoRatioLayout, "<set-?>");
        this.renderRatioLayout = tRTCVideoRatioLayout;
    }
}
