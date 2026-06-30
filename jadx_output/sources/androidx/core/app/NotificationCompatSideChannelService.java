package androidx.core.app;

/* loaded from: classes7.dex */
public abstract class NotificationCompatSideChannelService extends android.app.Service {
    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        intent.getAction().equals("android.support.BIND_NOTIFICATION_SIDE_CHANNEL");
        return null;
    }
}
