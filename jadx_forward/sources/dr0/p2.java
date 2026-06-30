package dr0;

/* loaded from: classes5.dex */
public final class p2 implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m3.d f324027d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f324028e;

    public p2(m3.d dVar, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f324027d = dVar;
        this.f324028e = countDownLatch;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.proc.Recycler", "disconnect done, proc=" + ((java.lang.String) this.f324027d.f404626b));
        this.f324028e.countDown();
    }
}
