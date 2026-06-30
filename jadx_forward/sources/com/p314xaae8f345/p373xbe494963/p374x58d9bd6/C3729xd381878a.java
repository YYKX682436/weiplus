package com.p314xaae8f345.p373xbe494963.p374x58d9bd6;

@com.p314xaae8f345.p373xbe494963.p378x2e06d1.p379xc6ad7b24.InterfaceC3751x20efb56(m29314x6ac9171 = "liteav::manager")
/* renamed from: com.tencent.liteav.audio.TXAudioEffectManagerImpl */
/* loaded from: classes16.dex */
public class C3729xd381878a implements com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a {

    /* renamed from: EFFECT_PLAYER_ID_TYPE */
    private static final int f14552xf94d40ee = 2;
    private static final java.lang.String TAG = "TXAudioEffectManagerImpl";

    /* renamed from: mEffectIdList */
    private java.util.List<java.lang.Integer> f14553x6eabba57 = new java.util.ArrayList();

    /* renamed from: mMusicPlayObserver */
    private final com.p314xaae8f345.p373xbe494963.p374x58d9bd6.C3729xd381878a.MusicPlayObserver f14554x3fe08802;

    /* renamed from: mMusicPreloadObserver */
    private final com.p314xaae8f345.p373xbe494963.p374x58d9bd6.C3729xd381878a.MusicPreloadObserver f14555xca9ce327;

    /* renamed from: mNativeAudioEffectMgr */
    private long f14556xecb69795;

    /* renamed from: com.tencent.liteav.audio.TXAudioEffectManagerImpl$AudioBgmParams */
    /* loaded from: classes10.dex */
    public static class AudioBgmParams {

        /* renamed from: mParams */
        private com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.AudioMusicParam f14557x14172053;

        public AudioBgmParams(com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.AudioMusicParam audioMusicParam) {
            this.f14557x14172053 = audioMusicParam;
        }

        /* renamed from: getEndTimeMS */
        public long m29118x606f7338() {
            return this.f14557x14172053.f14518x610201ee;
        }

        /* renamed from: getLoopCount */
        public int m29119x49c59215() {
            return this.f14557x14172053.f14520x4a5820cb;
        }

        /* renamed from: getPath */
        public java.lang.String m29120xfb83cc9b() {
            return this.f14557x14172053.f14521x346425;
        }

        /* renamed from: getStartTimeMS */
        public long m29121x6bb282ff() {
            return this.f14557x14172053.f14523x91dc3c35;
        }

        /* renamed from: isPublish */
        public boolean m29122xcf69e485() {
            return this.f14557x14172053.f14522xf1f89d0f;
        }
    }

    /* renamed from: com.tencent.liteav.audio.TXAudioEffectManagerImpl$MusicPlayObserver */
    /* loaded from: classes3.dex */
    public static class MusicPlayObserver {

        /* renamed from: mObserverMap */
        private final java.util.HashMap<java.lang.Long, com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.TXMusicPlayObserver> f14558xb18ef3f9 = new java.util.HashMap<>();

        /* renamed from: addObserver */
        public void m29123xdab4fe97(long j17, com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.TXMusicPlayObserver tXMusicPlayObserver) {
            if (tXMusicPlayObserver == null) {
                return;
            }
            synchronized (this) {
                this.f14558xb18ef3f9.put(java.lang.Long.valueOf(j17), tXMusicPlayObserver);
            }
        }

        /* renamed from: onComplete */
        public void m29124x815f5438(long j17, int i17) {
            com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.TXMusicPlayObserver tXMusicPlayObserver;
            synchronized (this) {
                tXMusicPlayObserver = this.f14558xb18ef3f9.get(java.lang.Long.valueOf(j17));
            }
            if (tXMusicPlayObserver != null) {
                tXMusicPlayObserver.mo10551x815f5438((int) j17, i17);
            }
        }

        /* renamed from: onPlayProgress */
        public void m29125xfd1c900(long j17, long j18, long j19) {
            com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.TXMusicPlayObserver tXMusicPlayObserver;
            synchronized (this) {
                tXMusicPlayObserver = this.f14558xb18ef3f9.get(java.lang.Long.valueOf(j17));
            }
            if (tXMusicPlayObserver != null) {
                tXMusicPlayObserver.mo10552xfd1c900((int) j17, j18, j19);
            }
        }

