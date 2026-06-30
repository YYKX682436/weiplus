package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4;

/* loaded from: classes4.dex */
public abstract class a {
    public static final boolean a(java.lang.String str, java.lang.String str2) {
        boolean z17 = true;
        if (!(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_app_brand_cgi_valid_check, 1) == 1)) {
            return true;
        }
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        java.lang.String str3 = str == null ? "" : str;
        java.lang.String str4 = str2 != null ? str2 : "";
        if ((str == null && str2 == null) || (r26.n0.N(str3) && (r26.n0.N(str4) || !r26.i0.n(str4, "@app", false) || str4.length() < 5))) {
            z17 = false;
        }
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandCgiArgsCheckUtil", "isValidCgiArgs: invalid cgi args appId [" + str + "] userName [" + str2 + "] stack [" + android.util.Log.getStackTraceString(new java.lang.Throwable()) + ']');
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(369, 34);
        }
        return z17;
    }
}
