package mn1;

/* loaded from: classes12.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mn1.d f411360d;

    public b(mn1.d dVar) {
        this.f411360d = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        mn1.d dVar = this.f411360d;
        try {
            if (dVar.f411369o == null) {
                dVar.f411369o = ((android.os.PowerManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("power")).newWakeLock(26, "BackupMove Lock");
            }
            if (dVar.f411369o.isHeld()) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupMoveModel", "wakeLock.acquire()");
            android.os.PowerManager.WakeLock wakeLock = dVar.f411369o;
            yj0.a.c(wakeLock, "com/tencent/mm/plugin/backup/backupmove/BackupMoveModel$2", "run", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
            wakeLock.acquire();
            yj0.a.f(wakeLock, "com/tencent/mm/plugin/backup/backupmove/BackupMoveModel$2", "run", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
        } catch (java.lang.Throwable unused) {
        }
    }
}
