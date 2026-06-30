package com.p314xaae8f345.p542x3306d5.cdn;

/* renamed from: com.tencent.mars.cdn.CdnManager */
/* loaded from: classes12.dex */
public class C4446x11b6e6e0 extends com.p314xaae8f345.p542x3306d5.app.AbstractC4441x1e602b7c {

    /* renamed from: HIT_FILEID */
    public static final int f17604x2f19b5e3 = 1;

    /* renamed from: HIT_NEWMD5 */
    public static final int f17605x3c8d3a4a = 4;

    /* renamed from: HIT_UPLOADCHECKMD5 */
    public static final int f17606x5bbbc6e3 = 2;

    /* renamed from: HIT_UPLOADWITHMD5 */
    public static final int f17607x3800d20b = 3;

    /* renamed from: HIT_VIDEODROPRATE */
    public static final int f17608xdbec51de = 5;

    /* renamed from: ImageFormat_HEIC */
    public static final int f17609xe42155e4 = 4;

    /* renamed from: ImageFormat_HEVC */
    public static final int f17610xe4215777 = 2;

    /* renamed from: ImageFormat_JPEG */
    public static final int f17611xe4226775 = 1;

    /* renamed from: ImageFormat_PNG */
    public static final int f17612x8b7d115c = 3;

    /* renamed from: ImageFormat_UNKNOWN */
    public static final int f17613x827931fd = 0;

    /* renamed from: MediaCompress_MID */
    public static final int f17614xbeae11af = 2;

    /* renamed from: MediaCompress_ORIGIN */
    public static final int f17615xa687ba3f = 1;

    /* renamed from: MediaCompress_UNKNOWN */
    public static final int f17616x61210431 = 0;

    /* renamed from: MediaTypeAppImage */
    public static final int f17617xecb7d2f8 = 20301;

    /* renamed from: MediaTypeFriendsADImageThumb */
    public static final int f17618xc2ffe5d5 = 20204;

    /* renamed from: MediaTypeFriendsImageThumb */
    public static final int f17619xac5a8732 = 20205;

    /* renamed from: MediaTypeFriendsVideoThumbImage */
    public static final int f17620x496de469 = 20250;

    /* renamed from: MediaType_ChatVoice */
    public static final int f17621xf08982b9 = 15;

    /* renamed from: MediaType_F2F_VOICE_RESOURCE */
    public static final int f17622xc1f71f21 = 101;

    /* renamed from: MediaType_FAVORITE_FILE */
    public static final int f17623x5a6914de = 10001;

    /* renamed from: MediaType_FAVORITE_VIDEO */
    public static final int f17624xf39ae139 = 10002;

    /* renamed from: MediaType_FILE */
    public static final int f17625x42bea7fd = 5;

    /* renamed from: MediaType_FRIENDS */
    public static final int f17626x38117f54 = 20201;

    /* renamed from: MediaType_FRIENDS_Video */
    public static final int f17627x614b37b0 = 20202;

    /* renamed from: MediaType_FULLSIZEIMAGE */
    public static final int f17628x16f58eca = 1;

    /* renamed from: MediaType_GlanceVideo */
    public static final int f17629x473ccb66 = 90;

    /* renamed from: MediaType_IMAGE */
    public static final int f17630x154246da = 2;

    /* renamed from: MediaType_SnsAdLangdingPageVideo */
    public static final int f17631x62f68286 = 100;

    /* renamed from: MediaType_THUMBIMAGE */
    public static final int f17632xbf12af06 = 3;

    /* renamed from: MediaType_TinyVideo */
    public static final int f17633xe92c7f5a = 6;

    /* renamed from: MediaType_VIDEO */
    public static final int f17634x15f7b1fa = 4;

    /* renamed from: MediaType_WIMDownload */
    public static final int f17635x2a0933c2 = 19;

    /* renamed from: NO_ERROR */
    public static final int f17636x9fb731ea = 0;

    /* renamed from: NO_HITCACHE */
    public static final int f17637xa5dee08d = 0;

    /* renamed from: PreloadMode */
    public static final int f17638x3d2a972c = 2;

    /* renamed from: QueryInfoMode */
    public static final int f17639xa55f7039 = 3;

    /* renamed from: RealTimeMode */
    public static final int f17640xd9d965ee = 4;

    /* renamed from: StorageMode */
    public static final int f17641x4412e29e = 0;
    protected static final java.lang.String TAG = "MicroMsg.CdnManager";

    /* renamed from: VideoFormar_FavCommonImg */
    public static final int f17642xdab580cc = 103;

    /* renamed from: VideoFormar_FavH264 */
    public static final int f17643x74052994 = 101;

    /* renamed from: VideoFormar_FavH265 */
    public static final int f17644x74052995 = 102;

    /* renamed from: VideoFormar_FavWxam */
    public static final int f17645x740d0759 = 104;

    /* renamed from: VideoFormar_FavWxam_WideGamut */
    public static final int f17646x8c6f6819 = 105;

    /* renamed from: VideoFormat_Unknown */
    public static final int f17647xcbb1b11d = 0;

    /* renamed from: VideoFormat_X264 */
    public static final int f17648x6a6b305 = 1;

    /* renamed from: VideoFormat_X265 */
    public static final int f17649x6a6b306 = 2;

    /* renamed from: VideoFormat_X266 */
    public static final int f17650x6a6b307 = 3;

    /* renamed from: VideoMessageFormatOpus */
    public static final int f17651xca77d22 = 2;

    /* renamed from: VideoMessageFormatSilk */
    public static final int f17652xca93338 = 1;

    /* renamed from: VideoPlayMode */
    public static final int f17653x8faf7c72 = 1;

    /* renamed from: defaultApprovedVideoHosts */
    public static final java.lang.String f17654x5147be48 = "vweixinf.tc.qq.com,szwbwxsns.video.qq.com,szxzwxsns.video.qq.com,szzjwxsns.video.qq.com,shwbwxsns.video.qq.com,shxzwxsns.video.qq.com,shzjwxsns.video.qq.com,wxsnsdy.wxs.qq.com,vweixinthumb.tc.qq.com,wxsnsdythumb.wxs.qq.com,wxappthumb.tc.qq.com,wxapp.tc.qq.com";

    /* renamed from: kAppTypeAdImage */
    public static final int f17655xe7ea92c8 = 109;

    /* renamed from: kAppTypeAdVideo */
    public static final int f17656xe89ffde8 = 105;

    /* renamed from: kAppTypeAny */
    public static final int f17657xc30fa9bc = 0;

    /* renamed from: kAppTypeC2C */
    public static final int f17658xc30fa9c4 = 1;

    /* renamed from: kAppTypeC2CGroupChat */
    public static final int f17659xe0bed913 = 2;

    /* renamed from: kAppTypeCircleSearch */
    public static final int f17660x3401ccc8 = 12;

    /* renamed from: kAppTypeEmoji */
    public static final int f17661x3e03fc16 = 110;

    /* renamed from: kAppTypeFavorite */
    public static final int f17662xcb08fbcc = 10;

    /* renamed from: kAppTypeFestivalImage */
    public static final int f17663xdf1ad693 = 257;

    /* renamed from: kAppTypeFestivalVideo */
    public static final int f17664xdfd041b3 = 258;

    /* renamed from: kAppTypeFilePreview */
    public static final int f17665x3b3f027c = 8;

    /* renamed from: kAppTypeFinderLive */
    public static final int f17666x342c8062 = 292;

    /* renamed from: kAppTypeFinderVideo */
    public static final int f17667x51f033c5 = 251;

    /* renamed from: kAppTypeFullsizeVideo */
    public static final int f17668x4925171b = 11;

    /* renamed from: kAppTypeHDVideo */
    public static final int f17669x245088cf = 205;

    /* renamed from: kAppTypeHeadImage */
    public static final int f17670xf23bab2b = 220;

    /* renamed from: kAppTypeHwPage */
    public static final int f17671x8818c26e = 200;

    /* renamed from: kAppTypeMultiJpeg */
    public static final int f17672xb889f911 = 101;

    /* renamed from: kAppTypeMultiVCodec */
    public static final int f17673xcff48ba9 = 108;

    /* renamed from: kAppTypeMultiWebp */
    public static final int f17674xb88fb845 = 104;

    /* renamed from: kAppTypeNearEvent */
    public static final int f17675x8385e722 = 201;

    /* renamed from: kAppTypeNewLife */
    public static final int f17676x9bc9c48c = 280;

    /* renamed from: kAppTypeP2021 */
    public static final int f17677x3e83393d = 255;

    /* renamed from: kAppTypeRemarkImgAppType */
    public static final int f17678x43ca1588 = 274;

    /* renamed from: kAppTypeS1S */
    public static final int f17679xc30fe5c5 = 314;

    /* renamed from: kAppTypeSelfieEmoji */
    public static final int f17680x741d578e = 111;

    /* renamed from: kAppTypeServiceVoipVideo */
    public static final int f17681x1a8bedb6 = 14;

    /* renamed from: kAppTypeShop */
    public static final int f17682x9eeda526 = 200;

    /* renamed from: kAppTypeSingleJpeg */
    public static final int f17683x45d3db00 = 100;

    /* renamed from: kAppTypeSingleVCodec */
    public static final int f17684x324dadd8 = 107;

    /* renamed from: kAppTypeSingleWebp */
    public static final int f17685x45d99a34 = 103;

    /* renamed from: kAppTypeTingAudio */
    public static final int f17686x39581158 = 276;

    /* renamed from: kAppTypeTingImage */
    public static final int f17687x39c51edd = 275;

    /* renamed from: kAppTypeUnknown */
    public static final int f17688x1cd7741a = -1;

    /* renamed from: kAppTypeUserStatus */
    public static final int f17689x6e41c9cd = 256;

    /* renamed from: kAppTypeVideo */
    public static final int f17690x3ef1904b = 102;

    /* renamed from: kAppTypeVideoThumb */
    public static final int f17691xae54a84b = 150;

    /* renamed from: kAppTypeYunStorage */
    public static final int f17692xdf0abb79 = 202;

    /* renamed from: kBizAny */
    public static final int f17693x92dab824 = 0;

    /* renamed from: kBizApp */
    public static final int f17694x92dab859 = 4;

    /* renamed from: kBizC2C */
    public static final int f17695x92dab82c = 1;

    /* renamed from: kBizC2CNova */
    public static final int f17696xb94fe678 = 8;

    /* renamed from: kBizDC */
    public static final int f17697xba6a2727 = 5;

    /* renamed from: kBizEWC */
    public static final int f17698x92dac429 = -3;

    /* renamed from: kBizFavorite */
    public static final int f17699xb76eae64 = 2;

    /* renamed from: kBizFilePreview */
    public static final int f17700x9e928e4 = 8;

    /* renamed from: kBizLanCS */
    public static final int f17701x47a23801 = -2;

    /* renamed from: kBizNormalHttp */
    public static final int f17702x2e4940d7 = -1;

    /* renamed from: kBizSns */
    public static final int f17703x92dafbb0 = 3;

    /* renamed from: kBizUnknown */
    public static final int f17704xda250e82 = 0;

    /* renamed from: kErrSafeProtoNoAeskey */
    public static final int f17705xe5f2a5f2 = -21111;

    /* renamed from: kErrUploadHevcIllegal */
    public static final int f17706x1b5fcd11 = -5103237;

    /* renamed from: kGroupNoticeCDNAppType */
    public static final int f17707xece775fa = 264;

    /* renamed from: kGroupNoticeCDNFileType */
    public static final int f17708x3f2d09b7 = 20303;

    /* renamed from: kIpSource_NewDNS */
    public static final int f17709xb6eb265b = 1;

    /* renamed from: kIpSource_None */
    public static final int f17710x27156eaa = 0;

    /* renamed from: kIpSource_SysDNS */
    public static final int f17711xc08b660e = 2;

    /* renamed from: kMediaGamePacket */
    public static final int f17712xbf357a33 = 30002;

    /* renamed from: kMediaLittleAppPacket */
    public static final int f17713x47d73c3a = 30001;

    /* renamed from: kMediaTypeAdImage */
    public static final int f17714x44fa4e65 = 20204;

    /* renamed from: kMediaTypeAdVideo */
    public static final int f17715x45afb985 = 20210;

    /* renamed from: kMediaTypeAny */
    public static final int f17716x88dfbbd9 = 0;

    /* renamed from: kMediaTypeAppFile */
    public static final int f17717x5b886eaa = 20303;

    /* renamed from: kMediaTypeAppImageStorage */
    public static final int f17718x33746fce = 20304;

    /* renamed from: kMediaTypeAppVideo */
    public static final int f17719x1666c10d = 20302;

    /* renamed from: kMediaTypeAppWxamPic */
    public static final int f17720x6612938f = 20351;

    /* renamed from: kMediaTypeAudio */
    public static final int f17721xcfe31683 = 11;

    /* renamed from: kMediaTypeBackupFile */
    public static final int f17722x818a57d1 = 20001;

    /* renamed from: kMediaTypeBeatificFile */
    public static final int f17723x3582f37c = 10011;

    /* renamed from: kMediaTypeBigFile */
    public static final int f17724x83fdea09 = 7;

    /* renamed from: kMediaTypeEmojiGIF */
    public static final int f17725x169d4fd1 = 20402;

    /* renamed from: kMediaTypeEmojiNormal */
    public static final int f17726xbaaa61ba = 20401;

    /* renamed from: kMediaTypeEmojiWXAM */
    public static final int f17727xbd142840 = 20403;

    /* renamed from: kMediaTypeEmojiWXAMUser */
    public static final int f17728x4a6e682b = 20404;

    /* renamed from: kMediaTypeExposeImage */
    public static final int f17729xba064e4 = 11000;

    /* renamed from: kMediaTypeFavoriteBigFile */
    public static final int f17730xefd833cd = 10007;

    /* renamed from: kMediaTypeFavoriteFile */
    public static final int f17731x7de59deb = 10001;

    /* renamed from: kMediaTypeFavoriteVideo */
    public static final int f17732x3faf79ec = 10002;

    /* renamed from: kMediaTypeFile */
    public static final int f17733x9319f12f = 5;

    /* renamed from: kMediaTypeFriends */
    public static final int f17734x671ccd02 = 20201;

    /* renamed from: kMediaTypeFriendsVideo */
    public static final int f17735x84322899 = 20202;

    /* renamed from: kMediaTypeFriendsVideoThumbImage */
    public static final int f17736x3598969e = 20250;

    /* renamed from: kMediaTypeFullSizeImage */
    public static final int f17737x742b9db8 = 1;

    /* renamed from: kMediaTypeHWDevice */
    public static final int f17738x78d75258 = 20322;

    /* renamed from: kMediaTypeHWDeviceFile */
    public static final int f17739xbdd7cff4 = 20303;

    /* renamed from: kMediaTypeImage */
    public static final int f17740xd0502408 = 2;

    /* renamed from: kMediaTypeNearEvent */
    public static final int f17741xdb952f7f = 20310;

    /* renamed from: kMediaTypeShop */
    public static final int f17742x931fd6a9 = 20301;

