package ep;

/* loaded from: classes11.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static int f337131a;

    public static boolean a() {
        if (f337131a == 0) {
            android.content.SharedPreferences d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.d();
            if (d17 == null || !d17.getBoolean("settings_support_swipe", true)) {
                f337131a = 2;
            } else {
                f337131a = 1;
            }
        }
        return f337131a == 1;
    }

    public static void b(boolean z17) {
        android.content.SharedPreferences d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.d();
        boolean z18 = d17.getBoolean("settings_support_swipe", true);
        if (z18 != z17) {
            d17.edit().putBoolean("settings_support_swipe", z17).commit();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StyleUtil", "switchSwipebackMode, from %B to %B", java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(z17));
    }
}
