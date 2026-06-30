package com.tencent.mars.comm;

/* loaded from: classes12.dex */
public class Alarm extends android.content.BroadcastReceiver {
    private static final int IDKEY_ALARM_DELAY_REPORT = 1256;
    private static final int INTENT_FILTER_ACTION_ID_DEFAULT = 10000;
    private static final java.lang.String KEXTRA_ID = "ID";
    private static final java.lang.String KEXTRA_PID = "PID";
    private static final int KV_ALARM_DELAY_REPORT = 18860;
    private static final java.lang.String TAG = "MicroMsg.Alarm";
    private static com.tencent.mars.comm.Alarm bc_alarm;
    private static java.util.TreeMap<java.lang.Long, com.tencent.mars.comm.Alarm.AlarmRecord> gPendingAlarms = new java.util.TreeMap<>();
    private static com.tencent.mars.comm.MMWakerLock wakerlock;

    /* loaded from: classes12.dex */
    public static class AlarmRecord implements java.lang.Comparable<com.tencent.mars.comm.Alarm.AlarmRecord> {

        /* renamed from: id, reason: collision with root package name */
        final long f52532id;
        android.app.PendingIntent pendingIntent;
        long waitTime;

        public AlarmRecord(long j17, long j18, android.app.PendingIntent pendingIntent) {
            this.f52532id = j17;
            this.waitTime = j18;
            this.pendingIntent = pendingIntent;
        }

        @Override // java.lang.Comparable
        public int compareTo(com.tencent.mars.comm.Alarm.AlarmRecord alarmRecord) {
            return (int) (this.f52532id - alarmRecord.f52532id);
        }
    }

    private static boolean cancelAlarmMgr(long j17, android.content.Context context, android.app.PendingIntent pendingIntent) {
        if (((android.app.AlarmManager) context.getSystemService("alarm")) == null) {
            com.tencent.mars.xlog.Log.e(TAG, "am == null");
            return false;
        }
        if (pendingIntent == null) {
            com.tencent.mars.xlog.Log.e(TAG, "pendingIntent == null");
            return false;
        }
        jk.b.a(context, (int) j17, pendingIntent);
        pendingIntent.cancel();
        return true;
    }

    private native void onAlarm(long j17);

    public static void resetAlarm(android.content.Context context) {
        synchronized (gPendingAlarms) {
            for (com.tencent.mars.comm.Alarm.AlarmRecord alarmRecord : gPendingAlarms.values()) {
                cancelAlarmMgr(alarmRecord.f52532id, context, alarmRecord.pendingIntent);
            }
            gPendingAlarms.clear();
            com.tencent.mars.comm.Alarm alarm = bc_alarm;
            if (alarm != null) {
                context.unregisterReceiver(alarm);
                bc_alarm = null;
            }
        }
    }

