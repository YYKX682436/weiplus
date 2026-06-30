package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public abstract class c6 {
    public static void a(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4) {
        if (c11809xbc286be4 == null) {
            return;
        }
        b(i17, c11809xbc286be4.f158811d, c11809xbc286be4.L, c11809xbc286be4.f158814g, c11809xbc286be4.f128817z);
    }

    public static void b(int i17, java.lang.String str, int i18, int i19, int i27) {
        c(i17, str, i18, i19, k91.l3.a(i27));
    }

    public static void c(int i17, java.lang.String str, int i18, int i19, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimeStartupReporter", "reportStartupIDKEY, key:%d, appId:%s, appVersion:%d, versionType:%d, isGame:%b", java.lang.Integer.valueOf(i17), str, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Boolean.valueOf(z17));
        int i27 = z17 ? ib1.h.f69889x366c91de : 369;
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(i27, i17, 1L, false);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.v0.i(str, i18, i19, i27, i17, 1);
        } catch (java.lang.Exception unused) {
        }
    }
}
