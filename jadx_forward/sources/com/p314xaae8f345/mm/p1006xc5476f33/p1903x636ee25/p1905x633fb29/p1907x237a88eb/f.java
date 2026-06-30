package com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1905x633fb29.p1907x237a88eb;

/* loaded from: classes11.dex */
public class f extends l85.s0 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1905x633fb29.p1907x237a88eb.g f232180f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1905x633fb29.p1907x237a88eb.g gVar, android.content.Intent intent) {
        super(intent);
        this.f232180f = gVar;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MMMusicNotificationHelper", "onServiceConnected");
        if (!(iBinder instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1905x633fb29.p1907x237a88eb.i)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.MMMusicNotificationHelper", "service %s isn't MMMusicPlayerService, err, return", iBinder.getClass().getName());
            iz5.a.g(null, false);
        } else {
            this.f232180f.f232182b = false;
            this.f232180f.f232181a = ((com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1905x633fb29.p1907x237a88eb.i) iBinder).f232185d;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName componentName) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MMMusicNotificationHelper", "onServiceDisconnected");
        this.f232180f.f232182b = false;
        this.f232180f.f232181a = null;
    }
}
