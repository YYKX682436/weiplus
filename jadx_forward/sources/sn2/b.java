package sn2;

/* loaded from: classes11.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Service f491651a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f491652b;

    public b(android.app.Service service) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        this.f491651a = service;
        this.f491652b = jz5.h.b(new sn2.a(this));
    }

    public final void a() {
        try {
            ((android.app.NotificationManager) ((jz5.n) this.f491652b).mo141623x754a37bb()).cancel(2106641);
            this.f491651a.stopForeground(true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNotificationManager", "cancel - Notification cancelled");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderLiveNotificationManager", "cancel - Failed: " + e17.getMessage());
        }
    }
}
