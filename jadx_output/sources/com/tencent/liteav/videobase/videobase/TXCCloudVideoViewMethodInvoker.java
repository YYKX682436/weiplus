package com.tencent.liteav.videobase.videobase;

@com.tencent.liteav.base.annotations.JNINamespace("liteav::video")
/* loaded from: classes14.dex */
public class TXCCloudVideoViewMethodInvoker {
    private static final java.lang.String TAG = "TXCCloudVideoViewMethodInvoker";

    public static void addView(com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView, android.view.TextureView textureView) {
        callMethod(tXCloudVideoView, "addViewInternal", new java.lang.Class[]{android.view.TextureView.class}, textureView);
    }

    private static java.lang.Object callMethod(com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView, java.lang.String str, java.lang.Class<?>[] clsArr, java.lang.Object... objArr) {
        if (tXCloudVideoView == null) {
            com.tencent.liteav.base.util.LiteavLog.w(TAG, str + ",TXCloudVideoView is null.");
            return null;
        }
        try {
            java.lang.reflect.Method declaredMethod = com.tencent.rtmp.ui.TXCloudVideoView.class.getDeclaredMethod(str, clsArr);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(tXCloudVideoView, objArr);
        } catch (java.lang.Throwable th6) {
            com.tencent.liteav.base.util.LiteavLog.e(TAG, str + ",Exception:", th6);
            return null;
        }
    }

    public static java.lang.Object getGLContextFromView(com.tencent.liteav.videobase.videobase.DisplayTarget displayTarget) {
        if (displayTarget == null || displayTarget.getTXCloudVideoView() == null) {
            return null;
        }
        return displayTarget.getTXCloudVideoView().getOpenGLContext();
    }

    public static android.view.TextureView getTextureViewSetByUser(com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView) {
        java.lang.Object callMethod = callMethod(tXCloudVideoView, "getTextureViewSetByUser", null, new java.lang.Object[0]);
        if (callMethod instanceof android.view.TextureView) {
            return (android.view.TextureView) callMethod;
        }
        return null;
    }

    public static void removeDeprecatedViews(com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView, android.view.TextureView textureView) {
        callMethod(tXCloudVideoView, "removeDeprecatedViews", new java.lang.Class[]{android.view.TextureView.class}, textureView);
    }

    public static void removeView(com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView, android.view.TextureView textureView, boolean z17) {
        callMethod(tXCloudVideoView, "removeViewInternal", new java.lang.Class[]{android.view.TextureView.class, java.lang.Boolean.TYPE}, textureView, java.lang.Boolean.valueOf(z17));
    }

    public static void setAndroidViewEventListener(com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView, com.tencent.rtmp.ui.AndroidViewEventListener androidViewEventListener) {
        callMethod(tXCloudVideoView, "setAndroidViewEventListener", new java.lang.Class[]{com.tencent.rtmp.ui.AndroidViewEventListener.class}, androidViewEventListener);
    }

    public static void setBackgroundColorForInternalView(com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView, int i17) {
        callMethod(tXCloudVideoView, "setBackgroundColorForInternalView", new java.lang.Class[]{java.lang.Integer.TYPE}, java.lang.Integer.valueOf(i17));
    }

    public static void setTouchToFocusEnabled(com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView, boolean z17) {
        callMethod(tXCloudVideoView, "setTouchToFocusEnabled", new java.lang.Class[]{java.lang.Boolean.TYPE}, java.lang.Boolean.valueOf(z17));
    }

    public static void setZoomEnabled(com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView, boolean z17) {
        callMethod(tXCloudVideoView, "setZoomEnabled", new java.lang.Class[]{java.lang.Boolean.TYPE}, java.lang.Boolean.valueOf(z17));
    }

    public static void showFocusView(com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView, int i17, int i18, int i19, int i27) {
        java.lang.Class cls = java.lang.Integer.TYPE;
        callMethod(tXCloudVideoView, "showFocusView", new java.lang.Class[]{cls, cls, cls, cls}, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
    }
}
