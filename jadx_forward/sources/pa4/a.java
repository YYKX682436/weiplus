package pa4;

/* loaded from: classes4.dex */
public final class a implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pa4.e f434548d;

    public a(pa4.e eVar) {
        this.f434548d = eVar;
    }

    @Override // dn.k
    public void O(java.lang.String mediaId, java.io.ByteArrayOutputStream buff) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCdnAuthInfo", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload$cdnCallback$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buff, "buff");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCdnAuthInfo", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload$cdnCallback$1");
    }

    @Override // dn.k
    public int r4(java.lang.String mediaId, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload$cdnCallback$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        pa4.e eVar = this.f434548d;
        if (i17 == -21005) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsLivePhotoImgUpload", "cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", pa4.e.L(eVar), java.lang.Integer.valueOf(i17), gVar, hVar);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.v0.a(pa4.e.H(eVar), 3, -1);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload$cdnCallback$1");
            return 0;
        }
        if (hVar != null && hVar.f69553xb5f54fe9 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsLivePhotoImgUpload", "cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", pa4.e.L(eVar), java.lang.Integer.valueOf(i17), gVar, hVar);
            pa4.e eVar2 = this.f434548d;
            java.lang.String field_fileUrl = hVar.f69524x419c440e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_fileUrl, "field_fileUrl");
            java.lang.String field_thumbUrl = hVar.f69560x7b284d5e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_thumbUrl, "field_thumbUrl");
            java.lang.String str = "upload_" + pa4.e.L(eVar);
            java.lang.String str2 = hVar.f69526x419c9c3d;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$onPostScene", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
            eVar2.O(field_fileUrl, 1, field_thumbUrl, 1, str, str2);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$onPostScene", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("uploadsns cdndone pass: ");
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getSt_new$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
            long j17 = eVar.f434571s;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getSt_new$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
            sb6.append(currentTimeMillis - j17);
            sb6.append(' ');
            sb6.append(hVar.f69526x419c9c3d);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsLivePhotoImgUpload", sb6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.v0.a(pa4.e.H(eVar), 0, 0);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload$cdnCallback$1");
            return 0;
        }
        if (hVar == null || hVar.f69553xb5f54fe9 == 0) {
            if (i17 == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsLivePhotoImgUpload", "cdn tra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", pa4.e.L(eVar), java.lang.Integer.valueOf(i17), gVar, hVar);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload$cdnCallback$1");
                return 0;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsLivePhotoImgUpload", "cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", pa4.e.L(eVar), java.lang.Integer.valueOf(i17), gVar, hVar);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$onErrorServer", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
            eVar.N(0);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$onErrorServer", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.v0.a(pa4.e.H(eVar), 3, -1);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload$cdnCallback$1");
            return 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsLivePhotoImgUpload", "cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", pa4.e.L(eVar), java.lang.Integer.valueOf(i17), gVar, hVar);
        int i18 = hVar.f69553xb5f54fe9;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$processError", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
        eVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("processError", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
        int i19 = 0;
        while (true) {
            if (i19 >= 8) {
                eVar.M();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("processError", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
                break;
            }
            if (i18 == dn.a.f323295a[i19]) {
                eVar.N(0);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("processError", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
                break;
            }
            i19++;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$processError", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.v0.a(pa4.e.H(eVar), 3, -1);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload$cdnCallback$1");
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String mediaId, byte[] inbuf) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("decodePrepareResponse", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload$cdnCallback$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inbuf, "inbuf");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("decodePrepareResponse", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload$cdnCallback$1");
        return null;
    }
}
