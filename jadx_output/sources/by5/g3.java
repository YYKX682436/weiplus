package by5;

/* loaded from: classes13.dex */
public class g3 implements qx5.j {
    @Override // qx5.j
    public qx5.a a(android.content.Context context, android.net.Uri uri, qx5.l lVar) {
        synchronized (com.tencent.xweb.t1.class) {
            by5.c4.f("XWebChildProcessMonitor", "resetCrashCount");
            android.content.SharedPreferences c17 = by5.d4.c();
            if (c17 != null) {
                c17.edit().remove(com.tencent.xweb.t1.e()).apply();
                c17.edit().remove("SP_KEY_LAST_DISABLE_START_TIME").apply();
                c17.edit().remove("SP_KEY_CHILD_PROCESS_CRASH_KEY").apply();
            }
        }
        return qx5.a.b();
    }
}
