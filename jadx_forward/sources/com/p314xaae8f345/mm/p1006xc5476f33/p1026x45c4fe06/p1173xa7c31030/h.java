package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030;

/* loaded from: classes7.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.HashMap f168884a = new java.util.HashMap();

    public static void a(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.C12537x4bfc1db8 c12537x4bfc1db8 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.C12537x4bfc1db8();
        c12537x4bfc1db8.f168855f = str;
        c12537x4bfc1db8.f168856g = false;
        c12537x4bfc1db8.d();
    }

    public static boolean b(ze.n nVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.a aVar) {
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.m.c().booleanValue()) {
            return false;
        }
        java.lang.String str = nVar.f156336n;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.l> list = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.m.f168898c;
        synchronized (list) {
            if (list.size() == 0) {
                return true;
            }
            list.size();
            for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.l lVar : list) {
                java.lang.String str2 = lVar.f168889a;
                if (str2 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandPerformanceTracer", "appid is null, event is %s", lVar.m52265x9616526c());
                } else if (!str2.equals(str)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandPerformanceTracer", "event appid is not equal to current appid, cur appId is %s, event is %s", str, lVar.m52265x9616526c());
                } else if (lVar.f168893e < com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.m.f168896a) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandPerformanceTracer", "event start is less than sAppStartTime, event is %s", str, lVar.m52265x9616526c());
                } else {
                    sb6.append(lVar.m52265x9616526c());
                    sb6.append("\n");
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.m.f168898c.clear();
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.m.b(str, sb6.toString());
        }
    }

    public static void c(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.C12537x4bfc1db8 c12537x4bfc1db8 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.C12537x4bfc1db8();
        c12537x4bfc1db8.f168855f = str;
        c12537x4bfc1db8.f168856g = true;
        c12537x4bfc1db8.d();
    }

    public static void d(ze.n nVar, int i17, long j17) {
        e(nVar, i17, java.lang.String.format("%d ms", java.lang.Long.valueOf(j17)));
    }

    public static void e(ze.n nVar, int i17, java.lang.String str) {
        java.lang.String str2 = nVar.f156336n;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ga gaVar = nVar.V1;
        if (gaVar != null) {
            ik1.h0.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ca(gaVar, i17, str));
            return;
        }
        c01.n2.d().c(str2 + "performance_data", true).i(java.lang.String.valueOf(i17), str);
    }

    public static boolean f(ze.n nVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.a aVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.a) nVar.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.a.class);
        return aVar != null && aVar.f168857d;
    }
}
