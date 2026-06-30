package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2353xd1075a44;

/* renamed from: com.tencent.mm.plugin.voip.widget.VoipSmallService */
/* loaded from: classes7.dex */
public class ServiceC18943x6794dd8e extends android.app.Service {
    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipSmallService", "VoipSmallService onBind");
        android.app.Notification notification = (android.app.Notification) intent.getParcelableExtra("notification");
        if (!fp.h.c(26) || notification == null) {
            return null;
        }
        startForeground(40, notification);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipSmallService", "VoipSmallService onCreate");
    }

    @Override // android.app.Service
    public void onDestroy() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipSmallService", "VoipSmallService onDestroy");
    }

    @Override // android.app.Service
    public boolean onUnbind(android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipSmallService", "VoipSmallService onUnbind");
        stopSelf();
        return super.onUnbind(intent);
    }
}
