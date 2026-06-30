package cf;

/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Runnable f122353a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f122354b;

    public d(java.lang.Runnable runnable, int i17) {
        this.f122353a = runnable;
        if (!(i17 > 0)) {
            throw new java.lang.IllegalArgumentException("count <= 0".toString());
        }
        this.f122354b = new java.util.concurrent.atomic.AtomicInteger(i17);
    }

    public final void a() {
        java.lang.Runnable runnable;
        if (this.f122354b.decrementAndGet() != 0 || (runnable = this.f122353a) == null) {
            return;
        }
        runnable.run();
    }
}
