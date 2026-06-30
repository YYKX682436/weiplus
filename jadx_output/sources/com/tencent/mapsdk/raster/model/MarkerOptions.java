package com.tencent.mapsdk.raster.model;

/* loaded from: classes13.dex */
public final class MarkerOptions {
    private int anchorOffsetX;
    private int anchorOffsetY;
    private com.tencent.mapsdk.raster.model.BitmapDescriptor bitmapDescriptor;
    private java.lang.String contentDescription;
    private android.view.animation.Animation hidingAnination;

    /* renamed from: id, reason: collision with root package name */
    protected java.lang.String f52491id;
    private android.view.animation.Animation infoWindowHideAnimation;
    private android.view.animation.Animation infoWindowShowAnimation;
    private com.tencent.mapsdk.raster.model.LatLng latLng;
    private com.tencent.tencentmap.mapsdk.maps.model.MarkerCollisionItem[] mCollisions;
    private com.tencent.mapsdk.raster.model.IndoorInfo mIndoorInfo;
    private android.view.View markerView;
    private android.view.animation.Animation showingAnination;
    private java.lang.String snippet;
    private java.lang.Object tag;
    private java.lang.String title;
    private int zIndex;
    private boolean isDraggable = false;
    private boolean isVisible = true;
    private boolean isGps = false;
    private float anchorU = 0.5f;
    private float anchorV = 1.0f;
    private float alpha = 1.0f;
    private float rotation = 0.0f;
    private boolean isFlat = false;
    private boolean isClockwise = true;
    private int iLevel = com.tencent.mapsdk.raster.model.OverlayLevel.OverlayLevelAboveLabels;
    private com.tencent.tencentmap.mapsdk.maps.model.MarkerCollisionRelation collisionRelation = com.tencent.tencentmap.mapsdk.maps.model.MarkerCollisionRelation.ALONE;

    public com.tencent.mapsdk.raster.model.MarkerOptions alpha(float f17) {
        this.alpha = f17;
        return this;
    }

    public com.tencent.mapsdk.raster.model.MarkerOptions anchor(float f17, float f18) {
        this.anchorU = f17;
        this.anchorV = f18;
        return this;
    }

    public com.tencent.mapsdk.raster.model.MarkerOptions clockwise(boolean z17) {
        this.isClockwise = z17;
        return this;
    }

    public com.tencent.mapsdk.raster.model.MarkerOptions contentDescription(java.lang.String str) {
        this.contentDescription = str;
        return this;
    }

    public com.tencent.mapsdk.raster.model.MarkerOptions draggable(boolean z17) {
        this.isDraggable = z17;
        return this;
    }

    public com.tencent.mapsdk.raster.model.MarkerOptions flat(boolean z17) {
        this.isFlat = z17;
        return this;
    }

    public float getAlpha() {
        return this.alpha;
    }

    public float getAnchorU() {
        return this.anchorU;
    }

