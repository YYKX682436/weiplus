package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes7.dex */
public final class l2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.l2 f171375d = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.l2();

    public l2() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.p3191x37a1e2.p3192x2e06d1.p3193xa8fcbcdb.C27745x1c1b08fe it = (com.p314xaae8f345.p3191x37a1e2.p3192x2e06d1.p3193xa8fcbcdb.C27745x1c1b08fe) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.n0 n0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.n0.f159223a;
        int i17 = it.h() ? 4 : Integer.MAX_VALUE;
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.n0.f159224b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.ConsolePrinterAccessible", "set#printLevel, oldValue: " + i18 + ", newValue: " + i17);
        if (i18 != i17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.n0.f159224b = i17;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.q0.f156760a.a();
            if (a17 != null) {
                a17.putInt("ConsolePrinterPrintLevel", i17);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.ConsolePrinterAccessible", "onPrintLevelChange, oldLevel: " + i18 + ", newLevel: " + i17);
            if (!(2 <= i18 && i18 < 6)) {
                if (2 <= i17 && i17 < 6) {
                    n0Var.a();
                }
            }
            if (!(2 <= i17 && i17 < 6)) {
                if (2 <= i18 && i18 < 6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.ConsolePrinterAccessible", "disable");
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                    if (z65.c.a()) {
                        int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.n0.f159224b;
                        if (!(2 <= i19 && i19 < 6)) {
                            if (n0Var.c()) {
                                ((ku5.t0) ku5.t0.f394148d).B(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.h0.f159208d);
                            }
                            if (n0Var.c() || ((java.lang.Boolean) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.n0.f159226d).mo141623x754a37bb()).booleanValue()) {
                                cl.q0.f124255l = null;
                            }
                        }
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.ConsolePrinterAccessible", "disable, not need");
                }
            }
            if (n0Var.c() || ((java.lang.Boolean) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1048x38b6e557.n0.f159226d).mo141623x754a37bb()).booleanValue()) {
                n0Var.b().f159201b = i17;
            }
        }
        return jz5.f0.f384359a;
    }
}
