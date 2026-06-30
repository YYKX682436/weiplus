package com.tencent.liteav.audio;

@com.tencent.liteav.base.annotations.JNINamespace("liteav::manager")
/* loaded from: classes16.dex */
public class TXAudioEffectManagerImpl implements com.tencent.liteav.audio.TXAudioEffectManager {
    private static final int EFFECT_PLAYER_ID_TYPE = 2;
    private static final java.lang.String TAG = "TXAudioEffectManagerImpl";
    private java.util.List<java.lang.Integer> mEffectIdList = new java.util.ArrayList();
    private final com.tencent.liteav.audio.TXAudioEffectManagerImpl.MusicPlayObserver mMusicPlayObserver;
    private final com.tencent.liteav.audio.TXAudioEffectManagerImpl.MusicPreloadObserver mMusicPreloadObserver;
    private long mNativeAudioEffectMgr;

    /* loaded from: classes10.dex */
    public static class AudioBgmParams {
        private com.tencent.liteav.audio.TXAudioEffectManager.AudioMusicParam mParams;

        public AudioBgmParams(com.tencent.liteav.audio.TXAudioEffectManager.AudioMusicParam audioMusicParam) {
            this.mParams = audioMusicParam;
        }

        public long getEndTimeMS() {
            return this.mParams.endTimeMS;
        }

        public int getLoopCount() {
            return this.mParams.loopCount;
        }

        public java.lang.String getPath() {
            return this.mParams.path;
        }

        public long getStartTimeMS() {
            return this.mParams.startTimeMS;
        }

        public boolean isPublish() {
            return this.mParams.publish;
        }
    }

    /* loaded from: classes3.dex */
    public static class MusicPlayObserver {
        private final java.util.HashMap<java.lang.Long, com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver> mObserverMap = new java.util.HashMap<>();

        public void addObserver(long j17, com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver tXMusicPlayObserver) {
            if (tXMusicPlayObserver == null) {
                return;
            }
            synchronized (this) {
                this.mObserverMap.put(java.lang.Long.valueOf(j17), tXMusicPlayObserver);
            }
        }

        public void onComplete(long j17, int i17) {
            com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver tXMusicPlayObserver;
            synchronized (this) {
                tXMusicPlayObserver = this.mObserverMap.get(java.lang.Long.valueOf(j17));
            }
            if (tXMusicPlayObserver != null) {
                tXMusicPlayObserver.onComplete((int) j17, i17);
            }
        }

        public void onPlayProgress(long j17, long j18, long j19) {
            com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver tXMusicPlayObserver;
            synchronized (this) {
                tXMusicPlayObserver = this.mObserverMap.get(java.lang.Long.valueOf(j17));
            }
            if (tXMusicPlayObserver != null) {
                tXMusicPlayObserver.onPlayProgress((int) j17, j18, j19);
            }
        }

        public void onStart(long j17, int i17) {
            com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver tXMusicPlayObserver;
            synchronized (this) {
                tXMusicPlayObserver = this.mObserverMap.get(java.lang.Long.valueOf(j17));
            }
            if (tXMusicPlayObserver != null) {
                tXMusicPlayObserver.onStart((int) j17, i17);
            }
        }

        public void removeObserver(long j17) {
            synchronized (this) {
                this.mObserverMap.remove(java.lang.Long.valueOf(j17));
            }
        }
    }

    /* loaded from: classes16.dex */
    public static class MusicPreloadObserver {
        private com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPreloadObserver mObserver;

        public void onLoadError(long j17, int i17) {
            com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPreloadObserver tXMusicPreloadObserver = this.mObserver;
            if (tXMusicPreloadObserver != null) {
                tXMusicPreloadObserver.onLoadError((int) j17, i17);
            }
        }

        public void onLoadProgress(long j17, int i17) {
            com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPreloadObserver tXMusicPreloadObserver = this.mObserver;
            if (tXMusicPreloadObserver != null) {
                tXMusicPreloadObserver.onLoadProgress((int) j17, i17);
            }
        }

        public void setObserver(com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPreloadObserver tXMusicPreloadObserver) {
            this.mObserver = tXMusicPreloadObserver;
        }
    }

