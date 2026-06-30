package com.tencent.mm.plugin.appbrand.v8_snapshot;

/* loaded from: classes7.dex */
public final class q2 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.v8_snapshot.q2 f90808a = new com.tencent.mm.plugin.appbrand.v8_snapshot.q2();

    public final boolean a() {
        int i17;
        int i18;
        int i19 = o45.wf.f343029g;
        r26.a.a(16);
        java.lang.String num = java.lang.Integer.toString(i19, 16);
        kotlin.jvm.internal.o.f(num, "toString(...)");
        com.tencent.mm.plugin.appbrand.app.q0 q0Var = com.tencent.mm.plugin.appbrand.app.q0.f75227a;
        com.tencent.mm.sdk.platformtools.o4 a17 = q0Var.a();
        java.lang.String string = a17 != null ? a17.getString("WxaCommLibV8Snapshot#BlockClientVersion", "") : null;
        java.lang.String str = string != null ? string : "";
        com.tencent.mm.plugin.appbrand.v8_snapshot.k2 k2Var = com.tencent.mm.plugin.appbrand.v8_snapshot.k2.f90749a;
        k2Var.getClass();
        if (com.tencent.mm.plugin.appbrand.v8_snapshot.k2.f90751c) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaCommLibV8SnapshotPreConditions", "needBlock, curClientVersion: " + num + ", blockClientVersion: " + str);
        }
        if (!k2Var.b() && kotlin.jvm.internal.o.b(num, str)) {
            return true;
        }
        com.tencent.mm.plugin.appbrand.v8_snapshot.j1 j1Var = com.tencent.mm.plugin.appbrand.v8_snapshot.j1.f90737a;
        java.lang.String[] strArr = com.tencent.mm.plugin.appbrand.v8_snapshot.j1.f90739c;
        if (strArr.length == 0) {
            throw new java.util.NoSuchElementException();
        }
        java.lang.String str2 = strArr[0];
        com.tencent.mm.sdk.platformtools.o4 a18 = q0Var.a();
        if (a18 != null) {
            i17 = a18.getInt("V8ConsecutiveCrash#Count_" + str2, 0);
        } else {
            i17 = 0;
        }
        kz5.x0 it = new e06.k(1, strArr.length - 1).iterator();
        while (((e06.j) it).f246214f) {
            java.lang.String str3 = strArr[it.b()];
            com.tencent.mm.sdk.platformtools.o4 a19 = com.tencent.mm.plugin.appbrand.app.q0.f75227a.a();
            if (a19 != null) {
                i18 = a19.getInt("V8ConsecutiveCrash#Count_" + str3, 0);
            } else {
                i18 = 0;
            }
            if (i17 < i18) {
                i17 = i18;
            }
        }
        com.tencent.mm.plugin.appbrand.v8_snapshot.k2 k2Var2 = com.tencent.mm.plugin.appbrand.v8_snapshot.k2.f90749a;
        k2Var2.getClass();
        boolean z17 = com.tencent.mm.plugin.appbrand.v8_snapshot.k2.f90751c;
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaCommLibV8SnapshotPreConditions", "needBlock, v8ConsecutiveCrashCount: " + i17);
        }
        if (!k2Var2.b()) {
            k2Var2.getClass();
            if (com.tencent.mm.plugin.appbrand.v8_snapshot.k2.f90762n <= i17) {
                com.tencent.mm.sdk.platformtools.o4 a27 = com.tencent.mm.plugin.appbrand.app.q0.f75227a.a();
                if (a27 != null) {
                    a27.D("WxaCommLibV8Snapshot#BlockClientVersion", num);
                }
                com.tencent.mm.plugin.appbrand.v8_snapshot.j1 j1Var2 = com.tencent.mm.plugin.appbrand.v8_snapshot.j1.f90737a;
                com.tencent.mars.xlog.Log.i("MicroMsg.V8CrashMonitor", "reset");
                j1Var2.b(0);
                com.tencent.mm.plugin.appbrand.v8_snapshot.j3 j3Var = com.tencent.mm.plugin.appbrand.v8_snapshot.j3.f90743a;
                k2Var2.getClass();
                if (z17) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WxaCommLibV8SnapshotStats", "onSnapshotBlock, snapshotTotalExceptionCount: -1, v8ConsecutiveCrashCount: " + i17);
                }
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1923, 0);
                if (j3Var.b()) {
                    com.tencent.mm.autogen.mmdata.rpt.AndroidWAServiceLibSnapshotQualityStruct androidWAServiceLibSnapshotQualityStruct = new com.tencent.mm.autogen.mmdata.rpt.AndroidWAServiceLibSnapshotQualityStruct();
                    androidWAServiceLibSnapshotQualityStruct.f55110d = 1;
                    androidWAServiceLibSnapshotQualityStruct.s(cl.x.b());
                    androidWAServiceLibSnapshotQualityStruct.p(java.lang.String.valueOf(-1));
                    androidWAServiceLibSnapshotQualityStruct.q(java.lang.String.valueOf(i17));
                    androidWAServiceLibSnapshotQualityStruct.k();
                }
                return true;
            }
        }
        return false;
    }
}