        /* renamed from: onStart */
        public void m29126xb05099c3(long j17, int i17) {
            com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.TXMusicPlayObserver tXMusicPlayObserver;
            synchronized (this) {
                tXMusicPlayObserver = this.f14558xb18ef3f9.get(java.lang.Long.valueOf(j17));
            }
            if (tXMusicPlayObserver != null) {
                tXMusicPlayObserver.mo10553xb05099c3((int) j17, i17);
            }
        }

        /* renamed from: removeObserver */
        public void m29127xb5bdeb7a(long j17) {
            synchronized (this) {
                this.f14558xb18ef3f9.remove(java.lang.Long.valueOf(j17));
            }
        }
    }

    /* renamed from: com.tencent.liteav.audio.TXAudioEffectManagerImpl$MusicPreloadObserver */
    /* loaded from: classes16.dex */
    public static class MusicPreloadObserver {

        /* renamed from: mObserver */
        private com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.TXMusicPreloadObserver f14559x39c4fa63;

        /* renamed from: onLoadError */
        public void m29128x4f8e79a3(long j17, int i17) {
            com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.TXMusicPreloadObserver tXMusicPreloadObserver = this.f14559x39c4fa63;
            if (tXMusicPreloadObserver != null) {
                tXMusicPreloadObserver.m29071x4f8e79a3((int) j17, i17);
            }
        }

        /* renamed from: onLoadProgress */
        public void m29129x861c30b2(long j17, int i17) {
            com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.TXMusicPreloadObserver tXMusicPreloadObserver = this.f14559x39c4fa63;
            if (tXMusicPreloadObserver != null) {
                tXMusicPreloadObserver.m29072x861c30b2((int) j17, i17);
            }
        }

        /* renamed from: setObserver */
        public void m29130x8b59f158(com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.TXMusicPreloadObserver tXMusicPreloadObserver) {
            this.f14559x39c4fa63 = tXMusicPreloadObserver;
        }
    }

    public C3729xd381878a(long j17) {
        this.f14556xecb69795 = 0L;
        com.p314xaae8f345.p373xbe494963.p374x58d9bd6.C3729xd381878a.MusicPlayObserver musicPlayObserver = new com.p314xaae8f345.p373xbe494963.p374x58d9bd6.C3729xd381878a.MusicPlayObserver();
        this.f14554x3fe08802 = musicPlayObserver;
        com.p314xaae8f345.p373xbe494963.p374x58d9bd6.C3729xd381878a.MusicPreloadObserver musicPreloadObserver = new com.p314xaae8f345.p373xbe494963.p374x58d9bd6.C3729xd381878a.MusicPreloadObserver();
        this.f14555xca9ce327 = musicPreloadObserver;
        this.f14556xecb69795 = j17;
        if (j17 != 0) {
            m29092x5ce5910(j17, musicPlayObserver);
            m29099x56594bb4(this.f14556xecb69795, musicPreloadObserver);
        }
    }

    /* renamed from: convertToEffectId */
    private static long m29081xefdf203a(int i17) {
        return 8589934592L | i17;
    }

    /* renamed from: nativeDestroy */
    private static native void m29082x23caefe3(long j17);

    /* renamed from: nativeEnableVoiceEarMonitor */
    private static native void m29083x9c29a81c(long j17, boolean z17);

    /* renamed from: nativeGetMusicCurrentPosInMS */
    private static native long m29084x6ce6e18c(long j17, long j18);

    /* renamed from: nativeGetMusicDurationInMS */
    private static native long m29085x1e4d8605(long j17, java.lang.String str);

    /* renamed from: nativeGetMusicTrackCount */
    private static native int m29086xd81e4cca(long j17, long j18);

    /* renamed from: nativePausePlayMusic */
    private static native void m29087xcd1449f2(long j17, long j18);

    /* renamed from: nativePreloadMusic */
    private static native void m29088xb63b2753(long j17, long j18, com.p314xaae8f345.p373xbe494963.p374x58d9bd6.C3729xd381878a.AudioBgmParams audioBgmParams);

    /* renamed from: nativeResumePlayMusic */
    private static native void m29089x86a9e48d(long j17, long j18);

