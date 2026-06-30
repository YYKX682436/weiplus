package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1;

/* loaded from: classes7.dex */
public class a extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.C11734xf31693dd f158481a;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.C11734xf31693dd c11734xf31693dd) {
        this.f158481a = c11734xf31693dd;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (intent == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(intent.getAction())) {
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("background_audio_notification_action_key");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AppBrand.MicroMsg.AppBrandAudioOfVideoBackgroundPlayNotificationLogic", "action is null, err, return");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AppBrand.MicroMsg.AppBrandAudioOfVideoBackgroundPlayNotificationLogic", "action:%s", stringExtra);
        if (stringExtra.equals("background_audio_notification_action_play")) {
            this.f158481a.f158445e.w(null);
            this.f158481a.f158450m = true;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.C11734xf31693dd c11734xf31693dd = this.f158481a;
            android.app.NotificationManager notificationManager = c11734xf31693dd.f158447g;
            int b17 = c11734xf31693dd.b();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.C11734xf31693dd c11734xf31693dd2 = this.f158481a;
            notificationManager.notify(b17, c11734xf31693dd2.d(c11734xf31693dd2.f158446f, true, null));
            return;
        }
        if (!stringExtra.equals("background_audio_notification_action_pause")) {
            if (stringExtra.equals("background_audio_notification_action_close")) {
                this.f158481a.f158445e.x();
                this.f158481a.f158450m = false;
                this.f158481a.e();
                this.f158481a.f158445e.b();
                this.f158481a.f158445e.f();
                return;
            }
            return;
        }
        this.f158481a.f158445e.u(null);
        this.f158481a.f158445e.f500393f.a();
        this.f158481a.f158450m = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.C11734xf31693dd c11734xf31693dd3 = this.f158481a;
        android.app.NotificationManager notificationManager2 = c11734xf31693dd3.f158447g;
        int b18 = c11734xf31693dd3.b();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.C11734xf31693dd c11734xf31693dd4 = this.f158481a;
        notificationManager2.notify(b18, c11734xf31693dd4.d(c11734xf31693dd4.f158446f, false, null));
    }
}
