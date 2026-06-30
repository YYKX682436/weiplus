package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123;

/* loaded from: classes4.dex */
public class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedHashMap f246428d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0 f246429e;

    public l0(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0 s0Var, java.util.LinkedHashMap linkedHashMap) {
        this.f246429e = s0Var;
        this.f246428d = linkedHashMap;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper$1");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        java.util.LinkedHashMap linkedHashMap = this.f246428d;
        int size = linkedHashMap.size();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0 s0Var = this.f246429e;
        int i17 = s0Var.f246482f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        if (size >= i17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            int i18 = s0Var.f246482f;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            int i19 = size - i18;
            java.util.Iterator it = linkedHashMap.keySet().iterator();
            for (int i27 = 0; it.hasNext() && i27 < i19; i27++) {
                it.next();
                it.remove();
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.k0(this));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        com.p314xaae8f345.mm.p2621x8fb0427b.j3 j3Var = s0Var.f246472a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        j3Var.f(6, linkedHashMap);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsReportHelper", "save exposure feed id for cgi [%d] oriSize[%d] cost[%d]", java.lang.Integer.valueOf(linkedHashMap.size()), java.lang.Integer.valueOf(size), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper$1");
    }
}
