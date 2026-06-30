package y74;

/* loaded from: classes4.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f541311d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f541312e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f541313f;

    public c(long j17, long j18, int i17) {
        this.f541311d = j17;
        this.f541312e = j18;
        this.f541313f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.timeline.report.AdTimelineReporter$reportTimelineRequestCost$1");
        if (!y74.e.f541317a.a()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.timeline.report.AdTimelineReporter$reportTimelineRequestCost$1");
            return;
        }
        try {
            ca4.e0.a("time_line_async_req_report_cost", "1", (int) this.f541311d, (int) this.f541312e, java.lang.String.valueOf(this.f541313f));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdTimelineReporter", "reportTimelineRequestCost exp=" + th6);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.timeline.report.AdTimelineReporter$reportTimelineRequestCost$1");
    }
}
