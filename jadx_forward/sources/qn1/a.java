package qn1;

/* loaded from: classes12.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qn1.c f446466d;

    public a(qn1.c cVar) {
        this.f446466d = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        qn1.c cVar = this.f446466d;
        try {
            if (cVar.f446477o == null) {
                cVar.f446477o = ((android.os.PowerManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("power")).newWakeLock(26, "BackupPc Lock");
            }
            if (cVar.f446477o.isHeld()) {
                return;
            }
            android.os.PowerManager.WakeLock wakeLock = cVar.f446477o;
            yj0.a.c(wakeLock, "com/tencent/mm/plugin/backup/backuppcmove/BackupPcModel$1", "run", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
            wakeLock.acquire();
            yj0.a.f(wakeLock, "com/tencent/mm/plugin/backup/backuppcmove/BackupPcModel$1", "run", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
        } catch (java.lang.Throwable unused) {
        }
    }
}
