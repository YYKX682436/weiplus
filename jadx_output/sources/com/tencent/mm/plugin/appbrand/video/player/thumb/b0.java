package com.tencent.mm.plugin.appbrand.video.player.thumb;

/* loaded from: classes12.dex */
public final class b0 implements com.tencent.mars.cdn.CdnManager.DownloadCallback, com.tencent.mars.cdn.CdnManager.VideoStreamingCallback, com.tencent.mars.cdn.CdnManager.AppCallback, xh3.d, yh3.b, dn.f {

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f90868f;

    /* renamed from: d, reason: collision with root package name */
    public sx.z f90869d;

    /* renamed from: e, reason: collision with root package name */
    public dn.f f90870e;

    static {
        new com.tencent.mm.plugin.appbrand.video.player.thumb.a0(null);
        f90868f = jz5.h.a(jz5.i.f302829d, com.tencent.mm.plugin.appbrand.video.player.thumb.z.f90925d);
    }

    public b0(kotlin.jvm.internal.i iVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebviewCdnService", "ipcinvoke start");
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        h0Var.f310123d = new java.util.concurrent.CountDownLatch(1);
        java.lang.String PROCESS_MAIN = com.tencent.mm.sdk.platformtools.w9.f193053a;
        kotlin.jvm.internal.o.f(PROCESS_MAIN, "PROCESS_MAIN");
        com.tencent.mm.ipcinvoker.f.a(PROCESS_MAIN, com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d, com.tencent.mm.plugin.appbrand.video.player.thumb.x.f90922d, new com.tencent.mm.plugin.appbrand.video.player.thumb.y(this, h0Var));
        ((java.util.concurrent.CountDownLatch) h0Var.f310123d).await();
        com.tencent.mars.xlog.Log.i("MicroMsg.WebviewCdnService", "ipcinvoke end");
    }

