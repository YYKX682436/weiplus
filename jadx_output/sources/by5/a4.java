package by5;

/* loaded from: classes13.dex */
public abstract class a4 {

    /* renamed from: a, reason: collision with root package name */
    public static int f36411a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static int f36412b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static int f36413c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f36414d = "";

    public static int a() {
        if (f36411a <= 0) {
            int i17 = by5.d4.f().getInt("sNDeviceRd", -1);
            f36411a = i17;
            if (i17 <= 0) {
                f36411a = new java.util.Random().nextInt(10000000) + 1;
                by5.d4.f().edit().putInt("sNDeviceRd", f36411a).commit();
            }
        }
        return (f36411a % 10000) + 1;
    }

    public static int b() {
        int i17;
        int i18 = f36412b;
        if (i18 != 0) {
            return i18;
        }
        try {
            i17 = by5.d4.e().getInt("TEST_GRAY_VALUE", -1);
            f36412b = i17;
        } catch (java.lang.Throwable th6) {
            by5.c4.d("XWebGrayValueUtil", "getGrayValue error", th6);
            f36412b = 0;
        }
        if (i17 > 0) {
            by5.c4.f("XWebGrayValueUtil", "getGrayValue, using test gray value:" + f36412b);
            return f36412b;
        }
        int i19 = by5.d4.f().getInt("GRAY_VALUE", -1);
        f36412b = i19;
        if (i19 > 0) {
            by5.c4.f("XWebGrayValueUtil", "getGrayValue, using uin gray value:" + f36412b);
            return f36412b;
        }
        int a17 = a();
        f36412b = a17;
        if (a17 > 0) {
            by5.c4.f("XWebGrayValueUtil", "getGrayValue, using device gray value:" + f36412b);
            return f36412b;
        }
        return f36412b;
    }

    public static int c() {
        byte[] digest;
        java.lang.String format = new java.text.SimpleDateFormat("yyyyMMdd").format(new java.util.Date());
        if (f36413c != 0 && format.equals(f36414d)) {
            return f36413c;
        }
        f36414d = format;
        int i17 = by5.d4.a("XWEB_USER_INFO", false).getInt("USER_ID", 0);
        if (i17 == 0) {
            i17 = b();
        }
        try {
            digest = java.security.MessageDigest.getInstance("MD5").digest(((io.flutter.embedding.android.KeyboardMap.kValueMask & i17) + "@" + format).getBytes());
        } catch (java.lang.Throwable th6) {
            by5.c4.d("XWebGrayValueUtil", "getTodayGrayValue error", th6);
            f36413c = i17;
        }
        if (digest != null && digest.length > 3) {
            int i18 = ((digest[0] & Byte.MAX_VALUE) << 24) | (digest[3] & 255) | ((digest[2] & 255) << 8) | ((digest[1] & 255) << 16);
            if (i18 == 0) {
                f36413c = i17;
                return i17;
            }
            f36413c = (i18 % 10000) + 1;
            return f36413c;
        }
        f36413c = i17;
        return i17;
    }

    public static void d() {
        int i17 = f36412b;
        if (i17 != 0 && i17 != -1) {
            by5.c4.f("XWebGrayValueUtil", "resetGrayValue, gray value not changed:" + f36412b);
        } else {
            f36412b = 0;
            f36412b = b();
            by5.c4.f("XWebGrayValueUtil", "resetGrayValue, gray value:" + f36412b);
        }
    }

    public static void e(int i17) {
        if (i17 != 10001) {
            f36412b = i17 % 10000;
        }
        by5.c4.f("XWebGrayValueUtil", "setGrayValueForTest, gray value:" + f36412b);
        by5.d4.e().edit().putInt("TEST_GRAY_VALUE", f36412b).commit();
    }
}
