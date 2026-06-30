package com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf;

/* renamed from: com.tencent.thumbplayer.datatransport.TPPlayManagerImpl */
/* loaded from: classes16.dex */
public class C26458xbbcd017d implements com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.InterfaceC26454x8591d014, com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26574xd4e33498.OnNetStatusChangeListener, com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26570x7018c6b1.OnGlobalEventChangeListener {

    /* renamed from: API_CALL_TIME_OUT_MS */
    private static final int f53780xecdcb14d = 500;

    /* renamed from: MSG_DOWN_LOAD_CDN_INFO_UPDATE */
    private static final int f53781xdc823f0e = 4100;

    /* renamed from: MSG_DOWN_LOAD_CDN_URL_EXPERIED */
    private static final int f53782x739590da = 4103;

    /* renamed from: MSG_DOWN_LOAD_CDN_URL_UPDATE */
    private static final int f53783x1d17a5a5 = 4099;

    /* renamed from: MSG_DOWN_LOAD_ERROR */
    private static final int f53784x3f58342e = 4098;

    /* renamed from: MSG_DOWN_LOAD_FINISH */
    private static final int f53785xace26f0d = 4097;

    /* renamed from: MSG_DOWN_LOAD_LONG_GET_PLAY_INFO */
    private static final int f53786x97080407 = 4105;

    /* renamed from: MSG_DOWN_LOAD_PLAY_BACK */
    private static final int f53787x30ecda58 = 4104;

    /* renamed from: MSG_DOWN_LOAD_PROGRESS_UPDARE */
    private static final int f53788xc916d5a3 = 4106;

    /* renamed from: MSG_DOWN_LOAD_PROTOCOL_UPDATE */
    private static final int f53789x5da14b16 = 4102;

    /* renamed from: MSG_DOWN_LOAD_STATUS_UPDATE */
    private static final int f53790x90cf25fc = 4101;

    /* renamed from: MSG_DOWN_LOAD_STRING_GET_PLAY_INFO */
    private static final int f53791xdb74ba5c = 4107;

    /* renamed from: MSG_GLOBAL_EVENT */
    private static final int f53792xcf34d2fc = 4196;

    /* renamed from: MSG_INDEX */
    private static final int f53793x98b6f254 = 4096;

    /* renamed from: MSG_NETWORK_STATUS_EVENT */
    private static final int f53794x2657349c = 4197;

    /* renamed from: MSG_PROXY_CANCEL_READ_DATA */
    private static final int f53795xc828d59d = 4109;

    /* renamed from: MSG_PROXY_GET_CONTENT_TYPE */
    private static final int f53796x815eba38 = 4112;

    /* renamed from: MSG_PROXY_GET_DATA_FILE_PATH */
    private static final int f53797x4cc79f8b = 4111;

    /* renamed from: MSG_PROXY_GET_DATA_TOTAL_SIZE */
    private static final int f53798x6daaea19 = 4110;

    /* renamed from: MSG_PROXY_START_READ_DATA */
    private static final int f53799xecdc2a7 = 4108;
    private static final java.lang.String TAG = "TPThumbPlayer[TPPlayManagerImpl.java]";

    /* renamed from: TYPE_NOT_INIT */
    private static final int f53800xe2c54a81 = -1;

    /* renamed from: mContext */
    private final android.content.Context f53801xd6cfe882;

    /* renamed from: mDownloadPramList */
    private java.util.ArrayList<com.p314xaae8f345.p3006xb8ff1437.api.p3017x65fca6e.C26231xafaedb13> f53802xacd42ea1;

    /* renamed from: mDownloadProxy */
    private com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26361x94977a41 f53803x5c202f59;

    /* renamed from: mFileID */
    private java.lang.String f53808x374b664;

    /* renamed from: mHandler */
    private com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.EventHandler f53809xc7640a1d;

    /* renamed from: mHandlerLock */
    private final com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26579x7b4fc798 f53810x40bece8;

    /* renamed from: mInnerProxyListener */
    private com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.InnerProxyListener f53811xad385dd9;

    /* renamed from: mOriginUrl */
    private java.lang.String f53817x6ed5ce7c;

    /* renamed from: mPlayID */
    private int f53819x14aabe1c;

    /* renamed from: mPlayListener */
    private com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d f53820xbe0c5915;

    /* renamed from: mSkipEndTimeMs */
    private long f53823x818d03e2;

    /* renamed from: mStartTimeMs */
    private long f53824x3be94da8;

    /* renamed from: mTrackProxyUrlPlayIdMap */
    private java.util.HashMap<java.lang.String, java.lang.Integer> f53825xf879370e;

    /* renamed from: mVideoInfo */
    private com.p314xaae8f345.p3006xb8ff1437.api.C26204xf8de58ad f53826xca2581dc;

    /* renamed from: mDownloadProxyRWLock */
    private final java.util.concurrent.locks.ReentrantReadWriteLock f53804xfde721a9 = new java.util.concurrent.locks.ReentrantReadWriteLock();

    /* renamed from: mLoadProxyState */
    private volatile int f53815xd5f6a216 = 0;

    /* renamed from: mServiceType */
    private volatile int f53822x371c78e2 = -1;

    /* renamed from: mPlayerProxyListener */
    private com.p314xaae8f345.p3006xb8ff1437.api.p3017x65fca6e.InterfaceC26229xba673b1c f53821x7969be34 = null;

    /* renamed from: mPendingDefTaskQueue */
    private final java.util.Deque<com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.TPDefTaskModel> f53818xb7d33191 = new java.util.LinkedList();

    /* renamed from: mIsRemuxer */
    private boolean f53813x993f6bb3 = false;

    /* renamed from: mIsActive */
    private boolean f53812xf85a185d = true;

    /* renamed from: mEnableSuggestedBitrateCallback */
    private boolean f53807x6f80c59f = false;

    /* renamed from: mEnableAdaptiveSwitch */
    private boolean f53805x8d9395ba = false;

    /* renamed from: mEnableMultiNetworkCard */
    private boolean f53806xe1a8f7d5 = false;

    /* renamed from: mMaxBitrateBps */
    private long f53816xb602544f = 100000000;

    /* renamed from: mIsUseResourceLoader */
    private boolean f53814xd925f171 = false;

    /* renamed from: com.tencent.thumbplayer.datatransport.TPPlayManagerImpl$DownloadProxyState */
    /* loaded from: classes6.dex */
    public static final class DownloadProxyState {

        /* renamed from: STATE_LOAD_FAILED */
        private static final int f53830x2d01a2e8 = 1;

        /* renamed from: STATE_LOAD_RELEASE */
        private static final int f53831xf4f7ee9c = 3;

        /* renamed from: STATE_LOAD_SUCCEEDED */
        private static final int f53832xc9be33b6 = 2;

        /* renamed from: STATE_NO_LOADED */
        private static final int f53833x804c79f5 = 0;

        private DownloadProxyState() {
        }
    }

