package pa4;

/* loaded from: classes4.dex */
public final class p implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pa4.s f434596d;

    public p(pa4.s sVar) {
        this.f434596d = sVar;
    }

    @Override // dn.k
    public void O(java.lang.String mediaId, java.io.ByteArrayOutputStream buff) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCdnAuthInfo", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload$cdnCallback$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buff, "buff");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCdnAuthInfo", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload$cdnCallback$1");
    }

    @Override // dn.k
    public int r4(java.lang.String mediaId, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload$cdnCallback$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        pa4.s sVar = this.f434596d;
        if (i17 == -21005) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsLivePhotoVideoUpload", "cdnTra cdnCallback clientId: " + pa4.s.a(sVar) + " startRet:" + i17 + " progInfo:" + gVar + " res:" + hVar);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.v0.a(pa4.s.c(sVar), 3, -1);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload$cdnCallback$1");
            return 0;
        }
        if (hVar != null && hVar.f69553xb5f54fe9 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsLivePhotoVideoUpload", "cdnTra cdnCallback clientId:" + pa4.s.a(sVar) + " startRet:" + i17 + " progInfo:" + gVar + " res:" + hVar);
            java.lang.String field_fileUrl = hVar.f69524x419c440e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_fileUrl, "field_fileUrl");
            java.lang.String str = hVar.f69560x7b284d5e;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("upload_");
            sb6.append(pa4.s.a(sVar));
            java.lang.String sb7 = sb6.toString();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$onPostScene", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPostScene", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload");
            sVar.f434612h.a("VideoOnPostScene", new pa4.r(sVar, field_fileUrl, sb7, 1, str, 1));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPostScene", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$onPostScene", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload");
            t21.i2 wi6 = t21.i2.wi();
            int c17 = pa4.s.c(sVar);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getSendScene$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload");
            int i18 = sVar.f434617m;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getSendScene$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload");
            wi6.Bi(c17, hVar, i18);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.v0.a(pa4.s.c(sVar), 0, 0);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload$cdnCallback$1");
            return 0;
        }
        if (hVar != null && hVar.f69553xb5f54fe9 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsLivePhotoVideoUpload", "sceneResult.field_retCode != 0 cdnTra cdnCallback clientId:" + pa4.s.a(sVar) + " startRet:" + i17 + " progInfo:" + gVar + " res:" + hVar);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$onErrorServer", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onErrorServer", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload");
            sVar.f434612h.a("VideoOnErrorServer", new pa4.q(0, sVar));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onErrorServer", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$onErrorServer", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.v0.a(pa4.s.c(sVar), 3, -1);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload$cdnCallback$1");
            return 0;
        }
        if (i17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsLivePhotoVideoUpload", "cdnTra cdnCallback clientId:" + pa4.s.a(sVar) + " startRet:" + i17 + " progInfo: " + gVar + " res:" + hVar);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload$cdnCallback$1");
            return 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsLivePhotoVideoUpload", "start ret != 0 cdnTra cdnCallback clientId:" + pa4.s.a(sVar) + " startRet:" + i17 + " progInfo: " + gVar + " res:" + hVar);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$onErrorServer", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onErrorServer", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload");
        sVar.f434612h.a("VideoOnErrorServer", new pa4.q(0, sVar));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onErrorServer", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$onErrorServer", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.v0.a(pa4.s.c(sVar), 3, -1);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload$cdnCallback$1");
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String mediaId, byte[] inbuf) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("decodePrepareResponse", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload$cdnCallback$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inbuf, "inbuf");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("decodePrepareResponse", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload$cdnCallback$1");
        return null;
    }
}
