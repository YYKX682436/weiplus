package l85;

/* loaded from: classes12.dex */
public abstract class l1 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f398724a = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f398725b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Runnable f398726c = new l85.k1();

    public static void a(long j17, long j18, boolean z17) {
        if (z17) {
            jx3.f.INSTANCE.mo68477x336bdfd8(963L, j17, j18, true);
            return;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f398725b;
        java.util.concurrent.atomic.AtomicLong atomicLong = (java.util.concurrent.atomic.AtomicLong) concurrentHashMap.get(java.lang.Long.valueOf(j17));
        if (atomicLong == null) {
            concurrentHashMap.putIfAbsent(java.lang.Long.valueOf(j17), new java.util.concurrent.atomic.AtomicLong(0L));
            atomicLong = (java.util.concurrent.atomic.AtomicLong) concurrentHashMap.get(java.lang.Long.valueOf(j17));
        }
        atomicLong.addAndGet(j18);
        if (f398724a.compareAndSet(false, true)) {
            ((ku5.t0) ku5.t0.f394148d).k(f398726c, 1500L);
        }
    }
}
