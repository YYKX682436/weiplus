package yn1;

/* loaded from: classes11.dex */
public final class i0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f545230d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(java.lang.String str) {
        super(0);
        this.f545230d = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1256xcd3633ce.ServiceC12841x401e91e4.f174079d == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MigrationForegroundService", "service has stopped");
        } else {
            z2.k0 k0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1256xcd3633ce.ServiceC12841x401e91e4.f174081f;
            if (k0Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("notificationBuilder");
                throw null;
            }
            k0Var.e(this.f545230d);
            android.app.NotificationManager notificationManager = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1256xcd3633ce.ServiceC12841x401e91e4.f174080e;
            if (notificationManager != null) {
                z2.k0 k0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1256xcd3633ce.ServiceC12841x401e91e4.f174081f;
                if (k0Var2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("notificationBuilder");
                    throw null;
                }
                notificationManager.notify(539298089, k0Var2.b());
            }
        }
        return jz5.f0.f384359a;
    }
}
