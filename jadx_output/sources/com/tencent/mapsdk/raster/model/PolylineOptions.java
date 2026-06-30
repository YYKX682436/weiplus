package com.tencent.mapsdk.raster.model;

/* loaded from: classes13.dex */
public final class PolylineOptions {
    public static final int LINE_TYPE_DOTTEDLINE = 2;
    public static final int LINE_TYPE_MULTICOLORLINE = 0;
    private com.tencent.mapsdk.raster.model.BitmapDescriptor arrowTexture;
    private boolean enableGradient;
    private com.tencent.mapsdk.raster.model.IndoorInfo mIndoorInfo;
    private com.tencent.mapsdk.raster.model.BitmapDescriptor reviseArrowTexture;
    private java.util.List<vc1.a2> segmentTexts;
    private vc1.b2 textStyle;
    private boolean isDottedLine = false;
    private boolean isGeodesic = false;
    private boolean isVisible = true;
    private int color = -16777216;
    private int eraseColor = -7829368;
    private float width = 10.0f;
    private float zIndex = 0.0f;
    private float edgeWidth = 0.0f;
    private int edgeColor = -983041;
    private float arrowGap = 90.0f;
    private int lineType = 0;
    private com.tencent.mapsdk.raster.model.BitmapDescriptor colorTexture = null;
    private int[] iColors = null;
    private int[] iIndexs = null;
    private int iLevel = com.tencent.mapsdk.raster.model.OverlayLevel.OverlayLevelAboveRoads;
    private boolean lineCap = false;
    private final java.util.List<com.tencent.mapsdk.raster.model.LatLng> points = new java.util.ArrayList();

    /* loaded from: classes13.dex */
    public static final class Colors {
        public static final int DARK_BLUE = 6;
        public static final int GRAYBLUE = 8;
        public static final int GREEN = 4;
        public static final int GREY = 0;
        public static final int LIGHT_BLUE = 1;
        public static final int LIVER_RED = 9;
        public static final int MID_BLUE = 5;
        public static final int RED = 2;
        public static final int TRANSPARENT = 7;
        public static final int YELLOW = 3;
    }

    public com.tencent.mapsdk.raster.model.PolylineOptions add(com.tencent.mapsdk.raster.model.LatLng latLng) {
        if (latLng == null) {
            return this;
        }
        this.points.add(latLng);
        return this;
    }

    public com.tencent.mapsdk.raster.model.PolylineOptions addAll(java.lang.Iterable<com.tencent.mapsdk.raster.model.LatLng> iterable) {
        if (iterable == null) {
            return this;
        }
        java.util.Iterator<com.tencent.mapsdk.raster.model.LatLng> it = iterable.iterator();
        while (it.hasNext()) {
            this.points.add(it.next());
        }
        return this;
    }

    public com.tencent.mapsdk.raster.model.PolylineOptions arrowGap(float f17) {
        if (f17 > 0.0f) {
            this.arrowGap = f17;
        }
        return this;
    }

    public com.tencent.mapsdk.raster.model.PolylineOptions arrowTexture(com.tencent.mapsdk.raster.model.BitmapDescriptor bitmapDescriptor) {
        if (bitmapDescriptor != null) {
            this.arrowTexture = bitmapDescriptor;
        }
        return this;
    }

    public com.tencent.mapsdk.raster.model.PolylineOptions color(int i17) {
        this.color = i17;
        return this;
    }

    public com.tencent.mapsdk.raster.model.PolylineOptions colorTexture(com.tencent.mapsdk.raster.model.BitmapDescriptor bitmapDescriptor) {
        this.colorTexture = bitmapDescriptor;
        return this;
    }

    public com.tencent.mapsdk.raster.model.PolylineOptions colors(int[] iArr, int[] iArr2) {
        this.iColors = iArr;
        this.iIndexs = iArr2;
        return this;
    }

    public com.tencent.mapsdk.raster.model.PolylineOptions edgeColor(int i17) {
        this.edgeColor = i17;
        return this;
    }

    public com.tencent.mapsdk.raster.model.PolylineOptions edgeWidth(float f17) {
        if (f17 > 0.0f) {
            this.edgeWidth = f17;
        }
        return this;
    }

    public com.tencent.mapsdk.raster.model.PolylineOptions eraseColor(int i17) {
        this.eraseColor = i17;
        return this;
    }

    public com.tencent.mapsdk.raster.model.PolylineOptions geodesic(boolean z17) {
        this.isGeodesic = z17;
        return this;
    }

    public float getArrowGap() {
        return this.arrowGap;
    }

