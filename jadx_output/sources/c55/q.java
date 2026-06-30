package c55;

/* loaded from: classes12.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f38756d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c55.u f38757e;

    public q(c55.u uVar, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f38757e = uVar;
        this.f38756d = countDownLatch;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.concurrent.CountDownLatch countDownLatch = this.f38756d;
        if (countDownLatch.getCount() > 0) {
            try {
                countDownLatch.await(20000L, java.util.concurrent.TimeUnit.MILLISECONDS);
            } catch (java.lang.Throwable unused) {
            }
        }
        this.f38757e.f38766d.f192197g.post(new c55.p(this));
    }
}
