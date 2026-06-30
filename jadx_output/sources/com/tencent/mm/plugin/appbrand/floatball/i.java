package com.tencent.mm.plugin.appbrand.floatball;

/* loaded from: classes7.dex */
public final class i extends com.tencent.mm.plugin.ball.service.s4 {

    /* renamed from: v, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.AppBrandRuntime f78099v;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f78100w;

    /* renamed from: x, reason: collision with root package name */
    public volatile com.tencent.mm.plugin.appbrand.jsapi.bluetooth.r f78101x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(dp1.x pageAdapter, com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime) {
        super(pageAdapter);
        kotlin.jvm.internal.o.g(pageAdapter, "pageAdapter");
        kotlin.jvm.internal.o.g(runtime, "runtime");
        this.f78099v = runtime;
        this.f78100w = "MicroMsg.AppBrand.AppBrandBluetoothFloatBallHelper#" + com.tencent.mm.plugin.appbrand.jsapi.bluetooth.i.f80074b.d(runtime);
    }

    @Override // com.tencent.mm.plugin.ball.service.s4, com.tencent.mm.plugin.ball.service.d
    public void H() {
        com.tencent.mars.xlog.Log.i(this.f78100w, "onReceivedBallInfoRemovedEvent");
        n0();
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.s c17 = com.tencent.mm.plugin.appbrand.jsapi.bluetooth.i.f80074b.c(this.f78099v);
        if (c17 != null) {
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.s.n8(c17, false, 1, null);
        }
        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.k0 k0Var = com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.k0.f77902a;
        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.k0.f77903b.d(this.f78099v.f74803n, this.f78099v.f74805p.f77281g, bm5.f1.a());
    }

    @Override // com.tencent.mm.plugin.ball.service.s4, com.tencent.mm.plugin.ball.service.d
    public void I() {
        com.tencent.mars.xlog.Log.i(this.f78100w, "onReceivedFinishWhenSwitchBallEvent");
        this.f93239n.q(true);
    }

    @Override // com.tencent.mm.plugin.ball.service.s4, com.tencent.mm.plugin.ball.service.d, gp1.r
    public void b(int i17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i(this.f78100w, "onCreate, floatBallType: " + str + ", floatBallKey: " + str);
        super.b(i17, str);
        Q(2);
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.s a17 = com.tencent.mm.plugin.appbrand.jsapi.bluetooth.i.f80074b.a(this.f78099v);
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.r rVar = this.f78101x;
        if (rVar == null) {
            com.tencent.mars.xlog.Log.i(this.f78100w, "requireBackgroundSupportStateListener, create");
            rVar = new com.tencent.mm.plugin.appbrand.floatball.h(this);
            this.f78101x = rVar;
        }
        a17.S6(rVar);
    }

    @Override // com.tencent.mm.plugin.ball.service.s4
    public boolean m0(int i17) {
        com.tencent.mars.xlog.Log.i(this.f78100w, "onClose, way: " + i17);
        if (!u()) {
            return false;
        }
        android.content.Context context = this.f78099v.f74795d;
        kotlin.jvm.internal.o.f(context, "getAppContext(...)");
        if (((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(context)) {
            t0(i17);
            return true;
        }
        com.tencent.mm.plugin.appbrand.floatball.t.a(context, 33, new com.tencent.mm.plugin.appbrand.floatball.f(this, i17));
        return true;
    }

    @Override // com.tencent.mm.plugin.ball.service.s4
    public void o0() {
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.s c17;
        com.tencent.mars.xlog.Log.i(this.f78100w, "onDestroy");
        super.o0();
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.r rVar = this.f78101x;
        if (rVar == null || (c17 = com.tencent.mm.plugin.appbrand.jsapi.bluetooth.i.f80074b.c(this.f78099v)) == null) {
            return;
        }
        c17.j8(rVar);
    }

    public final void t0(int i17) {
        t().f93090m = f0(i17);
        g();
        com.tencent.mm.plugin.ball.ui.e0.b(this.f93239n, this.f93136h.G(), new com.tencent.mm.plugin.appbrand.floatball.g(this));
    }

    @Override // com.tencent.mm.plugin.ball.service.s4, com.tencent.mm.plugin.ball.service.d
    public void x() {
        com.tencent.mars.xlog.Log.i(this.f78100w, "onEnterPage");
        if (s() != null) {
            d0(false);
        }
    }

    @Override // com.tencent.mm.plugin.ball.service.s4, com.tencent.mm.plugin.ball.service.d
    public void z() {
        com.tencent.mars.xlog.Log.i(this.f78100w, "onExitPage");
        if (s() != null) {
            d0(true);
        }
    }
}
