package au5;

/* loaded from: classes15.dex */
public class e implements android.content.ServiceConnection {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ au5.j f14150d;

    public e(au5.j jVar) {
        this.f14150d = jVar;
    }

    @Override // android.content.ServiceConnection
    public void onBindingDied(android.content.ComponentName componentName) {
        zt5.h.c("Soter.SoterCoreTreble", "soter: binding died", new java.lang.Object[0]);
        au5.j.f14155m = 0;
        au5.j.f14154l = null;
        au5.j jVar = this.f14150d;
        if (au5.j.y(jVar.f14163d) > 30) {
            zt5.h.c("Soter.SoterCoreTreble", "soter: rest fib, now is delay %dS", java.lang.Long.valueOf(au5.j.y(jVar.f14163d)));
            jVar.f14163d = 3;
            jVar.f14166g.removeCallbacks(jVar.f14170k);
        }
        jVar.A();
        au5.j.u(jVar);
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        zt5.h.c("Soter.SoterCoreTreble", "soter: onServiceConnected", new java.lang.Object[0]);
        synchronized (au5.j.f14158p) {
            au5.j.f14155m = 2;
        }
        au5.j jVar = this.f14150d;
        jVar.f14163d = 3;
        jVar.f14166g.removeCallbacks(jVar.f14170k);
        try {
            iBinder.linkToDeath(this.f14150d.f14168i, 0);
            int i17 = bu5.b.f24632d;
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.tencent.soter.soterserver.ISoterService");
            au5.j.f14154l = (queryLocalInterface == null || !(queryLocalInterface instanceof bu5.c)) ? new bu5.a(iBinder) : (bu5.c) queryLocalInterface;
        } catch (android.os.RemoteException e17) {
            zt5.h.b("Soter.SoterCoreTreble", "soter: Binding deathRecipient is error - RemoteException" + e17.toString(), new java.lang.Object[0]);
            zt5.i.b(101, "SoterService interface: ISoterService.Stub.asInterface.", e17);
        }
        au5.k kVar = this.f14150d.f14167h;
        if (kVar != null) {
            se4.e eVar = (se4.e) kVar;
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1104L, 6L, 1L, false);
            if (!cu5.b.c()) {
                com.tencent.mm.sdk.platformtools.u3.i(new se4.d(eVar), 5000L);
            }
        }
        zt5.h.c("Soter.SoterCoreTreble", "soter: Binding is done - Service connected", new java.lang.Object[0]);
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - this.f14150d.f14164e;
        if (elapsedRealtime > 3000) {
            zt5.i.a(105, "bind SoterService out time: " + elapsedRealtime);
        }
        java.util.concurrent.CountDownLatch countDownLatch = au5.j.f14159q.f14171a;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName componentName) {
        synchronized (au5.j.f14158p) {
            zt5.h.c("Soter.SoterCoreTreble", "soter: unBinding is done - Service disconnected", new java.lang.Object[0]);
            au5.j.f14155m = 0;
            au5.j.f14154l = null;
            if (au5.j.y(this.f14150d.f14163d) > 30) {
                zt5.h.c("Soter.SoterCoreTreble", "soter: rest fib, now is delay %dS", java.lang.Long.valueOf(au5.j.y(this.f14150d.f14163d)));
                au5.j jVar = this.f14150d;
                jVar.f14163d = 3;
                jVar.f14166g.removeCallbacks(jVar.f14170k);
            }
            if (this.f14150d.f14167h != null) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1104L, 7L, 1L, false);
            }
            au5.j.u(this.f14150d);
            java.util.concurrent.CountDownLatch countDownLatch = au5.j.f14159q.f14171a;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
        }
    }
}
