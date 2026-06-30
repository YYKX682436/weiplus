package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public class oh extends com.tencent.map.lib.models.ScatterPlotInfo implements com.tencent.mapsdk.internal.ni {

    /* renamed from: a, reason: collision with root package name */
    com.tencent.map.sdk.utilities.visualization.scatterplot.ScatterPlotOverlayProvider f50591a;

    public oh(android.content.Context context, com.tencent.map.sdk.utilities.visualization.scatterplot.ScatterPlotOverlayProvider scatterPlotOverlayProvider) {
        this.f50591a = scatterPlotOverlayProvider;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(scatterPlotOverlayProvider.getData());
        setDataList(arrayList);
        this.visible = scatterPlotOverlayProvider.isVisibility();
        this.opacity = scatterPlotOverlayProvider.getOpacity();
        this.maxZoom = scatterPlotOverlayProvider.getMaxZoom();
        this.minZoom = scatterPlotOverlayProvider.getMinZoom();
        this.draw3D = scatterPlotOverlayProvider.isEnable3D();
        this.level = scatterPlotOverlayProvider.getDisplayLevel();
        this.mType = scatterPlotOverlayProvider.getType();
        this.zIndex = scatterPlotOverlayProvider.getZIndex();
        this.outterVectorOverlayLoadListener = scatterPlotOverlayProvider.getVectorOverlayLoadedListener();
        if (scatterPlotOverlayProvider instanceof com.tencent.map.sdk.utilities.visualization.scatterplot.DotScatterPlotOverlayProvider) {
            com.tencent.map.sdk.utilities.visualization.scatterplot.DotScatterPlotOverlayProvider dotScatterPlotOverlayProvider = (com.tencent.map.sdk.utilities.visualization.scatterplot.DotScatterPlotOverlayProvider) scatterPlotOverlayProvider;
            this.radius = dotScatterPlotOverlayProvider.getRadius();
            this.colors = dotScatterPlotOverlayProvider.getColors();
            this.mAnimate = dotScatterPlotOverlayProvider.isAnimate();
            return;
        }
        if (scatterPlotOverlayProvider instanceof com.tencent.map.sdk.utilities.visualization.scatterplot.BitmapScatterPlotOverlayProvider) {
            com.tencent.map.sdk.utilities.visualization.scatterplot.BitmapScatterPlotOverlayProvider bitmapScatterPlotOverlayProvider = (com.tencent.map.sdk.utilities.visualization.scatterplot.BitmapScatterPlotOverlayProvider) scatterPlotOverlayProvider;
            this.mBitmapWidth = bitmapScatterPlotOverlayProvider.getWidth();
            this.mBitmapHeight = bitmapScatterPlotOverlayProvider.getHeight();
            if (bitmapScatterPlotOverlayProvider.getBitmaps() == null || bitmapScatterPlotOverlayProvider.getBitmaps().length <= 0) {
                return;
            }
            this.mBitmaps = new android.graphics.Bitmap[bitmapScatterPlotOverlayProvider.getBitmaps().length];
            for (int i17 = 0; i17 < bitmapScatterPlotOverlayProvider.getBitmaps().length; i17++) {
                com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor bitmapDescriptor = bitmapScatterPlotOverlayProvider.getBitmaps()[i17];
                if (bitmapDescriptor != null) {
                    android.graphics.Bitmap bitmap = bitmapDescriptor.getBitmap(context);
                    if (bitmap != null && (this.mBitmapWidth != bitmap.getWidth() || this.mBitmapHeight != bitmap.getHeight())) {
                        int i18 = this.mBitmapWidth;
                        int i19 = this.mBitmapHeight;
                        int width = bitmap.getWidth();
                        int height = bitmap.getHeight();
                        android.graphics.Matrix matrix = new android.graphics.Matrix();
                        matrix.postScale(i18 / width, i19 / height);
                        bitmap = android.graphics.Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
                    }
                    this.mBitmaps[i17] = bitmap;
                } else {
                    this.mBitmaps[i17] = null;
                }
            }
        }
    }

    private static android.graphics.Bitmap a(android.graphics.Bitmap bitmap, int i17, int i18) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.postScale(i17 / width, i18 / height);
        return android.graphics.Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
    }

    private com.tencent.map.sdk.utilities.visualization.scatterplot.ScatterPlotOverlayProvider a() {
        return this.f50591a;
    }
}
