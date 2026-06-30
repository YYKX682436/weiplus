package com.tencent.mm.legacy.app;

/* loaded from: classes12.dex */
public class i implements java.lang.Runnable {
    public i(com.tencent.mm.legacy.app.j jVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        if (gm0.j1.i().f273208a.f273299d) {
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.DefaultBootStep", "Kernel has not startup done!");
        try {
            com.tencent.matrix.trace.tracer.SignalAnrTracer.j();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.DefaultBootStep", "printTrace error, message = %s", th6.getMessage());
        }
    }
}
