package org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3;

/* renamed from: org.chromium.base.metrics.TimingMetric */
/* loaded from: classes13.dex */
public class C29415xdffc46ba implements java.lang.AutoCloseable {

    /* renamed from: mMetricName */
    private final java.lang.String f73546xb7ca84a8;

    /* renamed from: mStartTime */
    private long f73547xfbccd462;

    /* renamed from: mTimerType */
    private final int f73548x7de42a32;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* renamed from: org.chromium.base.metrics.TimingMetric$TimerType */
    /* loaded from: classes6.dex */
    public @interface TimerType {

        /* renamed from: MEDIUM_UPTIME */
        public static final int f73549xb6792bf2 = 1;

        /* renamed from: SHORT_THREAD_TIME */
        public static final int f73550xbef3f87f = 2;

        /* renamed from: SHORT_UPTIME */
        public static final int f73551x8c6da12b = 0;
    }

    private C29415xdffc46ba(java.lang.String str, int i17) {
        this.f73546xb7ca84a8 = str;
        this.f73548x7de42a32 = i17;
    }

    /* renamed from: mediumUptime */
    public static org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29415xdffc46ba m152951xd8fcebbd(java.lang.String str) {
        org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29415xdffc46ba c29415xdffc46ba = new org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29415xdffc46ba(str, 1);
        c29415xdffc46ba.f73547xfbccd462 = org.p3343x72743996.p3344x2e06d1.C29369x7914a5c4.m152677xccac944e();
        return c29415xdffc46ba;
    }

    /* renamed from: shortThreadTime */
    public static org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29415xdffc46ba m152952x9f67b593(java.lang.String str) {
        org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29415xdffc46ba c29415xdffc46ba = new org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29415xdffc46ba(str, 2);
        c29415xdffc46ba.f73547xfbccd462 = org.p3343x72743996.p3344x2e06d1.C29369x7914a5c4.m152673xf8b620b6();
        return c29415xdffc46ba;
    }

    /* renamed from: shortUptime */
    public static org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29415xdffc46ba m152953x3c43bf84(java.lang.String str) {
        org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29415xdffc46ba c29415xdffc46ba = new org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29415xdffc46ba(str, 0);
        c29415xdffc46ba.f73547xfbccd462 = org.p3343x72743996.p3344x2e06d1.C29369x7914a5c4.m152677xccac944e();
        return c29415xdffc46ba;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        java.lang.String str = this.f73546xb7ca84a8;
        long j17 = this.f73547xfbccd462;
        if (j17 == 0) {
            return;
        }
        this.f73547xfbccd462 = 0L;
        int i17 = this.f73548x7de42a32;
        if (i17 == 0) {
            org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29410x1048b7f3.m152943x65abbf6f(str, org.p3343x72743996.p3344x2e06d1.C29369x7914a5c4.m152677xccac944e() - j17);
        } else if (i17 == 1) {
            org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29410x1048b7f3.m152938x688e184(str, org.p3343x72743996.p3344x2e06d1.C29369x7914a5c4.m152677xccac944e() - j17);
        } else {
            if (i17 != 2) {
                return;
            }
            org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29410x1048b7f3.m152943x65abbf6f(str, org.p3343x72743996.p3344x2e06d1.C29369x7914a5c4.m152673xf8b620b6() - j17);
        }
    }
}
