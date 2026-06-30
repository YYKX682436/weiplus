package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public abstract class a implements com.tencent.mm.plugin.appbrand.launching.precondition.x {
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0116, code lost:
    
        if (r0 == null) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(android.content.Context r11, com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel r12) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.launching.a.a(android.content.Context, com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel):boolean");
    }

    public final boolean b(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject, com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer appBrandLaunchReferrer, com.tencent.mm.modelappbrand.LaunchParamsOptional launchParamsOptional) {
        return c(context, str, str2, str3, i17, i18, appBrandStatObject, appBrandLaunchReferrer, launchParamsOptional, "", "");
    }

    public boolean c(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject, com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer appBrandLaunchReferrer, com.tencent.mm.modelappbrand.LaunchParamsOptional launchParamsOptional, java.lang.String str4, java.lang.String str5) {
        com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel launchParcel = new com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel();
        launchParcel.f84901d = str;
        launchParcel.f84902e = str2;
        launchParcel.f84906i = str3 == null ? null : str3.trim();
        if (com.tencent.mm.plugin.appbrand.appcache.g0.b(i17) || com.tencent.mm.plugin.appbrand.appcache.g0.a(i17)) {
            launchParcel.f84904g = i17;
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.Precondition.AbstractLaunchEntry", "start with invalid versionType[%d], use 0 instead, stack=%s", java.lang.Integer.valueOf(i17), android.util.Log.getStackTraceString(new java.lang.Throwable()));
            launchParcel.f84904g = 0;
        }
        launchParcel.f84903f = i18;
        launchParcel.f84910o = appBrandStatObject;
        launchParcel.f84911p = appBrandLaunchReferrer;
        launchParcel.f84914q = launchParamsOptional;
        if (launchParamsOptional != null && launchParamsOptional.f70419h != 0) {
            launchParcel.F = 1;
        }
        launchParcel.D = str4;
        launchParcel.E = str5;
        return a(context, launchParcel);
    }

    public abstract boolean d(android.content.Context context, com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel launchParcel);
}
