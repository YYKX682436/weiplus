package p012xc85e97e9.p090xbe0af3c9.p091x38b73479;

@java.lang.Deprecated
/* renamed from: androidx.legacy.content.WakefulBroadcastReceiver */
/* loaded from: classes12.dex */
public abstract class AbstractC1111x43921d97 extends android.content.BroadcastReceiver {

    /* renamed from: EXTRA_WAKE_LOCK_ID */
    private static final java.lang.String f3532x1cbd1d03 = "androidx.contentpager.content.wakelockid";

    /* renamed from: _hellAccFlag_ */
    private byte f3535x7f11beae;

    /* renamed from: sActiveWakeLocks */
    private static final android.util.SparseArray<android.os.PowerManager.WakeLock> f3534x482c500b = new android.util.SparseArray<>();

    /* renamed from: mNextId */
    private static int f3533x10e8ca3b = 1;

    /* renamed from: completeWakefulIntent */
    public static boolean m7784xb060689c(android.content.Intent intent) {
        int intExtra = intent.getIntExtra(f3532x1cbd1d03, 0);
        if (intExtra == 0) {
            return false;
        }
        android.util.SparseArray<android.os.PowerManager.WakeLock> sparseArray = f3534x482c500b;
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

    /* renamed from: startWakefulService */
    public static android.content.ComponentName m7785xce72c1e(android.content.Context context, android.content.Intent intent) {
        android.util.SparseArray<android.os.PowerManager.WakeLock> sparseArray = f3534x482c500b;
        synchronized (sparseArray) {
            int i17 = f3533x10e8ca3b;
            int i18 = i17 + 1;
            f3533x10e8ca3b = i18;
            if (i18 <= 0) {
                f3533x10e8ca3b = 1;
            }
            intent.putExtra(f3532x1cbd1d03, i17);
            android.content.ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            android.os.PowerManager.WakeLock newWakeLock = ((android.os.PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + startService.flattenToShortString());
            newWakeLock.setReferenceCounted(false);
            zj0.a aVar = new zj0.a();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            aVar.c(60000L);
            yj0.a.d(newWakeLock, aVar.b(), "androidx/legacy/content/WakefulBroadcastReceiver", "startWakefulService", "(Landroid/content/Context;Landroid/content/Intent;)Landroid/content/ComponentName;", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "(J)V");
            zj0.c.f554818a.set(aVar);
            long longValue = ((java.lang.Long) aVar.a(0)).longValue();
            zj0.c.a();
            newWakeLock.acquire(longValue);
            yj0.a.f(newWakeLock, "androidx/legacy/content/WakefulBroadcastReceiver", "startWakefulService", "(Landroid/content/Context;Landroid/content/Intent;)Landroid/content/ComponentName;", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "(J)V");
            sparseArray.put(i17, newWakeLock);
            return startService;
        }
    }
}