    /* renamed from: nativeSeekMusicToPosInMS */
    private static native void m29090x76b39f6e(long j17, long j18, long j19);

    /* renamed from: nativeSetAllMusicVolume */
    private static native void m29091xb1e3d6e9(long j17, int i17);

    /* renamed from: nativeSetMusicObserver */
    private static native void m29092x5ce5910(long j17, com.p314xaae8f345.p373xbe494963.p374x58d9bd6.C3729xd381878a.MusicPlayObserver musicPlayObserver);

    /* renamed from: nativeSetMusicPitch */
    private static native void m29093x909af746(long j17, long j18, float f17);

    /* renamed from: nativeSetMusicPlayoutVolume */
    private static native void m29094xa00ed5a(long j17, long j18, int i17);

    /* renamed from: nativeSetMusicPublishVolume */
    private static native void m29095xb841f70f(long j17, long j18, int i17);

    /* renamed from: nativeSetMusicScratchSpeedRate */
    private static native void m29096x993c9827(long j17, long j18, float f17);

    /* renamed from: nativeSetMusicSpeedRate */
    private static native void m29097xcdf206cd(long j17, long j18, float f17);

    /* renamed from: nativeSetMusicTrack */
    private static native void m29098x90d72551(long j17, long j18, int i17);

    /* renamed from: nativeSetPreloadObserver */
    private static native void m29099x56594bb4(long j17, com.p314xaae8f345.p373xbe494963.p374x58d9bd6.C3729xd381878a.MusicPreloadObserver musicPreloadObserver);

    /* renamed from: nativeSetVoiceCaptureVolume */
    private static native void m29100x93328619(long j17, int i17);

    /* renamed from: nativeSetVoiceChangerType */
    private static native void m29101xb7715f75(long j17, int i17);

    /* renamed from: nativeSetVoiceEarMonitorVolume */
    private static native void m29102x6d7acea5(long j17, int i17);

    /* renamed from: nativeSetVoicePitch */
    private static native void m29103x64cde459(long j17, double d17);

    /* renamed from: nativeSetVoiceReverbType */
    private static native void m29104x23cd5ab3(long j17, int i17);

    /* renamed from: nativeStartPlayMusic */
    private static native void m29105x47ef2506(long j17, long j18, com.p314xaae8f345.p373xbe494963.p374x58d9bd6.C3729xd381878a.AudioBgmParams audioBgmParams);

    /* renamed from: nativeStopPlayMusic */
    private static native void m29106xbabe4a98(long j17, long j18);

    /* renamed from: voiceChangerTypeFromInt */
    public static com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.TXVoiceChangerType m29107x877e0ffb(int i17) {
        return i17 == 0 ? com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.TXVoiceChangerType.TXLiveVoiceChangerType_0 : i17 == 1 ? com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.TXVoiceChangerType.TXLiveVoiceChangerType_1 : i17 == 2 ? com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.TXVoiceChangerType.TXLiveVoiceChangerType_2 : i17 == 3 ? com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.TXVoiceChangerType.TXLiveVoiceChangerType_3 : i17 == 4 ? com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.TXVoiceChangerType.TXLiveVoiceChangerType_4 : i17 == 5 ? com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.TXVoiceChangerType.TXLiveVoiceChangerType_5 : i17 == 6 ? com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.TXVoiceChangerType.TXLiveVoiceChangerType_6 : i17 == 7 ? com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.TXVoiceChangerType.TXLiveVoiceChangerType_7 : i17 == 8 ? com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.TXVoiceChangerType.TXLiveVoiceChangerType_8 : i17 == 9 ? com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.TXVoiceChangerType.TXLiveVoiceChangerType_9 : i17 == 10 ? com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.TXVoiceChangerType.TXLiveVoiceChangerType_10 : i17 == 11 ? com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.TXVoiceChangerType.TXLiveVoiceChangerType_11 : com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.TXVoiceChangerType.TXLiveVoiceChangerType_0;
    }

