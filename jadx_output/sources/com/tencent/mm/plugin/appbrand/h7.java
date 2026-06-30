package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class h7 implements com.tencent.mm.plugin.appbrand.ipc.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f78264a;

    public h7(com.tencent.mm.plugin.appbrand.o6 o6Var) {
        this.f78264a = o6Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.l0
    public void a(java.lang.Object obj) {
        if (obj instanceof com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI.AuthStateChangedByUserEvent) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWC", "onCustomDataNotify, appId[%s], AuthStateChangedByUserEvent", this.f78264a.f74803n);
            ui1.t.f428082d.g(this.f78264a.f74803n);
            com.tencent.mm.plugin.appbrand.o6 o6Var = this.f78264a;
            com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI.AuthStateChangedByUserEvent authStateChangedByUserEvent = (com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI.AuthStateChangedByUserEvent) obj;
            com.tencent.mm.plugin.appbrand.ipc.l0 l0Var = com.tencent.mm.plugin.appbrand.backgroundrunning.t.f76992a;
            if (o6Var != null) {
                com.tencent.mm.plugin.appbrand.jsapi.lbs.j1 j1Var = (com.tencent.mm.plugin.appbrand.jsapi.lbs.j1) o6Var.k(com.tencent.mm.plugin.appbrand.jsapi.lbs.j1.class);
                if (j1Var instanceof com.tencent.mm.plugin.appbrand.jsapi.lbs.k1) {
                    com.tencent.mm.plugin.appbrand.jsapi.lbs.k1 k1Var = (com.tencent.mm.plugin.appbrand.jsapi.lbs.k1) j1Var;
                    boolean z17 = authStateChangedByUserEvent.f89325d;
                    boolean z18 = authStateChangedByUserEvent.f89326e;
                    boolean z19 = false;
                    boolean z27 = (k1Var.f81441q || z17) ? false : true;
                    if (k1Var.f81441q && (!z18 || !z17)) {
                        z19 = true;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandBackgroundRunningMonitor", "handleUserAuthChanged, should stop location foreground:%s, should stop location background:%s", java.lang.Boolean.valueOf(z27), java.lang.Boolean.valueOf(z19));
                    if (z27 || z19) {
                        k1Var.f81439o = true;
                        k1Var.l(2);
                        k1Var.q(o6Var);
                    }
                    if (z19) {
                        com.tencent.mm.plugin.appbrand.backgroundrunning.t.b(o6Var);
                    }
                } else {
                    com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandBackgroundRunningMonitor", "handleUserAuthChanged, invalid location state manager");
                }
            }
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.g gVar = com.tencent.mm.plugin.appbrand.jsapi.bluetooth.g.f80069a;
            java.lang.String str = this.f78264a.f74803n;
            boolean z28 = authStateChangedByUserEvent.f89327f;
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.f fVar = (z28 || authStateChangedByUserEvent.f89328g) ? (!z28 || authStateChangedByUserEvent.f89328g) ? (z28 && authStateChangedByUserEvent.f89328g) ? com.tencent.mm.plugin.appbrand.jsapi.bluetooth.f.f80065f : null : com.tencent.mm.plugin.appbrand.jsapi.bluetooth.f.f80064e : com.tencent.mm.plugin.appbrand.jsapi.bluetooth.f.f80063d;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.BluetoothAuthorizeStateQuickAccess", "onAuthorizeStateChange, appId: " + str + ", newState: " + fVar);
            if (str == null || fVar == null) {
                return;
            }
            ik1.x xVar = com.tencent.mm.plugin.appbrand.jsapi.bluetooth.g.f80070b;
            xVar.getClass();
            java.util.Iterator it = xVar.d(str).iterator();
            while (it.hasNext()) {
                ((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.o) it.next()).a(fVar);
            }
        }
    }
}
