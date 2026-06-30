package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public interface ai {
    int A();

    float a(int i17, int i18, int i19, int i27, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng2, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng3);

    float a(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng2);

    float a(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng2, float f17, int i17, int i18, int i19, int i27, boolean z17);

    float a(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng2, float f17, int i17, boolean z17);

    float a(com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds latLngBounds, float f17, int i17, boolean z17);

    int a(com.tencent.tencentmap.mapsdk.maps.CameraUpdate cameraUpdate);

    int a(com.tencent.tencentmap.mapsdk.maps.CameraUpdate cameraUpdate, long j17, com.tencent.tencentmap.mapsdk.maps.TencentMap.CancelableCallback cancelableCallback);

    com.tencent.tencentmap.mapsdk.maps.model.CameraPosition a();

    com.tencent.tencentmap.mapsdk.maps.model.CameraPosition a(java.util.List<com.tencent.mapsdk.internal.ez> list, java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng> list2, int i17, int i18, int i19, int i27);

    com.tencent.tencentmap.mapsdk.maps.model.CameraPosition a(java.util.List<com.tencent.mapsdk.internal.ez> list, java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng> list2, int i17, int i18, int i19, int i27, com.tencent.tencentmap.mapsdk.maps.TencentMap.AsyncOperateCallback<com.tencent.tencentmap.mapsdk.maps.model.CameraPosition> asyncOperateCallback);

    com.tencent.tencentmap.mapsdk.maps.model.CustomLayer a(com.tencent.tencentmap.mapsdk.maps.model.CustomLayerOptions customLayerOptions);

    com.tencent.tencentmap.mapsdk.maps.model.TileOverlay a(com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions tileOverlayOptions);

    java.lang.String a(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng);

    java.util.List<android.graphics.Rect> a(java.util.List<java.lang.String> list);

    void a(float f17, float f18);

    void a(float f17, float f18, boolean z17);

    void a(int i17);

    void a(int i17, int i18);

    void a(android.os.Handler handler, android.graphics.Bitmap.Config config, int i17);

    void a(com.tencent.mapsdk.internal.fi fiVar);

    void a(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnCameraChangeListener onCameraChangeListener);

    void a(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnCompassClickedListener onCompassClickedListener);

    void a(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnDismissCallback onDismissCallback);

    void a(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnIndoorStateChangeListener onIndoorStateChangeListener);

    void a(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMapClickListener onMapClickListener);

    void a(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMapLoadedCallback onMapLoadedCallback);

    void a(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMapLongClickListener onMapLongClickListener);

    void a(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnScaleViewChangedListener onScaleViewChangedListener);

    void a(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnTrafficEventClickListener onTrafficEventClickListener);

    void a(com.tencent.tencentmap.mapsdk.maps.model.Language language);

    void a(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng, float f17, float f18);

    void a(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng, float f17, float f18, float f19);

    void a(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng, float f17, float f18, float f19, boolean z17);

    void a(com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds latLngBounds, int i17);

    void a(com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListener tencentMapGestureListener);

    void a(java.lang.String str);

    void a(java.lang.String str, java.lang.String str2);

    void a(java.util.List<com.tencent.tencentmap.mapsdk.maps.model.MapRouteSection> list, java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng> list2);

    void a(boolean z17);

    float b();

    int b(java.lang.String str);

    void b(float f17, float f18);

    void b(int i17);

    void b(com.tencent.mapsdk.internal.fi fiVar);

    void b(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnCameraChangeListener onCameraChangeListener);

    void b(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMapLoadedCallback onMapLoadedCallback);

    void b(com.tencent.tencentmap.mapsdk.maps.model.Language language);

    void b(com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListener tencentMapGestureListener);

    void b(boolean z17);

    float c();

    void c(int i17);

    void c(boolean z17);

    void d();

    void d(int i17);

    void d(boolean z17);

    void e();

    void e(int i17);

    void e(boolean z17);

    int f();

    void f(int i17);

    void f(boolean z17);

    int g();

    void g(boolean z17);

    void h(boolean z17);

    boolean h();

    void i();

    void i(boolean z17);

    void j();

    void k();

    void l();

    void m();

    void n();

    java.lang.String o();

    com.tencent.tencentmap.mapsdk.maps.model.Language p();

    void q();

    int r();

    java.lang.String[] s();

    java.lang.String t();

    com.tencent.tencentmap.mapsdk.maps.model.IndoorBuilding u();

    java.lang.String v();

    boolean w();

    boolean x();

    java.util.ArrayList<com.tencent.tencentmap.mapsdk.maps.model.MapPoi> y();

    java.lang.String z();
}
