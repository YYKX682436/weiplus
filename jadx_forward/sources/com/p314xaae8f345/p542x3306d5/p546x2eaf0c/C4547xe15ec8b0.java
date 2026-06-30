package com.p314xaae8f345.p542x3306d5.p546x2eaf0c;

/* renamed from: com.tencent.mars.comm.DefaultAlarm */
/* loaded from: classes12.dex */
public class C4547xe15ec8b0 extends android.content.BroadcastReceiver {

    /* renamed from: KEXTRA_ID */
    private static final java.lang.String f19224x32db9115 = "ID";

    /* renamed from: KEXTRA_PID */
    private static final java.lang.String f19225x2896acb1 = "PID";
    private static final java.lang.String TAG = "MicroMsg.Alarm";

    /* renamed from: alarm_waiting_set */
    private static java.util.TreeSet<java.lang.Object[]> f19226xdfbc7a82 = new java.util.TreeSet<>(new com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4547xe15ec8b0.ComparatorAlarm());

    /* renamed from: bc_alarm */
    private static com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4547xe15ec8b0 f19227xe0e1f4d3;

    /* renamed from: wakerlock */
    private static com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4559x8e92a579 f19228x172f1179;

    /* renamed from: _hellAccFlag_ */
    private byte f19229x7f11beae;

    /* renamed from: com.tencent.mars.comm.DefaultAlarm$ComparatorAlarm */
    /* loaded from: classes12.dex */
    public static class ComparatorAlarm implements java.util.Comparator<java.lang.Object[]> {
        private ComparatorAlarm() {
        }

        @Override // java.util.Comparator
        public int compare(java.lang.Object[] objArr, java.lang.Object[] objArr2) {
            com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4547xe15ec8b0.TSetData tSetData = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4547xe15ec8b0.TSetData.ID;
            return (int) (((java.lang.Long) objArr[tSetData.ordinal()]).longValue() - ((java.lang.Long) objArr2[tSetData.ordinal()]).longValue());
        }
    }

    /* renamed from: com.tencent.mars.comm.DefaultAlarm$TSetData */
    /* loaded from: classes12.dex */
    public enum TSetData {
        ID,
        WAITTIME,
        PENDINGINTENT
    }

    /* renamed from: cancelAlarmMgr */
    private static boolean m39975xe655bea1(android.content.Context context, android.app.PendingIntent pendingIntent) {
        android.app.AlarmManager alarmManager = (android.app.AlarmManager) context.getSystemService("alarm");
        if (alarmManager == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "am == null");
            return false;
        }
        if (pendingIntent == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "pendingIntent == null");
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

    /* renamed from: onAlarm */
    private native void m39976xaf4f4fb2(long j17);

    /* renamed from: resetAlarm */
    public static void m39977x9a696642(android.content.Context context) {
        synchronized (f19226xdfbc7a82) {
            java.util.Iterator<java.lang.Object[]> it = f19226xdfbc7a82.iterator();
            while (it.hasNext()) {
                m39975xe655bea1(context, (android.app.PendingIntent) it.next()[com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4547xe15ec8b0.TSetData.PENDINGINTENT.ordinal()]);
            }
            f19226xdfbc7a82.clear();
            com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4547xe15ec8b0 c4547xe15ec8b0 = f19227xe0e1f4d3;
            if (c4547xe15ec8b0 != null) {
                context.unregisterReceiver(c4547xe15ec8b0);
                f19227xe0e1f4d3 = null;
            }
        }
    }

    /* renamed from: setAlarmMgr */
    private static android.app.PendingIntent m39978xd004e489(long j17, long j18, android.content.Context context) {
        android.app.AlarmManager alarmManager = (android.app.AlarmManager) context.getSystemService("alarm");
        if (alarmManager == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "am == null");
            return null;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setAction("ALARM_ACTION(" + java.lang.String.valueOf(android.os.Process.myPid()) + ")");
        intent.putExtra(f19224x32db9115, j17);
        intent.putExtra(f19225x2896acb1, android.os.Process.myPid());
        android.app.PendingIntent broadcast = android.app.PendingIntent.getBroadcast(context, (int) j17, intent, 268435456);
        zj0.a aVar = new zj0.a();
        aVar.c(broadcast);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        aVar.c(java.lang.Long.valueOf(j18));
        aVar.c(2);
        yj0.a.d(alarmManager, aVar.b(), "com/tencent/mars/comm/DefaultAlarm", "setAlarmMgr", "(JJLandroid/content/Context;)Landroid/app/PendingIntent;", "android/app/AlarmManager_EXEC_", "setExact", "(IJLandroid/app/PendingIntent;)V");
        int intValue = ((java.lang.Integer) aVar.a(0)).intValue();
        zj0.c.f554818a.set(aVar);
        alarmManager.setExact(intValue, ((java.lang.Long) aVar.a(1)).longValue(), (android.app.PendingIntent) zj0.c.a().a(2));
        yj0.a.f(alarmManager, "com/tencent/mars/comm/DefaultAlarm", "setAlarmMgr", "(JJLandroid/content/Context;)Landroid/app/PendingIntent;", "android/app/AlarmManager_EXEC_", "setExact", "(IJLandroid/app/PendingIntent;)V");
        return broadcast;
    }

