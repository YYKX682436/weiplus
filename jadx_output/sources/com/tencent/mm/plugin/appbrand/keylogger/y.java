package com.tencent.mm.plugin.appbrand.keylogger;

/* loaded from: classes7.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.keylogger.x f84205a = new com.tencent.mm.plugin.appbrand.keylogger.x();

    public static void a(java.lang.String str, kg1.a aVar, java.lang.String str2, java.lang.String str3) {
        com.tencent.mm.plugin.appbrand.keylogger.v vVar = com.tencent.mm.plugin.appbrand.keylogger.t.f84200a;
        java.lang.String str4 = ((kg1.h) aVar).f307693a;
        long a17 = f84205a.a(str4, str, aVar);
        java.util.List list = (java.util.List) ((java.util.HashMap) vVar.f84201a).get(str4);
        if (list == null) {
            return;
        }
        for (int i17 = 0; i17 < list.size(); i17++) {
            com.tencent.mm.plugin.appbrand.report.quality.w1 w1Var = (com.tencent.mm.plugin.appbrand.report.quality.w1) ((kg1.e) list.get(i17));
            w1Var.getClass();
            w1Var.e(str, aVar, a17, com.tencent.mm.plugin.appbrand.report.quality.u1.f88358e);
        }
    }
}
