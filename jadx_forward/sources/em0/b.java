package em0;

/* loaded from: classes5.dex */
public abstract class b {
    public static void a() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M;
        java.lang.String[] b17;
        synchronized (em0.b.class) {
            if (java.lang.Math.random() <= com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F(j62.e.g().j("clicfg_android_kara_behavior_report", java.lang.String.valueOf(1.0d), true, true), 1.0d) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F(j62.e.g().j("clicfg_android_kara_behavior_report", java.lang.String.valueOf(1.0d), true, true), 1.0d) >= 0.0d && (b17 = (M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("MMKV_KARA_BEHAVIOR")).b()) != null) {
                for (java.lang.String str : b17) {
                    java.lang.String string = M.getString(str, "");
                    if (!android.text.TextUtils.isEmpty(string)) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(25579, str, string);
                        M.putString(str, "");
                    }
                }
            }
        }
    }

    public static void b(java.lang.String str, int i17) {
        synchronized (em0.b.class) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("MMKV_KARA_BEHAVIOR");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(M.getString(str, ""));
            sb6.append(i17);
            sb6.append("|");
            M.putString(str, sb6.toString()).commit();
            if (sb6.length() > 5120) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Kara.KaraBehaviorReport", "content too long !!! %d", java.lang.Integer.valueOf(sb6.length()));
                ((ku5.t0) ku5.t0.f394148d).q(new em0.a());
            }
        }
    }
}
