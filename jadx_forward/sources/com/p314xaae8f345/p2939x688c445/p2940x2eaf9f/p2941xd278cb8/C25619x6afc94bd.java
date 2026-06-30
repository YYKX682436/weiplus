package com.p314xaae8f345.p2939x688c445.p2940x2eaf9f.p2941xd278cb8;

/* renamed from: com.tencent.soter.core.biometric.SoterBiometricAntiBruteForceStrategy */
/* loaded from: classes15.dex */
class C25619x6afc94bd {

    /* renamed from: DEFAULT_FREEZE_TIME */
    private static final long f47012xf2eff257 = -1;

    /* renamed from: FREEZE_SECOND */
    private static final int f47013xfae8bf1c = 30;

    /* renamed from: KEY_FAIL_TIMES */
    private static final java.lang.String f47014xcece98c5 = "key_fail_times";

    /* renamed from: KEY_LAST_FREEZE_TIME */
    private static final java.lang.String f47015xb231394c = "key_last_freeze_time";

    /* renamed from: MAX_FAIL_NUM */
    private static final int f47016x7418a360 = 5;
    private static final java.lang.String TAG = "Soter.SoterBiometricAntiBruteForceStrategy";

    /* renamed from: addFailTime */
    public static void m96078xee288acc(android.content.Context context) {
        m96087xc9c4e2e2(context, java.lang.Integer.valueOf(java.lang.Integer.valueOf(m96080x92ee496e(context)).intValue() + 1).intValue());
    }

    /* renamed from: freeze */
    public static void m96079xb4843a97(android.content.Context context) {
        m96087xc9c4e2e2(context, 6);
        m96089xcf53be3c(context, java.lang.System.currentTimeMillis());
    }

    /* renamed from: getCurrentFailTime */
    private static int m96080x92ee496e(android.content.Context context) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(m96081x76d2b6f1(context));
        zt5.h.c(TAG, "soter: current retry time: " + valueOf, new java.lang.Object[0]);
        return valueOf.intValue();
    }

    /* renamed from: getCurrentFailTimeInDB */
    private static int m96081x76d2b6f1(android.content.Context context) {
        return android.preference.PreferenceManager.getDefaultSharedPreferences(context).getInt(f47014xcece98c5, 0);
    }

    /* renamed from: getLastFreezeTime */
    private static long m96082x75d5630(android.content.Context context) {
        java.lang.Long valueOf = java.lang.Long.valueOf(m96083xcf8992b3(context));
        zt5.h.c(TAG, "soter: current last freeze time: " + valueOf, new java.lang.Object[0]);
        return valueOf.longValue();
    }

    /* renamed from: getLastFreezeTimeInDB */
    private static long m96083xcf8992b3(android.content.Context context) {
        return android.preference.PreferenceManager.getDefaultSharedPreferences(context).getLong(f47015xb231394c, -1L);
    }

    /* renamed from: isCurrentFailTimeAvailable */
    public static boolean m96084x80ed5ecf(android.content.Context context) {
        if (m96080x92ee496e(context) >= 5) {
            return false;
        }
        zt5.h.c(TAG, "soter: fail time available", new java.lang.Object[0]);
        return true;
    }

    /* renamed from: isCurrentTweenTimeAvailable */
    public static boolean m96085xba1c2120(android.content.Context context) {
        int currentTimeMillis = (int) ((java.lang.System.currentTimeMillis() - m96082x75d5630(context)) / 1000);
        zt5.h.c(TAG, "soter: tween sec after last freeze: " + currentTimeMillis, new java.lang.Object[0]);
        if (currentTimeMillis <= 30) {
            return false;
        }
        zt5.h.a(TAG, "soter: after last freeze", new java.lang.Object[0]);
        return true;
    }

    /* renamed from: isSystemHasAntiBruteForce */
    public static boolean m96086x91c06c78() {
        return true;
    }

    /* renamed from: setCurrentFailTime */
    private static void m96087xc9c4e2e2(android.content.Context context, int i17) {
        zt5.h.c(TAG, "soter: setting to time: " + i17, new java.lang.Object[0]);
        if (i17 < 0) {
            zt5.h.f(TAG, "soter: illegal fail time", new java.lang.Object[0]);
        } else {
            m96088xc5177665(context, i17);
        }
    }

    /* renamed from: setCurrentFailTimeInDB */
    private static void m96088xc5177665(android.content.Context context, int i17) {
        if (context == null) {
            zt5.h.b(TAG, "soter: context is null", new java.lang.Object[0]);
            return;
        }
        android.content.SharedPreferences.Editor edit = android.preference.PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putInt(f47014xcece98c5, i17);
        edit.apply();
    }

    /* renamed from: setLastFreezeTime */
    private static void m96089xcf53be3c(android.content.Context context, long j17) {
        zt5.h.c(TAG, "soter: setting last freeze time: " + j17, new java.lang.Object[0]);
        if (j17 < -1) {
            zt5.h.f(TAG, "soter: illegal setLastFreezeTime", new java.lang.Object[0]);
        } else {
            m96090x66b514bf(context, j17);
        }
    }

    /* renamed from: setLastFreezeTimeInDB */
    private static void m96090x66b514bf(android.content.Context context, long j17) {
        if (context == null) {
            zt5.h.b(TAG, "soter: context is null", new java.lang.Object[0]);
            return;
        }
        android.content.SharedPreferences.Editor edit = android.preference.PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putLong(f47015xb231394c, j17);
        edit.apply();
    }

    /* renamed from: unFreeze */
    public static void m96091xb2c01e90(android.content.Context context) {
        m96089xcf53be3c(context, -1L);
        m96087xc9c4e2e2(context, 0);
    }
}
