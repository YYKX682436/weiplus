package ko3;

/* loaded from: classes5.dex */
public abstract class i0 {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f391506a;

    static {
        long nanoTime = java.lang.System.nanoTime();
        try {
            try {
                f391506a = false;
                java.lang.reflect.Field declaredField = android.app.ActivityManager.RecentTaskInfo.class.getDeclaredField("instanceId");
                declaredField.setAccessible(true);
                java.util.List<android.app.ActivityManager.RecentTaskInfo> recentTasks = ((android.app.ActivityManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getApplicationContext().getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100)).getRecentTasks(1, 2);
                if (recentTasks != null && recentTasks.size() != 0) {
                    if (declaredField.getInt(recentTasks.get(0)) > 0) {
                        f391506a = true;
                    }
                }
                f391506a = false;
            } finally {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NormalMsgSource.QSDTH", "QSDT, result: %b, time: %d ns", java.lang.Boolean.valueOf(f391506a), java.lang.Long.valueOf(java.lang.System.nanoTime() - nanoTime));
            }
        } catch (java.lang.Throwable unused) {
            f391506a = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NormalMsgSource.QSDTH", "QSDT, result: %b, time: %d ns", false, java.lang.Long.valueOf(java.lang.System.nanoTime() - nanoTime));
        }
    }
}
