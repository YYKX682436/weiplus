package com.tencent.mm.console;

/* loaded from: classes.dex */
public class g3 implements com.tencent.mm.console.g5 {
    @Override // com.tencent.mm.console.g5
    public void a(android.content.Intent intent) {
        if (z65.c.a() || com.tencent.mm.sdk.platformtools.s9.f192974b) {
            ((zv1.f1) i95.n0.c(zv1.f1.class)).getClass();
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.Shell", "Environment denied: not coolassist or monkey env");
        }
    }
}
