package com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1395x3342843d;

/* loaded from: classes13.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1395x3342843d.o f181352a;

    public void a(com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6808xc7b52ca3 c6808xc7b52ca3) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M;
        if (c6808xc7b52ca3 == null) {
            return;
        }
        int i17 = (int) c6808xc7b52ca3.f141360h;
        if ((i17 == 7 || i17 == 8) && a52.a.b() && a52.a.a()) {
            e42.d0 d0Var = e42.d0.clicfg_weixin_mm_hell_hound;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                android.os.SystemClock.elapsedRealtime();
                int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(l62.c.b().c(d0Var, "", false), 0);
                if (P <= 0) {
                    return;
                }
                int i18 = gm0.m.i();
                if (i18 == 0) {
                    M = null;
                } else {
                    M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(i18 + "_WxPageFlowMerge");
                }
                if (M == null) {
                    return;
                }
                java.lang.String str = M.getString("clicfg_weixin_mm_hell_hound", "") + "|" + c6808xc7b52ca3.p(";");
                long j17 = M.getLong("clicfg_weixin_mm_hell_hound_rpttime", 0L);
                if ((str.length() >= P || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H1(j17) > 3600) && c6808xc7b52ca3.f141360h % 2 == 0) {
                    M.putLong("clicfg_weixin_mm_hell_hound_rpttime", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1());
                    M.putString("clicfg_weixin_mm_hell_hound", "");
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(16562, str);
                    s75.d.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1395x3342843d.m(this, str), "report_weixin_app_time");
                } else {
                    M.putString("clicfg_weixin_mm_hell_hound", str);
                }
                android.os.SystemClock.elapsedRealtime();
            }
        }
    }
}
