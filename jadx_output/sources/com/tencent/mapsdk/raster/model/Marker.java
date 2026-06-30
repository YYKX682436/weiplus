package com.tencent.mapsdk.raster.model;

/* loaded from: classes13.dex */
public interface Marker extends com.tencent.mapsdk.raster.model.IOverlay {
    com.tencent.tencentmap.mapsdk.maps.model.MarkerCollisionRelationUnit addCollisionUnit(com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions markerOptions);

    void addCollisionUnit();

    boolean equals(java.lang.Object obj);

    float getAlpha();

    java.lang.String getContentDescription();

    @Override // com.tencent.mapsdk.raster.model.IOverlay
    java.lang.String getId();

    int getLevel();

    android.view.View getMarkerView();

    com.tencent.mapsdk.raster.model.LatLng getPosition();

    float getRotation();

    java.lang.String getSnippet();

    java.lang.Object getTag();

    java.lang.String getTitle();

    float getZIndex();

    int hashCode();

    void hideInfoWindow();

    boolean isDraggable();

    boolean isInfoWindowShown();

    @Override // com.tencent.mapsdk.raster.model.IOverlay
    boolean isVisible();

    void refreshInfoWindow();

    @Override // com.tencent.mapsdk.raster.model.IOverlay
    void remove();

    void removeCollisionUnit();

    void removeCollisionUnit(com.tencent.tencentmap.mapsdk.maps.model.MarkerCollisionRelationUnit markerCollisionRelationUnit);

    void set2Top();

    void setAlpha(float f17);

    void setAnchor(float f17, float f18);

    void setCollisions(com.tencent.tencentmap.mapsdk.maps.interfaces.Collision... collisionArr);

    void setContentDescription(java.lang.String str);

    void setDraggable(boolean z17);

    void setGifIcon(android.graphics.Bitmap[] bitmapArr, boolean z17, int i17);

    void setIcon(com.tencent.mapsdk.raster.model.BitmapDescriptor bitmapDescriptor);

    void setInfoWindowHideAnimation(android.view.animation.Animation animation);

    void setInfoWindowOffset(int i17, int i18);

    void setInfoWindowShowAnimation(android.view.animation.Animation animation);

    void setLevel(int i17);

    void setMarkerView(android.view.View view);

    void setPosition(com.tencent.mapsdk.raster.model.LatLng latLng);

    void setRotation(float f17);

    void setSnippet(java.lang.String str);

    void setTag(java.lang.Object obj);

    void setTitle(java.lang.String str);

    @Override // com.tencent.mapsdk.raster.model.IOverlay
    void setVisible(boolean z17);

    void setZIndex(float f17);

    void showInfoWindow();
}
