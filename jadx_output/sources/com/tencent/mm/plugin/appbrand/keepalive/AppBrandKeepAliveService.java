package com.tencent.mm.plugin.appbrand.keepalive;

/* loaded from: classes7.dex */
public class AppBrandKeepAliveService extends android.app.Service {
    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent intent, int i17, int i18) {
        return 2;
    }
}
