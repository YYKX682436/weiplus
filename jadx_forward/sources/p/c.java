package p;

/* loaded from: classes12.dex */
public class c implements java.util.concurrent.ThreadFactory {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f431869d = new java.util.concurrent.atomic.AtomicInteger(0);

    public c(p.d dVar) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public java.lang.Thread newThread(java.lang.Runnable runnable) {
        java.lang.Thread thread = new java.lang.Thread(runnable);
        thread.setName(java.lang.String.format("arch_disk_io_%d", java.lang.Integer.valueOf(this.f431869d.getAndIncrement())));
        return thread;
    }
}
