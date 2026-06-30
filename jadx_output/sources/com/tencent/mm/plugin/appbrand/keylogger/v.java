package com.tencent.mm.plugin.appbrand.keylogger;

/* loaded from: classes7.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f84201a = new java.util.HashMap();

    public v(com.tencent.mm.plugin.appbrand.keylogger.r rVar) {
    }

    public void a(java.lang.String str, java.lang.String str2, kg1.a aVar, long j17) {
        java.util.List list = (java.util.List) ((java.util.HashMap) this.f84201a).get(str);
        if (list == null) {
            return;
        }
        for (int i17 = 0; i17 < list.size(); i17++) {
            com.tencent.mm.plugin.appbrand.report.quality.w1 w1Var = (com.tencent.mm.plugin.appbrand.report.quality.w1) ((kg1.e) list.get(i17));
            w1Var.getClass();
            w1Var.e(str2, aVar, j17, com.tencent.mm.plugin.appbrand.report.quality.u1.f88358e);
        }
    }

    public final void b(java.lang.String str, com.tencent.mm.plugin.appbrand.keylogger.u uVar) {
        java.util.List list = (java.util.List) ((java.util.HashMap) this.f84201a).get(str);
        if (list == null) {
            return;
        }
        for (int i17 = 0; i17 < list.size(); i17++) {
            uVar.a((kg1.e) list.get(i17));
        }
    }
}
