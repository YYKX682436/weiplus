package pa4;

/* loaded from: classes3.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f434595a = jz5.h.b(pa4.n.f434594d);

    public final void a(java.lang.String func, java.lang.Runnable runnable) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("executeWork", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadWorkHelper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(func, "func");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runnable, "runnable");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsLivePhotoUploadWorkHelper", "executeWork >> " + func + " time: " + java.lang.System.currentTimeMillis() + " threadName:" + java.lang.Thread.currentThread());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLivePhotoUploadWorker", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadWorkHelper");
        ku5.f fVar = (ku5.f) ((jz5.n) this.f434595a).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLivePhotoUploadWorker", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadWorkHelper");
        fVar.execute(runnable);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("executeWork", "com.tencent.mm.plugin.sns.model.upload.livephoto.SnsLivePhotoUploadWorkHelper");
    }
}
