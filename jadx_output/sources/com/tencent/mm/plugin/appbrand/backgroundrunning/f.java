package com.tencent.mm.plugin.appbrand.backgroundrunning;

/* loaded from: classes7.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f76970d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandAudioOfVideoBackgroundPlayNotificationLogic f76971e;

    public f(com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandAudioOfVideoBackgroundPlayNotificationLogic appBrandAudioOfVideoBackgroundPlayNotificationLogic, android.graphics.Bitmap bitmap) {
        this.f76971e = appBrandAudioOfVideoBackgroundPlayNotificationLogic;
        this.f76970d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandAudioOfVideoBackgroundPlayNotificationLogic appBrandAudioOfVideoBackgroundPlayNotificationLogic = this.f76971e;
        android.app.NotificationManager notificationManager = appBrandAudioOfVideoBackgroundPlayNotificationLogic.f76914g;
        int b17 = appBrandAudioOfVideoBackgroundPlayNotificationLogic.b();
        com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandAudioOfVideoBackgroundPlayNotificationLogic appBrandAudioOfVideoBackgroundPlayNotificationLogic2 = this.f76971e;
        notificationManager.notify(b17, appBrandAudioOfVideoBackgroundPlayNotificationLogic2.d(appBrandAudioOfVideoBackgroundPlayNotificationLogic2.f76913f, appBrandAudioOfVideoBackgroundPlayNotificationLogic2.f76917m, this.f76970d));
    }
}
