package com.tencent.liteav.trtc;

@com.tencent.liteav.base.annotations.JNINamespace("liteav::chorus")
/* loaded from: classes10.dex */
public class TXChorusMusicPlayerImpl extends com.tencent.trtc.TXChorusMusicPlayer {
    private static final java.lang.String TAG = "TXChorusMusicPlayerImpl";
    private final com.tencent.liteav.trtc.TXChorusMusicPlayerImpl.ChorusPlayerListener mListener = new com.tencent.liteav.trtc.TXChorusMusicPlayerImpl.ChorusPlayerListener(0);
    private long mNativePtr;
    private com.tencent.trtc.TRTCCloud mSubTRTCCloud;
    private com.tencent.trtc.TRTCCloud mTRTCCloud;

    /* renamed from: com.tencent.liteav.trtc.TXChorusMusicPlayerImpl$1, reason: invalid class name */
    /* loaded from: classes10.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f46580a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f46581b;

        static {
            int[] iArr = new int[com.tencent.trtc.TXChorusMusicPlayer.TXChorusMusicTrack.values().length];
            f46581b = iArr;
            try {
                iArr[com.tencent.trtc.TXChorusMusicPlayer.TXChorusMusicTrack.TXChorusAccompaniment.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f46581b[com.tencent.trtc.TXChorusMusicPlayer.TXChorusMusicTrack.TXChorusOriginalSong.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[com.tencent.trtc.TXChorusMusicPlayer.TXChorusRole.values().length];
            f46580a = iArr2;
            try {
                iArr2[com.tencent.trtc.TXChorusMusicPlayer.TXChorusRole.TXChorusRoleLeadSinger.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f46580a[com.tencent.trtc.TXChorusMusicPlayer.TXChorusRole.TXChorusRoleBackSinger.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                f46580a[com.tencent.trtc.TXChorusMusicPlayer.TXChorusRole.TXChorusRoleAnchor.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                f46580a[com.tencent.trtc.TXChorusMusicPlayer.TXChorusRole.TXChorusRoleAudience.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class EnterRoomParams {

        /* renamed from: a, reason: collision with root package name */
        private final com.tencent.trtc.TRTCCloudDef.TRTCParams f46583a;

        public EnterRoomParams(com.tencent.trtc.TRTCCloudDef.TRTCParams tRTCParams) {
            this.f46583a = tRTCParams;
        }

        public java.lang.String getBusinessInfo() {
            return this.f46583a.businessInfo;
        }

        public java.lang.String getPrivateMapKey() {
            return this.f46583a.privateMapKey;
        }

        public int getRole() {
            return this.f46583a.role;
        }

        public int getRoomId() {
            return this.f46583a.roomId;
        }

        public int getSdkAppId() {
            return this.f46583a.sdkAppId;
        }

        public java.lang.String getStrRoomId() {
            return this.f46583a.strRoomId;
        }

        public java.lang.String getStreamId() {
            return this.f46583a.streamId;
        }

        public java.lang.String getUserDefineRecordId() {
            return this.f46583a.userDefineRecordId;
        }

        public java.lang.String getUserId() {
            return this.f46583a.userId;
        }

