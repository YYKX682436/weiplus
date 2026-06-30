package com.tencent.liteav.trtc;

@com.tencent.liteav.base.annotations.JNINamespace("liteav::trtc")
/* loaded from: classes16.dex */
public class TrtcCloudJni {
    private static final java.lang.Object INIT_LOCK = new java.lang.Object();
    private static final java.lang.String TAG = "TrtcCloudJni";
    private static boolean mHasInited;
    private com.tencent.trtc.TRTCCloudListener.TRTCAudioFrameListener mAudioFrameListener;
    private com.tencent.trtc.TRTCCloudListener.TRTCVideoFrameListener mCalledGLCreatedFrameListener;
    private final java.util.HashSet<android.view.View> mFloatingWindowSet;
    private final java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock mJniReadLock;
    private final java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock mJniWriteLock;
    private com.tencent.trtc.TRTCCloudListener mListener;
    private android.os.Handler mListenerHandler;
    private java.util.List<com.tencent.trtc.TRTCCloudListener> mListenerList;
    private java.lang.String mLocalUserId;
    private final com.tencent.liteav.trtc.TrtcCloudJni.a<com.tencent.trtc.TRTCCloudListener.TRTCVideoRenderListener> mLocalVideoRenderListenerWrapper;
    private long mNativeTrtcCloudJni;
    private final java.util.concurrent.locks.ReentrantReadWriteLock mReadWriteLock;
    private final java.util.Map<java.lang.String, com.tencent.liteav.trtc.TrtcCloudJni.a<com.tencent.trtc.TRTCCloudListener.TRTCVideoRenderListener>> mRemoteVideoRenderListenerMap;
    private final com.tencent.liteav.trtc.TrtcCloudJni.a<com.tencent.trtc.TRTCCloudListener.TRTCVideoFrameListener> mVideoFrameListenerWrapper;

    /* renamed from: com.tencent.liteav.trtc.TrtcCloudJni$1, reason: invalid class name */
    /* loaded from: classes14.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f46587a;

        static {
            int[] iArr = new int[com.tencent.liteav.base.util.k.values().length];
            f46587a = iArr;
            try {
                iArr[com.tencent.liteav.base.util.k.ROTATION_90.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f46587a[com.tencent.liteav.base.util.k.ROTATION_180.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f46587a[com.tencent.liteav.base.util.k.ROTATION_270.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes10.dex */
    public static class AudioFrame {

        /* renamed from: a, reason: collision with root package name */
        private com.tencent.trtc.TRTCCloudDef.TRTCAudioFrame f46588a;

        public AudioFrame(com.tencent.trtc.TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame) {
            this.f46588a = tRTCAudioFrame;
        }

        public int getChannel() {
            return this.f46588a.channel;
        }

        public byte[] getData() {
            return this.f46588a.data;
        }

        public int getSampleRate() {
            return this.f46588a.sampleRate;
        }

        public long getTimestamp() {
            return this.f46588a.timestamp;
        }
    }

    /* loaded from: classes4.dex */
    public static class AudioParallelParams {

        /* renamed from: a, reason: collision with root package name */
        private com.tencent.trtc.TRTCCloudDef.TRTCAudioParallelParams f46589a;

        public AudioParallelParams(com.tencent.trtc.TRTCCloudDef.TRTCAudioParallelParams tRTCAudioParallelParams) {
            this.f46589a = tRTCAudioParallelParams;
        }

        public java.lang.String[] getIncludeUsers() {
            java.util.ArrayList<java.lang.String> arrayList = this.f46589a.includeUsers;
            return arrayList != null ? (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]) : new java.lang.String[0];
        }

