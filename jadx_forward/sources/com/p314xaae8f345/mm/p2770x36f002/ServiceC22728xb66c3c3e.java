package com.p314xaae8f345.mm.p2770x36f002;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/util/FullScreenIntentService;", "Landroid/app/Service;", "<init>", "()V", "FullScreenOperationReceiver", "plugin-comm_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.util.FullScreenIntentService */
/* loaded from: classes11.dex */
public final class ServiceC22728xb66c3c3e extends android.app.Service {

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/util/FullScreenIntentService$FullScreenOperationReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "plugin-comm_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.tencent.mm.util.FullScreenIntentService$FullScreenOperationReceiver */
    /* loaded from: classes4.dex */
    public static final class FullScreenOperationReceiver extends android.content.BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
        }
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FullScreenIntentService", "FullScreenIntentService onCreate");
    }

    @Override // android.app.Service
    public void onDestroy() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FullScreenIntentService", "FullScreenIntentService service onDestroy");
        ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) mo3.f.f411939a).f(41);
        stopForeground(true);
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent intent, int i17, int i18) {
        z2.k0 k0Var;
        if ((fp.h.b(28) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(android.os.Build.VERSION.CODENAME, "Q")) && intent != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FullScreenIntentService", "FullScreenIntentService calling service is on bind MicroMsg.FullScreenIntentService" + intent.hasFileDescriptors());
            if (fp.h.b(28) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(android.os.Build.VERSION.CODENAME, "Q")) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FullScreenIntentService", "FullScreenIntentService calling  service is on bind MicroMsg.FullScreenIntentService" + intent.hasFileDescriptors());
                java.lang.String packageName = getPackageName();
                java.lang.String stringExtra = intent.getStringExtra("destClass");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(stringExtra);
                intent.setClassName(packageName, stringExtra);
                android.widget.RemoteViews remoteViews = (android.widget.RemoteViews) intent.getParcelableExtra("fullscreenRemoteview");
                java.lang.String stringExtra2 = intent.getStringExtra("contentText");
                intent.setFlags(268435456);
                java.lang.String stringExtra3 = intent.getStringExtra(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56315xfd38653e);
                boolean booleanExtra = intent.getBooleanExtra("notifyStill", false);
                android.app.PendingIntent activity = android.app.PendingIntent.getActivity(this, 0, intent, fp.g0.a(134217728));
                if (android.os.Build.VERSION.SDK_INT >= 26) {
                    if (remoteViews != null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(stringExtra3);
                        k0Var = new z2.k0(this, stringExtra3);
                        k0Var.f550999j = 1;
                        k0Var.f551008s = "call";
                        long currentTimeMillis = java.lang.System.currentTimeMillis();
                        android.app.Notification notification = k0Var.D;
                        notification.when = currentTimeMillis;
                        k0Var.f551013x = remoteViews;
                        k0Var.f551014y = remoteViews;
                        notification.icon = com.p314xaae8f345.mm.R.C30861xcebc809e.c7v;
                        k0Var.f550996g = activity;
                        k0Var.f(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572064xr));
                        k0Var.e(stringExtra2);
                        k0Var.i(activity, true);
                        k0Var.h(2, true);
                        k0Var.h(16, true);
                    } else {
                        k0Var = new z2.k0(this, ip.b.l());
                        k0Var.f550999j = 1;
                        k0Var.f551008s = "reminder";
                        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                        android.app.Notification notification2 = k0Var.D;
                        notification2.when = currentTimeMillis2;
                        k0Var.e(stringExtra2);
                        k0Var.f(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572064xr));
                        notification2.icon = com.p314xaae8f345.mm.R.C30861xcebc809e.c7v;
                        k0Var.f550996g = activity;
                        k0Var.i(activity, true);
                        k0Var.h(2, true);
                        k0Var.h(16, true);
                    }
                    android.app.Notification b17 = k0Var.b();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "build(...)");
                    if (booleanExtra) {
                        b17.flags |= 4;
                    }
                    try {
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.m()) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FullScreenIntentService", "current mmprocess is exits");
                        }
                        ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) mo3.f.f411939a).n(41, b17, true);
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FullScreenIntentService", "start foreground service happened error %s", e17.getMessage());
                    }
                }
            }
        }
        return super.onStartCommand(intent, i17, i18);
    }

    @Override // android.app.Service
    public void onTaskRemoved(android.content.Intent rootIntent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootIntent, "rootIntent");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FullScreenIntentService", "onTaskRemoved: %s", rootIntent);
        super.onTaskRemoved(rootIntent);
        ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) mo3.f.f411939a).f(41);
        stopSelf();
    }

    @Override // android.app.Service
    public boolean onUnbind(android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FullScreenIntentService", "FullScreenIntentService service onUnbind");
        return super.onUnbind(intent);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public boolean stopService(android.content.Intent name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) mo3.f.f411939a).f(41);
        stopForeground(true);
        return super.stopService(name);
    }
}
