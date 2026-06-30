package com.tencent.mm.console;

/* loaded from: classes7.dex */
public class x3 implements com.tencent.mm.console.g5 {
    @Override // com.tencent.mm.console.g5
    public void a(android.content.Intent intent) {
        if (!z65.c.a() && !com.tencent.mm.sdk.platformtools.s9.f192974b) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Shell", "Environment denied: not coolassist or monkey env");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Shell", "#BRANDS_CLEAR");
        com.tencent.mm.sdk.platformtools.o4 s17 = c01.je.s("xagreement_test_configs");
        if (s17 != null) {
            s17.d();
        }
        c01.ie.f37265a = -1;
        c01.je.t(c01.je.c());
        c01.ie.a();
    }
}
