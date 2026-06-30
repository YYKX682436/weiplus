package com.tencent.maas.analytics;

/* loaded from: classes5.dex */
public class MJAssetInfoStatistics {
    private final com.facebook.jni.HybridData mHybridData = initHybrid();

    private native com.facebook.jni.HybridData initHybrid();

    private native void nativeAddMediaFilesFromScene(java.util.List<java.lang.String> list, int i17, boolean z17);

    private native boolean nativeLoadBinaryBuffer(java.nio.ByteBuffer byteBuffer);

    private native void nativeRemoveAllMediaFilesFromScene(int i17);

    private native void nativeRemoveFinalMediaFiles();

    private native void nativeRemoveMediaFilesFromScene(java.util.List<java.lang.String> list, int i17);

    private native void nativeReset();

    private native java.nio.ByteBuffer nativeToBinaryBuffer();

    private native java.lang.String nativeToJSONString();

    public void a(java.util.List list, int i17, boolean z17) {
        nativeAddMediaFilesFromScene(list, i17, z17);
    }

    public boolean b(java.nio.ByteBuffer byteBuffer) {
        return nativeLoadBinaryBuffer(byteBuffer);
    }

    public void c() {
        this.mHybridData.resetNative();
    }

    public void d(int i17) {
        nativeRemoveAllMediaFilesFromScene(i17);
    }

    public void e(java.util.List list, int i17) {
        nativeRemoveMediaFilesFromScene(list, i17);
    }

    public java.nio.ByteBuffer f() {
        return nativeToBinaryBuffer();
    }

    public java.lang.String g() {
        return nativeToJSONString();
    }
}
