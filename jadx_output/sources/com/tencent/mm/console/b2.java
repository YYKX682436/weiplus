package com.tencent.mm.console;

/* loaded from: classes5.dex */
public class b2 implements com.tencent.mm.console.g5 {
    @Override // com.tencent.mm.console.g5
    public void a(android.content.Intent intent) {
        if (!z65.c.a() && !com.tencent.mm.sdk.platformtools.s9.f192974b) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Shell", "Environment denied: not coolassist or monkey env");
        } else {
            ((com.tencent.mm.feature.performance.w1) ((ob0.a3) i95.n0.c(ob0.a3.class))).getClass();
            com.tencent.mm.sdk.platformtools.o4.M("diagnostic_storage").G("KEY_ENABLE_HOOK_TOAST", false);
        }
    }
}
