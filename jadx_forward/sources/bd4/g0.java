package bd4;

/* loaded from: classes4.dex */
public final class g0 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.C18269x12169365 f100880a;

    public g0(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.C18269x12169365 c18269x12169365) {
        this.f100880a = c18269x12169365;
    }

    @Override // ym5.n0
    /* renamed from: onViewExposed */
    public void mo976xcdf5f75c(android.view.View view, long j17, long j18, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onViewExposed", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveFinderTierView$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        if (z17) {
            rc4.e eVar = rc4.e.f475669a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("viewExposed", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
            rc4.a aVar = rc4.e.f475674f;
            if (aVar != null) {
                int a17 = aVar.a() + 1;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setExposeCount", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
                aVar.f475655b = a17;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setExposeCount", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
            }
            rc4.e.f475670b.B("FinderTierManager.EXPOSE_KEY", java.lang.System.currentTimeMillis());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("viewExposed", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).wj(this.f100880a, "click_timestamp");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onViewExposed", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveFinderTierView$1");
    }
}
