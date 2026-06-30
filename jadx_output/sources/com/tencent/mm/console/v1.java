package com.tencent.mm.console;

/* loaded from: classes12.dex */
public class v1 implements com.tencent.mm.console.h5 {
    @Override // com.tencent.mm.console.g5
    public void a(android.content.Intent intent) {
        if (!z65.c.a() && !com.tencent.mm.sdk.platformtools.s9.f192974b) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Shell", "not coolassist or monkey env, disable hprof dump cmd.");
            return;
        }
        ((com.tencent.mm.feature.performance.w1) ((ob0.a3) i95.n0.c(ob0.a3.class))).getClass();
        long longExtra = intent.getLongExtra("memory", 419430400L);
        com.tencent.mm.plugin.performance.watchdogs.w wVar = com.tencent.mm.plugin.performance.watchdogs.w.f153144a;
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.performance.watchdogs.u(longExtra));
    }
}
