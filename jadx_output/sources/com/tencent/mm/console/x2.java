package com.tencent.mm.console;

/* loaded from: classes5.dex */
public class x2 implements com.tencent.mm.console.g5 {
    @Override // com.tencent.mm.console.g5
    public void a(android.content.Intent intent) {
        if (z65.c.a() || com.tencent.mm.sdk.platformtools.s9.f192974b) {
            com.tencent.mm.plugin.backup.roambackup.service.RoamForegroundService.f92724f.b();
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.Shell", "Environment denied: not coolassist or monkey env");
        }
    }
}
