package td4;

/* loaded from: classes4.dex */
public final class d implements xd4.p0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f499174a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ td4.g f499175b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.jj4 f499176c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f499177d;

    public d(java.lang.String str, td4.g gVar, r45.jj4 jj4Var, java.lang.String str2) {
        this.f499174a = str;
        this.f499175b = gVar;
        this.f499176c = jj4Var;
        this.f499177d = str2;
    }

    @Override // xd4.p0
    public void a(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoInfo videoInfo) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onMoovReady", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper$downLoadSnsVideoByCdn$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMoovReady", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper$downLoadSnsVideoByCdn$1");
    }

    @Override // xd4.p0
    /* renamed from: onCompleted */
    public void mo70659xaa8b332c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCompleted", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper$downLoadSnsVideoByCdn$1");
        java.lang.String mediaPath = this.f499174a;
        boolean j17 = com.p314xaae8f345.mm.vfs.w6.j(mediaPath);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAlbumPickerDownloadHelper", "downLoadSnsVideoByCdn onCompleted, cdn video fileExist:" + j17 + ", path:" + mediaPath);
        td4.g gVar = this.f499175b;
        if (j17) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mediaPath, "$mediaPath");
            gVar.a(mediaPath, this.f499176c);
        } else {
            td4.g.c(gVar, null, 1, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCompleted", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper$downLoadSnsVideoByCdn$1");
    }

    @Override // xd4.p0
    /* renamed from: onError */
    public void mo70660xaf8aa769(java.lang.Exception exception) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onError", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper$downLoadSnsVideoByCdn$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exception, "exception");
        java.lang.String str = this.f499174a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsAlbumPickerDownloadHelper", "downLoadSnsVideoByCdn onError, thread name:" + java.lang.Thread.currentThread().getName() + ", localId:" + this.f499177d + ", fileExist:" + com.p314xaae8f345.mm.vfs.w6.j(str) + ", path:" + str);
        td4.g.c(this.f499175b, null, 1, null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onError", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper$downLoadSnsVideoByCdn$1");
    }

    @Override // xd4.p0
    /* renamed from: onProgress */
    public void mo70661x696ee52c(float f17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onProgress", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper$downLoadSnsVideoByCdn$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onProgress", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper$downLoadSnsVideoByCdn$1");
    }
}
