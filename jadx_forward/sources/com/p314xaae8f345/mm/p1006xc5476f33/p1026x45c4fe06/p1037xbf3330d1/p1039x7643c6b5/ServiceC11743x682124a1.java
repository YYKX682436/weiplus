package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.p1039x7643c6b5;

/* renamed from: com.tencent.mm.plugin.appbrand.backgroundrunning.service.AppBrandForegroundNotificationService */
/* loaded from: classes7.dex */
public class ServiceC11743x682124a1 extends android.app.Service {

    /* renamed from: d, reason: collision with root package name */
    public android.app.NotificationManager f158524d;

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandForegroundNotificationService", "onCreate");
    }

    @Override // android.app.Service
    public void onDestroy() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandForegroundNotificationService", "onDestroy");
        stopForeground(false);
        super.onDestroy();
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x0297 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01ab  */
    @Override // android.app.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int onStartCommand(android.content.Intent r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 791
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.p1039x7643c6b5.ServiceC11743x682124a1.onStartCommand(android.content.Intent, int, int):int");
    }

    @Override // android.app.Service
    public void onTaskRemoved(android.content.Intent intent) {
        super.onTaskRemoved(intent);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandForegroundNotificationService", "onTaskRemoved");
        ((android.app.NotificationManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("notification")).cancel(1025);
        stopSelf();
    }
}
