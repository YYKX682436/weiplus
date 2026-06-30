package com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455;

/* renamed from: com.tencent.thumbplayer.tplayer.TPPlayer */
/* loaded from: classes16.dex */
public class C26520x2c78c47d implements com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 {

    /* renamed from: LOG_API_CALL_PREFIX */
    private static java.lang.String f54306x186855b3 = "api call:";

    /* renamed from: MSG_INDEX */
    private static final int f54307x98b6f254 = 256;

    /* renamed from: MSG_ON_AUDIOPCMOUT */
    private static final int f54308x345a15a8 = 267;

    /* renamed from: MSG_ON_COMPLETION */
    private static final int f54309x52a089de = 260;

    /* renamed from: MSG_ON_ERROR */
    private static final int f54310x2f0a66a6 = 262;

    /* renamed from: MSG_ON_INFO */
    private static final int f54311x85a74030 = 261;

    /* renamed from: MSG_ON_PLAYER_STATE_CHANGE */
    private static final int f54312xdf46c01a = 277;

    /* renamed from: MSG_ON_PLAY_FLOW_EVENT */
    private static final int f54313x2c557d52 = 1256;

    /* renamed from: MSG_ON_PREPARED */
    private static final int f54314x8be4d6bf = 257;

    /* renamed from: MSG_ON_PROXY_ABTEST_INFO */
    private static final int f54315xb31efc87 = 281;

    /* renamed from: MSG_ON_PROXY_ALL_DOWNLOAD_FINISH */
    private static final int f54316x5ec7bbb9 = 271;

    /* renamed from: MSG_ON_PROXY_CDN_URL_EXPIRED */
    private static final int f54317xf36637b0 = 275;

    /* renamed from: MSG_ON_PROXY_DOWN_LOAD_STATUS_UPDATE */
    private static final int f54318xdc8a7 = 272;

    /* renamed from: MSG_ON_PROXY_NO_MORE_DATA */
    private static final int f54319x91309fa9 = 276;

    /* renamed from: MSG_ON_PROXY_PLAYERROR */
    private static final int f54320x5c3731c1 = 268;

    /* renamed from: MSG_ON_PROXY_PLAY_CDN_INFO_UPDATE */
    private static final int f54321xed225090 = 270;

    /* renamed from: MSG_ON_PROXY_PLAY_CDN_URL_UPDATE */
    private static final int f54322xd34e5be3 = 269;

    /* renamed from: MSG_ON_PROXY_PROGRESS_UPDATE */
    private static final int f54323x76b037e8 = 274;

    /* renamed from: MSG_ON_PROXY_PROTOCOL_UPDATE */
    private static final int f54324xb3aad1d = 273;

    /* renamed from: MSG_ON_PROXY_SWITCH_DEFINITION */
    private static final int f54325x845aa0cb = 278;

    /* renamed from: MSG_ON_RPOXY_DETECTED_MULTI_NETWORK_CARD_AND_LOW_SPEED */
    private static final int f54326x20489e8a = 283;

    /* renamed from: MSG_ON_RPOXY_M3U8_REFRESH */
    private static final int f54327xf088dd94 = 282;

    /* renamed from: MSG_ON_RPOXY_MULTI_NETWORK_CARD_STATUS_CHANGE */
    private static final int f54328x2b404b74 = 284;

    /* renamed from: MSG_ON_SEEK_COMPLETE */
    private static final int f54329xc66b41de = 263;

    /* renamed from: MSG_ON_STOP_ASYNC_COMPLETE */
    private static final int f54330xc619c1d7 = 280;

    /* renamed from: MSG_ON_SUBTITLE_DATA */
    private static final int f54331x95f5222f = 265;

    /* renamed from: MSG_ON_SUBTITLE_FRAME_BUFFER */
    private static final int f54332xfb2818f7 = 279;

    /* renamed from: MSG_ON_VIDEOFRAMEOUT */
    private static final int f54333xdf8562da = 266;

    /* renamed from: MSG_ON_VIDEO_SIZE_CHANGE */
    private static final int f54334xb4298388 = 264;
    private static final java.lang.String TAG = "TPPlayer";

    /* renamed from: mOnInfoMsgTypeToOnDetailMsgType */
    private static final android.util.SparseIntArray f54335x6cc1582f;

    /* renamed from: sLifeCycleId */
    private static java.util.concurrent.atomic.AtomicInteger f54336x964e4792 = new java.util.concurrent.atomic.AtomicInteger(1000);

    /* renamed from: mAssetResourceLoader */
    private com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.InterfaceC26468xe997c0c f54337xcd9bff24;

    /* renamed from: mCurrentDownloadSizeByte */
    private long f54338xf7128dbd;

    /* renamed from: mDownloadPlayableDurationMs */
    private long f54339x94a85c7d;

    /* renamed from: mEnableSuggestedBitrateCallback */
    private boolean f54340x6f80c59f;

    /* renamed from: mHandlerThread */
    private android.os.HandlerThread f54341x3e0f3a87;

    /* renamed from: mLogger */
    private com.p314xaae8f345.p3006xb8ff1437.log.C26477x4798c35d f54342xe041c5d;

    /* renamed from: mPlayProxyManager */
    private final com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.InterfaceC26454x8591d014 f54343xdf286140;

    /* renamed from: mPlayTaskId */
    private java.util.concurrent.atomic.AtomicInteger f54344x3b3a2a21;

    /* renamed from: mPlayerAdapter */
    private final com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.InterfaceC26129xed1324a9 f54345xb49bd9c1;

    /* renamed from: mPlayerListeners */
    private com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26521xbcdea42 f54346x21973431;

    /* renamed from: mProxyStatus */
    private int f54347x270d8d53;

    /* renamed from: mReportController */
    private com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26540x26a27a8c f54348xca026e7d;

    /* renamed from: mReportManager */
    private com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd f54349x57e6d86c;

    /* renamed from: mReportNonImplPlugin */
    private com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26531x80471330 f54350x9b6bcd9f;

    /* renamed from: mSkipEndTimeMs */
    private int f54351x818d03e2;

    /* renamed from: mStartTimeMs */
    private int f54352x3be94da8;

    /* renamed from: mTPContext */
    private com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26518xb8c23f93 f54353xbc0769c6;

    /* renamed from: mTPPluginManager */
    private com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.InterfaceC26526x89b09c75 f54354x4233cfd1;

    /* renamed from: mThreadLooper */
    private android.os.Looper f54355x66f29e08;

    /* renamed from: mTotalFileSizeByte */
    private long f54356xd47fdabc;

    /* renamed from: mTransformCallbackHandler */
    private com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.EventHandler f54357x6c4e5bc6;

    /* renamed from: mUniqueIdCounter */
    private long f54358xcb27b63;

    /* renamed from: mUniqueIdToOpaqueMap */
    private java.util.Map<java.lang.Long, java.lang.Long> f54359x6f6ef27;

    /* renamed from: mUrl */
    private java.lang.String f54360x32d9c2;

    /* renamed from: mUseProxy */
    private volatile boolean f54361x134a18b4;

    /* renamed from: mUsingDefaultLogContext */
    private boolean f54362x1f1cf395;

    /* renamed from: proxyTrackUrls */
    private java.util.ArrayList<java.lang.String> f54363x4244e201;

