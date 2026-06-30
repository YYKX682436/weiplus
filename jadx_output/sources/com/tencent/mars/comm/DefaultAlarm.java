package com.tencent.mars.comm;

/* loaded from: classes12.dex */
public class DefaultAlarm extends android.content.BroadcastReceiver {
    private static final java.lang.String KEXTRA_ID = "ID";
    private static final java.lang.String KEXTRA_PID = "PID";
    private static final java.lang.String TAG = "MicroMsg.Alarm";
    private static java.util.TreeSet<java.lang.Object[]> alarm_waiting_set = new java.util.TreeSet<>(new com.tencent.mars.comm.DefaultAlarm.ComparatorAlarm());
    private static com.tencent.mars.comm.DefaultAlarm bc_alarm;
    private static com.tencent.mars.comm.WakerLock wakerlock;
    private byte _hellAccFlag_;

    /* loaded from: classes12.dex */
    public static class ComparatorAlarm implements java.util.Comparator<java.lang.Object[]> {
        private ComparatorAlarm() {
        }

        @Override // java.util.Comparator
        public int compare(java.lang.Object[] objArr, java.lang.Object[] objArr2) {
            com.tencent.mars.comm.DefaultAlarm.TSetData tSetData = com.tencent.mars.comm.DefaultAlarm.TSetData.ID;
            return (int) (((java.lang.Long) objArr[tSetData.ordinal()]).longValue() - ((java.lang.Long) objArr2[tSetData.ordinal()]).longValue());
        }
    }

    /* loaded from: classes12.dex */
    public enum TSetData {
        ID,
        WAITTIME,
        PENDINGINTENT
    }

