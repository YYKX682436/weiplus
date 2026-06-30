package com.p314xaae8f345.mm.p669x38b6e557;

/* loaded from: classes7.dex */
public class v3 implements com.p314xaae8f345.mm.p669x38b6e557.g5 {
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
        int parseInt = java.lang.Integer.parseInt(java.lang.String.valueOf(extras.get("set_xid")));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Shell", "#BRANDS_XID, set_xid = " + parseInt);
        if (parseInt >= 0) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 s17 = c01.je.s("xagreement_test_configs");
            if (s17 != null) {
                s17.putInt("test_xagreement_id", parseInt);
            }
            c01.ie.a();
        }
    }
}
