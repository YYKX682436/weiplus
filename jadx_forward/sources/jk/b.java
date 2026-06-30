package jk;

/* loaded from: classes11.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static jk.a f381578a;

    /* renamed from: b, reason: collision with root package name */
    public static int f381579b;

    public static void a(android.content.Context context, int i17, android.app.PendingIntent pendingIntent) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = pendingIntent != null ? "no null" : "null";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AlarmHelper", "cancel(requestCode:%s operation:%s)", objArr);
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AlarmHelper", "cancel(requestCode:%s): context == null", java.lang.Integer.valueOf(i17));
            return;
        }
        android.app.AlarmManager alarmManager = (android.app.AlarmManager) context.getSystemService("alarm");
        if (alarmManager == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AlarmHelper", "cancel(requestCode:%s): am == null", java.lang.Integer.valueOf(i17));
            return;
        }
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(pendingIntent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(alarmManager, arrayList.toArray(), "com/tencent/mm/alarm/AlarmHelper", "cancel", "(Landroid/content/Context;ILandroid/app/PendingIntent;)V", "android/app/AlarmManager_EXEC_", "cancel", "(Landroid/app/PendingIntent;)V");
            alarmManager.cancel((android.app.PendingIntent) arrayList.get(0));
            yj0.a.f(alarmManager, "com/tencent/mm/alarm/AlarmHelper", "cancel", "(Landroid/content/Context;ILandroid/app/PendingIntent;)V", "android/app/AlarmManager_EXEC_", "cancel", "(Landroid/app/PendingIntent;)V");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AlarmHelper", "cancel Exception:%s %s", e17.getClass().getSimpleName(), e17.getMessage());
            jk.a aVar = f381578a;
            if (aVar != null) {
                ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.a) aVar).b(i17, 2, c());
            }
        }
    }

    public static android.app.PendingIntent b(android.content.Context context, int i17, android.content.Intent intent, int i18, boolean z17) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        boolean z18 = false;
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = intent != null ? intent : "null";
        objArr[2] = java.lang.Integer.valueOf(i18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AlarmHelper", "getPendingIntent(requestCode:%s intent:%s flags:%s)", objArr);
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AlarmHelper", "getPendingIntent(requestCode:%s): context == null", java.lang.Integer.valueOf(i17));
            return null;
        }
        if (i17 >= 100 && i17 <= 120) {
            z18 = true;
        }
        if (z18) {
            return z17 ? android.app.PendingIntent.getBroadcast(context, i17, intent, fp.g0.a(i18)) : android.app.PendingIntent.getActivity(context, i17, intent, fp.g0.a(i18));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AlarmHelper", "getPendingIntent(requestCode:%s): requestCode invalid", java.lang.Integer.valueOf(i17));
        return null;
    }

    public static java.lang.String c() {
        jk.a aVar = f381578a;
        if (aVar != null) {
            return ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.a) aVar).a();
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true);
    }

    public static android.app.PendingIntent d(android.content.Context context, int i17, int i18, long j17, android.content.Intent intent, int i19, boolean z17) {
        java.lang.Object[] objArr = new java.lang.Object[6];
        objArr[0] = java.lang.Integer.valueOf(i18);
        objArr[1] = java.lang.Integer.valueOf(i17);
        objArr[2] = java.lang.Long.valueOf(j17);
        objArr[3] = intent != null ? intent : "null";
        objArr[4] = java.lang.Integer.valueOf(i19);
        objArr[5] = c();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AlarmHelper", "set(type:%s requestCode:%s triggerAtMillis:%s intent:%s flags:%s stack:%s)", objArr);
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AlarmHelper", "set(requestCode:%s): context == null", java.lang.Integer.valueOf(i17));
            return null;
        }
        android.app.AlarmManager alarmManager = (android.app.AlarmManager) context.getSystemService("alarm");
        if (alarmManager == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AlarmHelper", "set(requestCode:%s): am == null", java.lang.Integer.valueOf(i17));
            return null;
        }
        if (!(i17 >= 100 && i17 <= 120)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AlarmHelper", "set(requestCode:%s): requestCode invalid", java.lang.Integer.valueOf(i17));
            return null;
        }
        android.app.PendingIntent broadcast = z17 ? android.app.PendingIntent.getBroadcast(context, i17, intent, fp.g0.a(i19)) : android.app.PendingIntent.getActivity(context, i17, intent, fp.g0.a(i19));
        try {
            zj0.a aVar = new zj0.a();
            aVar.c(broadcast);
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            aVar.c(java.lang.Long.valueOf(j17));
            aVar.c(java.lang.Integer.valueOf(i18));
            yj0.a.d(alarmManager, aVar.b(), "com/tencent/mm/alarm/AlarmHelper", "set", "(Landroid/content/Context;IIJLandroid/content/Intent;IZ)Landroid/app/PendingIntent;", "android/app/AlarmManager_EXEC_", "set", "(IJLandroid/app/PendingIntent;)V");
            int intValue = ((java.lang.Integer) aVar.a(0)).intValue();
            zj0.c.f554818a.set(aVar);
            alarmManager.set(intValue, ((java.lang.Long) aVar.a(1)).longValue(), (android.app.PendingIntent) zj0.c.a().a(2));
            yj0.a.f(alarmManager, "com/tencent/mm/alarm/AlarmHelper", "set", "(Landroid/content/Context;IIJLandroid/content/Intent;IZ)Landroid/app/PendingIntent;", "android/app/AlarmManager_EXEC_", "set", "(IJLandroid/app/PendingIntent;)V");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AlarmHelper", "set Exception:%s %s", e17.getClass().getSimpleName(), e17.getMessage());
            jk.a aVar2 = f381578a;
            if (aVar2 != null) {
                ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.a) aVar2).b(i17, 1, c());
            }
        }
        return broadcast;
    }

    public static android.app.PendingIntent e(android.content.Context context, int i17, int i18, long j17, long j18, android.content.Intent intent, int i19) {
        java.lang.Object[] objArr = new java.lang.Object[7];
        objArr[0] = java.lang.Integer.valueOf(i18);
        objArr[1] = java.lang.Integer.valueOf(i17);
        objArr[2] = java.lang.Long.valueOf(j17);
        objArr[3] = java.lang.Long.valueOf(j18);
        objArr[4] = intent != null ? intent : "null";
        objArr[5] = java.lang.Integer.valueOf(i19);
        objArr[6] = c();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AlarmHelper", "setRepeating(type:%s requestCode:%s triggerAtMillis:%s intervalMillis:%s intent:%s flags:%s stack:%s)", objArr);
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AlarmHelper", "setRepeating(requestCode:%s): context == null", java.lang.Integer.valueOf(i17));
        } else {
            android.app.AlarmManager alarmManager = (android.app.AlarmManager) context.getSystemService("alarm");
            if (alarmManager == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AlarmHelper", "setRepeating(requestCode:%s): am == null", java.lang.Integer.valueOf(i17));
            } else {
                if (i17 >= 100 && i17 <= 120) {
                    android.app.PendingIntent broadcast = android.app.PendingIntent.getBroadcast(context, i17, intent, fp.g0.a(i19));
                    try {
                        zj0.a aVar = new zj0.a();
                        aVar.c(broadcast);
                        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                        aVar.c(java.lang.Long.valueOf(j18));
                        aVar.c(java.lang.Long.valueOf(j17));
                        aVar.c(java.lang.Integer.valueOf(i18));
                        yj0.a.d(alarmManager, aVar.b(), "com/tencent/mm/alarm/AlarmHelper", "setRepeating", "(Landroid/content/Context;IIJJLandroid/content/Intent;IZ)Landroid/app/PendingIntent;", "android/app/AlarmManager_EXEC_", "setRepeating", "(IJJLandroid/app/PendingIntent;)V");
                        int intValue = ((java.lang.Integer) aVar.a(0)).intValue();
                        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                        threadLocal2.set(aVar);
                        long longValue = ((java.lang.Long) aVar.a(1)).longValue();
                        zj0.a a17 = zj0.c.a();
                        threadLocal2.set(a17);
                        alarmManager.setRepeating(intValue, longValue, ((java.lang.Long) a17.a(2)).longValue(), (android.app.PendingIntent) zj0.c.a().a(3));
                        yj0.a.f(alarmManager, "com/tencent/mm/alarm/AlarmHelper", "setRepeating", "(Landroid/content/Context;IIJJLandroid/content/Intent;IZ)Landroid/app/PendingIntent;", "android/app/AlarmManager_EXEC_", "setRepeating", "(IJJLandroid/app/PendingIntent;)V");
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AlarmHelper", "setRepeating Exception:%s %s", e17.getClass().getSimpleName(), e17.getMessage());
                        jk.a aVar2 = f381578a;
                        if (aVar2 != null) {
                            ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.a) aVar2).b(i17, 1, c());
                        }
                    }
                    return broadcast;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AlarmHelper", "setRepeating(requestCode:%s): requestCode invalid", java.lang.Integer.valueOf(i17));
            }
        }
        return null;
    }
}
