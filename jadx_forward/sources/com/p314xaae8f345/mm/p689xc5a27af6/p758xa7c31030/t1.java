package com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030;

@j95.b(m140513x1e06fd29 = {bd0.o.class})
/* loaded from: classes12.dex */
public class t1 extends i95.w implements ob0.z2 {
    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            com.p314xaae8f345.mm.p849xbf8d97c1.p855xc84c5534.C10886x75fec50d c10886x75fec50d = com.p314xaae8f345.mm.p849xbf8d97c1.p855xc84c5534.C10886x75fec50d.f150375a;
            synchronized (com.p314xaae8f345.mm.p849xbf8d97c1.p855xc84c5534.C10886x75fec50d.class) {
                if (com.p314xaae8f345.mm.p849xbf8d97c1.p855xc84c5534.C10886x75fec50d.f150375a == null) {
                    com.p314xaae8f345.mm.p849xbf8d97c1.p855xc84c5534.C10886x75fec50d.f150375a = new com.p314xaae8f345.mm.p849xbf8d97c1.p855xc84c5534.C10886x75fec50d();
                    if (fp.h.a(33)) {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.registerReceiver(com.p314xaae8f345.mm.p849xbf8d97c1.p855xc84c5534.C10886x75fec50d.f150375a, new android.content.IntentFilter("action.matrix.deprecated-report"));
                    } else {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.registerReceiver(com.p314xaae8f345.mm.p849xbf8d97c1.p855xc84c5534.C10886x75fec50d.f150375a, new android.content.IntentFilter("action.matrix.deprecated-report"), 4);
                    }
                }
            }
        }
        java.util.Map map = ri.a.f477365a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(android.util.Pair.create("requestLocationUpdates", "(Ljava/lang/String;JFLandroid/location/LocationListener;)V"));
        arrayList.add(android.util.Pair.create("requestLocationUpdates", "(Ljava/lang/String;JFLandroid/location/LocationListener;Landroid/os/Looper;)V"));
        arrayList.add(android.util.Pair.create("requestLocationUpdates", "(Ljava/lang/String;JFLandroid/app/PendingIntent;)V"));
        arrayList.add(android.util.Pair.create("requestLocationUpdates", "(JFLandroid/location/Criteria;Landroid/app/PendingIntent;)V"));
        arrayList.add(android.util.Pair.create("requestLocationUpdates", "(JFLandroid/location/Criteria;Landroid/location/LocationListener;Landroid/os/Looper;)V"));
        java.util.Map map2 = ri.a.f477367c;
        ((java.util.HashMap) map2).put("android/location/LocationManager", arrayList);
        xj0.a.h().j(map2, ri.a.f477368d);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(android.util.Pair.create("newWakeLock", "(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;"));
        arrayList2.add(android.util.Pair.create("acquire", "()V"));
        arrayList2.add(android.util.Pair.create("acquire", "(J)V"));
        arrayList2.add(android.util.Pair.create("release", "()V"));
        arrayList2.add(android.util.Pair.create("release", "(I)V"));
        java.util.Map map3 = ri.a.f477370f;
        ((java.util.HashMap) map3).put("android/os/PowerManager$WakeLock", arrayList2);
        xj0.a.h().j(map3, ri.a.f477371g);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(android.util.Pair.create("set", "(IJLandroid/app/PendingIntent;)V"));
        arrayList3.add(android.util.Pair.create("set", "(IJLjava/lang/String;Landroid/app/AlarmManager$OnAlarmListener;Landroid/os/Handler;)V"));
        arrayList3.add(android.util.Pair.create("setExact", "(IJLandroid/app/PendingIntent;)V"));
        arrayList3.add(android.util.Pair.create("setExact", "(IJLjava/lang/String;Landroid/app/AlarmManager$OnAlarmListener;Landroid/os/Handler;)V"));
        arrayList3.add(android.util.Pair.create("setExactAndAllowWhileIdle", "(IJLandroid/app/PendingIntent;)V"));
        arrayList3.add(android.util.Pair.create("setWindow", "(IJJLandroid/app/PendingIntent;)V"));
        arrayList3.add(android.util.Pair.create("setWindow", "(IJJLjava/lang/String;Landroid/app/AlarmManager$OnAlarmListener;Landroid/os/Handler;)V"));
        arrayList3.add(android.util.Pair.create("setRepeating", "(IJJLandroid/app/PendingIntent;)V"));
        arrayList3.add(android.util.Pair.create("setInexactRepeating", "(IJJLandroid/app/PendingIntent;)V"));
        arrayList3.add(android.util.Pair.create("cancel", "(Landroid/app/PendingIntent;)V"));
        arrayList3.add(android.util.Pair.create("cancel", "(Landroid/app/AlarmManager$OnAlarmListener;)V"));
        java.util.Map map4 = ri.a.f477372h;
        ((java.util.HashMap) map4).put("android/app/AlarmManager", arrayList3);
        xj0.a.h().j(map4, ri.a.f477373i);
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(android.util.Pair.create("playSoundEffect", "(I)V"));
        arrayList4.add(android.util.Pair.create("playSoundEffect", "(IF)V"));
        arrayList4.add(android.util.Pair.create("startBluetoothSco", "()V"));
        arrayList4.add(android.util.Pair.create("stopBluetoothSco", "()V"));
        java.util.Map map5 = ri.a.f477374j;
        ((java.util.HashMap) map5).put("android/media/AudioManager", arrayList4);
        xj0.a.h().j(map5, ri.a.f477375k);
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(android.util.Pair.create("bindService", "(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z"));
        arrayList5.add(android.util.Pair.create("bindService", "(Landroid/content/Intent;ILjava/util/concurrent/Executor;Landroid/content/ServiceConnection;)Z"));
        arrayList5.add(android.util.Pair.create("bindIsolatedService", "(Landroid/content/Intent;ILjava/lang/String;Ljava/util/concurrent/Executor;Landroid/content/ServiceConnection;)Z"));
        arrayList5.add(android.util.Pair.create("bindServiceAsUser", "(Landroid/content/Intent;Landroid/content/ServiceConnection;ILandroid/os/UserHandle;)Z"));
        arrayList5.add(android.util.Pair.create("unbindService", "(Landroid/content/ServiceConnection;)V"));
        java.util.Map map6 = ri.a.f477376l;
        ((java.util.HashMap) map6).put("android/content/Context", arrayList5);
        xj0.a.h().j(map6, ri.a.f477377m);
        com.p314xaae8f345.mm.p849xbf8d97c1.l.a((android.app.Application) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.p849xbf8d97c1.o.INSTANCE);
        android.content.Context applicationContext = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getApplicationContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((android.app.Application) applicationContext).registerActivityLifecycleCallbacks(new oh5.c());
        if (jk.b.f381578a == null) {
            jk.b.f381578a = new com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.a();
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274648k || android.os.Build.VERSION.SDK_INT < 30 || !fp.q.b("xperf")) {
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() || com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.s() || com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.j()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MatrixService", "origin retain = %s", java.lang.Boolean.valueOf(com.p314xaae8f345.p552xbf8d97c1.p570x31b1d387.C4693x94e9f347.b(true)));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MatrixService", "now retain = %s", java.lang.Boolean.valueOf(com.p314xaae8f345.p552xbf8d97c1.p570x31b1d387.C4693x94e9f347.b(true)));
        }
    }
}
