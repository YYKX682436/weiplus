package com.p314xaae8f345.p542x3306d5.p546x2eaf0c;

/* renamed from: com.tencent.mars.comm.Alarm */
/* loaded from: classes12.dex */
public class C4545x3c68a31 extends android.content.BroadcastReceiver {

    /* renamed from: IDKEY_ALARM_DELAY_REPORT */
    private static final int f19210x3c3c97b9 = 1256;

    /* renamed from: INTENT_FILTER_ACTION_ID_DEFAULT */
    private static final int f19211xdfcc57e2 = 10000;

    /* renamed from: KEXTRA_ID */
    private static final java.lang.String f19212x32db9115 = "ID";

    /* renamed from: KEXTRA_PID */
    private static final java.lang.String f19213x2896acb1 = "PID";

    /* renamed from: KV_ALARM_DELAY_REPORT */
    private static final int f19214xd620b632 = 18860;
    private static final java.lang.String TAG = "MicroMsg.Alarm";

    /* renamed from: bc_alarm */
    private static com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4545x3c68a31 f19215xe0e1f4d3;

    /* renamed from: gPendingAlarms */
    private static java.util.TreeMap<java.lang.Long, com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4545x3c68a31.AlarmRecord> f19216x9b8c792 = new java.util.TreeMap<>();

    /* renamed from: wakerlock */
    private static com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4549xd1736fd9 f19217x172f1179;

    /* renamed from: com.tencent.mars.comm.Alarm$AlarmRecord */
    /* loaded from: classes12.dex */
    public static class AlarmRecord implements java.lang.Comparable<com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4545x3c68a31.AlarmRecord> {

        /* renamed from: id, reason: collision with root package name */
        final long f134065id;

        /* renamed from: pendingIntent */
        android.app.PendingIntent f19218x7a8df13;

        /* renamed from: waitTime */
        long f19219xe9f95e2;

        public AlarmRecord(long j17, long j18, android.app.PendingIntent pendingIntent) {
            this.f134065id = j17;
            this.f19219xe9f95e2 = j18;
            this.f19218x7a8df13 = pendingIntent;
        }

        @Override // java.lang.Comparable
        public int compareTo(com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4545x3c68a31.AlarmRecord alarmRecord) {
            return (int) (this.f134065id - alarmRecord.f134065id);
        }
    }

