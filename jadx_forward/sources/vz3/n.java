package vz3;

/* loaded from: classes15.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vz3.q f523223d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vz3.p f523224e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f523225f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(vz3.q qVar, vz3.p pVar, long j17) {
        super(0);
        this.f523223d = qVar;
        this.f523224e = pVar;
        this.f523225f = j17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        long j17 = this.f523223d.f523236h;
        sz3.d0.f495524a.c(sz3.b0.f495498d);
        sz3.d0.f495533j = true;
        sz3.d0.f495525b = e04.j2.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanGoodsNoModelDetectManager", "init scanProductSkipFrameCount: " + sz3.d0.f495525b + ", enableFilterCodeFrame: " + sz3.d0.f495526c);
        sz3.d0.f495536m = this.f523223d.f523235g;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startGoodsSession sessionId: ");
        sb6.append(j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanGoodsNoModelDetectManager", sb6.toString());
        sz3.d0.f495531h = j17;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.n0 n0Var = this.f523224e.f523227a;
        if (n0Var != null) {
            n0Var.z0(this.f523225f);
        }
        return jz5.f0.f384359a;
    }
}
