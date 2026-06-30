package z2;

/* loaded from: classes7.dex */
public abstract class n {
    public static void a(android.app.AlarmManager alarmManager, int i17, long j17, android.app.PendingIntent pendingIntent) {
        alarmManager.setAndAllowWhileIdle(i17, j17, pendingIntent);
    }

    public static void b(android.app.AlarmManager alarmManager, int i17, long j17, android.app.PendingIntent pendingIntent) {
        zj0.a aVar = new zj0.a();
        aVar.c(pendingIntent);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        aVar.c(java.lang.Long.valueOf(j17));
        aVar.c(java.lang.Integer.valueOf(i17));
        yj0.a.d(alarmManager, aVar.b(), "androidx/core/app/AlarmManagerCompat$Api23Impl", "setExactAndAllowWhileIdle", "(Landroid/app/AlarmManager;IJLandroid/app/PendingIntent;)V", "android/app/AlarmManager_EXEC_", "setExactAndAllowWhileIdle", "(IJLandroid/app/PendingIntent;)V");
        int intValue = ((java.lang.Integer) aVar.a(0)).intValue();
        zj0.c.f554818a.set(aVar);
        alarmManager.setExactAndAllowWhileIdle(intValue, ((java.lang.Long) aVar.a(1)).longValue(), (android.app.PendingIntent) zj0.c.a().a(2));
        yj0.a.f(alarmManager, "androidx/core/app/AlarmManagerCompat$Api23Impl", "setExactAndAllowWhileIdle", "(Landroid/app/AlarmManager;IJLandroid/app/PendingIntent;)V", "android/app/AlarmManager_EXEC_", "setExactAndAllowWhileIdle", "(IJLandroid/app/PendingIntent;)V");
    }
}
