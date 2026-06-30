package com.tencent.mm.console;

/* loaded from: classes5.dex */
public class a3 implements com.tencent.mm.console.g5 {
    @Override // com.tencent.mm.console.g5
    public void a(android.content.Intent intent) {
        if (!z65.c.a() && !com.tencent.mm.sdk.platformtools.s9.f192974b) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Shell", "Environment denied: not coolassist or monkey env");
            return;
        }
        com.tencent.mm.feature.performance.w1 w1Var = (com.tencent.mm.feature.performance.w1) ((ob0.a3) i95.n0.c(ob0.a3.class));
        w1Var.getClass();
        int intExtra = intent.getIntExtra("seconds", 1);
        if (intExtra > 0) {
            w1Var.Ri(com.tencent.mm.sdk.platformtools.x2.f193071a, intExtra);
        }
    }
}
