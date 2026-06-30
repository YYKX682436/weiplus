package az0;

/* loaded from: classes5.dex */
public final class e7 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f15435d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f15436e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.instamovie.c f15437f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ az0.n7 f15438g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f15439h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.instamovie.MJMovieSession.OnComplete f15440i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e7(java.util.List list, boolean z17, com.tencent.maas.instamovie.c cVar, az0.n7 n7Var, java.lang.String str, com.tencent.maas.instamovie.MJMovieSession.OnComplete onComplete) {
        super(2);
        this.f15435d = list;
        this.f15436e = z17;
        this.f15437f = cVar;
        this.f15438g = n7Var;
        this.f15439h = str;
        this.f15440i = onComplete;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.maas.instamovie.MJMovieSession.OnTaskProgress onProgress = (com.tencent.maas.instamovie.MJMovieSession.OnTaskProgress) obj;
        com.tencent.maas.instamovie.MJMovieSession.OnComplete onComplete = (com.tencent.maas.instamovie.MJMovieSession.OnComplete) obj2;
        kotlin.jvm.internal.o.g(onProgress, "onProgress");
        kotlin.jvm.internal.o.g(onComplete, "onComplete");
        java.util.List<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> list = this.f15435d;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        for (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem : list) {
            arrayList.add(new com.tencent.maas.instamovie.base.asset.MJAssetInfo(qg.a.Filepath, galleryItem$MediaItem.f138430e, galleryItem$MediaItem.getType() == 1 ? qg.c.Image : qg.c.Video));
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startMovieCreationWithBlankTemplate recommend: ");
        sb6.append(this.f15436e);
        sb6.append(", mode:");
        com.tencent.maas.instamovie.c cVar = this.f15437f;
        sb6.append(cVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasMovieSessionManager", sb6.toString());
        az0.n7 n7Var = this.f15438g;
        return n7Var.f15742a.startMovieCreationUsingBlankTemplate(arrayList, this.f15439h, n7Var.f15744c, new com.tencent.maas.instamovie.MJRecommendOptions(cVar, n7Var.f15743b.f244855a), onProgress, onComplete, this.f15440i);
    }
}
