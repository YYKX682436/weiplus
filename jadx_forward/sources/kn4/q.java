package kn4;

/* loaded from: classes12.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f391276a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f391277b = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.j();

    /* renamed from: c, reason: collision with root package name */
    public static final long f391278c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.Map f391279d;

    static {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MINUTES;
        f391278c = timeUnit.toMillis(5L);
        f391279d = new java.util.concurrent.ConcurrentHashMap();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().B("FileTransportStats_accumulateSize", 0L);
        }
        ((ku5.t0) ku5.t0.f394148d).d(new kn4.RunnableC29037x33e9d0(), timeUnit.toMillis(3L), timeUnit.toMillis(3L));
    }
}
