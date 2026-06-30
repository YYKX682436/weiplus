package yn1;

/* loaded from: classes11.dex */
public final class r0 extends com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.h {
    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.h
    /* renamed from: onEnterForeground */
    public void mo8896x832bee5c() {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3155xcd3633ce.f.f298923b.a(true);
        android.content.Intent intent = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1256xcd3633ce.ServiceC12841x401e91e4.f174079d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MigrationForegroundService", "removeNotification");
        pm0.v.X(yn1.e0.f545178d);
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.h
    /* renamed from: onExitForeground */
    public void mo8897xa55158c0() {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3155xcd3633ce.f.f298923b.a(false);
        yn1.z0 z0Var = yn1.z0.f545466a;
        if (z0Var.i() == bw5.bj0.NOTIFY_CODE_START || z0Var.i() == bw5.bj0.NOTIFY_CODE_IMPORTING) {
            android.content.Intent intent = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1256xcd3633ce.ServiceC12841x401e91e4.f174079d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MigrationForegroundService", "showNotification");
            pm0.v.X(yn1.f0.f545195d);
        }
    }
}