    /* renamed from: kMediaTypeSmartHwPage */
    public static final int f17743x3e801054 = 20321;

    /* renamed from: kMediaTypeStoryAudio */
    public static final int f17744x10ab2d54 = 40001;

    /* renamed from: kMediaTypeThumbImage */
    public static final int f17745x51b4e698 = 3;

    /* renamed from: kMediaTypeTinyVideo */
    public static final int f17746xb1410d88 = 6;

    /* renamed from: kMediaTypeVideo */
    public static final int f17747xd1058f28 = 4;

    /* renamed from: kMediaTypeWxamThumb */
    public static final int f17748xbff86f36 = 20251;

    /* renamed from: kMultiImageDownload */
    public static final int f17749x4ed14215 = 2;

    /* renamed from: kNetTypeDisconnected */
    public static final int f17750xb3d5ffe7 = -1;

    /* renamed from: kNetTypeMobile */
    public static final int f17751xabd0934e = 2;

    /* renamed from: kNetTypeOther */
    public static final int f17752xdeb76e4 = 3;

    /* renamed from: kNetTypeWifi */
    public static final int f17753x766cc1 = 1;

    /* renamed from: kSingleImageDownload */
    public static final int f17754x64a08d30 = 1;

    /* renamed from: kVideoBufferingBegin */
    public static final int f17755x11093117 = 0;

    /* renamed from: kVideoBufferingEnd */
    public static final int f17756x1c8584c9 = 1;

    /* renamed from: kVideoStartPlay */
    public static final int f17757xe6f1ddc6 = 2;

    /* renamed from: kVideoStopPlay */
    public static final int f17758xed9e7946 = 3;

    /* renamed from: nativeHandle */
    protected long f17760x7b5cfd1f = 0;

    /* renamed from: callbackHandle */
    protected long f17759x429972cd = 0;

    /* renamed from: com.tencent.mars.cdn.CdnManager$AppCallback */
    /* loaded from: classes12.dex */
    public interface AppCallback {
        /* renamed from: combineResolveHost */
        java.lang.String[] mo37799x705052f5(java.lang.String str, int i17, int i18, int[] iArr);

        /* renamed from: isUsingWangKaService */
        boolean mo37800xc9848262(int i17);

        /* renamed from: onBadNetworkProbed */
        void mo37801x4491727c();

        /* renamed from: onTaskTearDown */
        void mo37802xb2a6aa48(java.lang.String str, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.DownloadTaskProfile downloadTaskProfile, java.lang.String str2);

        /* renamed from: reportFlow */
        void mo37803x73181082(int i17, int i18, int i19, int i27);

        /* renamed from: reportFlowWithTag */
        void mo37804xe90cea12(java.lang.String str, int i17, long j17, long j18, long j19, long j27);

        /* renamed from: reportGroupIDKey */
        void mo37805xc9114479(int[] iArr, int[] iArr2, int[] iArr3, int i17, boolean z17);

        /* renamed from: reportIDKey */
        void mo37806xf0018e90(long j17, long j18, long j19, boolean z17);

        /* renamed from: reportKV */
        void mo37807xe68be19f(long j17, java.lang.String str, boolean z17, boolean z18, long j18);

        /* renamed from: reportKVNoFreqLimit */
        void mo37808xc8cf6843(long j17, java.lang.String str);

        /* renamed from: requestGetCDN */
        void mo37809x3e59a466(int i17);

        /* renamed from: requestSnsGetCdnDistance */
        void mo37810x54b3aed5(int i17, int i18, int i19);

        /* renamed from: resolveHost */
        java.lang.String[] mo37811x746015b4(java.lang.String str, boolean z17, int[] iArr);
    }

    /* renamed from: com.tencent.mars.cdn.CdnManager$BatchSnsReqImageData */
    /* loaded from: classes4.dex */
    public static class BatchSnsReqImageData {
        public java.lang.String url = "";

        /* renamed from: picIndex */
        public int f17764xd219ed68 = 0;

        /* renamed from: imageCachePath */
        public java.lang.String f17763xbb7fc3ac = "";

        /* renamed from: decryptKey */
        public java.lang.String f17761x7b254592 = "";

        /* renamed from: totalFileSize */
        public int f17766xd5bbe701 = 0;

        /* renamed from: fileKey */
        public java.lang.String f17762xcd096f43 = "";

        /* renamed from: retry */
        public boolean f17765x67622a8 = true;
    }

    /* renamed from: com.tencent.mars.cdn.CdnManager$C2CDownloadRequest */
    /* loaded from: classes12.dex */
    public static class C2CDownloadRequest {

        /* renamed from: bizReqPayLoad */
        public byte[] f17774x383344a3;

        /* renamed from: cdnRequestPb */
        public byte[] f17776xbb661734;

        /* renamed from: feedPicCount */
        public int f17791xf057e163;

        /* renamed from: finderMediaCdnInfo */
        public byte[] f17796xf1dc7d3d;

        /* renamed from: fileKey */
        public java.lang.String f17792xcd096f43 = "";

        /* renamed from: argInfo */
        public java.lang.String f17770xd3933824 = "";

        /* renamed from: debugIP */
        public java.lang.String f17783x5be456ba = "";

        /* renamed from: fileType */
        public int f17793xd428dad6 = 0;

        /* renamed from: bizid */
        public int f17775x596916e = 0;

        /* renamed from: apptype */
        public int f17769xd0bc10db = -1;

        /* renamed from: savePath */
        protected java.lang.String f17829x84749342 = "";

        /* renamed from: aeskey */
        public java.lang.String f17767xab4b3f30 = "";

        /* renamed from: initialIV */
        public java.lang.String f17801xf1289f71 = "";

        /* renamed from: fileid */
        public java.lang.String f17794xb4089397 = "";

        /* renamed from: isSilentTask */
        public boolean f17807x828e0844 = false;

        /* renamed from: queueTimeoutSeconds */
        public int f17821x8c50294f = 1800;

        /* renamed from: transforTimeoutSeconds */
        public int f17841x86986d5f = 600;

        /* renamed from: downloadMode */
        int f17785x4217f24b = 0;

        /* renamed from: netflowTag */
        public java.lang.String f17816x5af14b4f = "";

        /* renamed from: expectFileSize */
        public long f17787x854a1316 = 0;

        /* renamed from: expectFileMD5 */
        public java.lang.String f17786xd2c037e9 = "";

        /* renamed from: chatType */
        public int f17778x55ad2ab2 = 0;

        /* renamed from: isStorageMode */
        public boolean f17809x8c9dd734 = false;

        /* renamed from: isSmallVideo */
        public boolean f17808xca37987e = false;

        /* renamed from: isLargeSVideo */
        public boolean f17806x4fbb1f59 = false;

        /* renamed from: isAutoStart */
        public boolean f17802xa8996de9 = false;

        /* renamed from: downloadBehavior */
        public int f17784x3416d6fa = 0;

        /* renamed from: msgExtra */
        public java.lang.String f17814xb214850f = "";

        /* renamed from: bigfileSignature */
        public java.lang.String f17773x2e07d19c = "";

        /* renamed from: requestVideoFormat */
        public int f17826x479f4643 = 1;

        /* renamed from: supportFormats */
        public int[] f17837x397b888d = {1};

        /* renamed from: videoflagPolicy */
        public int f17846xe8714679 = 0;

        /* renamed from: requestVideoFlag */
        public java.lang.String f17825xff4670b8 = "";

        /* renamed from: isColdSnsData */
        public boolean f17803x35e16234 = false;

        /* renamed from: isHotSnsVideo */
        public boolean f17805x75d109c6 = false;

        /* renamed from: preloadRatio */
        public int f17820x5e9d4f82 = 30;

        /* renamed from: preloadMinSize */
        public long f17819x31507f2a = 0;

        /* renamed from: isHLSVideo */
        public boolean f17804x4b1ad916 = false;

        /* renamed from: hlsVideoFlag */
        public java.lang.String f17797x74835b58 = "";

        /* renamed from: finderByPass */
        public java.lang.String f17795x6ab10ce = "";

        /* renamed from: treatAsVideoFile */
        public boolean f17842x8460e80b = false;

        /* renamed from: preAllocStorage */
        public boolean f17818x3aaf4bc9 = false;
        public java.lang.String url = "";

        /* renamed from: host */
        public java.lang.String f17798x30f5a8 = "";

        /* renamed from: referer */
        public java.lang.String f17823x40acd92d = "";

        /* renamed from: snsCipherKey */
        public java.lang.String f17832x714a89bc = "";

        /* renamed from: signalQuality */
        public java.lang.String f17831xb7419d37 = "";

        /* renamed from: snsScene */
        public java.lang.String f17833x2e1215f4 = "";

        /* renamed from: customHeader */
        public java.lang.String f17782x37c415e = "";

        /* renamed from: fakeBigfileSignature */
        public java.lang.String f17788x2fd4a311 = "";

        /* renamed from: fakeBigfileSignatureAeskey */
        public java.lang.String f17789x90887da1 = "";

        /* renamed from: bakup_url */
        public java.lang.String f17771x8bd80d7 = "";

        /* renamed from: serialized_verify_headers */
        public java.lang.String f17830xaeb6d5db = "";

        /* renamed from: allow_mobile_net_download */
        public boolean f17768xaab5f371 = false;

        /* renamed from: is_resume_task */
        public boolean f17810x9f0a36c2 = false;

        /* renamed from: concurrentCount */
        public int f17780x81527598 = 1;

        /* renamed from: maxHttpRedirectCount */
        public int f17812x2bdfc5e7 = 5;

        /* renamed from: wifiAutoStart */
        public boolean f17847x65d1c45e = false;

        /* renamed from: statePath */
        protected java.lang.String f17835x83a9ec56 = "";

        /* renamed from: connectionCount */
        public int f17781x2a127cd1 = 1;

        /* renamed from: certificateVerifyPolicy */
        public int f17777xb1d90642 = 1;

        /* renamed from: msgType */
        public int f17815x5018025b = 1;

        /* renamed from: feedId */
        public java.lang.String f17790xb3ccff59 = "";

        /* renamed from: batchSnsReqImageDatas */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.BatchSnsReqImageData[] f17772xe04716e = null;

        /* renamed from: quicTaskParams */
        public com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.QuicTaskParams f17822x1b8eec49 = null;

        /* renamed from: taskStartTime */
        public long f17840xf3a4da4a = 0;

        /* renamed from: httpMethod */
        public java.lang.String f17800x2cc53f89 = "";

        /* renamed from: hostIPHint */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.HostIPHint f17799xab1787f6 = null;

        /* renamed from: useNewdns */
        public boolean f17844xd72427f0 = false;

        /* renamed from: maxPCDNConnections */
        public int f17813xad9a8174 = 0;

        /* renamed from: pcdnAppID */
        public int f17817x7371b33f = 0;

        /* renamed from: snsVideoStragegy */
        public java.lang.String f17834xf1b09da3 = "";

        /* renamed from: maxFileSize */
        public long f17811x4d4a9121 = 0;

        /* renamed from: videoDownloadMode */
        public int f17845xa0097a66 = 0;

        /* renamed from: tryRealtimeTransportProtocol */
        public boolean f17843xd219dd3b = false;

        /* renamed from: statefileKeepHours */
        public int f17836x963b9b7d = 0;

        /* renamed from: reportDetailPacketTransInfo */
        public boolean f17824x43ab7a69 = false;

        /* renamed from: clientTag */
        public java.lang.String f17779x8e81bbcf = "";

        /* renamed from: taskGroupKey */
        public java.lang.String f17839xbec77005 = "";

        /* renamed from: taskGroupCapacity */
        public int f17838x706e5ad4 = 8;

        /* renamed from: resolveHostPriority */
        public int f17828xaffbff78 = 0;

        /* renamed from: resolveHostFlags */
        public int f17827x549a5933 = 5;

        /* renamed from: build */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest m37812x59bc66e() {
            int i17;
            int i18 = this.f17775x596916e;
            if (i18 == 0 || i18 == 0 || (i17 = this.f17769xd0bc10db) == -1 || i17 == 0) {
                throw new java.security.InvalidParameterException("must set bizid,apptype");
            }
            if (this.f17792xcd096f43.isEmpty()) {
                throw new java.security.InvalidParameterException("must set filekey");
            }
            if (this.url.isEmpty() && this.f17794xb4089397.isEmpty()) {
                throw new java.security.InvalidParameterException("must set url or fileid");
            }
            if (!this.f17794xb4089397.isEmpty() && this.f17767xab4b3f30.length() != 32) {
                throw new java.security.InvalidParameterException("aeskey must be 32 bytes");
            }
            if (this.f17767xab4b3f30.isEmpty() || this.f17832x714a89bc.isEmpty()) {
                return this;
            }
            throw new java.security.InvalidParameterException("one of (aeskey,snsCipherKey) must be empty");
        }

        /* renamed from: setAeskey */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest m37813x3979632(java.lang.String str) {
            this.f17767xab4b3f30 = str;
            return this;
        }

        /* renamed from: setAllow_mobile_net_download */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest m37814xc607e92f(boolean z17) {
            this.f17768xaab5f371 = z17;
            return this;
        }

        /* renamed from: setApptype */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest m37815x81fa9a19(int i17) {
            this.f17769xd0bc10db = i17;
            return this;
        }

        /* renamed from: setArgInfo */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest m37816x84d1c162(java.lang.String str) {
            this.f17770xd3933824 = str;
            return this;
        }

        /* renamed from: setBakup_url */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest m37817x647eb295(java.lang.String str) {
            this.f17771x8bd80d7 = str;
            return this;
        }

        /* renamed from: setBatchSnsReqImageDatas */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest m37818xe9c2f62c(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.BatchSnsReqImageData[] batchSnsReqImageDataArr) {
            this.f17772xe04716e = batchSnsReqImageDataArr;
            return this;
        }

        /* renamed from: setBigfileSignature */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest m37819x79dcce1e(java.lang.String str) {
            this.f17773x2e07d19c = str;
            return this;
        }

        /* renamed from: setBizid */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest m37820x52c2522c(int i17) {
            this.f17775x596916e = i17;
            return this;
        }

        /* renamed from: setCertificateVerifyPolicy */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest m37821x98095380(int i17) {
            this.f17777xb1d90642 = i17;
            return this;
        }

        /* renamed from: setChatType */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest m37822xcc3fc934(int i17) {
            this.f17778x55ad2ab2 = i17;
            return this;
        }

        /* renamed from: setConcurrentCount */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest m37823x9c8ae0d6(int i17) {
            this.f17780x81527598 = i17;
            return this;
        }

        /* renamed from: setCustomHeader */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest m37824x9ab7cee0(java.lang.String str) {
            this.f17782x37c415e = str;
            return this;
        }

        /* renamed from: setDebugIP */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest m37825xd22dff8(java.lang.String str) {
            this.f17783x5be456ba = str;
            return this;
        }

        /* renamed from: setDownloadMode */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest m37826xd9537fcd(int i17) {
            this.f17785x4217f24b = i17;
            return this;
        }

        /* renamed from: setExpectFileMD5 */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest m37827x22f65aa7(java.lang.String str) {
            this.f17786xd2c037e9 = str;
            return this;
        }

