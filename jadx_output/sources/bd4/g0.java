package bd4;

/* loaded from: classes4.dex */
public final class g0 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.view.ImproveFinderTierView f19347a;

    public g0(com.tencent.mm.plugin.sns.ui.improve.view.ImproveFinderTierView improveFinderTierView) {
        this.f19347a = improveFinderTierView;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onViewExposed", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveFinderTierView$1");
        kotlin.jvm.internal.o.g(view, "view");
        if (z17) {
            rc4.e eVar = rc4.e.f394136a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("viewExposed", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
            rc4.a aVar = rc4.e.f394141f;
            if (aVar != null) {
                int a17 = aVar.a() + 1;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setExposeCount", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
                aVar.f394122b = a17;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setExposeCount", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
            }
            rc4.e.f394137b.B("FinderTierManager.EXPOSE_KEY", java.lang.System.currentTimeMillis());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewExposed", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).wj(this.f19347a, "click_timestamp");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onViewExposed", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveFinderTierView$1");
    }
}