    /* renamed from: com.tencent.thumbplayer.datatransport.TPPlayManagerImpl$EventHandler */
    /* loaded from: classes16.dex */
    public class EventHandler extends android.os.Handler {
        public EventHandler(android.os.Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            if (com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.this.f53820xbe0c5915 == null) {
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.TAG, "handleMessage failed, mPlayListener is null and return");
                return;
            }
            int i17 = message.what;
            if (i17 == com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.f53792xcf34d2fc) {
                com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.this.m103040xec629d6f(message.arg1);
                return;
            }
            if (i17 == com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.f53794x2657349c) {
                com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.this.m103042x4f518f02(message.arg1);
                return;
            }
            switch (i17) {
                case com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.f53785xace26f0d /* 4097 */:
                    com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.this.f53820xbe0c5915.mo102286x3e7062fa();
                    return;
                case com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.f53784x3f58342e /* 4098 */:
                    com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.this.f53820xbe0c5915.mo102285x338612c1(message.arg1, message.arg2, (java.lang.String) message.obj);
                    return;
                case com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.f53783x1d17a5a5 /* 4099 */:
                    com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.this.f53820xbe0c5915.mo102284xe42c8a92((java.lang.String) message.obj);
                    return;
                case com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.f53781xdc823f0e /* 4100 */:
                    com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPCDNURLInfo tPCDNURLInfo = (com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPCDNURLInfo) message.obj;
                    com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.this.f53820xbe0c5915.mo102283x73241460(tPCDNURLInfo.url, tPCDNURLInfo.f50880x5a23234, tPCDNURLInfo.uIp, tPCDNURLInfo.f50881x5336d709);
                    return;
                case com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.f53790x90cf25fc /* 4101 */:
                    com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.this.f53820xbe0c5915.mo102289xe40fe482(message.arg1);
                    return;
                case com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.f53789x5da14b16 /* 4102 */:
                    com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPProtocolInfo tPProtocolInfo = (com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPProtocolInfo) message.obj;
                    com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.this.f53820xbe0c5915.mo102288xab39e0e8(tPProtocolInfo.f50899x9967143, tPProtocolInfo.f50900x687a0b20);
                    return;
                case com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.f53782x739590da /* 4103 */:
                    com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.this.f53820xbe0c5915.mo102282x61548e7c((java.util.Map) message.obj);
                    return;
                case com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.f53787x30ecda58 /* 4104 */:
                    com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.TPMessageParams tPMessageParams = (com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.TPMessageParams) message.obj;
                    com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.TPOnPlayCallBackParams tPOnPlayCallBackParams = (com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.TPOnPlayCallBackParams) tPMessageParams.f53840xc4aaf986;
                    tPMessageParams.f53841xc84dc81d.m104301x209a1f1f(com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.this.f53820xbe0c5915.mo102290x41392718(tPOnPlayCallBackParams.f53846xcbf5a7e1, tPOnPlayCallBackParams.f53842x2fba30, tPOnPlayCallBackParams.f53843x2fba31, tPOnPlayCallBackParams.f53844x2fba32, tPOnPlayCallBackParams.f53845x2fba33));
                    return;
                case com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.f53786x97080407 /* 4105 */:
                    com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.TPMessageParams tPMessageParams2 = (com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.TPMessageParams) message.obj;
                    tPMessageParams2.f53841xc84dc81d.m104301x209a1f1f(com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.this.f53820xbe0c5915.mo102279xebd0e778(((java.lang.Long) tPMessageParams2.f53840xc4aaf986).longValue()));
                    return;
                case com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.f53788xc916d5a3 /* 4106 */:
                    com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPDownLoadProgressInfo tPDownLoadProgressInfo = (com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPDownLoadProgressInfo) message.obj;
                    com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.this.f53820xbe0c5915.mo102287x32d250bd((int) tPDownLoadProgressInfo.f50885x990e2b68, tPDownLoadProgressInfo.f50883x51112b9, tPDownLoadProgressInfo.f50882x9e4c3cc2, tPDownLoadProgressInfo.f50886xd5bbe701, tPDownLoadProgressInfo.f50884xf0e1e4de);
                    return;
                case com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.f53791xdb74ba5c /* 4107 */:
                    com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.TPMessageParams tPMessageParams3 = (com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.TPMessageParams) message.obj;
                    tPMessageParams3.f53841xc84dc81d.m104301x209a1f1f(com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.this.f53820xbe0c5915.mo102280xebd0e778((java.lang.String) tPMessageParams3.f53840xc4aaf986));
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: com.tencent.thumbplayer.datatransport.TPPlayManagerImpl$TPDefTaskModel */
    /* loaded from: classes16.dex */
    public static class TPDefTaskModel {

        /* renamed from: definitionID */
        long f53836x61135ae;

        /* renamed from: proxyTaskID */
        int f53837x7db19d6e;

        public TPDefTaskModel(long j17, int i17) {
            this.f53836x61135ae = j17;
            this.f53837x7db19d6e = i17;
        }
    }

    /* renamed from: com.tencent.thumbplayer.datatransport.TPPlayManagerImpl$TPDownloadSeqAndClipIndexMapping */
    /* loaded from: classes16.dex */
    public static class TPDownloadSeqAndClipIndexMapping {

        /* renamed from: clipIndex */
        int f53838x9f3b2762;

        /* renamed from: downloadSeq */
        int f53839xb7cf4eb7;

        public TPDownloadSeqAndClipIndexMapping(int i17, int i18) {
            this.f53839xb7cf4eb7 = i17;
            this.f53838x9f3b2762 = i18;
        }
    }

    /* renamed from: com.tencent.thumbplayer.datatransport.TPPlayManagerImpl$TPMessageParams */
    /* loaded from: classes16.dex */
    public static class TPMessageParams {

        /* renamed from: params */
        java.lang.Object f53840xc4aaf986;

        /* renamed from: result */
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26569xf42d285c f53841xc84dc81d;

        private TPMessageParams() {
        }
    }

    /* renamed from: com.tencent.thumbplayer.datatransport.TPPlayManagerImpl$TPOnPlayCallBackParams */
    /* loaded from: classes16.dex */
    public static class TPOnPlayCallBackParams {

        /* renamed from: ext1 */
        java.lang.Object f53842x2fba30;

        /* renamed from: ext2 */
        java.lang.Object f53843x2fba31;

        /* renamed from: ext3 */
        java.lang.Object f53844x2fba32;

        /* renamed from: ext4 */
        java.lang.Object f53845x2fba33;

        /* renamed from: messageType */
        int f53846xcbf5a7e1;

        private TPOnPlayCallBackParams() {
        }
    }

    public C26458xbbcd017d(android.content.Context context, android.os.Looper looper) {
        this.f53801xd6cfe882 = context;
        this.f53809xc7640a1d = new com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.EventHandler(looper);
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26570x7018c6b1.m104303xdab2e64d(this);
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26574xd4e33498.m104331x9cf0d20b().m104347x9e2a13d3(this);
        this.f53811xad385dd9 = new com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.InnerProxyListener();
        this.f53820xbe0c5915 = new com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26459x79358ddb(TAG);
        this.f53825xf879370e = new java.util.HashMap<>();
        this.f53802xacd42ea1 = new java.util.ArrayList<>();
        this.f53810x40bece8 = new com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26579x7b4fc798();
    }

    /* renamed from: addAudioTrack */
    private boolean m103033x5cef1a96(java.lang.String str, java.lang.String str2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(str);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52756x35eee33c, 1);
        return this.f53803x5c202f59.mo102244xad41f2a0(this.f53819x14aabe1c, 2, str2, new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26369x41f783c9(arrayList, 3, hashMap));
    }

