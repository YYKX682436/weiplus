package com.tencent.mm.modelcdntran;

/* loaded from: classes12.dex */
public class l1 implements com.tencent.mars.cdn.CdnManager.AppCallback, com.tencent.mars.cdn.CdnManager.UploadCallback, com.tencent.mars.cdn.CdnManager.UploadCallbackV2, com.tencent.mars.cdn.CdnManager.SessionCallback, com.tencent.mars.cdn.CdnManager.DownloadCallback, com.tencent.mars.cdn.CdnManager.VideoStreamingCallback {

    /* renamed from: y, reason: collision with root package name */
    public static long f71041y;

    /* renamed from: z, reason: collision with root package name */
    public static long f71042z;

    /* renamed from: f, reason: collision with root package name */
    public dn.f f71045f;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f71049m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f71050n;

    /* renamed from: p, reason: collision with root package name */
    public int f71052p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.o4 f71053q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.List f71054r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.modelcdntran.v1 f71055s;

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f71056t;

    /* renamed from: u, reason: collision with root package name */
    public sx.z f71057u;

    /* renamed from: v, reason: collision with root package name */
    public sx.z f71058v;

    /* renamed from: w, reason: collision with root package name */
    public sx.z f71059w;

    /* renamed from: x, reason: collision with root package name */
    public dn.f f71060x;

    /* renamed from: d, reason: collision with root package name */
    public r45.ms f71043d = null;

    /* renamed from: e, reason: collision with root package name */
    public dn.f f71044e = null;

    /* renamed from: g, reason: collision with root package name */
    public int f71046g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f71047h = 0;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f71048i = "";

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.Object f71051o = new java.lang.Object();

