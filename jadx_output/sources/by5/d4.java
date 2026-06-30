package by5;

/* loaded from: classes13.dex */
public abstract class d4 {

    /* renamed from: a, reason: collision with root package name */
    public static com.tencent.xweb.v f36435a;

    /* renamed from: b, reason: collision with root package name */
    public static android.content.Context f36436b;

    public static android.content.SharedPreferences a(java.lang.String str, boolean z17) {
        if (f36435a != null) {
            com.tencent.mm.xwebutil.XWebMMkvWrapper xWebMMkvWrapper = null;
            try {
                com.tencent.mm.sdk.platformtools.o4 Q = z17 ? com.tencent.mm.sdk.platformtools.o4.Q(str) : com.tencent.mm.sdk.platformtools.o4.N(str, 2, null);
                if (Q != null) {
                    xWebMMkvWrapper = new com.tencent.mm.xwebutil.XWebMMkvWrapper(Q);
                }
            } catch (java.lang.Throwable th6) {
                by5.c4.d("XWebSharedPreferenceUtil", "getMMKVSharedPreferences, SPProvider get sp error", th6);
            }
            if (xWebMMkvWrapper != null) {
                return xWebMMkvWrapper;
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
        android.content.Context context = f36436b;
        if (context != null) {
            return context.getSharedPreferences(str, 4);
        }
        by5.c4.g("XWebSharedPreferenceUtil", "safeGetProcessSharedPreferences, application context is null");
        return null;
    }

    public static void h(android.content.Context context) {
        if (context != null) {
            f36436b = org.xwalk.core.XWalkEnvironment.b(context);
            by5.c4.f("XWebSharedPreferenceUtil", "setApplicationContext:" + f36436b);
        }
    }
}