        public int getMaxCount() {
            return this.f46589a.maxCount;
        }
    }

    /* loaded from: classes16.dex */
    public static class AudioRecordingParams {

        /* renamed from: a, reason: collision with root package name */
        private final com.tencent.trtc.TRTCCloudDef.TRTCAudioRecordingParams f46590a;

        public AudioRecordingParams(com.tencent.trtc.TRTCCloudDef.TRTCAudioRecordingParams tRTCAudioRecordingParams) {
            this.f46590a = tRTCAudioRecordingParams;
        }

        public int getContent() {
            return this.f46590a.recordingContent;
        }

        public java.lang.String getFilePath() {
            return this.f46590a.filePath;
        }

        public int getMaxDurationPerFile() {
            return this.f46590a.maxDurationPerFile;
        }
    }

    /* loaded from: classes3.dex */
    public static class EnterRoomParams {

        /* renamed from: a, reason: collision with root package name */
        private com.tencent.trtc.TRTCCloudDef.TRTCParams f46591a;

        public EnterRoomParams(com.tencent.trtc.TRTCCloudDef.TRTCParams tRTCParams) {
            this.f46591a = tRTCParams;
        }

        public java.lang.String getBusinessInfo() {
            return this.f46591a.businessInfo;
        }

        public java.lang.String getPrivateMapKey() {
            return this.f46591a.privateMapKey;
        }

        public java.lang.String getRecordId() {
            return this.f46591a.userDefineRecordId;
        }

        public int getRole() {
            return this.f46591a.role;
        }

        public int getRoomId() {
            return this.f46591a.roomId;
        }

        public int getSdkAppId() {
            return this.f46591a.sdkAppId;
        }

        public java.lang.String getStrRoomId() {
            return this.f46591a.strRoomId;
        }

        public java.lang.String getStreamId() {
            return this.f46591a.streamId;
        }

        public java.lang.String getUserId() {
            return this.f46591a.userId;
        }

        public java.lang.String getUserSig() {
            return this.f46591a.userSig;
        }
    }

    /* loaded from: classes16.dex */
    public static class LocalRecordingParams {

        /* renamed from: a, reason: collision with root package name */
        private final com.tencent.trtc.TRTCCloudDef.TRTCLocalRecordingParams f46592a;

        public LocalRecordingParams(com.tencent.trtc.TRTCCloudDef.TRTCLocalRecordingParams tRTCLocalRecordingParams) {
            this.f46592a = tRTCLocalRecordingParams;
        }

        public java.lang.String getFilePath() {
            return this.f46592a.filePath;
        }

        public int getInterval() {
            return this.f46592a.interval;
        }

        public int getMaxDurationPerFile() {
            return this.f46592a.maxDurationPerFile;
        }

        public int getRecordType() {
            return this.f46592a.recordType;
        }
    }

    /* loaded from: classes3.dex */
    public static class LocalStatistics {

        /* renamed from: a, reason: collision with root package name */
        private com.tencent.trtc.TRTCStatistics.TRTCLocalStatistics f46593a = new com.tencent.trtc.TRTCStatistics.TRTCLocalStatistics();

        public static void addLocalStatistics(com.tencent.liteav.trtc.TrtcCloudJni.LocalStatistics localStatistics, java.util.ArrayList<com.tencent.liteav.trtc.TrtcCloudJni.LocalStatistics> arrayList) {
            arrayList.add(localStatistics);
        }

        public static com.tencent.liteav.trtc.TrtcCloudJni.LocalStatistics createLocalStatistics(int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
            com.tencent.liteav.trtc.TrtcCloudJni.LocalStatistics localStatistics = new com.tencent.liteav.trtc.TrtcCloudJni.LocalStatistics();
            com.tencent.trtc.TRTCStatistics.TRTCLocalStatistics tRTCLocalStatistics = localStatistics.f46593a;
            tRTCLocalStatistics.streamType = i17;
            tRTCLocalStatistics.width = i18;
            tRTCLocalStatistics.height = i19;
            tRTCLocalStatistics.frameRate = i27;
            tRTCLocalStatistics.videoBitrate = i28;
            tRTCLocalStatistics.audioBitrate = i37;
            tRTCLocalStatistics.audioSampleRate = i29;
            tRTCLocalStatistics.audioCaptureState = i38;
            return localStatistics;
        }

        public static java.util.ArrayList<com.tencent.liteav.trtc.TrtcCloudJni.LocalStatistics> createLocalStatisticsArray() {
            return new java.util.ArrayList<>();
        }
    }

    /* loaded from: classes3.dex */
    public static class MixUser {

        /* renamed from: a, reason: collision with root package name */
        private com.tencent.trtc.TRTCCloudDef.TRTCMixUser f46594a;

        public /* synthetic */ MixUser(com.tencent.trtc.TRTCCloudDef.TRTCMixUser tRTCMixUser, byte b17) {
            this(tRTCMixUser);
        }

        public int getHeight() {
            return this.f46594a.height;
        }

        public java.lang.String getImage() {
            return android.text.TextUtils.isEmpty(this.f46594a.image) ? "" : this.f46594a.image;
        }

        public int getInputType() {
            return this.f46594a.inputType;
        }

        public boolean getPureAudio() {
            return this.f46594a.pureAudio;
        }

        public int getRenderMode() {
            return this.f46594a.renderMode;
        }

        public java.lang.String getRoomId() {
            return android.text.TextUtils.isEmpty(this.f46594a.roomId) ? "" : this.f46594a.roomId;
        }

        public int getSoundLevel() {
            return this.f46594a.soundLevel;
        }

        public int getStreamType() {
            return this.f46594a.streamType;
        }

        public java.lang.String getUserId() {
            return android.text.TextUtils.isEmpty(this.f46594a.userId) ? "" : this.f46594a.userId;
        }

        public int getWidth() {
            return this.f46594a.width;
        }

        public int getX() {
            return this.f46594a.f215699x;
        }

        public int getY() {
            return this.f46594a.f215700y;
        }

        public int getZOrder() {
            return this.f46594a.zOrder;
        }

        private MixUser(com.tencent.trtc.TRTCCloudDef.TRTCMixUser tRTCMixUser) {
            this.f46594a = tRTCMixUser;
        }
    }

    /* loaded from: classes14.dex */
    public static class PayloadPrivateEncryptionConfig {

        /* renamed from: a, reason: collision with root package name */
        private com.tencent.trtc.TRTCCloudDef.TRTCPayloadPrivateEncryptionConfig f46595a;

        public PayloadPrivateEncryptionConfig(com.tencent.trtc.TRTCCloudDef.TRTCPayloadPrivateEncryptionConfig tRTCPayloadPrivateEncryptionConfig) {
            this.f46595a = tRTCPayloadPrivateEncryptionConfig;
        }

        public int getEncryptionAlgorithm() {
            return this.f46595a.encryptionAlgorithm;
        }

        public java.lang.String getEncryptionKey() {
            java.lang.String str = this.f46595a.encryptionKey;
            return str != null ? str : "";
        }

        public byte[] getEncryptionSalt() {
            return this.f46595a.encryptionSalt;
        }
    }

    /* loaded from: classes16.dex */
    public static class PublishCDNParams {

        /* renamed from: a, reason: collision with root package name */
        private com.tencent.trtc.TRTCCloudDef.TRTCPublishCDNParam f46596a;

        public PublishCDNParams(com.tencent.trtc.TRTCCloudDef.TRTCPublishCDNParam tRTCPublishCDNParam) {
            this.f46596a = tRTCPublishCDNParam;
        }

        public int getAppId() {
            return this.f46596a.appId;
        }

        public int getBizId() {
            return this.f46596a.bizId;
        }

        public java.lang.String getStreamId() {
            return android.text.TextUtils.isEmpty(this.f46596a.streamId) ? "" : this.f46596a.streamId;
        }

        public java.lang.String getUrl() {
            return android.text.TextUtils.isEmpty(this.f46596a.url) ? "" : this.f46596a.url;
        }
    }

    /* loaded from: classes3.dex */
    public static class PublishCdnUrl {

        /* renamed from: a, reason: collision with root package name */
        private com.tencent.trtc.TRTCCloudDef.TRTCPublishCdnUrl f46597a;

        public PublishCdnUrl(com.tencent.trtc.TRTCCloudDef.TRTCPublishCdnUrl tRTCPublishCdnUrl) {
            this.f46597a = tRTCPublishCdnUrl;
        }

        public boolean getIsInternalLine() {
            return this.f46597a.isInternalLine;
        }

        public java.lang.String getRtmpUrl() {
            java.lang.String str = this.f46597a.rtmpUrl;
            return str != null ? str : "";
        }
    }

    /* loaded from: classes3.dex */
    public static class PublishTarget {

        /* renamed from: a, reason: collision with root package name */
        private com.tencent.trtc.TRTCCloudDef.TRTCPublishTarget f46598a;

        public PublishTarget(com.tencent.trtc.TRTCCloudDef.TRTCPublishTarget tRTCPublishTarget) {
            this.f46598a = tRTCPublishTarget;
        }

        public int getMode() {
            return this.f46598a.mode;
        }

        public com.tencent.liteav.trtc.TrtcCloudJni.PublishCdnUrl[] getPublishCdnUrls() {
            java.util.ArrayList<com.tencent.trtc.TRTCCloudDef.TRTCPublishCdnUrl> arrayList = this.f46598a.cdnUrlList;
            if (arrayList == null) {
                return null;
            }
            com.tencent.liteav.trtc.TrtcCloudJni.PublishCdnUrl[] publishCdnUrlArr = new com.tencent.liteav.trtc.TrtcCloudJni.PublishCdnUrl[arrayList.size()];
            for (int i17 = 0; i17 < this.f46598a.cdnUrlList.size(); i17++) {
                publishCdnUrlArr[i17] = new com.tencent.liteav.trtc.TrtcCloudJni.PublishCdnUrl(this.f46598a.cdnUrlList.get(i17));
            }
            return publishCdnUrlArr;
        }

        public com.tencent.liteav.trtc.TrtcCloudJni.TRTCUser getTRTCUser() {
            return new com.tencent.liteav.trtc.TrtcCloudJni.TRTCUser(this.f46598a.mixStreamIdentity);
        }
    }

    /* loaded from: classes3.dex */
    public static class RemoteStatistics {

        /* renamed from: a, reason: collision with root package name */
        public com.tencent.trtc.TRTCStatistics.TRTCRemoteStatistics f46599a = new com.tencent.trtc.TRTCStatistics.TRTCRemoteStatistics();

        public static void addRemoteStatistics(com.tencent.liteav.trtc.TrtcCloudJni.RemoteStatistics remoteStatistics, java.util.ArrayList<com.tencent.liteav.trtc.TrtcCloudJni.RemoteStatistics> arrayList) {
            arrayList.add(remoteStatistics);
        }

        public static com.tencent.liteav.trtc.TrtcCloudJni.RemoteStatistics createRemoteStatistics(java.lang.String str, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, int i39, int i47, int i48, int i49, int i57, int i58, int i59, int i66, int i67, int i68) {
            com.tencent.liteav.trtc.TrtcCloudJni.RemoteStatistics remoteStatistics = new com.tencent.liteav.trtc.TrtcCloudJni.RemoteStatistics();
            com.tencent.trtc.TRTCStatistics.TRTCRemoteStatistics tRTCRemoteStatistics = remoteStatistics.f46599a;
            tRTCRemoteStatistics.userId = str;
            tRTCRemoteStatistics.streamType = i17;
            tRTCRemoteStatistics.width = i18;
            tRTCRemoteStatistics.height = i19;
            tRTCRemoteStatistics.frameRate = i27;
            tRTCRemoteStatistics.audioPacketLoss = i48;
            tRTCRemoteStatistics.videoPacketLoss = i28;
            tRTCRemoteStatistics.videoBlockRate = i38;
            tRTCRemoteStatistics.videoTotalBlockTime = i37;
            tRTCRemoteStatistics.videoBitrate = i29;
            tRTCRemoteStatistics.audioBitrate = i47;
            tRTCRemoteStatistics.audioSampleRate = i39;
            tRTCRemoteStatistics.audioTotalBlockTime = i49;
            tRTCRemoteStatistics.audioBlockRate = i57;
            tRTCRemoteStatistics.jitterBufferDelay = i58;
            tRTCRemoteStatistics.point2PointDelay = i59;
            tRTCRemoteStatistics.finalLoss = i66;
            tRTCRemoteStatistics.remoteNetworkUplinkLoss = i67;
            tRTCRemoteStatistics.remoteNetworkRTT = i68;
            return remoteStatistics;
        }

        public static java.util.ArrayList<com.tencent.liteav.trtc.TrtcCloudJni.RemoteStatistics> createRemoteStatisticsArray() {
            return new java.util.ArrayList<>();
        }
    }

    /* loaded from: classes16.dex */
    public static class ScreenShareParams {

        /* renamed from: a, reason: collision with root package name */
        private final com.tencent.trtc.TRTCCloudDef.TRTCScreenShareParams f46600a;

        public ScreenShareParams(com.tencent.trtc.TRTCCloudDef.TRTCScreenShareParams tRTCScreenShareParams) {
            this.f46600a = tRTCScreenShareParams;
        }

        public java.lang.Object getMediaProjection() {
            return this.f46600a.mediaProjection;
        }
    }

    /* loaded from: classes16.dex */
    public static class SpeedTestResult {

        /* renamed from: a, reason: collision with root package name */
        private com.tencent.trtc.TRTCCloudDef.TRTCSpeedTestResult f46603a = new com.tencent.trtc.TRTCCloudDef.TRTCSpeedTestResult();

        public static com.tencent.liteav.trtc.TrtcCloudJni.SpeedTestResult createSpeedTestResult(boolean z17, java.lang.String str, java.lang.String str2, int i17, float f17, float f18, int i18, int i19, int i27, int i28, int i29) {
            com.tencent.liteav.trtc.TrtcCloudJni.SpeedTestResult speedTestResult = new com.tencent.liteav.trtc.TrtcCloudJni.SpeedTestResult();
            com.tencent.trtc.TRTCCloudDef.TRTCSpeedTestResult tRTCSpeedTestResult = speedTestResult.f46603a;
            tRTCSpeedTestResult.success = z17;
            tRTCSpeedTestResult.errMsg = str;
            tRTCSpeedTestResult.f215701ip = str2;
            tRTCSpeedTestResult.quality = i17;
            tRTCSpeedTestResult.upLostRate = f17;
            tRTCSpeedTestResult.downLostRate = f18;
            tRTCSpeedTestResult.rtt = i18;
            tRTCSpeedTestResult.availableUpBandwidth = i19;
            tRTCSpeedTestResult.availableDownBandwidth = i27;
            tRTCSpeedTestResult.upJitter = i28;
            tRTCSpeedTestResult.downJitter = i29;
            return speedTestResult;
        }
    }

    /* loaded from: classes3.dex */
    public static class Statistics {

        /* renamed from: a, reason: collision with root package name */
        private com.tencent.trtc.TRTCStatistics f46604a = new com.tencent.trtc.TRTCStatistics();

        public static com.tencent.liteav.trtc.TrtcCloudJni.Statistics createStatistics(int i17, int i18, int i19, int i27, int i28, int i29, long j17, long j18, java.util.ArrayList<com.tencent.liteav.trtc.TrtcCloudJni.LocalStatistics> arrayList, java.util.ArrayList<com.tencent.liteav.trtc.TrtcCloudJni.RemoteStatistics> arrayList2) {
            com.tencent.liteav.trtc.TrtcCloudJni.Statistics statistics = new com.tencent.liteav.trtc.TrtcCloudJni.Statistics();
            com.tencent.trtc.TRTCStatistics tRTCStatistics = statistics.f46604a;
            tRTCStatistics.appCpu = i17;
            tRTCStatistics.systemCpu = i18;
            tRTCStatistics.upLoss = i19;
            tRTCStatistics.downLoss = i27;
            tRTCStatistics.rtt = i28;
            tRTCStatistics.gatewayRtt = i29;
            tRTCStatistics.sendBytes = j17;
            tRTCStatistics.receiveBytes = j18;
            tRTCStatistics.localArray = new java.util.ArrayList<>();
            statistics.f46604a.remoteArray = new java.util.ArrayList<>();
            if (arrayList != null) {
                java.util.Iterator<com.tencent.liteav.trtc.TrtcCloudJni.LocalStatistics> it = arrayList.iterator();
                while (it.hasNext()) {
                    statistics.f46604a.localArray.add(it.next().f46593a);
                }
            }
            if (arrayList2 != null) {
                java.util.Iterator<com.tencent.liteav.trtc.TrtcCloudJni.RemoteStatistics> it6 = arrayList2.iterator();
                while (it6.hasNext()) {
                    statistics.f46604a.remoteArray.add(it6.next().f46599a);
                }
            }
            return statistics;
        }
    }

    /* loaded from: classes3.dex */
    public static class StreamEncoderParam {

        /* renamed from: a, reason: collision with root package name */
        private com.tencent.trtc.TRTCCloudDef.TRTCStreamEncoderParam f46605a;

        public StreamEncoderParam(com.tencent.trtc.TRTCCloudDef.TRTCStreamEncoderParam tRTCStreamEncoderParam) {
            this.f46605a = tRTCStreamEncoderParam;
        }

        public int getAudioEncodedChannelNum() {
            return this.f46605a.audioEncodedChannelNum;
        }

        public int getAudioEncodedCodecType() {
            return this.f46605a.audioEncodedCodecType;
        }

        public int getAudioEncodedKbps() {
            return this.f46605a.audioEncodedKbps;
        }

        public int getAudioEncodedSampleRate() {
            return this.f46605a.audioEncodedSampleRate;
        }

        public int getVideoEncodedCodecType() {
            return this.f46605a.videoEncodedCodecType;
        }

        public int getVideoEncodedFPS() {
            return this.f46605a.videoEncodedFPS;
        }

        public int getVideoEncodedGOP() {
            return this.f46605a.videoEncodedGOP;
        }

        public int getVideoEncodedHeight() {
            return this.f46605a.videoEncodedHeight;
        }

        public int getVideoEncodedKbps() {
            return this.f46605a.videoEncodedKbps;
        }

        public int getVideoEncodedWidth() {
            return this.f46605a.videoEncodedWidth;
        }

        public java.lang.String getVideoSeiParams() {
            return android.text.TextUtils.isEmpty(this.f46605a.videoSeiParams) ? "" : this.f46605a.videoSeiParams;
        }
    }

    /* loaded from: classes3.dex */
    public static class StreamMixingConfig {

        /* renamed from: a, reason: collision with root package name */
        private com.tencent.trtc.TRTCCloudDef.TRTCStreamMixingConfig f46606a;

        public StreamMixingConfig(com.tencent.trtc.TRTCCloudDef.TRTCStreamMixingConfig tRTCStreamMixingConfig) {
            this.f46606a = tRTCStreamMixingConfig;
        }

        public com.tencent.liteav.trtc.TrtcCloudJni.TRTCUser[] getAudioMixUserList() {
            java.util.ArrayList<com.tencent.trtc.TRTCCloudDef.TRTCUser> arrayList = this.f46606a.audioMixUserList;
            if (arrayList == null) {
                return null;
            }
            com.tencent.liteav.trtc.TrtcCloudJni.TRTCUser[] tRTCUserArr = new com.tencent.liteav.trtc.TrtcCloudJni.TRTCUser[arrayList.size()];
            for (int i17 = 0; i17 < this.f46606a.audioMixUserList.size(); i17++) {
                tRTCUserArr[i17] = new com.tencent.liteav.trtc.TrtcCloudJni.TRTCUser(this.f46606a.audioMixUserList.get(i17));
            }
            return tRTCUserArr;
        }

        public int getBackgroundColor() {
            return this.f46606a.backgroundColor;
        }

        public java.lang.String getBackgroundImage() {
            java.lang.String str = this.f46606a.backgroundImage;
            return str != null ? str : "";
        }

        public com.tencent.liteav.trtc.TrtcCloudJni.VideoLayout[] getVideoLayoutList() {
            java.util.ArrayList<com.tencent.trtc.TRTCCloudDef.TRTCVideoLayout> arrayList = this.f46606a.videoLayoutList;
            if (arrayList == null) {
                return null;
            }
            com.tencent.liteav.trtc.TrtcCloudJni.VideoLayout[] videoLayoutArr = new com.tencent.liteav.trtc.TrtcCloudJni.VideoLayout[arrayList.size()];
            for (int i17 = 0; i17 < this.f46606a.videoLayoutList.size(); i17++) {
                videoLayoutArr[i17] = new com.tencent.liteav.trtc.TrtcCloudJni.VideoLayout(this.f46606a.videoLayoutList.get(i17));
            }
            return videoLayoutArr;
        }

        public com.tencent.liteav.trtc.TrtcCloudJni.Watermark[] getWatermarkList() {
            java.util.ArrayList<com.tencent.trtc.TRTCCloudDef.TRTCWatermark> arrayList = this.f46606a.watermarkList;
            if (arrayList == null) {
                return null;
            }
            com.tencent.liteav.trtc.TrtcCloudJni.Watermark[] watermarkArr = new com.tencent.liteav.trtc.TrtcCloudJni.Watermark[arrayList.size()];
            for (int i17 = 0; i17 < this.f46606a.watermarkList.size(); i17++) {
                watermarkArr[i17] = new com.tencent.liteav.trtc.TrtcCloudJni.Watermark(this.f46606a.watermarkList.get(i17));
            }
            return watermarkArr;
        }
    }

    /* loaded from: classes16.dex */
    public static class SwitchRoomConfig {

        /* renamed from: a, reason: collision with root package name */
        private com.tencent.trtc.TRTCCloudDef.TRTCSwitchRoomConfig f46607a;

        public SwitchRoomConfig(com.tencent.trtc.TRTCCloudDef.TRTCSwitchRoomConfig tRTCSwitchRoomConfig) {
            this.f46607a = tRTCSwitchRoomConfig;
        }

        public java.lang.String getPrivateMapKey() {
            java.lang.String str = this.f46607a.privateMapKey;
            return str != null ? str : "";
        }

        public int getRoomId() {
            return this.f46607a.roomId;
        }

        public java.lang.String getStringRoomId() {
            java.lang.String str = this.f46607a.strRoomId;
            return str != null ? str : "";
        }

        public java.lang.String getUserSig() {
            java.lang.String str = this.f46607a.userSig;
            return str != null ? str : "";
        }
    }

    /* loaded from: classes3.dex */
    public static class TRTCUser {

        /* renamed from: a, reason: collision with root package name */
        private com.tencent.trtc.TRTCCloudDef.TRTCUser f46608a;

        public TRTCUser(com.tencent.trtc.TRTCCloudDef.TRTCUser tRTCUser) {
            this.f46608a = tRTCUser;
        }

        public int getIntRoomId() {
            return this.f46608a.intRoomId;
        }

        public java.lang.String getStrRoomId() {
            java.lang.String str = this.f46608a.strRoomId;
            return str != null ? str : "";
        }

        public java.lang.String getUserId() {
            java.lang.String str = this.f46608a.userId;
            return str != null ? str : "";
        }
    }

    /* loaded from: classes3.dex */
    public static class TranscodingConfig {

        /* renamed from: a, reason: collision with root package name */
        private com.tencent.trtc.TRTCCloudDef.TRTCTranscodingConfig f46609a;

        public TranscodingConfig(com.tencent.trtc.TRTCCloudDef.TRTCTranscodingConfig tRTCTranscodingConfig) {
            this.f46609a = tRTCTranscodingConfig;
        }

        public int getAppId() {
            return this.f46609a.appId;
        }

        public int getAudioBitrate() {
            return this.f46609a.audioBitrate;
        }

        public int getAudioChannels() {
            return this.f46609a.audioChannels;
        }

        public int getAudioSampleRate() {
            return this.f46609a.audioSampleRate;
        }

        public int getBackgroundColor() {
            return this.f46609a.backgroundColor;
        }

        public java.lang.String getBackgroundImage() {
            return android.text.TextUtils.isEmpty(this.f46609a.backgroundImage) ? "" : this.f46609a.backgroundImage;
        }

        public int getBizId() {
            return this.f46609a.bizId;
        }

        public com.tencent.liteav.trtc.TrtcCloudJni.MixUser[] getMixUsers() {
            java.util.ArrayList<com.tencent.trtc.TRTCCloudDef.TRTCMixUser> arrayList = this.f46609a.mixUsers;
            if (arrayList == null) {
                return null;
            }
            com.tencent.liteav.trtc.TrtcCloudJni.MixUser[] mixUserArr = new com.tencent.liteav.trtc.TrtcCloudJni.MixUser[arrayList.size()];
            byte b17 = 0;
            for (int i17 = 0; i17 < this.f46609a.mixUsers.size(); i17++) {
                mixUserArr[i17] = new com.tencent.liteav.trtc.TrtcCloudJni.MixUser(this.f46609a.mixUsers.get(i17), b17);
            }
            return mixUserArr;
        }

        public int getMode() {
            return this.f46609a.mode;
        }

        public java.lang.String getStreamId() {
            return android.text.TextUtils.isEmpty(this.f46609a.streamId) ? "" : this.f46609a.streamId;
        }

        public int getVideoBitrate() {
            return this.f46609a.videoBitrate;
        }

        public int getVideoFramerate() {
            return this.f46609a.videoFramerate;
        }

        public int getVideoGOP() {
            return this.f46609a.videoGOP;
        }

        public int getVideoHeight() {
            return this.f46609a.videoHeight;
        }

        public java.lang.String getVideoSeiParams() {
            return android.text.TextUtils.isEmpty(this.f46609a.videoSeiParams) ? "" : this.f46609a.videoSeiParams;
        }

        public int getVideoWidth() {
            return this.f46609a.videoWidth;
        }
    }

    /* loaded from: classes3.dex */
    public static class VideoEncParams {

        /* renamed from: a, reason: collision with root package name */
        private com.tencent.trtc.TRTCCloudDef.TRTCVideoEncParam f46610a;

        public VideoEncParams(com.tencent.trtc.TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam) {
            this.f46610a = tRTCVideoEncParam;
        }

        public int getMinVideoBitrate() {
            return this.f46610a.minVideoBitrate;
        }

        public int getVideoBitrate() {
            return this.f46610a.videoBitrate;
        }

        public int getVideoFps() {
            return this.f46610a.videoFps;
        }

        public int getVideoResolution() {
            return this.f46610a.videoResolution;
        }

        public int getVideoResolutionMode() {
            return this.f46610a.videoResolutionMode;
        }

        public boolean isEnableAdjustRes() {
            return this.f46610a.enableAdjustRes;
        }
    }

    /* loaded from: classes3.dex */
    public static class VideoLayout {

        /* renamed from: a, reason: collision with root package name */
        private com.tencent.trtc.TRTCCloudDef.TRTCVideoLayout f46611a;

        public VideoLayout(com.tencent.trtc.TRTCCloudDef.TRTCVideoLayout tRTCVideoLayout) {
            this.f46611a = tRTCVideoLayout;
        }

        public int getBackgroundColor() {
            return this.f46611a.backgroundColor;
        }

        public int getFillMode() {
            return this.f46611a.fillMode;
        }

        public int getHeight() {
            return this.f46611a.height;
        }

        public java.lang.String getPlaceHolderImage() {
            java.lang.String str = this.f46611a.placeHolderImage;
            return str != null ? str : "";
        }

        public com.tencent.liteav.trtc.TrtcCloudJni.TRTCUser getTRTCUser() {
            return new com.tencent.liteav.trtc.TrtcCloudJni.TRTCUser(this.f46611a.fixedVideoUser);
        }

        public int getVideoStreamType() {
            return this.f46611a.fixedVideoStreamType;
        }

        public int getWidth() {
            return this.f46611a.width;
        }

        public int getX() {
            return this.f46611a.f215702x;
        }

        public int getY() {
            return this.f46611a.f215703y;
        }

        public int getZOrder() {
            return this.f46611a.zOrder;
        }
    }

    /* loaded from: classes16.dex */
    public static class Watermark {

        /* renamed from: a, reason: collision with root package name */
        private com.tencent.trtc.TRTCCloudDef.TRTCWatermark f46612a;

        public Watermark(com.tencent.trtc.TRTCCloudDef.TRTCWatermark tRTCWatermark) {
            this.f46612a = tRTCWatermark;
        }

        public int getHeight() {
            return this.f46612a.height;
        }

        public java.lang.String getWatermarkUrl() {
            java.lang.String str = this.f46612a.watermarkUrl;
            return str != null ? str : "";
        }

        public int getWidth() {
            return this.f46612a.width;
        }

        public int getX() {
            return this.f46612a.f215704x;
        }

        public int getY() {
            return this.f46612a.f215705y;
        }

        public int getZOrder() {
            return this.f46612a.zOrder;
        }
    }

    /* loaded from: classes16.dex */
    public static class a<T> {

        /* renamed from: a, reason: collision with root package name */
        public int f46613a;

        /* renamed from: b, reason: collision with root package name */
        public int f46614b;

        /* renamed from: c, reason: collision with root package name */
        public int f46615c;

        /* renamed from: d, reason: collision with root package name */
        public T f46616d;

        private a() {
        }

        public /* synthetic */ a(byte b17) {
            this();
        }
    }

    static {
        com.tencent.liteav.base.util.q.a();
    }

    public TrtcCloudJni(boolean z17) {
        this(0L, z17);
    }

    private java.util.List<com.tencent.trtc.TRTCCloudListener> CopyOnReadListeners() {
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = new java.util.concurrent.CopyOnWriteArrayList(this.mListenerList);
        com.tencent.trtc.TRTCCloudListener tRTCCloudListener = this.mListener;
        if (tRTCCloudListener != null && !copyOnWriteArrayList.contains(tRTCCloudListener)) {
            copyOnWriteArrayList.add(tRTCCloudListener);
        }
        return copyOnWriteArrayList;
    }

    private static int convertPixelFrameRotationToTRTCVideoRotation(com.tencent.liteav.base.util.k kVar) {
        int i17 = com.tencent.liteav.trtc.TrtcCloudJni.AnonymousClass1.f46587a[kVar.ordinal()];
        int i18 = 1;
        if (i17 != 1) {
            i18 = 2;
            if (i17 != 2) {
                i18 = 3;
                if (i17 != 3) {
                    return 0;
                }
            }
        }
        return i18;
    }

    private static com.tencent.liteav.base.util.k covertTRTCVideoRotationToPixelFrameRotation(int i17) {
        return i17 != 1 ? i17 != 2 ? i17 != 3 ? com.tencent.liteav.base.util.k.NORMAL : com.tencent.liteav.base.util.k.ROTATION_270 : com.tencent.liteav.base.util.k.ROTATION_180 : com.tencent.liteav.base.util.k.ROTATION_90;
    }

    public static android.os.Bundle createExtraInfoBundle(java.lang.String str, int i17) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt(str, i17);
        return bundle;
    }

    private android.os.Bundle extraToBundle(java.lang.String str) {
        android.os.Bundle bundle = new android.os.Bundle();
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                java.lang.Object obj = jSONObject.get(next);
                if (obj instanceof org.json.JSONArray) {
                    org.json.JSONArray jSONArray = (org.json.JSONArray) obj;
                    java.lang.String[] strArr = new java.lang.String[jSONArray.length()];
                    for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                        strArr[i17] = jSONArray.getString(i17);
                    }
                    bundle.putStringArray(next, strArr);
                } else if (obj instanceof java.lang.Integer) {
                    bundle.putInt(next, ((java.lang.Integer) obj).intValue());
                } else if (obj instanceof java.lang.String) {
                    bundle.putString(next, (java.lang.String) obj);
                }
            }
        } catch (java.lang.Exception unused) {
        }
        return bundle;
    }

    public static long getGLContextNativeHandle(java.lang.Object obj) {
        return com.tencent.liteav.trtc.TRTCDefConverter.getGLContextNativeHandle(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideFloatingWindow() {
        android.view.WindowManager windowManager;
        if (this.mFloatingWindowSet.isEmpty()) {
            return;
        }
        java.util.Iterator<android.view.View> it = this.mFloatingWindowSet.iterator();
        while (it.hasNext()) {
            android.view.View next = it.next();
            if (next != null && (windowManager = (android.view.WindowManager) next.getContext().getSystemService("window")) != null) {
                windowManager.removeViewImmediate(next);
            }
        }
        this.mFloatingWindowSet.clear();
    }

    public static void init(int i17) {
        synchronized (INIT_LOCK) {
            if (!mHasInited) {
                mHasInited = true;
                nativeGlobalInit(i17);
            }
        }
    }

    private static boolean isCustomPreprocessSupportedBufferType(int i17) {
        return i17 == 1 || i17 == 2 || i17 == 3;
    }

    private static boolean isCustomPreprocessSupportedFormatType(int i17) {
        return i17 == 1 || i17 == 4 || i17 == 5 || i17 == 2;
    }

    private static boolean isCustomRenderSupportedBufferType(int i17) {
        return i17 == 1 || i17 == 2 || i17 == 3;
    }

    private static boolean isCustomRenderSupportedFormatType(int i17) {
        return i17 == 1 || i17 == 4 || i17 == 5 || i17 == 2;
    }

    public static boolean isInUIThread() {
        return android.os.Looper.getMainLooper() == android.os.Looper.myLooper();
    }

    public static /* synthetic */ void lambda$enterRoom$0(com.tencent.liteav.trtc.TrtcCloudJni trtcCloudJni) {
        trtcCloudJni.onEnterRoom(-3316);
        trtcCloudJni.onError(-3316, "enter room param null");
    }

    public static /* synthetic */ void lambda$onSnapshotComplete$2(com.tencent.trtc.TRTCCloudListener.TRTCSnapshotListener tRTCSnapshotListener, android.graphics.Bitmap bitmap) {
        if (tRTCSnapshotListener != null) {
            tRTCSnapshotListener.onSnapshotComplete(bitmap);
        }
    }

    private static native java.lang.String nativeCallExperimentalAPI(long j17, java.lang.String str);

    private static native void nativeConnectOtherRoom(long j17, java.lang.String str);

    private static native long nativeCreateAudioEffectManager(long j17);

    private static native long nativeCreateBeautyManager(long j17);

    private static native long nativeCreateDeviceManager(long j17);

    private static native long nativeCreatePipeline(com.tencent.liteav.trtc.TrtcCloudJni trtcCloudJni, boolean z17);

    private static native long nativeCreateSubCloud(com.tencent.liteav.trtc.TrtcCloudJni trtcCloudJni, long j17);

    private static native void nativeDestroyPipeline(long j17);

    private static native void nativeDisconnectOtherRoom(long j17);

    private static native void nativeEnable3DSpatialAudioEffect(long j17, boolean z17);

    private static native void nativeEnableAudioFrameNotification(long j17, boolean z17);

    private static native void nativeEnableAudioVolumeEvaluation(long j17, boolean z17, int i17, boolean z18, boolean z19, boolean z27);

    private static native void nativeEnableCustomAudioCapture(long j17, boolean z17);

    private static native void nativeEnableCustomAudioRendering(long j17, boolean z17);

    private static native void nativeEnableCustomVideoCapture(long j17, int i17, boolean z17);

    private static native void nativeEnableEncSmallVideoStream(long j17, boolean z17, com.tencent.liteav.trtc.TrtcCloudJni.VideoEncParams videoEncParams);

    private static native void nativeEnableMixExternalAudioFrame(long j17, boolean z17, boolean z18);

    private static native int nativeEnablePayloadPrivateEncryption(long j17, boolean z17, com.tencent.liteav.trtc.TrtcCloudJni.PayloadPrivateEncryptionConfig payloadPrivateEncryptionConfig);

    private static native void nativeEnableVideoCustomPreprocess(long j17, boolean z17, int i17, int i18, int i19);

    private static native void nativeEnableVideoCustomRender(long j17, boolean z17, java.lang.String str, int i17, int i18, int i19);

    private static native void nativeEnterRoom(long j17, com.tencent.liteav.trtc.TrtcCloudJni.EnterRoomParams enterRoomParams, int i17);

    private static native void nativeExitRoom(long j17);

    private static native int nativeGetAudioCaptureVolume(long j17);

    private static native int nativeGetAudioPlayoutVolume(long j17);

    private static native void nativeGetCustomAudioRenderingFrame(long j17, byte[] bArr, int i17, int i18);

    private static native void nativeGlobalInit(int i17);

    private static native void nativeGlobalUninit();

    private static native int nativeMixExternalAudioFrame(long j17, com.tencent.liteav.trtc.TrtcCloudJni.AudioFrame audioFrame);

    private static native void nativeMuteAllRemoteAudio(long j17, boolean z17);

    private static native void nativeMuteAllRemoteVideoStreams(long j17, boolean z17);

    private static native void nativeMuteLocalAudio(long j17, boolean z17);

    private static native void nativeMuteLocalVideo(long j17, int i17, boolean z17);

    private static native void nativeMuteRemoteAudio(long j17, java.lang.String str, boolean z17);

    private static native void nativeMuteRemoteVideoStream(long j17, java.lang.String str, int i17, boolean z17);

    private static native void nativePauseScreenCapture(long j17, int i17);

    private static native void nativeResumeScreenCapture(long j17, int i17);

    private static native void nativeSendCustomAudioData(long j17, com.tencent.liteav.trtc.TrtcCloudJni.AudioFrame audioFrame);

    private static native boolean nativeSendCustomCmdMsg(long j17, int i17, byte[] bArr, boolean z17, boolean z18);

    private static native void nativeSendCustomVideoData(long j17, int i17, int i18, int i19, java.lang.Object obj, int i27, int i28, int i29, int i37, long j18, byte[] bArr, java.nio.ByteBuffer byteBuffer);

    private static native boolean nativeSendSEIMsg(long j17, byte[] bArr, int i17);

    private static native void nativeSet3DSpatialReceivingRange(long j17, java.lang.String str, int i17);

    private static native void nativeSetAudioCaptureVolume(long j17, int i17);

    private static native void nativeSetAudioPlayoutVolume(long j17, int i17);

    private static native void nativeSetAudioQuality(long j17, int i17);

    private static native int nativeSetCapturedAudioFrameCallbackFormat(long j17, int i17, int i18, int i19, int i27);

    private static native void nativeSetConsoleEnabled(boolean z17);

    private static native void nativeSetDefaultStreamRecvMode(long j17, boolean z17, boolean z18);

    private static native void nativeSetGSensorMode(long j17, int i17, int i18);

    private static native void nativeSetGravitySensorAdaptiveMode(long j17, int i17);

    private static native void nativeSetListenerHandler(long j17, android.os.Handler handler);

    private static native int nativeSetLocalProcessedAudioFrameCallbackFormat(long j17, int i17, int i18, int i19, int i27);

    private static native void nativeSetLocalViewFillMode(long j17, int i17);

    private static native void nativeSetLocalViewMirror(long j17, int i17);

    private static native void nativeSetLocalViewRotation(long j17, int i17);

    private static native void nativeSetLogCompressEnabled(boolean z17);

    private static native void nativeSetLogLevel(int i17);

    private static native void nativeSetLogPath(java.lang.String str);

    private static native void nativeSetMixExternalAudioVolume(long j17, int i17, int i18);

    private static native void nativeSetMixTranscodingConfig(long j17, com.tencent.liteav.trtc.TrtcCloudJni.TranscodingConfig transcodingConfig);

    private static native int nativeSetMixedPlayAudioFrameCallbackFormat(long j17, int i17, int i18, int i19, int i27);

    private static native void nativeSetNetworkQosParam(long j17, int i17, int i18);

    private static native void nativeSetPerspectiveCorrectionPoints(long j17, java.lang.String str, float[] fArr, float[] fArr2);

    private static native void nativeSetPriorRemoteVideoStreamType(long j17, int i17);

    private static native void nativeSetRemoteAudioParallelParams(long j17, com.tencent.liteav.trtc.TrtcCloudJni.AudioParallelParams audioParallelParams);

    private static native void nativeSetRemoteAudioVolume(long j17, java.lang.String str, int i17);

    private static native void nativeSetRemoteVideoStreamType(long j17, java.lang.String str, int i17);

    private static native void nativeSetRemoteViewFillMode(long j17, java.lang.String str, int i17, int i18);

    private static native void nativeSetRemoteViewMirror(long j17, java.lang.String str, int i17, int i18);

    private static native void nativeSetRemoteViewRotation(long j17, java.lang.String str, int i17, int i18);

    private static native void nativeSetVideoEncoderMirror(long j17, boolean z17);

    private static native void nativeSetVideoEncoderParams(long j17, int i17, com.tencent.liteav.trtc.TrtcCloudJni.VideoEncParams videoEncParams);

    private static native void nativeSetVideoEncoderRotation(long j17, int i17);

    private static native void nativeSetVideoMuteImage(long j17, android.graphics.Bitmap bitmap, int i17);

    private static native void nativeSetWatermark(long j17, android.graphics.Bitmap bitmap, int i17, float f17, float f18, float f19);

    private static native void nativeShowDashboardManager(long j17, int i17);

    private static native void nativeSnapshotVideo(long j17, java.lang.String str, int i17, int i18, com.tencent.trtc.TRTCCloudListener.TRTCSnapshotListener tRTCSnapshotListener);

    private static native int nativeStartAudioRecording(long j17, com.tencent.liteav.trtc.TrtcCloudJni.AudioRecordingParams audioRecordingParams);

    private static native void nativeStartLocalAudio(long j17);

    private static native void nativeStartLocalAudioWithQuality(long j17, int i17);

    private static native void nativeStartLocalPreview(long j17, boolean z17, com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView);

    private static native void nativeStartLocalRecording(long j17, com.tencent.liteav.trtc.TrtcCloudJni.LocalRecordingParams localRecordingParams);

    private static native void nativeStartPublishCDNStream(long j17, com.tencent.liteav.trtc.TrtcCloudJni.PublishCDNParams publishCDNParams);

    private static native void nativeStartPublishMediaStream(long j17, com.tencent.liteav.trtc.TrtcCloudJni.PublishTarget publishTarget, com.tencent.liteav.trtc.TrtcCloudJni.StreamEncoderParam streamEncoderParam, com.tencent.liteav.trtc.TrtcCloudJni.StreamMixingConfig streamMixingConfig);

    private static native void nativeStartPublishing(long j17, java.lang.String str, int i17);

    private static native void nativeStartRemoteView(long j17, java.lang.String str, int i17, com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView);

    private static native void nativeStartRemoteViewWithoutStreamType(long j17, java.lang.String str, com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView);

    private static native void nativeStartScreenCapture(long j17, int i17, com.tencent.liteav.trtc.TrtcCloudJni.VideoEncParams videoEncParams, com.tencent.liteav.trtc.TrtcCloudJni.ScreenShareParams screenShareParams);

    private static native void nativeStartSpeedTest(long j17, com.tencent.liteav.trtc.TrtcCloudJni.SpeedTestParams speedTestParams);

    private static native void nativeStartSystemAudioLoopback(long j17);

    private static native void nativeStopAllRemoteView(long j17);

    private static native void nativeStopAudioRecording(long j17);

    private static native void nativeStopLocalAudio(long j17);

    private static native void nativeStopLocalPreview(long j17);

    private static native void nativeStopLocalRecording(long j17);

    private static native void nativeStopPublishCDNStream(long j17);

    private static native void nativeStopPublishMediaStream(long j17, java.lang.String str);

    private static native void nativeStopPublishing(long j17);

    private static native void nativeStopRemoteView(long j17, java.lang.String str, int i17);

    private static native void nativeStopRemoteViewWithoutStreamType(long j17, java.lang.String str);

    private static native void nativeStopScreenCapture(long j17, int i17);

    private static native void nativeStopSpeedTest(long j17);

    private static native void nativeStopSystemAudioLoopback(long j17);

    private static native void nativeSwitchRole(long j17, int i17);

    private static native void nativeSwitchRoleWithPrivateMapKey(long j17, int i17, java.lang.String str);

    private static native void nativeSwitchRoom(long j17, com.tencent.liteav.trtc.TrtcCloudJni.SwitchRoomConfig switchRoomConfig);

    private static native void nativeUpdateLocalView(long j17, com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView);

    private static native void nativeUpdateOtherRoomForwardMode(long j17, java.lang.String str);

    private static native void nativeUpdatePublishMediaStream(long j17, java.lang.String str, com.tencent.liteav.trtc.TrtcCloudJni.PublishTarget publishTarget, com.tencent.liteav.trtc.TrtcCloudJni.StreamEncoderParam streamEncoderParam, com.tencent.liteav.trtc.TrtcCloudJni.StreamMixingConfig streamMixingConfig);

    private static native void nativeUpdateRemote3DSpatialPosition(long j17, java.lang.String str, int[] iArr);

    private static native void nativeUpdateRemoteView(long j17, java.lang.String str, int i17, com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView);

    private static native void nativeUpdateSelf3DSpatialPosition(long j17, int[] iArr, float[] fArr, float[] fArr2, float[] fArr3);

    private void runOnListenerThread(java.lang.Runnable runnable) {
        android.os.Handler handler = this.mListenerHandler;
        if (android.os.Looper.myLooper() != handler.getLooper()) {
            handler.post(runnable);
        } else {
            runnable.run();
        }
    }

    public static void setConsoleEnabled(boolean z17) {
        nativeSetConsoleEnabled(z17);
    }

    public static void setLogCompressEnabled(boolean z17) {
        nativeSetLogCompressEnabled(z17);
    }

    public static void setLogDirPath(java.lang.String str) {
        nativeSetLogPath(str);
    }

    public static void setLogLevel(int i17) {
        nativeSetLogLevel(i17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showFloatingWindow(android.view.View view) {
        if (view == null) {
            return;
        }
        if (com.tencent.liteav.base.system.LiteavSystemInfo.getSystemOSVersionInt() >= 23 && !android.provider.Settings.canDrawOverlays(view.getContext())) {
            com.tencent.liteav.base.util.LiteavLog.e(TAG, "can't show floating window for no drawing overlay permission");
            return;
        }
        if (this.mFloatingWindowSet.contains(view)) {
            com.tencent.liteav.base.util.LiteavLog.i(TAG, "the window has been added");
            return;
        }
        android.view.WindowManager windowManager = (android.view.WindowManager) view.getContext().getSystemService("window");
        if (windowManager == null) {
            com.tencent.liteav.base.util.LiteavLog.e(TAG, "get windowManager error");
            return;
        }
        this.mFloatingWindowSet.add(view);
        android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams(com.tencent.liteav.base.system.LiteavSystemInfo.getSystemOSVersionInt() >= 26 ? 2038 : com.tencent.liteav.base.system.LiteavSystemInfo.getSystemOSVersionInt() > 24 ? 2002 : com.tencent.rtmp.TXLiveConstants.PLAY_EVT_PLAY_PROGRESS);
        layoutParams.flags = 8 | 262144;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        windowManager.addView(view, layoutParams);
    }

    public static void uninit() {
        synchronized (INIT_LOCK) {
            if (mHasInited) {
                mHasInited = false;
                nativeGlobalUninit();
            }
        }
    }

    public void addListener(com.tencent.trtc.TRTCCloudListener tRTCCloudListener) {
        if (tRTCCloudListener == null || this.mListenerList.contains(tRTCCloudListener)) {
            return;
        }
        this.mListenerList.add(tRTCCloudListener);
    }

    public java.lang.String callExperimentalAPI(java.lang.String str) {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0) {
                return nativeCallExperimentalAPI(j17, str);
            }
            this.mJniReadLock.unlock();
            return null;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void connectOtherRoom(java.lang.String str) {
        long j17 = this.mNativeTrtcCloudJni;
        if (j17 != 0) {
            nativeConnectOtherRoom(j17, str);
        }
    }

    public long createAudioEffectManager() {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            return j17 != 0 ? nativeCreateAudioEffectManager(j17) : 0L;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public long createBeautyManager() {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            return j17 != 0 ? nativeCreateBeautyManager(j17) : 0L;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public java.nio.ByteBuffer createByteBuffer(int i17) {
        return java.nio.ByteBuffer.allocateDirect(i17);
    }

    public long createDeviceManager() {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            return j17 != 0 ? nativeCreateDeviceManager(j17) : 0L;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public com.tencent.trtc.TRTCCloudDef.TRTCVideoFrame createTRTCVideoFrame(int i17, int i18, java.lang.Object obj, int i19, int i27, int i28, int i29, long j17, byte[] bArr, java.nio.ByteBuffer byteBuffer) {
        com.tencent.trtc.TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame = new com.tencent.trtc.TRTCCloudDef.TRTCVideoFrame();
        tRTCVideoFrame.pixelFormat = i17;
        tRTCVideoFrame.bufferType = i18;
        com.tencent.trtc.TRTCCloudDef.TRTCTexture tRTCTexture = new com.tencent.trtc.TRTCCloudDef.TRTCTexture();
        tRTCVideoFrame.texture = tRTCTexture;
        tRTCTexture.textureId = i19;
        if (obj instanceof javax.microedition.khronos.egl.EGLContext) {
            tRTCTexture.eglContext10 = (javax.microedition.khronos.egl.EGLContext) obj;
        } else if (com.tencent.liteav.base.system.LiteavSystemInfo.getSystemOSVersionInt() >= 17 && (obj instanceof android.opengl.EGLContext)) {
            tRTCVideoFrame.texture.eglContext14 = (android.opengl.EGLContext) obj;
        }
        tRTCVideoFrame.data = bArr;
        tRTCVideoFrame.buffer = byteBuffer;
        tRTCVideoFrame.width = i27;
        tRTCVideoFrame.height = i28;
        tRTCVideoFrame.timestamp = j17;
        tRTCVideoFrame.rotation = convertPixelFrameRotationToTRTCVideoRotation(com.tencent.liteav.base.util.k.a(i29));
        return tRTCVideoFrame;
    }

    public void destroy() {
        this.mJniWriteLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0) {
                nativeDestroyPipeline(j17);
                this.mNativeTrtcCloudJni = 0L;
            }
            this.mListenerList.clear();
        } finally {
            this.mJniWriteLock.unlock();
        }
    }

    public void disconnectOtherRoom() {
        long j17 = this.mNativeTrtcCloudJni;
        if (j17 != 0) {
            nativeDisconnectOtherRoom(j17);
        }
    }

    public void enable3DSpatialAudioEffect(boolean z17) {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0) {
                nativeEnable3DSpatialAudioEffect(j17, z17);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void enableAudioVolumeEvaluation(boolean z17, com.tencent.trtc.TRTCCloudDef.TRTCAudioVolumeEvaluateParams tRTCAudioVolumeEvaluateParams) {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0 && tRTCAudioVolumeEvaluateParams != null) {
                nativeEnableAudioVolumeEvaluation(j17, z17, tRTCAudioVolumeEvaluateParams.interval, tRTCAudioVolumeEvaluateParams.enableVadDetection, tRTCAudioVolumeEvaluateParams.enablePitchCalculation, tRTCAudioVolumeEvaluateParams.enableSpectrumCalculation);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void enableCustomAudioCapture(boolean z17) {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0) {
                nativeEnableCustomAudioCapture(j17, z17);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void enableCustomAudioRendering(boolean z17) {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0) {
                nativeEnableCustomAudioRendering(j17, z17);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void enableCustomVideoCapture(int i17, boolean z17) {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0) {
                nativeEnableCustomVideoCapture(j17, i17, z17);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public int enableEncSmallVideoStream(boolean z17, com.tencent.trtc.TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam) {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0) {
                nativeEnableEncSmallVideoStream(j17, z17, tRTCVideoEncParam == null ? null : new com.tencent.liteav.trtc.TrtcCloudJni.VideoEncParams(tRTCVideoEncParam));
            }
            this.mJniReadLock.unlock();
            return 0;
        } catch (java.lang.Throwable th6) {
            this.mJniReadLock.unlock();
            throw th6;
        }
    }

    public void enableMixExternalAudioFrame(boolean z17, boolean z18) {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0) {
                nativeEnableMixExternalAudioFrame(j17, z17, z18);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public int enablePayloadPrivateEncryption(boolean z17, com.tencent.trtc.TRTCCloudDef.TRTCPayloadPrivateEncryptionConfig tRTCPayloadPrivateEncryptionConfig) {
        int i17;
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0) {
                i17 = nativeEnablePayloadPrivateEncryption(j17, z17, tRTCPayloadPrivateEncryptionConfig == null ? null : new com.tencent.liteav.trtc.TrtcCloudJni.PayloadPrivateEncryptionConfig(tRTCPayloadPrivateEncryptionConfig));
            } else {
                i17 = -1;
            }
            return i17;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void enterRoom(com.tencent.trtc.TRTCCloudDef.TRTCParams tRTCParams, int i17) {
        if (tRTCParams == null) {
            com.tencent.liteav.base.util.LiteavLog.e(TAG, "enterRoom param is null");
            runOnListenerThread(com.tencent.liteav.trtc.a.a(this));
            return;
        }
        this.mJniReadLock.lock();
        try {
            this.mLocalUserId = tRTCParams.userId;
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0) {
                nativeEnterRoom(j17, new com.tencent.liteav.trtc.TrtcCloudJni.EnterRoomParams(tRTCParams), i17);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void exitRoom() {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0) {
                nativeExitRoom(j17);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public int getAudioCaptureVolume() {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            return j17 != 0 ? nativeGetAudioCaptureVolume(j17) : 0;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public int getAudioPlayoutVolume() {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            return j17 != 0 ? nativeGetAudioPlayoutVolume(j17) : 0;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void getCustomAudioRenderingFrame(com.tencent.trtc.TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame) {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0) {
                nativeGetCustomAudioRenderingFrame(j17, tRTCAudioFrame.data, tRTCAudioFrame.sampleRate, tRTCAudioFrame.channel);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public int getFrameBufferType(com.tencent.trtc.TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame) {
        return tRTCVideoFrame.bufferType;
    }

    public byte[] getFrameByteArray(com.tencent.trtc.TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame) {
        return tRTCVideoFrame.data;
    }

    public java.nio.ByteBuffer getFrameByteBuffer(com.tencent.trtc.TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame) {
        return tRTCVideoFrame.buffer;
    }

    public java.lang.Object getFrameEglContext(com.tencent.trtc.TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame) {
        return com.tencent.liteav.base.system.LiteavSystemInfo.getSystemOSVersionInt() >= 17 ? tRTCVideoFrame.texture.eglContext14 : tRTCVideoFrame.texture.eglContext10;
    }

    public int getFrameHeight(com.tencent.trtc.TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame) {
        return tRTCVideoFrame.height;
    }

    public int getFramePixelFormat(com.tencent.trtc.TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame) {
        return tRTCVideoFrame.pixelFormat;
    }

    public long getFramePts(com.tencent.trtc.TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame) {
        return tRTCVideoFrame.timestamp;
    }

    public int getFrameRotation(com.tencent.trtc.TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame) {
        return covertTRTCVideoRotationToPixelFrameRotation(tRTCVideoFrame.rotation).mValue;
    }

    public int getFrameTextureId(com.tencent.trtc.TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame) {
        return tRTCVideoFrame.texture.textureId;
    }

    public int getFrameWidth(com.tencent.trtc.TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame) {
        return tRTCVideoFrame.width;
    }

    public long getTrtcCloudJni() {
        this.mJniReadLock.lock();
        try {
            return this.mNativeTrtcCloudJni;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public int mixExternalAudioFrame(com.tencent.trtc.TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame) {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0) {
                return nativeMixExternalAudioFrame(j17, new com.tencent.liteav.trtc.TrtcCloudJni.AudioFrame(tRTCAudioFrame));
            }
            this.mJniReadLock.unlock();
            return -1;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void muteAllRemoteAudio(boolean z17) {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0) {
                nativeMuteAllRemoteAudio(j17, z17);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void muteAllRemoteVideoStreams(boolean z17) {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0) {
                nativeMuteAllRemoteVideoStreams(j17, z17);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void muteLocalAudio(boolean z17) {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0) {
                nativeMuteLocalAudio(j17, z17);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void muteLocalVideo(int i17, boolean z17) {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0) {
                nativeMuteLocalVideo(j17, i17, z17);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void muteRemoteAudio(java.lang.String str, boolean z17) {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0) {
                nativeMuteRemoteAudio(j17, str, z17);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void muteRemoteVideoStream(java.lang.String str, int i17, boolean z17) {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0) {
                nativeMuteRemoteVideoStream(j17, str, i17, z17);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void onAudioCaptureProcessedData(byte[] bArr, long j17, int i17, int i18) {
        com.tencent.trtc.TRTCCloudListener.TRTCAudioFrameListener tRTCAudioFrameListener = this.mAudioFrameListener;
        if (tRTCAudioFrameListener == null) {
            return;
        }
        com.tencent.trtc.TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame = new com.tencent.trtc.TRTCCloudDef.TRTCAudioFrame();
        tRTCAudioFrame.data = bArr;
        tRTCAudioFrame.timestamp = j17;
        tRTCAudioFrame.sampleRate = i17;
        tRTCAudioFrame.channel = i18;
        tRTCAudioFrameListener.onCapturedAudioFrame(tRTCAudioFrame);
    }

    public void onAudioMixedAllData(byte[] bArr, int i17, int i18) {
        com.tencent.trtc.TRTCCloudListener.TRTCAudioFrameListener tRTCAudioFrameListener = this.mAudioFrameListener;
        if (tRTCAudioFrameListener == null) {
            return;
        }
        com.tencent.trtc.TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame = new com.tencent.trtc.TRTCCloudDef.TRTCAudioFrame();
        tRTCAudioFrame.data = bArr;
        tRTCAudioFrame.timestamp = 0L;
        tRTCAudioFrame.sampleRate = i17;
        tRTCAudioFrame.channel = i18;
        tRTCAudioFrameListener.onMixedAllAudioFrame(tRTCAudioFrame);
    }

    public void onAudioPlayoutData(byte[] bArr, long j17, int i17, int i18) {
        com.tencent.trtc.TRTCCloudListener.TRTCAudioFrameListener tRTCAudioFrameListener = this.mAudioFrameListener;
        if (tRTCAudioFrameListener == null) {
            return;
        }
        com.tencent.trtc.TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame = new com.tencent.trtc.TRTCCloudDef.TRTCAudioFrame();
        tRTCAudioFrame.data = bArr;
        tRTCAudioFrame.timestamp = j17;
        tRTCAudioFrame.sampleRate = i17;
        tRTCAudioFrame.channel = i18;
        tRTCAudioFrameListener.onMixedPlayAudioFrame(tRTCAudioFrame);
    }

    public void onAudioRemoteStreamData(java.lang.String str, byte[] bArr, long j17, int i17, int i18, byte[] bArr2) {
        com.tencent.trtc.TRTCCloudListener.TRTCAudioFrameListener tRTCAudioFrameListener = this.mAudioFrameListener;
        if (tRTCAudioFrameListener == null) {
            return;
        }
        com.tencent.trtc.TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame = new com.tencent.trtc.TRTCCloudDef.TRTCAudioFrame();
        tRTCAudioFrame.data = bArr;
        tRTCAudioFrame.timestamp = j17;
        tRTCAudioFrame.sampleRate = i17;
        tRTCAudioFrame.channel = i18;
        tRTCAudioFrame.extraData = bArr2;
        tRTCAudioFrameListener.onRemoteUserAudioFrame(tRTCAudioFrame, str);
    }

    public void onAudioRouteChanged(int i17, int i18) {
        java.util.Iterator<com.tencent.trtc.TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onAudioRouteChanged(i17, i18);
        }
    }

    public void onCameraDidReady() {
        java.util.Iterator<com.tencent.trtc.TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onCameraDidReady();
        }
    }

    public void onCdnStreamStateChanged(java.lang.String str, int i17, int i18, java.lang.String str2, java.lang.String str3) {
        java.util.Iterator<com.tencent.trtc.TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onCdnStreamStateChanged(str, i17, i18, str2, null);
        }
    }

    public void onConnectOtherRoom(java.lang.String str, int i17, java.lang.String str2) {
        java.util.Iterator<com.tencent.trtc.TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onConnectOtherRoom(str, i17, str2);
        }
    }

    public void onConnectionLost() {
        java.util.Iterator<com.tencent.trtc.TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onConnectionLost();
        }
    }

    public void onConnectionRecovery() {
        java.util.Iterator<com.tencent.trtc.TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onConnectionRecovery();
        }
    }

    public void onDisConnectOtherRoom(int i17, java.lang.String str) {
        java.util.Iterator<com.tencent.trtc.TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onDisConnectOtherRoom(i17, str);
        }
    }

    public void onEarMonitoringData(byte[] bArr, int i17, int i18) {
        com.tencent.trtc.TRTCCloudListener.TRTCAudioFrameListener tRTCAudioFrameListener = this.mAudioFrameListener;
        if (tRTCAudioFrameListener == null) {
            return;
        }
        com.tencent.trtc.TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame = new com.tencent.trtc.TRTCCloudDef.TRTCAudioFrame();
        tRTCAudioFrame.data = bArr;
        tRTCAudioFrame.timestamp = 0L;
        tRTCAudioFrame.sampleRate = i17;
        tRTCAudioFrame.channel = i18;
        tRTCAudioFrameListener.onVoiceEarMonitorAudioFrame(tRTCAudioFrame);
    }

    public void onEnterRoom(int i17) {
        java.util.Iterator<com.tencent.trtc.TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onEnterRoom(i17);
        }
    }

    public void onError(int i17, java.lang.String str) {
        java.util.Iterator<com.tencent.trtc.TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onError(i17, str, null);
        }
    }

    public void onExitRoom(int i17) {
        java.util.Iterator<com.tencent.trtc.TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onExitRoom(i17);
        }
        synchronized (this.mLocalVideoRenderListenerWrapper) {
            this.mLocalVideoRenderListenerWrapper.f46616d = null;
        }
        synchronized (this.mRemoteVideoRenderListenerMap) {
            this.mRemoteVideoRenderListenerMap.clear();
        }
    }

    public void onFirstAudioFrame(java.lang.String str) {
        java.util.Iterator<com.tencent.trtc.TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onFirstAudioFrame(str);
        }
    }

    public void onFirstVideoFrame(java.lang.String str, int i17, int i18, int i19) {
        java.util.Iterator<com.tencent.trtc.TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onFirstVideoFrame(str, i17, i18, i19);
        }
    }

    public void onGLContextCreated() {
        synchronized (this.mVideoFrameListenerWrapper) {
            this.mCalledGLCreatedFrameListener = this.mVideoFrameListenerWrapper.f46616d;
        }
        com.tencent.liteav.base.util.LiteavLog.i(TAG, "onGLContextCreated " + this.mCalledGLCreatedFrameListener);
        com.tencent.trtc.TRTCCloudListener.TRTCVideoFrameListener tRTCVideoFrameListener = this.mCalledGLCreatedFrameListener;
        if (tRTCVideoFrameListener != null) {
            tRTCVideoFrameListener.onGLContextCreated();
        }
    }

    public void onGLContextDestroy() {
        com.tencent.liteav.base.util.LiteavLog.i(TAG, "onGLContextDestroy " + this.mCalledGLCreatedFrameListener);
        com.tencent.trtc.TRTCCloudListener.TRTCVideoFrameListener tRTCVideoFrameListener = this.mCalledGLCreatedFrameListener;
        if (tRTCVideoFrameListener != null) {
            tRTCVideoFrameListener.onGLContextDestory();
            this.mCalledGLCreatedFrameListener = null;
        }
    }

    public byte[] onLocalAudioStreamData(byte[] bArr, long j17, int i17, int i18) {
        com.tencent.trtc.TRTCCloudListener.TRTCAudioFrameListener tRTCAudioFrameListener = this.mAudioFrameListener;
        if (tRTCAudioFrameListener == null) {
            return null;
        }
        com.tencent.trtc.TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame = new com.tencent.trtc.TRTCCloudDef.TRTCAudioFrame();
        tRTCAudioFrame.data = bArr;
        tRTCAudioFrame.timestamp = j17;
        tRTCAudioFrame.sampleRate = i17;
        tRTCAudioFrame.channel = i18;
        tRTCAudioFrameListener.onLocalProcessedAudioFrame(tRTCAudioFrame);
        byte[] bArr2 = tRTCAudioFrame.extraData;
        if (bArr2 == null) {
            return null;
        }
        if (bArr2.length <= 100) {
            return bArr2;
        }
        com.tencent.liteav.base.util.LiteavLog.w(TAG, "Audioframe.extraData length need to be under 100!");
        return null;
    }

    public void onLocalRecordBegin(int i17, java.lang.String str) {
        java.util.Iterator<com.tencent.trtc.TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onLocalRecordBegin(i17, str);
        }
    }

    public void onLocalRecordComplete(int i17, java.lang.String str) {
        java.util.Iterator<com.tencent.trtc.TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onLocalRecordComplete(i17, str);
        }
    }

    public void onLocalRecordFragment(java.lang.String str) {
        java.util.Iterator<com.tencent.trtc.TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onLocalRecordFragment(str);
        }
    }

    public void onLocalRecording(long j17, java.lang.String str) {
        java.util.Iterator<com.tencent.trtc.TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onLocalRecording(j17, str);
        }
    }

    public void onMicDidReady() {
        java.util.Iterator<com.tencent.trtc.TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onMicDidReady();
        }
    }

    public void onMissCustomCmdMsg(java.lang.String str, int i17, int i18, int i19) {
        java.util.Iterator<com.tencent.trtc.TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onMissCustomCmdMsg(str, i17, i18, i19);
        }
    }

    public void onNetworkQuality(int i17, java.lang.String[] strArr, int[] iArr) {
        if (CopyOnReadListeners().size() == 0) {
            return;
        }
        com.tencent.trtc.TRTCCloudDef.TRTCQuality tRTCQuality = new com.tencent.trtc.TRTCCloudDef.TRTCQuality();
        tRTCQuality.userId = "";
        tRTCQuality.quality = i17;
        java.util.ArrayList<com.tencent.trtc.TRTCCloudDef.TRTCQuality> arrayList = new java.util.ArrayList<>();
        if (strArr != null && strArr.length != 0 && iArr != null && iArr.length != 0 && iArr.length == strArr.length) {
            for (int i18 = 0; i18 < strArr.length; i18++) {
                com.tencent.trtc.TRTCCloudDef.TRTCQuality tRTCQuality2 = new com.tencent.trtc.TRTCCloudDef.TRTCQuality();
                tRTCQuality2.userId = strArr[i18];
                tRTCQuality2.quality = iArr[i18];
                arrayList.add(tRTCQuality2);
            }
        }
        java.util.Iterator<com.tencent.trtc.TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onNetworkQuality(tRTCQuality, arrayList);
        }
    }

    public void onPreprocessVideoFrame(int i17, com.tencent.trtc.TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame, com.tencent.trtc.TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame2) {
        com.tencent.trtc.TRTCCloudListener.TRTCVideoFrameListener tRTCVideoFrameListener = this.mCalledGLCreatedFrameListener;
        if (tRTCVideoFrameListener == null || tRTCVideoFrameListener == null) {
            return;
        }
        tRTCVideoFrameListener.onProcessVideoFrame(tRTCVideoFrame, tRTCVideoFrame2);
    }

    public void onRecvCustomCmdMsg(java.lang.String str, int i17, int i18, byte[] bArr) {
        java.util.Iterator<com.tencent.trtc.TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onRecvCustomCmdMsg(str, i17, i18, bArr);
        }
    }

    public void onRemoteAudioStatusUpdated(java.lang.String str, int i17, int i18) {
        java.util.Iterator<com.tencent.trtc.TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onRemoteAudioStatusUpdated(str, i17, i18, null);
        }
    }

    public void onRemoteVideoStatusUpdated(java.lang.String str, int i17, int i18, int i19) {
        java.util.Iterator<com.tencent.trtc.TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onRemoteVideoStatusUpdated(str, i17, i18, i19, null);
        }
    }

    public void onRenderVideoFrame(java.lang.String str, int i17, com.tencent.trtc.TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame) {
        com.tencent.trtc.TRTCCloudListener.TRTCVideoRenderListener tRTCVideoRenderListener;
        if (android.text.TextUtils.isEmpty(str)) {
            str = this.mLocalUserId;
            tRTCVideoRenderListener = this.mLocalVideoRenderListenerWrapper.f46616d;
        } else {
            com.tencent.liteav.trtc.TrtcCloudJni.a<com.tencent.trtc.TRTCCloudListener.TRTCVideoRenderListener> aVar = this.mRemoteVideoRenderListenerMap.get(str);
            tRTCVideoRenderListener = aVar == null ? null : aVar.f46616d;
        }
        if (tRTCVideoRenderListener != null) {
            tRTCVideoRenderListener.onRenderVideoFrame(str, i17, tRTCVideoFrame);
        }
    }

    public void onSEIMessageReceived(byte[] bArr, java.lang.String str) {
        java.util.Iterator<com.tencent.trtc.TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onRecvSEIMsg(str, bArr);
        }
    }

    public void onScreenCapturePaused() {
        java.util.Iterator<com.tencent.trtc.TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onScreenCapturePaused();
        }
    }

    public void onScreenCaptureResumed() {
        java.util.Iterator<com.tencent.trtc.TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onScreenCaptureResumed();
        }
    }

    public void onScreenCaptureStarted() {
        java.util.Iterator<com.tencent.trtc.TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onScreenCaptureStarted();
        }
    }

    public void onScreenCaptureStopped(int i17) {
        java.util.Iterator<com.tencent.trtc.TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onScreenCaptureStopped(i17);
        }
    }

    public void onSendFirstLocalAudioFrame() {
        java.util.Iterator<com.tencent.trtc.TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onSendFirstLocalAudioFrame();
        }
    }

    public void onSendFirstLocalVideoFrame(int i17) {
        java.util.Iterator<com.tencent.trtc.TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onSendFirstLocalVideoFrame(i17);
        }
    }

    public void onSetMixTranscodingConfig(int i17, java.lang.String str) {
        java.util.Iterator<com.tencent.trtc.TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onSetMixTranscodingConfig(i17, str);
        }
    }

    public void onSnapshotComplete(com.tencent.trtc.TRTCCloudListener.TRTCSnapshotListener tRTCSnapshotListener, android.graphics.Bitmap bitmap) {
        runOnListenerThread(com.tencent.liteav.trtc.d.a(tRTCSnapshotListener, bitmap));
    }

    public void onSpeedTest(com.tencent.liteav.trtc.TrtcCloudJni.SpeedTestResult speedTestResult, int i17, int i18) {
        java.util.Iterator<com.tencent.trtc.TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onSpeedTest(speedTestResult.f46603a, i17, i18);
        }
    }

    public void onSpeedTestResult(com.tencent.liteav.trtc.TrtcCloudJni.SpeedTestResult speedTestResult) {
        java.util.Iterator<com.tencent.trtc.TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onSpeedTestResult(speedTestResult.f46603a);
        }
    }

    public void onStartPublishCDNStream(int i17, java.lang.String str) {
        java.util.Iterator<com.tencent.trtc.TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onStartPublishCDNStream(i17, str);
        }
    }

    public void onStartPublishMediaStream(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3) {
        java.util.Iterator<com.tencent.trtc.TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onStartPublishMediaStream(str, i17, str2, extraToBundle(str3));
        }
    }

    public void onStartPublishing(int i17, java.lang.String str) {
        java.util.Iterator<com.tencent.trtc.TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onStartPublishing(i17, str);
        }
    }

    public void onStatistics(com.tencent.liteav.trtc.TrtcCloudJni.Statistics statistics) {
        java.util.Iterator<com.tencent.trtc.TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onStatistics(statistics.f46604a);
        }
    }

    public void onStopPublishCDNStream(int i17, java.lang.String str) {
        java.util.Iterator<com.tencent.trtc.TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onStopPublishCDNStream(i17, str);
        }
    }

    public void onStopPublishMediaStream(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3) {
        java.util.Iterator<com.tencent.trtc.TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onStopPublishMediaStream(str, i17, str2, extraToBundle(str3));
        }
    }

    public void onStopPublishing(int i17, java.lang.String str) {
        java.util.Iterator<com.tencent.trtc.TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onStopPublishing(i17, str);
        }
    }

    public void onSwitchRole(int i17, java.lang.String str) {
        java.util.Iterator<com.tencent.trtc.TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onSwitchRole(i17, str);
        }
    }

    public void onSwitchRoom(int i17, java.lang.String str) {
        java.util.Iterator<com.tencent.trtc.TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onSwitchRoom(i17, str);
        }
    }

    public void onTryToReconnect() {
        java.util.Iterator<com.tencent.trtc.TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onTryToReconnect();
        }
    }

    public void onUpdateOtherRoomForwardMode(int i17, java.lang.String str) {
        java.util.Iterator<com.tencent.trtc.TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onUpdateOtherRoomForwardMode(i17, str);
        }
    }

    public void onUpdatePublishMediaStream(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3) {
        java.util.Iterator<com.tencent.trtc.TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onUpdatePublishMediaStream(str, i17, str2, extraToBundle(str3));
        }
    }

    public void onUserAudioAvailable(java.lang.String str, boolean z17) {
        java.util.Iterator<com.tencent.trtc.TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onUserAudioAvailable(str, z17);
        }
    }

    public void onUserEnter(java.lang.String str) {
        java.util.Iterator<com.tencent.trtc.TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onUserEnter(str);
        }
    }

    public void onUserExit(java.lang.String str) {
        java.util.Iterator<com.tencent.trtc.TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onUserExit(str, 0);
        }
    }

    public void onUserOffline(java.lang.String str, int i17) {
        java.util.Iterator<com.tencent.trtc.TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onRemoteUserLeaveRoom(str, i17);
        }
    }

    public void onUserOnline(java.lang.String str) {
        java.util.Iterator<com.tencent.trtc.TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onRemoteUserEnterRoom(str);
        }
    }

    public void onUserSubStreamAvailable(java.lang.String str, boolean z17) {
        java.util.Iterator<com.tencent.trtc.TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onUserSubStreamAvailable(str, z17);
        }
    }

    public void onUserVideoAvailable(java.lang.String str, boolean z17) {
        java.util.Iterator<com.tencent.trtc.TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onUserVideoAvailable(str, z17);
        }
    }

    public void onUserVideoSizeChanged(java.lang.String str, int i17, int i18, int i19) {
        java.util.Iterator<com.tencent.trtc.TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onUserVideoSizeChanged(str, i17, i18, i19);
        }
    }

    public void onUserVoiceVolume(java.lang.String[] strArr, int[] iArr, int[] iArr2, float[] fArr, float[][] fArr2, int i17) {
        java.lang.String str;
        if (strArr == null || iArr == null) {
            return;
        }
        if (strArr.length != iArr.length) {
            throw new java.lang.IllegalArgumentException("Invalid parameter, userIds and volumes do not match.");
        }
        java.util.ArrayList<com.tencent.trtc.TRTCCloudDef.TRTCVolumeInfo> arrayList = new java.util.ArrayList<>();
        for (int i18 = 0; i18 < strArr.length; i18++) {
            com.tencent.trtc.TRTCCloudDef.TRTCVolumeInfo tRTCVolumeInfo = new com.tencent.trtc.TRTCCloudDef.TRTCVolumeInfo();
            if (!strArr[i18].isEmpty() || (str = this.mLocalUserId) == null || str.isEmpty()) {
                tRTCVolumeInfo.userId = strArr[i18];
            } else {
                tRTCVolumeInfo.userId = this.mLocalUserId;
            }
            tRTCVolumeInfo.volume = iArr[i18];
            tRTCVolumeInfo.vad = iArr2[i18];
            tRTCVolumeInfo.pitch = fArr[i18];
            tRTCVolumeInfo.spectrumData = fArr2[i18];
            arrayList.add(tRTCVolumeInfo);
        }
        java.util.Iterator<com.tencent.trtc.TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onUserVoiceVolume(arrayList, i17);
        }
    }

    public void onWarning(int i17, java.lang.String str, android.os.Bundle bundle) {
        java.util.Iterator<com.tencent.trtc.TRTCCloudListener> it = CopyOnReadListeners().iterator();
        while (it.hasNext()) {
            it.next().onWarning(i17, str, bundle);
        }
    }

    public void pauseScreenCapture(int i17) {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0) {
                nativePauseScreenCapture(j17, i17);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void removeListener(com.tencent.trtc.TRTCCloudListener tRTCCloudListener) {
        if (tRTCCloudListener == null || !this.mListenerList.contains(tRTCCloudListener)) {
            return;
        }
        this.mListenerList.remove(tRTCCloudListener);
    }

    public void resumeScreenCapture(int i17) {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0) {
                nativeResumeScreenCapture(j17, i17);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void sendCustomAudioData(com.tencent.trtc.TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame) {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0) {
                nativeSendCustomAudioData(j17, new com.tencent.liteav.trtc.TrtcCloudJni.AudioFrame(tRTCAudioFrame));
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public boolean sendCustomCmdMsg(int i17, byte[] bArr, boolean z17, boolean z18) {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0) {
                return nativeSendCustomCmdMsg(j17, i17, bArr, z17, z18);
            }
            this.mJniReadLock.unlock();
            return false;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void sendCustomVideoData(int i17, com.tencent.trtc.TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame) {
        int i18;
        java.lang.Object obj;
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0) {
                com.tencent.trtc.TRTCCloudDef.TRTCTexture tRTCTexture = tRTCVideoFrame.texture;
                if (tRTCTexture != null) {
                    int i19 = tRTCTexture.textureId;
                    java.lang.Object obj2 = tRTCTexture.eglContext10;
                    if (obj2 == null) {
                        obj2 = tRTCTexture.eglContext14;
                    }
                    i18 = i19;
                    obj = obj2;
                } else {
                    i18 = -1;
                    obj = null;
                }
                nativeSendCustomVideoData(j17, i17, tRTCVideoFrame.pixelFormat, tRTCVideoFrame.bufferType, obj, i18, tRTCVideoFrame.width, tRTCVideoFrame.height, covertTRTCVideoRotationToPixelFrameRotation(tRTCVideoFrame.rotation).mValue, tRTCVideoFrame.timestamp, tRTCVideoFrame.data, tRTCVideoFrame.buffer);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public boolean sendSEIMsg(byte[] bArr, int i17) {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0) {
                return nativeSendSEIMsg(j17, bArr, i17);
            }
            this.mJniReadLock.unlock();
            return false;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void set3DSpatialReceivingRange(java.lang.String str, int i17) {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0) {
                nativeSet3DSpatialReceivingRange(j17, str, i17);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setAudioCaptureVolume(int i17) {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0) {
                nativeSetAudioCaptureVolume(j17, i17);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setAudioFrameListener(com.tencent.trtc.TRTCCloudListener.TRTCAudioFrameListener tRTCAudioFrameListener) {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0) {
                this.mAudioFrameListener = tRTCAudioFrameListener;
                nativeEnableAudioFrameNotification(j17, tRTCAudioFrameListener != null);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setAudioPlayoutVolume(int i17) {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0) {
                nativeSetAudioPlayoutVolume(j17, i17);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setAudioQuality(int i17) {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0) {
                nativeSetAudioQuality(j17, i17);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public int setCapturedAudioFrameCallbackFormat(int i17, int i18, int i19, int i27) {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            return j17 != 0 ? nativeSetCapturedAudioFrameCallbackFormat(j17, i17, i18, i19, i27) : 0;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setDefaultStreamRecvMode(boolean z17, boolean z18) {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0) {
                nativeSetDefaultStreamRecvMode(j17, z17, z18);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setGSensorMode(int i17, int i18) {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0) {
                nativeSetGSensorMode(j17, i17, i18);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setGravitySensorAdaptiveMode(int i17) {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0) {
                nativeSetGravitySensorAdaptiveMode(j17, i17);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setListener(com.tencent.trtc.TRTCCloudListener tRTCCloudListener) {
        this.mListener = tRTCCloudListener;
    }

    public void setListenerHandler(android.os.Handler handler) {
        this.mJniReadLock.lock();
        if (handler == null) {
            this.mListenerHandler = new android.os.Handler(android.os.Looper.getMainLooper());
        } else {
            this.mListenerHandler = handler;
        }
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0) {
                nativeSetListenerHandler(j17, handler);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public int setLocalProcessedAudioFrameCallbackFormat(int i17, int i18, int i19, int i27) {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            return j17 != 0 ? nativeSetLocalProcessedAudioFrameCallbackFormat(j17, i17, i18, i19, i27) : 0;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int setLocalVideoProcessListener(int i17, int i18, int i19, com.tencent.trtc.TRTCCloudListener.TRTCVideoFrameListener tRTCVideoFrameListener) {
        this.mJniReadLock.lock();
        try {
            if (this.mNativeTrtcCloudJni != 0) {
                if (!isCustomPreprocessSupportedFormatType(i18)) {
                    this.mJniReadLock.unlock();
                    return com.tencent.liteav.TXLiteAVCode.ERR_PIXEL_FORMAT_UNSUPPORTED;
                }
                if (!isCustomPreprocessSupportedBufferType(i19)) {
                    this.mJniReadLock.unlock();
                    return com.tencent.liteav.TXLiteAVCode.ERR_BUFFER_TYPE_UNSUPPORTED;
                }
                synchronized (this.mVideoFrameListenerWrapper) {
                    com.tencent.liteav.trtc.TrtcCloudJni.a<com.tencent.trtc.TRTCCloudListener.TRTCVideoFrameListener> aVar = this.mVideoFrameListenerWrapper;
                    if (aVar.f46616d != null) {
                        nativeEnableVideoCustomPreprocess(this.mNativeTrtcCloudJni, false, aVar.f46613a, aVar.f46614b, aVar.f46615c);
                    }
                    com.tencent.liteav.trtc.TrtcCloudJni.a<com.tencent.trtc.TRTCCloudListener.TRTCVideoFrameListener> aVar2 = this.mVideoFrameListenerWrapper;
                    aVar2.f46616d = tRTCVideoFrameListener;
                    aVar2.f46613a = i17;
                    aVar2.f46614b = i18;
                    aVar2.f46615c = i19;
                    if (tRTCVideoFrameListener != 0) {
                        nativeEnableVideoCustomPreprocess(this.mNativeTrtcCloudJni, true, i17, i18, i19);
                    }
                }
            }
            return 0;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int setLocalVideoRenderListener(int i17, int i18, com.tencent.trtc.TRTCCloudListener.TRTCVideoRenderListener tRTCVideoRenderListener) {
        boolean z17;
        this.mJniReadLock.lock();
        try {
            if (this.mNativeTrtcCloudJni != 0) {
                if (!isCustomRenderSupportedFormatType(i17)) {
                    this.mJniReadLock.unlock();
                    return com.tencent.liteav.TXLiteAVCode.ERR_PIXEL_FORMAT_UNSUPPORTED;
                }
                if (!isCustomRenderSupportedBufferType(i18)) {
                    this.mJniReadLock.unlock();
                    return com.tencent.liteav.TXLiteAVCode.ERR_BUFFER_TYPE_UNSUPPORTED;
                }
                synchronized (this.mLocalVideoRenderListenerWrapper) {
                    com.tencent.liteav.trtc.TrtcCloudJni.a<com.tencent.trtc.TRTCCloudListener.TRTCVideoRenderListener> aVar = this.mLocalVideoRenderListenerWrapper;
                    if (aVar.f46616d != null) {
                        int i19 = aVar.f46614b;
                        if (i19 == i17 && aVar.f46615c == i18) {
                            z17 = false;
                            if (!z17 && tRTCVideoRenderListener != 0) {
                                aVar.f46616d = tRTCVideoRenderListener;
                            }
                            nativeEnableVideoCustomRender(this.mNativeTrtcCloudJni, false, "", 0, i19, aVar.f46615c);
                            long j17 = this.mNativeTrtcCloudJni;
                            com.tencent.liteav.trtc.TrtcCloudJni.a<com.tencent.trtc.TRTCCloudListener.TRTCVideoRenderListener> aVar2 = this.mLocalVideoRenderListenerWrapper;
                            nativeEnableVideoCustomRender(j17, false, "", 2, aVar2.f46614b, aVar2.f46615c);
                        }
                        z17 = true;
                        if (!z17) {
                            aVar.f46616d = tRTCVideoRenderListener;
                        }
                        nativeEnableVideoCustomRender(this.mNativeTrtcCloudJni, false, "", 0, i19, aVar.f46615c);
                        long j172 = this.mNativeTrtcCloudJni;
                        com.tencent.liteav.trtc.TrtcCloudJni.a<com.tencent.trtc.TRTCCloudListener.TRTCVideoRenderListener> aVar22 = this.mLocalVideoRenderListenerWrapper;
                        nativeEnableVideoCustomRender(j172, false, "", 2, aVar22.f46614b, aVar22.f46615c);
                    }
                    com.tencent.liteav.trtc.TrtcCloudJni.a<com.tencent.trtc.TRTCCloudListener.TRTCVideoRenderListener> aVar3 = this.mLocalVideoRenderListenerWrapper;
                    aVar3.f46616d = tRTCVideoRenderListener;
                    aVar3.f46614b = i17;
                    aVar3.f46615c = i18;
                    if (tRTCVideoRenderListener != 0) {
                        nativeEnableVideoCustomRender(this.mNativeTrtcCloudJni, true, "", 0, i17, i18);
                        long j18 = this.mNativeTrtcCloudJni;
                        com.tencent.liteav.trtc.TrtcCloudJni.a<com.tencent.trtc.TRTCCloudListener.TRTCVideoRenderListener> aVar4 = this.mLocalVideoRenderListenerWrapper;
                        nativeEnableVideoCustomRender(j18, true, "", 2, aVar4.f46614b, aVar4.f46615c);
                    }
                }
            }
            return 0;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setLocalViewFillMode(int i17) {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0) {
                nativeSetLocalViewFillMode(j17, i17);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setLocalViewMirror(int i17) {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0) {
                nativeSetLocalViewMirror(j17, i17);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setLocalViewRotation(int i17) {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0) {
                nativeSetLocalViewRotation(j17, i17);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setMixExternalAudioVolume(int i17, int i18) {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0) {
                nativeSetMixExternalAudioVolume(j17, i17, i18);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setMixTranscodingConfig(com.tencent.trtc.TRTCCloudDef.TRTCTranscodingConfig tRTCTranscodingConfig) {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0) {
                nativeSetMixTranscodingConfig(j17, tRTCTranscodingConfig == null ? null : new com.tencent.liteav.trtc.TrtcCloudJni.TranscodingConfig(tRTCTranscodingConfig));
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public int setMixedPlayAudioFrameCallbackFormat(int i17, int i18, int i19, int i27) {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            return j17 != 0 ? nativeSetMixedPlayAudioFrameCallbackFormat(j17, i17, i18, i19, i27) : 0;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setNetworkQosParam(com.tencent.trtc.TRTCCloudDef.TRTCNetworkQosParam tRTCNetworkQosParam) {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0 && tRTCNetworkQosParam != null) {
                nativeSetNetworkQosParam(j17, tRTCNetworkQosParam.preference, tRTCNetworkQosParam.controlMode);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setPerspectiveCorrectionPoints(java.lang.String str, android.graphics.PointF[] pointFArr, android.graphics.PointF[] pointFArr2) {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0) {
                java.util.List list = null;
                float[] a17 = com.tencent.liteav.base.util.f.a(pointFArr == null ? null : java.util.Arrays.asList(pointFArr));
                if (pointFArr2 != null) {
                    list = java.util.Arrays.asList(pointFArr2);
                }
                nativeSetPerspectiveCorrectionPoints(j17, str, a17, com.tencent.liteav.base.util.f.a(list));
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public int setPriorRemoteVideoStreamType(int i17) {
        long j17 = this.mNativeTrtcCloudJni;
        if (j17 == 0) {
            return 0;
        }
        nativeSetPriorRemoteVideoStreamType(j17, i17);
        return 0;
    }

    public void setRemoteAudioParallelParams(com.tencent.trtc.TRTCCloudDef.TRTCAudioParallelParams tRTCAudioParallelParams) {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0 && tRTCAudioParallelParams != null) {
                nativeSetRemoteAudioParallelParams(j17, new com.tencent.liteav.trtc.TrtcCloudJni.AudioParallelParams(tRTCAudioParallelParams));
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setRemoteAudioVolume(java.lang.String str, int i17) {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0) {
                nativeSetRemoteAudioVolume(j17, str, i17);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int setRemoteVideoRenderListener(java.lang.String str, int i17, int i18, com.tencent.trtc.TRTCCloudListener.TRTCVideoRenderListener tRTCVideoRenderListener) {
        boolean z17;
        this.mJniReadLock.lock();
        try {
            byte b17 = 0;
            if (this.mNativeTrtcCloudJni != 0) {
                if (android.text.TextUtils.isEmpty(str)) {
                    this.mJniReadLock.unlock();
                    return -3319;
                }
                if (!isCustomRenderSupportedFormatType(i17)) {
                    this.mJniReadLock.unlock();
                    return com.tencent.liteav.TXLiteAVCode.ERR_PIXEL_FORMAT_UNSUPPORTED;
                }
                if (!isCustomRenderSupportedBufferType(i18)) {
                    this.mJniReadLock.unlock();
                    return com.tencent.liteav.TXLiteAVCode.ERR_BUFFER_TYPE_UNSUPPORTED;
                }
                synchronized (this.mRemoteVideoRenderListenerMap) {
                    com.tencent.liteav.trtc.TrtcCloudJni.a<com.tencent.trtc.TRTCCloudListener.TRTCVideoRenderListener> aVar = this.mRemoteVideoRenderListenerMap.get(str);
                    if (aVar != null) {
                        int i19 = aVar.f46614b;
                        if (i19 == i17 && aVar.f46615c == i18) {
                            z17 = false;
                            if (!z17 && tRTCVideoRenderListener != 0) {
                                aVar.f46616d = tRTCVideoRenderListener;
                                this.mRemoteVideoRenderListenerMap.put(str, aVar);
                            }
                            nativeEnableVideoCustomRender(this.mNativeTrtcCloudJni, false, str, 0, i19, aVar.f46615c);
                            nativeEnableVideoCustomRender(this.mNativeTrtcCloudJni, false, str, 2, aVar.f46614b, aVar.f46615c);
                        }
                        z17 = true;
                        if (!z17) {
                            aVar.f46616d = tRTCVideoRenderListener;
                            this.mRemoteVideoRenderListenerMap.put(str, aVar);
                        }
                        nativeEnableVideoCustomRender(this.mNativeTrtcCloudJni, false, str, 0, i19, aVar.f46615c);
                        nativeEnableVideoCustomRender(this.mNativeTrtcCloudJni, false, str, 2, aVar.f46614b, aVar.f46615c);
                    }
                    if (tRTCVideoRenderListener != 0) {
                        com.tencent.liteav.trtc.TrtcCloudJni.a<com.tencent.trtc.TRTCCloudListener.TRTCVideoRenderListener> aVar2 = new com.tencent.liteav.trtc.TrtcCloudJni.a<>(b17);
                        aVar2.f46616d = tRTCVideoRenderListener;
                        aVar2.f46614b = i17;
                        aVar2.f46615c = i18;
                        nativeEnableVideoCustomRender(this.mNativeTrtcCloudJni, true, str, 0, i17, i18);
                        nativeEnableVideoCustomRender(this.mNativeTrtcCloudJni, true, str, 2, aVar2.f46614b, aVar2.f46615c);
                        this.mRemoteVideoRenderListenerMap.put(str, aVar2);
                    } else {
                        this.mRemoteVideoRenderListenerMap.remove(str);
                    }
                }
            }
            return 0;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public int setRemoteVideoStreamType(java.lang.String str, int i17) {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0) {
                nativeSetRemoteVideoStreamType(j17, str, i17);
            }
            this.mJniReadLock.unlock();
            return 0;
        } catch (java.lang.Throwable th6) {
            this.mJniReadLock.unlock();
            throw th6;
        }
    }

    public void setRemoteViewFillMode(java.lang.String str, int i17, int i18) {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0) {
                nativeSetRemoteViewFillMode(j17, str, i17, i18);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setRemoteViewMirror(java.lang.String str, int i17, int i18) {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0) {
                nativeSetRemoteViewMirror(j17, str, i17, i18);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setRemoteViewRotation(java.lang.String str, int i17, int i18) {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0) {
                nativeSetRemoteViewRotation(j17, str, i17, i18);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setVideoEncoderMirror(boolean z17) {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0) {
                nativeSetVideoEncoderMirror(j17, z17);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setVideoEncoderParams(int i17, com.tencent.trtc.TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam) {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0 && tRTCVideoEncParam != null) {
                nativeSetVideoEncoderParams(j17, i17, new com.tencent.liteav.trtc.TrtcCloudJni.VideoEncParams(tRTCVideoEncParam));
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setVideoEncoderRotation(int i17) {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0) {
                nativeSetVideoEncoderRotation(j17, i17);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setVideoMuteImage(android.graphics.Bitmap bitmap, int i17) {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0) {
                nativeSetVideoMuteImage(j17, bitmap, i17);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void setWatermark(android.graphics.Bitmap bitmap, int i17, float f17, float f18, float f19) {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0) {
                nativeSetWatermark(j17, bitmap, i17, f17, f18, f19);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void showDashboardManager(int i17) {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0) {
                nativeShowDashboardManager(j17, i17);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void snapshotVideo(java.lang.String str, int i17, int i18, com.tencent.trtc.TRTCCloudListener.TRTCSnapshotListener tRTCSnapshotListener) {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0) {
                nativeSnapshotVideo(j17, str, i17, i18, tRTCSnapshotListener);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public int startAudioRecording(com.tencent.trtc.TRTCCloudDef.TRTCAudioRecordingParams tRTCAudioRecordingParams) {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0 && tRTCAudioRecordingParams != null) {
                return nativeStartAudioRecording(j17, new com.tencent.liteav.trtc.TrtcCloudJni.AudioRecordingParams(tRTCAudioRecordingParams));
            }
            this.mJniReadLock.unlock();
            return 0;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void startLocalAudio(int i17) {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0) {
                nativeStartLocalAudioWithQuality(j17, i17);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void startLocalPreview(boolean z17, com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView) {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0) {
                nativeStartLocalPreview(j17, z17, tXCloudVideoView);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void startLocalRecording(com.tencent.trtc.TRTCCloudDef.TRTCLocalRecordingParams tRTCLocalRecordingParams) {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0 && tRTCLocalRecordingParams != null) {
                nativeStartLocalRecording(j17, new com.tencent.liteav.trtc.TrtcCloudJni.LocalRecordingParams(tRTCLocalRecordingParams));
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void startPublishCDNStream(com.tencent.trtc.TRTCCloudDef.TRTCPublishCDNParam tRTCPublishCDNParam) {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0 && tRTCPublishCDNParam != null) {
                nativeStartPublishCDNStream(j17, new com.tencent.liteav.trtc.TrtcCloudJni.PublishCDNParams(tRTCPublishCDNParam));
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void startPublishMediaStream(com.tencent.trtc.TRTCCloudDef.TRTCPublishTarget tRTCPublishTarget, com.tencent.trtc.TRTCCloudDef.TRTCStreamEncoderParam tRTCStreamEncoderParam, com.tencent.trtc.TRTCCloudDef.TRTCStreamMixingConfig tRTCStreamMixingConfig) {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0) {
                com.tencent.liteav.trtc.TrtcCloudJni.StreamMixingConfig streamMixingConfig = null;
                com.tencent.liteav.trtc.TrtcCloudJni.PublishTarget publishTarget = tRTCPublishTarget == null ? null : new com.tencent.liteav.trtc.TrtcCloudJni.PublishTarget(tRTCPublishTarget);
                com.tencent.liteav.trtc.TrtcCloudJni.StreamEncoderParam streamEncoderParam = tRTCStreamEncoderParam == null ? null : new com.tencent.liteav.trtc.TrtcCloudJni.StreamEncoderParam(tRTCStreamEncoderParam);
                if (tRTCStreamMixingConfig != null) {
                    streamMixingConfig = new com.tencent.liteav.trtc.TrtcCloudJni.StreamMixingConfig(tRTCStreamMixingConfig);
                }
                nativeStartPublishMediaStream(j17, publishTarget, streamEncoderParam, streamMixingConfig);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void startPublishing(java.lang.String str, int i17) {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0) {
                nativeStartPublishing(j17, str, i17);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void startRemoteView(java.lang.String str, int i17, com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView) {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0) {
                nativeStartRemoteView(j17, str, i17, tXCloudVideoView);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void startScreenCapture(int i17, com.tencent.trtc.TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam, com.tencent.trtc.TRTCCloudDef.TRTCScreenShareParams tRTCScreenShareParams) {
        this.mJniReadLock.lock();
        try {
            if (this.mNativeTrtcCloudJni != 0) {
                com.tencent.liteav.trtc.TrtcCloudJni.ScreenShareParams screenShareParams = tRTCScreenShareParams != null ? new com.tencent.liteav.trtc.TrtcCloudJni.ScreenShareParams(tRTCScreenShareParams) : null;
                if (tRTCVideoEncParam == null) {
                    nativeStartScreenCapture(this.mNativeTrtcCloudJni, i17, null, screenShareParams);
                    com.tencent.liteav.base.util.LiteavLog.w(TAG, "startScreenCapture encParams is null");
                } else {
                    nativeStartScreenCapture(this.mNativeTrtcCloudJni, i17, new com.tencent.liteav.trtc.TrtcCloudJni.VideoEncParams(tRTCVideoEncParam), screenShareParams);
                }
            }
            if (tRTCScreenShareParams != null) {
                com.tencent.liteav.base.ThreadUtils.runOnUiThread(com.tencent.liteav.trtc.b.a(this, tRTCScreenShareParams));
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void startSpeedTest(com.tencent.trtc.TRTCCloudDef.TRTCSpeedTestParams tRTCSpeedTestParams) {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0 && tRTCSpeedTestParams != null) {
                nativeStartSpeedTest(j17, new com.tencent.liteav.trtc.TrtcCloudJni.SpeedTestParams(tRTCSpeedTestParams));
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void startSystemAudioLoopback() {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0) {
                nativeStartSystemAudioLoopback(j17);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void stopAllRemoteView() {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0) {
                nativeStopAllRemoteView(j17);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void stopAudioRecording() {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0) {
                nativeStopAudioRecording(j17);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void stopLocalAudio() {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0) {
                nativeStopLocalAudio(j17);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void stopLocalPreview() {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0) {
                nativeStopLocalPreview(j17);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void stopLocalRecording() {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0) {
                nativeStopLocalRecording(j17);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void stopPublishCDNStream() {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0) {
                nativeStopPublishCDNStream(j17);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void stopPublishMediaStream(java.lang.String str) {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0) {
                nativeStopPublishMediaStream(j17, str);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void stopPublishing() {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0) {
                nativeStopPublishing(j17);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void stopRemoteView(java.lang.String str, int i17) {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0) {
                nativeStopRemoteView(j17, str, i17);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void stopScreenCapture(int i17) {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0) {
                nativeStopScreenCapture(j17, i17);
            }
            this.mJniReadLock.unlock();
            com.tencent.liteav.base.ThreadUtils.runOnUiThread(com.tencent.liteav.trtc.c.a(this));
        } catch (java.lang.Throwable th6) {
            this.mJniReadLock.unlock();
            throw th6;
        }
    }

    public void stopSpeedTest() {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0) {
                nativeStopSpeedTest(j17);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void stopSystemAudioLoopback() {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0) {
                nativeStopSystemAudioLoopback(j17);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void switchRole(int i17) {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0) {
                nativeSwitchRole(j17, i17);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void switchRoom(com.tencent.trtc.TRTCCloudDef.TRTCSwitchRoomConfig tRTCSwitchRoomConfig) {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0 && tRTCSwitchRoomConfig != null) {
                nativeSwitchRoom(j17, new com.tencent.liteav.trtc.TrtcCloudJni.SwitchRoomConfig(tRTCSwitchRoomConfig));
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void updateLocalView(com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView) {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0) {
                nativeUpdateLocalView(j17, tXCloudVideoView);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void updateOtherRoomForwardMode(java.lang.String str) {
        long j17 = this.mNativeTrtcCloudJni;
        if (j17 != 0) {
            nativeUpdateOtherRoomForwardMode(j17, str);
        }
    }

    public void updatePublishMediaStream(java.lang.String str, com.tencent.trtc.TRTCCloudDef.TRTCPublishTarget tRTCPublishTarget, com.tencent.trtc.TRTCCloudDef.TRTCStreamEncoderParam tRTCStreamEncoderParam, com.tencent.trtc.TRTCCloudDef.TRTCStreamMixingConfig tRTCStreamMixingConfig) {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0) {
                nativeUpdatePublishMediaStream(j17, str, tRTCPublishTarget == null ? null : new com.tencent.liteav.trtc.TrtcCloudJni.PublishTarget(tRTCPublishTarget), tRTCStreamEncoderParam == null ? null : new com.tencent.liteav.trtc.TrtcCloudJni.StreamEncoderParam(tRTCStreamEncoderParam), tRTCStreamMixingConfig == null ? null : new com.tencent.liteav.trtc.TrtcCloudJni.StreamMixingConfig(tRTCStreamMixingConfig));
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void updateRemote3DSpatialPosition(java.lang.String str, int[] iArr) {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0 && iArr != null) {
                nativeUpdateRemote3DSpatialPosition(j17, str, iArr);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void updateRemoteView(java.lang.String str, int i17, com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView) {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0) {
                nativeUpdateRemoteView(j17, str, i17, tXCloudVideoView);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void updateSelf3DSpatialPosition(int[] iArr, float[] fArr, float[] fArr2, float[] fArr3) {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0 && iArr != null && fArr != null && fArr2 != null && fArr3 != null) {
                nativeUpdateSelf3DSpatialPosition(j17, iArr, fArr, fArr2, fArr3);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public TrtcCloudJni(long j17, boolean z17) {
        this.mNativeTrtcCloudJni = 0L;
        this.mLocalUserId = "";
        this.mListenerList = new java.util.concurrent.CopyOnWriteArrayList();
        java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = new java.util.concurrent.locks.ReentrantReadWriteLock();
        this.mReadWriteLock = reentrantReadWriteLock;
        this.mJniReadLock = reentrantReadWriteLock.readLock();
        this.mJniWriteLock = reentrantReadWriteLock.writeLock();
        this.mFloatingWindowSet = new java.util.HashSet<>();
        if (j17 == 0) {
            this.mNativeTrtcCloudJni = nativeCreatePipeline(this, z17);
        } else {
            this.mNativeTrtcCloudJni = nativeCreateSubCloud(this, j17);
        }
        byte b17 = 0;
        this.mVideoFrameListenerWrapper = new com.tencent.liteav.trtc.TrtcCloudJni.a<>(b17);
        this.mLocalVideoRenderListenerWrapper = new com.tencent.liteav.trtc.TrtcCloudJni.a<>(b17);
        this.mRemoteVideoRenderListenerMap = new java.util.HashMap();
        this.mListenerHandler = new android.os.Handler(android.os.Looper.getMainLooper());
    }

    /* loaded from: classes10.dex */
    public static class SpeedTestParams {

        /* renamed from: a, reason: collision with root package name */
        private final com.tencent.trtc.TRTCCloudDef.TRTCSpeedTestParams f46601a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f46602b;

        public SpeedTestParams(com.tencent.trtc.TRTCCloudDef.TRTCSpeedTestParams tRTCSpeedTestParams) {
            this.f46601a = tRTCSpeedTestParams;
            this.f46602b = false;
        }

        public int getExpectedDownBandwidth() {
            return this.f46601a.expectedDownBandwidth;
        }

        public int getExpectedUpBandwidth() {
            return this.f46601a.expectedUpBandwidth;
        }

        public boolean getIsCalledFromDeprecatedApi() {
            return this.f46602b;
        }

        public int getSDKAppId() {
            return this.f46601a.sdkAppId;
        }

        public int getScene() {
            return this.f46601a.scene;
        }

        public java.lang.String getUserId() {
            return this.f46601a.userId;
        }

        public java.lang.String getUserSig() {
            return this.f46601a.userSig;
        }

        public SpeedTestParams(int i17, java.lang.String str, java.lang.String str2) {
            com.tencent.trtc.TRTCCloudDef.TRTCSpeedTestParams tRTCSpeedTestParams = new com.tencent.trtc.TRTCCloudDef.TRTCSpeedTestParams();
            this.f46601a = tRTCSpeedTestParams;
            tRTCSpeedTestParams.sdkAppId = i17;
            tRTCSpeedTestParams.userId = str;
            tRTCSpeedTestParams.userSig = str2;
            tRTCSpeedTestParams.scene = 1;
            this.f46602b = true;
        }
    }

    public void startLocalAudio() {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0) {
                nativeStartLocalAudio(j17);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void startRemoteView(java.lang.String str, com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView) {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0) {
                nativeStartRemoteViewWithoutStreamType(j17, str, tXCloudVideoView);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void startSpeedTest(int i17, java.lang.String str, java.lang.String str2) {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0) {
                nativeStartSpeedTest(j17, new com.tencent.liteav.trtc.TrtcCloudJni.SpeedTestParams(i17, str, str2));
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void stopRemoteView(java.lang.String str) {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0) {
                nativeStopRemoteViewWithoutStreamType(j17, str);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void switchRole(int i17, java.lang.String str) {
        this.mJniReadLock.lock();
        try {
            long j17 = this.mNativeTrtcCloudJni;
            if (j17 != 0) {
                nativeSwitchRoleWithPrivateMapKey(j17, i17, str);
            }
        } finally {
            this.mJniReadLock.unlock();
        }
    }
}
