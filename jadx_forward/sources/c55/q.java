package c55;

/* loaded from: classes12.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f120289d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c55.u f120290e;

    public q(c55.u uVar, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f120290e = uVar;
        this.f120289d = countDownLatch;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.concurrent.CountDownLatch countDownLatch = this.f120289d;
        if (countDownLatch.getCount() > 0) {
            try {
                countDownLatch.await(20000L, java.util.concurrent.TimeUnit.MILLISECONDS);
            } catch (java.lang.Throwable unused) {
            }
        }
        this.f120290e.f120299d.f273730g.post(new c55.p(this));
    }
}
