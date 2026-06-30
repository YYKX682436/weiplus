package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public interface an extends com.tencent.mapsdk.internal.ao, com.tencent.tencentmap.mapsdk.maps.model.Marker {
    int a();

    void a(android.graphics.Bitmap bitmap, boolean z17);

    void a(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMarkerClickListener onMarkerClickListener);

    void a(com.tencent.tencentmap.mapsdk.maps.model.AnimationListener animationListener);

    void a(com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor bitmapDescriptor, com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor bitmapDescriptor2);

    void a(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng);

    void a(boolean z17);

    void a(int[] iArr, int[] iArr2);

    boolean b();

    android.graphics.Point c();

    com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMarkerClickListener d();

    java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng> e();

    java.util.List<com.tencent.tencentmap.mapsdk.maps.interfaces.Boundable<com.tencent.mapsdk.internal.ey>> f();

    com.tencent.tencentmap.mapsdk.maps.TencentMap.InfoWindowAdapter g();

    com.tencent.mapsdk.internal.ew h();

    boolean i();

    android.graphics.Rect j();

    com.tencent.mapsdk.internal.qx k();

    java.util.List<com.tencent.tencentmap.mapsdk.maps.model.MarkerCollisionRelationUnit> l();

    com.tencent.tencentmap.mapsdk.maps.model.MarkerCollisionRelation m();

    boolean n();
}
