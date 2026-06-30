package p012xc85e97e9.p075x2eaf9f.app;

/* renamed from: androidx.core.app.NotificationCompatSideChannelService */
/* loaded from: classes7.dex */
public abstract class AbstractServiceC1085x9986f0b6 extends android.app.Service {
    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        intent.getAction().equals("android.support.BIND_NOTIFICATION_SIDE_CHANNEL");
        return null;
    }
}
