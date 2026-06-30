package sc3;

/* loaded from: classes7.dex */
public final class w0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc3.k1 f488080d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f488081e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f488082f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f488083g;

    public w0(sc3.k1 k1Var, int i17, int i18, int i19) {
        this.f488080d = k1Var;
        this.f488081e = i17;
        this.f488082f = i18;
        this.f488083g = i19;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pc3.c cVar = (pc3.c) this.f488080d.f488022u.get(java.lang.Integer.valueOf(this.f488081e));
        if (cVar != null) {
            android.view.Surface surface = cVar.f434904e;
            if (surface == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MBRendererView", "updateSurfaceSize: surface is empty");
                return;
            }
            gh.t tVar = cVar.f434903d;
            if (tVar != null) {
                tVar.c(surface, this.f488082f, this.f488083g);
            }
        }
    }
}
