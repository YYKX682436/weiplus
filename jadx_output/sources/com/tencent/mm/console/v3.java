package com.tencent.mm.console;

/* loaded from: classes7.dex */
public class v3 implements com.tencent.mm.console.g5 {
    @Override // com.tencent.mm.console.g5
    public void a(android.content.Intent intent) {
        if (!z65.c.a() && !com.tencent.mm.sdk.platformtools.s9.f192974b) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Shell", "Environment denied: not coolassist or monkey env");
            return;
        }
        android.os.Bundle extras = intent.getExtras();
        if (extras == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Shell", "extras is null");
            return;
        }
        int parseInt = java.lang.Integer.parseInt(java.lang.String.valueOf(extras.get("set_xid")));
        com.tencent.mars.xlog.Log.i("MicroMsg.Shell", "#BRANDS_XID, set_xid = " + parseInt);
        if (parseInt >= 0) {
            com.tencent.mm.sdk.platformtools.o4 s17 = c01.je.s("xagreement_test_configs");
            if (s17 != null) {
                s17.putInt("test_xagreement_id", parseInt);
            }
            c01.ie.a();
        }
    }
}
