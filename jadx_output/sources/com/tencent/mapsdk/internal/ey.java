package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public interface ey extends com.tencent.tencentmap.mapsdk.maps.Projection {

    /* loaded from: classes13.dex */
    public interface a {
        void a(float f17, com.tencent.map.lib.models.GeoPoint geoPoint);
    }

    double a(android.graphics.Point point, android.graphics.Point point2);

    float a(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng2, int i17, int i18, int i19, int i27, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng3);

    android.graphics.PointF a(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng);

    com.tencent.map.lib.models.GeoPoint a(com.tencent.mapsdk.internal.fu fuVar);

    com.tencent.mapsdk.internal.fu a(android.content.Context context, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng);

    com.tencent.mapsdk.internal.fu a(com.tencent.map.lib.models.GeoPoint geoPoint);

    com.tencent.tencentmap.mapsdk.maps.model.LatLng a(android.graphics.PointF pointF);

    com.tencent.tencentmap.mapsdk.maps.model.LatLng a(com.tencent.mapsdk.internal.gc gcVar);

    void a(java.util.List<? extends com.tencent.tencentmap.mapsdk.maps.interfaces.Boundable> list, java.util.List<com.tencent.map.lib.models.GeoPoint> list2, android.graphics.Rect rect, com.tencent.mapsdk.internal.ey.a aVar);

    com.tencent.tencentmap.mapsdk.maps.model.LatLng[] a();

    com.tencent.mapsdk.internal.gc b(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng);

    @Override // com.tencent.tencentmap.mapsdk.maps.Projection
    double metersPerPixel(double d17);

    @Override // com.tencent.tencentmap.mapsdk.maps.Projection
    double metersPerPixel(double d17, double d18);
}
