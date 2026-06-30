package by5;

/* loaded from: classes13.dex */
public abstract class d4 {

    /* renamed from: a, reason: collision with root package name */
    public static com.p314xaae8f345.p3210x3857dc.v f117968a;

    /* renamed from: b, reason: collision with root package name */
    public static android.content.Context f117969b;

    public static android.content.SharedPreferences a(java.lang.String str, boolean z17) {
        if (f117968a != null) {
            com.p314xaae8f345.mm.p2829xfa87f9de.SharedPreferencesC22989x9116e5ac sharedPreferencesC22989x9116e5ac = null;
            try {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 Q = z17 ? com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.Q(str) : com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.N(str, 2, null);
                if (Q != null) {
                    sharedPreferencesC22989x9116e5ac = new com.p314xaae8f345.mm.p2829xfa87f9de.SharedPreferencesC22989x9116e5ac(Q);
                }
            } catch (java.lang.Throwable th6) {
                by5.c4.d("XWebSharedPreferenceUtil", "getMMKVSharedPreferences, SPProvider get sp error", th6);
            }
            if (sharedPreferencesC22989x9116e5ac != null) {
                return sharedPreferencesC22989x9116e5ac;
            }
            by5.c4.g("XWebSharedPreferenceUtil", "getMMKVSharedPreferences, get null from SPProvider");
            by5.s0.d(176L, 1);
        } else {
            by5.s0.d(177L, 1);
        }
        return g(str);
    }

    public static android.content.SharedPreferences b() {
        return g("xwalk_reader_record");
    }

    public static android.content.SharedPreferences c() {
        return g("xweb_multi_process");
    }

    public static android.content.SharedPreferences d(java.lang.String str) {
        return g("xwalk_plugin_version_info_" + str);
    }

    public static android.content.SharedPreferences e() {
        return g("xweb_debug");
    }

    public static android.content.SharedPreferences f() {
        return g("libxwalkcore");
    }

    public static android.content.SharedPreferences g(java.lang.String str) {
        android.content.Context context = f117969b;
        if (context != null) {
            return context.getSharedPreferences(str, 4);
        }
        by5.c4.g("XWebSharedPreferenceUtil", "safeGetProcessSharedPreferences, application context is null");
        return null;
    }

    public static void h(android.content.Context context) {
        if (context != null) {
            f117969b = org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.b(context);
            by5.c4.f("XWebSharedPreferenceUtil", "setApplicationContext:" + f117969b);
        }
    }
}
