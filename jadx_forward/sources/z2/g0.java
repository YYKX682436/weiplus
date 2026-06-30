package z2;

/* loaded from: classes8.dex */
public abstract class g0 {
    public static int a(android.app.Notification notification) {
        return notification.getBadgeIconType();
    }

    public static java.lang.String b(android.app.Notification notification) {
        return notification.getChannelId();
    }

    public static int c(android.app.Notification notification) {
        return notification.getGroupAlertBehavior();
    }

    public static java.lang.CharSequence d(android.app.Notification notification) {
        return notification.getSettingsText();
    }

    public static java.lang.String e(android.app.Notification notification) {
        return notification.getShortcutId();
    }

    public static long f(android.app.Notification notification) {
        return notification.getTimeoutAfter();
    }
}
