package jh4;

/* loaded from: classes8.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static android.content.SharedPreferences f381386a = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.d();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f381387b = false;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f381388c = false;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f381389d = true;

    public static void a() {
        if (f381389d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DynamicBgCrashHelper", "markDrawEndPoint");
            f381386a.edit().putInt("dynamic_bg_draw_start_point_count", 0).apply();
            f381386a.edit().putBoolean("dynamic_bg_will_crash", false).apply();
            gh4.j0.c(true);
            f381389d = false;
        }
    }

    public static void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DynamicBgCrashHelper", "markInitCrash");
        gh4.j0.c(false);
        if (f381386a == null) {
            f381386a = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.d();
        }
        android.content.SharedPreferences sharedPreferences = f381386a;
        if (sharedPreferences != null) {
            sharedPreferences.edit().putBoolean("dynamic_bg_init_crash", true).apply();
        }
        f381388c = true;
    }

    public static void c() {
        if (f381386a == null) {
            f381386a = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.d();
        }
        android.content.SharedPreferences sharedPreferences = f381386a;
        if (sharedPreferences != null) {
            int i17 = sharedPreferences.getInt("dynamic_bg_init_start_point_count", 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DynamicBgCrashHelper", "markInitStartPoint current: %d", java.lang.Integer.valueOf(i17));
            if (i17 > 2) {
                gh4.j0.c(false);
                f381386a.edit().putBoolean("dynamic_bg_will_crash", true).apply();
            }
            f381386a.edit().putInt("dynamic_bg_init_start_point_count", i17 + 1).apply();
        }
    }

    public static void d() {
        android.content.SharedPreferences.Editor edit;
        android.content.SharedPreferences sharedPreferences = f381386a;
        if (sharedPreferences != null && (edit = sharedPreferences.edit()) != null) {
            edit.putInt("dynamic_bg_init_start_point_count", 0);
            edit.putInt("dynamic_bg_draw_start_point_count", 0);
            edit.putBoolean("dynamic_bg_init_crash", false);
            edit.putBoolean("dynamic_bg_will_crash", false);
            edit.apply();
        }
        f381388c = false;
        f381387b = false;
    }
}
