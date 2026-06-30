package com.p314xaae8f345.mm.p669x38b6e557;

/* loaded from: classes7.dex */
public class r3 implements com.p314xaae8f345.mm.p669x38b6e557.g5 {
    @Override // com.p314xaae8f345.mm.p669x38b6e557.g5
    public void a(android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y9 y9Var;
        if (!z65.c.a() && !com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274507b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Shell", "OpenWeApp not coolassist or monkey env, disable hprof dump cmd.");
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            java.lang.String stringExtra = intent.getStringExtra("kContent");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                return;
            }
            new android.os.Handler().postDelayed(new com.p314xaae8f345.mm.p669x38b6e557.RunnableC10423x65e3240(), com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
            java.lang.String str = new java.lang.String(android.util.Base64.decode(stringExtra, 0));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.k0 k0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.k0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.k0.class);
            if (k0Var == null) {
                return;
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.q0) k0Var).getClass();
            if (str.length() == 0) {
                return;
            }
            java.util.Map map = null;
            try {
                map = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, "sysmsg", null);
            } catch (java.lang.Exception unused) {
            }
            if (map == null) {
                ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p0(str));
                return;
            }
            java.lang.String str2 = (java.lang.String) map.get(".sysmsg.$type");
            if ((str2 == null || str2.length() == 0) || (y9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y9) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.aa.f156970d.get(str2)) == null) {
                return;
            }
            y9Var.b(str, map);
        }
    }
}
