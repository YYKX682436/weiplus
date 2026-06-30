package com.tencent.map.geolocation.sapp;

/* loaded from: classes13.dex */
public class TencentLocationUtils {
    private TencentLocationUtils() {
        throw new java.lang.UnsupportedOperationException();
    }

    public static boolean contains(com.tencent.map.geolocation.sapp.TencentLocation tencentLocation, double d17, com.tencent.map.geolocation.sapp.TencentLocation tencentLocation2) {
        if (tencentLocation == null || tencentLocation2 == null) {
            throw null;
        }
        return distanceBetween(tencentLocation, tencentLocation2) <= d17;
    }

    public static double distanceBetween(com.tencent.map.geolocation.sapp.TencentLocation tencentLocation, com.tencent.map.geolocation.sapp.TencentLocation tencentLocation2) {
        if (tencentLocation != null && tencentLocation2 != null) {
            return c.t.m.sapp.c.q.a(tencentLocation.getLatitude(), tencentLocation.getLongitude(), tencentLocation2.getLatitude(), tencentLocation2.getLongitude());
        }
        throw null;
    }

    public static boolean isFromGps(com.tencent.map.geolocation.sapp.TencentLocation tencentLocation) {
        if (tencentLocation == null) {
            return false;
        }
        return "gps".equals(tencentLocation.getProvider());
    }

    public static boolean isFromNetwork(com.tencent.map.geolocation.sapp.TencentLocation tencentLocation) {
        if (tencentLocation == null) {
            return false;
        }
        return "network".equals(tencentLocation.getProvider());
    }

    public static boolean isSupportGps(android.content.Context context) {
        context.getClass();
        return (c.t.m.sapp.c.q.f(context) & 16) == 0;
    }

    public static boolean wgs84ToGcj02(double[] dArr, double[] dArr2) {
        if (dArr != null && dArr2 != null) {
            try {
                if (dArr.length == 2 && dArr2.length == 2) {
                    return com.tencent.map.geolocation.sapp.internal.TencentExtraKeys.wgs84ToGcj02(dArr, dArr2);
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return false;
    }

    public static double distanceBetween(double d17, double d18, double d19, double d27) {
        return c.t.m.sapp.c.q.a(d17, d18, d19, d27);
    }
}
