package com.tencent.mm.plugin.appbrand.jsapi.bluetooth;

/* loaded from: classes7.dex */
public final class u0 extends com.tencent.mm.plugin.appbrand.jsapi.bluetooth.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.bluetooth.w0 f80115d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(com.tencent.mm.plugin.appbrand.jsapi.bluetooth.w0 w0Var, com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        super(appBrandRuntime);
        this.f80115d = w0Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.bluetooth.k
    public void b(java.lang.String deviceId, boolean z17) {
        com.tencent.mm.plugin.appbrand.floatball.i iVar;
        kotlin.jvm.internal.o.g(deviceId, "deviceId");
        com.tencent.mars.xlog.Log.i(this.f80115d.f80124e, "onConnectStateChange, deviceId: " + deviceId + ", connected: " + z17);
        boolean isEmpty = this.f80115d.f80135s.isEmpty();
        if (!z17) {
            this.f80115d.f80135s.remove(deviceId);
            if (this.f80115d.f80135s.isEmpty()) {
                com.tencent.mars.xlog.Log.i(this.f80115d.f80124e, "onConnectStateChange, all device disconnect");
                com.tencent.mm.plugin.appbrand.jsapi.bluetooth.w0 w0Var = this.f80115d;
                if (w0Var.f80123d.V) {
                    com.tencent.mars.xlog.Log.i(w0Var.f80124e, "onConnectStateChange, do real disable");
                    this.f80115d.b();
                    return;
                }
                java.util.concurrent.Future future = w0Var.f80136t;
                if (future != null) {
                    future.cancel(false);
                }
                com.tencent.mm.plugin.appbrand.jsapi.bluetooth.w0 w0Var2 = this.f80115d;
                ku5.u0 u0Var = ku5.t0.f312615d;
                com.tencent.mm.plugin.appbrand.jsapi.bluetooth.t0 t0Var = new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.t0(this.f80115d);
                com.tencent.mm.plugin.appbrand.jsapi.bluetooth.m0 m0Var = com.tencent.mm.plugin.appbrand.jsapi.bluetooth.w0.f80120u;
                long j17 = com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.b().V * 1000;
                ku5.t0 t0Var2 = (ku5.t0) u0Var;
                t0Var2.getClass();
                w0Var2.f80136t = t0Var2.t(t0Var, j17, null);
                return;
            }
            return;
        }
        this.f80115d.f80135s.add(deviceId);
        if (isEmpty && this.f80115d.f80133q) {
            com.tencent.mars.xlog.Log.i(this.f80115d.f80124e, "onConnectStateChange, origin not connected and enable() called");
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.w0 w0Var3 = this.f80115d;
            com.tencent.mars.xlog.Log.i(w0Var3.f80124e, "doRealEnable");
            if (!w0Var3.f80133q) {
                com.tencent.mars.xlog.Log.w(w0Var3.f80124e, "doRealEnable, must call enable() first");
                return;
            }
            boolean z18 = !((u81.a) w0Var3.f80123d.b(u81.a.class)).f425400f;
            com.tencent.mars.xlog.Log.i(w0Var3.f80124e, "doRealEnable, isBanned: " + z18);
            if (z18) {
                return;
            }
            if (w0Var3.f80134r) {
                com.tencent.mars.xlog.Log.i(w0Var3.f80124e, "doRealEnable, already enabled");
                return;
            }
            w0Var3.f80134r = true;
            java.lang.String str = w0Var3.f80124e;
            com.tencent.mars.xlog.Log.i(str, "requireHostKeepMeAlive");
            com.tencent.mm.plugin.appbrand.e9 C0 = w0Var3.f80123d.C0();
            if (C0 == null) {
                com.tencent.mars.xlog.Log.w(str, "requireHostKeepMeAlive, service is null");
            } else {
                com.tencent.mm.plugin.appbrand.backgroundrunning.t.a(C0, 1, 32, false);
            }
            if (w0Var3.f80128i == null) {
                com.tencent.mars.xlog.Log.i(w0Var3.f80124e, "registerAuthStateListenerIfNeed, create and add");
                com.tencent.mm.plugin.appbrand.jsapi.bluetooth.r0 r0Var = new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.r0(w0Var3);
                com.tencent.mm.plugin.appbrand.jsapi.bluetooth.g.f80069a.a(w0Var3.f80123d.f74803n, r0Var);
                w0Var3.f80128i = r0Var;
            }
            if (w0Var3.f80129m == null) {
                com.tencent.mars.xlog.Log.i(w0Var3.f80124e, "registerLifeCycleListenerIfNeed, create and add");
                com.tencent.mm.plugin.appbrand.jsapi.bluetooth.v0 v0Var = new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.v0(w0Var3);
                com.tencent.mm.plugin.appbrand.x0.a(w0Var3.f80123d.f74803n, v0Var);
                w0Var3.f80129m = v0Var;
            }
            if (w0Var3.f80130n == null) {
                com.tencent.mars.xlog.Log.i(w0Var3.f80124e, "registerBackgroundRunningOpListenerIfNeed, create and add");
                com.tencent.mm.plugin.appbrand.jsapi.bluetooth.s0 s0Var = new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.s0(w0Var3);
                com.tencent.mm.plugin.appbrand.jsapi.bluetooth.m0 m0Var2 = com.tencent.mm.plugin.appbrand.jsapi.bluetooth.w0.f80120u;
                com.tencent.mm.plugin.appbrand.backgroundrunning.v0 v0Var2 = (com.tencent.mm.plugin.appbrand.backgroundrunning.v0) ((jz5.n) com.tencent.mm.plugin.appbrand.jsapi.bluetooth.w0.f80121v).getValue();
                if (v0Var2 != null) {
                    com.tencent.mm.plugin.appbrand.backgroundrunning.k kVar = (com.tencent.mm.plugin.appbrand.backgroundrunning.k) v0Var2;
                    synchronized (kVar.f76977e) {
                        kVar.f76977e.add(s0Var);
                    }
                }
                w0Var3.f80130n = s0Var;
            }
            if (w0Var3.f80131o == null) {
                com.tencent.mars.xlog.Log.i(w0Var3.f80124e, "createFloatBallHelperIfNeed, create");
                com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime = w0Var3.f80123d;
                kotlin.jvm.internal.o.g(runtime, "runtime");
                if (runtime instanceof com.tencent.mm.plugin.appbrand.o6) {
                    com.tencent.mm.plugin.appbrand.o6 o6Var = (com.tencent.mm.plugin.appbrand.o6) runtime;
                    iVar = new com.tencent.mm.plugin.appbrand.floatball.i(new com.tencent.mm.plugin.appbrand.floatball.n(o6Var.r0(), o6Var), runtime);
                    iVar.b(33, qp1.n.a(o6Var.f74803n, o6Var.f74805p.f77281g));
                    com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u07 = o6Var.u0();
                    com.tencent.mars.xlog.Log.i(iVar.f78100w, "updateBallInfoWithInitConfig, initConfig: " + u07);
                    if (u07 != null) {
                        com.tencent.mm.plugin.ball.model.BallInfo ballInfo = iVar.f93132d;
                        ballInfo.f93057r = u07.f77280f;
                        ballInfo.f93063x = u07.f77279e;
                        int i17 = iVar.f78099v.f74805p.f77281g;
                        ballInfo.f93065z = i17 != 1 ? i17 != 2 ? null : iVar.f78099v.f74795d.getString(com.tencent.mm.R.string.f490040j8) : iVar.f78099v.f74795d.getString(com.tencent.mm.R.string.f490041j9);
                        iVar.f93132d.n("appId", iVar.f78099v.u0().f77278d);
                        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = iVar.f78099v;
                        if (appBrandRuntime instanceof com.tencent.mm.plugin.appbrand.o6) {
                            iVar.f93132d.n(dm.i4.COL_USERNAME, ((com.tencent.mm.plugin.appbrand.o6) appBrandRuntime).u0().f47278x);
                        }
                        iVar.f93132d.m("versionType", iVar.f78099v.u0().f77281g);
                        com.tencent.mm.plugin.appbrand.floatball.u.g(iVar, u07);
                        ballInfo.M.f93086f = 20;
                        iVar.g();
                    }
                    runtime.I1(new com.tencent.mm.plugin.appbrand.floatball.e(runtime, iVar));
                } else {
                    com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.AppBrandBluetoothFloatBallHelper", "create, runtime is not AppBrandRuntimeWC");
                    iVar = null;
                }
                w0Var3.f80131o = iVar;
            }
            w0Var3.a();
            com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime2 = w0Var3.f80123d;
            if ((appBrandRuntime2 instanceof com.tencent.mm.plugin.appbrand.o6) && ((com.tencent.mm.plugin.appbrand.o6) appBrandRuntime2).Z1()) {
                u81.h hVar = ((com.tencent.mm.plugin.appbrand.o6) w0Var3.f80123d).N;
                hVar.getClass();
                hVar.f425432a.s(u81.u.ON_START_BACKGROUND_BLUETOOTH, null);
            }
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.bluetooth.d
    public void onBluetoothStateChange(boolean z17) {
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.w0 w0Var = this.f80115d;
        com.tencent.mars.xlog.Log.i(w0Var.f80124e, "onBluetoothStateChange, isOn: " + z17);
        if (z17) {
            return;
        }
        com.tencent.mars.xlog.Log.i(w0Var.f80124e, "onBluetoothStateChange, do disable");
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.s.n8(w0Var, false, 1, null);
    }
}
