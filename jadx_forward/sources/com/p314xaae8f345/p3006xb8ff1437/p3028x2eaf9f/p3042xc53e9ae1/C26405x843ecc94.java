package com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1;

/* renamed from: com.tencent.thumbplayer.core.player.TPGeneralPlayFlowParams */
/* loaded from: classes16.dex */
public class C26405x843ecc94 {

    /* renamed from: TP_DRM_TYPE_CHACHA20 */
    public static final int f53253x96760e60 = 8;

    /* renamed from: TP_DRM_TYPE_CHINA_DRM */
    public static final int f53254xf1ee2d15 = 64;

    /* renamed from: TP_DRM_TYPE_FAIRPLAY */
    public static final int f53255x6a4be9fa = 16;

    /* renamed from: TP_DRM_TYPE_NONE */
    public static final int f53256xf24891da = -1;

    /* renamed from: TP_DRM_TYPE_TAIHE */
    public static final int f53257x5717c717 = 4;

    /* renamed from: TP_DRM_TYPE_WIDEVINE */
    public static final int f53258xee35029f = 32;

    /* renamed from: mPlayerConfigParams */
    public com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26405x843ecc94.TPPlayerConfigParams f53260x5a277036 = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26405x843ecc94.TPPlayerConfigParams();

    /* renamed from: mPlayerBaseMediaParams */
    public com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26405x843ecc94.TPPlayerBaseMediaParams f53259x4233636b = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26405x843ecc94.TPPlayerBaseMediaParams();

    /* renamed from: mPlayerDrmParams */
    public com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26405x843ecc94.TPPlayerDrmParams f53261xab53d9f7 = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26405x843ecc94.TPPlayerDrmParams();

    /* renamed from: mPlayerGeneralTrackingParams */
    public com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26405x843ecc94.TPPlayerGeneralTrackingParams f53262xeac80517 = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26405x843ecc94.TPPlayerGeneralTrackingParams();

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    /* renamed from: com.tencent.thumbplayer.core.player.TPGeneralPlayFlowParams$TPDrmType */
    /* loaded from: classes6.dex */
    public @interface TPDrmType {
    }

    /* renamed from: com.tencent.thumbplayer.core.player.TPGeneralPlayFlowParams$TPPlayerBaseMediaParams */
    /* loaded from: classes16.dex */
    public static class TPPlayerBaseMediaParams {

        /* renamed from: mFormatContainer */
        public java.lang.String f53268x8423aa1d = "";

        /* renamed from: mVideoEncodeFormat */
        public int f53272xb0d0c8db = -1;

        /* renamed from: mAudioEncodeFormat */
        public int f53264x2d2f1fb6 = -1;

        /* renamed from: mSubtitleEncodeFormat */
        public int f53270xa194b1f2 = -1;

        /* renamed from: mVideoStreamBitrateKbps */
        public long f53276xce627899 = -1;

        /* renamed from: mDurationMs */
        public long f53267x25993aa7 = -1;

        /* renamed from: mVideoFrameRate */
        public float f53273x3a11db7f = -1.0f;

        /* renamed from: mVideoWidth */
        public int f53277x7b4db658 = -1;

        /* renamed from: mVideoHeight */
        public int f53274xd49a1ad5 = -1;

        /* renamed from: mVideoDecoderType */
        public int f53271x503740b0 = -1;

        /* renamed from: mAudioDecoderType */
        public int f53263xbf952275 = -1;

        /* renamed from: mDemuxerType */
        public int f53266x4e1d0349 = -1;

        /* renamed from: mVideoRenderType */
        public int f53275x60358c9e = -1;

        /* renamed from: mAudioRenderType */
        public int f53265xb661de39 = -1;

        /* renamed from: mHlsSourceType */
        public int f53269x96897fd7 = -1;
    }

    /* renamed from: com.tencent.thumbplayer.core.player.TPGeneralPlayFlowParams$TPPlayerConfigParams */
    /* loaded from: classes16.dex */
    public static class TPPlayerConfigParams {

        /* renamed from: mBufferMinTotalDurationMs */
        public long f53279xdc5cc5f9 = -1;

        /* renamed from: mBufferMaxTotalDurationMs */
        public long f53278x26c080a7 = -1;

        /* renamed from: mPreloadTotalDurationMs */
        public long f53284x45e5f842 = -1;

        /* renamed from: mMinBufferingDurationMs */
        public long f53282x72a910b7 = -1;

        /* renamed from: mMinBufferingTimeMs */
        public long f53283x9666230 = -1;

        /* renamed from: mMaxBufferingTimeMs */
        public long f53281x53ca1cde = -1;

