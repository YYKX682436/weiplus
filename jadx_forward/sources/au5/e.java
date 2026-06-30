package au5;

/* loaded from: classes15.dex */
public class e implements android.content.ServiceConnection {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ au5.j f95683d;

    public e(au5.j jVar) {
        this.f95683d = jVar;
    }

    @Override // android.content.ServiceConnection
    public void onBindingDied(android.content.ComponentName componentName) {
        zt5.h.c("Soter.SoterCoreTreble", "soter: binding died", new java.lang.Object[0]);
        au5.j.f95688m = 0;
        au5.j.f95687l = null;
        au5.j jVar = this.f95683d;
        if (au5.j.y(jVar.f95696d) > 30) {
            zt5.h.c("Soter.SoterCoreTreble", "soter: rest fib, now is delay %dS", java.lang.Long.valueOf(au5.j.y(jVar.f95696d)));
            jVar.f95696d = 3;
            jVar.f95699g.removeCallbacks(jVar.f95703k);
        }
        jVar.A();
        au5.j.u(jVar);
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        zt5.h.c("Soter.SoterCoreTreble", "soter: onServiceConnected", new java.lang.Object[0]);
        synchronized (au5.j.f95691p) {
            au5.j.f95688m = 2;
        }
        au5.j jVar = this.f95683d;
        jVar.f95696d = 3;
        jVar.f95699g.removeCallbacks(jVar.f95703k);
        try {
            iBinder.linkToDeath(this.f95683d.f95701i, 0);
            int i17 = bu5.b.f106165d;
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.tencent.soter.soterserver.ISoterService");
            au5.j.f95687l = (queryLocalInterface == null || !(queryLocalInterface instanceof bu5.c)) ? new bu5.a(iBinder) : (bu5.c) queryLocalInterface;
        } catch (android.os.RemoteException e17) {
            zt5.h.b("Soter.SoterCoreTreble", "soter: Binding deathRecipient is error - RemoteException" + e17.toString(), new java.lang.Object[0]);
            zt5.i.b(101, "SoterService interface: ISoterService.Stub.asInterface.", e17);
        }
        au5.k kVar = this.f95683d.f95700h;
        if (kVar != null) {
            se4.e eVar = (se4.e) kVar;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1104L, 6L, 1L, false);
            if (!cu5.b.c()) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new se4.d(eVar), 5000L);
            }
        }
        zt5.h.c("Soter.SoterCoreTreble", "soter: Binding is done - Service connected", new java.lang.Object[0]);
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - this.f95683d.f95697e;
        if (elapsedRealtime > 3000) {
            zt5.i.a(105, "bind SoterService out time: " + elapsedRealtime);
        }
        java.util.concurrent.CountDownLatch countDownLatch = au5.j.f95692q.f95704a;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName componentName) {
        synchronized (au5.j.f95691p) {
            zt5.h.c("Soter.SoterCoreTreble", "soter: unBinding is done - Service disconnected", new java.lang.Object[0]);
            au5.j.f95688m = 0;
            au5.j.f95687l = null;
            if (au5.j.y(this.f95683d.f95696d) > 30) {
                zt5.h.c("Soter.SoterCoreTreble", "soter: rest fib, now is delay %dS", java.lang.Long.valueOf(au5.j.y(this.f95683d.f95696d)));
                au5.j jVar = this.f95683d;
                jVar.f95696d = 3;
                jVar.f95699g.removeCallbacks(jVar.f95703k);
            }
            if (this.f95683d.f95700h != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1104L, 7L, 1L, false);
            }
            au5.j.u(this.f95683d);
            java.util.concurrent.CountDownLatch countDownLatch = au5.j.f95692q.f95704a;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
        }
    }
}
