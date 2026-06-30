package com.tencent.mapsdk.raster.model;

/* loaded from: classes13.dex */
public final class CircleOptions {

    /* renamed from: id, reason: collision with root package name */
    private java.lang.String f52487id;
    private int strokeColor = -16777216;
    private float strokeWidth = 10.0f;
    private boolean isVisible = true;
    private double radius = 0.0d;
    private float zIndex = 0.0f;
    private com.tencent.mapsdk.raster.model.LatLng point = new com.tencent.mapsdk.raster.model.LatLng(39.908288d, 116.397572d);
    private int fillColor = 0;
    private boolean strokeDash = false;
    private android.graphics.DashPathEffect dashPathEffect = null;
    private int iLevel = com.tencent.mapsdk.raster.model.OverlayLevel.OverlayLevelAboveLabels;

    public com.tencent.mapsdk.raster.model.CircleOptions center(com.tencent.mapsdk.raster.model.LatLng latLng) {
        this.point = latLng;
        return this;
    }

    public int describeContents() {
        return 0;
    }

    public com.tencent.mapsdk.raster.model.CircleOptions fillColor(int i17) {
        this.fillColor = i17;
        return this;
    }

    public com.tencent.mapsdk.raster.model.LatLng getCenter() {
        return this.point;
    }

    public int getFillColor() {
        return this.fillColor;
    }

    public int getLevel() {
        return this.iLevel;
    }

    public double getRadius() {
        return this.radius;
    }

    public int getStrokeColor() {
        return this.strokeColor;
    }

    public boolean getStrokeDash() {
        return this.strokeDash;
    }

    public android.graphics.DashPathEffect getStrokeDashPathEffect() {
        return this.dashPathEffect;
    }

    public float getStrokeWidth() {
        return this.strokeWidth;
    }

    public float getZIndex() {
        return this.zIndex;
    }

    public boolean isVisible() {
        return this.isVisible;
    }

    public com.tencent.mapsdk.raster.model.CircleOptions level(int i17) {
        if (i17 >= com.tencent.mapsdk.raster.model.OverlayLevel.OverlayLevelAboveRoads && i17 <= com.tencent.mapsdk.raster.model.OverlayLevel.OverlayLevelAboveLabels) {
            this.iLevel = i17;
        }
        return this;
    }

    public com.tencent.mapsdk.raster.model.CircleOptions radius(double d17) {
        this.radius = d17;
        return this;
    }

    public com.tencent.mapsdk.raster.model.CircleOptions strokeColor(int i17) {
        this.strokeColor = i17;
        return this;
    }

    public com.tencent.mapsdk.raster.model.CircleOptions strokeDash(boolean z17) {
        this.strokeDash = z17;
        return this;
    }

    public com.tencent.mapsdk.raster.model.CircleOptions strokeDashPathEffect(android.graphics.DashPathEffect dashPathEffect) {
        this.dashPathEffect = dashPathEffect;
        return this;
    }

    public com.tencent.mapsdk.raster.model.CircleOptions strokeWidth(float f17) {
        if (f17 < 0.0f) {
            f17 = 0.0f;
        }
        this.strokeWidth = f17;
        return this;
    }

    public com.tencent.mapsdk.raster.model.CircleOptions visible(boolean z17) {
        this.isVisible = z17;
        return this;
    }

    public void writeToParcel(android.os.Parcel parcel, int i17) {
        android.os.Bundle bundle = new android.os.Bundle();
        com.tencent.mapsdk.raster.model.LatLng latLng = this.point;
        if (latLng != null) {
            bundle.putDouble("lat", latLng.getLatitude());
            bundle.putDouble("lng", this.point.getLongitude());
        }
        parcel.writeBundle(bundle);
        parcel.writeDouble(this.radius);
        parcel.writeFloat(this.strokeWidth);
        parcel.writeInt(this.strokeColor);
        parcel.writeInt(this.fillColor);
        parcel.writeFloat(this.zIndex);
        parcel.writeByte(this.isVisible ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f52487id);
    }

    public com.tencent.mapsdk.raster.model.CircleOptions zIndex(float f17) {
        this.zIndex = f17;
        return this;
    }
}
