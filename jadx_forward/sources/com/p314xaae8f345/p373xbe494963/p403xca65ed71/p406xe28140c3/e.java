package com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3;

/* loaded from: classes14.dex */
public final class e extends com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.AbstractC3834x307e6230 {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f128479a;

    /* renamed from: b, reason: collision with root package name */
    private final com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.HandlerC3775x958f0279 f128480b;

    /* renamed from: c, reason: collision with root package name */
    private final com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.AbstractC3834x307e6230.RenderViewListener f128481c;

    /* renamed from: d, reason: collision with root package name */
    private android.view.SurfaceView f128482d;

    /* renamed from: e, reason: collision with root package name */
    private final com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421 f128483e;

    /* renamed from: f, reason: collision with root package name */
    private final com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421 f128484f;

    /* renamed from: g, reason: collision with root package name */
    private com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.GLScaleType f128485g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f128486h;

    /* renamed from: i, reason: collision with root package name */
    private final android.view.SurfaceHolder.Callback f128487i;

    /* renamed from: j, reason: collision with root package name */
    private final android.view.View.OnLayoutChangeListener f128488j;

    public e(android.view.SurfaceView surfaceView, com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.AbstractC3834x307e6230.RenderViewListener renderViewListener) {
        java.lang.String str = "SurfaceViewRenderHelper_" + hashCode();
        this.f128479a = str;
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.HandlerC3775x958f0279 handlerC3775x958f0279 = new com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.HandlerC3775x958f0279(android.os.Looper.getMainLooper());
        this.f128480b = handlerC3775x958f0279;
        this.f128483e = new com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421();
        this.f128484f = new com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421();
        this.f128485g = null;
        this.f128486h = false;
        this.f128487i = new android.view.SurfaceHolder.Callback() { // from class: com.tencent.liteav.videoconsumer.renderer.e.1
            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceChanged(android.view.SurfaceHolder surfaceHolder, int i17, int i18, int i19) {
                if (surfaceHolder != null) {
                    com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.e.this.f128479a, "surfaceChanged,format=%d,Size(%dx%d)", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
                    com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.e.this.a(surfaceHolder.getSurface());
                }
            }

            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
                if (surfaceHolder != null) {
                    android.graphics.Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
                    com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.e.this.f128479a, "surfaceCreated,Size(%dx%d)", java.lang.Integer.valueOf(surfaceFrame.width()), java.lang.Integer.valueOf(surfaceFrame.height()));
                    com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.e.this.a(surfaceHolder.getSurface());
                }
            }

            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceDestroyed(android.view.SurfaceHolder surfaceHolder) {
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.e.this.f128479a, "surfaceDestroyed");
                com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.e.this.a();
            }
        };
        this.f128488j = new android.view.View.OnLayoutChangeListener() { // from class: com.tencent.liteav.videoconsumer.renderer.e.2
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
                if (com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.e.this.f128486h) {
                    if (com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.e.this.f128484f.f14764x6be2dc6 == view.getWidth() && com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.e.this.f128484f.f14763xb7389127 == view.getHeight()) {
                        return;
                    }
                    com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.e.this.b();
                }
            }
        };
        this.f128481c = renderViewListener;
        if (surfaceView == null) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.w(str, "surfaceView is null.");
        } else {
            this.f128482d = surfaceView;
            handlerC3775x958f0279.post(com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.f.a(this, surfaceView));
        }
    }

    public static /* synthetic */ void b(com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.e eVar) {
        android.view.SurfaceView surfaceView = eVar.f128482d;
        if (surfaceView == null) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(eVar.f128479a, "view is not available when surfaceView is null");
            return;
        }
        android.view.Surface surface = surfaceView.getHolder().getSurface();
        boolean z17 = surface != null && surface.isValid();
        if (z17 && eVar.f128482d.getWidth() != 0 && eVar.f128482d.getHeight() != 0 && eVar.f128482d.isShown()) {
            return;
        }
        java.lang.String str = eVar.f128479a;
        android.view.SurfaceView surfaceView2 = eVar.f128482d;
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(str, "%s is not available when isShown:%b, surface isValid:%b", surfaceView2, java.lang.Boolean.valueOf(surfaceView2.isShown()), java.lang.Boolean.valueOf(z17));
    }

    public static /* synthetic */ void c(com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.e eVar) {
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(eVar.f128479a, "release,mSurfaceView=" + eVar.f128482d);
        if (eVar.f128482d == null) {
            return;
        }
        eVar.a();
        eVar.f128482d.getHolder().removeCallback(eVar.f128487i);
        eVar.f128482d = null;
    }

    @Override // com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.AbstractC3834x307e6230
    /* renamed from: checkViewAvailability */
    public final void mo31303xf6cbedc8() {
        this.f128480b.post(com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.h.a(this));
    }

    @Override // com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.AbstractC3834x307e6230
    /* renamed from: getTransformMatrix */
    public final android.graphics.Matrix mo31304xb1778017(int i17, int i18) {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.postScale(1.0f, -1.0f, i17 / 2.0f, i18 / 2.0f);
        return matrix;
    }

    @Override // com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.AbstractC3834x307e6230
    /* renamed from: isUsingTextureView */
    public final boolean mo31305x1b7c0c86() {
        return false;
    }

    @Override // com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.AbstractC3834x307e6230
    /* renamed from: release */
    public final void mo31306x41012807(boolean z17) {
        this.f128480b.post(com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.g.a(this));
    }

    @Override // com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.AbstractC3834x307e6230
    /* renamed from: updateVideoFrameInfo */
    public final void mo31307xd2265aa9(com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.GLScaleType gLScaleType, int i17, int i18, boolean z17) {
        if (this.f128485g == gLScaleType && this.f128486h == z17) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421 c3779x275421 = this.f128483e;
            if (c3779x275421.f14764x6be2dc6 == i17 && c3779x275421.f14763xb7389127 == i18) {
                return;
            }
        }
        this.f128486h = z17;
        this.f128485g = gLScaleType;
        this.f128483e.set(i17, i18);
        if (this.f128486h) {
            this.f128480b.m29527xc88bc38e(com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.i.a(this));
        }
    }

    public static /* synthetic */ void a(com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.e eVar, android.view.SurfaceView surfaceView) {
        android.view.SurfaceHolder holder = surfaceView.getHolder();
        if (holder.getSurface().isValid()) {
            android.view.Surface surface = holder.getSurface();
            android.graphics.Rect surfaceFrame = holder.getSurfaceFrame();
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(eVar.f128479a, "construct,surface=%s,Size(%dx%d)", surface, java.lang.Integer.valueOf(surfaceFrame.width()), java.lang.Integer.valueOf(surfaceFrame.height()));
            eVar.a(surface);
        } else {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(eVar.f128479a, "construct,surfaceView not valid.");
        }
        holder.addCallback(eVar.f128487i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
    
        if (r0 == com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.GLScaleType.CENTER_CROP) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0071, code lost:
    
        r2 = 1.0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006e, code lost:
    
        if (r0 == com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.GLScaleType.CENTER_CROP) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b() {
        /*
            r9 = this;
            android.view.SurfaceView r0 = r9.f128482d
            if (r0 == 0) goto Lb1
            android.view.ViewParent r0 = r0.getParent()
            boolean r0 = r0 instanceof com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf
            if (r0 != 0) goto Le
            goto Lb1
        Le:
            android.view.SurfaceView r0 = r9.f128482d
            android.view.ViewParent r0 = r0.getParent()
            com.tencent.rtmp.ui.TXCloudVideoView r0 = (com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf) r0
            com.tencent.liteav.base.util.Size r1 = new com.tencent.liteav.base.util.Size
            int r2 = r0.getWidth()
            int r3 = r0.getHeight()
            r1.<init>(r2, r3)
            com.tencent.liteav.base.util.Size r2 = r9.f128483e
            boolean r2 = r2.m29560x7b953cf2()
            if (r2 == 0) goto Lb1
            boolean r2 = r1.m29560x7b953cf2()
            if (r2 != 0) goto L33
            goto Lb1
        L33:
            com.tencent.liteav.base.util.Size r2 = r9.f128484f
            boolean r2 = r2.m29560x7b953cf2()
            if (r2 != 0) goto L40
            android.view.View$OnLayoutChangeListener r2 = r9.f128488j
            r0.addOnLayoutChangeListener(r2)
        L40:
            com.tencent.liteav.base.util.Size r0 = r9.f128484f
            r0.set(r1)
            double r2 = r1.m29554x41194293()
            com.tencent.liteav.base.util.Size r0 = r9.f128483e
            double r4 = r0.m29554x41194293()
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            if (r0 >= 0) goto L64
            com.tencent.liteav.videobase.base.GLConstants$GLScaleType r0 = r9.f128485g
            com.tencent.liteav.videobase.base.GLConstants$GLScaleType r8 = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.GLScaleType.FIT_CENTER
            if (r0 != r8) goto L5f
        L5b:
            double r4 = r4 / r2
            r2 = r6
            r6 = r4
            goto L72
        L5f:
            com.tencent.liteav.videobase.base.GLConstants$GLScaleType r8 = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.GLScaleType.CENTER_CROP
            if (r0 != r8) goto L71
            goto L6a
        L64:
            com.tencent.liteav.videobase.base.GLConstants$GLScaleType r0 = r9.f128485g
            com.tencent.liteav.videobase.base.GLConstants$GLScaleType r8 = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.GLScaleType.FIT_CENTER
            if (r0 != r8) goto L6c
        L6a:
            double r2 = r2 / r4
            goto L72
        L6c:
            com.tencent.liteav.videobase.base.GLConstants$GLScaleType r8 = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.GLScaleType.CENTER_CROP
            if (r0 != r8) goto L71
            goto L5b
        L71:
            r2 = r6
        L72:
            android.view.SurfaceView r0 = r9.f128482d
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            int r4 = r1.m29558x755bd410()
            double r4 = (double) r4
            double r4 = r4 * r6
            int r4 = (int) r4
            r0.width = r4
            int r1 = r1.m29557x1c4fb41d()
            double r4 = (double) r1
            double r4 = r4 * r2
            int r1 = (int) r4
            r0.height = r1
            boolean r1 = r0 instanceof android.widget.FrameLayout.LayoutParams
            if (r1 == 0) goto L95
            r1 = r0
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            r2 = 17
            r1.gravity = r2
        L95:
            android.view.SurfaceView r1 = r9.f128482d
            r1.setLayoutParams(r0)
            java.lang.String r1 = r9.f128479a
            int r2 = r0.width
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r0 = r0.height
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r0}
            java.lang.String r2 = "adjust view size to %d*%d"
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(r1, r2, r0)
        Lb1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.e.b():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(android.view.Surface surface) {
        com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.AbstractC3834x307e6230.RenderViewListener renderViewListener = this.f128481c;
        if (renderViewListener != null) {
            renderViewListener.mo31296xd8f18906(surface, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        com.p314xaae8f345.p373xbe494963.p403xca65ed71.p406xe28140c3.AbstractC3834x307e6230.RenderViewListener renderViewListener = this.f128481c;
        if (renderViewListener != null) {
            renderViewListener.mo31297x9b9c64c();
        }
    }
}
