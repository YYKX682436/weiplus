package pa4;

/* loaded from: classes4.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pa4.l f434581d;

    public j(pa4.l lVar) {
        this.f434581d = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5 = "run";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager$uploadLivePhoto$1");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("uploadLivePhoto >> localId: ");
        pa4.l lVar = this.f434581d;
        sb6.append(pa4.l.b(lVar));
        sb6.append(" thread: ");
        sb6.append(java.lang.Thread.currentThread().getName());
        sb6.append(" isMulti: ");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$isMulti$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$isMulti$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager");
        sb6.append(lVar.f434585c);
        sb6.append(" objType: ");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getObjType$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getObjType$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager");
        sb6.append(lVar.f434586d);
        sb6.append(" time: ");
        sb6.append(java.lang.System.currentTimeMillis());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LivePhotoUpload", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$checkUploadState", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkUploadState", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager");
        int i17 = lVar.d().f462103n;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLivePhotoMediaInfo", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager");
        r45.mj4 mj4Var = (r45.mj4) ((jz5.n) lVar.f434591i).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLivePhotoMediaInfo", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager");
        int i18 = mj4Var.f462103n;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LivePhotoUpload", "checkUploadState >> img: " + i17 + " video: " + i18);
        if (i17 == 1 || i18 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkUploadState", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager");
            lVar = null;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkUploadState", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$checkUploadState", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager");
        if (lVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$doUpload", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doUpload", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager");
            int i19 = lVar.d().f462103n;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLivePhotoMediaInfo", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager");
            r45.mj4 mj4Var2 = (r45.mj4) ((jz5.n) lVar.f434591i).mo141623x754a37bb();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLivePhotoMediaInfo", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager");
            int i27 = mj4Var2.f462103n;
            if (i19 != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LivePhotoUpload", "doUpload img thread: " + java.lang.Thread.currentThread() + " time: " + java.lang.System.currentTimeMillis());
                com.p314xaae8f345.mm.p944x882e457a.r1 r1Var = gm0.j1.n().f354821b;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getImgUploader", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager");
                pa4.e eVar = (pa4.e) ((jz5.n) lVar.f434593k).mo141623x754a37bb();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getImgUploader", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager");
                r1Var.g(eVar);
            }
            if (i27 != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LivePhotoUpload", "doUpload video thread: " + java.lang.Thread.currentThread() + " time: " + java.lang.System.currentTimeMillis());
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getVideoUploader", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager");
                pa4.s sVar = (pa4.s) ((jz5.n) lVar.f434592j).mo141623x754a37bb();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getVideoUploader", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager");
                sVar.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("uploadVideo", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload");
                java.lang.String str6 = sVar.f434613i;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsLivePhotoVideoUpload", "uploadVideo >> videoPath: " + str6 + ", thumbPath: " + sVar.f434614j + ", clientId: " + sVar.f434615k + ", md5: " + sVar.f434616l + ", fileLen: " + com.p314xaae8f345.mm.vfs.w6.k(str6) + ", thread: " + java.lang.Thread.currentThread().getName() + (char) 65292);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.l2 l2Var = sVar.f434608d;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initData", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload");
                sVar.f434616l = com.p314xaae8f345.mm.vfs.w6.p(str6);
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("initData >> md5: ");
                sb7.append(sVar.f434616l);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsLivePhotoVideoUpload", sb7.toString());
                java.lang.String str7 = sVar.f434616l;
                r45.mj4 mj4Var3 = sVar.f434607c;
                mj4Var3.f462112w = str7;
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder("init clientId: ");
                sb8.append(mj4Var3.f462105p);
                sb8.append(" livePhotoUUId: ");
                str = "run";
                sb8.append(mj4Var3.E);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsLivePhotoVideoUpload", sb8.toString());
                java.lang.String str8 = sVar.f434615k;
                if (str8 == null || str8.length() == 0) {
                    java.lang.StringBuilder sb9 = new java.lang.StringBuilder("");
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    str3 = "uploadVideo";
                    str4 = "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager";
                    sb9.append(android.os.SystemClock.elapsedRealtime());
                    byte[] bytes = sb9.toString().getBytes(r26.c.f450398a);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
                    java.lang.String g17 = kk.k.g(bytes);
                    sVar.f434615k = g17;
                    mj4Var3.f462105p = g17;
                } else {
                    str3 = "uploadVideo";
                    str4 = "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager";
                }
                java.lang.String str9 = mj4Var3.E;
                if (str9 == null || str9.length() == 0) {
                    mj4Var3.E = sVar.f434610f;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsLivePhotoVideoUpload", "init clientId: " + mj4Var3.f462105p + " livePhotoUUId: " + mj4Var3.E);
                try {
                    r45.mj4 mj4Var4 = sVar.f434606b;
                    mj4Var4.D = mj4Var3;
                    l2Var.m(mj4Var4.mo14344x5f01b1f6());
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Hj().Y2(l2Var.c(), l2Var);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SnsLivePhotoVideoUpload", e17, "", new java.lang.Object[0]);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initData", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.v0.c(sVar.f434605a);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkVideoInfo", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload");
                com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.d(str6, true);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsLivePhotoVideoUpload", "checkVideoInfo >> mediaInfo: " + d17);
                ((hs.v) ((qk.r7) i95.n0.c(qk.r7.class))).getClass();
                long c17 = qp.b.f447207a.c();
                int i28 = d17.f243915a;
                if (i28 <= 0 || i28 > c17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsLivePhotoVideoUpload", "checkVideoInfo >> duration: " + d17.f243915a);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkVideoInfo", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload");
                    sVar = null;
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkVideoInfo", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload");
                }
                if (sVar != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doUpload", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsLivePhotoVideoUpload", "doUpload >> clientId: " + sVar.f434615k);
                    dn.m mVar = new dn.m();
                    mVar.f323318d = "task_NetSceneSnsUpload_2";
                    mVar.f323320f = sVar.f434618n;
                    mVar.f69601xaca5bdda = sVar.f434615k;
                    java.lang.String str10 = sVar.f434613i;
                    mVar.f69595x6d25b0d9 = str10;
                    java.lang.String str11 = sVar.f434614j;
                    mVar.f69619xe9ed65f6 = str11;
                    if (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.m2.D2(str11)) {
                        mVar.f323326n = 20251;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsLivePhotoVideoUpload", "upload sight with wxam thumb, %s", str11);
                    }
                    mVar.f69592xf1ebe47b = 20202;
                    mVar.f69618x114ef53e = "";
                    mVar.f69609xd84b8349 = 2;
                    mVar.f69606xccdbf540 = true;
                    mVar.f69597x853bb235 = false;
                    mVar.f69580x454032b6 = 102;
                    mVar.f69584x89a4c0cf = 1;
                    mVar.f69598x47e3df1e = 0;
                    mVar.N = "live_photo_uuid:" + sVar.f434607c.E + "\r\nis_single_media:" + (sVar.f434611g ? "0" : "1");
                    java.lang.StringBuilder sb10 = new java.lang.StringBuilder("customHeader: ");
                    sb10.append(mVar.N);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsLivePhotoVideoUpload", sb10.toString());
                    if (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.e4.c(str10)) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(106L, 31L, 1L, false);
                    }
                    java.lang.String p17 = com.p314xaae8f345.mm.vfs.w6.p(str10);
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(sVar.f434616l) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(sVar.f434616l, p17)) {
                        if (pc4.f.f434968a.a()) {
                            try {
                                r45.u76 u76Var = new r45.u76();
                                u76Var.f468663d = 2;
                                mVar.P = u76Var.mo14344x5f01b1f6();
                            } catch (java.io.IOException unused) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsLivePhotoVideoUpload", "set cdnUploadInfo error");
                            }
                        }
                        if (((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Bi(mVar)) {
                            sVar.f434617m = 5;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doUpload", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload");
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsLivePhotoVideoUpload", "cdntra addSendTask failed. clientid:%s", sVar.f434615k);
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doUpload", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload");
                        }
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsLivePhotoVideoUpload", "isNotSafeSightVideo old srcmd5 %s newmd5 %s ", sVar.f434616l, p17);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onErrorServer", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload");
                        sVar.f434612h.a("VideoOnErrorServer", new pa4.q(-2, sVar));
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onErrorServer", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doUpload", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload");
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str3, "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload");
                str2 = str4;
            } else {
                str = "run";
                str2 = "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager";
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doUpload", str2);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$doUpload", str2);
            str5 = str;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str5, "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager$uploadLivePhoto$1");
    }
}
