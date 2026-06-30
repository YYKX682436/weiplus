package com.tencent.mm.console;

/* loaded from: classes11.dex */
public class p2 implements com.tencent.mm.console.g5 {
    @Override // com.tencent.mm.console.g5
    public void a(android.content.Intent intent) {
        if (!z65.c.a() && !com.tencent.mm.sdk.platformtools.s9.f192974b) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Shell", "Environment denied: not coolassist or monkey env");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.Shell", "#RECOVERY_EXERCISE_STOP");
            y45.b.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
        }
    }
}
