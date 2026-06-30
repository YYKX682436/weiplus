package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class kr {

    /* renamed from: a, reason: collision with root package name */
    public static final int f50174a = 256;

    /* renamed from: b, reason: collision with root package name */
    public static final int f50175b = 20;

    /* renamed from: c, reason: collision with root package name */
    public static final double f50176c = 4.272282972352698E7d;

    /* renamed from: d, reason: collision with root package name */
    private static final int f50177d = 20037508;

    /* renamed from: e, reason: collision with root package name */
    private static final int f50178e = 30240971;

    /* renamed from: f, reason: collision with root package name */
    private static final double f50179f = 111319.49077777778d;

    /* renamed from: g, reason: collision with root package name */
    private static final double f50180g = 0.017453292519943295d;

    /* renamed from: h, reason: collision with root package name */
    private static final double f50181h = 0.008726646259971648d;

    /* renamed from: i, reason: collision with root package name */
    private static final double f50182i = 114.59155902616465d;

    private static int a(double d17) {
        return (int) ((d17 * f50179f) + 2.0037508E7d);
    }

    private static int b(int i17) {
        return i17 + f50178e;
    }

    private static double c(double d17) {
        return (d17 * 3.141592653589793d) / 180.0d;
    }

    private static int d(int i17) {
        return i17 - f50178e;
    }

    private static double e(int i17) {
        return (i17 - f50177d) / f50179f;
    }

    private static double f(int i17) {
        return (java.lang.Math.atan(java.lang.Math.exp(((i17 - f50178e) / f50179f) * 0.017453292519943295d)) * f50182i) - 90.0d;
    }

    private static int a(int i17) {
        return i17 + f50177d;
    }

    private static int b(double d17) {
        return (int) (((java.lang.Math.log(java.lang.Math.tan((d17 + 90.0d) * f50181h)) / 0.017453292519943295d) * f50179f) + 3.0240971E7d);
    }

    private static int c(int i17) {
        return i17 - f50177d;
    }

    private static android.graphics.Point d(com.tencent.map.lib.models.GeoPoint geoPoint) {
        if (geoPoint != null) {
            double longitudeE6 = geoPoint.getLongitudeE6() / 1000000.0d;
            double log = java.lang.Math.log(java.lang.Math.tan(((geoPoint.getLatitudeE6() / 1000000.0d) + 90.0d) * f50181h)) / 0.01745329238474369d;
            android.graphics.Point point = new android.graphics.Point();
            point.x = (int) (((longitudeE6 + 180.0d) / 360.0d) * 2.68435456E8d);
            point.y = (int) (((180.0d - log) / 360.0d) * 2.68435456E8d);
            return point;
        }
        throw new java.lang.IllegalArgumentException("point is null");
    }

    private static float a(com.tencent.map.lib.models.GeoPoint geoPoint, com.tencent.map.lib.models.GeoPoint geoPoint2) {
        if (geoPoint != null && geoPoint2 != null) {
            return (float) a(geoPoint.getLatitudeE6() / 1000000.0d, geoPoint.getLongitudeE6() / 1000000.0d, geoPoint2.getLatitudeE6() / 1000000.0d, geoPoint2.getLongitudeE6() / 1000000.0d);
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

    private static android.graphics.Point c(com.tencent.map.lib.models.GeoPoint geoPoint) {
        if (geoPoint != null) {
            return new android.graphics.Point(a(geoPoint.getLongitudeE6() / 1000000.0d) - f50177d, b(geoPoint.getLatitudeE6() / 1000000.0d) - f50178e);
        }
        throw new java.lang.IllegalArgumentException("point is null");
    }

    private static android.graphics.Point c(int i17, int i18) {
        return new android.graphics.Point(a(i17 / 1000000.0d) - f50177d, b(i18 / 1000000.0d) - f50178e);
    }

    private static void a(double d17, double d18, double d19, double d27, float[] fArr) {
        android.location.Location.distanceBetween(d17, d18, d19, d27, fArr);
        fArr[0] = (float) a(d17, d18, d19, d27);
    }

    private static com.tencent.map.lib.models.GeoPoint d(int i17, int i18) {
        return new com.tencent.map.lib.models.GeoPoint((int) (java.lang.Math.toDegrees((java.lang.Math.atan(java.lang.Math.exp(3.141592653589793d - (i18 / 4.272282972352698E7d))) - 0.7853981633974483d) * 2.0d) * 1000000.0d), (int) (java.lang.Math.toDegrees((i17 / 4.272282972352698E7d) - 3.141592653589793d) * 1000000.0d));
    }

    private static double a(double d17, double d18, double d19, double d27) {
        double c17 = c(d19 - d17);
        double c18 = c(d27 - d18);
        double d28 = c17 / 2.0d;
        double d29 = c18 / 2.0d;
        double sin = (java.lang.Math.sin(d28) * java.lang.Math.sin(d28)) + (java.lang.Math.sin(d29) * java.lang.Math.sin(d29) * java.lang.Math.cos(c(d17)) * java.lang.Math.cos(c(d19)));
        return java.lang.Math.atan2(java.lang.Math.sqrt(sin), java.lang.Math.sqrt(1.0d - sin)) * 2.0d * 6371.0d * 1000.0d;
    }

    private static com.tencent.map.lib.models.GeoPoint a(int i17, int i18) {
        return new com.tencent.map.lib.models.GeoPoint((int) (f(i18) * 1000000.0d), (int) (e(i17) * 1000000.0d));
    }

    public static com.tencent.tencentmap.mapsdk.maps.model.LatLng a(com.tencent.map.lib.models.GeoPoint geoPoint) {
        if (geoPoint == null) {
            return null;
        }
        return new com.tencent.tencentmap.mapsdk.maps.model.LatLng(geoPoint.getLatitudeE6() / 1000000.0d, geoPoint.getLongitudeE6() / 1000000.0d);
    }

    private static android.graphics.Point b(com.tencent.map.lib.models.GeoPoint geoPoint) {
        if (geoPoint != null) {
            return new android.graphics.Point(a(geoPoint.getLongitudeE6() / 1000000.0d), b(geoPoint.getLatitudeE6() / 1000000.0d));
        }
        throw new java.lang.IllegalArgumentException("point is null");
    }

    public static java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng> a(java.util.List<com.tencent.map.lib.models.GeoPoint> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        java.util.Iterator<com.tencent.map.lib.models.GeoPoint> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(a(it.next()));
        }
        return arrayList;
    }

    private static com.tencent.map.lib.models.GeoPoint b(int i17, int i18) {
        return new com.tencent.map.lib.models.GeoPoint((int) (f(i18 + f50178e) * 1000000.0d), (int) (e(i17 + f50177d) * 1000000.0d));
    }

    private static float b(com.tencent.map.lib.models.GeoPoint geoPoint, com.tencent.map.lib.models.GeoPoint geoPoint2) {
        if (geoPoint == null || geoPoint2 == null) {
            return 0.0f;
        }
        float[] fArr = new float[10];
        double latitudeE6 = geoPoint.getLatitudeE6() / 1000000.0d;
        double longitudeE6 = geoPoint.getLongitudeE6() / 1000000.0d;
        double latitudeE62 = geoPoint2.getLatitudeE6() / 1000000.0d;
        double longitudeE62 = geoPoint2.getLongitudeE6() / 1000000.0d;
        android.location.Location.distanceBetween(latitudeE6, longitudeE6, latitudeE62, longitudeE62, fArr);
        fArr[0] = (float) a(latitudeE6, longitudeE6, latitudeE62, longitudeE62);
        return fArr[1];
    }
}
