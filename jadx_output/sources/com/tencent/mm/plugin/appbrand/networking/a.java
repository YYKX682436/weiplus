package com.tencent.mm.plugin.appbrand.networking;

/* loaded from: classes4.dex */
public abstract class a {
    public static final boolean a(java.lang.String str, java.lang.String str2) {
        boolean z17 = true;
        if (!(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_app_brand_cgi_valid_check, 1) == 1)) {
            return true;
        }
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.lang.String str3 = str == null ? "" : str;
        java.lang.String str4 = str2 != null ? str2 : "";
        if ((str == null && str2 == null) || (r26.n0.N(str3) && (r26.n0.N(str4) || !r26.i0.n(str4, "@app", false) || str4.length() < 5))) {
            z17 = false;
        }
        if (!z17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandCgiArgsCheckUtil", "isValidCgiArgs: invalid cgi args appId [" + str + "] userName [" + str2 + "] stack [" + android.util.Log.getStackTraceString(new java.lang.Throwable()) + ']');
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(369, 34);
        }
        return z17;
    }
}
