package qf0;

@j95.b
/* loaded from: classes11.dex */
public final class q extends i95.w implements rf0.o {
    public void wi(java.lang.String title, java.lang.String text, android.app.PendingIntent pendingIntent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        wn4.x xVar = wn4.x.f529104a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Updater.ManualUpdaterProcessor", "showNotification, title = %s, text = %s", title, text);
        z2.k0 k0Var = new z2.k0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "reminder_channel_id");
        k0Var.m(null);
        k0Var.h(16, true);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        android.app.Notification notification = k0Var.D;
        notification.when = currentTimeMillis;
        k0Var.f(title);
        k0Var.e(text);
        k0Var.f550996g = pendingIntent;
        notification.icon = com.p314xaae8f345.mm.R.C30861xcebc809e.c7v;
        android.app.Notification b17 = k0Var.b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "build(...)");
        java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("notification");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((android.app.NotificationManager) systemService).notify(9342, b17);
    }
}
