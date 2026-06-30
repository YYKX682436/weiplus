package com.tencent.mm.plugin.appbrand.v8_snapshot;

/* loaded from: classes7.dex */
public final class i1 implements com.tencent.mm.app.h4 {
    @Override // com.tencent.mm.app.h4
    public void a(java.lang.Thread crashThread, java.lang.String str, java.lang.Throwable thr) {
        kotlin.jvm.internal.o.g(crashThread, "crashThread");
        kotlin.jvm.internal.o.g(thr, "thr");
    }

    @Override // com.tencent.mm.app.h4
    public void e(int i17, java.lang.String str) {
        if (str != null) {
            com.tencent.mm.plugin.appbrand.v8_snapshot.j1 j1Var = com.tencent.mm.plugin.appbrand.v8_snapshot.j1.f90737a;
            if (r26.n0.B(str, "com.eclipsesource.mmv8", false) || r26.n0.B(str, "mmv8.so", false)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.V8CrashMonitor", "found v8 crash");
                com.tencent.mm.plugin.appbrand.app.q0 q0Var = com.tencent.mm.plugin.appbrand.app.q0.f75227a;
                com.tencent.mm.sdk.platformtools.o4 a17 = q0Var.a();
                if (a17 != null) {
                    a17.G(com.tencent.mm.plugin.appbrand.v8_snapshot.j1.f90741e, false);
                }
                com.tencent.mm.sdk.platformtools.o4 a18 = q0Var.a();
                j1Var.b((a18 != null ? a18.getInt(com.tencent.mm.plugin.appbrand.v8_snapshot.j1.f90742f, 0) : 0) + 1);
            }
        }
    }
}