    private static boolean cancelAlarmMgr(android.content.Context context, android.app.PendingIntent pendingIntent) {
        android.app.AlarmManager alarmManager = (android.app.AlarmManager) context.getSystemService("alarm");
        if (alarmManager == null) {
            com.tencent.mars.xlog.Log.e(TAG, "am == null");
            return false;
        }
        if (pendingIntent == null) {
            com.tencent.mars.xlog.Log.e(TAG, "pendingIntent == null");
            return false;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(pendingIntent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(alarmManager, arrayList.toArray(), "com/tencent/mars/comm/DefaultAlarm", "cancelAlarmMgr", "(Landroid/content/Context;Landroid/app/PendingIntent;)Z", "android/app/AlarmManager_EXEC_", "cancel", "(Landroid/app/PendingIntent;)V");
        alarmManager.cancel((android.app.PendingIntent) arrayList.get(0));
        yj0.a.f(alarmManager, "com/tencent/mars/comm/DefaultAlarm", "cancelAlarmMgr", "(Landroid/content/Context;Landroid/app/PendingIntent;)Z", "android/app/AlarmManager_EXEC_", "cancel", "(Landroid/app/PendingIntent;)V");
        pendingIntent.cancel();
        return true;
    }

    private native void onAlarm(long j17);

    public static void resetAlarm(android.content.Context context) {
        synchronized (alarm_waiting_set) {
            java.util.Iterator<java.lang.Object[]> it = alarm_waiting_set.iterator();
            while (it.hasNext()) {
                cancelAlarmMgr(context, (android.app.PendingIntent) it.next()[com.tencent.mars.comm.DefaultAlarm.TSetData.PENDINGINTENT.ordinal()]);
            }
            alarm_waiting_set.clear();
            com.tencent.mars.comm.DefaultAlarm defaultAlarm = bc_alarm;
            if (defaultAlarm != null) {
                context.unregisterReceiver(defaultAlarm);
                bc_alarm = null;
            }
        }
    }

    private static android.app.PendingIntent setAlarmMgr(long j17, long j18, android.content.Context context) {
        android.app.AlarmManager alarmManager = (android.app.AlarmManager) context.getSystemService("alarm");
        if (alarmManager == null) {
            com.tencent.mars.xlog.Log.e(TAG, "am == null");
            return null;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setAction("ALARM_ACTION(" + java.lang.String.valueOf(android.os.Process.myPid()) + ")");
        intent.putExtra(KEXTRA_ID, j17);
        intent.putExtra(KEXTRA_PID, android.os.Process.myPid());
        android.app.PendingIntent broadcast = android.app.PendingIntent.getBroadcast(context, (int) j17, intent, 268435456);
        zj0.a aVar = new zj0.a();
        aVar.c(broadcast);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        aVar.c(java.lang.Long.valueOf(j18));
        aVar.c(2);
        yj0.a.d(alarmManager, aVar.b(), "com/tencent/mars/comm/DefaultAlarm", "setAlarmMgr", "(JJLandroid/content/Context;)Landroid/app/PendingIntent;", "android/app/AlarmManager_EXEC_", "setExact", "(IJLandroid/app/PendingIntent;)V");
        int intValue = ((java.lang.Integer) aVar.a(0)).intValue();
        zj0.c.f473285a.set(aVar);
        alarmManager.setExact(intValue, ((java.lang.Long) aVar.a(1)).longValue(), (android.app.PendingIntent) zj0.c.a().a(2));
        yj0.a.f(alarmManager, "com/tencent/mars/comm/DefaultAlarm", "setAlarmMgr", "(JJLandroid/content/Context;)Landroid/app/PendingIntent;", "android/app/AlarmManager_EXEC_", "setExact", "(IJLandroid/app/PendingIntent;)V");
        return broadcast;
    }

    public static boolean start(long j17, int i17, android.content.Context context) {
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        if (i17 < 0) {
            com.tencent.mars.xlog.Log.e(TAG, "id:%d, after:%d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17));
            return false;
        }
        if (context == null) {
            com.tencent.mars.xlog.Log.e(TAG, "null==context, id:%d, after:%d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17));
            return false;
        }
        synchronized (alarm_waiting_set) {
            if (wakerlock == null) {
                wakerlock = new com.tencent.mars.comm.WakerLock(context);
                com.tencent.mars.xlog.Log.i(TAG, "start new wakerlock");
            }
            if (bc_alarm == null) {
                com.tencent.mars.comm.DefaultAlarm defaultAlarm = new com.tencent.mars.comm.DefaultAlarm();
                bc_alarm = defaultAlarm;
                context.registerReceiver(defaultAlarm, new android.content.IntentFilter("ALARM_ACTION(" + java.lang.String.valueOf(android.os.Process.myPid()) + ")"));
            }
            java.util.Iterator<java.lang.Object[]> it = alarm_waiting_set.iterator();
            while (it.hasNext()) {
                if (((java.lang.Long) it.next()[com.tencent.mars.comm.DefaultAlarm.TSetData.ID.ordinal()]).longValue() == j17) {
                    com.tencent.mars.xlog.Log.e(TAG, "id exist=%d", java.lang.Long.valueOf(j17));
                    return false;
                }
            }
            if (i17 >= 0) {
                elapsedRealtime += i17;
            }
            android.app.PendingIntent alarmMgr = setAlarmMgr(j17, elapsedRealtime, context);
            if (alarmMgr == null) {
                return false;
            }
            alarm_waiting_set.add(new java.lang.Object[]{java.lang.Long.valueOf(j17), java.lang.Long.valueOf(elapsedRealtime), alarmMgr});
            return true;
        }
    }

    public static boolean stop(long j17, android.content.Context context) {
        if (context == null) {
            com.tencent.mars.xlog.Log.e(TAG, "context==null");
            return false;
        }
        synchronized (alarm_waiting_set) {
            if (wakerlock == null) {
                wakerlock = new com.tencent.mars.comm.WakerLock(context);
                com.tencent.mars.xlog.Log.i(TAG, "stop new wakerlock");
            }
            if (bc_alarm == null) {
                bc_alarm = new com.tencent.mars.comm.DefaultAlarm();
                context.registerReceiver(bc_alarm, new android.content.IntentFilter());
                com.tencent.mars.xlog.Log.i(TAG, "stop new Alarm");
            }
            java.util.Iterator<java.lang.Object[]> it = alarm_waiting_set.iterator();
            while (it.hasNext()) {
                java.lang.Object[] next = it.next();
                if (((java.lang.Long) next[com.tencent.mars.comm.DefaultAlarm.TSetData.ID.ordinal()]).longValue() == j17) {
                    cancelAlarmMgr(context, (android.app.PendingIntent) next[com.tencent.mars.comm.DefaultAlarm.TSetData.PENDINGINTENT.ordinal()]);
                    it.remove();
                    return true;
                }
            }
            return false;
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        boolean z17;
        if (context == null || intent == null) {
            return;
        }
        java.lang.Long valueOf = java.lang.Long.valueOf(intent.getLongExtra(KEXTRA_ID, 0L));
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(intent.getIntExtra(KEXTRA_PID, 0));
        if (0 == valueOf.longValue() || valueOf2.intValue() == 0) {
            return;
        }
        if (valueOf2.intValue() != android.os.Process.myPid()) {
            com.tencent.mars.xlog.Log.w(TAG, "onReceive id:%d, pid:%d, mypid:%d", valueOf, valueOf2, java.lang.Integer.valueOf(android.os.Process.myPid()));
            return;
        }
        synchronized (alarm_waiting_set) {
            try {
                java.util.Iterator<java.lang.Object[]> it = alarm_waiting_set.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z17 = false;
                        break;
                    }
                    java.lang.Object[] next = it.next();
                    java.lang.Long l17 = (java.lang.Long) next[com.tencent.mars.comm.DefaultAlarm.TSetData.ID.ordinal()];
                    com.tencent.mars.xlog.Log.i(TAG, "onReceive id=%d, curId=%d", valueOf, l17);
                    if (l17.equals(valueOf)) {
                        com.tencent.mars.xlog.Log.i(TAG, "onReceive find alarm id:%d, pid:%d, delta miss time:%d", valueOf, valueOf2, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - ((java.lang.Long) next[com.tencent.mars.comm.DefaultAlarm.TSetData.WAITTIME.ordinal()]).longValue()));
                        it.remove();
                        z17 = true;
                        break;
                    }
                }
                if (!z17) {
                    com.tencent.mars.xlog.Log.e(TAG, "onReceive not found id:%d, pid:%d, alarm_waiting_set.size:%d", valueOf, valueOf2, java.lang.Integer.valueOf(alarm_waiting_set.size()));
                }
            } catch (java.lang.Throwable th6) {
                th = th6;
                while (true) {
                    try {
                        break;
                    } catch (java.lang.Throwable th7) {
                        th = th7;
                    }
                }
                throw th;
            }
        }
        com.tencent.mars.comm.WakerLock wakerLock = wakerlock;
        if (wakerLock != null) {
            wakerLock.lock(200L);
        }
        if (z17) {
            onAlarm(valueOf.longValue());
        }
    }
}
