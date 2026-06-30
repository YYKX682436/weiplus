package com.p314xaae8f345.mm.p669x38b6e557;

/* loaded from: classes7.dex */
public class w3 implements com.p314xaae8f345.mm.p669x38b6e557.g5 {
    @Override // com.p314xaae8f345.mm.p669x38b6e557.g5
    public void a(android.content.Intent intent) {
        if (!z65.c.a() && !com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274507b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Shell", "Environment denied: not coolassist or monkey env");
            return;
        }
        android.os.Bundle extras = intent.getExtras();
        if (extras == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Shell", "extras is null");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Shell", "#BRANDS_BIZ");
        for (java.lang.String str : extras.keySet()) {
            if (str.startsWith("set_biz_") && str.length() > 8) {
                java.lang.String substring = str.substring(str.indexOf("set_biz_") + 8);
                int parseInt = java.lang.Integer.parseInt(java.lang.String.valueOf(extras.get(str)));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Shell", "#BRANDS_BIZ, set " + substring + " = " + parseInt);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 s17 = c01.je.s("xagreement_test_configs");
                if (s17 != null) {
                    s17.putInt(substring, parseInt);
                }
                c01.ie.a();
            }
        }
    }
}