    public l1(java.lang.String str, dn.f fVar) {
        this.f71045f = null;
        this.f71049m = "";
        this.f71050n = null;
        this.f71052p = 1;
        com.tencent.mm.sdk.platformtools.o4 L = com.tencent.mm.sdk.platformtools.o4.L();
        this.f71053q = L;
        this.f71054r = java.util.Arrays.asList(29650, 29982);
        this.f71055s = new com.tencent.mm.modelcdntran.v1();
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.feature.cdn.api.NetworkChangeEvent> iListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.feature.cdn.api.NetworkChangeEvent>(a0Var) { // from class: com.tencent.mm.modelcdntran.CdnTransportEngine$1
            {
                this.__eventId = -211003263;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.feature.cdn.api.NetworkChangeEvent networkChangeEvent) {
                if (!com.tencent.mm.sdk.platformtools.x2.n()) {
                    return false;
                }
                com.tencent.mars.WeChatMars.onNetworkChange();
                if (!com.tencent.paymars.WeChatMars.isEnable()) {
                    return false;
                }
                com.tencent.paymars.WeChatMars.onNetworkChange();
                return false;
            }
        };
        this.f71056t = iListener;
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            this.f71050n = new com.tencent.mm.sdk.platformtools.b4(gm0.j1.e().a(), (com.tencent.mm.sdk.platformtools.a4) new com.tencent.mm.modelcdntran.k1(this), true);
        }
        this.f71045f = fVar;
        this.f71049m = str;
        this.f71052p = L.o("MicroMsg.CdnTransportEngine", 1);
        com.tencent.mars.cdn.CdnManager cdnManager = new com.tencent.mars.cdn.CdnManager(com.tencent.mars.MarsContext.getContext());
        com.tencent.mars.MarsContext.getContext().addManager(com.tencent.mars.cdn.CdnManager.class, cdnManager);
        cdnManager.onCreate(com.tencent.mm.vfs.w6.i(str, true), "cdnwx2013usrname", java.lang.Boolean.valueOf(!c01.e2.a0()));
        cdnManager.setAppCallback(this);
        cdnManager.setRSAPublicKeyParams("1", "BFEDFFB5EA28509F9C89ED83FA7FDDA8881435D444E984D53A98AD8E9410F1145EDD537890E10456190B22E6E5006455EFC6C12E41FDA985F38FBBC7213ECB810E3053D4B8D74FFBC70B4600ABD728202322AFCE1406046631261BD5EE3D44721082FEAB74340D73645DC0D02A293B962B9D47E4A64100BD7524DE00D9D3B5C1", "010001");
        cdnManager.setToUserCiper("cdnwx2013usrname");
        com.tencent.mars.cdn.CdnC2Java.setCallback(new com.tencent.mars.cdn.CdnC2JavaCallBack());
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = java.lang.Integer.valueOf(hashCode());
        objArr[1] = str;
        objArr[2] = new com.tencent.mm.sdk.platformtools.z3();
        dn.f fVar2 = this.f71045f;
        objArr[3] = java.lang.Integer.valueOf(fVar2 != null ? fVar2.hashCode() : -1);
        com.tencent.mars.xlog.Log.i("MicroMsg.CdnTransportEngine", "summersafecdn CdnTransportEngine init[%s] infoPath[%s], stack[%s], cdnTransCallback[%s]", objArr);
        ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).setFlowReportParams("ANDROID.MM.CDN.CdnTransportEngine", 5242880L, 60);
        iListener.alive();
    }

    public static int keep_callFromJni(int i17, int i18, byte[] bArr) {
        if (i17 == 100) {
            if (com.tencent.mm.sdk.platformtools.t8.M0(bArr)) {
                bArr = new byte[0];
            }
            java.lang.String str = new java.lang.String(bArr);
            if (i18 == 4) {
                com.tencent.mars.xlog.Log.e("MicroMsg.CdnEngine", str);
            } else if (i18 == 3) {
                com.tencent.mars.xlog.Log.w("MicroMsg.CdnEngine", str);
            } else if (i18 == 2) {
                com.tencent.mars.xlog.Log.i("MicroMsg.CdnEngine", str);
            }
        }
        return 0;
    }

    public final com.tencent.mars.cdn.CdnManager.C2CDownloadRequest a(dn.m mVar) {
        com.tencent.mars.cdn.CdnManager.C2CDownloadRequest c2CDownloadRequest = new com.tencent.mars.cdn.CdnManager.C2CDownloadRequest();
        c2CDownloadRequest.fileid = mVar.field_fileId;
        c2CDownloadRequest.url = mVar.f241811z;
        c2CDownloadRequest.bakup_url = mVar.I;
        c2CDownloadRequest.aeskey = mVar.field_aesKey;
        c2CDownloadRequest.initialIV = mVar.f241788g;
        c2CDownloadRequest.fileType = mVar.field_fileType;
        c2CDownloadRequest.fileKey = mVar.field_mediaId;
        c2CDownloadRequest.setSavePath(mVar.field_fullpath);
        c2CDownloadRequest.isStorageMode = mVar.field_needStorage;
        boolean z17 = false;
        c2CDownloadRequest.isSmallVideo = mVar.field_smallVideoFlag == 1;
        c2CDownloadRequest.isLargeSVideo = mVar.field_largesvideo > 0;
        c2CDownloadRequest.isAutoStart = mVar.field_autostart;
        c2CDownloadRequest.chatType = mVar.field_chattype;
        c2CDownloadRequest.isSilentTask = mVar.field_isSilentTask;
        c2CDownloadRequest.isColdSnsData = false;
        c2CDownloadRequest.isHotSnsVideo = mVar.f241798q;
        c2CDownloadRequest.signalQuality = mVar.field_signalQuality;
        c2CDownloadRequest.snsScene = mVar.field_snsScene;
        c2CDownloadRequest.snsVideoStragegy = mVar.f241800s;
        c2CDownloadRequest.requestVideoFormat = mVar.field_requestVideoFormat;
        c2CDownloadRequest.isHLSVideo = mVar.f241799r;
        c2CDownloadRequest.hlsVideoFlag = "";
        java.lang.String str = mVar.field_svr_signature;
        c2CDownloadRequest.bigfileSignature = str;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            c2CDownloadRequest.bigfileSignature = "";
        }
        java.lang.String str2 = mVar.field_fake_bigfile_signature;
        c2CDownloadRequest.fakeBigfileSignature = str2;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            c2CDownloadRequest.fakeBigfileSignature = "";
        }
        java.lang.String str3 = mVar.field_fake_bigfile_signature_aeskey;
        c2CDownloadRequest.fakeBigfileSignatureAeskey = str3;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            c2CDownloadRequest.fakeBigfileSignatureAeskey = "";
        }
        java.lang.String str4 = mVar.field_wxmsgparam;
        c2CDownloadRequest.msgExtra = str4;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
            c2CDownloadRequest.msgExtra = "";
        }
        c2CDownloadRequest.queueTimeoutSeconds = mVar.A;
        c2CDownloadRequest.transforTimeoutSeconds = mVar.B;
        c2CDownloadRequest.preloadRatio = mVar.field_preloadRatio;
        c2CDownloadRequest.certificateVerifyPolicy = 1;
        c2CDownloadRequest.supportFormats = mVar.field_supportFormats;
        if (mVar.field_fileType == 30002) {
            c2CDownloadRequest.expectFileMD5 = mVar.field_filemd5;
        }
        int i17 = mVar.f241789h;
        c2CDownloadRequest.bizid = i17;
        if (i17 == 0) {
            c2CDownloadRequest.bizid = 1;
            if (mVar.field_bzScene != 0) {
                c2CDownloadRequest.bizid = 3;
            }
        }
        int i18 = mVar.field_appType;
        c2CDownloadRequest.apptype = i18;
        if (i18 == -1 && c2CDownloadRequest.bizid == 1) {
            c2CDownloadRequest.apptype = 1;
        }
        if (mVar.field_bzScene == 0 && mVar.field_needStorage) {
            c2CDownloadRequest.bizid = 2;
            c2CDownloadRequest.apptype = 10;
        }
        int i19 = c2CDownloadRequest.bizid;
        if (i19 == 1) {
            c2CDownloadRequest.debugIP = com.tencent.mm.platformtools.Test$CDN.cdnC2CDownloadDebugIP;
        } else if (i19 == 2) {
            c2CDownloadRequest.debugIP = com.tencent.mm.platformtools.Test$CDN.cdnFavoriteDownloadDebugIP;
        } else if (i19 == 3) {
            int i27 = c2CDownloadRequest.apptype;
            if (i27 < 100 || i27 > 117 || c2CDownloadRequest.fileType != 20201) {
                c2CDownloadRequest.debugIP = com.tencent.mm.platformtools.Test$CDN.cdnSNSDownloadDebugIP;
            } else {
                c2CDownloadRequest.debugIP = com.tencent.mm.platformtools.Test$CDN.cdnFriendsImageDownloadDebugIP;
            }
        } else if (i19 == 8) {
            c2CDownloadRequest.debugIP = com.tencent.mm.platformtools.Test$CDN.cdnPreviewDebugIP;
        } else if (!c2CDownloadRequest.url.isEmpty()) {
            c2CDownloadRequest.debugIP = com.tencent.mm.platformtools.Test$CDN.cdnHttpDownloadDebugIP;
        }
        if (!c2CDownloadRequest.debugIP.isEmpty()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.CdnTransportEngine", "mediaid %s debugip %s", c2CDownloadRequest.fileKey, c2CDownloadRequest.debugIP);
        }
        c2CDownloadRequest.concurrentCount = mVar.f241809y0;
        c2CDownloadRequest.connectionCount = mVar.f241806x0;
        c2CDownloadRequest.downloadBehavior = mVar.f241790i;
        c2CDownloadRequest.netflowTag = "";
        c2CDownloadRequest.statefileKeepHours = mVar.T;
        c2CDownloadRequest.reportDetailPacketTransInfo = mVar.U;
        c2CDownloadRequest.customHeader = mVar.N;
        c2CDownloadRequest.finderMediaCdnInfo = mVar.V;
        c2CDownloadRequest.clientTag = "";
        c2CDownloadRequest.bizReqPayLoad = mVar.P;
        c2CDownloadRequest.taskGroupKey = mVar.W;
        c2CDownloadRequest.taskGroupCapacity = 8;
        c2CDownloadRequest.treatAsVideoFile = mVar.f241791l1;
        c2CDownloadRequest.preAllocStorage = mVar.f241808y;
        c2CDownloadRequest.resolveHostFlags = mVar.f241807x1;
        c2CDownloadRequest.resolveHostPriority = mVar.f241797p1;
        c2CDownloadRequest.allow_mobile_net_download = mVar.G;
        c2CDownloadRequest.wifiAutoStart = mVar.E;
        c2CDownloadRequest.maxHttpRedirectCount = mVar.D;
        c2CDownloadRequest.is_resume_task = mVar.H;
        c2CDownloadRequest.maxFileSize = mVar.X;
        com.tencent.mars.cdn.proto.DownloadRequest downloadRequest = mVar.R;
        if (downloadRequest != null) {
            c2CDownloadRequest.cdnRequestPb = downloadRequest.toByteArrayOrNull();
        }
        java.util.Map map = mVar.f241784J;
        if (map != null) {
            for (java.util.Map.Entry entry : ((java.util.HashMap) map).entrySet()) {
                c2CDownloadRequest.serialized_verify_headers += ((java.lang.String) entry.getKey());
                c2CDownloadRequest.serialized_verify_headers += ":";
                c2CDownloadRequest.serialized_verify_headers += ((java.lang.String) entry.getValue());
                c2CDownloadRequest.serialized_verify_headers += ";";
            }
        }
        if (mVar.f241812z1 != 0 && mVar.f241810y1 > 0) {
            if (!c01.e2.a0() && (com.tencent.mm.sdk.platformtools.x2.n() || com.tencent.mm.sdk.platformtools.x2.p())) {
                z17 = !c();
            }
            if (z17) {
                c2CDownloadRequest.pcdnAppID = mVar.f241812z1;
                c2CDownloadRequest.maxPCDNConnections = mVar.f241810y1;
            }
        }
        return c2CDownloadRequest;
    }

    public final int b(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CdnTransportEngine", "ipFromString %s ->", str);
        int i17 = 0;
        if (!str.contains(".") && !str.contains(":")) {
            com.tencent.mars.xlog.Log.w("MicroMsg.CdnTransportEngine", "invalid ip str.");
            return 0;
        }
        byte[] address = java.net.InetAddress.getByName(str).getAddress();
        int length = address.length;
        int i18 = 0;
        while (i17 < length) {
            try {
                i18 = (i18 << 8) | (address[i17] & 255);
                i17++;
            } catch (java.lang.NullPointerException | java.net.UnknownHostException unused) {
                i17 = i18;
                i18 = i17;
                com.tencent.mars.xlog.Log.i("MicroMsg.CdnTransportEngine", "<- ipFromString %s --> %d", str, java.lang.Integer.valueOf(i18));
                return i18;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CdnTransportEngine", "<- ipFromString %s --> %d", str, java.lang.Integer.valueOf(i18));
        return i18;
    }

    public final boolean c() {
        boolean isWifi;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if (!r75.d.f393259f) {
            isWifi = com.tencent.mars.comm.NetStatusUtil.isWifi(context);
        } else if (r75.d.f393257d == -100) {
            int netType = com.tencent.mars.comm.NetStatusUtil.getNetType(context);
            r75.d.f393257d = netType;
            isWifi = com.tencent.mars.comm.NetStatusUtil.isWifi(netType);
        } else {
            ((ku5.t0) ku5.t0.f312615d).h(new r75.c(context), "SystemServiceCallingCache-UpdateNetWorkCache");
            isWifi = com.tencent.mars.comm.NetStatusUtil.isWifi(r75.d.f393257d);
        }
        if (isWifi || !i95.n0.h(kh3.f.class) || !((lh3.n) ((kh3.f) i95.n0.c(kh3.f.class))).Ui()) {
            return false;
        }
        int Bi = ((lh3.n) ((kh3.f) i95.n0.c(kh3.f.class))).Bi();
        com.tencent.mars.xlog.Log.i("MicroMsg.CdnTransportEngine", "wkType=" + Bi);
        return Bi != 0;
    }

    @Override // com.tencent.mars.cdn.CdnManager.AppCallback
    public java.lang.String[] combineResolveHost(java.lang.String str, int i17, int i18, int[] iArr) {
        int i19;
        com.tencent.mars.xlog.Log.i("MicroMsg.CdnTransportEngine", "try combine resolve host %s, priority %d flags %d", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.mm.network.l lVar = com.tencent.mm.network.n.f72085a;
        if (lVar != null && lVar.a() != null) {
            try {
                i19 = com.tencent.mm.network.n.f72085a.a().T0(str, i17, i18, arrayList);
            } catch (java.lang.Exception e17) {
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                com.tencent.mars.xlog.Log.e("MicroMsg.GprsSetting", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            }
            iArr[0] = i19;
            java.lang.String[] strArr = (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
            com.tencent.mars.xlog.Log.i("MicroMsg.CdnTransportEngine", "resolved dnstype %d iplist %s", java.lang.Integer.valueOf(iArr[0]), java.util.Arrays.toString(strArr));
            return strArr;
        }
        i19 = 0;
        iArr[0] = i19;
        java.lang.String[] strArr2 = (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
        com.tencent.mars.xlog.Log.i("MicroMsg.CdnTransportEngine", "resolved dnstype %d iplist %s", java.lang.Integer.valueOf(iArr[0]), java.util.Arrays.toString(strArr2));
        return strArr2;
    }

    public java.lang.String d() {
        return ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).createAeskey();
    }

    @Override // com.tencent.mars.cdn.CdnManager.SessionCallback
    public byte[] decodeSessionResponseBuf(java.lang.String str, byte[] bArr) {
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            return keep_cdnDecodePrepareResponse(str, bArr);
        }
        return null;
    }

    public java.lang.String e(java.lang.String str) {
        return ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).calcFileMD5(com.tencent.mm.vfs.w6.i(str, false));
    }

    public void f() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CdnTransportEngine", "summersafecdn CdnTransportEngine release");
        this.f71056t.dead();
        com.tencent.mars.cdn.CdnManager cdnManager = (com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class);
        if (cdnManager != null) {
            cdnManager.onDestroy();
            com.tencent.mars.MarsContext.getContext().removeManager(com.tencent.mars.cdn.CdnManager.class, cdnManager);
        }
        this.f71057u = null;
        this.f71058v = null;
        this.f71045f = null;
        f71042z = 0L;
        f71041y = 0L;
        this.f71060x = null;
        this.f71059w = null;
    }

    public void finalize() {
    }

    public dn.h g(java.lang.String str, com.tencent.mars.cdn.CdnManager.C2CDownloadResult c2CDownloadResult, dn.h hVar) {
        if (hVar == null) {
            hVar = new dn.h();
        }
        c2CDownloadResult.fileKey = str;
        hVar.field_retCode = c2CDownloadResult.errorCode;
        hVar.field_argInfo = c2CDownloadResult.argInfo;
        hVar.field_fileLength = c2CDownloadResult.fileSize;
        hVar.field_fileId = c2CDownloadResult.fileid;
        hVar.field_transInfo = c2CDownloadResult.transforMsg;
        hVar.field_convert2baseline = false;
        hVar.field_recvedBytes = c2CDownloadResult.recvedBytes;
        hVar.field_videoFormat = c2CDownloadResult.videoFormat;
        hVar.field_videoFlag = c2CDownloadResult.videoFlag;
        hVar.field_videoCdnMsg = c2CDownloadResult.videoCdnMsg;
        hVar.field_enQueueTime = c2CDownloadResult.enQueueTime;
        hVar.field_startTime = c2CDownloadResult.startTime;
        hVar.field_endTime = c2CDownloadResult.endTime;
        hVar.field_firstRequestCost = c2CDownloadResult.firstRequestCost;
        hVar.field_firstRequestSize = c2CDownloadResult.firstRequestSize;
        hVar.field_firstRequestDownloadSize = c2CDownloadResult.firstRequestDownloadSize;
        hVar.field_firstRequestCompleted = c2CDownloadResult.firstRequestCompleted;
        hVar.field_averageSpeed = c2CDownloadResult.averageSpeed;
        hVar.field_averageConnectCost = c2CDownloadResult.averageConnectCost;
        hVar.field_firstConnectCost = c2CDownloadResult.firstConnectCost;
        hVar.field_netConnectTimes = c2CDownloadResult.netConnectTimes;
        hVar.field_moovRequestTimes = c2CDownloadResult.moovRequestTimes;
        hVar.field_moovCost = c2CDownloadResult.moovCost;
        hVar.field_moovSize = c2CDownloadResult.moovSize;
        hVar.field_moovCompleted = c2CDownloadResult.moovCompleted;
        hVar.field_moovFailReason = c2CDownloadResult.moovFailReason;
        hVar.field_previousCompletedSize = c2CDownloadResult.previousCompletedSize;
        hVar.field_averageRequestSize = c2CDownloadResult.averageRequestSize;
        hVar.field_averageRequestCost = c2CDownloadResult.averageRequestCost;
        hVar.field_requestTotalCount = c2CDownloadResult.requestTotalCount;
        hVar.field_requestCompletedCount = c2CDownloadResult.requestCompletedCount;
        hVar.field_requestTimeoutCount = c2CDownloadResult.requestTimeoutCount;
        hVar.f241768c = c2CDownloadResult.svrFallbackCount;
        hVar.field_httpStatusCode = c2CDownloadResult.httpStatusCode;
        hVar.field_httpResponseHeader = c2CDownloadResult.httpResponseHeader;
        hVar.field_delayTime = c2CDownloadResult.delayTime;
        hVar.field_dnsCostTime = c2CDownloadResult.dnsCostTime;
        hVar.field_connectCostTime = c2CDownloadResult.connectCostTime;
        hVar.field_waitResponseCostTime = c2CDownloadResult.waitResponseCostTime;
        hVar.field_receiveCostTime = c2CDownloadResult.receiveCostTime;
        java.lang.String str2 = c2CDownloadResult.clientIP;
        hVar.field_clientIP = str2;
        hVar.field_serverIP = c2CDownloadResult.serverIP;
        hVar.field_clientHostIP = b(str2);
        hVar.field_serverHostIP = b(c2CDownloadResult.serverIP);
        hVar.field_xErrorNo = c2CDownloadResult.xErrorNo;
        hVar.field_cSeqCheck = c2CDownloadResult.cSeqCheck;
        hVar.field_usePrivateProtocol = c2CDownloadResult.usePrivateProtocol;
        hVar.field_isCrossNet = c2CDownloadResult.crossNet;
        hVar.field_clientIP = c2CDownloadResult.clientIP;
        hVar.field_detailErrorType = c2CDownloadResult.detailErrorType;
        hVar.field_detailErrorCode = c2CDownloadResult.detailErrorCode;
        java.lang.String[] strArr = c2CDownloadResult.usedSvrIps;
        if (strArr != null && strArr.length > 0) {
            hVar.field_usedSvrIps = (java.lang.String[]) strArr.clone();
            hVar.f241769d = c2CDownloadResult.usedSvrIps[r6.length - 1];
            hVar.f241770e = c2CDownloadResult.lastSvrPort;
            hVar.f241771f = c2CDownloadResult.lastNetType;
        }
        hVar.field_isResume = c2CDownloadResult.isResume;
        hVar.f241773h = c2CDownloadResult.picIndex;
        hVar.f241774i = c2CDownloadResult.batchImageNeedRetry;
        hVar.f241775j = c2CDownloadResult.transportProtocol;
        hVar.f241776k = c2CDownloadResult.transportProtocolError;
        hVar.f241777l = c2CDownloadResult.traceId;
        hVar.f241778m = c2CDownloadResult.profile;
        com.tencent.mars.cdn.CdnManager.SNSVideoProfile sNSVideoProfile = c2CDownloadResult.snsVideoProfile;
        hVar.f241779n = sNSVideoProfile;
        hVar.f241780o = c2CDownloadResult.snsVideoInfo;
        if (sNSVideoProfile != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CdnTransportEngine", "snsvideo mode %d usecold %b useprov %d exptid %d strategy %s", java.lang.Integer.valueOf(sNSVideoProfile.mode), java.lang.Boolean.valueOf(hVar.f241779n.useColdRule), java.lang.Integer.valueOf(hVar.f241779n.usedProvince), java.lang.Integer.valueOf(hVar.f241779n.experimentalGroupID), hVar.f241779n.strategy);
        }
        com.tencent.mars.cdn.CdnManager.VideoInfo videoInfo = hVar.f241780o;
        if (videoInfo != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CdnTransportEngine", "snsvideo flag %s flag %d rawflag %d", videoInfo.svrFlag, java.lang.Integer.valueOf(videoInfo.videoFormat), java.lang.Integer.valueOf(hVar.f241780o.oriVideoFormat));
        }
        hVar.f241781p = c2CDownloadResult;
        if (!com.tencent.mm.sdk.platformtools.t8.M0(c2CDownloadResult.cdnResultPb)) {
            try {
                com.tencent.mars.cdn.proto.DownloadResult.newBuilder().parseFrom(c2CDownloadResult.cdnResultPb);
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.CdnTransportEngine", e17.getLocalizedMessage());
            }
        }
        return hVar;
    }

    @Override // com.tencent.mars.cdn.CdnManager.SessionCallback
    public byte[] getSessionRequestBuf(java.lang.String str, byte[] bArr) {
        if (!com.tencent.mm.sdk.platformtools.x2.n()) {
            return null;
        }
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        keep_cdnGetSkeyBuf(str, byteArrayOutputStream);
        if (byteArrayOutputStream.size() > 0) {
            return byteArrayOutputStream.toByteArray();
        }
        return null;
    }

    public boolean h(r45.ms msVar, r45.ms msVar2, r45.ms msVar3, byte[] bArr, byte[] bArr2, r45.ms msVar4, java.lang.String str) {
        r45.ms msVar5 = this.f71043d;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.CdnTransportEngine", "summersafecdn cdntra setCDNDnsInfo old [%s]  new [%s], safecdn [%s], nettype [%s], stack[%s]", msVar5, msVar, msVar4, str, new com.tencent.mm.sdk.platformtools.z3());
        if (msVar == null && bArr == null) {
            return false;
        }
        this.f71043d = msVar;
        try {
            ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).setLegacyCdnInfo(y(msVar), y(msVar2), y(msVar3), y(msVar4), bArr, bArr2, str);
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CdnTransportEngine", "tocdninfo failed:" + e17.getLocalizedMessage());
            return false;
        }
    }

    public final void i(dn.h hVar) {
        int indexOf;
        if (hVar == null || com.tencent.mm.sdk.platformtools.t8.K0(hVar.field_transInfo) || (indexOf = hVar.field_transInfo.indexOf("@,")) <= 0) {
            return;
        }
        hVar.f241767b = hVar.field_transInfo.substring(indexOf + 2);
        hVar.field_transInfo = hVar.field_transInfo.substring(0, indexOf);
    }

    @Override // com.tencent.mars.cdn.CdnManager.AppCallback
    public boolean isUsingWangKaService(int i17) {
        boolean c17 = c();
        com.tencent.mars.xlog.Log.i("MicroMsg.CdnTransportEngine", "using wangka %b", java.lang.Boolean.valueOf(c17));
        return c17;
    }

    public int j(dn.m mVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CdnTransportEngine", "startDownload: biz:%d, mediaid:%s, savepath:%s", java.lang.Integer.valueOf(mVar.f241789h), mVar.field_mediaId, mVar.field_fullpath);
        com.tencent.mars.cdn.CdnManager.C2CDownloadRequest a17 = a(mVar);
        int i17 = a17.bizid;
        if (i17 != -3) {
            if (i17 != 1 && i17 != 2) {
                if (i17 != 3 && i17 != 4) {
                    if (i17 != 5) {
                        return ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).startURLDownload(a17, this);
                    }
                }
            }
            return ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).startC2CDownload(a17, this);
        }
        return ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).startSNSDownload(a17, this, this, 0);
    }

    public int k(dn.o oVar) {
        com.tencent.mars.cdn.CdnManager.C2CDownloadRequest c2CDownloadRequest = new com.tencent.mars.cdn.CdnManager.C2CDownloadRequest();
        c2CDownloadRequest.fileType = 20302;
        c2CDownloadRequest.fileKey = oVar.field_mediaId;
        c2CDownloadRequest.url = oVar.M1;
        c2CDownloadRequest.referer = oVar.N1;
        c2CDownloadRequest.setSavePath(oVar.field_fullpath);
        c2CDownloadRequest.isColdSnsData = oVar.R1;
        c2CDownloadRequest.isHotSnsVideo = oVar.f241798q;
        c2CDownloadRequest.isHLSVideo = oVar.f241799r;
        c2CDownloadRequest.hlsVideoFlag = "";
        c2CDownloadRequest.signalQuality = oVar.S1;
        c2CDownloadRequest.snsScene = oVar.T1;
        c2CDownloadRequest.preloadRatio = oVar.field_preloadRatio;
        c2CDownloadRequest.preloadMinSize = oVar.f241805x;
        c2CDownloadRequest.requestVideoFormat = oVar.field_requestVideoFormat;
        c2CDownloadRequest.connectionCount = oVar.f241806x0;
        c2CDownloadRequest.snsCipherKey = oVar.Y1;
        c2CDownloadRequest.bizid = 3;
        c2CDownloadRequest.apptype = 251;
        boolean z17 = false;
        c2CDownloadRequest.videoflagPolicy = 0;
        c2CDownloadRequest.concurrentCount = oVar.f241809y0;
        c2CDownloadRequest.maxHttpRedirectCount = 15;
        c2CDownloadRequest.downloadBehavior = oVar.f241790i;
        java.lang.String str = oVar.X1;
        if (str == null || (str.indexOf(120) < 0 && oVar.X1.indexOf(88) < 0)) {
            c2CDownloadRequest.requestVideoFlag = oVar.X1;
        } else {
            c2CDownloadRequest.requestVideoFlag = oVar.X1.substring(1);
        }
        c2CDownloadRequest.maxFileSize = oVar.X;
        c2CDownloadRequest.reportDetailPacketTransInfo = oVar.U;
        c2CDownloadRequest.statefileKeepHours = oVar.T;
        c2CDownloadRequest.aeskey = oVar.field_aesKey;
        c2CDownloadRequest.initialIV = oVar.f241788g;
        c2CDownloadRequest.customHeader = oVar.N;
        c2CDownloadRequest.feedId = oVar.f241802u;
        c2CDownloadRequest.finderByPass = oVar.f241801t;
        c2CDownloadRequest.finderMediaCdnInfo = oVar.V;
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_disable_finder_pcdn, 0);
        if (Ni != 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.CdnTransportEngine", "finder pcdn disabled by expt %d", java.lang.Integer.valueOf(Ni));
        }
        if (Ni == 0) {
            if (!c01.e2.a0() && (com.tencent.mm.sdk.platformtools.x2.n() || com.tencent.mm.sdk.platformtools.x2.p())) {
                z17 = !c();
            }
            if (z17) {
                c2CDownloadRequest.pcdnAppID = 30001;
                c2CDownloadRequest.maxPCDNConnections = 4;
                com.tencent.mars.xlog.Log.i("MicroMsg.CdnTransportEngine", "enable pcdn appid %d", 30001);
            }
        }
        if (!com.tencent.mm.platformtools.Test$CDN.cdnSNSDownloadDebugIP.isEmpty()) {
            java.lang.String str2 = com.tencent.mm.platformtools.Test$CDN.cdnSNSDownloadDebugIP;
            c2CDownloadRequest.debugIP = str2;
            com.tencent.mars.xlog.Log.w("MicroMsg.CdnTransportEngine", "mediaid %s debugip %s", c2CDownloadRequest.fileKey, str2);
        }
        return ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).startSNSDownload(c2CDownloadRequest, this, this, oVar.H1);
    }

    public void keep_OnRequestDoGetCdnDnsInfo(int i17) {
        if (gm0.j1.b().n()) {
            com.tencent.mm.modelcdntran.s1.Zi().hj(i17);
        }
    }

    public byte[] keep_cdnDecodePrepareResponse(java.lang.String str, byte[] bArr) {
        dn.f fVar = this.f71045f;
        if (fVar != null) {
            return fVar.w(str, bArr);
        }
        return null;
    }

    public void keep_cdnGetSkeyBuf(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
        dn.f fVar = this.f71045f;
        if (fVar != null) {
            fVar.O(str, byteArrayOutputStream);
        }
    }

    public void keep_cdnSendAndRecvData(java.lang.String str, int i17, int i18) {
        com.tencent.mm.sdk.platformtools.b4 b4Var;
        if (i17 < 0 || i18 < 0) {
            return;
        }
        this.f71046g += i17;
        this.f71047h += i18;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            this.f71048i = str;
        }
        if (this.f71046g + this.f71047h <= 51200 || (b4Var = this.f71050n) == null) {
            return;
        }
        b4Var.c(500L, 500L);
    }

    public void keep_onDataAvailable(java.lang.String str, long j17, long j18) {
        sx.z zVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.CdnTransportEngine", "keep_onDataAvailable %s, %d, %d", str, java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
        sx.z zVar2 = this.f71057u;
        if ((zVar2 != null ? zVar2.c(str, (int) j17, (int) j18) : 0) == 0 && (zVar = this.f71058v) != null) {
            zVar.c(str, (int) j17, (int) j18);
        }
        sx.z zVar3 = this.f71059w;
        if (zVar3 != null) {
            zVar3.c(str, (int) j17, (int) j18);
        }
    }

    public int keep_onDownloadError(java.lang.String str, dn.h hVar) {
        dn.f fVar;
        sx.z zVar;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.modelcdntran.n1 n1Var = new com.tencent.mm.modelcdntran.n1(com.tencent.mm.modelcdntran.m1.f71075d, str);
            if (hVar != null) {
                n1Var.f71105c = hVar.field_retCode;
            }
            n1Var.f71108f = hVar;
            this.f71055s.notify(n1Var);
        }
        sx.z zVar2 = this.f71057u;
        int a17 = zVar2 != null ? zVar2.a(str, null, hVar) : 0;
        if (a17 == 0 && (zVar = this.f71058v) != null) {
            a17 = zVar.a(str, null, hVar);
        }
        if (a17 == 0 && (fVar = this.f71044e) != null) {
            a17 = fVar.a(str, null, hVar);
        }
        if (a17 == 0 && this.f71045f != null) {
            i(hVar);
            this.f71045f.a(str, null, hVar);
        }
        sx.z zVar3 = this.f71059w;
        if (zVar3 != null) {
            zVar3.a(str, null, hVar);
        }
        dn.f fVar2 = this.f71060x;
        if (fVar2 != null) {
            fVar2.a(str, null, hVar);
        }
        ((kn4.t) ((pf0.q) i95.n0.c(pf0.q.class))).Ai(str, null, hVar);
        return 0;
    }

    public int keep_onDownloadProgress(java.lang.String str, dn.g gVar) {
        dn.f fVar;
        dn.f fVar2;
        sx.z zVar;
        gVar.field_isUploadTask = false;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.modelcdntran.n1 n1Var = new com.tencent.mm.modelcdntran.n1(com.tencent.mm.modelcdntran.m1.f71077f, str);
            n1Var.f71107e = gVar;
            this.f71055s.notify(n1Var);
        }
        sx.z zVar2 = this.f71057u;
        int a17 = zVar2 != null ? zVar2.a(str, gVar, null) : 0;
        if (a17 == 0 && (zVar = this.f71058v) != null) {
            a17 = zVar.a(str, gVar, null);
        }
        if (a17 == 0 && (fVar2 = this.f71044e) != null) {
            a17 = fVar2.a(str, gVar, null);
        }
        if (a17 == 0 && (fVar = this.f71045f) != null) {
            fVar.a(str, gVar, null);
        }
        sx.z zVar3 = this.f71059w;
        if (zVar3 != null) {
            zVar3.a(str, gVar, null);
        }
        dn.f fVar3 = this.f71060x;
        if (fVar3 != null) {
            fVar3.a(str, gVar, null);
        }
        ((kn4.t) ((pf0.q) i95.n0.c(pf0.q.class))).Ai(str, gVar, null);
        return 0;
    }

    public int keep_onDownloadSuccessed(java.lang.String str, dn.h hVar) {
        dn.f fVar;
        sx.z zVar;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.modelcdntran.n1 n1Var = new com.tencent.mm.modelcdntran.n1(com.tencent.mm.modelcdntran.m1.f71076e, str);
            n1Var.f71108f = hVar;
            this.f71055s.notify(n1Var);
        }
        sx.z zVar2 = this.f71057u;
        int a17 = zVar2 != null ? zVar2.a(str, null, hVar) : 0;
        if (a17 == 0 && (zVar = this.f71058v) != null) {
            a17 = zVar.a(str, null, hVar);
        }
        if (a17 == 0 && (fVar = this.f71044e) != null) {
            a17 = fVar.a(str, null, hVar);
        }
        if (a17 == 0 && this.f71045f != null) {
            i(hVar);
            this.f71045f.a(str, null, hVar);
        }
        sx.z zVar3 = this.f71059w;
        if (zVar3 != null) {
            zVar3.a(str, null, hVar);
        }
        dn.f fVar2 = this.f71060x;
        if (fVar2 != null) {
            fVar2.a(str, null, hVar);
        }
        ((kn4.t) ((pf0.q) i95.n0.c(pf0.q.class))).Ai(str, null, hVar);
        return 0;
    }

    public void keep_onDownloadToEnd(java.lang.String str, long j17, long j18) {
        sx.z zVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.CdnTransportEngine", "keep_onDownloadToEnd %s, %d, %d", str, java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
        sx.z zVar2 = this.f71057u;
        if ((zVar2 != null ? zVar2.c(str, (int) j17, (int) j18) : 0) == 0 && (zVar = this.f71058v) != null) {
            zVar.b(str, (int) j17, (int) j18);
        }
        sx.z zVar3 = this.f71059w;
        if (zVar3 != null) {
            zVar3.c(str, (int) j17, (int) j18);
        }
    }

    public void keep_onMoovReady(java.lang.String str, long j17, long j18, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CdnTransportEngine", "keep_onMoovReady %s, %d, %d, %s, hash[%d]", str, java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), str2, java.lang.Integer.valueOf(hashCode()));
        com.tencent.mars.xlog.Log.e("MicroMsg.CdnTransportEngine", "cdn call on moov ready but onlineVideoCallback is null.hash[%d]", java.lang.Integer.valueOf(hashCode()));
        jx3.f.INSTANCE.t(com.tencent.mm.plugin.appbrand.jsapi.nfc.m.CTRL_INDEX, 29);
    }

    public int keep_onUploadError(java.lang.String str, dn.h hVar) {
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.modelcdntran.n1 n1Var = new com.tencent.mm.modelcdntran.n1(com.tencent.mm.modelcdntran.m1.f71078g, str);
            if (hVar != null) {
                n1Var.f71105c = hVar.field_retCode;
            }
            n1Var.f71108f = hVar;
            this.f71055s.notify(n1Var);
        }
        if (this.f71045f != null) {
            i(hVar);
            this.f71045f.a(str, null, hVar);
        }
        ((kn4.t) ((pf0.q) i95.n0.c(pf0.q.class))).Ai(str, null, hVar);
        return 0;
    }

    public int keep_onUploadProgress(java.lang.String str, dn.g gVar) {
        gVar.field_isUploadTask = true;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.modelcdntran.n1 n1Var = new com.tencent.mm.modelcdntran.n1(com.tencent.mm.modelcdntran.m1.f71080i, str);
            n1Var.f71107e = gVar;
            this.f71055s.notify(n1Var);
        }
        if (this.f71045f != null) {
            this.f71045f.a(str, gVar, null);
        }
        ((kn4.t) ((pf0.q) i95.n0.c(pf0.q.class))).Ai(str, gVar, null);
        return 0;
    }

    public int keep_onUploadSuccessed(java.lang.String str, dn.h hVar) {
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.modelcdntran.n1 n1Var = new com.tencent.mm.modelcdntran.n1(com.tencent.mm.modelcdntran.m1.f71079h, str);
            n1Var.f71108f = hVar;
            this.f71055s.notify(n1Var);
        }
        if (this.f71045f != null) {
            i(hVar);
            this.f71045f.a(str, null, hVar);
        }
        ((kn4.t) ((pf0.q) i95.n0.c(pf0.q.class))).Ai(str, null, hVar);
        return 0;
    }

    public int l(dn.o oVar) {
        com.tencent.mars.cdn.CdnManager.C2CDownloadRequest c2CDownloadRequest = new com.tencent.mars.cdn.CdnManager.C2CDownloadRequest();
        c2CDownloadRequest.fileKey = oVar.field_mediaId;
        c2CDownloadRequest.fileType = 90;
        c2CDownloadRequest.url = oVar.M1;
        c2CDownloadRequest.referer = oVar.N1;
        c2CDownloadRequest.setSavePath(oVar.field_fullpath);
        c2CDownloadRequest.preloadRatio = oVar.field_preloadRatio;
        c2CDownloadRequest.preloadMinSize = oVar.f241805x;
        c2CDownloadRequest.concurrentCount = oVar.f241809y0;
        c2CDownloadRequest.maxHttpRedirectCount = 20;
        c2CDownloadRequest.downloadBehavior = oVar.f241790i;
        if (!com.tencent.mm.platformtools.Test$CDN.cdnHttpDownloadDebugIP.isEmpty()) {
            java.lang.String str = com.tencent.mm.platformtools.Test$CDN.cdnHttpDownloadDebugIP;
            c2CDownloadRequest.debugIP = str;
            com.tencent.mars.xlog.Log.w("MicroMsg.CdnTransportEngine", "mediaid %s debugip %s", c2CDownloadRequest.fileKey, str);
        }
        return ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).startHttpVideoStreamingDownload(c2CDownloadRequest, this, this, oVar.H1);
    }

    public int m(dn.o oVar) {
        com.tencent.mars.cdn.CdnManager.C2CDownloadRequest c2CDownloadRequest = new com.tencent.mars.cdn.CdnManager.C2CDownloadRequest();
        if (oVar.field_fileType <= 0) {
            oVar.field_fileType = 20202;
        }
        c2CDownloadRequest.fileType = oVar.field_fileType;
        c2CDownloadRequest.fileKey = oVar.field_mediaId;
        c2CDownloadRequest.url = oVar.M1;
        c2CDownloadRequest.referer = oVar.N1;
        c2CDownloadRequest.setSavePath(oVar.field_fullpath);
        c2CDownloadRequest.isColdSnsData = oVar.R1;
        c2CDownloadRequest.isHotSnsVideo = oVar.f241798q;
        c2CDownloadRequest.isHLSVideo = oVar.f241799r;
        c2CDownloadRequest.hlsVideoFlag = "";
        c2CDownloadRequest.signalQuality = oVar.S1;
        c2CDownloadRequest.snsScene = oVar.T1;
        c2CDownloadRequest.preloadRatio = oVar.field_preloadRatio;
        c2CDownloadRequest.preloadMinSize = oVar.f241805x;
        c2CDownloadRequest.requestVideoFormat = oVar.field_requestVideoFormat;
        c2CDownloadRequest.connectionCount = oVar.f241806x0;
        c2CDownloadRequest.concurrentCount = oVar.f241809y0;
        c2CDownloadRequest.snsCipherKey = oVar.Y1;
        c2CDownloadRequest.snsVideoStragegy = oVar.f241800s;
        c2CDownloadRequest.videoflagPolicy = 0;
        c2CDownloadRequest.maxFileSize = oVar.X;
        c2CDownloadRequest.downloadBehavior = oVar.f241790i;
        c2CDownloadRequest.bizReqPayLoad = oVar.P;
        java.lang.String str = oVar.X1;
        if (str == null || (str.indexOf(120) < 0 && oVar.X1.indexOf(88) < 0)) {
            c2CDownloadRequest.requestVideoFlag = oVar.X1;
        } else {
            c2CDownloadRequest.requestVideoFlag = oVar.X1.substring(1);
        }
        synchronized (nk.c.f337940a) {
        }
        if (!com.tencent.mm.platformtools.Test$CDN.cdnSNSDownloadDebugIP.isEmpty()) {
            java.lang.String str2 = com.tencent.mm.platformtools.Test$CDN.cdnSNSDownloadDebugIP;
            c2CDownloadRequest.debugIP = str2;
            com.tencent.mars.xlog.Log.w("MicroMsg.CdnTransportEngine", "mediaid %s debugip %s", c2CDownloadRequest.fileKey, str2);
        }
        return ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).startSNSDownload(c2CDownloadRequest, this, this, oVar.H1);
    }

    public int n(dn.i iVar) {
        iVar.field_fileType = iVar.Q1;
        synchronized (nk.c.f337940a) {
        }
        com.tencent.mars.cdn.CdnManager.C2CDownloadRequest c2CDownloadRequest = new com.tencent.mars.cdn.CdnManager.C2CDownloadRequest();
        c2CDownloadRequest.fileKey = iVar.field_mediaId;
        c2CDownloadRequest.url = iVar.D1;
        c2CDownloadRequest.referer = iVar.F1;
        c2CDownloadRequest.isColdSnsData = iVar.L1;
        c2CDownloadRequest.signalQuality = iVar.M1;
        c2CDownloadRequest.snsScene = iVar.N1;
        c2CDownloadRequest.concurrentCount = 6;
        c2CDownloadRequest.bizid = iVar.f241789h;
        c2CDownloadRequest.apptype = iVar.P1;
        c2CDownloadRequest.fileType = iVar.Q1;
        c2CDownloadRequest.downloadBehavior = iVar.f241790i;
        com.tencent.mars.cdn.proto.DownloadRequest downloadRequest = iVar.R;
        if (downloadRequest != null) {
            c2CDownloadRequest.cdnRequestPb = downloadRequest.toByteArrayOrNull();
        }
        c2CDownloadRequest.msgType = 2;
        c2CDownloadRequest.feedId = iVar.R1;
        c2CDownloadRequest.feedPicCount = iVar.S1;
        c2CDownloadRequest.batchSnsReqImageDatas = iVar.U1;
        if (!com.tencent.mm.platformtools.Test$CDN.cdnFriendsImageDownloadDebugIP.isEmpty()) {
            java.lang.String str = com.tencent.mm.platformtools.Test$CDN.cdnFriendsImageDownloadDebugIP;
            c2CDownloadRequest.debugIP = str;
            com.tencent.mars.xlog.Log.w("MicroMsg.CdnTransportEngine", "mediaid %s debugip %s", c2CDownloadRequest.fileKey, str);
        }
        return ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).startSNSDownload(c2CDownloadRequest, this, this, 0);
    }

    public int o(dn.j jVar) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(jVar.field_mediaId) || com.tencent.mm.sdk.platformtools.t8.K0(jVar.D1) || com.tencent.mm.sdk.platformtools.t8.K0(jVar.G1)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CdnTransportEngine", "invalid param.");
            return -1;
        }
        synchronized (nk.c.f337940a) {
        }
        com.tencent.mars.cdn.CdnManager.C2CDownloadRequest c2CDownloadRequest = new com.tencent.mars.cdn.CdnManager.C2CDownloadRequest();
        c2CDownloadRequest.fileKey = jVar.field_mediaId;
        c2CDownloadRequest.url = jVar.D1;
        c2CDownloadRequest.referer = jVar.F1;
        c2CDownloadRequest.setSavePath(jVar.G1);
        c2CDownloadRequest.isColdSnsData = jVar.L1;
        c2CDownloadRequest.signalQuality = jVar.M1;
        c2CDownloadRequest.snsScene = jVar.N1;
        c2CDownloadRequest.snsCipherKey = jVar.O1;
        c2CDownloadRequest.concurrentCount = 6;
        c2CDownloadRequest.bizid = jVar.f241789h;
        c2CDownloadRequest.apptype = jVar.P1;
        c2CDownloadRequest.fileType = jVar.Q1;
        c2CDownloadRequest.requestVideoFormat = jVar.field_requestVideoFormat;
        c2CDownloadRequest.downloadBehavior = jVar.f241790i;
        c2CDownloadRequest.customHeader = jVar.N;
        if (!com.tencent.mm.platformtools.Test$CDN.cdnFriendsImageDownloadDebugIP.isEmpty()) {
            java.lang.String str = com.tencent.mm.platformtools.Test$CDN.cdnFriendsImageDownloadDebugIP;
            c2CDownloadRequest.debugIP = str;
            com.tencent.mars.xlog.Log.w("MicroMsg.CdnTransportEngine", "mediaid %s debugip %s", c2CDownloadRequest.fileKey, str);
        }
        return ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).startSNSDownload(c2CDownloadRequest, this, this, 0);
    }

    @Override // com.tencent.mars.cdn.CdnManager.AppCallback
    public void onBadNetworkProbed() {
        com.tencent.mars.xlog.Log.w("MicroMsg.CdnTransportEngine", "bad network probed by CDN, try analyze STN network.");
        ((com.tencent.mars.mm.MMStnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.mm.MMStnManager.class)).startNetworkAnalysis();
    }

    @Override // com.tencent.mars.cdn.CdnManager.DownloadCallback
    public void onC2CDownloadCompleted(java.lang.String str, com.tencent.mars.cdn.CdnManager.C2CDownloadResult c2CDownloadResult) {
        com.tencent.mars.cdn.CdnManager.CronetTaskResult cronetTaskResult;
        com.tencent.mars.xlog.Log.i("MicroMsg.CdnTransportEngine", "onC2CDownloadCompleted filekey %s error %d", str, java.lang.Integer.valueOf(c2CDownloadResult.errorCode));
        dn.h g17 = g(str, c2CDownloadResult, new dn.b());
        nk.c.f337940a.a(str, c2CDownloadResult, 1);
        if (c2CDownloadResult.fromCronet && (cronetTaskResult = c2CDownloadResult.cronetTaskResult) != null) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = cronetTaskResult.useHttp2 ? "true" : "false";
            objArr[1] = cronetTaskResult.useQuic ? "true" : "false";
            objArr[2] = java.lang.Integer.valueOf(cronetTaskResult.statusCode);
            com.tencent.mars.xlog.Log.i("MicroMsg.CdnTransportEngine", "cronet this task is from cronet ,use http2 %s, use quic %s, status code %d ", objArr);
            com.tencent.mars.cdn.CdnManager.WebPageProfile webPageProfile = c2CDownloadResult.cronetTaskResult.performance;
            com.tencent.mars.xlog.Log.i("MicroMsg.CdnTransportEngine", "cronet webperformance ip:%s, protocol:%s", webPageProfile.peerIP, webPageProfile.protocol);
            com.tencent.mars.cdn.CdnManager.CronetTaskResult cronetTaskResult2 = new com.tencent.mars.cdn.CdnManager.CronetTaskResult();
            com.tencent.mars.cdn.CdnManager.CronetTaskResult cronetTaskResult3 = c2CDownloadResult.cronetTaskResult;
            cronetTaskResult2.useQuic = cronetTaskResult3.useQuic;
            cronetTaskResult2.useHttp2 = cronetTaskResult3.useHttp2;
            cronetTaskResult2.statusCode = cronetTaskResult3.statusCode;
            cronetTaskResult2.statusText = cronetTaskResult3.statusText;
            cronetTaskResult2.performance = cronetTaskResult3.performance;
            g17.field_httpStatusCode = cronetTaskResult3.statusCode;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis() - c2CDownloadResult.taskStartTime;
        if (30001 == c2CDownloadResult.fileType) {
            if (c2CDownloadResult.fromCronet) {
                com.tencent.mars.xlog.Log.i("MicroMsg.CdnTransportEngine", "cronet task use cronet download time " + currentTimeMillis);
                jx3.f fVar = jx3.f.INSTANCE;
                fVar.w(1173L, 97L, 1L);
                fVar.w(1173L, 99L, currentTimeMillis);
                com.tencent.mars.cdn.CdnManager.CronetTaskResult cronetTaskResult4 = c2CDownloadResult.cronetTaskResult;
                if (cronetTaskResult4 != null) {
                    if (cronetTaskResult4.useQuic) {
                        fVar.w(1173L, 94L, 1L);
                        fVar.w(1173L, 95L, currentTimeMillis);
                        com.tencent.mars.xlog.Log.i("MicroMsg.CdnTransportEngine", "cronet task use cronet quic download time " + currentTimeMillis);
                    } else if (cronetTaskResult4.useHttp2) {
                        fVar.w(1173L, 91L, 1L);
                        fVar.w(1173L, 92L, currentTimeMillis);
                        com.tencent.mars.xlog.Log.i("MicroMsg.CdnTransportEngine", "cronet task use cronet http2 download time " + currentTimeMillis);
                    } else {
                        fVar.w(1173L, 88L, 1L);
                        fVar.w(1173L, 89L, currentTimeMillis);
                        com.tencent.mars.xlog.Log.i("MicroMsg.CdnTransportEngine", "cronet task use cronet http1.x download time " + currentTimeMillis);
                    }
                }
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.CdnTransportEngine", "cronet task use normal download time " + currentTimeMillis);
                jx3.f fVar2 = jx3.f.INSTANCE;
                fVar2.w(1173L, 100L, 1L);
                fVar2.w(1173L, 98L, currentTimeMillis);
            }
        }
        if (g17.field_retCode == 0) {
            keep_onDownloadSuccessed(str, g17);
            return;
        }
        com.tencent.mm.autogen.mmdata.rpt.CdnDetailErrorsStruct cdnDetailErrorsStruct = new com.tencent.mm.autogen.mmdata.rpt.CdnDetailErrorsStruct();
        cdnDetailErrorsStruct.f55592h = cdnDetailErrorsStruct.b("filekey", str, true);
        cdnDetailErrorsStruct.f55588d = 1;
        cdnDetailErrorsStruct.f55589e = c2CDownloadResult.detailErrorType;
        cdnDetailErrorsStruct.f55590f = c2CDownloadResult.detailErrorCode;
        cdnDetailErrorsStruct.f55591g = c2CDownloadResult.errorCode;
        cdnDetailErrorsStruct.f55593i = c2CDownloadResult.fileType;
        cdnDetailErrorsStruct.f55594j = c2CDownloadResult.tryWritenBytes;
        cdnDetailErrorsStruct.f55595k = c2CDownloadResult.availableBytes;
        cdnDetailErrorsStruct.f55596l = cdnDetailErrorsStruct.b("SystemErrorDescribe", c2CDownloadResult.systemErrorDescribe, true);
        cdnDetailErrorsStruct.f55597m = c2CDownloadResult.currentFileSize;
        cdnDetailErrorsStruct.k();
        com.tencent.mars.xlog.Log.i("MicroMsg.CdnTransportEngine", "reportstr %s", cdnDetailErrorsStruct.n());
        keep_onDownloadError(str, g17);
    }

    @Override // com.tencent.mars.cdn.CdnManager.UploadCallback
    public void onC2CUploadCompleted(java.lang.String str, com.tencent.mars.cdn.CdnManager.C2CUploadResult c2CUploadResult) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CdnTransportEngine", "onC2CUploadCompleted filekey %s error %d", str, java.lang.Integer.valueOf(c2CUploadResult.errorCode));
        dn.h hVar = new dn.h();
        hVar.field_retCode = c2CUploadResult.errorCode;
        hVar.field_toUser = c2CUploadResult.touser;
        hVar.field_UploadHitCacheType = c2CUploadResult.hitCache;
        hVar.field_fileId = c2CUploadResult.fileid;
        hVar.field_aesKey = c2CUploadResult.aeskey;
        hVar.field_filemd5 = c2CUploadResult.filemd5;
        hVar.field_thumbfilemd5 = c2CUploadResult.thumbfilemd5;
        hVar.field_mp4identifymd5 = c2CUploadResult.mp4identifymd5;
        hVar.field_transInfo = c2CUploadResult.transforMsg;
        hVar.field_fileLength = c2CUploadResult.fileSize;
        hVar.field_midimgLength = c2CUploadResult.midfileSize;
        hVar.field_thumbimgLength = c2CUploadResult.thumbfileSize;
        hVar.field_needSendMsgField = !c2CUploadResult.sendmsgFromCDN;
        hVar.field_exist_whencheck = c2CUploadResult.existOnSvr;
        byte[] bArr = c2CUploadResult.skeyrespbuf;
        if (bArr != null) {
            hVar.field_sKeyrespbuf = (byte[]) bArr.clone();
        }
        hVar.field_videoFileId = c2CUploadResult.videofileid;
        hVar.field_filecrc = c2CUploadResult.fileCrc32;
        hVar.field_upload_by_safecdn = c2CUploadResult.uploadBySafecdn;
        hVar.field_isVideoReduced = c2CUploadResult.isVideoReduced;
        java.lang.String[] strArr = c2CUploadResult.usedSvrIps;
        if (strArr != null) {
            hVar.field_usedSvrIps = (java.lang.String[]) strArr.clone();
        }
        hVar.field_fileUrl = c2CUploadResult.fileUrl;
        hVar.field_thumbUrl = c2CUploadResult.thumbfileUrl;
        hVar.f241772g = c2CUploadResult.emojiMD5;
        hVar.field_isResume = c2CUploadResult.isResume;
        hVar.field_delayTime = c2CUploadResult.delayTime;
        hVar.field_connectCostTime = c2CUploadResult.connectCostTime;
        hVar.field_waitResponseCostTime = c2CUploadResult.waitResponseCostTime;
        hVar.field_receiveCostTime = c2CUploadResult.receiveCostTime;
        java.lang.String str2 = c2CUploadResult.clientIP;
        hVar.field_clientIP = str2;
        hVar.field_serverIP = c2CUploadResult.serverIP;
        hVar.field_clientHostIP = b(str2);
        hVar.field_serverHostIP = b(c2CUploadResult.serverIP);
        hVar.f241775j = c2CUploadResult.transportProtocol;
        hVar.f241776k = c2CUploadResult.transportProtocolError;
        hVar.field_detailErrorType = c2CUploadResult.detailErrorType;
        hVar.field_detailErrorCode = c2CUploadResult.detailErrorCode;
        hVar.f241782q = c2CUploadResult;
        if (!com.tencent.mm.sdk.platformtools.t8.M0(c2CUploadResult.cdnResultPb)) {
            try {
                com.tencent.mars.cdn.proto.UploadResult parseFrom = com.tencent.mars.cdn.proto.UploadResult.newBuilder().parseFrom(c2CUploadResult.cdnResultPb);
                hVar.f241783r = parseFrom;
                if (parseFrom.hasBase() && hVar.f241783r.getBase().hasCipher()) {
                    com.tencent.mars.cdn.proto.CipherContext cipher = hVar.f241783r.getBase().getCipher();
                    com.tencent.mars.xlog.Log.i("MicroMsg.CdnTransportEngine", "upload cipher method %d key %s iv %s", java.lang.Integer.valueOf(cipher.getMethod().getNumber()), cipher.getKey(), cipher.getIv());
                }
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.CdnTransportEngine", e17.getLocalizedMessage());
            }
        }
        if (hVar.field_retCode == 0) {
            keep_onUploadSuccessed(str, hVar);
            return;
        }
        com.tencent.mm.autogen.mmdata.rpt.CdnDetailErrorsStruct cdnDetailErrorsStruct = new com.tencent.mm.autogen.mmdata.rpt.CdnDetailErrorsStruct();
        cdnDetailErrorsStruct.f55592h = cdnDetailErrorsStruct.b("filekey", str, true);
        cdnDetailErrorsStruct.f55588d = 0;
        cdnDetailErrorsStruct.f55589e = c2CUploadResult.detailErrorType;
        cdnDetailErrorsStruct.f55590f = c2CUploadResult.detailErrorCode;
        cdnDetailErrorsStruct.f55591g = c2CUploadResult.errorCode;
        cdnDetailErrorsStruct.f55593i = c2CUploadResult.filetype;
        cdnDetailErrorsStruct.f55594j = 0L;
        cdnDetailErrorsStruct.f55595k = 0L;
        cdnDetailErrorsStruct.f55596l = cdnDetailErrorsStruct.b("SystemErrorDescribe", c2CUploadResult.systemErrorDescribe, true);
        cdnDetailErrorsStruct.k();
        com.tencent.mars.xlog.Log.i("MicroMsg.CdnTransportEngine", "reportstr %s", cdnDetailErrorsStruct.n());
        keep_onUploadError(str, hVar);
    }

    @Override // com.tencent.mars.cdn.CdnManager.UploadCallbackV2
    public void onCanceled(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CdnTransportEngine", "UploadCallbackV2 onCanceled filekey:%s", str);
        dn.h hVar = new dn.h();
        hVar.f241766a = str;
        hVar.field_retCode = -10008;
        keep_onUploadError(str, hVar);
    }

    @Override // com.tencent.mars.cdn.CdnManager.UploadCallbackV2
    public void onCompleted(java.lang.String str, byte[] bArr) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = str;
        objArr[1] = java.lang.Integer.valueOf(bArr == null ? 0 : bArr.length);
        com.tencent.mars.xlog.Log.i("MicroMsg.CdnTransportEngine", "UploadCallbackV2 onCompleted filekey:%s resultPb.len:%d", objArr);
        dn.h hVar = new dn.h();
        hVar.f241766a = str;
        if (bArr == null || bArr.length == 0) {
            hVar.field_retCode = -10007;
        } else {
            try {
                com.tencent.mars.cdn.proto.UploadResult parseFrom = com.tencent.mars.cdn.proto.UploadResult.newBuilder().parseFrom(bArr);
                hVar.f241783r = parseFrom;
                hVar.field_retCode = parseFrom.getErrorCode();
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CdnTransportEngine", e17, "sceneResultFromPbUploadResult parse failed, filekey:%s", str);
                hVar.field_retCode = -10007;
            }
        }
        if (hVar.field_retCode == 0) {
            keep_onUploadSuccessed(str, hVar);
            return;
        }
        com.tencent.mm.autogen.mmdata.rpt.CdnDetailErrorsStruct cdnDetailErrorsStruct = new com.tencent.mm.autogen.mmdata.rpt.CdnDetailErrorsStruct();
        cdnDetailErrorsStruct.f55592h = cdnDetailErrorsStruct.b("filekey", str, true);
        cdnDetailErrorsStruct.f55588d = 0;
        cdnDetailErrorsStruct.f55589e = hVar.field_detailErrorType;
        cdnDetailErrorsStruct.f55590f = hVar.field_detailErrorCode;
        cdnDetailErrorsStruct.f55591g = hVar.field_retCode;
        cdnDetailErrorsStruct.f55593i = 0;
        cdnDetailErrorsStruct.f55594j = 0L;
        cdnDetailErrorsStruct.f55595k = 0L;
        cdnDetailErrorsStruct.k();
        com.tencent.mars.xlog.Log.i("MicroMsg.CdnTransportEngine", "UploadCallbackV2 reportstr %s", cdnDetailErrorsStruct.n());
        keep_onUploadError(str, hVar);
    }

    @Override // com.tencent.mars.cdn.CdnManager.VideoStreamingCallback
    public void onDataAvailable(java.lang.String str, long j17, long j18) {
        keep_onDataAvailable(str, j17, j18);
    }

    @Override // com.tencent.mars.cdn.CdnManager.DownloadCallback
    public void onDownloadNotifyPeerUploadFinish(java.lang.String str, boolean z17, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CdnTransportEngine", "onDownloadNotifyPeerUploadFinish filekey:" + str + " fileid:" + z17);
    }

    @Override // com.tencent.mars.cdn.CdnManager.DownloadCallback
    public void onDownloadProgressChanged(java.lang.String str, long j17, long j18, boolean z17) {
        dn.g gVar = new dn.g();
        gVar.field_finishedLength = j17;
        gVar.field_toltalLength = j18;
        gVar.field_status = 0;
        gVar.field_mtlnotify = z17;
        keep_onDownloadProgress(str, gVar);
    }

    @Override // com.tencent.mars.cdn.CdnManager.VideoStreamingCallback
    public void onDownloadToEnd(java.lang.String str, long j17, long j18) {
        keep_onDownloadToEnd(str, j17, j18);
    }

    @Override // com.tencent.mars.cdn.CdnManager.VideoStreamingCallback
    public void onM3U8Ready(java.lang.String str, java.lang.String str2) {
        sx.z zVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.CdnTransportEngine", "onM3U8Ready %s, %d, hash[%d]", str, java.lang.Integer.valueOf(str2.length()), java.lang.Integer.valueOf(hashCode()));
        sx.z zVar2 = this.f71057u;
        int onM3U8Ready = zVar2 != null ? zVar2.onM3U8Ready(str, str2) : 0;
        if (onM3U8Ready == 0 && (zVar = this.f71058v) != null) {
            onM3U8Ready = zVar.onM3U8Ready(str, str2);
        }
        sx.z zVar3 = this.f71059w;
        if (zVar3 != null) {
            onM3U8Ready = zVar3.onM3U8Ready(str, str2);
        }
        if (onM3U8Ready == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CdnTransportEngine", "cdn call on m3u8 ready but onlineVideoCallback is null.hash[%d]", java.lang.Integer.valueOf(hashCode()));
            jx3.f.INSTANCE.t(com.tencent.mm.plugin.appbrand.jsapi.nfc.m.CTRL_INDEX, 29);
        }
    }

    @Override // com.tencent.mars.cdn.CdnManager.VideoStreamingCallback
    public void onMoovReady(java.lang.String str, long j17, long j18, com.tencent.mars.cdn.CdnManager.VideoInfo videoInfo) {
        keep_onMoovReady(str, j17, j18, videoInfo);
    }

    @Override // com.tencent.mars.cdn.CdnManager.VideoStreamingCallback
    public void onMoovReadyWithFlag(java.lang.String str, long j17, long j18, java.lang.String str2) {
    }

    @Override // com.tencent.mars.cdn.CdnManager.VideoStreamingCallback
    public void onObtainMoovFailed(java.lang.String str, int i17) {
    }

    @Override // com.tencent.mars.cdn.CdnManager.VideoStreamingCallback
    public void onPreloadCompletedWithResult(java.lang.String str, long j17, long j18, com.tencent.mars.cdn.CdnManager.C2CDownloadResult c2CDownloadResult) {
        dn.f fVar;
        nk.c.f337940a.a(str, c2CDownloadResult, 3);
        long j19 = c2CDownloadResult.recvedBytes;
        c2CDownloadResult.recvedBytes = (int) j17;
        dn.h g17 = g(str, c2CDownloadResult, new dn.c());
        g17.field_recvedTotalBytes = j19;
        dn.f fVar2 = this.f71044e;
        if ((fVar2 != null ? fVar2.x(str, g17) : 0) == 0 && (fVar = this.f71045f) != null) {
            fVar.x(str, g17);
        }
        dn.f fVar3 = this.f71060x;
        if (fVar3 != null) {
            fVar3.x(str, g17);
        }
    }

    @Override // com.tencent.mars.cdn.CdnManager.UploadCallbackV2
    public void onProgressChanged(java.lang.String str, long j17, long j18) {
        onUploadProgressChanged(str, j17, j18);
        com.tencent.mars.xlog.Log.i("MicroMsg.CdnTransportEngine", "UploadCallbackV2 onProgressChanged filekey:%s finished:%d total:%d", str, java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
    }

    @Override // com.tencent.mars.cdn.CdnManager.AppCallback
    public void onTaskTearDown(java.lang.String str, com.tencent.mars.cdn.CdnManager.DownloadTaskProfile downloadTaskProfile, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CdnTransportEngine", "onTaskTearDown %s json %s", str, str2);
    }

    @Override // com.tencent.mars.cdn.CdnManager.UploadCallback
    public void onUploadProgressChanged(java.lang.String str, long j17, long j18) {
        dn.g gVar = new dn.g();
        gVar.field_finishedLength = j17;
        gVar.field_toltalLength = j18;
        gVar.field_status = 0;
        gVar.field_mtlnotify = false;
        keep_onUploadProgress(str, gVar);
    }

    public int p(dn.o oVar) {
        com.tencent.mars.cdn.CdnManager.C2CDownloadRequest c2CDownloadRequest = new com.tencent.mars.cdn.CdnManager.C2CDownloadRequest();
        c2CDownloadRequest.fileType = 20302;
        c2CDownloadRequest.fileKey = oVar.field_mediaId;
        c2CDownloadRequest.url = oVar.M1;
        c2CDownloadRequest.referer = oVar.N1;
        c2CDownloadRequest.setSavePath(oVar.field_fullpath);
        c2CDownloadRequest.isColdSnsData = oVar.R1;
        c2CDownloadRequest.isHotSnsVideo = oVar.f241798q;
        c2CDownloadRequest.isHLSVideo = oVar.f241799r;
        c2CDownloadRequest.hlsVideoFlag = "";
        c2CDownloadRequest.signalQuality = oVar.S1;
        c2CDownloadRequest.snsScene = oVar.T1;
        c2CDownloadRequest.preloadRatio = oVar.field_preloadRatio;
        c2CDownloadRequest.preloadMinSize = oVar.f241805x;
        c2CDownloadRequest.requestVideoFormat = oVar.field_requestVideoFormat;
        c2CDownloadRequest.connectionCount = oVar.f241806x0;
        c2CDownloadRequest.apptype = 205;
        c2CDownloadRequest.downloadBehavior = oVar.f241790i;
        c2CDownloadRequest.maxFileSize = oVar.X;
        if (!com.tencent.mm.platformtools.Test$CDN.cdnSNSDownloadDebugIP.isEmpty()) {
            java.lang.String str = com.tencent.mm.platformtools.Test$CDN.cdnSNSDownloadDebugIP;
            c2CDownloadRequest.debugIP = str;
            com.tencent.mars.xlog.Log.w("MicroMsg.CdnTransportEngine", "mediaid %s debugip %s", c2CDownloadRequest.fileKey, str);
        }
        return ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).startSNSDownload(c2CDownloadRequest, this, this, oVar.H1);
    }

    public int q(dn.m mVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CdnTransportEngine", "startURLDownload info mediaid:%s, savepath:%s", mVar.field_mediaId, mVar.field_fullpath);
        com.tencent.mars.cdn.CdnManager.C2CDownloadRequest c2CDownloadRequest = new com.tencent.mars.cdn.CdnManager.C2CDownloadRequest();
        c2CDownloadRequest.fileKey = mVar.field_mediaId;
        c2CDownloadRequest.url = mVar.f241811z;
        c2CDownloadRequest.setSavePath(mVar.field_fullpath);
        c2CDownloadRequest.aeskey = mVar.field_aesKey;
        c2CDownloadRequest.customHeader = "authkey:" + mVar.field_authKey + com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE;
        c2CDownloadRequest.taskGroupKey = mVar.W;
        c2CDownloadRequest.fileType = mVar.field_fileType;
        c2CDownloadRequest.maxFileSize = mVar.X;
        com.tencent.mars.cdn.proto.DownloadRequest downloadRequest = mVar.R;
        if (downloadRequest != null) {
            c2CDownloadRequest.cdnRequestPb = downloadRequest.toByteArrayOrNull();
        }
        if (!com.tencent.mm.platformtools.Test$CDN.cdnHttpDownloadDebugIP.isEmpty()) {
            java.lang.String str = com.tencent.mm.platformtools.Test$CDN.cdnHttpDownloadDebugIP;
            c2CDownloadRequest.debugIP = str;
            com.tencent.mars.xlog.Log.w("MicroMsg.CdnTransportEngine", "mediaid %s debugip %s", c2CDownloadRequest.fileKey, str);
        }
        return ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).startSNSDownload(c2CDownloadRequest, this, this, 0);
    }

    public int r(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4, java.lang.String str5, long j17, java.lang.String str6) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CdnTransportEngine", "startURLDownload: mediaid:%s, savepath:%s", str, str3);
        com.tencent.mars.cdn.CdnManager.C2CDownloadRequest c2CDownloadRequest = new com.tencent.mars.cdn.CdnManager.C2CDownloadRequest();
        c2CDownloadRequest.fileKey = str;
        c2CDownloadRequest.url = str2;
        c2CDownloadRequest.setSavePath(str3);
        c2CDownloadRequest.aeskey = str4;
        c2CDownloadRequest.customHeader = "authkey:" + str5 + com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE;
        c2CDownloadRequest.taskGroupKey = str6;
        c2CDownloadRequest.fileType = i17;
        if (!com.tencent.mm.platformtools.Test$CDN.cdnHttpDownloadDebugIP.isEmpty()) {
            java.lang.String str7 = com.tencent.mm.platformtools.Test$CDN.cdnHttpDownloadDebugIP;
            c2CDownloadRequest.debugIP = str7;
            com.tencent.mars.xlog.Log.w("MicroMsg.CdnTransportEngine", "mediaid %s debugip %s", c2CDownloadRequest.fileKey, str7);
        }
        return ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).startSNSDownload(c2CDownloadRequest, this, this, 0);
    }

    @Override // com.tencent.mars.cdn.CdnManager.AppCallback
    public void reportFlow(int i17, int i18, int i19, int i27) {
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            int i28 = i18 + i27;
            int i29 = i17 + i19;
            f71041y += i29;
            f71042z += i28;
            com.tencent.mars.xlog.Log.i("MicroMsg.CdnTransportEngine", "ReportFlow, wifi:s:%d, r:%d, mobile:s:%d, r:%d tr:%d, ts:%d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i19), java.lang.Long.valueOf(f71041y), java.lang.Long.valueOf(f71042z));
            keep_cdnSendAndRecvData("dummy clientmsgid", i28, i29);
        }
    }

    @Override // com.tencent.mars.cdn.CdnManager.AppCallback
    public void reportFlowWithTag(java.lang.String str, int i17, long j17, long j18, long j19, long j27) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CdnTransportEngine", "reportFlowWithTag tag %s seconds %d mobile %d wifi %d", str, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j19 + j27), java.lang.Long.valueOf(j17 + j18));
        ((kn4.d0) ((pf0.r) i95.n0.c(pf0.r.class))).getClass();
        kn4.c0.INSTANCE.b(str, j18, j17, j27, j19);
    }

    @Override // com.tencent.mars.cdn.CdnManager.AppCallback
    public void reportGroupIDKey(int[] iArr, int[] iArr2, int[] iArr3, int i17, boolean z17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i18 = 0; i18 < i17; i18++) {
            arrayList.add(new com.tencent.mars.smc.IDKey(iArr[i18], iArr2[i18], iArr3[i18]));
        }
        jx3.f.INSTANCE.b(arrayList, z17);
    }

    @Override // com.tencent.mars.cdn.CdnManager.AppCallback
    public void reportIDKey(long j17, long j18, long j19, boolean z17) {
        jx3.f.INSTANCE.idkeyStat(j17, j18, j19, z17);
    }

    @Override // com.tencent.mars.cdn.CdnManager.AppCallback
    public void reportKV(long j17, java.lang.String str, boolean z17, boolean z18, long j18) {
        jx3.f.INSTANCE.n((int) j17, (int) j18, str, z18, z17);
    }

    @Override // com.tencent.mars.cdn.CdnManager.AppCallback
    public void reportKVNoFreqLimit(long j17, java.lang.String str) {
        int i17 = (int) j17;
        if (this.f71054r.contains(java.lang.Integer.valueOf(i17))) {
            jx3.f.INSTANCE.p(i17, str, false, false, true);
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.CdnTransportEngine", "not allowed logid %d", java.lang.Long.valueOf(j17));
        }
    }

    @Override // com.tencent.mars.cdn.CdnManager.AppCallback
    public void requestGetCDN(int i17) {
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CdnTransportEngine", "requestgetcdn scene %d", java.lang.Integer.valueOf(i17));
            keep_OnRequestDoGetCdnDnsInfo(i17);
        }
    }

    @Override // com.tencent.mars.cdn.CdnManager.AppCallback
    public void requestSnsGetCdnDistance(int i17, int i18, int i19) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CdnTransportEngine", "requestSnsGetCdnDistance version %d prov %d city %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        gm0.j1.d().g(new com.tencent.mm.modelcdntran.w2(i17, i18, i19));
    }

    @Override // com.tencent.mars.cdn.CdnManager.AppCallback
    public java.lang.String[] resolveHost(java.lang.String str, boolean z17, int[] iArr) {
        if (!com.tencent.mm.sdk.platformtools.x2.n()) {
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CdnTransportEngine", "try resolve host %s, isdc %b", str, java.lang.Boolean.valueOf(z17));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        iArr[0] = com.tencent.mm.network.n.f(str, z17, arrayList);
        java.lang.String[] strArr = (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
        com.tencent.mars.xlog.Log.i("MicroMsg.CdnTransportEngine", "resolved dnstype %d iplist %s", java.lang.Integer.valueOf(iArr[0]), java.util.Arrays.toString(strArr));
        return strArr;
    }

    public int s(dn.m mVar, int i17) {
        return ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).startVideoStreamingDownload(a(mVar), this, this, i17);
    }

    public int t(dn.m mVar) {
        return ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).startC2CDownload(a(mVar), this);
    }

    public int u(dn.m mVar) {
        int i17;
        boolean z17 = false;
        if (j62.e.g().c(new com.tencent.mm.repairer.config.msgsend.RepairerConfigFileUploadNewApi()) == 1 && mVar.Q != null && ((i17 = mVar.field_fileType) == 5 || i17 == 7)) {
            z17 = true;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CdnTransportEngine", "startupUploadMedia use new api, mediaId:%s, fileType:%d", mVar.field_mediaId, java.lang.Integer.valueOf(mVar.field_fileType));
            return ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).startUploadTask(mVar.Q.toByteArrayOrNull(), this);
        }
        com.tencent.mars.cdn.CdnManager.C2CUploadRequest z18 = z(mVar);
        return z18.sendmsgFromCDN ? ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).startSSUpload(z18, this, this) : ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).startC2CUpload(z18, this);
    }

    public int v(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CdnTransportEngine", "stopGamePackageDownload: mediaid:" + str);
        ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).cancelTask(str);
        return 0;
    }

    public int w(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CdnTransportEngine", "stopHttpsDownload: mediaid:" + str);
        ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).cancelTask(str);
        return 0;
    }

    public int x(java.lang.String str, dn.h hVar) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.CdnTransportEngine", "[stopVideoStreamingDownload] mediaId=%s %s", str, new com.tencent.mm.sdk.platformtools.z3());
        com.tencent.mars.cdn.CdnManager.C2CDownloadResult c2CDownloadResult = new com.tencent.mars.cdn.CdnManager.C2CDownloadResult();
        int cancelDownloadTaskWithResult = ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).cancelDownloadTaskWithResult(str, c2CDownloadResult);
        nk.c.f337940a.a(str, c2CDownloadResult, 2);
        g(str, c2CDownloadResult, hVar);
        return cancelDownloadTaskWithResult;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.tencent.mars.cdn.CdnManager.CdnInfo y(r45.ms r8) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.modelcdntran.l1.y(r45.ms):com.tencent.mars.cdn.CdnManager$CdnInfo");
    }

    public final com.tencent.mars.cdn.CdnManager.C2CUploadRequest z(dn.m mVar) {
        com.tencent.mars.cdn.CdnManager.C2CUploadRequest c2CUploadRequest = new com.tencent.mars.cdn.CdnManager.C2CUploadRequest();
        c2CUploadRequest.fileKey = mVar.field_mediaId;
        c2CUploadRequest.setFilePath(mVar.field_fullpath);
        c2CUploadRequest.setMidimgPath(mVar.field_midimgpath);
        c2CUploadRequest.setThumbfilePath(mVar.field_thumbpath);
        c2CUploadRequest.fileFormat = mVar.field_fileFormat;
        c2CUploadRequest.midFormat = mVar.field_midFormat;
        c2CUploadRequest.fileType = mVar.field_fileType;
        c2CUploadRequest.fileBuffer = mVar.f241792m;
        c2CUploadRequest.thumbnailBuffer = mVar.f241794o;
        c2CUploadRequest.thumbFileType = mVar.f241793n;
        com.tencent.mars.cdn.CdnManager.FileInfo[] fileInfoArr = mVar.f241795p;
        c2CUploadRequest.files = fileInfoArr;
        if (fileInfoArr != null) {
            for (com.tencent.mars.cdn.CdnManager.FileInfo fileInfo : fileInfoArr) {
                fileInfo.path = com.tencent.mm.vfs.w6.i(fileInfo.path, false);
            }
        }
        c2CUploadRequest.forwardAeskey = mVar.field_aesKey;
        c2CUploadRequest.forwardFileid = mVar.field_fileId;
        c2CUploadRequest.queueTimeoutSeconds = mVar.A;
        c2CUploadRequest.transforTimeoutSeconds = mVar.B;
        c2CUploadRequest.toUser = mVar.field_talker;
        c2CUploadRequest.netflowTag = "";
        c2CUploadRequest.sendmsgFromCDN = mVar.field_sendmsg_viacdn;
        c2CUploadRequest.chatType = mVar.field_chattype;
        int i17 = mVar.f241789h;
        c2CUploadRequest.bizid = i17;
        if (i17 == 0) {
            c2CUploadRequest.bizid = 1;
            if (mVar.field_bzScene != 0) {
                c2CUploadRequest.bizid = 3;
            }
        }
        int i18 = mVar.field_appType;
        c2CUploadRequest.apptype = i18;
        if (i18 == -1 && c2CUploadRequest.bizid == 1) {
            c2CUploadRequest.apptype = 1;
        }
        if (mVar.field_bzScene == 0 && mVar.field_needStorage) {
            c2CUploadRequest.bizid = 2;
            c2CUploadRequest.apptype = 10;
        }
        int i19 = c2CUploadRequest.bizid;
        if (i19 == 1) {
            c2CUploadRequest.debugIP = com.tencent.mm.platformtools.Test$CDN.cdnC2CUploadDebugIP;
        } else if (i19 == 2) {
            c2CUploadRequest.debugIP = com.tencent.mm.platformtools.Test$CDN.cdnFavoriteUploadDebugIP;
        } else if (i19 == 3) {
            int i27 = c2CUploadRequest.apptype;
            if (i27 < 100 || i27 > 117 || c2CUploadRequest.fileType != 20201) {
                c2CUploadRequest.debugIP = com.tencent.mm.platformtools.Test$CDN.cdnSNSUploadDebugIP;
            } else {
                c2CUploadRequest.debugIP = com.tencent.mm.platformtools.Test$CDN.cdnFriendsImageUploadDebugIP;
            }
        } else if (i19 == 5) {
            c2CUploadRequest.debugIP = com.tencent.mm.platformtools.Test$CDN.cdnDCUploadDebugIP;
        }
        if (!c2CUploadRequest.debugIP.isEmpty()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.CdnTransportEngine", "mediaid %s debugip %s", c2CUploadRequest.fileKey, c2CUploadRequest.debugIP);
        }
        if (!com.tencent.mm.platformtools.Test$CDN.cdnSingleSignGroupKey.isEmpty()) {
            java.lang.String str = com.tencent.mm.platformtools.Test$CDN.cdnSingleSignGroupKey;
            c2CUploadRequest.serverGroupKey = str;
            com.tencent.mars.xlog.Log.w("MicroMsg.CdnTransportEngine", "mediaid %s server group key %s", c2CUploadRequest.fileKey, str);
        }
        c2CUploadRequest.checkExistOnly = mVar.field_onlycheckexist;
        c2CUploadRequest.isSmallVideo = mVar.field_smallVideoFlag == 1;
        c2CUploadRequest.isLargeSVideo = mVar.field_largesvideo;
        c2CUploadRequest.videoSource = mVar.field_videosource;
        c2CUploadRequest.isSnsAdVideo = mVar.field_advideoflag == 1;
        c2CUploadRequest.isStorageMode = mVar.field_needStorage;
        c2CUploadRequest.enableHitCheck = mVar.field_enable_hitcheck;
        c2CUploadRequest.forceNoSafeCdn = mVar.field_force_aeskeycdn;
        c2CUploadRequest.trySafeCdn = mVar.field_trysafecdn;
        java.lang.String str2 = mVar.field_svr_signature;
        c2CUploadRequest.bigfileSignature = str2;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            c2CUploadRequest.bigfileSignature = "";
        }
        java.lang.String str3 = mVar.field_fake_bigfile_signature;
        c2CUploadRequest.fakeBigfileSignature = str3;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            c2CUploadRequest.fakeBigfileSignature = "";
        }
        java.lang.String str4 = mVar.field_fake_bigfile_signature_aeskey;
        c2CUploadRequest.fakeBigfileSignatureAeskey = str4;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
            c2CUploadRequest.fakeBigfileSignatureAeskey = "";
        }
        c2CUploadRequest.emojiExtinfo = mVar.L;
        c2CUploadRequest.customHeader = mVar.N;
        c2CUploadRequest.concurrentCount = mVar.f241809y0;
        c2CUploadRequest.clientTag = "";
        c2CUploadRequest.bizReqPayLoad = mVar.P;
        c2CUploadRequest.tryRealtimeTransportProtocol = false;
        c2CUploadRequest.bizSnsPreUpload = mVar.C1;
        c2CUploadRequest.uri = mVar.S;
        com.tencent.mars.cdn.proto.UploadRequest uploadRequest = mVar.Q;
        if (uploadRequest != null) {
            c2CUploadRequest.cdnRequestPb = uploadRequest.toByteArrayOrNull();
        }
        return c2CUploadRequest;
    }

    public void keep_onMoovReady(java.lang.String mediaID, long j17, long j18, com.tencent.mars.cdn.CdnManager.VideoInfo videoInfo) {
        java.lang.Object obj;
        sx.z zVar;
        sx.z zVar2;
        com.tencent.mars.xlog.Log.i("MicroMsg.CdnTransportEngine", "onMoovReady filekey:%s off:%d len:%d flag:%s videoFormat:%d oriVideoFormat:%d", mediaID, java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), videoInfo.svrFlag, java.lang.Integer.valueOf(videoInfo.videoFormat), java.lang.Integer.valueOf(videoInfo.oriVideoFormat));
        nk.c cVar = nk.c.f337940a;
        kotlin.jvm.internal.o.g(mediaID, "mediaID");
        com.tencent.mars.xlog.Log.i("MicroMsg.DownloadAnalyse", "onMoovReady mediaID:" + mediaID + " offset:" + j17 + " length:" + j18);
        java.util.Iterator it = nk.c.f337942c.f53188d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (kotlin.jvm.internal.o.b(((com.tencent.mm.analyse.DownloadAnalyse$DownloadIndicator) obj).f53190e, mediaID)) {
                    break;
                }
            }
        }
        com.tencent.mm.analyse.DownloadAnalyse$DownloadIndicator downloadAnalyse$DownloadIndicator = (com.tencent.mm.analyse.DownloadAnalyse$DownloadIndicator) obj;
        if (downloadAnalyse$DownloadIndicator != null) {
            java.lang.String str = "rsp-" + videoInfo.svrFlag;
            kotlin.jvm.internal.o.g(str, "<set-?>");
            downloadAnalyse$DownloadIndicator.f53193h = str;
        }
        sx.z zVar3 = this.f71057u;
        int d17 = zVar3 != null ? zVar3.d(mediaID, (int) j17, (int) j18, videoInfo) : 0;
        if (d17 == 0 && (zVar2 = this.f71058v) != null) {
            d17 = zVar2.d(mediaID, (int) j17, (int) j18, videoInfo);
        }
        if (d17 == 0 && (zVar = this.f71059w) != null) {
            d17 = zVar.d(mediaID, (int) j17, (int) j18, videoInfo);
        }
        if (d17 == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CdnTransportEngine", "cdn call on moov ready but onlineVideoCallback is null.hash[%d]", java.lang.Integer.valueOf(hashCode()));
            jx3.f.INSTANCE.t(com.tencent.mm.plugin.appbrand.jsapi.nfc.m.CTRL_INDEX, 29);
        }
    }
}
