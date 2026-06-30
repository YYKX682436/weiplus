package qa3;

/* loaded from: classes15.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final qa3.l f442582d = new qa3.l();

    public l() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        while (true) {
            qa3.a aVar = (qa3.a) qa3.o.f442586c.take();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppTestService", "consumer " + aVar);
            java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
            aVar.a(countDownLatch);
            countDownLatch.await();
        }
    }
}
