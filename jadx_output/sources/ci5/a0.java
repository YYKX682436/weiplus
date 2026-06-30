package ci5;

/* loaded from: classes12.dex */
public final class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ci5.b0 f41715d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f41716e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ci5.j f41717f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gg3.c f41718g;

    public a0(ci5.b0 b0Var, java.lang.String str, ci5.j jVar, gg3.c cVar) {
        this.f41715d = b0Var;
        this.f41716e = str;
        this.f41717f = jVar;
        this.f41718g = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ci5.b0 b0Var = this.f41715d;
        java.util.Map map = b0Var.f41720f;
        java.lang.String mediaId = this.f41716e;
        if (!map.containsKey(mediaId)) {
            com.tencent.mars.xlog.Log.w("MediaGallery.CFinderLiveStorageVideoStateManager", "Task timeout, but task not exists. mediaId: " + mediaId);
        } else {
            com.tencent.mars.xlog.Log.i("MediaGallery.CFinderLiveStorageVideoStateManager", "Task timeout, canceling task. mediaId: " + mediaId);
            kotlin.jvm.internal.o.f(mediaId, "$mediaId");
            b0Var.Y6(mediaId);
            jg3.b.X6(this.f41715d, this.f41717f, gg3.d.f271734f, this.f41718g, null, 4, null);
        }
    }
}
