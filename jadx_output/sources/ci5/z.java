package ci5;

/* loaded from: classes12.dex */
public final class z implements ek4.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ci5.b0 f41815a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f41816b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ci5.j f41817c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gg3.c f41818d;

    public z(ci5.b0 b0Var, java.lang.String str, ci5.j jVar, gg3.c cVar) {
        this.f41815a = b0Var;
        this.f41816b = str;
        this.f41817c = jVar;
        this.f41818d = cVar;
    }

    @Override // ek4.w
    public void b(int i17, dn.o oVar) {
        com.tencent.mars.xlog.Log.i("MediaGallery.CFinderLiveStorageVideoStateManager", "startPreloadDownloadTask ret=" + i17 + ' ' + oVar);
        if (i17 != 0) {
            java.lang.String mediaId = this.f41816b;
            kotlin.jvm.internal.o.f(mediaId, "$mediaId");
            this.f41815a.Y6(mediaId);
            jg3.b.X6(this.f41815a, this.f41817c, gg3.d.f271734f, this.f41818d, null, 4, null);
        }
    }
}
