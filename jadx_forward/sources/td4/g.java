package td4;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final td4.b f499190a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f499191b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f499192c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f499193d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.Map f499194e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.m0 f499195f;

    /* renamed from: g, reason: collision with root package name */
    public fk4.k f499196g;

    /* renamed from: h, reason: collision with root package name */
    public xd4.t0 f499197h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.h0 f499198i;

    public g(td4.b callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f499190a = callback;
        this.f499191b = true;
        this.f499192c = jz5.h.b(td4.f.f499185d);
        this.f499193d = jz5.h.b(td4.e.f499181d);
        this.f499198i = new td4.c(this);
    }

    public static /* synthetic */ void c(td4.g gVar, java.lang.String str, int i17, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doSnsFileSaveTask$default", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper");
        if ((i17 & 1) != 0) {
            str = "";
        }
        gVar.b(str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doSnsFileSaveTask$default", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper");
    }

    public final void a(java.lang.String cdnSnsVideoLocalPath, r45.jj4 mediaObj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkSnsCdnVideoLocalFile", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cdnSnsVideoLocalPath, "cdnSnsVideoLocalPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaObj, "mediaObj");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getVideoTempPathWithExtName", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper");
        java.lang.String a17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f6.a(mediaObj, ".mp4");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTmpVideoSavePath", "com.tencent.mm.plugin.sns.model.SnsPathHelper");
        java.lang.String str = dw3.h.f325744a.b("snsalbumpicker") + a17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTmpVideoSavePath", "com.tencent.mm.plugin.sns.model.SnsPathHelper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getTmpVideoSavePath(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getVideoTempPathWithExtName", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper");
        boolean j17 = com.p314xaae8f345.mm.vfs.w6.j(str);
        boolean z17 = j17 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(com.p314xaae8f345.mm.vfs.w6.p(cdnSnsVideoLocalPath), com.p314xaae8f345.mm.vfs.w6.p(str));
        if (!z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("copyVideoFileToTempDirWithExtName", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper");
            long d17 = com.p314xaae8f345.mm.vfs.w6.d(cdnSnsVideoLocalPath, str, false);
            java.util.Map map = this.f499194e;
            if (map != null) {
                java.lang.String Id = mediaObj.f459388d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Id, "Id");
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAlbumPickerDownloadHelper", "copyVideoFileToTempDirWithExtName result:" + d17 + ", from " + cdnSnsVideoLocalPath + " copy to " + str);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("copyVideoFileToTempDirWithExtName", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAlbumPickerDownloadHelper", "checkSnsCdnVideoLocalFile, tempMp4FileExist:" + j17 + ", tempFileExistWithMd5Check:" + z17 + ", path:" + str);
        b(str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkSnsCdnVideoLocalFile", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0083, code lost:
    
        if (r10 == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.String r31) {
        /*
            Method dump skipped, instructions count: 1484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: td4.g.b(java.lang.String):void");
    }

    public final java.util.ArrayList d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFilePathList", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper");
        java.util.ArrayList arrayList = (java.util.ArrayList) ((jz5.n) this.f499193d).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFilePathList", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper");
        return arrayList;
    }

    public final java.util.List e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTaskQueue", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper");
        java.util.List list = (java.util.List) ((jz5.n) this.f499192c).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTaskQueue", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper");
        return list;
    }

    public final void f() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeDownLoadManagerState", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.m0 m0Var = this.f499195f;
        if (m0Var != null) {
            m0Var.v(this.f499198i);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.m0 m0Var2 = this.f499195f;
        if (m0Var2 != null) {
            m0Var2.p();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.m0 m0Var3 = this.f499195f;
        if (m0Var3 != null) {
            m0Var3.o();
        }
        fk4.k kVar = this.f499196g;
        if (kVar != null) {
            kVar.p();
        }
        this.f499196g = null;
        xd4.t0 t0Var = this.f499197h;
        if (t0Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("release", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoResourceDownloaderDelegate", "release");
            p3325xe03a0797.p3326xc267989b.z0.e(t0Var.f535242c, null, 1, null);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("release", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeDownLoadManagerState", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper");
    }
}
