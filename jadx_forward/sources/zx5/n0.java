package zx5;

/* loaded from: classes13.dex */
public abstract class n0 {

    /* renamed from: a, reason: collision with root package name */
    public static final zx5.m0 f558785a = new zx5.i0();

    /* renamed from: b, reason: collision with root package name */
    public static final zx5.l0 f558786b = new cy5.p();

    public static boolean a() {
        if (by5.d4.f117969b == null) {
            by5.c4.g("XWebUpdater", "checkUpdateTimeThreshold, init xweb environment first");
            return false;
        }
        long j17 = by5.d4.g("UPDATEINFOTAG").getLong("last_check_update_time", 0L);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long m17 = by5.l0.m();
        by5.c4.f("XWebUpdater", "checkUpdateTimeThreshold, timeThreshold=" + m17 + ", lastCheckTime=" + j17 + ", currentTime=" + currentTimeMillis);
        if (com.p314xaae8f345.p3210x3857dc.a3.f(org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f429503c) <= 0 || java.lang.Math.abs(currentTimeMillis - j17) >= m17) {
            return true;
        }
        by5.c4.g("XWebUpdater", "checkUpdateTimeThreshold, check too fast");
        return false;
    }

    public static void b(android.content.Context context, java.util.HashMap hashMap) {
        com.p314xaae8f345.p3210x3857dc.n1 n1Var = by5.s0.f118128c;
        if (n1Var != null) {
            n1Var.b(577L, 180L, 1L);
        }
        by5.c4.f("XWebUpdater", "startCheck, start check plugin update");
        zx5.l0 l0Var = f558786b;
        cy5.p pVar = (cy5.p) l0Var;
        pVar.f306426a = "";
        pVar.f306427b = null;
        ((cy5.p) l0Var).c(context, hashMap);
    }
}
