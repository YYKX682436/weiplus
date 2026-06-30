package com.tencent.mapsdk.core;

/* loaded from: classes13.dex */
public interface MapDelegate<C extends com.tencent.tencentmap.mapsdk.maps.TencentMapContext, M extends com.tencent.tencentmap.mapsdk.maps.TencentMap, V extends com.tencent.mapsdk.internal.bu> extends com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy {
    M createMap(C c17);

    V createMapView(C c17, android.view.ViewGroup viewGroup);

    @Override // com.tencent.tencentmap.mapsdk.maps.BaseMapView.MapViewProxy
    M getMap();

    C getMapContext();

    java.lang.ref.WeakReference<V> getMapRenderView();
}