        public java.lang.String getUserSig() {
            return this.f46583a.userSig;
        }
    }

    /* loaded from: classes10.dex */
    public static class TXChorusLyricCharacterList {

        /* renamed from: a, reason: collision with root package name */
        final java.util.List<com.tencent.trtc.TXChorusMusicPlayer.TXChorusLyricCharacter> f46584a;

        public TXChorusLyricCharacterList(int i17) {
            this.f46584a = new java.util.ArrayList(i17);
        }

        public void add(int i17, long j17, long j18, java.lang.String str) {
            com.tencent.trtc.TXChorusMusicPlayer.TXChorusLyricCharacter tXChorusLyricCharacter = new com.tencent.trtc.TXChorusMusicPlayer.TXChorusLyricCharacter();
            tXChorusLyricCharacter.startTimeMs = j17;
            tXChorusLyricCharacter.durationMs = j18;
            tXChorusLyricCharacter.utf8Character = str;
            this.f46584a.add(i17, tXChorusLyricCharacter);
        }

        public java.util.List<com.tencent.trtc.TXChorusMusicPlayer.TXChorusLyricCharacter> getChorusLyricCharacterList() {
            return this.f46584a;
        }
    }

    /* loaded from: classes10.dex */
    public static class TXLyricLineList {

        /* renamed from: a, reason: collision with root package name */
        final java.util.List<com.tencent.trtc.TXChorusMusicPlayer.TXLyricLine> f46585a;

        public TXLyricLineList(int i17) {
            this.f46585a = new java.util.ArrayList(i17);
        }

        public void add(int i17, long j17, long j18, java.util.List<com.tencent.trtc.TXChorusMusicPlayer.TXChorusLyricCharacter> list) {
            com.tencent.trtc.TXChorusMusicPlayer.TXLyricLine tXLyricLine = new com.tencent.trtc.TXChorusMusicPlayer.TXLyricLine();
            tXLyricLine.startTimeMs = j17;
            tXLyricLine.durationMs = j18;
            tXLyricLine.characterArray = list;
            this.f46585a.add(i17, tXLyricLine);
        }

        public java.util.List<com.tencent.trtc.TXChorusMusicPlayer.TXLyricLine> getLyricLineList() {
            return this.f46585a;
        }
    }

    /* loaded from: classes10.dex */
    public static class TXReferencePitchList {

        /* renamed from: a, reason: collision with root package name */
        final java.util.List<com.tencent.trtc.TXChorusMusicPlayer.TXReferencePitch> f46586a;

        public TXReferencePitchList(int i17) {
            this.f46586a = new java.util.ArrayList(i17);
        }

        public void add(int i17, long j17, long j18, int i18) {
            com.tencent.trtc.TXChorusMusicPlayer.TXReferencePitch tXReferencePitch = new com.tencent.trtc.TXChorusMusicPlayer.TXReferencePitch();
            tXReferencePitch.startTimeMs = j17;
            tXReferencePitch.durationMs = j18;
            tXReferencePitch.referencePitch = i18;
            this.f46586a.add(i17, tXReferencePitch);
        }

        public java.util.List<com.tencent.trtc.TXChorusMusicPlayer.TXReferencePitch> getTXReferencePitchList() {
            return this.f46586a;
        }
    }

    private TXChorusMusicPlayerImpl(com.tencent.trtc.TRTCCloud tRTCCloud, java.lang.String str, com.tencent.trtc.TXChorusMusicPlayer.ITXChorusPlayerListener iTXChorusPlayerListener) {
        long j17;
        long j18 = 0;
        this.mNativePtr = 0L;
        this.mTRTCCloud = null;
        this.mSubTRTCCloud = null;
        if (tRTCCloud == null) {
            return;
        }
        this.mTRTCCloud = tRTCCloud;
        try {
            j17 = parseNativePointer(tRTCCloud.callExperimentalAPI("{\"api\":\"getNativeHandle\"}"));
        } catch (java.lang.Throwable th6) {
            com.tencent.liteav.base.util.LiteavLog.e(TAG, "get main trtcCloud native handle fail.", th6);
            j17 = 0;
        }
        try {
            com.tencent.trtc.TRTCCloud createSubCloud = tRTCCloud.createSubCloud();
            this.mSubTRTCCloud = createSubCloud;
            j18 = parseNativePointer(createSubCloud.callExperimentalAPI("{\"api\":\"getNativeHandle\"}"));
        } catch (java.lang.Throwable th7) {
            com.tencent.liteav.base.util.LiteavLog.e(TAG, "get sub trtcCloud native handle fail.", th7);
        }
        com.tencent.liteav.trtc.TXChorusMusicPlayerImpl.ChorusPlayerListener chorusPlayerListener = this.mListener;
        chorusPlayerListener.f46582a = iTXChorusPlayerListener;
        this.mNativePtr = nativeCreate(j17, j18, str, chorusPlayerListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.tencent.trtc.TXChorusMusicPlayer.TXChorusError convertIntValueToTXChorusError(int i17) {
        switch (i17) {
            case 1:
                return com.tencent.trtc.TXChorusMusicPlayer.TXChorusError.TXChorusErrorInvalidParameters;
            case 2:
                return com.tencent.trtc.TXChorusMusicPlayer.TXChorusError.TXChorusErrorTrtcCloudNotFound;
            case 3:
                return com.tencent.trtc.TXChorusMusicPlayer.TXChorusError.TXChorusErrorRestrictedToLeadSinger;
            case 4:
                return com.tencent.trtc.TXChorusMusicPlayer.TXChorusError.TXChorusErrorMusicPreloadRequired;
            case 5:
                return com.tencent.trtc.TXChorusMusicPlayer.TXChorusError.TXChorusErrorMusicLoadFailed;
            case 6:
                return com.tencent.trtc.TXChorusMusicPlayer.TXChorusError.TXChorusErrorMusicDecodeFailed;
            case 7:
                return com.tencent.trtc.TXChorusMusicPlayer.TXChorusError.TXChorusErrorEnterRoomFailed;
            case 8:
                return com.tencent.trtc.TXChorusMusicPlayer.TXChorusError.TXChorusErrorRoomDisconnected;
            case 9:
                return com.tencent.trtc.TXChorusMusicPlayer.TXChorusError.TXChorusErrorTrtcError;
            default:
                com.tencent.liteav.base.util.LiteavLog.w(TAG, "chorus error value is undefined. chorusErrorValue=".concat(java.lang.String.valueOf(i17)));
                return null;
        }
    }

    public static com.tencent.trtc.TXChorusMusicPlayer create(com.tencent.trtc.TRTCCloud tRTCCloud, java.lang.String str, com.tencent.trtc.TXChorusMusicPlayer.ITXChorusPlayerListener iTXChorusPlayerListener) {
        return new com.tencent.liteav.trtc.TXChorusMusicPlayerImpl(tRTCCloud, str, iTXChorusPlayerListener);
    }

    private static int getTXChorusMusicTrackIntValue(com.tencent.trtc.TXChorusMusicPlayer.TXChorusMusicTrack tXChorusMusicTrack) {
        if (tXChorusMusicTrack == null) {
            com.tencent.liteav.base.util.LiteavLog.w(TAG, "music track enum is null. musicTrack=".concat(java.lang.String.valueOf(tXChorusMusicTrack)));
            return -1;
        }
        int i17 = com.tencent.liteav.trtc.TXChorusMusicPlayerImpl.AnonymousClass1.f46581b[tXChorusMusicTrack.ordinal()];
        int i18 = 1;
        if (i17 != 1) {
            i18 = 2;
            if (i17 != 2) {
                com.tencent.liteav.base.util.LiteavLog.w(TAG, "music track enum is unknown. musicTrack=".concat(java.lang.String.valueOf(tXChorusMusicTrack)));
                return -1;
            }
        }
        return i18;
    }

    private static int getTXChorusRoleIntValue(com.tencent.trtc.TXChorusMusicPlayer.TXChorusRole tXChorusRole) {
        if (tXChorusRole == null) {
            com.tencent.liteav.base.util.LiteavLog.w(TAG, "chorus role enum is null. chorusRole=".concat(java.lang.String.valueOf(tXChorusRole)));
            return -1;
        }
        int i17 = com.tencent.liteav.trtc.TXChorusMusicPlayerImpl.AnonymousClass1.f46580a[tXChorusRole.ordinal()];
        int i18 = 1;
        if (i17 != 1) {
            i18 = 2;
            if (i17 != 2) {
                i18 = 3;
                if (i17 != 3) {
                    i18 = 4;
                    if (i17 != 4) {
                        com.tencent.liteav.base.util.LiteavLog.w(TAG, "chorus role enum is unknown. chorusRole=".concat(java.lang.String.valueOf(tXChorusRole)));
                        return -1;
                    }
                }
            }
        }
        return i18;
    }

    private static native void nativeCallExperimentalAPI(long j17, java.lang.String str);

    private static native long nativeCreate(long j17, long j18, java.lang.String str, com.tencent.liteav.trtc.TXChorusMusicPlayerImpl.ChorusPlayerListener chorusPlayerListener);

    private static native void nativeDestroy(long j17);

    private static native void nativeLoadExternalMusic(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, int i17);

    private static native void nativeLoadMusic(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4);

    private static native void nativePause(long j17);

    private static native void nativeResume(long j17);

    private static native void nativeSeek(long j17, long j18);

    private static native void nativeSetChorusRole(long j17, int i17, com.tencent.liteav.trtc.TXChorusMusicPlayerImpl.EnterRoomParams enterRoomParams);

    private static native void nativeSetMusicPitch(long j17, float f17);

    private static native void nativeSetPlayoutVolume(long j17, int i17);

    private static native void nativeSetPublishVolume(long j17, int i17);

    private static native void nativeStart(long j17);

    private static native void nativeStop(long j17);

    private static native void nativeSwitchMusicTrack(long j17, int i17);

    private static long parseNativePointer(java.lang.String str) {
        try {
            java.math.BigInteger bigInteger = new java.math.BigInteger(str);
            if (bigInteger.bitLength() <= 64) {
                return bigInteger.longValue();
            }
            com.tencent.liteav.base.util.LiteavLog.e(TAG, "Parsing pointer exceeding 64 bits. native pointer is ".concat(java.lang.String.valueOf(str)));
            return 0L;
        } catch (java.lang.Throwable th6) {
            com.tencent.liteav.base.util.LiteavLog.e(TAG, "Parsing pointer fail. native pointer is ".concat(java.lang.String.valueOf(str)), th6);
            return 0L;
        }
    }

    @Override // com.tencent.trtc.TXChorusMusicPlayer
    public synchronized void callExperimentalAPI(java.lang.String str) {
        long j17 = this.mNativePtr;
        if (j17 != 0) {
            nativeCallExperimentalAPI(j17, str);
        }
    }

    @Override // com.tencent.trtc.TXChorusMusicPlayer
    public synchronized void destroy() {
        com.tencent.trtc.TRTCCloud tRTCCloud;
        long j17 = this.mNativePtr;
        if (j17 != 0) {
            nativeDestroy(j17);
            this.mNativePtr = 0L;
        }
        com.tencent.trtc.TRTCCloud tRTCCloud2 = this.mTRTCCloud;
        if (tRTCCloud2 != null && (tRTCCloud = this.mSubTRTCCloud) != null) {
            tRTCCloud2.destroySubCloud(tRTCCloud);
            this.mSubTRTCCloud = null;
            this.mTRTCCloud = null;
        }
        this.mListener.f46582a = null;
    }

    public void finalize() {
        super.finalize();
        long j17 = this.mNativePtr;
        if (j17 != 0) {
            com.tencent.liteav.base.util.LiteavLog.w(TAG, "object is not destroyed. will be memory leak. native pointer is %#x.", java.lang.Long.valueOf(j17));
        }
    }

    @Override // com.tencent.trtc.TXChorusMusicPlayer
    public synchronized void loadExternalMusic(com.tencent.trtc.TXChorusMusicPlayer.TXChorusExternalMusicParams tXChorusExternalMusicParams) {
        long j17 = this.mNativePtr;
        if (j17 != 0 && tXChorusExternalMusicParams != null) {
            nativeLoadExternalMusic(j17, tXChorusExternalMusicParams.musicId, tXChorusExternalMusicParams.musicUrl, tXChorusExternalMusicParams.accompanyUrl, tXChorusExternalMusicParams.isEncrypted, tXChorusExternalMusicParams.encryptBlockLength);
        }
    }

    @Override // com.tencent.trtc.TXChorusMusicPlayer
    public synchronized void loadMusic(com.tencent.trtc.TXChorusMusicPlayer.TXChorusCopyrightedMusicParams tXChorusCopyrightedMusicParams) {
        long j17 = this.mNativePtr;
        if (j17 != 0 && tXChorusCopyrightedMusicParams != null) {
            nativeLoadMusic(j17, tXChorusCopyrightedMusicParams.musicId, tXChorusCopyrightedMusicParams.playToken, tXChorusCopyrightedMusicParams.copyrightedLicenseKey, tXChorusCopyrightedMusicParams.copyrightedLicenseUrl);
        }
    }

    @Override // com.tencent.trtc.TXChorusMusicPlayer
    public synchronized void pause() {
        long j17 = this.mNativePtr;
        if (j17 != 0) {
            nativePause(j17);
        }
    }

    @Override // com.tencent.trtc.TXChorusMusicPlayer
    public synchronized void resume() {
        long j17 = this.mNativePtr;
        if (j17 != 0) {
            nativeResume(j17);
        }
    }

    @Override // com.tencent.trtc.TXChorusMusicPlayer
    public synchronized void seek(long j17) {
        long j18 = this.mNativePtr;
        if (j18 != 0) {
            nativeSeek(j18, j17);
        }
    }

    @Override // com.tencent.trtc.TXChorusMusicPlayer
    public synchronized void setChorusRole(com.tencent.trtc.TXChorusMusicPlayer.TXChorusRole tXChorusRole, com.tencent.trtc.TRTCCloudDef.TRTCParams tRTCParams) {
        if (this.mNativePtr != 0 && tXChorusRole != null) {
            nativeSetChorusRole(this.mNativePtr, getTXChorusRoleIntValue(tXChorusRole), tRTCParams != null ? new com.tencent.liteav.trtc.TXChorusMusicPlayerImpl.EnterRoomParams(tRTCParams) : null);
        }
    }

    @Override // com.tencent.trtc.TXChorusMusicPlayer
    public void setListener(com.tencent.trtc.TXChorusMusicPlayer.ITXChorusPlayerListener iTXChorusPlayerListener) {
        this.mListener.f46582a = iTXChorusPlayerListener;
    }

    @Override // com.tencent.trtc.TXChorusMusicPlayer
    public synchronized void setMusicPitch(float f17) {
        long j17 = this.mNativePtr;
        if (j17 != 0) {
            nativeSetMusicPitch(j17, f17);
        }
    }

    @Override // com.tencent.trtc.TXChorusMusicPlayer
    public synchronized void setPlayoutVolume(int i17) {
        long j17 = this.mNativePtr;
        if (j17 != 0) {
            nativeSetPlayoutVolume(j17, i17);
        }
    }

    @Override // com.tencent.trtc.TXChorusMusicPlayer
    public synchronized void setPublishVolume(int i17) {
        long j17 = this.mNativePtr;
        if (j17 != 0) {
            nativeSetPublishVolume(j17, i17);
        }
    }

    @Override // com.tencent.trtc.TXChorusMusicPlayer
    public synchronized void start() {
        long j17 = this.mNativePtr;
        if (j17 != 0) {
            nativeStart(j17);
        }
    }

    @Override // com.tencent.trtc.TXChorusMusicPlayer
    public synchronized void stop() {
        long j17 = this.mNativePtr;
        if (j17 != 0) {
            nativeStop(j17);
        }
    }

    @Override // com.tencent.trtc.TXChorusMusicPlayer
    public synchronized void switchMusicTrack(com.tencent.trtc.TXChorusMusicPlayer.TXChorusMusicTrack tXChorusMusicTrack) {
        long j17 = this.mNativePtr;
        if (j17 != 0 && tXChorusMusicTrack != null) {
            nativeSwitchMusicTrack(j17, getTXChorusMusicTrackIntValue(tXChorusMusicTrack));
        }
    }

    /* loaded from: classes10.dex */
    public static class ChorusPlayerListener {

        /* renamed from: a, reason: collision with root package name */
        com.tencent.trtc.TXChorusMusicPlayer.ITXChorusPlayerListener f46582a;

        private ChorusPlayerListener() {
            this.f46582a = null;
        }

        public void onChorusError(int i17, java.lang.String str) {
            com.tencent.trtc.TXChorusMusicPlayer.ITXChorusPlayerListener iTXChorusPlayerListener = this.f46582a;
            if (iTXChorusPlayerListener != null) {
                iTXChorusPlayerListener.onChorusError(com.tencent.liteav.trtc.TXChorusMusicPlayerImpl.convertIntValueToTXChorusError(i17), str);
            }
        }

        public void onChorusMusicLoadProgress(java.lang.String str, float f17) {
            com.tencent.trtc.TXChorusMusicPlayer.ITXChorusPlayerListener iTXChorusPlayerListener = this.f46582a;
            if (iTXChorusPlayerListener != null) {
                iTXChorusPlayerListener.onChorusMusicLoadProgress(str, f17);
            }
        }

        public void onChorusMusicLoadSucceed(java.lang.String str, java.util.List<com.tencent.trtc.TXChorusMusicPlayer.TXLyricLine> list, java.util.List<com.tencent.trtc.TXChorusMusicPlayer.TXReferencePitch> list2) {
            com.tencent.trtc.TXChorusMusicPlayer.ITXChorusPlayerListener iTXChorusPlayerListener = this.f46582a;
            if (iTXChorusPlayerListener != null) {
                iTXChorusPlayerListener.onChorusMusicLoadSucceed(str, list, list2);
            }
        }

        public void onChorusPaused() {
            com.tencent.trtc.TXChorusMusicPlayer.ITXChorusPlayerListener iTXChorusPlayerListener = this.f46582a;
            if (iTXChorusPlayerListener != null) {
                iTXChorusPlayerListener.onChorusPaused();
            }
        }

        public void onChorusRequireLoadMusic(java.lang.String str) {
            com.tencent.trtc.TXChorusMusicPlayer.ITXChorusPlayerListener iTXChorusPlayerListener = this.f46582a;
            if (iTXChorusPlayerListener != null) {
                iTXChorusPlayerListener.onChorusRequireLoadMusic(str);
            }
        }

        public void onChorusResumed() {
            com.tencent.trtc.TXChorusMusicPlayer.ITXChorusPlayerListener iTXChorusPlayerListener = this.f46582a;
            if (iTXChorusPlayerListener != null) {
                iTXChorusPlayerListener.onChorusResumed();
            }
        }

        public void onChorusStarted() {
            com.tencent.trtc.TXChorusMusicPlayer.ITXChorusPlayerListener iTXChorusPlayerListener = this.f46582a;
            if (iTXChorusPlayerListener != null) {
                iTXChorusPlayerListener.onChorusStarted();
            }
        }

        public void onChorusStopped() {
            com.tencent.trtc.TXChorusMusicPlayer.ITXChorusPlayerListener iTXChorusPlayerListener = this.f46582a;
            if (iTXChorusPlayerListener != null) {
                iTXChorusPlayerListener.onChorusStopped();
            }
        }

        public void onMusicProgressUpdated(long j17, long j18) {
            com.tencent.trtc.TXChorusMusicPlayer.ITXChorusPlayerListener iTXChorusPlayerListener = this.f46582a;
            if (iTXChorusPlayerListener != null) {
                iTXChorusPlayerListener.onMusicProgressUpdated(j17, j18);
            }
        }

        public void onNetworkQualityUpdated(int i17, int i18, int i19) {
            com.tencent.trtc.TXChorusMusicPlayer.ITXChorusPlayerListener iTXChorusPlayerListener = this.f46582a;
            if (iTXChorusPlayerListener != null) {
                iTXChorusPlayerListener.onNetworkQualityUpdated(i17, i18, i19);
            }
        }

        public void onVoicePitchUpdated(int i17, boolean z17, long j17) {
            com.tencent.trtc.TXChorusMusicPlayer.ITXChorusPlayerListener iTXChorusPlayerListener = this.f46582a;
            if (iTXChorusPlayerListener != null) {
                iTXChorusPlayerListener.onVoicePitchUpdated(i17, z17, j17);
            }
        }

        public void onVoiceScoreUpdated(int i17, int i18, int i19) {
            com.tencent.trtc.TXChorusMusicPlayer.ITXChorusPlayerListener iTXChorusPlayerListener = this.f46582a;
            if (iTXChorusPlayerListener != null) {
                iTXChorusPlayerListener.onVoiceScoreUpdated(i17, i18, i19);
            }
        }

        public void shouldDecryptAudioData(java.nio.ByteBuffer byteBuffer) {
            com.tencent.trtc.TXChorusMusicPlayer.ITXChorusPlayerListener iTXChorusPlayerListener = this.f46582a;
            if (iTXChorusPlayerListener != null) {
                iTXChorusPlayerListener.shouldDecryptAudioData(byteBuffer);
            }
        }

        public /* synthetic */ ChorusPlayerListener(byte b17) {
            this();
        }
    }
}
