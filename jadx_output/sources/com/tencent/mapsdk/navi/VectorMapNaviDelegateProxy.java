package com.tencent.mapsdk.navi;

/* loaded from: classes13.dex */
public class VectorMapNaviDelegateProxy implements com.tencent.mapsdk.core.MapDelegate<com.tencent.mapsdk.internal.ne, com.tencent.mapsdk.internal.sy, com.tencent.mapsdk.internal.bu> {
    private com.tencent.mapsdk.internal.sz mMapDelegate;

    public VectorMapNaviDelegateProxy(android.content.Context context, com.tencent.tencentmap.mapsdk.maps.TencentMapOptions tencentMapOptions, android.view.ViewGroup viewGroup) {
        this.mMapDelegate = new com.tencent.mapsdk.internal.sz(context, tencentMapOptions, viewGroup);
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
        this.mMapDelegate.onCreated();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public void onDestroy() {
        this.mMapDelegate.onDestroy();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public void onPause() {
        this.mMapDelegate.onPause();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public void onRestart() {
        this.mMapDelegate.onRestart();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public void onResume() {
        this.mMapDelegate.onResume();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        this.mMapDelegate.onSizeChanged(i17, i18, i19, i27);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public void onStart() {
        this.mMapDelegate.onStart();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public void onStop() {
        this.mMapDelegate.onStop();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public void onSurfaceChanged(java.lang.Object obj, int i17, int i18) {
        this.mMapDelegate.onSurfaceChanged(obj, i17, i18);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        return this.mMapDelegate.onTouchEvent(motionEvent);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public void onUpdateOptions(com.tencent.tencentmap.mapsdk.maps.TencentMapOptions tencentMapOptions) {
        this.mMapDelegate.onUpdateOptions(tencentMapOptions);
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
    public com.tencent.mapsdk.internal.sy createMap(com.tencent.mapsdk.internal.ne neVar) {
        return (com.tencent.mapsdk.internal.sy) this.mMapDelegate.a((com.tencent.mapsdk.internal.sz) neVar);
    }

    @Override // com.tencent.mapsdk.core.MapDelegate
    public com.tencent.mapsdk.internal.bu createMapView(com.tencent.mapsdk.internal.ne neVar, android.view.ViewGroup viewGroup) {
        return this.mMapDelegate.a((com.tencent.mapsdk.internal.sz) neVar, viewGroup);
    }

    @Override // com.tencent.mapsdk.core.MapDelegate, com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    public com.tencent.mapsdk.internal.sy getMap() {
        return (com.tencent.mapsdk.internal.sy) this.mMapDelegate.e_;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.mapsdk.core.MapDelegate
    public com.tencent.mapsdk.internal.ne getMapContext() {
        return (com.tencent.mapsdk.internal.ne) this.mMapDelegate.d_;
    }
}
