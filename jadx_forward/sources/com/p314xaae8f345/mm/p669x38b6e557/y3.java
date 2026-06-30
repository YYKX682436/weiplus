package com.p314xaae8f345.mm.p669x38b6e557;

/* loaded from: classes12.dex */
public class y3 implements com.p314xaae8f345.mm.p669x38b6e557.g5 {
    @Override // com.p314xaae8f345.mm.p669x38b6e557.g5
    public void a(android.content.Intent intent) {
        java.lang.String[] b17;
        java.lang.String[] b18;
        java.lang.String[] b19;
        java.lang.String[] b27;
        if (!z65.c.a() && !com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274507b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Shell", "Environment denied: not coolassist or monkey env");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Shell", "#BRANDS_DUMP");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XAgreementSettings", ">>>>>>>>>> WeChat Brands Test Configs <<<<<<<<<<");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XAgreementSettings", ">> test XagreementId = " + c01.ie.f118798a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XAgreementSettings", ">> test BinEntry Dict:");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 s17 = c01.je.s("xagreement_test_configs");
        if (s17 != null && (b27 = s17.b()) != null) {
            for (java.lang.String str : b27) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XAgreementSettings", str + " = " + s17.getInt(str, -1));
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XAgreementSettings", "\n");
        java.util.Iterator it = java.util.Arrays.asList(0, 1, 2, 3).iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Integer) it.next()).intValue();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XAgreementSettings", ">> cgi Wording Dict for xid " + intValue + ":");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 g17 = c01.je.g(intValue);
            if (g17 != null && (b19 = g17.b()) != null) {
                for (java.lang.String str2 : b19) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XAgreementSettings", str2 + " = " + g17.getString(str2, null));
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XAgreementSettings", ">> cgi Domain Dict for xid " + intValue + ":");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f17 = c01.je.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.n9.f274417a);
            if (f17 != null && (b18 = f17.b()) != null) {
                for (java.lang.String str3 : b18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XAgreementSettings", str3 + " = " + f17.getString(str3, null));
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XAgreementSettings", ">> cgi Business Dict for xid " + intValue + ":");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 e17 = c01.je.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.n9.f274417a);
            if (e17 != null && (b17 = e17.b()) != null) {
                for (java.lang.String str4 : b17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XAgreementSettings", str4 + " = " + e17.getInt(str4, -1));
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XAgreementSettings", "\n");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XAgreementSettings", ">>>>>>>>>> WECHAT BRANDS TEST CONFIGS <<<<<<<<<<");
    }
}
