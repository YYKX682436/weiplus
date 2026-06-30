package com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1;

/* renamed from: com.tencent.thumbplayer.utils.TPLogUtil */
/* loaded from: classes13.dex */
public class C26572x9469cf4a {

    /* renamed from: DEBUG */
    public static final int f55301x3de9e33 = 50;

    /* renamed from: ERROR */
    public static final int f55302x3f2d9e8 = 10;

    /* renamed from: INFO */
    public static final int f55303x225cae = 40;

    /* renamed from: VERBOSE */
    public static final int f55304x3fb90562 = 60;

    /* renamed from: WARNING */
    public static final int f55305x6dd13b7c = 20;

    /* renamed from: isDebug */
    private static boolean f55306x7a994349 = true;

    /* renamed from: logPrintLevel */
    private static int f55307x5b57d73b = 50;

    /* renamed from: onLogListener */
    private static com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.OnLogListener f55308xd481d0b9;

    public static void d(java.lang.String str, java.lang.String str2) {
        m104309xba7af9ad(50, str, str2, new java.lang.Object[0]);
    }

    public static void e(java.lang.String str, java.lang.String str2) {
        m104309xba7af9ad(10, str, str2, new java.lang.Object[0]);
    }

    public static void i(java.lang.String str, java.lang.String str2) {
        m104309xba7af9ad(40, str, str2, new java.lang.Object[0]);
    }

    /* renamed from: logToLogListener */
    private static void m104308xb44a91b9(int i17, java.lang.String str, java.lang.String str2) {
        if (i17 == 10) {
            f55308xd481d0b9.e(str, str2);
            return;
        }
        if (i17 == 20) {
            f55308xd481d0b9.w(str, str2);
            return;
        }
        if (i17 == 40) {
            f55308xd481d0b9.i(str, str2);
        } else if (i17 == 50) {
            f55308xd481d0b9.d(str, str2);
        } else {
            if (i17 != 60) {
                return;
            }
            f55308xd481d0b9.v(str, str2);
        }
    }

    /* renamed from: printTag */
    private static void m104309xba7af9ad(int i17, java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        if (i17 == 20) {
            i17 = 10;
        }
        if (objArr != null) {
            try {
                if (objArr.length != 0) {
                    str2 = java.lang.String.format(str2, objArr);
                }
            } catch (java.util.MissingFormatArgumentException | java.lang.Exception | java.lang.OutOfMemoryError unused) {
                return;
            }
        }
        if (f55308xd481d0b9 != null) {
            if (i17 <= f55307x5b57d73b) {
                m104308xb44a91b9(i17, str, str2);
            }
        } else {
            if (!f55306x7a994349 || i17 > f55307x5b57d73b) {
                return;
            }
            android.util.Log.println(m104313x7262ec52(i17), str, str2);
        }
    }

    /* renamed from: setDebugEnable */
    public static void m104310xfb4317f4(boolean z17) {
        f55306x7a994349 = z17;
    }

    /* renamed from: setLogPrintLevel */
    public static void m104311xab8df9f9(int i17) {
        f55307x5b57d73b = i17;
    }

    /* renamed from: setOnLogListener */
    public static void m104312x24b7f377(com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.OnLogListener onLogListener) {
        f55308xd481d0b9 = onLogListener;
    }

    /* renamed from: toSysLevel */
    private static int m104313x7262ec52(int i17) {
        if (i17 == 10) {
            return 6;
        }
        if (i17 == 20) {
            return 5;
        }
        if (i17 == 40) {
            return 4;
        }
        if (i17 != 50) {
            return i17 != 60 ? 0 : 2;
        }
        return 3;
    }

    public static void v(java.lang.String str, java.lang.String str2) {
        m104309xba7af9ad(60, str, str2, new java.lang.Object[0]);
    }

    public static void w(java.lang.String str, java.lang.String str2) {
        m104309xba7af9ad(20, str, str2, new java.lang.Object[0]);
    }

    public static void e(java.lang.String str, java.lang.Throwable th6) {
        e(str, th6, "");
    }

    public static void e(java.lang.String str, java.lang.Throwable th6, java.lang.String str2) {
        java.lang.String str3;
        if (android.text.TextUtils.isEmpty(str2)) {
            str3 = "";
        } else {
            str3 = str2 + "\n";
        }
        if (th6 != null) {
            str3 = str3 + android.util.Log.getStackTraceString(th6);
        }
        m104309xba7af9ad(10, str, str3, new java.lang.Object[0]);
    }
}
