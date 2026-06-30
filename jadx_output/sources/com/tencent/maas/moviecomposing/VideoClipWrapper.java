package com.tencent.maas.moviecomposing;

/* loaded from: classes5.dex */
public class VideoClipWrapper {
    private final com.facebook.jni.HybridData mHybridData;

    private VideoClipWrapper(com.facebook.jni.HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public void a() {
        this.mHybridData.resetNative();
    }
}