        /* renamed from: mReduceLatencyAction */
        public int f53285x6d1c3f61 = -1;

        /* renamed from: mReduceLatencyPlaySpeed */
        public float f53286xcdcf9068 = -1.0f;

        /* renamed from: mBufferType */
        public int f53280x4dd16fe7 = -1;
    }

    /* renamed from: com.tencent.thumbplayer.core.player.TPGeneralPlayFlowParams$TPPlayerDrmParams */
    /* loaded from: classes16.dex */
    public static class TPPlayerDrmParams {

        /* renamed from: mDrmType */
        @com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.C26405x843ecc94.TPDrmType
        public int f53288x10b8544c = -1;

        /* renamed from: mSecureLevel */
        public int f53303xfd61f3a0 = -1;

        /* renamed from: mPrepareSTimeMs */
        public long f53296x8953966c = 0;

        /* renamed from: mPrepareETimeMs */
        public long f53295xa4bc58de = 0;

        /* renamed from: mSupportSecureDecoder */
        public int f53306x431b394b = -1;

        /* renamed from: mSupportSecureDecrypt */
        public int f53307x431ce694 = -1;

        /* renamed from: mComponentName */
        public java.lang.String f53287xc0c14dbb = "";

        /* renamed from: mOpenSessionSTimeMs */
        public long f53294xa65d0c67 = 0;

        /* renamed from: mOpenSessionETimeMs */
        public long f53293xc1c5ced9 = 0;

        /* renamed from: mGetProvisionReqSTimeMs */
        public long f53292x5f86f174 = 0;

        /* renamed from: mGetProvisionReqETimeMs */
        public long f53291x7aefb3e6 = 0;

        /* renamed from: mSendProvisionReqTimeMs */
        public long f53305x7da560b1 = 0;

        /* renamed from: mRecvProvisionRespTimeMs */
        public long f53302x208a4d05 = 0;

        /* renamed from: mProvideProvisionRespSTimeMs */
        public long f53300x2ea7d535 = 0;

        /* renamed from: mProvideProvisionRespETimeMs */
        public long f53299x4a1097a7 = 0;

        /* renamed from: mGetKeyReqSTimeMs */
        public long f53290x524bcfbe = 0;

        /* renamed from: mGetKeyReqETimeMs */
        public long f53289x6db49230 = 0;

        /* renamed from: mSendKeyReqTimeMs */
        public long f53304x55b3227 = 0;

        /* renamed from: mRecvKeyRespTimeMs */
        public long f53301xcf727bcf = 0;

        /* renamed from: mProvideKeyRespSTimeMs */
        public long f53298x8f3b146b = 0;

        /* renamed from: mProvideKeyRespETimeMs */
        public long f53297xaaa3d6dd = 0;
    }

    /* renamed from: com.tencent.thumbplayer.core.player.TPGeneralPlayFlowParams$TPPlayerGeneralTrackingParams */
    /* loaded from: classes16.dex */
    public static class TPPlayerGeneralTrackingParams {

        /* renamed from: mCoreApiPrepareTimeMs */
        public long f53309x381bb70c = 0;

        /* renamed from: mCoreSchedulingThreadPrepareTimeMs */
        public long f53311x63462d0 = 0;

        /* renamed from: mDemuxerThreadPrepareTimeMs */
        public long f53315x6fa38361 = 0;

        /* renamed from: mDemuxerOpenFileSTimeMs */
        public long f53313x75387271 = 0;

        /* renamed from: mDemuxerOpenFileETimems */
        public long f53312x90a138c3 = 0;

        /* renamed from: mInitFirstClipPositionETimeMs */
        public long f53320xac7a12ac = 0;

        /* renamed from: mFirstVideoPacketReadETimeMs */
        public long f53319xf4ee00e2 = 0;

        /* renamed from: mFirstAudioPacketReadETimeMs */
        public long f53317xb9cabae7 = 0;

        /* renamed from: mDemuxerThreadOnPreparedTimeMs */
        public long f53314x7ed15028 = 0;

        /* renamed from: mCoreSchedulingThreadOnPreparedTimeMs */
        public long f53310x3d28659 = 0;

        /* renamed from: mVideoDecoderOpenedTimeMs */
        public long f53321xc3d8ba92 = 0;

        /* renamed from: mFirstVideoFrameRenderETimeMs */
        public long f53318xddfad14d = 0;

        /* renamed from: mAudioDecoderOpenedTimeMs */
        public long f53308xc46f0757 = 0;

        /* renamed from: mFirstAudioFrameRenderETimeMs */
        public long f53316xb4b557e8 = 0;
    }
}
