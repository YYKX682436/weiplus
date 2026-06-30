package com.tencent.map.lib;

/* loaded from: classes13.dex */
public class JNIInterface implements com.tencent.map.lib.JNIInterfaceCallback {
    private final com.tencent.map.lib.JNIInterfaceCallback mCallback;

    public JNIInterface(com.tencent.map.lib.JNIInterfaceCallback jNIInterfaceCallback) {
        this.mCallback = jNIInterfaceCallback;
    }

    public static native synchronized void nativeEndProfile();

    public static native synchronized void nativeStartProfile();

    public native int addLineText(long j17, com.tencent.map.lib.models.GeoPoint[] geoPointArr, com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions.Text text);

    @Override // com.tencent.map.lib.JNIInterfaceCallback
    public java.lang.Object callback(int i17, int i18, java.lang.String str, byte[] bArr, java.lang.Object obj) {
        com.tencent.map.lib.JNIInterfaceCallback jNIInterfaceCallback = this.mCallback;
        if (jNIInterfaceCallback != null) {
            return jNIInterfaceCallback.callback(i17, i18, str, bArr, obj);
        }
        return null;
    }

    @Override // com.tencent.map.lib.JNIInterfaceCallback
    public int callbackGetGLContext() {
        com.tencent.map.lib.JNIInterfaceCallback jNIInterfaceCallback = this.mCallback;
        if (jNIInterfaceCallback != null) {
            return jNIInterfaceCallback.callbackGetGLContext();
        }
        return 0;
    }

    public native boolean checkMapLoadFinishedTask(long j17, int i17);

    public native int getIndoorOutlineZoom(long j17, java.lang.String str);

    public native java.lang.String getMapEngineRenderStatus(long j17);

    public native long nativeAddAggregationOverlay(long j17, com.tencent.map.lib.models.AggregationOverlayInfo aggregationOverlayInfo);

    public native long nativeAddArcLineOverlay(long j17, com.tencent.map.lib.models.ArcLineOverlayInfo arcLineOverlayInfo);

    public native int nativeAddCircle(long j17, com.tencent.map.lib.models.CircleInfo circleInfo);

    public native long nativeAddGLModel(long j17, com.tencent.map.lib.models.GLModelInfo gLModelInfo);

    public native long nativeAddGroundOverlay(long j17, com.tencent.map.lib.models.GroundOverlayInfo groundOverlayInfo);

    public native long nativeAddHeatmapOverlay(long j17, com.tencent.map.lib.models.HeatmapInfo heatmapInfo);

    public native long nativeAddIntersectionOverlay(long j17, com.tencent.map.lib.models.IntersectionOverlayInfo intersectionOverlayInfo);

    public native int nativeAddMarker(long j17, java.lang.String str, java.lang.String str2, double d17, double d18, float f17, float f18, float f19, float f27, float f28, float f29, boolean z17, boolean z18, boolean z19, boolean z27, boolean z28, int i17, int i18);

    public native long nativeAddMarker2(long j17, com.tencent.map.lib.models.MarkerInfo markerInfo);

    public native int nativeAddMaskLayer(long j17, com.tencent.map.lib.models.MaskLayer maskLayer);

    public native int nativeAddPolygon(long j17, com.tencent.map.lib.models.PolygonInfo polygonInfo);

    public native void nativeAddRouteNameSegments(long j17, byte[][] bArr, int i17, com.tencent.map.lib.models.GeoPoint[] geoPointArr, int i18);

    public native long nativeAddScatterPlotOverlay(long j17, com.tencent.map.lib.models.ScatterPlotInfo scatterPlotInfo);

    public native int nativeAddTextMarker(long j17, com.tencent.map.lib.models.MarkerInfo markerInfo);

    public native int nativeAddTileOverlay(long j17, com.tencent.map.lib.callbacks.TileOverlayCallback tileOverlayCallback, boolean z17, boolean z18, int i17);

