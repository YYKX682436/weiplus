package u75;

/* loaded from: classes7.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.Boolean f506711a;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.Boolean f506712b;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f506713c;

    public static java.lang.String a() {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f506713c)) {
            return f506713c;
        }
        java.lang.String str = com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a;
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("android.os.SystemProperties");
            str = (java.lang.String) cls.getMethod("get", java.lang.String.class, java.lang.String.class).invoke(cls, "ro.build.version.emui", com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Vendor.Huawei", "getProperty() Exception:%s", e17.getMessage());
        }
        if (str == null) {
            str = "";
        }
        java.lang.String lowerCase = str.toLowerCase();
        f506713c = lowerCase;
        return lowerCase;
    }

    public static boolean b(android.content.Context context) {
        if (context == null) {
            return false;
        }
        try {
            java.lang.Class<?> loadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            return ((java.lang.Boolean) loadClass.getMethod("hasNotchInScreen", new java.lang.Class[0]).invoke(loadClass, new java.lang.Object[0])).booleanValue();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Vendor.Huawei", th6, "hasCutOut call failed.", new java.lang.Object[0]);
            return false;
        }
    }

    public static boolean c() {
        if (f506711a == null) {
            java.lang.String str = android.os.Build.BRAND;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Vendor.Huawei", "Build.BRAND = %s", str);
            if ("HONOR".equalsIgnoreCase(str)) {
                f506711a = java.lang.Boolean.TRUE;
            } else if ("HUAWEI".equalsIgnoreCase(str)) {
                f506711a = java.lang.Boolean.TRUE;
            } else {
                f506711a = java.lang.Boolean.FALSE;
            }
        }
        return f506711a.booleanValue();
    }

    public static boolean d() {
        if (f506712b == null) {
            java.lang.String str = android.os.Build.BRAND;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Vendor.Huawei", "Build.BRAND = %s", str);
            if ("HUAWEI".equalsIgnoreCase(str)) {
                f506712b = java.lang.Boolean.TRUE;
            } else if ("HONOR".equalsIgnoreCase(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Vendor.Huawei", "Build.MANUFACTURER = %s", android.os.Build.MANUFACTURER);
                f506712b = java.lang.Boolean.valueOf(!"HONOR".equalsIgnoreCase(r0));
            } else {
                f506712b = java.lang.Boolean.FALSE;
            }
        }
        return f506712b.booleanValue();
    }
}
