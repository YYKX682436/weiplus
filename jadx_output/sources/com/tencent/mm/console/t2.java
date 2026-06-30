package com.tencent.mm.console;

/* loaded from: classes11.dex */
public class t2 implements com.tencent.mm.console.g5 {
    @Override // com.tencent.mm.console.g5
    public void a(android.content.Intent intent) {
        if (!z65.c.a() && !com.tencent.mm.sdk.platformtools.s9.f192974b) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Shell", "Environment denied: not coolassist or monkey env");
            return;
        }
        ((com.tencent.mm.feature.performance.w1) ((ob0.a3) i95.n0.c(ob0.a3.class))).getClass();
        int intExtra = intent.getIntExtra("pid", -1);
        if (intExtra == -1) {
            intExtra = android.os.Process.myPid();
        }
        if (intExtra == android.os.Process.myPid()) {
            com.tencent.matrix.trace.tracer.SignalAnrTracer.j();
            com.tencent.mars.xlog.Log.i("MicroMsg.MatrixShellService", "Send signal 3 to self");
        } else {
            android.os.Process.sendSignal(intExtra, 3);
            com.tencent.mars.xlog.Log.i("MicroMsg.MatrixShellService", "Send signal 3 to pid(%s)", java.lang.Integer.valueOf(intExtra));
        }
    }
}
