package com.tencent.mm.plugin.appbrand.backgroundrunning;

/* loaded from: classes7.dex */
public class b implements tf1.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tf1.f f76951a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandAudioOfVideoBackgroundPlayNotificationLogic f76952b;

    public b(com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandAudioOfVideoBackgroundPlayNotificationLogic appBrandAudioOfVideoBackgroundPlayNotificationLogic, tf1.f fVar) {
        this.f76952b = appBrandAudioOfVideoBackgroundPlayNotificationLogic;
        this.f76951a = fVar;
    }

    @Override // tf1.e
    public void a() {
        if (this.f76952b.f76916i) {
            com.tencent.mars.xlog.Log.i("AppBrand.MicroMsg.AppBrandAudioOfVideoBackgroundPlayNotificationLogic", "onBackgroundAudioStart, isCanceled");
            return;
        }
        this.f76952b.f76917m = true;
        com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandAudioOfVideoBackgroundPlayNotificationLogic appBrandAudioOfVideoBackgroundPlayNotificationLogic = this.f76952b;
        android.app.NotificationManager notificationManager = appBrandAudioOfVideoBackgroundPlayNotificationLogic.f76914g;
        int b17 = appBrandAudioOfVideoBackgroundPlayNotificationLogic.b();
        com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandAudioOfVideoBackgroundPlayNotificationLogic appBrandAudioOfVideoBackgroundPlayNotificationLogic2 = this.f76952b;
        notificationManager.notify(b17, appBrandAudioOfVideoBackgroundPlayNotificationLogic2.d(appBrandAudioOfVideoBackgroundPlayNotificationLogic2.f76913f, true, null));
    }

    @Override // tf1.e
    public void b() {
        if (this.f76952b.f76916i) {
            com.tencent.mars.xlog.Log.i("AppBrand.MicroMsg.AppBrandAudioOfVideoBackgroundPlayNotificationLogic", "onBackgroundAudioPause, isCanceled");
            return;
        }
        boolean l17 = this.f76951a.l();
        com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandAudioOfVideoBackgroundPlayNotificationLogic appBrandAudioOfVideoBackgroundPlayNotificationLogic = this.f76952b;
        android.app.NotificationManager notificationManager = appBrandAudioOfVideoBackgroundPlayNotificationLogic.f76914g;
        int b17 = appBrandAudioOfVideoBackgroundPlayNotificationLogic.b();
        com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandAudioOfVideoBackgroundPlayNotificationLogic appBrandAudioOfVideoBackgroundPlayNotificationLogic2 = this.f76952b;
        notificationManager.notify(b17, appBrandAudioOfVideoBackgroundPlayNotificationLogic2.d(appBrandAudioOfVideoBackgroundPlayNotificationLogic2.f76913f, l17, null));
    }

    @Override // tf1.e
    public void c(android.graphics.Bitmap bitmap) {
    }

    @Override // tf1.e
    public void d() {
        if (this.f76952b.f76916i) {
            com.tencent.mars.xlog.Log.i("AppBrand.MicroMsg.AppBrandAudioOfVideoBackgroundPlayNotificationLogic", "onExitBackground, isCanceled");
        } else {
            this.f76952b.e();
        }
    }

    @Override // tf1.e
    public void e() {
        if (this.f76952b.f76916i) {
            com.tencent.mars.xlog.Log.i("AppBrand.MicroMsg.AppBrandAudioOfVideoBackgroundPlayNotificationLogic", "onBackgroundAudioPause, isCanceled");
            return;
        }
        this.f76952b.f76917m = false;
        com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandAudioOfVideoBackgroundPlayNotificationLogic appBrandAudioOfVideoBackgroundPlayNotificationLogic = this.f76952b;
        android.app.NotificationManager notificationManager = appBrandAudioOfVideoBackgroundPlayNotificationLogic.f76914g;
        int b17 = appBrandAudioOfVideoBackgroundPlayNotificationLogic.b();
        com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandAudioOfVideoBackgroundPlayNotificationLogic appBrandAudioOfVideoBackgroundPlayNotificationLogic2 = this.f76952b;
        notificationManager.notify(b17, appBrandAudioOfVideoBackgroundPlayNotificationLogic2.d(appBrandAudioOfVideoBackgroundPlayNotificationLogic2.f76913f, false, null));
    }
}