    public TXAudioEffectManagerImpl(long j17) {
        this.mNativeAudioEffectMgr = 0L;
        com.tencent.liteav.audio.TXAudioEffectManagerImpl.MusicPlayObserver musicPlayObserver = new com.tencent.liteav.audio.TXAudioEffectManagerImpl.MusicPlayObserver();
        this.mMusicPlayObserver = musicPlayObserver;
        com.tencent.liteav.audio.TXAudioEffectManagerImpl.MusicPreloadObserver musicPreloadObserver = new com.tencent.liteav.audio.TXAudioEffectManagerImpl.MusicPreloadObserver();
        this.mMusicPreloadObserver = musicPreloadObserver;
        this.mNativeAudioEffectMgr = j17;
        if (j17 != 0) {
            nativeSetMusicObserver(j17, musicPlayObserver);
            nativeSetPreloadObserver(this.mNativeAudioEffectMgr, musicPreloadObserver);
        }
    }

    private static long convertToEffectId(int i17) {
        return 8589934592L | i17;
    }

    private static native void nativeDestroy(long j17);

    private static native void nativeEnableVoiceEarMonitor(long j17, boolean z17);

    private static native long nativeGetMusicCurrentPosInMS(long j17, long j18);

    private static native long nativeGetMusicDurationInMS(long j17, java.lang.String str);

    private static native int nativeGetMusicTrackCount(long j17, long j18);

    private static native void nativePausePlayMusic(long j17, long j18);

    private static native void nativePreloadMusic(long j17, long j18, com.tencent.liteav.audio.TXAudioEffectManagerImpl.AudioBgmParams audioBgmParams);

    private static native void nativeResumePlayMusic(long j17, long j18);

    private static native void nativeSeekMusicToPosInMS(long j17, long j18, long j19);

    private static native void nativeSetAllMusicVolume(long j17, int i17);

    private static native void nativeSetMusicObserver(long j17, com.tencent.liteav.audio.TXAudioEffectManagerImpl.MusicPlayObserver musicPlayObserver);

    private static native void nativeSetMusicPitch(long j17, long j18, float f17);

    private static native void nativeSetMusicPlayoutVolume(long j17, long j18, int i17);

    private static native void nativeSetMusicPublishVolume(long j17, long j18, int i17);

    private static native void nativeSetMusicScratchSpeedRate(long j17, long j18, float f17);

    private static native void nativeSetMusicSpeedRate(long j17, long j18, float f17);

    private static native void nativeSetMusicTrack(long j17, long j18, int i17);

    private static native void nativeSetPreloadObserver(long j17, com.tencent.liteav.audio.TXAudioEffectManagerImpl.MusicPreloadObserver musicPreloadObserver);

    private static native void nativeSetVoiceCaptureVolume(long j17, int i17);

    private static native void nativeSetVoiceChangerType(long j17, int i17);

    private static native void nativeSetVoiceEarMonitorVolume(long j17, int i17);

    private static native void nativeSetVoicePitch(long j17, double d17);

    private static native void nativeSetVoiceReverbType(long j17, int i17);

    private static native void nativeStartPlayMusic(long j17, long j18, com.tencent.liteav.audio.TXAudioEffectManagerImpl.AudioBgmParams audioBgmParams);

    private static native void nativeStopPlayMusic(long j17, long j18);

    public static com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceChangerType voiceChangerTypeFromInt(int i17) {
        return i17 == 0 ? com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_0 : i17 == 1 ? com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_1 : i17 == 2 ? com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_2 : i17 == 3 ? com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_3 : i17 == 4 ? com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_4 : i17 == 5 ? com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_5 : i17 == 6 ? com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_6 : i17 == 7 ? com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_7 : i17 == 8 ? com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_8 : i17 == 9 ? com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_9 : i17 == 10 ? com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_10 : i17 == 11 ? com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_11 : com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_0;
    }

