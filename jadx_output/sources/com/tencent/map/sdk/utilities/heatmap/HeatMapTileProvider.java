package com.tencent.map.sdk.utilities.heatmap;

/* loaded from: classes13.dex */
public abstract class HeatMapTileProvider implements com.tencent.tencentmap.mapsdk.maps.model.TileProvider {
    public static final com.tencent.map.sdk.utilities.heatmap.Gradient DEFAULT_GRADIENT;
    private static final int[] DEFAULT_GRADIENT_COLORS;
    private static final float[] DEFAULT_GRADIENT_START_POINTS;
    public static final double DEFAULT_OPACITY = 0.6d;
    public static final int DEFAULT_RADIUS = 40;
    private static final int MAX_RADIUS = 50;
    private static final int MIN_RADIUS = 10;
    static final double WORLD_WIDTH = 1.0d;

    /* loaded from: classes13.dex */
    public static class Builder {
        private java.util.Collection<com.tencent.map.sdk.utilities.heatmap.WeightedLatLng> data;
        private com.tencent.map.sdk.utilities.heatmap.HeatMapTileProvider.HeatTileGenerator heatTileGenerator;
        private com.tencent.map.sdk.utilities.heatmap.HeatMapTileProvider.OnHeatMapReadyListener readyListener;
        private int radius = 40;
        private com.tencent.map.sdk.utilities.heatmap.Gradient gradient = com.tencent.map.sdk.utilities.heatmap.HeatMapTileProvider.DEFAULT_GRADIENT;
        private double opacity = 0.6d;

        public com.tencent.map.sdk.utilities.heatmap.HeatMapTileProvider build(com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap) {
            if (tencentMap != null) {
                return tencentMap.getMapContext().createHeatMapTileProvider(this);
            }
            return null;
        }

        public com.tencent.map.sdk.utilities.heatmap.HeatMapTileProvider.Builder data(java.util.Collection<com.tencent.tencentmap.mapsdk.maps.model.LatLng> collection) {
            return weightedData(com.tencent.map.sdk.utilities.heatmap.HeatMapTileProvider.wrapData(collection));
        }

        public java.util.Collection<com.tencent.map.sdk.utilities.heatmap.WeightedLatLng> getData() {
            return this.data;
        }

        public com.tencent.map.sdk.utilities.heatmap.Gradient getGradient() {
            return this.gradient;
        }

        public com.tencent.map.sdk.utilities.heatmap.HeatMapTileProvider.HeatTileGenerator getHeatTileGenerator() {
            return this.heatTileGenerator;
        }

        public double getOpacity() {
            return this.opacity;
        }

        public int getRadius() {
            return this.radius;
        }

        public com.tencent.map.sdk.utilities.heatmap.HeatMapTileProvider.OnHeatMapReadyListener getReadyListener() {
            return this.readyListener;
        }

        public com.tencent.map.sdk.utilities.heatmap.HeatMapTileProvider.Builder gradient(com.tencent.map.sdk.utilities.heatmap.Gradient gradient) {
            this.gradient = gradient;
            return this;
        }

        public com.tencent.map.sdk.utilities.heatmap.HeatMapTileProvider.Builder opacity(double d17) {
            if (d17 < 0.0d || d17 > 1.0d) {
                throw new java.lang.IllegalArgumentException("Opacity must be in range [0, 1]");
            }
            this.opacity = d17;
            return this;
        }

        public com.tencent.map.sdk.utilities.heatmap.HeatMapTileProvider.Builder radius(int i17) {
            if (i17 < 10 || i17 > 50) {
                throw new java.lang.IllegalArgumentException("Radius not within bounds.");
            }
            this.radius = i17;
            return this;
        }

        public com.tencent.map.sdk.utilities.heatmap.HeatMapTileProvider.Builder readyListener(com.tencent.map.sdk.utilities.heatmap.HeatMapTileProvider.OnHeatMapReadyListener onHeatMapReadyListener) {
            this.readyListener = onHeatMapReadyListener;
            return this;
        }

        public com.tencent.map.sdk.utilities.heatmap.HeatMapTileProvider.Builder tileGenerator(com.tencent.map.sdk.utilities.heatmap.HeatMapTileProvider.HeatTileGenerator heatTileGenerator) {
            this.heatTileGenerator = heatTileGenerator;
            return this;
        }

        public <T extends com.tencent.map.sdk.utilities.visualization.datamodels.WeightedLatLng> com.tencent.map.sdk.utilities.heatmap.HeatMapTileProvider.Builder weightedData(java.util.Collection<T> collection) {
            if (collection.isEmpty()) {
                throw new java.lang.IllegalArgumentException("No input points.");
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (T t17 : collection) {
                arrayList.add(new com.tencent.map.sdk.utilities.heatmap.WeightedLatLng(t17.getPoint(), t17.getIntensity()));
            }
            this.data = arrayList;
            return this;
        }
    }

    /* loaded from: classes13.dex */
    public interface HeatTileGenerator {
        int[] generateColorMap(double d17);

        double[] generateKernel(int i17);
    }

    /* loaded from: classes13.dex */
    public interface OnHeatMapReadyListener {
        void onHeatMapReady();
    }

    static {
        int[] iArr = {android.graphics.Color.argb(0, 25, 0, 255), android.graphics.Color.argb(170, 30, 0, 255), android.graphics.Color.rgb(0, 191, 255), android.graphics.Color.rgb(0, 255, 0), android.graphics.Color.rgb(255, 255, 0), android.graphics.Color.rgb(255, 0, 0)};
        DEFAULT_GRADIENT_COLORS = iArr;
        float[] fArr = {0.0f, 0.4f, 0.6f, 0.75f, 0.8f, 1.0f};
        DEFAULT_GRADIENT_START_POINTS = fArr;
        DEFAULT_GRADIENT = new com.tencent.map.sdk.utilities.heatmap.Gradient(iArr, fArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.util.Collection<com.tencent.map.sdk.utilities.heatmap.WeightedLatLng> wrapData(java.util.Collection<com.tencent.tencentmap.mapsdk.maps.model.LatLng> collection) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<com.tencent.tencentmap.mapsdk.maps.model.LatLng> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(new com.tencent.map.sdk.utilities.heatmap.WeightedLatLng(it.next()));
        }
        return arrayList;
    }

    public abstract void setData(java.util.Collection<com.tencent.tencentmap.mapsdk.maps.model.LatLng> collection);

    public abstract void setGradient(com.tencent.map.sdk.utilities.heatmap.Gradient gradient);

    public abstract void setHeatTileGenerator(com.tencent.map.sdk.utilities.heatmap.HeatMapTileProvider.HeatTileGenerator heatTileGenerator);

    public abstract void setOpacity(double d17);

    public abstract void setRadius(int i17);

    public abstract <T extends com.tencent.map.sdk.utilities.visualization.datamodels.WeightedLatLng> void setWeightedData(java.util.Collection<T> collection);
}