    /* renamed from: start */
    public static boolean m39979x68ac462(long j17, int i17, android.content.Context context) {
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        if (i17 < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "id:%d, after:%d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17));
            return false;
        }
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "null==context, id:%d, after:%d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17));
            return false;
        }
        synchronized (f19226xdfbc7a82) {
            if (f19228x172f1179 == null) {
                f19228x172f1179 = new com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4559x8e92a579(context);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "start new wakerlock");
            }
            if (f19227xe0e1f4d3 == null) {
                com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4547xe15ec8b0 c4547xe15ec8b0 = new com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4547xe15ec8b0();
                f19227xe0e1f4d3 = c4547xe15ec8b0;
                context.registerReceiver(c4547xe15ec8b0, new android.content.IntentFilter("ALARM_ACTION(" + java.lang.String.valueOf(android.os.Process.myPid()) + ")"));
            }
            java.util.Iterator<java.lang.Object[]> it = f19226xdfbc7a82.iterator();
            while (it.hasNext()) {
                if (((java.lang.Long) it.next()[com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4547xe15ec8b0.TSetData.ID.ordinal()]).longValue() == j17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "id exist=%d", java.lang.Long.valueOf(j17));
                    return false;
                }
            }
            if (i17 >= 0) {
                elapsedRealtime += i17;
            }
            android.app.PendingIntent m39978xd004e489 = m39978xd004e489(j17, elapsedRealtime, context);
            if (m39978xd004e489 == null) {
                return false;
            }
            f19226xdfbc7a82.add(new java.lang.Object[]{java.lang.Long.valueOf(j17), java.lang.Long.valueOf(elapsedRealtime), m39978xd004e489});
            return true;
        }
    }

    /* renamed from: stop */
    public static boolean m39980x360802(long j17, android.content.Context context) {
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "context==null");
            return false;
        }
        synchronized (f19226xdfbc7a82) {
            if (f19228x172f1179 == null) {
                f19228x172f1179 = new com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4559x8e92a579(context);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "stop new wakerlock");
            }
            if (f19227xe0e1f4d3 == null) {
                f19227xe0e1f4d3 = new com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4547xe15ec8b0();
                context.registerReceiver(f19227xe0e1f4d3, new android.content.IntentFilter());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "stop new Alarm");
            }
            java.util.Iterator<java.lang.Object[]> it = f19226xdfbc7a82.iterator();
            while (it.hasNext()) {
                java.lang.Object[] next = it.next();
                if (((java.lang.Long) next[com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4547xe15ec8b0.TSetData.ID.ordinal()]).longValue() == j17) {
                    m39975xe655bea1(context, (android.app.PendingIntent) next[com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4547xe15ec8b0.TSetData.PENDINGINTENT.ordinal()]);
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
        java.lang.Long valueOf = java.lang.Long.valueOf(intent.getLongExtra(f19224x32db9115, 0L));
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(intent.getIntExtra(f19225x2896acb1, 0));
        if (0 == valueOf.longValue() || valueOf2.intValue() == 0) {
            return;
        }
        if (valueOf2.intValue() != android.os.Process.myPid()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(TAG, "onReceive id:%d, pid:%d, mypid:%d", valueOf, valueOf2, java.lang.Integer.valueOf(android.os.Process.myPid()));
            return;
        }
        synchronized (f19226xdfbc7a82) {
            try {
                java.util.Iterator<java.lang.Object[]> it = f19226xdfbc7a82.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z17 = false;
                        break;
                    }
                    java.lang.Object[] next = it.next();
                    java.lang.Long l17 = (java.lang.Long) next[com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4547xe15ec8b0.TSetData.ID.ordinal()];
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "onReceive id=%d, curId=%d", valueOf, l17);
                    if (l17.equals(valueOf)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "onReceive find alarm id:%d, pid:%d, delta miss time:%d", valueOf, valueOf2, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - ((java.lang.Long) next[com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4547xe15ec8b0.TSetData.WAITTIME.ordinal()]).longValue()));
                        it.remove();
                        z17 = true;
                        break;
                    }
                }
                if (!z17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "onReceive not found id:%d, pid:%d, alarm_waiting_set.size:%d", valueOf, valueOf2, java.lang.Integer.valueOf(f19226xdfbc7a82.size()));
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
        com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4559x8e92a579 c4559x8e92a579 = f19228x172f1179;
        if (c4559x8e92a579 != null) {
            c4559x8e92a579.mo40014x32c52b(200L);
        }
        if (z17) {
            m39976xaf4f4fb2(valueOf.longValue());
        }
    }
}
