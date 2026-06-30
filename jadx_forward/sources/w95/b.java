package w95;

/* loaded from: classes11.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public android.os.PowerManager.WakeLock f525609a;

    /* renamed from: b, reason: collision with root package name */
    public android.net.wifi.WifiManager.WifiLock f525610b;

    public void a() {
        try {
            android.os.PowerManager.WakeLock wakeLock = this.f525609a;
            if (wakeLock != null && wakeLock.isHeld()) {
                android.os.PowerManager.WakeLock wakeLock2 = this.f525609a;
                yj0.a.c(wakeLock2, "com/tencent/mm/toolkit/downloader/DownloadPerformerImpl$Locker", "release", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
                wakeLock2.release();
                yj0.a.f(wakeLock2, "com/tencent/mm/toolkit/downloader/DownloadPerformerImpl$Locker", "release", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
            }
            android.net.wifi.WifiManager.WifiLock wifiLock = this.f525610b;
            if (wifiLock == null || !wifiLock.isHeld()) {
                return;
            }
            this.f525610b.release();
        } catch (java.lang.Throwable unused) {
        }
    }
}