    private static android.app.PendingIntent setAlarmMgr(int i17, long j17, long j18, android.content.Context context) {
        android.app.PendingIntent pendingIntent = null;
        if (((android.app.AlarmManager) context.getSystemService("alarm")) == null) {
            com.tencent.mars.xlog.Log.e(TAG, "am == null");
            return null;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setAction("ALARM_ACTION(" + java.lang.String.valueOf(10000) + ")");
        intent.putExtra(KEXTRA_ID, j17);
        intent.putExtra(KEXTRA_PID, android.os.Process.myPid());
        int i18 = android.os.Build.VERSION.SDK_INT;
        int a17 = fp.g0.a(268435456);
        com.tencent.mars.xlog.Log.i("MicroMsg.AlarmHelper", "setExact(type:%s requestCode:%s triggerAtMillis:%s intent:%s flags:%s stack:%s)", 2, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j18), intent, java.lang.Integer.valueOf(a17), jk.b.c());
        jk.b.f300046b++;
        android.app.AlarmManager alarmManager = (android.app.AlarmManager) context.getSystemService("alarm");
        if (alarmManager == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AlarmHelper", "setExact(requestCode:%s): am == null", java.lang.Integer.valueOf(i17));
        } else {
            if (i17 >= 100 && i17 <= 120) {
                pendingIntent = android.app.PendingIntent.getBroadcast(context, i17, intent, fp.g0.a(a17));
                if (i18 >= 31) {
                    try {
                        if (context.getApplicationInfo().targetSdkVersion >= 31) {
                            if (alarmManager.canScheduleExactAlarms()) {
                                zj0.a aVar = new zj0.a();
                                aVar.c(pendingIntent);
                                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                                aVar.c(java.lang.Long.valueOf(j18));
                                aVar.c(2);
                                yj0.a.d(alarmManager, aVar.b(), "com/tencent/mm/alarm/AlarmHelper", "setExact", "(Landroid/content/Context;IIJLandroid/content/Intent;IZ)Landroid/app/PendingIntent;", "android/app/AlarmManager_EXEC_", "setExact", "(IJLandroid/app/PendingIntent;)V");
                                int intValue = ((java.lang.Integer) aVar.a(0)).intValue();
                                zj0.c.f473285a.set(aVar);
                                alarmManager.setExact(intValue, ((java.lang.Long) aVar.a(1)).longValue(), (android.app.PendingIntent) zj0.c.a().a(2));
                                yj0.a.f(alarmManager, "com/tencent/mm/alarm/AlarmHelper", "setExact", "(Landroid/content/Context;IIJLandroid/content/Intent;IZ)Landroid/app/PendingIntent;", "android/app/AlarmManager_EXEC_", "setExact", "(IJLandroid/app/PendingIntent;)V");
                            } else {
                                zj0.a aVar2 = new zj0.a();
                                aVar2.c(pendingIntent);
                                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                                aVar2.c(java.lang.Long.valueOf(j18));
                                aVar2.c(2);
                                yj0.a.d(alarmManager, aVar2.b(), "com/tencent/mm/alarm/AlarmHelper", "setExact", "(Landroid/content/Context;IIJLandroid/content/Intent;IZ)Landroid/app/PendingIntent;", "android/app/AlarmManager_EXEC_", "set", "(IJLandroid/app/PendingIntent;)V");
                                int intValue2 = ((java.lang.Integer) aVar2.a(0)).intValue();
                                zj0.c.f473285a.set(aVar2);
                                alarmManager.set(intValue2, ((java.lang.Long) aVar2.a(1)).longValue(), (android.app.PendingIntent) zj0.c.a().a(2));
                                yj0.a.f(alarmManager, "com/tencent/mm/alarm/AlarmHelper", "setExact", "(Landroid/content/Context;IIJLandroid/content/Intent;IZ)Landroid/app/PendingIntent;", "android/app/AlarmManager_EXEC_", "set", "(IJLandroid/app/PendingIntent;)V");
                                com.tencent.mars.xlog.Log.w("MicroMsg.AlarmHelper", "disable setExact");
                            }
                        }
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AlarmHelper", "setExact Exception:%s %s", e17.getClass().getSimpleName(), e17.getMessage());
                        jk.a aVar3 = jk.b.f300045a;
                        if (aVar3 != null) {
                            ((com.tencent.mm.feature.performance.a) aVar3).b(i17, 1, jk.b.c());
                        }
                    }
                }
                zj0.a aVar4 = new zj0.a();
                aVar4.c(pendingIntent);
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                aVar4.c(java.lang.Long.valueOf(j18));
                aVar4.c(2);
                yj0.a.d(alarmManager, aVar4.b(), "com/tencent/mm/alarm/AlarmHelper", "setExact", "(Landroid/content/Context;IIJLandroid/content/Intent;IZ)Landroid/app/PendingIntent;", "android/app/AlarmManager_EXEC_", "setExact", "(IJLandroid/app/PendingIntent;)V");
                int intValue3 = ((java.lang.Integer) aVar4.a(0)).intValue();
                zj0.c.f473285a.set(aVar4);
                alarmManager.setExact(intValue3, ((java.lang.Long) aVar4.a(1)).longValue(), (android.app.PendingIntent) zj0.c.a().a(2));
                yj0.a.f(alarmManager, "com/tencent/mm/alarm/AlarmHelper", "setExact", "(Landroid/content/Context;IIJLandroid/content/Intent;IZ)Landroid/app/PendingIntent;", "android/app/AlarmManager_EXEC_", "setExact", "(IJLandroid/app/PendingIntent;)V");
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.AlarmHelper", "setExact(requestCode:%s): requestCode invalid", java.lang.Integer.valueOf(i17));
            }
        }
        return pendingIntent;
    }

