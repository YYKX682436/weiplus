package com.tencent.maas.moviecomposing;

/* loaded from: classes5.dex */
public class SynthSpecWrapper {
    private final com.facebook.jni.HybridData mHybridData;

    private SynthSpecWrapper(com.facebook.jni.HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public void a() {
        this.mHybridData.resetNative();
    }
}
