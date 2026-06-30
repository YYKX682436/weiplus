package com.p314xaae8f345.tav.p2968xc84c5534;

/* renamed from: com.tencent.tav.report.ExportReportSession */
/* loaded from: classes16.dex */
public final class C25855x7912cb4e {

    /* renamed from: FLUSH_DURATION_THRESHOLD */
    private static final int f48779x657f49b = 10;
    private static final java.lang.String TAG = "ExportReportSession";

    /* renamed from: beginTimeMs */
    private long f48780xf3a95f5c = 0;

    /* renamed from: successCount */
    private int f48786xd795aacc = 0;

    /* renamed from: totalCostUs */
    private long f48787xb8953faf = 0;

    /* renamed from: totalDecodeUs */
    private long f48788x23999490 = 0;

    /* renamed from: totalRealDecodeUs */
    private long f48790xbea8824e = 0;

    /* renamed from: totalEncodeUs */
    private long f48789x6792d6b8 = 0;

    /* renamed from: totalRenderUs */
    private long f48791xe414fa38 = 0;

    /* renamed from: compositeTimeUs */
    private long f48781x3ceefbb2 = 0;

    /* renamed from: success */
    private boolean f48785x90b54003 = false;

    /* renamed from: fileDurationUs */
    private long f48783x8f8169ee = 0;

    /* renamed from: framePerSecond */
    private long f48784x58809904 = 0;

    /* renamed from: exportStartTimeNs */
    private long f48782x76ab3820 = 0;

    /* renamed from: commit */
    private void m98304xaf3f2937() {
        if (this.f48780xf3a95f5c != 0 && this.f48782x76ab3820 != 0) {
            if (this.f48786xd795aacc >= 10) {
                m98305xfc6d4da2();
            }
        } else {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(TAG, "commit: 数据错误，beginTimeMs = " + this.f48780xf3a95f5c + "， exportStartTimeNs = " + this.f48782x76ab3820);
        }
    }

    /* renamed from: doCommit */
    private void m98305xfc6d4da2() {
        double d17 = this.f48787xb8953faf;
        int i17 = this.f48786xd795aacc;
        double d18 = this.f48788x23999490 / i17;
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.i(TAG, "report export performance, compositeTimeUs:" + this.f48781x3ceefbb2 + ", totalCostUs:" + this.f48787xb8953faf + ", totalDecodeUs:" + this.f48788x23999490 + ", successCount:" + this.f48786xd795aacc + ", avg_decode_time:" + d18 + ", avg_render_time:" + (d17 / i17));
    }

    /* renamed from: getAverageDecodeUs */
    public long m98306xeca18033() {
        if (this.f48786xd795aacc != 0) {
            return m98312xe0f950da() / this.f48786xd795aacc;
        }
        return 0L;
    }

    /* renamed from: getAverageEncodeUs */
    public long m98307x309ac25b() {
        int i17 = this.f48786xd795aacc;
        if (i17 != 0) {
            return this.f48789x6792d6b8 / i17;
        }
        return 0L;
    }

    /* renamed from: getAverageRenderUs */
    public long m98308xad1ce5db() {
        int i17 = this.f48786xd795aacc;
        if (i17 != 0) {
            return this.f48791xe414fa38 / i17;
        }
        return 0L;
    }

    /* renamed from: getCompositeTimeUs */
    public long m98309x2150cd7c() {
        return this.f48781x3ceefbb2;
    }

    /* renamed from: getSuccessCount */
    public int m98310x38883d42() {
        return this.f48786xd795aacc;
    }

    /* renamed from: getTotalCostUs */
    public long m98311x926b8679() {
        return this.f48787xb8953faf;
    }

    /* renamed from: getTotalDecodeUs */
    public long m98312xe0f950da() {
        return this.f48790xbea8824e;
    }

    /* renamed from: getTotalEncodeUs */
    public long m98313x24f29302() {
        return this.f48789x6792d6b8;
    }

    /* renamed from: getTotalRenderUs */
    public long m98314xa174b682() {
        return this.f48791xe414fa38;
    }

    /* renamed from: onExportError */
    public void m98315x9e438755() {
        this.f48785x90b54003 = false;
        m98304xaf3f2937();
    }

    /* renamed from: onExportStart */
    public void m98316x9f0979af(long j17) {
        this.f48782x76ab3820 = j17;
        this.f48780xf3a95f5c = java.lang.System.currentTimeMillis();
    }

    /* renamed from: onExportSuccess */
    public void m98317x45bd610() {
        if (this.f48782x76ab3820 <= 0) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(TAG, "onExportSuccess: 数据错误，exportStartTimeNs = " + this.f48782x76ab3820);
        } else {
            this.f48785x90b54003 = true;
            this.f48781x3ceefbb2 = (java.lang.System.nanoTime() - this.f48782x76ab3820) / 1000;
            m98304xaf3f2937();
        }
    }

    /* renamed from: reset */
    public void m98318x6761d4f() {
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(TAG, "reset() called");
        this.f48781x3ceefbb2 = 0L;
        this.f48785x90b54003 = false;
        this.f48787xb8953faf = 0L;
        this.f48786xd795aacc = 0;
        this.f48783x8f8169ee = 0L;
        this.f48784x58809904 = 0L;
    }

    /* renamed from: setFileDurationUs */
    public void m98319x460f9ef0(long j17) {
        this.f48783x8f8169ee = j17;
    }

    /* renamed from: setFramePerSecond */
    public void m98320xf0ece06(int i17) {
        this.f48784x58809904 = i17;
    }

    /* renamed from: setTotalEncodeUs */
    public void m98321xb7c8f976(long j17) {
        this.f48789x6792d6b8 = j17;
    }

    /* renamed from: setTotalRealDecodeUs */
    public void m98322xed73160c(long j17) {
        this.f48790xbea8824e = j17;
    }

    /* renamed from: setTotalRenderUs */
    public void m98323x344b1cf6(long j17) {
        this.f48791xe414fa38 = j17;
    }

    /* renamed from: tickDecode */
    public final void m98324x436f65eb(long j17) {
        this.f48788x23999490 += j17 / 1000;
    }

    /* renamed from: tickExport */
    public final void m98325x4635e7b1(long j17) {
        this.f48786xd795aacc++;
        this.f48787xb8953faf += j17 / 1000;
    }

    /* renamed from: toString */
    public java.lang.String m98326x9616526c() {
        return "ExportReportSession{success=" + this.f48785x90b54003 + ", successCount=" + this.f48786xd795aacc + ", compositeTimeUs=" + this.f48781x3ceefbb2 + ", totalCostUs=" + m98311x926b8679() + ", totalDecodeUs=" + m98312xe0f950da() + ", totalEncodeUs=" + m98313x24f29302() + ", totalRenderUs=" + m98314xa174b682() + ", averageDecodeUs=" + m98306xeca18033() + ", averageEncodeUs=" + m98307x309ac25b() + ", averageRenderUs=" + m98308xad1ce5db() + '}';
    }
}
