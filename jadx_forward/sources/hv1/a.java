package hv1;

/* loaded from: classes12.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f366796d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dn.m f366797e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hv1.d f366798f;

    public a(hv1.d dVar, int i17, dn.m mVar) {
        this.f366798f = dVar;
        this.f366796d = i17;
        this.f366797e = mVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        int i18;
        int i19;
        int t17;
        int m17;
        dn.m mVar = this.f366797e;
        hv1.d dVar = this.f366798f;
        int i27 = this.f366796d;
        if (i27 != -1) {
            ((java.util.concurrent.ConcurrentHashMap) dVar.f366811g).put(mVar.f69601xaca5bdda, java.lang.Integer.valueOf(i27));
        }
        ((java.util.LinkedList) dVar.f366808d).add(mVar.f69601xaca5bdda);
        ((java.util.concurrent.ConcurrentHashMap) dVar.f366809e).put(mVar.f69601xaca5bdda, mVar);
        java.util.Queue queue = dVar.f366808d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CdnDownloadNativeService", "summersafecdn tryStart queue:%d", java.lang.Integer.valueOf(((java.util.LinkedList) queue).size()));
        com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.Config config = new com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.Config();
        config.f18038xe117f63d = 1;
        java.lang.String str = "clicfg_android_new_multiconn_game_download=" + j62.e.g().a("clicfg_android_new_multiconn_game_download", "0", false, true) + ";";
        config.f18041x3148f467 = str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CdnDownloadNativeService", "[push.miscell.config] expt %s", str);
        ((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37770x78bda44(config);
        while (!queue.isEmpty()) {
            dn.m mVar2 = (dn.m) ((java.util.concurrent.ConcurrentHashMap) dVar.f366809e).remove((java.lang.String) ((java.util.LinkedList) queue).poll());
            if (mVar2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CdnDownloadNativeService", "summersafecdn task queue is empty , maybe bug here");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CdnDownloadNativeService", "summersafecdn id:%s cdnautostart :%s chatroom:%s", mVar2.f69601xaca5bdda, java.lang.Boolean.valueOf(mVar2.f69583xfebd470e), java.lang.Integer.valueOf(mVar2.f69586x737ec037));
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            mVar2.f69615x1bb3b54a = java.lang.System.currentTimeMillis();
            boolean z18 = mVar2.f323319e;
            java.util.Map map = dVar.f366810f;
            if (z18) {
                java.lang.Object[] objArr = new java.lang.Object[7];
                java.lang.String str2 = mVar2.f69595x6d25b0d9;
                objArr[0] = java.lang.Integer.valueOf(str2 == null ? -1 : str2.length());
                java.lang.String str3 = mVar2.f69619xe9ed65f6;
                objArr[1] = java.lang.Integer.valueOf(str3 == null ? -1 : str3.length());
                objArr[2] = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(mVar2.f69617x5f1e8863);
                objArr[3] = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(mVar2.f69575xf11df5f5);
                objArr[4] = java.lang.Integer.valueOf(mVar2.f69592xf1ebe47b);
                objArr[5] = mVar2.f69601xaca5bdda;
                objArr[6] = java.lang.Boolean.valueOf(mVar2.f69607x9bef5d80);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CdnDownloadNativeService", "summersafecdn tryStart send file:%d thumb:%d, field_svr_signature[%s], field_aesKey[%s], field_fileType[%d], field_mediaId[%s], onlycheckexist[%b]", objArr);
                if (mVar2.f69595x6d25b0d9 == null) {
                    mVar2.f69595x6d25b0d9 = "";
                }
                if (mVar2.f69619xe9ed65f6 == null) {
                    mVar2.f69619xe9ed65f6 = "";
                }
                int u17 = dVar.e().u(mVar2);
                if (u17 != 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CdnDownloadNativeService", "summersafecdn startupUploadMedia error:%d clientid:%s", java.lang.Integer.valueOf(u17), mVar2.f69601xaca5bdda);
                    dn.k kVar = mVar2.f323320f;
                    if (kVar != null) {
                        kVar.r4(mVar2.f69601xaca5bdda, u17, null, null, mVar2.f69607x9bef5d80);
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CdnDownloadNativeService", "summersafecdn startupUploadMedia ok, field_mediaId[%s]", mVar2.f69601xaca5bdda);
                    ((java.util.concurrent.ConcurrentHashMap) map).put(mVar2.f69601xaca5bdda, mVar2);
                }
            } else {
                int i28 = mVar2.f69592xf1ebe47b;
                if (i28 == 30001 || i28 == 30003 || i28 == 30007 || i28 == 30004 || i28 == 30005 || i28 == 30006 || i28 == 50001) {
                    java.lang.String str4 = mVar2.f69595x6d25b0d9;
                    if (str4 == null || str4.isEmpty()) {
                        i17 = -1;
                        i18 = -1;
                    } else {
                        i17 = -1;
                        mVar2.f323322h = -1;
                        int i29 = mVar2.f69592xf1ebe47b;
                        if ((i29 == 30003 || i29 == 30007) && mVar2.M) {
                            mVar2.f323345z1 = 30002;
                            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_patchdl_maxpcdn, 0);
                            mVar2.f323343y1 = Ni;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CdnDownloadNativeService", "pcdn maxconn %d for patch", java.lang.Integer.valueOf(Ni));
                        }
                        if (!mVar2.C) {
                            mVar2.N = "Accept-Encoding:";
                        }
                        i18 = dVar.e().j(mVar2);
                    }
                    java.lang.Object[] objArr2 = new java.lang.Object[5];
                    java.lang.String str5 = mVar2.f69595x6d25b0d9;
                    objArr2[0] = java.lang.Integer.valueOf(str5 == null ? i17 : str5.length());
                    objArr2[1] = mVar2.f69601xaca5bdda;
                    objArr2[2] = mVar2.f323344z;
                    objArr2[3] = java.lang.Integer.valueOf(mVar2.f69592xf1ebe47b);
                    objArr2[4] = java.lang.Integer.valueOf(i18);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CdnDownloadNativeService", "url download tryStart recv file:%d field_mediaId[%s], download_url[%s], filetype:[%d], ret:%d", objArr2);
                    i19 = i18;
                } else {
                    if (mVar2.F) {
                        java.lang.String str6 = mVar2.f69595x6d25b0d9;
                        if (str6 == null || str6.isEmpty()) {
                            t17 = -1;
                        } else {
                            mVar2.f323322h = -1;
                            mVar2.N = java.lang.String.format("X-Forwarded-Access-Type:%s\r\n", com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40061x1de3608b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a));
                            mVar2.f69592xf1ebe47b = 30002;
                            mVar2.D = 18;
                            mVar2.f323345z1 = 30003;
                            mVar2.f323343y1 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_gamedl_maxpcdn, 0);
                            t17 = dVar.e().j(mVar2);
                        }
                        java.lang.Object[] objArr3 = new java.lang.Object[4];
                        java.lang.String str7 = mVar2.f69595x6d25b0d9;
                        objArr3[0] = str7 != null ? str7 : "";
                        objArr3[1] = mVar2.f69601xaca5bdda;
                        objArr3[2] = mVar2.f323344z;
                        objArr3[3] = mVar2.I;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CdnDownloadNativeService", "game package download tryStart recv file:%s field_mediaId[%s], download_url[%s] https url[%s]", objArr3);
                    } else {
                        java.lang.Object[] objArr4 = new java.lang.Object[7];
                        java.lang.String str8 = mVar2.f69595x6d25b0d9;
                        objArr4[0] = java.lang.Integer.valueOf(str8 == null ? -1 : str8.length());
                        java.lang.String str9 = mVar2.f69619xe9ed65f6;
                        objArr4[1] = java.lang.Integer.valueOf(str9 == null ? -1 : str9.length());
                        objArr4[2] = mVar2.f69617x5f1e8863;
                        objArr4[3] = mVar2.f69575xf11df5f5;
                        objArr4[4] = java.lang.Integer.valueOf(mVar2.f69592xf1ebe47b);
                        objArr4[5] = mVar2.f69601xaca5bdda;
                        objArr4[6] = java.lang.Boolean.valueOf(mVar2.f69607x9bef5d80);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CdnDownloadNativeService", "summersafecdn tryStart recv file:%d thumb:%d, field_svr_signature[%s], field_aesKey[%s], field_fileType[%d], field_mediaId[%s], onlycheckexist[%b]", objArr4);
                        if (mVar2.Y == 2) {
                            if (mVar2 instanceof dn.o) {
                                dn.o oVar = (dn.o) mVar2;
                                if (oVar.h()) {
                                    m17 = dVar.e().s(mVar2, 2);
                                } else if (oVar.i()) {
                                    oVar.f323339x0 = 1;
                                    oVar.f323342y0 = 1;
                                    m17 = dVar.e().m(oVar);
                                }
                                t17 = m17;
                            }
                            t17 = -1;
                        } else {
                            t17 = dVar.e().t(mVar2);
                        }
                    }
                    i19 = t17;
                    i17 = -1;
                }
                if (i19 != 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CdnDownloadNativeService", "summersafecdn startupDownloadMedia error:%d clientid:%s", java.lang.Integer.valueOf(i19), mVar2.f69601xaca5bdda);
                    dn.k kVar2 = mVar2.f323320f;
                    if (kVar2 != null) {
                        kVar2.r4(mVar2.f69601xaca5bdda, i19, null, null, mVar2.f69607x9bef5d80);
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CdnDownloadNativeService", "summersafecdn startupDownloadMedia ok, field_mediaId[%s]", mVar2.f69601xaca5bdda);
                    ((java.util.concurrent.ConcurrentHashMap) map).put(mVar2.f69601xaca5bdda, mVar2);
                }
            }
        }
    }

    /* renamed from: toString */
    public java.lang.String m134174x9616526c() {
        return super.toString() + "|addRecvTask";
    }
}