    public native long nativeAddTrailOverlay(long j17, com.tencent.map.lib.models.TrailOverlayInfo trailOverlayInfo);

    public native void nativeBringElementAbove(long j17, int i17, int i18);

    public native void nativeBringElementBelow(long j17, int i17, int i18);

    public native com.tencent.tencentmap.mapsdk.maps.model.CameraPosition nativeCalcMapOverLook(long j17, double d17, double d18, double d19, double d27, double d28, double d29, double d37, double d38, float f17, float f18);

    public native void nativeCheckTrafficBlockCache(long j17, int i17, int i18, int i19, int i27, int i28);

    public native void nativeCheckTrafficBlockCacheForReplay(long j17, int i17, int i18, int i19, int i27, int i28);

    public native int nativeClearCache(long j17);

    public native void nativeClearDownloadURLCache(long j17);

    public native void nativeClearRouteNameSegments(long j17);

    public native com.tencent.map.lib.models.AnnocationTextResult nativeCreateAnnotationText(long j17, com.tencent.map.lib.models.AnnocationText annocationText);

    public native int nativeCreateOrUpdateLine(long j17, int i17, int[] iArr, int[] iArr2, com.tencent.map.lib.models.GeoPoint[] geoPointArr, java.lang.String str, float f17, int i18, boolean z17, boolean z18, boolean z19, boolean z27, int i19, boolean z28, int[] iArr3, int[] iArr4, float f18, int[] iArr5, float f19, int i27, boolean z29);

    public native void nativeDeleteCircle(long j17, int i17);

    public native void nativeDeleteIcons(long j17, int[] iArr, int i17);

    public native void nativeDeleteLine(long j17, long j18, boolean z17);

    public native void nativeDeletePolygon(long j17, int i17, int i18, int[] iArr);

    public native void nativeDestroyEngine(long j17);

    public native boolean nativeDrawFrame(long j17);

    public native void nativeEnableBaseMap(long j17, boolean z17);

    public native void nativeEnableBuilding(long j17, boolean z17);

    public native void nativeEnablePOI(long j17, boolean z17);

    public native int[] nativeFetchLackedTrafficBlocks(long j17);

    public native void nativeFromMapSight(long j17, double[] dArr);

    public native void nativeFromScreenLocation(long j17, byte[] bArr, float f17, float f18, double[] dArr);

    public native float[] nativeGLProjectMatrix();

    public native double[] nativeGLViewMatrix();

    public native float nativeGLViewScaleRatio();

    public native int[] nativeGLViewport();

    public native boolean nativeGenerateTextures(long j17);

    public native java.lang.String nativeGetActiveIndoorBuildingGUID(long j17);

    public native com.tencent.tencentmap.mapsdk.maps.model.VectorHeatAggregationUnit nativeGetAggregationUnit(long j17, long j18, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng);

    public native boolean nativeGetAndResetDirty(long j17);

    public native java.lang.String nativeGetBlockRouteInfo(long j17, int i17, int i18);

    public native void nativeGetCenterMapPoint(long j17, com.tencent.map.lib.models.GeoPoint geoPoint);

    public native byte[] nativeGetCityName(long j17, com.tencent.map.lib.models.GeoPoint geoPoint);

    public native java.lang.String nativeGetCurIndoorName(long j17, com.tencent.map.lib.models.GeoPoint geoPoint);

    public native int nativeGetCurrentMaterialVariant(long j17, long j18);

    public native java.lang.String nativeGetDataEngineVersion(long j17);

    public native int nativeGetEngineId(long j17);

    public native java.lang.String nativeGetEngineLogInfo(long j17);

    public native int nativeGetGLModelSkeletonAnimationCount(long j17, long j18);

    public native float[] nativeGetGLModelSkeletonAnimationDuration(long j17, long j18);

    public native java.lang.String[] nativeGetGLModelSkeletonAnimationName(long j17, long j18);

    public native android.graphics.Rect nativeGetIndoorBound(long j17);

    public native int nativeGetIndoorCurrentFloorId(long j17);

