package com.tencent.liteav.trtc;

@com.tencent.liteav.base.annotations.JNINamespace("liteav::trtc")
/* loaded from: classes10.dex */
public class AudioVodTrackJni {
    private long mNativeAudioVodTrackJni;

    /* loaded from: classes10.dex */
    public static class AudioFrame {

        /* renamed from: a, reason: collision with root package name */
        private com.tencent.trtc.TRTCCloudDef.TRTCAudioFrame f46566a;

        public AudioFrame(com.tencent.trtc.TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame) {
            this.f46566a = tRTCAudioFrame;
        }

        public int getChannel() {
            return this.f46566a.channel;
        }

        public byte[] getData() {
            return this.f46566a.data;
        }

        public int getSampleRate() {
            return this.f46566a.sampleRate;
        }

        public long getTimestamp() {
            return this.f46566a.timestamp;
        }
    }

    public AudioVodTrackJni() {
        this.mNativeAudioVodTrackJni = 0L;
        this.mNativeAudioVodTrackJni = nativeCreateAudioVodTrackJni(this);
    }

    private static native void nativeClean(long j17);

    private static native long nativeCreateAudioVodTrackJni(com.tencent.liteav.trtc.AudioVodTrackJni audioVodTrackJni);

    private static native void nativeEnablePlayout(long j17, boolean z17);

    private static native void nativePause(long j17);

    private static native void nativeResume(long j17);

    private static native void nativeSeek(long j17);

    private static native void nativeSetPlayoutVolume(long j17, int i17);

    private static native int nativeWriteData(long j17, com.tencent.liteav.trtc.AudioVodTrackJni.AudioFrame audioFrame);

    public synchronized void clean() {
        long j17 = this.mNativeAudioVodTrackJni;
        if (j17 != 0) {
            nativeClean(j17);
        }
    }

    public synchronized void enablePlayout(boolean z17) {
        long j17 = this.mNativeAudioVodTrackJni;
        if (j17 != 0) {
            nativeEnablePlayout(j17, z17);
        }
    }

    public synchronized void pause() {
        long j17 = this.mNativeAudioVodTrackJni;
        if (j17 != 0) {
            nativePause(j17);
        }
    }

    public synchronized void resume() {
        long j17 = this.mNativeAudioVodTrackJni;
        if (j17 != 0) {
            nativeResume(j17);
        }
    }

    public synchronized void seek() {
        long j17 = this.mNativeAudioVodTrackJni;
        if (j17 != 0) {
            nativeSeek(j17);
        }
    }

    public synchronized void setPlayoutVolume(int i17) {
        long j17 = this.mNativeAudioVodTrackJni;
        if (j17 != 0) {
            nativeSetPlayoutVolume(j17, i17);
        }
    }

    public synchronized int writeData(com.tencent.trtc.TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame) {
        long j17 = this.mNativeAudioVodTrackJni;
        if (j17 == 0) {
            return -1;
        }
        return nativeWriteData(j17, new com.tencent.liteav.trtc.AudioVodTrackJni.AudioFrame(tRTCAudioFrame));
    }
}
