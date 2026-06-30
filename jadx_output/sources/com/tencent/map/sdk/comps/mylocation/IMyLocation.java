package com.tencent.map.sdk.comps.mylocation;

/* loaded from: classes13.dex */
public interface IMyLocation {
    android.location.Location getMyLocation();

    com.tencent.tencentmap.mapsdk.maps.model.MyLocationConfig getMyLocationConfig();

    boolean isMyLocationEnabled();

    void setLocationSource(com.tencent.tencentmap.mapsdk.maps.LocationSource locationSource);

    void setMyLocationClickListener(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMyLocationClickListener onMyLocationClickListener);

    void setMyLocationConfig(com.tencent.tencentmap.mapsdk.maps.model.MyLocationConfig myLocationConfig);

    void setMyLocationEnabled(boolean z17);

    void setMyLocationStyle(com.tencent.tencentmap.mapsdk.maps.model.MyLocationStyle myLocationStyle);

    void setOnMyLocationChangeListener(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMyLocationChangeListener onMyLocationChangeListener);
}
