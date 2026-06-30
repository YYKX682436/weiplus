package com.p314xaae8f345.mm.p1006xc5476f33.p2034x3593a6.p2037x7643c6b5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/rtos/service/RtosWatchServiceGuard;", "Landroid/app/Service;", "<init>", "()V", "InnerService", "my3/f0", "feature-exdevice_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.rtos.service.RtosWatchServiceGuard */
/* loaded from: classes7.dex */
public final class ServiceC17254x6e17a839 extends android.app.Service {

    /* renamed from: d, reason: collision with root package name */
    public final int f240120d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f240121e = -1;

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/rtos/service/RtosWatchServiceGuard$InnerService;", "Landroid/app/Service;", "<init>", "()V", "feature-exdevice_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.tencent.mm.plugin.rtos.service.RtosWatchServiceGuard$InnerService */
    /* loaded from: classes7.dex */
    public static final class InnerService extends android.app.Service {
        @Override // android.app.Service
        public android.os.IBinder onBind(android.content.Intent intent) {
            return null;
        }

        @Override // android.app.Service
        public void onCreate() {
            super.onCreate();
            try {
                startForeground(-1214, new android.app.Notification());
            } catch (java.lang.NullPointerException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Rtos.RtosWatchServiceGuard.InnerService", "set service for push exception:%s.", e17);
            }
            stopSelf();
        }

        @Override // android.app.Service
        public void onDestroy() {
            stopForeground(true);
            super.onDestroy();
        }
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosWatchServiceGuard", "onBind last pid:%d pid:%d threadID:" + java.lang.Thread.currentThread(), java.lang.Integer.valueOf(this.f240120d), java.lang.Integer.valueOf(android.os.Process.myPid()));
        return new my3.f0();
    }

    @Override // android.app.Service
    public void onCreate() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosWatchServiceGuard", "onCreate threadID:" + java.lang.Thread.currentThread());
        super.onCreate();
        if (fp.h.a(26)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosWatchServiceGuard", "stayForeground");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(26126, 1, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), 22, 0);
    }

    @Override // android.app.Service
    public void onDestroy() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosWatchServiceGuard", "onDestroy threadID:" + java.lang.Thread.currentThread());
        super.onDestroy();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(26126, 1, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), 23, 0);
    }

    @Override // android.app.Service
    public void onRebind(android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosWatchServiceGuard", "onRebind");
        super.onRebind(intent);
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent intent, int i17, int i18) {
        int myPid = android.os.Process.myPid();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosWatchServiceGuard", "onStartCommand last pid:%d pid:%d flags:%d startId:%d", java.lang.Integer.valueOf(this.f240121e), java.lang.Integer.valueOf(myPid), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (myPid != this.f240121e) {
            this.f240121e = myPid;
        }
        return super.onStartCommand(intent, i17, i18);
    }

    @Override // android.app.Service
    public boolean onUnbind(android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosWatchServiceGuard", "onUnbind");
        return super.onUnbind(intent);
    }
}
