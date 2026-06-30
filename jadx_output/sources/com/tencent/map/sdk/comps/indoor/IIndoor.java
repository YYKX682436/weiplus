package com.tencent.map.sdk.comps.indoor;

/* loaded from: classes13.dex */
public interface IIndoor {
    @java.lang.Deprecated
    java.lang.String getActivedIndoorBuilding(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng);

    java.lang.String[] getActivedIndoorFloorNames();

    int getIndoorFloorId();

    void resetIndoorCellInfo();

    void setIndoorCellInfo(java.util.List<com.tencent.map.lib.models.IndoorCellInfo> list);

    void setIndoorEnabled(boolean z17);

    void setIndoorFloor(int i17);

    void setIndoorFloor(java.lang.String str, java.lang.String str2);

    void setIndoorMaskColor(int i17);

    void setOnIndoorStateChangeListener(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnIndoorStateChangeListener onIndoorStateChangeListener);
}
