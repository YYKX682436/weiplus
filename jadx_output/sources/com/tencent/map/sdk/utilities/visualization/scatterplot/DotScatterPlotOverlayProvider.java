package com.tencent.map.sdk.utilities.visualization.scatterplot;

/* loaded from: classes13.dex */
public final class DotScatterPlotOverlayProvider extends com.tencent.map.sdk.utilities.visualization.scatterplot.ScatterPlotOverlayProvider {
    private static final int[] DEFAULT_SCATTER_COLORS = {android.graphics.Color.argb(255, 255, 202, 31), android.graphics.Color.argb(229, 204, 24, 93), android.graphics.Color.argb(127, 148, 28, 230)};
    private final int DEFAULT_RADIUS = 6;
    private int mRadius = 6;
    private int[] mColors = DEFAULT_SCATTER_COLORS;
    private boolean mAnimate = false;

    public DotScatterPlotOverlayProvider() {
        type(com.tencent.map.sdk.utilities.visualization.scatterplot.ScatterPlotOverlayProvider.ScatterPlotType.Dot);
    }

    public final com.tencent.map.sdk.utilities.visualization.scatterplot.DotScatterPlotOverlayProvider animate(boolean z17) {
        this.mAnimate = z17;
        return this;
    }

    public final com.tencent.map.sdk.utilities.visualization.scatterplot.DotScatterPlotOverlayProvider colors(int[] iArr) {
        if (iArr != null) {
            this.mColors = iArr;
        }
        return this;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.scatterplot.ScatterPlotOverlayProvider
    public final /* bridge */ /* synthetic */ com.tencent.map.sdk.utilities.visualization.scatterplot.ScatterPlotOverlayProvider data(java.util.List list) {
        return data((java.util.List<com.tencent.map.sdk.utilities.visualization.datamodels.ScatterLatLng>) list);
    }

    public final int[] getColors() {
        return this.mColors;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.scatterplot.ScatterPlotOverlayProvider
    public final java.util.List<com.tencent.map.sdk.utilities.visualization.datamodels.ScatterLatLng> getData() {
        return super.getData();
    }

    @Override // com.tencent.map.sdk.utilities.visualization.scatterplot.ScatterPlotOverlayProvider, com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public final int getDisplayLevel() {
        return super.getDisplayLevel();
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

    public final int getRadius() {
        return this.mRadius;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.scatterplot.ScatterPlotOverlayProvider, com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public final int getZIndex() {
        return super.getZIndex();
    }

    public final boolean isAnimate() {
        return this.mAnimate;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.scatterplot.ScatterPlotOverlayProvider
    public final boolean isEnable3D() {
        return super.isEnable3D();
    }

    @Override // com.tencent.map.sdk.utilities.visualization.scatterplot.ScatterPlotOverlayProvider, com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public final boolean isVisibility() {
        return super.isVisibility();
    }

    public final com.tencent.map.sdk.utilities.visualization.scatterplot.DotScatterPlotOverlayProvider radius(int i17) {
        if (i17 > 0) {
            this.mRadius = i17;
        }
        return this;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.scatterplot.ScatterPlotOverlayProvider
    public final com.tencent.map.sdk.utilities.visualization.scatterplot.DotScatterPlotOverlayProvider data(java.util.List<com.tencent.map.sdk.utilities.visualization.datamodels.ScatterLatLng> list) {
        super.data(list);
        return this;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.scatterplot.ScatterPlotOverlayProvider
    public final com.tencent.map.sdk.utilities.visualization.scatterplot.DotScatterPlotOverlayProvider enable3D(boolean z17) {
        super.enable3D(z17);
        return this;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.scatterplot.ScatterPlotOverlayProvider
    public final com.tencent.map.sdk.utilities.visualization.scatterplot.DotScatterPlotOverlayProvider zoomRange(int i17, int i18) {
        super.zoomRange(i17, i18);
        return this;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.scatterplot.ScatterPlotOverlayProvider, com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public final com.tencent.map.sdk.utilities.visualization.scatterplot.DotScatterPlotOverlayProvider displayLevel(int i17) {
        super.displayLevel(i17);
        return this;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.scatterplot.ScatterPlotOverlayProvider, com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public final com.tencent.map.sdk.utilities.visualization.scatterplot.DotScatterPlotOverlayProvider opacity(float f17) {
        super.opacity(f17);
        return this;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.scatterplot.ScatterPlotOverlayProvider, com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public final com.tencent.map.sdk.utilities.visualization.scatterplot.DotScatterPlotOverlayProvider visibility(boolean z17) {
        super.visibility(z17);
        return this;
    }

    @Override // com.tencent.map.sdk.utilities.visualization.scatterplot.ScatterPlotOverlayProvider, com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider
    public final com.tencent.map.sdk.utilities.visualization.scatterplot.DotScatterPlotOverlayProvider zIndex(int i17) {
        super.zIndex(i17);
        return this;
    }
}
