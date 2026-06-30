package be1;

/* loaded from: classes7.dex */
public class s0 extends com.tencent.mm.plugin.appbrand.v0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f19504d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ be1.t0 f19505e;

    public s0(be1.t0 t0Var, com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        this.f19505e = t0Var;
        this.f19504d = lVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.v0
    public void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiSetKeepScreenOn", "onDestroy");
        be1.t0 t0Var = this.f19505e;
        if (t0Var.D()) {
            t0Var.E();
        }
        com.tencent.mm.plugin.appbrand.x0.e(this.f19504d.getAppId(), this);
    }

    @Override // com.tencent.mm.plugin.appbrand.v0
    public void e(com.tencent.mm.plugin.appbrand.w0 w0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiSetKeepScreenOn", "onPause");
        be1.t0 t0Var = this.f19505e;
        if (t0Var.D()) {
            t0Var.E();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.v0
    public void g() {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiSetKeepScreenOn", "onResume");
        be1.t0 t0Var = this.f19505e;
        if (t0Var.f19512i) {
            t0Var.C();
        }
    }
}
