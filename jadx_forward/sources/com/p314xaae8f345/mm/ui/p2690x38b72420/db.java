package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes9.dex */
public abstract class db {
    public static java.lang.String a(r45.kl klVar) {
        if (klVar != null) {
            try {
                java.lang.Object[] objArr = new java.lang.Object[2];
                java.lang.String str = klVar.f460330d;
                objArr[0] = java.lang.Integer.valueOf(str != null ? str.length() : 0);
                java.lang.String str2 = klVar.f460331e;
                objArr[1] = java.lang.Integer.valueOf(str2 != null ? str2.length() : 0);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendContactCardHelper", "getBizNameCardString %d, %d", objArr);
                return android.util.Base64.encodeToString(klVar.mo14344x5f01b1f6(), 2);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SendContactCardHelper", "getBizNameCardString ex %s", e17.getMessage());
            }
        }
        return "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x01d7, code lost:
    
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r4) == false) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String b(java.lang.String r18, r45.kl r19) {
        /*
            Method dump skipped, instructions count: 843
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2690x38b72420.db.b(java.lang.String, r45.kl):java.lang.String");
    }
}
