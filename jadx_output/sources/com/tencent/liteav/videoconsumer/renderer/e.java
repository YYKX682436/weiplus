package com.tencent.liteav.videoconsumer.renderer;

/* loaded from: classes14.dex */
public final class e extends com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f46946a;

    /* renamed from: b, reason: collision with root package name */
    private final com.tencent.liteav.base.util.CustomHandler f46947b;

    /* renamed from: c, reason: collision with root package name */
    private final com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface.RenderViewListener f46948c;

    /* renamed from: d, reason: collision with root package name */
    private android.view.SurfaceView f46949d;

    /* renamed from: e, reason: collision with root package name */
    private final com.tencent.liteav.base.util.Size f46950e;

    /* renamed from: f, reason: collision with root package name */
    private final com.tencent.liteav.base.util.Size f46951f;

    /* renamed from: g, reason: collision with root package name */
    private com.tencent.liteav.videobase.base.GLConstants.GLScaleType f46952g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f46953h;

    /* renamed from: i, reason: collision with root package name */
    private final android.view.SurfaceHolder.Callback f46954i;

    /* renamed from: j, reason: collision with root package name */
    private final android.view.View.OnLayoutChangeListener f46955j;

    public e(android.view.SurfaceView surfaceView, com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface.RenderViewListener renderViewListener) {
        java.lang.String str = "SurfaceViewRenderHelper_" + hashCode();
        this.f46946a = str;
        com.tencent.liteav.base.util.CustomHandler customHandler = new com.tencent.liteav.base.util.CustomHandler(android.os.Looper.getMainLooper());
        this.f46947b = customHandler;
        this.f46950e = new com.tencent.liteav.base.util.Size();
        this.f46951f = new com.tencent.liteav.base.util.Size();
        this.f46952g = null;
        this.f46953h = false;
        this.f46954i = new android.view.SurfaceHolder.Callback() { // from class: com.tencent.liteav.videoconsumer.renderer.e.1
            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceChanged(android.view.SurfaceHolder surfaceHolder, int i17, int i18, int i19) {
                if (surfaceHolder != null) {
                    com.tencent.liteav.base.util.LiteavLog.i(com.tencent.liteav.videoconsumer.renderer.e.this.f46946a, "surfaceChanged,format=%d,Size(%dx%d)", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
                    com.tencent.liteav.videoconsumer.renderer.e.this.a(surfaceHolder.getSurface());
                }
            }

            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
                if (surfaceHolder != null) {
                    android.graphics.Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
                    com.tencent.liteav.base.util.LiteavLog.i(com.tencent.liteav.videoconsumer.renderer.e.this.f46946a, "surfaceCreated,Size(%dx%d)", java.lang.Integer.valueOf(surfaceFrame.width()), java.lang.Integer.valueOf(surfaceFrame.height()));
                    com.tencent.liteav.videoconsumer.renderer.e.this.a(surfaceHolder.getSurface());
                }
            }

            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceDestroyed(android.view.SurfaceHolder surfaceHolder) {
                com.tencent.liteav.base.util.LiteavLog.i(com.tencent.liteav.videoconsumer.renderer.e.this.f46946a, "surfaceDestroyed");
                com.tencent.liteav.videoconsumer.renderer.e.this.a();
            }
        };
        this.f46955j = new android.view.View.OnLayoutChangeListener() { // from class: com.tencent.liteav.videoconsumer.renderer.e.2
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
                if (com.tencent.liteav.videoconsumer.renderer.e.this.f46953h) {
                    if (com.tencent.liteav.videoconsumer.renderer.e.this.f46951f.width == view.getWidth() && com.tencent.liteav.videoconsumer.renderer.e.this.f46951f.height == view.getHeight()) {
                        return;
                    }
                    com.tencent.liteav.videoconsumer.renderer.e.this.b();
                }
            }
        };
        this.f46948c = renderViewListener;
        if (surfaceView == null) {
            com.tencent.liteav.base.util.LiteavLog.w(str, "surfaceView is null.");
        } else {
            this.f46949d = surfaceView;
            customHandler.post(com.tencent.liteav.videoconsumer.renderer.f.a(this, surfaceView));
        }
    }

    public static /* synthetic */ void b(com.tencent.liteav.videoconsumer.renderer.e eVar) {
        android.view.SurfaceView surfaceView = eVar.f46949d;
        if (surfaceView == null) {
            com.tencent.liteav.base.util.LiteavLog.i(eVar.f46946a, "view is not available when surfaceView is null");
            return;
        }
        android.view.Surface surface = surfaceView.getHolder().getSurface();
        boolean z17 = surface != null && surface.isValid();
        if (z17 && eVar.f46949d.getWidth() != 0 && eVar.f46949d.getHeight() != 0 && eVar.f46949d.isShown()) {
            return;
        }
        java.lang.String str = eVar.f46946a;
        android.view.SurfaceView surfaceView2 = eVar.f46949d;
        com.tencent.liteav.base.util.LiteavLog.i(str, "%s is not available when isShown:%b, surface isValid:%b", surfaceView2, java.lang.Boolean.valueOf(surfaceView2.isShown()), java.lang.Boolean.valueOf(z17));
    }

    public static /* synthetic */ void c(com.tencent.liteav.videoconsumer.renderer.e eVar) {
        com.tencent.liteav.base.util.LiteavLog.i(eVar.f46946a, "release,mSurfaceView=" + eVar.f46949d);
        if (eVar.f46949d == null) {
            return;
        }
        eVar.a();
        eVar.f46949d.getHolder().removeCallback(eVar.f46954i);
        eVar.f46949d = null;
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface
    public final void checkViewAvailability() {
        this.f46947b.post(com.tencent.liteav.videoconsumer.renderer.h.a(this));
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface
    public final android.graphics.Matrix getTransformMatrix(int i17, int i18) {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.postScale(1.0f, -1.0f, i17 / 2.0f, i18 / 2.0f);
        return matrix;
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface
    public final boolean isUsingTextureView() {
        return false;
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface
    public final void release(boolean z17) {
        this.f46947b.post(com.tencent.liteav.videoconsumer.renderer.g.a(this));
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface
    public final void updateVideoFrameInfo(com.tencent.liteav.videobase.base.GLConstants.GLScaleType gLScaleType, int i17, int i18, boolean z17) {
        if (this.f46952g == gLScaleType && this.f46953h == z17) {
            com.tencent.liteav.base.util.Size size = this.f46950e;
            if (size.width == i17 && size.height == i18) {
                return;
            }
        }
        this.f46953h = z17;
        this.f46952g = gLScaleType;
        this.f46950e.set(i17, i18);
        if (this.f46953h) {
            this.f46947b.runOrPost(com.tencent.liteav.videoconsumer.renderer.i.a(this));
        }
    }

    public static /* synthetic */ void a(com.tencent.liteav.videoconsumer.renderer.e eVar, android.view.SurfaceView surfaceView) {
        android.view.SurfaceHolder holder = surfaceView.getHolder();
        if (holder.getSurface().isValid()) {
            android.view.Surface surface = holder.getSurface();
            android.graphics.Rect surfaceFrame = holder.getSurfaceFrame();
            com.tencent.liteav.base.util.LiteavLog.i(eVar.f46946a, "construct,surface=%s,Size(%dx%d)", surface, java.lang.Integer.valueOf(surfaceFrame.width()), java.lang.Integer.valueOf(surfaceFrame.height()));
            eVar.a(surface);
        } else {
            com.tencent.liteav.base.util.LiteavLog.i(eVar.f46946a, "construct,surfaceView not valid.");
        }
        holder.addCallback(eVar.f46954i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
    
        if (r0 == com.tencent.liteav.videobase.base.GLConstants.GLScaleType.CENTER_CROP) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0071, code lost:
    
        r2 = 1.0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006e, code lost:
    
        if (r0 == com.tencent.liteav.videobase.base.GLConstants.GLScaleType.CENTER_CROP) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b() {
        /*
            r9 = this;
            android.view.SurfaceView r0 = r9.f46949d
            if (r0 == 0) goto Lb1
            android.view.ViewParent r0 = r0.getParent()
            boolean r0 = r0 instanceof com.tencent.rtmp.ui.TXCloudVideoView
            if (r0 != 0) goto Le
            goto Lb1
        Le:
            android.view.SurfaceView r0 = r9.f46949d
            android.view.ViewParent r0 = r0.getParent()
            com.tencent.rtmp.ui.TXCloudVideoView r0 = (com.tencent.rtmp.ui.TXCloudVideoView) r0
            com.tencent.liteav.base.util.Size r1 = new com.tencent.liteav.base.util.Size
            int r2 = r0.getWidth()
            int r3 = r0.getHeight()
            r1.<init>(r2, r3)
            com.tencent.liteav.base.util.Size r2 = r9.f46950e
            boolean r2 = r2.isValid()
            if (r2 == 0) goto Lb1
            boolean r2 = r1.isValid()
            if (r2 != 0) goto L33
            goto Lb1
        L33:
            com.tencent.liteav.base.util.Size r2 = r9.f46951f
            boolean r2 = r2.isValid()
            if (r2 != 0) goto L40
            android.view.View$OnLayoutChangeListener r2 = r9.f46955j
            r0.addOnLayoutChangeListener(r2)
        L40:
            com.tencent.liteav.base.util.Size r0 = r9.f46951f
            r0.set(r1)
            double r2 = r1.aspectRatio()
            com.tencent.liteav.base.util.Size r0 = r9.f46950e
            double r4 = r0.aspectRatio()
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            if (r0 >= 0) goto L64
            com.tencent.liteav.videobase.base.GLConstants$GLScaleType r0 = r9.f46952g
            com.tencent.liteav.videobase.base.GLConstants$GLScaleType r8 = com.tencent.liteav.videobase.base.GLConstants.GLScaleType.FIT_CENTER
            if (r0 != r8) goto L5f
        L5b:
            double r4 = r4 / r2
            r2 = r6
            r6 = r4
            goto L72
        L5f:
            com.tencent.liteav.videobase.base.GLConstants$GLScaleType r8 = com.tencent.liteav.videobase.base.GLConstants.GLScaleType.CENTER_CROP
            if (r0 != r8) goto L71
            goto L6a
        L64:
            com.tencent.liteav.videobase.base.GLConstants$GLScaleType r0 = r9.f46952g
            com.tencent.liteav.videobase.base.GLConstants$GLScaleType r8 = com.tencent.liteav.videobase.base.GLConstants.GLScaleType.FIT_CENTER
            if (r0 != r8) goto L6c
        L6a:
            double r2 = r2 / r4
            goto L72
        L6c:
            com.tencent.liteav.videobase.base.GLConstants$GLScaleType r8 = com.tencent.liteav.videobase.base.GLConstants.GLScaleType.CENTER_CROP
            if (r0 != r8) goto L71
            goto L5b
        L71:
            r2 = r6
        L72:
            android.view.SurfaceView r0 = r9.f46949d
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            int r4 = r1.getWidth()
            double r4 = (double) r4
            double r4 = r4 * r6
            int r4 = (int) r4
            r0.width = r4
            int r1 = r1.getHeight()
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
            android.view.SurfaceView r1 = r9.f46949d
            r1.setLayoutParams(r0)
            java.lang.String r1 = r9.f46946a
            int r2 = r0.width
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r0 = r0.height
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r0}
            java.lang.String r2 = "adjust view size to %d*%d"
            com.tencent.liteav.base.util.LiteavLog.i(r1, r2, r0)
        Lb1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.videoconsumer.renderer.e.b():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(android.view.Surface surface) {
        com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface.RenderViewListener renderViewListener = this.f46948c;
        if (renderViewListener != null) {
            renderViewListener.onSurfaceChanged(surface, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface.RenderViewListener renderViewListener = this.f46948c;
        if (renderViewListener != null) {
            renderViewListener.onSurfaceDestroy();
        }
    }
}
