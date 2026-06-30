package com.tencent.map.sdk.utilities.visualization.scatterplot;

/* loaded from: classes13.dex */
public abstract class ScatterPlotOverlayProvider extends com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider {
    private java.util.List<com.tencent.map.sdk.utilities.visualization.datamodels.ScatterLatLng> dataList = new java.util.ArrayList();
    private int mType = 0;
    private boolean mDraw3D = false;

    /* loaded from: classes13.dex */
    public enum ScatterPlotType {
        Dot,
        Bitmap
    }

    public com.tencent.map.sdk.utilities.visualization.scatterplot.ScatterPlotOverlayProvider data(java.util.List<com.tencent.map.sdk.utilities.visualization.datamodels.ScatterLatLng> list) {
        if (list != null) {
            this.dataList = list;
        }
        return this;
    }

    public com.tencent.map.sdk.utilities.visualization.scatterplot.ScatterPlotOverlayProvider enable3D(boolean z17) {
        this.mDraw3D = z17;
        return this;
    }

    public java.util.List<com.tencent.map.sdk.utilities.visualization.datamodels.ScatterLatLng> getData() {
        return this.dataList;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public int getDisplayLevel() {
        return super.getDisplayLevel();
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public int getMaxZoom() {
        return super.getMaxZoom();
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public int getMinZoom() {
        return super.getMinZoom();
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public float getOpacity() {
        return super.getOpacity();
    }

    public int getType() {
        return com.tencent.map.sdk.utilities.visualization.scatterplot.ScatterPlotOverlayProvider.ScatterPlotType.values()[this.mType].ordinal();
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public int getZIndex() {
        return super.getZIndex();
    }

    public boolean isEnable3D() {
        return this.mDraw3D;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public boolean isVisibility() {
        return super.isVisibility();
    }

    public com.tencent.map.sdk.utilities.visualization.scatterplot.ScatterPlotOverlayProvider type(com.tencent.map.sdk.utilities.visualization.scatterplot.ScatterPlotOverlayProvider.ScatterPlotType scatterPlotType) {
        this.mType = scatterPlotType.ordinal();
        return this;
    }

    public com.tencent.map.sdk.utilities.visualization.scatterplot.ScatterPlotOverlayProvider zoomRange(int i17, int i18) {
        if (i17 <= i18) {
            super.minZoom(i17);
            super.maxZoom(i18);
        }
        return this;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public com.tencent.map.sdk.utilities.visualization.scatterplot.ScatterPlotOverlayProvider displayLevel(int i17) {
        super.displayLevel(i17);
        return this;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public com.tencent.map.sdk.utilities.visualization.scatterplot.ScatterPlotOverlayProvider opacity(float f17) {
        super.opacity(f17);
        return this;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public com.tencent.map.sdk.utilities.visualization.scatterplot.ScatterPlotOverlayProvider visibility(boolean z17) {
        super.visibility(z17);
        return this;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public com.tencent.map.sdk.utilities.visualization.scatterplot.ScatterPlotOverlayProvider zIndex(int i17) {
        super.zIndex(i17);
        return this;
    }
}
