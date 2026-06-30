package com.tencent.mm.console;

/* loaded from: classes7.dex */
public class w3 implements com.tencent.mm.console.g5 {
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
        com.tencent.mars.xlog.Log.i("MicroMsg.Shell", "#BRANDS_BIZ");
        for (java.lang.String str : extras.keySet()) {
            if (str.startsWith("set_biz_") && str.length() > 8) {
                java.lang.String substring = str.substring(str.indexOf("set_biz_") + 8);
                int parseInt = java.lang.Integer.parseInt(java.lang.String.valueOf(extras.get(str)));
                com.tencent.mars.xlog.Log.i("MicroMsg.Shell", "#BRANDS_BIZ, set " + substring + " = " + parseInt);
                com.tencent.mm.sdk.platformtools.o4 s17 = c01.je.s("xagreement_test_configs");
                if (s17 != null) {
                    s17.putInt(substring, parseInt);
                }
                c01.ie.a();
            }
        }
    }
}
