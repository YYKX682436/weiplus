package sc3;

/* loaded from: classes7.dex */
public final class v0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc3.k1 f488077d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f488078e;

    public v0(sc3.k1 k1Var, int i17) {
        this.f488077d = k1Var;
        this.f488078e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pc3.c cVar = (pc3.c) this.f488077d.f488022u.get(java.lang.Integer.valueOf(this.f488078e));
        if (cVar != null) {
            android.view.Surface surface = cVar.f434904e;
            if (surface == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MBRendererView", "destroyService: try to destroy an empty surface");
                return;
            }
            cVar.f434904e = null;
            gh.t tVar = cVar.f434903d;
            if (tVar != null) {
                tVar.a(surface, false);
            }
        }
    }
}