    public static boolean start(int i17, long j17, int i18, android.content.Context context) {
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        if (i18 < 0) {
            com.tencent.mars.xlog.Log.e(TAG, "id:%d, after:%d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i18));
            return false;
        }
        if (context == null) {
            com.tencent.mars.xlog.Log.e(TAG, "null==context, id:%d, after:%d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i18));
            return false;
        }
        synchronized (gPendingAlarms) {
            if (wakerlock == null) {
                wakerlock = new com.tencent.mars.comm.MMWakerLock(context, TAG);
                com.tencent.mars.xlog.Log.i(TAG, "start new wakerlock");
            }
            if (bc_alarm == null) {
                bc_alarm = new com.tencent.mars.comm.Alarm();
                if (fp.h.a(33)) {
                    context.registerReceiver(bc_alarm, new android.content.IntentFilter("ALARM_ACTION(" + java.lang.String.valueOf(10000) + ")"));
                } else {
                    context.registerReceiver(bc_alarm, new android.content.IntentFilter("ALARM_ACTION(" + java.lang.String.valueOf(10000) + ")"), 2);
                }
            }
            if (gPendingAlarms.containsKey(java.lang.Long.valueOf(j17))) {
                com.tencent.mars.xlog.Log.e(TAG, "id exist=%d", java.lang.Long.valueOf(j17));
                return false;
            }
            if (i18 >= 0) {
                elapsedRealtime += i18;
            }
            long j18 = elapsedRealtime;
            android.app.PendingIntent alarmMgr = setAlarmMgr(i17, j17, j18, context);
            if (alarmMgr == null) {
                return false;
            }
            gPendingAlarms.put(java.lang.Long.valueOf(j17), new com.tencent.mars.comm.Alarm.AlarmRecord(j17, j18, alarmMgr));
            com.tencent.mars.xlog.Log.i(TAG, "Alarm.start [id: %d, after: %d, size: %d]", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(gPendingAlarms.size()));
            return true;
        }
    }

    public static boolean stop(long j17, android.content.Context context) {
        com.tencent.mars.xlog.Log.i(TAG, "Alarm.stop [id: %d]", java.lang.Long.valueOf(j17));
        if (context == null) {
            com.tencent.mars.xlog.Log.e(TAG, "context==null");
            return false;
        }
        synchronized (gPendingAlarms) {
            if (wakerlock == null) {
                wakerlock = new com.tencent.mars.comm.MMWakerLock(context, TAG);
                com.tencent.mars.xlog.Log.i(TAG, "stop new wakerlock");
            }
            if (bc_alarm == null) {
                bc_alarm = new com.tencent.mars.comm.Alarm();
                android.content.IntentFilter intentFilter = new android.content.IntentFilter();
                if (android.os.Build.VERSION.SDK_INT >= 31) {
                    context.registerReceiver(bc_alarm, intentFilter, 2);
                } else {
                    context.registerReceiver(bc_alarm, intentFilter);
                }
                com.tencent.mars.xlog.Log.i(TAG, "stop new Alarm");
            }
            com.tencent.mars.comm.Alarm.AlarmRecord remove = gPendingAlarms.remove(java.lang.Long.valueOf(j17));
            if (remove == null) {
                return false;
            }
            cancelAlarmMgr(remove.f52532id, context, remove.pendingIntent);
            return true;
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (context == null || intent == null) {
            return;
        }
        long longExtra = intent.getLongExtra(KEXTRA_ID, 0L);
        int intExtra = intent.getIntExtra(KEXTRA_PID, 0);
        if (0 == longExtra || intExtra == 0) {
            return;
        }
        if (intExtra != android.os.Process.myPid()) {
            com.tencent.mars.xlog.Log.w(TAG, "onReceive id:%d, pid:%d, mypid:%d", java.lang.Long.valueOf(longExtra), java.lang.Integer.valueOf(intExtra), java.lang.Integer.valueOf(android.os.Process.myPid()));
            return;
        }
        synchronized (gPendingAlarms) {
            try {
                try {
                    com.tencent.mars.comm.Alarm.AlarmRecord remove = gPendingAlarms.remove(java.lang.Long.valueOf(longExtra));
                    if (remove != null) {
                        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - remove.waitTime;
                        com.tencent.mars.xlog.Log.i(TAG, "Alarm.onReceive [id: %d, delta miss time: %d, size: %d]", java.lang.Long.valueOf(longExtra), java.lang.Long.valueOf(elapsedRealtime), java.lang.Integer.valueOf(gPendingAlarms.size()));
                        long j17 = elapsedRealtime > 30000 ? elapsedRealtime <= 60000 ? 1L : elapsedRealtime <= u04.d.f423477c ? 2L : elapsedRealtime <= 300000 ? 3L : 4L : 0L;
                        jx3.f fVar = jx3.f.INSTANCE;
                        fVar.idkeyStat(1256L, j17, 1L, false);
                        fVar.d(KV_ALARM_DELAY_REPORT, java.lang.Long.valueOf(elapsedRealtime));
                        com.tencent.mars.comm.MMWakerLock mMWakerLock = wakerlock;
                        if (mMWakerLock != null) {
                            mMWakerLock.lock(200L, "Alarm.onReceive");
                        }
                        onAlarm(longExtra);
                    } else {
                        com.tencent.mars.xlog.Log.e(TAG, "onReceive not found id:%d, pid:%d, gPendingAlarms.size:%d", java.lang.Long.valueOf(longExtra), java.lang.Integer.valueOf(intExtra), java.lang.Integer.valueOf(gPendingAlarms.size()));
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
