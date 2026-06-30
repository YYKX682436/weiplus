package com.p314xaae8f345.p2969xcb80528d.p2979xc84c5534;

/* renamed from: com.tencent.tavkit.report.CompositingReportSession */
/* loaded from: classes16.dex */
public final class C25921x5ba123be {

    /* renamed from: FLUSH_DURATION_THRESHOLD */
    private static final int f49064x657f49b = 10;

    /* renamed from: REPORT_EVENT */
    private static final java.lang.String f49065xf8596faf = "android_tavkit_compositing";

    /* renamed from: REPORT_KEY_AVG_RENDER_TIME_US */
    public static final java.lang.String f49066x796123f = "avg_render_time_us";

    /* renamed from: REPORT_SERVICE */
    private static final java.lang.String f49067x100bce8a = "TAVKit_Android";

    /* renamed from: REPORT_VERSION */
    private static final java.lang.String f49068xaebd24ad = "3.0";
    private static final java.lang.String TAG = "CompositingReportSessio";

    /* renamed from: reporter */
    private static com.p314xaae8f345.p2969xcb80528d.p2979xc84c5534.C25921x5ba123be.IReporter f49069xe68be4e1;

    /* renamed from: filterChainReporter */
    private final com.p314xaae8f345.p2969xcb80528d.p2979xc84c5534.C25921x5ba123be.FilterChainReporter f49072xa0da962a;

    /* renamed from: renderHeight */
    private float f49073x189ab65d;

    /* renamed from: renderWidth */
    private float f49074x9e8789d0;

    /* renamed from: beginTimeMs */
    private long f49070xf3a95f5c = 0;

    /* renamed from: successCount */
    private int f49075xd795aacc = 0;

    /* renamed from: failureCount */
    private int f49071xf31b95a5 = 0;

    /* renamed from: totalCostUs */
    private long f49076xb8953faf = 0;

    /* renamed from: com.tencent.tavkit.report.CompositingReportSession$FilterChainReporter */
    /* loaded from: classes16.dex */
    public static class FilterChainReporter implements com.p314xaae8f345.p2969xcb80528d.p2979xc84c5534.C25922xcdf81b39.IReporter {

        /* renamed from: values */
        private java.util.Map<java.lang.String, java.lang.Long> f49077xcee59d22;

        private FilterChainReporter() {
            this.f49077xcee59d22 = new java.util.HashMap();
        }

        @Override // com.p314xaae8f345.p2969xcb80528d.p2979xc84c5534.C25922xcdf81b39.IReporter
        /* renamed from: onCommit */
        public void mo98804x3e33fff6(java.util.Map<java.lang.String, java.lang.Long> map) {
            map.putAll(map);
        }
    }

    /* renamed from: com.tencent.tavkit.report.CompositingReportSession$IReporter */
    /* loaded from: classes6.dex */
    public interface IReporter {
        /* renamed from: onCommit */
        void m98805x3e33fff6(java.util.Map<java.lang.String, java.lang.Long> map, java.util.Map<java.lang.String, java.lang.Long> map2);
    }

    public C25921x5ba123be(float f17, float f18) {
        this.f49074x9e8789d0 = f17;
        this.f49073x189ab65d = f18;
        com.p314xaae8f345.p2969xcb80528d.p2979xc84c5534.C25921x5ba123be.FilterChainReporter filterChainReporter = new com.p314xaae8f345.p2969xcb80528d.p2979xc84c5534.C25921x5ba123be.FilterChainReporter();
        this.f49072xa0da962a = filterChainReporter;
        com.p314xaae8f345.p2969xcb80528d.p2979xc84c5534.C25922xcdf81b39.m98806x5d1e8363(filterChainReporter);
    }

    /* renamed from: commit */
    private void m98798xaf3f2937() {
    }

    /* renamed from: reset */
    private void m98799x6761d4f() {
        this.f49070xf3a95f5c = 0L;
        this.f49076xb8953faf = 0L;
        this.f49075xd795aacc = 0;
    }

    /* renamed from: setReporter */
    public static synchronized void m98800x5d1e8363(com.p314xaae8f345.p2969xcb80528d.p2979xc84c5534.C25921x5ba123be.IReporter iReporter) {
        synchronized (com.p314xaae8f345.p2969xcb80528d.p2979xc84c5534.C25921x5ba123be.class) {
            f49069xe68be4e1 = iReporter;
        }
    }

    /* renamed from: flush */
    public final void m98801x5d03b04() {
        if (this.f49070xf3a95f5c == 0) {
            return;
        }
        if (this.f49075xd795aacc >= 10) {
            m98798xaf3f2937();
        }
        m98799x6761d4f();
    }

    /* renamed from: tickFailed */
    public void m98802x46a3683a() {
        this.f49071xf31b95a5++;
    }

    /* renamed from: tickSuccess */
    public final void m98803x5f42eba6(long j17) {
        if (this.f49070xf3a95f5c == 0) {
            this.f49070xf3a95f5c = java.lang.System.currentTimeMillis() - ((j17 / 1000) / 1000);
        }
        this.f49075xd795aacc++;
        this.f49076xb8953faf += j17 / 1000;
    }
}
