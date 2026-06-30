package ci5;

/* loaded from: classes12.dex */
public final class w extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ci5.b0 f123329d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f123330e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f123331f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dn.g f123332g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ dn.h f123333h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f123334i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f123335m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f123336n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ mf3.k f123337o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ gg3.c f123338p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ ci5.j f123339q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(ci5.b0 b0Var, java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17, java.lang.Runnable runnable, java.lang.String str2, mf3.k kVar, gg3.c cVar, ci5.j jVar) {
        super(0);
        this.f123329d = b0Var;
        this.f123330e = str;
        this.f123331f = i17;
        this.f123332g = gVar;
        this.f123333h = hVar;
        this.f123334i = z17;
        this.f123335m = runnable;
        this.f123336n = str2;
        this.f123337o = kVar;
        this.f123338p = cVar;
        this.f123339q = jVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ci5.b0 b0Var = this.f123329d;
        java.util.Map map = b0Var.f123253f;
        java.lang.String mediaId = this.f123330e;
        if (map.containsKey(mediaId)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("callback() mediaId=");
            sb6.append(mediaId);
            sb6.append(" startRet=");
            int i17 = this.f123331f;
            sb6.append(i17);
            sb6.append(" progressInfo=");
            dn.g gVar = this.f123332g;
            sb6.append(gVar);
            sb6.append(" sceneResult=");
            sb6.append(this.f123333h);
            sb6.append(" onlyCheckExist=");
            sb6.append(this.f123334i);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.CFinderLiveStorageVideoStateManager", sb6.toString());
            android.os.Handler handler = b0Var.f123255h;
            java.lang.Runnable runnable = this.f123335m;
            handler.removeCallbacks(runnable);
            handler.postDelayed(runnable, com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
            if (i17 == 0) {
                if (gVar != null) {
                    long j17 = gVar.f69500x8ab84c59;
                    long j18 = gVar.f69496x83ec3dd;
                    if (j17 <= j18) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.CFinderLiveStorageVideoStateManager", "onDownloadSuccess, mediaId: " + mediaId + ", path: " + this.f123336n);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mediaId, "$mediaId");
                        b0Var.Y6(mediaId);
                        ci5.b0 b0Var2 = this.f123329d;
                        pf5.e.m158343xd39de650(b0Var2, null, null, new ci5.v(this.f123336n, this.f123338p, b0Var2, this.f123337o, this.f123330e, null), 3, null);
                    } else if (j17 > 0) {
                        float f17 = (((float) j18) * 1.0f) / ((float) j17);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.CFinderLiveStorageVideoStateManager", "onProgress: " + mediaId + ", progress: " + f17 + '(' + j18 + '/' + j17 + ')');
                        b0Var.W6(this.f123337o, gg3.d.f353265d, this.f123338p, new gg3.e(null, 0, f17, 3, null));
                    }
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.CFinderLiveStorageVideoStateManager", "start failed");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mediaId, "$mediaId");
                b0Var.Y6(mediaId);
                jg3.b.X6(this.f123329d, this.f123339q, gg3.d.f353267f, this.f123338p, null, 4, null);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.CFinderLiveStorageVideoStateManager", "callback, task not exists. mediaId: " + mediaId);
        }
        return jz5.f0.f384359a;
    }
}
