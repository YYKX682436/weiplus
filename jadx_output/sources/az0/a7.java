package az0;

/* loaded from: classes5.dex */
public final class a7 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f15325d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ az0.n7 f15326e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.instamovie.MJMovieSession.OnRecommendComplete f15327f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a7(java.util.List list, az0.n7 n7Var, com.tencent.maas.instamovie.MJMovieSession.OnRecommendComplete onRecommendComplete) {
        super(1);
        this.f15325d = list;
        this.f15326e = n7Var;
        this.f15327f = onRecommendComplete;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.maas.instamovie.MJMovieSession.OnTaskProgress onProgress = (com.tencent.maas.instamovie.MJMovieSession.OnTaskProgress) obj;
        kotlin.jvm.internal.o.g(onProgress, "onProgress");
        java.util.List<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> list = this.f15325d;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        for (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem : list) {
            arrayList.add(new com.tencent.maas.instamovie.base.asset.MJAssetInfo(qg.a.Filepath, galleryItem$MediaItem.f138430e, galleryItem$MediaItem.getType() == 1 ? qg.c.Image : qg.c.Video));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasMovieSessionManager", "startMovieCreationAutoRecommendTemplate");
        az0.n7 n7Var = this.f15326e;
        com.tencent.maas.instamovie.MJAsyncTaskInfo startMovieCreationAutoRecommendTemplate = n7Var.f15742a.startMovieCreationAutoRecommendTemplate(arrayList, n7Var.f15744c, new com.tencent.maas.instamovie.MJRecommendOptions(com.tencent.maas.instamovie.c.Foreground, n7Var.f15743b.f244855a), az0.n7.a(n7Var), onProgress, this.f15327f);
        kotlin.jvm.internal.o.f(startMovieCreationAutoRecommendTemplate, "startMovieCreationAutoRecommendTemplate(...)");
        return startMovieCreationAutoRecommendTemplate;
    }
}
