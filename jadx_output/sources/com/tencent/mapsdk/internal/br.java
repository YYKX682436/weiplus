package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public abstract class br extends com.tencent.mapsdk.internal.bn {
    public br(android.content.Context context, com.tencent.tencentmap.mapsdk.maps.TencentMapOptions tencentMapOptions, com.tencent.mapsdk.internal.bo boVar) {
        super(context, tencentMapOptions, boVar);
    }

    @Override // com.tencent.mapsdk.internal.bn
    public final java.lang.String I() {
        return "5.10.0.2023";
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapComponent
    public com.tencent.tencentmap.mapsdk.maps.model.IAlphaAnimation createAlphaAnimation(float f17, float f18) {
        return new com.tencent.mapsdk.internal.hu(f17, f18);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapComponent
    public com.tencent.tencentmap.mapsdk.maps.model.IAnimationSet createAnimationSet(boolean z17) {
        return new com.tencent.mapsdk.internal.hw(z17);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapComponent
    public com.tencent.tencentmap.mapsdk.maps.model.IEmergeAnimation createEmergeAnimation(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        return new com.tencent.mapsdk.internal.hx(latLng);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapComponent
    public com.tencent.map.sdk.utilities.heatmap.HeatMapTileProvider createHeatMapTileProvider(com.tencent.map.sdk.utilities.heatmap.HeatMapTileProvider.Builder builder) {
        return new com.tencent.mapsdk.internal.bv(builder);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapComponent
    public com.tencent.tencentmap.mapsdk.maps.model.IRotateAnimation createRotateAnimation(float f17, float f18, float f19, float f27, float f28) {
        return new com.tencent.mapsdk.internal.hy(f17, f18, f19, f27, f28);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapComponent
    public com.tencent.tencentmap.mapsdk.maps.model.IScaleAnimation createScaleAnimation(float f17, float f18, float f19, float f27) {
        return new com.tencent.mapsdk.internal.hz(f17, f18, f19, f27);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMapComponent
    public com.tencent.tencentmap.mapsdk.maps.model.ITranslateAnimation createTranslateAnimation(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        return new com.tencent.mapsdk.internal.ia(latLng);
    }

    @Override // com.tencent.mapsdk.internal.bn
    public final void y() {
    }
}
