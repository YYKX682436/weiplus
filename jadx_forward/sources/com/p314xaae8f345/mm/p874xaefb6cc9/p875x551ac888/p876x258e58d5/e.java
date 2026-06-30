package com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5;

/* loaded from: classes7.dex */
public final class e {
    public e(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public static final void a(com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5.e eVar, java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.String str3) {
        java.lang.String str4;
        eVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.qa Di = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Di();
        if (Di == null) {
            return;
        }
        java.lang.String a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a6.a(str2);
        java.lang.String str5 = null;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(null)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17)) {
                str4 = "";
            } else {
                str4 = "$" + a17;
            }
            sb6.append(str4);
            str5 = sb6.toString();
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str5, "toString(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9 L = Di.L(str5, i17, i18, new java.lang.String[0]);
        if (L == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WVA.addDownloadTaskForWVA", "updatePkgPathToStorage: manifest not found for queryKey=".concat(str5));
            return;
        }
        L.f67183x55b471cc = str3;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ra.c(Di, L);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WVA.addDownloadTaskForWVA", "updatePkgPathToStorage success: queryKey=" + str5 + ", pkgPath=" + str3);
    }
}
