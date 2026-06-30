package com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534;

/* renamed from: com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager */
/* loaded from: classes16.dex */
public class C26530x3dc5debd implements com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.InterfaceC26525x70d6ef09, com.p314xaae8f345.p3006xb8ff1437.api.p3018xc84c5534.InterfaceC26234x67c8074 {

    /* renamed from: APP_STATE_BACKGROUND */
    private static final boolean f54585xcdd0503a = false;

    /* renamed from: APP_STATE_FOREGROUND */
    private static final boolean f54586x9380644f = true;

    /* renamed from: BUFFERING_DURATION_THRESHOLD_MS */
    private static final int f54587x611e6de8 = 1200;

    /* renamed from: DEVICE_TYPE_AN_PAD */
    private static final int f54588xcedced9d = 5;

    /* renamed from: DEVICE_TYPE_AN_PHONE */
    private static final int f54589x8b5b5bf8 = 2;

    /* renamed from: DEVICE_TYPE_AN_TV */
    private static final int f54590xa3938418 = 9;

    /* renamed from: EVENT_KEY_BUFFERING */
    private static final java.lang.String f54591x453fb47d = "second_buffering";

    /* renamed from: EVENT_KEY_FIRST_LOAD */
    private static final java.lang.String f54592xe937cb9a = "first_load";

    /* renamed from: EVENT_KEY_FIRST_RENDERING */
    private static final java.lang.String f54593xce2bf838 = "first_rendering";

    /* renamed from: EVENT_KEY_GET_CDN_URL */
    private static final java.lang.String f54594x575e884f = "get_cdn_url";

    /* renamed from: EVENT_KEY_INIT_PLAYER */
    private static final java.lang.String f54595x1f9e132b = "init_player";

    /* renamed from: EVENT_KEY_LIVE_FIRST_LOAD */
    private static final java.lang.String f54596xf78cf723 = "live_loading";

    /* renamed from: EVENT_KEY_LIVE_PERIOD */
    private static final java.lang.String f54597x89c9d2af = "live_period";

    /* renamed from: EVENT_KEY_LIVE_PLAY_ERROR */
    private static final java.lang.String f54598xa803cb0b = "live_error";

    /* renamed from: EVENT_KEY_LOAD_SUBTITLE */
    private static final java.lang.String f54599xad0fe6cc = "load_subtitle";

    /* renamed from: EVENT_KEY_PLAY_DONE */
    private static final java.lang.String f54600xd3683aa8 = "play_done";

    /* renamed from: EVENT_KEY_REDIRECT */
    private static final java.lang.String f54601x36f35381 = "302_redirect";

    /* renamed from: EVENT_KEY_USER_SEEK */
    private static final java.lang.String f54602x57944b67 = "user_seek";

    /* renamed from: LIVE_HLS_M3U8_TAG_PREFIX */
    private static final java.lang.String f54603x862da62a = "#EXT-X-PROGRAM-DATE-TIME:";

    /* renamed from: LIVE_REPORT_PERIOD */
    private static final int f54604x50e18919 = 60000;

    /* renamed from: MAX_BUFFERING_REPORT_COUNT */
    private static final int f54605x5c37d91c = 20;

    /* renamed from: MAX_SEEK_REPORT_COUNT */
    private static final int f54606x1128fe50 = 20;

    /* renamed from: PROXY_HITDOWNLOADED_KEY */
    private static final java.lang.String f54608x7c36bba9 = "hitDownloaded";

    /* renamed from: REPORT_DATA_CACHE_NAME */
    private static final java.lang.String f54609x49c557f2 = "TPReportCache";
    private static final java.lang.String TAG = "TPReportManager";

    /* renamed from: VOD_HIT_DOWNLOADED_UNSET */
    private static final int f54610x9bca2251 = -1;

    /* renamed from: mContext */
    private android.content.Context f54615xd6cfe882;

    /* renamed from: mEventHandler */
    private com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.EventHandler f54620xf703545d;

    /* renamed from: mReportThread */
    private android.os.HandlerThread f54648xbc97b16b;

    /* renamed from: OS_VERSION */
    private static final java.lang.String f54607x412a355d = java.lang.String.format("Android %s", com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26329xaae09719.m101951x6b6e6f9e());

    /* renamed from: sDisplayResolutionReportString */
    private static java.lang.String f54613xacae84e0 = "";

    /* renamed from: hasReportLastEvent */
    private static boolean f54611x416de0d6 = false;

    /* renamed from: mCache */
    private static com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26566xc609bdb0 f54612xbdddfb15 = null;

    /* renamed from: mExitLock */
    private final java.lang.Object f54621xa673daf6 = new java.lang.Object();

    /* renamed from: mIsExit */
    private boolean f54625x90ebc35 = false;

    /* renamed from: mReportInfoGetter */
    private com.p314xaae8f345.p3006xb8ff1437.api.p3018xc84c5534.AbstractC26235x5a000607 f54646x5e048a3a = null;

    /* renamed from: mReportParams */
    private com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876 f54647xb5619ce7 = null;

    /* renamed from: mPlayScene */
    private int f54639xa1dc7cb = 1;

    /* renamed from: mLastEvent */
    private int f54631xf14a67b7 = 0;

    /* renamed from: mIsPlayDone */
    private boolean f54627x1cde086d = true;

    /* renamed from: mAppState */
    private boolean f54614x69f02e7d = true;

    /* renamed from: mIsPrepare */
    private boolean f54628x452e9e90 = false;

    /* renamed from: mIsLoadingSubtitle */
    private boolean f54626x3e5a8dfd = false;

    /* renamed from: mPlayStartTimeMs */
    private long f54640x61204054 = 0;

    /* renamed from: mPlayDurationMs */
    private long f54638x81a3427b = 0;

    /* renamed from: mSignalStrength */
    private int f54652xef2304d6 = 81;

    /* renamed from: mNetworkSpeed */
    private int f54636x95c0fbc6 = 0;

    /* renamed from: mSeekBufferingDuration */
    private int f54651x80a48151 = 0;

    /* renamed from: mSeekBufferingCount */
    private int f54650xbf78fe72 = 0;

    /* renamed from: mIsSeeking */
    private boolean f54629xcdb027f3 = false;

    /* renamed from: mIsBuffering */
    private boolean f54624xf3f4eeeb = false;

    /* renamed from: mIsUseP2P */
    private boolean f54630x1b55451e = false;

    /* renamed from: mErrorCode */
    private java.lang.String f54619x8e53fa28 = "0";

    /* renamed from: mProto */
    private java.lang.String f54643xbe9d157b = "";

    /* renamed from: mProtoVer */
    private java.lang.String f54644xea080428 = "";

    /* renamed from: mFlowId */
    private java.lang.String f54622x3a09db6 = "";

    /* renamed from: mPlayerType */
    private int f54642x591e3e08 = 0;

    /* renamed from: mDownloadType */
    private int f54618xd9b060ef = 0;

    /* renamed from: mMediaResolution */
    private java.lang.String f54634x3c16783 = "";

    /* renamed from: mMediaRate */
    private int f54633xfa4ae8f7 = 0;

    /* renamed from: mMediaDurationMs */
    private long f54632xac873131 = 0;

    /* renamed from: mPlayType */
    private int f54641x94f97c1b = -1;

    /* renamed from: mReportHandler */
    private com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.IReportHandler f54645x4f692009 = new com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.DefaultReportHandler();

    /* renamed from: mSamplingRate */
    private double f54649x9f345e74 = 1.0d;

    /* renamed from: mNeedReportToBeacon */
    private boolean f54635x34acf576 = true;

    /* renamed from: mCurBufferingParams */
    private com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.BufferingOnceParams f54616xa2af88b5 = null;

    /* renamed from: mCurSeekParams */
    private com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.UserSeekOnceParams f54617xc2b29111 = null;

    /* renamed from: mParamRecord */
    private final com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.ParamRecord f54637xd86d2491 = new com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.ParamRecord();

