package com.tencent.liteav.videoconsumer.renderer;

/* loaded from: classes14.dex */
public final class a extends com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f46938a;

    /* renamed from: b, reason: collision with root package name */
    private final com.tencent.liteav.base.util.CustomHandler f46939b;

    /* renamed from: c, reason: collision with root package name */
    private final com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface.RenderViewListener f46940c;

    /* renamed from: d, reason: collision with root package name */
    private android.view.Surface f46941d;

    public a(android.view.Surface surface, com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface.RenderViewListener renderViewListener) {
        java.lang.String str = "SurfaceRenderHelper_" + hashCode();
        this.f46938a = str;
        com.tencent.liteav.base.util.CustomHandler customHandler = new com.tencent.liteav.base.util.CustomHandler(android.os.Looper.getMainLooper());
        this.f46939b = customHandler;
        this.f46940c = renderViewListener;
        if (surface == null) {
            com.tencent.liteav.base.util.LiteavLog.w(str, "surface is null.");
        } else {
            this.f46941d = surface;
            customHandler.post(com.tencent.liteav.videoconsumer.renderer.b.a(this, surface));
        }
    }

    public static /* synthetic */ void a(com.tencent.liteav.videoconsumer.renderer.a aVar, android.view.Surface surface) {
        com.tencent.liteav.base.util.LiteavLog.i(aVar.f46938a, "construct,surface=".concat(java.lang.String.valueOf(surface)));
        com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface.RenderViewListener renderViewListener = aVar.f46940c;
        if (renderViewListener != null) {
            renderViewListener.onSurfaceChanged(surface, false);
        }
    }

    public static /* synthetic */ void b(com.tencent.liteav.videoconsumer.renderer.a aVar) {
        com.tencent.liteav.base.util.LiteavLog.i(aVar.f46938a, "release,mSurface=" + aVar.f46941d);
        if (aVar.f46941d == null) {
            return;
        }
        com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface.RenderViewListener renderViewListener = aVar.f46940c;
        if (renderViewListener != null) {
            renderViewListener.onSurfaceDestroy();
        }
        aVar.f46941d = null;
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface
    public final void checkViewAvailability() {
        this.f46939b.post(com.tencent.liteav.videoconsumer.renderer.d.a(this));
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
        this.f46939b.post(com.tencent.liteav.videoconsumer.renderer.c.a(this));
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface
    public final void updateVideoFrameInfo(com.tencent.liteav.videobase.base.GLConstants.GLScaleType gLScaleType, int i17, int i18, boolean z17) {
    }

    public static /* synthetic */ void a(com.tencent.liteav.videoconsumer.renderer.a aVar) {
        android.view.Surface surface = aVar.f46941d;
        if (surface == null) {
            com.tencent.liteav.base.util.LiteavLog.i(aVar.f46938a, "view is not available when surface is null");
        } else {
            if (surface.isValid()) {
                return;
            }
            com.tencent.liteav.base.util.LiteavLog.i(aVar.f46938a, "view is not available when %s is not valid", aVar.f46941d);
        }
    }
}