    public native java.lang.String[] nativeGetIndoorFloorNames(long j17);

    public native int nativeGetLanguage(long j17);

    public native java.lang.String nativeGetMapEngineVersion(long j17);

    public native int nativeGetMapStyle(long j17);

    public native java.util.ArrayList nativeGetPoisInScreen(long j17);

    public native float nativeGetRotate(long j17);

    public native double nativeGetScale(long j17);

    public native int nativeGetScaleLevel(long j17);

    public native float nativeGetSkew(long j17);

    public native double nativeGetTargetScale(long j17, android.graphics.Rect rect, android.graphics.Rect rect2);

    public native boolean nativeGetTrafficCityInfo(long j17, java.lang.String str, com.tencent.map.lib.models.CityTrafficInfo cityTrafficInfo);

    public native java.lang.String[] nativeGetVariantNames(long j17, long j18);

    public native boolean nativeHasStreetRoad(long j17, java.lang.String str);

    public native void nativeHideCompass(long j17);

    public native void nativeHideIcons(long j17, int[] iArr, int i17);

    public native void nativeHideStreetRoad(long j17);

    public native void nativeHideTraffic(long j17);

    public native void nativeIndoorBuildingEnabled(long j17, boolean z17);

    public native long nativeInitEngine(java.lang.String str, java.lang.String str2, java.lang.String str3, float f17, int i17, float f18, int[] iArr, boolean z17, int i18);

    public native int nativeIsCityHasTraffic(long j17, java.lang.String str);

    @java.lang.Deprecated
    public native boolean nativeIsMapDrawFinished(long j17);

    public native boolean nativeIsTileOverlayEnabled(long j17);

    public native void nativeLandMarkEnabled(long j17, boolean z17);

    public native void nativeLineClearPoint(long j17, long j18, com.tencent.map.lib.models.GeoPoint geoPoint, int i17);

    public native void nativeLineInsertPoint(long j17, long j18, com.tencent.map.lib.models.GeoPoint geoPoint, int i17);

    public native void nativeLoadBlockRouteCityList(long j17, int[] iArr, int[] iArr2, int i17);

    public native void nativeLockEngine(long j17);

    public native void nativeMapLoadKMLFile(long j17, java.lang.String str);

    public native void nativeMapResumeRenderMsgQueue(long j17);

    public native void nativeMapSetSatelliteServerFullUrl(long j17, java.lang.String str);

    public native float nativeMapSightGetOnScreenHeight(long j17);

    public native void nativeMoveBy(long j17, float f17, float f18, boolean z17);

    public native boolean nativeNeedDispaly(long j17);

    public native boolean nativeNeedRedraw(long j17);

    public native byte[] nativeOnTap(long j17, float f17, float f18);

    public native boolean nativeOnTapLine(long j17, float f17, float f18);

    public native int nativeQueryCityCodeList(long j17, android.graphics.Rect rect, int i17, int[] iArr, int i18);

    public native int nativeRefreshTrafficData(long j17, byte[] bArr, int i17, boolean z17, boolean z18);

    public native void nativeReloadTileOverlay(long j17, int i17);

    public native void nativeRemoveEngineOverlay(long j17);

    public native void nativeRemoveGLVisualizationOverlay(long j17, long j18);

    public native void nativeRemoveMaskLayer(long j17, int i17);

    public native void nativeRemoveTileOverlay(long j17, int i17);

    public native void nativeResetEnginePath(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3);

    public native void nativeResetIndoorCellInfo(long j17);

    public native void nativeResetMonoColor(long j17, long j18);

    public native void nativeScheduleClickOnNextRender(long j17, float f17, float f18);

    public native void nativeSetAmbientLight(long j17, float f17, float f18, float f19, float f27);

    public native void nativeSetBlockRouteVisible(long j17, boolean z17);

    public native void nativeSetBuilding3DEffect(long j17, boolean z17);

    public native void nativeSetBuildingBlackList(long j17, com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds[] latLngBoundsArr);

