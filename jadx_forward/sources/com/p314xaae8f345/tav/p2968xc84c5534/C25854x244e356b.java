package com.p314xaae8f345.tav.p2968xc84c5534;

/* renamed from: com.tencent.tav.report.AverageTimeReporter */
/* loaded from: classes16.dex */
public class C25854x244e356b {

    /* renamed from: total */
    private long f48778x696db44 = 0;

    /* renamed from: count */
    private long f48777x5a7510f = 0;

    public void add(long j17) {
        this.f48778x696db44 += j17;
        this.f48777x5a7510f++;
    }

    /* renamed from: average */
    public long m98298xda5cde1d() {
        long j17 = this.f48777x5a7510f;
        if (j17 == 0) {
            return 0L;
        }
        return this.f48778x696db44 / j17;
    }

    /* renamed from: averageDouble */
    public double m98299xc52f7c4e() {
        long j17 = this.f48777x5a7510f;
        if (j17 == 0) {
            return 0.0d;
        }
        return this.f48778x696db44 / j17;
    }

    /* renamed from: getCount */
    public long m98300x7444f759() {
        return this.f48777x5a7510f;
    }

    /* renamed from: getTotal */
    public long m98301x7534818e() {
        return this.f48778x696db44;
    }

    /* renamed from: reset */
    public void m98302x6761d4f() {
        this.f48778x696db44 = 0L;
        this.f48777x5a7510f = 0L;
    }

    /* renamed from: toString */
    public java.lang.String m98303x9616526c() {
        return "AverageTimeReporter{total=" + this.f48778x696db44 + ", count=" + this.f48777x5a7510f + ", average=" + m98299xc52f7c4e() + '}';
    }

    public void add(com.p314xaae8f345.tav.p2968xc84c5534.C25854x244e356b c25854x244e356b) {
        if (c25854x244e356b != null) {
            this.f48778x696db44 += c25854x244e356b.m98301x7534818e();
            this.f48777x5a7510f += c25854x244e356b.m98300x7444f759();
        }
    }
}
