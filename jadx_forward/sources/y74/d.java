package y74;

/* loaded from: classes4.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f541314d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f541315e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f541316f;

    public d(java.lang.String str, long j17, int i17) {
        this.f541314d = str;
        this.f541315e = j17;
        this.f541316f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.Map map;
        java.lang.String str;
        long j17;
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.timeline.report.AdTimelineReporter$tryReportTimelineExposeCost$1");
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getRequestIdMap$p", "com.tencent.mm.plugin.sns.ad.timeline.report.AdTimelineReporter");
            map = y74.e.f541318b;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getRequestIdMap$p", "com.tencent.mm.plugin.sns.ad.timeline.report.AdTimelineReporter");
            str = this.f541314d;
            j17 = this.f541315e;
            i17 = this.f541316f;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdTimelineReporter", "tryReportTimelineExposeCost exp=" + th6);
        }
        synchronized (map) {
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getRequestIdMap$p", "com.tencent.mm.plugin.sns.ad.timeline.report.AdTimelineReporter");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getRequestIdMap$p", "com.tencent.mm.plugin.sns.ad.timeline.report.AdTimelineReporter");
                if (map.containsKey(str)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getRequestIdMap$p", "com.tencent.mm.plugin.sns.ad.timeline.report.AdTimelineReporter");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getRequestIdMap$p", "com.tencent.mm.plugin.sns.ad.timeline.report.AdTimelineReporter");
                    java.lang.Long l17 = (java.lang.Long) map.remove(str);
                    long longValue = j17 - (l17 != null ? l17.longValue() : 0L);
                    if (!y74.e.f541317a.a()) {
                        return;
                    }
                    ca4.e0.b("time_line_async_req_report_cost", "2", (int) longValue, i17, "" + str);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.timeline.report.AdTimelineReporter$tryReportTimelineExposeCost$1");
            } finally {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.timeline.report.AdTimelineReporter$tryReportTimelineExposeCost$1");
            }
        }
    }
}