    /* renamed from: com.tencent.thumbplayer.tplayer.TPPlayer$InnerPlayerListener */
    /* loaded from: classes16.dex */
    public class InnerPlayerListener implements com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnPreparedListener, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnCompletionListener, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnInfoListener, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnErrorListener, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnSeekCompleteListener, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnVideoSizeChangedListener, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnVideoFrameOutListener, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnAudioPcmOutListener, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnSubtitleDataListener, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnSubtitleFrameOutListener, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnVideoProcessOutListener, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnAudioProcessOutListener, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnStateChangeListener, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnDetailInfoListener, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnDemuxerListener, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d {
        public InnerPlayerListener() {
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
        /* renamed from: getAdvRemainTime */
        public long mo102271x7dd980b6() {
            com.p314xaae8f345.p3006xb8ff1437.api.p3017x65fca6e.InterfaceC26229xba673b1c mo102991xfd0f862f = com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.f54343xdf286140.mo102991xfd0f862f();
            if (mo102991xfd0f862f != null) {
                return mo102991xfd0f862f.m101362x6d7c34fc();
            }
            return -1L;
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
        /* renamed from: getContentType */
        public java.lang.String mo102272xc2a49a1d(int i17, java.lang.String str, java.lang.String str2) {
            if (com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.f54337xcd9bff24 != null) {
                return com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.f54337xcd9bff24.mo103118xc2a49a1d(i17, str, str2);
            }
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.f54342xe041c5d.mo100756x5c4d208("mAssetResourceLoader not set");
            return "";
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
        /* renamed from: getCurrentPlayClipNo */
        public int mo102273xce1eb728() {
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.InterfaceC26129xed1324a9 interfaceC26129xed1324a9 = com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.f54345xb49bd9c1;
            if (interfaceC26129xed1324a9 != null) {
                return interfaceC26129xed1324a9.mo100248xce1eb728();
            }
            return 0;
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
        /* renamed from: getCurrentPlayOffset */
        public long mo102274xe243028a() {
            return com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.f54345xb49bd9c1.mo100399x37da763a();
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
        /* renamed from: getCurrentPosition */
        public long mo102275x9746038c() {
            return com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.mo100915xddd35a52();
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
        /* renamed from: getDataFilePath */
        public java.lang.String mo102276x84354c01(int i17, java.lang.String str, java.lang.String str2) {
            if (com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.f54337xcd9bff24 != null) {
                return com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.f54337xcd9bff24.mo103119x84354c01(i17, str, str2);
            }
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.f54342xe041c5d.mo100756x5c4d208("mAssetResourceLoader not set");
            return "";
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
        /* renamed from: getDataTotalSize */
        public long mo102277x2f5bd925(int i17, java.lang.String str, java.lang.String str2) {
            if (com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.f54337xcd9bff24 != null) {
                return com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.f54337xcd9bff24.mo103120x2f5bd925(i17, str, str2);
            }
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.f54342xe041c5d.mo100756x5c4d208("mAssetResourceLoader not set");
            return -1L;
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
        /* renamed from: getM3U8Content */
        public java.lang.String mo102278x79c2649a(int i17, java.lang.String str, java.lang.String str2) {
            if (com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.f54337xcd9bff24 != null) {
                return com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.f54337xcd9bff24.mo103114x79c2649a(i17, str, str2);
            }
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.f54342xe041c5d.mo100756x5c4d208("mAssetResourceLoader not set");
            return "";
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
        /* renamed from: getPlayInfo */
        public java.lang.Object mo102279xebd0e778(long j17) {
            return null;
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
        /* renamed from: getPlayerBufferLength */
        public long mo102281xe15692bd() {
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.InterfaceC26129xed1324a9 interfaceC26129xed1324a9 = com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.f54345xb49bd9c1;
            if (interfaceC26129xed1324a9 != null) {
                return java.lang.Math.max(interfaceC26129xed1324a9.mo100403xac6a8d7e() - com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.f54345xb49bd9c1.mo100398xddd35a52(), 0L);
            }
            return 0L;
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnAudioPcmOutListener
        /* renamed from: onAudioPcmOut */
        public void mo100458x30daf82b(com.p314xaae8f345.p3006xb8ff1437.api.C26169xaecce4f3 c26169xaecce4f3) {
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26521xbcdea42 c26521xbcdea42 = com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.f54346x21973431;
            if (c26521xbcdea42 != null) {
                c26521xbcdea42.mo100986x5dd428f8(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this, c26169xaecce4f3);
            }
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnAudioProcessOutListener
        /* renamed from: onAudioProcessFrameOut */
        public com.p314xaae8f345.p3006xb8ff1437.api.C26188x7aa7007a mo100459xff2eeff9(com.p314xaae8f345.p3006xb8ff1437.api.C26188x7aa7007a c26188x7aa7007a) {
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26521xbcdea42 c26521xbcdea42 = com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.f54346x21973431;
            if (c26521xbcdea42 != null) {
                return c26521xbcdea42.mo100987xff2eeff9(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this, c26188x7aa7007a);
            }
            return null;
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnCompletionListener
        /* renamed from: onCompletion */
        public void mo100460xa6db431b() {
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.m103606xd0c233a0(111, 0, 0, null, new com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26571x7baf53e9().put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54553x5c42836f, java.lang.Long.valueOf(java.lang.System.currentTimeMillis())).put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54560xfb23a562, 0).m104306x59bc66e());
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.m103593x7d7a028e(260, 0, 0, null);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnDetailInfoListener
        /* renamed from: onDetailInfo */
        public void mo100461x8953bfde(com.p314xaae8f345.p3006xb8ff1437.api.C26183xfc0748fc c26183xfc0748fc) {
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26521xbcdea42 c26521xbcdea42 = com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.f54346x21973431;
            if (c26521xbcdea42 != null) {
                c26521xbcdea42.mo100989x8953bfde(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this, c26183xfc0748fc);
            }
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
        /* renamed from: onDownloadCdnUrlExpired */
        public void mo102282x61548e7c(java.util.Map<java.lang.String, java.lang.String> map) {
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.f54342xe041c5d.mo100757x3164ae("onDownloadCdnUrlExpired");
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.m103593x7d7a028e(275, 0, 0, map);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
        /* renamed from: onDownloadCdnUrlInfoUpdate */
        public void mo102283x73241460(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.f54342xe041c5d.mo100757x3164ae("onDownloadCdnUrlInfoUpdate, url:" + str + ", cdnIp:" + str2 + ", uip:" + str3 + ", errorCodeStr:" + str4);
            com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPCDNURLInfo tPCDNURLInfo = new com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPCDNURLInfo();
            tPCDNURLInfo.url = str;
            tPCDNURLInfo.f50880x5a23234 = str2;
            tPCDNURLInfo.uIp = str3;
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.m103606xd0c233a0(201, 0, 0, null, new com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26571x7baf53e9().put("url", str).put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54470x8e5f436d, str2).put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54471x3d8956b6, str3).m104306x59bc66e());
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.m103593x7d7a028e(270, 0, 0, tPCDNURLInfo);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
        /* renamed from: onDownloadCdnUrlUpdate */
        public void mo102284xe42c8a92(java.lang.String str) {
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.f54342xe041c5d.mo100757x3164ae("onDownloadCdnUrlUpdate, url:" + str);
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.m103593x7d7a028e(269, 0, 0, str);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
        /* renamed from: onDownloadError */
        public void mo102285x338612c1(int i17, int i18, java.lang.String str) {
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.f54342xe041c5d.mo100757x3164ae("onDownloadError, moduleID:" + i17 + ", errorCode:" + i18 + ", extInfo:" + str);
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.m103590xd1f81421(i17, i18);
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.m103593x7d7a028e(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.f54320x5c3731c1, i17, i18, str);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
        /* renamed from: onDownloadFinish */
        public void mo102286x3e7062fa() {
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.f54342xe041c5d.mo100757x3164ae("onDownloadFinish");
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.m103593x7d7a028e(271, 0, 0, 0);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
        /* renamed from: onDownloadProgressUpdate */
        public void mo102287x32d250bd(int i17, int i18, long j17, long j18, java.lang.String str) {
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.f54342xe041c5d.mo100757x3164ae("onDownloadProgressUpdate");
            long j19 = i17;
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.f54339x94a85c7d = j19;
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.f54338xf7128dbd = j17;
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.f54356xd47fdabc = j18;
            com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPDownLoadProgressInfo tPDownLoadProgressInfo = new com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPDownLoadProgressInfo();
            tPDownLoadProgressInfo.f50885x990e2b68 = j19;
            tPDownLoadProgressInfo.f50883x51112b9 = i18;
            tPDownLoadProgressInfo.f50882x9e4c3cc2 = j17;
            tPDownLoadProgressInfo.f50886xd5bbe701 = j18;
            tPDownLoadProgressInfo.f50884xf0e1e4de = str;
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.m103606xd0c233a0(200, 0, 0, null, new com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26571x7baf53e9().put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54483x1466c762, java.lang.Integer.valueOf(i18)).put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54544xe37d7e5f, str).m104306x59bc66e());
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.m103593x7d7a028e(274, 0, 0, tPDownLoadProgressInfo);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
        /* renamed from: onDownloadProtocolUpdate */
        public void mo102288xab39e0e8(java.lang.String str, java.lang.String str2) {
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.f54342xe041c5d.mo100757x3164ae("onDownloadProtocolUpdate, protocol:" + str + ", protocolVer:" + str2);
            com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPProtocolInfo tPProtocolInfo = new com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPProtocolInfo();
            tPProtocolInfo.f50900x687a0b20 = str2;
            tPProtocolInfo.f50899x9967143 = str;
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.m103606xd0c233a0(202, 0, 0, null, new com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26571x7baf53e9().put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54493xdc0af674, str).put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54494x9fbf508f, str2).m104306x59bc66e());
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.m103593x7d7a028e(273, 0, 0, tPProtocolInfo);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
        /* renamed from: onDownloadStatusUpdate */
        public void mo102289xe40fe482(int i17) {
            if (i17 != com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.f54347x270d8d53) {
                com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.f54342xe041c5d.mo100757x3164ae("onDownloadStatusUpdate, status:" + i17);
                com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.f54347x270d8d53 = i17;
            }
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.m103593x7d7a028e(272, i17, 0, null);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnErrorListener
        /* renamed from: onError */
        public void mo100463xaf8aa769(int i17, int i18, long j17, long j18) {
            java.lang.String mo102990xe1ed3aa6 = com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.f54343xdf286140.mo102990xe1ed3aa6();
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.f54342xe041c5d.mo100757x3164ae("onError playerErrorCodeStr=" + mo102990xe1ed3aa6);
            if (!android.text.TextUtils.isEmpty(mo102990xe1ed3aa6)) {
                try {
                    i18 = java.lang.Integer.parseInt(mo102990xe1ed3aa6);
                    i17 = 4000;
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.f54342xe041c5d.mo103227xaa8bf022(e17);
                }
            }
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.m103590xd1f81421(i17, i18);
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.f54342xe041c5d.mo100757x3164ae("onError errorTypeReal=" + i17 + ", errorCodeReal=" + i18);
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26523xddda480e.TPSwitchCommonParams tPSwitchCommonParams = new com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26523xddda480e.TPSwitchCommonParams();
            tPSwitchCommonParams.f54414x2dd09b = j17;
            tPSwitchCommonParams.f54415x2dd09c = j18;
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.m103593x7d7a028e(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.f54310x2f0a66a6, i17, i18, tPSwitchCommonParams);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnInfoListener
        /* renamed from: onInfo */
        public void mo100464xc39adf2d(int i17, long j17, long j18, java.lang.Object obj) {
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.m103591xabf0fb75(i17, j17, j18, obj);
            if (i17 == 1011) {
                com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.m103595x47f2c379(obj);
                return;
            }
            if (i17 == 1012) {
                com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.m103589xb9475911(obj);
                return;
            }
            if (i17 == 4) {
                obj = java.lang.Long.valueOf(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.m103587x76cfa74d(((java.lang.Long) obj).longValue(), "async call select track"));
            }
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26523xddda480e.TPSwitchCommonParams tPSwitchCommonParams = new com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26523xddda480e.TPSwitchCommonParams();
            tPSwitchCommonParams.f54414x2dd09b = j17;
            tPSwitchCommonParams.f54415x2dd09c = j18;
            tPSwitchCommonParams.f54416x4991d76f = obj;
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.m103593x7d7a028e(261, i17, 0, tPSwitchCommonParams);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
        /* renamed from: onPlayCallback */
        public java.lang.Object mo102290x41392718(int i17, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
            if (i17 == 1) {
                com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.f54342xe041c5d.mo100757x3164ae("onDownloadNoMoreData");
                com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.m103593x7d7a028e(276, 0, 0, obj);
            } else if (i17 != 2) {
                switch (i17) {
                    case 8:
                        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.f54342xe041c5d.mo100757x3164ae("AB test info from download proxy received, key: " + obj + ", value: " + obj2);
                        java.util.HashMap hashMap = new java.util.HashMap();
                        hashMap.put((java.lang.String) obj, java.lang.Integer.valueOf((java.lang.String) obj2));
                        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.m103593x7d7a028e(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.f54315xb31efc87, 0, 0, hashMap);
                        break;
                    case 9:
                        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.f54342xe041c5d.mo100757x3164ae("onDownload Refresh M3U8");
                        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.m103593x7d7a028e(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.f54327xf088dd94, 0, 0, null);
                        break;
                    case 10:
                        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.f54342xe041c5d.mo100757x3164ae("onDownload multi network card not open, current low speed");
                        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.m103593x7d7a028e(283, 0, 0, null);
                        break;
                    case 11:
                        java.lang.String str = (java.lang.String) obj;
                        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.f54342xe041c5d.mo100757x3164ae("onDownload multi network use status change" + str);
                        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.m103593x7d7a028e(284, 0, 0, str);
                        break;
                }
            } else if (obj3 instanceof java.lang.Integer) {
                java.lang.Integer num = (java.lang.Integer) obj3;
                com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.f54342xe041c5d.mo100757x3164ae("onDownload suggest bitrate(bps):" + num);
                com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.m103593x7d7a028e(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.f54325x845aa0cb, num.intValue(), 0, null);
            } else {
                com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.f54342xe041c5d.mo100757x3164ae("MESSAGE_NOTIFY_PLAYER_SWITCH_DEFINITION, err ext3.");
            }
            return null;
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnPreparedListener
        /* renamed from: onPrepared */
        public void mo100465x58d5b73c() {
            int i17;
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.f54343xdf286140.mo103004x5cc08ff1(0);
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26130x49ae05 mo100250xb1b8bbdf = com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.f54345xb49bd9c1.mo100250xb1b8bbdf();
            java.lang.String str = mo100250xb1b8bbdf.m100283x755bd410() + "*" + mo100250xb1b8bbdf.m100274x1c4fb41d();
            com.p314xaae8f345.p3006xb8ff1437.api.C26201xd4eb4d7d[] mo100407x2ae89de3 = com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.f54345xb49bd9c1.mo100407x2ae89de3();
            if (mo100407x2ae89de3 != null) {
                i17 = 0;
                for (com.p314xaae8f345.p3006xb8ff1437.api.C26201xd4eb4d7d c26201xd4eb4d7d : mo100407x2ae89de3) {
                    if (c26201xd4eb4d7d.f51066x2b805725 == 2) {
                        i17++;
                    }
                }
            } else {
                i17 = 0;
            }
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.m103606xd0c233a0(103, 0, 0, null, new com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26571x7baf53e9().put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54489x140dc984, java.lang.Integer.valueOf(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.f54345xb49bd9c1.mo100251x6b2cfdb1())).put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54481xb4cdf7db, str).put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54480x74e6a74f, java.lang.Long.valueOf(mo100250xb1b8bbdf.m100277x52061508() / 8000)).put("duration", java.lang.Long.valueOf(mo100250xb1b8bbdf.m100273x37a7fa50())).put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54479xc2246ea6, mo100250xb1b8bbdf.m100268xe682dda2()).put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54553x5c42836f, java.lang.Long.valueOf(java.lang.System.currentTimeMillis())).put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.VodExKeys.f54581xa5400b0d, java.lang.Boolean.valueOf(i17 > 1)).m104306x59bc66e());
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.m103593x7d7a028e(257, 0, 0, null);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
        /* renamed from: onReadData */
        public int mo102291x715d255f(int i17, java.lang.String str, java.lang.String str2, long j17, long j18) {
            if (com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.f54337xcd9bff24 != null) {
                return com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.f54337xcd9bff24.mo103121x715d255f(i17, str, str2, j17, j18);
            }
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.f54342xe041c5d.mo100756x5c4d208("mAssetResourceLoader not set");
            return -1;
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnDemuxerListener
        /* renamed from: onSdpExchange */
        public com.p314xaae8f345.p3006xb8ff1437.api.C26191xd404514b mo100466xc45f8823(java.lang.String str, int i17) {
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26521xbcdea42 c26521xbcdea42 = com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.f54346x21973431;
            if (c26521xbcdea42 != null) {
                return c26521xbcdea42.mo100988xc45f8823(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this, str, i17);
            }
            return null;
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnSeekCompleteListener
        /* renamed from: onSeekComplete */
        public void mo100467xe1fdf750() {
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.m103609x287229ea();
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.m103606xd0c233a0(110, 0, 0, null, new com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26571x7baf53e9().put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54553x5c42836f, java.lang.Long.valueOf(java.lang.System.currentTimeMillis())).put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54566x77a53afe, java.lang.Long.valueOf(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.mo100915xddd35a52())).m104306x59bc66e());
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.m103593x7d7a028e(263, 0, 0, null);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
        /* renamed from: onStartReadData */
        public int mo102292x6e58d43(int i17, java.lang.String str, java.lang.String str2, long j17, long j18) {
            if (com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.f54337xcd9bff24 != null) {
                return com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.f54337xcd9bff24.mo103122x6e58d43(i17, str, str2, j17, j18);
            }
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.f54342xe041c5d.mo100756x5c4d208("mAssetResourceLoader not set");
            return -1;
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnStateChangeListener
        /* renamed from: onStateChange */
        public void mo100410x4799dc42(int i17, int i18) {
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.m103593x7d7a028e(277, i17, i18, null);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
        /* renamed from: onStopReadData */
        public int mo102293xfb96d801(int i17, java.lang.String str, java.lang.String str2, int i18) {
            if (com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.f54337xcd9bff24 != null) {
                return com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.f54337xcd9bff24.mo103123xfb96d801(i17, str, str2, i18);
            }
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.f54342xe041c5d.mo100756x5c4d208("mAssetResourceLoader not set");
            return -1;
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnSubtitleDataListener
        /* renamed from: onSubtitleData */
        public void mo100468xfb5e6f61(com.p314xaae8f345.p3006xb8ff1437.api.C26193x359f687e c26193x359f687e) {
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.m103593x7d7a028e(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.f54331x95f5222f, 0, 0, c26193x359f687e);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnSubtitleFrameOutListener
        /* renamed from: onSubtitleFrameOut */
        public void mo100469x715e46d8(com.p314xaae8f345.p3006xb8ff1437.api.C26194x3ac954b9 c26194x3ac954b9) {
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.m103593x7d7a028e(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.f54332xfb2818f7, 0, 0, c26194x3ac954b9);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnVideoFrameOutListener
        /* renamed from: onVideoFrameOut */
        public void mo100470xc11a2c9d(com.p314xaae8f345.p3006xb8ff1437.api.C26203x3f6f032e c26203x3f6f032e) {
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26521xbcdea42 c26521xbcdea42 = com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.f54346x21973431;
            if (c26521xbcdea42 != null) {
                c26521xbcdea42.mo100991xc11a2c9d(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this, c26203x3f6f032e);
            }
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnVideoProcessOutListener
        /* renamed from: onVideoProcessFrameOut */
        public com.p314xaae8f345.p3006xb8ff1437.api.C26188x7aa7007a mo100471x18d178b4(com.p314xaae8f345.p3006xb8ff1437.api.C26188x7aa7007a c26188x7aa7007a) {
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26521xbcdea42 c26521xbcdea42 = com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.f54346x21973431;
            if (c26521xbcdea42 != null) {
                return c26521xbcdea42.mo100992x18d178b4(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this, c26188x7aa7007a);
            }
            return null;
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnVideoSizeChangedListener
        /* renamed from: onVideoSizeChanged */
        public void mo100472xdc9583f7(long j17, long j18) {
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26523xddda480e.TPSwitchCommonParams tPSwitchCommonParams = new com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26523xddda480e.TPSwitchCommonParams();
            tPSwitchCommonParams.f54414x2dd09b = j17;
            tPSwitchCommonParams.f54415x2dd09c = j18;
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.m103593x7d7a028e(264, 0, 0, tPSwitchCommonParams);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
        /* renamed from: getPlayInfo */
        public java.lang.Object mo102280xebd0e778(java.lang.String str) {
            return null;
        }
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        f54335x6cc1582f = sparseIntArray;
        sparseIntArray.put(106, 1005);
        sparseIntArray.put(105, 1006);
    }

    public C26520x2c78c47d(android.content.Context context) {
        this(context, null);
    }

    /* renamed from: assignUniqueIdForOpaque */
    private long m103585x4c0fbdaf(long j17, java.lang.String str) {
        this.f54359x6f6ef27.put(java.lang.Long.valueOf(this.f54358xcb27b63), java.lang.Long.valueOf(j17));
        this.f54342xe041c5d.mo100757x3164ae(str + ", convert opaque(" + j17 + ") => uniqueId(" + this.f54358xcb27b63 + ")");
        long j18 = this.f54358xcb27b63;
        this.f54358xcb27b63 = 1 + j18;
        return j18;
    }

    /* renamed from: createDownloadParamData */
    private com.p314xaae8f345.p3006xb8ff1437.api.p3017x65fca6e.C26231xafaedb13 m103586xda591493(int i17, int i18) {
        com.p314xaae8f345.p3006xb8ff1437.api.p3017x65fca6e.C26231xafaedb13 c26231xafaedb13 = new com.p314xaae8f345.p3006xb8ff1437.api.p3017x65fca6e.C26231xafaedb13(0);
        c26231xafaedb13.m101466x888f5027(i17);
        c26231xafaedb13.m101438xbcc333ac(i18);
        return c26231xafaedb13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getOpaqueFromUniqueId */
    public long m103587x76cfa74d(long j17, java.lang.String str) {
        if (!this.f54359x6f6ef27.containsKey(java.lang.Long.valueOf(j17))) {
            this.f54342xe041c5d.mo100756x5c4d208(str + ", invalid uniqueId");
            return -1L;
        }
        long longValue = this.f54359x6f6ef27.get(java.lang.Long.valueOf(j17)).longValue();
        this.f54342xe041c5d.mo100757x3164ae(str + ", convert uniqueId(" + j17 + ") => opaque(" + longValue + ")");
        return longValue;
    }

    /* renamed from: getUrlProtocolType */
    private int m103588x3d18c2cb(java.lang.String str) {
        if (this.f54343xdf286140.mo102994xee89e31e()) {
            return 5;
        }
        return com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26584x36cf0f19.m104433x3d18c2cb(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleAudioTrackProxy */
    public void m103589xb9475911(java.lang.Object obj) {
        com.p314xaae8f345.p3006xb8ff1437.api.p3017x65fca6e.C26231xafaedb13 c26231xafaedb13;
        if (obj instanceof com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPAudioTrackInfo) {
            if (!m103597xd72c5154()) {
                this.f54342xe041c5d.mo100757x3164ae("handleAudioTrackProxy, proxy not enable and use orinal url");
                return;
            }
            com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPAudioTrackInfo tPAudioTrackInfo = (com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPAudioTrackInfo) obj;
            java.util.Iterator<com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1> it = tPAudioTrackInfo.f50861x746f6dd7.iterator();
            while (true) {
                if (!it.hasNext()) {
                    c26231xafaedb13 = null;
                    break;
                }
                com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1 next = it.next();
                if (next.m101069xb5884f29() == 0) {
                    c26231xafaedb13 = (com.p314xaae8f345.p3006xb8ff1437.api.p3017x65fca6e.C26231xafaedb13) next.m101074x2f090f6().f50735xb3582d72;
                    break;
                }
            }
            java.lang.String mo103006x9edb516e = this.f54343xdf286140.mo103006x9edb516e(2, tPAudioTrackInfo.f50859xd88b9e1a, c26231xafaedb13);
            this.f54363x4244e201.add(mo103006x9edb516e);
            tPAudioTrackInfo.f50862xc5474421 = mo103006x9edb516e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleOnError */
    public void m103590xd1f81421(int i17, int i18) {
        m103606xd0c233a0(108, i17, i18, "", new com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26571x7baf53e9().put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54553x5c42836f, java.lang.Long.valueOf(java.lang.System.currentTimeMillis())).put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54560xfb23a562, 3).put("code", i17 + "." + i18).m104306x59bc66e());
        this.f54343xdf286140.mo103004x5cc08ff1(3);
        this.f54343xdf286140.mo102995xe51afc9e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleOnInfo */
    public void m103591xabf0fb75(int i17, long j17, long j18, java.lang.Object obj) {
        if (i17 == 200) {
            this.f54343xdf286140.mo103004x5cc08ff1(4);
            m103606xd0c233a0(114, 0, 0, null, new com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26571x7baf53e9().put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54569x4532f0c8, java.lang.Long.valueOf(java.lang.System.currentTimeMillis())).put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54557xe73e0b15, 0).put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54559x5083788f, java.lang.Long.valueOf(mo100915xddd35a52())).put("url", this.f54360x32d9c2).m104306x59bc66e());
            return;
        }
        if (i17 == 201) {
            m103609x287229ea();
            m103606xd0c233a0(115, 0, 0, null, new com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26571x7baf53e9().put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54553x5c42836f, java.lang.Long.valueOf(java.lang.System.currentTimeMillis())).m104306x59bc66e());
            return;
        }
        if (i17 == 3) {
            long longValue = obj instanceof java.lang.Long ? ((java.lang.Long) obj).longValue() : -1L;
            this.f54342xe041c5d.mo100757x3164ae("switch definition finish defId:" + longValue);
            if (longValue > 0) {
                this.f54343xdf286140.mo102996x98130fa9(longValue);
            }
            m103606xd0c233a0(121, 0, 0, null, new com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26571x7baf53e9().put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54512xc618a7cf, longValue + "").m104306x59bc66e());
            return;
        }
        if (i17 == 106) {
            m103606xd0c233a0(105, 0, 0, null, new com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26571x7baf53e9().put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54553x5c42836f, java.lang.Long.valueOf(java.lang.System.currentTimeMillis())).m104306x59bc66e());
            return;
        }
        if (i17 == 501) {
            m103606xd0c233a0(117, 0, 0, null, obj);
            return;
        }
        if (i17 == 107) {
            m103606xd0c233a0(119, 0, 0, null, new com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26571x7baf53e9().put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54569x4532f0c8, java.lang.Long.valueOf(java.lang.System.currentTimeMillis())).m104306x59bc66e());
            return;
        }
        if (i17 == 4) {
            m103606xd0c233a0(123, 0, 0, null, new com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26571x7baf53e9().put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54550x6704fffd, obj).put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54553x5c42836f, java.lang.Long.valueOf(java.lang.System.currentTimeMillis())).put("code", java.lang.String.valueOf(j18)).m104306x59bc66e());
            return;
        }
        if (i17 == 101) {
            m103606xd0c233a0(124, 0, 0, null, new com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26571x7baf53e9().put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54569x4532f0c8, java.lang.Long.valueOf(java.lang.System.currentTimeMillis())).m104306x59bc66e());
            return;
        }
        if (i17 == 505 && (obj instanceof com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPMediaDrmInfo)) {
            com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPMediaDrmInfo tPMediaDrmInfo = (com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPMediaDrmInfo) obj;
            this.f54342xe041c5d.mo100757x3164ae("TPMediaDrmInfo secureDecoder:" + tPMediaDrmInfo.f50897xda357d3e + " secureDecrypt:" + tPMediaDrmInfo.f50898xda372a87 + " componentName:" + tPMediaDrmInfo.f50895x65b34528 + " drmType:" + tPMediaDrmInfo.f50896x729fa179);
        }
    }

    /* renamed from: handlePlayFlowEvent */
    private void m103592x9966fff0(@com.p314xaae8f345.p3006xb8ff1437.api.C26183xfc0748fc.TPPlayerDetailInfoType int i17) {
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.EventHandler eventHandler = this.f54357x6c4e5bc6;
        if (eventHandler != null) {
            android.os.Message obtainMessage = eventHandler.obtainMessage();
            obtainMessage.what = f54313x2c557d52;
            obtainMessage.obj = new com.p314xaae8f345.p3006xb8ff1437.api.C26183xfc0748fc(i17);
            this.f54357x6c4e5bc6.sendMessage(obtainMessage);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handlePlayerCallback */
    public void m103593x7d7a028e(int i17, int i18, int i19, java.lang.Object obj) {
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.EventHandler eventHandler = this.f54357x6c4e5bc6;
        if (eventHandler != null) {
            android.os.Message obtainMessage = eventHandler.obtainMessage();
            obtainMessage.what = i17;
            obtainMessage.arg1 = i18;
            obtainMessage.arg2 = i19;
            obtainMessage.obj = obj;
            this.f54357x6c4e5bc6.sendMessage(obtainMessage);
        }
    }

    /* renamed from: handlePlayerCallbackDelay */
    private void m103594x3eb52f95(int i17, int i18, int i19, java.lang.Object obj, long j17) {
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.EventHandler eventHandler = this.f54357x6c4e5bc6;
        if (eventHandler != null) {
            android.os.Message obtainMessage = eventHandler.obtainMessage();
            obtainMessage.what = i17;
            obtainMessage.arg1 = i18;
            obtainMessage.arg2 = i19;
            obtainMessage.obj = obj;
            this.f54357x6c4e5bc6.removeMessages(i17);
            this.f54357x6c4e5bc6.sendMessageDelayed(obtainMessage, j17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleSelectAudioTrack */
    public void m103595x47f2c379(java.lang.Object obj) {
        com.p314xaae8f345.p3006xb8ff1437.api.p3017x65fca6e.C26231xafaedb13 c26231xafaedb13;
        if (obj instanceof com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPAudioTrackInfo) {
            if (!m103597xd72c5154()) {
                this.f54342xe041c5d.mo100756x5c4d208("handleSelectAudioTrack, proxy is not enable");
                return;
            }
            com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPAudioTrackInfo tPAudioTrackInfo = (com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPAudioTrackInfo) obj;
            this.f54342xe041c5d.mo100757x3164ae("handleSelectAudioTrack, audioTrack url:" + tPAudioTrackInfo.f50859xd88b9e1a);
            if (android.text.TextUtils.isEmpty(tPAudioTrackInfo.f50859xd88b9e1a)) {
                try {
                    this.f54343xdf286140.mo103014xf482c3c8();
                    return;
                } catch (java.lang.Exception e17) {
                    this.f54342xe041c5d.mo103227xaa8bf022(e17);
                    return;
                }
            }
            java.util.Iterator<com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1> it = tPAudioTrackInfo.f50861x746f6dd7.iterator();
            while (true) {
                if (!it.hasNext()) {
                    c26231xafaedb13 = null;
                    break;
                }
                com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1 next = it.next();
                if (next.m101069xb5884f29() == 0) {
                    c26231xafaedb13 = (com.p314xaae8f345.p3006xb8ff1437.api.p3017x65fca6e.C26231xafaedb13) next.m101074x2f090f6().f50735xb3582d72;
                    break;
                }
            }
            this.f54343xdf286140.mo103009x39135b68(tPAudioTrackInfo.f50859xd88b9e1a, c26231xafaedb13 != null ? c26231xafaedb13.m101371xc7ebb78f() : "");
        }
    }

    /* renamed from: internalStop */
    private void m103596xfb3b9c5f() {
        try {
            this.f54345xb49bd9c1.mo100451x360802();
        } catch (java.lang.Exception e17) {
            this.f54342xe041c5d.mo103227xaa8bf022(e17);
        }
        m103606xd0c233a0(107, 0, 0, null, new com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26571x7baf53e9().put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54553x5c42836f, java.lang.Long.valueOf(java.lang.System.currentTimeMillis())).put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54560xfb23a562, 1).m104306x59bc66e());
        this.f54343xdf286140.mo103004x5cc08ff1(5);
        this.f54343xdf286140.mo102995xe51afc9e();
        this.f54339x94a85c7d = -1L;
        this.f54338xf7128dbd = -1L;
        this.f54356xd47fdabc = -1L;
    }

    /* renamed from: isUseProxyEnable */
    private boolean m103597xd72c5154() {
        this.f54342xe041c5d.mo100757x3164ae("isUseProxyEnable, mPlayProxyManager.isEnable()=" + this.f54343xdf286140.mo102993xdac2174d() + " TPPlayerConfig.isUseP2P()=" + com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3053xaf3f8342.C26465x6f5da734.m103093x10bc6e07() + " mUseProxy=" + this.f54361x134a18b4);
        return this.f54343xdf286140.mo102993xdac2174d() && com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3053xaf3f8342.C26465x6f5da734.m103093x10bc6e07() && this.f54361x134a18b4;
    }

    /* renamed from: notifyIsUseProxyInfo */
    private void m103598xeedec068() {
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26523xddda480e.TPSwitchCommonParams tPSwitchCommonParams = new com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26523xddda480e.TPSwitchCommonParams();
        tPSwitchCommonParams.f54414x2dd09b = m103597xd72c5154() ? 1L : 0L;
        m103593x7d7a028e(261, 1009, 0, tPSwitchCommonParams);
    }

    /* renamed from: onDetailInfo */
    private void m103600x8953bfde(com.p314xaae8f345.p3006xb8ff1437.api.C26183xfc0748fc c26183xfc0748fc) {
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26521xbcdea42 c26521xbcdea42 = this.f54346x21973431;
        if (c26521xbcdea42 != null) {
            c26521xbcdea42.mo100989x8953bfde(this, c26183xfc0748fc);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onInfoToOnDetailInfo */
    public void m103601x75ef5a86(int i17) {
        int i18 = f54335x6cc1582f.get(i17, -1);
        if (i18 == -1) {
            return;
        }
        m103599x8953bfde(i18);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onPlayFlowEvent */
    public void m103602xc94ee199(android.os.Message message) {
        java.lang.Object obj = message.obj;
        if (obj instanceof com.p314xaae8f345.p3006xb8ff1437.api.C26183xfc0748fc) {
            m103600x8953bfde((com.p314xaae8f345.p3006xb8ff1437.api.C26183xfc0748fc) obj);
        }
    }

    /* renamed from: publishPrepareEvent */
    private void m103603xa21d5482(java.lang.String str) {
        com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.PrepareStartEventInfo prepareStartEventInfo = new com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.PrepareStartEventInfo();
        prepareStartEventInfo.m103200xc80cdeb(str);
        this.f54353xbc0769c6.m103560xb9d3a239().m103222x8f7db6cb(prepareStartEventInfo);
    }

    /* renamed from: publishSetDataSourceEvent */
    private void m103604x81415be2(java.lang.String str, int i17, boolean z17) {
        com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.SetDataSourceEventInfo setDataSourceEventInfo = new com.p314xaae8f345.p3006xb8ff1437.p3055x5c6729a.C26474x564c866b.SetDataSourceEventInfo();
        setDataSourceEventInfo.m103215xca029dad(str);
        setDataSourceEventInfo.m103216x9b399365(i17);
        setDataSourceEventInfo.m103214xdb691e73(z17);
        this.f54353xbc0769c6.m103560xb9d3a239().m103222x8f7db6cb(setDataSourceEventInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pushEvent */
    public void m103606xd0c233a0(int i17, int i18, int i19, java.lang.String str, java.lang.Object obj) {
        try {
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.InterfaceC26526x89b09c75 interfaceC26526x89b09c75 = this.f54354x4233cfd1;
            if (interfaceC26526x89b09c75 != null) {
                interfaceC26526x89b09c75.mo103281xaf8c47fb(i17, i18, i19, str, obj);
            }
        } catch (java.lang.Exception e17) {
            this.f54342xe041c5d.mo103227xaa8bf022(e17);
        }
    }

    /* renamed from: removePlayerCallback */
    private void m103607x42e33bea(int i17) {
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.EventHandler eventHandler = this.f54357x6c4e5bc6;
        if (eventHandler != null) {
            eventHandler.removeMessages(i17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: reopenPlayer */
    public void m103608x3a86783e() {
        try {
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.InterfaceC26129xed1324a9 interfaceC26129xed1324a9 = this.f54345xb49bd9c1;
            if (interfaceC26129xed1324a9 != null) {
                interfaceC26129xed1324a9.mo100253x3a86783e();
            }
        } catch (java.lang.Exception e17) {
            this.f54342xe041c5d.mo100756x5c4d208("reopenPlayer has exception:" + e17.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setProxyStatePlayingOrPause */
    public void m103609x287229ea() {
        this.f54343xdf286140.mo103004x5cc08ff1(this.f54345xb49bd9c1.mo100252xc00617a4() ? 0 : 5);
    }

    /* renamed from: setTPPlayerOptionalParam */
    private void m103610xb3808c6e(com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1 c26182x67c007f1) {
        if (c26182x67c007f1 == null) {
            return;
        }
        if (c26182x67c007f1.m101069xb5884f29() == 206) {
            this.f54361x134a18b4 = c26182x67c007f1.m101070xc1e93551().f50727x6ac9171;
            this.f54342xe041c5d.mo100757x3164ae("setPlayerOptionalParam, use p2p proxy, OPTION_ID_BEFORE_BOOLEAN_USE_PROXY=" + this.f54361x134a18b4);
            return;
        }
        if (c26182x67c007f1.m101069xb5884f29() == 508) {
            this.f54340x6f80c59f = c26182x67c007f1.m101070xc1e93551().f50727x6ac9171;
        } else if (c26182x67c007f1.m101069xb5884f29() == 100) {
            this.f54352x3be94da8 = (int) c26182x67c007f1.m101073x73e0b5f3().f50734x6ac9171;
        } else if (c26182x67c007f1.m101069xb5884f29() == 500) {
            this.f54351x818d03e2 = (int) c26182x67c007f1.m101073x73e0b5f3().f50734x6ac9171;
        }
    }

    /* renamed from: updateStartAndSkipEndTimeMsForDownloadParam */
    private com.p314xaae8f345.p3006xb8ff1437.api.C26204xf8de58ad m103611x9efa72ad(com.p314xaae8f345.p3006xb8ff1437.api.C26204xf8de58ad c26204xf8de58ad, int i17, int i18) {
        this.f54342xe041c5d.mo100757x3164ae("updateStartAndSkipEndTimeMsForDownloadParam, startTimeMs:" + i17 + ", skipEndTimeMs:" + i18);
        if (c26204xf8de58ad == null) {
            return new com.p314xaae8f345.p3006xb8ff1437.api.C26204xf8de58ad.Builder().m101224x10a74e5(m103586xda591493(i17, i18)).m101222x59bc66e();
        }
        java.util.ArrayList<com.p314xaae8f345.p3006xb8ff1437.api.p3017x65fca6e.C26231xafaedb13> m101211x90b86fb = c26204xf8de58ad.m101211x90b86fb();
        if (m101211x90b86fb == null || m101211x90b86fb.isEmpty()) {
            c26204xf8de58ad.m101209x4b912b65().m101224x10a74e5(m103586xda591493(i17, i18)).m101222x59bc66e();
            return c26204xf8de58ad;
        }
        java.util.Iterator<com.p314xaae8f345.p3006xb8ff1437.api.p3017x65fca6e.C26231xafaedb13> it = m101211x90b86fb.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p3006xb8ff1437.api.p3017x65fca6e.C26231xafaedb13 next = it.next();
            next.m101466x888f5027(i17);
            next.m101438xbcc333ac(i18);
        }
        return c26204xf8de58ad;
    }

    /* renamed from: validCallSwitchDef */
    private boolean m103612x7ab780d7() {
        int mo100249xb7d72d0e = this.f54345xb49bd9c1.mo100249xb7d72d0e();
        return mo100249xb7d72d0e == 4 || mo100249xb7d72d0e == 5 || mo100249xb7d72d0e == 6 || mo100249xb7d72d0e == 7;
    }

    /* renamed from: validStateCall */
    private boolean m103613x3465cdf3(int i17) {
        int mo100249xb7d72d0e = this.f54345xb49bd9c1.mo100249xb7d72d0e();
        return i17 == 2 ? mo100249xb7d72d0e == 1 : i17 != 17 || mo100249xb7d72d0e == 4 || mo100249xb7d72d0e == 5 || mo100249xb7d72d0e == 6 || mo100249xb7d72d0e == 7;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    @com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26580xafd4c79e.ThreadSwitch
    /* renamed from: addAudioTrackSource */
    public void mo100898xa28fa651(java.lang.String str, java.lang.String str2) {
        this.f54342xe041c5d.mo100757x3164ae(f54306x186855b3 + "addAudioTrackSource, url:" + str + ", name:" + str2);
        mo100899xa28fa651(str, str2, null);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    @com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26580xafd4c79e.ThreadSwitch(m104402x5b9ad2cf = true)
    /* renamed from: addSubtitleSource */
    public void mo100900x14654554(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f54342xe041c5d.mo100757x3164ae(f54306x186855b3 + "addSubtitleSource, url:" + str + ", mimeType:" + str2 + ", name:" + str3);
        mo100901x14654554(str, str2, str3, null);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    @com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26580xafd4c79e.ThreadSwitch(m104403x339a532b = true)
    /* renamed from: captureVideo */
    public void mo100902x2d34f8d5(com.p314xaae8f345.p3006xb8ff1437.api.C26171xafafaf50 c26171xafafaf50, com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26170x325bffaf interfaceC26170x325bffaf) {
        this.f54342xe041c5d.mo100757x3164ae(f54306x186855b3 + "captureVideo, params:" + c26171xafafaf50 + ", captureCallBack:" + interfaceC26170x325bffaf);
        try {
            this.f54345xb49bd9c1.mo100388x2d34f8d5(c26171xafafaf50, interfaceC26170x325bffaf);
        } catch (java.lang.Exception e17) {
            this.f54342xe041c5d.mo103227xaa8bf022(e17);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: configBufferDurationAsync */
    public int mo100903x59e24e46(int i17, long j17, long j18, long j19) {
        return this.f54345xb49bd9c1.mo100389x59e24e46(i17, j17, j18, j19);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    @com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26580xafd4c79e.ThreadSwitch
    /* renamed from: deselectTrack */
    public void mo100904x4080528e(int i17, long j17) {
        this.f54342xe041c5d.mo100757x3164ae(f54306x186855b3 + "deselectTrack, trackIndex:" + i17 + ", opaque:" + j17);
        try {
            this.f54345xb49bd9c1.mo100390x4080528e(i17, j17);
        } catch (java.lang.Exception e17) {
            this.f54342xe041c5d.mo103227xaa8bf022(e17);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    @com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26580xafd4c79e.ThreadSwitch
    /* renamed from: enableTPAssetResourceLoader */
    public void mo100905x969bf12(com.p314xaae8f345.p3006xb8ff1437.api.p3020x27f531a1.InterfaceC26242xd2a9d8e0 interfaceC26242xd2a9d8e0, android.os.Looper looper) {
        if (interfaceC26242xd2a9d8e0 != null) {
            this.f54343xdf286140.mo102999x94fe7f5c(true);
            com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.InterfaceC26468xe997c0c interfaceC26468xe997c0c = this.f54337xcd9bff24;
            if (interfaceC26468xe997c0c != null) {
                interfaceC26468xe997c0c.mo103115x41012807();
                this.f54337xcd9bff24 = null;
            }
            com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.C26469xb27744b5 c26469xb27744b5 = new com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.C26469xb27744b5(this.f54353xbc0769c6.m103559x6a789444(), looper);
            this.f54337xcd9bff24 = c26469xb27744b5;
            c26469xb27744b5.mo103117x5d2e5f67(interfaceC26242xd2a9d8e0);
            this.f54337xcd9bff24.mo103113x5240871b();
            return;
        }
        this.f54343xdf286140.mo102999x94fe7f5c(false);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: getAutoExpendBufferCount */
    public int mo100907xa42b888c() {
        return this.f54345xb49bd9c1.mo100391xa42b888c();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: getBufferIOMaxReadDurationPosMs */
    public long mo100908xdc51b7e8() {
        return this.f54345xb49bd9c1.mo100392xdc51b7e8();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: getBufferIOMaxReadFileOffset */
    public long mo100909x69f9266d() {
        return this.f54345xb49bd9c1.mo100393x69f9266d();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: getBufferIOMaxWriteDurationPosMs */
    public long mo100910xed03e74f() {
        return this.f54345xb49bd9c1.mo100394xed03e74f();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: getBufferIOMaxWriteFileOffset */
    public long mo100911x1e708866() {
        return this.f54345xb49bd9c1.mo100395x1e708866();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: getBufferPercent */
    public int mo100912x3421dc2f() {
        if (this.f54345xb49bd9c1.mo100400x37a7fa50() == 0) {
            return 0;
        }
        return (int) ((((float) (this.f54345xb49bd9c1.mo100403xac6a8d7e() - this.f54345xb49bd9c1.mo100398xddd35a52())) * 100.0f) / ((float) this.f54345xb49bd9c1.mo100400x37a7fa50()));
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: getBufferedDurationMs */
    public long mo100913x23e0c68f() {
        return this.f54345xb49bd9c1.mo100396x23e0c68f();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: getBufferedSize */
    public long mo100914x45feff6() {
        return this.f54345xb49bd9c1.mo100397x45feff6();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: getCurrentPositionMs */
    public long mo100915xddd35a52() {
        return this.f54345xb49bd9c1.mo100398xddd35a52();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    @com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26580xafd4c79e.ThreadSwitch(m104403x339a532b = true)
    /* renamed from: getCurrentState */
    public int mo100916xb7d72d0e() {
        return this.f54345xb49bd9c1.mo100249xb7d72d0e();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: getDurationMs */
    public long mo100917x37a7fa50() {
        return this.f54345xb49bd9c1.mo100400x37a7fa50();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: getExtendReportController */
    public com.p314xaae8f345.p3006xb8ff1437.api.p3019xe68be6b0.InterfaceC26238x3fcd9a0f mo100918xe88aaa20() {
        return this.f54348xca026e7d;
    }

    /* renamed from: getLooper */
    public android.os.Looper m103614x23b2dd47() {
        return this.f54355x66f29e08;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: getPlayableDurationMs */
    public long mo100919xac6a8d7e() {
        if (!m103597xd72c5154()) {
            return this.f54345xb49bd9c1.mo100403xac6a8d7e();
        }
        long j17 = this.f54338xf7128dbd;
        if (j17 > 0) {
            long j18 = this.f54356xd47fdabc;
            if (j18 > 0) {
                return (long) (((j17 * 1.0d) / j18) * this.f54345xb49bd9c1.mo100400x37a7fa50());
            }
        }
        return this.f54339x94a85c7d;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: getPlayerBufferedDurationMs */
    public long mo100920x21a0b6d0() {
        return this.f54345xb49bd9c1.mo100403xac6a8d7e();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: getPlayerProxy */
    public com.p314xaae8f345.p3006xb8ff1437.api.p3017x65fca6e.InterfaceC26228x968ada48 mo100921xfa372ad7() {
        return this.f54343xdf286140;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    @com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26580xafd4c79e.ThreadSwitch(m104403x339a532b = true)
    /* renamed from: getPlayerType */
    public int mo100922x6b2cfdb1() {
        this.f54342xe041c5d.mo100757x3164ae(f54306x186855b3 + "getPlayerType");
        return this.f54345xb49bd9c1.mo100251x6b2cfdb1();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    @com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26580xafd4c79e.ThreadSwitch(m104403x339a532b = true)
    /* renamed from: getProgramInfo */
    public com.p314xaae8f345.p3006xb8ff1437.api.C26189x4a228d36[] mo100923x160d5c1c() {
        this.f54342xe041c5d.mo100757x3164ae(f54306x186855b3 + "getProgramInfo");
        return this.f54345xb49bd9c1.mo100404x160d5c1c();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    @com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26580xafd4c79e.ThreadSwitch(m104403x339a532b = true)
    /* renamed from: getPropertyLong */
    public long mo100924x2d67b867(int i17) {
        this.f54342xe041c5d.mo100757x3164ae(f54306x186855b3 + "getPropertyLong, paramId:" + i17);
        try {
            return this.f54345xb49bd9c1.mo100405x2d67b867(i17);
        } catch (java.lang.Exception e17) {
            this.f54342xe041c5d.mo103227xaa8bf022(e17);
            return 0L;
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    @com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26580xafd4c79e.ThreadSwitch(m104403x339a532b = true)
    /* renamed from: getPropertyString */
    public java.lang.String mo100925x7e95833c(int i17) {
        this.f54342xe041c5d.mo100757x3164ae(f54306x186855b3 + "getPropertyString, paramId:" + i17);
        try {
            return this.f54345xb49bd9c1.mo100406x7e95833c(i17);
        } catch (java.lang.Exception e17) {
            this.f54342xe041c5d.mo103227xaa8bf022(e17);
            return "";
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: getReportManager */
    public com.p314xaae8f345.p3006xb8ff1437.api.p3018xc84c5534.InterfaceC26234x67c8074 mo100926xba388c23() {
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd c26530x3dc5debd = this.f54349x57e6d86c;
        return c26530x3dc5debd == null ? this.f54350x9b6bcd9f : c26530x3dc5debd;
    }

    /* renamed from: getTag */
    public java.lang.String m103615xb5887064() {
        return this.f54342xe041c5d.mo103226xb5887064();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    @com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26580xafd4c79e.ThreadSwitch(m104403x339a532b = true)
    /* renamed from: getTrackInfo */
    public com.p314xaae8f345.p3006xb8ff1437.api.C26201xd4eb4d7d[] mo100927x2ae89de3() {
        this.f54342xe041c5d.mo100757x3164ae(f54306x186855b3 + "getTrackInfo");
        return this.f54345xb49bd9c1.mo100407x2ae89de3();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    @com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26580xafd4c79e.ThreadSwitch(m104403x339a532b = true)
    /* renamed from: getVideoHeight */
    public int mo100928x463504c() {
        this.f54342xe041c5d.mo100757x3164ae(f54306x186855b3 + "getVideoHeight");
        return this.f54345xb49bd9c1.mo100408x463504c();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    @com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26580xafd4c79e.ThreadSwitch(m104403x339a532b = true)
    /* renamed from: getVideoWidth */
    public int mo100929x8d5c7601() {
        this.f54342xe041c5d.mo100757x3164ae(f54306x186855b3 + "getVideoWidth");
        return this.f54345xb49bd9c1.mo100409x8d5c7601();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    @com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26580xafd4c79e.ThreadSwitch
    /* renamed from: pause */
    public void mo100930x65825f6() {
        this.f54342xe041c5d.mo100757x3164ae(f54306x186855b3 + "pause");
        try {
            this.f54345xb49bd9c1.mo100411x65825f6();
            m103606xd0c233a0(106, 0, 0, null, new com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26571x7baf53e9().put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54569x4532f0c8, java.lang.Long.valueOf(java.lang.System.currentTimeMillis())).m104306x59bc66e());
            this.f54343xdf286140.mo103004x5cc08ff1(5);
        } catch (java.lang.Exception e17) {
            this.f54342xe041c5d.mo103227xaa8bf022(e17);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    @com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26580xafd4c79e.ThreadSwitch
    /* renamed from: pauseDownload */
    public void mo100931xe51afc9e() {
        this.f54342xe041c5d.mo100757x3164ae(f54306x186855b3 + "pauseDownload");
        try {
            this.f54345xb49bd9c1.mo100447x1ba09fea(new com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1().m101062xac7b1a0a(502, 0L));
        } catch (java.lang.Exception e17) {
            this.f54342xe041c5d.mo103227xaa8bf022(e17);
        }
        this.f54343xdf286140.mo102995xe51afc9e();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    @com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26580xafd4c79e.ThreadSwitch
    /* renamed from: prepareAsync */
    public void mo100932x857611b5() {
        java.lang.String str = java.util.UUID.randomUUID().toString() + java.lang.System.nanoTime() + "_" + com.p314xaae8f345.p3006xb8ff1437.p3026xaf3f8342.C26278x84e5221f.m101638xeb97a5e9();
        m103592x9966fff0(1003);
        this.f54342xe041c5d.mo100757x3164ae(f54306x186855b3 + "prepareAsync");
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd c26530x3dc5debd = this.f54349x57e6d86c;
        boolean m103746xe40d9ea6 = c26530x3dc5debd != null ? c26530x3dc5debd.m103746xe40d9ea6() : true;
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26540x26a27a8c c26540x26a27a8c = this.f54348xca026e7d;
        if (c26540x26a27a8c != null) {
            c26540x26a27a8c.m103837xe94a10a(m103746xe40d9ea6);
        }
        try {
            this.f54343xdf286140.mo102998xb0277d5();
            this.f54345xb49bd9c1.mo100413x857611b5();
        } catch (java.lang.RuntimeException e17) {
            this.f54342xe041c5d.mo103227xaa8bf022(e17);
        }
        m103603xa21d5482(str);
        try {
            m103606xd0c233a0(102, 0, 0, null, new com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26571x7baf53e9().put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54569x4532f0c8, java.lang.Long.valueOf(java.lang.System.currentTimeMillis())).put("url", this.f54360x32d9c2).put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54486x6397925a, java.lang.Boolean.valueOf(m103597xd72c5154())).put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54475xe9ed6778, str).m104306x59bc66e());
            m103598xeedec068();
        } catch (java.lang.Exception e18) {
            this.f54342xe041c5d.mo103227xaa8bf022(e18);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    @com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26580xafd4c79e.ThreadSwitch(m104403x339a532b = true)
    /* renamed from: release */
    public void mo100933x41012807() {
        this.f54342xe041c5d.mo100757x3164ae(f54306x186855b3 + "release");
        this.f54345xb49bd9c1.mo100414x41012807();
        m103606xd0c233a0(112, 0, 0, null, new com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26571x7baf53e9().put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54553x5c42836f, java.lang.Long.valueOf(java.lang.System.currentTimeMillis())).put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54560xfb23a562, 1).m104306x59bc66e());
        this.f54346x21973431.m103616x5a5b64d();
        this.f54343xdf286140.mo102997x41012807();
        this.f54363x4244e201.clear();
        com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.InterfaceC26468xe997c0c interfaceC26468xe997c0c = this.f54337xcd9bff24;
        if (interfaceC26468xe997c0c != null) {
            interfaceC26468xe997c0c.mo103115x41012807();
            this.f54337xcd9bff24 = null;
        }
        this.f54339x94a85c7d = -1L;
        this.f54338xf7128dbd = -1L;
        this.f54356xd47fdabc = -1L;
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26581x3df100e2.m104405x9cf0d20b().m104417x408b7293(this.f54341x3e0f3a87, this.f54357x6c4e5bc6);
        this.f54341x3e0f3a87 = null;
        this.f54357x6c4e5bc6 = null;
        this.f54354x4233cfd1.mo103645x41012807();
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26540x26a27a8c c26540x26a27a8c = this.f54348xca026e7d;
        if (c26540x26a27a8c != null) {
            c26540x26a27a8c.m103835x41012807();
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    @com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26580xafd4c79e.ThreadSwitch(m104403x339a532b = true)
    /* renamed from: reset */
    public void mo100934x6761d4f() {
        this.f54342xe041c5d.mo100757x3164ae(f54306x186855b3 + "reset");
        if (this.f54362x1f1cf395) {
            this.f54342xe041c5d.mo103229xc89e9ba9(java.lang.String.valueOf(this.f54344x3b3a2a21.incrementAndGet()));
            this.f54345xb49bd9c1.mo100456x80f0bbb6(this.f54342xe041c5d.m103231xe4cf9ecd());
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26521xbcdea42 c26521xbcdea42 = this.f54346x21973431;
            if (c26521xbcdea42 != null) {
                c26521xbcdea42.m103633x8bd16e11(this.f54342xe041c5d.m103231xe4cf9ecd().m103238xb5887064());
            }
        }
        try {
            this.f54345xb49bd9c1.mo100415x6761d4f();
        } catch (java.lang.Exception e17) {
            this.f54342xe041c5d.mo103227xaa8bf022(e17);
        }
        m103606xd0c233a0(113, 0, 0, null, new com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26571x7baf53e9().put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54553x5c42836f, java.lang.Long.valueOf(java.lang.System.currentTimeMillis())).put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54560xfb23a562, 1).m104306x59bc66e());
        this.f54343xdf286140.mo103013xf2c12aa();
        this.f54347x270d8d53 = -1;
        this.f54363x4244e201.clear();
        com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.InterfaceC26468xe997c0c interfaceC26468xe997c0c = this.f54337xcd9bff24;
        if (interfaceC26468xe997c0c != null) {
            interfaceC26468xe997c0c.mo103116x6761d4f();
        }
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.EventHandler eventHandler = this.f54357x6c4e5bc6;
        if (eventHandler != null) {
            eventHandler.removeCallbacksAndMessages(null);
        }
        this.f54339x94a85c7d = -1L;
        this.f54338xf7128dbd = -1L;
        this.f54356xd47fdabc = -1L;
        this.f54361x134a18b4 = true;
        this.f54340x6f80c59f = false;
        this.f54352x3be94da8 = 0;
        this.f54351x818d03e2 = 0;
        this.f54359x6f6ef27.clear();
        this.f54358xcb27b63 = 0L;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    @com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26580xafd4c79e.ThreadSwitch
    /* renamed from: resumeDownload */
    public void mo100935xb0277d5() {
        this.f54342xe041c5d.mo100757x3164ae(f54306x186855b3 + "resumeDownload");
        this.f54343xdf286140.mo102998xb0277d5();
        try {
            this.f54345xb49bd9c1.mo100447x1ba09fea(new com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1().m101062xac7b1a0a(502, 1L));
        } catch (java.lang.Exception e17) {
            this.f54342xe041c5d.mo103227xaa8bf022(e17);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    @com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26580xafd4c79e.ThreadSwitch
    /* renamed from: seekTo */
    public void mo100936xc9fc1b13(int i17) {
        this.f54342xe041c5d.mo100757x3164ae(f54306x186855b3 + "seekTo, positionMs:" + i17);
        try {
            this.f54345xb49bd9c1.mo100416xc9fc1b13(i17);
        } catch (java.lang.Exception e17) {
            this.f54342xe041c5d.mo103227xaa8bf022(e17);
        }
        this.f54343xdf286140.mo103004x5cc08ff1(1);
        m103606xd0c233a0(109, 0, 0, null, new com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26571x7baf53e9().put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54569x4532f0c8, java.lang.Long.valueOf(java.lang.System.currentTimeMillis())).put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54557xe73e0b15, 0).put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54567x12c60097, java.lang.Long.valueOf(mo100915xddd35a52())).m104306x59bc66e());
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    @com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26580xafd4c79e.ThreadSwitch
    /* renamed from: selectProgram */
    public void mo100938x18ae2de8(int i17, long j17) {
        this.f54342xe041c5d.mo100757x3164ae(f54306x186855b3 + "selectProgram, programIndex:" + i17 + ", opaque:" + j17);
        try {
            this.f54345xb49bd9c1.mo100418x18ae2de8(i17, j17);
        } catch (java.lang.Exception e17) {
            this.f54342xe041c5d.mo103227xaa8bf022(e17);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    @com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26580xafd4c79e.ThreadSwitch
    /* renamed from: selectTrack */
    public void mo100939xc3b89af(int i17, long j17) {
        this.f54342xe041c5d.mo100757x3164ae(f54306x186855b3 + "selectTrack, trackIndex:" + i17 + ", opaque:" + j17);
        try {
            long m103585x4c0fbdaf = m103585x4c0fbdaf(j17, "selectTrack");
            com.p314xaae8f345.p3006xb8ff1437.api.C26201xd4eb4d7d[] mo100407x2ae89de3 = this.f54345xb49bd9c1.mo100407x2ae89de3();
            if (mo100407x2ae89de3 != null && mo100407x2ae89de3.length > i17) {
                m103606xd0c233a0(122, 0, 0, null, new com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26571x7baf53e9().put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54550x6704fffd, java.lang.Long.valueOf(m103585x4c0fbdaf)).put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54568xaa3f2313, java.lang.Integer.valueOf(mo100407x2ae89de3[i17].m101187x2aedc86f())).put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, mo100407x2ae89de3[i17].m101186xfb82e301()).put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54569x4532f0c8, java.lang.Long.valueOf(java.lang.System.currentTimeMillis())).m104306x59bc66e());
            }
            this.f54345xb49bd9c1.mo100419xc3b89af(i17, m103585x4c0fbdaf);
        } catch (java.lang.Exception e17) {
            this.f54342xe041c5d.mo103227xaa8bf022(e17);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    @com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26580xafd4c79e.ThreadSwitch(m104404xca989f3f = true)
    /* renamed from: setAudioGainRatio */
    public void mo100940x3aa51598(float f17) {
        this.f54342xe041c5d.mo100757x3164ae(f54306x186855b3 + "setAudioGainRatio, gainRatio:" + f17);
        try {
            this.f54345xb49bd9c1.mo100420x3aa51598(f17);
        } catch (java.lang.Exception e17) {
            this.f54342xe041c5d.mo103227xaa8bf022(e17);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    @com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26580xafd4c79e.ThreadSwitch(m104404xca989f3f = true)
    /* renamed from: setAudioNormalizeVolumeParams */
    public void mo100941x1e3370b9(java.lang.String str) {
        this.f54342xe041c5d.mo100757x3164ae(f54306x186855b3 + "setAudioNormalizeVolumeParams, audioNormalizeVolumeParams:" + str);
        try {
            this.f54345xb49bd9c1.mo100421x1e3370b9(str);
        } catch (java.lang.Exception e17) {
            this.f54342xe041c5d.mo103227xaa8bf022(e17);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    @com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26580xafd4c79e.ThreadSwitch
    /* renamed from: setDataSource */
    public void mo100945x683d6267(java.lang.String str) {
        if (!android.text.TextUtils.isEmpty(str)) {
            if (this.f54345xb49bd9c1.mo100249xb7d72d0e() == 1) {
                m103604x81415be2(str, m103588x3d18c2cb(str), m103597xd72c5154());
                m103592x9966fff0(1000);
                this.f54342xe041c5d.mo100757x3164ae(f54306x186855b3 + "setDataSource, url:" + str);
                this.f54360x32d9c2 = str;
                com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26142x43104e18 c26142x43104e18 = new com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26142x43104e18(str);
                this.f54342xe041c5d.mo100757x3164ae("handleSetDataSource originalUrl=" + str);
                if (m103597xd72c5154()) {
                    c26142x43104e18 = this.f54343xdf286140.mo103007x7291d95e(str, null);
                    this.f54342xe041c5d.mo100757x3164ae("handleSetDataSource selfPlayerUrl=" + c26142x43104e18.m100557x18ed3d2c());
                    this.f54342xe041c5d.mo100757x3164ae("handleSetDataSource systemPlayerUrl=" + c26142x43104e18.m100558x6e7e3f29());
                }
                this.f54345xb49bd9c1.mo100254x683d6267(c26142x43104e18);
                m103592x9966fff0(1001);
                return;
            }
            throw new java.lang.IllegalStateException("error : setDataSource , state invalid. current state:" + this.f54345xb49bd9c1.mo100249xb7d72d0e());
        }
        throw new java.lang.IllegalArgumentException("error : setDataSource , param is invalid");
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    @com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26580xafd4c79e.ThreadSwitch(m104402x5b9ad2cf = true, m104404xca989f3f = true)
    /* renamed from: setLoopback */
    public void mo100947xfd27780d(boolean z17) {
        this.f54342xe041c5d.mo100757x3164ae(f54306x186855b3 + "setLoopback, isLoopback:" + z17);
        try {
            this.f54345xb49bd9c1.mo100427xfd27780d(z17);
        } catch (java.lang.Exception e17) {
            this.f54342xe041c5d.mo103227xaa8bf022(e17);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: setOnAudioFrameOutputListener */
    public void mo100949x47402aed(com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnAudioFrameOutputListener iOnAudioFrameOutputListener) {
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26521xbcdea42 c26521xbcdea42 = this.f54346x21973431;
        if (c26521xbcdea42 != null) {
            c26521xbcdea42.m103617x3282865a(iOnAudioFrameOutputListener);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: setOnAudioProcessFrameOutputListener */
    public void mo100950xbd4f3f08(com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnAudioProcessFrameOutputListener iOnAudioProcessFrameOutputListener) {
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26521xbcdea42 c26521xbcdea42 = this.f54346x21973431;
        if (c26521xbcdea42 != null) {
            c26521xbcdea42.m103618xb23c0daf(iOnAudioProcessFrameOutputListener);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: setOnCompletionListener */
    public void mo100951xa4560c71(com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnCompletionListener iOnCompletionListener) {
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26521xbcdea42 c26521xbcdea42 = this.f54346x21973431;
        if (c26521xbcdea42 != null) {
            c26521xbcdea42.m103619xa4560c71(iOnCompletionListener);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: setOnDemuxerListener */
    public void mo100952xa8a04d4f(com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnDemuxerListener iOnDemuxerListener) {
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26521xbcdea42 c26521xbcdea42 = this.f54346x21973431;
        if (c26521xbcdea42 != null) {
            c26521xbcdea42.m103620xa8a04d4f(iOnDemuxerListener);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: setOnDetailInfoListener */
    public void mo100953xa4b31634(com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnDetailInfoListener iOnDetailInfoListener) {
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26521xbcdea42 c26521xbcdea42 = this.f54346x21973431;
        if (c26521xbcdea42 != null) {
            c26521xbcdea42.m103621xa4b31634(iOnDetailInfoListener);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: setOnErrorListener */
    public void mo100954x6954c27b(com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnErrorListener iOnErrorListener) {
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26521xbcdea42 c26521xbcdea42 = this.f54346x21973431;
        if (c26521xbcdea42 != null) {
            c26521xbcdea42.m103622x6954c27b(iOnErrorListener);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: setOnInfoListener */
    public void mo100955x40f8c003(com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnInfoListener iOnInfoListener) {
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26521xbcdea42 c26521xbcdea42 = this.f54346x21973431;
        if (c26521xbcdea42 != null) {
            c26521xbcdea42.m103623x40f8c003(iOnInfoListener);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: setOnPlayerStateChangeListener */
    public void mo100956xa23b7bf3(com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnStateChangeListener iOnStateChangeListener) {
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26521xbcdea42 c26521xbcdea42 = this.f54346x21973431;
        if (c26521xbcdea42 != null) {
            c26521xbcdea42.m103624xa23b7bf3(iOnStateChangeListener);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: setOnPreparedListener */
    public void mo100957x5dd7c812(com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnPreparedListener iOnPreparedListener) {
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26521xbcdea42 c26521xbcdea42 = this.f54346x21973431;
        if (c26521xbcdea42 != null) {
            c26521xbcdea42.m103625x5dd7c812(iOnPreparedListener);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: setOnSeekCompleteListener */
    public void mo100958xe1a2e326(com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnSeekCompleteListener iOnSeekCompleteListener) {
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26521xbcdea42 c26521xbcdea42 = this.f54346x21973431;
        if (c26521xbcdea42 != null) {
            c26521xbcdea42.m103626xe1a2e326(iOnSeekCompleteListener);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: setOnStopAsyncCompleteListener */
    public void mo100959x6aa275e6(com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnStopAsyncCompleteListener iOnStopAsyncCompleteListener) {
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26521xbcdea42 c26521xbcdea42 = this.f54346x21973431;
        if (c26521xbcdea42 != null) {
            c26521xbcdea42.m103627x6aa275e6(iOnStopAsyncCompleteListener);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: setOnSubtitleDataListener */
    public void mo100960x8796ba37(com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnSubtitleDataListener iOnSubtitleDataListener) {
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26521xbcdea42 c26521xbcdea42 = this.f54346x21973431;
        if (c26521xbcdea42 != null) {
            c26521xbcdea42.m103628x8796ba37(iOnSubtitleDataListener);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: setOnSubtitleFrameOutListener */
    public void mo100961xa679d9ae(com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnSubtitleFrameOutListener iOnSubtitleFrameOutListener) {
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26521xbcdea42 c26521xbcdea42 = this.f54346x21973431;
        if (c26521xbcdea42 != null) {
            c26521xbcdea42.m103629xa679d9ae(iOnSubtitleFrameOutListener);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: setOnVideoFrameOutListener */
    public void mo100962xf26db5af(com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnVideoFrameOutListener iOnVideoFrameOutListener) {
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26521xbcdea42 c26521xbcdea42 = this.f54346x21973431;
        if (c26521xbcdea42 != null) {
            c26521xbcdea42.m103630xf26db5af(iOnVideoFrameOutListener);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: setOnVideoProcessFrameOutputListener */
    public void mo100963xa90b836d(com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnVideoProcessFrameOutputListener iOnVideoProcessFrameOutputListener) {
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26521xbcdea42 c26521xbcdea42 = this.f54346x21973431;
        if (c26521xbcdea42 != null) {
            c26521xbcdea42.m103631x7e05de2a(iOnVideoProcessFrameOutputListener);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: setOnVideoSizeChangedListener */
    public void mo100964x2d6d87cd(com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnVideoSizeChangedListener iOnVideoSizeChangedListener) {
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26521xbcdea42 c26521xbcdea42 = this.f54346x21973431;
        if (c26521xbcdea42 != null) {
            c26521xbcdea42.m103632x2d6d87cd(iOnVideoSizeChangedListener);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    @com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26580xafd4c79e.ThreadSwitch(m104404xca989f3f = true)
    /* renamed from: setOutputMute */
    public void mo100965xd0747cbc(boolean z17) {
        this.f54342xe041c5d.mo100757x3164ae(f54306x186855b3 + "setOutputMute, isOutputMute:" + z17);
        try {
            this.f54345xb49bd9c1.mo100444xd0747cbc(z17);
        } catch (java.lang.Exception e17) {
            this.f54342xe041c5d.mo103227xaa8bf022(e17);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    @com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26580xafd4c79e.ThreadSwitch
    /* renamed from: setPlaySharpenSwitch */
    public void mo100966x41b4a011() {
        this.f54342xe041c5d.mo100757x3164ae(f54306x186855b3 + "setPlaySharpenSwitch");
        this.f54345xb49bd9c1.mo100445x41b4a011();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    @com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26580xafd4c79e.ThreadSwitch(m104404xca989f3f = true)
    /* renamed from: setPlaySpeedRatio */
    public void mo100967xd079f5a(float f17) {
        this.f54342xe041c5d.mo100757x3164ae(f54306x186855b3 + "setPlaySpeedRatio, speedRatio:" + f17);
        try {
            this.f54343xdf286140.mo103002xd079f5a(f17);
            this.f54345xb49bd9c1.mo100446xd079f5a(f17);
        } catch (java.lang.Exception e17) {
            this.f54342xe041c5d.mo103227xaa8bf022(e17);
        }
        m103606xd0c233a0(116, 0, 0, null, new com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26571x7baf53e9().put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, java.lang.Float.valueOf(f17)).m104306x59bc66e());
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    @com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26580xafd4c79e.ThreadSwitch(m104402x5b9ad2cf = true)
    /* renamed from: setPlayerOptionalParam */
    public void mo100968x1ba09fea(com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1 c26182x67c007f1) {
        if (c26182x67c007f1.m101078x73e47eb1() == 7 && !com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26575x6ea0c705.m104357x87580641(c26182x67c007f1.m101069xb5884f29(), c26182x67c007f1.m101074x2f090f6().f50735xb3582d72)) {
            this.f54342xe041c5d.mo100758x379286("set object param failed, optional id:" + c26182x67c007f1.m101069xb5884f29());
            return;
        }
        m103610xb3808c6e(c26182x67c007f1);
        this.f54343xdf286140.mo103003x1ba09fea(c26182x67c007f1);
        try {
            this.f54345xb49bd9c1.mo100447x1ba09fea(c26182x67c007f1);
        } catch (java.lang.Exception e17) {
            this.f54342xe041c5d.mo103227xaa8bf022(e17);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    @com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26580xafd4c79e.ThreadSwitch
    /* renamed from: setRichMediaSynchronizer */
    public void mo100969xeebc4268(com.p314xaae8f345.p3006xb8ff1437.api.p3021xce853088.InterfaceC26248xbe616625 interfaceC26248xbe616625) {
        this.f54345xb49bd9c1.mo100257xeebc4268(interfaceC26248xbe616625);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    @com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26580xafd4c79e.ThreadSwitch
    /* renamed from: setSurface */
    public void mo100970x42c875eb(android.view.Surface surface) {
        this.f54342xe041c5d.mo100757x3164ae(f54306x186855b3 + "setSurface, surface:" + surface);
        try {
            this.f54345xb49bd9c1.mo100448x42c875eb(surface, 0);
        } catch (java.lang.Exception e17) {
            this.f54342xe041c5d.mo103227xaa8bf022(e17);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    @com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26580xafd4c79e.ThreadSwitch
    /* renamed from: setSurfaceHolder */
    public void mo100972x5660d377(android.view.SurfaceHolder surfaceHolder) {
        this.f54342xe041c5d.mo100757x3164ae(f54306x186855b3 + "setSurfaceHolder, SurfaceHolder:" + surfaceHolder);
        try {
            this.f54345xb49bd9c1.mo100449x5660d377(surfaceHolder);
        } catch (java.lang.Exception e17) {
            this.f54342xe041c5d.mo103227xaa8bf022(e17);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    @com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26580xafd4c79e.ThreadSwitch
    /* renamed from: setTPSurface */
    public void mo100973xf5e4086f(com.p314xaae8f345.p3006xb8ff1437.api.C26196x1194f691 c26196x1194f691) {
        this.f54342xe041c5d.mo100757x3164ae(f54306x186855b3 + "setTPSurface, tpSurface:" + c26196x1194f691);
        try {
            if (c26196x1194f691 instanceof com.p314xaae8f345.p3006xb8ff1437.api.C26196x1194f691) {
                this.f54345xb49bd9c1.mo100448x42c875eb(c26196x1194f691, 0);
            }
        } catch (java.lang.Exception e17) {
            this.f54342xe041c5d.mo103227xaa8bf022(e17);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    @com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26580xafd4c79e.ThreadSwitch(m104402x5b9ad2cf = true)
    /* renamed from: setVideoInfo */
    public void mo100974xab2f6987(com.p314xaae8f345.p3006xb8ff1437.api.C26204xf8de58ad c26204xf8de58ad) {
        if (c26204xf8de58ad != null) {
            try {
                m103611x9efa72ad(c26204xf8de58ad, this.f54352x3be94da8, this.f54351x818d03e2);
                this.f54343xdf286140.mo103005xab2f6987(c26204xf8de58ad);
                this.f54345xb49bd9c1.mo100258xab2f6987(c26204xf8de58ad);
            } catch (java.lang.Exception e17) {
                this.f54342xe041c5d.mo103227xaa8bf022(e17);
            }
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    @com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26580xafd4c79e.ThreadSwitch
    /* renamed from: start */
    public void mo100975x68ac462() {
        this.f54342xe041c5d.mo100757x3164ae(f54306x186855b3 + "start");
        try {
            this.f54345xb49bd9c1.mo100450x68ac462();
            m103606xd0c233a0(104, 0, 0, null, new com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26571x7baf53e9().put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54569x4532f0c8, java.lang.Long.valueOf(java.lang.System.currentTimeMillis())).m104306x59bc66e());
            this.f54343xdf286140.mo103004x5cc08ff1(0);
        } catch (java.lang.Exception e17) {
            this.f54342xe041c5d.mo103227xaa8bf022(e17);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    @com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26580xafd4c79e.ThreadSwitch(m104403x339a532b = true)
    /* renamed from: stop */
    public void mo100976x360802() {
        this.f54342xe041c5d.mo100757x3164ae(f54306x186855b3 + "stop");
        m103596xfb3b9c5f();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    @com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26580xafd4c79e.ThreadSwitch
    /* renamed from: stopAsync */
    public void mo100977x5f82bb9a() {
        this.f54342xe041c5d.mo100757x3164ae(f54306x186855b3 + "stopAsync");
        m103596xfb3b9c5f();
        m103593x7d7a028e(280, 0, 0, null);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    @com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26580xafd4c79e.ThreadSwitch(m104402x5b9ad2cf = true, m104404xca989f3f = true)
    /* renamed from: switchDefinition */
    public void mo100980x81d257a7(java.lang.String str, long j17, com.p314xaae8f345.p3006xb8ff1437.api.C26204xf8de58ad c26204xf8de58ad) {
        this.f54342xe041c5d.mo100757x3164ae(f54306x186855b3 + "switchDefinition, defUrl:" + str + ", defID:" + j17);
        mo100981x81d257a7(str, j17, c26204xf8de58ad, 0);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    @com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26580xafd4c79e.ThreadSwitch
    /* renamed from: switchHdrModeWithSurface */
    public void mo100984x40944be2(android.view.Surface surface, int i17) {
        this.f54342xe041c5d.mo100757x3164ae(f54306x186855b3 + "switchHdrModeWithSurface, surface:" + surface);
        try {
            this.f54345xb49bd9c1.mo100455x40944be2(surface, 0, i17);
        } catch (java.lang.Exception e17) {
            this.f54342xe041c5d.mo103227xaa8bf022(e17);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: updateLoggerContext */
    public void mo100985x80f0bbb6(com.p314xaae8f345.p3006xb8ff1437.log.C26478xc50084e3 c26478xc50084e3) {
        if (c26478xc50084e3 != null) {
            this.f54362x1f1cf395 = false;
            this.f54342xe041c5d.mo103228xdf8cd0a6(new com.p314xaae8f345.p3006xb8ff1437.log.C26478xc50084e3(c26478xc50084e3, TAG));
            this.f54345xb49bd9c1.mo100456x80f0bbb6(this.f54342xe041c5d.m103231xe4cf9ecd());
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26521xbcdea42 c26521xbcdea42 = this.f54346x21973431;
            if (c26521xbcdea42 != null) {
                c26521xbcdea42.m103633x8bd16e11(this.f54342xe041c5d.m103231xe4cf9ecd().m103238xb5887064());
            }
        }
    }

    /* renamed from: com.tencent.thumbplayer.tplayer.TPPlayer$EventHandler */
    /* loaded from: classes16.dex */
    public class EventHandler extends android.os.Handler {

        /* renamed from: mPlayer */
        private com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d f54364x14aac1ae;

        public EventHandler(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d c26520x2c78c47d) {
            this.f54364x14aac1ae = c26520x2c78c47d;
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.f54342xe041c5d.mo103225x5b09653("mTransformHandler msg : " + message.what);
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26521xbcdea42 c26521xbcdea42 = com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.f54346x21973431;
            if (c26521xbcdea42 == null) {
                return;
            }
            int i17 = message.what;
            if (i17 == 257) {
                com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.f54342xe041c5d.mo100757x3164ae("onPrepared");
                com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.m103599x8953bfde(1004);
                c26521xbcdea42.mo53283x58d5b73c(this.f54364x14aac1ae);
                return;
            }
            if (i17 == com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.f54313x2c557d52) {
                com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.m103602xc94ee199(message);
                return;
            }
            switch (i17) {
                case 260:
                    c26521xbcdea42.mo53280xa6db431b(this.f54364x14aac1ae);
                    return;
                case 261:
                    com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.m103601x75ef5a86(message.arg1);
                    com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26523xddda480e.TPSwitchCommonParams tPSwitchCommonParams = (com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26523xddda480e.TPSwitchCommonParams) message.obj;
                    if (tPSwitchCommonParams != null) {
                        c26521xbcdea42.mo53278xc39adf2d(this.f54364x14aac1ae, message.arg1, tPSwitchCommonParams.f54414x2dd09b, tPSwitchCommonParams.f54415x2dd09c, tPSwitchCommonParams.f54416x4991d76f);
                        return;
                    }
                    return;
                case com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.f54310x2f0a66a6 /* 262 */:
                    com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26523xddda480e.TPSwitchCommonParams tPSwitchCommonParams2 = (com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26523xddda480e.TPSwitchCommonParams) message.obj;
                    if (tPSwitchCommonParams2 != null) {
                        c26521xbcdea42.mo53281xaf8aa769(this.f54364x14aac1ae, message.arg1, message.arg2, tPSwitchCommonParams2.f54414x2dd09b, tPSwitchCommonParams2.f54415x2dd09c);
                        return;
                    }
                    return;
                case 263:
                    c26521xbcdea42.mo53284xe1fdf750(this.f54364x14aac1ae);
                    return;
                case 264:
                    com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26523xddda480e.TPSwitchCommonParams tPSwitchCommonParams3 = (com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26523xddda480e.TPSwitchCommonParams) message.obj;
                    if (tPSwitchCommonParams3 != null) {
                        c26521xbcdea42.mo53285xdc9583f7(this.f54364x14aac1ae, tPSwitchCommonParams3.f54414x2dd09b, tPSwitchCommonParams3.f54415x2dd09c);
                        return;
                    }
                    return;
                case com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.f54331x95f5222f /* 265 */:
                    c26521xbcdea42.mo53279xfb5e6f61(this.f54364x14aac1ae, (com.p314xaae8f345.p3006xb8ff1437.api.C26193x359f687e) message.obj);
                    return;
                case com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.f54333xdf8562da /* 266 */:
                    c26521xbcdea42.mo100991xc11a2c9d(this.f54364x14aac1ae, (com.p314xaae8f345.p3006xb8ff1437.api.C26203x3f6f032e) message.obj);
                    return;
                case com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.f54308x345a15a8 /* 267 */:
                    c26521xbcdea42.mo100986x5dd428f8(this.f54364x14aac1ae, (com.p314xaae8f345.p3006xb8ff1437.api.C26169xaecce4f3) message.obj);
                    return;
                case com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.f54320x5c3731c1 /* 268 */:
                    c26521xbcdea42.mo53281xaf8aa769(this.f54364x14aac1ae, message.arg1, message.arg2, 0L, 0L);
                    return;
                case 269:
                    c26521xbcdea42.mo53278xc39adf2d(this.f54364x14aac1ae, 1002, message.arg1, message.arg2, message.obj);
                    return;
                case 270:
                    c26521xbcdea42.mo53278xc39adf2d(this.f54364x14aac1ae, 1003, message.arg1, message.arg2, message.obj);
                    return;
                case 271:
                    c26521xbcdea42.mo53278xc39adf2d(this.f54364x14aac1ae, 1001, message.arg1, message.arg2, message.obj);
                    return;
                case 272:
                    c26521xbcdea42.mo53278xc39adf2d(this.f54364x14aac1ae, 1004, message.arg1, message.arg2, message.obj);
                    return;
                case 273:
                    c26521xbcdea42.mo53278xc39adf2d(this.f54364x14aac1ae, 1005, message.arg1, message.arg2, message.obj);
                    return;
                case 274:
                    c26521xbcdea42.mo53278xc39adf2d(this.f54364x14aac1ae, 1006, message.arg1, message.arg2, message.obj);
                    return;
                case 275:
                    c26521xbcdea42.mo53278xc39adf2d(this.f54364x14aac1ae, 1007, message.arg1, message.arg2, message.obj);
                    return;
                case 276:
                    c26521xbcdea42.mo53278xc39adf2d(this.f54364x14aac1ae, 1008, message.arg1, message.arg2, message.obj);
                    return;
                case 277:
                    c26521xbcdea42.mo53282x4799dc42(message.arg1, message.arg2);
                    return;
                case com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.f54325x845aa0cb /* 278 */:
                    if (com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.f54345xb49bd9c1 != null) {
                        try {
                            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.f54345xb49bd9c1.mo100447x1ba09fea(new com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1().m101062xac7b1a0a(8000, message.arg1));
                        } catch (java.lang.IllegalStateException e17) {
                            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.f54342xe041c5d.mo103227xaa8bf022(e17);
                        }
                    }
                    if (com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.f54340x6f80c59f) {
                        c26521xbcdea42.mo53278xc39adf2d(this.f54364x14aac1ae, 1010, message.arg1, message.arg2, message.obj);
                        return;
                    }
                    return;
                case com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.f54332xfb2818f7 /* 279 */:
                    c26521xbcdea42.mo100990x715e46d8(this.f54364x14aac1ae, (com.p314xaae8f345.p3006xb8ff1437.api.C26194x3ac954b9) message.obj);
                    return;
                case 280:
                    c26521xbcdea42.mo83876x5a35e2d4(this.f54364x14aac1ae);
                    return;
                case com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.f54315xb31efc87 /* 281 */:
                    c26521xbcdea42.mo53278xc39adf2d(this.f54364x14aac1ae, 1015, message.arg1, message.arg2, message.obj);
                    return;
                case com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.f54327xf088dd94 /* 282 */:
                    com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.this.m103608x3a86783e();
                    return;
                case 283:
                    c26521xbcdea42.mo53278xc39adf2d(this.f54364x14aac1ae, 1016, message.arg1, message.arg2, message.obj);
                    return;
                case 284:
                    c26521xbcdea42.mo53278xc39adf2d(this.f54364x14aac1ae, 1017, message.arg1, message.arg2, message.obj);
                    return;
                default:
                    return;
            }
        }

        public EventHandler(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d c26520x2c78c47d, android.os.Looper looper) {
            super(looper);
            this.f54364x14aac1ae = c26520x2c78c47d;
        }
    }

    public C26520x2c78c47d(android.content.Context context, android.os.Looper looper) {
        this(context, looper, null);
    }

    public C26520x2c78c47d(android.content.Context context, android.os.Looper looper, android.os.Looper looper2) {
        this(context, looper, looper2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onDetailInfo */
    public void m103599x8953bfde(@com.p314xaae8f345.p3006xb8ff1437.api.C26183xfc0748fc.TPPlayerDetailInfoType int i17) {
        m103600x8953bfde(new com.p314xaae8f345.p3006xb8ff1437.api.C26183xfc0748fc(i17));
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    @com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26580xafd4c79e.ThreadSwitch
    /* renamed from: addAudioTrackSource */
    public void mo100899xa28fa651(java.lang.String str, java.lang.String str2, com.p314xaae8f345.p3006xb8ff1437.api.p3017x65fca6e.C26231xafaedb13 c26231xafaedb13) {
        this.f54342xe041c5d.mo100757x3164ae(f54306x186855b3 + "addAudioTrackSource, url:" + str + ", name:" + str2 + ", downloadParamData:" + c26231xafaedb13);
        if (!android.text.TextUtils.isEmpty(str2) && com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26565x9aa4e96a.m104277x5fd37e5(str)) {
            try {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1 c26182x67c007f1 = new com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1();
                if (c26231xafaedb13 != null) {
                    c26182x67c007f1.m101064x7e824b4d(0, c26231xafaedb13);
                }
                arrayList.add(c26182x67c007f1);
                this.f54345xb49bd9c1.mo100385xa28fa651(str, (c26231xafaedb13 == null || c26231xafaedb13.m101412x4464f4a2() == null || c26231xafaedb13.m101412x4464f4a2().isEmpty()) ? null : c26231xafaedb13.m101412x4464f4a2().get(0), str2, arrayList);
                return;
            } catch (java.lang.Exception e17) {
                this.f54342xe041c5d.mo103227xaa8bf022(e17);
                return;
            }
        }
        this.f54342xe041c5d.mo100756x5c4d208("handleAddAudioSource, illegal argument.");
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    @com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26580xafd4c79e.ThreadSwitch(m104402x5b9ad2cf = true)
    /* renamed from: addSubtitleSource */
    public void mo100901x14654554(java.lang.String str, java.lang.String str2, java.lang.String str3, com.p314xaae8f345.p3006xb8ff1437.api.p3017x65fca6e.C26231xafaedb13 c26231xafaedb13) {
        java.lang.String str4;
        this.f54342xe041c5d.mo100757x3164ae(f54306x186855b3 + "addSubtitleSource, url:" + str + ", name:" + str3 + ", downloadParamData:" + c26231xafaedb13);
        try {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (m103597xd72c5154() && com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26565x9aa4e96a.m104277x5fd37e5(str)) {
                str4 = this.f54343xdf286140.mo103006x9edb516e(3, str, c26231xafaedb13);
                this.f54363x4244e201.add(str4);
            } else {
                str4 = str;
            }
            this.f54345xb49bd9c1.mo100387x14654554(str4, (c26231xafaedb13 == null || c26231xafaedb13.m101412x4464f4a2() == null || c26231xafaedb13.m101412x4464f4a2().isEmpty()) ? null : c26231xafaedb13.m101412x4464f4a2().get(0), str2, str3);
            m103606xd0c233a0(118, 0, 0, null, new com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26571x7baf53e9().put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54569x4532f0c8, java.lang.Long.valueOf(currentTimeMillis)).put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54553x5c42836f, java.lang.Long.valueOf(java.lang.System.currentTimeMillis())).put("url", str).put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, str3).m104306x59bc66e());
        } catch (java.lang.Exception e17) {
            this.f54342xe041c5d.mo103227xaa8bf022(e17);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    @com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26580xafd4c79e.ThreadSwitch(m104402x5b9ad2cf = true, m104404xca989f3f = true)
    /* renamed from: switchDefinition */
    public void mo100982x81d257a7(java.lang.String str, long j17, com.p314xaae8f345.p3006xb8ff1437.api.C26204xf8de58ad c26204xf8de58ad, java.util.Map<java.lang.String, java.lang.String> map) {
        this.f54342xe041c5d.mo100757x3164ae(f54306x186855b3 + "switchDefinition, defUrl:" + str + ", defID:" + j17 + ", videoInfo:" + c26204xf8de58ad + ", httpHeader:" + map);
        try {
            mo100983x81d257a7(str, j17, c26204xf8de58ad, map, 0);
        } catch (java.lang.Exception e17) {
            this.f54342xe041c5d.mo103227xaa8bf022(e17);
        }
    }

    public C26520x2c78c47d(android.content.Context context, android.os.Looper looper, android.os.Looper looper2, com.p314xaae8f345.p3006xb8ff1437.log.C26478xc50084e3 c26478xc50084e3) {
        com.p314xaae8f345.p3006xb8ff1437.log.C26478xc50084e3 c26478xc50084e32;
        this.f54360x32d9c2 = null;
        this.f54361x134a18b4 = true;
        this.f54340x6f80c59f = false;
        this.f54347x270d8d53 = -1;
        this.f54344x3b3a2a21 = new java.util.concurrent.atomic.AtomicInteger(1000);
        this.f54362x1f1cf395 = false;
        this.f54348xca026e7d = null;
        this.f54359x6f6ef27 = new java.util.HashMap();
        this.f54358xcb27b63 = 0L;
        if (c26478xc50084e3 != null) {
            c26478xc50084e32 = new com.p314xaae8f345.p3006xb8ff1437.log.C26478xc50084e3(c26478xc50084e3, TAG);
        } else {
            com.p314xaae8f345.p3006xb8ff1437.log.C26478xc50084e3 c26478xc50084e33 = new com.p314xaae8f345.p3006xb8ff1437.log.C26478xc50084e3(com.p314xaae8f345.p3006xb8ff1437.log.C26478xc50084e3.f53979x7ff61a17, java.lang.String.valueOf(f54336x964e4792.incrementAndGet()), java.lang.String.valueOf(this.f54344x3b3a2a21.incrementAndGet()), TAG);
            this.f54362x1f1cf395 = true;
            c26478xc50084e32 = c26478xc50084e33;
        }
        com.p314xaae8f345.p3006xb8ff1437.log.C26477x4798c35d c26477x4798c35d = new com.p314xaae8f345.p3006xb8ff1437.log.C26477x4798c35d(c26478xc50084e32);
        this.f54342xe041c5d = c26477x4798c35d;
        c26477x4798c35d.mo100757x3164ae("create TPPlayer");
        this.f54353xbc0769c6 = new com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26518xb8c23f93(context.getApplicationContext());
        this.f54354x4233cfd1 = new com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.C26527x371857de();
        m103606xd0c233a0(100, 0, 0, null, new com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26571x7baf53e9().put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54569x4532f0c8, java.lang.Long.valueOf(java.lang.System.currentTimeMillis())).m104306x59bc66e());
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.InnerPlayerListener innerPlayerListener = new com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.InnerPlayerListener();
        this.f54346x21973431 = new com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26521xbcdea42(this.f54342xe041c5d.mo103226xb5887064());
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.InterfaceC26129xed1324a9 m100473xcab7a796 = com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26133xff821098.m100473xcab7a796(c26478xc50084e32, this.f54353xbc0769c6);
        this.f54345xb49bd9c1 = m100473xcab7a796;
        m100473xcab7a796.mo100437x5dd7c812(innerPlayerListener);
        m100473xcab7a796.mo100431xa4560c71(innerPlayerListener);
        m100473xcab7a796.mo100436x40f8c003(innerPlayerListener);
        m100473xcab7a796.mo100443x2d6d87cd(innerPlayerListener);
        m100473xcab7a796.mo100434x6954c27b(innerPlayerListener);
        m100473xcab7a796.mo100438xe1a2e326(innerPlayerListener);
        m100473xcab7a796.mo100443x2d6d87cd(innerPlayerListener);
        m100473xcab7a796.mo100439x8796ba37(innerPlayerListener);
        m100473xcab7a796.mo100440xa679d9ae(innerPlayerListener);
        m100473xcab7a796.mo100429x3282865a(innerPlayerListener);
        m100473xcab7a796.mo100441xf26db5af(innerPlayerListener);
        m100473xcab7a796.mo100442x7e05de2a(innerPlayerListener);
        m100473xcab7a796.mo100430xb23c0daf(innerPlayerListener);
        m100473xcab7a796.mo100256xa23b7bf3(innerPlayerListener);
        m100473xcab7a796.mo100433xa4b31634(innerPlayerListener);
        m100473xcab7a796.mo100432xa8a04d4f(innerPlayerListener);
        if (looper == null || looper == android.os.Looper.getMainLooper()) {
            android.os.HandlerThread m104408x3ccacf97 = com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26581x3df100e2.m104405x9cf0d20b().m104408x3ccacf97("TP-workthread");
            this.f54341x3e0f3a87 = m104408x3ccacf97;
            looper = m104408x3ccacf97.getLooper();
        }
        this.f54355x66f29e08 = looper;
        if (looper2 == null) {
            if (android.os.Looper.myLooper() == null) {
                this.f54357x6c4e5bc6 = new com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.EventHandler(this, this.f54355x66f29e08);
            } else {
                this.f54357x6c4e5bc6 = new com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.EventHandler(this);
            }
        } else {
            this.f54357x6c4e5bc6 = new com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.EventHandler(this, looper2);
        }
        m103606xd0c233a0(101, 0, 0, null, new com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26571x7baf53e9().put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54553x5c42836f, java.lang.Long.valueOf(java.lang.System.currentTimeMillis())).m104306x59bc66e());
        com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.InterfaceC26454x8591d014 m103017x6d0a1f2a = com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26456x68e9cd00.m103017x6d0a1f2a(this.f54355x66f29e08, this.f54353xbc0769c6);
        this.f54343xdf286140 = m103017x6d0a1f2a;
        m103017x6d0a1f2a.mo103001xbdb2cd8a(innerPlayerListener);
        this.f54354x4233cfd1.mo103644xfa7f1734(new com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26528x183f9c7b());
        this.f54363x4244e201 = new java.util.ArrayList<>();
        if (com.p314xaae8f345.p3006xb8ff1437.p3026xaf3f8342.C26278x84e5221f.m101636x91940f61()) {
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26540x26a27a8c c26540x26a27a8c = new com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3072xe68be6b0.C26540x26a27a8c(this.f54353xbc0769c6.m103559x6a789444());
            this.f54348xca026e7d = c26540x26a27a8c;
            c26540x26a27a8c.m103836xbcee8d9c(new com.p314xaae8f345.p3006xb8ff1437.p3023xaf3f29eb.C26260x58ed72f6(m100473xcab7a796));
            this.f54348xca026e7d.m103834x316510();
            this.f54353xbc0769c6.m103560xb9d3a239().m103220x5a420b88(this.f54348xca026e7d);
        }
    }

    /* renamed from: pushEvent */
    private void m103605xd0c233a0(int i17) {
        m103606xd0c233a0(i17, 0, 0, "", null);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    @com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26580xafd4c79e.ThreadSwitch(m104402x5b9ad2cf = true, m104404xca989f3f = true)
    /* renamed from: setLoopback */
    public void mo100948xfd27780d(boolean z17, long j17, long j18) {
        this.f54342xe041c5d.mo100757x3164ae(f54306x186855b3 + "setLoopback, isLoopback:" + z17 + ", loopStartPositionMs:" + j17 + ", loopEndPositionMs:" + j18);
        try {
            this.f54345xb49bd9c1.mo100428xfd27780d(z17, j17, j18);
        } catch (java.lang.Exception e17) {
            this.f54342xe041c5d.mo103227xaa8bf022(e17);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    @com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26580xafd4c79e.ThreadSwitch
    /* renamed from: setSurface */
    public void mo100971x42c875eb(android.view.Surface surface, @com.p314xaae8f345.p3006xb8ff1437.api.C26172xcb274128.TPSurfaceType int i17) {
        this.f54342xe041c5d.mo100757x3164ae(f54306x186855b3 + "setSurface, surface:" + surface + ", type:" + i17);
        try {
            this.f54345xb49bd9c1.mo100448x42c875eb(surface, i17);
        } catch (java.lang.Exception e17) {
            this.f54342xe041c5d.mo103227xaa8bf022(e17);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    @com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26580xafd4c79e.ThreadSwitch(m104402x5b9ad2cf = true, m104404xca989f3f = true)
    /* renamed from: switchDefinition */
    public void mo100978x81d257a7(com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26214xf9e9afd1 interfaceC26214xf9e9afd1, long j17, com.p314xaae8f345.p3006xb8ff1437.api.C26204xf8de58ad c26204xf8de58ad) {
        this.f54342xe041c5d.mo100757x3164ae(f54306x186855b3 + "switchDefinition, mediaAsset:" + interfaceC26214xf9e9afd1 + ", defID:" + j17 + ", videoInfo:" + c26204xf8de58ad);
        try {
            mo100979x81d257a7(interfaceC26214xf9e9afd1, j17, c26204xf8de58ad, 0);
        } catch (java.lang.Exception e17) {
            this.f54342xe041c5d.mo103227xaa8bf022(e17);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    /* renamed from: enableTPAssetResourceLoader */
    public void mo100906x969bf12(com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.InterfaceC26468xe997c0c interfaceC26468xe997c0c) {
        this.f54342xe041c5d.mo100757x3164ae(f54306x186855b3 + "enableTPAssetResourceLoader, assetResourceLoader:" + interfaceC26468xe997c0c);
        if (interfaceC26468xe997c0c != null) {
            this.f54343xdf286140.mo102999x94fe7f5c(true);
            com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3054x27f531a1.InterfaceC26468xe997c0c interfaceC26468xe997c0c2 = this.f54337xcd9bff24;
            if (interfaceC26468xe997c0c2 != null) {
                interfaceC26468xe997c0c2.mo103115x41012807();
                this.f54337xcd9bff24 = null;
            }
            this.f54337xcd9bff24 = interfaceC26468xe997c0c;
            return;
        }
        this.f54343xdf286140.mo102999x94fe7f5c(false);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    @com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26580xafd4c79e.ThreadSwitch(m104402x5b9ad2cf = true, m104404xca989f3f = true)
    /* renamed from: switchDefinition */
    public void mo100981x81d257a7(java.lang.String str, long j17, com.p314xaae8f345.p3006xb8ff1437.api.C26204xf8de58ad c26204xf8de58ad, int i17) {
        if (!m103612x7ab780d7()) {
            this.f54342xe041c5d.mo100756x5c4d208("error : switchDefinition , state invalid");
        }
        this.f54342xe041c5d.mo100757x3164ae(f54306x186855b3 + "switchDefinition, defUrl:" + str + ", defID:" + j17 + ", mode:" + i17);
        com.p314xaae8f345.p3006xb8ff1437.api.C26204xf8de58ad m103611x9efa72ad = m103611x9efa72ad(c26204xf8de58ad, (int) mo100915xddd35a52(), this.f54351x818d03e2);
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26142x43104e18 c26142x43104e18 = new com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26142x43104e18(str);
        if (m103597xd72c5154()) {
            c26142x43104e18 = this.f54343xdf286140.mo103010xa355dc14(j17, str, m103611x9efa72ad, null);
            this.f54342xe041c5d.mo100757x3164ae("switchDefinition selfPlayerUrl=" + c26142x43104e18.m100557x18ed3d2c());
            this.f54342xe041c5d.mo100757x3164ae("switchDefinition systemPlayerUrl=" + c26142x43104e18.m100558x6e7e3f29());
        }
        this.f54342xe041c5d.mo100757x3164ae("switchDefinition, proxyUrl:" + str + ", defID:" + j17);
        try {
            this.f54345xb49bd9c1.mo100261x9748f100(m103611x9efa72ad);
            this.f54345xb49bd9c1.mo100259x81d257a7(c26142x43104e18, i17, j17);
        } catch (java.lang.Exception e17) {
            this.f54342xe041c5d.mo103227xaa8bf022(e17);
        }
        m103606xd0c233a0(120, 0, 0, null, new com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26571x7baf53e9().put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54512xc618a7cf, j17 + "").m104306x59bc66e());
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    @com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26580xafd4c79e.ThreadSwitch
    /* renamed from: seekTo */
    public void mo100937xc9fc1b13(int i17, int i18) {
        this.f54342xe041c5d.mo100757x3164ae(f54306x186855b3 + "seekTo, positionMs:" + i17 + ", mode:" + i18);
        try {
            if (i18 > 0) {
                this.f54345xb49bd9c1.mo100417xc9fc1b13(i17, i18);
            } else {
                this.f54345xb49bd9c1.mo100416xc9fc1b13(i17);
            }
        } catch (java.lang.Exception e17) {
            this.f54342xe041c5d.mo103227xaa8bf022(e17);
        }
        this.f54343xdf286140.mo103004x5cc08ff1(1);
        m103606xd0c233a0(109, 0, 0, null, new com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26571x7baf53e9().put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54569x4532f0c8, java.lang.Long.valueOf(java.lang.System.currentTimeMillis())).put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54557xe73e0b15, 0).put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54567x12c60097, java.lang.Long.valueOf(mo100915xddd35a52())).m104306x59bc66e());
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    @com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26580xafd4c79e.ThreadSwitch
    /* renamed from: setDataSource */
    public void mo100946x683d6267(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        if (!android.text.TextUtils.isEmpty(str)) {
            if (this.f54345xb49bd9c1.mo100249xb7d72d0e() == 1) {
                m103604x81415be2(str, m103588x3d18c2cb(str), m103597xd72c5154());
                m103592x9966fff0(1000);
                this.f54342xe041c5d.mo100757x3164ae(f54306x186855b3 + "setDataSource, url:" + str + ", httpHeader:" + map);
                this.f54360x32d9c2 = str;
                com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26142x43104e18 c26142x43104e18 = new com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26142x43104e18(str);
                com.p314xaae8f345.p3006xb8ff1437.log.C26477x4798c35d c26477x4798c35d = this.f54342xe041c5d;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleSetDataSource originalUrl=");
                sb6.append(str);
                c26477x4798c35d.mo100757x3164ae(sb6.toString());
                if (m103597xd72c5154()) {
                    c26142x43104e18 = this.f54343xdf286140.mo103007x7291d95e(str, map);
                    this.f54342xe041c5d.mo100757x3164ae("handleSetDataSource selfPlayerUrl=" + c26142x43104e18.m100557x18ed3d2c());
                    this.f54342xe041c5d.mo100757x3164ae("handleSetDataSource systemPlayerUrl=" + c26142x43104e18.m100558x6e7e3f29());
                }
                this.f54345xb49bd9c1.mo100255x683d6267(c26142x43104e18, map);
                m103592x9966fff0(1001);
                return;
            }
            throw new java.lang.IllegalStateException("error : setDataSource , state invalid. current state:" + this.f54345xb49bd9c1.mo100249xb7d72d0e());
        }
        throw new java.lang.IllegalArgumentException("error : setDataSource , param is invalid");
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    @com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26580xafd4c79e.ThreadSwitch(m104402x5b9ad2cf = true, m104404xca989f3f = true)
    /* renamed from: switchDefinition */
    public void mo100983x81d257a7(java.lang.String str, long j17, com.p314xaae8f345.p3006xb8ff1437.api.C26204xf8de58ad c26204xf8de58ad, java.util.Map<java.lang.String, java.lang.String> map, int i17) {
        if (m103612x7ab780d7()) {
            this.f54342xe041c5d.mo100757x3164ae(f54306x186855b3 + "switchDefinition, defUrl:" + str + ", defID:" + j17 + ", httpHeader:" + map + ", mode:" + i17);
            com.p314xaae8f345.p3006xb8ff1437.api.C26204xf8de58ad m103611x9efa72ad = m103611x9efa72ad(c26204xf8de58ad, (int) mo100915xddd35a52(), this.f54351x818d03e2);
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26142x43104e18 c26142x43104e18 = new com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26142x43104e18(str);
            if (m103597xd72c5154()) {
                c26142x43104e18 = this.f54343xdf286140.mo103010xa355dc14(j17, str, m103611x9efa72ad, map);
                this.f54342xe041c5d.mo100757x3164ae("switchDefinition selfPlayerUrl=" + c26142x43104e18.m100557x18ed3d2c());
                this.f54342xe041c5d.mo100757x3164ae("switchDefinition systemPlayerUrl=" + c26142x43104e18.m100558x6e7e3f29());
            }
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26142x43104e18 c26142x43104e182 = c26142x43104e18;
            this.f54342xe041c5d.mo100757x3164ae("switchDefinition, proxyUrl:" + str + ", defID:" + j17 + ", httpHeader:" + map);
            try {
                this.f54345xb49bd9c1.mo100261x9748f100(m103611x9efa72ad);
                this.f54345xb49bd9c1.mo100260x81d257a7(c26142x43104e182, map, i17, j17);
            } catch (java.lang.Exception e17) {
                this.f54342xe041c5d.mo103227xaa8bf022(e17);
            }
            m103606xd0c233a0(120, 0, 0, null, new com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26571x7baf53e9().put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54512xc618a7cf, j17 + "").m104306x59bc66e());
            return;
        }
        throw new java.lang.IllegalStateException("error : switchDefinition , state invalid");
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    @com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26580xafd4c79e.ThreadSwitch
    /* renamed from: setDataSource */
    public void mo100943x683d6267(android.os.ParcelFileDescriptor parcelFileDescriptor) {
        if (parcelFileDescriptor != null) {
            if (this.f54345xb49bd9c1.mo100249xb7d72d0e() == 1) {
                m103604x81415be2("", 4, false);
                this.f54342xe041c5d.mo100757x3164ae(f54306x186855b3 + "setDataSource, ParcelFileDescriptor");
                try {
                    this.f54345xb49bd9c1.mo100423x683d6267(parcelFileDescriptor);
                    return;
                } catch (java.io.IOException e17) {
                    this.f54342xe041c5d.mo103227xaa8bf022(e17);
                    return;
                } catch (java.lang.SecurityException e18) {
                    this.f54342xe041c5d.mo103227xaa8bf022(e18);
                    return;
                }
            }
            throw new java.lang.IllegalStateException("error : setDataSource , state invalid. current state:" + this.f54345xb49bd9c1.mo100249xb7d72d0e());
        }
        throw new java.lang.IllegalArgumentException("error : setDataSource , param is null");
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    @com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26580xafd4c79e.ThreadSwitch
    /* renamed from: setDataSource */
    public void mo100942x683d6267(android.content.res.AssetFileDescriptor assetFileDescriptor) {
        if (assetFileDescriptor != null) {
            if (this.f54345xb49bd9c1.mo100249xb7d72d0e() == 1) {
                m103604x81415be2("", 4, false);
                this.f54342xe041c5d.mo100757x3164ae(f54306x186855b3 + "setDataSource, AssetFileDescriptor");
                try {
                    this.f54345xb49bd9c1.mo100422x683d6267(assetFileDescriptor);
                    return;
                } catch (java.io.IOException e17) {
                    this.f54342xe041c5d.mo103227xaa8bf022(e17);
                    return;
                } catch (java.lang.SecurityException e18) {
                    this.f54342xe041c5d.mo103227xaa8bf022(e18);
                    return;
                }
            }
            throw new java.lang.IllegalStateException("error : setDataSource , state invalid. current state:" + this.f54345xb49bd9c1.mo100249xb7d72d0e());
        }
        throw new java.lang.IllegalArgumentException("error : setDataSource , param is null");
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    @com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26580xafd4c79e.ThreadSwitch(m104402x5b9ad2cf = true, m104404xca989f3f = true)
    /* renamed from: switchDefinition */
    public void mo100979x81d257a7(com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26214xf9e9afd1 interfaceC26214xf9e9afd1, long j17, com.p314xaae8f345.p3006xb8ff1437.api.C26204xf8de58ad c26204xf8de58ad, int i17) {
        if (m103612x7ab780d7()) {
            this.f54342xe041c5d.mo100757x3164ae(f54306x186855b3 + "switchDefinition, mediaAsset:" + interfaceC26214xf9e9afd1 + ", defID:" + j17 + ", videoInfo:" + c26204xf8de58ad + ", mode:" + i17);
            com.p314xaae8f345.p3006xb8ff1437.api.C26204xf8de58ad m103611x9efa72ad = m103611x9efa72ad(c26204xf8de58ad, (int) mo100915xddd35a52(), this.f54351x818d03e2);
            if (m103597xd72c5154()) {
                interfaceC26214xf9e9afd1 = this.f54343xdf286140.mo103011xf8d1ca25(interfaceC26214xf9e9afd1, j17, m103611x9efa72ad);
            }
            if (interfaceC26214xf9e9afd1 != null) {
                this.f54342xe041c5d.mo100757x3164ae("handleSwitchDef, proxyMediaAsset:" + interfaceC26214xf9e9afd1 + ", defID:" + j17);
                try {
                    this.f54345xb49bd9c1.mo100261x9748f100(m103611x9efa72ad);
                    this.f54345xb49bd9c1.mo100452x81d257a7(interfaceC26214xf9e9afd1, 0, j17);
                } catch (java.lang.Exception e17) {
                    this.f54342xe041c5d.mo103227xaa8bf022(e17);
                }
                m103606xd0c233a0(120, 0, 0, null, new com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26571x7baf53e9().put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54512xc618a7cf, j17 + "").m104306x59bc66e());
                return;
            }
            return;
        }
        throw new java.lang.IllegalStateException("error : switchDefinition , state invalid");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        if (r0.mo101300xd24879cb().isEmpty() == false) goto L14;
     */
    @Override // com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6
    @com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26580xafd4c79e.ThreadSwitch
    /* renamed from: setDataSource */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo100944x683d6267(com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26214xf9e9afd1 r4) {
        /*
            r3 = this;
            if (r4 == 0) goto Lc1
            boolean r0 = r4 instanceof com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26219xc486a810
            if (r0 == 0) goto L2c
            java.lang.String r0 = r4.mo101278xb5887639()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L24
            r0 = r4
            com.tencent.thumbplayer.api.composition.ITPMediaDRMAsset r0 = (com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26219xc486a810) r0
            java.util.Map r1 = r0.mo101300xd24879cb()
            if (r1 == 0) goto L24
            java.util.Map r0 = r0.mo101300xd24879cb()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L24
            goto L2c
        L24:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "error : setDataSource , drm asset url is null or drm property is null"
            r4.<init>(r0)
            throw r4
        L2c:
            com.tencent.thumbplayer.adapter.ITPPlayerAdapter r0 = r3.f54345xb49bd9c1
            int r0 = r0.mo100249xb7d72d0e()
            r1 = 1
            if (r0 != r1) goto La7
            java.lang.String r0 = r4.mo101278xb5887639()
            java.lang.String r1 = r4.mo101278xb5887639()
            int r1 = r3.m103588x3d18c2cb(r1)
            boolean r2 = r3.m103597xd72c5154()
            r3.m103604x81415be2(r0, r1, r2)
            r0 = 1000(0x3e8, float:1.401E-42)
            r3.m103592x9966fff0(r0)
            com.tencent.thumbplayer.log.TPBaseLogger r0 = r3.f54342xe041c5d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.f54306x186855b3
            r1.append(r2)
            java.lang.String r2 = "setDataSource, ITPMediaAsset"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.mo100757x3164ae(r1)
            java.lang.String r0 = r4.mo101278xb5887639()
            r3.f54360x32d9c2 = r0
            boolean r0 = r3.m103597xd72c5154()
            if (r0 == 0) goto L77
            com.tencent.thumbplayer.datatransport.ITPPlayManager r0 = r3.f54343xdf286140
            com.tencent.thumbplayer.api.composition.ITPMediaAsset r4 = r0.mo103008x31a6259b(r4)
        L77:
            com.tencent.thumbplayer.log.TPBaseLogger r0 = r3.f54342xe041c5d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "handleSetDataSource mediaAsset="
            r1.<init>(r2)
            java.lang.String r2 = r4.mo101278xb5887639()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.mo100757x3164ae(r1)
            com.tencent.thumbplayer.adapter.ITPPlayerAdapter r0 = r3.f54345xb49bd9c1     // Catch: java.lang.SecurityException -> L94 java.io.IOException -> L9b
            r0.mo100424x683d6267(r4)     // Catch: java.lang.SecurityException -> L94 java.io.IOException -> L9b
            goto La1
        L94:
            r4 = move-exception
            com.tencent.thumbplayer.log.TPBaseLogger r0 = r3.f54342xe041c5d
            r0.mo103227xaa8bf022(r4)
            goto La1
        L9b:
            r4 = move-exception
            com.tencent.thumbplayer.log.TPBaseLogger r0 = r3.f54342xe041c5d
            r0.mo103227xaa8bf022(r4)
        La1:
            r4 = 1001(0x3e9, float:1.403E-42)
            r3.m103592x9966fff0(r4)
            return
        La7:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "error : setDataSource , state invalid. current state:"
            r0.<init>(r1)
            com.tencent.thumbplayer.adapter.ITPPlayerAdapter r1 = r3.f54345xb49bd9c1
            int r1 = r1.mo100249xb7d72d0e()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
        Lc1:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "error : setDataSource , param is null"
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.C26520x2c78c47d.mo100944x683d6267(com.tencent.thumbplayer.api.composition.ITPMediaAsset):void");
    }
}
