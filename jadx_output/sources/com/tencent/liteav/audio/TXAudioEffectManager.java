package com.tencent.liteav.audio;

/* loaded from: classes16.dex */
public interface TXAudioEffectManager {

    /* loaded from: classes10.dex */
    public static class AudioMusicParam {

        /* renamed from: id, reason: collision with root package name */
        public int f46245id;
        public java.lang.String path;
        public int loopCount = 0;
        public boolean publish = false;
        public boolean isShortFile = false;
        public long startTimeMS = 0;
        public long endTimeMS = -1;

        public AudioMusicParam(int i17, java.lang.String str) {
            this.path = str;
            this.f46245id = i17;
        }

        public java.lang.String toString() {
            return "path=" + this.path + ", id=" + this.f46245id + ", loopCount=" + this.loopCount + ", publish=" + this.publish + ", isShortFile=" + this.isShortFile + ", startTimeMS=" + this.startTimeMS + ", endTimeMS=" + this.endTimeMS;
        }
    }

    /* loaded from: classes3.dex */
    public interface TXMusicPlayObserver {
        void onComplete(int i17, int i18);

        void onPlayProgress(int i17, long j17, long j18);

        void onStart(int i17, int i18);
    }

    /* loaded from: classes16.dex */
    public interface TXMusicPreloadObserver {
        void onLoadError(int i17, int i18);

        void onLoadProgress(int i17, int i18);
    }

    /* loaded from: classes16.dex */
    public enum TXVoiceChangerType {
        TXLiveVoiceChangerType_0(0),
        TXLiveVoiceChangerType_1(1),
        TXLiveVoiceChangerType_2(2),
        TXLiveVoiceChangerType_3(3),
        TXLiveVoiceChangerType_4(4),
        TXLiveVoiceChangerType_5(5),
        TXLiveVoiceChangerType_6(6),
        TXLiveVoiceChangerType_7(7),
        TXLiveVoiceChangerType_8(8),
        TXLiveVoiceChangerType_9(9),
        TXLiveVoiceChangerType_10(10),
        TXLiveVoiceChangerType_11(11);

        private int nativeValue;

        TXVoiceChangerType(int i17) {
            this.nativeValue = i17;
        }

        public final int getNativeValue() {
            return this.nativeValue;
        }
    }

    /* loaded from: classes16.dex */
    public enum TXVoiceReverbType {
        TXLiveVoiceReverbType_0(0),
        TXLiveVoiceReverbType_1(1),
        TXLiveVoiceReverbType_2(2),
        TXLiveVoiceReverbType_3(3),
        TXLiveVoiceReverbType_4(4),
        TXLiveVoiceReverbType_5(5),
        TXLiveVoiceReverbType_6(6),
        TXLiveVoiceReverbType_7(7),
        TXLiveVoiceReverbType_8(8),
        TXLiveVoiceReverbType_9(9),
        TXLiveVoiceReverbType_10(10),
        TXLiveVoiceReverbType_11(11);

        private int nativeValue;

        TXVoiceReverbType(int i17) {
            this.nativeValue = i17;
        }

        public final int getNativeValue() {
            return this.nativeValue;
        }
    }

    void enableVoiceEarMonitor(boolean z17);

    long getMusicCurrentPosInMS(int i17);

    long getMusicDurationInMS(java.lang.String str);

    int getMusicTrackCount(int i17);

    void pausePlayMusic(int i17);

    boolean preloadMusic(com.tencent.liteav.audio.TXAudioEffectManager.AudioMusicParam audioMusicParam);

    void resumePlayMusic(int i17);

    void seekMusicToPosInMS(int i17, int i18);

    void setAllMusicVolume(int i17);

    void setMusicObserver(int i17, com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver tXMusicPlayObserver);

    void setMusicPitch(int i17, float f17);

    void setMusicPlayoutVolume(int i17, int i18);

    void setMusicPublishVolume(int i17, int i18);

    void setMusicScratchSpeedRate(int i17, float f17);

    void setMusicSpeedRate(int i17, float f17);

    void setMusicTrack(int i17, int i18);

    void setPreloadObserver(com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPreloadObserver tXMusicPreloadObserver);

    void setVoiceCaptureVolume(int i17);

    void setVoiceChangerType(com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceChangerType tXVoiceChangerType);

    void setVoiceEarMonitorVolume(int i17);

    void setVoicePitch(double d17);

    void setVoiceReverbType(com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceReverbType tXVoiceReverbType);

    boolean startPlayMusic(com.tencent.liteav.audio.TXAudioEffectManager.AudioMusicParam audioMusicParam);

    void stopPlayMusic(int i17);
}
