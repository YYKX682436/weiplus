package com.tencent.mm.console;

/* loaded from: classes12.dex */
public class e3 implements com.tencent.mm.console.g5 {
    @Override // com.tencent.mm.console.g5
    public void a(android.content.Intent intent) {
        if (!z65.c.a() && !com.tencent.mm.sdk.platformtools.s9.f192974b) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Shell", "Environment denied: not coolassist or monkey env");
            return;
        }
        com.tencent.mm.feature.performance.w1 w1Var = (com.tencent.mm.feature.performance.w1) ((ob0.a3) i95.n0.c(ob0.a3.class));
        w1Var.getClass();
        int intExtra = intent.getIntExtra("seconds", 2);
        if (intExtra <= 0) {
            throw new java.lang.IllegalStateException("seconds(sampling interval) should > 0");
        }
        synchronized (w1Var) {
            cr0.o4 o4Var = com.tencent.mm.feature.performance.w1.f67753g;
            if (o4Var != null) {
                o4Var.a();
            }
            cr0.o4 o4Var2 = new cr0.o4("Default", intExtra);
            com.tencent.mm.feature.performance.w1.f67753g = o4Var2;
            o4Var2.b();
        }
    }
}
