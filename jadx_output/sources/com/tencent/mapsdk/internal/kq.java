package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class kq {
    public static double a(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng2) {
        double d17 = latLng.longitude;
        double d18 = d17 * 0.01745329251994329d;
        double d19 = latLng.latitude * 0.01745329251994329d;
        double d27 = latLng2.longitude * 0.01745329251994329d;
        double d28 = latLng2.latitude * 0.01745329251994329d;
        double sin = java.lang.Math.sin(d18);
        double sin2 = java.lang.Math.sin(d19);
        double cos = java.lang.Math.cos(d18);
        double cos2 = java.lang.Math.cos(d19);
        double sin3 = java.lang.Math.sin(d27);
        double sin4 = java.lang.Math.sin(d28);
        double cos3 = java.lang.Math.cos(d27);
        double cos4 = java.lang.Math.cos(d28);
        double[] dArr = {cos * cos2, cos2 * sin, sin2};
        double d29 = cos3 * cos4;
        double d37 = cos4 * sin3;
        double d38 = dArr[0];
        double d39 = (d38 - d29) * (d38 - d29);
        double d47 = dArr[1];
        double d48 = d39 + ((d47 - d37) * (d47 - d37));
        double d49 = dArr[2];
        return java.lang.Math.asin(java.lang.Math.sqrt(d48 + ((d49 - sin4) * (d49 - sin4))) / 2.0d) * 1.27420015798544E7d;
    }

    private static com.tencent.tencentmap.mapsdk.maps.model.LatLng b(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng2) {
        return new com.tencent.tencentmap.mapsdk.maps.model.LatLng((latLng.latitude * 2.0d) - latLng2.latitude, (latLng.longitude * 2.0d) - latLng2.longitude);
    }
}
