package bg;

/* loaded from: classes7.dex */
public class w0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f101376d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f101377e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bg.f f101378f;

    public w0(bg.f fVar, int i17, int i18) {
        this.f101378f = fVar;
        this.f101376d = i17;
        this.f101377e = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        bg.f fVar = this.f101378f;
        int i17 = this.f101376d;
        int i18 = this.f101377e;
        if (!fVar.B) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar.A(), "onMediaPlayerVideoSizeChanged, mp released");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar.A(), "onVideoSizeChanged, width:%d, height:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        fVar.r(false);
        ye1.e eVar = fVar.f101297h;
        int mo1852x51e8b0a = eVar != null ? eVar.mo1852x51e8b0a() : 0;
        if (fVar.f101319z && fVar.f101297h != null && (i17 != fVar.I || i18 != fVar.f101295J || mo1852x51e8b0a != fVar.K)) {
            if (fVar.U()) {
                ((fg1.b0) fVar.f101298i).e(i17, i18, mo1852x51e8b0a);
                long currentTimeMillis = java.lang.System.currentTimeMillis() - fVar.F1;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.VideoPluginHandler", "updateLoadMetaDataCostTime onVideoLoadedMetaData cost:%dms", java.lang.Long.valueOf(currentTimeMillis));
                fVar.f101297h.v(currentTimeMillis);
            }
            bg.a aVar = fVar.E1;
            if (aVar != null) {
                android.util.Size size = new android.util.Size(i17, i18);
                lm1.t tVar = (lm1.t) aVar;
                size.toString();
                tVar.f400896e = size;
                tVar.a();
            }
        }
        fVar.I = i17;
        fVar.f101295J = i18;
        fVar.K = mo1852x51e8b0a;
    }
}