        /* renamed from: setExpectFileSize */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest m37828x3bd84818(long j17) {
            this.f17787x854a1316 = j17;
            return this;
        }

        /* renamed from: setFakeBigfileSignature */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest m37829x57f38e93(java.lang.String str) {
            this.f17788x2fd4a311 = str;
            return this;
        }

        /* renamed from: setFakeBigfileSignatureAeskey */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest m37830xdf753fa3(java.lang.String str) {
            this.f17789x90887da1 = str;
            return this;
        }

        /* renamed from: setFeedId */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest m37831xc19565b(java.lang.String str) {
            this.f17790xb3ccff59 = str;
            return this;
        }

        /* renamed from: setFeedPicCount */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest m37832x87936ee5(int i17) {
            this.f17791xf057e163 = i17;
            return this;
        }

        /* renamed from: setFileKey */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest m37833x7e47f881(java.lang.String str) {
            this.f17792xcd096f43 = str;
            return this;
        }

        /* renamed from: setFileType */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest m37834x4abb7958(int i17) {
            this.f17793xd428dad6 = i17;
            return this;
        }

        /* renamed from: setFileid */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest m37835xc54ea99(java.lang.String str) {
            this.f17794xb4089397 = str;
            return this;
        }

        /* renamed from: setHlsVideoFlag */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest m37836xbbee8da(java.lang.String str) {
            this.f17797x74835b58 = str;
            return this;
        }

        /* renamed from: setHost */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest m37837x764b252a(java.lang.String str) {
            this.f17798x30f5a8 = str;
            return this;
        }

        /* renamed from: setHostIPHint */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest m37838xc77c8df8(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.HostIPHint hostIPHint) {
            this.f17799xab1787f6 = hostIPHint;
            return this;
        }

        /* renamed from: setHttpMethod */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest m37839x492a458b(java.lang.String str) {
            this.f17800x2cc53f89 = str;
            return this;
        }

        /* renamed from: setIsAutoStart */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest m37840x18d52827(boolean z17) {
            this.f17802xa8996de9 = z17;
            return this;
        }

        /* renamed from: setIsColdSnsData */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest m37841x861784f2(boolean z17) {
            this.f17803x35e16234 = z17;
            return this;
        }

        /* renamed from: setIsHLSVideo */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest m37842x677fdf18(boolean z17) {
            this.f17804x4b1ad916 = z17;
            return this;
        }

        /* renamed from: setIsHotSnsVideo */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest m37843xc6072c84(boolean z17) {
            this.f17805x75d109c6 = z17;
            return this;
        }

        /* renamed from: setIsLargeSVideo */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest m37844x9ff14217(boolean z17) {
            this.f17806x4fbb1f59 = z17;
            return this;
        }

        /* renamed from: setIsSilentTask */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest m37845x19c995c6(boolean z17) {
            this.f17807x828e0844 = z17;
            return this;
        }

        /* renamed from: setIsSmallVideo */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest m37846x61732600(boolean z17) {
            this.f17808xca37987e = z17;
            return this;
        }

        /* renamed from: setIsStorageMode */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest m37847xdcd3f9f2(boolean z17) {
            this.f17809x8c9dd734 = z17;
            return this;
        }

        /* renamed from: setIs_resume_task */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest m37848x55986bc4(boolean z17) {
            this.f17810x9f0a36c2 = z17;
            return this;
        }

        /* renamed from: setMaxHttpRedirectCount */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest m37849x53feb169(int i17) {
            this.f17812x2bdfc5e7 = i17;
            return this;
        }

        /* renamed from: setMaxPCDNConnections */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest m37850x58226576(int i17) {
            this.f17813xad9a8174 = i17;
            return this;
        }

        /* renamed from: setMsgExtra */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest m37851x28a72391(java.lang.String str) {
            this.f17814xb214850f = str;
            return this;
        }

        /* renamed from: setMsgType */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest m37852x1568b99(int i17) {
            this.f17815x5018025b = i17;
            return this;
        }

        /* renamed from: setPcdnAppID */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest m37853xcf32e4fd(int i17) {
            this.f17817x7371b33f = i17;
            return this;
        }

        /* renamed from: setPreloadMinSize */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest m37854xe7deb42c(long j17) {
            this.f17819x31507f2a = j17;
            return this;
        }

        /* renamed from: setPreloadRatio */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest m37855xf5d8dd04(int i17) {
            this.f17820x5e9d4f82 = i17;
            return this;
        }

        /* renamed from: setQueueTimeoutSeconds */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest m37856x32c4c58d(int i17) {
            this.f17821x8c50294f = i17;
            return this;
        }

        /* renamed from: setQuicTaskParams */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest m37857xd21d214b(com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.QuicTaskParams quicTaskParams) {
            this.f17822x1b8eec49 = quicTaskParams;
            return this;
        }

        /* renamed from: setReferer */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest m37858xf1eb626b(java.lang.String str) {
            this.f17823x40acd92d = str;
            return this;
        }

        /* renamed from: setRequestVideoFlag */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest m37859x4b1b6d3a(java.lang.String str) {
            this.f17825xff4670b8 = str;
            return this;
        }

        /* renamed from: setRequestVideoFormat */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest m37860xf2272a45(int i17) {
            this.f17826x479f4643 = i17;
            return this;
        }

        /* renamed from: setSavePath */
        public void m37861xfb0731c4(java.lang.String str) {
            this.f17829x84749342 = com.p314xaae8f345.p542x3306d5.cdn.C4444x9204715e.m37626x8d65241b(str);
        }

        /* renamed from: setSavePath2 */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest m37862x65df06ee(java.lang.String str) {
            this.f17829x84749342 = com.p314xaae8f345.p542x3306d5.cdn.C4444x9204715e.m37626x8d65241b(str);
            return this;
        }

        /* renamed from: setSerialized_verify_headers */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest m37863xca08cb99(java.lang.String str) {
            this.f17830xaeb6d5db = str;
            return this;
        }

        /* renamed from: setSignalQuality */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest m37864x777bff5(java.lang.String str) {
            this.f17831xb7419d37 = str;
            return this;
        }

        /* renamed from: setSnsCipherKey */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest m37865x886173e(java.lang.String str) {
            this.f17832x714a89bc = str;
            return this;
        }

        /* renamed from: setSnsScene */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest m37866xa4a4b476(java.lang.String str) {
            this.f17833x2e1215f4 = str;
            return this;
        }

        /* renamed from: setSnsVideoStragegy */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest m37867x3d859a25(java.lang.String str) {
            this.f17834xf1b09da3 = str;
            return this;
        }

        /* renamed from: setStatePath */
        public void m37868xdf6b1e14(java.lang.String str) {
            this.f17835x83a9ec56 = com.p314xaae8f345.p542x3306d5.cdn.C4444x9204715e.m37626x8d65241b(str);
        }

        /* renamed from: setStatePath2 */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest m37869xdf8a49e(java.lang.String str) {
            this.f17835x83a9ec56 = com.p314xaae8f345.p542x3306d5.cdn.C4444x9204715e.m37626x8d65241b(str);
            return this;
        }

        /* renamed from: setTaskStartTime */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest m37870x43dafd08(long j17) {
            this.f17840xf3a4da4a = j17;
            return this;
        }

        /* renamed from: setTransforTimeoutSeconds */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest m37871x22aa8061(int i17) {
            this.f17841x86986d5f = i17;
            return this;
        }

        /* renamed from: setUrl */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest m37872xca029dad(java.lang.String str) {
            this.url = str;
            return this;
        }

        /* renamed from: setUseNewdns */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest m37873x32e559ae(boolean z17) {
            this.f17844xd72427f0 = z17;
            return this;
        }

        /* renamed from: setVideoflagPolicy */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest m37874x3a9b1b7(int i17) {
            this.f17846xe8714679 = i17;
            return this;
        }

        /* renamed from: setWifiAutoStart */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest m37875xb607e71c(boolean z17) {
            this.f17847x65d1c45e = z17;
            return this;
        }
    }

    /* renamed from: com.tencent.mars.cdn.CdnManager$C2CDownloadResult */
    /* loaded from: classes12.dex */
    public static class C2CDownloadResult {

        /* renamed from: bizRspPayLoad */
        public byte[] f17857xec1029d2;

        /* renamed from: cdnResultPb */
        public byte[] f17859xa65fa63c;

        /* renamed from: isSnsImageProtocolAvailable */
        public boolean f17885xdf353484;

        /* renamed from: usedSvrIps */
        public java.lang.String[] f17918x7a6a6d5a;

        /* renamed from: errorCode */
        public int f17871x139cb015 = 0;

        /* renamed from: fileType */
        public int f17874xd428dad6 = 0;

        /* renamed from: fileSize */
        public long f17873xd4282b9d = 0;

        /* renamed from: argInfo */
        public java.lang.String f17848xd3933824 = "";

        /* renamed from: fileKey */
        public java.lang.String f17872xcd096f43 = "";

        /* renamed from: fileid */
        public java.lang.String f17875xb4089397 = "";

        /* renamed from: transforMsg */
        public java.lang.String f17913x88d0d6a0 = "";

        /* renamed from: traceMsg */
        public java.lang.String f17912x4bb6fbfc = "";

        /* renamed from: recvedBytes */
        public long f17900x7467a666 = 0;

        /* renamed from: enQueueTime */
        public long f17869xc58d30d5 = 0;

        /* renamed from: startTime */
        public long f17907x81158a4f = 0;

        /* renamed from: endTime */
        public long f17870xa0336a48 = 0;

        /* renamed from: videoFormat */
        public int f17921x27b47052 = 0;

        /* renamed from: videoFlag */
        public java.lang.String f17920x4f6cd287 = "";

        /* renamed from: videoCdnMsg */
        public java.lang.String f17919x21f89c6f = "";

        /* renamed from: lastSvrPort */
        public int f17887x3830c1a = 0;

        /* renamed from: lastNetType */
        public int f17886xde1fa701 = -1;

        /* renamed from: firstRequestCost */
        public int f17878x992a7e2c = 0;

        /* renamed from: firstRequestSize */
        public int f17880x9931ae60 = 0;

        /* renamed from: firstRequestDownloadSize */
        public int f17879xc6cd9808 = 0;

        /* renamed from: firstRequestCompleted */
        public boolean f17877xa0b24b4c = false;

        /* renamed from: averageSpeed */
        public int f17853x49407c2a = 0;

        /* renamed from: averageConnectCost */
        public int f17850xacfdd7a = 0;

        /* renamed from: firstConnectCost */
        public int f17876xbb5f5f07 = 0;

        /* renamed from: netConnectTimes */
        public int f17893x47681ab9 = 0;

        /* renamed from: moovRequestTimes */
        public int f17891x37a7afa0 = 0;

        /* renamed from: moovCost */
        public int f17889xeebcb276 = 0;

        /* renamed from: moovSize */
        public int f17892xeec3e2aa = 0;

        /* renamed from: moovCompleted */
        public boolean f17888x30a73542 = false;

        /* renamed from: moovFailReason */
        public int f17890x5d9a6eb = 0;

        /* renamed from: previousCompletedSize */
        public int f17896xf256b35 = 0;

        /* renamed from: averageRequestSize */
        public int f17852xe8a22cd3 = 0;

        /* renamed from: averageRequestCost */
        public int f17851xe89afc9f = 0;

        /* renamed from: requestTotalCount */
        public int f17903x1fc2181a = 0;

        /* renamed from: requestCompletedCount */
        public int f17901x9cbf39f3 = 0;

        /* renamed from: requestTimeoutCount */
        public int f17902xefb3305d = 0;

        /* renamed from: svrFallbackCount */
        public int f17908xa410551e = 0;

        /* renamed from: httpStatusCode */
        public int f17883xfb9883a7 = 0;

        /* renamed from: httpResponseHeader */
        public java.lang.String f17882xa4c134d6 = "";

        /* renamed from: realUsedURL */
        public java.lang.String f17898xa2b38f4 = "";

        /* renamed from: isResume */
        public boolean f17884xf07ab9f7 = false;

        /* renamed from: dnsCostTime */
        public int f17868xa62c7883 = 0;

        /* renamed from: delayTime */
        public int f17865xe40a06f0 = 0;

        /* renamed from: connectCostTime */
        public int f17861xc9d41b44 = 0;

        /* renamed from: waitResponseCostTime */
        public int f17922xc1a9bb30 = 0;

        /* renamed from: receiveCostTime */
        public int f17899x7b290c3d = 0;

        /* renamed from: serverIP */
        public java.lang.String f17904x523373aa = "";

        /* renamed from: xErrorNo */
        public java.lang.String f17923xbc9e1a51 = "";

        /* renamed from: cSeqCheck */
        public int f17858xa8026d6c = 0;

        /* renamed from: usePrivateProtocol */
        public boolean f17917x7e5038b4 = false;

        /* renamed from: crossNet */
        public boolean f17863x7e8eb13d = false;

        /* renamed from: clientIP */
        public java.lang.String f17860x36253632 = "";

        /* renamed from: picIndex */
        public int f17895xd219ed68 = -1;

        /* renamed from: picCachePath */
        public java.lang.String f17894x3e5d805d = "";

        /* renamed from: batchPicFeedId */
        public java.lang.String f17856x84b9769 = "";

        /* renamed from: batchImageFileKey */
        public java.lang.String f17854x493555c2 = "";

        /* renamed from: batchImageNeedRetry */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.BatchSnsReqImageData[] f17855x6037da71 = null;

        /* renamed from: detailErrorType */
        public int f17867xdfc46411 = 0;

        /* renamed from: detailErrorCode */
        public int f17866xdfbc82c4 = 0;

        /* renamed from: tryWritenBytes */
        public long f17916x14bbac81 = 0;

        /* renamed from: availableBytes */
        public long f17849x83fd9b22 = 0;

        /* renamed from: currentFileSize */
        public long f17864x5a79c436 = 0;

        /* renamed from: systemErrorDescribe */
        public java.lang.String f17909x95056704 = "";

        /* renamed from: transportProtocol */
        public int f17914xebb6b0e1 = 0;

        /* renamed from: transportProtocolError */
        public int f17915xceeb95a7 = 0;

        /* renamed from: fromCronet */
        public boolean f17881x65357807 = false;

        /* renamed from: cronetTaskResult */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.CronetTaskResult f17862xd968619f = null;

        /* renamed from: taskStartTime */
        public long f17910xf3a4da4a = 0;

        /* renamed from: traceId */
        public long f17911xc060bd40 = 0;

        /* renamed from: profile */
        public java.lang.String f17897xed8e89a9 = "";

        /* renamed from: snsVideoProfile */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.SNSVideoProfile f17906x7e4dba46 = null;

        /* renamed from: snsVideoInfo */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoInfo f17905xf2f04131 = null;
    }

    /* renamed from: com.tencent.mars.cdn.CdnManager$C2CUploadRequest */
    /* loaded from: classes12.dex */
    public static class C2CUploadRequest {

        /* renamed from: bizReqPayLoad */
        public byte[] f17926x383344a3;

