package com.tencent.map.sdk.utilities.visualization;

/* loaded from: classes13.dex */
public abstract class BaseOverlayProvider implements com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider {
    private static final float DEFAULT_MAX_OPACITY = 1.0f;
    private static final int DEFAULT_MAX_ZOOM = 22;
    private static final float DEFAULT_MIN_OPACITY = 0.0f;
    private static final int DEFAULT_MIN_ZOOM = 3;
    private static final float DEFAULT_OPACITY = 1.0f;
    private static final int DEFAULT_ZINDEX = 0;
    protected float mOpacity = 1.0f;
    protected boolean mVisibility = true;
    protected int mMinZoom = 4;
    protected int mMaxZoom = 22;
    protected int mDisplayLevel = 1;
    protected int mZIndex = 0;
    protected boolean mClickEnabled = false;
    protected com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay.OnVectorOverlayLoadListener onVectorOverlayLoadlistener = null;
    protected com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay.OnVectorOverlayClickListener onVectorOverlayClickListener = null;

    @Override // com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public void enableClick(boolean z17) {
        this.mClickEnabled = z17;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public int getDisplayLevel() {
        return this.mDisplayLevel;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public int getMaxZoom() {
        return this.mMaxZoom;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public int getMinZoom() {
        return this.mMinZoom;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay.OnVectorOverlayClickListener getOnVectorOverlayClickListener() {
        return this.onVectorOverlayClickListener;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public float getOpacity() {
        return this.mOpacity;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay.OnVectorOverlayLoadListener getVectorOverlayLoadedListener() {
        return this.onVectorOverlayLoadlistener;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public int getZIndex() {
        return this.mZIndex;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public boolean isClickEnabled() {
        return false;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public boolean isVisibility() {
        return this.mVisibility;
    }

    public com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider setVectorOverlayClickListener(com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay.OnVectorOverlayClickListener onVectorOverlayClickListener) {
        this.onVectorOverlayClickListener = onVectorOverlayClickListener;
        return this;
    }

    public java.lang.String toString() {
        return "BaseOverlayProvider{mOpacity=" + this.mOpacity + ", mVisibility=" + this.mVisibility + ", mMinZoom=" + this.mMinZoom + ", mMaxZoom=" + this.mMaxZoom + ", mDisplayLevel=" + this.mDisplayLevel + ", mZIndex=" + this.mZIndex + '}';
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider displayLevel(int i17) {
        if (i17 == 1 || i17 == 2) {
            this.mDisplayLevel = i17;
        }
        return this;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider maxZoom(int i17) {
        if (i17 <= 22) {
            this.mMaxZoom = i17;
        } else {
            this.mMaxZoom = 22;
        }
        return this;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider minZoom(int i17) {
        if (i17 >= 3) {
            this.mMinZoom = i17;
        } else {
            this.mMinZoom = 3;
        }
        return this;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider opacity(float f17) {
        if (f17 > 1.0f) {
            this.mOpacity = 1.0f;
        } else if (f17 < 0.0f) {
            this.mOpacity = 0.0f;
        } else {
            this.mOpacity = f17;
        }
        return this;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider setVectorOverlayLoadedListener(com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay.OnVectorOverlayLoadListener onVectorOverlayLoadListener) {
        this.onVectorOverlayLoadlistener = onVectorOverlayLoadListener;
        return this;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider visibility(boolean z17) {
        this.mVisibility = z17;
        return this;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider zIndex(int i17) {
        this.mZIndex = i17;
        return this;
    }
}
