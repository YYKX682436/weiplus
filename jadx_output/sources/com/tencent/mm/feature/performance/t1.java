package com.tencent.mm.feature.performance;

@j95.b(dependencies = {bd0.o.class})
/* loaded from: classes12.dex */
public class t1 extends i95.w implements ob0.z2 {
    @Override // i95.w
    public void onCreate(android.content.Context context) {
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mm.matrix.report.DynamicMatrixReportBroadcast dynamicMatrixReportBroadcast = com.tencent.mm.matrix.report.DynamicMatrixReportBroadcast.f68842a;
            synchronized (com.tencent.mm.matrix.report.DynamicMatrixReportBroadcast.class) {
                if (com.tencent.mm.matrix.report.DynamicMatrixReportBroadcast.f68842a == null) {
                    com.tencent.mm.matrix.report.DynamicMatrixReportBroadcast.f68842a = new com.tencent.mm.matrix.report.DynamicMatrixReportBroadcast();
                    if (fp.h.a(33)) {
                        com.tencent.mm.sdk.platformtools.x2.f193071a.registerReceiver(com.tencent.mm.matrix.report.DynamicMatrixReportBroadcast.f68842a, new android.content.IntentFilter("action.matrix.deprecated-report"));
                    } else {
                        com.tencent.mm.sdk.platformtools.x2.f193071a.registerReceiver(com.tencent.mm.matrix.report.DynamicMatrixReportBroadcast.f68842a, new android.content.IntentFilter("action.matrix.deprecated-report"), 4);
                    }
                }
            }
        }
        java.util.Map map = ri.a.f395832a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(android.util.Pair.create("requestLocationUpdates", "(Ljava/lang/String;JFLandroid/location/LocationListener;)V"));
        arrayList.add(android.util.Pair.create("requestLocationUpdates", "(Ljava/lang/String;JFLandroid/location/LocationListener;Landroid/os/Looper;)V"));
        arrayList.add(android.util.Pair.create("requestLocationUpdates", "(Ljava/lang/String;JFLandroid/app/PendingIntent;)V"));
        arrayList.add(android.util.Pair.create("requestLocationUpdates", "(JFLandroid/location/Criteria;Landroid/app/PendingIntent;)V"));
        arrayList.add(android.util.Pair.create("requestLocationUpdates", "(JFLandroid/location/Criteria;Landroid/location/LocationListener;Landroid/os/Looper;)V"));
        java.util.Map map2 = ri.a.f395834c;
        ((java.util.HashMap) map2).put("android/location/LocationManager", arrayList);
        xj0.a.h().j(map2, ri.a.f395835d);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(android.util.Pair.create("newWakeLock", "(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;"));
        arrayList2.add(android.util.Pair.create("acquire", "()V"));
        arrayList2.add(android.util.Pair.create("acquire", "(J)V"));
        arrayList2.add(android.util.Pair.create("release", "()V"));
        arrayList2.add(android.util.Pair.create("release", "(I)V"));
        java.util.Map map3 = ri.a.f395837f;
        ((java.util.HashMap) map3).put("android/os/PowerManager$WakeLock", arrayList2);
        xj0.a.h().j(map3, ri.a.f395838g);
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
        java.util.Map map4 = ri.a.f395839h;
        ((java.util.HashMap) map4).put("android/app/AlarmManager", arrayList3);
        xj0.a.h().j(map4, ri.a.f395840i);
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(android.util.Pair.create("playSoundEffect", "(I)V"));
        arrayList4.add(android.util.Pair.create("playSoundEffect", "(IF)V"));
        arrayList4.add(android.util.Pair.create("startBluetoothSco", "()V"));
        arrayList4.add(android.util.Pair.create("stopBluetoothSco", "()V"));
        java.util.Map map5 = ri.a.f395841j;
        ((java.util.HashMap) map5).put("android/media/AudioManager", arrayList4);
        xj0.a.h().j(map5, ri.a.f395842k);
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(android.util.Pair.create("bindService", "(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z"));
        arrayList5.add(android.util.Pair.create("bindService", "(Landroid/content/Intent;ILjava/util/concurrent/Executor;Landroid/content/ServiceConnection;)Z"));
        arrayList5.add(android.util.Pair.create("bindIsolatedService", "(Landroid/content/Intent;ILjava/lang/String;Ljava/util/concurrent/Executor;Landroid/content/ServiceConnection;)Z"));
        arrayList5.add(android.util.Pair.create("bindServiceAsUser", "(Landroid/content/Intent;Landroid/content/ServiceConnection;ILandroid/os/UserHandle;)Z"));
        arrayList5.add(android.util.Pair.create("unbindService", "(Landroid/content/ServiceConnection;)V"));
        java.util.Map map6 = ri.a.f395843l;
        ((java.util.HashMap) map6).put("android/content/Context", arrayList5);
        xj0.a.h().j(map6, ri.a.f395844m);
        com.tencent.mm.matrix.l.a((android.app.Application) com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.matrix.o.INSTANCE);
        android.content.Context applicationContext = com.tencent.mm.sdk.platformtools.x2.f193071a.getApplicationContext();
        kotlin.jvm.internal.o.e(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((android.app.Application) applicationContext).registerActivityLifecycleCallbacks(new oh5.c());
        if (jk.b.f300045a == null) {
            jk.b.f300045a = new com.tencent.mm.feature.performance.a();
        }
        if (com.tencent.mm.sdk.platformtools.z.f193115k || android.os.Build.VERSION.SDK_INT < 30 || !fp.q.b("xperf")) {
            return;
        }
        if (com.tencent.mm.sdk.platformtools.x2.n() || com.tencent.mm.sdk.platformtools.x2.s() || com.tencent.mm.sdk.platformtools.x2.j()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MatrixService", "origin retain = %s", java.lang.Boolean.valueOf(com.tencent.matrix.mallctl.MallCtl.b(true)));
            com.tencent.mars.xlog.Log.i("MicroMsg.MatrixService", "now retain = %s", java.lang.Boolean.valueOf(com.tencent.matrix.mallctl.MallCtl.b(true)));
        }
    }
}
