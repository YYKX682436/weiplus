package z2;

/* loaded from: classes13.dex */
public abstract class z0 {
    public static android.app.Notification.Action.Builder a(android.app.Notification.Action.Builder builder, boolean z17) {
        return builder.setAllowGeneratedReplies(z17);
    }

    public static android.app.Notification.Builder b(android.app.Notification.Builder builder, android.widget.RemoteViews remoteViews) {
        return builder.setCustomBigContentView(remoteViews);
    }

    public static android.app.Notification.Builder c(android.app.Notification.Builder builder, android.widget.RemoteViews remoteViews) {
        return builder.setCustomContentView(remoteViews);
    }

    public static android.app.Notification.Builder d(android.app.Notification.Builder builder, android.widget.RemoteViews remoteViews) {
        return builder.setCustomHeadsUpContentView(remoteViews);
    }

    public static android.app.Notification.Builder e(android.app.Notification.Builder builder, java.lang.CharSequence[] charSequenceArr) {
        return builder.setRemoteInputHistory(charSequenceArr);
    }
}
