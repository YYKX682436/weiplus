package com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2953x3164ae;

/* renamed from: com.tencent.tav.core.parallel.info.PipelineIndicatorInfo */
/* loaded from: classes15.dex */
public class C25719xdaa2a3bb {

    /* renamed from: errorStatus */
    public com.p314xaae8f345.tav.p2947x2eaf9f.C25680x8a5723a6 f47709xbac3e81a;

    /* renamed from: exportEndTimeMs */
    private long f47710xda73f8ba;

    /* renamed from: exportStartTimeMs */
    private long f47711x76ab3801;

    /* renamed from: index */
    private int f47712x5fb28d2;

    /* renamed from: timeRange */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 f47717x16fae70;

    /* renamed from: type */
    public int f47718x368f3a;

    /* renamed from: retryCount */
    private int f47715xbaa1a747 = 0;

    /* renamed from: segmentStatus */
    private com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25661xf379654e f47716xc781e905 = com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25661xf379654e.AssetParallelStatusUnknown;

    /* renamed from: readerStatus */
    public com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25654x6c9d95f0 f47714xc4753695 = com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25654x6c9d95f0.AssetReaderStatusUnknown;

    /* renamed from: writerStatus */
    public com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25668xc8009535 f47719x611cfe45 = com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25668xc8009535.AssetWriterStatusUnknown;

    /* renamed from: progress */
    private float f47713xc454c22d = 0.0f;

    public C25719xdaa2a3bb(int i17, int i18, com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26) {
        this.f47718x368f3a = i17;
        this.f47712x5fb28d2 = i18;
        this.f47717x16fae70 = c25738xead39d26;
    }

    /* renamed from: getAudioPipelineIndicatorInfo */
    public static com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2953x3164ae.C25719xdaa2a3bb m97023x8a2bf59b(com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26) {
        return new com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2953x3164ae.C25719xdaa2a3bb(2, 0, c25738xead39d26);
    }

    /* renamed from: equals */
    public boolean m97024xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2953x3164ae.C25719xdaa2a3bb)) {
            return false;
        }
        com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2953x3164ae.C25719xdaa2a3bb c25719xdaa2a3bb = (com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2953x3164ae.C25719xdaa2a3bb) obj;
        return this.f47718x368f3a == c25719xdaa2a3bb.f47718x368f3a && this.f47712x5fb28d2 == c25719xdaa2a3bb.f47712x5fb28d2;
    }

    /* renamed from: finished */
    public boolean m97025xd7d8c072() {
        return this.f47716xc781e905 == com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25661xf379654e.AssetReaderStatusWriteFinish;
    }

    /* renamed from: getExportCostTimeMs */
    public long m97026x5683f1ca() {
        return this.f47710xda73f8ba - this.f47711x76ab3801;
    }

    /* renamed from: getIndex */
    public int m97027x7498cf1c() {
        return this.f47712x5fb28d2;
    }

    /* renamed from: getProgress */
    public float m97028x402effa3() {
        return this.f47713xc454c22d;
    }

    /* renamed from: getRetryCount */
    public int m97029xa8e25f3d() {
        return this.f47715xbaa1a747;
    }

    /* renamed from: getSegmentStatus */
    public com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25661xf379654e m97030x84e1a54f() {
        return this.f47716xc781e905;
    }

    /* renamed from: retry */
    public void m97031x67622a8() {
        this.f47715xbaa1a747++;
        this.f47716xc781e905 = com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25661xf379654e.AssetParallelStatusUnknown;
    }

    /* renamed from: setCurrentTime */
    public void m97032x9411da24(long j17) {
        this.f47713xc454c22d = (((float) j17) * 1.0f) / ((float) this.f47717x16fae70.m97257x37a7fb48());
    }

    /* renamed from: setProgress */
    public void m97033x3ae760af(float f17) {
        this.f47713xc454c22d = f17;
    }

    /* renamed from: setSegmentStatus */
    public void m97034x17b80bc3(com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25661xf379654e enumC25661xf379654e) {
        this.f47716xc781e905 = enumC25661xf379654e;
        if (enumC25661xf379654e == com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25661xf379654e.AssetParallelStatusStarted) {
            this.f47711x76ab3801 = java.lang.System.currentTimeMillis();
        } else if (enumC25661xf379654e == com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25661xf379654e.AssetReaderStatusWriteFinish || enumC25661xf379654e == com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25661xf379654e.AssetParallelStatusFailed || enumC25661xf379654e == com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25661xf379654e.AssetExportStatusCompleted || enumC25661xf379654e == com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25661xf379654e.AssetParallelStatusCancelled) {
            this.f47710xda73f8ba = java.lang.System.currentTimeMillis();
        }
    }

    /* renamed from: setTimeRange */
    public void m97035x5d30e02e(com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26) {
        this.f47717x16fae70 = c25738xead39d26;
    }

    /* renamed from: toString */
    public java.lang.String m97036x9616526c() {
        return java.lang.String.format(java.util.Locale.ENGLISH, "index:%d type:%d status:%s timeRange:%s", java.lang.Integer.valueOf(this.f47712x5fb28d2), java.lang.Integer.valueOf(this.f47718x368f3a), this.f47716xc781e905, this.f47717x16fae70);
    }

    /* renamed from: unKnown */
    public boolean m97037xed42bc2a() {
        return this.f47716xc781e905 == com.p314xaae8f345.tav.p2947x2eaf9f.EnumC25661xf379654e.AssetParallelStatusUnknown;
    }
}
