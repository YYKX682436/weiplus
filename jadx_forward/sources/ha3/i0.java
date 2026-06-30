package ha3;

/* loaded from: classes12.dex */
public final class i0 implements com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoStreamingCallback, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.DownloadCallback, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.AppCallback {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f361406d = new java.util.HashMap();

    public final int a(dn.o task) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayerCdnService", "addDownloadTask mediaId: " + task.f69601xaca5bdda);
        com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest c2CDownloadRequest = new com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest();
        c2CDownloadRequest.f17792xcd096f43 = task.f69601xaca5bdda;
        c2CDownloadRequest.url = task.M1;
        c2CDownloadRequest.f17823x40acd92d = task.N1;
        c2CDownloadRequest.m37861xfb0731c4(task.f69595x6d25b0d9);
        c2CDownloadRequest.f17793xd428dad6 = 0;
        c2CDownloadRequest.f17780x81527598 = 10;
        c2CDownloadRequest.f17820x5e9d4f82 = task.f69608x6ac8fea7;
        c2CDownloadRequest.f17819x31507f2a = task.f323338x;
        int m37787x52efc79 = ((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37787x52efc79(c2CDownloadRequest, this, this, task.H1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayerCdnService", "startHttpVideoStreamingDownload result: " + m37787x52efc79);
        if (m37787x52efc79 == 0) {
            java.util.HashMap hashMap = this.f361406d;
            java.lang.String field_mediaId = task.f69601xaca5bdda;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_mediaId, "field_mediaId");
            hashMap.put(field_mediaId, task);
        }
        return m37787x52efc79;
    }

    public final int b(java.lang.String mediaId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayerCdnService", "cancelDownloadTask mediaId: ".concat(mediaId));
        int m37740x55b651aa = ((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37740x55b651aa(mediaId, new com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadResult());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayerCdnService", "cancelDownloadTaskWithResult result: " + m37740x55b651aa);
        if (m37740x55b651aa == 0) {
            this.f361406d.remove(mediaId);
        }
        return m37740x55b651aa;
    }

    public final int c(java.lang.String mediaId, long j17, long j18, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayerCdnService", "requestVideoData mediaId: " + mediaId + " offset: " + j17 + " length: " + j18 + " duration_ms: " + i17);
        return ((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37765xff4560f6(mediaId, j17, j18, i17);
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.AppCallback
    /* renamed from: combineResolveHost */
    public java.lang.String[] mo37799x705052f5(java.lang.String str, int i17, int i18, int[] iArr) {
        return new java.lang.String[0];
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.AppCallback
    /* renamed from: isUsingWangKaService */
    public boolean mo37800xc9848262(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayerCdnService", "isUsingWangKaService wkType: " + i17);
        return false;
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.AppCallback
    /* renamed from: onBadNetworkProbed */
    public void mo37801x4491727c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayerCdnService", "onBadNetworkProbed");
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.DownloadCallback
    /* renamed from: onC2CDownloadCompleted */
    public void mo562xf8a76f8e(java.lang.String str, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadResult c2CDownloadResult) {
        dn.n nVar;
        dn.n nVar2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayerCdnService", "onC2CDownloadCompleted mediaId: " + str + " result: " + c2CDownloadResult);
        dn.o oVar = (dn.o) this.f361406d.get(str);
        dn.h hVar = new dn.h();
        if (c2CDownloadResult == null) {
            if (oVar == null || (nVar = oVar.f323348c2) == null) {
                return;
            }
            nVar.g(str, -1, null);
            return;
        }
        hVar.f69548xe026fea1 = c2CDownloadResult.f17900x7467a666;
        hVar.f69523x17c343e7 = c2CDownloadResult.f17873xd4282b9d;
        if (oVar == null || (nVar2 = oVar.f323348c2) == null) {
            return;
        }
        nVar2.g(str, c2CDownloadResult.f17871x139cb015, hVar);
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoStreamingCallback
    /* renamed from: onDataAvailable */
    public void mo37930x9bb59ea0(java.lang.String str, long j17, long j18) {
        dn.n nVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayerCdnService", "onDataAvailable mediaId: " + str + " offset: " + j17 + " length: " + j18);
        dn.o oVar = (dn.o) this.f361406d.get(str);
        if (oVar == null || (nVar = oVar.f323348c2) == null) {
            return;
        }
        nVar.mo65706x9bb59ea0(str, j17, j18);
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.DownloadCallback
    /* renamed from: onDownloadProgressChanged */
    public void mo563x617c4940(java.lang.String str, long j17, long j18, boolean z17) {
        dn.n nVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayerCdnService", "onDownloadProgressChanged mediaId: " + str + " offset: " + j17 + " total: " + j18 + " tryShow: " + z17);
        dn.o oVar = (dn.o) this.f361406d.get(str);
        if (oVar == null || (nVar = oVar.f323348c2) == null) {
            return;
        }
        nVar.f(str, j17, j18);
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoStreamingCallback
    /* renamed from: onDownloadToEnd */
    public void mo37931x34576d19(java.lang.String str, long j17, long j18) {
        dn.n nVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayerCdnService", "onDataAvailable mediaId: " + str + " offset: " + j17 + " length: " + j18);
        dn.o oVar = (dn.o) this.f361406d.get(str);
        if (oVar == null || (nVar = oVar.f323348c2) == null) {
            return;
        }
        nVar.f(str, j17, j18);
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoStreamingCallback
    /* renamed from: onM3U8Ready */
    public void mo37932xc5dd699b(java.lang.String str, java.lang.String str2) {
        dn.n nVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayerCdnService", "onM3U8Ready mediaId: " + str + ", m3u8: " + str2);
        dn.o oVar = (dn.o) this.f361406d.get(str);
        if (oVar == null || (nVar = oVar.f323348c2) == null) {
            return;
        }
        nVar.mo65707xc5dd699b(str, str2);
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoStreamingCallback
    /* renamed from: onMoovReady */
    public void mo37933xe7d268fb(java.lang.String str, long j17, long j18, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoInfo videoInfo) {
        dn.n nVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayerCdnService", "onMoovReady mediaId: " + str + " offset: " + j17 + " length: " + j18 + " videoInfo: " + videoInfo);
        dn.o oVar = (dn.o) this.f361406d.get(str);
        if (oVar == null || (nVar = oVar.f323348c2) == null) {
            return;
        }
        nVar.mo65708xe7d268fb(str, j17, j18, videoInfo);
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoStreamingCallback
    /* renamed from: onMoovReadyWithFlag */
    public void mo37934xedc4f36d(java.lang.String str, long j17, long j18, java.lang.String str2) {
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoStreamingCallback
    /* renamed from: onObtainMoovFailed */
    public void mo37935x6e07772a(java.lang.String str, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppVideoPlayerCdnService", "onObtainMoovFailed mediaId: " + str + " reason: " + i17);
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoStreamingCallback
    /* renamed from: onPreloadCompletedWithResult */
    public void mo37936x23ba0da4(java.lang.String str, long j17, long j18, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadResult c2CDownloadResult) {
        dn.n nVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayerCdnService", "onPreloadCompletedWithResult mediaId: " + str + " offset: " + j17 + " length: " + j18 + " result: " + c2CDownloadResult);
        dn.o oVar = (dn.o) this.f361406d.get(str);
        if (oVar == null || (nVar = oVar.f323348c2) == null) {
            return;
        }
        nVar.f(str, j17, j18);
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.AppCallback
    /* renamed from: onTaskTearDown */
    public void mo37802xb2a6aa48(java.lang.String str, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.DownloadTaskProfile downloadTaskProfile, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayerCdnService", "onTaskTearDown mediaKey: " + str + ", profile: " + downloadTaskProfile + ", reportJson: " + str2);
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.AppCallback
    /* renamed from: reportFlow */
    public void mo37803x73181082(int i17, int i18, int i19, int i27) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayerCdnService", "reportFlow wifi_recv: " + i17 + ", wifi_send: " + i18 + ", mobile_recv: " + i19 + ", mobile_send: " + i27);
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.AppCallback
    /* renamed from: reportFlowWithTag */
    public void mo37804xe90cea12(java.lang.String str, int i17, long j17, long j18, long j19, long j27) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayerCdnService", "reportFlowWithTag tag: " + str + ", durationSeconds: " + i17 + ", wifi_recv: " + j17 + ", wifi_send: " + j18 + ", mobile_recv: " + j19 + ", mobile_send: " + j27);
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.AppCallback
    /* renamed from: reportGroupIDKey */
    public void mo37805xc9114479(int[] iArr, int[] iArr2, int[] iArr3, int i17, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayerCdnService", "reportGroupIDKey idArray: " + iArr + ", keyArray: " + iArr2 + ", valueArray: " + iArr3 + ", arraySize: " + i17 + ", isImportant: " + z17);
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.AppCallback
    /* renamed from: reportIDKey */
    public void mo37806xf0018e90(long j17, long j18, long j19, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayerCdnService", "reportIDKey ID: " + j17 + ", key: " + j18 + ", value: " + j19 + ", isImportant: " + z17);
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.AppCallback
    /* renamed from: reportKV */
    public void mo37807xe68be19f(long j17, java.lang.String str, boolean z17, boolean z18, long j18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayerCdnService", "reportKV logId: " + j17 + ", value: " + str + ", isImportant: " + z17 + ", isReportNow: " + z18 + ", type: " + j18);
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.AppCallback
    /* renamed from: reportKVNoFreqLimit */
    public void mo37808xc8cf6843(long j17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayerCdnService", "reportKVNoFreqLimit logId: " + j17 + ", value: " + str);
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.AppCallback
    /* renamed from: requestGetCDN */
    public void mo37809x3e59a466(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayerCdnService", "requestGetCDN reason: " + i17);
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.AppCallback
    /* renamed from: requestSnsGetCdnDistance */
    public void mo37810x54b3aed5(int i17, int i18, int i19) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayerCdnService", "requestSnsGetCdnDistance version: " + i17 + ", myProvince: " + i18 + ", myCity: " + i19);
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.AppCallback
    /* renamed from: resolveHost */
    public java.lang.String[] mo37811x746015b4(java.lang.String str, boolean z17, int[] iArr) {
        return new java.lang.String[0];
    }
}
