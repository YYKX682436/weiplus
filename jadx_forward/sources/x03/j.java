package x03;

/* loaded from: classes12.dex */
public final class j implements com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoStreamingCallback, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.DownloadCallback, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.AppCallback {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f532593d = new java.util.HashMap();

    public j() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterCdnService", "CdnManager Initialize");
        com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0 c4446x11b6e6e0 = new com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0(com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37501x76847179());
        com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37501x76847179().m37617xa38667cc(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class, c4446x11b6e6e0);
        c4446x11b6e6e0.m37754x3e5a77bb(com.p314xaae8f345.mm.vfs.w6.i(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getFilesDir().toString() + "/NativeCDNInfo", true), "cdnwx2013usrname", java.lang.Boolean.valueOf(true ^ c01.e2.a0()));
        c4446x11b6e6e0.m37767x928c07c4(this);
        c4446x11b6e6e0.m37776x19cb1fe("1", "BFEDFFB5EA28509F9C89ED83FA7FDDA8881435D444E984D53A98AD8E9410F1145EDD537890E10456190B22E6E5006455EFC6C12E41FDA985F38FBBC7213ECB810E3053D4B8D74FFBC70B4600ABD728202322AFCE1406046631261BD5EE3D44721082FEAB74340D73645DC0D02A293B962B9D47E4A64100BD7524DE00D9D3B5C1", "010001");
        c4446x11b6e6e0.m37780x5dd433ef("cdnwx2013usrname");
        com.p314xaae8f345.p542x3306d5.cdn.C4444x9204715e.m37631x6c4ebec7(new com.p314xaae8f345.p542x3306d5.cdn.C4445xedac2be3());
        ((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37774xa2e80aa("ANDROID.MM.CDN.FlutterCdnService", 5242880L, 60);
    }

    public final int a(dn.o task) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
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
        if (m37787x52efc79 == 0) {
            java.util.HashMap hashMap = this.f532593d;
            java.lang.String field_mediaId = task.f69601xaca5bdda;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_mediaId, "field_mediaId");
            hashMap.put(field_mediaId, task);
        }
        return m37787x52efc79;
    }

    public final int b(java.lang.String str) {
        int m37740x55b651aa = ((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37740x55b651aa(str, new com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadResult());
        if (m37740x55b651aa == 0) {
            p3321xbce91901.jvm.p3324x21ffc6bd.m0.c(this.f532593d).remove(str);
        }
        return m37740x55b651aa;
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.AppCallback
    /* renamed from: combineResolveHost */
    public java.lang.String[] mo37799x705052f5(java.lang.String str, int i17, int i18, int[] iArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FlutterCdnService", "resolveHost not impl!");
        return new java.lang.String[0];
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.AppCallback
    /* renamed from: isUsingWangKaService */
    public boolean mo37800xc9848262(int i17) {
        return false;
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.AppCallback
    /* renamed from: onBadNetworkProbed */
    public void mo37801x4491727c() {
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.DownloadCallback
    /* renamed from: onC2CDownloadCompleted */
    public void mo562xf8a76f8e(java.lang.String str, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadResult c2CDownloadResult) {
        dn.n nVar;
        dn.n nVar2;
        java.util.Objects.toString(c2CDownloadResult);
        dn.o oVar = (dn.o) this.f532593d.get(str);
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
        dn.o oVar = (dn.o) this.f532593d.get(str);
        if (oVar == null || (nVar = oVar.f323348c2) == null) {
            return;
        }
        nVar.mo65706x9bb59ea0(str, j17, j18);
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.DownloadCallback
    /* renamed from: onDownloadProgressChanged */
    public void mo563x617c4940(java.lang.String str, long j17, long j18, boolean z17) {
        dn.n nVar;
        dn.o oVar = (dn.o) this.f532593d.get(str);
        if (oVar == null || (nVar = oVar.f323348c2) == null) {
            return;
        }
        nVar.f(str, j17, j18);
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoStreamingCallback
    /* renamed from: onDownloadToEnd */
    public void mo37931x34576d19(java.lang.String str, long j17, long j18) {
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoStreamingCallback
    /* renamed from: onM3U8Ready */
    public void mo37932xc5dd699b(java.lang.String str, java.lang.String str2) {
        dn.n nVar;
        dn.o oVar = (dn.o) this.f532593d.get(str);
        if (oVar == null || (nVar = oVar.f323348c2) == null) {
            return;
        }
        nVar.mo65707xc5dd699b(str, str2);
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoStreamingCallback
    /* renamed from: onMoovReady */
    public void mo37933xe7d268fb(java.lang.String str, long j17, long j18, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoInfo videoInfo) {
        dn.n nVar;
        dn.o oVar = (dn.o) this.f532593d.get(str);
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
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoStreamingCallback
    /* renamed from: onPreloadCompletedWithResult */
    public void mo37936x23ba0da4(java.lang.String str, long j17, long j18, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadResult c2CDownloadResult) {
        dn.n nVar;
        dn.o oVar = (dn.o) this.f532593d.get(str);
        if (oVar == null || (nVar = oVar.f323348c2) == null) {
            return;
        }
        nVar.f(str, j17, j18);
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.AppCallback
    /* renamed from: onTaskTearDown */
    public void mo37802xb2a6aa48(java.lang.String str, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.DownloadTaskProfile downloadTaskProfile, java.lang.String str2) {
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.AppCallback
    /* renamed from: reportFlow */
    public void mo37803x73181082(int i17, int i18, int i19, int i27) {
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.AppCallback
    /* renamed from: reportFlowWithTag */
    public void mo37804xe90cea12(java.lang.String str, int i17, long j17, long j18, long j19, long j27) {
        ((kn4.d0) ((pf0.r) i95.n0.c(pf0.r.class))).getClass();
        kn4.c0.INSTANCE.b(str, j18, j17, j27, j19);
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.AppCallback
    /* renamed from: reportGroupIDKey */
    public void mo37805xc9114479(int[] idArray, int[] keyArray, int[] valueArray, int i17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(idArray, "idArray");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keyArray, "keyArray");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(valueArray, "valueArray");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i18 = 0; i18 < i17; i18++) {
            arrayList.add(new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344(idArray[i18], keyArray[i18], valueArray[i18]));
        }
        jx3.f.INSTANCE.b(arrayList, z17);
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.AppCallback
    /* renamed from: reportIDKey */
    public void mo37806xf0018e90(long j17, long j18, long j19, boolean z17) {
        jx3.f.INSTANCE.mo68477x336bdfd8(j17, j18, j19, z17);
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.AppCallback
    /* renamed from: reportKV */
    public void mo37807xe68be19f(long j17, java.lang.String str, boolean z17, boolean z18, long j18) {
        jx3.f.INSTANCE.n((int) j17, (int) j18, str, z18, z17);
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.AppCallback
    /* renamed from: reportKVNoFreqLimit */
    public void mo37808xc8cf6843(long j17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FlutterCdnService", "!no impl!");
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.AppCallback
    /* renamed from: requestGetCDN */
    public void mo37809x3e59a466(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FlutterCdnService", "requestGetCDN not impl!");
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.AppCallback
    /* renamed from: requestSnsGetCdnDistance */
    public void mo37810x54b3aed5(int i17, int i18, int i19) {
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.AppCallback
    /* renamed from: resolveHost */
    public java.lang.String[] mo37811x746015b4(java.lang.String str, boolean z17, int[] iArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FlutterCdnService", "resolveHost not impl!");
        return new java.lang.String[0];
    }
}
