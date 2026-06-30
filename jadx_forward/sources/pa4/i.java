package pa4;

/* loaded from: classes4.dex */
public final class i implements pa4.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pa4.l f434580a;

    public i(pa4.l lVar) {
        this.f434580a = lVar;
    }

    public void a(boolean z17, boolean z18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onUploadResult", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager$uploadCallback$1");
        pa4.l lVar = this.f434580a;
        if (z18) {
            int i17 = lVar.d().f462103n;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LivePhotoUpload", "videoUploadCallback onUploadResult >> localId: " + pa4.l.b(lVar) + " res: " + z17 + " imgUploadResult: " + i17 + " thread: " + java.lang.Thread.currentThread().getName());
            if (i17 != 2) {
                pa4.l.c(lVar, false, z17 && i17 == 0);
                if (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Nj() != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Nj().d();
                }
            }
        } else {
            int i18 = lVar.d().D.f462103n;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LivePhotoUpload", "imgUploadCallback onUploadResult >> localId: " + pa4.l.b(lVar) + " res: " + z17 + " videoUploadResult: " + i18 + " thread: " + java.lang.Thread.currentThread().getName());
            if (i18 != 2) {
                pa4.l.c(lVar, !z17, z17 && i18 == 0);
                if (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Nj() != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Nj().d();
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onUploadResult", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadManager$uploadCallback$1");
    }
}
