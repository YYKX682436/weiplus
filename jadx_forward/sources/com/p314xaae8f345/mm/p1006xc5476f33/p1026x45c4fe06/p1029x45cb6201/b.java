package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* loaded from: classes5.dex */
public abstract class b {
    /* JADX WARN: Removed duplicated region for block: B:24:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a() {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.b.a():void");
    }

    public static final void b() {
        java.lang.String[] strArr = {"2.24.7-skyline", "2.24.7", "2.23.7"};
        jz5.l[] lVarArr = {new jz5.l("2.24.7", "999.999.999"), new jz5.l("2.23.7", "2.24.6"), new jz5.l("2.23.7", "999.999.999")};
        for (int i17 = 0; i17 < 3; i17++) {
            java.lang.String str = strArr[i17];
            for (int i18 = 0; i18 < 3; i18++) {
                jz5.l lVar = lVarArr[i18];
                java.lang.String start = (java.lang.String) lVar.f384366d;
                java.lang.Object obj = lVar.f384367e;
                java.lang.String end = (java.lang.String) obj;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(start, "start");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(end, "end");
                gf.j2 j2Var = gf.k2.f352640e;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SEMVERTestLogic", "testCompareAlgo version(" + str + ") in range[" + ((java.lang.String) lVar.f384366d) + ", " + ((java.lang.String) obj) + "] == " + new gf.l2(j2Var.a(end), j2Var.a(start), null).e(j2Var.a(str)));
            }
        }
    }
}
