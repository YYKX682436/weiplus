package com.p314xaae8f345.tav.p2968xc84c5534;

/* renamed from: com.tencent.tav.report.PreviewReportSession */
/* loaded from: classes16.dex */
public final class C25856x1bca27fa {

    /* renamed from: FLUSH_DURATION_THRESHOLD */
    private static final int f48792x657f49b = 10;
    private static final java.lang.String TAG = "PreviewReportSession";

    /* renamed from: beginTimeMs */
    private long f48793xf3a95f5c = 0;

    /* renamed from: frameCount */
    private int f48794xee5393a2 = 0;

    /* renamed from: totalReadCostUs */
    private long f48795xb22eaae5 = 0;

    /* renamed from: totalRenderCount */
    private long f48796x242c8735 = 0;

    /* renamed from: commit */
    private void m98327xaf3f2937() {
    }

    /* renamed from: reset */
    private void m98328x6761d4f() {
        this.f48793xf3a95f5c = 0L;
        this.f48795xb22eaae5 = 0L;
        this.f48796x242c8735 = 0L;
        this.f48794xee5393a2 = 0;
    }

    /* renamed from: flush */
    public final void m98329x5d03b04() {
        if (this.f48793xf3a95f5c == 0) {
            return;
        }
        if (this.f48794xee5393a2 >= 10) {
            m98327xaf3f2937();
        }
        m98328x6761d4f();
    }

    /* renamed from: tickPreview */
    public final void m98330xbb968f6b(long j17, long j18) {
        if (this.f48793xf3a95f5c == 0) {
            this.f48793xf3a95f5c = java.lang.System.currentTimeMillis() - ((j17 / 1000) / 1000);
        }
        this.f48794xee5393a2++;
        this.f48795xb22eaae5 += j17 / 1000;
        this.f48796x242c8735 += j18 / 1000;
    }
}
