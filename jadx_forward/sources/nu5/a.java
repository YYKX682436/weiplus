package nu5;

/* loaded from: classes12.dex */
public abstract class a {
    public static wu5.l a(java.lang.Runnable runnable, long j17, java.lang.String str) {
        return (str == null || str.isEmpty()) ? new wu5.l(runnable, d(j17, java.util.concurrent.TimeUnit.MILLISECONDS), c(runnable)) : new xu5.v(runnable, d(j17, java.util.concurrent.TimeUnit.MILLISECONDS), str, c(runnable));
    }

    public static wu5.l b(java.util.concurrent.Callable callable, long j17, java.lang.String str) {
        return (str == null || str.isEmpty()) ? new wu5.l(callable, d(j17, java.util.concurrent.TimeUnit.MILLISECONDS), c(callable)) : new xu5.v(callable, d(j17, java.util.concurrent.TimeUnit.MILLISECONDS), str, c(callable));
    }

    public static boolean c(java.lang.Object obj) {
        if (obj instanceof wu5.f) {
            return ((wu5.f) obj).a();
        }
        return true;
    }

    public static long d(long j17, java.util.concurrent.TimeUnit timeUnit) {
        if (timeUnit == null) {
            return java.lang.System.nanoTime();
        }
        if (j17 < 0) {
            j17 = 0;
        }
        long nanos = timeUnit.toNanos(j17);
        long nanoTime = java.lang.System.nanoTime();
        if (nanos >= 4611686018427387903L) {
            nanos = 4611686018427387903L;
        }
        return nanoTime + nanos;
    }
}
