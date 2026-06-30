package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123;

/* loaded from: classes4.dex */
public class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l52.g f246439d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.n0 f246440e;

    public m0(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.n0 n0Var, l52.g gVar) {
        this.f246440e = n0Var;
        this.f246439d = gVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        int size;
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper$3$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0 s0Var = this.f246440e.f246446a;
        java.lang.String str = this.f246439d.f398140a.f464371d;
        java.lang.Integer num = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246469j0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$400", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        s0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("exposeSnsFeed", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        s0Var.f246479d0 = str;
        synchronized (s0Var.f246487h0) {
            try {
                s0Var.f246487h0.add(str);
                size = s0Var.f246487h0.size();
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("exposeSnsFeed", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
                throw th6;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkIsExposeLastSnsFeedEvent", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        if (s0Var.f246481e0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkIsExposeLastSnsFeedEvent", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        } else {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(s0Var.f246477c0) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(s0Var.f246477c0, str)) {
                s0Var.E(3);
                s0Var.f246481e0 = true;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkIsExposeLastSnsFeedEvent", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkIsPushExposeSnsFeedEvent", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        int i18 = s0Var.f246483f0;
        if (i18 > 0 && (i17 = size / i18) > s0Var.f246485g0) {
            s0Var.f246485g0 = i17;
            s0Var.E(4);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkIsPushExposeSnsFeedEvent", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("exposeSnsFeed", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$400", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper$3$1");
    }
}