    public native void nativeSetBuildingToSpecificFloor(long j17, java.lang.String str, java.lang.String str2);

    public native void nativeSetCallback(long j17);

    public native void nativeSetCenter(long j17, com.tencent.map.lib.models.GeoPoint geoPoint, boolean z17);

    public native void nativeSetCenterMapPointAndScaleLevel(long j17, com.tencent.map.lib.models.GeoPoint geoPoint, int i17, boolean z17);

    public native void nativeSetCompassImage(long j17, java.lang.String str);

    public native void nativeSetCompassPosition(long j17, int i17, int i18);

    public native void nativeSetCompassVisible(long j17, boolean z17);

    public native void nativeSetDrawCap(long j17, long j18, boolean z17);

    public native void nativeSetFlagOfZoomToSpanForLocation(long j17, float f17, float f18, float f19, float f27);

    public native void nativeSetIconsHidden(long j17, int[] iArr, int i17, boolean z17);

    public native void nativeSetIndoorActiveScreenArea(long j17, float f17, float f18, float f19, float f27);

    public native void nativeSetIndoorBuildingPickEnabled(long j17, boolean z17);

    public native void nativeSetIndoorBuildingStyle(long j17, int i17);

    public native void nativeSetIndoorCellInfo(long j17, com.tencent.map.lib.models.IndoorCellInfo[] indoorCellInfoArr);

    public native void nativeSetIndoorConfigType(long j17, int i17);

    public native void nativeSetIndoorFloor(long j17, int i17);

    public native void nativeSetIndoorMaskColor(long j17, int i17);

    public native void nativeSetLanguage(long j17, int i17);

    public native void nativeSetLineArrowSpacing(long j17, int i17, float f17);

    public native void nativeSetLineDirectionArrowTextureName(long j17, long j18, java.lang.String str);

    public native void nativeSetLineDrawArrow(long j17, long j18, boolean z17);

    public native void nativeSetLineFootPrintSpacing(long j17, int i17, float f17);

    public native void nativeSetLineSelected(long j17, long j18, boolean z17);

    public native void nativeSetLocationCircleColor(long j17, int i17);

    public native void nativeSetLocationCircleHidden(long j17, boolean z17);

    public native void nativeSetLocationCompassGroupImages(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5);

    public native void nativeSetLocationCompassMarkerHidden(long j17, boolean z17);

    public native void nativeSetLocationCompassMarkerImage(long j17, java.lang.String str);

    public native void nativeSetLocationFollow(long j17, boolean z17, boolean z18, boolean z19, boolean z27);

    public native void nativeSetLocationHeading(long j17, float f17);

    public native void nativeSetLocationInfo(long j17, double d17, double d18, float f17, float f18, boolean z17);

    public native void nativeSetLocationMarkerHidden(long j17, boolean z17);

    public native int nativeSetLocationMarkerImage(long j17, java.lang.String str, float f17, float f18);

    public native void nativeSetLocationMarkerLevel(long j17, int i17);

    public native void nativeSetLocationMarkerZIndex(long j17, int i17);

    public native void nativeSetLocationRedLineHidden(long j17, boolean z17);

    public native void nativeSetLocationRedLineInfo(long j17, float f17, int i17, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng);

    public native void nativeSetMapFontSize(long j17, int i17);

    public native void nativeSetMapParam(long j17, byte[] bArr);

    public native void nativeSetMapStyle(long j17, int i17, boolean z17);

    public native void nativeSetMarkerMainSubRelation(long j17, int i17, int i18, boolean z17);

    public native void nativeSetMarkerScaleLevelRange(long j17, int i17, int i18, int i19);

    public native void nativeSetMarsXLogLevel(int i17, boolean z17, boolean z18);

    public native void nativeSetMaterialVariant(long j17, long j18, int i17);

    public native void nativeSetMaxScaleLevel(long j17, int i17);

    public native void nativeSetMinScaleLevel(long j17, int i17);

