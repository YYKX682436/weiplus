package by5;

/* loaded from: classes13.dex */
public abstract class a4 {

    /* renamed from: a, reason: collision with root package name */
    public static int f117944a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static int f117945b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static int f117946c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f117947d = "";

    public static int a() {
        if (f117944a <= 0) {
            int i17 = by5.d4.f().getInt("sNDeviceRd", -1);
            f117944a = i17;
            if (i17 <= 0) {
                f117944a = new java.util.Random().nextInt(10000000) + 1;
                by5.d4.f().edit().putInt("sNDeviceRd", f117944a).commit();
            }
        }
        return (f117944a % 10000) + 1;
    }

    public static int b() {
        int i17;
        int i18 = f117945b;
        if (i18 != 0) {
            return i18;
        }
        try {
            i17 = by5.d4.e().getInt("TEST_GRAY_VALUE", -1);
            f117945b = i17;
        } catch (java.lang.Throwable th6) {
            by5.c4.d("XWebGrayValueUtil", "getGrayValue error", th6);
            f117945b = 0;
        }
        if (i17 > 0) {
            by5.c4.f("XWebGrayValueUtil", "getGrayValue, using test gray value:" + f117945b);
            return f117945b;
        }
        int i19 = by5.d4.f().getInt("GRAY_VALUE", -1);
        f117945b = i19;
        if (i19 > 0) {
            by5.c4.f("XWebGrayValueUtil", "getGrayValue, using uin gray value:" + f117945b);
            return f117945b;
        }
        int a17 = a();
        f117945b = a17;
        if (a17 > 0) {
            by5.c4.f("XWebGrayValueUtil", "getGrayValue, using device gray value:" + f117945b);
            return f117945b;
        }
        return f117945b;
    }

    public static int c() {
        byte[] digest;
        java.lang.String format = new java.text.SimpleDateFormat("yyyyMMdd").format(new java.util.Date());
        if (f117946c != 0 && format.equals(f117947d)) {
            return f117946c;
        }
        f117947d = format;
        int i17 = by5.d4.a("XWEB_USER_INFO", false).getInt("USER_ID", 0);
        if (i17 == 0) {
            i17 = b();
        }
        try {
            digest = java.security.MessageDigest.getInstance("MD5").digest(((io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2 & i17) + "@" + format).getBytes());
        } catch (java.lang.Throwable th6) {
            by5.c4.d("XWebGrayValueUtil", "getTodayGrayValue error", th6);
            f117946c = i17;
        }
        if (digest != null && digest.length > 3) {
            int i18 = ((digest[0] & Byte.MAX_VALUE) << 24) | (digest[3] & 255) | ((digest[2] & 255) << 8) | ((digest[1] & 255) << 16);
            if (i18 == 0) {
                f117946c = i17;
                return i17;
            }
            f117946c = (i18 % 10000) + 1;
            return f117946c;
        }
        f117946c = i17;
        return i17;
    }

    public static void d() {
        int i17 = f117945b;
        if (i17 != 0 && i17 != -1) {
            by5.c4.f("XWebGrayValueUtil", "resetGrayValue, gray value not changed:" + f117945b);
        } else {
            f117945b = 0;
            f117945b = b();
            by5.c4.f("XWebGrayValueUtil", "resetGrayValue, gray value:" + f117945b);
        }
    }

    public static void e(int i17) {
        if (i17 != 10001) {
            f117945b = i17 % 10000;
        }
        by5.c4.f("XWebGrayValueUtil", "setGrayValueForTest, gray value:" + f117945b);
        by5.d4.e().edit().putInt("TEST_GRAY_VALUE", f117945b).commit();
    }
}
