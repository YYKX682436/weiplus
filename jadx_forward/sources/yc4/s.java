package yc4;

/* loaded from: classes4.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final yc4.s f542397a = new yc4.s();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f542398b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f542399c = "";

    /* renamed from: d, reason: collision with root package name */
    public static int f542400d = -1;

    static {
        ((ku5.t0) ku5.t0.f394148d).g(yc4.r.f542396d);
    }

    public final void a(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("check", "com.tencent.mm.plugin.sns.ui.improve.report.ImproveSnsMethodReport");
        java.util.HashMap hashMap = f542398b;
        if (!hashMap.containsKey(java.lang.Integer.valueOf(i17))) {
            hashMap.put(java.lang.Integer.valueOf(i17), new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6898xf2e84d22());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("check", "com.tencent.mm.plugin.sns.ui.improve.report.ImproveSnsMethodReport");
    }

    public final void b(int i17, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillContentCost", "com.tencent.mm.plugin.sns.ui.improve.report.ImproveSnsMethodReport");
        a(i17);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6898xf2e84d22 c6898xf2e84d22 = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6898xf2e84d22) f542398b.get(java.lang.Integer.valueOf(i17));
        if (c6898xf2e84d22 != null) {
            c6898xf2e84d22.f142147g = (int) j17;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillContentCost", "com.tencent.mm.plugin.sns.ui.improve.report.ImproveSnsMethodReport");
    }

    public final void c(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("report", "com.tencent.mm.plugin.sns.ui.improve.report.ImproveSnsMethodReport");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6898xf2e84d22 c6898xf2e84d22 = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6898xf2e84d22) f542398b.remove(java.lang.Integer.valueOf(i17));
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_improve_method_report, false)) {
            if (c6898xf2e84d22 != null) {
                c6898xf2e84d22.f142144d = c6898xf2e84d22.b("CpuInfo", f542399c, true);
            }
            if (c6898xf2e84d22 != null) {
                c6898xf2e84d22.f142150j = f542400d;
            }
            if (c6898xf2e84d22 != null) {
                c6898xf2e84d22.f142152l = 1;
            }
            if (c6898xf2e84d22 != null) {
                c6898xf2e84d22.k();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("report", "com.tencent.mm.plugin.sns.ui.improve.report.ImproveSnsMethodReport");
    }

    public final void d(int i17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setIsAd", "com.tencent.mm.plugin.sns.ui.improve.report.ImproveSnsMethodReport");
        a(i17);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6898xf2e84d22 c6898xf2e84d22 = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6898xf2e84d22) f542398b.get(java.lang.Integer.valueOf(i17));
        if (c6898xf2e84d22 != null) {
            c6898xf2e84d22.f142151k = z17 ? 1 : 2;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setIsAd", "com.tencent.mm.plugin.sns.ui.improve.report.ImproveSnsMethodReport");
    }

    public final void e(int i17, java.lang.String name) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setName", "com.tencent.mm.plugin.sns.ui.improve.report.ImproveSnsMethodReport");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        a(i17);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6898xf2e84d22 c6898xf2e84d22 = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6898xf2e84d22) f542398b.get(java.lang.Integer.valueOf(i17));
        if (c6898xf2e84d22 != null) {
            c6898xf2e84d22.f142145e = c6898xf2e84d22.b("FeedType", name, true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setName", "com.tencent.mm.plugin.sns.ui.improve.report.ImproveSnsMethodReport");
    }
}
