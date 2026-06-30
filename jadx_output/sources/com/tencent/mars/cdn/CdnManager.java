package com.tencent.mars.cdn;

/* loaded from: classes12.dex */
public class CdnManager extends com.tencent.mars.app.BaseManager {
    public static final int HIT_FILEID = 1;
    public static final int HIT_NEWMD5 = 4;
    public static final int HIT_UPLOADCHECKMD5 = 2;
    public static final int HIT_UPLOADWITHMD5 = 3;
    public static final int HIT_VIDEODROPRATE = 5;
    public static final int ImageFormat_HEIC = 4;
    public static final int ImageFormat_HEVC = 2;
    public static final int ImageFormat_JPEG = 1;
    public static final int ImageFormat_PNG = 3;
    public static final int ImageFormat_UNKNOWN = 0;
    public static final int MediaCompress_MID = 2;
    public static final int MediaCompress_ORIGIN = 1;
    public static final int MediaCompress_UNKNOWN = 0;
    public static final int MediaTypeAppImage = 20301;
    public static final int MediaTypeFriendsADImageThumb = 20204;
    public static final int MediaTypeFriendsImageThumb = 20205;
    public static final int MediaTypeFriendsVideoThumbImage = 20250;
    public static final int MediaType_ChatVoice = 15;
    public static final int MediaType_F2F_VOICE_RESOURCE = 101;
    public static final int MediaType_FAVORITE_FILE = 10001;
    public static final int MediaType_FAVORITE_VIDEO = 10002;
    public static final int MediaType_FILE = 5;
    public static final int MediaType_FRIENDS = 20201;
    public static final int MediaType_FRIENDS_Video = 20202;
    public static final int MediaType_FULLSIZEIMAGE = 1;
    public static final int MediaType_GlanceVideo = 90;
    public static final int MediaType_IMAGE = 2;
    public static final int MediaType_SnsAdLangdingPageVideo = 100;
    public static final int MediaType_THUMBIMAGE = 3;
    public static final int MediaType_TinyVideo = 6;
    public static final int MediaType_VIDEO = 4;
    public static final int MediaType_WIMDownload = 19;
    public static final int NO_ERROR = 0;
    public static final int NO_HITCACHE = 0;
    public static final int PreloadMode = 2;
    public static final int QueryInfoMode = 3;
    public static final int RealTimeMode = 4;
    public static final int StorageMode = 0;
    protected static final java.lang.String TAG = "MicroMsg.CdnManager";
    public static final int VideoFormar_FavCommonImg = 103;
    public static final int VideoFormar_FavH264 = 101;
    public static final int VideoFormar_FavH265 = 102;
    public static final int VideoFormar_FavWxam = 104;
    public static final int VideoFormar_FavWxam_WideGamut = 105;
    public static final int VideoFormat_Unknown = 0;
    public static final int VideoFormat_X264 = 1;
    public static final int VideoFormat_X265 = 2;
    public static final int VideoFormat_X266 = 3;
    public static final int VideoMessageFormatOpus = 2;
    public static final int VideoMessageFormatSilk = 1;
    public static final int VideoPlayMode = 1;
    public static final java.lang.String defaultApprovedVideoHosts = "vweixinf.tc.qq.com,szwbwxsns.video.qq.com,szxzwxsns.video.qq.com,szzjwxsns.video.qq.com,shwbwxsns.video.qq.com,shxzwxsns.video.qq.com,shzjwxsns.video.qq.com,wxsnsdy.wxs.qq.com,vweixinthumb.tc.qq.com,wxsnsdythumb.wxs.qq.com,wxappthumb.tc.qq.com,wxapp.tc.qq.com";
    public static final int kAppTypeAdImage = 109;
    public static final int kAppTypeAdVideo = 105;
    public static final int kAppTypeAny = 0;
    public static final int kAppTypeC2C = 1;
    public static final int kAppTypeC2CGroupChat = 2;
    public static final int kAppTypeCircleSearch = 12;
    public static final int kAppTypeEmoji = 110;
    public static final int kAppTypeFavorite = 10;
    public static final int kAppTypeFestivalImage = 257;
    public static final int kAppTypeFestivalVideo = 258;
    public static final int kAppTypeFilePreview = 8;
    public static final int kAppTypeFinderLive = 292;
    public static final int kAppTypeFinderVideo = 251;
    public static final int kAppTypeFullsizeVideo = 11;
    public static final int kAppTypeHDVideo = 205;
    public static final int kAppTypeHeadImage = 220;
    public static final int kAppTypeHwPage = 200;
    public static final int kAppTypeMultiJpeg = 101;
    public static final int kAppTypeMultiVCodec = 108;
    public static final int kAppTypeMultiWebp = 104;
    public static final int kAppTypeNearEvent = 201;
    public static final int kAppTypeNewLife = 280;
    public static final int kAppTypeP2021 = 255;
    public static final int kAppTypeRemarkImgAppType = 274;
    public static final int kAppTypeS1S = 314;
    public static final int kAppTypeSelfieEmoji = 111;
    public static final int kAppTypeServiceVoipVideo = 14;
    public static final int kAppTypeShop = 200;
    public static final int kAppTypeSingleJpeg = 100;
    public static final int kAppTypeSingleVCodec = 107;
    public static final int kAppTypeSingleWebp = 103;
    public static final int kAppTypeTingAudio = 276;
    public static final int kAppTypeTingImage = 275;
    public static final int kAppTypeUnknown = -1;
    public static final int kAppTypeUserStatus = 256;
    public static final int kAppTypeVideo = 102;
    public static final int kAppTypeVideoThumb = 150;
    public static final int kAppTypeYunStorage = 202;
    public static final int kBizAny = 0;
    public static final int kBizApp = 4;
    public static final int kBizC2C = 1;
    public static final int kBizC2CNova = 8;
    public static final int kBizDC = 5;
    public static final int kBizEWC = -3;
    public static final int kBizFavorite = 2;
    public static final int kBizFilePreview = 8;
    public static final int kBizLanCS = -2;
    public static final int kBizNormalHttp = -1;
    public static final int kBizSns = 3;
    public static final int kBizUnknown = 0;
    public static final int kErrSafeProtoNoAeskey = -21111;
    public static final int kErrUploadHevcIllegal = -5103237;
    public static final int kGroupNoticeCDNAppType = 264;
    public static final int kGroupNoticeCDNFileType = 20303;
    public static final int kIpSource_NewDNS = 1;
    public static final int kIpSource_None = 0;
    public static final int kIpSource_SysDNS = 2;
    public static final int kMediaGamePacket = 30002;
    public static final int kMediaLittleAppPacket = 30001;
    public static final int kMediaTypeAdImage = 20204;
    public static final int kMediaTypeAdVideo = 20210;
    public static final int kMediaTypeAny = 0;
    public static final int kMediaTypeAppFile = 20303;
    public static final int kMediaTypeAppImageStorage = 20304;
    public static final int kMediaTypeAppVideo = 20302;
    public static final int kMediaTypeAppWxamPic = 20351;
    public static final int kMediaTypeAudio = 11;
    public static final int kMediaTypeBackupFile = 20001;
    public static final int kMediaTypeBeatificFile = 10011;
    public static final int kMediaTypeBigFile = 7;
    public static final int kMediaTypeEmojiGIF = 20402;
    public static final int kMediaTypeEmojiNormal = 20401;
    public static final int kMediaTypeEmojiWXAM = 20403;
    public static final int kMediaTypeEmojiWXAMUser = 20404;
    public static final int kMediaTypeExposeImage = 11000;
    public static final int kMediaTypeFavoriteBigFile = 10007;
    public static final int kMediaTypeFavoriteFile = 10001;
    public static final int kMediaTypeFavoriteVideo = 10002;
    public static final int kMediaTypeFile = 5;
    public static final int kMediaTypeFriends = 20201;
    public static final int kMediaTypeFriendsVideo = 20202;
    public static final int kMediaTypeFriendsVideoThumbImage = 20250;
    public static final int kMediaTypeFullSizeImage = 1;
    public static final int kMediaTypeHWDevice = 20322;
    public static final int kMediaTypeHWDeviceFile = 20303;
    public static final int kMediaTypeImage = 2;
    public static final int kMediaTypeNearEvent = 20310;
    public static final int kMediaTypeShop = 20301;
    public static final int kMediaTypeSmartHwPage = 20321;
    public static final int kMediaTypeStoryAudio = 40001;
    public static final int kMediaTypeThumbImage = 3;
    public static final int kMediaTypeTinyVideo = 6;
    public static final int kMediaTypeVideo = 4;
    public static final int kMediaTypeWxamThumb = 20251;
    public static final int kMultiImageDownload = 2;
    public static final int kNetTypeDisconnected = -1;
    public static final int kNetTypeMobile = 2;
    public static final int kNetTypeOther = 3;
    public static final int kNetTypeWifi = 1;
    public static final int kSingleImageDownload = 1;
    public static final int kVideoBufferingBegin = 0;
    public static final int kVideoBufferingEnd = 1;
    public static final int kVideoStartPlay = 2;
    public static final int kVideoStopPlay = 3;
    protected long nativeHandle = 0;
    protected long callbackHandle = 0;

    /* loaded from: classes12.dex */
    public interface AppCallback {
        java.lang.String[] combineResolveHost(java.lang.String str, int i17, int i18, int[] iArr);

        boolean isUsingWangKaService(int i17);

        void onBadNetworkProbed();

        void onTaskTearDown(java.lang.String str, com.tencent.mars.cdn.CdnManager.DownloadTaskProfile downloadTaskProfile, java.lang.String str2);

        void reportFlow(int i17, int i18, int i19, int i27);

        void reportFlowWithTag(java.lang.String str, int i17, long j17, long j18, long j19, long j27);

        void reportGroupIDKey(int[] iArr, int[] iArr2, int[] iArr3, int i17, boolean z17);

        void reportIDKey(long j17, long j18, long j19, boolean z17);

        void reportKV(long j17, java.lang.String str, boolean z17, boolean z18, long j18);

        void reportKVNoFreqLimit(long j17, java.lang.String str);

        void requestGetCDN(int i17);

        void requestSnsGetCdnDistance(int i17, int i18, int i19);

        java.lang.String[] resolveHost(java.lang.String str, boolean z17, int[] iArr);
    }

    /* loaded from: classes4.dex */
    public static class BatchSnsReqImageData {
        public java.lang.String url = "";
        public int picIndex = 0;
        public java.lang.String imageCachePath = "";
        public java.lang.String decryptKey = "";
        public int totalFileSize = 0;
        public java.lang.String fileKey = "";
        public boolean retry = true;
    }