    public com.tencent.mapsdk.raster.model.BitmapDescriptor getArrowTexture() {
        return this.arrowTexture;
    }

    public int getColor() {
        return this.color;
    }

    public com.tencent.mapsdk.raster.model.BitmapDescriptor getColorTexture() {
        return this.colorTexture;
    }

    public int[][] getColors() {
        int[] iArr;
        int[] iArr2 = this.iColors;
        if (iArr2 == null || (iArr = this.iIndexs) == null || iArr2.length != iArr.length) {
            return null;
        }
        int[][] iArr3 = (int[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Integer.TYPE, 2, iArr2.length);
        iArr3[0] = this.iColors;
        iArr3[1] = this.iIndexs;
        return iArr3;
    }

    public int getEdgeColor() {
        return this.edgeColor;
    }

    public float getEdgeWidth() {
        return this.edgeWidth;
    }

    public int getEraseColor() {
        return this.eraseColor;
    }

    public com.tencent.mapsdk.raster.model.IndoorInfo getIndoorInfo() {
        return this.mIndoorInfo;
    }

    public int getLevel() {
        return this.iLevel;
    }

    public int getLineType() {
        return this.lineType;
    }

    public java.util.List<com.tencent.mapsdk.raster.model.LatLng> getPoints() {
        return this.points;
    }

    public com.tencent.mapsdk.raster.model.BitmapDescriptor getReviseArrowTexture() {
        return this.reviseArrowTexture;
    }

    public java.util.List<vc1.a2> getSegmentTexts() {
        return this.segmentTexts;
    }

    public vc1.b2 getTextStyle() {
        return this.textStyle;
    }

    public float getWidth() {
        return this.width;
    }

    public float getZIndex() {
        return this.zIndex;
    }

    public com.tencent.mapsdk.raster.model.PolylineOptions indoorInfo(com.tencent.mapsdk.raster.model.IndoorInfo indoorInfo) {
        this.mIndoorInfo = indoorInfo;
        return this;
    }

    public boolean isDottedLine() {
        return this.isDottedLine;
    }

    public boolean isGeodesic() {
        return this.isGeodesic;
    }

    public boolean isGradientEnable() {
        return this.enableGradient;
    }

    public boolean isVisible() {
        return this.isVisible;
    }

    public com.tencent.mapsdk.raster.model.PolylineOptions level(int i17) {
        if (i17 >= com.tencent.mapsdk.raster.model.OverlayLevel.OverlayLevelAboveRoads && i17 <= com.tencent.mapsdk.raster.model.OverlayLevel.OverlayLevelAboveLabels) {
            this.iLevel = i17;
        }
        return this;
    }

    public void lineCap(boolean z17) {
        this.lineCap = z17;
    }

    public com.tencent.mapsdk.raster.model.PolylineOptions lineType(int i17) {
        this.lineType = i17;
        return this;
    }

    public com.tencent.mapsdk.raster.model.PolylineOptions reviseArrowTexture(com.tencent.mapsdk.raster.model.BitmapDescriptor bitmapDescriptor) {
        if (bitmapDescriptor != null) {
            this.reviseArrowTexture = bitmapDescriptor;
        }
        return this;
    }

    public com.tencent.mapsdk.raster.model.PolylineOptions setDottedLine(boolean z17) {
        this.isDottedLine = z17;
        return this;
    }

    public void setEnableGradient(boolean z17) {
        this.enableGradient = z17;
    }

    public com.tencent.mapsdk.raster.model.PolylineOptions setSegmentTexts(java.util.List<vc1.a2> list) {
        this.segmentTexts = list;
        return this;
    }

    public com.tencent.mapsdk.raster.model.PolylineOptions setTextStyle(vc1.b2 b2Var) {
        this.textStyle = b2Var;
        return this;
    }

    public com.tencent.mapsdk.raster.model.PolylineOptions visible(boolean z17) {
        this.isVisible = z17;
        return this;
    }

    public com.tencent.mapsdk.raster.model.PolylineOptions width(float f17) {
        if (f17 < 0.0f) {
            f17 = 0.0f;
        }
        this.width = f17;
        return this;
    }

    public com.tencent.mapsdk.raster.model.PolylineOptions zIndex(float f17) {
        this.zIndex = f17;
        return this;
    }

    public com.tencent.mapsdk.raster.model.PolylineOptions add(com.tencent.mapsdk.raster.model.LatLng... latLngArr) {
        if (latLngArr == null) {
            return this;
        }
        this.points.addAll(java.util.Arrays.asList(latLngArr));
        return this;
    }

    public boolean lineCap() {
        return this.lineCap;
    }
}
