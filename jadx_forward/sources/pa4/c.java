package pa4;

/* loaded from: classes4.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f434550d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pa4.e f434551e;

    public c(int i17, pa4.e eVar) {
        this.f434550d = i17;
        this.f434551e = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pa4.e eVar = this.f434551e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload$onErrorServer$1");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onErrorServer >> errCode: ");
        int i17 = this.f434550d;
        sb6.append(i17);
        sb6.append(" thread: ");
        sb6.append(java.lang.Thread.currentThread().getName());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsLivePhotoImgUpload", sb6.toString());
        try {
            pa4.e.K(eVar).f462103n = 1;
            pa4.e.K(eVar).f462108s = i17;
            pa4.e.J(eVar).m(pa4.e.K(eVar).mo14344x5f01b1f6());
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsLivePhotoImgUpload", "onErrorServer >> " + e17.getMessage());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getUploadCallback$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
        pa4.m mVar = eVar.f434561f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getUploadCallback$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload");
        ((pa4.i) mVar).a(false, false);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoImgUpload$onErrorServer$1");
    }
}
