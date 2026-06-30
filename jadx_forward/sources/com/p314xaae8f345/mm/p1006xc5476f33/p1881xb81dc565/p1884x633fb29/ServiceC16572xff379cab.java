package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29;

/* renamed from: com.tencent.mm.plugin.multitalk.model.MultiTalkingSmallService */
/* loaded from: classes7.dex */
public class ServiceC16572xff379cab extends android.app.Service {
    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTalkingSmallService", "MultiTalkingSmallService onBind");
        android.app.Notification notification = (android.app.Notification) intent.getParcelableExtra("notification");
        if (!fp.h.c(26) || notification == null) {
            return null;
        }
        startForeground(43, notification);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTalkingSmallService", "MultiTalkingSmallService onCreate");
    }

    @Override // android.app.Service
    public void onDestroy() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTalkingSmallService", "MultiTalkingSmallService onDestroy");
    }

    @Override // android.app.Service
    public boolean onUnbind(android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTalkingSmallService", "MultiTalkingSmallService onUnbind");
        stopSelf();
        return super.onUnbind(intent);
    }
}
