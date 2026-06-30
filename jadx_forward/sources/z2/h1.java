package z2;

/* loaded from: classes11.dex */
public abstract class h1 {
    public static void a(android.app.NotificationManager notificationManager, android.app.NotificationChannel notificationChannel) {
        notificationManager.createNotificationChannel(notificationChannel);
    }

    public static void b(android.app.NotificationManager notificationManager, android.app.NotificationChannelGroup notificationChannelGroup) {
        notificationManager.createNotificationChannelGroup(notificationChannelGroup);
    }

    public static void c(android.app.NotificationManager notificationManager, java.util.List<android.app.NotificationChannelGroup> list) {
        notificationManager.createNotificationChannelGroups(list);
    }

    public static void d(android.app.NotificationManager notificationManager, java.util.List<android.app.NotificationChannel> list) {
        notificationManager.createNotificationChannels(list);
    }

    public static void e(android.app.NotificationManager notificationManager, java.lang.String str) {
        notificationManager.deleteNotificationChannel(str);
    }

    public static void f(android.app.NotificationManager notificationManager, java.lang.String str) {
        notificationManager.deleteNotificationChannelGroup(str);
    }

    public static java.lang.String g(android.app.NotificationChannel notificationChannel) {
        return notificationChannel.getId();
    }

    public static java.lang.String h(android.app.NotificationChannelGroup notificationChannelGroup) {
        return notificationChannelGroup.getId();
    }

    public static android.app.NotificationChannel i(android.app.NotificationManager notificationManager, java.lang.String str) {
        return notificationManager.getNotificationChannel(str);
    }

    public static java.util.List<android.app.NotificationChannelGroup> j(android.app.NotificationManager notificationManager) {
        return notificationManager.getNotificationChannelGroups();
    }

    public static java.util.List<android.app.NotificationChannel> k(android.app.NotificationManager notificationManager) {
        return notificationManager.getNotificationChannels();
    }
}
