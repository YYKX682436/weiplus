package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public final class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.e0 f77985d = new com.tencent.mm.plugin.appbrand.e0();

    @Override // java.lang.Runnable
    public final void run() {
        java.util.List g17 = com.tencent.mm.plugin.appbrand.j0.f78443d.g();
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        com.tencent.mm.plugin.appbrand.appcache.qa Di = com.tencent.mm.plugin.appbrand.app.r9.Di();
        com.tencent.mm.vfs.r6[] b17 = com.tencent.mm.plugin.appbrand.appcache.d9.b();
        if (b17 == null) {
            b17 = new com.tencent.mm.vfs.r6[0];
        }
        for (com.tencent.mm.vfs.r6 r6Var : b17) {
            java.lang.String o17 = r6Var.o();
            kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
            com.tencent.mm.plugin.appbrand.appcache.n9 p17 = Di.p(o17);
            if (p17 == null) {
                com.tencent.mm.plugin.appbrand.appcache.WxaCommonLibRecord i17 = com.tencent.mm.plugin.appbrand.appcache.y7.f76065a.i(o17);
                p17 = i17 != null ? com.tencent.mm.plugin.appbrand.appcache.r7.f(i17) : null;
            }
            if (p17 != null) {
                linkedHashSet.add(com.tencent.mm.plugin.appbrand.j0.f78443d.h(p17.field_appId));
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandFileCleaner", "all appId list size: " + ((java.util.ArrayList) g17).size() + ", keep record appId list size: " + linkedHashSet.size());
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(g17, 10));
        java.util.Iterator it = g17.iterator();
        while (it.hasNext()) {
            arrayList.add(((k91.v5) it.next()).field_appId);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            if (true ^ linkedHashSet.contains((java.lang.String) obj)) {
                arrayList2.add(obj);
            }
        }
        com.tencent.mm.plugin.appbrand.g0 g0Var = com.tencent.mm.plugin.appbrand.j0.f78443d;
        g0Var.a(arrayList2);
        long i18 = g0Var.i();
        long j17 = g0Var.j();
        java.util.List S0 = kz5.n0.S0(linkedHashSet);
        com.tencent.mm.autogen.mmdata.rpt.AppBrandFileCleanReportStruct appBrandFileCleanReportStruct = new com.tencent.mm.autogen.mmdata.rpt.AppBrandFileCleanReportStruct();
        appBrandFileCleanReportStruct.f55136d = 1L;
        appBrandFileCleanReportStruct.f55137e = appBrandFileCleanReportStruct.b("ResidueAppIds", kz5.n0.g0(S0, ":", null, null, 0, null, null, 62, null), true);
        appBrandFileCleanReportStruct.f55138f = i18;
        appBrandFileCleanReportStruct.f55139g = j17;
        appBrandFileCleanReportStruct.k();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandFileCleaner", "clean all appbrand storage finished, commLibFileSize: " + i18 + ", occupiedFileSize: " + j17);
    }
}
