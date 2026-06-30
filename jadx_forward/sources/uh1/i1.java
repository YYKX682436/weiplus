package uh1;

/* loaded from: classes15.dex */
public class i1 implements android.net.nsd.NsdManager.DiscoveryListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uh1.m1 f509335a;

    public i1(uh1.o1 o1Var, uh1.m1 m1Var) {
        this.f509335a = m1Var;
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public void onDiscoveryStarted(java.lang.String str) {
        yc1.y yVar = (yc1.y) this.f509335a;
        yVar.f542352a.a(yVar.f542353b.get(), yVar.f542355d.o("ok"));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOperateLocalServicesScan", "onDiscoveryStarted");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LocalServiceMgr", "onDiscoveryStarted " + str);
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public void onDiscoveryStopped(java.lang.String str) {
        yc1.y yVar = (yc1.y) this.f509335a;
        yVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOperateLocalServicesScan", "onDiscoveryStopped");
        int i17 = yVar.f542354c.get();
        java.lang.String o17 = yVar.f542355d.o("ok");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = yVar.f542352a;
        lVar.a(i17, o17);
        synchronized (yc1.a.class) {
            yc1.a.u(lVar, null, "stopScan", 0);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LocalServiceMgr", "onDiscoveryStopped " + str);
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public void onServiceFound(android.net.nsd.NsdServiceInfo nsdServiceInfo) {
        uh1.n1 n1Var = new uh1.n1(nsdServiceInfo);
        yc1.y yVar = (yc1.y) this.f509335a;
        yVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOperateLocalServicesScan", "onServiceFound");
        uh1.o1 o1Var = uh1.o1.INSTANCE;
        yc1.x xVar = new yc1.x(yVar);
        o1Var.getClass();
        ((ku5.t0) ku5.t0.f394148d).h(new uh1.k1(o1Var, n1Var, xVar), "LocalServiceMgr#resolveService");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LocalServiceMgr", "onServicesFound " + nsdServiceInfo.getServiceType());
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public void onServiceLost(android.net.nsd.NsdServiceInfo nsdServiceInfo) {
        uh1.n1 n1Var = new uh1.n1(nsdServiceInfo);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = ((yc1.y) this.f509335a).f542352a;
        synchronized (yc1.a.class) {
            yc1.a.u(lVar, n1Var, "lost", 0);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LocalServiceMgr", "onServiceLost " + nsdServiceInfo.getServiceType());
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public void onStartDiscoveryFailed(java.lang.String str, int i17) {
        yc1.y yVar = (yc1.y) this.f509335a;
        yVar.f542352a.a(yVar.f542353b.get(), yVar.f542355d.o("fail"));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOperateLocalServicesScan", "onStartDiscoveryFailed");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LocalServiceMgr", "onStartDiscoveryFailed " + str);
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public void onStopDiscoveryFailed(java.lang.String str, int i17) {
        yc1.y yVar = (yc1.y) this.f509335a;
        yVar.f542352a.a(yVar.f542354c.get(), yVar.f542355d.o("fail"));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOperateLocalServicesScan", "onStopDiscoveryFailed");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LocalServiceMgr", "onStopDiscoveryFailed " + str);
    }
}
