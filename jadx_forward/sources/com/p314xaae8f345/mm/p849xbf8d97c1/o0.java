package com.p314xaae8f345.mm.p849xbf8d97c1;

/* loaded from: classes12.dex */
public final class o0 implements jr5.a {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f150373a = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L();

    public int a(java.lang.String str, int i17) {
        int i18;
        if (!str.equals("clicfg_matrix_trace_evil_method_threshold") || (i18 = this.f150373a.getInt("clicfg_matrix_trace_evil_method_threshold", -1)) == -1) {
            java.lang.String b17 = b(str, "");
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17) ? i17 : com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(b17, i17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XDynamicConfig", "[get] local! key=%s value=%s", str, java.lang.Integer.valueOf(i18));
        return i18;
    }

    public java.lang.String b(java.lang.String str, java.lang.String str2) {
        if ("clicfg_matrix_resource_detect_interval_millis".equals(str) || "clicfg_matrix_resource_detect_interval_millis_bg".equals(str)) {
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            if (z65.c.a()) {
                return java.lang.String.valueOf(java.util.concurrent.TimeUnit.SECONDS.toMillis(10L));
            }
        }
        java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        return (z65.c.a() && "clicfg_matrix_resource_max_detect_times".equals(str)) ? java.lang.String.valueOf(10) : j62.e.g().a(str, str2, false, false);
    }
}
