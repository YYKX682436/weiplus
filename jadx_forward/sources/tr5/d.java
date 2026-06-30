package tr5;

/* loaded from: classes13.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final tr5.e f502989d;

    public d(tr5.e eVar, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f502989d = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f502989d.run();
        } catch (java.lang.Exception e17) {
            or5.b.b("exception: %s", e17);
        }
    }
}
