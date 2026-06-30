package dr0;

/* loaded from: classes5.dex */
public final class q2 implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f324035d;

    public q2(java.util.concurrent.CountDownLatch countDownLatch) {
        this.f324035d = countDownLatch;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.proc.Recycler", "disconnect done, proc=" + com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274587b);
        this.f324035d.countDown();
    }
}
