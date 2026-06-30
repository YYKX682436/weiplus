package cf;

/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Runnable f40820a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f40821b;

    public d(java.lang.Runnable runnable, int i17) {
        this.f40820a = runnable;
        if (!(i17 > 0)) {
            throw new java.lang.IllegalArgumentException("count <= 0".toString());
        }
        this.f40821b = new java.util.concurrent.atomic.AtomicInteger(i17);
    }

    public final void a() {
        java.lang.Runnable runnable;
        if (this.f40821b.decrementAndGet() != 0 || (runnable = this.f40820a) == null) {
            return;
        }
        runnable.run();
    }
}
