package com.tencent.mm.console;

/* loaded from: classes12.dex */
public class d4 implements com.tencent.mm.console.h5 {
    @Override // com.tencent.mm.console.g5
    public void a(android.content.Intent intent) {
        if (!z65.c.a() && !com.tencent.mm.sdk.platformtools.s9.f192974b) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Shell", "Environment denied: not coolassist or monkey env");
            return;
        }
        ((com.tencent.mm.feature.performance.w1) ((ob0.a3) i95.n0.c(ob0.a3.class))).getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.MemoryLimitPublisher", "set mute");
        com.tencent.mm.plugin.performance.watchdogs.w.f153145b = true;
        com.tencent.mm.feature.performance.w1.f67752f = true;
        ((com.tencent.mm.feature.performance.w1) ((ob0.a3) i95.n0.c(ob0.a3.class))).getClass();
        oh5.o.f345511d.f345490a = true;
        oh5.l.f345506h = true;
        oh5.i.f345498d.f345490a = true;
        com.tencent.mm.feature.performance.w1.f67752f = true;
    }
}
