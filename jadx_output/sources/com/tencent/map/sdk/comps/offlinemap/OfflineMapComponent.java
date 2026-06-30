package com.tencent.map.sdk.comps.offlinemap;

/* loaded from: classes13.dex */
public interface OfflineMapComponent extends com.tencent.tencentmap.mapsdk.maps.TencentMapComponent.Component {
    com.tencent.map.sdk.comps.offlinemap.OfflineItemController getOfflineItemController(com.tencent.map.sdk.comps.offlinemap.OfflineItem offlineItem, com.tencent.map.sdk.comps.offlinemap.OfflineStatusChangedListener offlineStatusChangedListener);

    java.util.List<com.tencent.map.sdk.comps.offlinemap.OfflineItem> getOfflineItemList();

    void getOfflineItemList(com.tencent.map.tools.Callback<java.util.List<com.tencent.map.sdk.comps.offlinemap.OfflineItem>> callback);

    boolean isOfflineMapEnable();

    void syncLatestData(com.tencent.map.sdk.comps.offlinemap.OfflineMapSyncedListener offlineMapSyncedListener);
}
