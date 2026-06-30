package ci5;

/* loaded from: classes12.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ci5.b0 f41796d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f41797e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f41798f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dn.g f41799g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ dn.h f41800h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f41801i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f41802m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f41803n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ mf3.k f41804o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ gg3.c f41805p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ ci5.j f41806q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(ci5.b0 b0Var, java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17, java.lang.Runnable runnable, java.lang.String str2, mf3.k kVar, gg3.c cVar, ci5.j jVar) {
        super(0);
        this.f41796d = b0Var;
        this.f41797e = str;
        this.f41798f = i17;
        this.f41799g = gVar;
        this.f41800h = hVar;
        this.f41801i = z17;
        this.f41802m = runnable;
        this.f41803n = str2;
        this.f41804o = kVar;
        this.f41805p = cVar;
        this.f41806q = jVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ci5.b0 b0Var = this.f41796d;
        java.util.Map map = b0Var.f41720f;
        java.lang.String mediaId = this.f41797e;
        if (map.containsKey(mediaId)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("callback() mediaId=");
            sb6.append(mediaId);
            sb6.append(" startRet=");
            int i17 = this.f41798f;
            sb6.append(i17);
            sb6.append(" progressInfo=");
            dn.g gVar = this.f41799g;
            sb6.append(gVar);
            sb6.append(" sceneResult=");
            sb6.append(this.f41800h);
            sb6.append(" onlyCheckExist=");
            sb6.append(this.f41801i);
            com.tencent.mars.xlog.Log.i("MediaGallery.CFinderLiveStorageVideoStateManager", sb6.toString());
            android.os.Handler handler = b0Var.f41722h;
            java.lang.Runnable runnable = this.f41802m;
            handler.removeCallbacks(runnable);
            handler.postDelayed(runnable, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
            if (i17 == 0) {
                if (gVar != null) {
                    long j17 = gVar.field_toltalLength;
                    long j18 = gVar.field_finishedLength;
                    if (j17 <= j18) {
                        com.tencent.mars.xlog.Log.i("MediaGallery.CFinderLiveStorageVideoStateManager", "onDownloadSuccess, mediaId: " + mediaId + ", path: " + this.f41803n);
                        kotlin.jvm.internal.o.f(mediaId, "$mediaId");
                        b0Var.Y6(mediaId);
                        ci5.b0 b0Var2 = this.f41796d;
                        pf5.e.launch$default(b0Var2, null, null, new ci5.v(this.f41803n, this.f41805p, b0Var2, this.f41804o, this.f41797e, null), 3, null);
                    } else if (j17 > 0) {
                        float f17 = (((float) j18) * 1.0f) / ((float) j17);
                        com.tencent.mars.xlog.Log.i("MediaGallery.CFinderLiveStorageVideoStateManager", "onProgress: " + mediaId + ", progress: " + f17 + '(' + j18 + '/' + j17 + ')');
                        b0Var.W6(this.f41804o, gg3.d.f271732d, this.f41805p, new gg3.e(null, 0, f17, 3, null));
                    }
                }
            } else {
                com.tencent.mars.xlog.Log.i("MediaGallery.CFinderLiveStorageVideoStateManager", "start failed");
                kotlin.jvm.internal.o.f(mediaId, "$mediaId");
                b0Var.Y6(mediaId);
                jg3.b.X6(this.f41796d, this.f41806q, gg3.d.f271734f, this.f41805p, null, 4, null);
            }
        } else {
            com.tencent.mars.xlog.Log.i("MediaGallery.CFinderLiveStorageVideoStateManager", "callback, task not exists. mediaId: " + mediaId);
        }
        return jz5.f0.f302826a;
    }
}
