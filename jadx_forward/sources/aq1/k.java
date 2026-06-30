package aq1;

/* loaded from: classes11.dex */
public class k implements a25.m {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p959x883644fd.C11139x914131d6 f94589d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p642xad8b531f.C10307xa51e28d1 f94590e;

    @Override // a25.m
    public void c(android.app.Service service) {
        service.unregisterReceiver(this.f94589d);
        service.unregisterReceiver(this.f94590e);
        this.f94590e.getClass();
        android.content.Intent intent = new android.content.Intent("com.tencent.mm.TrafficStatsReceiver");
        int a17 = fp.g0.a(268435456);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AlarmHelper", "cancel(requestCode:%s intent:%s flags:%s)", 111, intent, java.lang.Integer.valueOf(a17));
        android.app.AlarmManager alarmManager = (android.app.AlarmManager) service.getSystemService("alarm");
        if (alarmManager == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AlarmHelper", "cancel(requestCode:%s): am == null", 111);
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AlarmHelper", "cancel Exception:%s %s", e17.getClass().getSimpleName(), e17.getMessage());
            jk.a aVar = jk.b.f381578a;
            if (aVar != null) {
                ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.a) aVar).b(111, 2, jk.b.c());
            }
        }
    }

    @Override // a25.m
    public void h(android.app.Service service) {
        this.f94589d = new com.p314xaae8f345.mm.p959x883644fd.C11139x914131d6();
        if (fp.h.a(33)) {
            service.registerReceiver(this.f94589d, new android.content.IntentFilter("com.tencent.mm.WatchDogPushReceiver"));
        } else {
            service.registerReceiver(this.f94589d, new android.content.IntentFilter("com.tencent.mm.WatchDogPushReceiver"), 4);
        }
        this.f94590e = new com.p314xaae8f345.mm.p642xad8b531f.C10307xa51e28d1();
        if (fp.h.a(33)) {
            service.registerReceiver(this.f94590e, new android.content.IntentFilter("com.tencent.mm.TrafficStatsReceiver"));
        } else {
            service.registerReceiver(this.f94590e, new android.content.IntentFilter("com.tencent.mm.TrafficStatsReceiver"), 4);
        }
        this.f94590e.getClass();
        jk.b.e(service, 111, 3, android.os.SystemClock.elapsedRealtime(), 300000L, new android.content.Intent("com.tencent.mm.TrafficStatsReceiver"), fp.g0.a(268435456));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TrafficStats", "Register alarm, interval: %d ms", 300000L);
    }
}
