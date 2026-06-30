package v25;

/* loaded from: classes11.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public java.util.concurrent.CountDownLatch f514504a = null;

    public void a() {
        java.util.concurrent.CountDownLatch countDownLatch = this.f514504a;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            this.f514504a = null;
        }
    }

    public void b(long j17, java.lang.Runnable runnable) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SyncJob", "doAsSyncJob");
        if (this.f514504a == null) {
            this.f514504a = new java.util.concurrent.CountDownLatch(1);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(runnable);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SyncJob", "doAsSyncJob postToMainThread");
        java.util.concurrent.CountDownLatch countDownLatch = this.f514504a;
        if (countDownLatch != null) {
            try {
                countDownLatch.await(j17, java.util.concurrent.TimeUnit.MILLISECONDS);
            } catch (java.lang.InterruptedException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SyncJob", e17.getMessage());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SyncJob", e17, "", new java.lang.Object[0]);
            }
        }
    }
}
