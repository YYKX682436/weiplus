package com.tencent.mm.console;

/* loaded from: classes.dex */
public class g2 implements com.tencent.mm.console.g5 {
    @Override // com.tencent.mm.console.g5
    public void a(android.content.Intent intent) {
        if (z65.c.a() || com.tencent.mm.sdk.platformtools.s9.f192974b) {
            ((com.tencent.mm.plugin.backup.roambackup.p1) ((mv.y) i95.n0.c(mv.y.class))).Ai();
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.Shell", "Environment denied: not coolassist or monkey env");
        }
    }
}
