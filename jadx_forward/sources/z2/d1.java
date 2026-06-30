package z2;

/* loaded from: classes13.dex */
public abstract class d1 {
    public static android.app.Notification.Action.Builder a(android.app.Notification.Action.Builder builder, boolean z17) {
        return builder.setAuthenticationRequired(z17);
    }

    public static android.app.Notification.Builder b(android.app.Notification.Builder builder, int i17) {
        return builder.setForegroundServiceBehavior(i17);
    }
}
