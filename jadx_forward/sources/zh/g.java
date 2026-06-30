package zh;

/* loaded from: classes7.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicInteger f554380d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f554381e;

    public g(java.util.concurrent.atomic.AtomicInteger atomicInteger, java.util.concurrent.atomic.AtomicBoolean atomicBoolean, java.lang.String str) {
        this.f554380d = atomicInteger;
        this.f554381e = atomicBoolean;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f554380d.set(android.os.Process.myTid());
        while (!this.f554381e.get()) {
            try {
                java.lang.Thread.sleep(100L);
            } catch (java.lang.InterruptedException unused) {
            }
        }
    }
}
