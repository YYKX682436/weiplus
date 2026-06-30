package com.tencent.mapsdk.vector;

/* loaded from: classes13.dex */
public class VectorMapDelegateProxy implements com.tencent.mapsdk.core.MapDelegate<com.tencent.mapsdk.internal.ne, com.tencent.mapsdk.vector.VectorMap, com.tencent.mapsdk.internal.bu> {
    private com.tencent.mapsdk.internal.tr mMapDelegate;

    public VectorMapDelegateProxy(android.content.Context context, com.tencent.tencentmap.mapsdk.maps.TencentMapOptions tencentMapOptions, android.view.ViewGroup viewGroup) {
        this.mMapDelegate = new com.tencent.mapsdk.internal.tr(context, tencentMapOptions, viewGroup);
    }

    private int getMapId() {
        if (getMapContext() != null) {
            return getMapContext().K;
        }
        return -1;
    }

    @Override // com.tencent.mapsdk.core.MapDelegate
    public java.lang.ref.WeakReference<com.tencent.mapsdk.internal.bu> getMapRenderView() {
        return this.mMapDelegate.getMapRenderView();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public boolean isOpaque() {
        return this.mMapDelegate.isOpaque();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public boolean isTouchable() {
        return this.mMapDelegate.isTouchable();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public void onCreated() {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.D, getMapId());
        this.mMapDelegate.onCreated();
        com.tencent.mapsdk.internal.lb.c(com.tencent.mapsdk.internal.la.D, getMapId());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public void onDestroy() {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.f50257J, getMapId());
        this.mMapDelegate.onDestroy();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public void onPause() {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.G, getMapId());
        this.mMapDelegate.onPause();
        com.tencent.mapsdk.internal.lb.c(com.tencent.mapsdk.internal.la.G, getMapId());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public void onRestart() {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.H, getMapId());
        this.mMapDelegate.onRestart();
        com.tencent.mapsdk.internal.lb.c(com.tencent.mapsdk.internal.la.H, getMapId());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public void onResume() {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.F, getMapId());
        this.mMapDelegate.onResume();
        com.tencent.mapsdk.internal.lb.c(com.tencent.mapsdk.internal.la.F, getMapId());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.L, getMapId());
        this.mMapDelegate.onSizeChanged(i17, i18, i19, i27);
        com.tencent.mapsdk.internal.lb.c(com.tencent.mapsdk.internal.la.L, getMapId());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public void onStart() {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.E, getMapId());
        this.mMapDelegate.onStart();
        com.tencent.mapsdk.internal.lb.c(com.tencent.mapsdk.internal.la.E, getMapId());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public void onStop() {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.I, getMapId());
        this.mMapDelegate.onStop();
        com.tencent.mapsdk.internal.lb.c(com.tencent.mapsdk.internal.la.I, getMapId());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public void onSurfaceChanged(java.lang.Object obj, int i17, int i18) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.M, getMapId());
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.M, "width", java.lang.Integer.valueOf(i17), getMapId());
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.M, "height", java.lang.Integer.valueOf(i18), getMapId());
        this.mMapDelegate.onSurfaceChanged(obj, i17, i18);
        com.tencent.mapsdk.internal.lb.c(com.tencent.mapsdk.internal.la.M, getMapId());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        return this.mMapDelegate.onTouchEvent(motionEvent);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public void onUpdateOptions(com.tencent.tencentmap.mapsdk.maps.TencentMapOptions tencentMapOptions) {
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.la.K, getMapId());
        this.mMapDelegate.onUpdateOptions(tencentMapOptions);
        com.tencent.mapsdk.internal.lb.c(com.tencent.mapsdk.internal.la.K, getMapId());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public void setOnTop(boolean z17) {
        this.mMapDelegate.setOnTop(z17);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public void setOpaque(boolean z17) {
        this.mMapDelegate.setOpaque(z17);
    }

    @Override // com.tencent.mapsdk.core.MapDelegate
    public com.tencent.mapsdk.vector.VectorMap createMap(com.tencent.mapsdk.internal.ne neVar) {
        return this.mMapDelegate.a((com.tencent.mapsdk.internal.tr) neVar);
    }

    @Override // com.tencent.mapsdk.core.MapDelegate
    public com.tencent.mapsdk.internal.bu createMapView(com.tencent.mapsdk.internal.ne neVar, android.view.ViewGroup viewGroup) {
        return this.mMapDelegate.a((com.tencent.mapsdk.internal.tr) neVar, viewGroup);
    }

    @Override // com.tencent.mapsdk.core.MapDelegate, com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public com.tencent.mapsdk.vector.VectorMap getMap() {
        return (com.tencent.mapsdk.vector.VectorMap) this.mMapDelegate.e_;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.mapsdk.core.MapDelegate
    public com.tencent.mapsdk.internal.ne getMapContext() {
        return (com.tencent.mapsdk.internal.ne) this.mMapDelegate.d_;
    }
}
