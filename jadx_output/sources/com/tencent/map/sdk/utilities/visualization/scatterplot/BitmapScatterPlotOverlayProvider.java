package com.tencent.map.sdk.utilities.visualization.scatterplot;

/* loaded from: classes13.dex */
public final class BitmapScatterPlotOverlayProvider extends com.tencent.map.sdk.utilities.visualization.scatterplot.ScatterPlotOverlayProvider {
    private static final com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor[] DEFAULT_BITMAP_ICONS = new com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor[0];
    private int DEFAULT_WIDTH = 30;
    private int DEFAULT_HEIGHT = 30;
    private int mWidth = 30;
    private int mHeight = 30;
    private com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor[] mBitmaps = DEFAULT_BITMAP_ICONS;

    public BitmapScatterPlotOverlayProvider() {
        type(com.tencent.map.sdk.utilities.visualization.scatterplot.ScatterPlotOverlayProvider.ScatterPlotType.Bitmap);
    }

    public final com.tencent.map.sdk.utilities.visualization.scatterplot.BitmapScatterPlotOverlayProvider bitmaps(com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor[] bitmapDescriptorArr) {
        com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor[] bitmapDescriptorArr2 = this.mBitmaps;
        if (bitmapDescriptorArr2.length <= 0 && bitmapDescriptorArr2.length == 0 && bitmapDescriptorArr != null) {
            this.mBitmaps = bitmapDescriptorArr;
        }
        return this;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.scatterplot.ScatterPlotOverlayProvider
    public final /* bridge */ /* synthetic */ com.tencent.map.sdk.utilities.visualization.scatterplot.ScatterPlotOverlayProvider data(java.util.List list) {
        return data((java.util.List<com.tencent.map.sdk.utilities.visualization.datamodels.ScatterLatLng>) list);
    }

    public final com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor[] getBitmaps() {
        return this.mBitmaps;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.scatterplot.ScatterPlotOverlayProvider
    public final java.util.List<com.tencent.map.sdk.utilities.visualization.datamodels.ScatterLatLng> getData() {
        return super.getData();
    }

    @Override // com.tencent.map.sdk.utilities.visualization.scatterplot.ScatterPlotOverlayProvider, com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public final int getDisplayLevel() {
        return super.getDisplayLevel();
    }

    public final int getHeight() {
        return this.mHeight;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.scatterplot.ScatterPlotOverlayProvider, com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public final int getMaxZoom() {
        return super.getMaxZoom();
    }

    @Override // com.tencent.map.sdk.utilities.visualization.scatterplot.ScatterPlotOverlayProvider, com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public final int getMinZoom() {
        return super.getMinZoom();
    }

    @Override // com.tencent.map.sdk.utilities.visualization.scatterplot.ScatterPlotOverlayProvider, com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public final float getOpacity() {
        return super.getOpacity();
    }

    public final int getWidth() {
        return this.mWidth;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.scatterplot.ScatterPlotOverlayProvider, com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public final int getZIndex() {
        return super.getZIndex();
    }

    @Override // com.tencent.map.sdk.utilities.visualization.scatterplot.ScatterPlotOverlayProvider
    public final boolean isEnable3D() {
        return super.isEnable3D();
    }

    @Override // com.tencent.map.sdk.utilities.visualization.scatterplot.ScatterPlotOverlayProvider, com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public final boolean isVisibility() {
        return super.isVisibility();
    }

    public final com.tencent.map.sdk.utilities.visualization.scatterplot.BitmapScatterPlotOverlayProvider scale(int i17, int i18) {
        if (i17 > 0 && i18 > 0) {
            this.mWidth = i17;
            this.mHeight = i18;
        }
        return this;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.scatterplot.ScatterPlotOverlayProvider
    public final com.tencent.map.sdk.utilities.visualization.scatterplot.BitmapScatterPlotOverlayProvider data(java.util.List<com.tencent.map.sdk.utilities.visualization.datamodels.ScatterLatLng> list) {
        super.data(list);
        return this;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.scatterplot.ScatterPlotOverlayProvider
    public final com.tencent.map.sdk.utilities.visualization.scatterplot.BitmapScatterPlotOverlayProvider enable3D(boolean z17) {
        super.enable3D(z17);
        return this;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.scatterplot.ScatterPlotOverlayProvider
    public final com.tencent.map.sdk.utilities.visualization.scatterplot.BitmapScatterPlotOverlayProvider zoomRange(int i17, int i18) {
        super.zoomRange(i17, i18);
        return this;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.scatterplot.ScatterPlotOverlayProvider, com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public final com.tencent.map.sdk.utilities.visualization.scatterplot.BitmapScatterPlotOverlayProvider displayLevel(int i17) {
        super.displayLevel(i17);
        return this;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.scatterplot.ScatterPlotOverlayProvider, com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public final com.tencent.map.sdk.utilities.visualization.scatterplot.BitmapScatterPlotOverlayProvider opacity(float f17) {
        super.opacity(f17);
        return this;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.scatterplot.ScatterPlotOverlayProvider, com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public final com.tencent.map.sdk.utilities.visualization.scatterplot.BitmapScatterPlotOverlayProvider visibility(boolean z17) {
        super.visibility(z17);
        return this;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.scatterplot.ScatterPlotOverlayProvider, com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public final com.tencent.map.sdk.utilities.visualization.scatterplot.BitmapScatterPlotOverlayProvider zIndex(int i17) {
        super.zIndex(i17);
        return this;
    }
}