    public native void nativeSetMonoColor(long j17, long j18, float f17, float f18, float f19);

    public native void nativeSetNeedDisplay(long j17, boolean z17);

    public native void nativeSetPriority(long j17, int i17, float f17);

    public native void nativeSetRotate(long j17, float f17, boolean z17);

    public native void nativeSetSatelliteEnabled(long j17, boolean z17);

    public native void nativeSetScale(long j17, double d17, boolean z17);

    public native void nativeSetScaleLevel(long j17, int i17, boolean z17);

    public native void nativeSetScreenCenterOffset(long j17, float f17, float f18, boolean z17);

    public native void nativeSetServerHost(long j17, java.lang.String str);

    public native void nativeSetShowIndoorBuildingWhiteList(long j17, java.lang.String[] strArr);

    public native void nativeSetSkew(long j17, float f17, boolean z17);

    public native void nativeSetSkyBoxTexture(long j17, java.lang.String str);

    public native void nativeSetSpotOrDirectionalLight(long j17, int i17, float f17, float f18, float f19, float f27, float f28, float f29, float f37);

    public native void nativeSetTileOverlayDataLevelRange(long j17, int i17, int i18, int i19);

    public native void nativeSetTileOverlayEnabled(long j17, boolean z17);

    public native void nativeSetTileOverlayPriority(long j17, int i17, int i18);

    public native void nativeSetTileOverlayVisibleLevelRange(long j17, int i17, int i18, int i19);

    public native void nativeSetTrafficColor(long j17, int i17, int i18, int i19, int i27);

    public native void nativeSetTrafficMode(long j17, int i17, int i18);

    public native void nativeSetTrafficStyle(long j17, com.tencent.tencentmap.mapsdk.maps.model.TrafficStyle trafficStyle);

    public native void nativeSetTurnArrow(long j17, long j18, com.tencent.map.lib.models.GeoPoint[] geoPointArr, int i17, int i18);

    public native void nativeSetTurnArrowStyle(long j17, long j18, int i17, int i18);

    public native void nativeSetViewport(long j17, int i17, int i18, int i19, int i27);

    public native void nativeShowStreetRoad(long j17);

    public native void nativeShowTraffic(long j17);

    public native void nativeStartGLModelSkeletonAnimation(long j17, long j18, int i17, float f17, boolean z17);

    public native void nativeStopGLModelSkeletonAnimation(long j17, long j18);

    public native void nativeSwitchEngineForeGround(long j17, boolean z17);

    public native void nativeToScreenLocation(long j17, byte[] bArr, double d17, double d18, float[] fArr);

    public native void nativeUnlockEngine(long j17);

    public native void nativeUpdateAggregationOverlay(long j17, long j18, com.tencent.map.lib.models.AggregationOverlayInfo aggregationOverlayInfo);

    public native void nativeUpdateArcLineOverlay(long j17, long j18, com.tencent.map.lib.models.ArcLineOverlayInfo arcLineOverlayInfo);

    public native void nativeUpdateCircle(long j17, int i17, com.tencent.map.lib.models.CircleInfo circleInfo);

    public native void nativeUpdateFrame(long j17, double d17);

    public native void nativeUpdateGLModel(long j17, long j18, com.tencent.map.lib.models.GLModelInfo gLModelInfo);

    public native void nativeUpdateGroundOverlay(long j17, long j18, com.tencent.map.lib.models.GroundOverlayInfo groundOverlayInfo);

    public native void nativeUpdateHeatmapOverlay(long j17, long j18, com.tencent.map.lib.models.HeatmapInfo heatmapInfo);

    public native void nativeUpdateIntersectionOverlay(long j17, com.tencent.map.lib.models.IntersectionOverlayInfo intersectionOverlayInfo);

    public native void nativeUpdateMapResource(long j17, java.lang.String str);

    public native void nativeUpdateMarker(long j17, com.tencent.map.lib.models.MarkerInfo markerInfo);

