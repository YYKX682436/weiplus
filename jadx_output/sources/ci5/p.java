package ci5;

/* loaded from: classes12.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ci5.q f41769d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f41770e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mf3.k f41771f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ sf3.g f41772g;

    public p(ci5.q qVar, java.lang.String str, mf3.k kVar, sf3.g gVar) {
        this.f41769d = qVar;
        this.f41770e = str;
        this.f41771f = kVar;
        this.f41772g = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ci5.q qVar = this.f41769d;
        java.util.Map map = qVar.f41773g;
        java.lang.String mediaId = this.f41770e;
        if (!map.containsKey(mediaId)) {
            com.tencent.mars.xlog.Log.w("MediaGallery.FinderLiveImageStateManager", "Task timeout, but task not exists. mediaId: " + mediaId);
            return;
        }
        com.tencent.mars.xlog.Log.i("MediaGallery.FinderLiveImageStateManager", "Task timeout, canceling task. mediaId: " + mediaId);
        kotlin.jvm.internal.o.f(mediaId, "$mediaId");
        qVar.X6(mediaId);
        qVar.W6(this.f41771f, sf3.k.f407398f, this.f41772g);
    }
}
