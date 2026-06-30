package be1;

/* loaded from: classes7.dex */
public class s0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f101037d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ be1.t0 f101038e;

    public s0(be1.t0 t0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar) {
        this.f101038e = t0Var;
        this.f101037d = lVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0
    public void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiSetKeepScreenOn", "onDestroy");
        be1.t0 t0Var = this.f101038e;
        if (t0Var.D()) {
            t0Var.E();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.e(this.f101037d.mo48798x74292566(), this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0
    public void e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w0 w0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiSetKeepScreenOn", "onPause");
        be1.t0 t0Var = this.f101038e;
        if (t0Var.D()) {
            t0Var.E();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0
    public void g() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiSetKeepScreenOn", "onResume");
        be1.t0 t0Var = this.f101038e;
        if (t0Var.f101045i) {
            t0Var.C();
        }
    }
}
