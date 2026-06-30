package yn1;

/* loaded from: classes12.dex */
public final class f0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final yn1.f0 f545195d = new yn1.f0();

    public f0() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.app.Notification.Builder builder;
        android.content.Intent intent = new android.content.Intent(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1256xcd3633ce.ActivityC12839xb44f1cdd.class);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.o9u);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        android.app.PendingIntent activity = android.app.PendingIntent.getActivity(context, 0, intent, 201326592);
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            java.lang.Object systemService = context.getSystemService("notification");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            android.app.NotificationManager notificationManager = (android.app.NotificationManager) systemService;
            if (notificationManager.getNotificationChannel("MigrationPushChannel") == null) {
                notificationManager.createNotificationChannel(new android.app.NotificationChannel("MigrationPushChannel", "MigrationPushChannel", 4));
            }
            builder = new android.app.Notification.Builder(context, "MigrationPushChannel");
        } else {
            builder = new android.app.Notification.Builder(context);
        }
        builder.setContentTitle(string).setStyle(new android.app.Notification.BigTextStyle().bigText("")).setSmallIcon(com.p314xaae8f345.mm.R.C30861xcebc809e.c7v).setAutoCancel(true).setContentIntent(activity).setWhen(java.lang.System.currentTimeMillis());
        java.lang.Object systemService2 = context.getSystemService("notification");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService2, "null cannot be cast to non-null type android.app.NotificationManager");
        ((android.app.NotificationManager) systemService2).notify(539298096, builder.build());
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1256xcd3633ce.ServiceC12841x401e91e4.f174082g = true;
        return jz5.f0.f384359a;
    }
}
