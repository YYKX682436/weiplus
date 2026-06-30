package p3325xe03a0797.p3326xc267989b;

/* loaded from: classes12.dex */
public abstract class w3 {
    public static final p3325xe03a0797.p3326xc267989b.f2 a(final int i17, final java.lang.String str) {
        if (i17 >= 1) {
            final java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger();
            return new p3325xe03a0797.p3326xc267989b.g2(java.util.concurrent.Executors.newScheduledThreadPool(i17, new java.util.concurrent.ThreadFactory() { // from class: kotlinx.coroutines.w3$$a
                @Override // java.util.concurrent.ThreadFactory
                public final java.lang.Thread newThread(java.lang.Runnable runnable) {
                    int i18 = i17;
                    java.lang.String str2 = str;
                    if (i18 != 1) {
                        str2 = str2 + '-' + atomicInteger.incrementAndGet();
                    }
                    java.lang.Thread thread = new java.lang.Thread(runnable, str2);
                    thread.setDaemon(true);
                    return thread;
                }
            }));
        }
        throw new java.lang.IllegalArgumentException(("Expected at least one thread, but " + i17 + " specified").toString());
    }
}