    /* renamed from: buildTPProxyConfig */
    private java.util.Map<java.lang.String, java.lang.Object> m103034x34e04386() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52746x85511d89, java.lang.Integer.valueOf((this.f53805x8d9395ba || this.f53807x6f80c59f) ? 1 : 0));
        hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52773x53d84b0e, java.lang.Integer.valueOf(this.f53806xe1a8f7d5 ? 1 : 0));
        return hashMap;
    }

    /* renamed from: convertDownloadParam */
    private com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26369x41f783c9 m103035xf0dca1f2(java.lang.String str, com.p314xaae8f345.p3006xb8ff1437.api.p3017x65fca6e.C26231xafaedb13 c26231xafaedb13, java.util.Map<java.lang.String, java.lang.String> map, java.util.Map<java.lang.String, java.lang.Object> map2) {
        return com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26464x151ba67f.m103086x9365589(str, c26231xafaedb13, map, map2);
    }

    /* renamed from: getAssetClips */
    private java.util.List<com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26222x6835d79c> m103036x6ba3fa09(com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26214xf9e9afd1 interfaceC26214xf9e9afd1) {
        com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26221xfaf4b62c interfaceC26221xfaf4b62c;
        if (interfaceC26214xf9e9afd1 instanceof com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa.C26270x2b7d01c2) {
            java.util.List<com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26221xfaf4b62c> mo101292x9ba80088 = ((com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa.C26270x2b7d01c2) interfaceC26214xf9e9afd1).mo101292x9ba80088();
            if (com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26565x9aa4e96a.m104274x7aab3243(mo101292x9ba80088) || (interfaceC26221xfaf4b62c = mo101292x9ba80088.get(0)) == null || com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26565x9aa4e96a.m104274x7aab3243(interfaceC26221xfaf4b62c.mo101313xe6d93963())) {
                return null;
            }
            return interfaceC26221xfaf4b62c.mo101313xe6d93963();
        }
        if (interfaceC26214xf9e9afd1 instanceof com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26221xfaf4b62c) {
            com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26221xfaf4b62c interfaceC26221xfaf4b62c2 = (com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26221xfaf4b62c) interfaceC26214xf9e9afd1;
            if (com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26565x9aa4e96a.m104274x7aab3243(interfaceC26221xfaf4b62c2.mo101313xe6d93963())) {
                return null;
            }
            return interfaceC26221xfaf4b62c2.mo101313xe6d93963();
        }
        if (!(interfaceC26214xf9e9afd1 instanceof com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26222x6835d79c)) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(1);
        arrayList.add((com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26222x6835d79c) interfaceC26214xf9e9afd1);
        return arrayList;
    }

    /* renamed from: getDownloadParamDataWithIndex */
    private com.p314xaae8f345.p3006xb8ff1437.api.p3017x65fca6e.C26231xafaedb13 m103037x6257e633(java.util.ArrayList<com.p314xaae8f345.p3006xb8ff1437.api.p3017x65fca6e.C26231xafaedb13> arrayList, int i17) {
        if (com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26565x9aa4e96a.m104274x7aab3243(arrayList) || i17 >= arrayList.size()) {
            return null;
        }
        return arrayList.get(i17);
    }

    /* renamed from: getFileId */
    private java.lang.String m103038x191fb2ad() {
        return this.f53808x374b664;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getFutureResult */
    public java.lang.Object m103039xa59c3636(com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26569xf42d285c c26569xf42d285c) {
        try {
            return c26569xf42d285c.m104299x2d64eb13(500L);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "onPlayCallback getResult has exception:" + th6.toString());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleGlobalEvent */
    public void m103040xec629d6f(int i17) {
        switch (i17) {
            case 100001:
                m103066x6fb8807f(13);
                return;
            case 100002:
                m103066x6fb8807f(14);
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleIsActive */
    public void m103041xfe9c9b18() {
        try {
            this.f53803x5c202f59.mo102247xeb2f5b7b(this.f53819x14aabe1c, this.f53812xf85a185d ? 101 : 100);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, th6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleNetworkStatusEvent */
    public void m103042x4f518f02(int i17) {
        if (i17 == 1) {
            m103066x6fb8807f(1);
            m103066x6fb8807f(10);
        } else if (i17 == 2) {
            m103066x6fb8807f(2);
            m103066x6fb8807f(9);
        } else {
            if (i17 != 3) {
                return;
            }
            m103066x6fb8807f(2);
            m103066x6fb8807f(10);
        }
    }

    /* renamed from: initProxy */
    private boolean m103043xefd01f3e() {
        if (this.f53822x371c78e2 == -1) {
            this.f53822x371c78e2 = com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3053xaf3f8342.C26465x6f5da734.m103089xe23ad884();
        }
        com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.InterfaceC26455xfa6e82b m103074xfa372ad7 = com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26462x5cffbe58.m103071x9cf0d20b().m103074xfa372ad7(this.f53822x371c78e2);
        if (m103074xfa372ad7 == null || m103074xfa372ad7.mo103015xbe71e310() == null) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "initProxy failed, serviceType:" + this.f53822x371c78e2 + ", playProxyManager:" + m103074xfa372ad7);
            return false;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26361x94977a41 mo103015xbe71e310 = m103074xfa372ad7.mo103015xbe71e310();
        this.f53803x5c202f59 = mo103015xbe71e310;
        mo103015xbe71e310.mo102248x66a91097(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52912x3112e5c, java.lang.Boolean.valueOf(com.p314xaae8f345.p3006xb8ff1437.p3026xaf3f8342.C26278x84e5221f.m101648x5943477e()));
        if (!android.text.TextUtils.isEmpty(com.p314xaae8f345.p3006xb8ff1437.p3026xaf3f8342.C26278x84e5221f.m101641x35080459())) {
            this.f53803x5c202f59.mo102248x66a91097(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52926x1ed77dc6, com.p314xaae8f345.p3006xb8ff1437.p3026xaf3f8342.C26278x84e5221f.m101641x35080459());
        }
        if (!android.text.TextUtils.isEmpty(com.p314xaae8f345.p3006xb8ff1437.p3026xaf3f8342.C26278x84e5221f.m101632xc725eb98(this.f53801xd6cfe882))) {
            this.f53803x5c202f59.mo102248x66a91097(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52905x6ff5a606, com.p314xaae8f345.p3006xb8ff1437.p3026xaf3f8342.C26278x84e5221f.m101632xc725eb98(this.f53801xd6cfe882));
        }
        if (com.p314xaae8f345.p3006xb8ff1437.p3026xaf3f8342.C26278x84e5221f.m101633x57b0ca21(this.f53801xd6cfe882) != -1) {
            this.f53803x5c202f59.mo102248x66a91097(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52906x95398c86, java.lang.String.valueOf(com.p314xaae8f345.p3006xb8ff1437.p3026xaf3f8342.C26278x84e5221f.m101633x57b0ca21(this.f53801xd6cfe882)));
        }
        this.f53803x5c202f59.mo102248x66a91097(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52927x1ed77e94, com.p314xaae8f345.p3006xb8ff1437.p3026xaf3f8342.C26278x84e5221f.m101642x35080527());
        this.f53803x5c202f59.mo102248x66a91097(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52928xeeb06f06, java.lang.Integer.valueOf(com.p314xaae8f345.p3006xb8ff1437.p3026xaf3f8342.C26278x84e5221f.m101643x7f87efaa()));
        this.f53803x5c202f59.mo102248x66a91097(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52910xf2f60778, com.p314xaae8f345.p3006xb8ff1437.p3026xaf3f8342.C26278x84e5221f.m101637x7e22be6c());
        this.f53803x5c202f59.mo102248x66a91097(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52897xedf5d311, com.p314xaae8f345.p3006xb8ff1437.p3026xaf3f8342.C26278x84e5221f.m101630xafdf073d());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: internalMessage */
    public void m103045xe737328a(int i17, java.lang.Object obj) {
        m103044xe737328a(i17, 0, 0, obj, false, false, 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isInitDownloadProxyFailed */
    public boolean m103046xcc4e3ee9() {
        if (!com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3053xaf3f8342.C26465x6f5da734.m103093x10bc6e07()) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "config set don't use p2p proxy!");
            return true;
        }
        try {
            this.f53804xfde721a9.readLock().lock();
            if (this.f53815xd5f6a216 != 1) {
                if (this.f53815xd5f6a216 != 3) {
                    try {
                        this.f53804xfde721a9.writeLock().lock();
                        if (this.f53815xd5f6a216 == 0) {
                            this.f53815xd5f6a216 = m103043xefd01f3e() ? 2 : 1;
                        }
                        return this.f53815xd5f6a216 == 1;
                    } finally {
                        this.f53804xfde721a9.writeLock().unlock();
                    }
                }
            }
            return true;
        } finally {
            this.f53804xfde721a9.readLock().unlock();
        }
    }

    /* renamed from: messageToCommand */
    private java.lang.String m103047x9a6c7009(int i17) {
        switch (i17) {
            case f53785xace26f0d /* 4097 */:
                return "onDownloadFinish";
            case f53784x3f58342e /* 4098 */:
                return "onDownloadError";
            case f53783x1d17a5a5 /* 4099 */:
                return "onDownloadCdnUrlUpdate";
            case f53781xdc823f0e /* 4100 */:
                return "onDownloadCdnUrlInfoUpdate";
            case f53790x90cf25fc /* 4101 */:
                return "onDownloadStatusUpdate";
            case f53789x5da14b16 /* 4102 */:
                return "onDownloadProtocolUpdate";
            case f53782x739590da /* 4103 */:
                return "onDownloadCdnUrlExpired";
            case f53787x30ecda58 /* 4104 */:
                return "onPlayCallback";
            case f53786x97080407 /* 4105 */:
            case f53791xdb74ba5c /* 4107 */:
                return "getPlayInfo";
            case f53788xc916d5a3 /* 4106 */:
                return "onDownloadProgressUpdate";
            default:
                return com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a;
        }
    }

    /* renamed from: releaseHandler */
    private void m103049x5e8e0143() {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "inner event : release handler");
        this.f53810x40bece8.writeLock().lock();
        com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.EventHandler eventHandler = this.f53809xc7640a1d;
        if (eventHandler != null) {
            eventHandler.removeCallbacksAndMessages(null);
            this.f53809xc7640a1d = null;
        }
        this.f53810x40bece8.writeLock().unlock();
    }

    /* renamed from: reset */
    private void m103050x6761d4f() {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "reset");
        this.f53808x374b664 = "";
        this.f53817x6ed5ce7c = "";
        this.f53826xca2581dc = null;
        this.f53824x3be94da8 = 0L;
        this.f53823x818d03e2 = 0L;
        this.f53813x993f6bb3 = false;
        this.f53812xf85a185d = true;
        this.f53807x6f80c59f = false;
        this.f53805x8d9395ba = false;
        this.f53806xe1a8f7d5 = false;
        if (!com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26565x9aa4e96a.m104274x7aab3243(this.f53802xacd42ea1)) {
            this.f53802xacd42ea1.clear();
        }
        this.f53804xfde721a9.writeLock().lock();
        this.f53815xd5f6a216 = 0;
        this.f53822x371c78e2 = -1;
        this.f53803x5c202f59 = null;
        this.f53804xfde721a9.writeLock().unlock();
        this.f53816xb602544f = 100000000L;
    }

    /* renamed from: setPlayUserData */
    private void m103052x5d8c7aeb() {
        this.f53803x5c202f59.mo102248x66a91097(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52789x86d2333b, java.lang.Long.valueOf(this.f53824x3be94da8));
        this.f53803x5c202f59.mo102248x66a91097(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52786x69a5c6a2, java.lang.Long.valueOf(this.f53823x818d03e2));
    }

    /* renamed from: startClipPlay */
    private int m103053x3e462126(java.util.List<com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26222x6835d79c> list, java.lang.String str, java.util.ArrayList<com.p314xaae8f345.p3006xb8ff1437.api.p3017x65fca6e.C26231xafaedb13> arrayList) {
        if (com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26565x9aa4e96a.m104274x7aab3243(list)) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.w(TAG, "clipList is empty, return");
            return -1;
        }
        int size = list.size();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        int i17 = 1;
        for (int i18 = 0; i18 < size; i18++) {
            com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26222x6835d79c interfaceC26222x6835d79c = list.get(i18);
            if ((interfaceC26222x6835d79c instanceof com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa.C26273x7d266399) && com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26565x9aa4e96a.m104277x5fd37e5(((com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa.C26273x7d266399) interfaceC26222x6835d79c).mo101324x5000ed37())) {
                linkedHashMap.put(interfaceC26222x6835d79c, new com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.TPDownloadSeqAndClipIndexMapping(i17, i18));
                i17++;
            }
        }
        if (com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26565x9aa4e96a.m104275x7aab3243(linkedHashMap)) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "all urls is local file url, return");
            return -1;
        }
        int mo102250x3e462126 = this.f53803x5c202f59.mo102250x3e462126(str, linkedHashMap.size(), this.f53811xad385dd9);
        if (mo102250x3e462126 > 0) {
            for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
                com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26222x6835d79c interfaceC26222x6835d79c2 = (com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26222x6835d79c) entry.getKey();
                com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.TPDownloadSeqAndClipIndexMapping tPDownloadSeqAndClipIndexMapping = (com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.TPDownloadSeqAndClipIndexMapping) entry.getValue();
                if (interfaceC26222x6835d79c2 instanceof com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa.C26273x7d266399) {
                    com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa.C26273x7d266399 c26273x7d266399 = (com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa.C26273x7d266399) interfaceC26222x6835d79c2;
                    com.p314xaae8f345.p3006xb8ff1437.api.p3017x65fca6e.C26231xafaedb13 m103037x6257e633 = m103037x6257e633(arrayList, tPDownloadSeqAndClipIndexMapping.f53838x9f3b2762);
                    if (m103037x6257e633 == null) {
                        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "fatal err, paramData is null.");
                        return -1;
                    }
                    com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "multi trackClipIndex:" + tPDownloadSeqAndClipIndexMapping.f53838x9f3b2762 + ", download seq:" + tPDownloadSeqAndClipIndexMapping.f53839xb7cf4eb7 + ", clip.url:" + c26273x7d266399.mo101278xb5887639() + ", clip.getFilePath:" + c26273x7d266399.mo101324x5000ed37() + ", paramData.savePath:" + m103037x6257e633.m101404x4ed0b8() + ", paramData.DownloadFileID:" + m103037x6257e633.m101382xfe398b35());
                    if (this.f53803x5c202f59.mo102244xad41f2a0(mo102250x3e462126, tPDownloadSeqAndClipIndexMapping.f53839xb7cf4eb7, m103037x6257e633.m101382xfe398b35(), m103035xf0dca1f2(c26273x7d266399.mo101324x5000ed37(), m103037x6257e633, c26273x7d266399.mo101276x1275092b(), m103034x34e04386()))) {
                        c26273x7d266399.m101611x4ab94e43(this.f53803x5c202f59.mo102234x5a566f5(mo102250x3e462126, tPDownloadSeqAndClipIndexMapping.f53839xb7cf4eb7, 1));
                    }
                }
            }
        } else {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "p2p proxy start clip play failed, cause : playId < 0");
        }
        return mo102250x3e462126;
    }

    /* renamed from: startDownloadPlayByClipAsset */
    private com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26214xf9e9afd1 m103054x5122d6ab(com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26214xf9e9afd1 interfaceC26214xf9e9afd1) {
        java.util.List<com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26222x6835d79c> m103036x6ba3fa09 = m103036x6ba3fa09(interfaceC26214xf9e9afd1);
        if (!com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26565x9aa4e96a.m104274x7aab3243(m103036x6ba3fa09)) {
            this.f53819x14aabe1c = m103053x3e462126(m103036x6ba3fa09, m103038x191fb2ad(), this.f53802xacd42ea1);
            m103041xfe9c9b18();
            m103062xd49dea18();
        }
        return interfaceC26214xf9e9afd1;
    }

    /* renamed from: startDownloadPlayByDRMAsset */
    private com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26214xf9e9afd1 m103055xd8d5e606(com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa.C26275x71ee6379 c26275x71ee6379) {
        c26275x71ee6379.mo101305x103bdcfe(mo103007x7291d95e(c26275x71ee6379.mo101301xe2178ef2(), c26275x71ee6379.mo101276x1275092b()).m100557x18ed3d2c());
        return c26275x71ee6379;
    }

    /* renamed from: startDownloadPlayByUrlAsset */
    private com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26214xf9e9afd1 m103056x90778436(com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa.C26277x299001a9 c26277x299001a9) {
        c26277x299001a9.mo101332x48f0ff8d(mo103007x7291d95e(c26277x299001a9.mo101331xec9d3f19(), c26277x299001a9.mo101276x1275092b()).m100557x18ed3d2c());
        return c26277x299001a9;
    }

    /* renamed from: startSwitchDefTaskByClipAsset */
    private com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26214xf9e9afd1 m103058x99752635(com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26214xf9e9afd1 interfaceC26214xf9e9afd1, long j17, com.p314xaae8f345.p3006xb8ff1437.api.C26204xf8de58ad c26204xf8de58ad) {
        java.util.List<com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26222x6835d79c> m103036x6ba3fa09 = m103036x6ba3fa09(interfaceC26214xf9e9afd1);
        if (!com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26565x9aa4e96a.m104274x7aab3243(m103036x6ba3fa09) && c26204xf8de58ad != null) {
            int m103053x3e462126 = m103053x3e462126(m103036x6ba3fa09, c26204xf8de58ad.m101213x4011826f(), c26204xf8de58ad.m101211x90b86fb());
            if (m103053x3e462126 > 0) {
                this.f53818xb7d33191.offer(new com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.TPDefTaskModel(j17, m103053x3e462126));
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "p2p proxy switch def sucess, defId:" + j17 + ",playId:" + m103053x3e462126);
                return interfaceC26214xf9e9afd1;
            }
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "p2p proxy switch clip def failed, cause : playId < 0");
        }
        return interfaceC26214xf9e9afd1;
    }

    /* renamed from: startSwitchDefTaskByDRMAsset */
    private com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26214xf9e9afd1 m103059x88967d3c(com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26219xc486a810 interfaceC26219xc486a810, long j17, com.p314xaae8f345.p3006xb8ff1437.api.C26204xf8de58ad c26204xf8de58ad) {
        interfaceC26219xc486a810.mo101305x103bdcfe(m103057xa355dc14(j17, interfaceC26219xc486a810.mo101301xe2178ef2(), (c26204xf8de58ad.m101211x90b86fb() == null || c26204xf8de58ad.m101211x90b86fb().size() <= 0) ? null : c26204xf8de58ad.m101211x90b86fb().get(0), interfaceC26219xc486a810.mo101276x1275092b()).m100557x18ed3d2c());
        return interfaceC26219xc486a810;
    }

    /* renamed from: startSwitchDefTaskByUrlAsset */
    private com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26214xf9e9afd1 m103060x40381b6c(com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa.C26277x299001a9 c26277x299001a9, long j17, com.p314xaae8f345.p3006xb8ff1437.api.C26204xf8de58ad c26204xf8de58ad) {
        c26277x299001a9.mo101332x48f0ff8d(mo103010xa355dc14(j17, c26277x299001a9.mo101331xec9d3f19(), c26204xf8de58ad, c26277x299001a9.mo101276x1275092b()).m100557x18ed3d2c());
        return c26277x299001a9;
    }

    /* renamed from: updateProxyTaskInfo */
    private void m103062xd49dea18() {
        int i17 = this.f53819x14aabe1c;
        if (i17 > 0) {
            this.f53803x5c202f59.mo102260x1b6687bc(i17, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52901x6990f3b1, java.lang.Integer.valueOf((this.f53807x6f80c59f || this.f53805x8d9395ba) ? 1 : 0));
            this.f53803x5c202f59.mo102260x1b6687bc(this.f53819x14aabe1c, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52902xfa18fcc6, java.lang.Long.valueOf(this.f53816xb602544f));
            this.f53803x5c202f59.mo102260x1b6687bc(this.f53819x14aabe1c, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52773x53d84b0e, java.lang.Integer.valueOf(this.f53806xe1a8f7d5 ? 1 : 0));
        }
    }

    /* renamed from: updateVideoInfo */
    private void m103063x9748f100(com.p314xaae8f345.p3006xb8ff1437.api.C26204xf8de58ad c26204xf8de58ad) {
        if (m103046xcc4e3ee9()) {
            return;
        }
        this.f53826xca2581dc = c26204xf8de58ad;
        if (c26204xf8de58ad == null || c26204xf8de58ad.m101211x90b86fb() == null) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.w(TAG, "video or downloadParamList is null, return");
            return;
        }
        if (this.f53819x14aabe1c <= 0) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.w(TAG, "p2p proxy not start, return");
            return;
        }
        java.util.ArrayList<com.p314xaae8f345.p3006xb8ff1437.api.p3017x65fca6e.C26231xafaedb13> m101211x90b86fb = c26204xf8de58ad.m101211x90b86fb();
        for (int i17 = 0; i17 < m101211x90b86fb.size(); i17++) {
            com.p314xaae8f345.p3006xb8ff1437.api.p3017x65fca6e.C26231xafaedb13 c26231xafaedb13 = m101211x90b86fb.get(i17);
            if (!this.f53803x5c202f59.mo102244xad41f2a0(this.f53819x14aabe1c, c26231xafaedb13.m101376x142a3c27(), c26231xafaedb13.m101382xfe398b35(), m103035xf0dca1f2(c26231xafaedb13.m101411xb5887639(), c26231xafaedb13, null, m103034x34e04386()))) {
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.w(TAG, "setClipInfo failed, playID:" + this.f53819x14aabe1c + ", clipNo:" + c26231xafaedb13.m101376x142a3c27() + ", downloadFileID:" + c26231xafaedb13.m101382xfe398b35());
            }
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.InterfaceC26454x8591d014
    /* renamed from: getPlayErrorCodeStr */
    public java.lang.String mo102990xe1ed3aa6() {
        if (m103046xcc4e3ee9()) {
            return null;
        }
        try {
            return this.f53803x5c202f59.mo102236xe1ed3aa6(this.f53819x14aabe1c);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, th6);
            return null;
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.InterfaceC26454x8591d014
    /* renamed from: getTPPlayerProxyListener */
    public com.p314xaae8f345.p3006xb8ff1437.api.p3017x65fca6e.InterfaceC26229xba673b1c mo102991xfd0f862f() {
        return this.f53821x7969be34;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.InterfaceC26454x8591d014
    /* renamed from: hasWaitDefTask */
    public boolean mo102992x61795cfb() {
        if (m103046xcc4e3ee9()) {
            return false;
        }
        return !this.f53818xb7d33191.isEmpty();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.InterfaceC26454x8591d014
    /* renamed from: isEnable */
    public boolean mo102993xdac2174d() {
        return !m103046xcc4e3ee9();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.InterfaceC26454x8591d014
    /* renamed from: isUseResourceLoader */
    public boolean mo102994xee89e31e() {
        return this.f53814xd925f171;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26570x7018c6b1.OnGlobalEventChangeListener
    /* renamed from: onEvent */
    public void mo103064xaf8c47fb(int i17, int i18, int i19, java.lang.Object obj) {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "onEvent eventId: " + i17 + ", arg1: " + i18 + ", arg2: " + i19 + ", object" + obj);
        m103044xe737328a(f53792xcf34d2fc, i17, 0, null, false, false, 0L);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26574xd4e33498.OnNetStatusChangeListener
    /* renamed from: onStatusChanged */
    public void mo103065xed0a9ac3(int i17, int i18, int i19, int i27) {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.d(TAG, "onNetworkStatusChanged oldNetStatus: " + i17 + ", netStatus: " + i18);
        m103044xe737328a(f53794x2657349c, i18, 0, null, false, false, 0L);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.InterfaceC26454x8591d014
    /* renamed from: pauseDownload */
    public void mo102995xe51afc9e() {
        if (m103046xcc4e3ee9()) {
            return;
        }
        m103048xe51afc9e(this.f53819x14aabe1c);
        if (!com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26565x9aa4e96a.m104274x7aab3243(this.f53818xb7d33191)) {
            for (com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.TPDefTaskModel tPDefTaskModel : this.f53818xb7d33191) {
                if (tPDefTaskModel != null) {
                    m103048xe51afc9e(tPDefTaskModel.f53837x7db19d6e);
                }
            }
        }
        if (com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26565x9aa4e96a.m104275x7aab3243(this.f53825xf879370e)) {
            return;
        }
        java.util.Iterator<java.lang.Integer> it = this.f53825xf879370e.values().iterator();
        while (it.hasNext()) {
            m103048xe51afc9e(it.next().intValue());
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.InterfaceC26454x8591d014
    /* renamed from: playerSwitchDefComplete */
    public void mo102996x98130fa9(long j17) {
        if (m103046xcc4e3ee9()) {
            return;
        }
        try {
            if (com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26565x9aa4e96a.m104274x7aab3243(this.f53818xb7d33191)) {
                return;
            }
            com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.TPDefTaskModel peek = this.f53818xb7d33191.peek();
            while (peek != null && peek.f53836x61135ae != j17) {
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "stop proxy definitionID:" + peek.f53836x61135ae + ", taskID:" + peek.f53837x7db19d6e);
                m103061xf2c12aa(peek.f53837x7db19d6e);
                this.f53818xb7d33191.removeFirst();
                peek = this.f53818xb7d33191.peek();
            }
            if (peek != null) {
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "stop proxy task id:" + peek.f53837x7db19d6e);
                m103061xf2c12aa(this.f53819x14aabe1c);
                this.f53819x14aabe1c = peek.f53837x7db19d6e;
                m103041xfe9c9b18();
                m103062xd49dea18();
                this.f53818xb7d33191.remove(peek);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, e17, "playerSwitchDefComplete exception");
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3017x65fca6e.InterfaceC26228x968ada48
    /* renamed from: pushEvent */
    public void mo101358xd0c233a0(final int i17) {
        this.f53810x40bece8.readLock().lock();
        com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.EventHandler eventHandler = this.f53809xc7640a1d;
        if (eventHandler != null) {
            eventHandler.post(new java.lang.Runnable() { // from class: com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.2
                @Override // java.lang.Runnable
                public void run() {
                    if (com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.this.m103046xcc4e3ee9()) {
                        return;
                    }
                    try {
                        com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.this.m103066x6fb8807f(com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26461x15782fe.m103070x90476eb9(i17));
                    } catch (java.lang.IllegalArgumentException e17) {
                        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.TAG, e17);
                    }
                }
            });
            this.f53810x40bece8.readLock().unlock();
        } else {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "pushEvent event=" + i17 + " already release");
        }
    }

    /* renamed from: pushEventByInner */
    public void m103066x6fb8807f(int i17) {
        if (m103046xcc4e3ee9()) {
            return;
        }
        try {
            this.f53803x5c202f59.mo102241xd0c233a0(i17);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, th6, "p2p proxy pushEvent failed, event:" + i17);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.InterfaceC26454x8591d014
    /* renamed from: release */
    public void mo102997x41012807() {
        mo103013xf2c12aa();
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26574xd4e33498.m104331x9cf0d20b().m104353xfdf22950(this);
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26570x7018c6b1.m104305xdfb98f4a(this);
        m103049x5e8e0143();
        this.f53821x7969be34 = null;
        this.f53820xbe0c5915 = new com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26459x79358ddb(TAG);
        this.f53811xad385dd9 = null;
        this.f53804xfde721a9.writeLock().lock();
        this.f53815xd5f6a216 = 3;
        this.f53822x371c78e2 = -1;
        this.f53803x5c202f59 = null;
        this.f53804xfde721a9.writeLock().unlock();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.InterfaceC26454x8591d014
    /* renamed from: resumeDownload */
    public void mo102998xb0277d5() {
        if (m103046xcc4e3ee9()) {
            return;
        }
        m103051xb0277d5(this.f53819x14aabe1c);
        if (!com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26565x9aa4e96a.m104274x7aab3243(this.f53818xb7d33191)) {
            for (com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.TPDefTaskModel tPDefTaskModel : this.f53818xb7d33191) {
                if (tPDefTaskModel != null) {
                    m103051xb0277d5(tPDefTaskModel.f53837x7db19d6e);
                }
            }
        }
        if (com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26565x9aa4e96a.m104275x7aab3243(this.f53825xf879370e)) {
            return;
        }
        java.util.Iterator<java.lang.Integer> it = this.f53825xf879370e.values().iterator();
        while (it.hasNext()) {
            m103051xb0277d5(it.next().intValue());
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3017x65fca6e.InterfaceC26228x968ada48
    /* renamed from: setIsActive */
    public void mo101359x49ef0f52(boolean z17) {
        this.f53810x40bece8.readLock().lock();
        if (this.f53809xc7640a1d == null) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "setIsActive isActive=" + z17);
        } else {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.d(TAG, "setIsActive: " + z17);
            this.f53812xf85a185d = z17;
            this.f53809xc7640a1d.post(new java.lang.Runnable() { // from class: com.tencent.thumbplayer.datatransport.TPPlayManagerImpl.1
                @Override // java.lang.Runnable
                public void run() {
                    if (com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.this.m103046xcc4e3ee9()) {
                        return;
                    }
                    com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.this.m103041xfe9c9b18();
                }
            });
            this.f53810x40bece8.readLock().unlock();
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.InterfaceC26454x8591d014
    /* renamed from: setIsUseResourceLoader */
    public void mo102999x94fe7f5c(boolean z17) {
        this.f53814xd925f171 = z17;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.InterfaceC26454x8591d014
    /* renamed from: setLogListener */
    public void mo103000x282f0256(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7 interfaceC26358x35916b7) {
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.InterfaceC26454x8591d014
    /* renamed from: setPlayListener */
    public void mo103001xbdb2cd8a(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d interfaceC26364x758c112d) {
        if (interfaceC26364x758c112d == null) {
            this.f53820xbe0c5915 = new com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26459x79358ddb(TAG);
        } else {
            this.f53820xbe0c5915 = interfaceC26364x758c112d;
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.InterfaceC26454x8591d014
    /* renamed from: setPlaySpeedRatio */
    public void mo103002xd079f5a(float f17) {
        if (m103046xcc4e3ee9()) {
            return;
        }
        if (f17 <= 0.0f) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "set play speed ratio, value invalid:" + f17);
        } else {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "set play speed value to proxy:" + f17);
            this.f53803x5c202f59.mo102260x1b6687bc(this.f53819x14aabe1c, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52904xc9037347, java.lang.Float.valueOf(f17));
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.InterfaceC26454x8591d014
    /* renamed from: setPlayerOptionalParam */
    public void mo103003x1ba09fea(com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1 c26182x67c007f1) {
        if (m103046xcc4e3ee9() || c26182x67c007f1 == null) {
            return;
        }
        if (c26182x67c007f1.m101069xb5884f29() == 100) {
            this.f53824x3be94da8 = c26182x67c007f1.m101073x73e0b5f3().f50734x6ac9171;
            return;
        }
        if (c26182x67c007f1.m101069xb5884f29() == 500) {
            long j17 = c26182x67c007f1.m101073x73e0b5f3().f50734x6ac9171;
            this.f53823x818d03e2 = j17;
            if (this.f53819x14aabe1c > 0) {
                this.f53803x5c202f59.mo102248x66a91097(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52786x69a5c6a2, java.lang.Long.valueOf(j17));
                return;
            }
            return;
        }
        if (c26182x67c007f1.m101069xb5884f29() == 503) {
            this.f53816xb602544f = c26182x67c007f1.m101073x73e0b5f3().f50732xc4aaf944;
            m103062xd49dea18();
            return;
        }
        if (c26182x67c007f1.m101069xb5884f29() == 508) {
            this.f53807x6f80c59f = c26182x67c007f1.m101070xc1e93551().f50727x6ac9171;
            m103062xd49dea18();
        } else if (c26182x67c007f1.m101069xb5884f29() == 504) {
            this.f53805x8d9395ba = c26182x67c007f1.m101073x73e0b5f3().f50734x6ac9171 != 0;
            m103062xd49dea18();
        } else if (c26182x67c007f1.m101069xb5884f29() == 509) {
            this.f53806xe1a8f7d5 = c26182x67c007f1.m101070xc1e93551().f50727x6ac9171;
            m103062xd49dea18();
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.InterfaceC26454x8591d014
    /* renamed from: setProxyPlayState */
    public void mo103004x5cc08ff1(int i17) {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.d(TAG, "setProxyPlayState: " + i17);
        if (m103046xcc4e3ee9()) {
            return;
        }
        try {
            this.f53803x5c202f59.mo102247xeb2f5b7b(this.f53819x14aabe1c, i17);
            if ((i17 == 5 || i17 == 0) && !com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26565x9aa4e96a.m104274x7aab3243(this.f53818xb7d33191)) {
                for (com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.TPDefTaskModel tPDefTaskModel : this.f53818xb7d33191) {
                    if (tPDefTaskModel != null) {
                        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "setProxyPlayState definitionID:" + tPDefTaskModel.f53836x61135ae + ", taskID:" + tPDefTaskModel.f53837x7db19d6e + ", state:" + i17);
                        this.f53803x5c202f59.mo102247xeb2f5b7b(tPDefTaskModel.f53837x7db19d6e, i17);
                    }
                }
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, th6);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3017x65fca6e.InterfaceC26228x968ada48
    /* renamed from: setProxyServiceType */
    public void mo101360x4f6110c3(int i17) {
        this.f53822x371c78e2 = i17;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.p3017x65fca6e.InterfaceC26228x968ada48
    /* renamed from: setTPPlayerProxyListener */
    public void mo101361xcd2238a3(com.p314xaae8f345.p3006xb8ff1437.api.p3017x65fca6e.InterfaceC26229xba673b1c interfaceC26229xba673b1c) {
        this.f53821x7969be34 = interfaceC26229xba673b1c;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.InterfaceC26454x8591d014
    /* renamed from: setVideoInfo */
    public void mo103005xab2f6987(com.p314xaae8f345.p3006xb8ff1437.api.C26204xf8de58ad c26204xf8de58ad) {
        if (c26204xf8de58ad == null) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "setVideoInfo, param is null ");
            return;
        }
        if (this.f53826xca2581dc != null) {
            m103063x9748f100(c26204xf8de58ad);
        }
        this.f53826xca2581dc = c26204xf8de58ad;
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "setVideoInfo, enter");
        this.f53808x374b664 = c26204xf8de58ad.m101213x4011826f();
        if (!com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26565x9aa4e96a.m104274x7aab3243(this.f53802xacd42ea1)) {
            this.f53802xacd42ea1.clear();
        }
        if (c26204xf8de58ad.m101211x90b86fb() == null || c26204xf8de58ad.m101211x90b86fb().size() <= 0) {
            return;
        }
        this.f53802xacd42ea1.addAll(c26204xf8de58ad.m101211x90b86fb());
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.InterfaceC26454x8591d014
    /* renamed from: startDownLoadTrackUrl */
    public java.lang.String mo103006x9edb516e(int i17, java.lang.String str, com.p314xaae8f345.p3006xb8ff1437.api.p3017x65fca6e.C26231xafaedb13 c26231xafaedb13) {
        java.lang.String m104273xb5885648;
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26369x41f783c9 c26369x41f783c9;
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.w(TAG, "return coz url is empty");
            return str;
        }
        if (!com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26565x9aa4e96a.m104277x5fd37e5(str)) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.w(TAG, "return coz url is locol url, not need use proxy");
            return str;
        }
        if (m103046xcc4e3ee9()) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.w(TAG, "return coz download proxy init failed");
            return str;
        }
        int i18 = 2;
        int i19 = 1;
        try {
            if (c26231xafaedb13 != null) {
                c26369x41f783c9 = com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26464x151ba67f.m103086x9365589(str, c26231xafaedb13, null, null);
                if (c26231xafaedb13.m101408x63682bd5() != 1) {
                    i18 = 1;
                }
                m104273xb5885648 = c26231xafaedb13.m101382xfe398b35();
                if (android.text.TextUtils.isEmpty(m104273xb5885648)) {
                    m104273xb5885648 = com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26565x9aa4e96a.m104273xb5885648(str);
                }
                i19 = i18;
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(str);
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26369x41f783c9 c26369x41f783c92 = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26369x41f783c9(arrayList, i17 == 2 ? 3 : 0, null);
                m104273xb5885648 = com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26565x9aa4e96a.m104273xb5885648(str);
                c26369x41f783c9 = c26369x41f783c92;
            }
            int mo102253x8113c2b6 = this.f53803x5c202f59.mo102253x8113c2b6(m104273xb5885648, c26369x41f783c9, this.f53811xad385dd9);
            if (mo102253x8113c2b6 <= 0) {
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "p2p proxy start play failed, cause : playId <= 0");
                return str;
            }
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "p2p proxy start play, url type" + i19);
            java.lang.String mo102237x2061c165 = this.f53803x5c202f59.mo102237x2061c165(mo102253x8113c2b6, i19);
            this.f53825xf879370e.put(mo102237x2061c165, java.lang.Integer.valueOf(mo102253x8113c2b6));
            return mo102237x2061c165;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "p2p proxy start play failed:" + th6);
            return str;
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.InterfaceC26454x8591d014
    /* renamed from: startDownloadPlay */
    public com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26142x43104e18 mo103007x7291d95e(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26142x43104e18 c26142x43104e18 = new com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26142x43104e18(str);
        if (!com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26565x9aa4e96a.m104277x5fd37e5(str) || m103046xcc4e3ee9()) {
            return c26142x43104e18;
        }
        m103052x5d8c7aeb();
        this.f53817x6ed5ce7c = str;
        com.p314xaae8f345.p3006xb8ff1437.api.p3017x65fca6e.C26231xafaedb13 m103037x6257e633 = m103037x6257e633(this.f53802xacd42ea1, 0);
        if (this.f53814xd925f171 && m103037x6257e633 != null && m103037x6257e633.m101381x15d5aed8() == 1) {
            m103037x6257e633 = new com.p314xaae8f345.p3006xb8ff1437.api.p3017x65fca6e.C26231xafaedb13(11);
        }
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26369x41f783c9 m103035xf0dca1f2 = m103037x6257e633 != null ? m103035xf0dca1f2(str, m103037x6257e633, map, m103034x34e04386()) : null;
        try {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("single url:");
            sb6.append(str);
            sb6.append(", paramData.savePath:");
            sb6.append(m103037x6257e633 != null ? m103037x6257e633.m101404x4ed0b8() : "null");
            sb6.append(", paramData.DownloadFileID:");
            sb6.append(m103037x6257e633 != null ? m103037x6257e633.m101382xfe398b35() : "null");
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, sb6.toString());
            int mo102253x8113c2b6 = this.f53803x5c202f59.mo102253x8113c2b6(m103038x191fb2ad(), m103035xf0dca1f2, this.f53811xad385dd9);
            if (mo102253x8113c2b6 > 0) {
                java.lang.String mo102237x2061c165 = this.f53803x5c202f59.mo102237x2061c165(mo102253x8113c2b6, 0);
                if (android.text.TextUtils.isEmpty(mo102237x2061c165)) {
                    mo102237x2061c165 = str;
                }
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "startDownloadPlay, playId:" + mo102253x8113c2b6);
                c26142x43104e18.m100559xabc3a3a0(mo102237x2061c165);
                java.lang.String mo102237x2061c1652 = this.f53803x5c202f59.mo102237x2061c165(mo102253x8113c2b6, 1);
                if (!android.text.TextUtils.isEmpty(mo102237x2061c1652)) {
                    str = mo102237x2061c1652;
                }
                c26142x43104e18.m100560xa554d89d(str);
                this.f53819x14aabe1c = mo102253x8113c2b6;
                m103041xfe9c9b18();
                m103062xd49dea18();
            } else {
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "p2p proxy start play failed, cause : playId <= 0");
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, th6, "p2p proxy start play failed");
        }
        return c26142x43104e18;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.InterfaceC26454x8591d014
    /* renamed from: startDownloadPlayByAsset */
    public com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26214xf9e9afd1 mo103008x31a6259b(com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26214xf9e9afd1 interfaceC26214xf9e9afd1) {
        if (m103046xcc4e3ee9()) {
            return interfaceC26214xf9e9afd1;
        }
        m103052x5d8c7aeb();
        return interfaceC26214xf9e9afd1 instanceof com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa.C26275x71ee6379 ? m103055xd8d5e606((com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa.C26275x71ee6379) interfaceC26214xf9e9afd1) : interfaceC26214xf9e9afd1 instanceof com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa.C26277x299001a9 ? m103056x90778436((com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa.C26277x299001a9) interfaceC26214xf9e9afd1) : m103054x5122d6ab(interfaceC26214xf9e9afd1);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.InterfaceC26454x8591d014
    /* renamed from: startRemuxer */
    public void mo103009x39135b68(java.lang.String str, java.lang.String str2) {
        if (!com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26565x9aa4e96a.m104277x5fd37e5(str) || android.text.TextUtils.isEmpty(str2)) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "startRemuxer, audioTrackUrl:" + str + ", keyId:" + str2);
            return;
        }
        if (m103046xcc4e3ee9()) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "startRemuxer, download proxy init failed.");
            return;
        }
        if (this.f53813x993f6bb3) {
            int i17 = this.f53819x14aabe1c;
            if (i17 > 0) {
                m103061xf2c12aa(i17);
            }
            this.f53819x14aabe1c = 0;
            mo103007x7291d95e(this.f53817x6ed5ce7c, null);
            if (!m103033x5cef1a96(str, str2)) {
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "startRemuxer, addAudioTrack err.");
                return;
            }
        } else if (!m103033x5cef1a96(str, str2)) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "startRemuxer, addAudioTrack err.");
            return;
        }
        this.f53813x993f6bb3 = true;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.InterfaceC26454x8591d014
    /* renamed from: startSwitchDefTask */
    public com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26142x43104e18 mo103010xa355dc14(long j17, java.lang.String str, com.p314xaae8f345.p3006xb8ff1437.api.C26204xf8de58ad c26204xf8de58ad, java.util.Map<java.lang.String, java.lang.String> map) {
        if (c26204xf8de58ad == null) {
            return new com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26142x43104e18(str);
        }
        return m103057xa355dc14(j17, str, (c26204xf8de58ad.m101211x90b86fb() == null || c26204xf8de58ad.m101211x90b86fb().size() <= 0) ? null : c26204xf8de58ad.m101211x90b86fb().get(0), map);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.InterfaceC26454x8591d014
    /* renamed from: startSwitchDefTaskByAsset */
    public com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26214xf9e9afd1 mo103011xf8d1ca25(com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26214xf9e9afd1 interfaceC26214xf9e9afd1, long j17, com.p314xaae8f345.p3006xb8ff1437.api.C26204xf8de58ad c26204xf8de58ad) {
        return (m103046xcc4e3ee9() || interfaceC26214xf9e9afd1 == null || c26204xf8de58ad == null) ? interfaceC26214xf9e9afd1 : interfaceC26214xf9e9afd1 instanceof com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26219xc486a810 ? m103059x88967d3c((com.p314xaae8f345.p3006xb8ff1437.api.p3015xcdff09aa.InterfaceC26219xc486a810) interfaceC26214xf9e9afd1, j17, c26204xf8de58ad) : interfaceC26214xf9e9afd1 instanceof com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa.C26277x299001a9 ? m103060x40381b6c((com.p314xaae8f345.p3006xb8ff1437.p3025xcdff09aa.C26277x299001a9) interfaceC26214xf9e9afd1, j17, c26204xf8de58ad) : m103058x99752635(interfaceC26214xf9e9afd1, j17, c26204xf8de58ad);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.InterfaceC26454x8591d014
    /* renamed from: stopDownLoadTrackUrl */
    public void mo103012xc1cb550e(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.w(TAG, "return coz url is empty");
            return;
        }
        if (m103046xcc4e3ee9()) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.w(TAG, "return coz download proxy init failed");
            return;
        }
        if (!this.f53825xf879370e.containsKey(str)) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.w(TAG, "return, coz mTrackProxyUrlPlayIdMap not contain current proxy url:" + str + ", or it is not proxy url");
            return;
        }
        try {
            this.f53803x5c202f59.mo102257x66343656(this.f53825xf879370e.get(str).intValue());
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "p2p proxy stop play failed:" + e17);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.InterfaceC26454x8591d014
    /* renamed from: stopDownload */
    public void mo103013xf2c12aa() {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "stopDownload, playId:" + this.f53819x14aabe1c);
        int i17 = this.f53819x14aabe1c;
        if (i17 > 0) {
            m103061xf2c12aa(i17);
        }
        this.f53819x14aabe1c = 0;
        if (!com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26565x9aa4e96a.m104274x7aab3243(this.f53818xb7d33191)) {
            for (com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.TPDefTaskModel tPDefTaskModel : this.f53818xb7d33191) {
                if (tPDefTaskModel != null) {
                    m103061xf2c12aa(tPDefTaskModel.f53837x7db19d6e);
                }
            }
            this.f53818xb7d33191.clear();
        }
        if (!com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26565x9aa4e96a.m104275x7aab3243(this.f53825xf879370e)) {
            java.util.Iterator<java.lang.Integer> it = this.f53825xf879370e.values().iterator();
            while (it.hasNext()) {
                m103061xf2c12aa(it.next().intValue());
            }
            this.f53825xf879370e.clear();
        }
        m103050x6761d4f();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.InterfaceC26454x8591d014
    /* renamed from: stopRemuxer */
    public void mo103014xf482c3c8() {
        if (m103046xcc4e3ee9()) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "stopRemuxer, download proxy init failed.");
            return;
        }
        if (this.f53813x993f6bb3) {
            int i17 = this.f53819x14aabe1c;
            if (i17 > 0) {
                m103061xf2c12aa(i17);
            }
            this.f53819x14aabe1c = 0;
            mo103007x7291d95e(this.f53817x6ed5ce7c, null);
        }
        this.f53813x993f6bb3 = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: internalMessage */
    public void m103044xe737328a(int i17, int i18, int i19, java.lang.Object obj, boolean z17, boolean z18, long j17) {
        this.f53810x40bece8.readLock().lock();
        com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.EventHandler eventHandler = this.f53809xc7640a1d;
        if (eventHandler == null) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, m103047x9a6c7009(i17) + " , send failed , handler null");
            this.f53810x40bece8.readLock().unlock();
            return;
        }
        if (z17 && obj == null) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, m103047x9a6c7009(i17) + ", send failed , params null");
            this.f53810x40bece8.readLock().unlock();
            return;
        }
        if (z18) {
            eventHandler.removeMessages(i17);
        }
        android.os.Message obtainMessage = this.f53809xc7640a1d.obtainMessage();
        obtainMessage.what = i17;
        obtainMessage.arg1 = i18;
        obtainMessage.arg2 = i19;
        obtainMessage.obj = obj;
        this.f53809xc7640a1d.sendMessageDelayed(obtainMessage, j17);
        this.f53810x40bece8.readLock().unlock();
    }

    /* renamed from: startSwitchDefTask */
    private com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26142x43104e18 m103057xa355dc14(long j17, java.lang.String str, com.p314xaae8f345.p3006xb8ff1437.api.p3017x65fca6e.C26231xafaedb13 c26231xafaedb13, java.util.Map<java.lang.String, java.lang.String> map) {
        com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26142x43104e18 c26142x43104e18 = new com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26142x43104e18(str);
        if (!com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26565x9aa4e96a.m104277x5fd37e5(str) || m103046xcc4e3ee9()) {
            return c26142x43104e18;
        }
        java.lang.String str2 = null;
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26369x41f783c9 m103035xf0dca1f2 = c26231xafaedb13 != null ? m103035xf0dca1f2(str, c26231xafaedb13, map, m103034x34e04386()) : null;
        if (c26231xafaedb13 != null) {
            try {
                str2 = c26231xafaedb13.m101382xfe398b35();
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, th6, "p2p proxy switch def failed");
            }
        }
        int mo102253x8113c2b6 = this.f53803x5c202f59.mo102253x8113c2b6(str2, m103035xf0dca1f2, this.f53811xad385dd9);
        if (mo102253x8113c2b6 > 0) {
            java.lang.String mo102237x2061c165 = this.f53803x5c202f59.mo102237x2061c165(mo102253x8113c2b6, 1);
            if (android.text.TextUtils.isEmpty(mo102237x2061c165)) {
                mo102237x2061c165 = str;
            }
            c26142x43104e18.m100559xabc3a3a0(mo102237x2061c165);
            java.lang.String mo102237x2061c1652 = this.f53803x5c202f59.mo102237x2061c165(mo102253x8113c2b6, 0);
            if (!android.text.TextUtils.isEmpty(mo102237x2061c1652)) {
                str = mo102237x2061c1652;
            }
            c26142x43104e18.m100560xa554d89d(str);
            this.f53818xb7d33191.offer(new com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.TPDefTaskModel(j17, mo102253x8113c2b6));
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "p2p proxy switch def sucess, defId:" + j17 + ",playId:" + mo102253x8113c2b6);
            return c26142x43104e18;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "p2p proxy switch def failed, cause : playId <= 0");
        return c26142x43104e18;
    }

    /* renamed from: com.tencent.thumbplayer.datatransport.TPPlayManagerImpl$InnerProxyListener */
    /* loaded from: classes16.dex */
    public class InnerProxyListener implements com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d {
        private InnerProxyListener() {
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
        /* renamed from: getAdvRemainTime */
        public long mo102271x7dd980b6() {
            return com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.this.f53820xbe0c5915.mo102271x7dd980b6();
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
        /* renamed from: getContentType */
        public java.lang.String mo102272xc2a49a1d(int i17, java.lang.String str, java.lang.String str2) {
            return com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.this.f53820xbe0c5915.mo102272xc2a49a1d(i17, str, str2);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
        /* renamed from: getCurrentPlayClipNo */
        public int mo102273xce1eb728() {
            return com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.this.f53820xbe0c5915.mo102273xce1eb728();
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
        /* renamed from: getCurrentPlayOffset */
        public long mo102274xe243028a() {
            return com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.this.f53820xbe0c5915.mo102274xe243028a();
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
        /* renamed from: getCurrentPosition */
        public long mo102275x9746038c() {
            return com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.this.f53820xbe0c5915.mo102275x9746038c();
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
        /* renamed from: getDataFilePath */
        public java.lang.String mo102276x84354c01(int i17, java.lang.String str, java.lang.String str2) {
            return com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.this.f53820xbe0c5915.mo102276x84354c01(i17, str, str2);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
        /* renamed from: getDataTotalSize */
        public long mo102277x2f5bd925(int i17, java.lang.String str, java.lang.String str2) {
            return com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.this.f53820xbe0c5915.mo102277x2f5bd925(i17, str, str2);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
        /* renamed from: getM3U8Content */
        public java.lang.String mo102278x79c2649a(int i17, java.lang.String str, java.lang.String str2) {
            return com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.this.f53820xbe0c5915.mo102278x79c2649a(i17, str, str2);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
        /* renamed from: getPlayInfo */
        public java.lang.Object mo102279xebd0e778(long j17) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26569xf42d285c c26569xf42d285c = new com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26569xf42d285c();
            com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.TPMessageParams tPMessageParams = new com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.TPMessageParams();
            tPMessageParams.f53840xc4aaf986 = java.lang.Long.valueOf(j17);
            tPMessageParams.f53841xc84dc81d = c26569xf42d285c;
            com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.this.m103045xe737328a(com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.f53786x97080407, tPMessageParams);
            return com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.this.m103039xa59c3636(c26569xf42d285c);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
        /* renamed from: getPlayerBufferLength */
        public long mo102281xe15692bd() {
            return com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.this.f53820xbe0c5915.mo102281xe15692bd();
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
        /* renamed from: onDownloadCdnUrlExpired */
        public void mo102282x61548e7c(java.util.Map<java.lang.String, java.lang.String> map) {
            com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.this.m103045xe737328a(com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.f53782x739590da, map);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
        /* renamed from: onDownloadCdnUrlInfoUpdate */
        public void mo102283x73241460(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
            com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPCDNURLInfo tPCDNURLInfo = new com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPCDNURLInfo();
            tPCDNURLInfo.url = str;
            tPCDNURLInfo.f50880x5a23234 = str2;
            tPCDNURLInfo.uIp = str3;
            tPCDNURLInfo.f50881x5336d709 = str4;
            com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.this.m103045xe737328a(com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.f53781xdc823f0e, tPCDNURLInfo);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
        /* renamed from: onDownloadCdnUrlUpdate */
        public void mo102284xe42c8a92(java.lang.String str) {
            com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.this.m103045xe737328a(com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.f53783x1d17a5a5, str);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
        /* renamed from: onDownloadError */
        public void mo102285x338612c1(int i17, int i18, java.lang.String str) {
            com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.this.m103044xe737328a(com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.f53784x3f58342e, i17, i18, str, false, false, 0L);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
        /* renamed from: onDownloadFinish */
        public void mo102286x3e7062fa() {
            com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.this.m103045xe737328a(com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.f53785xace26f0d, null);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
        /* renamed from: onDownloadProgressUpdate */
        public void mo102287x32d250bd(int i17, int i18, long j17, long j18, java.lang.String str) {
            com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPDownLoadProgressInfo tPDownLoadProgressInfo = new com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPDownLoadProgressInfo();
            tPDownLoadProgressInfo.f50885x990e2b68 = i17;
            tPDownLoadProgressInfo.f50883x51112b9 = i18;
            tPDownLoadProgressInfo.f50882x9e4c3cc2 = j17;
            tPDownLoadProgressInfo.f50886xd5bbe701 = j18;
            tPDownLoadProgressInfo.f50884xf0e1e4de = str;
            com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.this.m103045xe737328a(com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.f53788xc916d5a3, tPDownLoadProgressInfo);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
        /* renamed from: onDownloadProtocolUpdate */
        public void mo102288xab39e0e8(java.lang.String str, java.lang.String str2) {
            com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPProtocolInfo tPProtocolInfo = new com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPProtocolInfo();
            tPProtocolInfo.f50900x687a0b20 = str2;
            tPProtocolInfo.f50899x9967143 = str;
            com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.this.m103045xe737328a(com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.f53789x5da14b16, tPProtocolInfo);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
        /* renamed from: onDownloadStatusUpdate */
        public void mo102289xe40fe482(int i17) {
            com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.this.m103044xe737328a(com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.f53790x90cf25fc, i17, 0, null, false, false, 0L);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
        /* renamed from: onPlayCallback */
        public java.lang.Object mo102290x41392718(int i17, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
            com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.TPOnPlayCallBackParams tPOnPlayCallBackParams = new com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.TPOnPlayCallBackParams();
            tPOnPlayCallBackParams.f53846xcbf5a7e1 = i17;
            tPOnPlayCallBackParams.f53842x2fba30 = obj;
            tPOnPlayCallBackParams.f53843x2fba31 = obj2;
            tPOnPlayCallBackParams.f53844x2fba32 = obj3;
            tPOnPlayCallBackParams.f53845x2fba33 = obj4;
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26569xf42d285c c26569xf42d285c = new com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26569xf42d285c();
            com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.TPMessageParams tPMessageParams = new com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.TPMessageParams();
            tPMessageParams.f53840xc4aaf986 = tPOnPlayCallBackParams;
            tPMessageParams.f53841xc84dc81d = c26569xf42d285c;
            com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.this.m103045xe737328a(com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.f53787x30ecda58, tPMessageParams);
            return com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.this.m103039xa59c3636(c26569xf42d285c);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
        /* renamed from: onReadData */
        public int mo102291x715d255f(int i17, java.lang.String str, java.lang.String str2, long j17, long j18) {
            return com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.this.f53820xbe0c5915.mo102291x715d255f(i17, str, str2, j17, j18);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
        /* renamed from: onStartReadData */
        public int mo102292x6e58d43(int i17, java.lang.String str, java.lang.String str2, long j17, long j18) {
            return com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.this.f53820xbe0c5915.mo102292x6e58d43(i17, str, str2, j17, j18);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
        /* renamed from: onStopReadData */
        public int mo102293xfb96d801(int i17, java.lang.String str, java.lang.String str2, int i18) {
            return com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.this.f53820xbe0c5915.mo102293xfb96d801(i17, str, str2, i18);
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26364x758c112d
        /* renamed from: getPlayInfo */
        public java.lang.Object mo102280xebd0e778(java.lang.String str) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26569xf42d285c c26569xf42d285c = new com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26569xf42d285c();
            com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.TPMessageParams tPMessageParams = new com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.TPMessageParams();
            tPMessageParams.f53840xc4aaf986 = str;
            tPMessageParams.f53841xc84dc81d = c26569xf42d285c;
            com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.this.m103045xe737328a(com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.f53791xdb74ba5c, tPMessageParams);
            return com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.C26458xbbcd017d.this.m103039xa59c3636(c26569xf42d285c);
        }
    }

    /* renamed from: pauseDownload */
    private void m103048xe51afc9e(int i17) {
        try {
            this.f53803x5c202f59.mo102240xe51afc9e(i17);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, th6, "p2p proxy pause download failed, taskId:" + i17);
        }
    }

    /* renamed from: resumeDownload */
    private void m103051xb0277d5(int i17) {
        try {
            this.f53803x5c202f59.mo102243xb0277d5(this.f53819x14aabe1c);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, th6, "p2p proxy resume download failed, taskId:" + i17);
        }
    }

    /* renamed from: stopDownload */
    private void m103061xf2c12aa(int i17) {
        if (m103046xcc4e3ee9()) {
            return;
        }
        try {
            this.f53803x5c202f59.mo102257x66343656(i17);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, th6, "p2p proxy stop play failed, taskID:" + i17);
        }
    }
}
