package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public abstract class xe {
    public static final void a(com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel launchParcel, java.lang.String sourceInstanceId, java.lang.String migrateTargetAppId) {
        kotlin.jvm.internal.o.g(launchParcel, "<this>");
        kotlin.jvm.internal.o.g(sourceInstanceId, "sourceInstanceId");
        kotlin.jvm.internal.o.g(migrateTargetAppId, "migrateTargetAppId");
        com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject = launchParcel.f84910o;
        boolean z17 = appBrandStatObject != null && appBrandStatObject.f87792h == 1;
        if (appBrandStatObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.RuntimeMigrateRestartHelper", "resetForMigrateStart, sourceInstanceId:" + sourceInstanceId + ", migrateTargetAppId:" + migrateTargetAppId + ", missing statObj in old LaunchParcel");
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject2 = new com.tencent.mm.plugin.appbrand.report.AppBrandStatObject();
            launchParcel.f84910o = appBrandStatObject2;
            appBrandStatObject2.f87790f = 1000;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String str = launchParcel.f84902e;
        if (str == null || str.length() == 0) {
            launchParcel.f84902e = com.tencent.mm.plugin.appbrand.launching.precondition.e0.f(launchParcel);
        }
        java.lang.String str2 = launchParcel.f84902e;
        if (!(str2 == null || str2.length() == 0)) {
            java.lang.String appId = launchParcel.f84902e;
            kotlin.jvm.internal.o.f(appId, "appId");
            hashMap.put("migrateSourceAppId", appId);
        }
        java.lang.String str3 = launchParcel.f84906i;
        if (str3 == null) {
            str3 = "";
        }
        if (r26.n0.u0(str3).toString().length() > 0) {
            java.lang.String a17 = nf.z.a(launchParcel.f84906i);
            java.lang.String n17 = u46.l.n(a17 != null ? a17 : "", ".html");
            java.lang.String g07 = kz5.n0.g0(((java.util.HashMap) nf.z.c(launchParcel.f84906i)).entrySet(), "&", null, null, 0, null, com.tencent.mm.plugin.appbrand.we.f90962d, 30, null);
            java.lang.String a18 = fp.s0.a(n17);
            kotlin.jvm.internal.o.f(a18, "encode(...)");
            hashMap.put("migrateSourcePath", a18);
            java.lang.String a19 = fp.s0.a(g07);
            kotlin.jvm.internal.o.f(a19, "encode(...)");
            hashMap.put("migrateSourceQuery", a19);
        }
        hashMap.put("migrateSourceScene", java.lang.String.valueOf(launchParcel.f84910o.f87790f));
        hashMap.put("migrateSourceAppIdIsStared", z17 ? "1" : "0");
        launchParcel.f84901d = null;
        launchParcel.f84902e = migrateTargetAppId;
        launchParcel.f84912p0 = true;
        launchParcel.M = new com.tencent.mm.plugin.appbrand.launching.report.AppBrandRuntimeReloadReportBundle(sourceInstanceId, wg1.b.f445714g.h());
        launchParcel.f84910o.f87790f = 1248;
        java.util.Set entrySet = hashMap.entrySet();
        kotlin.jvm.internal.o.f(entrySet, "<get-entries>(...)");
        launchParcel.f84906i = "?".concat(kz5.n0.g0(entrySet, "&", null, null, 0, null, com.tencent.mm.plugin.appbrand.ve.f90860d, 30, null));
    }
}
