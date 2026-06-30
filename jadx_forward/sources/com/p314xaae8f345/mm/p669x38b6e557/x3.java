package com.p314xaae8f345.mm.p669x38b6e557;

/* loaded from: classes7.dex */
public class x3 implements com.p314xaae8f345.mm.p669x38b6e557.g5 {
    @Override // com.p314xaae8f345.mm.p669x38b6e557.g5
    public void a(android.content.Intent intent) {
        if (!z65.c.a() && !com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274507b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Shell", "Environment denied: not coolassist or monkey env");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Shell", "#BRANDS_CLEAR");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 s17 = c01.je.s("xagreement_test_configs");
        if (s17 != null) {
            s17.d();
        }
        c01.ie.f118798a = -1;
        c01.je.t(c01.je.c());
        c01.ie.a();
    }
}
