package com.tencent.mm.console;

/* loaded from: classes12.dex */
public class e4 implements com.tencent.mm.console.g5 {
    @Override // com.tencent.mm.console.g5
    public void a(android.content.Intent intent) {
        if (!z65.c.a() && !com.tencent.mm.sdk.platformtools.s9.f192974b) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Shell", "Environment denied: not coolassist or monkey env");
            return;
        }
        ((com.tencent.mm.feature.performance.w1) ((ob0.a3) i95.n0.c(ob0.a3.class))).getClass();
        java.util.List c17 = com.tencent.mm.plugin.performance.watchdogs.b1.c();
        java.util.Iterator it = com.tencent.mm.plugin.performance.watchdogs.b1.a().iterator();
        int i17 = 0;
        while (it.hasNext()) {
            i17 += ((com.tencent.mm.plugin.performance.watchdogs.z0) it.next()).a();
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.ThreadWatchDog", "threads:[%s:%s][%s]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(com.tencent.mm.plugin.performance.watchdogs.b1.b()), c17.toString());
    }
}
