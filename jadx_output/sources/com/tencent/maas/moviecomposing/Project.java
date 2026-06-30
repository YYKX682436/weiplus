package com.tencent.maas.moviecomposing;

/* loaded from: classes5.dex */
public class Project {
    private final com.facebook.jni.HybridData mHybridData;

    private Project(com.facebook.jni.HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    private native com.tencent.maas.moviecomposing.AspectRatio nativeGetAspectRatio();

    private native long nativeGetCreateTime();

    private native com.tencent.maas.model.time.MJTime nativeGetDuration();

    private native com.tencent.maas.moviecomposing.FrameRate nativeGetFrameRate();

    private native java.lang.String nativeGetID();

    private native long nativeGetModifiedTime();

    private native java.lang.String nativeGetName();

    private native int nativeGetSegmentCount();

    private native java.nio.ByteBuffer nativeSaveToData();

    private native void nativeSetModifiedTime(long j17);

    private native void nativeSetName(java.lang.String str);
}
