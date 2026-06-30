package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class ik implements com.tencent.mapsdk.internal.jk<com.tencent.map.lib.models.GeoPoint> {
    @Override // com.tencent.mapsdk.internal.jk
    public final /* synthetic */ com.tencent.map.lib.models.GeoPoint a(float f17, com.tencent.map.lib.models.GeoPoint geoPoint, com.tencent.map.lib.models.GeoPoint geoPoint2) {
        com.tencent.map.lib.models.GeoPoint geoPoint3 = geoPoint;
        com.tencent.map.lib.models.GeoPoint geoPoint4 = geoPoint2;
        return new com.tencent.map.lib.models.GeoPoint(geoPoint3.getLatitudeE6() + ((int) ((geoPoint4.getLatitudeE6() - geoPoint3.getLatitudeE6()) * f17)), geoPoint3.getLongitudeE6() + ((int) (f17 * (geoPoint4.getLongitudeE6() - geoPoint3.getLongitudeE6()))));
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    private static com.tencent.map.lib.models.GeoPoint a2(float f17, com.tencent.map.lib.models.GeoPoint geoPoint, com.tencent.map.lib.models.GeoPoint geoPoint2) {
        return new com.tencent.map.lib.models.GeoPoint(geoPoint.getLatitudeE6() + ((int) ((geoPoint2.getLatitudeE6() - geoPoint.getLatitudeE6()) * f17)), geoPoint.getLongitudeE6() + ((int) (f17 * (geoPoint2.getLongitudeE6() - geoPoint.getLongitudeE6()))));
    }
}
