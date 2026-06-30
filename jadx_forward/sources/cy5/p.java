package cy5;

/* loaded from: classes13.dex */
public class p implements zx5.l0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f306426a = "";

    /* renamed from: b, reason: collision with root package name */
    public cy5.o f306427b = null;

    /* renamed from: c, reason: collision with root package name */
    public cy5.t f306428c = null;

    public static boolean a() {
        boolean z17;
        java.util.Iterator it = ((java.util.ArrayList) cy5.m.b()).iterator();
        while (true) {
            if (!it.hasNext()) {
                z17 = false;
                break;
            }
            cy5.h hVar = (cy5.h) it.next();
            if (hVar != null && cy5.b.a(hVar.m()).F(false)) {
                z17 = true;
                break;
            }
        }
        if (z17) {
            by5.c4.a("XWalkPluginUpdater", "has plugin need update, fetch plugin config first");
            return true;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        android.content.SharedPreferences g17 = by5.d4.g("xwalk_plugin_update_info");
        long j17 = 0;
        if (g17 == null) {
            by5.c4.a("XWalkPluginUpdater", "get time sp is null");
        } else {
            j17 = g17.getLong("nLastFetchPluginConfigTime", 0L);
        }
        return currentTimeMillis - j17 >= ((long) by5.e4.c()) || currentTimeMillis < j17;
    }

    public static void b(long j17) {
        android.content.SharedPreferences g17 = by5.d4.g("xwalk_plugin_update_info");
        if (g17 == null) {
            by5.c4.a("XWalkPluginUpdater", "set time sp is null");
            return;
        }
        android.content.SharedPreferences.Editor edit = g17.edit();
        edit.putLong("nLastFetchPluginConfigTime", j17);
        edit.commit();
    }

    public void c(android.content.Context context, java.util.HashMap hashMap) {
        synchronized (this) {
            cy5.t tVar = new cy5.t();
            this.f306428c = tVar;
            tVar.n(hashMap, this.f306426a, this.f306427b);
            this.f306428c.e(new java.lang.String[0]);
            this.f306426a = "";
            this.f306427b = null;
        }
    }
}
