package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class kr {

    /* renamed from: a, reason: collision with root package name */
    public static final int f131707a = 256;

    /* renamed from: b, reason: collision with root package name */
    public static final int f131708b = 20;

    /* renamed from: c, reason: collision with root package name */
    public static final double f131709c = 4.272282972352698E7d;

    /* renamed from: d, reason: collision with root package name */
    private static final int f131710d = 20037508;

    /* renamed from: e, reason: collision with root package name */
    private static final int f131711e = 30240971;

    /* renamed from: f, reason: collision with root package name */
    private static final double f131712f = 111319.49077777778d;

    /* renamed from: g, reason: collision with root package name */
    private static final double f131713g = 0.017453292519943295d;

    /* renamed from: h, reason: collision with root package name */
    private static final double f131714h = 0.008726646259971648d;

    /* renamed from: i, reason: collision with root package name */
    private static final double f131715i = 114.59155902616465d;

    private static int a(double d17) {
        return (int) ((d17 * f131712f) + 2.0037508E7d);
    }

    private static int b(int i17) {
        return i17 + f131711e;
    }

    private static double c(double d17) {
        return (d17 * 3.141592653589793d) / 180.0d;
    }

    private static int d(int i17) {
        return i17 - f131711e;
    }

    private static double e(int i17) {
        return (i17 - f131710d) / f131712f;
    }

    private static double f(int i17) {
        return (java.lang.Math.atan(java.lang.Math.exp(((i17 - f131711e) / f131712f) * 0.017453292519943295d)) * f131715i) - 90.0d;
    }

    private static int a(int i17) {
        return i17 + f131710d;
    }

    private static int b(double d17) {
        return (int) (((java.lang.Math.log(java.lang.Math.tan((d17 + 90.0d) * f131714h)) / 0.017453292519943295d) * f131712f) + 3.0240971E7d);
    }

    private static int c(int i17) {
        return i17 - f131710d;
    }

    private static android.graphics.Point d(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df) {
        if (c4247x704e24df != null) {
            double m35332x962aa94a = c4247x704e24df.m35332x962aa94a() / 1000000.0d;
            double log = java.lang.Math.log(java.lang.Math.tan(((c4247x704e24df.m35331xbc3301f3() / 1000000.0d) + 90.0d) * f131714h)) / 0.01745329238474369d;
            android.graphics.Point point = new android.graphics.Point();
            point.x = (int) (((m35332x962aa94a + 180.0d) / 360.0d) * 2.68435456E8d);
            point.y = (int) (((180.0d - log) / 360.0d) * 2.68435456E8d);
            return point;
        }
        throw new java.lang.IllegalArgumentException("point is null");
    }

    private static float a(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df, com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df2) {
        if (c4247x704e24df != null && c4247x704e24df2 != null) {
            return (float) a(c4247x704e24df.m35331xbc3301f3() / 1000000.0d, c4247x704e24df.m35332x962aa94a() / 1000000.0d, c4247x704e24df2.m35331xbc3301f3() / 1000000.0d, c4247x704e24df2.m35332x962aa94a() / 1000000.0d);
        }
        throw new java.lang.IllegalArgumentException("point is null");
    }

    private static void b(double d17, double d18, double d19, double d27, float[] fArr) {
        double d28;
        double d29;
        double d37 = (0.017453292519943295d * d27) - (d18 * 0.017453292519943295d);
        double atan = java.lang.Math.atan(java.lang.Math.tan(d17 * 0.017453292519943295d) * 0.996647189328169d);
        double atan2 = java.lang.Math.atan(java.lang.Math.tan(d19 * 0.017453292519943295d) * 0.996647189328169d);
        double cos = java.lang.Math.cos(atan);
        double cos2 = java.lang.Math.cos(atan2);
        double sin = java.lang.Math.sin(atan);
        double sin2 = java.lang.Math.sin(atan2);
        double d38 = cos * cos2;
        double d39 = sin * sin2;
        double d47 = d37;
        int i17 = 0;
        double d48 = 0.0d;
        double d49 = 0.0d;
        double d57 = 0.0d;
        double d58 = 0.0d;
        double d59 = 0.0d;
        while (true) {
            if (i17 >= 20) {
                d28 = sin;
                d29 = sin2;
                break;
            }
            d48 = java.lang.Math.cos(d47);
            d57 = java.lang.Math.sin(d47);
            double d66 = cos2 * d57;
            double d67 = (cos * sin2) - ((sin * cos2) * d48);
            d28 = sin;
            double sqrt = java.lang.Math.sqrt((d66 * d66) + (d67 * d67));
            d29 = sin2;
            double d68 = d39 + (d38 * d48);
            d58 = java.lang.Math.atan2(sqrt, d68);
            double d69 = sqrt == 0.0d ? 0.0d : (d38 * d57) / sqrt;
            double d76 = 1.0d - (d69 * d69);
            double d77 = d76 == 0.0d ? 0.0d : d68 - ((d39 * 2.0d) / d76);
            double d78 = 0.006739496756586903d * d76;
            double d79 = ((d78 / 16384.0d) * (((((320.0d - (175.0d * d78)) * d78) - 768.0d) * d78) + 4096.0d)) + 1.0d;
            double d86 = (d78 / 1024.0d) * ((d78 * (((74.0d - (47.0d * d78)) * d78) - 128.0d)) + 256.0d);
            double d87 = 2.0955066698943685E-4d * d76 * (((4.0d - (d76 * 3.0d)) * 0.0033528106718309896d) + 4.0d);
            double d88 = d77 * d77;
            double d89 = d86 * sqrt * (d77 + ((d86 / 4.0d) * ((((d88 * 2.0d) - 1.0d) * d68) - ((((d86 / 6.0d) * d77) * (((sqrt * 4.0d) * sqrt) - 3.0d)) * ((d88 * 4.0d) - 3.0d)))));
            double d96 = d37 + ((1.0d - d87) * 0.0033528106718309896d * d69 * (d58 + (sqrt * d87 * (d77 + (d87 * d68 * (((2.0d * d77) * d77) - 1.0d))))));
            if (java.lang.Math.abs((d96 - d47) / d96) < 1.0E-12d) {
                d59 = d89;
                d49 = d79;
                break;
            }
            i17++;
            sin = d28;
            sin2 = d29;
            d59 = d89;
            d47 = d96;
            d49 = d79;
        }
        fArr[0] = (float) (d49 * 6356752.3142d * (d58 - d59));
        if (fArr.length > 1) {
            double d97 = d29 * cos;
            double d98 = d28;
            fArr[1] = (float) (((float) java.lang.Math.atan2(cos2 * d57, d97 - ((d98 * cos2) * d48))) * 57.29577951308232d);
            if (fArr.length > 2) {
                fArr[2] = (float) (((float) java.lang.Math.atan2(cos * d57, ((-d98) * cos2) + (d97 * d48))) * 57.29577951308232d);
            }
        }
    }

    private static android.graphics.Point c(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df) {
        if (c4247x704e24df != null) {
            return new android.graphics.Point(a(c4247x704e24df.m35332x962aa94a() / 1000000.0d) - f131710d, b(c4247x704e24df.m35331xbc3301f3() / 1000000.0d) - f131711e);
        }
        throw new java.lang.IllegalArgumentException("point is null");
    }

    private static android.graphics.Point c(int i17, int i18) {
        return new android.graphics.Point(a(i17 / 1000000.0d) - f131710d, b(i18 / 1000000.0d) - f131711e);
    }

    private static void a(double d17, double d18, double d19, double d27, float[] fArr) {
        android.location.Location.distanceBetween(d17, d18, d19, d27, fArr);
        fArr[0] = (float) a(d17, d18, d19, d27);
    }

    private static com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df d(int i17, int i18) {
        return new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df((int) (java.lang.Math.toDegrees((java.lang.Math.atan(java.lang.Math.exp(3.141592653589793d - (i18 / 4.272282972352698E7d))) - 0.7853981633974483d) * 2.0d) * 1000000.0d), (int) (java.lang.Math.toDegrees((i17 / 4.272282972352698E7d) - 3.141592653589793d) * 1000000.0d));
    }

    private static double a(double d17, double d18, double d19, double d27) {
        double c17 = c(d19 - d17);
        double c18 = c(d27 - d18);
        double d28 = c17 / 2.0d;
        double d29 = c18 / 2.0d;
        double sin = (java.lang.Math.sin(d28) * java.lang.Math.sin(d28)) + (java.lang.Math.sin(d29) * java.lang.Math.sin(d29) * java.lang.Math.cos(c(d17)) * java.lang.Math.cos(c(d19)));
        return java.lang.Math.atan2(java.lang.Math.sqrt(sin), java.lang.Math.sqrt(1.0d - sin)) * 2.0d * 6371.0d * 1000.0d;
    }

    private static com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df a(int i17, int i18) {
        return new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df((int) (f(i18) * 1000000.0d), (int) (e(i17) * 1000000.0d));
    }

    public static com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 a(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df) {
        if (c4247x704e24df == null) {
            return null;
        }
        return new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26(c4247x704e24df.m35331xbc3301f3() / 1000000.0d, c4247x704e24df.m35332x962aa94a() / 1000000.0d);
    }

    private static android.graphics.Point b(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df) {
        if (c4247x704e24df != null) {
            return new android.graphics.Point(a(c4247x704e24df.m35332x962aa94a() / 1000000.0d), b(c4247x704e24df.m35331xbc3301f3() / 1000000.0d));
        }
        throw new java.lang.IllegalArgumentException("point is null");
    }

    public static java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26> a(java.util.List<com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        java.util.Iterator<com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(a(it.next()));
        }
        return arrayList;
    }

    private static com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df b(int i17, int i18) {
        return new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df((int) (f(i18 + f131711e) * 1000000.0d), (int) (e(i17 + f131710d) * 1000000.0d));
    }

    private static float b(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df, com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df2) {
        if (c4247x704e24df == null || c4247x704e24df2 == null) {
            return 0.0f;
        }
        float[] fArr = new float[10];
        double m35331xbc3301f3 = c4247x704e24df.m35331xbc3301f3() / 1000000.0d;
        double m35332x962aa94a = c4247x704e24df.m35332x962aa94a() / 1000000.0d;
        double m35331xbc3301f32 = c4247x704e24df2.m35331xbc3301f3() / 1000000.0d;
        double m35332x962aa94a2 = c4247x704e24df2.m35332x962aa94a() / 1000000.0d;
        android.location.Location.distanceBetween(m35331xbc3301f3, m35332x962aa94a, m35331xbc3301f32, m35332x962aa94a2, fArr);
        fArr[0] = (float) a(m35331xbc3301f3, m35332x962aa94a, m35331xbc3301f32, m35332x962aa94a2);
        return fArr[1];
    }
}