    @Override // dn.f
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // dn.f
    public int a(java.lang.String str, dn.g gVar, dn.h hVar) {
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // yh3.b
    public int b(java.lang.String mediaId, dn.h result) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(result, "result");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebviewCdnService", "[stopVideoStreamingDownload] mediaId=%s %s", mediaId, new com.tencent.mm.sdk.platformtools.z3());
        com.tencent.mars.cdn.CdnManager.C2CDownloadResult c2CDownloadResult = new com.tencent.mars.cdn.CdnManager.C2CDownloadResult();
        int cancelDownloadTaskWithResult = ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).cancelDownloadTaskWithResult(mediaId, c2CDownloadResult);
        f(c2CDownloadResult, result);
        return cancelDownloadTaskWithResult;
    }

    @Override // yh3.b
    public int c(java.lang.String mediaId, long j17, long j18, int i17) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        return ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).requestVideoData(mediaId, j17, j18, i17);
    }

    @Override // com.tencent.mars.cdn.CdnManager.AppCallback
    public java.lang.String[] combineResolveHost(java.lang.String str, int i17, int i18, int[] iArr) {
        com.tencent.mars.xlog.Log.e("MicroMsg.WebviewCdnService", "resolveHost not impl!");
        return new java.lang.String[0];
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a7, code lost:
    
        if (r26.n0.K(r3, 'X', 0, false, 6, null) >= 0) goto L18;
     */
    @Override // yh3.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int d(dn.m r10, int r11) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.video.player.thumb.b0.d(dn.m, int):int");
    }

    public final int e(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebviewCdnService", "ipFromString %s ->", str);
        int i17 = 0;
        if (!r26.n0.D(str, ".", false, 2, null) && !r26.n0.D(str, ":", false, 2, null)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebviewCdnService", "invalid ip str.");
            return 0;
        }
        byte[] address = java.net.InetAddress.getByName(str).getAddress();
        kotlin.jvm.internal.o.f(address, "getAddress(...)");
        int length = address.length;
        int i18 = 0;
        while (i17 < length) {
            try {
                i18 = (i18 << 8) | (address[i17] & 255);
                i17++;
            } catch (java.lang.NullPointerException | java.net.UnknownHostException unused) {
                i17 = i18;
                i18 = i17;
                com.tencent.mars.xlog.Log.i("MicroMsg.WebviewCdnService", "<- ipFromString %s --> %d", str, java.lang.Integer.valueOf(i18));
                return i18;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebviewCdnService", "<- ipFromString %s --> %d", str, java.lang.Integer.valueOf(i18));
        return i18;
    }

    public final dn.h f(com.tencent.mars.cdn.CdnManager.C2CDownloadResult c2CDownloadResult, dn.h hVar) {
        if (hVar == null) {
            hVar = new dn.h();
        }
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
        java.lang.String clientIP = c2CDownloadResult.clientIP;
        hVar.field_clientIP = clientIP;
        hVar.field_serverIP = c2CDownloadResult.serverIP;
        kotlin.jvm.internal.o.f(clientIP, "clientIP");
        hVar.field_clientHostIP = e(clientIP);
        java.lang.String serverIP = c2CDownloadResult.serverIP;
        kotlin.jvm.internal.o.f(serverIP, "serverIP");
        hVar.field_serverHostIP = e(serverIP);
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
            hVar.f241769d = c2CDownloadResult.usedSvrIps[r0.length - 1];
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
            com.tencent.mars.xlog.Log.i("MicroMsg.WebviewCdnService", "snsvideo mode %d usecold %b useprov %d exptid %d strategy %s", java.lang.Integer.valueOf(sNSVideoProfile.mode), java.lang.Boolean.valueOf(hVar.f241779n.useColdRule), java.lang.Integer.valueOf(hVar.f241779n.usedProvince), java.lang.Integer.valueOf(hVar.f241779n.experimentalGroupID), hVar.f241779n.strategy);
        }
        com.tencent.mars.cdn.CdnManager.VideoInfo videoInfo = hVar.f241780o;
        if (videoInfo != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebviewCdnService", "snsvideo flag %s flag %d rawflag %d", videoInfo.svrFlag, java.lang.Integer.valueOf(videoInfo.videoFormat), java.lang.Integer.valueOf(hVar.f241780o.oriVideoFormat));
        }
        return hVar;
    }

    @Override // com.tencent.mars.cdn.CdnManager.AppCallback
    public boolean isUsingWangKaService(int i17) {
        return false;
    }

    @Override // com.tencent.mars.cdn.CdnManager.AppCallback
    public void onBadNetworkProbed() {
    }

    @Override // com.tencent.mars.cdn.CdnManager.DownloadCallback
    public void onC2CDownloadCompleted(java.lang.String str, com.tencent.mars.cdn.CdnManager.C2CDownloadResult result) {
        com.tencent.mars.cdn.CdnManager.CronetTaskResult cronetTaskResult;
        kotlin.jvm.internal.o.g(result, "result");
        com.tencent.mars.xlog.Log.i("MicroMsg.WebviewCdnService", "onC2CDownloadCompleted filekey %s error %d", str, java.lang.Integer.valueOf(result.errorCode));
        dn.h f17 = f(result, null);
        if (result.fromCronet && (cronetTaskResult = result.cronetTaskResult) != null) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = cronetTaskResult.useHttp2 ? "true" : "false";
            objArr[1] = cronetTaskResult.useQuic ? "true" : "false";
            objArr[2] = java.lang.Integer.valueOf(cronetTaskResult.statusCode);
            com.tencent.mars.xlog.Log.i("MicroMsg.WebviewCdnService", "cronet this task is from cronet ,use http2 %s, use quic %s, status code %d ", objArr);
            com.tencent.mars.cdn.CdnManager.WebPageProfile webPageProfile = result.cronetTaskResult.performance;
            com.tencent.mars.xlog.Log.i("MicroMsg.WebviewCdnService", "cronet webperformance ip:%s, protocol:%s", webPageProfile.peerIP, webPageProfile.protocol);
            com.tencent.mars.cdn.CdnManager.CronetTaskResult cronetTaskResult2 = new com.tencent.mars.cdn.CdnManager.CronetTaskResult();
            com.tencent.mars.cdn.CdnManager.CronetTaskResult cronetTaskResult3 = result.cronetTaskResult;
            cronetTaskResult2.useQuic = cronetTaskResult3.useQuic;
            cronetTaskResult2.useHttp2 = cronetTaskResult3.useHttp2;
            cronetTaskResult2.statusCode = cronetTaskResult3.statusCode;
            cronetTaskResult2.statusText = cronetTaskResult3.statusText;
            cronetTaskResult2.performance = cronetTaskResult3.performance;
            f17.field_httpStatusCode = cronetTaskResult3.statusCode;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis() - result.taskStartTime;
        if (30001 == result.fileType && result.fromCronet) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebviewCdnService", "cronet task use cronet download time " + currentTimeMillis);
            com.tencent.mars.cdn.CdnManager.CronetTaskResult cronetTaskResult4 = result.cronetTaskResult;
            if (cronetTaskResult4 != null) {
                if (cronetTaskResult4.useQuic) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebviewCdnService", "cronet task use cronet quic download time " + currentTimeMillis);
                } else if (cronetTaskResult4.useHttp2) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebviewCdnService", "cronet task use cronet http2 download time " + currentTimeMillis);
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebviewCdnService", "cronet task use cronet http1.x download time " + currentTimeMillis);
                }
            }
        }
        if (f17.field_retCode != 0) {
            sx.z zVar = this.f90869d;
            if (zVar != null) {
                zVar.a(str, null, f17);
            }
            dn.f fVar = this.f90870e;
            if (fVar != null) {
                fVar.a(str, null, f17);
                return;
            }
            return;
        }
        sx.z zVar2 = this.f90869d;
        if (zVar2 != null) {
            zVar2.a(str, null, f17);
        }
        dn.f fVar2 = this.f90870e;
        if (fVar2 != null) {
            fVar2.a(str, null, f17);
        }
    }

    @Override // com.tencent.mars.cdn.CdnManager.VideoStreamingCallback
    public void onDataAvailable(java.lang.String str, long j17, long j18) {
        sx.z zVar = this.f90869d;
        if (zVar != null) {
            zVar.c(str, (int) j17, (int) j18);
        }
    }

    @Override // com.tencent.mars.cdn.CdnManager.DownloadCallback
    public void onDownloadProgressChanged(java.lang.String str, long j17, long j18, boolean z17) {
        dn.g gVar = new dn.g();
        gVar.field_finishedLength = j17;
        gVar.field_toltalLength = j18;
        gVar.field_status = 0;
        gVar.field_mtlnotify = z17;
        gVar.field_isUploadTask = false;
        dn.f fVar = this.f90870e;
        if (fVar != null) {
            fVar.a(str, gVar, null);
        }
        sx.z zVar = this.f90869d;
        if (zVar != null) {
            zVar.a(str, gVar, null);
        }
    }

    @Override // com.tencent.mars.cdn.CdnManager.VideoStreamingCallback
    public void onDownloadToEnd(java.lang.String str, long j17, long j18) {
        sx.z zVar = this.f90869d;
        if (zVar != null) {
            zVar.c(str, (int) j17, (int) j18);
        }
    }

    @Override // com.tencent.mars.cdn.CdnManager.VideoStreamingCallback
    public void onM3U8Ready(java.lang.String str, java.lang.String str2) {
        sx.z zVar = this.f90869d;
        if (zVar != null) {
            zVar.onM3U8Ready(str, str2);
        }
    }

    @Override // com.tencent.mars.cdn.CdnManager.VideoStreamingCallback
    public void onMoovReady(java.lang.String str, long j17, long j18, com.tencent.mars.cdn.CdnManager.VideoInfo videoInfo) {
        sx.z zVar = this.f90869d;
        if (zVar != null) {
            zVar.d(str, (int) j17, (int) j18, videoInfo);
        }
    }

    @Override // com.tencent.mars.cdn.CdnManager.VideoStreamingCallback
    public void onMoovReadyWithFlag(java.lang.String str, long j17, long j18, java.lang.String str2) {
    }

    @Override // com.tencent.mars.cdn.CdnManager.VideoStreamingCallback
    public void onObtainMoovFailed(java.lang.String str, int i17) {
    }

    @Override // com.tencent.mars.cdn.CdnManager.VideoStreamingCallback
    public void onPreloadCompletedWithResult(java.lang.String str, long j17, long j18, com.tencent.mars.cdn.CdnManager.C2CDownloadResult c2CDownloadResult) {
        kotlin.jvm.internal.o.d(c2CDownloadResult);
        long j19 = c2CDownloadResult.recvedBytes;
        c2CDownloadResult.recvedBytes = (int) j17;
        dn.h f17 = f(c2CDownloadResult, null);
        f17.field_recvedTotalBytes = j19;
        dn.f fVar = this.f90870e;
        if (fVar != null) {
            fVar.x(str, f17);
        }
    }

    @Override // com.tencent.mars.cdn.CdnManager.AppCallback
    public void onTaskTearDown(java.lang.String str, com.tencent.mars.cdn.CdnManager.DownloadTaskProfile downloadTaskProfile, java.lang.String str2) {
    }

    @Override // com.tencent.mars.cdn.CdnManager.AppCallback
    public void reportFlow(int i17, int i18, int i19, int i27) {
    }

    @Override // com.tencent.mars.cdn.CdnManager.AppCallback
    public void reportFlowWithTag(java.lang.String str, int i17, long j17, long j18, long j19, long j27) {
        ((kn4.d0) ((pf0.r) i95.n0.c(pf0.r.class))).getClass();
        kn4.c0.INSTANCE.b(str, j18, j17, j27, j19);
    }

    @Override // com.tencent.mars.cdn.CdnManager.AppCallback
    public void reportGroupIDKey(int[] idArray, int[] keyArray, int[] valueArray, int i17, boolean z17) {
        kotlin.jvm.internal.o.g(idArray, "idArray");
        kotlin.jvm.internal.o.g(keyArray, "keyArray");
        kotlin.jvm.internal.o.g(valueArray, "valueArray");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i18 = 0; i18 < i17; i18++) {
            arrayList.add(new com.tencent.mars.smc.IDKey(idArray[i18], keyArray[i18], valueArray[i18]));
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
        com.tencent.mars.xlog.Log.w("MicroMsg.WebviewCdnService", "!no impl!");
    }

    @Override // com.tencent.mars.cdn.CdnManager.AppCallback
    public void requestGetCDN(int i17) {
    }

    @Override // com.tencent.mars.cdn.CdnManager.AppCallback
    public void requestSnsGetCdnDistance(int i17, int i18, int i19) {
    }

    @Override // com.tencent.mars.cdn.CdnManager.AppCallback
    public java.lang.String[] resolveHost(java.lang.String str, boolean z17, int[] iArr) {
        if (iArr != null) {
            kotlin.jvm.internal.o.f(java.util.Arrays.toString(iArr), "toString(...)");
        }
        return new java.lang.String[0];
    }

    @Override // dn.f
    public byte[] w(java.lang.String str, byte[] bArr) {
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // dn.f
    public int x(java.lang.String str, dn.h hVar) {
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }
}
