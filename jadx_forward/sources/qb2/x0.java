package qb2;

/* loaded from: classes8.dex */
public final class x0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qb2.r1 f442842d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(qb2.r1 r1Var) {
        super(0);
        this.f442842d = r1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.service.notification.StatusBarNotification[] activeNotifications;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[cancelAll] ");
        qb2.r1 r1Var = this.f442842d;
        sb6.append(r1Var.j());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.GlobalPushNewXmlConsumer", sb6.toString());
        android.app.NotificationManager notificationManager = (android.app.NotificationManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("notification");
        for (java.util.Map.Entry entry : r1Var.j().entrySet()) {
            int i17 = ((qb2.a1) entry.getValue()).f442693a;
            if (((qb2.a1) entry.getValue()).f442694b) {
                ((k13.l1) ((h50.k) ((i50.s) i95.n0.c(i50.s.class))).wi()).l("notification-" + i17);
            } else if (notificationManager != null) {
                notificationManager.cancel(i17);
            }
        }
        r1Var.j().clear();
        r1Var.u();
        if (notificationManager != null && (activeNotifications = notificationManager.getActiveNotifications()) != null) {
            for (android.service.notification.StatusBarNotification statusBarNotification : activeNotifications) {
                if (statusBarNotification.getNotification().extras.getBoolean("Finder.GlobalPushNewXmlConsumer", false)) {
                    notificationManager.cancel(statusBarNotification.getId());
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.GlobalPushNewXmlConsumer", "fallback cancel(" + statusBarNotification.getId() + ')');
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
