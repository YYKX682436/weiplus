package com.p314xaae8f345.p2969xcb80528d.p2979xc84c5534;

/* renamed from: com.tencent.tavkit.report.FilterChainReportSession */
/* loaded from: classes16.dex */
public class C25922xcdf81b39 {

    /* renamed from: reporter */
    private static com.p314xaae8f345.p2969xcb80528d.p2979xc84c5534.C25922xcdf81b39.IReporter f49078xe68be4e1;

    /* renamed from: timeConsumerMap */
    private java.util.Map<java.lang.String, com.p314xaae8f345.p2969xcb80528d.p2979xc84c5534.C25922xcdf81b39.TimeConsumer> f49079x22832079 = new java.util.HashMap();

    /* renamed from: com.tencent.tavkit.report.FilterChainReportSession$IReporter */
    /* loaded from: classes16.dex */
    public interface IReporter {
        /* renamed from: onCommit */
        void mo98804x3e33fff6(java.util.Map<java.lang.String, java.lang.Long> map);
    }

    /* renamed from: com.tencent.tavkit.report.FilterChainReportSession$TimeConsumer */
    /* loaded from: classes16.dex */
    public static class TimeConsumer {
        private final java.lang.String key;

        /* renamed from: totalUs */
        private long f49081xbc4d2502 = 0;

        /* renamed from: count */
        private long f49080x5a7510f = 0;

        public TimeConsumer(java.lang.String str) {
            this.key = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: getAvgTimeUs */
        public long m98812xed19d107() {
            long j17 = this.f49080x5a7510f;
            if (j17 == 0) {
                return 0L;
            }
            return this.f49081xbc4d2502 / j17;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: tick */
        public void m98813x36519d(long j17) {
            this.f49081xbc4d2502 += j17;
            this.f49080x5a7510f++;
        }
    }

    /* renamed from: setReporter */
    public static synchronized void m98806x5d1e8363(com.p314xaae8f345.p2969xcb80528d.p2979xc84c5534.C25922xcdf81b39.IReporter iReporter) {
        synchronized (com.p314xaae8f345.p2969xcb80528d.p2979xc84c5534.C25922xcdf81b39.class) {
            f49078xe68be4e1 = iReporter;
        }
    }

    /* renamed from: commit */
    public void m98807xaf3f2937() {
        java.util.HashMap hashMap = new java.util.HashMap();
        for (com.p314xaae8f345.p2969xcb80528d.p2979xc84c5534.C25922xcdf81b39.TimeConsumer timeConsumer : this.f49079x22832079.values()) {
            if (timeConsumer != null) {
                hashMap.put(timeConsumer.key, java.lang.Long.valueOf(timeConsumer.m98812xed19d107()));
            }
        }
        synchronized (com.p314xaae8f345.p2969xcb80528d.p2979xc84c5534.C25922xcdf81b39.class) {
            com.p314xaae8f345.p2969xcb80528d.p2979xc84c5534.C25922xcdf81b39.IReporter iReporter = f49078xe68be4e1;
            if (iReporter != null) {
                iReporter.mo98804x3e33fff6(hashMap);
            }
        }
    }

    /* renamed from: tick */
    public void m98808x36519d(java.lang.String str, long j17) {
        com.p314xaae8f345.p2969xcb80528d.p2979xc84c5534.C25922xcdf81b39.TimeConsumer timeConsumer = this.f49079x22832079.get(str);
        if (timeConsumer == null) {
            timeConsumer = new com.p314xaae8f345.p2969xcb80528d.p2979xc84c5534.C25922xcdf81b39.TimeConsumer(str);
            this.f49079x22832079.put(timeConsumer.key, timeConsumer);
        }
        timeConsumer.m98813x36519d(j17 / 1000);
    }
}
