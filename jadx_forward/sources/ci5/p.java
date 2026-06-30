package ci5;

/* loaded from: classes12.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ci5.q f123302d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f123303e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mf3.k f123304f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ sf3.g f123305g;

    public p(ci5.q qVar, java.lang.String str, mf3.k kVar, sf3.g gVar) {
        this.f123302d = qVar;
        this.f123303e = str;
        this.f123304f = kVar;
        this.f123305g = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ci5.q qVar = this.f123302d;
        java.util.Map map = qVar.f123306g;
        java.lang.String mediaId = this.f123303e;
        if (!map.containsKey(mediaId)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MediaGallery.FinderLiveImageStateManager", "Task timeout, but task not exists. mediaId: " + mediaId);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.FinderLiveImageStateManager", "Task timeout, canceling task. mediaId: " + mediaId);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mediaId, "$mediaId");
        qVar.X6(mediaId);
        qVar.W6(this.f123304f, sf3.k.f488931f, this.f123305g);
    }
}
