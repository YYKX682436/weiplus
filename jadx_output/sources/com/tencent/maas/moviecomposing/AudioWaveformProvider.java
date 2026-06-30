package com.tencent.maas.moviecomposing;

/* loaded from: classes5.dex */
public final class AudioWaveformProvider {
    private final com.facebook.jni.HybridData mHybridData;

    public AudioWaveformProvider(com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment) {
        com.facebook.jni.HybridData initHybrid = initHybrid(clipSegment.D(), clipSegment.f48532a.value());
        this.mHybridData = initHybrid;
        if (initHybrid == null) {
            throw new java.lang.RuntimeException("AudioWaveformProvider can't create mHybridData, please check log!");
        }
    }

    private native com.facebook.jni.HybridData initHybrid(com.tencent.maas.moviecomposing.Timeline timeline, java.lang.String str);

    private native boolean nativeFetchWaveformInternal(com.tencent.maas.model.time.MJTimeRange mJTimeRange, int i17);

    private native int nativeGetStartIndex();

    private native java.nio.ByteBuffer nativeGetWaveform();

    private native void nativeUpdateSampleCount(int i17, int i18);

    private native void nativeUpdateSampleRate(float f17, int i17);

    public com.tencent.maas.moviecomposing.a a(com.tencent.maas.model.time.MJTimeRange mJTimeRange, int i17) {
        if (nativeFetchWaveformInternal(mJTimeRange, i17)) {
            return new com.tencent.maas.moviecomposing.a(nativeGetWaveform().asFloatBuffer(), nativeGetStartIndex());
        }
        return null;
    }

    public void b() {
        this.mHybridData.resetNative();
    }

    public void c(float f17, int i17) {
        nativeUpdateSampleRate(f17, i17);
    }
}
