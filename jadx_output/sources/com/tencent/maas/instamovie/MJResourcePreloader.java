package com.tencent.maas.instamovie;

/* loaded from: classes5.dex */
public class MJResourcePreloader {
    private final com.facebook.jni.HybridData mHybridData;

    public MJResourcePreloader(android.os.Handler handler) {
        this.mHybridData = initHybrid(handler);
    }

    private native com.facebook.jni.HybridData initHybrid(android.os.Handler handler);

    private native void nativeSetConcurrencyLimit(int i17);

    private native void nativeSetPreloadResourceSizeLimit(long j17);

    private native void nativeStartPreloading();

    private native void nativeStopPreloading();

    private native void nativeUpdateExpectedResourceUsage(com.tencent.maas.instamovie.MJResourceUsageDesc mJResourceUsageDesc);

    public void a(long j17) {
        nativeSetPreloadResourceSizeLimit(j17);
    }

    public void b() {
        nativeStartPreloading();
    }

    public void c() {
        nativeStopPreloading();
    }

    public void d(com.tencent.maas.instamovie.MJResourceUsageDesc mJResourceUsageDesc) {
        nativeUpdateExpectedResourceUsage(mJResourceUsageDesc);
    }
}
