package be1;

/* loaded from: classes7.dex */
public class s implements be1.v {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.Future f19498a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f19499b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f19500c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f19501d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ be1.z f19502e;

    public s(be1.z zVar, java.util.Map map, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17) {
        this.f19502e = zVar;
        this.f19499b = map;
        this.f19500c = lVar;
        this.f19501d = i17;
        ku5.u0 u0Var = ku5.t0.f312615d;
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: be1.s$$a
            @Override // java.lang.Runnable
            public final void run() {
                be1.s sVar = be1.s.this;
                sVar.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetNetworkType", "getMobileSignalStrength, timeout");
                sVar.b(Integer.MAX_VALUE);
            }
        };
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        this.f19498a = t0Var.z(runnable, 3000L, false);
    }

    @Override // be1.v
    public void a(int i17) {
        java.util.concurrent.Future future = this.f19498a;
        if (future.isDone()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiGetNetworkType", "onGetSignalStrength, dbm: %d, fallbackFuture done too early", java.lang.Integer.valueOf(i17));
        } else {
            future.cancel(false);
            b(i17);
        }
    }

    public final void b(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetNetworkType", "onGetSignalStrengthInternal, dbm: " + i17);
        java.util.Map map = this.f19499b;
        if (Integer.MAX_VALUE != i17) {
            map.put("signalStrength", java.lang.Integer.valueOf(i17));
        }
        this.f19500c.a(this.f19501d, this.f19502e.p("ok", map));
    }
}
