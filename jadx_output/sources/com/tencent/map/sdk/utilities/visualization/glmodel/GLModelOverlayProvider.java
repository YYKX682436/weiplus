package com.tencent.map.sdk.utilities.visualization.glmodel;

/* loaded from: classes13.dex */
public final class GLModelOverlayProvider extends com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider {
    private com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds mLatLngBounds;
    private java.lang.String mModelFilePath;
    private int mPixelHeight;
    private int mPixelWidth;
    private com.tencent.tencentmap.mapsdk.maps.model.LatLng mPosition;
    private float mRotationX;
    private float mRotationY;
    private float mRotationZ;
    private com.tencent.tencentmap.mapsdk.maps.model.IAnimatorModel.IAnimatorEndListener transAnimatorEndListener;
    private com.tencent.map.sdk.utilities.visualization.glmodel.GLModelOverlayProvider.CoordType mCoordType = com.tencent.map.sdk.utilities.visualization.glmodel.GLModelOverlayProvider.CoordType.GeoGraphicType;
    private double mScale = 1.0d;
    private com.tencent.map.sdk.utilities.visualization.glmodel.GLModelOverlayProvider.AnimationType mAnimated = com.tencent.map.sdk.utilities.visualization.glmodel.GLModelOverlayProvider.AnimationType.None;
    private float mExposure = 1.0f;
    private boolean mBuildingHidden = true;
    private boolean mUnlit = false;

    /* loaded from: classes6.dex */
    public enum AnimationType {
        None,
        FlattenRise
    }

    /* loaded from: classes6.dex */
    public enum CoordType {
        PixelType,
        GeoGraphicType
    }

    public GLModelOverlayProvider(java.lang.String str, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        if (isModelFileValid(str)) {
            this.mModelFilePath = str;
        } else {
            this.mModelFilePath = "";
        }
        this.mPosition = latLng;
    }

    private boolean isModelFileValid(java.lang.String str) {
        return (str.endsWith(".gltf") || str.endsWith(".GLTF")) && new java.io.File(str).exists();
    }

    public final com.tencent.map.sdk.utilities.visualization.glmodel.GLModelOverlayProvider animateType(com.tencent.map.sdk.utilities.visualization.glmodel.GLModelOverlayProvider.AnimationType animationType) {
        this.mAnimated = animationType;
        return this;
    }

    public final com.tencent.map.sdk.utilities.visualization.glmodel.GLModelOverlayProvider coordType(com.tencent.map.sdk.utilities.visualization.glmodel.GLModelOverlayProvider.CoordType coordType) {
        this.mCoordType = coordType;
        return this;
    }

    public final com.tencent.map.sdk.utilities.visualization.glmodel.GLModelOverlayProvider.AnimationType getAnimationType() {
        return this.mAnimated;
    }

