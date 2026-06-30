package ci5;

/* loaded from: classes12.dex */
public final class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ci5.b0 f123248d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f123249e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ci5.j f123250f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gg3.c f123251g;

    public a0(ci5.b0 b0Var, java.lang.String str, ci5.j jVar, gg3.c cVar) {
        this.f123248d = b0Var;
        this.f123249e = str;
        this.f123250f = jVar;
        this.f123251g = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ci5.b0 b0Var = this.f123248d;
        java.util.Map map = b0Var.f123253f;
        java.lang.String mediaId = this.f123249e;
        if (!map.containsKey(mediaId)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MediaGallery.CFinderLiveStorageVideoStateManager", "Task timeout, but task not exists. mediaId: " + mediaId);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.CFinderLiveStorageVideoStateManager", "Task timeout, canceling task. mediaId: " + mediaId);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mediaId, "$mediaId");
            b0Var.Y6(mediaId);
            jg3.b.X6(this.f123248d, this.f123250f, gg3.d.f353267f, this.f123251g, null, 4, null);
        }
    }
}
