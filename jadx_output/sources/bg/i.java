package bg;

/* loaded from: classes7.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f19804d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f19805e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bg.f f19806f;

    public i(bg.f fVar, int i17, int i18) {
        this.f19806f = fVar;
        this.f19804d = i17;
        this.f19805e = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        bg.f fVar = this.f19806f;
        int i17 = this.f19804d;
        int i18 = this.f19805e;
        if (!fVar.B) {
            com.tencent.mars.xlog.Log.i(fVar.A(), "onMediaPlayerError, mp released");
            return;
        }
        com.tencent.mars.xlog.Log.i(fVar.A(), "onError, what:%d, extra:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        dg.d dVar = fVar.f19768n;
        if (dVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.AppBrandVideoErrorHandler", "onVideoError(%d, %d)", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            dg.c cVar = ((fg1.a0) dVar).f261839a;
            if (cVar != null) {
                cVar.a(i17 == -1024 ? "VIDEO_ERROR" : i17 == -20000 ? "MEDIA_ERR_DRM" : (i17 == -1010 || i17 == -1007) ? "MEDIA_ERR_SRC_NOT_SUPPORTED" : (i17 != -1004 ? com.tencent.mars.comm.NetStatusUtil.isConnected(com.tencent.mm.sdk.platformtools.x2.f193071a) : com.tencent.mars.comm.NetStatusUtil.isConnected(com.tencent.mm.sdk.platformtools.x2.f193071a)) ? "MEDIA_ERR_DECODE" : "MEDIA_ERR_NETWORK", i17, i18);
            }
        }
    }
}
