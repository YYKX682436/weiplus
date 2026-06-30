package com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3033x5c7f9c9c;

/* renamed from: com.tencent.thumbplayer.core.demuxer.TPNativeJitterBufferConfig */
/* loaded from: classes16.dex */
public class C26351x73e345c1 {

    /* renamed from: mAdjustIntervalThresholdMs */
    private long f52616x98d0b970;

    /* renamed from: mFrozenThresholdMs */
    private long f52617xcbc4b7c4;

    /* renamed from: mMaxIncreaseDurationMs */
    private long f52618xa23e4853;

    /* renamed from: mMinDecreaseDurationMs */
    private long f52619x29d2f11d;

    /* renamed from: mPerDecreaseDurationMs */
    private long f52620xe7bfff28;

    /* renamed from: mPerIncreaseDurationMs */
    private long f52621x949237cc;

    /* renamed from: com.tencent.thumbplayer.core.demuxer.TPNativeJitterBufferConfig$Builder */
    /* loaded from: classes16.dex */
    public static final class Builder {

        /* renamed from: DEFAULT_ADJUST_INTERVAL_THRESHOLD_MS */
        public static final long f52622x592de002 = 60000;

        /* renamed from: DEFAULT_FROZEN_THRESHOLD_MS */
        public static final long f52623x2bf0ce3b = 800;

        /* renamed from: DEFAULT_MAX_DECREASE_DURATION_MS */
        public static final long f52624x4b107e89 = 8000;

        /* renamed from: DEFAULT_MIN_DECREASE_DURATION_MS */
        public static final long f52625x5b63fe5b = 2000;

        /* renamed from: DEFAULT_PER_DECREASE_DURATION_MS */
        public static final long f52626x40b93070 = 500;

        /* renamed from: DEFAULT_PER_INCREASE_DURATION_MS */
        public static final long f52627x1dfd014 = 1000;

        /* renamed from: mMinDecreaseDurationMs */
        private long f52631x29d2f11d = 2000;

        /* renamed from: mMaxIncreaseDurationMs */
        private long f52630xa23e4853 = 8000;

        /* renamed from: mPerIncreaseDurationMs */
        private long f52633x949237cc = 1000;

        /* renamed from: mPerDecreaseDurationMs */
        private long f52632xe7bfff28 = 500;

        /* renamed from: mAdjustIntervalThresholdMs */
        private long f52628x98d0b970 = 60000;

        /* renamed from: mFrozenThresholdMs */
        private long f52629xcbc4b7c4 = 800;

        /* renamed from: build */
        public com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3033x5c7f9c9c.C26351x73e345c1 m102146x59bc66e() {
            return new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3033x5c7f9c9c.C26351x73e345c1(this.f52631x29d2f11d, this.f52630xa23e4853, this.f52633x949237cc, this.f52632xe7bfff28, this.f52628x98d0b970, this.f52629xcbc4b7c4);
        }

        /* renamed from: setAdjustIntervalThresholdMs */
        public com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3033x5c7f9c9c.C26351x73e345c1.Builder m102147x70a3eb1b(long j17) {
            this.f52628x98d0b970 = j17;
            return this;
        }

        /* renamed from: setFrozenThresholdMs */
        public com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3033x5c7f9c9c.C26351x73e345c1.Builder m102148x5dadc46f(long j17) {
            this.f52629xcbc4b7c4 = j17;
            return this;
        }

        /* renamed from: setMaxIncreaseDurationMs */
        public com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3033x5c7f9c9c.C26351x73e345c1.Builder m102149xca2b077e(long j17) {
            this.f52630xa23e4853 = j17;
            return this;
        }

        /* renamed from: setMinDecreaseDurationMs */
        public com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3033x5c7f9c9c.C26351x73e345c1.Builder m102150x51bfb048(long j17) {
            this.f52631x29d2f11d = j17;
            return this;
        }

        /* renamed from: setPerDecreaseDurationMs */
        public com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3033x5c7f9c9c.C26351x73e345c1.Builder m102151xfacbe53(long j17) {
            this.f52632xe7bfff28 = j17;
            return this;
        }

        /* renamed from: setPerIncreaseDurationMs */
        public com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3033x5c7f9c9c.C26351x73e345c1.Builder m102152xbc7ef6f7(long j17) {
            this.f52633x949237cc = j17;
            return this;
        }
    }

    public C26351x73e345c1(long j17, long j18, long j19, long j27, long j28, long j29) {
        this.f52619x29d2f11d = j17;
        this.f52618xa23e4853 = j18;
        this.f52621x949237cc = j19;
        this.f52620xe7bfff28 = j27;
        this.f52616x98d0b970 = j28;
        this.f52617xcbc4b7c4 = j29;
    }
}
