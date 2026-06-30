package ab3;

/* loaded from: classes15.dex */
public interface h {
    void addPinView(android.view.View view, double d17, double d18);

    void addView(java.lang.Object obj, double d17, double d18, java.lang.String str);

    void animateCamera(com.tencent.tencentmap.mapsdk.map.CameraUpdate cameraUpdate);

    void clean();

    void destroy();

    com.tencent.mapsdk.raster.model.Circle drawAccuracyCircle(double d17, double d18, double d19);

    void enableIndoorLevelPick(boolean z17);

    java.util.Collection getChilds();

    ab3.f getIController();

    int getMapCenterX();

    int getMapCenterY();

    android.graphics.Point getPointByGeoPoint(double d17, double d18);

    java.util.Set getTags();

    java.lang.Object getViewByItag(java.lang.String str);

    ab3.i getViewManager();

    int getZoom();

    int getZoomLevel();

    void invalidate();

    void removeView(android.view.View view);

    java.lang.Object removeViewByTag(java.lang.String str);

    void setBuiltInZoomControls(boolean z17);

    void setCanRotate(boolean z17);

    void setLogoMargin(int[] iArr);

    void setMapAnchor(float f17, float f18);

    void setMapViewOnTouchListener(android.view.View.OnTouchListener onTouchListener);

    void setMarkerClickListener(android.view.View view, com.tencent.tencentmap.mapsdk.map.TencentMap.OnMarkerClickListener onMarkerClickListener);

    void updateLocaitonPinLayout(android.view.View view, double d17, double d18);

    void updateMarkerView(android.view.View view);

    void zoomToSpan(double d17, double d18, double d19, double d27);
}
