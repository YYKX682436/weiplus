package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class ab {

    /* renamed from: a, reason: collision with root package name */
    public static final int f48768a = 0;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mapsdk.internal.ai f48769b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.tencentmap.mapsdk.maps.TencentMap.SnapshotReadyCallback f48770c = null;

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Handler f48771d = new android.os.Handler(android.os.Looper.getMainLooper()) { // from class: com.tencent.mapsdk.internal.ab.1
        @Override // android.os.Handler
        public final void handleMessage(android.os.Message message) {
            if (message == null || message.what != 0) {
                return;
            }
            com.tencent.tencentmap.mapsdk.maps.TencentMap.SnapshotReadyCallback snapshotReadyCallback = com.tencent.mapsdk.internal.ab.this.f48770c;
            if (snapshotReadyCallback != null) {
                snapshotReadyCallback.onSnapshotReady((android.graphics.Bitmap) message.obj);
            }
            com.tencent.mapsdk.internal.ab.this.f48770c = null;
        }
    };

    public ab(com.tencent.mapsdk.internal.ai aiVar) {
        this.f48769b = null;
        this.f48769b = aiVar;
    }

    private static /* synthetic */ com.tencent.tencentmap.mapsdk.maps.TencentMap.SnapshotReadyCallback b(com.tencent.mapsdk.internal.ab abVar) {
        abVar.f48770c = null;
        return null;
    }

    private void c() {
        if (this.f48769b != null) {
            this.f48769b = null;
        }
    }

    private float d() {
        com.tencent.mapsdk.internal.ai aiVar = this.f48769b;
        if (aiVar == null) {
            return -1.0f;
        }
        return aiVar.b();
    }

    private float e() {
        com.tencent.mapsdk.internal.ai aiVar = this.f48769b;
        if (aiVar == null) {
            return -1.0f;
        }
        return aiVar.c();
    }

    private void f() {
    }

    private void g() {
        com.tencent.mapsdk.internal.ai aiVar = this.f48769b;
        if (aiVar == null) {
            return;
        }
        aiVar.d();
    }

    private int h() {
        com.tencent.mapsdk.internal.ai aiVar = this.f48769b;
        if (aiVar == null) {
            return 1000;
        }
        return aiVar.A();
    }

    private int i() {
        com.tencent.mapsdk.internal.ai aiVar = this.f48769b;
        if (aiVar == null) {
            return -1;
        }
        return aiVar.f();
    }

    private boolean j() {
        com.tencent.mapsdk.internal.ai aiVar = this.f48769b;
        if (aiVar == null) {
            return false;
        }
        return aiVar.h();
    }

    private void k() {
    }

    private void l() {
        com.tencent.mapsdk.internal.ai aiVar = this.f48769b;
        if (aiVar == null) {
            return;
        }
        aiVar.j();
    }

    private void m() {
    }

    private void n() {
    }

    private void o() {
        com.tencent.mapsdk.internal.ai aiVar = this.f48769b;
        if (aiVar == null) {
            return;
        }
        aiVar.n();
    }

    private void p() {
        com.tencent.mapsdk.internal.ai aiVar = this.f48769b;
        if (aiVar == null) {
            return;
        }
        aiVar.m();
    }

    private java.lang.String q() {
        com.tencent.mapsdk.internal.ai aiVar = this.f48769b;
        return aiVar == null ? "" : aiVar.o();
    }

    private com.tencent.tencentmap.mapsdk.maps.model.Language r() {
        com.tencent.mapsdk.internal.ai aiVar = this.f48769b;
        return aiVar != null ? aiVar.p() : com.tencent.tencentmap.mapsdk.maps.model.Language.zh;
    }

    private int s() {
        com.tencent.mapsdk.internal.ai aiVar = this.f48769b;
        if (aiVar != null) {
            return aiVar.r();
        }
        return -1;
    }

    private java.lang.String[] t() {
        com.tencent.mapsdk.internal.ai aiVar = this.f48769b;
        if (aiVar != null) {
            return aiVar.s();
        }
        return null;
    }

    private boolean u() {
        com.tencent.mapsdk.internal.ai aiVar = this.f48769b;
        if (aiVar == null) {
            return false;
        }
        return aiVar.w();
    }

    private java.lang.String v() {
        com.tencent.mapsdk.internal.ai aiVar = this.f48769b;
        if (aiVar == null) {
            return null;
        }
        return aiVar.z();
    }

    private void f(int i17) {
        com.tencent.mapsdk.internal.ai aiVar = this.f48769b;
        if (aiVar != null) {
            aiVar.c(i17);
        }
    }

    public final com.tencent.tencentmap.mapsdk.maps.model.CameraPosition a() {
        com.tencent.mapsdk.internal.ai aiVar = this.f48769b;
        if (aiVar == null) {
            return null;
        }
        return aiVar.a();
    }

    public final void b(int i17) {
        com.tencent.mapsdk.internal.ai aiVar = this.f48769b;
        if (aiVar == null) {
            return;
        }
        aiVar.e(i17);
    }

    private void c(int i17) {
        com.tencent.mapsdk.internal.ai aiVar = this.f48769b;
        if (aiVar == null) {
            return;
        }
        aiVar.f(i17);
    }

    private void d(int i17) {
        com.tencent.mapsdk.internal.ai aiVar = this.f48769b;
        if (aiVar == null) {
            return;
        }
        aiVar.a(i17);
    }

    private void e(int i17) {
        com.tencent.mapsdk.internal.ai aiVar = this.f48769b;
        if (aiVar == null) {
            return;
        }
        aiVar.b(i17);
    }

    private void g(boolean z17) {
        com.tencent.mapsdk.internal.ai aiVar = this.f48769b;
        if (aiVar != null) {
            aiVar.h(z17);
        }
    }

    private void h(boolean z17) {
        com.tencent.mapsdk.internal.ai aiVar = this.f48769b;
        if (aiVar == null) {
            return;
        }
        aiVar.i(z17);
    }

    private void b(com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListener tencentMapGestureListener) {
        com.tencent.mapsdk.internal.ai aiVar = this.f48769b;
        if (aiVar == null) {
            return;
        }
        aiVar.b(tencentMapGestureListener);
    }

    private void f(boolean z17) {
        com.tencent.mapsdk.internal.ai aiVar = this.f48769b;
        if (aiVar != null) {
            aiVar.g(z17);
        }
    }

    public final void a(int i17) {
        com.tencent.mapsdk.internal.ai aiVar = this.f48769b;
        if (aiVar == null) {
            return;
        }
        aiVar.d(i17);
    }

    private void c(boolean z17) {
        com.tencent.mapsdk.internal.ai aiVar = this.f48769b;
        if (aiVar != null) {
            aiVar.c(z17);
        }
    }

    private void d(boolean z17) {
        com.tencent.mapsdk.internal.ai aiVar = this.f48769b;
        if (aiVar == null) {
            return;
        }
        aiVar.e(z17);
    }

    private void e(boolean z17) {
        com.tencent.mapsdk.internal.ai aiVar = this.f48769b;
        if (aiVar == null) {
            return;
        }
        aiVar.f(z17);
    }

    private void b(boolean z17) {
        com.tencent.mapsdk.internal.ai aiVar = this.f48769b;
        if (aiVar == null) {
            return;
        }
        aiVar.b(z17);
    }

    public final int a(com.tencent.tencentmap.mapsdk.maps.CameraUpdate cameraUpdate) {
        com.tencent.mapsdk.internal.ai aiVar = this.f48769b;
        if (aiVar == null) {
            return Integer.MIN_VALUE;
        }
        return aiVar.a(cameraUpdate);
    }

    private void b(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMapLoadedCallback onMapLoadedCallback) {
        com.tencent.mapsdk.internal.ai aiVar = this.f48769b;
        if (aiVar != null) {
            aiVar.b(onMapLoadedCallback);
        }
    }

    public final int a(com.tencent.tencentmap.mapsdk.maps.CameraUpdate cameraUpdate, long j17, com.tencent.tencentmap.mapsdk.maps.TencentMap.CancelableCallback cancelableCallback) {
        com.tencent.mapsdk.internal.ai aiVar = this.f48769b;
        if (aiVar == null) {
            return Integer.MIN_VALUE;
        }
        return aiVar.a(cameraUpdate, j17, cancelableCallback);
    }

    private float a(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng2) {
        com.tencent.mapsdk.internal.ai aiVar = this.f48769b;
        if (aiVar == null) {
            return -1.0f;
        }
        return aiVar.a(latLng, latLng2);
    }

    private void b(com.tencent.tencentmap.mapsdk.maps.model.Language language) {
        com.tencent.mapsdk.internal.ai aiVar = this.f48769b;
        if (aiVar != null) {
            aiVar.a(language);
        }
    }

    private void a(boolean z17) {
        com.tencent.mapsdk.internal.ai aiVar = this.f48769b;
        if (aiVar == null) {
            return;
        }
        aiVar.a(z17);
    }

    @java.lang.Deprecated
    private java.lang.String b(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        com.tencent.tencentmap.mapsdk.maps.model.IndoorBuilding u17;
        com.tencent.mapsdk.internal.ai aiVar = this.f48769b;
        if (aiVar == null || (u17 = aiVar.u()) == null) {
            return null;
        }
        if (u17.getBuildingLatLng() != null && latLng != null) {
            latLng.latitude = u17.getBuildingLatLng().latitude;
            latLng.longitude = u17.getBuildingLatLng().longitude;
        }
        return u17.getBuildingName();
    }

    private void a(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMapClickListener onMapClickListener) {
        com.tencent.mapsdk.internal.ai aiVar = this.f48769b;
        if (aiVar == null) {
            return;
        }
        aiVar.a(onMapClickListener);
    }

    private void a(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMapLongClickListener onMapLongClickListener) {
        com.tencent.mapsdk.internal.ai aiVar = this.f48769b;
        if (aiVar == null) {
            return;
        }
        aiVar.a(onMapLongClickListener);
    }

    private void a(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnCameraChangeListener onCameraChangeListener) {
        com.tencent.mapsdk.internal.ai aiVar = this.f48769b;
        if (aiVar == null) {
            return;
        }
        aiVar.a(onCameraChangeListener);
    }

    public final boolean b() {
        com.tencent.mapsdk.internal.ai aiVar = this.f48769b;
        if (aiVar != null) {
            return aiVar.x();
        }
        return false;
    }

    private void a(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnScaleViewChangedListener onScaleViewChangedListener) {
        com.tencent.mapsdk.internal.ai aiVar = this.f48769b;
        if (aiVar == null) {
            return;
        }
        aiVar.a(onScaleViewChangedListener);
    }

    private int b(java.lang.String str) {
        if (this.f48769b == null || com.tencent.mapsdk.internal.hr.a(str)) {
            return -1;
        }
        return this.f48769b.b(str);
    }

    private void a(android.os.Handler handler, android.graphics.Bitmap.Config config, int i17) {
        com.tencent.mapsdk.internal.ai aiVar = this.f48769b;
        if (aiVar == null) {
            return;
        }
        aiVar.a(handler, config, i17);
    }

    private void a(com.tencent.tencentmap.mapsdk.maps.TencentMap.SnapshotReadyCallback snapshotReadyCallback, android.graphics.Bitmap.Config config, int i17) {
        com.tencent.mapsdk.internal.ai aiVar = this.f48769b;
        if (aiVar == null || snapshotReadyCallback == null) {
            return;
        }
        this.f48770c = snapshotReadyCallback;
        android.os.Handler handler = this.f48771d;
        if (aiVar != null) {
            aiVar.a(handler, config, i17);
        }
    }

    private java.lang.String a(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        com.tencent.mapsdk.internal.ai aiVar = this.f48769b;
        if (aiVar == null) {
            return null;
        }
        return aiVar.a(latLng);
    }

    private void a(com.tencent.tencentmap.mapsdk.maps.model.TencentMapGestureListener tencentMapGestureListener) {
        com.tencent.mapsdk.internal.ai aiVar = this.f48769b;
        if (aiVar == null) {
            return;
        }
        aiVar.a(tencentMapGestureListener);
    }

    private void a(int i17, int i18) {
        com.tencent.mapsdk.internal.ai aiVar = this.f48769b;
        if (aiVar == null) {
            return;
        }
        aiVar.a(i17, i18);
    }

    private com.tencent.tencentmap.mapsdk.maps.model.CameraPosition a(java.util.List<com.tencent.mapsdk.internal.ez> list, java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng> list2, int i17, int i18, int i19, int i27) {
        com.tencent.mapsdk.internal.ai aiVar = this.f48769b;
        if (aiVar == null) {
            return null;
        }
        return aiVar.a(list, list2, i17, i18, i19, i27);
    }

    private void a(float f17, float f18, boolean z17) {
        com.tencent.mapsdk.internal.ai aiVar = this.f48769b;
        if (aiVar == null) {
            return;
        }
        aiVar.a(f17, f18, z17);
    }

    private void a(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnCompassClickedListener onCompassClickedListener) {
        com.tencent.mapsdk.internal.ai aiVar = this.f48769b;
        if (aiVar != null) {
            aiVar.a(onCompassClickedListener);
        }
    }

    private void a(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMapLoadedCallback onMapLoadedCallback) {
        com.tencent.mapsdk.internal.ai aiVar = this.f48769b;
        if (aiVar != null) {
            aiVar.a(onMapLoadedCallback);
        }
    }

    private void a(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnIndoorStateChangeListener onIndoorStateChangeListener) {
        com.tencent.mapsdk.internal.ai aiVar = this.f48769b;
        if (aiVar == null) {
            return;
        }
        aiVar.a(onIndoorStateChangeListener);
    }

    private void a(java.lang.String str) {
        com.tencent.mapsdk.internal.ai aiVar = this.f48769b;
        if (aiVar == null) {
            return;
        }
        aiVar.a(str);
    }

    private void a(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2)) {
            return;
        }
        this.f48769b.a(str, str2);
    }

    public final void a(com.tencent.tencentmap.mapsdk.maps.model.Language language) {
        com.tencent.mapsdk.internal.ai aiVar = this.f48769b;
        if (aiVar != null) {
            aiVar.b(language);
        }
    }

    private com.tencent.tencentmap.mapsdk.maps.model.TileOverlay a(com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions tileOverlayOptions) {
        com.tencent.mapsdk.internal.ai aiVar = this.f48769b;
        if (aiVar == null) {
            return null;
        }
        return aiVar.a(tileOverlayOptions);
    }

    private com.tencent.tencentmap.mapsdk.maps.model.CustomLayer a(com.tencent.tencentmap.mapsdk.maps.model.CustomLayerOptions customLayerOptions) {
        com.tencent.mapsdk.internal.ai aiVar = this.f48769b;
        if (aiVar == null) {
            return null;
        }
        return aiVar.a(customLayerOptions);
    }

    private void a(com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds latLngBounds, int i17) {
        com.tencent.mapsdk.internal.ai aiVar = this.f48769b;
        if (aiVar == null) {
            return;
        }
        aiVar.a(latLngBounds, i17);
    }

    private void a(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnTrafficEventClickListener onTrafficEventClickListener) {
        com.tencent.mapsdk.internal.ai aiVar = this.f48769b;
        if (aiVar == null) {
            return;
        }
        aiVar.a(onTrafficEventClickListener);
    }
}