    /* renamed from: voiceReverbTypeFromInt */
    public static com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.TXVoiceReverbType m29108x8010b307(int i17) {
        return i17 == 0 ? com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.TXVoiceReverbType.TXLiveVoiceReverbType_0 : i17 == 1 ? com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.TXVoiceReverbType.TXLiveVoiceReverbType_1 : i17 == 2 ? com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.TXVoiceReverbType.TXLiveVoiceReverbType_2 : i17 == 3 ? com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.TXVoiceReverbType.TXLiveVoiceReverbType_3 : i17 == 4 ? com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.TXVoiceReverbType.TXLiveVoiceReverbType_4 : i17 == 5 ? com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.TXVoiceReverbType.TXLiveVoiceReverbType_5 : i17 == 6 ? com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.TXVoiceReverbType.TXLiveVoiceReverbType_6 : i17 == 7 ? com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.TXVoiceReverbType.TXLiveVoiceReverbType_7 : i17 == 8 ? com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.TXVoiceReverbType.TXLiveVoiceReverbType_8 : i17 == 9 ? com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.TXVoiceReverbType.TXLiveVoiceReverbType_9 : i17 == 10 ? com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.TXVoiceReverbType.TXLiveVoiceReverbType_10 : com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.TXVoiceReverbType.TXLiveVoiceReverbType_0;
    }

    @Override // com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a
    /* renamed from: enableVoiceEarMonitor */
    public void mo29046x52f4e3f3(boolean z17) {
        long j17 = this.f14556xecb69795;
        if (j17 != 0) {
            m29083x9c29a81c(j17, z17);
        }
    }

    /* renamed from: finalize */
    public void m29109xd764dc1e() {
        super.finalize();
        long j17 = this.f14556xecb69795;
        if (j17 != 0) {
            m29082x23caefe3(j17);
            this.f14556xecb69795 = 0L;
        }
    }

    @Override // com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a
    /* renamed from: getMusicCurrentPosInMS */
    public long mo29047x8f832095(int i17) {
        long j17 = this.f14556xecb69795;
        if (j17 != 0) {
            return m29084x6ce6e18c(j17, i17);
        }
        return 0L;
    }

