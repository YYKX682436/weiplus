package com.tencent.mm.plugin.appbrand.report;

/* loaded from: classes7.dex */
public abstract class k0 {

    /* renamed from: a, reason: collision with root package name */
    public static volatile com.tencent.mm.weapp_core.JsThreadMonitor f87890a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.Object f87891b = new java.lang.Object();

    public static void a(com.tencent.mm.plugin.appbrand.service.c0 c0Var, com.tencent.mm.plugin.appbrand.jsruntime.t tVar) {
        final com.tencent.mm.weapp_core.JsThreadMonitor l0Var;
        int rj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).rj(e42.c0.clicfg_appbrand_js_thread_hang_sample_rate, 0);
        if (rj6 > 0 && (rj6 >= 10000 || new java.util.Random().nextInt(10000) < rj6)) {
            com.tencent.mm.plugin.appbrand.o6 t37 = c0Var.t3();
            if (t37 == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandJsThreadHangMonitor", "skip attach, runtime is null, appId:%s", c0Var.getAppId());
                return;
            }
            if (t37.s2()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandJsThreadHangMonitor", "skip attach for remote debug, appId:%s", c0Var.getAppId());
                return;
            }
            final com.tencent.mm.plugin.appbrand.jsruntime.l0 l0Var2 = (com.tencent.mm.plugin.appbrand.jsruntime.l0) tVar.h0(com.tencent.mm.plugin.appbrand.jsruntime.l0.class);
            final com.tencent.mm.plugin.appbrand.jsruntime.y yVar = (com.tencent.mm.plugin.appbrand.jsruntime.y) tVar.h0(com.tencent.mm.plugin.appbrand.jsruntime.y.class);
            com.tencent.mm.plugin.appbrand.jsruntime.f0 f0Var = (com.tencent.mm.plugin.appbrand.jsruntime.f0) tVar.h0(com.tencent.mm.plugin.appbrand.jsruntime.f0.class);
            if (l0Var2 == null || yVar == null || f0Var == null) {
                java.lang.Object[] objArr = new java.lang.Object[4];
                objArr[0] = c0Var.getAppId();
                objArr[1] = java.lang.Boolean.valueOf(l0Var2 != null);
                objArr[2] = java.lang.Boolean.valueOf(yVar != null);
                objArr[3] = java.lang.Boolean.valueOf(f0Var != null);
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandJsThreadHangMonitor", "skip attach, addon missing, appId:%s, hasV8:%b, hasDestroy:%b, hasJsThread:%b", objArr);
                return;
            }
            if (f87890a != null) {
                l0Var = f87890a;
            } else {
                synchronized (f87891b) {
                    if (f87890a != null) {
                        l0Var = f87890a;
                    } else {
                        sk1.b.a(com.tencent.mm.sdk.platformtools.x2.f193071a);
                        l0Var = new com.tencent.mm.plugin.appbrand.report.l0();
                        l0Var.start(2000L);
                        f87890a = l0Var;
                    }
                }
            }
            final java.lang.String appId = c0Var.getAppId();
            f0Var.k0(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.report.k0$$a
                @Override // java.lang.Runnable
                public final void run() {
                    final long L = com.tencent.mm.plugin.appbrand.jsruntime.l0.this.L();
                    final java.lang.String str = appId;
                    if (L == 0) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandJsThreadHangMonitor", "attach on JS thread but isolatePtr still 0, appId:%s", str);
                        return;
                    }
                    final com.tencent.mm.weapp_core.JsThreadMonitor jsThreadMonitor = l0Var;
                    jsThreadMonitor.attachIsolate(L, str);
                    yVar.f0(new com.tencent.mm.plugin.appbrand.jsruntime.x() { // from class: com.tencent.mm.plugin.appbrand.report.k0$$b
                        @Override // com.tencent.mm.plugin.appbrand.jsruntime.x
                        public final void onDestroy() {
                            com.tencent.mm.weapp_core.JsThreadMonitor.this.detachIsolate(L);
                            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandJsThreadHangMonitor", "detach appId:%s, reason:js_runtime_destroy", str);
                        }
                    }, true);
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandJsThreadHangMonitor", "attach appId:%s, isolatePtr:0x%x", str, java.lang.Long.valueOf(L));
                }
            });
        }
    }
}
