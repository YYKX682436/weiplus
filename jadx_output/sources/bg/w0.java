package bg;

/* loaded from: classes7.dex */
public class w0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f19843d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f19844e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bg.f f19845f;

    public w0(bg.f fVar, int i17, int i18) {
        this.f19845f = fVar;
        this.f19843d = i17;
        this.f19844e = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        bg.f fVar = this.f19845f;
        int i17 = this.f19843d;
        int i18 = this.f19844e;
        if (!fVar.B) {
            com.tencent.mars.xlog.Log.i(fVar.A(), "onMediaPlayerVideoSizeChanged, mp released");
            return;
        }
        com.tencent.mars.xlog.Log.i(fVar.A(), "onVideoSizeChanged, width:%d, height:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        fVar.r(false);
        ye1.e eVar = fVar.f19764h;
        int duration = eVar != null ? eVar.getDuration() : 0;
        if (fVar.f19786z && fVar.f19764h != null && (i17 != fVar.I || i18 != fVar.f19762J || duration != fVar.K)) {
            if (fVar.U()) {
                ((fg1.b0) fVar.f19765i).e(i17, i18, duration);
                long currentTimeMillis = java.lang.System.currentTimeMillis() - fVar.F1;
                com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.VideoPluginHandler", "updateLoadMetaDataCostTime onVideoLoadedMetaData cost:%dms", java.lang.Long.valueOf(currentTimeMillis));
                fVar.f19764h.v(currentTimeMillis);
            }
            bg.a aVar = fVar.E1;
            if (aVar != null) {
                android.util.Size size = new android.util.Size(i17, i18);
                lm1.t tVar = (lm1.t) aVar;
                size.toString();
                tVar.f319363e = size;
                tVar.a();
            }
        }
        fVar.I = i17;
        fVar.f19762J = i18;
        fVar.K = duration;
    }
}