    public final com.tencent.map.sdk.utilities.visualization.glmodel.GLModelOverlayProvider.CoordType getCoordType() {
        return this.mCoordType;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public final int getDisplayLevel() {
        return super.getDisplayLevel();
    }

    public final float getExposure() {
        return this.mExposure;
    }

    public final com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds getLatLngBounds() {
        return this.mLatLngBounds;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public final int getMaxZoom() {
        return super.getMaxZoom();
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public final int getMinZoom() {
        return super.getMinZoom();
    }

    public final java.lang.String getModelFilePath() {
        return this.mModelFilePath;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public final float getOpacity() {
        return super.getOpacity();
    }

    public final int getPixelHeight() {
        return this.mPixelHeight;
    }

    public final int getPixelWidth() {
        return this.mPixelWidth;
    }

    public final com.tencent.tencentmap.mapsdk.maps.model.LatLng getPosition() {
        return this.mPosition;
    }

    public final float getRotationX() {
        return this.mRotationX;
    }

    public final float getRotationY() {
        return this.mRotationY;
    }

    public final float getRotationZ() {
        return this.mRotationZ;
    }

    public final double getScale() {
        return this.mScale;
    }

    public final com.tencent.tencentmap.mapsdk.maps.model.IAnimatorModel.IAnimatorEndListener getTransAnimatorEndListener() {
        return this.transAnimatorEndListener;
    }

    public final boolean getUnlit() {
        return this.mUnlit;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public final int getZIndex() {
        return super.getZIndex();
    }

    public final boolean isBuildingHidden() {
        return this.mBuildingHidden;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public final boolean isClickEnabled() {
        return this.mClickEnabled;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public final boolean isVisibility() {
        return super.isVisibility();
    }

    public final com.tencent.map.sdk.utilities.visualization.glmodel.GLModelOverlayProvider latLngBounds(java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng> list) {
        if (list == null || list.size() < 2) {
            this.mLatLngBounds = null;
        } else {
            this.mLatLngBounds = new com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds.Builder().include(list).build();
        }
        return this;
    }

    public final com.tencent.map.sdk.utilities.visualization.glmodel.GLModelOverlayProvider modelFilePath(java.lang.String str) {
        if (isModelFileValid(str)) {
            this.mModelFilePath = str;
        }
        return this;
    }

    public final com.tencent.map.sdk.utilities.visualization.glmodel.GLModelOverlayProvider pixelBounds(int i17, int i18) {
        this.mPixelWidth = i17;
        this.mPixelHeight = i18;
        return this;
    }

    public final com.tencent.map.sdk.utilities.visualization.glmodel.GLModelOverlayProvider position(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        this.mPosition = latLng;
        return this;
    }

    public final com.tencent.map.sdk.utilities.visualization.glmodel.GLModelOverlayProvider rotationX(float f17) {
        this.mRotationX = f17;
        return this;
    }

    public final com.tencent.map.sdk.utilities.visualization.glmodel.GLModelOverlayProvider rotationY(float f17) {
        this.mRotationY = f17;
        return this;
    }

    public final com.tencent.map.sdk.utilities.visualization.glmodel.GLModelOverlayProvider rotationZ(float f17) {
        this.mRotationZ = f17;
        return this;
    }

    public final com.tencent.map.sdk.utilities.visualization.glmodel.GLModelOverlayProvider scale(double d17) {
        if (d17 > 0.0d) {
            this.mScale = d17;
        }
        return this;
    }

    public final com.tencent.map.sdk.utilities.visualization.glmodel.GLModelOverlayProvider setBuildingHidden(boolean z17) {
        this.mBuildingHidden = z17;
        return this;
    }

    public final com.tencent.map.sdk.utilities.visualization.glmodel.GLModelOverlayProvider setClickEnable(boolean z17) {
        super.enableClick(z17);
        return this;
    }

    public final com.tencent.map.sdk.utilities.visualization.glmodel.GLModelOverlayProvider setExposure(float f17) {
        this.mExposure = f17;
        return this;
    }

    public final void setTransAnimatorEndListener(com.tencent.tencentmap.mapsdk.maps.model.IAnimatorModel.IAnimatorEndListener iAnimatorEndListener) {
        this.transAnimatorEndListener = iAnimatorEndListener;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider
    public final java.lang.String toString() {
        return "GLModelOverlayProvider{mOpacity=" + this.mOpacity + ", mVisibility=" + this.mVisibility + ", mMinZoom=" + this.mMinZoom + ", mMaxZoom=" + this.mMaxZoom + ", mDisplayLevel=" + this.mDisplayLevel + ", mZIndex=" + this.mZIndex + ", mCoordType=" + this.mCoordType + ", mModelFilePath='" + this.mModelFilePath + "', mPosition=" + this.mPosition + ", mScale=" + this.mScale + ", mRotationX=" + this.mRotationX + ", mRotationY=" + this.mRotationY + ", mRotationZ=" + this.mRotationZ + ", mLatLngBounds=" + this.mLatLngBounds + ", mAnimated=" + this.mAnimated + ", mExposure=" + this.mExposure + ", mBuildingHidden=" + this.mBuildingHidden + ", mClickEnabled=" + this.mClickEnabled + '}';
    }

    public final com.tencent.map.sdk.utilities.visualization.glmodel.GLModelOverlayProvider unlit(boolean z17) {
        this.mUnlit = z17;
        return this;
    }

    public final com.tencent.map.sdk.utilities.visualization.glmodel.GLModelOverlayProvider zoomRange(int i17, int i18) {
        if (i17 <= i18) {
            super.minZoom(i17);
            super.maxZoom(i18);
        }
        return this;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public final com.tencent.map.sdk.utilities.visualization.glmodel.GLModelOverlayProvider displayLevel(int i17) {
        super.displayLevel(i17);
        return this;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public final com.tencent.map.sdk.utilities.visualization.glmodel.GLModelOverlayProvider opacity(float f17) {
        super.opacity(f17);
        return this;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public final com.tencent.map.sdk.utilities.visualization.glmodel.GLModelOverlayProvider visibility(boolean z17) {
        super.visibility(z17);
        return this;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public final com.tencent.map.sdk.utilities.visualization.glmodel.GLModelOverlayProvider zIndex(int i17) {
        super.zIndex(i17);
        return this;
    }
}
