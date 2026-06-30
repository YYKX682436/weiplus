package com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1905x633fb29.p1907x237a88eb;

/* loaded from: classes11.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1905x633fb29.p1907x237a88eb.ServiceC16625x51beb82f f232184d;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1905x633fb29.p1907x237a88eb.ServiceC16625x51beb82f serviceC16625x51beb82f) {
        this.f232184d = serviceC16625x51beb82f;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MMMusicPlayerService", "quit");
        com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1905x633fb29.p1907x237a88eb.ServiceC16625x51beb82f serviceC16625x51beb82f = this.f232184d;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(serviceC16625x51beb82f.f232166e);
        serviceC16625x51beb82f.stopSelf();
    }
}
