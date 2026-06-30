package com.tencent.maas.moviecomposing;

/* loaded from: classes5.dex */
public class ComposingFactory {

    /* loaded from: classes5.dex */
    public interface OnVideoFrameRate {
        int onVideoFrameRate(java.lang.Object[] objArr);
    }

    public static com.tencent.maas.moviecomposing.ComposingSession a(java.util.List list, com.tencent.maas.moviecomposing.AspectRatio aspectRatio, com.tencent.maas.model.time.MJTime mJTime, com.tencent.maas.model.time.MJTime mJTime2, boolean z17, com.tencent.maas.moviecomposing.ComposingFactory.OnVideoFrameRate onVideoFrameRate) {
        return nativeCreateComposingSession(list, aspectRatio, mJTime, mJTime2, z17, onVideoFrameRate);
    }

    public static com.tencent.maas.moviecomposing.ComposingSession b(java.util.List list, java.util.List list2, java.lang.String str, long j17, com.tencent.maas.camstudio.MJCamResourceManager mJCamResourceManager, com.tencent.maas.moviecomposing.ComposingFactory.OnVideoFrameRate onVideoFrameRate) {
        return nativeCreateAigcComposingSession(list, list2, null, null, str, j17, mJCamResourceManager, onVideoFrameRate);
    }

    public static java.lang.String c(com.tencent.maas.instamovie.base.asset.MJAssetInfo mJAssetInfo) {
        if (mJAssetInfo == null) {
            return null;
        }
        return nativeGetOriginAssetID(mJAssetInfo);
    }

    public static java.lang.String[] d(java.util.List list) {
        return nativePrepareAssetsID(list);
    }

    private static native com.tencent.maas.moviecomposing.ComposingSession nativeCreateAigcComposingSession(java.util.List<com.tencent.maas.instamovie.base.asset.MJAssetInfo> list, java.util.List<com.tencent.maas.instamovie.base.asset.MJAssetInfo> list2, com.tencent.maas.model.MJMusicInfo mJMusicInfo, java.lang.String str, java.lang.String str2, long j17, com.tencent.maas.camstudio.MJCamResourceManager mJCamResourceManager, com.tencent.maas.moviecomposing.ComposingFactory.OnVideoFrameRate onVideoFrameRate);

    private static native com.tencent.maas.moviecomposing.ComposingSession nativeCreateComposingSession(java.util.List<com.tencent.maas.instamovie.base.asset.MJAssetInfo> list, com.tencent.maas.moviecomposing.AspectRatio aspectRatio, com.tencent.maas.model.time.MJTime mJTime, com.tencent.maas.model.time.MJTime mJTime2, boolean z17, com.tencent.maas.moviecomposing.ComposingFactory.OnVideoFrameRate onVideoFrameRate);

    private static native java.lang.String nativeGetOriginAssetID(com.tencent.maas.instamovie.base.asset.MJAssetInfo mJAssetInfo);

    private static native java.lang.String[] nativePrepareAssetsID(java.util.List<com.tencent.maas.instamovie.base.asset.MJAssetInfo> list);
}
