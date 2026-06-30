package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class to implements com.tencent.tencentmap.mapsdk.maps.TencentMap.OnIndoorStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private com.tencent.mapsdk.internal.tr f52155a;

    public to(com.tencent.mapsdk.internal.tr trVar) {
        this.f52155a = trVar;
    }

    private boolean a() {
        return this.f52155a == null;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap.OnIndoorStateChangeListener
    public final boolean onIndoorBuildingDeactivated() {
        com.tencent.mapsdk.internal.tr trVar = this.f52155a;
        if (trVar == null) {
            return false;
        }
        trVar.onIndoorBuildingDeactivated();
        com.tencent.tencentmap.mapsdk.maps.TencentMap.OnIndoorStateChangeListener onIndoorStateChangeListener = this.f52155a.f52207v;
        if (onIndoorStateChangeListener == null) {
            return true;
        }
        onIndoorStateChangeListener.onIndoorBuildingDeactivated();
        return true;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap.OnIndoorStateChangeListener
    public final boolean onIndoorBuildingFocused() {
        com.tencent.mapsdk.internal.tr trVar = this.f52155a;
        if (trVar == null) {
            return false;
        }
        trVar.onIndoorBuildingFocused();
        com.tencent.tencentmap.mapsdk.maps.TencentMap.OnIndoorStateChangeListener onIndoorStateChangeListener = this.f52155a.f52207v;
        if (onIndoorStateChangeListener == null) {
            return true;
        }
        onIndoorStateChangeListener.onIndoorBuildingFocused();
        return true;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap.OnIndoorStateChangeListener
    public final boolean onIndoorLevelActivated(com.tencent.tencentmap.mapsdk.maps.model.IndoorBuilding indoorBuilding) {
        com.tencent.mapsdk.internal.tr trVar = this.f52155a;
        if (trVar == null) {
            return false;
        }
        trVar.onIndoorLevelActivated(indoorBuilding);
        com.tencent.tencentmap.mapsdk.maps.TencentMap.OnIndoorStateChangeListener onIndoorStateChangeListener = this.f52155a.f52207v;
        if (onIndoorStateChangeListener == null) {
            return true;
        }
        onIndoorStateChangeListener.onIndoorLevelActivated(indoorBuilding);
        return true;
    }
}
