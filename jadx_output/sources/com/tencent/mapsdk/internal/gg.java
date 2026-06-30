package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public class gg {

    /* renamed from: d, reason: collision with root package name */
    final double f49579d;

    public gg(double d17) {
        this.f49579d = d17;
    }

    public final com.tencent.tencentmap.mapsdk.maps.model.LatLng b(com.tencent.mapsdk.internal.fu fuVar) {
        double d17 = fuVar.f49467a;
        double d18 = this.f49579d;
        double d19 = ((d17 / d18) - 0.5d) * 360.0d;
        double degrees = 90.0d - java.lang.Math.toDegrees(java.lang.Math.atan(java.lang.Math.exp(((-(0.5d - (fuVar.f49468b / d18))) * 2.0d) * 3.141592653589793d)) * 2.0d);
        if (java.lang.Double.isNaN(degrees)) {
            degrees = 0.0d;
        }
        if (java.lang.Double.isNaN(d19)) {
            d19 = 0.0d;
        }
        return new com.tencent.tencentmap.mapsdk.maps.model.LatLng(degrees, d19);
    }

    public final com.tencent.mapsdk.internal.fu d(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        double d17 = (latLng.longitude / 360.0d) + 0.5d;
        double sin = java.lang.Math.sin(java.lang.Math.toRadians(latLng.latitude));
        double log = ((java.lang.Math.log((sin + 1.0d) / (1.0d - sin)) * 0.5d) / (-6.283185307179586d)) + 0.5d;
        double d18 = this.f49579d;
        return new com.tencent.mapsdk.internal.fu(d17 * d18, log * d18);
    }
}
