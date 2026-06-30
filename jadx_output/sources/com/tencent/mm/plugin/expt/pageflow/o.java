package com.tencent.mm.plugin.expt.pageflow;

/* loaded from: classes13.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public static com.tencent.mm.plugin.expt.pageflow.o f99819a;

    public void a(com.tencent.mm.autogen.mmdata.rpt.PageFlowDetailStruct pageFlowDetailStruct) {
        com.tencent.mm.sdk.platformtools.o4 M;
        if (pageFlowDetailStruct == null) {
            return;
        }
        int i17 = (int) pageFlowDetailStruct.f59827h;
        if ((i17 == 7 || i17 == 8) && a52.a.b() && a52.a.a()) {
            e42.d0 d0Var = e42.d0.clicfg_weixin_mm_hell_hound;
            if (com.tencent.mm.sdk.platformtools.x2.n()) {
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                android.os.SystemClock.elapsedRealtime();
                int P = com.tencent.mm.sdk.platformtools.t8.P(l62.c.b().c(d0Var, "", false), 0);
                if (P <= 0) {
                    return;
                }
                int i18 = gm0.m.i();
                if (i18 == 0) {
                    M = null;
                } else {
                    M = com.tencent.mm.sdk.platformtools.o4.M(i18 + "_WxPageFlowMerge");
                }
                if (M == null) {
                    return;
                }
                java.lang.String str = M.getString("clicfg_weixin_mm_hell_hound", "") + "|" + pageFlowDetailStruct.p(";");
                long j17 = M.getLong("clicfg_weixin_mm_hell_hound_rpttime", 0L);
                if ((str.length() >= P || com.tencent.mm.sdk.platformtools.t8.H1(j17) > 3600) && pageFlowDetailStruct.f59827h % 2 == 0) {
                    M.putLong("clicfg_weixin_mm_hell_hound_rpttime", com.tencent.mm.sdk.platformtools.t8.i1());
                    M.putString("clicfg_weixin_mm_hell_hound", "");
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(16562, str);
                    s75.d.b(new com.tencent.mm.plugin.expt.pageflow.m(this, str), "report_weixin_app_time");
                } else {
                    M.putString("clicfg_weixin_mm_hell_hound", str);
                }
                android.os.SystemClock.elapsedRealtime();
            }
        }
    }
}
