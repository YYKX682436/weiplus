package tf1;

/* loaded from: classes7.dex */
public class a extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tf1.f f500387d;

    public a(tf1.f fVar) {
        this.f500387d = fVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0
    public void b() {
        super.b();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "onCreate");
        this.f500387d.f500394g = false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0
    public void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "onDestroy");
        tf1.f fVar = this.f500387d;
        fVar.b();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.e(fVar.f500392e, this);
        fVar.f500396i.clear();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0
    public void e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w0 w0Var) {
        super.e(w0Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "onPause, type: " + w0Var);
        this.f500387d.s(w0Var);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0
    public void g() {
        super.g();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "onResume");
        tf1.f fVar = this.f500387d;
        fVar.f500394g = false;
        if (fVar.f500407w.getAndSet(false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "onRuntimeForeground, ignore");
            return;
        }
        tf.q g17 = fVar.g();
        if (g17 == null) {
            return;
        }
        if (fVar.l()) {
            fVar.A(g17);
        }
        fVar.f500397m = false;
        fVar.f500393f.a();
        fVar.f500398n = null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "onRuntimeForeground, disableAppBrandBackgroundRun");
        fVar.b();
    }
}
