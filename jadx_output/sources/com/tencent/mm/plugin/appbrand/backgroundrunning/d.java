package com.tencent.mm.plugin.appbrand.backgroundrunning;

/* loaded from: classes7.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandAudioOfVideoBackgroundPlayNotificationLogic f76963d;

    public d(com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandAudioOfVideoBackgroundPlayNotificationLogic appBrandAudioOfVideoBackgroundPlayNotificationLogic) {
        this.f76963d = appBrandAudioOfVideoBackgroundPlayNotificationLogic;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.IntentFilter intentFilter = new android.content.IntentFilter("com.tencent.mm.Intent.ACTION_BACKGROUND_AUDIO_NOTIFICATION_CLICK");
        if (fp.h.a(33)) {
            com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandAudioOfVideoBackgroundPlayNotificationLogic appBrandAudioOfVideoBackgroundPlayNotificationLogic = this.f76963d;
            appBrandAudioOfVideoBackgroundPlayNotificationLogic.f76913f.registerReceiver(appBrandAudioOfVideoBackgroundPlayNotificationLogic.f76920p, intentFilter);
        } else {
            com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandAudioOfVideoBackgroundPlayNotificationLogic appBrandAudioOfVideoBackgroundPlayNotificationLogic2 = this.f76963d;
            appBrandAudioOfVideoBackgroundPlayNotificationLogic2.f76913f.registerReceiver(appBrandAudioOfVideoBackgroundPlayNotificationLogic2.f76920p, intentFilter, 2);
        }
        com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandAudioOfVideoBackgroundPlayNotificationLogic appBrandAudioOfVideoBackgroundPlayNotificationLogic3 = this.f76963d;
        android.app.NotificationManager notificationManager = appBrandAudioOfVideoBackgroundPlayNotificationLogic3.f76914g;
        int b17 = appBrandAudioOfVideoBackgroundPlayNotificationLogic3.b();
        com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandAudioOfVideoBackgroundPlayNotificationLogic appBrandAudioOfVideoBackgroundPlayNotificationLogic4 = this.f76963d;
        notificationManager.notify(b17, appBrandAudioOfVideoBackgroundPlayNotificationLogic4.d(appBrandAudioOfVideoBackgroundPlayNotificationLogic4.f76913f, true, null));
        this.f76963d.f76917m = true;
    }
}
