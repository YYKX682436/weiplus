package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class ax extends com.tencent.mapsdk.internal.au<com.tencent.mapsdk.internal.aq> implements com.tencent.tencentmap.mapsdk.maps.model.Polyline {

    /* renamed from: b, reason: collision with root package name */
    @java.lang.Deprecated
    public static final int f48866b = 4;

    /* renamed from: c, reason: collision with root package name */
    @java.lang.Deprecated
    public static final int f48867c = 3;

    /* renamed from: d, reason: collision with root package name */
    @java.lang.Deprecated
    public static final int f48868d = 2;

    /* renamed from: e, reason: collision with root package name */
    @java.lang.Deprecated
    public static final int f48869e = 1;

    /* renamed from: f, reason: collision with root package name */
    @java.lang.Deprecated
    public static final int f48870f = 6;

    /* renamed from: g, reason: collision with root package name */
    @java.lang.Deprecated
    public static final int f48871g = 0;

    /* renamed from: h, reason: collision with root package name */
    @java.lang.Deprecated
    public static final int f48872h = 33;

    /* renamed from: i, reason: collision with root package name */
    @java.lang.Deprecated
    public static final int f48873i = 19;

    /* renamed from: j, reason: collision with root package name */
    public final com.tencent.mapsdk.internal.aq f48874j;

    public ax(com.tencent.mapsdk.internal.aq aqVar) {
        this.f48874j = aqVar;
    }

    private void a(boolean z17) {
        this.f48874j.a(z17);
    }

    private com.tencent.mapsdk.internal.aq b() {
        return this.f48874j;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final void addTurnArrow(int i17, int i18) {
        this.f48874j.addTurnArrow(i17, i18);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final void appendPoint(com.tencent.tencentmap.mapsdk.maps.model.LatLng... latLngArr) {
        this.f48874j.appendPoint(latLngArr);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final void appendPoints(java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng> list) {
        this.f48874j.appendPoints(list);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final void arrowSpacing(int i17) {
        this.f48874j.arrowSpacing(i17);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final void cleanTurnArrow() {
        this.f48874j.cleanTurnArrow();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final void eraseColor(int i17) {
        this.f48874j.eraseColor(i17);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final void eraseTo(int i17, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        this.f48874j.a(i17, latLng);
    }

    @Override // com.tencent.mapsdk.internal.au
    public final /* bridge */ /* synthetic */ com.tencent.mapsdk.internal.aq f_() {
        return this.f48874j;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final int getColor() {
        return this.f48874j.getColor();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final int[][] getColors() {
        return this.f48874j.getColors();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final java.util.List<java.lang.Integer> getPattern() {
        return this.f48874j.getPattern();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng> getPoints() {
        return this.f48874j.getPoints();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions getPolylineOptions() {
        return this.f48874j.getPolylineOptions();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Tagable
    public final java.lang.Object getTag() {
        return this.f48874j.getTag();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions.Text getText() {
        com.tencent.mapsdk.internal.aq aqVar = this.f48874j;
        if (aqVar == null) {
            return null;
        }
        return aqVar.getText();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final android.graphics.Rect getVisibleRect() {
        return this.f48874j.getVisibleRect();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final float getWidth() {
        return this.f48874j.getWidth();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final boolean isAboveMaskLayer() {
        return this.f48874j.isAboveMaskLayer();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Clickable
    public final boolean isClickable() {
        com.tencent.mapsdk.internal.aq aqVar = this.f48874j;
        if (aqVar != null) {
            return aqVar.isClickable();
        }
        return false;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final boolean isGradientEnable() {
        return this.f48874j.isGradientEnable();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final void pattern(java.util.List<java.lang.Integer> list) {
        this.f48874j.pattern(list);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final void setAboveMaskLayer(boolean z17) {
        this.f48874j.setAboveMaskLayer(z17);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Animationable
    public final void setAnimation(com.tencent.tencentmap.mapsdk.maps.model.Animation animation) {
        this.f48874j.setAnimation(animation);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final void setArrow(boolean z17) {
        this.f48874j.setArrow(z17);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final void setBorderColors(int[] iArr) {
        this.f48874j.setBorderColors(iArr);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Clickable
    public final void setClickable(boolean z17) {
        this.f48874j.setClickable(z17);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final void setColor(int i17) {
        this.f48874j.setColor(i17);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final void setColorTexture(java.lang.String str) {
        this.f48874j.setColorTexture(com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptorFactory.fromAsset(str));
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final void setColors(int[] iArr, int[] iArr2) {
        this.f48874j.setColors(iArr, iArr2);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final void setEraseable(boolean z17) {
        this.f48874j.setEraseable(z17);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final void setGradientEnable(boolean z17) {
        com.tencent.mapsdk.internal.aq aqVar = this.f48874j;
        if (aqVar == null) {
            return;
        }
        aqVar.setGradientEnable(z17);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final void setPoints(java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng> list) {
        this.f48874j.setPoints(list);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final void setPolylineOptions(com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions polylineOptions) {
        if (polylineOptions == null) {
            return;
        }
        this.f48874j.setPolylineOptions(polylineOptions);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Tagable
    public final void setTag(java.lang.Object obj) {
        this.f48874j.setTag(obj);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final void setText(com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions.Text text) {
        com.tencent.mapsdk.internal.aq aqVar = this.f48874j;
        if (aqVar == null) {
            return;
        }
        aqVar.setText(text);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final void setWidth(float f17) {
        this.f48874j.setWidth(f17);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Animationable
    public final boolean startAnimation() {
        com.tencent.mapsdk.internal.aq aqVar = this.f48874j;
        if (aqVar != null) {
            return aqVar.startAnimation();
        }
        return false;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline
    public final void setColorTexture(com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor bitmapDescriptor) {
        this.f48874j.setColorTexture(bitmapDescriptor);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Polyline, com.tencent.tencentmap.mapsdk.maps.interfaces.Animationable
    public final void startAnimation(com.tencent.tencentmap.mapsdk.maps.model.Animation animation) {
        this.f48874j.startAnimation(animation);
    }
}
