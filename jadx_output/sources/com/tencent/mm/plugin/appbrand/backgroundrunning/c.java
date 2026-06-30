package com.tencent.mm.plugin.appbrand.backgroundrunning;

/* loaded from: classes7.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandAudioOfVideoBackgroundPlayNotificationLogic f76960d;

    public c(com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandAudioOfVideoBackgroundPlayNotificationLogic appBrandAudioOfVideoBackgroundPlayNotificationLogic) {
        this.f76960d = appBrandAudioOfVideoBackgroundPlayNotificationLogic;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandAudioOfVideoBackgroundPlayNotificationLogic appBrandAudioOfVideoBackgroundPlayNotificationLogic = this.f76960d;
        android.app.NotificationManager notificationManager = appBrandAudioOfVideoBackgroundPlayNotificationLogic.f76914g;
        int b17 = appBrandAudioOfVideoBackgroundPlayNotificationLogic.b();
        com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandAudioOfVideoBackgroundPlayNotificationLogic appBrandAudioOfVideoBackgroundPlayNotificationLogic2 = this.f76960d;
        notificationManager.notify(b17, appBrandAudioOfVideoBackgroundPlayNotificationLogic2.d(appBrandAudioOfVideoBackgroundPlayNotificationLogic2.f76913f, true, null));
        this.f76960d.f76917m = true;
    }
}
