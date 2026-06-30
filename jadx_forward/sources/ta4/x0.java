package ta4;

/* loaded from: classes4.dex */
public final class x0 {

    /* renamed from: j, reason: collision with root package name */
    public static final ta4.w0 f498384j = new ta4.w0(null);

    /* renamed from: k, reason: collision with root package name */
    public static final java.util.LinkedList f498385k = new java.util.LinkedList();

    /* renamed from: d, reason: collision with root package name */
    public int f498389d;

    /* renamed from: e, reason: collision with root package name */
    public int f498390e;

    /* renamed from: f, reason: collision with root package name */
    public int f498391f;

    /* renamed from: h, reason: collision with root package name */
    public int f498393h;

    /* renamed from: i, reason: collision with root package name */
    public int f498394i;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f498386a = "";

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f498387b = "";

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f498388c = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f498392g = "";

    public static final /* synthetic */ java.util.LinkedList a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getReporterList$cp", "com.tencent.mm.plugin.sns.report.SnsInputAreaReporter");
        java.util.LinkedList linkedList = f498385k;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getReporterList$cp", "com.tencent.mm.plugin.sns.report.SnsInputAreaReporter");
        return linkedList;
    }

    public final void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doReport", "com.tencent.mm.plugin.sns.report.SnsInputAreaReporter");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7066x1cfca5ec c7066x1cfca5ec = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7066x1cfca5ec();
        c7066x1cfca5ec.f143735d = this.f498389d;
        c7066x1cfca5ec.f143741j = this.f498391f;
        c7066x1cfca5ec.f143740i = this.f498390e;
        c7066x1cfca5ec.f143743l = this.f498393h;
        c7066x1cfca5ec.f143742k = c7066x1cfca5ec.b("contextScreenHeightRatio", this.f498392g, true);
        c7066x1cfca5ec.f143738g = c7066x1cfca5ec.b("commentID", this.f498388c, true);
        c7066x1cfca5ec.f143737f = c7066x1cfca5ec.b("feedID", this.f498387b, true);
        c7066x1cfca5ec.f143736e = c7066x1cfca5ec.b("sessionID", this.f498386a, true);
        c7066x1cfca5ec.f143739h = this.f498394i;
        c7066x1cfca5ec.k();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeReporter", "com.tencent.mm.plugin.sns.report.SnsInputAreaReporter$Companion");
        a().remove(this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeReporter", "com.tencent.mm.plugin.sns.report.SnsInputAreaReporter$Companion");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doReport", "com.tencent.mm.plugin.sns.report.SnsInputAreaReporter");
    }

    public final void c(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("prepareDoReport", "com.tencent.mm.plugin.sns.report.SnsInputAreaReporter");
        this.f498389d = i17;
        this.f498394i = i18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("offerReporter", "com.tencent.mm.plugin.sns.report.SnsInputAreaReporter$Companion");
        a().offerFirst(this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("offerReporter", "com.tencent.mm.plugin.sns.report.SnsInputAreaReporter$Companion");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("prepareDoReport", "com.tencent.mm.plugin.sns.report.SnsInputAreaReporter");
    }

    public final void d(android.text.Layout layout) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setTextReportData", "com.tencent.mm.plugin.sns.report.SnsInputAreaReporter");
        if (layout == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setTextReportData", "com.tencent.mm.plugin.sns.report.SnsInputAreaReporter");
            return;
        }
        int height = layout.getHeight();
        int i17 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).y;
        int length = layout.getText().length();
        int lineCount = layout.getLineCount();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setTextReportData", "com.tencent.mm.plugin.sns.report.SnsInputAreaReporter");
        this.f498390e = length;
        this.f498391f = lineCount;
        this.f498392g = java.lang.String.valueOf(height / i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setTextReportData", "com.tencent.mm.plugin.sns.report.SnsInputAreaReporter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setTextReportData", "com.tencent.mm.plugin.sns.report.SnsInputAreaReporter");
    }
}
