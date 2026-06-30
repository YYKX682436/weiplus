package u56;

/* loaded from: classes14.dex */
public final class n extends java.util.concurrent.atomic.AtomicLong implements java.util.concurrent.ThreadFactory {

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.ThreadFactory f506369e = new u56.m();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f506370d;

    public n(java.lang.String str) {
        this.f506370d = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public java.lang.Thread newThread(java.lang.Runnable runnable) {
        java.lang.Thread thread = new java.lang.Thread(runnable, this.f506370d + incrementAndGet());
        thread.setDaemon(true);
        return thread;
    }
}
