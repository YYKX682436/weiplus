package ci5;

/* loaded from: classes12.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ci5.q f41751d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f41752e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f41753f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dn.g f41754g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ dn.h f41755h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f41756i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f41757m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f41758n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ mf3.k f41759o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ sf3.g f41760p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ sf3.g f41761q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ci5.q qVar, java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17, java.lang.Runnable runnable, java.lang.String str2, mf3.k kVar, sf3.g gVar2, sf3.g gVar3) {
        super(0);
        this.f41751d = qVar;
        this.f41752e = str;
        this.f41753f = i17;
        this.f41754g = gVar;
        this.f41755h = hVar;
        this.f41756i = z17;
        this.f41757m = runnable;
        this.f41758n = str2;
        this.f41759o = kVar;
        this.f41760p = gVar2;
        this.f41761q = gVar3;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ci5.q qVar = this.f41751d;
        java.util.Map map = qVar.f41773g;
        java.lang.String mediaId = this.f41752e;
        if (map.containsKey(mediaId)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("callback, mediaId=");
            sb6.append(mediaId);
            sb6.append(" startRet=");
            int i17 = this.f41753f;
            sb6.append(i17);
            sb6.append(" progressInfo=");
            sb6.append(this.f41754g);
            sb6.append(" sceneResult=");
            dn.h hVar = this.f41755h;
            sb6.append(hVar);
            sb6.append(" onlyCheckExist=");
            sb6.append(this.f41756i);
            com.tencent.mars.xlog.Log.i("MediaGallery.FinderLiveImageStateManager", sb6.toString());
            android.os.Handler handler = qVar.f41775i;
            java.lang.Runnable runnable = this.f41757m;
            handler.removeCallbacks(runnable);
            handler.postDelayed(runnable, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
            if (i17 == 0) {
                if (hVar != null) {
                    com.tencent.mars.xlog.Log.i("MediaGallery.FinderLiveImageStateManager", "onDownloadSuccess, mediaId: " + mediaId + ", path: " + this.f41758n);
                    kotlin.jvm.internal.o.f(mediaId, "$mediaId");
                    qVar.X6(mediaId);
                    ci5.q qVar2 = this.f41751d;
                    pf5.e.launch$default(qVar2, null, null, new ci5.m(this.f41758n, this.f41761q, qVar2, this.f41759o, this.f41760p, this.f41752e, null), 3, null);
                }
            } else {
                com.tencent.mars.xlog.Log.i("MediaGallery.FinderLiveImageStateManager", "onDownloadFailed, mediaId: " + mediaId);
                kotlin.jvm.internal.o.f(mediaId, "$mediaId");
                qVar.X6(mediaId);
                qVar.W6(this.f41759o, sf3.k.f407398f, this.f41760p);
            }
        } else {
            com.tencent.mars.xlog.Log.i("MediaGallery.FinderLiveImageStateManager", "callback, task not exists. mediaId: " + mediaId);
        }
        return jz5.f0.f302826a;
    }
}
