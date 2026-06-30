package ci5;

/* loaded from: classes12.dex */
public final class z implements ek4.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ci5.b0 f123348a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f123349b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ci5.j f123350c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gg3.c f123351d;

    public z(ci5.b0 b0Var, java.lang.String str, ci5.j jVar, gg3.c cVar) {
        this.f123348a = b0Var;
        this.f123349b = str;
        this.f123350c = jVar;
        this.f123351d = cVar;
    }

    @Override // ek4.w
    public void b(int i17, dn.o oVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.CFinderLiveStorageVideoStateManager", "startPreloadDownloadTask ret=" + i17 + ' ' + oVar);
        if (i17 != 0) {
            java.lang.String mediaId = this.f123349b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mediaId, "$mediaId");
            this.f123348a.Y6(mediaId);
            jg3.b.X6(this.f123348a, this.f123350c, gg3.d.f353267f, this.f123351d, null, 4, null);
        }
    }
}
