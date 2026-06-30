package uh1;

/* loaded from: classes15.dex */
public class j1 implements android.net.nsd.NsdManager.ResolveListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f509342a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ uh1.k1 f509343b;

    public j1(uh1.k1 k1Var, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f509343b = k1Var;
        this.f509342a = countDownLatch;
    }

    @Override // android.net.nsd.NsdManager.ResolveListener
    public void onResolveFailed(android.net.nsd.NsdServiceInfo nsdServiceInfo, int i17) {
        uh1.l1 l1Var = this.f509343b.f509353e;
        uh1.n1 n1Var = new uh1.n1(nsdServiceInfo);
        yc1.x xVar = (yc1.x) l1Var;
        xVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOperateLocalServicesScan", "onResolveFailed");
        yc1.a.u(xVar.f542351a.f542352a, n1Var, "resolveFail", i17);
        this.f509342a.countDown();
    }

    @Override // android.net.nsd.NsdManager.ResolveListener
    public void onServiceResolved(android.net.nsd.NsdServiceInfo nsdServiceInfo) {
        uh1.l1 l1Var = this.f509343b.f509353e;
        uh1.n1 n1Var = new uh1.n1(nsdServiceInfo);
        yc1.x xVar = (yc1.x) l1Var;
        xVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOperateLocalServicesScan", "onServiceResolved");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = xVar.f542351a.f542352a;
        synchronized (yc1.a.class) {
            yc1.a.u(lVar, n1Var, "found", 0);
        }
        this.f509342a.countDown();
    }
}
