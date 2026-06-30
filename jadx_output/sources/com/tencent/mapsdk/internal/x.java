package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class x implements com.tencent.mapsdk.internal.ey {
    @Override // com.tencent.mapsdk.internal.ey
    public final double a(android.graphics.Point point, android.graphics.Point point2) {
        return 0.0d;
    }

    @Override // com.tencent.mapsdk.internal.ey
    public final com.tencent.mapsdk.internal.gc b(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        return new com.tencent.mapsdk.internal.gc(0.0d, 0.0d);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.Projection
    public final com.tencent.tencentmap.mapsdk.maps.model.LatLng fromScreenLocation(android.graphics.Point point) {
        return new com.tencent.tencentmap.mapsdk.maps.model.LatLng();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.Projection
    public final com.tencent.tencentmap.mapsdk.maps.model.VisibleRegion getVisibleRegion() {
        return new com.tencent.tencentmap.mapsdk.maps.model.VisibleRegion(new com.tencent.tencentmap.mapsdk.maps.model.LatLng(0.0d, 0.0d), new com.tencent.tencentmap.mapsdk.maps.model.LatLng(0.0d, 0.0d), new com.tencent.tencentmap.mapsdk.maps.model.LatLng(0.0d, 0.0d), new com.tencent.tencentmap.mapsdk.maps.model.LatLng(0.0d, 0.0d), new com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds(new com.tencent.tencentmap.mapsdk.maps.model.LatLng(0.0d, 0.0d), new com.tencent.tencentmap.mapsdk.maps.model.LatLng(0.0d, 0.0d)));
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.Projection
    public final float[] glModelMatrix(android.graphics.PointF pointF, float f17) {
        return new float[16];
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.Projection
    public final float glPixelRatio() {
        return 0.0f;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.Projection
    public final float[] glProjectionMatrix() {
        return new float[16];
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.Projection
    public final android.graphics.PointF glVertexForCoordinate(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        return new android.graphics.PointF();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.Projection
    public final float[] glViewMatrix() {
        return new float[16];
    }

    @Override // com.tencent.mapsdk.internal.ey, com.tencent.tencentmap.mapsdk.maps.Projection
    public final double metersPerPixel(double d17) {
        return 0.0d;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.Projection
    public final android.graphics.Point toScreenLocation(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        return new android.graphics.Point();
    }

    @Override // com.tencent.mapsdk.internal.ey
    public final float a(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng2, int i17, int i18, int i19, int i27, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng3) {
        return 0.0f;
    }

    @Override // com.tencent.mapsdk.internal.ey, com.tencent.tencentmap.mapsdk.maps.Projection
    public final double metersPerPixel(double d17, double d18) {
        return 0.0d;
    }

    @Override // com.tencent.mapsdk.internal.ey
    public final void a(java.util.List<? extends com.tencent.tencentmap.mapsdk.maps.interfaces.Boundable> list, java.util.List<com.tencent.map.lib.models.GeoPoint> list2, android.graphics.Rect rect, com.tencent.mapsdk.internal.ey.a aVar) {
    }

    @Override // com.tencent.mapsdk.internal.ey
    public final com.tencent.tencentmap.mapsdk.maps.model.LatLng[] a() {
        return new com.tencent.tencentmap.mapsdk.maps.model.LatLng[4];
    }

    @Override // com.tencent.mapsdk.internal.ey
    public final com.tencent.map.lib.models.GeoPoint a(com.tencent.mapsdk.internal.fu fuVar) {
        return new com.tencent.map.lib.models.GeoPoint();
    }

    @Override // com.tencent.mapsdk.internal.ey
    public final com.tencent.mapsdk.internal.fu a(com.tencent.map.lib.models.GeoPoint geoPoint) {
        return new com.tencent.mapsdk.internal.fu();
    }

    @Override // com.tencent.mapsdk.internal.ey
    public final android.graphics.PointF a(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        return new android.graphics.PointF();
    }

    @Override // com.tencent.mapsdk.internal.ey
    public final com.tencent.tencentmap.mapsdk.maps.model.LatLng a(android.graphics.PointF pointF) {
        return new com.tencent.tencentmap.mapsdk.maps.model.LatLng();
    }

    @Override // com.tencent.mapsdk.internal.ey
    public final com.tencent.mapsdk.internal.fu a(android.content.Context context, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        return new com.tencent.mapsdk.internal.fu();
    }

    @Override // com.tencent.mapsdk.internal.ey
    public final com.tencent.tencentmap.mapsdk.maps.model.LatLng a(com.tencent.mapsdk.internal.gc gcVar) {
        return new com.tencent.tencentmap.mapsdk.maps.model.LatLng();
    }
}
