package com.p314xaae8f345.p2936x80def495.jni;

/* renamed from: com.tencent.skyline.jni.NativeRunnable */
/* loaded from: classes7.dex */
class RunnableC25599xda94c74 implements java.lang.Runnable {

    /* renamed from: mHasRun */
    private boolean f46916x670985e;

    /* renamed from: mNativePeer */
    private final long f46917x95364a66;

    private RunnableC25599xda94c74(long j17) {
        this.f46917x95364a66 = j17;
    }

    /* renamed from: Create */
    public static com.p314xaae8f345.p2936x80def495.jni.RunnableC25599xda94c74 m95920x78ca8d1c(long j17) {
        return new com.p314xaae8f345.p2936x80def495.jni.RunnableC25599xda94c74(j17);
    }

    /* renamed from: releaseNative */
    private native void m95921xb27602fe(long j17);

    /* renamed from: runNative */
    private native void m95922xc5f7a282(long j17);

    /* renamed from: finalize */
    public void m95923xd764dc1e() {
        super.finalize();
        if (this.f46916x670985e) {
            return;
        }
        m95921xb27602fe(this.f46917x95364a66);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f46916x670985e) {
            return;
        }
        m95922xc5f7a282(this.f46917x95364a66);
        m95921xb27602fe(this.f46917x95364a66);
        this.f46916x670985e = true;
    }
}
