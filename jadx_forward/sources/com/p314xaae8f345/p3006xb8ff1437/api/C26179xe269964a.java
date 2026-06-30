package com.p314xaae8f345.p3006xb8ff1437.api;

/* renamed from: com.tencent.thumbplayer.api.TPJitterBufferConfig */
/* loaded from: classes16.dex */
public class C26179xe269964a {

    /* renamed from: mAdjustIntervalThresholdMs */
    private long f50579x98d0b970;

    /* renamed from: mFrozenThresholdMs */
    private long f50580xcbc4b7c4;

    /* renamed from: mMaxIncreaseDurationMs */
    private long f50581xa23e4853;

    /* renamed from: mMinDecreaseDurationMs */
    private long f50582x29d2f11d;

    /* renamed from: mPerDecreaseDurationMs */
    private long f50583xe7bfff28;

    /* renamed from: mPerIncreaseDurationMs */
    private long f50584x949237cc;

    /* renamed from: com.tencent.thumbplayer.api.TPJitterBufferConfig$Builder */
    /* loaded from: classes16.dex */
    public static final class Builder {

        /* renamed from: DEFAULT_ADJUST_INTERVAL_THRESHOLD_MS */
        public static final long f50585x592de002 = 60000;

        /* renamed from: DEFAULT_FROZEN_THRESHOLD_MS */
        public static final long f50586x2bf0ce3b = 800;

        /* renamed from: DEFAULT_MAX_DECREASE_DURATION_MS */
        public static final long f50587x4b107e89 = 8000;

        /* renamed from: DEFAULT_MIN_DECREASE_DURATION_MS */
        public static final long f50588x5b63fe5b = 2000;

        /* renamed from: DEFAULT_PER_DECREASE_DURATION_MS */
        public static final long f50589x40b93070 = 500;

        /* renamed from: DEFAULT_PER_INCREASE_DURATION_MS */
        public static final long f50590x1dfd014 = 1000;

        /* renamed from: mMinDecreaseDurationMs */
        private long f50594x29d2f11d = 2000;

        /* renamed from: mMaxIncreaseDurationMs */
        private long f50593xa23e4853 = 8000;

        /* renamed from: mPerIncreaseDurationMs */
        private long f50596x949237cc = 1000;

        /* renamed from: mPerDecreaseDurationMs */
        private long f50595xe7bfff28 = 500;

        /* renamed from: mAdjustIntervalThresholdMs */
        private long f50591x98d0b970 = 60000;

        /* renamed from: mFrozenThresholdMs */
        private long f50592xcbc4b7c4 = 800;

        /* renamed from: build */
        public com.p314xaae8f345.p3006xb8ff1437.api.C26179xe269964a m101051x59bc66e() {
            return new com.p314xaae8f345.p3006xb8ff1437.api.C26179xe269964a(this.f50594x29d2f11d, this.f50593xa23e4853, this.f50596x949237cc, this.f50595xe7bfff28, this.f50591x98d0b970, this.f50592xcbc4b7c4);
        }

        /* renamed from: setAdjustIntervalThresholdMs */
        public com.p314xaae8f345.p3006xb8ff1437.api.C26179xe269964a.Builder m101052x70a3eb1b(long j17) {
            this.f50591x98d0b970 = j17;
            return this;
        }

        /* renamed from: setFrozenThresholdMs */
        public com.p314xaae8f345.p3006xb8ff1437.api.C26179xe269964a.Builder m101053x5dadc46f(long j17) {
            this.f50592xcbc4b7c4 = j17;
            return this;
        }

        /* renamed from: setMaxIncreaseDurationMs */
        public com.p314xaae8f345.p3006xb8ff1437.api.C26179xe269964a.Builder m101054xca2b077e(long j17) {
            this.f50593xa23e4853 = j17;
            return this;
        }

        /* renamed from: setMinDecreaseDurationMs */
        public com.p314xaae8f345.p3006xb8ff1437.api.C26179xe269964a.Builder m101055x51bfb048(long j17) {
            this.f50594x29d2f11d = j17;
            return this;
        }

        /* renamed from: setPerDecreaseDurationMs */
        public com.p314xaae8f345.p3006xb8ff1437.api.C26179xe269964a.Builder m101056xfacbe53(long j17) {
            this.f50595xe7bfff28 = j17;
            return this;
        }

        /* renamed from: setPerIncreaseDurationMs */
        public com.p314xaae8f345.p3006xb8ff1437.api.C26179xe269964a.Builder m101057xbc7ef6f7(long j17) {
            this.f50596x949237cc = j17;
            return this;
        }
    }

    public C26179xe269964a(long j17, long j18, long j19, long j27, long j28, long j29) {
        this.f50582x29d2f11d = j17;
        this.f50581xa23e4853 = j18;
        this.f50584x949237cc = j19;
        this.f50583xe7bfff28 = j27;
        this.f50579x98d0b970 = j28;
        this.f50580xcbc4b7c4 = j29;
    }

    /* renamed from: getAdjustIntervalThresholdMs */
    public long m101045x26d792a7() {
        return this.f50579x98d0b970;
    }

    /* renamed from: getFrozenThresholdMs */
    public long m101046x8217b7fb() {
        return this.f50580xcbc4b7c4;
    }

    /* renamed from: getMaxIncreaseDurationMs */
    public long m101047xfa18550a() {
        return this.f50581xa23e4853;
    }

    /* renamed from: getMinDecreaseDurationMs */
    public long m101048x81acfdd4() {
        return this.f50582x29d2f11d;
    }

    /* renamed from: getPerDecreaseDurationMs */
    public long m101049x3f9a0bdf() {
        return this.f50583xe7bfff28;
    }

    /* renamed from: getPerIncreaseDurationMs */
    public long m101050xec6c4483() {
        return this.f50584x949237cc;
    }
}