    public float getAnchorV() {
        return this.anchorV;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.MarkerCollisionRelation getCollisionRelation() {
        return this.collisionRelation;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.MarkerCollisionItem[] getCollisions() {
        return this.mCollisions;
    }

    public java.lang.String getContentDescription() {
        return this.contentDescription;
    }

    public android.view.animation.Animation getHidingAnination() {
        return this.hidingAnination;
    }

    public com.tencent.mapsdk.raster.model.BitmapDescriptor getIcon() {
        return this.bitmapDescriptor;
    }

    public com.tencent.mapsdk.raster.model.IndoorInfo getIndoorInfo() {
        return this.mIndoorInfo;
    }

    public android.view.animation.Animation getInfoWindowHideAnimation() {
        return this.infoWindowHideAnimation;
    }

    public int getInfoWindowOffsetX() {
        return this.anchorOffsetX;
    }

    public android.view.animation.Animation getInfoWindowShowAnimation() {
        return this.infoWindowShowAnimation;
    }

    public int getInfowindowOffsetY() {
        return this.anchorOffsetY;
    }

    public int getLevel() {
        return this.iLevel;
    }

    public android.view.View getMarkerView() {
        return this.markerView;
    }

    public com.tencent.mapsdk.raster.model.LatLng getPosition() {
        return this.latLng;
    }

    public float getRotation() {
        return this.rotation;
    }

    public android.view.animation.Animation getShowingAnination() {
        return this.showingAnination;
    }

    public java.lang.String getSnippet() {
        return this.snippet;
    }

    public java.lang.Object getTag() {
        return this.tag;
    }

    public java.lang.String getTitle() {
        return this.title;
    }

    public int getZIndex() {
        return this.zIndex;
    }

    public com.tencent.mapsdk.raster.model.MarkerOptions icon(com.tencent.mapsdk.raster.model.BitmapDescriptor bitmapDescriptor) {
        this.bitmapDescriptor = bitmapDescriptor;
        return this;
    }

    public com.tencent.mapsdk.raster.model.MarkerOptions indoorInfo(com.tencent.mapsdk.raster.model.IndoorInfo indoorInfo) {
        this.mIndoorInfo = indoorInfo;
        return this;
    }

    public com.tencent.mapsdk.raster.model.MarkerOptions infoWindowHideAnimation(android.view.animation.Animation animation) {
        this.infoWindowHideAnimation = animation;
        return this;
    }

    public com.tencent.mapsdk.raster.model.MarkerOptions infoWindowOffset(int i17, int i18) {
        this.anchorOffsetX = i17;
        this.anchorOffsetY = i18;
        return this;
    }

    public com.tencent.mapsdk.raster.model.MarkerOptions infoWindowShowAnimation(android.view.animation.Animation animation) {
        this.infoWindowShowAnimation = animation;
        return this;
    }

    public boolean isClockwise() {
        return this.isClockwise;
    }

    public boolean isDraggable() {
        return this.isDraggable;
    }

    public boolean isFlat() {
        return this.isFlat;
    }

    public boolean isGps() {
        return this.isGps;
    }

    public boolean isVisible() {
        return this.isVisible;
    }

    public com.tencent.mapsdk.raster.model.MarkerOptions level(int i17) {
        if (i17 >= com.tencent.mapsdk.raster.model.OverlayLevel.OverlayLevelAboveRoads && i17 <= com.tencent.mapsdk.raster.model.OverlayLevel.OverlayLevelAboveLabels) {
            this.iLevel = i17;
        }
        return this;
    }

    public com.tencent.mapsdk.raster.model.MarkerOptions markerView(android.view.View view) {
        this.markerView = view;
        return this;
    }

    public com.tencent.mapsdk.raster.model.MarkerOptions position(com.tencent.mapsdk.raster.model.LatLng latLng) {
        this.latLng = latLng;
        return this;
    }

    public com.tencent.mapsdk.raster.model.MarkerOptions rotation(float f17) {
        this.rotation = f17;
        return this;
    }

    public void setCollisions(com.tencent.tencentmap.mapsdk.maps.model.MarkerCollisionItem... markerCollisionItemArr) {
        this.mCollisions = markerCollisionItemArr;
    }

    public com.tencent.mapsdk.raster.model.MarkerOptions setHidingAnination(android.view.animation.Animation animation) {
        this.hidingAnination = animation;
        return this;
    }

    public void setMarkerCollisionRelation(com.tencent.tencentmap.mapsdk.maps.model.MarkerCollisionRelation markerCollisionRelation) {
        this.collisionRelation = markerCollisionRelation;
    }

    public com.tencent.mapsdk.raster.model.MarkerOptions setShowingAnination(android.view.animation.Animation animation) {
        this.showingAnination = animation;
        return this;
    }

    public com.tencent.mapsdk.raster.model.MarkerOptions snippet(java.lang.String str) {
        this.snippet = str;
        return this;
    }

    public com.tencent.mapsdk.raster.model.MarkerOptions tag(java.lang.Object obj) {
        this.tag = obj;
        return this;
    }

    public com.tencent.mapsdk.raster.model.MarkerOptions title(java.lang.String str) {
        this.title = str;
        return this;
    }

    public com.tencent.mapsdk.raster.model.MarkerOptions visible(boolean z17) {
        this.isVisible = z17;
        return this;
    }

    public com.tencent.mapsdk.raster.model.MarkerOptions zIndex(int i17) {
        this.zIndex = i17;
        return this;
    }
}