    /* renamed from: cancelAlarmMgr */
    private static boolean m39964xe655bea1(long j17, android.content.Context context, android.app.PendingIntent pendingIntent) {
        if (((android.app.AlarmManager) context.getSystemService("alarm")) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "am == null");
            return false;
        }
        if (pendingIntent == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "pendingIntent == null");
            return false;
        }
        jk.b.a(context, (int) j17, pendingIntent);
        pendingIntent.cancel();
        return true;
    }

    /* renamed from: onAlarm */
    private native void m39965xaf4f4fb2(long j17);

    /* renamed from: resetAlarm */
    public static void m39966x9a696642(android.content.Context context) {
        synchronized (f19216x9b8c792) {
            for (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4545x3c68a31.AlarmRecord alarmRecord : f19216x9b8c792.values()) {
                m39964xe655bea1(alarmRecord.f134065id, context, alarmRecord.f19218x7a8df13);
            }
            f19216x9b8c792.clear();
            com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4545x3c68a31 c4545x3c68a31 = f19215xe0e1f4d3;
            if (c4545x3c68a31 != null) {
                context.unregisterReceiver(c4545x3c68a31);
                f19215xe0e1f4d3 = null;
            }
        }
    }

    /* renamed from: setAlarmMgr */
    private static android.app.PendingIntent m39967xd004e489(int i17, long j17, long j18, android.content.Context context) {
        android.app.PendingIntent pendingIntent = null;
        if (((android.app.AlarmManager) context.getSystemService("alarm")) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "am == null");
            return null;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setAction("ALARM_ACTION(" + java.lang.String.valueOf(10000) + ")");
        intent.putExtra(f19212x32db9115, j17);
        intent.putExtra(f19213x2896acb1, android.os.Process.myPid());
        int i18 = android.os.Build.VERSION.SDK_INT;
        int a17 = fp.g0.a(268435456);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AlarmHelper", "setExact(type:%s requestCode:%s triggerAtMillis:%s intent:%s flags:%s stack:%s)", 2, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j18), intent, java.lang.Integer.valueOf(a17), jk.b.c());
        jk.b.f381579b++;
        android.app.AlarmManager alarmManager = (android.app.AlarmManager) context.getSystemService("alarm");
        if (alarmManager == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AlarmHelper", "setExact(requestCode:%s): am == null", java.lang.Integer.valueOf(i17));
        } else {
            if (i17 >= 100 && i17 <= 120) {
                pendingIntent = android.app.PendingIntent.getBroadcast(context, i17, intent, fp.g0.a(a17));
                if (i18 >= 31) {
                    try {
                        if (context.getApplicationInfo().targetSdkVersion >= 31) {
                            if (alarmManager.canScheduleExactAlarms()) {
                                zj0.a aVar = new zj0.a();
                                aVar.c(pendingIntent);
                                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                                aVar.c(java.lang.Long.valueOf(j18));
                                aVar.c(2);
                                yj0.a.d(alarmManager, aVar.b(), "com/tencent/mm/alarm/AlarmHelper", "setExact", "(Landroid/content/Context;IIJLandroid/content/Intent;IZ)Landroid/app/PendingIntent;", "android/app/AlarmManager_EXEC_", "setExact", "(IJLandroid/app/PendingIntent;)V");
                                int intValue = ((java.lang.Integer) aVar.a(0)).intValue();
                                zj0.c.f554818a.set(aVar);
                                alarmManager.setExact(intValue, ((java.lang.Long) aVar.a(1)).longValue(), (android.app.PendingIntent) zj0.c.a().a(2));
                                yj0.a.f(alarmManager, "com/tencent/mm/alarm/AlarmHelper", "setExact", "(Landroid/content/Context;IIJLandroid/content/Intent;IZ)Landroid/app/PendingIntent;", "android/app/AlarmManager_EXEC_", "setExact", "(IJLandroid/app/PendingIntent;)V");
                            } else {
                                zj0.a aVar2 = new zj0.a();
                                aVar2.c(pendingIntent);
                                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                                aVar2.c(java.lang.Long.valueOf(j18));
                                aVar2.c(2);
                                yj0.a.d(alarmManager, aVar2.b(), "com/tencent/mm/alarm/AlarmHelper", "setExact", "(Landroid/content/Context;IIJLandroid/content/Intent;IZ)Landroid/app/PendingIntent;", "android/app/AlarmManager_EXEC_", "set", "(IJLandroid/app/PendingIntent;)V");
                                int intValue2 = ((java.lang.Integer) aVar2.a(0)).intValue();
                                zj0.c.f554818a.set(aVar2);
                                alarmManager.set(intValue2, ((java.lang.Long) aVar2.a(1)).longValue(), (android.app.PendingIntent) zj0.c.a().a(2));
                                yj0.a.f(alarmManager, "com/tencent/mm/alarm/AlarmHelper", "setExact", "(Landroid/content/Context;IIJLandroid/content/Intent;IZ)Landroid/app/PendingIntent;", "android/app/AlarmManager_EXEC_", "set", "(IJLandroid/app/PendingIntent;)V");
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AlarmHelper", "disable setExact");
                            }
                        }
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AlarmHelper", "setExact Exception:%s %s", e17.getClass().getSimpleName(), e17.getMessage());
                        jk.a aVar3 = jk.b.f381578a;
                        if (aVar3 != null) {
                            ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.a) aVar3).b(i17, 1, jk.b.c());
                        }
                    }
                }
                zj0.a aVar4 = new zj0.a();
                aVar4.c(pendingIntent);
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                aVar4.c(java.lang.Long.valueOf(j18));
                aVar4.c(2);
                yj0.a.d(alarmManager, aVar4.b(), "com/tencent/mm/alarm/AlarmHelper", "setExact", "(Landroid/content/Context;IIJLandroid/content/Intent;IZ)Landroid/app/PendingIntent;", "android/app/AlarmManager_EXEC_", "setExact", "(IJLandroid/app/PendingIntent;)V");
                int intValue3 = ((java.lang.Integer) aVar4.a(0)).intValue();
                zj0.c.f554818a.set(aVar4);
                alarmManager.setExact(intValue3, ((java.lang.Long) aVar4.a(1)).longValue(), (android.app.PendingIntent) zj0.c.a().a(2));
                yj0.a.f(alarmManager, "com/tencent/mm/alarm/AlarmHelper", "setExact", "(Landroid/content/Context;IIJLandroid/content/Intent;IZ)Landroid/app/PendingIntent;", "android/app/AlarmManager_EXEC_", "setExact", "(IJLandroid/app/PendingIntent;)V");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AlarmHelper", "setExact(requestCode:%s): requestCode invalid", java.lang.Integer.valueOf(i17));
            }
        }
        return pendingIntent;
    }

    /* renamed from: start */
    public static boolean m39968x68ac462(int i17, long j17, int i18, android.content.Context context) {
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        if (i18 < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "id:%d, after:%d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i18));
            return false;
        }
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "null==context, id:%d, after:%d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i18));
            return false;
        }
        synchronized (f19216x9b8c792) {
            if (f19217x172f1179 == null) {
                f19217x172f1179 = new com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4549xd1736fd9(context, TAG);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "start new wakerlock");
            }
            if (f19215xe0e1f4d3 == null) {
                f19215xe0e1f4d3 = new com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4545x3c68a31();
                if (fp.h.a(33)) {
                    context.registerReceiver(f19215xe0e1f4d3, new android.content.IntentFilter("ALARM_ACTION(" + java.lang.String.valueOf(10000) + ")"));
                } else {
                    context.registerReceiver(f19215xe0e1f4d3, new android.content.IntentFilter("ALARM_ACTION(" + java.lang.String.valueOf(10000) + ")"), 2);
                }
            }
            if (f19216x9b8c792.containsKey(java.lang.Long.valueOf(j17))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "id exist=%d", java.lang.Long.valueOf(j17));
                return false;
            }
            if (i18 >= 0) {
                elapsedRealtime += i18;
            }
            long j18 = elapsedRealtime;
            android.app.PendingIntent m39967xd004e489 = m39967xd004e489(i17, j17, j18, context);
            if (m39967xd004e489 == null) {
                return false;
            }
            f19216x9b8c792.put(java.lang.Long.valueOf(j17), new com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4545x3c68a31.AlarmRecord(j17, j18, m39967xd004e489));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "Alarm.start [id: %d, after: %d, size: %d]", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(f19216x9b8c792.size()));
            return true;
        }
    }

    /* renamed from: stop */
    public static boolean m39969x360802(long j17, android.content.Context context) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "Alarm.stop [id: %d]", java.lang.Long.valueOf(j17));
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "context==null");
            return false;
        }
        synchronized (f19216x9b8c792) {
            if (f19217x172f1179 == null) {
                f19217x172f1179 = new com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4549xd1736fd9(context, TAG);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "stop new wakerlock");
            }
            if (f19215xe0e1f4d3 == null) {
                f19215xe0e1f4d3 = new com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4545x3c68a31();
                android.content.IntentFilter intentFilter = new android.content.IntentFilter();
                if (android.os.Build.VERSION.SDK_INT >= 31) {
                    context.registerReceiver(f19215xe0e1f4d3, intentFilter, 2);
                } else {
                    context.registerReceiver(f19215xe0e1f4d3, intentFilter);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "stop new Alarm");
            }
            com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4545x3c68a31.AlarmRecord remove = f19216x9b8c792.remove(java.lang.Long.valueOf(j17));
            if (remove == null) {
                return false;
            }
            m39964xe655bea1(remove.f134065id, context, remove.f19218x7a8df13);
            return true;
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (context == null || intent == null) {
            return;
        }
        long longExtra = intent.getLongExtra(f19212x32db9115, 0L);
        int intExtra = intent.getIntExtra(f19213x2896acb1, 0);
        if (0 == longExtra || intExtra == 0) {
            return;
        }
        if (intExtra != android.os.Process.myPid()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(TAG, "onReceive id:%d, pid:%d, mypid:%d", java.lang.Long.valueOf(longExtra), java.lang.Integer.valueOf(intExtra), java.lang.Integer.valueOf(android.os.Process.myPid()));
            return;
        }
        synchronized (f19216x9b8c792) {
            try {
                try {
                    com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4545x3c68a31.AlarmRecord remove = f19216x9b8c792.remove(java.lang.Long.valueOf(longExtra));
                    if (remove != null) {
                        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - remove.f19219xe9f95e2;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "Alarm.onReceive [id: %d, delta miss time: %d, size: %d]", java.lang.Long.valueOf(longExtra), java.lang.Long.valueOf(elapsedRealtime), java.lang.Integer.valueOf(f19216x9b8c792.size()));
                        long j17 = elapsedRealtime > 30000 ? elapsedRealtime <= 60000 ? 1L : elapsedRealtime <= u04.d.f505010c ? 2L : elapsedRealtime <= 300000 ? 3L : 4L : 0L;
                        jx3.f fVar = jx3.f.INSTANCE;
                        fVar.mo68477x336bdfd8(1256L, j17, 1L, false);
                        fVar.d(f19214xd620b632, java.lang.Long.valueOf(elapsedRealtime));
                        com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4549xd1736fd9 c4549xd1736fd9 = f19217x172f1179;
                        if (c4549xd1736fd9 != null) {
                            c4549xd1736fd9.m40015x32c52b(200L, "Alarm.onReceive");
                        }
                        m39965xaf4f4fb2(longExtra);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "onReceive not found id:%d, pid:%d, gPendingAlarms.size:%d", java.lang.Long.valueOf(longExtra), java.lang.Integer.valueOf(intExtra), java.lang.Integer.valueOf(f19216x9b8c792.size()));
                    }
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    throw th;
                }
            } catch (java.lang.Throwable th7) {
                th = th7;
            }
        }
    }
}
