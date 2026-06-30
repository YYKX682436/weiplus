package bg;

/* loaded from: classes7.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f101337d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f101338e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bg.f f101339f;

    public i(bg.f fVar, int i17, int i18) {
        this.f101339f = fVar;
        this.f101337d = i17;
        this.f101338e = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        bg.f fVar = this.f101339f;
        int i17 = this.f101337d;
        int i18 = this.f101338e;
        if (!fVar.B) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar.A(), "onMediaPlayerError, mp released");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar.A(), "onError, what:%d, extra:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        dg.d dVar = fVar.f101301n;
        if (dVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.AppBrandVideoErrorHandler", "onVideoError(%d, %d)", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            dg.c cVar = ((fg1.a0) dVar).f343372a;
            if (cVar != null) {
                cVar.a(i17 == -1024 ? "VIDEO_ERROR" : i17 == -20000 ? "MEDIA_ERR_DRM" : (i17 == -1010 || i17 == -1007) ? "MEDIA_ERR_SRC_NOT_SUPPORTED" : (i17 != -1004 ? com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) : com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) ? "MEDIA_ERR_DECODE" : "MEDIA_ERR_NETWORK", i17, i18);
            }
        }
    }
}
