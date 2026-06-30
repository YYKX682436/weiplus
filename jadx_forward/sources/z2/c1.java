package z2;

/* loaded from: classes13.dex */
public abstract class c1 {
    public static android.app.Notification.Builder a(android.app.Notification.Builder builder, boolean z17) {
        return builder.setAllowSystemGeneratedContextualActions(z17);
    }

    public static android.app.Notification.Builder b(android.app.Notification.Builder builder, android.app.Notification.BubbleMetadata bubbleMetadata) {
        return builder.setBubbleMetadata(bubbleMetadata);
    }

    public static android.app.Notification.Action.Builder c(android.app.Notification.Action.Builder builder, boolean z17) {
        return builder.setContextual(z17);
    }

    public static android.app.Notification.Builder d(android.app.Notification.Builder builder, java.lang.Object obj) {
        return builder.setLocusId((android.content.LocusId) obj);
    }
}
