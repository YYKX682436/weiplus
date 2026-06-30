package com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1905x633fb29.p1907x237a88eb;

/* renamed from: com.tencent.mm.plugin.music.model.notification.MMMusicPlayerService */
/* loaded from: classes11.dex */
public class ServiceC16625x51beb82f extends android.app.Service {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1905x633fb29.p1907x237a88eb.e f232165d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Runnable f232166e = new com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1905x633fb29.p1907x237a88eb.h(this);

    public void a(ql3.a aVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MMMusicPlayerService", "pause");
        if (aVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.MMMusicPlayerService", "music is null, return");
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(this.f232166e);
        com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1905x633fb29.p1907x237a88eb.e eVar = this.f232165d;
        if (!eVar.f232173a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.MMMusicNotification", "MMMusicNotification not init, pause err");
        } else {
            if (eVar.f232175c == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.MMMusicNotification", "mmMusicPlayerService is null, return");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MMMusicNotification", "pause");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(eVar.f232178f);
            eVar.f232176d.notify(291, eVar.a(eVar.f232175c, aVar, false));
        }
    }

    public void b(ql3.a aVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MMMusicPlayerService", com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27);
        if (aVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.MMMusicPlayerService", "music is null, return");
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(this.f232166e);
        com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1905x633fb29.p1907x237a88eb.e eVar = this.f232165d;
        if (!eVar.f232173a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.MMMusicNotification", "MMMusicNotification not init, play err");
            return;
        }
        if (eVar.f232175c == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.MMMusicNotification", "mmMusicPlayerService is null, return");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MMMusicNotification", com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(eVar.f232178f);
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1905x633fb29.p1907x237a88eb.ServiceC16625x51beb82f serviceC16625x51beb82f = eVar.f232175c;
            serviceC16625x51beb82f.startForeground(291, eVar.a(serviceC16625x51beb82f, aVar, true));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Music.MMMusicNotification", e17, "", new java.lang.Object[0]);
        }
    }

    public void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MMMusicPlayerService", "initNotification");
        kl3.i iVar = (kl3.i) sl3.b.b(kl3.i.class);
        if (iVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.MMMusicPlayerService", "initNotification logic music is null, return");
            return;
        }
        ql3.a z17 = ((kl3.z) iVar).z();
        if (z17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.MMMusicPlayerService", "initNotification music is null, return");
            return;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z17.f66988xe2cd983d)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.MMMusicPlayerService", "exoplayer play audio, ingore");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.l a17 = kl3.t.g().a();
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.MMMusicPlayerService", "musicPlayer is null, return");
        } else if (a17.i()) {
            b(z17);
        } else if (a17.h()) {
            a(z17);
        }
    }

    public void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MMMusicPlayerService", "stop");
        com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1905x633fb29.p1907x237a88eb.e eVar = this.f232165d;
        if (!eVar.f232173a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.MMMusicNotification", "MMMusicNotification not init, close err");
        } else if (eVar.f232175c == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.MMMusicNotification", "mmMusicPlayerService is null, return");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MMMusicNotification", "close");
            java.lang.Runnable runnable = eVar.f232178f;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(runnable);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(runnable, 1000L);
        }
        java.lang.Runnable runnable2 = this.f232166e;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(runnable2);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(runnable2, 60000L);
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1905x633fb29.p1907x237a88eb.i(this);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MMMusicPlayerService", "onCreate");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MMMusicPlayerService", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82);
        com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1905x633fb29.p1907x237a88eb.e eVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1905x633fb29.p1907x237a88eb.e();
        this.f232165d = eVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MMMusicNotification", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82);
        eVar.f232175c = this;
        eVar.f232176d = (android.app.NotificationManager) getSystemService("notification");
        eVar.f232179g = new com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1905x633fb29.p1907x237a88eb.b(eVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1905x633fb29.p1907x237a88eb.c cVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1905x633fb29.p1907x237a88eb.c(eVar);
        eVar.f232177e = cVar;
        ll3.b1.f400674b.f400684o.add(cVar);
        android.content.IntentFilter intentFilter = new android.content.IntentFilter("com.tencent.mm.Intent.ACTION_MMMUSIC_NOTIFICATION_CLICK");
        if (fp.h.a(33)) {
            registerReceiver(eVar.f232179g, intentFilter);
        } else {
            registerReceiver(eVar.f232179g, intentFilter, 2);
        }
        eVar.f232173a = true;
        c();
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MMMusicPlayerService", "onDestroy");
        com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1905x633fb29.p1907x237a88eb.e eVar = this.f232165d;
        eVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MMMusicNotification", "uninit");
        eVar.f232175c.unregisterReceiver(eVar.f232179g);
        ll3.e1 e1Var = ll3.b1.f400674b;
        ll3.c1 c1Var = eVar.f232177e;
        if (c1Var != null) {
            e1Var.f400684o.remove(c1Var);
        } else {
            e1Var.getClass();
        }
        eVar.f232179g = null;
        eVar.f232175c = null;
        eVar.f232176d = null;
        eVar.f232173a = false;
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent intent, int i17, int i18) {
        return 2;
    }
}
