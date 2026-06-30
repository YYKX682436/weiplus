package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public interface az extends com.tencent.mapsdk.core.MapDelegate<com.tencent.mapsdk.internal.ne, com.tencent.mapsdk.vector.VectorMap, com.tencent.mapsdk.internal.bu>, com.tencent.mapsdk.internal.fa, com.tencent.mapsdk.internal.oy, com.tencent.mapsdk.internal.ua.m, com.tencent.tencentmap.mapsdk.maps.TencentMap.OnIndoorStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public static final int f48876a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f48877b = 1;

    void A();

    void B();

    boolean C();

    boolean D();

    com.tencent.mapsdk.internal.ol E();

    void F();

    void G();

    void H();

    android.content.Context I();

    void J();

    @java.lang.Deprecated
    boolean K();

    boolean L();

    com.tencent.tencentmap.mapsdk.maps.TencentMapOptions M();

    com.tencent.mapsdk.internal.qj N();

    boolean O();

    com.tencent.tencentmap.mapsdk.maps.TencentMap.OnPolylineClickListener P();

    com.tencent.tencentmap.mapsdk.maps.TencentMap.OnPolygonClickListener Q();

    com.tencent.tencentmap.mapsdk.maps.TencentMap.InfoWindowAdapter R();

    com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMarkerCollisionStatusListener S();

    com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMarkerDragListener T();

    com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMarkerClickListener U();

    com.tencent.tencentmap.mapsdk.maps.TencentMap.OnInfoWindowClickListener V();

    com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMapClickListener W();

    com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMapFrameFinishCallback X();

    com.tencent.tencentmap.mapsdk.maps.model.CameraPosition a();

    void a(float f17);

    void a(float f17, float f18, float f19);

    void a(int i17);

    void a(int i17, int i18);

    void a(android.os.Handler handler, android.graphics.Bitmap.Config config, int i17);

    void a(com.tencent.mapsdk.internal.bb bbVar);

    void a(com.tencent.mapsdk.internal.fb fbVar);

    void a(com.tencent.mapsdk.internal.fh fhVar);

    void a(com.tencent.mapsdk.internal.fn fnVar);

    void a(com.tencent.mapsdk.internal.ol olVar, com.tencent.mapsdk.internal.lu luVar);

    void a(com.tencent.mapsdk.internal.oq oqVar);

    void a(com.tencent.mapsdk.internal.qa.b bVar);

    void a(com.tencent.mapsdk.internal.qs qsVar);

    void a(com.tencent.mapsdk.internal.sj sjVar);

    void a(com.tencent.tencentmap.mapsdk.maps.TencentMap.InfoWindowAdapter infoWindowAdapter);

    void a(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnCameraChangeListener onCameraChangeListener);

    void a(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnDismissCallback onDismissCallback);

    void a(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnIndoorStateChangeListener onIndoorStateChangeListener);

    void a(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnInfoWindowClickListener onInfoWindowClickListener);

    void a(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMapPoiClickListener onMapPoiClickListener);

    void a(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMarkerClickListener onMarkerClickListener);

    void a(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMarkerCollisionStatusListener onMarkerCollisionStatusListener);

    void a(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMarkerDragListener onMarkerDragListener);

    void a(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnPolygonClickListener onPolygonClickListener);

    void a(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnPolylineClickListener onPolylineClickListener);

    void a(com.tencent.tencentmap.mapsdk.maps.TencentMapOptions tencentMapOptions);

    void a(com.tencent.tencentmap.mapsdk.maps.model.OverSeaTileProvider overSeaTileProvider);

    void a(com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListener tencentMapGestureListener);

    void a(java.lang.String str);

    void a(boolean z17);

    boolean a(float f17, float f18);

    com.tencent.mapsdk.internal.ne b();

    void b(float f17);

    void b(int i17, int i18);

    void b(com.tencent.mapsdk.internal.fb fbVar);

    void b(com.tencent.mapsdk.internal.fh fhVar);

    void b(com.tencent.mapsdk.internal.qa.b bVar);

    void b(com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListener tencentMapGestureListener);

    void b(java.lang.String str);

    void b(boolean z17);

    boolean b(float f17, float f18);

    com.tencent.mapsdk.internal.nd c();

    com.tencent.mapsdk.internal.po c(java.lang.String str);

    void c(int i17, int i18);

    void c(boolean z17);

    boolean c(float f17, float f18);

    com.tencent.tencentmap.mapsdk.maps.TencentMapOptions.MapUserSetting d();

    com.tencent.tencentmap.mapsdk.maps.model.Marker d(float f17, float f18);

    void d(int i17, int i18);

    void d(boolean z17);

    boolean d(java.lang.String str);

    com.tencent.mapsdk.internal.so e();

    void e(boolean z17);

    boolean e(float f17, float f18);

    java.lang.String f();

    void f(boolean z17);

    boolean f(float f17, float f18);

    void g(boolean z17);

    boolean g();

    @Override // com.tencent.mapsdk.internal.oy
    int getEGLContextHash();

    void h(boolean z17);

    boolean h();

    void i(boolean z17);

    boolean i();

    void j(boolean z17);

    boolean j();

    void k(boolean z17);

    boolean k();

    void l();

    void l(boolean z17);

    void m();

    void n();

    void o();

    boolean p();

    boolean q();

    com.tencent.mapsdk.internal.qs r();

    com.tencent.mapsdk.internal.ac s();

    com.tencent.map.lib.models.GeoPoint t();

    int u();

    int v();

    int w();

    int x();

    com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMapPoiClickListener y();

    boolean z();
}
