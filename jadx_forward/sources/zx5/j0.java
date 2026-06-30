package zx5;

/* loaded from: classes13.dex */
public abstract class j0 {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f558779a;

    /* renamed from: b, reason: collision with root package name */
    public static long f558780b;

    public static synchronized void a() {
        synchronized (zx5.j0.class) {
            if (!f558779a) {
                by5.c4.a("XWebUpdateLocker", "updating progress not started");
                return;
            }
            f558779a = false;
            f558780b = java.lang.System.currentTimeMillis();
            android.content.SharedPreferences.Editor edit = by5.d4.a("XWEB_UPDATING_TAG", false).edit();
            edit.remove("UpdatingProcessId");
            edit.commit();
            by5.c4.a("XWebUpdateLocker", "finish updating progress");
        }
    }

    public static synchronized boolean b() {
        synchronized (zx5.j0.class) {
            if (f558779a) {
                by5.c4.a("XWebUpdateLocker", "already in updating progress");
                return true;
            }
            android.content.SharedPreferences a17 = by5.d4.a("XWEB_UPDATING_TAG", false);
            int i17 = a17.getInt("UpdatingProcessId", -1);
            if (i17 == android.os.Process.myPid()) {
                by5.c4.a("XWebUpdateLocker", "current process(" + i17 + ") is in updating progress");
                return true;
            }
            if (i17 < 0) {
                return false;
            }
            android.app.ActivityManager activityManager = (android.app.ActivityManager) org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f429503c.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100);
            if (activityManager != null && activityManager.getRunningAppProcesses() != null) {
                int myUid = android.os.Process.myUid();
                java.util.Iterator<android.app.ActivityManager.RunningAppProcessInfo> it = activityManager.getRunningAppProcesses().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    android.app.ActivityManager.RunningAppProcessInfo next = it.next();
                    if (next.pid == i17) {
                        if (next.uid == myUid) {
                            by5.c4.a("XWebUpdateLocker", "other process(" + i17 + ") is in updating progress");
                            return true;
                        }
                    }
                }
                android.content.SharedPreferences.Editor edit = a17.edit();
                edit.remove("UpdatingProcessId");
                edit.commit();
                return false;
            }
            return false;
        }
    }

    public static synchronized boolean c() {
        synchronized (zx5.j0.class) {
            if (b()) {
                by5.c4.a("XWebUpdateLocker", "already in updating progress");
                return false;
            }
            f558779a = true;
            int myPid = android.os.Process.myPid();
            android.content.SharedPreferences.Editor edit = by5.d4.a("XWEB_UPDATING_TAG", false).edit();
            edit.putInt("UpdatingProcessId", myPid);
            edit.putLong("Start_Time", java.lang.System.currentTimeMillis());
            edit.commit();
            by5.c4.a("XWebUpdateLocker", "start updating progress");
            return true;
        }
    }
}
