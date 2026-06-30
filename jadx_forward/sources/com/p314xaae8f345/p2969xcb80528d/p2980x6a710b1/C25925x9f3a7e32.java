package com.p314xaae8f345.p2969xcb80528d.p2980x6a710b1;

/* renamed from: com.tencent.tavkit.utils.BenchUtil */
/* loaded from: classes.dex */
public class C25925x9f3a7e32 {
    private static final java.lang.String TAG = "BenchUtil";

    /* renamed from: startTimeMap */
    private static java.util.Map<java.lang.String, java.lang.Long> f49092xa9ab4c8d = new java.util.HashMap();

    /* renamed from: endTimeMap */
    private static java.util.Map<java.lang.String, java.lang.Long> f49091xbf3e3df4 = new java.util.HashMap();

    /* renamed from: ENABLE_DEBUG */
    public static boolean f49090x6fbcac77 = false;

    /* renamed from: benchEnd */
    public static long m98834x6461108b(java.lang.String str) {
        java.util.Map<java.lang.String, java.lang.Long> map;
        java.lang.Long l17;
        if (!f49090x6fbcac77 || android.text.TextUtils.isEmpty(str) || (map = f49092xa9ab4c8d) == null || (l17 = map.get(str)) == null) {
            return 0L;
        }
        return java.lang.System.currentTimeMillis() - l17.longValue();
    }

    /* renamed from: benchStart */
    public static void m98835xd1272012(java.lang.String str) {
        if (!f49090x6fbcac77 || android.text.TextUtils.isEmpty(str)) {
            return;
        }
        f49092xa9ab4c8d.put(str, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
    }

    /* renamed from: clear */
    public static void m98836x5a5b64d() {
        f49092xa9ab4c8d.clear();
        f49091xbf3e3df4.clear();
    }

    /* renamed from: setEnableDebugLog */
    public static void m98837xebb41b96(boolean z17) {
        f49090x6fbcac77 = z17;
    }
}
