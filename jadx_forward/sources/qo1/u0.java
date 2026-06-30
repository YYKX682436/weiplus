package qo1;

/* loaded from: classes5.dex */
public final class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qo1.v0 f447085d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f447086e;

    public u0(qo1.v0 v0Var, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f447085d = v0Var;
        this.f447086e = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jz5.f0 f0Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("do stop now, pkgId=");
        qo1.v0 v0Var = this.f447085d;
        sb6.append(v0Var.f447016i);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamBackupTask", sb6.toString());
        v0Var.f447026s = false;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.a2 a2Var = v0Var.f447012e;
        java.util.concurrent.CountDownLatch countDownLatch = this.f447086e;
        if (a2Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamBackupTask", "stop roam task now, pkgId=" + v0Var.f447016i);
            a2Var.g(new qo1.t0(countDownLatch));
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            countDownLatch.countDown();
        }
    }
}