    /* loaded from: classes12.dex */
    public static class C2CDownloadRequest {
        public byte[] bizReqPayLoad;
        public byte[] cdnRequestPb;
        public int feedPicCount;
        public byte[] finderMediaCdnInfo;
        public java.lang.String fileKey = "";
        public java.lang.String argInfo = "";
        public java.lang.String debugIP = "";
        public int fileType = 0;
        public int bizid = 0;
        public int apptype = -1;
        protected java.lang.String savePath = "";
        public java.lang.String aeskey = "";
        public java.lang.String initialIV = "";
        public java.lang.String fileid = "";
        public boolean isSilentTask = false;
        public int queueTimeoutSeconds = 1800;
        public int transforTimeoutSeconds = 600;
        int downloadMode = 0;
        public java.lang.String netflowTag = "";
        public long expectFileSize = 0;
        public java.lang.String expectFileMD5 = "";
        public int chatType = 0;
        public boolean isStorageMode = false;
        public boolean isSmallVideo = false;
        public boolean isLargeSVideo = false;
        public boolean isAutoStart = false;
        public int downloadBehavior = 0;
        public java.lang.String msgExtra = "";
        public java.lang.String bigfileSignature = "";
        public int requestVideoFormat = 1;
        public int[] supportFormats = {1};
        public int videoflagPolicy = 0;
        public java.lang.String requestVideoFlag = "";
        public boolean isColdSnsData = false;
        public boolean isHotSnsVideo = false;
        public int preloadRatio = 30;
        public long preloadMinSize = 0;
        public boolean isHLSVideo = false;
        public java.lang.String hlsVideoFlag = "";
        public java.lang.String finderByPass = "";
        public boolean treatAsVideoFile = false;
        public boolean preAllocStorage = false;
        public java.lang.String url = "";
        public java.lang.String host = "";
        public java.lang.String referer = "";
        public java.lang.String snsCipherKey = "";
        public java.lang.String signalQuality = "";
        public java.lang.String snsScene = "";
        public java.lang.String customHeader = "";
        public java.lang.String fakeBigfileSignature = "";
        public java.lang.String fakeBigfileSignatureAeskey = "";
        public java.lang.String bakup_url = "";
        public java.lang.String serialized_verify_headers = "";
        public boolean allow_mobile_net_download = false;
        public boolean is_resume_task = false;
        public int concurrentCount = 1;
        public int maxHttpRedirectCount = 5;
        public boolean wifiAutoStart = false;
        protected java.lang.String statePath = "";
        public int connectionCount = 1;
        public int certificateVerifyPolicy = 1;
        public int msgType = 1;
        public java.lang.String feedId = "";
        public com.tencent.mars.cdn.CdnManager.BatchSnsReqImageData[] batchSnsReqImageDatas = null;
        public com.tencent.mars.cdn.CronetLogic.QuicTaskParams quicTaskParams = null;
        public long taskStartTime = 0;
        public java.lang.String httpMethod = "";
        public com.tencent.mars.cdn.CdnManager.HostIPHint hostIPHint = null;
        public boolean useNewdns = false;
        public int maxPCDNConnections = 0;
        public int pcdnAppID = 0;
        public java.lang.String snsVideoStragegy = "";
        public long maxFileSize = 0;
        public int videoDownloadMode = 0;
        public boolean tryRealtimeTransportProtocol = false;
        public int statefileKeepHours = 0;
        public boolean reportDetailPacketTransInfo = false;
        public java.lang.String clientTag = "";
        public java.lang.String taskGroupKey = "";
        public int taskGroupCapacity = 8;
        public int resolveHostPriority = 0;
        public int resolveHostFlags = 5;

        public com.tencent.mars.cdn.CdnManager.C2CDownloadRequest build() {
            int i17;
            int i18 = this.bizid;
            if (i18 == 0 || i18 == 0 || (i17 = this.apptype) == -1 || i17 == 0) {
                throw new java.security.InvalidParameterException("must set bizid,apptype");
            }
            if (this.fileKey.isEmpty()) {
                throw new java.security.InvalidParameterException("must set filekey");
            }
            if (this.url.isEmpty() && this.fileid.isEmpty()) {
                throw new java.security.InvalidParameterException("must set url or fileid");
            }
            if (!this.fileid.isEmpty() && this.aeskey.length() != 32) {
                throw new java.security.InvalidParameterException("aeskey must be 32 bytes");
            }
            if (this.aeskey.isEmpty() || this.snsCipherKey.isEmpty()) {
                return this;
            }
            throw new java.security.InvalidParameterException("one of (aeskey,snsCipherKey) must be empty");
        }

