package c55;

/* loaded from: classes12.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f38758d;

    public r(c55.u uVar, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f38758d = countDownLatch;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f38758d.countDown();
    }
}
