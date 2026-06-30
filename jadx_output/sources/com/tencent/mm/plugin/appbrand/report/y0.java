package com.tencent.mm.plugin.appbrand.report;

/* loaded from: classes7.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.report.y0 f88429a = new com.tencent.mm.plugin.appbrand.report.y0();

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f88430b;

    public static final java.lang.String a() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SceneId@");
        sb6.append(f88429a.hashCode());
        sb6.append('#');
        sb6.append(kk.v.a(gm0.j1.b().h()));
        sb6.append('#');
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(java.lang.System.currentTimeMillis());
        return sb6.toString();
    }

    public static final void b(com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo localUsageInfo, int i17, int i18, java.lang.String str) {
        if (localUsageInfo != null) {
            int i19 = localUsageInfo.f76363f + 1;
            java.lang.String str2 = localUsageInfo.f76362e;
            if (str2 != null) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13801, str2, java.lang.Integer.valueOf(localUsageInfo.f76364g), java.lang.Integer.valueOf(i19), java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.i1()), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, java.lang.Integer.valueOf(com.tencent.mm.plugin.appbrand.report.v0.d(str2)));
            }
        }
    }
}
