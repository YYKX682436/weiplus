package com.tencent.mm.plugin.appbrand.appusage;

/* loaded from: classes7.dex */
public final class p2 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.appusage.p2 f76539a = new com.tencent.mm.plugin.appbrand.appusage.p2();

    public final int a() {
        if (gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_APP_BRAND_ENTRANCE_SHOW_NEW_BOOLEAN, false)) {
            return 1;
        }
        int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_APP_BRAND_ENTRANCE_RED_DOT_NEW_XML_REASON_INT, 0)).intValue();
        return intValue > 0 ? intValue + 1 : intValue;
    }

    public final void b(java.lang.String str, long j17, int i17, int i18) {
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = 1;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        objArr[1] = str;
        objArr[2] = java.lang.Long.valueOf(j17);
        objArr[3] = java.lang.Integer.valueOf(i17);
        objArr[4] = java.lang.Integer.valueOf(i18);
        g0Var.d(14112, objArr);
    }
}
