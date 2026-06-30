package z2;

/* loaded from: classes13.dex */
public abstract class w1 {
    public static void a(android.app.Service service, int i17, android.app.Notification notification, int i18) {
        if (i18 == 0 || i18 == -1) {
            service.startForeground(i17, notification, i18);
        } else {
            service.startForeground(i17, notification, i18 & 255);
        }
    }
}
