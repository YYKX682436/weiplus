package be1;

/* loaded from: classes7.dex */
public class s implements be1.v {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.Future f101031a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f101032b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f101033c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f101034d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ be1.z f101035e;

    public s(be1.z zVar, java.util.Map map, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17) {
        this.f101035e = zVar;
        this.f101032b = map;
        this.f101033c = lVar;
        this.f101034d = i17;
        ku5.u0 u0Var = ku5.t0.f394148d;
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: be1.s$$a
            @Override // java.lang.Runnable
            public final void run() {
                be1.s sVar = be1.s.this;
                sVar.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetNetworkType", "getMobileSignalStrength, timeout");
                sVar.b(Integer.MAX_VALUE);
            }
        };
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        this.f101031a = t0Var.z(runnable, 3000L, false);
    }

    @Override // be1.v
    public void a(int i17) {
        java.util.concurrent.Future future = this.f101031a;
        if (future.isDone()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiGetNetworkType", "onGetSignalStrength, dbm: %d, fallbackFuture done too early", java.lang.Integer.valueOf(i17));
        } else {
            future.cancel(false);
            b(i17);
        }
    }

    public final void b(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetNetworkType", "onGetSignalStrengthInternal, dbm: " + i17);
        java.util.Map map = this.f101032b;
        if (Integer.MAX_VALUE != i17) {
            map.put("signalStrength", java.lang.Integer.valueOf(i17));
        }
        this.f101033c.a(this.f101034d, this.f101035e.p("ok", map));
    }
}
