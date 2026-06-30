package com.tencent.mm.console;

/* loaded from: classes8.dex */
public class g0 implements c01.qa {
    @Override // c01.qa
    public void a(com.tencent.mm.network.s sVar) {
        if (sVar == null) {
            return;
        }
        java.lang.String[] e17 = sVar.e1(true);
        for (int i17 = 0; i17 < e17.length; i17++) {
            java.lang.String str = e17[i17];
            u31.d.a(e17[i17]).toString();
        }
        java.lang.String[] e18 = sVar.e1(false);
        for (int i18 = 0; i18 < e18.length; i18++) {
            java.lang.String str2 = e18[i18];
            u31.d.a(e18[i18]).toString();
        }
    }
}
