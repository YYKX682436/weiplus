package com.p314xaae8f345.p373xbe494963.p374x58d9bd6;

/* renamed from: com.tencent.liteav.audio.TXAudioEffectManager */
/* loaded from: classes16.dex */
public interface InterfaceC3728x6d2ee64a {

    /* renamed from: com.tencent.liteav.audio.TXAudioEffectManager$AudioMusicParam */
    /* loaded from: classes10.dex */
    public static class AudioMusicParam {

        /* renamed from: id, reason: collision with root package name */
        public int f127778id;

        /* renamed from: path */
        public java.lang.String f14521x346425;

        /* renamed from: loopCount */
        public int f14520x4a5820cb = 0;

        /* renamed from: publish */
        public boolean f14522xf1f89d0f = false;

        /* renamed from: isShortFile */
        public boolean f14519xcd55920e = false;

        /* renamed from: startTimeMS */
        public long f14523x91dc3c35 = 0;

        /* renamed from: endTimeMS */
        public long f14518x610201ee = -1;

        public AudioMusicParam(int i17, java.lang.String str) {
            this.f14521x346425 = str;
            this.f127778id = i17;
        }

        /* renamed from: toString */
        public java.lang.String m29070x9616526c() {
            return "path=" + this.f14521x346425 + ", id=" + this.f127778id + ", loopCount=" + this.f14520x4a5820cb + ", publish=" + this.f14522xf1f89d0f + ", isShortFile=" + this.f14519xcd55920e + ", startTimeMS=" + this.f14523x91dc3c35 + ", endTimeMS=" + this.f14518x610201ee;
        }
    }

    /* renamed from: com.tencent.liteav.audio.TXAudioEffectManager$TXMusicPlayObserver */
    /* loaded from: classes3.dex */
    public interface TXMusicPlayObserver {
        /* renamed from: onComplete */
        void mo10551x815f5438(int i17, int i18);

        /* renamed from: onPlayProgress */
        void mo10552xfd1c900(int i17, long j17, long j18);

        /* renamed from: onStart */
        void mo10553xb05099c3(int i17, int i18);
    }

    /* renamed from: com.tencent.liteav.audio.TXAudioEffectManager$TXMusicPreloadObserver */
    /* loaded from: classes16.dex */
    public interface TXMusicPreloadObserver {
        /* renamed from: onLoadError */
        void m29071x4f8e79a3(int i17, int i18);

        /* renamed from: onLoadProgress */
        void m29072x861c30b2(int i17, int i18);
    }

    /* renamed from: com.tencent.liteav.audio.TXAudioEffectManager$TXVoiceChangerType */
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


        /* renamed from: nativeValue */
        private int f14537x67d8c79a;

        TXVoiceChangerType(int i17) {
            this.f14537x67d8c79a = i17;
        }

        /* renamed from: getNativeValue */
        public final int m29076x41af0e64() {
            return this.f14537x67d8c79a;
        }
    }

    /* renamed from: com.tencent.liteav.audio.TXAudioEffectManager$TXVoiceReverbType */
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


        /* renamed from: nativeValue */
        private int f14551x67d8c79a;

        TXVoiceReverbType(int i17) {
            this.f14551x67d8c79a = i17;
        }

        /* renamed from: getNativeValue */
        public final int m29080x41af0e64() {
            return this.f14551x67d8c79a;
        }
    }

    /* renamed from: enableVoiceEarMonitor */
    void mo29046x52f4e3f3(boolean z17);

    /* renamed from: getMusicCurrentPosInMS */
    long mo29047x8f832095(int i17);

    /* renamed from: getMusicDurationInMS */
    long mo29048x97cff34e(java.lang.String str);

    /* renamed from: getMusicTrackCount */
    int mo29049xfcbd7853(int i17);

    /* renamed from: pausePlayMusic */
    void mo29050xff20a1fb(int i17);

    /* renamed from: preloadMusic */
    boolean mo29051x5e5fed9c(com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.AudioMusicParam audioMusicParam);

    /* renamed from: resumePlayMusic */
    void mo29052x96288da4(int i17);

    /* renamed from: seekMusicToPosInMS */
    void mo29053x9b52caf7(int i17, int i18);

    /* renamed from: setAllMusicVolume */
    void mo29054xdc5c9640(int i17);

    /* renamed from: setMusicObserver */
    void mo29055xe624d2d9(int i17, com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.TXMusicPlayObserver tXMusicPlayObserver);

    /* renamed from: setMusicPitch */
    void mo29056xed0efa1d(int i17, float f17);

    /* renamed from: setMusicPlayoutVolume */
    void mo29057xc0cc2931(int i17, int i18);

    /* renamed from: setMusicPublishVolume */
    void mo29058x6f0d32e6(int i17, int i18);

    /* renamed from: setMusicScratchSpeedRate */
    void mo29059x85c538f0(int i17, float f17);

    /* renamed from: setMusicSpeedRate */
    void mo29060xf86ac624(int i17, float f17);

    /* renamed from: setMusicTrack */
    void mo29061xed4b2828(int i17, int i18);

    /* renamed from: setPreloadObserver */
    void mo29062x7af8773d(com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.TXMusicPreloadObserver tXMusicPreloadObserver);

    /* renamed from: setVoiceCaptureVolume */
    void mo29063x49fdc1f0(int i17);

    /* renamed from: setVoiceChangerType */
    void mo29064x26b7a50c(com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.TXVoiceChangerType tXVoiceChangerType);

    /* renamed from: setVoiceEarMonitorVolume */
    void mo29065x5a036f6e(int i17);

    /* renamed from: setVoicePitch */
    void mo29066xc141e730(double d17);

    /* renamed from: setVoiceReverbType */
    void mo29067x486c863c(com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.TXVoiceReverbType tXVoiceReverbType);

    /* renamed from: startPlayMusic */
    boolean mo29068x79fb7d0f(com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.AudioMusicParam audioMusicParam);

    /* renamed from: stopPlayMusic */
    void mo29069x17324d6f(int i17);
}
