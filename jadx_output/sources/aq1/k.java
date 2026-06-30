package aq1;

/* loaded from: classes11.dex */
public class k implements a25.m {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelstat.WatchDogPushReceiver f13056d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.booter.TrafficStatsReceiver f13057e;

    @Override // a25.m
    public void c(android.app.Service service) {
        service.unregisterReceiver(this.f13056d);
        service.unregisterReceiver(this.f13057e);
        this.f13057e.getClass();
        android.content.Intent intent = new android.content.Intent("com.tencent.mm.TrafficStatsReceiver");
        int a17 = fp.g0.a(268435456);
        com.tencent.mars.xlog.Log.i("MicroMsg.AlarmHelper", "cancel(requestCode:%s intent:%s flags:%s)", 111, intent, java.lang.Integer.valueOf(a17));
        android.app.AlarmManager alarmManager = (android.app.AlarmManager) service.getSystemService("alarm");
        if (alarmManager == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AlarmHelper", "cancel(requestCode:%s): am == null", 111);
            return;
        }
        android.app.PendingIntent b17 = jk.b.b(service, 111, intent, a17, true);
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(b17);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(alarmManager, arrayList.toArray(), "com/tencent/mm/alarm/AlarmHelper", "cancel", "(Landroid/content/Context;ILandroid/content/Intent;IZ)V", "android/app/AlarmManager_EXEC_", "cancel", "(Landroid/app/PendingIntent;)V");
            alarmManager.cancel((android.app.PendingIntent) arrayList.get(0));
            yj0.a.f(alarmManager, "com/tencent/mm/alarm/AlarmHelper", "cancel", "(Landroid/content/Context;ILandroid/content/Intent;IZ)V", "android/app/AlarmManager_EXEC_", "cancel", "(Landroid/app/PendingIntent;)V");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AlarmHelper", "cancel Exception:%s %s", e17.getClass().getSimpleName(), e17.getMessage());
            jk.a aVar = jk.b.f300045a;
            if (aVar != null) {
                ((com.tencent.mm.feature.performance.a) aVar).b(111, 2, jk.b.c());
            }
        }
    }

    @Override // a25.m
    public void h(android.app.Service service) {
        this.f13056d = new com.tencent.mm.modelstat.WatchDogPushReceiver();
        if (fp.h.a(33)) {
            service.registerReceiver(this.f13056d, new android.content.IntentFilter("com.tencent.mm.WatchDogPushReceiver"));
        } else {
            service.registerReceiver(this.f13056d, new android.content.IntentFilter("com.tencent.mm.WatchDogPushReceiver"), 4);
        }
        this.f13057e = new com.tencent.mm.booter.TrafficStatsReceiver();
        if (fp.h.a(33)) {
            service.registerReceiver(this.f13057e, new android.content.IntentFilter("com.tencent.mm.TrafficStatsReceiver"));
        } else {
            service.registerReceiver(this.f13057e, new android.content.IntentFilter("com.tencent.mm.TrafficStatsReceiver"), 4);
        }
        this.f13057e.getClass();
        jk.b.e(service, 111, 3, android.os.SystemClock.elapsedRealtime(), 300000L, new android.content.Intent("com.tencent.mm.TrafficStatsReceiver"), fp.g0.a(268435456));
        com.tencent.mars.xlog.Log.i("MicroMsg.TrafficStats", "Register alarm, interval: %d ms", 300000L);
    }
}