    public native void nativeUpdateMarkerInfo(long j17, int i17, java.lang.String str, double d17, double d18, float f17, float f18, float f19, float f27, float f28, float f29, boolean z17, boolean z18, boolean z19, boolean z27, boolean z28, int i18, int i19, boolean z29);

    public native void nativeUpdateMaskLayer(long j17, int i17, int i18);

    public native void nativeUpdatePolygon(long j17, int i17, int i18, com.tencent.map.lib.models.PolygonInfo polygonInfo);

    public native void nativeUpdateScatterPlotOverlay(long j17, long j18, com.tencent.map.lib.models.ScatterPlotInfo scatterPlotInfo);

    public native void nativeUpdateTextMarker(long j17, int i17, com.tencent.map.lib.models.MarkerInfo markerInfo);

    public native void nativeUpdateTrailOverlay(long j17, long j18, com.tencent.map.lib.models.TrailOverlayInfo trailOverlayInfo);

    public native com.tencent.mapsdk.shell.events.EngineWriteDataModel nativeWriteMapDataBlock(long j17, java.lang.String str, byte[] bArr);

    public native void nativeZoomIn(long j17, float f17, float f18);

    public native void nativeZoomOut(long j17);

    public native void nativeZoomToSpan(long j17, android.graphics.Rect rect, android.graphics.Rect rect2, boolean z17);

    public native void nativeZoomToSpanForNavigation(long j17, com.tencent.map.lib.models.GeoPoint geoPoint, int i17, int i18, boolean z17);

    @Override // com.tencent.map.lib.JNIInterfaceCallback
    public boolean onJniCallbackRenderMapFrame(int i17) {
        com.tencent.map.lib.JNIInterfaceCallback jNIInterfaceCallback = this.mCallback;
        if (jNIInterfaceCallback != null) {
            return jNIInterfaceCallback.onJniCallbackRenderMapFrame(i17);
        }
        return false;
    }

    @Override // com.tencent.map.lib.JNIInterfaceCallback
    public void onMapCameraChangeStopped() {
        com.tencent.map.lib.JNIInterfaceCallback jNIInterfaceCallback = this.mCallback;
        if (jNIInterfaceCallback != null) {
            jNIInterfaceCallback.onMapCameraChangeStopped();
        }
    }

    @Override // com.tencent.map.lib.JNIInterfaceCallback
    public void onMapCameraChanged() {
        com.tencent.map.lib.JNIInterfaceCallback jNIInterfaceCallback = this.mCallback;
        if (jNIInterfaceCallback != null) {
            jNIInterfaceCallback.onMapCameraChanged();
        }
    }

    @Override // com.tencent.map.lib.JNIInterfaceCallback
    public void onMapLoaded() {
        com.tencent.map.lib.JNIInterfaceCallback jNIInterfaceCallback = this.mCallback;
        if (jNIInterfaceCallback != null) {
            jNIInterfaceCallback.onMapLoaded();
        }
    }

    @Override // com.tencent.map.lib.JNIInterfaceCallback
    public void onMarkerCollisionCallback(int[] iArr, int[] iArr2) {
        com.tencent.map.lib.JNIInterfaceCallback jNIInterfaceCallback = this.mCallback;
        if (jNIInterfaceCallback != null) {
            jNIInterfaceCallback.onMarkerCollisionCallback(iArr, iArr2);
        }
    }

    @Override // com.tencent.map.lib.JNIInterfaceCallback
    public void onVisualLayerClickResult(float f17, float f18, long j17, java.lang.String str, java.lang.String str2) {
        com.tencent.map.lib.JNIInterfaceCallback jNIInterfaceCallback = this.mCallback;
        if (jNIInterfaceCallback != null) {
            jNIInterfaceCallback.onVisualLayerClickResult(f17, f18, j17, str, str2);
        }
    }

    public native void removeLineText(long j17, int i17);

    public native void setLineTextStyle(long j17, int i17, com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions.Text text);

    public native void setRestrictBounds(long j17, double[] dArr, double[] dArr2, int i17);
}
