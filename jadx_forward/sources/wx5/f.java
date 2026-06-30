package wx5;

/* loaded from: classes13.dex */
public abstract class f {
    public static void a(java.lang.String str) {
        by5.c4.f("XWebRemoteDebugHandler", "startRemoteDebug, process:" + org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.m156976xe5e58464() + ", token:" + str);
        if (android.text.TextUtils.isEmpty(str)) {
            by5.c4.g("XWebRemoteDebugHandler", "startRemoteDebug, invalid token");
        } else if (by5.a1.c()) {
            by5.c4.f("XWebRemoteDebugHandler", "startRemoteDebug, main process ignored");
        } else {
            tx5.j.d(80033, new java.lang.Object[]{str});
        }
    }
}
