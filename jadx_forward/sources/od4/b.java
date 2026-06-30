package od4;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final od4.b f426181a = new od4.b();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f426182b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f426183c = "";

    /* renamed from: d, reason: collision with root package name */
    public static int f426184d = -1;

    static {
        ((ku5.t0) ku5.t0.f394148d).g(od4.a.f426180d);
    }

    public final void a(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("report", "com.tencent.mm.plugin.sns.ui.item.improve.report.SnsMethodReport");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6898xf2e84d22 c6898xf2e84d22 = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6898xf2e84d22) f426182b.remove(java.lang.Integer.valueOf(i17));
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_improve_method_report, false)) {
            if (c6898xf2e84d22 != null) {
                c6898xf2e84d22.f142144d = c6898xf2e84d22.b("CpuInfo", f426183c, true);
            }
            if (c6898xf2e84d22 != null) {
                c6898xf2e84d22.f142150j = f426184d;
            }
            if (c6898xf2e84d22 != null) {
                c6898xf2e84d22.f142152l = 2;
            }
            if (c6898xf2e84d22 != null) {
                c6898xf2e84d22.k();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("report", "com.tencent.mm.plugin.sns.ui.item.improve.report.SnsMethodReport");
    }

    public final void b(int i17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setIsAd", "com.tencent.mm.plugin.sns.ui.item.improve.report.SnsMethodReport");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6898xf2e84d22 c6898xf2e84d22 = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6898xf2e84d22) f426182b.get(java.lang.Integer.valueOf(i17));
        if (c6898xf2e84d22 != null) {
            c6898xf2e84d22.f142151k = z17 ? 1 : 2;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setIsAd", "com.tencent.mm.plugin.sns.ui.item.improve.report.SnsMethodReport");
    }
}
