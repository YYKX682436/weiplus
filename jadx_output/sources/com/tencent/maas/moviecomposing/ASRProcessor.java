package com.tencent.maas.moviecomposing;

/* loaded from: classes5.dex */
public class ASRProcessor {
    private final com.facebook.jni.HybridData mHybridData = initHybrid();

    private native com.facebook.jni.HybridData initHybrid();

    private native boolean nativeInitResources(java.lang.String str, java.lang.String str2, java.lang.String str3);

    private native boolean nativeIsResourcesReady();

    private native java.lang.Object[] nativeProcess(java.nio.ByteBuffer byteBuffer);

    private native void nativeReleaseResources();

    public boolean a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return nativeInitResources(str, str2, str3);
    }

    public boolean b() {
        return nativeIsResourcesReady();
    }

    public com.tencent.maas.moviecomposing.ASRSegmentationInfo[] c(java.nio.ByteBuffer byteBuffer) {
        java.lang.Object[] nativeProcess = nativeProcess(byteBuffer);
        com.tencent.maas.moviecomposing.ASRSegmentationInfo[] aSRSegmentationInfoArr = new com.tencent.maas.moviecomposing.ASRSegmentationInfo[nativeProcess.length];
        for (int i17 = 0; i17 < nativeProcess.length; i17++) {
            aSRSegmentationInfoArr[i17] = (com.tencent.maas.moviecomposing.ASRSegmentationInfo) nativeProcess[i17];
        }
        return aSRSegmentationInfoArr;
    }

    public void d() {
        this.mHybridData.resetNative();
    }

    public void e() {
        nativeReleaseResources();
    }
}
