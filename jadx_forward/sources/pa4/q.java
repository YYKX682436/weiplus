package pa4;

/* loaded from: classes4.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f434597d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pa4.s f434598e;

    public q(int i17, pa4.s sVar) {
        this.f434597d = i17;
        this.f434598e = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload$onErrorServer$1");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("snsUpload sight by cdn error code: ");
        int i17 = this.f434597d;
        sb6.append(i17);
        sb6.append("  thread: ");
        sb6.append(java.lang.Thread.currentThread().getName());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsLivePhotoVideoUpload", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.m2 Hj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Hj();
        pa4.s sVar = this.f434598e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.l2 n17 = Hj.n1(pa4.s.c(sVar));
        try {
            pa4.s.b(sVar).f462103n = 1;
            pa4.s.b(sVar).f462108s = i17;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getUploadInfo$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload");
            r45.mj4 mj4Var = sVar.f434606b;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getUploadInfo$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload");
            n17.m(mj4Var.mo14344x5f01b1f6());
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsLivePhotoVideoUpload", "onErrorServer >> " + e17.getMessage());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getCallback$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getCallback$p", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload");
        ((pa4.i) sVar.f434609e).a(false, true);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoVideoUpload$onErrorServer$1");
    }
}
