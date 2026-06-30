package org.p3343x72743996.p3344x2e06d1;

/* renamed from: org.chromium.base.TimeUtils */
/* loaded from: classes13.dex */
public class C29369x7914a5c4 {

    /* renamed from: MILLISECONDS_PER_MINUTE */
    public static final long f73434xb96c0fe3 = 60000;

    /* renamed from: NANOSECONDS_PER_MICROSECOND */
    public static final long f73435x6ea744c2 = 1000;

    /* renamed from: NANOSECONDS_PER_MILLISECOND */
    public static final long f73436xf862bb0b = 1000000;

    /* renamed from: SECONDS_PER_DAY */
    public static final long f73437xb158535a = 86400;

    /* renamed from: SECONDS_PER_HOUR */
    public static final long f73438x79b41dc6 = 3600;

    /* renamed from: SECONDS_PER_MINUTE */
    public static final long f73439xe5545976 = 60;

    /* renamed from: sFakeClock */
    static org.p3343x72743996.p3344x2e06d1.C29369x7914a5c4.FakeClock f73440x707d5286;

    /* renamed from: org.chromium.base.TimeUtils$CurrentThreadTimeMillisTimer */
    /* loaded from: classes13.dex */
    public static class CurrentThreadTimeMillisTimer {

        /* renamed from: mStart */
        private final long f73441xbec80ff5 = org.p3343x72743996.p3344x2e06d1.C29369x7914a5c4.m152673xf8b620b6();

        /* renamed from: getElapsedMillis */
        public long m152678x2aaf872c() {
            return org.p3343x72743996.p3344x2e06d1.C29369x7914a5c4.m152673xf8b620b6() - this.f73441xbec80ff5;
        }
    }

    /* renamed from: org.chromium.base.TimeUtils$ElapsedRealtimeMillisTimer */
    /* loaded from: classes13.dex */
    public static class ElapsedRealtimeMillisTimer {

        /* renamed from: mStart */
        private final long f73442xbec80ff5 = org.p3343x72743996.p3344x2e06d1.C29369x7914a5c4.m152675x44870c2d();

        /* renamed from: getElapsedMillis */
        public long m152679x2aaf872c() {
            return org.p3343x72743996.p3344x2e06d1.C29369x7914a5c4.m152675x44870c2d() - this.f73442xbec80ff5;
        }
    }

    /* renamed from: org.chromium.base.TimeUtils$ElapsedRealtimeNanosTimer */
    /* loaded from: classes13.dex */
    public static class ElapsedRealtimeNanosTimer {

        /* renamed from: mStart */
        private final long f73443xbec80ff5 = org.p3343x72743996.p3344x2e06d1.C29369x7914a5c4.m152676xd8f61178();

        /* renamed from: getElapsedNanos */
        public long m152680xe062ba99() {
            return org.p3343x72743996.p3344x2e06d1.C29369x7914a5c4.m152676xd8f61178() - this.f73443xbec80ff5;
        }
    }

    /* renamed from: org.chromium.base.TimeUtils$FakeClock */
    /* loaded from: classes13.dex */
    public interface FakeClock {
        /* renamed from: currentThreadTimeMillis */
        long m152681xf8b620b6();

        /* renamed from: currentTimeMillis */
        long m152682x5cbba1cc();

        /* renamed from: elapsedRealtimeNanos */
        long m152683xd8f61178();

        /* renamed from: uptimeMillis */
        long m152684xccac944e();
    }

    /* renamed from: org.chromium.base.TimeUtils$UptimeMillisTimer */
    /* loaded from: classes13.dex */
    public static class UptimeMillisTimer {

        /* renamed from: mStart */
        private final long f73444xbec80ff5 = org.p3343x72743996.p3344x2e06d1.C29369x7914a5c4.m152677xccac944e();

        /* renamed from: getElapsedMillis */
        public long m152685x2aaf872c() {
            return org.p3343x72743996.p3344x2e06d1.C29369x7914a5c4.m152677xccac944e() - this.f73444xbec80ff5;
        }
    }

    private C29369x7914a5c4() {
    }

    /* renamed from: currentThreadTimeMillis */
    public static long m152673xf8b620b6() {
        org.p3343x72743996.p3344x2e06d1.C29369x7914a5c4.FakeClock fakeClock = f73440x707d5286;
        return fakeClock != null ? fakeClock.m152681xf8b620b6() : android.os.SystemClock.currentThreadTimeMillis();
    }

    /* renamed from: currentTimeMillis */
    public static long m152674x5cbba1cc() {
        org.p3343x72743996.p3344x2e06d1.C29369x7914a5c4.FakeClock fakeClock = f73440x707d5286;
        return fakeClock != null ? fakeClock.m152682x5cbba1cc() : java.lang.System.currentTimeMillis();
    }

    /* renamed from: elapsedRealtimeMillis */
    public static long m152675x44870c2d() {
        org.p3343x72743996.p3344x2e06d1.C29369x7914a5c4.FakeClock fakeClock = f73440x707d5286;
        return fakeClock != null ? fakeClock.m152683xd8f61178() / 1000000 : android.os.SystemClock.elapsedRealtime();
    }

    /* renamed from: elapsedRealtimeNanos */
    public static long m152676xd8f61178() {
        org.p3343x72743996.p3344x2e06d1.C29369x7914a5c4.FakeClock fakeClock = f73440x707d5286;
        return fakeClock != null ? fakeClock.m152683xd8f61178() : android.os.SystemClock.elapsedRealtimeNanos();
    }

    /* renamed from: uptimeMillis */
    public static long m152677xccac944e() {
        org.p3343x72743996.p3344x2e06d1.C29369x7914a5c4.FakeClock fakeClock = f73440x707d5286;
        return fakeClock != null ? fakeClock.m152684xccac944e() : android.os.SystemClock.uptimeMillis();
    }
}
