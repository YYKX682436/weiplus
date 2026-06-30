package com.tencent.liteav.videoconsumer.renderer;

@com.tencent.liteav.base.annotations.JNINamespace("liteav::video")
/* loaded from: classes14.dex */
public abstract class RenderViewHelperInterface {
    private static final java.lang.String TAG = "RenderViewHelperInterface";

    /* renamed from: com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface$1, reason: invalid class name */
    /* loaded from: classes14.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f46937a;

        static {
            int[] iArr = new int[com.tencent.liteav.videobase.videobase.DisplayTarget.a.values().length];
            f46937a = iArr;
            try {
                iArr[com.tencent.liteav.videobase.videobase.DisplayTarget.a.SURFACEVIEW.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f46937a[com.tencent.liteav.videobase.videobase.DisplayTarget.a.TEXTUREVIEW.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f46937a[com.tencent.liteav.videobase.videobase.DisplayTarget.a.SURFACE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f46937a[com.tencent.liteav.videobase.videobase.DisplayTarget.a.TXCLOUDVIEW.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes14.dex */
    public interface RenderViewListener {
        void onRequestRedraw(android.graphics.Bitmap bitmap);

        void onSurfaceChanged(android.view.Surface surface, boolean z17);

        void onSurfaceDestroy();
    }

    public static com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface create(com.tencent.liteav.videobase.videobase.DisplayTarget displayTarget, com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface.RenderViewListener renderViewListener) {
        android.view.Surface surface;
        android.view.TextureView textureView;
        android.view.SurfaceView surfaceView;
        com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView;
        if (displayTarget == null || displayTarget.getType() == null) {
            com.tencent.liteav.base.util.LiteavLog.w(TAG, "displayTarget or type is null. displayTarget=".concat(java.lang.String.valueOf(displayTarget)));
            return null;
        }
        int i17 = com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface.AnonymousClass1.f46937a[displayTarget.getType().ordinal()];
        if (i17 == 1) {
            surface = null;
            textureView = null;
            surfaceView = displayTarget.getSurfaceView();
            tXCloudVideoView = null;
        } else if (i17 != 2) {
            if (i17 == 3) {
                surface = displayTarget.getSurface();
                tXCloudVideoView = null;
            } else if (i17 != 4) {
                surface = null;
                tXCloudVideoView = null;
            } else {
                com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView2 = displayTarget.getTXCloudVideoView();
                if (tXCloudVideoView2 == null) {
                    com.tencent.liteav.base.util.LiteavLog.w(TAG, "txCloudVideoView is null.");
                    surfaceView = null;
                    textureView = null;
                    tXCloudVideoView = tXCloudVideoView2;
                    surface = null;
                } else {
                    android.view.SurfaceView surfaceView2 = tXCloudVideoView2.getSurfaceView();
                    textureView = com.tencent.liteav.videobase.videobase.TXCCloudVideoViewMethodInvoker.getTextureViewSetByUser(tXCloudVideoView2);
                    surfaceView = surfaceView2;
                    tXCloudVideoView = tXCloudVideoView2;
                    surface = null;
                }
            }
            surfaceView = tXCloudVideoView;
            textureView = surfaceView;
        } else {
            surface = null;
            tXCloudVideoView = null;
            textureView = displayTarget.getTextureView();
            surfaceView = null;
        }
        if (surfaceView != null) {
            return new com.tencent.liteav.videoconsumer.renderer.e(surfaceView, renderViewListener);
        }
        if (textureView != null) {
            return new com.tencent.liteav.videoconsumer.renderer.j(textureView, renderViewListener);
        }
        if (surface != null) {
            return new com.tencent.liteav.videoconsumer.renderer.a(surface, renderViewListener);
        }
        if (tXCloudVideoView != null) {
            return new com.tencent.liteav.videoconsumer.renderer.j(tXCloudVideoView, renderViewListener);
        }
        com.tencent.liteav.base.util.LiteavLog.w(TAG, "RenderViewHelper not created. displayTarget=".concat(java.lang.String.valueOf(displayTarget)));
        return null;
    }

    public static com.tencent.liteav.videobase.base.GLConstants.GLScaleType createScaleType(int i17) {
        return com.tencent.liteav.videobase.base.GLConstants.GLScaleType.a(i17);
    }

    public static void releaseSurface(android.view.Surface surface) {
        if (surface != null) {
            surface.release();
        }
    }

    public static void setBackgroundColor(com.tencent.liteav.videobase.videobase.DisplayTarget displayTarget, int i17) {
        com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView;
        if (displayTarget == null || displayTarget.getType() == null) {
            com.tencent.liteav.base.util.LiteavLog.w(TAG, "displayTarget or type is null. displayTarget=".concat(java.lang.String.valueOf(displayTarget)));
        } else if (com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface.AnonymousClass1.f46937a[displayTarget.getType().ordinal()] == 4 && (tXCloudVideoView = displayTarget.getTXCloudVideoView()) != null) {
            com.tencent.liteav.videobase.videobase.TXCCloudVideoViewMethodInvoker.setBackgroundColorForInternalView(tXCloudVideoView, i17);
        }
    }

    public abstract void checkViewAvailability();

    public abstract android.graphics.Matrix getTransformMatrix(int i17, int i18);

    public abstract boolean isUsingTextureView();

    public abstract void release(boolean z17);

    public abstract void updateVideoFrameInfo(com.tencent.liteav.videobase.base.GLConstants.GLScaleType gLScaleType, int i17, int i18, boolean z17);
}
