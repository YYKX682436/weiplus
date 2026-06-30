package androidx.legacy.content;

@java.lang.Deprecated
/* loaded from: classes12.dex */
public abstract class WakefulBroadcastReceiver extends android.content.BroadcastReceiver {
    private static final java.lang.String EXTRA_WAKE_LOCK_ID = "androidx.contentpager.content.wakelockid";
    private byte _hellAccFlag_;
    private static final android.util.SparseArray<android.os.PowerManager.WakeLock> sActiveWakeLocks = new android.util.SparseArray<>();
    private static int mNextId = 1;

    public static boolean completeWakefulIntent(android.content.Intent intent) {
        int intExtra = intent.getIntExtra(EXTRA_WAKE_LOCK_ID, 0);
        if (intExtra == 0) {
            return false;
        }
        android.util.SparseArray<android.os.PowerManager.WakeLock> sparseArray = sActiveWakeLocks;
        synchronized (sparseArray) {
            android.os.PowerManager.WakeLock wakeLock = sparseArray.get(intExtra);
            if (wakeLock == null) {
                return true;
            }
            yj0.a.c(wakeLock, "androidx/legacy/content/WakefulBroadcastReceiver", "completeWakefulIntent", "(Landroid/content/Intent;)Z", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
            wakeLock.release();
            yj0.a.f(wakeLock, "androidx/legacy/content/WakefulBroadcastReceiver", "completeWakefulIntent", "(Landroid/content/Intent;)Z", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
            sparseArray.remove(intExtra);
            return true;
        }
    }

    public static android.content.ComponentName startWakefulService(android.content.Context context, android.content.Intent intent) {
        android.util.SparseArray<android.os.PowerManager.WakeLock> sparseArray = sActiveWakeLocks;
        synchronized (sparseArray) {
            int i17 = mNextId;
            int i18 = i17 + 1;
            mNextId = i18;
            if (i18 <= 0) {
                mNextId = 1;
            }
            intent.putExtra(EXTRA_WAKE_LOCK_ID, i17);
            android.content.ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            android.os.PowerManager.WakeLock newWakeLock = ((android.os.PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + startService.flattenToShortString());
            newWakeLock.setReferenceCounted(false);
            zj0.a aVar = new zj0.a();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            aVar.c(60000L);
            yj0.a.d(newWakeLock, aVar.b(), "androidx/legacy/content/WakefulBroadcastReceiver", "startWakefulService", "(Landroid/content/Context;Landroid/content/Intent;)Landroid/content/ComponentName;", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "(J)V");
            zj0.c.f473285a.set(aVar);
            long longValue = ((java.lang.Long) aVar.a(0)).longValue();
            zj0.c.a();
            newWakeLock.acquire(longValue);
            yj0.a.f(newWakeLock, "androidx/legacy/content/WakefulBroadcastReceiver", "startWakefulService", "(Landroid/content/Context;Landroid/content/Intent;)Landroid/content/ComponentName;", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "(J)V");
            sparseArray.put(i17, newWakeLock);
            return startService;
        }
    }
}
