package com.tencent.liteav.videoconsumer.renderer;

/* loaded from: classes14.dex */
public final class j extends com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f46963a;

    /* renamed from: b, reason: collision with root package name */
    private final com.tencent.liteav.base.util.CustomHandler f46964b;

    /* renamed from: c, reason: collision with root package name */
    private final com.tencent.liteav.base.b.b f46965c;

    /* renamed from: d, reason: collision with root package name */
    private final com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface.RenderViewListener f46966d;

    /* renamed from: e, reason: collision with root package name */
    private final com.tencent.rtmp.ui.TXCloudVideoView f46967e;

    /* renamed from: f, reason: collision with root package name */
    private final com.tencent.liteav.base.util.Size f46968f;

    /* renamed from: g, reason: collision with root package name */
    private com.tencent.liteav.videobase.base.GLConstants.GLScaleType f46969g;

    /* renamed from: h, reason: collision with root package name */
    private android.view.TextureView f46970h;

    /* renamed from: i, reason: collision with root package name */
    private android.graphics.SurfaceTexture f46971i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f46972j;

    /* renamed from: k, reason: collision with root package name */
    private android.graphics.Matrix f46973k;

    /* renamed from: l, reason: collision with root package name */
    private android.graphics.SurfaceTexture f46974l;

    /* renamed from: m, reason: collision with root package name */
    private final com.tencent.liteav.base.util.Size f46975m;

    /* renamed from: n, reason: collision with root package name */
    private final android.view.TextureView.SurfaceTextureListener f46976n;

    /* renamed from: com.tencent.liteav.videoconsumer.renderer.j$1, reason: invalid class name */
    /* loaded from: classes14.dex */
    public class AnonymousClass1 implements android.view.TextureView.SurfaceTextureListener {
        public AnonymousClass1() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
            com.tencent.liteav.base.util.LiteavLog.i(com.tencent.liteav.videoconsumer.renderer.j.this.f46965c.a("surfaceCreate"), com.tencent.liteav.videoconsumer.renderer.j.this.f46963a, "onSurfaceTextureAvailable, size:" + i17 + "x" + i18 + " surfaceTexture:" + surfaceTexture + " mSavedSurfaceTexture:" + com.tencent.liteav.videoconsumer.renderer.j.this.f46971i, new java.lang.Object[0]);
            com.tencent.liteav.videoconsumer.renderer.j.this.b(com.tencent.liteav.videoconsumer.renderer.j.this.a(surfaceTexture));
            com.tencent.liteav.videoconsumer.renderer.j jVar = com.tencent.liteav.videoconsumer.renderer.j.this;
            jVar.b(jVar.f46970h);
            com.tencent.liteav.videoconsumer.renderer.j.this.f46975m.width = i17;
            com.tencent.liteav.videoconsumer.renderer.j.this.f46975m.height = i18;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
            com.tencent.liteav.base.util.LiteavLog.i(com.tencent.liteav.videoconsumer.renderer.j.this.f46963a, "onSurfaceTextureDestroyed surface:" + surfaceTexture + " mTextureView:" + com.tencent.liteav.videoconsumer.renderer.j.this.f46970h);
            com.tencent.liteav.videoconsumer.renderer.j.this.a();
            if (com.tencent.liteav.videoconsumer.renderer.j.this.f46970h == null) {
                return true;
            }
            com.tencent.liteav.videoconsumer.renderer.j.this.f46971i = surfaceTexture;
            return false;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
            com.tencent.liteav.base.util.LiteavLog.i(com.tencent.liteav.videoconsumer.renderer.j.this.f46965c.a("surfaceSizeChanged"), com.tencent.liteav.videoconsumer.renderer.j.this.f46963a, "onSurfaceTextureSizeChanged, size: %dx%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            com.tencent.liteav.videoconsumer.renderer.j.this.b(surfaceTexture);
            com.tencent.liteav.videoconsumer.renderer.j jVar = com.tencent.liteav.videoconsumer.renderer.j.this;
            jVar.b(jVar.f46970h);
            if ((com.tencent.liteav.videoconsumer.renderer.j.this.f46975m.width > com.tencent.liteav.videoconsumer.renderer.j.this.f46975m.height) != (i17 > i18)) {
                com.tencent.liteav.videoconsumer.renderer.j.h(com.tencent.liteav.videoconsumer.renderer.j.this);
            }
            com.tencent.liteav.videoconsumer.renderer.j.this.f46975m.width = i17;
            com.tencent.liteav.videoconsumer.renderer.j.this.f46975m.height = i18;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
            if (com.tencent.liteav.videoconsumer.renderer.j.this.f46972j) {
                return;
            }
            com.tencent.liteav.videoconsumer.renderer.j.k(com.tencent.liteav.videoconsumer.renderer.j.this);
            com.tencent.liteav.videoconsumer.renderer.j.this.f46964b.post(com.tencent.liteav.videoconsumer.renderer.p.a(this));
        }
    }

    public j(com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView, com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface.RenderViewListener renderViewListener) {
        java.lang.String str = "TextureViewRenderHelper_" + hashCode();
        this.f46963a = str;
        com.tencent.liteav.base.util.CustomHandler customHandler = new com.tencent.liteav.base.util.CustomHandler(android.os.Looper.getMainLooper());
        this.f46964b = customHandler;
        this.f46965c = new com.tencent.liteav.base.b.b();
        this.f46968f = new com.tencent.liteav.base.util.Size();
        this.f46969g = null;
        this.f46971i = null;
        this.f46972j = false;
        this.f46973k = new android.graphics.Matrix();
        this.f46975m = new com.tencent.liteav.base.util.Size();
        this.f46976n = new com.tencent.liteav.videoconsumer.renderer.j.AnonymousClass1();
        this.f46966d = renderViewListener;
        this.f46967e = tXCloudVideoView;
        if (tXCloudVideoView == null) {
            com.tencent.liteav.base.util.LiteavLog.w(str, "txCloudVideoView is null.");
            return;
        }
        com.tencent.liteav.base.util.LiteavLog.i(str, "construct,txCloudVideoView=".concat(java.lang.String.valueOf(tXCloudVideoView)));
        android.view.TextureView textureView = new android.view.TextureView(tXCloudVideoView.getContext());
        this.f46970h = textureView;
        customHandler.post(com.tencent.liteav.videoconsumer.renderer.k.a(this, tXCloudVideoView, textureView));
    }

    public static /* synthetic */ void h(com.tencent.liteav.videoconsumer.renderer.j jVar) {
        android.view.TextureView textureView;
        android.graphics.Bitmap bitmap;
        if (jVar.f46966d == null || (textureView = jVar.f46970h) == null || (bitmap = textureView.getBitmap()) == null) {
            return;
        }
        jVar.f46966d.onRequestRedraw(bitmap);
    }

    public static /* synthetic */ boolean k(com.tencent.liteav.videoconsumer.renderer.j jVar) {
        jVar.f46972j = true;
        return true;
    }

    public static /* synthetic */ void m(com.tencent.liteav.videoconsumer.renderer.j jVar) {
        android.view.TextureView textureView;
        com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView = jVar.f46967e;
        if (tXCloudVideoView == null || (textureView = jVar.f46970h) == null) {
            return;
        }
        com.tencent.liteav.videobase.videobase.TXCCloudVideoViewMethodInvoker.removeDeprecatedViews(tXCloudVideoView, textureView);
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface
    public final void checkViewAvailability() {
        this.f46964b.post(com.tencent.liteav.videoconsumer.renderer.n.a(this));
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface
    public final android.graphics.Matrix getTransformMatrix(int i17, int i18) {
        android.graphics.Matrix matrix = new android.graphics.Matrix(this.f46973k);
        matrix.postScale(1.0f, -1.0f, i17 / 2.0f, i18 / 2.0f);
        return matrix;
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface
    public final boolean isUsingTextureView() {
        return true;
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface
    public final void release(boolean z17) {
        this.f46964b.post(com.tencent.liteav.videoconsumer.renderer.m.a(this, z17));
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface
    public final synchronized void updateVideoFrameInfo(com.tencent.liteav.videobase.base.GLConstants.GLScaleType gLScaleType, int i17, int i18, boolean z17) {
        if (this.f46969g == gLScaleType) {
            com.tencent.liteav.base.util.Size size = this.f46968f;
            if (i17 == size.width && i18 == size.height) {
                return;
            }
        }
        this.f46969g = gLScaleType;
        this.f46968f.set(i17, i18);
        this.f46964b.runOrPost(com.tencent.liteav.videoconsumer.renderer.o.a(this));
    }

    public static /* synthetic */ void a(com.tencent.liteav.videoconsumer.renderer.j jVar, com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView, android.view.TextureView textureView) {
        com.tencent.liteav.videobase.videobase.TXCCloudVideoViewMethodInvoker.addView(tXCloudVideoView, textureView);
        jVar.a(textureView);
    }

    public static /* synthetic */ void b(com.tencent.liteav.videoconsumer.renderer.j jVar) {
        android.view.TextureView textureView = jVar.f46970h;
        if (textureView == null) {
            com.tencent.liteav.base.util.LiteavLog.i(jVar.f46963a, "view is not available when textureView is null");
            return;
        }
        if (textureView.isAvailable() && jVar.f46970h.getWidth() != 0 && jVar.f46970h.getHeight() != 0 && jVar.f46970h.isShown()) {
            return;
        }
        java.lang.String str = jVar.f46963a;
        android.view.TextureView textureView2 = jVar.f46970h;
        com.tencent.liteav.base.util.LiteavLog.i(str, "%s is not available when surface available:%b, isShown:%b", textureView2, java.lang.Boolean.valueOf(textureView2.isAvailable()), java.lang.Boolean.valueOf(jVar.f46970h.isShown()));
    }

    public static /* synthetic */ void a(com.tencent.liteav.videoconsumer.renderer.j jVar, boolean z17) {
        com.tencent.liteav.base.util.LiteavLog.i(jVar.f46963a, "release,mTextureView=" + jVar.f46970h);
        if (jVar.f46970h == null) {
            return;
        }
        jVar.a();
        if (jVar.f46970h.getSurfaceTextureListener() == jVar.f46976n) {
            jVar.f46970h.setSurfaceTextureListener(null);
        }
        android.graphics.SurfaceTexture surfaceTexture = jVar.f46971i;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            jVar.f46971i = null;
        }
        if (jVar.f46967e != null) {
            com.tencent.liteav.base.util.LiteavLog.i(jVar.f46963a, "clearLastImage=" + z17 + ",mHasFirstFrameRendered=" + jVar.f46972j);
            com.tencent.liteav.videobase.videobase.TXCCloudVideoViewMethodInvoker.removeView(jVar.f46967e, jVar.f46970h, z17 | (jVar.f46972j ^ true));
        }
        jVar.f46970h = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void b(android.view.TextureView textureView) {
        double d17;
        if (textureView == null) {
            return;
        }
        com.tencent.liteav.base.util.Size size = new com.tencent.liteav.base.util.Size(textureView.getWidth(), textureView.getHeight());
        if (this.f46968f.isValid() && size.isValid()) {
            double aspectRatio = size.aspectRatio();
            double aspectRatio2 = this.f46968f.aspectRatio();
            double d18 = 1.0d;
            if (aspectRatio2 < aspectRatio) {
                com.tencent.liteav.videobase.base.GLConstants.GLScaleType gLScaleType = this.f46969g;
                if (gLScaleType != com.tencent.liteav.videobase.base.GLConstants.GLScaleType.FIT_CENTER) {
                    if (gLScaleType == com.tencent.liteav.videobase.base.GLConstants.GLScaleType.CENTER_CROP) {
                        d17 = aspectRatio / aspectRatio2;
                    }
                    d17 = 1.0d;
                }
                double d19 = aspectRatio2 / aspectRatio;
                d17 = 1.0d;
                d18 = d19;
            } else {
                com.tencent.liteav.videobase.base.GLConstants.GLScaleType gLScaleType2 = this.f46969g;
                if (gLScaleType2 != com.tencent.liteav.videobase.base.GLConstants.GLScaleType.FIT_CENTER) {
                    if (gLScaleType2 == com.tencent.liteav.videobase.base.GLConstants.GLScaleType.CENTER_CROP) {
                        double d192 = aspectRatio2 / aspectRatio;
                        d17 = 1.0d;
                        d18 = d192;
                    }
                    d17 = 1.0d;
                }
                d17 = aspectRatio / aspectRatio2;
            }
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            matrix.setScale((float) d18, (float) d17, size.width / 2.0f, size.height / 2.0f);
            if (!matrix.equals(textureView.getTransform(new android.graphics.Matrix()))) {
                textureView.setTransform(matrix);
                textureView.postInvalidate();
                com.tencent.liteav.base.util.LiteavLog.i(this.f46965c.a("updateTextureViewMatrix"), this.f46963a, "view: %s, scaleX: %.2f, scaleY: %.2f, frame: %s, view: %s", textureView, java.lang.Double.valueOf(d18), java.lang.Double.valueOf(d17), this.f46968f, size);
            }
            this.f46973k = matrix;
        }
    }

    public j(android.view.TextureView textureView, com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface.RenderViewListener renderViewListener) {
        java.lang.String str = "TextureViewRenderHelper_" + hashCode();
        this.f46963a = str;
        com.tencent.liteav.base.util.CustomHandler customHandler = new com.tencent.liteav.base.util.CustomHandler(android.os.Looper.getMainLooper());
        this.f46964b = customHandler;
        this.f46965c = new com.tencent.liteav.base.b.b();
        this.f46968f = new com.tencent.liteav.base.util.Size();
        this.f46969g = null;
        this.f46971i = null;
        this.f46972j = false;
        this.f46973k = new android.graphics.Matrix();
        this.f46975m = new com.tencent.liteav.base.util.Size();
        this.f46976n = new com.tencent.liteav.videoconsumer.renderer.j.AnonymousClass1();
        this.f46966d = renderViewListener;
        this.f46967e = null;
        if (textureView == null) {
            com.tencent.liteav.base.util.LiteavLog.w(str, "textureView is null.");
            return;
        }
        com.tencent.liteav.base.util.LiteavLog.i(str, "construct,textureView=".concat(java.lang.String.valueOf(textureView)));
        this.f46970h = textureView;
        customHandler.post(com.tencent.liteav.videoconsumer.renderer.l.a(this, textureView));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(android.view.TextureView textureView) {
        if (textureView == null) {
            com.tencent.liteav.base.util.LiteavLog.w(this.f46963a, "setup,textureView is null.");
            return;
        }
        if (textureView.isAvailable()) {
            com.tencent.liteav.base.util.Size size = new com.tencent.liteav.base.util.Size(textureView.getWidth(), textureView.getHeight());
            com.tencent.liteav.base.util.LiteavLog.i(this.f46963a, "setup,textureView=" + textureView + "," + size);
            b(textureView.getSurfaceTexture());
        } else {
            com.tencent.liteav.base.util.LiteavLog.i(this.f46963a, "setup,textureView not available.");
        }
        textureView.setSurfaceTextureListener(this.f46976n);
        b(textureView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public android.graphics.SurfaceTexture a(android.graphics.SurfaceTexture surfaceTexture) {
        android.graphics.SurfaceTexture surfaceTexture2 = this.f46971i;
        if (surfaceTexture2 != null && this.f46970h != null && !com.tencent.liteav.base.util.h.a(surfaceTexture, surfaceTexture2)) {
            try {
                this.f46970h.setSurfaceTexture(this.f46971i);
                surfaceTexture = this.f46971i;
            } catch (java.lang.Throwable th6) {
                com.tencent.liteav.base.util.LiteavLog.e(this.f46963a, "error setting saved SurfaceTexture.", th6);
            }
            this.f46971i = null;
        }
        return surfaceTexture;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(android.graphics.SurfaceTexture surfaceTexture) {
        if (this.f46974l == surfaceTexture) {
            return;
        }
        this.f46974l = surfaceTexture;
        com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface.RenderViewListener renderViewListener = this.f46966d;
        if (renderViewListener != null) {
            renderViewListener.onSurfaceChanged(new android.view.Surface(surfaceTexture), true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        this.f46974l = null;
        com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface.RenderViewListener renderViewListener = this.f46966d;
        if (renderViewListener != null) {
            renderViewListener.onSurfaceDestroy();
        }
    }
}
