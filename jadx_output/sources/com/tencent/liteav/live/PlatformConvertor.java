package com.tencent.liteav.live;

@com.tencent.liteav.base.annotations.JNINamespace("liteav")
/* loaded from: classes14.dex */
public class PlatformConvertor {
    private static final java.lang.String TAG = "PlatformConvertor";

    public static com.tencent.liteav.videobase.videobase.DisplayTarget createDisplayTarget(java.lang.Object obj) {
        if (obj instanceof com.tencent.liteav.videobase.videobase.DisplayTarget) {
            return (com.tencent.liteav.videobase.videobase.DisplayTarget) obj;
        }
        if (obj instanceof com.tencent.rtmp.ui.TXCloudVideoView) {
            return new com.tencent.liteav.videobase.videobase.DisplayTarget((com.tencent.rtmp.ui.TXCloudVideoView) obj);
        }
        if (obj instanceof android.view.TextureView) {
            return new com.tencent.liteav.videobase.videobase.DisplayTarget((android.view.TextureView) obj);
        }
        if (obj instanceof android.view.SurfaceView) {
            return new com.tencent.liteav.videobase.videobase.DisplayTarget((android.view.SurfaceView) obj);
        }
        if (obj instanceof android.view.Surface) {
            return new com.tencent.liteav.videobase.videobase.DisplayTarget((android.view.Surface) obj);
        }
        com.tencent.liteav.base.util.LiteavLog.w(TAG, "object is unknown. object=".concat(java.lang.String.valueOf(obj)));
        return null;
    }

    public static void initContextFromNative(java.lang.String str) {
        com.tencent.liteav.base.ContextUtils.initContextFromNative(str);
    }
}
