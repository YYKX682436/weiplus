package mn1;

/* loaded from: classes12.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mn1.d f411362d;

    public c(mn1.d dVar) {
        this.f411362d = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        mn1.d dVar = this.f411362d;
        try {
            android.os.PowerManager.WakeLock wakeLock = dVar.f411369o;
            if (wakeLock == null || !wakeLock.isHeld()) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupMoveModel", "wakeLock.release()");
            android.os.PowerManager.WakeLock wakeLock2 = dVar.f411369o;
            yj0.a.c(wakeLock2, "com/tencent/mm/plugin/backup/backupmove/BackupMoveModel$3", "run", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
            wakeLock2.release();
            yj0.a.f(wakeLock2, "com/tencent/mm/plugin/backup/backupmove/BackupMoveModel$3", "run", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
        } catch (java.lang.Throwable unused) {
        }
    }
}