        /* renamed from: cdnRequestPb */
        public byte[] f17929xbb661734;

        /* renamed from: fileBuffer */
        public byte[] f17940x4e6968dc;

        /* renamed from: files */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.FileInfo[] f17946x5ceba77;

        /* renamed from: serverGroupKey */
        public java.lang.String f17960x2854cbc3;

        /* renamed from: thumbnailBuffer */
        public byte[] f17964x4ad1704c;

        /* renamed from: fileKey */
        public java.lang.String f17942xcd096f43 = "";

        /* renamed from: toUser */
        public java.lang.String f17965xcc36b8e6 = "";

        /* renamed from: debugIP */
        public java.lang.String f17935x5be456ba = "";

        /* renamed from: queueTimeoutSeconds */
        public int f17958x8c50294f = 1800;

        /* renamed from: transforTimeoutSeconds */
        public int f17966x86986d5f = 600;

        /* renamed from: netflowTag */
        public java.lang.String f17957x5af14b4f = "";

        /* renamed from: forwardFileid */
        public java.lang.String f17949xd1c72abc = "";

        /* renamed from: forwardAeskey */
        public java.lang.String f17948xc909d655 = "";

        /* renamed from: sendmsgFromCDN */
        public boolean f17959xb16586ea = false;

        /* renamed from: checkExistOnly */
        public boolean f17931x1b6c0f1b = false;

        /* renamed from: isSmallVideo */
        public boolean f17952xca37987e = false;

        /* renamed from: isLargeSVideo */
        public int f17951x4fbb1f59 = 0;

        /* renamed from: videoSource */
        public int f17970x3de4e076 = 0;

        /* renamed from: isSnsAdVideo */
        public boolean f17953xbbfe764a = false;

        /* renamed from: isStorageMode */
        public boolean f17954x8c9dd734 = false;

        /* renamed from: forceNoSafeCdn */
        public boolean f17947xd5286db4 = false;

        /* renamed from: trySafeCdn */
        public boolean f17968xa3267f25 = true;

        /* renamed from: chatType */
        public int f17930x55ad2ab2 = 0;

        /* renamed from: bigfileSignature */
        public java.lang.String f17925x2e07d19c = "";

        /* renamed from: host */
        public java.lang.String f17950x30f5a8 = "";

        /* renamed from: fileType */
        public int f17944xd428dad6 = 0;

        /* renamed from: filemd5 */
        public java.lang.String f17945xcd09ee82 = "";

        /* renamed from: filePath */
        protected java.lang.String f17943xd426afc1 = "";

        /* renamed from: midimgPath */
        public java.lang.String f17956xd98c0f40 = "";

        /* renamed from: thumbfilePath */
        protected java.lang.String f17963xd9ae2b97 = "";

        /* renamed from: fileFormat */
        public int f17941x54edcc93 = 0;

        /* renamed from: midFormat */
        public int f17955xe432b45f = 0;

        /* renamed from: thumbFileType */
        public int f17962xdd8abacc = 0;

        /* renamed from: enableHitCheck */
        public boolean f17937xc43afbd8 = true;

        /* renamed from: fakeBigfileSignature */
        public java.lang.String f17938x2fd4a311 = "";

        /* renamed from: fakeBigfileSignatureAeskey */
        public java.lang.String f17939x90887da1 = "";

        /* renamed from: statePath */
        public java.lang.String f17961x83a9ec56 = "";

        /* renamed from: concurrentCount */
        public int f17933x81527598 = 1;
        public java.lang.String uri = "";

        /* renamed from: bizid */
        public int f17928x596916e = 0;

        /* renamed from: apptype */
        public int f17924xd0bc10db = 0;

        /* renamed from: emojiExtinfo */
        public java.lang.String f17936x6f675329 = "";

        /* renamed from: tryRealtimeTransportProtocol */
        public boolean f17967xd219dd3b = false;

        /* renamed from: bizSnsPreUpload */
        public boolean f17927xf829bc9f = false;

        /* renamed from: uploadFrom */
        public int f17969xf17cb14b = 0;

        /* renamed from: customHeader */
        public java.lang.String f17934x37c415e = "";

        /* renamed from: clientTag */
        public java.lang.String f17932x8e81bbcf = "";

        /* renamed from: build */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadRequest m37876x59bc66e() {
            int i17;
            int i18 = this.f17928x596916e;
            if (i18 == 0 || i18 == 0 || (i17 = this.f17924xd0bc10db) == -1 || i17 == 0) {
                throw new java.security.InvalidParameterException("must set marscdnBizType,apptype");
            }
            if (this.f17942xcd096f43.isEmpty()) {
                throw new java.security.InvalidParameterException("must set filekey");
            }
            if (this.f17937xc43afbd8) {
                if (this.f17931x1b6c0f1b && (this.f17949xd1c72abc.isEmpty() || this.f17948xc909d655.isEmpty())) {
                    throw new java.security.InvalidParameterException("checkexist must set forwardFileid,forwardAeskey");
                }
                if (!this.f17949xd1c72abc.isEmpty() && this.f17948xc909d655.isEmpty()) {
                    throw new java.security.InvalidParameterException("forwardFileid not empty but forwardAeskey empty");
                }
            }
            return this;
        }

        /* renamed from: setApptype */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadRequest m37877x81fa9a19(int i17) {
            this.f17924xd0bc10db = i17;
            return this;
        }

        /* renamed from: setBigfileSignature */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadRequest m37878x79dcce1e(java.lang.String str) {
            this.f17925x2e07d19c = str;
            return this;
        }

        /* renamed from: setBizid */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadRequest m37879x52c2522c(int i17) {
            this.f17928x596916e = i17;
            return this;
        }

        /* renamed from: setChatType */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadRequest m37880xcc3fc934(int i17) {
            this.f17930x55ad2ab2 = i17;
            return this;
        }

        /* renamed from: setCheckExistOnly */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadRequest m37881xd1fa441d(boolean z17) {
            this.f17931x1b6c0f1b = z17;
            return this;
        }

        /* renamed from: setConcurrentCount */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadRequest m37882x9c8ae0d6(int i17) {
            this.f17933x81527598 = i17;
            return this;
        }

        /* renamed from: setCustomHeader */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadRequest m37883x9ab7cee0(java.lang.String str) {
            this.f17934x37c415e = str;
            return this;
        }

        /* renamed from: setDebugIP */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadRequest m37884xd22dff8(java.lang.String str) {
            this.f17935x5be456ba = str;
            return this;
        }

        /* renamed from: setEmojiExtinfo */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadRequest m37885x6a2e0ab(java.lang.String str) {
            this.f17936x6f675329 = str;
            return this;
        }

        /* renamed from: setEnableHitCheck */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadRequest m37886x7ac930da(boolean z17) {
            this.f17937xc43afbd8 = z17;
            return this;
        }

        /* renamed from: setFakeBigfileSignature */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadRequest m37887x57f38e93(java.lang.String str) {
            this.f17938x2fd4a311 = str;
            return this;
        }

        /* renamed from: setFakeBigfileSignatureAeskey */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadRequest m37888xdf753fa3(java.lang.String str) {
            this.f17939x90887da1 = str;
            return this;
        }

        /* renamed from: setFileBuffer */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadRequest m37889x6ace6ede(byte[] bArr) {
            this.f17940x4e6968dc = bArr;
            return this;
        }

        /* renamed from: setFileKey */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadRequest m37890x7e47f881(java.lang.String str) {
            this.f17942xcd096f43 = str;
            return this;
        }

        /* renamed from: setFilePath */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadRequest m37891x4ab94e43(java.lang.String str) {
            java.lang.String m37626x8d65241b = com.p314xaae8f345.p542x3306d5.cdn.C4444x9204715e.m37626x8d65241b(str);
            this.f17943xd426afc1 = m37626x8d65241b;
            if (m37626x8d65241b == null || m37626x8d65241b.length() <= 0) {
                this.f17943xd426afc1 = "";
            }
            return this;
        }

        /* renamed from: setFilePath2 */
        public void m37892xc707a4f(java.lang.String str) {
            m37891x4ab94e43(str);
        }

        /* renamed from: setFileType */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadRequest m37893x4abb7958(int i17) {
            this.f17944xd428dad6 = i17;
            return this;
        }

        /* renamed from: setFilemd5 */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadRequest m37894x7e4877c0(java.lang.String str) {
            this.f17945xcd09ee82 = str;
            return this;
        }

        /* renamed from: setForceNoSafeCdn */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadRequest m37895x8bb6a2b6(boolean z17) {
            this.f17947xd5286db4 = z17;
            return this;
        }

        /* renamed from: setForwardAeskey */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadRequest m37896x193ff913(java.lang.String str) {
            this.f17948xc909d655 = str;
            return this;
        }

        /* renamed from: setForwardFileid */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadRequest m37897x21fd4d7a(java.lang.String str) {
            this.f17949xd1c72abc = str;
            return this;
        }

        /* renamed from: setHost */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadRequest m37898x764b252a(java.lang.String str) {
            this.f17950x30f5a8 = str;
            return this;
        }

        /* renamed from: setIsLargeSVideo */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadRequest m37899x9ff14217(int i17) {
            this.f17951x4fbb1f59 = i17;
            return this;
        }

        /* renamed from: setIsSmallVideo */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadRequest m37900x61732600(boolean z17) {
            this.f17952xca37987e = z17;
            return this;
        }

        /* renamed from: setIsSnsAdVideo */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadRequest m37901x533a03cc(boolean z17) {
            this.f17953xbbfe764a = z17;
            return this;
        }

        /* renamed from: setIsStorageMode */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadRequest m37902xdcd3f9f2(boolean z17) {
            this.f17954x8c9dd734 = z17;
            return this;
        }

        /* renamed from: setMidimgPath */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadRequest m37903xf5f11542(java.lang.String str) {
            java.lang.String m37626x8d65241b = com.p314xaae8f345.p542x3306d5.cdn.C4444x9204715e.m37626x8d65241b(str);
            this.f17956xd98c0f40 = m37626x8d65241b;
            if (m37626x8d65241b == null || m37626x8d65241b.length() <= 0) {
                this.f17956xd98c0f40 = "";
            }
            return this;
        }

        /* renamed from: setQueueTimeoutSeconds */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadRequest m37904x32c4c58d(int i17) {
            this.f17958x8c50294f = i17;
            return this;
        }

        /* renamed from: setSendmsgFromCDN */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadRequest m37905x67f3bbec(boolean z17) {
            this.f17959xb16586ea = z17;
            return this;
        }

        /* renamed from: setStatePath */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadRequest m37906xdf6b1e14(java.lang.String str) {
            this.f17961x83a9ec56 = str;
            return this;
        }

        /* renamed from: setThumbfilePath */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadRequest m37907x29e44e55(java.lang.String str) {
            java.lang.String m37626x8d65241b = com.p314xaae8f345.p542x3306d5.cdn.C4444x9204715e.m37626x8d65241b(str);
            this.f17963xd9ae2b97 = m37626x8d65241b;
            if (m37626x8d65241b == null || m37626x8d65241b.length() <= 0) {
                this.f17963xd9ae2b97 = "";
            }
            return this;
        }

        /* renamed from: setThumbnailBuffer */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadRequest m37908x6609db8a(byte[] bArr) {
            this.f17964x4ad1704c = bArr;
            return this;
        }

        /* renamed from: setToUser */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadRequest m37909x24830fe8(java.lang.String str) {
            this.f17965xcc36b8e6 = str;
            return this;
        }

        /* renamed from: setTransforTimeoutSeconds */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadRequest m37910x22aa8061(int i17) {
            this.f17966x86986d5f = i17;
            return this;
        }

        /* renamed from: setTrySafeCdn */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadRequest m37911xbf8b8527(boolean z17) {
            this.f17968xa3267f25 = z17;
            return this;
        }

        /* renamed from: setVideoSource */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadRequest m37912xae209ab4(int i17) {
            this.f17970x3de4e076 = i17;
            return this;
        }
    }

    /* renamed from: com.tencent.mars.cdn.CdnManager$C2CUploadResult */
    /* loaded from: classes12.dex */
    public static class C2CUploadResult {

        /* renamed from: bizRspPayLoad */
        public byte[] f17972xec1029d2;

        /* renamed from: cdnResultPb */
        public byte[] f17973xa65fa63c;

        /* renamed from: usedSvrIps */
        public java.lang.String[] f18007x7a6a6d5a;

        /* renamed from: errorCode */
        public int f17981x139cb015 = 0;

        /* renamed from: filetype */
        public int f17988xd43766b6 = 0;

        /* renamed from: touser */
        public java.lang.String f18002xcc4544c6 = "";

        /* renamed from: fileid */
        public java.lang.String f17986xb4089397 = "";

        /* renamed from: aeskey */
        public java.lang.String f17971xab4b3f30 = "";

        /* renamed from: filemd5 */
        public java.lang.String f17987xcd09ee82 = "";

        /* renamed from: thumbfilemd5 */
        public java.lang.String f18001x51589fec = "";

        /* renamed from: mp4identifymd5 */
        public java.lang.String f17993x666b9361 = "";

        /* renamed from: transforMsg */
        public java.lang.String f18003x88d0d6a0 = "";

        /* renamed from: fileSize */
        public long f17984xd4282b9d = 0;

        /* renamed from: midfileSize */
        public int f17992x566309e5 = 0;

        /* renamed from: thumbfileSize */
        public int f17999xd9afa773 = 0;

        /* renamed from: hitCache */
        public int f17989xafb86faf = 0;

        /* renamed from: isVideoReduced */
        public boolean f17991xa713d0d = false;

        /* renamed from: sendmsgFromCDN */
        public boolean f17995xb16586ea = false;

        /* renamed from: existOnSvr */
        public boolean f17982xa545f59 = false;

        /* renamed from: skeyrespbuf */
        public byte[] f17997xd7456617 = null;

        /* renamed from: videofileid */
        public java.lang.String f18008x5df81fd2 = "";

        /* renamed from: fileUrl */
        public java.lang.String f17985xcd099653 = "";

        /* renamed from: thumbfileUrl */
        public java.lang.String f18000x515847bd = "";

        /* renamed from: emojiMD5 */
        public java.lang.String f17980x454e7b78 = "";

        /* renamed from: fileCrc32 */
        public int f17983xafff8b17 = 0;

        /* renamed from: uploadBySafecdn */
        public boolean f18006xd4000828 = false;

        /* renamed from: isResume */
        public boolean f17990xf07ab9f7 = false;

        /* renamed from: delayTime */
        public int f17977xe40a06f0 = 0;

        /* renamed from: connectCostTime */
        public int f17975xc9d41b44 = 0;

        /* renamed from: waitResponseCostTime */
        public int f18009xc1a9bb30 = 0;

        /* renamed from: receiveCostTime */
        public int f17994x7b290c3d = 0;

        /* renamed from: serverIP */
        public java.lang.String f17996x523373aa = "";

        /* renamed from: crossNet */
        public boolean f17976x7e8eb13d = false;

        /* renamed from: clientIP */
        public java.lang.String f17974x36253632 = "";