    /* renamed from: mGlobalEventListener */
    private com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26570x7018c6b1.OnGlobalEventChangeListener f54623x4efcdcde = new com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26570x7018c6b1.OnGlobalEventChangeListener() { // from class: com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.1
        @Override // com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26570x7018c6b1.OnGlobalEventChangeListener
        /* renamed from: onEvent */
        public void mo103064xaf8c47fb(int i17, int i18, int i19, java.lang.Object obj) {
            int i27;
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.TAG, "OnGlobalEventChangeListener eventId: " + i17);
            switch (i17) {
                case 100001:
                    i27 = 2100;
                    break;
                case 100002:
                    i27 = 2101;
                    break;
                default:
                    return;
            }
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.this.f54620xf703545d.obtainMessage(i27, null).sendToTarget();
        }
    };

    /* renamed from: com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager$DefaultReportHandler */
    /* loaded from: classes16.dex */
    public class DefaultReportHandler implements com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.IReportHandler {
        public DefaultReportHandler() {
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.IReportHandler
        /* renamed from: handleReportEvent */
        public void mo103747xfd89e7e(int i17, com.p314xaae8f345.p3006xb8ff1437.p3023xaf3f29eb.p3024xc84c5534.InterfaceC26262x6f07842c interfaceC26262x6f07842c) {
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.this.m103743x487bc0d9(interfaceC26262x6f07842c, i17, i17 <= 30);
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.this.m103728xc6ed667(interfaceC26262x6f07842c);
        }
    }

    /* renamed from: com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager$EventHandler */
    /* loaded from: classes16.dex */
    public class EventHandler extends android.os.Handler {

        /* renamed from: MSG_302_REDIRECT */
        private static final int f54655x518b2b84 = 2001;

        /* renamed from: MSG_APP_BACKGROUND */
        private static final int f54656x86fb72ca = 2100;

        /* renamed from: MSG_APP_FOREGROUND */
        private static final int f54657x4cab86df = 2101;

        /* renamed from: MSG_BUFFERING_END */
        private static final int f54658x8c545620 = 1014;

        /* renamed from: MSG_BUFFERING_START */
        private static final int f54659xc95f5067 = 1013;

        /* renamed from: MSG_CDN_UPDATE */
        private static final int f54660xd658e0d9 = 1018;

        /* renamed from: MSG_CREATE_DONE */
        private static final int f54661xa7ce7d07 = 1000;

        /* renamed from: MSG_CREATE_START */
        private static final int f54662x52d69b5d = 999;

        /* renamed from: MSG_DOWNLOAD_UPDATE */
        private static final int f54663xaeece782 = 1017;

        /* renamed from: MSG_EARLY_ERROR */
        private static final int f54664xca531e0e = 2003;

        /* renamed from: MSG_EXIT_THREAD */
        private static final int f54665xf057f06d = 100;

        /* renamed from: MSG_FIRSTCLIP_OPEN */
        private static final int f54666x2249c9e7 = 1022;

        /* renamed from: MSG_FIRST_PACKET */
        private static final int f54667x472fe535 = 1019;

        /* renamed from: MSG_GET_CDN */
        private static final int f54668xce889ca6 = 2000;

        /* renamed from: MSG_HLS_PRIVATE_TAG */
        private static final int f54669x24aa9150 = 1016;

        /* renamed from: MSG_LIVE_PERIOD_REPORT */
        private static final int f54670xc86274fd = 3000;

        /* renamed from: MSG_LOAD_SUBTITLE */
        private static final int f54671xbc10d2f3 = 2002;

        /* renamed from: MSG_PLAYER_ERROR */
        private static final int f54672xe77de328 = 1006;

        /* renamed from: MSG_PLAYER_PAUSE */
        private static final int f54673xe8113716 = 1004;

        /* renamed from: MSG_PLAYER_RELEASE */
        private static final int f54674x98ba6d27 = 1010;

        /* renamed from: MSG_PLAYER_RESET */
        private static final int f54675xe82f2e6f = 1011;

        /* renamed from: MSG_PLAYER_STOP */
        private static final int f54676xe675cec2 = 1005;

        /* renamed from: MSG_PLAY_COMPLETE */
        private static final int f54677xc0242986 = 1009;

        /* renamed from: MSG_PREPARE_DONE */
        private static final int f54678x351d37f8 = 1002;

        /* renamed from: MSG_PROTOCOL_UPDATE */
        private static final int f54679xeae52f72 = 1023;

        /* renamed from: MSG_RENDERING_START */
        private static final int f54680xadee43d1 = 1012;

        /* renamed from: MSG_REPORT_LAST_EVENT */
        private static final int f54681x5287021e = 4000;

        /* renamed from: MSG_SEEK_COMPLETE */
        private static final int f54682x4d6052c2 = 1008;

        /* renamed from: MSG_SELECT_TRACK */
        private static final int f54683x70fe5c46 = 2004;

        /* renamed from: MSG_SELECT_TRACK_DONE */
        private static final int f54684xf86933db = 2005;

        /* renamed from: MSG_SET_PLAY_SPEED */
        private static final int f54685x40856417 = 1015;

        /* renamed from: MSG_SIGNAL_STRENGTH_REGISTER */
        private static final int f54686xa54b0228 = 4001;

        /* renamed from: MSG_SIGNAL_STRENGTH_UNREGISTER */
        private static final int f54687x1fdc9681 = 4002;

        /* renamed from: MSG_START_PLAY */
        private static final int f54688x683abcaf = 1003;

        /* renamed from: MSG_START_PREPARE */
        private static final int f54689x55bda98c = 1001;

        /* renamed from: MSG_START_SEEK */
        private static final int f54690x683bfff3 = 1007;

        /* renamed from: MSG_SWITCH_DEF */
        private static final int f54691xaf9e1bf8 = 1020;

        /* renamed from: MSG_SWITCH_DEF_END */
        private static final int f54692x3aeb9bf4 = 1021;

        public EventHandler(android.os.Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            java.lang.Object obj = message.obj;
            java.util.Map map = obj instanceof java.util.Map ? (java.util.Map) obj : null;
            int i17 = message.what;
            if (i17 == 100) {
                com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.this.m103701xff9c8e4();
                return;
            }
            if (i17 == 3000) {
                com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.this.m103713xf13e5960();
                return;
            }
            if (i17 == 4000) {
                com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.this.m103729x679ad2f1();
                return;
            }
            if (i17 == f54656x86fb72ca) {
                com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.this.m103704x3be51a90();
                return;
            }
            if (i17 == 2101) {
                com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.this.m103705x1952ea5();
                return;
            }
            switch (i17) {
                case 999:
                    com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.this.m103718x9c486306(map);
                    return;
                case 1000:
                    com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.this.m103717xbab1205e(map);
                    return;
                case 1001:
                    com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.this.m103736x5a4519c4(map);
                    return;
                case 1002:
                    com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.this.m103725xce4951ca(map);
                    return;
                case 1003:
                    com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.this.m103735xa7bc8284(map);
                    return;
                case 1004:
                    com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.this.m103721x3ce7c836(map);
                    return;
                case 1005:
                    com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.this.m103724x44091dc2(map);
                    return;
                case 1006:
                    com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.this.m103720x3c547448(map);
                    return;
                case 1007:
                    com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.this.m103737x7f3f42db(map);
                    return;
                case 1008:
                    com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.this.m103731xe1fdf750(map);
                    return;
                case 1009:
                    com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.this.m103715x27c2380c(map);
                    return;
                case 1010:
                    com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.this.m103722x12313a47(map);
                    return;
                case 1011:
                    com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.this.m103723x3d05bf8f(map);
                    return;
                case 1012:
                    com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.this.m103727xc734ccf5(map);
                    return;
                case 1013:
                    com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.this.m103707x7dc4d59f(map);
                    return;
                case 1014:
                    com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.this.m103706x2018c558(map);
                    return;
                case 1015:
                    com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.this.m103734x607022b0(map);
                    return;
                case 1016:
                    if (obj instanceof java.lang.String) {
                        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.this.m103712x153820f2((java.lang.String) obj);
                        return;
                    }
                    return;
                case 1017:
                    com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.this.m103726x3f211446(map);
                    return;
                case 1018:
                    com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.this.m103708xb4ad7b85(map);
                    return;
                case 1019:
                    com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.this.m103710xbf25f92f(map);
                    return;
                case 1020:
                    com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.this.m103738x6097d512(map);
                    return;
                case 1021:
                    com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.this.m103739xa4e54a69(map);
                    return;
                case 1022:
                    com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.this.m103709xd78480eb(map);
                    return;
                case f54679xeae52f72 /* 1023 */:
                    com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.this.m103730x666f454(map);
                    return;
                default:
                    switch (i17) {
                        case 2000:
                            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.this.m103711x447d07b6(map);
                            return;
                        case 2001:
                            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.this.m103703xfb6ebd32(map);
                            return;
                        case 2002:
                            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.this.m103714x46f6ba9d(map);
                            return;
                        case 2003:
                            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.this.m103719x5de6b625(map);
                            return;
                        case 2004:
                            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.this.m103732x28ca1250(map);
                            return;
                        case 2005:
                            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.this.m103733xb5f901f2(map);
                            return;
                        default:
                            return;
                    }
            }
        }
    }

    /* renamed from: com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager$IReportHandler */
    /* loaded from: classes16.dex */
    public interface IReportHandler {
        /* renamed from: handleReportEvent */
        void mo103747xfd89e7e(int i17, com.p314xaae8f345.p3006xb8ff1437.p3023xaf3f29eb.p3024xc84c5534.InterfaceC26262x6f07842c interfaceC26262x6f07842c);
    }

    /* renamed from: com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager$LiveReportHandler */
    /* loaded from: classes16.dex */
    public class LiveReportHandler implements com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.IReportHandler {
        public LiveReportHandler() {
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.IReportHandler
        /* renamed from: handleReportEvent */
        public void mo103747xfd89e7e(int i17, com.p314xaae8f345.p3006xb8ff1437.p3023xaf3f29eb.p3024xc84c5534.InterfaceC26262x6f07842c interfaceC26262x6f07842c) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26578x4d6188cf c26578x4d6188cf = new com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26578x4d6188cf();
            boolean z17 = i17 <= 30 || i17 == 263;
            if (i17 == 30) {
                i17 = 205;
            } else if (i17 == 50) {
                com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.this.f54620xf703545d.removeMessages(3000);
                i17 = 263;
            } else if (i17 == 150) {
                com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.this.f54620xf703545d.removeMessages(3000);
            } else {
                if (i17 != 263) {
                    return;
                }
                com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.this.f54620xf703545d.removeMessages(3000);
                com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.this.f54620xf703545d.sendEmptyMessageDelayed(3000, 60000L);
            }
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.this.m103743x487bc0d9(c26578x4d6188cf, i17, z17);
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.this.m103744x2576a085(c26578x4d6188cf, z17);
            if (i17 != 205) {
                c26578x4d6188cf.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54531x24976ac9, 0);
            }
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.TAG, "liveExParam.prePlayLengthInt: " + com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.this.f54647xb5619ce7.m103757x433b9fd8().f54887xeab44072);
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.this.m103728xc6ed667(c26578x4d6188cf);
        }
    }

    /* renamed from: com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager$ParamRecord */
    /* loaded from: classes16.dex */
    public class ParamRecord {

        /* renamed from: bufferingCount */
        int f54695x4e13ba8d;

        /* renamed from: bufferingDurationMs */
        int f54696x6857179c;

        /* renamed from: cdnIp */
        java.lang.String f54697x5a23234;

        /* renamed from: cdnUip */
        java.lang.String f54698xaea440ef;

        /* renamed from: cdnUrl */
        java.lang.String f54699xaea44202;

        /* renamed from: defId */
        java.lang.String f54700x5b0a000;

        /* renamed from: endBufferingTimeMs */
        long f54701xa926a13a;

        /* renamed from: endPrepareTimeMs */
        long f54702x4e3bd81f;

        /* renamed from: getSpeedCnt */
        int f54703xfcd28d18;

        /* renamed from: hitDownloaded */
        int f54704x7515271a;

        /* renamed from: isMultiTrack */
        boolean f54705xcb4a845c;

        /* renamed from: isSelectedSubtitle */
        boolean f54706x1b55951d;

        /* renamed from: isSwitchingDef */
        boolean f54707x41e44341;

        /* renamed from: liveDelayMs */
        int f54708x159db3fd;

        /* renamed from: maxSpeed */
        int f54709x17a82943;

        /* renamed from: playDurationMs */
        int f54710x7af038ae;

        /* renamed from: spanId */
        java.lang.String f54711xca955605;

        /* renamed from: startBufferingTimeMs */
        long f54712x318c06d3;

        /* renamed from: startPlayTimeMs */
        long f54713xd0ba2ba9;

        /* renamed from: startPrepareTimeMs */
        long f54714x27bfcff8;

        /* renamed from: subtitleInfos */
        java.util.ArrayList<com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.SubtitleInfo> f54715x3dacc44d;

        /* renamed from: totalSpeed */
        int f54717xd5499f63;

        /* renamed from: tuid */
        java.lang.String f54718x367f5c;

        private ParamRecord() {
            this.f54713xd0ba2ba9 = 0L;
            this.f54710x7af038ae = 0;
            this.f54714x27bfcff8 = 0L;
            this.f54702x4e3bd81f = 0L;
            this.f54695x4e13ba8d = 0;
            this.f54696x6857179c = 0;
            this.f54712x318c06d3 = 0L;
            this.f54701xa926a13a = 0L;
            this.f54708x159db3fd = 0;
            this.f54709x17a82943 = 0;
            this.f54717xd5499f63 = 0;
            this.f54703xfcd28d18 = 0;
            this.f54706x1b55951d = false;
            this.f54705xcb4a845c = false;
            this.f54707x41e44341 = false;
            this.f54704x7515271a = -1;
            this.f54700x5b0a000 = "";
            this.f54699xaea44202 = "";
            this.f54697x5a23234 = "";
            this.f54698xaea440ef = "";
            this.f54711xca955605 = "";
            this.f54718x367f5c = "";
            this.f54715x3dacc44d = new java.util.ArrayList<>();
        }

        /* renamed from: reset */
        public void m103748x6761d4f() {
            this.f54713xd0ba2ba9 = 0L;
            this.f54710x7af038ae = 0;
            this.f54714x27bfcff8 = 0L;
            this.f54702x4e3bd81f = 0L;
            this.f54695x4e13ba8d = 0;
            this.f54696x6857179c = 0;
            this.f54712x318c06d3 = 0L;
            this.f54701xa926a13a = 0L;
            this.f54708x159db3fd = 0;
            this.f54709x17a82943 = 0;
            this.f54717xd5499f63 = 0;
            this.f54703xfcd28d18 = 0;
            this.f54706x1b55951d = false;
            this.f54705xcb4a845c = false;
            this.f54707x41e44341 = false;
            this.f54704x7515271a = -1;
            this.f54700x5b0a000 = "";
            this.f54699xaea44202 = "";
            this.f54697x5a23234 = "";
            this.f54698xaea440ef = "";
            this.f54711xca955605 = "";
            this.f54718x367f5c = "";
            this.f54715x3dacc44d.clear();
        }
    }

    /* renamed from: com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager$SubtitleInfo */
    /* loaded from: classes16.dex */
    public class SubtitleInfo {

        /* renamed from: name */
        java.lang.String f54719x337a8b;

        /* renamed from: opaque */
        long f54720xc3c20421 = -1;
        java.lang.String url;

        public SubtitleInfo(java.lang.String str, java.lang.String str2) {
            this.f54719x337a8b = str;
            this.url = str2;
        }
    }

    /* renamed from: com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager$VodReportHandler */
    /* loaded from: classes16.dex */
    public class VodReportHandler implements com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.IReportHandler {
        public VodReportHandler() {
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.IReportHandler
        /* renamed from: handleReportEvent */
        public void mo103747xfd89e7e(int i17, com.p314xaae8f345.p3006xb8ff1437.p3023xaf3f29eb.p3024xc84c5534.InterfaceC26262x6f07842c interfaceC26262x6f07842c) {
            boolean z17 = i17 <= 30;
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.this.m103743x487bc0d9(interfaceC26262x6f07842c, i17, z17);
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.this.m103745x3e60e5f8(interfaceC26262x6f07842c, z17);
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.this.m103728xc6ed667(interfaceC26262x6f07842c);
        }
    }

    public C26530x3dc5debd(android.content.Context context) {
        this.f54615xd6cfe882 = context.getApplicationContext();
    }

    /* renamed from: getDeviceResolution */
    private java.lang.String m103690xf7bd6718() {
        if (this.f54615xd6cfe882 == null) {
            return "0";
        }
        if (!android.text.TextUtils.isEmpty(f54613xacae84e0)) {
            return f54613xacae84e0;
        }
        int i17 = this.f54615xd6cfe882.getResources().getDisplayMetrics().widthPixels;
        java.lang.String str = this.f54615xd6cfe882.getResources().getDisplayMetrics().heightPixels + "*" + i17;
        f54613xacae84e0 = str;
        return str;
    }

    /* renamed from: getDeviceType */
    private int m103691x1cd0bea6() {
        android.app.UiModeManager uiModeManager = (android.app.UiModeManager) this.f54615xd6cfe882.getSystemService("uimode");
        if (uiModeManager == null) {
            return 2;
        }
        if (uiModeManager.getCurrentModeType() == 4) {
            return 9;
        }
        return (this.f54615xd6cfe882.getResources().getConfiguration().screenLayout & 15) >= 3 ? 5 : 2;
    }

    /* renamed from: getEventId */
    private static java.lang.String m103692xebc1791f(int i17) {
        if (i17 == 5) {
            return f54595x1f9e132b;
        }
        if (i17 == 15) {
            return f54594x575e884f;
        }
        if (i17 == 30) {
            return f54592xe937cb9a;
        }
        if (i17 == 40) {
            return f54602x57944b67;
        }
        if (i17 == 50) {
            return f54600xd3683aa8;
        }
        if (i17 == 150) {
            return f54598xa803cb0b;
        }
        if (i17 == 205) {
            return f54596xf78cf723;
        }
        if (i17 == 263) {
            return f54597x89c9d2af;
        }
        switch (i17) {
            case 32:
                return f54593xce2bf838;
            case 33:
                return f54599xad0fe6cc;
            case 34:
                return f54601x36f35381;
            case 35:
                return f54591x453fb47d;
            default:
                return "";
        }
    }

    /* renamed from: getHitDownloadedInfo */
    private void m103693x5cef6a32(java.lang.String str) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            if (jSONObject.has(f54608x7c36bba9)) {
                com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.ParamRecord paramRecord = this.f54637xd86d2491;
                if (paramRecord.f54704x7515271a == -1) {
                    paramRecord.f54704x7515271a = jSONObject.getInt(f54608x7c36bba9);
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, e17);
        }
    }

    /* renamed from: getMapValueBool */
    private boolean m103694x3c257475(java.util.Map<java.lang.String, java.lang.Object> map, java.lang.String str, boolean z17) {
        java.lang.Object obj;
        return (map == null || (obj = map.get(str)) == null) ? z17 : ((java.lang.Boolean) obj).booleanValue();
    }

    /* renamed from: getMapValueFloat */
    private float m103695x48c01a31(java.util.Map<java.lang.String, java.lang.Object> map, java.lang.String str, float f17) {
        java.lang.Object obj;
        return (map == null || (obj = map.get(str)) == null) ? f17 : ((java.lang.Float) obj).floatValue();
    }

    /* renamed from: getMapValueInteger */
    private int m103696xbb86d7d3(java.util.Map<java.lang.String, java.lang.Object> map, java.lang.String str, int i17) {
        java.lang.Object obj;
        return (map == null || (obj = map.get(str)) == null) ? i17 : ((java.lang.Integer) obj).intValue();
    }

    /* renamed from: getMapValueLong */
    private long m103697x3c2a0007(java.util.Map<java.lang.String, java.lang.Object> map, java.lang.String str, long j17) {
        java.lang.Object obj;
        return (map == null || (obj = map.get(str)) == null) ? j17 : ((java.lang.Long) obj).longValue();
    }

    /* renamed from: getMapValueString */
    private java.lang.String m103698xe5e462dc(java.util.Map<java.lang.String, java.lang.Object> map, java.lang.String str, java.lang.String str2) {
        java.lang.Object obj;
        return (map == null || (obj = map.get(str)) == null) ? str2 : (java.lang.String) obj;
    }

    /* renamed from: getMobileSubType */
    private int m103699x4f6acae2(int i17) {
        switch (i17) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return 2;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return 3;
            case 13:
                return 4;
            default:
                return 0;
        }
    }

    /* renamed from: getNetWorkType */
    private int m103700x6a054172() {
        android.net.NetworkInfo activeNetworkInfo;
        int m103699x4f6acae2;
        android.content.Context context = this.f54615xd6cfe882;
        if (context == null) {
            return 0;
        }
        try {
            android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) {
                return 0;
            }
            int type = activeNetworkInfo.getType();
            if (type != 0) {
                m103699x4f6acae2 = 1;
                if (type != 1) {
                    if (type != 9) {
                        return 0;
                    }
                    m103699x4f6acae2 = 10;
                }
            } else {
                m103699x4f6acae2 = m103699x4f6acae2(activeNetworkInfo.getSubtype());
            }
            return m103699x4f6acae2;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, e17);
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleReportThreadExit */
    public void m103701xff9c8e4() {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.d(TAG, "handleReportThreadExit");
        synchronized (this.f54621xa673daf6) {
            this.f54625x90ebc35 = true;
            this.f54621xa673daf6.notify();
        }
    }

    /* renamed from: init */
    private void m103702x316510() {
        this.f54648xbc97b16b = com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26581x3df100e2.m104405x9cf0d20b().m104408x3ccacf97("TP-ReportThread");
        this.f54620xf703545d = new com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.EventHandler(this.f54648xbc97b16b.getLooper());
        this.f54647xb5619ce7 = new com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876();
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26570x7018c6b1.m104303xdab2e64d(this.f54623x4efcdcde);
        synchronized (com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.class) {
            if (f54612xbdddfb15 == null) {
                f54612xbdddfb15 = new com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26566xc609bdb0(this.f54615xd6cfe882, f54609x49c557f2);
            }
            if (!f54611x416de0d6) {
                this.f54620xf703545d.obtainMessage(4000).sendToTarget();
            }
            f54611x416de0d6 = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: on302Redirect */
    public void m103703xfb6ebd32(java.util.Map<java.lang.String, java.lang.Object> map) {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "on302Redirect");
        if (map == null) {
            return;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26578x4d6188cf c26578x4d6188cf = new com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26578x4d6188cf();
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.RedirectParams m103760xaa6a5578 = this.f54647xb5619ce7.m103760xaa6a5578();
        m103760xaa6a5578.f54914x36428968 = m103696xbb86d7d3(map, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54551x8c928bca, 0);
        m103760xaa6a5578.f54917xb552c05c = m103696xbb86d7d3(map, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54570xa34b433f, 0);
        m103760xaa6a5578.f54918x91419f25 = m103698xe5e462dc(map, "url", "");
        m103760xaa6a5578.f54919xac46a67 = m103697x3c2a0007(map, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54569x4532f0c8, 0L);
        m103760xaa6a5578.f54915x288d53f0 = m103697x3c2a0007(map, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54553x5c42836f, 0L);
        m103760xaa6a5578.f54916x148ebfa3 = m103698xe5e462dc(map, "code", "0");
        m103760xaa6a5578.mo101570xb4a60eb4(c26578x4d6188cf);
        this.f54645x4f692009.mo103747xfd89e7e(34, c26578x4d6188cf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onAppBackground */
    public void m103704x3be51a90() {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "onAppBackground");
        if (this.f54627x1cde086d || this.f54641x94f97c1b == 1 || !this.f54614x69f02e7d) {
            return;
        }
        this.f54614x69f02e7d = false;
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26578x4d6188cf c26578x4d6188cf = new com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26578x4d6188cf();
        this.f54647xb5619ce7.m103751x3ad4cd5e().mo101570xb4a60eb4(c26578x4d6188cf);
        this.f54647xb5619ce7.m103761xab8e15d1().mo101570xb4a60eb4(c26578x4d6188cf);
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.PlayDoneParams m103759xe623a2f2 = this.f54647xb5619ce7.m103759xe623a2f2();
        m103759xe623a2f2.f54905x288d53f0 = java.lang.System.currentTimeMillis();
        m103759xe623a2f2.f54908xd819370b = 2;
        m103759xe623a2f2.f54906x148ebfa3 = this.f54619x8e53fa28;
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.ParamRecord paramRecord = this.f54637xd86d2491;
        if (paramRecord.f54713xd0ba2ba9 > 0) {
            int i17 = paramRecord.f54710x7af038ae;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.ParamRecord paramRecord2 = this.f54637xd86d2491;
            paramRecord.f54710x7af038ae = i17 + ((int) (currentTimeMillis - paramRecord2.f54713xd0ba2ba9));
            paramRecord2.f54713xd0ba2ba9 = 0L;
        }
        long j17 = this.f54640x61204054;
        if (j17 > 0) {
            this.f54638x81a3427b += m103759xe623a2f2.f54905x288d53f0 - j17;
            this.f54640x61204054 = 0L;
        }
        m103759xe623a2f2.f54907x786fba54 = ((float) this.f54638x81a3427b) / 1000.0f;
        m103759xe623a2f2.mo101570xb4a60eb4(c26578x4d6188cf);
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.CommonParams m103752x61d745c7 = this.f54647xb5619ce7.m103752x61d745c7();
        m103752x61d745c7.f54832x8f221583 = 50;
        m103752x61d745c7.mo101570xb4a60eb4(c26578x4d6188cf);
        int i18 = this.f54641x94f97c1b;
        if (i18 == 0) {
            m103745x3e60e5f8(c26578x4d6188cf, false);
        } else if (i18 == 1) {
            m103744x2576a085(c26578x4d6188cf, false);
        }
        if (f54612xbdddfb15 == null || android.text.TextUtils.isEmpty(this.f54622x3a09db6) || !this.f54635x34acf576) {
            return;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "Cache report event. mFlowId: " + this.f54622x3a09db6);
        f54612xbdddfb15.m104289xac26b9fb(this.f54622x3a09db6, c26578x4d6188cf.m104378xb70e4529());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onAppForeground */
    public void m103705x1952ea5() {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "onAppForeground");
        if (this.f54614x69f02e7d) {
            return;
        }
        this.f54614x69f02e7d = true;
        m103741x3e0133dc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onBufferingEnd */
    public void m103706x2018c558(java.util.Map<java.lang.String, java.lang.Object> map) {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "onBufferingEnd");
        this.f54624xf3f4eeeb = false;
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.ParamRecord paramRecord = this.f54637xd86d2491;
        if (!paramRecord.f54707x41e44341) {
            paramRecord.f54713xd0ba2ba9 = java.lang.System.currentTimeMillis();
        }
        if (map == null) {
            return;
        }
        long m103697x3c2a0007 = m103697x3c2a0007(map, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54553x5c42836f, java.lang.System.currentTimeMillis());
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.ParamRecord paramRecord2 = this.f54637xd86d2491;
        long j17 = paramRecord2.f54712x318c06d3;
        int i17 = (int) (m103697x3c2a0007 - j17);
        if (i17 > 1200 && !this.f54629xcdb027f3) {
            paramRecord2.f54695x4e13ba8d++;
            paramRecord2.f54701xa926a13a = m103697x3c2a0007;
            paramRecord2.f54696x6857179c += (int) (m103697x3c2a0007 - j17);
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.BufferingOnceParams bufferingOnceParams = this.f54616xa2af88b5;
            if (bufferingOnceParams == null) {
                return;
            }
            bufferingOnceParams.f54788x288d53f0 = m103697x3c2a0007(map, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54553x5c42836f, 0L);
            this.f54616xa2af88b5.f54789x148ebfa3 = this.f54619x8e53fa28;
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.BufferingTotalParams m103751x3ad4cd5e = this.f54647xb5619ce7.m103751x3ad4cd5e();
            m103751x3ad4cd5e.f54797xe9db3e22++;
            m103751x3ad4cd5e.f54798xa28bccb9 += i17;
            if (m103751x3ad4cd5e.f54799x82e0dce7.size() < 20) {
                m103751x3ad4cd5e.f54799x82e0dce7.add(this.f54616xa2af88b5);
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26578x4d6188cf c26578x4d6188cf = new com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26578x4d6188cf();
                this.f54616xa2af88b5.mo101570xb4a60eb4(c26578x4d6188cf);
                this.f54645x4f692009.mo103747xfd89e7e(35, c26578x4d6188cf);
            }
            this.f54616xa2af88b5 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onBufferingStart */
    public void m103707x7dc4d59f(java.util.Map<java.lang.String, java.lang.Object> map) {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "onBufferingStart");
        if (map == null) {
            return;
        }
        this.f54624xf3f4eeeb = true;
        if (this.f54629xcdb027f3) {
            return;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.ParamRecord paramRecord = this.f54637xd86d2491;
        if (paramRecord.f54713xd0ba2ba9 > 0) {
            int i17 = paramRecord.f54710x7af038ae;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.ParamRecord paramRecord2 = this.f54637xd86d2491;
            paramRecord.f54710x7af038ae = i17 + ((int) (currentTimeMillis - paramRecord2.f54713xd0ba2ba9));
            paramRecord2.f54713xd0ba2ba9 = 0L;
        }
        this.f54637xd86d2491.f54712x318c06d3 = m103697x3c2a0007(map, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54569x4532f0c8, java.lang.System.currentTimeMillis());
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.BufferingOnceParams m103749x51a2620d = this.f54647xb5619ce7.m103749x51a2620d();
        this.f54616xa2af88b5 = m103749x51a2620d;
        m103749x51a2620d.f54794xac46a67 = this.f54637xd86d2491.f54712x318c06d3;
        m103749x51a2620d.f54790x6bfa1078 = m103696xbb86d7d3(map, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54557xe73e0b15, 0);
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.CommonParams m103752x61d745c7 = this.f54647xb5619ce7.m103752x61d745c7();
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.BufferingOnceParams bufferingOnceParams = this.f54616xa2af88b5;
        bufferingOnceParams.f54790x6bfa1078 = m103752x61d745c7.f54812xcb9260f4;
        bufferingOnceParams.f54792xd819370b = m103696xbb86d7d3(map, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54560xfb23a562, 0);
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.BufferingOnceParams bufferingOnceParams2 = this.f54616xa2af88b5;
        bufferingOnceParams2.f54791xaa076fab = this.f54631xf14a67b7;
        bufferingOnceParams2.f54793xd1c6abc3 = this.f54639xa1dc7cb;
        bufferingOnceParams2.f54787xa75e74c2 = m103697x3c2a0007(map, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54559x5083788f, 0L) / 1000;
        this.f54616xa2af88b5.f54796xeae80260 = m103698xe5e462dc(map, "url", "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCdnInfoUpdate */
    public void m103708xb4ad7b85(java.util.Map<java.lang.String, java.lang.Object> map) {
        if (map == null) {
            return;
        }
        this.f54637xd86d2491.f54699xaea44202 = m103698xe5e462dc(map, "url", "");
        this.f54637xd86d2491.f54697x5a23234 = m103698xe5e462dc(map, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54470x8e5f436d, "");
        this.f54637xd86d2491.f54698xaea440ef = m103698xe5e462dc(map, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54471x3d8956b6, "");
        if (android.text.TextUtils.isEmpty(this.f54637xd86d2491.f54699xaea44202) || !this.f54637xd86d2491.f54699xaea44202.contains("sid=")) {
            return;
        }
        int indexOf = this.f54637xd86d2491.f54699xaea44202.indexOf("sid=");
        int indexOf2 = this.f54637xd86d2491.f54699xaea44202.indexOf("&", indexOf);
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.ParamRecord paramRecord = this.f54637xd86d2491;
        paramRecord.f54718x367f5c = indexOf2 > -1 ? paramRecord.f54699xaea44202.substring(indexOf + 4, indexOf2) : paramRecord.f54699xaea44202.substring(indexOf + 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onFirstClipOpen */
    public void m103709xd78480eb(java.util.Map<java.lang.String, java.lang.Object> map) {
        if (map == null) {
            return;
        }
        this.f54647xb5619ce7.m103753xdc57caa6().f54843x5882b12f = m103697x3c2a0007(map, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54569x4532f0c8, java.lang.System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onFirstPacketRead */
    public void m103710xbf25f92f(java.util.Map<java.lang.String, java.lang.Object> map) {
        if (map == null) {
            return;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.LiveExParam m103757x433b9fd8 = this.f54647xb5619ce7.m103757x433b9fd8();
        long m103697x3c2a0007 = m103697x3c2a0007(map, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54569x4532f0c8, java.lang.System.currentTimeMillis());
        m103757x433b9fd8.f54872xbdd3473f = (int) (m103697x3c2a0007 - this.f54637xd86d2491.f54714x27bfcff8);
        this.f54647xb5619ce7.m103753xdc57caa6().f54844xc74c9123 = m103697x3c2a0007;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onGetCdn */
    public void m103711x447d07b6(java.util.Map<java.lang.String, java.lang.Object> map) {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "onGetCdn");
        if (map == null) {
            return;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26578x4d6188cf c26578x4d6188cf = new com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26578x4d6188cf();
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.GetCdnUrlParams m103755x93c9d3d3 = this.f54647xb5619ce7.m103755x93c9d3d3();
        m103755x93c9d3d3.f54853x448780a6 = m103698xe5e462dc(map, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54552x8c62eff0, "");
        m103755x93c9d3d3.f54854xac46a67 = m103697x3c2a0007(map, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54569x4532f0c8, 0L);
        m103755x93c9d3d3.f54851x288d53f0 = m103697x3c2a0007(map, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54553x5c42836f, 0L);
        m103755x93c9d3d3.f54852x148ebfa3 = m103698xe5e462dc(map, "code", "0");
        m103755x93c9d3d3.mo101570xb4a60eb4(c26578x4d6188cf);
        this.f54645x4f692009.mo103747xfd89e7e(15, c26578x4d6188cf);
        if (android.text.TextUtils.isEmpty(m103755x93c9d3d3.f54852x148ebfa3) || m103755x93c9d3d3.f54852x148ebfa3.equals("0") || m103755x93c9d3d3.f54852x148ebfa3.equals(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.C0949x326edecc.f2286xa0294fa3)) {
            return;
        }
        this.f54619x8e53fa28 = m103755x93c9d3d3.f54852x148ebfa3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onHandleHlsTag */
    public void m103712x153820f2(java.lang.String str) {
        java.lang.String str2;
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "onHandleHlsTag, tag is null");
            return;
        }
        if (!str.startsWith(f54603x862da62a)) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "onHandleHlsTag, tag is not start with #EXT-X-PROGRAM-DATE-TIME:");
            return;
        }
        try {
            java.lang.String substring = str.substring(25);
            int indexOf = substring.indexOf(43);
            if (indexOf != -1) {
                str2 = substring.substring(0, indexOf).replace('T', ' ');
            } else {
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "handleOnPlayerPrivaterHlsM3u8Tag , player_m3u8_tag , tag do not contains time zone");
                str2 = substring.replace('T', ' ');
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, e17);
            str2 = "";
        }
        if (android.text.TextUtils.isEmpty(str2)) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "onHandleHlsTag , player_m3u8_tag , dataTime is null ");
            return;
        }
        long j17 = 0;
        try {
            java.util.Date parse = new java.text.SimpleDateFormat(com.p314xaae8f345.tav.p2957xa228aba5.C25746x8808ec8f.f47897xee1ddd9f).parse(str2);
            if (parse != null) {
                j17 = parse.getTime();
            }
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, e18);
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onHandleHlsTag , player_m3u8_tag , sysCurTime: ");
        sb6.append(currentTimeMillis);
        sb6.append(", time:");
        sb6.append(j17);
        sb6.append(", delay:");
        long j18 = currentTimeMillis - j17;
        sb6.append(j18);
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, sb6.toString());
        this.f54637xd86d2491.f54708x159db3fd = (int) j18;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onLivePeriodReport */
    public void m103713xf13e5960() {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "onLivePeriodReport");
        this.f54645x4f692009.mo103747xfd89e7e(263, new com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26578x4d6188cf());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onLoadSubtitle */
    public void m103714x46f6ba9d(java.util.Map<java.lang.String, java.lang.Object> map) {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "onLoadSubtitle");
        if (map == null) {
            return;
        }
        this.f54637xd86d2491.f54715x3dacc44d.add(new com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.SubtitleInfo(m103698xe5e462dc(map, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, ""), m103698xe5e462dc(map, "url", "")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onPlayComplete */
    public void m103715x27c2380c(java.util.Map<java.lang.String, java.lang.Object> map) {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "onPlayComplete");
        if (map == null) {
            return;
        }
        map.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54560xfb23a562, 0);
        m103716x323a4a28(map);
    }

    /* renamed from: onPlayEnd */
    private void m103716x323a4a28(java.util.Map<java.lang.String, java.lang.Object> map) {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "onPlayEnd");
        if (map == null || this.f54627x1cde086d) {
            return;
        }
        this.f54627x1cde086d = true;
        if (this.f54641x94f97c1b != 1 && this.f54628x452e9e90) {
            m103725xce4951ca(new com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26571x7baf53e9().put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54553x5c42836f, java.lang.Long.valueOf(java.lang.System.currentTimeMillis())).m104306x59bc66e());
        }
        if (this.f54624xf3f4eeeb) {
            m103706x2018c558(new com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26571x7baf53e9().put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54553x5c42836f, java.lang.Long.valueOf(java.lang.System.currentTimeMillis())).m104306x59bc66e());
        }
        if (this.f54629xcdb027f3) {
            m103731xe1fdf750(new com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26571x7baf53e9().put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54553x5c42836f, java.lang.Long.valueOf(java.lang.System.currentTimeMillis())).m104306x59bc66e());
        }
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.ParamRecord paramRecord = this.f54637xd86d2491;
        if (paramRecord.f54713xd0ba2ba9 > 0) {
            int i17 = paramRecord.f54710x7af038ae;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.ParamRecord paramRecord2 = this.f54637xd86d2491;
            paramRecord.f54710x7af038ae = i17 + ((int) (currentTimeMillis - paramRecord2.f54713xd0ba2ba9));
            paramRecord2.f54713xd0ba2ba9 = 0L;
        }
        this.f54629xcdb027f3 = false;
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26578x4d6188cf c26578x4d6188cf = new com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26578x4d6188cf();
        this.f54647xb5619ce7.m103751x3ad4cd5e().mo101570xb4a60eb4(c26578x4d6188cf);
        this.f54647xb5619ce7.m103751x3ad4cd5e().mo101571x6761d4f();
        this.f54647xb5619ce7.m103761xab8e15d1().mo101570xb4a60eb4(c26578x4d6188cf);
        this.f54647xb5619ce7.m103761xab8e15d1().mo101571x6761d4f();
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.PlayDoneParams m103759xe623a2f2 = this.f54647xb5619ce7.m103759xe623a2f2();
        m103759xe623a2f2.f54905x288d53f0 = m103697x3c2a0007(map, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54553x5c42836f, java.lang.System.currentTimeMillis());
        m103759xe623a2f2.f54908xd819370b = m103696xbb86d7d3(map, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54560xfb23a562, 0);
        m103759xe623a2f2.f54906x148ebfa3 = this.f54619x8e53fa28;
        long j17 = this.f54640x61204054;
        if (j17 > 0) {
            this.f54638x81a3427b += m103759xe623a2f2.f54905x288d53f0 - j17;
            this.f54640x61204054 = 0L;
        }
        m103759xe623a2f2.f54907x786fba54 = ((float) this.f54638x81a3427b) / 1000.0f;
        m103759xe623a2f2.mo101570xb4a60eb4(c26578x4d6188cf);
        this.f54645x4f692009.mo103747xfd89e7e(50, c26578x4d6188cf);
        this.f54619x8e53fa28 = "0";
        this.f54647xb5619ce7.m103763x20554ddb();
        m103741x3e0133dc();
        m103742x89741691();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onPlayerCreateDone */
    public void m103717xbab1205e(java.util.Map<java.lang.String, java.lang.Object> map) {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "onPlayerCreateDone");
        if (map == null) {
            return;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26578x4d6188cf c26578x4d6188cf = new com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26578x4d6188cf();
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.PlayerInitParams m103756xf785f6ac = this.f54647xb5619ce7.m103756xf785f6ac();
        m103756xf785f6ac.f54911x2823281c = m103697x3c2a0007(map, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54553x5c42836f, java.lang.System.currentTimeMillis());
        m103756xf785f6ac.f54910x148ebfa3 = this.f54619x8e53fa28;
        m103756xf785f6ac.mo101570xb4a60eb4(c26578x4d6188cf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onPlayerCreateStart */
    public void m103718x9c486306(java.util.Map<java.lang.String, java.lang.Object> map) {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "onPlayerCreateStart");
        if (map == null) {
            return;
        }
        this.f54647xb5619ce7.m103756xf785f6ac().f54912xfde91bbb = m103697x3c2a0007(map, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54569x4532f0c8, java.lang.System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onPlayerEarlyError */
    public void m103719x5de6b625(java.util.Map<java.lang.String, java.lang.Object> map) {
        if (map == null) {
            return;
        }
        this.f54622x3a09db6 = java.util.UUID.randomUUID().toString() + java.lang.System.nanoTime() + "_" + com.p314xaae8f345.p3006xb8ff1437.p3026xaf3f8342.C26278x84e5221f.m101638xeb97a5e9();
        this.f54619x8e53fa28 = m103698xe5e462dc(map, "code", "0");
        com.p314xaae8f345.p3006xb8ff1437.api.p3018xc84c5534.AbstractC26235x5a000607 abstractC26235x5a000607 = this.f54646x5e048a3a;
        if (abstractC26235x5a000607 != null) {
            this.f54641x94f97c1b = abstractC26235x5a000607.mo101481xebd61204();
        }
        if (this.f54641x94f97c1b == 1) {
            this.f54645x4f692009.mo103747xfd89e7e(150, new com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26578x4d6188cf());
        } else {
            map.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54560xfb23a562, 3);
            this.f54627x1cde086d = false;
            m103716x323a4a28(map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onPlayerError */
    public void m103720x3c547448(java.util.Map<java.lang.String, java.lang.Object> map) {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "onPlayerError");
        if (map == null) {
            return;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.ParamRecord paramRecord = this.f54637xd86d2491;
        if (paramRecord.f54713xd0ba2ba9 > 0) {
            int i17 = paramRecord.f54710x7af038ae;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.ParamRecord paramRecord2 = this.f54637xd86d2491;
            paramRecord.f54710x7af038ae = i17 + ((int) (currentTimeMillis - paramRecord2.f54713xd0ba2ba9));
            paramRecord2.f54713xd0ba2ba9 = 0L;
        }
        this.f54619x8e53fa28 = m103698xe5e462dc(map, "code", "0");
        if (this.f54641x94f97c1b == 1) {
            this.f54645x4f692009.mo103747xfd89e7e(150, new com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26578x4d6188cf());
        } else {
            map.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54560xfb23a562, 3);
            m103716x323a4a28(map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onPlayerPause */
    public void m103721x3ce7c836(java.util.Map<java.lang.String, java.lang.Object> map) {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "onPlayerPause");
        if (map == null) {
            return;
        }
        if (this.f54640x61204054 > 0) {
            this.f54638x81a3427b += m103697x3c2a0007(map, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54569x4532f0c8, java.lang.System.currentTimeMillis()) - this.f54640x61204054;
            this.f54640x61204054 = 0L;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.ParamRecord paramRecord = this.f54637xd86d2491;
        if (paramRecord.f54713xd0ba2ba9 > 0) {
            int i17 = paramRecord.f54710x7af038ae;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.ParamRecord paramRecord2 = this.f54637xd86d2491;
            paramRecord.f54710x7af038ae = i17 + ((int) (currentTimeMillis - paramRecord2.f54713xd0ba2ba9));
            paramRecord2.f54713xd0ba2ba9 = 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onPlayerRelease */
    public void m103722x12313a47(java.util.Map<java.lang.String, java.lang.Object> map) {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "onPlayerRelease");
        if (map == null) {
            return;
        }
        map.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54560xfb23a562, 1);
        m103716x323a4a28(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onPlayerReset */
    public void m103723x3d05bf8f(java.util.Map<java.lang.String, java.lang.Object> map) {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "onPlayerReset");
        if (map == null) {
            return;
        }
        map.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54560xfb23a562, 1);
        m103716x323a4a28(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onPlayerStop */
    public void m103724x44091dc2(java.util.Map<java.lang.String, java.lang.Object> map) {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "onPlayerStop");
        if (map == null) {
            return;
        }
        if (this.f54640x61204054 > 0) {
            this.f54638x81a3427b += m103697x3c2a0007(map, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54553x5c42836f, java.lang.System.currentTimeMillis()) - this.f54640x61204054;
            this.f54640x61204054 = 0L;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.ParamRecord paramRecord = this.f54637xd86d2491;
        if (paramRecord.f54713xd0ba2ba9 > 0) {
            int i17 = paramRecord.f54710x7af038ae;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.ParamRecord paramRecord2 = this.f54637xd86d2491;
            paramRecord.f54710x7af038ae = i17 + ((int) (currentTimeMillis - paramRecord2.f54713xd0ba2ba9));
            paramRecord2.f54713xd0ba2ba9 = 0L;
        }
        map.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54560xfb23a562, 1);
        m103716x323a4a28(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onPrepareDone */
    public void m103725xce4951ca(java.util.Map<java.lang.String, java.lang.Object> map) {
        if (this.f54628x452e9e90) {
            this.f54628x452e9e90 = false;
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "onPrepareDone");
            if (map == null) {
                return;
            }
            this.f54637xd86d2491.f54702x4e3bd81f = java.lang.System.currentTimeMillis();
            this.f54637xd86d2491.f54705xcb4a845c = m103694x3c257475(map, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.VodExKeys.f54581xa5400b0d, false);
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26578x4d6188cf c26578x4d6188cf = new com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26578x4d6188cf();
            if (m103696xbb86d7d3(map, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54489x140dc984, 0) == 1) {
                this.f54642x591e3e08 = 0;
            } else {
                this.f54642x591e3e08 = 1;
            }
            this.f54634x3c16783 = m103698xe5e462dc(map, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54481xb4cdf7db, "");
            this.f54632xac873131 = m103697x3c2a0007(map, "duration", 0L);
            this.f54633xfa4ae8f7 = (int) m103697x3c2a0007(map, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54480x74e6a74f, 0L);
            java.lang.String m103698xe5e462dc = m103698xe5e462dc(map, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54479xc2246ea6, "");
            if (m103698xe5e462dc == null || !m103698xe5e462dc.contains("hls")) {
                this.f54618xd9b060ef = 1;
            } else {
                this.f54618xd9b060ef = 3;
            }
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.FirstLoadParams m103753xdc57caa6 = this.f54647xb5619ce7.m103753xdc57caa6();
            m103753xdc57caa6.f54841x288d53f0 = m103697x3c2a0007(map, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54553x5c42836f, 0L);
            m103753xdc57caa6.f54842x148ebfa3 = this.f54619x8e53fa28;
            m103753xdc57caa6.mo101570xb4a60eb4(c26578x4d6188cf);
            this.f54645x4f692009.mo103747xfd89e7e(30, c26578x4d6188cf);
            this.f54647xb5619ce7.m103753xdc57caa6().mo101571x6761d4f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onProxyInfoUpdate */
    public void m103726x3f211446(java.util.Map<java.lang.String, java.lang.Object> map) {
        if (map == null) {
            return;
        }
        int m103696xbb86d7d3 = m103696xbb86d7d3(map, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54483x1466c762, 0);
        this.f54636x95c0fbc6 = m103696xbb86d7d3;
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.ParamRecord paramRecord = this.f54637xd86d2491;
        paramRecord.f54717xd5499f63 += m103696xbb86d7d3;
        paramRecord.f54703xfcd28d18++;
        if (m103696xbb86d7d3 > paramRecord.f54709x17a82943) {
            paramRecord.f54709x17a82943 = m103696xbb86d7d3;
        }
        java.lang.String m103698xe5e462dc = m103698xe5e462dc(map, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54544xe37d7e5f, "");
        if (android.text.TextUtils.isEmpty(m103698xe5e462dc)) {
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(m103698xe5e462dc);
            if (jSONObject.has(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54544xe37d7e5f)) {
                this.f54637xd86d2491.f54711xca955605 = jSONObject.getString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54544xe37d7e5f);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, e17);
        }
        m103693x5cef6a32(m103698xe5e462dc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onRenderingStart */
    public void m103727xc734ccf5(java.util.Map<java.lang.String, java.lang.Object> map) {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "onRenderingStart");
        if (map == null) {
            return;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26578x4d6188cf c26578x4d6188cf = new com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26578x4d6188cf();
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.FirstRenderParams m103754xb94544d6 = this.f54647xb5619ce7.m103754xb94544d6();
        m103754xb94544d6.f54847x288d53f0 = m103697x3c2a0007(map, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54553x5c42836f, 0L);
        m103754xb94544d6.f54848x148ebfa3 = this.f54619x8e53fa28;
        m103754xb94544d6.mo101570xb4a60eb4(c26578x4d6188cf);
        this.f54645x4f692009.mo103747xfd89e7e(32, c26578x4d6188cf);
        this.f54647xb5619ce7.m103754xb94544d6().mo101571x6761d4f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onReportEvent */
    public void m103728xc6ed667(com.p314xaae8f345.p3006xb8ff1437.p3023xaf3f29eb.p3024xc84c5534.InterfaceC26262x6f07842c interfaceC26262x6f07842c) {
        java.lang.String str;
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "onReportEvent, needReportToBeacon:" + this.f54635x34acf576 + ", params:" + interfaceC26262x6f07842c.toString());
        if (this.f54635x34acf576) {
            java.util.HashMap hashMap = new java.util.HashMap();
            interfaceC26262x6f07842c.mo101572xa67d136e(hashMap);
            if (!hashMap.containsKey(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54499xf5c94a0) || (str = (java.lang.String) hashMap.get(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54499xf5c94a0)) == null) {
                return;
            }
            java.lang.String m103692xebc1791f = m103692xebc1791f(java.lang.Integer.parseInt(str));
            if (android.text.TextUtils.isEmpty(m103692xebc1791f)) {
                return;
            }
            com.p314xaae8f345.p3006xb8ff1437.p3023xaf3f29eb.p3024xc84c5534.C26263x413d0abf.m101576xbcd477d3(m103692xebc1791f, hashMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onReportLastEvent */
    public void m103729x679ad2f1() {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "onReportLastEvent");
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26566xc609bdb0 c26566xc609bdb0 = f54612xbdddfb15;
        if (c26566xc609bdb0 == null) {
            return;
        }
        try {
            java.util.ArrayList arrayList = (java.util.ArrayList) c26566xc609bdb0.m104286x9d889447();
            if (arrayList == null) {
                return;
            }
            for (int i17 = 0; i17 < arrayList.size(); i17++) {
                try {
                    java.util.Properties properties = (java.util.Properties) arrayList.get(i17);
                    if (properties != null) {
                        m103728xc6ed667(new com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26578x4d6188cf(properties));
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, e17);
                }
            }
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, e18);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onReportProtocolUpdate */
    public void m103730x666f454(java.util.Map<java.lang.String, java.lang.Object> map) {
        this.f54643xbe9d157b = m103698xe5e462dc(map, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54493xdc0af674, "");
        this.f54644xea080428 = m103698xe5e462dc(map, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54494x9fbf508f, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onSeekComplete */
    public void m103731xe1fdf750(java.util.Map<java.lang.String, java.lang.Object> map) {
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.UserSeekOnceParams userSeekOnceParams;
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "onSeekComplete");
        this.f54629xcdb027f3 = false;
        if (map == null || (userSeekOnceParams = this.f54617xc2b29111) == null) {
            return;
        }
        userSeekOnceParams.f54924x56f9f258 = m103697x3c2a0007(map, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54553x5c42836f, java.lang.System.currentTimeMillis());
        this.f54617xc2b29111.f54921xf82a4e69 = m103697x3c2a0007(map, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54566x77a53afe, 0L) / 1000;
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.UserSeekOnceParams userSeekOnceParams2 = this.f54617xc2b29111;
        userSeekOnceParams2.f54922x148ebfa3 = this.f54619x8e53fa28;
        long j17 = userSeekOnceParams2.f54924x56f9f258 - userSeekOnceParams2.f54925xd180bcdf;
        if (j17 > 1200) {
            this.f54650xbf78fe72++;
            this.f54651x80a48151 = (int) (this.f54651x80a48151 + j17);
        }
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.UserSeekTotalParams m103761xab8e15d1 = this.f54647xb5619ce7.m103761xab8e15d1();
        m103761xab8e15d1.f54931x3125602c++;
        m103761xab8e15d1.f54929x7f46e351 = this.f54651x80a48151;
        m103761xab8e15d1.f54928x2d616e8a = this.f54650xbf78fe72;
        if (m103761xab8e15d1.f54930x2857613d.size() < 20) {
            m103761xab8e15d1.f54930x2857613d.add(this.f54617xc2b29111);
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26578x4d6188cf c26578x4d6188cf = new com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26578x4d6188cf();
            this.f54617xc2b29111.mo101570xb4a60eb4(c26578x4d6188cf);
            this.f54645x4f692009.mo103747xfd89e7e(40, c26578x4d6188cf);
        }
        this.f54617xc2b29111 = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onSelectTrack */
    public void m103732x28ca1250(java.util.Map<java.lang.String, java.lang.Object> map) {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "onSelectTrack");
        if (map == null || this.f54637xd86d2491.f54715x3dacc44d.size() == 0 || m103696xbb86d7d3(map, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54568xaa3f2313, 0) != 3) {
            return;
        }
        this.f54626x3e5a8dfd = true;
        this.f54637xd86d2491.f54706x1b55951d = true;
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.LoadSubtitleParams m103758xd3fc283a = this.f54647xb5619ce7.m103758xd3fc283a();
        m103758xd3fc283a.f54902xac46a67 = m103697x3c2a0007(map, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54569x4532f0c8, 0L);
        com.p314xaae8f345.p3006xb8ff1437.api.p3018xc84c5534.AbstractC26235x5a000607 abstractC26235x5a000607 = this.f54646x5e048a3a;
        if (abstractC26235x5a000607 != null) {
            m103758xd3fc283a.f54898x36428968 = abstractC26235x5a000607.f51322x377ba5cf;
            m103758xd3fc283a.f54899x76dd1048 = abstractC26235x5a000607.f51323xe65b98db;
        }
        long m103697x3c2a0007 = m103697x3c2a0007(map, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54550x6704fffd, -1L);
        java.lang.String m103698xe5e462dc = m103698xe5e462dc(map, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, "");
        java.util.Iterator<com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.SubtitleInfo> it = this.f54637xd86d2491.f54715x3dacc44d.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.SubtitleInfo next = it.next();
            if (!android.text.TextUtils.isEmpty(m103698xe5e462dc) && next.f54719x337a8b.equals(m103698xe5e462dc)) {
                m103758xd3fc283a.f54903xf682f128 = next.url;
                next.f54720xc3c20421 = m103697x3c2a0007;
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onSelectTrackDone */
    public void m103733xb5f901f2(java.util.Map<java.lang.String, java.lang.Object> map) {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "onSelectTrackDone");
        if (!this.f54626x3e5a8dfd || map == null || this.f54637xd86d2491.f54715x3dacc44d.size() == 0) {
            return;
        }
        long m103697x3c2a0007 = m103697x3c2a0007(map, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54550x6704fffd, -1L);
        if (m103697x3c2a0007 == -1) {
            return;
        }
        java.util.Iterator<com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.SubtitleInfo> it = this.f54637xd86d2491.f54715x3dacc44d.iterator();
        while (it.hasNext()) {
            if (it.next().f54720xc3c20421 == m103697x3c2a0007) {
                com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.LoadSubtitleParams m103758xd3fc283a = this.f54647xb5619ce7.m103758xd3fc283a();
                m103758xd3fc283a.f54900x288d53f0 = m103697x3c2a0007(map, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54553x5c42836f, 0L);
                m103758xd3fc283a.f54901x148ebfa3 = m103698xe5e462dc(map, "code", "0");
                m103758xd3fc283a.f54897xa28bccb9 = (int) (m103758xd3fc283a.f54900x288d53f0 - m103758xd3fc283a.f54902xac46a67);
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26578x4d6188cf c26578x4d6188cf = new com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26578x4d6188cf();
                m103758xd3fc283a.mo101570xb4a60eb4(c26578x4d6188cf);
                this.f54645x4f692009.mo103747xfd89e7e(33, c26578x4d6188cf);
                this.f54626x3e5a8dfd = false;
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onSetPlaySpeed */
    public void m103734x607022b0(java.util.Map<java.lang.String, java.lang.Object> map) {
        if (map == null) {
            return;
        }
        if (m103695x48c01a31(map, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 1.0f) != 1.0f) {
            this.f54639xa1dc7cb = 2;
        } else {
            this.f54639xa1dc7cb = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onStartPlayer */
    public void m103735xa7bc8284(java.util.Map<java.lang.String, java.lang.Object> map) {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "onStartPlayer");
        this.f54627x1cde086d = false;
        if (map == null) {
            return;
        }
        this.f54637xd86d2491.f54713xd0ba2ba9 = java.lang.System.currentTimeMillis();
        long m103697x3c2a0007 = m103697x3c2a0007(map, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54569x4532f0c8, 0L);
        if (this.f54640x61204054 > 0) {
            this.f54638x81a3427b += java.lang.System.currentTimeMillis() - m103697x3c2a0007;
        }
        this.f54640x61204054 = m103697x3c2a0007;
        if (this.f54641x94f97c1b == 1) {
            this.f54620xf703545d.removeMessages(3000);
            this.f54620xf703545d.sendEmptyMessageDelayed(3000, 60000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onStartPrepare */
    public void m103736x5a4519c4(java.util.Map<java.lang.String, java.lang.Object> map) {
        if (this.f54628x452e9e90) {
            return;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "onStartPrepare");
        this.f54627x1cde086d = false;
        this.f54622x3a09db6 = m103698xe5e462dc(map, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54475xe9ed6778, "");
        this.f54630x1b55451e = m103694x3c257475(map, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54486x6397925a, false);
        com.p314xaae8f345.p3006xb8ff1437.api.p3018xc84c5534.AbstractC26235x5a000607 abstractC26235x5a000607 = this.f54646x5e048a3a;
        if (abstractC26235x5a000607 != null) {
            this.f54641x94f97c1b = abstractC26235x5a000607.mo101481xebd61204();
        }
        int i17 = this.f54641x94f97c1b;
        if (i17 == 1) {
            this.f54645x4f692009 = new com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.LiveReportHandler();
        } else if (i17 == 0) {
            this.f54645x4f692009 = new com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.VodReportHandler();
        }
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26578x4d6188cf c26578x4d6188cf = new com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26578x4d6188cf();
        this.f54647xb5619ce7.m103756xf785f6ac().mo101570xb4a60eb4(c26578x4d6188cf);
        this.f54645x4f692009.mo103747xfd89e7e(5, c26578x4d6188cf);
        this.f54637xd86d2491.f54714x27bfcff8 = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.FirstLoadParams m103753xdc57caa6 = this.f54647xb5619ce7.m103753xdc57caa6();
        java.lang.String str = this.f54637xd86d2491.f54699xaea44202;
        m103753xdc57caa6.f54839x7cf184b3 = str;
        if (android.text.TextUtils.isEmpty(str)) {
            m103753xdc57caa6.f54839x7cf184b3 = m103698xe5e462dc(map, "url", "");
        }
        com.p314xaae8f345.p3006xb8ff1437.api.p3018xc84c5534.AbstractC26235x5a000607 abstractC26235x5a0006072 = this.f54646x5e048a3a;
        if (abstractC26235x5a0006072 != null) {
            m103753xdc57caa6.f54840x76dd1048 = abstractC26235x5a0006072.f51307x7f56e7f0;
        }
        m103753xdc57caa6.f54840x76dd1048 = m103696xbb86d7d3(map, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54573xb67289e4, 0);
        m103753xdc57caa6.f54845xac46a67 = m103697x3c2a0007(map, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54569x4532f0c8, 0L);
        this.f54647xb5619ce7.m103754xb94544d6().f54849xac46a67 = m103697x3c2a0007(map, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54569x4532f0c8, 0L);
        this.f54628x452e9e90 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onStartSeek */
    public void m103737x7f3f42db(java.util.Map<java.lang.String, java.lang.Object> map) {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "onStartSeek");
        if (map == null) {
            return;
        }
        if (this.f54624xf3f4eeeb) {
            m103706x2018c558(new com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26571x7baf53e9().put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54553x5c42836f, java.lang.Long.valueOf(java.lang.System.currentTimeMillis())).m104306x59bc66e());
        }
        if (this.f54629xcdb027f3) {
            m103731xe1fdf750(new com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26571x7baf53e9().put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54553x5c42836f, java.lang.Long.valueOf(java.lang.System.currentTimeMillis())).put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54566x77a53afe, java.lang.Long.valueOf(m103697x3c2a0007(map, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54567x12c60097, 0L) / 1000)).m104306x59bc66e());
        }
        this.f54629xcdb027f3 = true;
        this.f54631xf14a67b7 = 1;
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.UserSeekOnceParams m103750x3e48a2c6 = this.f54647xb5619ce7.m103750x3e48a2c6();
        this.f54617xc2b29111 = m103750x3e48a2c6;
        m103750x3e48a2c6.f54925xd180bcdf = m103697x3c2a0007(map, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54569x4532f0c8, java.lang.System.currentTimeMillis());
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.CommonParams m103752x61d745c7 = this.f54647xb5619ce7.m103752x61d745c7();
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.UserSeekOnceParams userSeekOnceParams = this.f54617xc2b29111;
        userSeekOnceParams.f54923x6bfa1078 = m103752x61d745c7.f54812xcb9260f4;
        userSeekOnceParams.f54926x808fb402 = m103697x3c2a0007(map, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54567x12c60097, 0L) / 1000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onSwitchDef */
    public void m103738x6097d512(java.util.Map<java.lang.String, java.lang.Object> map) {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "onSwitchDef");
        if (map == null) {
            return;
        }
        this.f54637xd86d2491.f54700x5b0a000 = m103698xe5e462dc(map, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54512xc618a7cf, "");
        this.f54637xd86d2491.f54707x41e44341 = true;
        if (this.f54641x94f97c1b == 1) {
            this.f54620xf703545d.removeMessages(3000);
            m103713xf13e5960();
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.ParamRecord paramRecord = this.f54637xd86d2491;
            paramRecord.f54714x27bfcff8 = 0L;
            paramRecord.f54702x4e3bd81f = 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onSwitchDefEnd */
    public void m103739xa4e54a69(java.util.Map<java.lang.String, java.lang.Object> map) {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "onSwitchDefEnd");
        if (map == null) {
            return;
        }
        this.f54637xd86d2491.f54700x5b0a000 = m103698xe5e462dc(map, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54512xc618a7cf, "");
        this.f54637xd86d2491.f54707x41e44341 = false;
        if (this.f54641x94f97c1b == 1) {
            this.f54645x4f692009.mo103747xfd89e7e(30, new com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26578x4d6188cf());
            this.f54620xf703545d.removeMessages(3000);
            this.f54620xf703545d.sendEmptyMessageDelayed(3000, 60000L);
            this.f54637xd86d2491.f54713xd0ba2ba9 = java.lang.System.currentTimeMillis();
        }
    }

    /* renamed from: release */
    private void m103740x41012807() {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "release: ");
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26570x7018c6b1.m104305xdfb98f4a(this.f54623x4efcdcde);
        android.os.HandlerThread handlerThread = this.f54648xbc97b16b;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.f54648xbc97b16b = null;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "release: end!");
    }

    /* renamed from: removeCacheEvent */
    private void m103741x3e0133dc() {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "removeCacheEvent: mFlowId: " + this.f54622x3a09db6);
        if (f54612xbdddfb15 == null || android.text.TextUtils.isEmpty(this.f54622x3a09db6)) {
            return;
        }
        f54612xbdddfb15.m104288xc8a9e257(this.f54622x3a09db6);
    }

    /* renamed from: resetLocalParam */
    private void m103742x89741691() {
        this.f54640x61204054 = 0L;
        this.f54638x81a3427b = 0L;
        this.f54650xbf78fe72 = 0;
        this.f54651x80a48151 = 0;
        this.f54629xcdb027f3 = false;
        this.f54624xf3f4eeeb = false;
        this.f54628x452e9e90 = false;
        this.f54626x3e5a8dfd = false;
        this.f54622x3a09db6 = "";
        this.f54642x591e3e08 = 0;
        this.f54618xd9b060ef = 0;
        this.f54633xfa4ae8f7 = 0;
        this.f54632xac873131 = 0L;
        this.f54636x95c0fbc6 = 0;
        this.f54630x1b55451e = false;
        this.f54643xbe9d157b = "";
        this.f54644xea080428 = "";
        this.f54634x3c16783 = "";
        this.f54641x94f97c1b = -1;
        this.f54619x8e53fa28 = "0";
        this.f54637xd86d2491.m103748x6761d4f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: updateCommonParam */
    public void m103743x487bc0d9(com.p314xaae8f345.p3006xb8ff1437.p3023xaf3f29eb.p3024xc84c5534.InterfaceC26262x6f07842c interfaceC26262x6f07842c, int i17, boolean z17) {
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.CommonParams m103752x61d745c7 = this.f54647xb5619ce7.m103752x61d745c7();
        m103752x61d745c7.f54832x8f221583 = i17;
        m103752x61d745c7.f54830xca011310++;
        java.lang.String str = this.f54622x3a09db6;
        m103752x61d745c7.f54808x964a305a = str;
        m103752x61d745c7.f54822xfd09c086 = str;
        m103752x61d745c7.f54831xff4f5c26 = this.f54652xef2304d6;
        m103752x61d745c7.f54815x35061676 = this.f54636x95c0fbc6;
        m103752x61d745c7.f54816x679a9c47 = m103700x6a054172();
        m103752x61d745c7.f54805x82aff972 = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26329xaae09719.m101947x1ccda9f7();
        m103752x61d745c7.f54806x37d58a53 = m103690xf7bd6718();
        m103752x61d745c7.f54818xca903b85 = f54607x412a355d;
        m103752x61d745c7.f54820x6b7f9ebb = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26373xd285c9f8.m102352xa942c580();
        m103752x61d745c7.f54825x7c8571a8 = com.p314xaae8f345.p3006xb8ff1437.p3026xaf3f8342.C26278x84e5221f.f51522x3fc0a8b8;
        m103752x61d745c7.f54824x6b47bc34 = this.f54642x591e3e08;
        m103752x61d745c7.f54819xc2136621 = this.f54630x1b55451e ? 1 : 0;
        m103752x61d745c7.f54826x65fc9e8 = this.f54643xbe9d157b;
        m103752x61d745c7.f54827xc50ad4bb = this.f54644xea080428;
        m103752x61d745c7.f54823xaac55881 = this.f54641x94f97c1b;
        com.p314xaae8f345.p3006xb8ff1437.api.p3018xc84c5534.AbstractC26235x5a000607 abstractC26235x5a000607 = this.f54646x5e048a3a;
        if (abstractC26235x5a000607 != null && z17) {
            m103752x61d745c7.f54833xb86b0f62 = abstractC26235x5a000607.f51324xcbb7714d;
            m103752x61d745c7.f54802x95ebdca7 = abstractC26235x5a000607.f51304x5a23228;
            m103752x61d745c7.f54807xe4b334ad = abstractC26235x5a000607.f51308xb0be8be2;
            m103752x61d745c7.f54810xbad9beac = abstractC26235x5a000607.f51313x99861643;
            m103752x61d745c7.f54812xcb9260f4 = abstractC26235x5a000607.f51315xd571d8fb;
            m103752x61d745c7.f54813x3bc8666b = abstractC26235x5a000607.f51316x7f939ee4;
            m103752x61d745c7.f54821x942318f = abstractC26235x5a000607.f51318x6fbd6873;
            m103752x61d745c7.f54817xf6f8649c = abstractC26235x5a000607.f51312xebd7a81d ? 1 : 0;
            m103752x61d745c7.f54811x48c1f3a4 = abstractC26235x5a000607.f51314xad61fd98;
            m103752x61d745c7.f54835xadc9e50b = abstractC26235x5a000607.uin;
            m103752x61d745c7.f54828x725cabb6 = abstractC26235x5a000607.f51319xc12da745;
            m103752x61d745c7.f54838x432492f7 = abstractC26235x5a000607.f51325xa2c05346;
            m103752x61d745c7.f54809xe65817fa = abstractC26235x5a000607.f51311x309689;
            m103752x61d745c7.f54836x17965b8d = abstractC26235x5a000607.uip;
            m103752x61d745c7.f54804xa99fdde0 = abstractC26235x5a000607.f51306xaea440ef;
            m103752x61d745c7.f54803xeb30765 = abstractC26235x5a000607.f51305x5a23234;
            m103752x61d745c7.f54801xf7175a68 = abstractC26235x5a000607.f51303x5875c377;
            m103752x61d745c7.f54837x31100382 = abstractC26235x5a000607.vid;
            m103752x61d745c7.f54814x310ffe1 = abstractC26235x5a000607.f51317x341337b0;
            m103752x61d745c7.f54829xd1c744e2 = abstractC26235x5a000607.f51321xd1c744e2;
            java.util.Properties properties = abstractC26235x5a000607.f51320x324142d5;
            if (properties != null) {
                for (java.util.Map.Entry entry : properties.entrySet()) {
                    java.lang.Object key = entry.getKey();
                    java.lang.Object value = entry.getValue();
                    if (value == null) {
                        interfaceC26262x6f07842c.put(key.toString(), "");
                    } else {
                        interfaceC26262x6f07842c.put(key.toString(), value.toString());
                    }
                }
            }
            this.f54641x94f97c1b = this.f54646x5e048a3a.mo101481xebd61204();
        }
        if (m103752x61d745c7.f54821x942318f <= 0) {
            m103752x61d745c7.f54821x942318f = com.p314xaae8f345.p3006xb8ff1437.p3026xaf3f8342.C26278x84e5221f.m101638xeb97a5e9();
        }
        if (android.text.TextUtils.isEmpty(m103752x61d745c7.f54835xadc9e50b)) {
            m103752x61d745c7.f54835xadc9e50b = com.p314xaae8f345.p3006xb8ff1437.p3026xaf3f8342.C26278x84e5221f.m101641x35080459();
        }
        if (android.text.TextUtils.isEmpty(m103752x61d745c7.f54809xe65817fa)) {
            m103752x61d745c7.f54809xe65817fa = com.p314xaae8f345.p3006xb8ff1437.p3026xaf3f8342.C26278x84e5221f.m101634xfb7ffeff();
        }
        if (android.text.TextUtils.isEmpty(m103752x61d745c7.f54801xf7175a68)) {
            m103752x61d745c7.f54801xf7175a68 = com.p314xaae8f345.p3006xb8ff1437.p3026xaf3f8342.C26278x84e5221f.m101632xc725eb98(this.f54615xd6cfe882);
        }
        if (android.text.TextUtils.isEmpty(m103752x61d745c7.f54836x17965b8d)) {
            m103752x61d745c7.f54836x17965b8d = this.f54637xd86d2491.f54698xaea440ef;
        }
        if (android.text.TextUtils.isEmpty(m103752x61d745c7.f54804xa99fdde0)) {
            m103752x61d745c7.f54804xa99fdde0 = this.f54637xd86d2491.f54698xaea440ef;
        }
        if (android.text.TextUtils.isEmpty(m103752x61d745c7.f54803xeb30765)) {
            m103752x61d745c7.f54803xeb30765 = this.f54637xd86d2491.f54697x5a23234;
        }
        if (m103752x61d745c7.f54807xe4b334ad <= 0) {
            m103752x61d745c7.f54807xe4b334ad = this.f54618xd9b060ef;
        }
        if (android.text.TextUtils.isEmpty(m103752x61d745c7.f54814x310ffe1)) {
            m103752x61d745c7.f54814x310ffe1 = this.f54634x3c16783;
        }
        if (m103752x61d745c7.f54811x48c1f3a4 <= 0.0f) {
            m103752x61d745c7.f54811x48c1f3a4 = ((float) this.f54632xac873131) / 1000.0f;
        }
        if (m103752x61d745c7.f54813x3bc8666b <= 0) {
            m103752x61d745c7.f54813x3bc8666b = this.f54633xfa4ae8f7;
        }
        m103752x61d745c7.mo101570xb4a60eb4(interfaceC26262x6f07842c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: updateLiveExParam */
    public void m103744x2576a085(com.p314xaae8f345.p3006xb8ff1437.p3023xaf3f29eb.p3024xc84c5534.InterfaceC26262x6f07842c interfaceC26262x6f07842c, boolean z17) {
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.LiveExParam m103757x433b9fd8 = this.f54647xb5619ce7.m103757x433b9fd8();
        if (m103757x433b9fd8 == null) {
            return;
        }
        com.p314xaae8f345.p3006xb8ff1437.api.p3018xc84c5534.AbstractC26235x5a000607 abstractC26235x5a000607 = this.f54646x5e048a3a;
        if (abstractC26235x5a000607 != null && (abstractC26235x5a000607 instanceof com.p314xaae8f345.p3006xb8ff1437.api.p3018xc84c5534.C26236x2e0b97aa) && z17) {
            m103757x433b9fd8.f54856x617356f2 = ((com.p314xaae8f345.p3006xb8ff1437.api.p3018xc84c5534.C26236x2e0b97aa) abstractC26235x5a000607).f51326xdc0ed3bd;
            m103757x433b9fd8.f54879x8ee69fbc = ((com.p314xaae8f345.p3006xb8ff1437.api.p3018xc84c5534.C26236x2e0b97aa) abstractC26235x5a000607).f51334xc64196bf;
            m103757x433b9fd8.f54891x5fc3a934 = ((com.p314xaae8f345.p3006xb8ff1437.api.p3018xc84c5534.C26236x2e0b97aa) abstractC26235x5a000607).f51335x6abf78bb;
            m103757x433b9fd8.f54861x3056f7db = ((com.p314xaae8f345.p3006xb8ff1437.api.p3018xc84c5534.C26236x2e0b97aa) abstractC26235x5a000607).f51328xe7bc0374;
            m103757x433b9fd8.f54885x8f4d880e = ((com.p314xaae8f345.p3006xb8ff1437.api.p3018xc84c5534.C26236x2e0b97aa) abstractC26235x5a000607).f51333x6ffb9821;
            m103757x433b9fd8.f54881x865bd3c9 = ((com.p314xaae8f345.p3006xb8ff1437.api.p3018xc84c5534.C26236x2e0b97aa) abstractC26235x5a000607).f51332x54805e46;
            m103757x433b9fd8.f54877xda295e9c = ((com.p314xaae8f345.p3006xb8ff1437.api.p3018xc84c5534.C26236x2e0b97aa) abstractC26235x5a000607).f51330xd4abfc53 ? 1 : 0;
            m103757x433b9fd8.f54874x6b982a5f = ((com.p314xaae8f345.p3006xb8ff1437.api.p3018xc84c5534.C26236x2e0b97aa) abstractC26235x5a000607).f51329x56f77f70 ? 1 : 0;
            m103757x433b9fd8.f54859xf273b601 = ((com.p314xaae8f345.p3006xb8ff1437.api.p3018xc84c5534.C26236x2e0b97aa) abstractC26235x5a000607).f51327x38c105d0;
            m103757x433b9fd8.f54869xc7093e49 = abstractC26235x5a000607.f51310xa44f03c6;
            m103757x433b9fd8.f54896xfdb22f1c = abstractC26235x5a000607.uin;
            m103757x433b9fd8.f54895x2689f503 = abstractC26235x5a000607.uip;
            m103757x433b9fd8.f54875x7484682b = abstractC26235x5a000607.f51309xda597a6b ? 1 : 0;
        }
        if (abstractC26235x5a000607 != null && (abstractC26235x5a000607 instanceof com.p314xaae8f345.p3006xb8ff1437.api.p3018xc84c5534.C26236x2e0b97aa)) {
            m103757x433b9fd8.f54878x9e18bc78 = ((com.p314xaae8f345.p3006xb8ff1437.api.p3018xc84c5534.C26236x2e0b97aa) abstractC26235x5a000607).f51331x3aa0cbf7;
        }
        m103757x433b9fd8.f54876x1dea4c9e = this.f54630x1b55451e ? 1 : 0;
        java.lang.String str = this.f54637xd86d2491.f54699xaea44202;
        m103757x433b9fd8.f54866xb7cf57c7 = str;
        if (android.text.TextUtils.isEmpty(str)) {
            m103757x433b9fd8.f54866xb7cf57c7 = this.f54647xb5619ce7.m103753xdc57caa6().f54839x7cf184b3;
        }
        m103757x433b9fd8.f54865xa9ea4723 = this.f54637xd86d2491.f54697x5a23234;
        m103757x433b9fd8.f54889x1b12a43d = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.ParamRecord paramRecord = this.f54637xd86d2491;
        if (paramRecord.f54713xd0ba2ba9 > 0) {
            long j17 = paramRecord.f54710x7af038ae;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.ParamRecord paramRecord2 = this.f54637xd86d2491;
            paramRecord.f54710x7af038ae = (int) (j17 + (currentTimeMillis - paramRecord2.f54713xd0ba2ba9));
            if (this.f54627x1cde086d || this.f54624xf3f4eeeb || paramRecord2.f54707x41e44341) {
                paramRecord2.f54713xd0ba2ba9 = 0L;
            } else {
                paramRecord2.f54713xd0ba2ba9 = java.lang.System.currentTimeMillis();
            }
        }
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.ParamRecord paramRecord3 = this.f54637xd86d2491;
        m103757x433b9fd8.f54887xeab44072 = paramRecord3.f54710x7af038ae;
        paramRecord3.f54710x7af038ae = 0;
        m103757x433b9fd8.f54886x7c8571a8 = com.p314xaae8f345.p3006xb8ff1437.p3026xaf3f8342.C26278x84e5221f.f51522x3fc0a8b8;
        m103757x433b9fd8.f54863x8a7b5b1f = m103691x1cd0bea6();
        m103757x433b9fd8.f54884x679a9c47 = m103700x6a054172();
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.ParamRecord paramRecord4 = this.f54637xd86d2491;
        m103757x433b9fd8.f54883xfa1acbac = paramRecord4.f54709x17a82943;
        paramRecord4.f54709x17a82943 = 0;
        m103757x433b9fd8.f54892xab8c5cda = this.f54636x95c0fbc6;
        int i17 = paramRecord4.f54703xfcd28d18;
        if (i17 > 0) {
            m103757x433b9fd8.f54864x58ec2cea = paramRecord4.f54717xd5499f63 / i17;
            paramRecord4.f54717xd5499f63 = 0;
            paramRecord4.f54703xfcd28d18 = 0;
        }
        m103757x433b9fd8.f54880x348b3e01 = 0;
        m103757x433b9fd8.f54868x84c8928f = "";
        m103757x433b9fd8.f54888xc0bb23fd = 0;
        m103757x433b9fd8.f54860xea8ee198 = 0;
        m103757x433b9fd8.f54873x82311d69 = 0;
        m103757x433b9fd8.f54862x924ac50a = paramRecord4.f54700x5b0a000;
        m103757x433b9fd8.f54882x71aea845 = paramRecord4.f54702x4e3bd81f - paramRecord4.f54714x27bfcff8;
        m103757x433b9fd8.f54858x84d0c895 = paramRecord4.f54696x6857179c;
        m103757x433b9fd8.f54857x7af24c0d = paramRecord4.f54695x4e13ba8d;
        paramRecord4.f54695x4e13ba8d = 0;
        paramRecord4.f54696x6857179c = 0;
        m103757x433b9fd8.f54867x4514b19d = 0;
        m103757x433b9fd8.f54870xb1a8ad54 = this.f54619x8e53fa28;
        m103757x433b9fd8.f54890xca955605 = paramRecord4.f54711xca955605;
        m103757x433b9fd8.f54894x367f5c = paramRecord4.f54718x367f5c;
        m103757x433b9fd8.mo101570xb4a60eb4(interfaceC26262x6f07842c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: updateVodExParam */
    public void m103745x3e60e5f8(com.p314xaae8f345.p3006xb8ff1437.p3023xaf3f29eb.p3024xc84c5534.InterfaceC26262x6f07842c interfaceC26262x6f07842c, boolean z17) {
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.VodExParam m103762x79253045 = this.f54647xb5619ce7.m103762x79253045();
        if (m103762x79253045 == null) {
            return;
        }
        com.p314xaae8f345.p3006xb8ff1437.api.p3018xc84c5534.AbstractC26235x5a000607 abstractC26235x5a000607 = this.f54646x5e048a3a;
        if (abstractC26235x5a000607 != null && (abstractC26235x5a000607 instanceof com.p314xaae8f345.p3006xb8ff1437.api.p3018xc84c5534.C26237x9a99e611) && z17) {
            m103762x79253045.f54935x83d0c862 = ((com.p314xaae8f345.p3006xb8ff1437.api.p3018xc84c5534.C26237x9a99e611) abstractC26235x5a000607).f51338xd34fa444;
            m103762x79253045.f54942x66ad9cf4 = ((com.p314xaae8f345.p3006xb8ff1437.api.p3018xc84c5534.C26237x9a99e611) abstractC26235x5a000607).f51340x16801cfb;
            m103762x79253045.f54937xd4ff8dbd = ((com.p314xaae8f345.p3006xb8ff1437.api.p3018xc84c5534.C26237x9a99e611) abstractC26235x5a000607).f51339xdffd11e1 ? 1 : 0;
            m103762x79253045.f54933x4b03ff81 = ((com.p314xaae8f345.p3006xb8ff1437.api.p3018xc84c5534.C26237x9a99e611) abstractC26235x5a000607).f51336x5968d8e;
            m103762x79253045.f54934x334ffa7f = ((com.p314xaae8f345.p3006xb8ff1437.api.p3018xc84c5534.C26237x9a99e611) abstractC26235x5a000607).f51337x9ee74f9f;
            m103762x79253045.f54943x849af29d = ((com.p314xaae8f345.p3006xb8ff1437.api.p3018xc84c5534.C26237x9a99e611) abstractC26235x5a000607).f51341x3e22484d;
            m103762x79253045.f54936xc7093e49 = abstractC26235x5a000607.f51310xa44f03c6;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26530x3dc5debd.ParamRecord paramRecord = this.f54637xd86d2491;
        m103762x79253045.f54941xb36296fd = paramRecord.f54705xcb4a845c ? 1 : 0;
        m103762x79253045.f54940xec549992 = paramRecord.f54706x1b55951d ? 1 : 0;
        m103762x79253045.f54938x470ffcae = 0;
        m103762x79253045.f54939x7515271a = paramRecord.f54704x7515271a;
        m103762x79253045.mo101570xb4a60eb4(interfaceC26262x6f07842c);
    }

    /* renamed from: doReportSampling */
    public boolean m103746xe40d9ea6() {
        if (java.lang.Math.random() < this.f54649x9f345e74) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "reports are sampled");
            this.f54635x34acf576 = true;
        } else {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "reports are not sampled");
            this.f54635x34acf576 = false;
        }
        return this.f54635x34acf576;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.InterfaceC26525x70d6ef09
    /* renamed from: onAttach */
    public void mo103279x3b13c504() {
        m103702x316510();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.InterfaceC26525x70d6ef09
    /* renamed from: onDetach */
    public void mo103280x3f5eee52() {
        m103740x41012807();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.InterfaceC26525x70d6ef09
    /* renamed from: onEvent */
    public void mo103281xaf8c47fb(int i17, int i18, int i19, java.lang.String str, java.lang.Object obj) {
        int i27;
        switch (i17) {
            case 100:
                i27 = 999;
                break;
            case 101:
                i27 = 1000;
                break;
            case 102:
                i27 = 1001;
                break;
            case 103:
                i27 = 1002;
                break;
            case 104:
                i27 = 1003;
                break;
            case 105:
                i27 = 1012;
                break;
            case 106:
                i27 = 1004;
                break;
            case 107:
                i27 = 1005;
                break;
            case 108:
                i27 = 1006;
                break;
            case 109:
                i27 = 1007;
                break;
            case 110:
                i27 = 1008;
                break;
            case 111:
                i27 = 1009;
                break;
            case 112:
                i27 = 1010;
                break;
            case 113:
                i27 = 1011;
                break;
            case 114:
                i27 = 1013;
                break;
            case 115:
                i27 = 1014;
                break;
            case 116:
                i27 = 1015;
                break;
            case 117:
                i27 = 1016;
                break;
            case 118:
                i27 = 2002;
                break;
            case 119:
                i27 = com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46406xaf4081cb;
                break;
            case 120:
                i27 = com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46407x44d8fa6c;
                break;
            case 121:
                i27 = com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46405xe4de6fbf;
                break;
            case 122:
                i27 = 2004;
                break;
            case 123:
                i27 = com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46359x61685111;
                break;
            case 124:
                i27 = com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46404xa5f7fd74;
                break;
            default:
                switch (i17) {
                    case 200:
                        i27 = 1017;
                        break;
                    case 201:
                        i27 = 1018;
                        break;
                    case 202:
                        i27 = 1023;
                        break;
                    default:
                        return;
                }
        }
        this.f54620xf703545d.obtainMessage(i27, obj).sendToTarget();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3018xc84c5534.InterfaceC26234x67c8074
    /* renamed from: reportEvent */
    public void mo101478xefe04dc6(int i17, java.util.Map<java.lang.String, java.lang.Object> map) {
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3018xc84c5534.InterfaceC26234x67c8074
    /* renamed from: setReportInfoGetter */
    public void mo101479x83c1bc2f(com.p314xaae8f345.p3006xb8ff1437.api.p3018xc84c5534.AbstractC26235x5a000607 abstractC26235x5a000607) {
        this.f54646x5e048a3a = abstractC26235x5a000607;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3018xc84c5534.InterfaceC26234x67c8074
    /* renamed from: setReportSamplingRate */
    public void mo101480x6604a4bd(double d17) {
        if (d17 < 0.0d) {
            d17 = 0.0d;
        }
        if (d17 > 1.0d) {
            d17 = 1.0d;
        }
        this.f54649x9f345e74 = d17;
    }
}
