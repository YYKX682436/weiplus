package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1;

/* loaded from: classes7.dex */
public final class q2 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.q2 f172341a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.q2();

    public final boolean a() {
        int i17;
        int i18;
        int i19 = o45.wf.f424562g;
        r26.a.a(16);
        java.lang.String num = java.lang.Integer.toString(i19, 16);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(num, "toString(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.q0 q0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.q0.f156760a;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a17 = q0Var.a();
        java.lang.String string = a17 != null ? a17.getString("WxaCommLibV8Snapshot#BlockClientVersion", "") : null;
        java.lang.String str = string != null ? string : "";
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.k2 k2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.k2.f172282a;
        k2Var.getClass();
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.k2.f172284c) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaCommLibV8SnapshotPreConditions", "needBlock, curClientVersion: " + num + ", blockClientVersion: " + str);
        }
        if (!k2Var.b() && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(num, str)) {
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.j1 j1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.j1.f172270a;
        java.lang.String[] strArr = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.j1.f172272c;
        if (strArr.length == 0) {
            throw new java.util.NoSuchElementException();
        }
        java.lang.String str2 = strArr[0];
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a18 = q0Var.a();
        if (a18 != null) {
            i17 = a18.getInt("V8ConsecutiveCrash#Count_" + str2, 0);
        } else {
            i17 = 0;
        }
        kz5.x0 it = new e06.k(1, strArr.length - 1).iterator();
        while (((e06.j) it).f327747f) {
            java.lang.String str3 = strArr[it.b()];
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a19 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.q0.f156760a.a();
            if (a19 != null) {
                i18 = a19.getInt("V8ConsecutiveCrash#Count_" + str3, 0);
            } else {
                i18 = 0;
            }
            if (i17 < i18) {
                i17 = i18;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.k2 k2Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.k2.f172282a;
        k2Var2.getClass();
        boolean z17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.k2.f172284c;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaCommLibV8SnapshotPreConditions", "needBlock, v8ConsecutiveCrashCount: " + i17);
        }
        if (!k2Var2.b()) {
            k2Var2.getClass();
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.k2.f172295n <= i17) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a27 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.q0.f156760a.a();
                if (a27 != null) {
                    a27.D("WxaCommLibV8Snapshot#BlockClientVersion", num);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.j1 j1Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.j1.f172270a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.V8CrashMonitor", "reset");
                j1Var2.b(0);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.j3 j3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.j3.f172276a;
                k2Var2.getClass();
                if (z17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaCommLibV8SnapshotStats", "onSnapshotBlock, snapshotTotalExceptionCount: -1, v8ConsecutiveCrashCount: " + i17);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1923, 0);
                if (j3Var.b()) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6307x4654e007 c6307x4654e007 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6307x4654e007();
                    c6307x4654e007.f136643d = 1;
                    c6307x4654e007.s(cl.x.b());
                    c6307x4654e007.p(java.lang.String.valueOf(-1));
                    c6307x4654e007.q(java.lang.String.valueOf(i17));
                    c6307x4654e007.k();
                }
                return true;
            }
        }
        return false;
    }
}