        /* renamed from: detailErrorType */
        public int f17979xdfc46411 = 0;

        /* renamed from: detailErrorCode */
        public int f17978xdfbc82c4 = 0;

        /* renamed from: systemErrorDescribe */
        public java.lang.String f17998x95056704 = "";

        /* renamed from: transportProtocol */
        public int f18004xebb6b0e1 = 0;

        /* renamed from: transportProtocolError */
        public int f18005xceeb95a7 = 0;
    }

    /* renamed from: com.tencent.mars.cdn.CdnManager$CdnInfo */
    /* loaded from: classes12.dex */
    public static class CdnInfo {
        public int ver = 0;
        public int uin = 0;

        /* renamed from: nettype */
        public int f18015x6de02257 = 0;

        /* renamed from: frontid */
        public int f18011xdc940504 = 0;

        /* renamed from: zoneid */
        public int f18016xd67ef5c7 = 0;

        /* renamed from: authkey */
        public byte[] f18010xd976ffb7 = null;

        /* renamed from: frontip1 */
        public java.lang.String f18012xb5ec9d21 = null;

        /* renamed from: frontip2 */
        public java.lang.String f18013xb5ec9d22 = null;

        /* renamed from: zoneip1 */
        public java.lang.String f18017xf95fc4be = null;

        /* renamed from: zoneip2 */
        public java.lang.String f18018xf95fc4bf = null;

        /* renamed from: frontports */
        public int[] f18014xed9d0b89 = null;

        /* renamed from: zoneports */
        public int[] f18019x20e4bfe6 = null;
    }

    /* renamed from: com.tencent.mars.cdn.CdnManager$CdnInfoParams */
    /* loaded from: classes8.dex */
    public static class CdnInfoParams {

        /* renamed from: c2CshowErrorDelayMs */
        public int f18022x229408f2 = 0;

        /* renamed from: snsshowErrorDelayMs */
        public int f18025x2f44c476 = 0;

        /* renamed from: c2CretryIntervalMs */
        public int f18020xe7f97d9f = 0;

        /* renamed from: snsretryIntervalMs */
        public int f18023x6441419b = 0;

        /* renamed from: c2CrwtimeoutMs */
        public int f18021xd0e737ce = 0;

        /* renamed from: snsrwtimeoutMs */
        public int f18024x46c859ca = 0;
    }

    /* renamed from: com.tencent.mars.cdn.CdnManager$CdnTaskStateInfo */
    /* loaded from: classes8.dex */
    public static class CdnTaskStateInfo {

        /* renamed from: kCompleted */
        public static final int f18026x3e855e20 = 104;

        /* renamed from: kNotExits */
        public static final int f18027x5900658d = 103;

        /* renamed from: kPausing */
        public static final int f18028x9f3cf648 = 102;

        /* renamed from: kRunning */
        public static final int f18029x2ac56ed4 = 100;

        /* renamed from: kWaiting */
        public static final int f18030x10dfef62 = 101;

        /* renamed from: taskState */
        public int f18033xa1f4a0c = -100;

        /* renamed from: completeSize */
        public long f18031xe78f40da = 0;

        /* renamed from: fileTotalSize */
        public long f18032xb68f8349 = 0;
    }

    /* renamed from: com.tencent.mars.cdn.CdnManager$CertificateVerifyPolicy */
    /* loaded from: classes4.dex */
    public static class CertificateVerifyPolicy {

        /* renamed from: kIngoreError */
        public static final int f18034x95128cbd = 2;

        /* renamed from: kNoVerify */
        public static final int f18035x278f3725 = 0;

        /* renamed from: kStrictVerify */
        public static final int f18036xfcafe4ad = 1;
    }

    /* renamed from: com.tencent.mars.cdn.CdnManager$Config */
    /* loaded from: classes12.dex */
    public static class Config {

        /* renamed from: EnableSafeCDN */
        public int f18038xe117f63d = 0;

        /* renamed from: EnableSnsStreamDownload */
        public int f18040x8507dc5d = 0;

        /* renamed from: EnableSnsImageDownload */
        public int f18039xf73e102e = 0;

        /* renamed from: ApprovedVideoHosts */
        public java.lang.String f18037xdfa9647 = com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.f17654x5147be48;

        /* renamed from: QuicExptValues */
        public java.lang.String f18042x905d42f7 = "";

        /* renamed from: MiscellaneousExptValues */
        public java.lang.String f18041x3148f467 = "";

        /* renamed from: toString */
        public java.lang.String m37913x9616526c() {
            return java.lang.String.format("safecdn:%d,snsstream:%d,snsimage:%d", java.lang.Integer.valueOf(this.f18038xe117f63d), java.lang.Integer.valueOf(this.f18040x8507dc5d), java.lang.Integer.valueOf(this.f18039xf73e102e));
        }
    }

    /* renamed from: com.tencent.mars.cdn.CdnManager$CronetTaskResult */
    /* loaded from: classes12.dex */
    public static class CronetTaskResult {

        /* renamed from: useQuic */
        public boolean f18047xf72c4065 = false;

        /* renamed from: useHttp2 */
        public boolean f18046xeddcaf63 = false;

        /* renamed from: statusText */
        public java.lang.String f18045xec8403f = "";

        /* renamed from: statusCode */
        public int f18044xec0a8ff = 0;

        /* renamed from: performance */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.WebPageProfile f18043xa7c31030 = null;
    }

    /* renamed from: com.tencent.mars.cdn.CdnManager$DownloadBehavior */
    /* loaded from: classes4.dex */
    public static class DownloadBehavior {

        /* renamed from: kUserRequest */
        public static final int f18048xc9fa9ad9 = 0;

        /* renamed from: kViaClientAutoStart */
        public static final int f18049xbd561645 = 4;

        /* renamed from: kViaClientSync */
        public static final int f18050xd2c38509 = 3;

        /* renamed from: kViaServerNoQuota */
        public static final int f18051xd4cd7591 = 1;

        /* renamed from: kViaServerQuota */
        public static final int f18052x62b25152 = 2;
    }

    /* renamed from: com.tencent.mars.cdn.CdnManager$DownloadCallback */
    /* loaded from: classes4.dex */
    public interface DownloadCallback {
        /* renamed from: onC2CDownloadCompleted */
        void mo562xf8a76f8e(java.lang.String str, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadResult c2CDownloadResult);

