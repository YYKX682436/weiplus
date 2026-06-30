package com.tencent.mm.plugin.appbrand.backgroundrunning;

/* loaded from: classes7.dex */
public class a extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandAudioOfVideoBackgroundPlayNotificationLogic f76948a;

    public a(com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandAudioOfVideoBackgroundPlayNotificationLogic appBrandAudioOfVideoBackgroundPlayNotificationLogic) {
        this.f76948a = appBrandAudioOfVideoBackgroundPlayNotificationLogic;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (intent == null || com.tencent.mm.sdk.platformtools.t8.K0(intent.getAction())) {
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("background_audio_notification_action_key");
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            com.tencent.mars.xlog.Log.e("AppBrand.MicroMsg.AppBrandAudioOfVideoBackgroundPlayNotificationLogic", "action is null, err, return");
            return;
        }
        com.tencent.mars.xlog.Log.i("AppBrand.MicroMsg.AppBrandAudioOfVideoBackgroundPlayNotificationLogic", "action:%s", stringExtra);
        if (stringExtra.equals("background_audio_notification_action_play")) {
            this.f76948a.f76912e.w(null);
            this.f76948a.f76917m = true;
            com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandAudioOfVideoBackgroundPlayNotificationLogic appBrandAudioOfVideoBackgroundPlayNotificationLogic = this.f76948a;
            android.app.NotificationManager notificationManager = appBrandAudioOfVideoBackgroundPlayNotificationLogic.f76914g;
            int b17 = appBrandAudioOfVideoBackgroundPlayNotificationLogic.b();
            com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandAudioOfVideoBackgroundPlayNotificationLogic appBrandAudioOfVideoBackgroundPlayNotificationLogic2 = this.f76948a;
            notificationManager.notify(b17, appBrandAudioOfVideoBackgroundPlayNotificationLogic2.d(appBrandAudioOfVideoBackgroundPlayNotificationLogic2.f76913f, true, null));
            return;
        }
        if (!stringExtra.equals("background_audio_notification_action_pause")) {
            if (stringExtra.equals("background_audio_notification_action_close")) {
                this.f76948a.f76912e.x();
                this.f76948a.f76917m = false;
                this.f76948a.e();
                this.f76948a.f76912e.b();
                this.f76948a.f76912e.f();
                return;
            }
            return;
        }
        this.f76948a.f76912e.u(null);
        this.f76948a.f76912e.f418860f.a();
        this.f76948a.f76917m = false;
        com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandAudioOfVideoBackgroundPlayNotificationLogic appBrandAudioOfVideoBackgroundPlayNotificationLogic3 = this.f76948a;
        android.app.NotificationManager notificationManager2 = appBrandAudioOfVideoBackgroundPlayNotificationLogic3.f76914g;
        int b18 = appBrandAudioOfVideoBackgroundPlayNotificationLogic3.b();
        com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandAudioOfVideoBackgroundPlayNotificationLogic appBrandAudioOfVideoBackgroundPlayNotificationLogic4 = this.f76948a;
        notificationManager2.notify(b18, appBrandAudioOfVideoBackgroundPlayNotificationLogic4.d(appBrandAudioOfVideoBackgroundPlayNotificationLogic4.f76913f, false, null));
    }
}
