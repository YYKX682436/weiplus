package ci5;

/* loaded from: classes12.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ci5.q f123284d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f123285e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f123286f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dn.g f123287g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ dn.h f123288h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f123289i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f123290m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f123291n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ mf3.k f123292o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ sf3.g f123293p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ sf3.g f123294q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ci5.q qVar, java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17, java.lang.Runnable runnable, java.lang.String str2, mf3.k kVar, sf3.g gVar2, sf3.g gVar3) {
        super(0);
        this.f123284d = qVar;
        this.f123285e = str;
        this.f123286f = i17;
        this.f123287g = gVar;
        this.f123288h = hVar;
        this.f123289i = z17;
        this.f123290m = runnable;
        this.f123291n = str2;
        this.f123292o = kVar;
        this.f123293p = gVar2;
        this.f123294q = gVar3;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ci5.q qVar = this.f123284d;
        java.util.Map map = qVar.f123306g;
        java.lang.String mediaId = this.f123285e;
        if (map.containsKey(mediaId)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("callback, mediaId=");
            sb6.append(mediaId);
            sb6.append(" startRet=");
            int i17 = this.f123286f;
            sb6.append(i17);
            sb6.append(" progressInfo=");
            sb6.append(this.f123287g);
            sb6.append(" sceneResult=");
            dn.h hVar = this.f123288h;
            sb6.append(hVar);
            sb6.append(" onlyCheckExist=");
            sb6.append(this.f123289i);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.FinderLiveImageStateManager", sb6.toString());
            android.os.Handler handler = qVar.f123308i;
            java.lang.Runnable runnable = this.f123290m;
            handler.removeCallbacks(runnable);
            handler.postDelayed(runnable, com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
            if (i17 == 0) {
                if (hVar != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.FinderLiveImageStateManager", "onDownloadSuccess, mediaId: " + mediaId + ", path: " + this.f123291n);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mediaId, "$mediaId");
                    qVar.X6(mediaId);
                    ci5.q qVar2 = this.f123284d;
                    pf5.e.m158343xd39de650(qVar2, null, null, new ci5.m(this.f123291n, this.f123294q, qVar2, this.f123292o, this.f123293p, this.f123285e, null), 3, null);
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.FinderLiveImageStateManager", "onDownloadFailed, mediaId: " + mediaId);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mediaId, "$mediaId");
                qVar.X6(mediaId);
                qVar.W6(this.f123292o, sf3.k.f488931f, this.f123293p);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.FinderLiveImageStateManager", "callback, task not exists. mediaId: " + mediaId);
        }
        return jz5.f0.f384359a;
    }
}
