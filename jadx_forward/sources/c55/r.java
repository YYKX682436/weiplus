package c55;

/* loaded from: classes12.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f120291d;

    public r(c55.u uVar, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f120291d = countDownLatch;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f120291d.countDown();
    }
}
