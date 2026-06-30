package uh1;

/* loaded from: classes15.dex */
public class k1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uh1.n1 f509352d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uh1.l1 f509353e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ uh1.o1 f509354f;

    public k1(uh1.o1 o1Var, uh1.n1 n1Var, uh1.l1 l1Var) {
        this.f509354f = o1Var;
        this.f509352d = n1Var;
        this.f509353e = l1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("start reslove ");
        uh1.n1 n1Var = this.f509352d;
        sb6.append(n1Var.f509376b);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LocalServiceMgr", sb6.toString());
        java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        android.net.nsd.NsdServiceInfo nsdServiceInfo = new android.net.nsd.NsdServiceInfo();
        java.lang.String str = n1Var.f509376b;
        nsdServiceInfo.setServiceName(str);
        nsdServiceInfo.setServiceType(n1Var.f509377c);
        this.f509354f.getClass();
        ((android.net.nsd.NsdManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("servicediscovery")).resolveService(nsdServiceInfo, new uh1.j1(this, countDownLatch));
        try {
            countDownLatch.await(1000L, java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.lang.InterruptedException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("LocalServiceMgr", e17, "", new java.lang.Object[0]);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LocalServiceMgr", "finish reslove " + str + " trhead id=" + java.lang.Thread.currentThread().getId());
    }
}