    @Override // com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a
    /* renamed from: getMusicDurationInMS */
    public long mo29048x97cff34e(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(TAG, "getMusicDurationInMS invalid params");
            return 0L;
        }
        long j17 = this.f14556xecb69795;
        if (j17 != 0) {
            return m29085x1e4d8605(j17, str);
        }
        return 0L;
    }

    @Override // com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a
    /* renamed from: getMusicTrackCount */
    public int mo29049xfcbd7853(int i17) {
        long j17 = this.f14556xecb69795;
        if (j17 != 0) {
            return m29086xd81e4cca(j17, i17);
        }
        return 0;
    }

    /* renamed from: pauseAudioEffect */
    public void m29110x895bd531(int i17) {
        long j17 = this.f14556xecb69795;
        if (j17 != 0) {
            m29087xcd1449f2(j17, m29081xefdf203a(i17));
        }
    }

    @Override // com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a
    /* renamed from: pausePlayMusic */
    public void mo29050xff20a1fb(int i17) {
        long j17 = this.f14556xecb69795;
        if (j17 != 0) {
            m29087xcd1449f2(j17, i17);
        }
    }

    /* renamed from: playAudioEffect */
    public void m29111x1445d33(com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.AudioMusicParam audioMusicParam) {
        if (audioMusicParam == null || android.text.TextUtils.isEmpty(audioMusicParam.f14521x346425)) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(TAG, "startPlayMusic invalid params");
            return;
        }
        long j17 = this.f14556xecb69795;
        if (j17 != 0) {
            m29105x47ef2506(j17, m29081xefdf203a(audioMusicParam.f127778id), new com.p314xaae8f345.p373xbe494963.p374x58d9bd6.C3729xd381878a.AudioBgmParams(audioMusicParam));
            synchronized (this) {
                this.f14553x6eabba57.add(java.lang.Integer.valueOf(audioMusicParam.f127778id));
            }
        }
    }

    @Override // com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a
    /* renamed from: preloadMusic */
    public boolean mo29051x5e5fed9c(com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.AudioMusicParam audioMusicParam) {
        if (audioMusicParam == null) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(TAG, "preloadMusic invalid params");
            return false;
        }
        long j17 = this.f14556xecb69795;
        if (j17 == 0) {
            return true;
        }
        m29088xb63b2753(j17, audioMusicParam.f127778id, new com.p314xaae8f345.p373xbe494963.p374x58d9bd6.C3729xd381878a.AudioBgmParams(audioMusicParam));
        return true;
    }

    /* renamed from: resumeAudioEffect */
    public void m29112x7e177a9a(int i17) {
        long j17 = this.f14556xecb69795;
        if (j17 != 0) {
            m29089x86a9e48d(j17, m29081xefdf203a(i17));
        }
    }

    @Override // com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a
    /* renamed from: resumePlayMusic */
    public void mo29052x96288da4(int i17) {
        long j17 = this.f14556xecb69795;
        if (j17 != 0) {
            m29089x86a9e48d(j17, i17);
        }
    }

    @Override // com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a
    /* renamed from: seekMusicToPosInMS */
    public void mo29053x9b52caf7(int i17, int i18) {
        long j17 = this.f14556xecb69795;
        if (j17 != 0) {
            m29090x76b39f6e(j17, i17, i18);
        }
    }

    /* renamed from: setAllAudioEffectsVolume */
    public void m29113x9ed8f6c5(int i17) {
        if (this.f14556xecb69795 != 0) {
            synchronized (this) {
                java.util.Iterator<java.lang.Integer> it = this.f14553x6eabba57.iterator();
                while (it.hasNext()) {
                    m29114xf709cebf(it.next().intValue(), i17);
                }
            }
        }
    }

    @Override // com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a
    /* renamed from: setAllMusicVolume */
    public void mo29054xdc5c9640(int i17) {
        long j17 = this.f14556xecb69795;
        if (j17 != 0) {
            m29091xb1e3d6e9(j17, i17);
        }
    }

    /* renamed from: setAudioEffectVolume */
    public void m29114xf709cebf(int i17, int i18) {
        long j17 = this.f14556xecb69795;
        if (j17 != 0) {
            m29094xa00ed5a(j17, m29081xefdf203a(i17), i18);
            m29095xb841f70f(this.f14556xecb69795, m29081xefdf203a(i17), i18);
        }
    }

    /* renamed from: setEffectObserver */
    public void m29115x6a508489(int i17, com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.TXMusicPlayObserver tXMusicPlayObserver) {
        if (this.f14556xecb69795 != 0) {
            if (tXMusicPlayObserver != null) {
                this.f14554x3fe08802.m29123xdab4fe97(m29081xefdf203a(i17), tXMusicPlayObserver);
            } else {
                this.f14554x3fe08802.m29127xb5bdeb7a(m29081xefdf203a(i17));
            }
        }
    }

    @Override // com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a
    /* renamed from: setMusicObserver */
    public void mo29055xe624d2d9(int i17, com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.TXMusicPlayObserver tXMusicPlayObserver) {
        if (this.f14556xecb69795 != 0) {
            if (tXMusicPlayObserver != null) {
                this.f14554x3fe08802.m29123xdab4fe97(i17, tXMusicPlayObserver);
            } else {
                this.f14554x3fe08802.m29127xb5bdeb7a(i17);
            }
        }
    }

    @Override // com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a
    /* renamed from: setMusicPitch */
    public void mo29056xed0efa1d(int i17, float f17) {
        long j17 = this.f14556xecb69795;
        if (j17 != 0) {
            m29093x909af746(j17, i17, f17);
        }
    }

    @Override // com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a
    /* renamed from: setMusicPlayoutVolume */
    public void mo29057xc0cc2931(int i17, int i18) {
        long j17 = this.f14556xecb69795;
        if (j17 != 0) {
            m29094xa00ed5a(j17, i17, i18);
        }
    }

    @Override // com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a
    /* renamed from: setMusicPublishVolume */
    public void mo29058x6f0d32e6(int i17, int i18) {
        long j17 = this.f14556xecb69795;
        if (j17 != 0) {
            m29095xb841f70f(j17, i17, i18);
        }
    }

    @Override // com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a
    /* renamed from: setMusicScratchSpeedRate */
    public void mo29059x85c538f0(int i17, float f17) {
        long j17 = this.f14556xecb69795;
        if (j17 != 0) {
            m29096x993c9827(j17, i17, f17);
        }
    }

    @Override // com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a
    /* renamed from: setMusicSpeedRate */
    public void mo29060xf86ac624(int i17, float f17) {
        long j17 = this.f14556xecb69795;
        if (j17 != 0) {
            m29097xcdf206cd(j17, i17, f17);
        }
    }

    @Override // com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a
    /* renamed from: setMusicTrack */
    public void mo29061xed4b2828(int i17, int i18) {
        long j17 = this.f14556xecb69795;
        if (j17 != 0) {
            m29098x90d72551(j17, i17, i18);
        }
    }

    @Override // com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a
    /* renamed from: setPreloadObserver */
    public void mo29062x7af8773d(com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.TXMusicPreloadObserver tXMusicPreloadObserver) {
        if (this.f14556xecb69795 != 0) {
            this.f14555xca9ce327.m29130x8b59f158(tXMusicPreloadObserver);
        }
    }

    @Override // com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a
    /* renamed from: setVoiceCaptureVolume */
    public void mo29063x49fdc1f0(int i17) {
        long j17 = this.f14556xecb69795;
        if (j17 != 0) {
            m29100x93328619(j17, i17);
        }
    }

    @Override // com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a
    /* renamed from: setVoiceChangerType */
    public void mo29064x26b7a50c(com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.TXVoiceChangerType tXVoiceChangerType) {
        long j17 = this.f14556xecb69795;
        if (j17 == 0 || tXVoiceChangerType == null) {
            return;
        }
        m29101xb7715f75(j17, tXVoiceChangerType.m29076x41af0e64());
    }

    @Override // com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a
    /* renamed from: setVoiceEarMonitorVolume */
    public void mo29065x5a036f6e(int i17) {
        long j17 = this.f14556xecb69795;
        if (j17 != 0) {
            m29102x6d7acea5(j17, i17);
        }
    }

    @Override // com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a
    /* renamed from: setVoicePitch */
    public void mo29066xc141e730(double d17) {
        long j17 = this.f14556xecb69795;
        if (j17 != 0) {
            m29103x64cde459(j17, d17);
        }
    }

    @Override // com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a
    /* renamed from: setVoiceReverbType */
    public void mo29067x486c863c(com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.TXVoiceReverbType tXVoiceReverbType) {
        long j17 = this.f14556xecb69795;
        if (j17 == 0 || tXVoiceReverbType == null) {
            return;
        }
        m29104x23cd5ab3(j17, tXVoiceReverbType.m29080x41af0e64());
    }

    @Override // com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a
    /* renamed from: startPlayMusic */
    public boolean mo29068x79fb7d0f(com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a.AudioMusicParam audioMusicParam) {
        if (audioMusicParam == null) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(TAG, "startPlayMusic invalid params");
            return false;
        }
        long j17 = this.f14556xecb69795;
        if (j17 == 0) {
            return true;
        }
        m29105x47ef2506(j17, audioMusicParam.f127778id, new com.p314xaae8f345.p373xbe494963.p374x58d9bd6.C3729xd381878a.AudioBgmParams(audioMusicParam));
        return true;
    }

    /* renamed from: stopAllAudioEffects */
    public void m29116x1698682b() {
        if (this.f14556xecb69795 != 0) {
            synchronized (this) {
                for (java.lang.Integer num : this.f14553x6eabba57) {
                    this.f14554x3fe08802.m29127xb5bdeb7a(m29081xefdf203a(num.intValue()));
                    m29106xbabe4a98(this.f14556xecb69795, m29081xefdf203a(num.intValue()));
                }
                this.f14553x6eabba57.clear();
            }
        }
    }

    /* renamed from: stopAudioEffect */
    public void m29117xe3b073a5(int i17) {
        if (this.f14556xecb69795 != 0) {
            this.f14554x3fe08802.m29127xb5bdeb7a(m29081xefdf203a(i17));
            m29106xbabe4a98(this.f14556xecb69795, m29081xefdf203a(i17));
            synchronized (this) {
                int indexOf = this.f14553x6eabba57.indexOf(java.lang.Integer.valueOf(i17));
                if (indexOf >= 0) {
                    this.f14553x6eabba57.remove(indexOf);
                }
            }
        }
    }

    @Override // com.p314xaae8f345.p373xbe494963.p374x58d9bd6.InterfaceC3728x6d2ee64a
    /* renamed from: stopPlayMusic */
    public void mo29069x17324d6f(int i17) {
        long j17 = this.f14556xecb69795;
        if (j17 != 0) {
            m29106xbabe4a98(j17, i17);
        }
    }
}