        public com.tencent.mars.cdn.CdnManager.C2CDownloadRequest setAeskey(java.lang.String str) {
            this.aeskey = str;
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CDownloadRequest setAllow_mobile_net_download(boolean z17) {
            this.allow_mobile_net_download = z17;
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CDownloadRequest setApptype(int i17) {
            this.apptype = i17;
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CDownloadRequest setArgInfo(java.lang.String str) {
            this.argInfo = str;
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CDownloadRequest setBakup_url(java.lang.String str) {
            this.bakup_url = str;
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CDownloadRequest setBatchSnsReqImageDatas(com.tencent.mars.cdn.CdnManager.BatchSnsReqImageData[] batchSnsReqImageDataArr) {
            this.batchSnsReqImageDatas = batchSnsReqImageDataArr;
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CDownloadRequest setBigfileSignature(java.lang.String str) {
            this.bigfileSignature = str;
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CDownloadRequest setBizid(int i17) {
            this.bizid = i17;
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CDownloadRequest setCertificateVerifyPolicy(int i17) {
            this.certificateVerifyPolicy = i17;
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CDownloadRequest setChatType(int i17) {
            this.chatType = i17;
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CDownloadRequest setConcurrentCount(int i17) {
            this.concurrentCount = i17;
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CDownloadRequest setCustomHeader(java.lang.String str) {
            this.customHeader = str;
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CDownloadRequest setDebugIP(java.lang.String str) {
            this.debugIP = str;
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CDownloadRequest setDownloadMode(int i17) {
            this.downloadMode = i17;
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CDownloadRequest setExpectFileMD5(java.lang.String str) {
            this.expectFileMD5 = str;
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CDownloadRequest setExpectFileSize(long j17) {
            this.expectFileSize = j17;
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CDownloadRequest setFakeBigfileSignature(java.lang.String str) {
            this.fakeBigfileSignature = str;
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CDownloadRequest setFakeBigfileSignatureAeskey(java.lang.String str) {
            this.fakeBigfileSignatureAeskey = str;
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CDownloadRequest setFeedId(java.lang.String str) {
            this.feedId = str;
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CDownloadRequest setFeedPicCount(int i17) {
            this.feedPicCount = i17;
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CDownloadRequest setFileKey(java.lang.String str) {
            this.fileKey = str;
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CDownloadRequest setFileType(int i17) {
            this.fileType = i17;
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CDownloadRequest setFileid(java.lang.String str) {
            this.fileid = str;
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CDownloadRequest setHlsVideoFlag(java.lang.String str) {
            this.hlsVideoFlag = str;
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CDownloadRequest setHost(java.lang.String str) {
            this.host = str;
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CDownloadRequest setHostIPHint(com.tencent.mars.cdn.CdnManager.HostIPHint hostIPHint) {
            this.hostIPHint = hostIPHint;
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CDownloadRequest setHttpMethod(java.lang.String str) {
            this.httpMethod = str;
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CDownloadRequest setIsAutoStart(boolean z17) {
            this.isAutoStart = z17;
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CDownloadRequest setIsColdSnsData(boolean z17) {
            this.isColdSnsData = z17;
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CDownloadRequest setIsHLSVideo(boolean z17) {
            this.isHLSVideo = z17;
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CDownloadRequest setIsHotSnsVideo(boolean z17) {
            this.isHotSnsVideo = z17;
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CDownloadRequest setIsLargeSVideo(boolean z17) {
            this.isLargeSVideo = z17;
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CDownloadRequest setIsSilentTask(boolean z17) {
            this.isSilentTask = z17;
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CDownloadRequest setIsSmallVideo(boolean z17) {
            this.isSmallVideo = z17;
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CDownloadRequest setIsStorageMode(boolean z17) {
            this.isStorageMode = z17;
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CDownloadRequest setIs_resume_task(boolean z17) {
            this.is_resume_task = z17;
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CDownloadRequest setMaxHttpRedirectCount(int i17) {
            this.maxHttpRedirectCount = i17;
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CDownloadRequest setMaxPCDNConnections(int i17) {
            this.maxPCDNConnections = i17;
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CDownloadRequest setMsgExtra(java.lang.String str) {
            this.msgExtra = str;
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CDownloadRequest setMsgType(int i17) {
            this.msgType = i17;
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CDownloadRequest setPcdnAppID(int i17) {
            this.pcdnAppID = i17;
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CDownloadRequest setPreloadMinSize(long j17) {
            this.preloadMinSize = j17;
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CDownloadRequest setPreloadRatio(int i17) {
            this.preloadRatio = i17;
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CDownloadRequest setQueueTimeoutSeconds(int i17) {
            this.queueTimeoutSeconds = i17;
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CDownloadRequest setQuicTaskParams(com.tencent.mars.cdn.CronetLogic.QuicTaskParams quicTaskParams) {
            this.quicTaskParams = quicTaskParams;
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CDownloadRequest setReferer(java.lang.String str) {
            this.referer = str;
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CDownloadRequest setRequestVideoFlag(java.lang.String str) {
            this.requestVideoFlag = str;
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CDownloadRequest setRequestVideoFormat(int i17) {
            this.requestVideoFormat = i17;
            return this;
        }

        public void setSavePath(java.lang.String str) {
            this.savePath = com.tencent.mars.cdn.CdnC2Java.exportFileToExternalPath(str);
        }

        public com.tencent.mars.cdn.CdnManager.C2CDownloadRequest setSavePath2(java.lang.String str) {
            this.savePath = com.tencent.mars.cdn.CdnC2Java.exportFileToExternalPath(str);
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CDownloadRequest setSerialized_verify_headers(java.lang.String str) {
            this.serialized_verify_headers = str;
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CDownloadRequest setSignalQuality(java.lang.String str) {
            this.signalQuality = str;
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CDownloadRequest setSnsCipherKey(java.lang.String str) {
            this.snsCipherKey = str;
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CDownloadRequest setSnsScene(java.lang.String str) {
            this.snsScene = str;
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CDownloadRequest setSnsVideoStragegy(java.lang.String str) {
            this.snsVideoStragegy = str;
            return this;
        }

        public void setStatePath(java.lang.String str) {
            this.statePath = com.tencent.mars.cdn.CdnC2Java.exportFileToExternalPath(str);
        }

        public com.tencent.mars.cdn.CdnManager.C2CDownloadRequest setStatePath2(java.lang.String str) {
            this.statePath = com.tencent.mars.cdn.CdnC2Java.exportFileToExternalPath(str);
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CDownloadRequest setTaskStartTime(long j17) {
            this.taskStartTime = j17;
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CDownloadRequest setTransforTimeoutSeconds(int i17) {
            this.transforTimeoutSeconds = i17;
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CDownloadRequest setUrl(java.lang.String str) {
            this.url = str;
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CDownloadRequest setUseNewdns(boolean z17) {
            this.useNewdns = z17;
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CDownloadRequest setVideoflagPolicy(int i17) {
            this.videoflagPolicy = i17;
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CDownloadRequest setWifiAutoStart(boolean z17) {
            this.wifiAutoStart = z17;
            return this;
        }
    }

    /* loaded from: classes12.dex */
    public static class C2CDownloadResult {
        public byte[] bizRspPayLoad;
        public byte[] cdnResultPb;
        public boolean isSnsImageProtocolAvailable;
        public java.lang.String[] usedSvrIps;
        public int errorCode = 0;
        public int fileType = 0;
        public long fileSize = 0;
        public java.lang.String argInfo = "";
        public java.lang.String fileKey = "";
        public java.lang.String fileid = "";
        public java.lang.String transforMsg = "";
        public java.lang.String traceMsg = "";
        public long recvedBytes = 0;
        public long enQueueTime = 0;
        public long startTime = 0;
        public long endTime = 0;
        public int videoFormat = 0;
        public java.lang.String videoFlag = "";
        public java.lang.String videoCdnMsg = "";
        public int lastSvrPort = 0;
        public int lastNetType = -1;
        public int firstRequestCost = 0;
        public int firstRequestSize = 0;
        public int firstRequestDownloadSize = 0;
        public boolean firstRequestCompleted = false;
        public int averageSpeed = 0;
        public int averageConnectCost = 0;
        public int firstConnectCost = 0;
        public int netConnectTimes = 0;
        public int moovRequestTimes = 0;
        public int moovCost = 0;
        public int moovSize = 0;
        public boolean moovCompleted = false;
        public int moovFailReason = 0;
        public int previousCompletedSize = 0;
        public int averageRequestSize = 0;
        public int averageRequestCost = 0;
        public int requestTotalCount = 0;
        public int requestCompletedCount = 0;
        public int requestTimeoutCount = 0;
        public int svrFallbackCount = 0;
        public int httpStatusCode = 0;
        public java.lang.String httpResponseHeader = "";
        public java.lang.String realUsedURL = "";
        public boolean isResume = false;
        public int dnsCostTime = 0;
        public int delayTime = 0;
        public int connectCostTime = 0;
        public int waitResponseCostTime = 0;
        public int receiveCostTime = 0;
        public java.lang.String serverIP = "";
        public java.lang.String xErrorNo = "";
        public int cSeqCheck = 0;
        public boolean usePrivateProtocol = false;
        public boolean crossNet = false;
        public java.lang.String clientIP = "";
        public int picIndex = -1;
        public java.lang.String picCachePath = "";
        public java.lang.String batchPicFeedId = "";
        public java.lang.String batchImageFileKey = "";
        public com.tencent.mars.cdn.CdnManager.BatchSnsReqImageData[] batchImageNeedRetry = null;
        public int detailErrorType = 0;
        public int detailErrorCode = 0;
        public long tryWritenBytes = 0;
        public long availableBytes = 0;
        public long currentFileSize = 0;
        public java.lang.String systemErrorDescribe = "";
        public int transportProtocol = 0;
        public int transportProtocolError = 0;
        public boolean fromCronet = false;
        public com.tencent.mars.cdn.CdnManager.CronetTaskResult cronetTaskResult = null;
        public long taskStartTime = 0;
        public long traceId = 0;
        public java.lang.String profile = "";
        public com.tencent.mars.cdn.CdnManager.SNSVideoProfile snsVideoProfile = null;
        public com.tencent.mars.cdn.CdnManager.VideoInfo snsVideoInfo = null;
    }

    /* loaded from: classes12.dex */
    public static class C2CUploadRequest {
        public byte[] bizReqPayLoad;
        public byte[] cdnRequestPb;
        public byte[] fileBuffer;
        public com.tencent.mars.cdn.CdnManager.FileInfo[] files;
        public java.lang.String serverGroupKey;
        public byte[] thumbnailBuffer;
        public java.lang.String fileKey = "";
        public java.lang.String toUser = "";
        public java.lang.String debugIP = "";
        public int queueTimeoutSeconds = 1800;
        public int transforTimeoutSeconds = 600;
        public java.lang.String netflowTag = "";
        public java.lang.String forwardFileid = "";
        public java.lang.String forwardAeskey = "";
        public boolean sendmsgFromCDN = false;
        public boolean checkExistOnly = false;
        public boolean isSmallVideo = false;
        public int isLargeSVideo = 0;
        public int videoSource = 0;
        public boolean isSnsAdVideo = false;
        public boolean isStorageMode = false;
        public boolean forceNoSafeCdn = false;
        public boolean trySafeCdn = true;
        public int chatType = 0;
        public java.lang.String bigfileSignature = "";
        public java.lang.String host = "";
        public int fileType = 0;
        public java.lang.String filemd5 = "";
        protected java.lang.String filePath = "";
        public java.lang.String midimgPath = "";
        protected java.lang.String thumbfilePath = "";
        public int fileFormat = 0;
        public int midFormat = 0;
        public int thumbFileType = 0;
        public boolean enableHitCheck = true;
        public java.lang.String fakeBigfileSignature = "";
        public java.lang.String fakeBigfileSignatureAeskey = "";
        public java.lang.String statePath = "";
        public int concurrentCount = 1;
        public java.lang.String uri = "";
        public int bizid = 0;
        public int apptype = 0;
        public java.lang.String emojiExtinfo = "";
        public boolean tryRealtimeTransportProtocol = false;
        public boolean bizSnsPreUpload = false;
        public int uploadFrom = 0;
        public java.lang.String customHeader = "";
        public java.lang.String clientTag = "";

        public com.tencent.mars.cdn.CdnManager.C2CUploadRequest build() {
            int i17;
            int i18 = this.bizid;
            if (i18 == 0 || i18 == 0 || (i17 = this.apptype) == -1 || i17 == 0) {
                throw new java.security.InvalidParameterException("must set marscdnBizType,apptype");
            }
            if (this.fileKey.isEmpty()) {
                throw new java.security.InvalidParameterException("must set filekey");
            }
            if (this.enableHitCheck) {
                if (this.checkExistOnly && (this.forwardFileid.isEmpty() || this.forwardAeskey.isEmpty())) {
                    throw new java.security.InvalidParameterException("checkexist must set forwardFileid,forwardAeskey");
                }
                if (!this.forwardFileid.isEmpty() && this.forwardAeskey.isEmpty()) {
                    throw new java.security.InvalidParameterException("forwardFileid not empty but forwardAeskey empty");
                }
            }
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CUploadRequest setApptype(int i17) {
            this.apptype = i17;
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CUploadRequest setBigfileSignature(java.lang.String str) {
            this.bigfileSignature = str;
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CUploadRequest setBizid(int i17) {
            this.bizid = i17;
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CUploadRequest setChatType(int i17) {
            this.chatType = i17;
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CUploadRequest setCheckExistOnly(boolean z17) {
            this.checkExistOnly = z17;
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CUploadRequest setConcurrentCount(int i17) {
            this.concurrentCount = i17;
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CUploadRequest setCustomHeader(java.lang.String str) {
            this.customHeader = str;
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CUploadRequest setDebugIP(java.lang.String str) {
            this.debugIP = str;
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CUploadRequest setEmojiExtinfo(java.lang.String str) {
            this.emojiExtinfo = str;
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CUploadRequest setEnableHitCheck(boolean z17) {
            this.enableHitCheck = z17;
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CUploadRequest setFakeBigfileSignature(java.lang.String str) {
            this.fakeBigfileSignature = str;
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CUploadRequest setFakeBigfileSignatureAeskey(java.lang.String str) {
            this.fakeBigfileSignatureAeskey = str;
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CUploadRequest setFileBuffer(byte[] bArr) {
            this.fileBuffer = bArr;
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CUploadRequest setFileKey(java.lang.String str) {
            this.fileKey = str;
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CUploadRequest setFilePath(java.lang.String str) {
            java.lang.String exportFileToExternalPath = com.tencent.mars.cdn.CdnC2Java.exportFileToExternalPath(str);
            this.filePath = exportFileToExternalPath;
            if (exportFileToExternalPath == null || exportFileToExternalPath.length() <= 0) {
                this.filePath = "";
            }
            return this;
        }

        public void setFilePath2(java.lang.String str) {
            setFilePath(str);
        }

        public com.tencent.mars.cdn.CdnManager.C2CUploadRequest setFileType(int i17) {
            this.fileType = i17;
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CUploadRequest setFilemd5(java.lang.String str) {
            this.filemd5 = str;
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CUploadRequest setForceNoSafeCdn(boolean z17) {
            this.forceNoSafeCdn = z17;
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CUploadRequest setForwardAeskey(java.lang.String str) {
            this.forwardAeskey = str;
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CUploadRequest setForwardFileid(java.lang.String str) {
            this.forwardFileid = str;
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CUploadRequest setHost(java.lang.String str) {
            this.host = str;
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CUploadRequest setIsLargeSVideo(int i17) {
            this.isLargeSVideo = i17;
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CUploadRequest setIsSmallVideo(boolean z17) {
            this.isSmallVideo = z17;
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CUploadRequest setIsSnsAdVideo(boolean z17) {
            this.isSnsAdVideo = z17;
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CUploadRequest setIsStorageMode(boolean z17) {
            this.isStorageMode = z17;
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CUploadRequest setMidimgPath(java.lang.String str) {
            java.lang.String exportFileToExternalPath = com.tencent.mars.cdn.CdnC2Java.exportFileToExternalPath(str);
            this.midimgPath = exportFileToExternalPath;
            if (exportFileToExternalPath == null || exportFileToExternalPath.length() <= 0) {
                this.midimgPath = "";
            }
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CUploadRequest setQueueTimeoutSeconds(int i17) {
            this.queueTimeoutSeconds = i17;
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CUploadRequest setSendmsgFromCDN(boolean z17) {
            this.sendmsgFromCDN = z17;
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CUploadRequest setStatePath(java.lang.String str) {
            this.statePath = str;
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CUploadRequest setThumbfilePath(java.lang.String str) {
            java.lang.String exportFileToExternalPath = com.tencent.mars.cdn.CdnC2Java.exportFileToExternalPath(str);
            this.thumbfilePath = exportFileToExternalPath;
            if (exportFileToExternalPath == null || exportFileToExternalPath.length() <= 0) {
                this.thumbfilePath = "";
            }
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CUploadRequest setThumbnailBuffer(byte[] bArr) {
            this.thumbnailBuffer = bArr;
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CUploadRequest setToUser(java.lang.String str) {
            this.toUser = str;
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CUploadRequest setTransforTimeoutSeconds(int i17) {
            this.transforTimeoutSeconds = i17;
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CUploadRequest setTrySafeCdn(boolean z17) {
            this.trySafeCdn = z17;
            return this;
        }

        public com.tencent.mars.cdn.CdnManager.C2CUploadRequest setVideoSource(int i17) {
            this.videoSource = i17;
            return this;
        }
    }

    /* loaded from: classes12.dex */
    public static class C2CUploadResult {
        public byte[] bizRspPayLoad;
        public byte[] cdnResultPb;
        public java.lang.String[] usedSvrIps;
        public int errorCode = 0;
        public int filetype = 0;
        public java.lang.String touser = "";
        public java.lang.String fileid = "";
        public java.lang.String aeskey = "";
        public java.lang.String filemd5 = "";
        public java.lang.String thumbfilemd5 = "";
        public java.lang.String mp4identifymd5 = "";
        public java.lang.String transforMsg = "";
        public long fileSize = 0;
        public int midfileSize = 0;
        public int thumbfileSize = 0;
        public int hitCache = 0;
        public boolean isVideoReduced = false;
        public boolean sendmsgFromCDN = false;
        public boolean existOnSvr = false;
        public byte[] skeyrespbuf = null;
        public java.lang.String videofileid = "";
        public java.lang.String fileUrl = "";
        public java.lang.String thumbfileUrl = "";
        public java.lang.String emojiMD5 = "";
        public int fileCrc32 = 0;
        public boolean uploadBySafecdn = false;
        public boolean isResume = false;
        public int delayTime = 0;
        public int connectCostTime = 0;
        public int waitResponseCostTime = 0;
        public int receiveCostTime = 0;
        public java.lang.String serverIP = "";
        public boolean crossNet = false;
        public java.lang.String clientIP = "";
        public int detailErrorType = 0;
        public int detailErrorCode = 0;
        public java.lang.String systemErrorDescribe = "";
        public int transportProtocol = 0;
        public int transportProtocolError = 0;
    }

    /* loaded from: classes12.dex */
    public static class CdnInfo {
        public int ver = 0;
        public int uin = 0;
        public int nettype = 0;
        public int frontid = 0;
        public int zoneid = 0;
        public byte[] authkey = null;
        public java.lang.String frontip1 = null;
        public java.lang.String frontip2 = null;
        public java.lang.String zoneip1 = null;
        public java.lang.String zoneip2 = null;
        public int[] frontports = null;
        public int[] zoneports = null;
    }

    /* loaded from: classes8.dex */
    public static class CdnInfoParams {
        public int c2CshowErrorDelayMs = 0;
        public int snsshowErrorDelayMs = 0;
        public int c2CretryIntervalMs = 0;
        public int snsretryIntervalMs = 0;
        public int c2CrwtimeoutMs = 0;
        public int snsrwtimeoutMs = 0;
    }

    /* loaded from: classes8.dex */
    public static class CdnTaskStateInfo {
        public static final int kCompleted = 104;
        public static final int kNotExits = 103;
        public static final int kPausing = 102;
        public static final int kRunning = 100;
        public static final int kWaiting = 101;
        public int taskState = -100;
        public long completeSize = 0;
        public long fileTotalSize = 0;
    }

    /* loaded from: classes4.dex */
    public static class CertificateVerifyPolicy {
        public static final int kIngoreError = 2;
        public static final int kNoVerify = 0;
        public static final int kStrictVerify = 1;
    }

    /* loaded from: classes12.dex */
    public static class Config {
        public int EnableSafeCDN = 0;
        public int EnableSnsStreamDownload = 0;
        public int EnableSnsImageDownload = 0;
        public java.lang.String ApprovedVideoHosts = com.tencent.mars.cdn.CdnManager.defaultApprovedVideoHosts;
        public java.lang.String QuicExptValues = "";
        public java.lang.String MiscellaneousExptValues = "";

        public java.lang.String toString() {
            return java.lang.String.format("safecdn:%d,snsstream:%d,snsimage:%d", java.lang.Integer.valueOf(this.EnableSafeCDN), java.lang.Integer.valueOf(this.EnableSnsStreamDownload), java.lang.Integer.valueOf(this.EnableSnsImageDownload));
        }
    }

    /* loaded from: classes12.dex */
    public static class CronetTaskResult {
        public boolean useQuic = false;
        public boolean useHttp2 = false;
        public java.lang.String statusText = "";
        public int statusCode = 0;
        public com.tencent.mars.cdn.CdnManager.WebPageProfile performance = null;
    }

    /* loaded from: classes4.dex */
    public static class DownloadBehavior {
        public static final int kUserRequest = 0;
        public static final int kViaClientAutoStart = 4;
        public static final int kViaClientSync = 3;
        public static final int kViaServerNoQuota = 1;
        public static final int kViaServerQuota = 2;
    }

    /* loaded from: classes4.dex */
    public interface DownloadCallback {
        void onC2CDownloadCompleted(java.lang.String str, com.tencent.mars.cdn.CdnManager.C2CDownloadResult c2CDownloadResult);

        default void onDownloadCanceled(java.lang.String str) {
            com.tencent.mars.xlog.Log.i(com.tencent.mars.cdn.CdnManager.TAG, "onDownloadCanceled:" + str);
        }

        default void onDownloadNotifyPeerUploadFinish(java.lang.String str, boolean z17, long j17) {
        }

        void onDownloadProgressChanged(java.lang.String str, long j17, long j18, boolean z17);
    }

    /* loaded from: classes8.dex */
    public interface DownloadCallbackV2 {
        void onCanceled(java.lang.String str);

        void onCompleted(java.lang.String str, byte[] bArr);

        void onProgressChanged(java.lang.String str, long j17, long j18);
    }

    /* loaded from: classes10.dex */
    public static class DownloadInfo {
        public long recvedBytes = 0;
        public long transforMS = 0;
        public long beginTickcount = 0;
        public long endTickcount = 0;
    }

    /* loaded from: classes6.dex */
    public static class DownloadTaskProfile {
        public com.tencent.mars.cdn.CdnManager.Transfor cdn;
        public com.tencent.mars.cdn.CdnManager.Transfor overall;
        public com.tencent.mars.cdn.CdnManager.Transfor pcdn;
        public com.tencent.mars.cdn.CdnManager.Transfor redirect;
    }

    /* loaded from: classes12.dex */
    public static class FileInfo {
        public java.lang.String buffer;

        /* renamed from: md5, reason: collision with root package name */
        public java.lang.String f52521md5;
        public java.lang.String mp4md5;
        public java.lang.String path;
        public int type = 0;
        public int format = 0;
        public int compress = 0;
        public long size = 0;
    }

    /* loaded from: classes4.dex */
    public static class GetCdnScene {
        public static final int GET_CDN_AUTH = 1;
        public static final int GET_CDN_CHECK = 4;
        public static final int GET_CDN_DEFAULT = 0;
        public static final int GET_CDN_IGNORE_FETCH_RETRY = 6;
        public static final int GET_CDN_MARS_CACHE_EXPIRED = 9;
        public static final int GET_CDN_MARS_SVR_REQUEST = 8;
        public static final int GET_CDN_MARS_TIMING_FETCH = 7;
        public static final int GET_CDN_NETWORK_CHANGE = 2;
        public static final int GET_CDN_NETWORK_CHANGE_RETRY = 3;
        public static final int GET_CDN_TEST = 5;
        public static final int GET_CDN_USER_ATTRIBUTE_CHANGED = 10;
    }

    /* loaded from: classes4.dex */
    public static class HostIPHint {
        public com.tencent.mars.cdn.CdnManager.HostIpMap[] hostMap;
    }

    /* loaded from: classes6.dex */
    public static class HostIpMap {
        public java.lang.String host;

        /* renamed from: ip, reason: collision with root package name */
        public java.lang.String f52522ip;
        public int port;
    }

    /* loaded from: classes4.dex */
    public static class MoovFailReason {
        public static final int kIllegalBoxSize = 4;
        public static final int kNotMP4Video = 2;
        public static final int kReadFileFailed = 1;
        public static final int kTooManyBox = 5;
        public static final int kZeroBoxSize = 3;
    }

    /* loaded from: classes4.dex */
    public static class PCDNAppID {
        public static final int kFinderVideo = 30001;
        public static final int kGame = 30003;
        public static final int kPatch = 30002;
        public static final int kStoriesVideo = 30004;
    }

    /* loaded from: classes12.dex */
    public static class SNSVideoProfile {
        public java.lang.String strategy;
        public int mode = 0;
        public boolean useColdRule = false;
        public int usedProvince = 0;
        public int experimentalGroupID = 0;
    }

    /* loaded from: classes6.dex */
    public interface SessionCallback {
        byte[] decodeSessionResponseBuf(java.lang.String str, byte[] bArr);

        byte[] getSessionRequestBuf(java.lang.String str, byte[] bArr);
    }

    /* loaded from: classes4.dex */
    public static class SnsUploadVersion {
        public static final int kVersion100M = 1;
        public static final int kVersion30M = 0;
    }

    /* loaded from: classes4.dex */
    public static class SpeedType {
        public static final int stDownload = 2;
        public static final int stUpload = 1;
    }

    /* loaded from: classes6.dex */
    public static class Transfor {
        public int connCostMs = 0;
        public int transCostMs = 0;
        public long recvedBytes = 0;
        public int speedKps = 0;
        public int errType = 0;
        public int errCode = 0;
    }

    /* loaded from: classes6.dex */
    public static class TransportProtocol {
        public static final int HTTP = 1;
        public static final int HTTP3 = 4;
        public static final int HTTPS = 2;
        public static final int QUIC = 3;
        public static final int TCP = 0;
    }

    /* loaded from: classes8.dex */
    public interface UploadCallback {
        void onC2CUploadCompleted(java.lang.String str, com.tencent.mars.cdn.CdnManager.C2CUploadResult c2CUploadResult);

        default void onUploadCanceled(java.lang.String str) {
            com.tencent.mars.xlog.Log.i(com.tencent.mars.cdn.CdnManager.TAG, "onUploadCanceled:" + str);
        }

        void onUploadProgressChanged(java.lang.String str, long j17, long j18);
    }

    /* loaded from: classes8.dex */
    public interface UploadCallbackV2 {
        void onCanceled(java.lang.String str);

        void onCompleted(java.lang.String str, byte[] bArr);

        void onProgressChanged(java.lang.String str, long j17, long j18);
    }

    /* loaded from: classes4.dex */
    public static class VideoFlagPolicy {
        public static final int kVideoFlagAuto = 0;
        public static final int kVideoFlagMustMatch = 1;
    }

    /* loaded from: classes12.dex */
    public interface VideoStreamingCallback {
        void onDataAvailable(java.lang.String str, long j17, long j18);

        void onDownloadToEnd(java.lang.String str, long j17, long j18);

        void onM3U8Ready(java.lang.String str, java.lang.String str2);

        void onMoovReady(java.lang.String str, long j17, long j18, com.tencent.mars.cdn.CdnManager.VideoInfo videoInfo);

        void onMoovReadyWithFlag(java.lang.String str, long j17, long j18, java.lang.String str2);

        void onObtainMoovFailed(java.lang.String str, int i17);

        void onPreloadCompletedWithResult(java.lang.String str, long j17, long j18, com.tencent.mars.cdn.CdnManager.C2CDownloadResult c2CDownloadResult);
    }

    public CdnManager(long j17) {
        OnJniCreateCdnManagerFromHandle(j17);
    }

    public static com.tencent.mars.cdn.CdnManager.C2CDownloadRequest createC2CBigfileDownload(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        return new com.tencent.mars.cdn.CdnManager.C2CDownloadRequest().setFileKey(str).setFileid(str4).setAeskey(str5).setBizid(1).setApptype(1).setFileType(7).setFakeBigfileSignature(str2).setFakeBigfileSignatureAeskey(str3).setSavePath2(str6).build();
    }

    public static com.tencent.mars.cdn.CdnManager.C2CUploadRequest createC2CBigfileUpload(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        return new com.tencent.mars.cdn.CdnManager.C2CUploadRequest().setFileKey(str).setBizid(1).setApptype(1).setFileType(7).setFakeBigfileSignature(str2).setFakeBigfileSignatureAeskey(str3).setTrySafeCdn(true).setFilePath(str4).build();
    }

    public static com.tencent.mars.cdn.CdnManager.C2CDownloadRequest createC2CDownload(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4) {
        return new com.tencent.mars.cdn.CdnManager.C2CDownloadRequest().setFileKey(str).setFileid(str2).setAeskey(str3).setBizid(1).setApptype(1).setFileType(i17).setSavePath2(str4).build();
    }

    public static com.tencent.mars.cdn.CdnManager.C2CUploadRequest createC2CExistCheck(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3) {
        return new com.tencent.mars.cdn.CdnManager.C2CUploadRequest().setFileKey(str).setBizid(1).setApptype(1).setFileType(i17).setForwardFileid(str2).setForwardAeskey(str3).setEnableHitCheck(true).setCheckExistOnly(true).build();
    }

    public static com.tencent.mars.cdn.CdnManager.C2CUploadRequest createC2CSSUpload(com.tencent.mars.cdn.CdnManager.C2CUploadRequest c2CUploadRequest) {
        return c2CUploadRequest.setSendmsgFromCDN(true).build();
    }

    public static com.tencent.mars.cdn.CdnManager.C2CUploadRequest createC2CUpload(java.lang.String str, int i17, java.lang.String str2) {
        return new com.tencent.mars.cdn.CdnManager.C2CUploadRequest().setFileKey(str).setBizid(1).setApptype(1).setFileType(i17).setFilePath(str2).build();
    }

    public static com.tencent.mars.cdn.CdnManager.C2CDownloadRequest createC2CVideoDownload(com.tencent.mars.cdn.CdnManager.C2CDownloadRequest c2CDownloadRequest, int i17, int i18) {
        return c2CDownloadRequest.setRequestVideoFormat(i17).setVideoflagPolicy(i18).build();
    }

    public static com.tencent.mars.cdn.CdnManager.C2CUploadRequest createCircleSearchUpload(java.lang.String str, java.lang.String str2) {
        return new com.tencent.mars.cdn.CdnManager.C2CUploadRequest().setFileKey(str).setBizid(5).setApptype(12).setFileType(2).setFilePath(str2).build();
    }

    public static com.tencent.mars.cdn.CdnManager.C2CDownloadRequest createFavDownload(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4) {
        return new com.tencent.mars.cdn.CdnManager.C2CDownloadRequest().setFileKey(str).setFileid(str2).setAeskey(str3).setBizid(2).setApptype(10).setFileType(i17).setIsStorageMode(true).setSavePath2(str4).build();
    }

    public static com.tencent.mars.cdn.CdnManager.C2CUploadRequest createFavUpload(java.lang.String str, int i17, java.lang.String str2) {
        return new com.tencent.mars.cdn.CdnManager.C2CUploadRequest().setFileKey(str).setBizid(2).setApptype(10).setIsStorageMode(true).setFileType(i17).setFilePath(str2).setEnableHitCheck(false).build();
    }

    public static com.tencent.mars.cdn.CdnManager.C2CUploadRequest createFinderImageUpload(java.lang.String str, java.lang.String str2) {
        return new com.tencent.mars.cdn.CdnManager.C2CUploadRequest().setFileKey(str).setBizid(3).setApptype(251).setFileType(20304).setFilePath(str2).build();
    }

    public static com.tencent.mars.cdn.CdnManager.C2CUploadRequest createFinderVideoUpload(java.lang.String str, java.lang.String str2) {
        return new com.tencent.mars.cdn.CdnManager.C2CUploadRequest().setFileKey(str).setBizid(3).setApptype(251).setFileType(20302).setFilePath(str2).build();
    }

    public static com.tencent.mars.cdn.CdnManager.C2CUploadRequest createFreshC2CUpload(com.tencent.mars.cdn.CdnManager.C2CUploadRequest c2CUploadRequest) {
        return c2CUploadRequest.setEnableHitCheck(false).build();
    }

    public static com.tencent.mars.cdn.CdnManager.C2CUploadRequest createFriendsImageUpload(java.lang.String str, java.lang.String str2) {
        return new com.tencent.mars.cdn.CdnManager.C2CUploadRequest().setFileKey(str).setBizid(3).setApptype(100).setFileType(20201).setFilePath(str2).build();
    }

    public static com.tencent.mars.cdn.CdnManager.C2CUploadRequest createFriendsVideoUpload(java.lang.String str, java.lang.String str2) {
        return new com.tencent.mars.cdn.CdnManager.C2CUploadRequest().setFileKey(str).setBizid(3).setApptype(100).setFileType(20202).setFilePath(str2).build();
    }

    public static com.tencent.mars.cdn.CdnManager.C2CDownloadRequest createGroupNoticeDownload(java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        com.tencent.mars.cdn.CdnManager.C2CDownloadRequest aeskey = createSNSDownload(str, str2, i17, i18, str3).setAeskey(str4);
        if (str5 != null) {
            aeskey.setSnsCipherKey(str5);
        }
        return aeskey;
    }

    public static com.tencent.mars.cdn.CdnManager.C2CUploadRequest createGroupNoticeUpload(java.lang.String str, int i17, int i18, java.lang.String str2, java.lang.String str3) {
        return createSNSUpload(str, i17, i18, str2).setForwardAeskey(str3);
    }

    public static com.tencent.mars.cdn.CdnManager.C2CDownloadRequest createHLSVideoDownload(com.tencent.mars.cdn.CdnManager.C2CDownloadRequest c2CDownloadRequest, java.lang.String str, int i17) {
        return c2CDownloadRequest.setIsHLSVideo(true).setHlsVideoFlag(str).setVideoflagPolicy(i17).build();
    }

    public static com.tencent.mars.cdn.CdnManager.C2CDownloadRequest createSNSDownload(java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.String str3) {
        return new com.tencent.mars.cdn.CdnManager.C2CDownloadRequest().setFileKey(str).setUrl(str2).setBizid(3).setApptype(i17).setFileType(i18).setSavePath2(str3).build();
    }

    public static com.tencent.mars.cdn.CdnManager.C2CUploadRequest createSNSUpload(java.lang.String str, int i17, int i18, java.lang.String str2) {
        return new com.tencent.mars.cdn.CdnManager.C2CUploadRequest().setFileKey(str).setBizid(3).setApptype(i17).setFileType(i18).setFilePath(str2).build();
    }

    public static com.tencent.mars.cdn.CdnManager.C2CDownloadRequest createSNSVideoDownload(com.tencent.mars.cdn.CdnManager.C2CDownloadRequest c2CDownloadRequest, java.lang.String str, int i17) {
        return c2CDownloadRequest.setRequestVideoFlag(str).setVideoflagPolicy(i17).build();
    }

    public static com.tencent.mars.cdn.CdnManager.C2CDownloadRequest makeVideoPreload(com.tencent.mars.cdn.CdnManager.C2CDownloadRequest c2CDownloadRequest, int i17, long j17) {
        return c2CDownloadRequest.setPreloadRatio(i17).setPreloadMinSize(j17).setDownloadMode(2).build();
    }

    public static com.tencent.mars.cdn.CdnManager.C2CDownloadRequest makeVideoStreaming(com.tencent.mars.cdn.CdnManager.C2CDownloadRequest c2CDownloadRequest) {
        return c2CDownloadRequest.setDownloadMode(1).build();
    }

    public static com.tencent.mars.cdn.CdnManager.C2CDownloadRequest withAesEcbDecrypt(com.tencent.mars.cdn.CdnManager.C2CDownloadRequest c2CDownloadRequest, java.lang.String str) {
        return c2CDownloadRequest.setAeskey(str).build();
    }

    public static com.tencent.mars.cdn.CdnManager.C2CUploadRequest withAeskey(com.tencent.mars.cdn.CdnManager.C2CUploadRequest c2CUploadRequest, java.lang.String str) {
        return c2CUploadRequest.setForwardAeskey(str).build();
    }

    public static com.tencent.mars.cdn.CdnManager.C2CUploadRequest withDebugIP(com.tencent.mars.cdn.CdnManager.C2CUploadRequest c2CUploadRequest, java.lang.String str) {
        return c2CUploadRequest.setDebugIP(str).build();
    }

    public static com.tencent.mars.cdn.CdnManager.C2CUploadRequest withTimeout(com.tencent.mars.cdn.CdnManager.C2CUploadRequest c2CUploadRequest, int i17) {
        return c2CUploadRequest.setTransforTimeoutSeconds(i17).build();
    }

    public static com.tencent.mars.cdn.CdnManager.C2CDownloadRequest withXorDecrypt(com.tencent.mars.cdn.CdnManager.C2CDownloadRequest c2CDownloadRequest, java.lang.String str) {
        return c2CDownloadRequest.setSnsCipherKey(str).build();
    }

    public native boolean OnJniAllowBatchImageDownload();

    public native int OnJniCalcFileCrc32(java.lang.String str);

    public native java.lang.String OnJniCalcFileMD5(java.lang.String str);

    public native java.lang.String OnJniCalcMP4IdentifyMD5(java.lang.String str);

    public native int OnJniCancelDownloadTaskWithResult(java.lang.String str, com.tencent.mars.cdn.CdnManager.C2CDownloadResult c2CDownloadResult);

    public native void OnJniCancelTask(java.lang.String str);

    public native int OnJniCancelUploadTaskWithResult(java.lang.String str, com.tencent.mars.cdn.CdnManager.C2CUploadResult c2CUploadResult);

    public native java.lang.String OnJniCreateAeskey();

    public native void OnJniCreateCdnManagerFromContext(java.lang.Object obj);

    public native void OnJniCreateCdnManagerFromHandle(long j17);

    public native java.lang.String OnJniCreateUniqueFilekey(java.lang.String str, java.lang.String str2);

    public native void OnJniDestroyCdnManager();

    public native int OnJniGetRecentAverageSpeed(int i17);

    public native int OnJniGetRecentAverageSpeed2(int i17, int i18);

    public native com.tencent.mars.mm.ConnectRecord[] OnJniGetRecentConnectRecords(int i17, int i18);

    public native com.tencent.mars.cdn.CdnManager.DownloadInfo OnJniGetRecentDownloadInfo(int i17, int i18, int i19);

    public native boolean OnJniGetSnsImagePrivateProtocolAvalible();

    public native int OnJniGetTaskRecentAverageSpeed(java.lang.String str, int i17, int i18);

    public native com.tencent.mars.cdn.CdnManager.CdnTaskStateInfo OnJniHttpMultiSocketDownloadTaskState(java.lang.String str);

    public native boolean OnJniIsVideoDataAvailable(java.lang.String str, long j17, long j18);

    public native void OnJniMarkVideoBufferingStatus(java.lang.String str, int i17);

    public native void OnJniOnCreate(java.lang.String str, java.lang.String str2, boolean z17);

    public native int OnJniPauseHttpMultiSocketDownloadTask(java.lang.String str);

    public native long[] OnJniQueryAvailableQuota();

    public native byte[] OnJniQueryCdnFlowInfo();

    public native byte[] OnJniQueryCdnTaskStateInfo(java.lang.String str);

    public native int OnJniQueryContinuousSize(java.lang.String str, long j17, long[] jArr);

    public native int OnJniQueryDownloadedSize(java.lang.String str, long[] jArr);

    public native long OnJniQueryFilesizeLimit(int i17, int i18);

    public native java.lang.String OnJniQueryM3U8Data(java.lang.String str);

    public native boolean OnJniQueryVideoMoovInfo(com.tencent.mars.cdn.CdnManager.C2CDownloadRequest c2CDownloadRequest, long[] jArr);

    public native int OnJniRequestVideoData(java.lang.String str, long j17, long j18, int i17);

    public native int OnJniResumeHttpMultiSocketDownloadTask(java.lang.String str);

    public native void OnJniSetAppCallback(java.lang.Object obj);

    public native void OnJniSetCdnInfo(byte[] bArr, byte[] bArr2);

    public native void OnJniSetCdnInfoParams(com.tencent.mars.cdn.CdnManager.CdnInfoParams cdnInfoParams, com.tencent.mars.cdn.CdnManager.CdnInfoParams cdnInfoParams2, int i17);

    public native void OnJniSetConfig(com.tencent.mars.cdn.CdnManager.Config config);

    public native void OnJniSetDebugIP(java.lang.String str);

    public native void OnJniSetDownloadQuota(long j17, long j18);

    public native void OnJniSetFlowLimitPerHour(int i17);

    public native void OnJniSetFlowReportParams(java.lang.String str, long j17, int i17);

    public native void OnJniSetLegacyCdnInfo(com.tencent.mars.cdn.CdnManager.CdnInfo cdnInfo, com.tencent.mars.cdn.CdnManager.CdnInfo cdnInfo2, com.tencent.mars.cdn.CdnManager.CdnInfo cdnInfo3, com.tencent.mars.cdn.CdnManager.CdnInfo cdnInfo4, byte[] bArr, byte[] bArr2, java.lang.String str);

    public native void OnJniSetRSAPublicKeyParams(java.lang.String str, java.lang.String str2, java.lang.String str3);

    public native void OnJniSetSnsDistanceData(int i17, int i18, int i19, byte[] bArr);

    public native void OnJniSetSnsImagePrivateProtocolAvalible(boolean z17);

    public native void OnJniSetSnsImageStreamProtocolAvalible(boolean z17);

    public native void OnJniSetToUserCiper(java.lang.String str);

    public native void OnJniSetUseIPv6Cdn(boolean z17);

    public native int OnJniStartC2CDownload(com.tencent.mars.cdn.CdnManager.C2CDownloadRequest c2CDownloadRequest, com.tencent.mars.cdn.CdnManager.DownloadCallback downloadCallback);

    public native int OnJniStartC2CUpload(com.tencent.mars.cdn.CdnManager.C2CUploadRequest c2CUploadRequest, com.tencent.mars.cdn.CdnManager.UploadCallback uploadCallback);

    public native int OnJniStartCronetFileDownload(com.tencent.mars.cdn.CdnManager.C2CDownloadRequest c2CDownloadRequest, com.tencent.mars.cdn.CdnManager.DownloadCallback downloadCallback);

    public native int OnJniStartCronetSimpleRequest(com.tencent.mars.cdn.CdnManager.C2CDownloadRequest c2CDownloadRequest, com.tencent.mars.cdn.CdnManager.DownloadCallback downloadCallback);

    public native int OnJniStartDownload(byte[] bArr, com.tencent.mars.cdn.CdnManager.DownloadCallbackV2 downloadCallbackV2);

    public native int OnJniStartFtnUpload(com.tencent.mars.cdn.CdnManager.C2CUploadRequest c2CUploadRequest, com.tencent.mars.cdn.CdnManager.UploadCallback uploadCallback);

    public native int OnJniStartHttpMultiSocketDownloadTask(com.tencent.mars.cdn.CdnManager.C2CDownloadRequest c2CDownloadRequest, com.tencent.mars.cdn.CdnManager.DownloadCallback downloadCallback);

    public native int OnJniStartHttpVideoStreamingDownload(com.tencent.mars.cdn.CdnManager.C2CDownloadRequest c2CDownloadRequest, com.tencent.mars.cdn.CdnManager.VideoStreamingCallback videoStreamingCallback, com.tencent.mars.cdn.CdnManager.DownloadCallback downloadCallback, int i17);

    public native int OnJniStartHttpsDownload(com.tencent.mars.cdn.CdnManager.C2CDownloadRequest c2CDownloadRequest, com.tencent.mars.cdn.CdnManager.DownloadCallback downloadCallback);

    public native int OnJniStartSNSDownload(com.tencent.mars.cdn.CdnManager.C2CDownloadRequest c2CDownloadRequest, com.tencent.mars.cdn.CdnManager.VideoStreamingCallback videoStreamingCallback, com.tencent.mars.cdn.CdnManager.DownloadCallback downloadCallback, int i17);

    public native int OnJniStartSSUpload(com.tencent.mars.cdn.CdnManager.C2CUploadRequest c2CUploadRequest, com.tencent.mars.cdn.CdnManager.SessionCallback sessionCallback, com.tencent.mars.cdn.CdnManager.UploadCallback uploadCallback);

    public native int OnJniStartURIChannelRequest(com.tencent.mars.cdn.CdnManager.C2CUploadRequest c2CUploadRequest, com.tencent.mars.cdn.CdnManager.UploadCallback uploadCallback);

    public native int OnJniStartURLDownload(com.tencent.mars.cdn.CdnManager.C2CDownloadRequest c2CDownloadRequest, com.tencent.mars.cdn.CdnManager.DownloadCallback downloadCallback);

    public native int OnJniStartUpload(byte[] bArr, com.tencent.mars.cdn.CdnManager.UploadCallbackV2 uploadCallbackV2);

    public native int OnJniStartUploadWithSession(byte[] bArr, com.tencent.mars.cdn.CdnManager.UploadCallbackV2 uploadCallbackV2, com.tencent.mars.cdn.CdnManager.SessionCallback sessionCallback);

    public native int OnJniStartVideoStreamingDownload(com.tencent.mars.cdn.CdnManager.C2CDownloadRequest c2CDownloadRequest, com.tencent.mars.cdn.CdnManager.VideoStreamingCallback videoStreamingCallback, com.tencent.mars.cdn.CdnManager.DownloadCallback downloadCallback, int i17);

    public native boolean OnJniTaskExist(java.lang.String str);

    public native void OnJniTriggerPreConnect(java.lang.String str, java.lang.String[] strArr, boolean z17);

    public native void OnJniUpdateVideoPlaybackTimetick(java.lang.String str, double d17);

    public boolean allowBatchImageDownload() {
        return OnJniAllowBatchImageDownload();
    }

    public int calcFileCrc32(java.lang.String str) {
        return OnJniCalcFileCrc32(str);
    }

    public java.lang.String calcFileMD5(java.lang.String str) {
        return OnJniCalcFileMD5(str);
    }

    public java.lang.String calcMP4IdentifyMD5(java.lang.String str) {
        return OnJniCalcMP4IdentifyMD5(str);
    }

    public int cancelDownloadTaskWithResult(java.lang.String str, com.tencent.mars.cdn.CdnManager.C2CDownloadResult c2CDownloadResult) {
        return OnJniCancelDownloadTaskWithResult(str, c2CDownloadResult);
    }

    public void cancelTask(java.lang.String str) {
        OnJniCancelTask(str);
    }

    public int cancelUploadTaskWithResult(java.lang.String str, com.tencent.mars.cdn.CdnManager.C2CUploadResult c2CUploadResult) {
        return OnJniCancelUploadTaskWithResult(str, c2CUploadResult);
    }

    public java.lang.String createAeskey() {
        return OnJniCreateAeskey();
    }

    public java.lang.String createUniqueFilekey(java.lang.String str, java.lang.String str2) {
        return OnJniCreateUniqueFilekey(str, str2);
    }

    @Override // com.tencent.mars.app.BaseManager
    public long getNativeHandle() {
        return this.nativeHandle;
    }

    public int getRecentAverageSpeed(int i17) {
        return OnJniGetRecentAverageSpeed(i17);
    }

    public int getRecentAverageSpeed2(int i17, int i18) {
        return OnJniGetRecentAverageSpeed2(i17, i18);
    }

    public com.tencent.mars.mm.ConnectRecord[] getRecentConnectRecords(int i17, int i18) {
        return OnJniGetRecentConnectRecords(i17, i18);
    }

    public com.tencent.mars.cdn.CdnManager.DownloadInfo getRecentDownloadInfo(int i17, int i18, int i19) {
        return OnJniGetRecentDownloadInfo(i17, i18, i19);
    }

    public boolean getSnsImagePrivateProtocolAvalible() {
        return OnJniGetSnsImagePrivateProtocolAvalible();
    }

    public int getTaskRecentAverageSpeed(java.lang.String str, int i17, int i18) {
        return OnJniGetTaskRecentAverageSpeed(str, i17, i18);
    }

    public com.tencent.mars.cdn.CdnManager.CdnTaskStateInfo httpMultiSocketDownloadTaskState(java.lang.String str) {
        return OnJniHttpMultiSocketDownloadTaskState(str);
    }

    public boolean isVideoDataAvailable(java.lang.String str, long j17, long j18) {
        return OnJniIsVideoDataAvailable(str, j17, j18);
    }

    public void markVideoBufferingStatus(java.lang.String str, int i17) {
        OnJniMarkVideoBufferingStatus(str, i17);
    }

    public void onCreate(java.lang.String str, java.lang.String str2, java.lang.Boolean bool) {
        OnJniOnCreate(str, str2, bool.booleanValue());
    }

    public void onDestroy() {
        OnJniDestroyCdnManager();
    }

    public int pauseHttpMultiSocketDownloadTask(java.lang.String str) {
        return OnJniPauseHttpMultiSocketDownloadTask(str);
    }

    public long[] queryAvailableQuota() {
        return OnJniQueryAvailableQuota();
    }

    public byte[] queryCdnFlowInfo() {
        return OnJniQueryCdnFlowInfo();
    }

    public byte[] queryCdnTaskStateInfo(java.lang.String str) {
        return OnJniQueryCdnTaskStateInfo(str);
    }

    public int queryContinuousSize(java.lang.String str, long j17, long[] jArr) {
        return OnJniQueryContinuousSize(str, j17, jArr);
    }

    public int queryDownloadedSize(java.lang.String str, long[] jArr) {
        return OnJniQueryDownloadedSize(str, jArr);
    }

    public long queryFilesizeLimit(int i17, int i18) {
        return OnJniQueryFilesizeLimit(i17, i18);
    }

    public java.lang.String queryM3U8Data(java.lang.String str) {
        return OnJniQueryM3U8Data(str);
    }

    public boolean queryVideoMoovInfo(com.tencent.mars.cdn.CdnManager.C2CDownloadRequest c2CDownloadRequest, long[] jArr) {
        return OnJniQueryVideoMoovInfo(c2CDownloadRequest, jArr);
    }

    public int requestVideoData(java.lang.String str, long j17, long j18, int i17) {
        return OnJniRequestVideoData(str, j17, j18, i17);
    }

    public int resumeHttpMultiSocketDownloadTask(java.lang.String str) {
        return OnJniResumeHttpMultiSocketDownloadTask(str);
    }

    public void setAppCallback(com.tencent.mars.cdn.CdnManager.AppCallback appCallback) {
        OnJniSetAppCallback(appCallback);
    }

    public void setCdnInfo(byte[] bArr, byte[] bArr2) {
        OnJniSetCdnInfo(bArr, bArr2);
    }

    public void setCdnInfoParams(com.tencent.mars.cdn.CdnManager.CdnInfoParams cdnInfoParams, com.tencent.mars.cdn.CdnManager.CdnInfoParams cdnInfoParams2, int i17) {
        OnJniSetCdnInfoParams(cdnInfoParams, cdnInfoParams2, i17);
    }

    public void setConfig(com.tencent.mars.cdn.CdnManager.Config config) {
        OnJniSetConfig(config);
    }

    public void setDebugIP(java.lang.String str) {
        OnJniSetDebugIP(str);
    }

    public void setDownloadQuota(long j17, long j18) {
        OnJniSetDownloadQuota(j17, j18);
    }

    public void setFlowLimitPerHour(int i17) {
        OnJniSetFlowLimitPerHour(i17);
    }

    public void setFlowReportParams(java.lang.String str, long j17, int i17) {
        OnJniSetFlowReportParams(str, j17, i17);
    }

    public void setLegacyCdnInfo(com.tencent.mars.cdn.CdnManager.CdnInfo cdnInfo, com.tencent.mars.cdn.CdnManager.CdnInfo cdnInfo2, com.tencent.mars.cdn.CdnManager.CdnInfo cdnInfo3, com.tencent.mars.cdn.CdnManager.CdnInfo cdnInfo4, byte[] bArr, byte[] bArr2, java.lang.String str) {
        OnJniSetLegacyCdnInfo(cdnInfo, cdnInfo2, cdnInfo3, cdnInfo4, bArr, bArr2, str);
    }

    public void setRSAPublicKeyParams(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        OnJniSetRSAPublicKeyParams(str, str2, str3);
    }

    public void setSnsDistanceData(int i17, int i18, int i19, byte[] bArr) {
        OnJniSetSnsDistanceData(i17, i18, i19, bArr);
    }

    public void setSnsImagePrivateProtocolAvalible(boolean z17) {
        OnJniSetSnsImagePrivateProtocolAvalible(z17);
    }

    public void setSnsImageStreamProtocolAvalible(boolean z17) {
        OnJniSetSnsImageStreamProtocolAvalible(z17);
    }

    public void setToUserCiper(java.lang.String str) {
        OnJniSetToUserCiper(str);
    }

    public void setUseIPv6Cdn(boolean z17) {
        OnJniSetUseIPv6Cdn(z17);
    }

    public int startC2CDownload(com.tencent.mars.cdn.CdnManager.C2CDownloadRequest c2CDownloadRequest, com.tencent.mars.cdn.CdnManager.DownloadCallback downloadCallback) {
        return OnJniStartC2CDownload(c2CDownloadRequest, downloadCallback);
    }

    public int startC2CUpload(com.tencent.mars.cdn.CdnManager.C2CUploadRequest c2CUploadRequest, com.tencent.mars.cdn.CdnManager.UploadCallback uploadCallback) {
        return OnJniStartC2CUpload(c2CUploadRequest, uploadCallback);
    }

    public int startDownloadTask(byte[] bArr, com.tencent.mars.cdn.CdnManager.DownloadCallbackV2 downloadCallbackV2) {
        return OnJniStartDownload(bArr, downloadCallbackV2);
    }

    public int startFtnUpload(com.tencent.mars.cdn.CdnManager.C2CUploadRequest c2CUploadRequest, com.tencent.mars.cdn.CdnManager.UploadCallback uploadCallback) {
        return OnJniStartFtnUpload(c2CUploadRequest, uploadCallback);
    }

    public int startHttpMultiSocketDownloadTask(com.tencent.mars.cdn.CdnManager.C2CDownloadRequest c2CDownloadRequest, com.tencent.mars.cdn.CdnManager.DownloadCallback downloadCallback) {
        return OnJniStartHttpMultiSocketDownloadTask(c2CDownloadRequest, downloadCallback);
    }

    public int startHttpVideoStreamingDownload(com.tencent.mars.cdn.CdnManager.C2CDownloadRequest c2CDownloadRequest, com.tencent.mars.cdn.CdnManager.VideoStreamingCallback videoStreamingCallback, com.tencent.mars.cdn.CdnManager.DownloadCallback downloadCallback, int i17) {
        return OnJniStartHttpVideoStreamingDownload(c2CDownloadRequest, videoStreamingCallback, downloadCallback, i17);
    }

    public int startHttpsDownload(com.tencent.mars.cdn.CdnManager.C2CDownloadRequest c2CDownloadRequest, com.tencent.mars.cdn.CdnManager.DownloadCallback downloadCallback) {
        return OnJniStartHttpsDownload(c2CDownloadRequest, downloadCallback);
    }

    public int startSNSDownload(com.tencent.mars.cdn.CdnManager.C2CDownloadRequest c2CDownloadRequest, com.tencent.mars.cdn.CdnManager.VideoStreamingCallback videoStreamingCallback, com.tencent.mars.cdn.CdnManager.DownloadCallback downloadCallback, int i17) {
        return OnJniStartSNSDownload(c2CDownloadRequest, videoStreamingCallback, downloadCallback, i17);
    }

    public int startSSUpload(com.tencent.mars.cdn.CdnManager.C2CUploadRequest c2CUploadRequest, com.tencent.mars.cdn.CdnManager.SessionCallback sessionCallback, com.tencent.mars.cdn.CdnManager.UploadCallback uploadCallback) {
        return OnJniStartSSUpload(c2CUploadRequest, sessionCallback, uploadCallback);
    }

    public int startURIChannelRequest(com.tencent.mars.cdn.CdnManager.C2CUploadRequest c2CUploadRequest, com.tencent.mars.cdn.CdnManager.UploadCallback uploadCallback) {
        return OnJniStartURIChannelRequest(c2CUploadRequest, uploadCallback);
    }

    public int startURLDownload(com.tencent.mars.cdn.CdnManager.C2CDownloadRequest c2CDownloadRequest, com.tencent.mars.cdn.CdnManager.DownloadCallback downloadCallback) {
        return OnJniStartURLDownload(c2CDownloadRequest, downloadCallback);
    }

    public int startUploadTask(byte[] bArr, com.tencent.mars.cdn.CdnManager.UploadCallbackV2 uploadCallbackV2) {
        return OnJniStartUpload(bArr, uploadCallbackV2);
    }

    public int startVideoStreamingDownload(com.tencent.mars.cdn.CdnManager.C2CDownloadRequest c2CDownloadRequest, com.tencent.mars.cdn.CdnManager.VideoStreamingCallback videoStreamingCallback, com.tencent.mars.cdn.CdnManager.DownloadCallback downloadCallback, int i17) {
        return OnJniStartVideoStreamingDownload(c2CDownloadRequest, videoStreamingCallback, downloadCallback, i17);
    }

    public boolean taskExist(java.lang.String str) {
        return OnJniTaskExist(str);
    }

    public void triggerPreConnect(java.lang.String str, java.lang.String[] strArr, boolean z17) {
        OnJniTriggerPreConnect(str, strArr, z17);
    }

    public void updateVideoPlaybackTimetick(java.lang.String str, double d17) {
        OnJniUpdateVideoPlaybackTimetick(str, d17);
    }

    public int startUploadTask(byte[] bArr, com.tencent.mars.cdn.CdnManager.UploadCallbackV2 uploadCallbackV2, com.tencent.mars.cdn.CdnManager.SessionCallback sessionCallback) {
        return OnJniStartUploadWithSession(bArr, uploadCallbackV2, sessionCallback);
    }

    /* loaded from: classes7.dex */
    public static class WebPageProfile implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.tencent.mars.cdn.CdnManager.WebPageProfile> CREATOR = new android.os.Parcelable.Creator<com.tencent.mars.cdn.CdnManager.WebPageProfile>() { // from class: com.tencent.mars.cdn.CdnManager.WebPageProfile.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public com.tencent.mars.cdn.CdnManager.WebPageProfile createFromParcel(android.os.Parcel parcel) {
                return new com.tencent.mars.cdn.CdnManager.WebPageProfile(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public com.tencent.mars.cdn.CdnManager.WebPageProfile[] newArray(int i17) {
                return new com.tencent.mars.cdn.CdnManager.WebPageProfile[i17];
            }
        };
        public long SSLconnectionEnd;
        public long SSLconnectionStart;
        public long connectEnd;
        public long connectStart;
        public long domainLookUpEnd;
        public long domainLookUpStart;
        public int downstreamThroughputKbpsEstimate;
        public long fetchStart;
        public int httpRttEstimate;
        public int networkTypeEstimate;
        public java.lang.String peerIP;
        public int port;
        public java.lang.String protocol;
        public long receivedBytedCount;
        public long redirectEnd;
        public long redirectStart;
        public long requestEnd;
        public long requestStart;
        public long responseEnd;
        public long responseStart;
        public int rtt;
        public long sendBytesCount;
        public boolean socketReused;
        public int statusCode;
        public int throughputKbps;
        public int transportRttEstimate;

        public WebPageProfile() {
            this.protocol = "";
            this.peerIP = "";
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public java.lang.String toString() {
            return "WebPageProfile{redirectStart=" + this.redirectStart + ", redirectEnd=" + this.redirectEnd + ", fetchStart=" + this.fetchStart + ", domainLookUpStart=" + this.domainLookUpStart + ", domainLookUpEnd=" + this.domainLookUpEnd + ", connectStart=" + this.connectStart + ", connectEnd=" + this.connectEnd + ", SSLconnectionStart=" + this.SSLconnectionStart + ", SSLconnectionEnd=" + this.SSLconnectionEnd + ", requestStart=" + this.requestStart + ", requestEnd=" + this.requestEnd + ", responseStart=" + this.responseStart + ", responseEnd=" + this.responseEnd + ", protocol='" + this.protocol + "', rtt=" + this.rtt + ", statusCode=" + this.statusCode + ", networkTypeEstimate=" + this.networkTypeEstimate + ", httpRttEstimate=" + this.httpRttEstimate + ", transportRttEstimate=" + this.transportRttEstimate + ", downstreamThroughputKbpsEstimate=" + this.downstreamThroughputKbpsEstimate + ", throughputKbps=" + this.throughputKbps + ", peerIP='" + this.peerIP + "', port=" + this.port + ", socketReused=" + this.socketReused + ", sendBytesCount=" + this.sendBytesCount + ", receivedBytedCount=" + this.receivedBytedCount + '}';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeLong(this.redirectStart);
            parcel.writeLong(this.redirectEnd);
            parcel.writeLong(this.fetchStart);
            parcel.writeLong(this.domainLookUpStart);
            parcel.writeLong(this.domainLookUpEnd);
            parcel.writeLong(this.connectStart);
            parcel.writeLong(this.connectEnd);
            parcel.writeLong(this.SSLconnectionStart);
            parcel.writeLong(this.SSLconnectionEnd);
            parcel.writeLong(this.requestStart);
            parcel.writeLong(this.requestEnd);
            parcel.writeLong(this.responseStart);
            parcel.writeLong(this.responseEnd);
            parcel.writeString(this.protocol);
            parcel.writeInt(this.rtt);
            parcel.writeInt(this.statusCode);
            parcel.writeInt(this.networkTypeEstimate);
            parcel.writeInt(this.httpRttEstimate);
            parcel.writeInt(this.transportRttEstimate);
            parcel.writeInt(this.downstreamThroughputKbpsEstimate);
            parcel.writeInt(this.throughputKbps);
            parcel.writeString(this.peerIP);
            parcel.writeInt(this.port);
            parcel.writeByte(this.socketReused ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.sendBytesCount);
            parcel.writeLong(this.receivedBytedCount);
        }

        public WebPageProfile(android.os.Parcel parcel) {
            this.protocol = "";
            this.peerIP = "";
            this.redirectStart = parcel.readLong();
            this.redirectEnd = parcel.readLong();
            this.fetchStart = parcel.readLong();
            this.domainLookUpStart = parcel.readLong();
            this.domainLookUpEnd = parcel.readLong();
            this.connectStart = parcel.readLong();
            this.connectEnd = parcel.readLong();
            this.SSLconnectionStart = parcel.readLong();
            this.SSLconnectionEnd = parcel.readLong();
            this.requestStart = parcel.readLong();
            this.requestEnd = parcel.readLong();
            this.responseStart = parcel.readLong();
            this.responseEnd = parcel.readLong();
            this.protocol = parcel.readString();
            this.rtt = parcel.readInt();
            this.statusCode = parcel.readInt();
            this.networkTypeEstimate = parcel.readInt();
            this.httpRttEstimate = parcel.readInt();
            this.transportRttEstimate = parcel.readInt();
            this.downstreamThroughputKbpsEstimate = parcel.readInt();
            this.throughputKbps = parcel.readInt();
            this.peerIP = parcel.readString();
            this.port = parcel.readInt();
            this.socketReused = parcel.readByte() != 0;
            this.sendBytesCount = parcel.readLong();
            this.receivedBytedCount = parcel.readLong();
        }
    }

    public CdnManager(com.tencent.mars.app.Context context) {
        OnJniCreateCdnManagerFromContext(context);
    }

    /* loaded from: classes4.dex */
    public static class VideoInfo implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.tencent.mars.cdn.CdnManager.VideoInfo> CREATOR = new android.os.Parcelable.Creator<com.tencent.mars.cdn.CdnManager.VideoInfo>() { // from class: com.tencent.mars.cdn.CdnManager.VideoInfo.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public com.tencent.mars.cdn.CdnManager.VideoInfo createFromParcel(android.os.Parcel parcel) {
                return new com.tencent.mars.cdn.CdnManager.VideoInfo(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public com.tencent.mars.cdn.CdnManager.VideoInfo[] newArray(int i17) {
                return new com.tencent.mars.cdn.CdnManager.VideoInfo[i17];
            }
        };
        public int oriVideoFormat;
        public java.lang.String requestFlag;
        public java.lang.String svrFlag;
        public int videoFormat;
        public java.lang.String videoPath;

        public VideoInfo() {
            this.requestFlag = "";
            this.svrFlag = "";
            this.videoFormat = 0;
            this.oriVideoFormat = 0;
            this.videoPath = "";
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public void readFromParcel(android.os.Parcel parcel) {
            this.requestFlag = parcel.readString();
            this.svrFlag = parcel.readString();
            this.videoFormat = parcel.readInt();
            this.oriVideoFormat = parcel.readInt();
            this.videoPath = parcel.readString();
        }

        public java.lang.String toString() {
            return "VideoInfo{requestFlag='" + this.requestFlag + "', svrFlag='" + this.svrFlag + "', videoFormat=" + this.videoFormat + ", oriVideoFormat=" + this.oriVideoFormat + ", videoPath='" + this.videoPath + "'}";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeString(this.requestFlag);
            parcel.writeString(this.svrFlag);
            parcel.writeInt(this.videoFormat);
            parcel.writeInt(this.oriVideoFormat);
            parcel.writeString(this.videoPath);
        }

        public VideoInfo(android.os.Parcel parcel) {
            this.requestFlag = "";
            this.svrFlag = "";
            this.videoFormat = 0;
            this.oriVideoFormat = 0;
            this.videoPath = "";
            this.requestFlag = parcel.readString();
            this.svrFlag = parcel.readString();
            this.videoFormat = parcel.readInt();
            this.oriVideoFormat = parcel.readInt();
            this.videoPath = parcel.readString();
        }
    }

    public static com.tencent.mars.cdn.CdnManager.C2CUploadRequest createC2CUpload(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3) {
        return new com.tencent.mars.cdn.CdnManager.C2CUploadRequest().setFileKey(str).setBizid(1).setApptype(1).setFileType(i17).setFilePath(str2).setThumbfilePath(str3).build();
    }

    public static com.tencent.mars.cdn.CdnManager.C2CUploadRequest createC2CUpload(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        return new com.tencent.mars.cdn.CdnManager.C2CUploadRequest().setFileKey(str).setBizid(1).setApptype(1).setFileType(i17).setFilePath(str2).setMidimgPath(str3).setThumbfilePath(str4).build();
    }

    public static com.tencent.mars.cdn.CdnManager.C2CUploadRequest createC2CUpload(com.tencent.mars.cdn.CdnManager.C2CUploadRequest c2CUploadRequest, java.lang.String str, java.lang.String str2) {
        return c2CUploadRequest.setForwardFileid(str).setForwardAeskey(str2).setEnableHitCheck(true).build();
    }
}
