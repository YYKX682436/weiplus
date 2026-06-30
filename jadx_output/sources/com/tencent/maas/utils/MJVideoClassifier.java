package com.tencent.maas.utils;

/* loaded from: classes5.dex */
public class MJVideoClassifier {
    private final com.facebook.jni.HybridData mHybridData = initHybrid();

    private native com.facebook.jni.HybridData initHybrid();

    private native com.tencent.maas.utils.MJVideoClassifierResult nativeCalculateClassifyResult();

    private native com.tencent.maas.instamovie.base.MJError nativeFeedAudioFrame(java.nio.ByteBuffer byteBuffer);

    private native com.tencent.maas.instamovie.base.MJError nativeFeedVideoFrame(java.nio.ByteBuffer byteBuffer, int i17, int i18, com.tencent.maas.model.time.MJTime mJTime);

    private native com.tencent.maas.instamovie.base.MJError nativeInitResourcesWithModelInfos(java.util.List<com.tencent.maas.model.MJModelInfo> list);

    private native boolean nativeIsInitialized();

    public com.tencent.maas.utils.MJVideoClassifierResult a() {
        return nativeCalculateClassifyResult();
    }

    public com.tencent.maas.instamovie.base.MJError b(java.nio.ByteBuffer byteBuffer) {
        return nativeFeedAudioFrame(byteBuffer);
    }

    public com.tencent.maas.instamovie.base.MJError c(java.nio.ByteBuffer byteBuffer, int i17, int i18, com.tencent.maas.model.time.MJTime mJTime) {
        return nativeFeedVideoFrame(byteBuffer, i17, i18, mJTime);
    }

    public com.tencent.maas.instamovie.base.MJError d(java.util.List list) {
        return nativeInitResourcesWithModelInfos(list);
    }

    public boolean e() {
        return nativeIsInitialized();
    }

    public void f() {
        nativeReleaseResources();
        this.mHybridData.resetNative();
    }

    public native void nativeReleaseResources();
}