        /* renamed from: onDownloadCanceled */
        default void m37914x84b35d40(java.lang.String str) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.TAG, "onDownloadCanceled:" + str);
        }

        /* renamed from: onDownloadNotifyPeerUploadFinish */
        default void mo37915x4b1e5646(java.lang.String str, boolean z17, long j17) {
        }

        /* renamed from: onDownloadProgressChanged */
        void mo563x617c4940(java.lang.String str, long j17, long j18, boolean z17);
    }

    /* renamed from: com.tencent.mars.cdn.CdnManager$DownloadCallbackV2 */
    /* loaded from: classes8.dex */
    public interface DownloadCallbackV2 {
        /* renamed from: onCanceled */
        void m37916x9dc2a798(java.lang.String str);

        /* renamed from: onCompleted */
        void m37917xaa8b332c(java.lang.String str, byte[] bArr);

        /* renamed from: onProgressChanged */
        void m37918x95ed2be8(java.lang.String str, long j17, long j18);
    }

    /* renamed from: com.tencent.mars.cdn.CdnManager$DownloadInfo */
    /* loaded from: classes10.dex */
    public static class DownloadInfo {

        /* renamed from: recvedBytes */
        public long f18055x7467a666 = 0;

        /* renamed from: transforMS */
        public long f18056x990efe87 = 0;

        /* renamed from: beginTickcount */
        public long f18053x2584cee9 = 0;

        /* renamed from: endTickcount */
        public long f18054xe321d6f7 = 0;
    }

    /* renamed from: com.tencent.mars.cdn.CdnManager$DownloadTaskProfile */
    /* loaded from: classes6.dex */
    public static class DownloadTaskProfile {
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.Transfor cdn;

        /* renamed from: overall */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.Transfor f18057xbef41c4d;

        /* renamed from: pcdn */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.Transfor f18058x3469bd;

        /* renamed from: redirect */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.Transfor f18059xd1bcf7dc;
    }

    /* renamed from: com.tencent.mars.cdn.CdnManager$FileInfo */
    /* loaded from: classes12.dex */
    public static class FileInfo {

        /* renamed from: buffer */
        public java.lang.String f18060xaddb9440;

        /* renamed from: md5, reason: collision with root package name */
        public java.lang.String f134054md5;

        /* renamed from: mp4md5 */
        public java.lang.String f18063xc043cced;

        /* renamed from: path */
        public java.lang.String f18064x346425;

        /* renamed from: type */
        public int f18066x368f3a = 0;

        /* renamed from: format */
        public int f18062xb45ff7f7 = 0;

        /* renamed from: compress */
        public int f18061xdc47eb62 = 0;

        /* renamed from: size */
        public long f18065x35e001 = 0;
    }

    /* renamed from: com.tencent.mars.cdn.CdnManager$GetCdnScene */
    /* loaded from: classes4.dex */
    public static class GetCdnScene {

        /* renamed from: GET_CDN_AUTH */
        public static final int f18067x38f16583 = 1;

        /* renamed from: GET_CDN_CHECK */
        public static final int f18068xe551586d = 4;

        /* renamed from: GET_CDN_DEFAULT */
        public static final int f18069x6320066 = 0;

        /* renamed from: GET_CDN_IGNORE_FETCH_RETRY */
        public static final int f18070x1bbe1a51 = 6;

        /* renamed from: GET_CDN_MARS_CACHE_EXPIRED */
        public static final int f18071xc38fbd9 = 9;

        /* renamed from: GET_CDN_MARS_SVR_REQUEST */
        public static final int f18072xc7fa0d70 = 8;

        /* renamed from: GET_CDN_MARS_TIMING_FETCH */
        public static final int f18073xd63af94 = 7;

        /* renamed from: GET_CDN_NETWORK_CHANGE */
        public static final int f18074x9c1f8d1c = 2;

        /* renamed from: GET_CDN_NETWORK_CHANGE_RETRY */
        public static final int f18075x770d5a5 = 3;

        /* renamed from: GET_CDN_TEST */
        public static final int f18076x38f9cc6d = 5;

        /* renamed from: GET_CDN_USER_ATTRIBUTE_CHANGED */
        public static final int f18077x4c141378 = 10;
    }

    /* renamed from: com.tencent.mars.cdn.CdnManager$HostIPHint */
    /* loaded from: classes4.dex */
    public static class HostIPHint {

        /* renamed from: hostMap */
        public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.HostIpMap[] f18078x417c7694;
    }

    /* renamed from: com.tencent.mars.cdn.CdnManager$HostIpMap */
    /* loaded from: classes6.dex */
    public static class HostIpMap {

        /* renamed from: host */
        public java.lang.String f18079x30f5a8;

        /* renamed from: ip, reason: collision with root package name */
        public java.lang.String f134055ip;

        /* renamed from: port */
        public int f18080x349881;
    }

    /* renamed from: com.tencent.mars.cdn.CdnManager$MoovFailReason */
    /* loaded from: classes4.dex */
    public static class MoovFailReason {

        /* renamed from: kIllegalBoxSize */
        public static final int f18081x4567fd61 = 4;

        /* renamed from: kNotMP4Video */
        public static final int f18082xd41f1672 = 2;

        /* renamed from: kReadFileFailed */
        public static final int f18083xe00d505a = 1;

        /* renamed from: kTooManyBox */
        public static final int f18084x4d0a71c3 = 5;

        /* renamed from: kZeroBoxSize */
        public static final int f18085x69440739 = 3;
    }

    /* renamed from: com.tencent.mars.cdn.CdnManager$PCDNAppID */
    /* loaded from: classes4.dex */
    public static class PCDNAppID {

        /* renamed from: kFinderVideo */
        public static final int f18086xf909a8a = 30001;

        /* renamed from: kGame */
        public static final int f18087x60592fd = 30003;

        /* renamed from: kPatch */
        public static final int f18088xbb2bba9d = 30002;

        /* renamed from: kStoriesVideo */
        public static final int f18089xdcaa0bf3 = 30004;
    }

    /* renamed from: com.tencent.mars.cdn.CdnManager$SNSVideoProfile */
    /* loaded from: classes12.dex */
    public static class SNSVideoProfile {

        /* renamed from: strategy */
        public java.lang.String f18092x6a8fa373;

        /* renamed from: mode */
        public int f18091x3339a3 = 0;

        /* renamed from: useColdRule */
        public boolean f18093x26395aa7 = false;

        /* renamed from: usedProvince */
        public int f18094x7ba06e0d = 0;

        /* renamed from: experimentalGroupID */
        public int f18090xf13441d2 = 0;
    }

    /* renamed from: com.tencent.mars.cdn.CdnManager$SessionCallback */
    /* loaded from: classes6.dex */
    public interface SessionCallback {
        /* renamed from: decodeSessionResponseBuf */
        byte[] mo37919x40b4b88a(java.lang.String str, byte[] bArr);

        /* renamed from: getSessionRequestBuf */
        byte[] mo37920xff52f7e4(java.lang.String str, byte[] bArr);
    }

    /* renamed from: com.tencent.mars.cdn.CdnManager$SnsUploadVersion */
    /* loaded from: classes4.dex */
    public static class SnsUploadVersion {

        /* renamed from: kVersion100M */
        public static final int f18095xc3abb7e9 = 1;

        /* renamed from: kVersion30M */
        public static final int f18096x8a70ec83 = 0;
    }

    /* renamed from: com.tencent.mars.cdn.CdnManager$SpeedType */
    /* loaded from: classes4.dex */
    public static class SpeedType {

        /* renamed from: stDownload */
        public static final int f18097x44f54a09 = 2;

        /* renamed from: stUpload */
        public static final int f18098x39e2fbc2 = 1;
    }

    /* renamed from: com.tencent.mars.cdn.CdnManager$Transfor */
    /* loaded from: classes6.dex */
    public static class Transfor {

        /* renamed from: connCostMs */
        public int f18099x9868849f = 0;

        /* renamed from: transCostMs */
        public int f18104x4d183b1b = 0;

        /* renamed from: recvedBytes */
        public long f18102x7467a666 = 0;

        /* renamed from: speedKps */
        public int f18103x80f86de7 = 0;

        /* renamed from: errType */
        public int f18101xa7cc523f = 0;

        /* renamed from: errCode */
        public int f18100xa7c470f2 = 0;
    }

    /* renamed from: com.tencent.mars.cdn.CdnManager$TransportProtocol */
    /* loaded from: classes6.dex */
    public static class TransportProtocol {

        /* renamed from: HTTP */
        public static final int f18105x220088 = 1;

        /* renamed from: HTTP3 */
        public static final int f18106x41e10ab = 4;

        /* renamed from: HTTPS */
        public static final int f18107x41e10cb = 2;

        /* renamed from: QUIC */
        public static final int f18108x261a3e = 3;
        public static final int TCP = 0;
    }

    /* renamed from: com.tencent.mars.cdn.CdnManager$UploadCallback */
    /* loaded from: classes8.dex */
    public interface UploadCallback {
        /* renamed from: onC2CUploadCompleted */
        void mo37921xa24580f5(java.lang.String str, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadResult c2CUploadResult);

        /* renamed from: onUploadCanceled */
        default void m37922x7ab0d79(java.lang.String str) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.TAG, "onUploadCanceled:" + str);
        }

        /* renamed from: onUploadProgressChanged */
        void mo37923xdaa196e7(java.lang.String str, long j17, long j18);
    }

    /* renamed from: com.tencent.mars.cdn.CdnManager$UploadCallbackV2 */
    /* loaded from: classes8.dex */
    public interface UploadCallbackV2 {
        /* renamed from: onCanceled */
        void mo37924x9dc2a798(java.lang.String str);

        /* renamed from: onCompleted */
        void mo37925xaa8b332c(java.lang.String str, byte[] bArr);

        /* renamed from: onProgressChanged */
        void mo37926x95ed2be8(java.lang.String str, long j17, long j18);
    }

    /* renamed from: com.tencent.mars.cdn.CdnManager$VideoFlagPolicy */
    /* loaded from: classes4.dex */
    public static class VideoFlagPolicy {

        /* renamed from: kVideoFlagAuto */
        public static final int f18109xe793fe2b = 0;

        /* renamed from: kVideoFlagMustMatch */
        public static final int f18110x5fdd4240 = 1;
    }

    /* renamed from: com.tencent.mars.cdn.CdnManager$VideoStreamingCallback */
    /* loaded from: classes12.dex */
    public interface VideoStreamingCallback {
        /* renamed from: onDataAvailable */
        void mo37930x9bb59ea0(java.lang.String str, long j17, long j18);

        /* renamed from: onDownloadToEnd */
        void mo37931x34576d19(java.lang.String str, long j17, long j18);

        /* renamed from: onM3U8Ready */
        void mo37932xc5dd699b(java.lang.String str, java.lang.String str2);

        /* renamed from: onMoovReady */
        void mo37933xe7d268fb(java.lang.String str, long j17, long j18, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoInfo videoInfo);

        /* renamed from: onMoovReadyWithFlag */
        void mo37934xedc4f36d(java.lang.String str, long j17, long j18, java.lang.String str2);

        /* renamed from: onObtainMoovFailed */
        void mo37935x6e07772a(java.lang.String str, int i17);

        /* renamed from: onPreloadCompletedWithResult */
        void mo37936x23ba0da4(java.lang.String str, long j17, long j18, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadResult c2CDownloadResult);
    }

    public C4446x11b6e6e0(long j17) {
        m37678x578be34(j17);
    }

    /* renamed from: createC2CBigfileDownload */
    public static com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest m37638x7c4510ac(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        return new com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest().m37833x7e47f881(str).m37835xc54ea99(str4).m37813x3979632(str5).m37820x52c2522c(1).m37815x81fa9a19(1).m37834x4abb7958(7).m37829x57f38e93(str2).m37830xdf753fa3(str3).m37862x65df06ee(str6).m37812x59bc66e();
    }

    /* renamed from: createC2CBigfileUpload */
    public static com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadRequest m37639x86aa0f25(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        return new com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadRequest().m37890x7e47f881(str).m37879x52c2522c(1).m37877x81fa9a19(1).m37893x4abb7958(7).m37887x57f38e93(str2).m37888xdf753fa3(str3).m37911xbf8b8527(true).m37891x4ab94e43(str4).m37876x59bc66e();
    }

    /* renamed from: createC2CDownload */
    public static com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest m37640x9ec64400(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4) {
        return new com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest().m37833x7e47f881(str).m37835xc54ea99(str2).m37813x3979632(str3).m37820x52c2522c(1).m37815x81fa9a19(1).m37834x4abb7958(i17).m37862x65df06ee(str4).m37812x59bc66e();
    }

    /* renamed from: createC2CExistCheck */
    public static com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadRequest m37641x966349c9(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3) {
        return new com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadRequest().m37890x7e47f881(str).m37879x52c2522c(1).m37877x81fa9a19(1).m37893x4abb7958(i17).m37897x21fd4d7a(str2).m37896x193ff913(str3).m37886x7ac930da(true).m37881xd1fa441d(true).m37876x59bc66e();
    }

    /* renamed from: createC2CSSUpload */
    public static com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadRequest m37642xb1e0d3d9(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadRequest c2CUploadRequest) {
        return c2CUploadRequest.m37905x67f3bbec(true).m37876x59bc66e();
    }

    /* renamed from: createC2CUpload */
    public static com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadRequest m37644xb8c80779(java.lang.String str, int i17, java.lang.String str2) {
        return new com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadRequest().m37890x7e47f881(str).m37879x52c2522c(1).m37877x81fa9a19(1).m37893x4abb7958(i17).m37891x4ab94e43(str2).m37876x59bc66e();
    }

    /* renamed from: createC2CVideoDownload */
    public static com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest m37647xff4185ab(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest c2CDownloadRequest, int i17, int i18) {
        return c2CDownloadRequest.m37860xf2272a45(i17).m37874x3a9b1b7(i18).m37812x59bc66e();
    }

    /* renamed from: createCircleSearchUpload */
    public static com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadRequest m37648xa30770d5(java.lang.String str, java.lang.String str2) {
        return new com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadRequest().m37890x7e47f881(str).m37879x52c2522c(5).m37877x81fa9a19(12).m37893x4abb7958(2).m37891x4ab94e43(str2).m37876x59bc66e();
    }

    /* renamed from: createFavDownload */
    public static com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest m37649xc0923e27(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4) {
        return new com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest().m37833x7e47f881(str).m37835xc54ea99(str2).m37813x3979632(str3).m37820x52c2522c(2).m37815x81fa9a19(10).m37834x4abb7958(i17).m37847xdcd3f9f2(true).m37862x65df06ee(str4).m37812x59bc66e();
    }

    /* renamed from: createFavUpload */
    public static com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadRequest m37650x11ca5f60(java.lang.String str, int i17, java.lang.String str2) {
        return new com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadRequest().m37890x7e47f881(str).m37879x52c2522c(2).m37877x81fa9a19(10).m37902xdcd3f9f2(true).m37893x4abb7958(i17).m37891x4ab94e43(str2).m37886x7ac930da(false).m37876x59bc66e();
    }

    /* renamed from: createFinderImageUpload */
    public static com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadRequest m37651xed68e59a(java.lang.String str, java.lang.String str2) {
        return new com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadRequest().m37890x7e47f881(str).m37879x52c2522c(3).m37877x81fa9a19(251).m37893x4abb7958(20304).m37891x4ab94e43(str2).m37876x59bc66e();
    }

    /* renamed from: createFinderVideoUpload */
    public static com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadRequest m37652xa9e978ba(java.lang.String str, java.lang.String str2) {
        return new com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadRequest().m37890x7e47f881(str).m37879x52c2522c(3).m37877x81fa9a19(251).m37893x4abb7958(20302).m37891x4ab94e43(str2).m37876x59bc66e();
    }

    /* renamed from: createFreshC2CUpload */
    public static com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadRequest m37653x9b3f0ba3(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadRequest c2CUploadRequest) {
        return c2CUploadRequest.m37886x7ac930da(false).m37876x59bc66e();
    }

    /* renamed from: createFriendsImageUpload */
    public static com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadRequest m37654xaa6d8883(java.lang.String str, java.lang.String str2) {
        return new com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadRequest().m37890x7e47f881(str).m37879x52c2522c(3).m37877x81fa9a19(100).m37893x4abb7958(20201).m37891x4ab94e43(str2).m37876x59bc66e();
    }

    /* renamed from: createFriendsVideoUpload */
    public static com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadRequest m37655x66ee1ba3(java.lang.String str, java.lang.String str2) {
        return new com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadRequest().m37890x7e47f881(str).m37879x52c2522c(3).m37877x81fa9a19(100).m37893x4abb7958(20202).m37891x4ab94e43(str2).m37876x59bc66e();
    }

    /* renamed from: createGroupNoticeDownload */
    public static com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest m37656xbd589143(java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest m37813x3979632 = m37659xe960bf84(str, str2, i17, i18, str3).m37813x3979632(str4);
        if (str5 != null) {
            m37813x3979632.m37865x886173e(str5);
        }
        return m37813x3979632;
    }

    /* renamed from: createGroupNoticeUpload */
    public static com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadRequest m37657x7b02c97c(java.lang.String str, int i17, int i18, java.lang.String str2, java.lang.String str3) {
        return m37660xa81393fd(str, i17, i18, str2).m37896x193ff913(str3);
    }

    /* renamed from: createHLSVideoDownload */
    public static com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest m37658xa5403f90(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest c2CDownloadRequest, java.lang.String str, int i17) {
        return c2CDownloadRequest.m37842x677fdf18(true).m37836xbbee8da(str).m37874x3a9b1b7(i17).m37812x59bc66e();
    }

    /* renamed from: createSNSDownload */
    public static com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest m37659xe960bf84(java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.String str3) {
        return new com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest().m37833x7e47f881(str).m37872xca029dad(str2).m37820x52c2522c(3).m37815x81fa9a19(i17).m37834x4abb7958(i18).m37862x65df06ee(str3).m37812x59bc66e();
    }

    /* renamed from: createSNSUpload */
    public static com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadRequest m37660xa81393fd(java.lang.String str, int i17, int i18, java.lang.String str2) {
        return new com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadRequest().m37890x7e47f881(str).m37879x52c2522c(3).m37877x81fa9a19(i17).m37893x4abb7958(i18).m37891x4ab94e43(str2).m37876x59bc66e();
    }

    /* renamed from: createSNSVideoDownload */
    public static com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest m37661xa3b9ca7(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest c2CDownloadRequest, java.lang.String str, int i17) {
        return c2CDownloadRequest.m37859x4b1b6d3a(str).m37874x3a9b1b7(i17).m37812x59bc66e();
    }

    /* renamed from: makeVideoPreload */
    public static com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest m37662x86ade61c(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest c2CDownloadRequest, int i17, long j17) {
        return c2CDownloadRequest.m37855xf5d8dd04(i17).m37854xe7deb42c(j17).m37826xd9537fcd(2).m37812x59bc66e();
    }

    /* renamed from: makeVideoStreaming */
    public static com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest m37663xc25bd7b5(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest c2CDownloadRequest) {
        return c2CDownloadRequest.m37826xd9537fcd(1).m37812x59bc66e();
    }

    /* renamed from: withAesEcbDecrypt */
    public static com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest m37664xaa06fc72(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest c2CDownloadRequest, java.lang.String str) {
        return c2CDownloadRequest.m37813x3979632(str).m37812x59bc66e();
    }

    /* renamed from: withAeskey */
    public static com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadRequest m37665x6275af96(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadRequest c2CUploadRequest, java.lang.String str) {
        return c2CUploadRequest.m37896x193ff913(str).m37876x59bc66e();
    }

    /* renamed from: withDebugIP */
    public static com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadRequest m37666x8a07f314(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadRequest c2CUploadRequest, java.lang.String str) {
        return c2CUploadRequest.m37884xd22dff8(str).m37876x59bc66e();
    }

    /* renamed from: withTimeout */
    public static com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadRequest m37667xdfd2e9bb(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadRequest c2CUploadRequest, int i17) {
        return c2CUploadRequest.m37910x22aa8061(i17).m37876x59bc66e();
    }

    /* renamed from: withXorDecrypt */
    public static com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest m37668xf98e218(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest c2CDownloadRequest, java.lang.String str) {
        return c2CDownloadRequest.m37865x886173e(str).m37812x59bc66e();
    }

    /* renamed from: OnJniAllowBatchImageDownload */
    public native boolean m37669x60a6390c();

    /* renamed from: OnJniCalcFileCrc32 */
    public native int m37670x8d59d8bc(java.lang.String str);

    /* renamed from: OnJniCalcFileMD5 */
    public native java.lang.String m37671x9774e567(java.lang.String str);

    /* renamed from: OnJniCalcMP4IdentifyMD5 */
    public native java.lang.String m37672xe311609c(java.lang.String str);

    /* renamed from: OnJniCancelDownloadTaskWithResult */
    public native int m37673xdd2435f0(java.lang.String str, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadResult c2CDownloadResult);

    /* renamed from: OnJniCancelTask */
    public native void m37674x16894e5(java.lang.String str);

    /* renamed from: OnJniCancelUploadTaskWithResult */
    public native int m37675x1a104ba9(java.lang.String str, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadResult c2CUploadResult);

    /* renamed from: OnJniCreateAeskey */
    public native java.lang.String m37676xf15b4f92();

    /* renamed from: OnJniCreateCdnManagerFromContext */
    public native void m37677xb90ae723(java.lang.Object obj);

    /* renamed from: OnJniCreateCdnManagerFromHandle */
    public native void m37678x578be34(long j17);

    /* renamed from: OnJniCreateUniqueFilekey */
    public native java.lang.String m37679xc4c053b0(java.lang.String str, java.lang.String str2);

    /* renamed from: OnJniDestroyCdnManager */
    public native void m37680xbc61d4();

    /* renamed from: OnJniGetRecentAverageSpeed */
    public native int m37681x44588695(int i17);

    /* renamed from: OnJniGetRecentAverageSpeed2 */
    public native int m37682x46b84c3d(int i17, int i18);

    /* renamed from: OnJniGetRecentConnectRecords */
    public native com.p314xaae8f345.p542x3306d5.mm.C4564xe93729bb[] m37683xea65da3(int i17, int i18);

    /* renamed from: OnJniGetRecentDownloadInfo */
    public native com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.DownloadInfo m37684x3d2e27c1(int i17, int i18, int i19);

    /* renamed from: OnJniGetSnsImagePrivateProtocolAvalible */
    public native boolean m37685x2a43c11a();

    /* renamed from: OnJniGetTaskRecentAverageSpeed */
    public native int m37686x83ae48fa(java.lang.String str, int i17, int i18);

    /* renamed from: OnJniHttpMultiSocketDownloadTaskState */
    public native com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.CdnTaskStateInfo m37687x172d53a6(java.lang.String str);

    /* renamed from: OnJniIsVideoDataAvailable */
    public native boolean m37688x25765294(java.lang.String str, long j17, long j18);

    /* renamed from: OnJniMarkVideoBufferingStatus */
    public native void m37689xccd91dec(java.lang.String str, int i17);

    /* renamed from: OnJniOnCreate */
    public native void m37690xfcb4bb01(java.lang.String str, java.lang.String str2, boolean z17);

    /* renamed from: OnJniPauseHttpMultiSocketDownloadTask */
    public native int m37691x7ec3a221(java.lang.String str);

    /* renamed from: OnJniQueryAvailableQuota */
    public native long[] m37692xe4e71511();

    /* renamed from: OnJniQueryCdnFlowInfo */
    public native byte[] m37693x675859a7();

    /* renamed from: OnJniQueryCdnTaskStateInfo */
    public native byte[] m37694x4248e90f(java.lang.String str);

    /* renamed from: OnJniQueryContinuousSize */
    public native int m37695x90a0392(java.lang.String str, long j17, long[] jArr);

    /* renamed from: OnJniQueryDownloadedSize */
    public native int m37696xa44e37aa(java.lang.String str, long[] jArr);

    /* renamed from: OnJniQueryFilesizeLimit */
    public native long m37697xbaf9ca1c(int i17, int i18);

    /* renamed from: OnJniQueryM3U8Data */
    public native java.lang.String m37698xba326b15(java.lang.String str);

    /* renamed from: OnJniQueryVideoMoovInfo */
    public native boolean m37699x1bbf34d0(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest c2CDownloadRequest, long[] jArr);

    /* renamed from: OnJniRequestVideoData */
    public native int m37700x3762fe3c(java.lang.String str, long j17, long j18, int i17);

    /* renamed from: OnJniResumeHttpMultiSocketDownloadTask */
    public native int m37701x329edbbe(java.lang.String str);

    /* renamed from: OnJniSetAppCallback */
    public native void m37702x5ddc3e8a(java.lang.Object obj);

    /* renamed from: OnJniSetCdnInfo */
    public native void m37703x67f38d7f(byte[] bArr, byte[] bArr2);

    /* renamed from: OnJniSetCdnInfoParams */
    public native void m37704x9d17e5(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.CdnInfoParams cdnInfoParams, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.CdnInfoParams cdnInfoParams2, int i17);

    /* renamed from: OnJniSetConfig */
    public native void m37705x1479ffbe(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.Config config);

    /* renamed from: OnJniSetDebugIP */
    public native void m37706x9df969be(java.lang.String str);

    /* renamed from: OnJniSetDownloadQuota */
    public native void m37707x89755ad4(long j17, long j18);

    /* renamed from: OnJniSetFlowLimitPerHour */
    public native void m37708x9b760a30(int i17);

    /* renamed from: OnJniSetFlowReportParams */
    public native void m37709x486f95a4(java.lang.String str, long j17, int i17);

    /* renamed from: OnJniSetLegacyCdnInfo */
    public native void m37710xa184ba76(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.CdnInfo cdnInfo, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.CdnInfo cdnInfo2, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.CdnInfo cdnInfo3, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.CdnInfo cdnInfo4, byte[] bArr, byte[] bArr2, java.lang.String str);

    /* renamed from: OnJniSetRSAPublicKeyParams */
    public native void m37711xb3ec7078(java.lang.String str, java.lang.String str2, java.lang.String str3);

    /* renamed from: OnJniSetSnsDistanceData */
    public native void m37712x20f959db(int i17, int i18, int i19, byte[] bArr);

    /* renamed from: OnJniSetSnsImagePrivateProtocolAvalible */
    public native void m37713x7c0f28e(boolean z17);

    /* renamed from: OnJniSetSnsImageStreamProtocolAvalible */
    public native void m37714x27634ce9(boolean z17);

    /* renamed from: OnJniSetToUserCiper */
    public native void m37715x29246ab5(java.lang.String str);

    /* renamed from: OnJniSetUseIPv6Cdn */
    public native void m37716xf35823db(boolean z17);

    /* renamed from: OnJniStartC2CDownload */
    public native int m37717x6102c220(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest c2CDownloadRequest, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.DownloadCallback downloadCallback);

    /* renamed from: OnJniStartC2CUpload */
    public native int m37718xc64d8d99(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadRequest c2CUploadRequest, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.UploadCallback uploadCallback);

    /* renamed from: OnJniStartCronetFileDownload */
    public native int m37719xceffd67d(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest c2CDownloadRequest, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.DownloadCallback downloadCallback);

    /* renamed from: OnJniStartCronetSimpleRequest */
    public native int m37720xa93b8744(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest c2CDownloadRequest, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.DownloadCallback downloadCallback);

    /* renamed from: OnJniStartDownload */
    public native int m37721x52b94784(byte[] bArr, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.DownloadCallbackV2 downloadCallbackV2);

    /* renamed from: OnJniStartFtnUpload */
    public native int m37722x2dd46005(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadRequest c2CUploadRequest, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.UploadCallback uploadCallback);

    /* renamed from: OnJniStartHttpMultiSocketDownloadTask */
    public native int m37723x8a0d6035(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest c2CDownloadRequest, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.DownloadCallback downloadCallback);

    /* renamed from: OnJniStartHttpVideoStreamingDownload */
    public native int m37724x12666a73(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest c2CDownloadRequest, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoStreamingCallback videoStreamingCallback, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.DownloadCallback downloadCallback, int i17);

    /* renamed from: OnJniStartHttpsDownload */
    public native int m37725x32f49917(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest c2CDownloadRequest, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.DownloadCallback downloadCallback);

    /* renamed from: OnJniStartSNSDownload */
    public native int m37726xab9d3da4(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest c2CDownloadRequest, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoStreamingCallback videoStreamingCallback, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.DownloadCallback downloadCallback, int i17);

    /* renamed from: OnJniStartSSUpload */
    public native int m37727x65d3d75d(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadRequest c2CUploadRequest, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.SessionCallback sessionCallback, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.UploadCallback uploadCallback);

    /* renamed from: OnJniStartURIChannelRequest */
    public native int m37728xa4f7311c(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadRequest c2CUploadRequest, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.UploadCallback uploadCallback);

    /* renamed from: OnJniStartURLDownload */
    public native int m37729x98ad5e9b(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest c2CDownloadRequest, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.DownloadCallback downloadCallback);

    /* renamed from: OnJniStartUpload */
    public native int m37730x1dee1bfd(byte[] bArr, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.UploadCallbackV2 uploadCallbackV2);

    /* renamed from: OnJniStartUploadWithSession */
    public native int m37731xe0313ab3(byte[] bArr, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.UploadCallbackV2 uploadCallbackV2, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.SessionCallback sessionCallback);

    /* renamed from: OnJniStartVideoStreamingDownload */
    public native int m37732x77fca9cb(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest c2CDownloadRequest, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoStreamingCallback videoStreamingCallback, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.DownloadCallback downloadCallback, int i17);

    /* renamed from: OnJniTaskExist */
    public native boolean m37733x164a15ec(java.lang.String str);

    /* renamed from: OnJniTriggerPreConnect */
    public native void m37734xc9942819(java.lang.String str, java.lang.String[] strArr, boolean z17);

    /* renamed from: OnJniUpdateVideoPlaybackTimetick */
    public native void m37735x89f98171(java.lang.String str, double d17);

    /* renamed from: allowBatchImageDownload */
    public boolean m37736x34c3112() {
        return m37669x60a6390c();
    }

    /* renamed from: calcFileCrc32 */
    public int m37737x974f0042(java.lang.String str) {
        return m37670x8d59d8bc(str);
    }

    /* renamed from: calcFileMD5 */
    public java.lang.String m37738xd7a366d(java.lang.String str) {
        return m37671x9774e567(str);
    }

    /* renamed from: calcMP4IdentifyMD5 */
    public java.lang.String m37739x3be5fcd6(java.lang.String str) {
        return m37672xe311609c(str);
    }

    /* renamed from: cancelDownloadTaskWithResult */
    public int m37740x55b651aa(java.lang.String str, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadResult c2CDownloadResult) {
        return m37673xdd2435f0(str, c2CDownloadResult);
    }

    /* renamed from: cancelTask */
    public void m37741x70920b1f(java.lang.String str) {
        m37674x16894e5(str);
    }

    /* renamed from: cancelUploadTaskWithResult */
    public int m37742xaa0a0de3(java.lang.String str, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadResult c2CUploadResult) {
        return m37675x1a104ba9(str, c2CUploadResult);
    }

    /* renamed from: createAeskey */
    public java.lang.String m37743x3c001f4c() {
        return m37676xf15b4f92();
    }

    /* renamed from: createUniqueFilekey */
    public java.lang.String m37744x867f3eb6(java.lang.String str, java.lang.String str2) {
        return m37679xc4c053b0(str, str2);
    }

    @Override // com.p314xaae8f345.p542x3306d5.app.AbstractC4441x1e602b7c
    /* renamed from: getNativeHandle */
    public long mo37556xdc4f8f95() {
        return this.f17760x7b5cfd1f;
    }

    /* renamed from: getRecentAverageSpeed */
    public int m37745x9208c81b(int i17) {
        return m37681x44588695(i17);
    }

    /* renamed from: getRecentAverageSpeed2 */
    public int m37746xaf103b77(int i17, int i18) {
        return m37682x46b84c3d(i17, i18);
    }

    /* renamed from: getRecentConnectRecords */
    public com.p314xaae8f345.p542x3306d5.mm.C4564xe93729bb[] m37747xb14c55a9(int i17, int i18) {
        return m37683xea65da3(i17, i18);
    }

    /* renamed from: getRecentDownloadInfo */
    public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.DownloadInfo m37748x8ade6947(int i17, int i18, int i19) {
        return m37684x3d2e27c1(i17, i18, i19);
    }

    /* renamed from: getSnsImagePrivateProtocolAvalible */
    public boolean m37749x24dca954() {
        return m37685x2a43c11a();
    }

    /* renamed from: getTaskRecentAverageSpeed */
    public int m37750x14b65780(java.lang.String str, int i17, int i18) {
        return m37686x83ae48fa(str, i17, i18);
    }

    /* renamed from: httpMultiSocketDownloadTaskState */
    public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.CdnTaskStateInfo m37751x7d770260(java.lang.String str) {
        return m37687x172d53a6(str);
    }

    /* renamed from: isVideoDataAvailable */
    public boolean m37752x9b94c84e(java.lang.String str, long j17, long j18) {
        return m37688x25765294(str, j17, j18);
    }

    /* renamed from: markVideoBufferingStatus */
    public void m37753x7ef226a6(java.lang.String str, int i17) {
        m37689xccd91dec(str, i17);
    }

    /* renamed from: onCreate */
    public void m37754x3e5a77bb(java.lang.String str, java.lang.String str2, java.lang.Boolean bool) {
        m37690xfcb4bb01(str, str2, bool.booleanValue());
    }

    /* renamed from: onDestroy */
    public void m37755xac79a11b() {
        m37680xbc61d4();
    }

    /* renamed from: pauseHttpMultiSocketDownloadTask */
    public int m37756xe50d50db(java.lang.String str) {
        return m37691x7ec3a221(str);
    }

    /* renamed from: queryAvailableQuota */
    public long[] m37757xa6a60017() {
        return m37692xe4e71511();
    }

    /* renamed from: queryCdnFlowInfo */
    public byte[] m37758x2f3abc61() {
        return m37693x675859a7();
    }

    /* renamed from: queryCdnTaskStateInfo */
    public byte[] m37759x8ff92a95(java.lang.String str) {
        return m37694x4248e90f(str);
    }

    /* renamed from: queryContinuousSize */
    public int m37760xcac8ee98(java.lang.String str, long j17, long[] jArr) {
        return m37695x90a0392(str, j17, jArr);
    }

    /* renamed from: queryDownloadedSize */
    public int m37761x660d22b0(java.lang.String str, long[] jArr) {
        return m37696xa44e37aa(str, jArr);
    }

    /* renamed from: queryFilesizeLimit */
    public long m37762x13ce6656(int i17, int i18) {
        return m37697xbaf9ca1c(i17, i18);
    }

    /* renamed from: queryM3U8Data */
    public java.lang.String m37763xc427929b(java.lang.String str) {
        return m37698xba326b15(str);
    }

    /* renamed from: queryVideoMoovInfo */
    public boolean m37764x7493d10a(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest c2CDownloadRequest, long[] jArr) {
        return m37699x1bbf34d0(c2CDownloadRequest, jArr);
    }

    /* renamed from: requestVideoData */
    public int m37765xff4560f6(java.lang.String str, long j17, long j18, int i17) {
        return m37700x3762fe3c(str, j17, j18, i17);
    }

    /* renamed from: resumeHttpMultiSocketDownloadTask */
    public int m37766x958b0444(java.lang.String str) {
        return m37701x329edbbe(str);
    }

    /* renamed from: setAppCallback */
    public void m37767x928c07c4(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.AppCallback appCallback) {
        m37702x5ddc3e8a(appCallback);
    }

    /* renamed from: setCdnInfo */
    public void m37768xd71d03b9(byte[] bArr, byte[] bArr2) {
        m37703x67f38d7f(bArr, bArr2);
    }

    /* renamed from: setCdnInfoParams */
    public void m37769xc87f7a9f(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.CdnInfoParams cdnInfoParams, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.CdnInfoParams cdnInfoParams2, int i17) {
        m37704x9d17e5(cdnInfoParams, cdnInfoParams2, i17);
    }

    /* renamed from: setConfig */
    public void m37770x78bda44(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.Config config) {
        m37705x1479ffbe(config);
    }

    /* renamed from: setDebugIP */
    public void m37771xd22dff8(java.lang.String str) {
        m37706x9df969be(str);
    }

    /* renamed from: setDownloadQuota */
    public void m37772x5157bd8e(long j17, long j18) {
        m37707x89755ad4(j17, j18);
    }

    /* renamed from: setFlowLimitPerHour */
    public void m37773x5d34f536(int i17) {
        m37708x9b760a30(i17);
    }

    /* renamed from: setFlowReportParams */
    public void m37774xa2e80aa(java.lang.String str, long j17, int i17) {
        m37709x486f95a4(str, j17, i17);
    }

    /* renamed from: setLegacyCdnInfo */
    public void m37775x69671d30(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.CdnInfo cdnInfo, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.CdnInfo cdnInfo2, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.CdnInfo cdnInfo3, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.CdnInfo cdnInfo4, byte[] bArr, byte[] bArr2, java.lang.String str) {
        m37710xa184ba76(cdnInfo, cdnInfo2, cdnInfo3, cdnInfo4, bArr, bArr2, str);
    }

    /* renamed from: setRSAPublicKeyParams */
    public void m37776x19cb1fe(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        m37711xb3ec7078(str, str2, str3);
    }

    /* renamed from: setSnsDistanceData */
    public void m37777x79cdf615(int i17, int i18, int i19, byte[] bArr) {
        m37712x20f959db(i17, i18, i19, bArr);
    }

    /* renamed from: setSnsImagePrivateProtocolAvalible */
    public void m37778x259dac8(boolean z17) {
        m37713x7c0f28e(z17);
    }

    /* renamed from: setSnsImageStreamProtocolAvalible */
    public void m37779x8a4f756f(boolean z17) {
        m37714x27634ce9(z17);
    }

    /* renamed from: setToUserCiper */
    public void m37780x5dd433ef(java.lang.String str) {
        m37715x29246ab5(str);
    }

    /* renamed from: setUseIPv6Cdn */
    public void m37781xfd4d4b61(boolean z17) {
        m37716xf35823db(z17);
    }

    /* renamed from: startC2CDownload */
    public int m37782x28e524da(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest c2CDownloadRequest, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.DownloadCallback downloadCallback) {
        return m37717x6102c220(c2CDownloadRequest, downloadCallback);
    }

    /* renamed from: startC2CUpload */
    public int m37783xfafd56d3(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadRequest c2CUploadRequest, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.UploadCallback uploadCallback) {
        return m37718xc64d8d99(c2CUploadRequest, uploadCallback);
    }

    /* renamed from: startDownloadTask */
    public int m37784x729383af(byte[] bArr, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.DownloadCallbackV2 downloadCallbackV2) {
        return m37721x52b94784(bArr, downloadCallbackV2);
    }

    /* renamed from: startFtnUpload */
    public int m37785x6284293f(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadRequest c2CUploadRequest, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.UploadCallback uploadCallback) {
        return m37722x2dd46005(c2CUploadRequest, uploadCallback);
    }

    /* renamed from: startHttpMultiSocketDownloadTask */
    public int m37786xf0570eef(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest c2CDownloadRequest, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.DownloadCallback downloadCallback) {
        return m37723x8a0d6035(c2CDownloadRequest, downloadCallback);
    }

    /* renamed from: startHttpVideoStreamingDownload */
    public int m37787x52efc79(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest c2CDownloadRequest, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoStreamingCallback videoStreamingCallback, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.DownloadCallback downloadCallback, int i17) {
        return m37724x12666a73(c2CDownloadRequest, videoStreamingCallback, downloadCallback, i17);
    }

    /* renamed from: startHttpsDownload */
    public int m37788x8bc93551(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest c2CDownloadRequest, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.DownloadCallback downloadCallback) {
        return m37725x32f49917(c2CDownloadRequest, downloadCallback);
    }

    /* renamed from: startSNSDownload */
    public int m37789x737fa05e(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest c2CDownloadRequest, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoStreamingCallback videoStreamingCallback, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.DownloadCallback downloadCallback, int i17) {
        return m37726xab9d3da4(c2CDownloadRequest, videoStreamingCallback, downloadCallback, i17);
    }

    /* renamed from: startSSUpload */
    public int m37790x6fc8fee3(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadRequest c2CUploadRequest, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.SessionCallback sessionCallback, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.UploadCallback uploadCallback) {
        return m37727x65d3d75d(c2CUploadRequest, sessionCallback, uploadCallback);
    }

    /* renamed from: startURIChannelRequest */
    public int m37791xd4f2056(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadRequest c2CUploadRequest, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.UploadCallback uploadCallback) {
        return m37728xa4f7311c(c2CUploadRequest, uploadCallback);
    }

    /* renamed from: startURLDownload */
    public int m37792x608fc155(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest c2CDownloadRequest, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.DownloadCallback downloadCallback) {
        return m37729x98ad5e9b(c2CDownloadRequest, downloadCallback);
    }

    /* renamed from: startUploadTask */
    public int m37793x62c6dd28(byte[] bArr, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.UploadCallbackV2 uploadCallbackV2) {
        return m37730x1dee1bfd(bArr, uploadCallbackV2);
    }

    /* renamed from: startVideoStreamingDownload */
    public int m37795xe73b2ed1(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest c2CDownloadRequest, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoStreamingCallback videoStreamingCallback, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.DownloadCallback downloadCallback, int i17) {
        return m37732x77fca9cb(c2CDownloadRequest, videoStreamingCallback, downloadCallback, i17);
    }

    /* renamed from: taskExist */
    public boolean m37796x95bf072(java.lang.String str) {
        return m37733x164a15ec(str);
    }

    /* renamed from: triggerPreConnect */
    public void m37797xfdfe1c9f(java.lang.String str, java.lang.String[] strArr, boolean z17) {
        m37734xc9942819(str, strArr, z17);
    }

    /* renamed from: updateVideoPlaybackTimetick */
    public void m37798xf9380677(java.lang.String str, double d17) {
        m37735x89f98171(str, d17);
    }

    /* renamed from: startUploadTask */
    public int m37794x62c6dd28(byte[] bArr, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.UploadCallbackV2 uploadCallbackV2, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.SessionCallback sessionCallback) {
        return m37731xe0313ab3(bArr, uploadCallbackV2, sessionCallback);
    }

    /* renamed from: com.tencent.mars.cdn.CdnManager$WebPageProfile */
    /* loaded from: classes7.dex */
    public static class WebPageProfile implements android.os.Parcelable {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.WebPageProfile> f18117x681a0c0c = new android.os.Parcelable.Creator<com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.WebPageProfile>() { // from class: com.tencent.mars.cdn.CdnManager.WebPageProfile.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.WebPageProfile createFromParcel(android.os.Parcel parcel) {
                return new com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.WebPageProfile(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.WebPageProfile[] newArray(int i17) {
                return new com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.WebPageProfile[i17];
            }
        };

        /* renamed from: SSLconnectionEnd */
        public long f18118x33aefab1;

        /* renamed from: SSLconnectionStart */
        public long f18119x4a318b8;

        /* renamed from: connectEnd */
        public long f18120xd1c3f791;

        /* renamed from: connectStart */
        public long f18121x716c5d98;

        /* renamed from: domainLookUpEnd */
        public long f18122x4494b47d;

        /* renamed from: domainLookUpStart */
        public long f18123x73018f84;

        /* renamed from: downstreamThroughputKbpsEstimate */
        public int f18124xf406656e;

        /* renamed from: fetchStart */
        public long f18125x1193f1c8;

        /* renamed from: httpRttEstimate */
        public int f18126x6b4f2c12;

        /* renamed from: networkTypeEstimate */
        public int f18127x64c417d0;

        /* renamed from: peerIP */
        public java.lang.String f18128xc4ddaa09;

        /* renamed from: port */
        public int f18129x349881;

        /* renamed from: protocol */
        public java.lang.String f18130xc50a8e98;

        /* renamed from: receivedBytedCount */
        public long f18131x806c1ad4;

        /* renamed from: redirectEnd */
        public long f18132x7570bb5f;

        /* renamed from: redirectStart */
        public long f18133xdcf765e6;

        /* renamed from: requestEnd */
        public long f18134x235dfcc;

        /* renamed from: requestStart */
        public long f18135x4d052313;

        /* renamed from: responseEnd */
        public long f18136x6e1f08da;

        /* renamed from: responseStart */
        public long f18137x634840a1;
        public int rtt;

        /* renamed from: sendBytesCount */
        public long f18138xd0450d0c;

        /* renamed from: socketReused */
        public boolean f18139xfad511c3;

        /* renamed from: statusCode */
        public int f18140xec0a8ff;

        /* renamed from: throughputKbps */
        public int f18141xad79e6e4;

        /* renamed from: transportRttEstimate */
        public int f18142x16957ed1;

        public WebPageProfile() {
            this.f18130xc50a8e98 = "";
            this.f18128xc4ddaa09 = "";
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* renamed from: toString */
        public java.lang.String m37938x9616526c() {
            return "WebPageProfile{redirectStart=" + this.f18133xdcf765e6 + ", redirectEnd=" + this.f18132x7570bb5f + ", fetchStart=" + this.f18125x1193f1c8 + ", domainLookUpStart=" + this.f18123x73018f84 + ", domainLookUpEnd=" + this.f18122x4494b47d + ", connectStart=" + this.f18121x716c5d98 + ", connectEnd=" + this.f18120xd1c3f791 + ", SSLconnectionStart=" + this.f18119x4a318b8 + ", SSLconnectionEnd=" + this.f18118x33aefab1 + ", requestStart=" + this.f18135x4d052313 + ", requestEnd=" + this.f18134x235dfcc + ", responseStart=" + this.f18137x634840a1 + ", responseEnd=" + this.f18136x6e1f08da + ", protocol='" + this.f18130xc50a8e98 + "', rtt=" + this.rtt + ", statusCode=" + this.f18140xec0a8ff + ", networkTypeEstimate=" + this.f18127x64c417d0 + ", httpRttEstimate=" + this.f18126x6b4f2c12 + ", transportRttEstimate=" + this.f18142x16957ed1 + ", downstreamThroughputKbpsEstimate=" + this.f18124xf406656e + ", throughputKbps=" + this.f18141xad79e6e4 + ", peerIP='" + this.f18128xc4ddaa09 + "', port=" + this.f18129x349881 + ", socketReused=" + this.f18139xfad511c3 + ", sendBytesCount=" + this.f18138xd0450d0c + ", receivedBytedCount=" + this.f18131x806c1ad4 + '}';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeLong(this.f18133xdcf765e6);
            parcel.writeLong(this.f18132x7570bb5f);
            parcel.writeLong(this.f18125x1193f1c8);
            parcel.writeLong(this.f18123x73018f84);
            parcel.writeLong(this.f18122x4494b47d);
            parcel.writeLong(this.f18121x716c5d98);
            parcel.writeLong(this.f18120xd1c3f791);
            parcel.writeLong(this.f18119x4a318b8);
            parcel.writeLong(this.f18118x33aefab1);
            parcel.writeLong(this.f18135x4d052313);
            parcel.writeLong(this.f18134x235dfcc);
            parcel.writeLong(this.f18137x634840a1);
            parcel.writeLong(this.f18136x6e1f08da);
            parcel.writeString(this.f18130xc50a8e98);
            parcel.writeInt(this.rtt);
            parcel.writeInt(this.f18140xec0a8ff);
            parcel.writeInt(this.f18127x64c417d0);
            parcel.writeInt(this.f18126x6b4f2c12);
            parcel.writeInt(this.f18142x16957ed1);
            parcel.writeInt(this.f18124xf406656e);
            parcel.writeInt(this.f18141xad79e6e4);
            parcel.writeString(this.f18128xc4ddaa09);
            parcel.writeInt(this.f18129x349881);
            parcel.writeByte(this.f18139xfad511c3 ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.f18138xd0450d0c);
            parcel.writeLong(this.f18131x806c1ad4);
        }

        public WebPageProfile(android.os.Parcel parcel) {
            this.f18130xc50a8e98 = "";
            this.f18128xc4ddaa09 = "";
            this.f18133xdcf765e6 = parcel.readLong();
            this.f18132x7570bb5f = parcel.readLong();
            this.f18125x1193f1c8 = parcel.readLong();
            this.f18123x73018f84 = parcel.readLong();
            this.f18122x4494b47d = parcel.readLong();
            this.f18121x716c5d98 = parcel.readLong();
            this.f18120xd1c3f791 = parcel.readLong();
            this.f18119x4a318b8 = parcel.readLong();
            this.f18118x33aefab1 = parcel.readLong();
            this.f18135x4d052313 = parcel.readLong();
            this.f18134x235dfcc = parcel.readLong();
            this.f18137x634840a1 = parcel.readLong();
            this.f18136x6e1f08da = parcel.readLong();
            this.f18130xc50a8e98 = parcel.readString();
            this.rtt = parcel.readInt();
            this.f18140xec0a8ff = parcel.readInt();
            this.f18127x64c417d0 = parcel.readInt();
            this.f18126x6b4f2c12 = parcel.readInt();
            this.f18142x16957ed1 = parcel.readInt();
            this.f18124xf406656e = parcel.readInt();
            this.f18141xad79e6e4 = parcel.readInt();
            this.f18128xc4ddaa09 = parcel.readString();
            this.f18129x349881 = parcel.readInt();
            this.f18139xfad511c3 = parcel.readByte() != 0;
            this.f18138xd0450d0c = parcel.readLong();
            this.f18131x806c1ad4 = parcel.readLong();
        }
    }

    public C4446x11b6e6e0(com.p314xaae8f345.p542x3306d5.app.C4443x9befcd8f c4443x9befcd8f) {
        m37677xb90ae723(c4443x9befcd8f);
    }

    /* renamed from: com.tencent.mars.cdn.CdnManager$VideoInfo */
    /* loaded from: classes4.dex */
    public static class VideoInfo implements android.os.Parcelable {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoInfo> f18111x681a0c0c = new android.os.Parcelable.Creator<com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoInfo>() { // from class: com.tencent.mars.cdn.CdnManager.VideoInfo.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoInfo createFromParcel(android.os.Parcel parcel) {
                return new com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoInfo(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoInfo[] newArray(int i17) {
                return new com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoInfo[i17];
            }
        };

        /* renamed from: oriVideoFormat */
        public int f18112xd87e3d8c;

        /* renamed from: requestFlag */
        public java.lang.String f18113x4486869b;

        /* renamed from: svrFlag */
        public java.lang.String f18114x9330627b;

        /* renamed from: videoFormat */
        public int f18115x27b47052;

        /* renamed from: videoPath */
        public java.lang.String f18116x4f713740;

        public VideoInfo() {
            this.f18113x4486869b = "";
            this.f18114x9330627b = "";
            this.f18115x27b47052 = 0;
            this.f18112xd87e3d8c = 0;
            this.f18116x4f713740 = "";
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* renamed from: readFromParcel */
        public void m37928xb362ce89(android.os.Parcel parcel) {
            this.f18113x4486869b = parcel.readString();
            this.f18114x9330627b = parcel.readString();
            this.f18115x27b47052 = parcel.readInt();
            this.f18112xd87e3d8c = parcel.readInt();
            this.f18116x4f713740 = parcel.readString();
        }

        /* renamed from: toString */
        public java.lang.String m37929x9616526c() {
            return "VideoInfo{requestFlag='" + this.f18113x4486869b + "', svrFlag='" + this.f18114x9330627b + "', videoFormat=" + this.f18115x27b47052 + ", oriVideoFormat=" + this.f18112xd87e3d8c + ", videoPath='" + this.f18116x4f713740 + "'}";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeString(this.f18113x4486869b);
            parcel.writeString(this.f18114x9330627b);
            parcel.writeInt(this.f18115x27b47052);
            parcel.writeInt(this.f18112xd87e3d8c);
            parcel.writeString(this.f18116x4f713740);
        }

        public VideoInfo(android.os.Parcel parcel) {
            this.f18113x4486869b = "";
            this.f18114x9330627b = "";
            this.f18115x27b47052 = 0;
            this.f18112xd87e3d8c = 0;
            this.f18116x4f713740 = "";
            this.f18113x4486869b = parcel.readString();
            this.f18114x9330627b = parcel.readString();
            this.f18115x27b47052 = parcel.readInt();
            this.f18112xd87e3d8c = parcel.readInt();
            this.f18116x4f713740 = parcel.readString();
        }
    }

    /* renamed from: createC2CUpload */
    public static com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadRequest m37645xb8c80779(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3) {
        return new com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadRequest().m37890x7e47f881(str).m37879x52c2522c(1).m37877x81fa9a19(1).m37893x4abb7958(i17).m37891x4ab94e43(str2).m37907x29e44e55(str3).m37876x59bc66e();
    }

    /* renamed from: createC2CUpload */
    public static com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadRequest m37646xb8c80779(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        return new com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadRequest().m37890x7e47f881(str).m37879x52c2522c(1).m37877x81fa9a19(1).m37893x4abb7958(i17).m37891x4ab94e43(str2).m37903xf5f11542(str3).m37907x29e44e55(str4).m37876x59bc66e();
    }

    /* renamed from: createC2CUpload */
    public static com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadRequest m37643xb8c80779(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadRequest c2CUploadRequest, java.lang.String str, java.lang.String str2) {
        return c2CUploadRequest.m37897x21fd4d7a(str).m37896x193ff913(str2).m37886x7ac930da(true).m37876x59bc66e();
    }
}
