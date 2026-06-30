package com.tencent.mm.plugin.battery;

/* loaded from: classes8.dex */
public final class BackgroundActivationsListener extends android.service.notification.NotificationListenerService {
    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        com.tencent.mars.xlog.Log.i("MicroMsg.battery.BackgroundActivationsListener", "#onCreate");
        android.content.ComponentName componentName = new android.content.ComponentName(this, (java.lang.Class<?>) com.tencent.mm.plugin.battery.BackgroundActivationsListener.class);
        com.tencent.mars.xlog.Log.i("MicroMsg.battery.BackgroundActivationsListener", "requestRebind");
        android.service.notification.NotificationListenerService.requestRebind(componentName);
    }

    @Override // android.service.notification.NotificationListenerService, android.app.Service
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.battery.BackgroundActivationsListener", "#onDestroy");
        super.onDestroy();
    }

    @Override // android.service.notification.NotificationListenerService
    public void onListenerConnected() {
        super.onListenerConnected();
        com.tencent.mars.xlog.Log.i("MicroMsg.battery.BackgroundActivationsListener", "#onListenerConnected");
    }

    @Override // android.service.notification.NotificationListenerService
    public void onListenerDisconnected() {
        super.onListenerDisconnected();
        com.tencent.mars.xlog.Log.i("MicroMsg.battery.BackgroundActivationsListener", "#onListenerDisconnected");
    }

    @Override // android.service.notification.NotificationListenerService
    public void onNotificationPosted(android.service.notification.StatusBarNotification statusBarNotification) {
        super.onNotificationPosted(statusBarNotification);
        com.tencent.mars.xlog.Log.i("MicroMsg.battery.BackgroundActivationsListener", "#onNotificationPosted");
        android.app.Notification notification = statusBarNotification.getNotification();
        if ("FOREGROUND_SERVICE".equals(android.os.Build.VERSION.SDK_INT >= 26 ? z2.g0.b(notification) : null)) {
            statusBarNotification.toString();
            java.lang.String[] stringArray = notification.extras.getStringArray("android.foregroundApps");
            java.lang.String packageName = getApplication().getPackageName();
            if (stringArray != null) {
                for (java.lang.String str : stringArray) {
                    if (packageName.equals(str)) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.battery.BackgroundActivationsListener", "AMS on updateForegroundApps, notification = " + notification.toString());
                        jx3.f.INSTANCE.idkeyStat(1540L, 100L, 1L, false);
                    } else {
                        com.tencent.mars.xlog.Log.w("MicroMsg.battery.BackgroundActivationsListener", "AMS on updateForegroundApps for others, pkg = " + str);
                        jx3.f.INSTANCE.idkeyStat(1540L, 101L, 1L, false);
                    }
                }
            }
        }
    }

    @Override // android.service.notification.NotificationListenerService
    public void onNotificationRemoved(android.service.notification.StatusBarNotification statusBarNotification) {
        super.onNotificationRemoved(statusBarNotification);
        com.tencent.mars.xlog.Log.i("MicroMsg.battery.BackgroundActivationsListener", "#onNotificationRemoved");
    }
}
