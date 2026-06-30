package dg1;

/* loaded from: classes7.dex */
public class g extends eg.a {

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f313812g = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(java.lang.String.format(java.util.Locale.ENGLISH, "MapThread_%d", java.lang.Integer.valueOf(this.f334030d)));

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f313813h = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());

    /* renamed from: i, reason: collision with root package name */
    public volatile android.view.Surface f313814i;

    /* renamed from: m, reason: collision with root package name */
    public volatile vc1.a3 f313815m;

    @Override // eg.b
    public boolean b(sf.f fVar) {
        return true;
    }

    @Override // eg.a, eg.b
    public void c(android.view.MotionEvent motionEvent) {
        if (this.f313815m != null) {
            this.f313815m.mo124372x667eb1da(motionEvent);
        }
    }

    @Override // eg.a, eg.b
    public void e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.SameLayer.AppBrandMapPluginHandler", "handlePluginDestroy %d", java.lang.Integer.valueOf(this.f334030d));
        if (this.f313814i != null) {
            this.f313814i.release();
            this.f313814i = null;
        }
    }

    @Override // eg.b
    public java.lang.String f(sf.f fVar) {
        if (!(fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.b)) {
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.b bVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.b) fVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l m17 = bVar.m();
        int i17 = bVar.f159552a;
        java.lang.String q17 = q();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var = bVar.f159554c;
        java.lang.String k17 = k0Var.k();
        org.json.JSONObject jSONObject = bVar.f159553b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.SameLayer.AppBrandMapPluginHandler", "*** handler(%s) handleJsApi(%s), data:%s", q17, k17, jSONObject.toString());
        dg1.c cVar = new dg1.c(this, k0Var, m17, jSONObject, i17);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f313812g;
        if (n3Var.mo50280x23b2dd47() == android.os.Looper.myLooper()) {
            cVar.run();
            return null;
        }
        n3Var.mo50293x3498a0(cVar);
        return null;
    }

    @Override // eg.a, eg.b
    public void i(android.view.Surface surface) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.SameLayer.AppBrandMapPluginHandler", "handlePluginReady %d", java.lang.Integer.valueOf(this.f334030d));
        this.f313814i = surface;
        this.f313812g.mo50293x3498a0(new dg1.a(this));
    }

    @Override // eg.b
    public void p(android.graphics.SurfaceTexture surfaceTexture) {
        i(new android.view.Surface(surfaceTexture));
    }
}