    public static com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceReverbType voiceReverbTypeFromInt(int i17) {
        return i17 == 0 ? com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_0 : i17 == 1 ? com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_1 : i17 == 2 ? com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_2 : i17 == 3 ? com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_3 : i17 == 4 ? com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_4 : i17 == 5 ? com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_5 : i17 == 6 ? com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_6 : i17 == 7 ? com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_7 : i17 == 8 ? com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_8 : i17 == 9 ? com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_9 : i17 == 10 ? com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_10 : com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_0;
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void enableVoiceEarMonitor(boolean z17) {
        long j17 = this.mNativeAudioEffectMgr;
        if (j17 != 0) {
            nativeEnableVoiceEarMonitor(j17, z17);
        }
    }

    public void finalize() {
        super.finalize();
        long j17 = this.mNativeAudioEffectMgr;
        if (j17 != 0) {
            nativeDestroy(j17);
            this.mNativeAudioEffectMgr = 0L;
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public long getMusicCurrentPosInMS(int i17) {
        long j17 = this.mNativeAudioEffectMgr;
        if (j17 != 0) {
            return nativeGetMusicCurrentPosInMS(j17, i17);
        }
        return 0L;
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public long getMusicDurationInMS(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.liteav.base.util.LiteavLog.e(TAG, "getMusicDurationInMS invalid params");
            return 0L;
        }
        long j17 = this.mNativeAudioEffectMgr;
        if (j17 != 0) {
            return nativeGetMusicDurationInMS(j17, str);
        }
        return 0L;
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public int getMusicTrackCount(int i17) {
        long j17 = this.mNativeAudioEffectMgr;
        if (j17 != 0) {
            return nativeGetMusicTrackCount(j17, i17);
        }
        return 0;
    }

    public void pauseAudioEffect(int i17) {
        long j17 = this.mNativeAudioEffectMgr;
        if (j17 != 0) {
            nativePausePlayMusic(j17, convertToEffectId(i17));
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void pausePlayMusic(int i17) {
        long j17 = this.mNativeAudioEffectMgr;
        if (j17 != 0) {
            nativePausePlayMusic(j17, i17);
        }
    }

    public void playAudioEffect(com.tencent.liteav.audio.TXAudioEffectManager.AudioMusicParam audioMusicParam) {
        if (audioMusicParam == null || android.text.TextUtils.isEmpty(audioMusicParam.path)) {
            com.tencent.liteav.base.util.LiteavLog.e(TAG, "startPlayMusic invalid params");
            return;
        }
        long j17 = this.mNativeAudioEffectMgr;
        if (j17 != 0) {
            nativeStartPlayMusic(j17, convertToEffectId(audioMusicParam.f46245id), new com.tencent.liteav.audio.TXAudioEffectManagerImpl.AudioBgmParams(audioMusicParam));
            synchronized (this) {
                this.mEffectIdList.add(java.lang.Integer.valueOf(audioMusicParam.f46245id));
            }
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public boolean preloadMusic(com.tencent.liteav.audio.TXAudioEffectManager.AudioMusicParam audioMusicParam) {
        if (audioMusicParam == null) {
            com.tencent.liteav.base.util.LiteavLog.e(TAG, "preloadMusic invalid params");
            return false;
        }
        long j17 = this.mNativeAudioEffectMgr;
        if (j17 == 0) {
            return true;
        }
        nativePreloadMusic(j17, audioMusicParam.f46245id, new com.tencent.liteav.audio.TXAudioEffectManagerImpl.AudioBgmParams(audioMusicParam));
        return true;
    }

    public void resumeAudioEffect(int i17) {
        long j17 = this.mNativeAudioEffectMgr;
        if (j17 != 0) {
            nativeResumePlayMusic(j17, convertToEffectId(i17));
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void resumePlayMusic(int i17) {
        long j17 = this.mNativeAudioEffectMgr;
        if (j17 != 0) {
            nativeResumePlayMusic(j17, i17);
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void seekMusicToPosInMS(int i17, int i18) {
        long j17 = this.mNativeAudioEffectMgr;
        if (j17 != 0) {
            nativeSeekMusicToPosInMS(j17, i17, i18);
        }
    }

    public void setAllAudioEffectsVolume(int i17) {
        if (this.mNativeAudioEffectMgr != 0) {
            synchronized (this) {
                java.util.Iterator<java.lang.Integer> it = this.mEffectIdList.iterator();
                while (it.hasNext()) {
                    setAudioEffectVolume(it.next().intValue(), i17);
                }
            }
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void setAllMusicVolume(int i17) {
        long j17 = this.mNativeAudioEffectMgr;
        if (j17 != 0) {
            nativeSetAllMusicVolume(j17, i17);
        }
    }

    public void setAudioEffectVolume(int i17, int i18) {
        long j17 = this.mNativeAudioEffectMgr;
        if (j17 != 0) {
            nativeSetMusicPlayoutVolume(j17, convertToEffectId(i17), i18);
            nativeSetMusicPublishVolume(this.mNativeAudioEffectMgr, convertToEffectId(i17), i18);
        }
    }

    public void setEffectObserver(int i17, com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver tXMusicPlayObserver) {
        if (this.mNativeAudioEffectMgr != 0) {
            if (tXMusicPlayObserver != null) {
                this.mMusicPlayObserver.addObserver(convertToEffectId(i17), tXMusicPlayObserver);
            } else {
                this.mMusicPlayObserver.removeObserver(convertToEffectId(i17));
            }
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void setMusicObserver(int i17, com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver tXMusicPlayObserver) {
        if (this.mNativeAudioEffectMgr != 0) {
            if (tXMusicPlayObserver != null) {
                this.mMusicPlayObserver.addObserver(i17, tXMusicPlayObserver);
            } else {
                this.mMusicPlayObserver.removeObserver(i17);
            }
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void setMusicPitch(int i17, float f17) {
        long j17 = this.mNativeAudioEffectMgr;
        if (j17 != 0) {
            nativeSetMusicPitch(j17, i17, f17);
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void setMusicPlayoutVolume(int i17, int i18) {
        long j17 = this.mNativeAudioEffectMgr;
        if (j17 != 0) {
            nativeSetMusicPlayoutVolume(j17, i17, i18);
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void setMusicPublishVolume(int i17, int i18) {
        long j17 = this.mNativeAudioEffectMgr;
        if (j17 != 0) {
            nativeSetMusicPublishVolume(j17, i17, i18);
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void setMusicScratchSpeedRate(int i17, float f17) {
        long j17 = this.mNativeAudioEffectMgr;
        if (j17 != 0) {
            nativeSetMusicScratchSpeedRate(j17, i17, f17);
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void setMusicSpeedRate(int i17, float f17) {
        long j17 = this.mNativeAudioEffectMgr;
        if (j17 != 0) {
            nativeSetMusicSpeedRate(j17, i17, f17);
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void setMusicTrack(int i17, int i18) {
        long j17 = this.mNativeAudioEffectMgr;
        if (j17 != 0) {
            nativeSetMusicTrack(j17, i17, i18);
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void setPreloadObserver(com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPreloadObserver tXMusicPreloadObserver) {
        if (this.mNativeAudioEffectMgr != 0) {
            this.mMusicPreloadObserver.setObserver(tXMusicPreloadObserver);
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void setVoiceCaptureVolume(int i17) {
        long j17 = this.mNativeAudioEffectMgr;
        if (j17 != 0) {
            nativeSetVoiceCaptureVolume(j17, i17);
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void setVoiceChangerType(com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceChangerType tXVoiceChangerType) {
        long j17 = this.mNativeAudioEffectMgr;
        if (j17 == 0 || tXVoiceChangerType == null) {
            return;
        }
        nativeSetVoiceChangerType(j17, tXVoiceChangerType.getNativeValue());
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void setVoiceEarMonitorVolume(int i17) {
        long j17 = this.mNativeAudioEffectMgr;
        if (j17 != 0) {
            nativeSetVoiceEarMonitorVolume(j17, i17);
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void setVoicePitch(double d17) {
        long j17 = this.mNativeAudioEffectMgr;
        if (j17 != 0) {
            nativeSetVoicePitch(j17, d17);
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void setVoiceReverbType(com.tencent.liteav.audio.TXAudioEffectManager.TXVoiceReverbType tXVoiceReverbType) {
        long j17 = this.mNativeAudioEffectMgr;
        if (j17 == 0 || tXVoiceReverbType == null) {
            return;
        }
        nativeSetVoiceReverbType(j17, tXVoiceReverbType.getNativeValue());
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public boolean startPlayMusic(com.tencent.liteav.audio.TXAudioEffectManager.AudioMusicParam audioMusicParam) {
        if (audioMusicParam == null) {
            com.tencent.liteav.base.util.LiteavLog.e(TAG, "startPlayMusic invalid params");
            return false;
        }
        long j17 = this.mNativeAudioEffectMgr;
        if (j17 == 0) {
            return true;
        }
        nativeStartPlayMusic(j17, audioMusicParam.f46245id, new com.tencent.liteav.audio.TXAudioEffectManagerImpl.AudioBgmParams(audioMusicParam));
        return true;
    }

    public void stopAllAudioEffects() {
        if (this.mNativeAudioEffectMgr != 0) {
            synchronized (this) {
                for (java.lang.Integer num : this.mEffectIdList) {
                    this.mMusicPlayObserver.removeObserver(convertToEffectId(num.intValue()));
                    nativeStopPlayMusic(this.mNativeAudioEffectMgr, convertToEffectId(num.intValue()));
                }
                this.mEffectIdList.clear();
            }
        }
    }

    public void stopAudioEffect(int i17) {
        if (this.mNativeAudioEffectMgr != 0) {
            this.mMusicPlayObserver.removeObserver(convertToEffectId(i17));
            nativeStopPlayMusic(this.mNativeAudioEffectMgr, convertToEffectId(i17));
            synchronized (this) {
                int indexOf = this.mEffectIdList.indexOf(java.lang.Integer.valueOf(i17));
                if (indexOf >= 0) {
                    this.mEffectIdList.remove(indexOf);
                }
            }
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void stopPlayMusic(int i17) {
        long j17 = this.mNativeAudioEffectMgr;
        if (j17 != 0) {
            nativeStopPlayMusic(j17, i17);
        }
    }
}
