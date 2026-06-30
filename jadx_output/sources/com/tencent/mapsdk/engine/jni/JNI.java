package com.tencent.mapsdk.engine.jni;

/* loaded from: classes13.dex */
public class JNI {
    private com.tencent.mapsdk.engine.jni.JNICallback mCallback;
    private com.tencent.map.lib.JNIInterface mJNIInterface;

    public static synchronized void nativeEndProfile() {
        synchronized (com.tencent.mapsdk.engine.jni.JNI.class) {
            com.tencent.map.lib.JNIInterface.nativeEndProfile();
        }
    }

    public static synchronized void nativeStartProfile() {
        synchronized (com.tencent.mapsdk.engine.jni.JNI.class) {
            com.tencent.map.lib.JNIInterface.nativeStartProfile();
        }
    }

    public int addLineText(long j17, com.tencent.map.lib.models.GeoPoint[] geoPointArr, com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions.Text text) {
        return this.mJNIInterface.addLineText(j17, geoPointArr, text);
    }

    public boolean checkMapLoadFinishedTask(long j17, int i17) {
        return this.mJNIInterface.checkMapLoadFinishedTask(j17, i17);
    }

    public void destory() {
        this.mCallback.destory();
        this.mCallback = null;
        this.mJNIInterface = null;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.VectorHeatAggregationUnit getAggregationUnit(long j17, long j18, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        return this.mJNIInterface.nativeGetAggregationUnit(j17, j18, latLng);
    }

    public int getIndoorOutlineZoom(long j17, java.lang.String str) {
        return this.mJNIInterface.getIndoorOutlineZoom(j17, str);
    }

    public java.lang.String getMapEngineRenderStatus(long j17) {
        return this.mJNIInterface.getMapEngineRenderStatus(j17);
    }

    public void initCallback(com.tencent.mapsdk.internal.oo ooVar, com.tencent.mapsdk.internal.w wVar, com.tencent.mapsdk.internal.ot otVar, com.tencent.mapsdk.internal.os osVar, com.tencent.mapsdk.internal.pb pbVar, com.tencent.mapsdk.internal.ox oxVar, com.tencent.mapsdk.internal.pa paVar, com.tencent.mapsdk.internal.bq bqVar, com.tencent.mapsdk.internal.pd pdVar, com.tencent.mapsdk.internal.oz ozVar, com.tencent.mapsdk.internal.pe peVar, com.tencent.mapsdk.internal.pc pcVar) {
        com.tencent.mapsdk.engine.jni.JNICallback jNICallback = new com.tencent.mapsdk.engine.jni.JNICallback(ooVar, wVar, otVar, osVar, pbVar, oxVar, paVar, bqVar, pdVar, ozVar, peVar, pcVar);
        this.mCallback = jNICallback;
        this.mJNIInterface = new com.tencent.map.lib.JNIInterface(jNICallback);
    }

    public long nativeAddAggregatioinOverlay(long j17, com.tencent.map.lib.models.AggregationOverlayInfo aggregationOverlayInfo) {
        return this.mJNIInterface.nativeAddAggregationOverlay(j17, aggregationOverlayInfo);
    }

    public long nativeAddArcLineOverlay(long j17, com.tencent.map.lib.models.ArcLineOverlayInfo arcLineOverlayInfo) {
        return this.mJNIInterface.nativeAddArcLineOverlay(j17, arcLineOverlayInfo);
    }

    public int nativeAddCircle(long j17, com.tencent.map.lib.models.CircleInfo circleInfo) {
        return this.mJNIInterface.nativeAddCircle(j17, circleInfo);
    }

    public long nativeAddGLModel(long j17, com.tencent.map.lib.models.GLModelInfo gLModelInfo) {
        return this.mJNIInterface.nativeAddGLModel(j17, gLModelInfo);
    }

    public long nativeAddGroundOverlay(long j17, com.tencent.map.lib.models.GroundOverlayInfo groundOverlayInfo) {
        return this.mJNIInterface.nativeAddGroundOverlay(j17, groundOverlayInfo);
    }

    public long nativeAddHeatmapOverlay(long j17, com.tencent.map.lib.models.HeatmapInfo heatmapInfo) {
        return this.mJNIInterface.nativeAddHeatmapOverlay(j17, heatmapInfo);
    }

    public long nativeAddIntersectionOverlay(long j17, com.tencent.map.lib.models.IntersectionOverlayInfo intersectionOverlayInfo) {
        return this.mJNIInterface.nativeAddIntersectionOverlay(j17, intersectionOverlayInfo);
    }

    public int nativeAddMarker(long j17, java.lang.String str, java.lang.String str2, double d17, double d18, float f17, float f18, float f19, float f27, float f28, float f29, boolean z17, boolean z18, boolean z19, boolean z27, boolean z28, int i17, int i18) {
        return this.mJNIInterface.nativeAddMarker(j17, str, str2, d17, d18, f17, f18, f19, f27, f28, f29, z17, z18, z19, z27, z28, i17, i18);
    }

    public long nativeAddMarker2(long j17, com.tencent.map.lib.models.MarkerInfo markerInfo) {
        return this.mJNIInterface.nativeAddMarker2(j17, markerInfo);
    }

    public int nativeAddMaskLayer(long j17, com.tencent.map.lib.models.MaskLayer maskLayer) {
        return this.mJNIInterface.nativeAddMaskLayer(j17, maskLayer);
    }

    public int nativeAddPolygon(long j17, com.tencent.map.lib.models.PolygonInfo polygonInfo) {
        return this.mJNIInterface.nativeAddPolygon(j17, polygonInfo);
    }

    public void nativeAddRouteNameSegments(long j17, byte[][] bArr, int i17, com.tencent.map.lib.models.GeoPoint[] geoPointArr, int i18) {
        this.mJNIInterface.nativeAddRouteNameSegments(j17, bArr, i17, geoPointArr, i18);
    }

    public long nativeAddScatterOverlay(long j17, com.tencent.map.lib.models.ScatterPlotInfo scatterPlotInfo) {
        return this.mJNIInterface.nativeAddScatterPlotOverlay(j17, scatterPlotInfo);
    }

    public int nativeAddTextMarker(long j17, com.tencent.map.lib.models.MarkerInfo markerInfo) {
        return this.mJNIInterface.nativeAddTextMarker(j17, markerInfo);
    }

    public int nativeAddTileOverlay(long j17, com.tencent.map.lib.callbacks.TileOverlayCallback tileOverlayCallback, boolean z17, boolean z18, int i17) {
        return this.mJNIInterface.nativeAddTileOverlay(j17, tileOverlayCallback, z17, z18, i17);
    }

    public long nativeAddTrailOverlay(long j17, com.tencent.map.lib.models.TrailOverlayInfo trailOverlayInfo) {
        return this.mJNIInterface.nativeAddTrailOverlay(j17, trailOverlayInfo);
    }

    public void nativeBringElementAbove(long j17, int i17, int i18) {
        this.mJNIInterface.nativeBringElementAbove(j17, i17, i18);
    }

    public void nativeBringElementBelow(long j17, int i17, int i18) {
        this.mJNIInterface.nativeBringElementBelow(j17, i17, i18);
    }

    public com.tencent.tencentmap.mapsdk.maps.model.CameraPosition nativeCalcMapOverLook(long j17, android.graphics.RectF rectF, android.graphics.RectF rectF2, float f17, float f18) {
        return this.mJNIInterface.nativeCalcMapOverLook(j17, rectF.left, rectF.top, rectF.right, rectF.bottom, rectF2.left, rectF2.top, rectF2.right, rectF2.bottom, f17, f18);
    }

    public void nativeCheckTrafficBlockCache(long j17, int i17, int i18, int i19, int i27, int i28) {
        this.mJNIInterface.nativeCheckTrafficBlockCache(j17, i17, i18, i19, i27, i28);
    }

    public void nativeCheckTrafficBlockCacheForReplay(long j17, int i17, int i18, int i19, int i27, int i28) {
        this.mJNIInterface.nativeCheckTrafficBlockCacheForReplay(j17, i17, i18, i19, i27, i28);
    }

    public int nativeClearCache(long j17) {
        return this.mJNIInterface.nativeClearCache(j17);
    }

    public void nativeClearDownloadURLCache(long j17) {
        this.mJNIInterface.nativeClearDownloadURLCache(j17);
    }

    public void nativeClearRouteNameSegments(long j17) {
        this.mJNIInterface.nativeClearRouteNameSegments(j17);
    }

    public com.tencent.map.lib.models.AnnocationTextResult nativeCreateAnnotationTextBitmap(long j17, com.tencent.map.lib.models.AnnocationText annocationText) {
        return this.mJNIInterface.nativeCreateAnnotationText(j17, annocationText);
    }

    public int nativeCreateOrUpdateLine(long j17, int i17, int[] iArr, int[] iArr2, com.tencent.map.lib.models.GeoPoint[] geoPointArr, java.lang.String str, float f17, int i18, boolean z17, boolean z18, boolean z19, boolean z27, float f18, boolean z28, int[] iArr3, int[] iArr4, float f19, int[] iArr5, float f27, int i19, boolean z29) {
        com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50206g, "create or update line = " + i17 + " p:" + geoPointArr.length + " w:" + f17 + " v:" + z29 + " a:" + f27 + " bw:" + f19);
        return this.mJNIInterface.nativeCreateOrUpdateLine(j17, i17, iArr, iArr2, geoPointArr, str, f17, i18, z17, z18, z19, z27, (int) f18, z28, iArr3, iArr4, f19, iArr5, f27, i19, z29);
    }

    public void nativeDeleteCircle(long j17, int i17) {
        this.mJNIInterface.nativeDeleteCircle(j17, i17);
    }

    public void nativeDeleteIcons(long j17, int[] iArr, int i17) {
        this.mJNIInterface.nativeDeleteIcons(j17, iArr, i17);
    }

    public void nativeDeleteLine(long j17, long j18, boolean z17) {
        this.mJNIInterface.nativeDeleteLine(j17, j18, z17);
    }

    public void nativeDeletePolygon(long j17, int i17, int i18, int[] iArr) {
        this.mJNIInterface.nativeDeletePolygon(j17, i17, i18, iArr);
    }

    public void nativeDestroyEngine(long j17) {
        this.mJNIInterface.nativeDestroyEngine(j17);
    }

    public boolean nativeDrawFrame(long j17) {
        return this.mJNIInterface.nativeDrawFrame(j17);
    }

    public void nativeEnableBaseMap(long j17, boolean z17) {
        this.mJNIInterface.nativeEnableBaseMap(j17, z17);
    }

    public void nativeEnableBuilding(long j17, boolean z17) {
        this.mJNIInterface.nativeEnableBuilding(j17, z17);
    }

    public void nativeEnablePOI(long j17, boolean z17) {
        this.mJNIInterface.nativeEnablePOI(j17, z17);
    }

    public int[] nativeFetchLackedTrafficBlocks(long j17) {
        return this.mJNIInterface.nativeFetchLackedTrafficBlocks(j17);
    }

    public void nativeFromMapSight(long j17, double[] dArr) {
        this.mJNIInterface.nativeFromMapSight(j17, dArr);
    }

    public void nativeFromScreenLocation(long j17, byte[] bArr, float f17, float f18, double[] dArr) {
        this.mJNIInterface.nativeFromScreenLocation(j17, bArr, f17, f18, dArr);
    }

    public float[] nativeGLProjectMatrix() {
        return this.mJNIInterface.nativeGLProjectMatrix();
    }

    public double[] nativeGLViewMatrix() {
        return this.mJNIInterface.nativeGLViewMatrix();
    }

    public float nativeGLViewScaleRatio() {
        return this.mJNIInterface.nativeGLViewScaleRatio();
    }

    public int[] nativeGLViewport() {
        return this.mJNIInterface.nativeGLViewport();
    }

    public boolean nativeGenerateTextures(long j17) {
        return this.mJNIInterface.nativeGenerateTextures(j17);
    }

    public java.lang.String nativeGetActiveIndoorBuildingGUID(long j17) {
        return this.mJNIInterface.nativeGetActiveIndoorBuildingGUID(j17);
    }

    public boolean nativeGetAndResetDirty(long j17) {
        return this.mJNIInterface.nativeGetAndResetDirty(j17);
    }

    public java.lang.String nativeGetBlockRouteInfo(long j17, int i17, int i18) {
        return this.mJNIInterface.nativeGetBlockRouteInfo(j17, i17, i18);
    }

    public void nativeGetCenterMapPoint(long j17, com.tencent.map.lib.models.GeoPoint geoPoint) {
        this.mJNIInterface.nativeGetCenterMapPoint(j17, geoPoint);
    }

    public byte[] nativeGetCityName(long j17, com.tencent.map.lib.models.GeoPoint geoPoint) {
        return this.mJNIInterface.nativeGetCityName(j17, geoPoint);
    }

    public java.lang.String nativeGetCurIndoorName(long j17, com.tencent.map.lib.models.GeoPoint geoPoint) {
        return this.mJNIInterface.nativeGetCurIndoorName(j17, geoPoint);
    }

    public int nativeGetCurrentMaterialVariant(long j17, long j18) {
        return this.mJNIInterface.nativeGetCurrentMaterialVariant(j17, j18);
    }

    public java.lang.String nativeGetDataEngineVersion(long j17) {
        return this.mJNIInterface.nativeGetDataEngineVersion(j17);
    }

    public int nativeGetEngineId(long j17) {
        return this.mJNIInterface.nativeGetEngineId(j17);
    }

    public java.lang.String nativeGetEngineLogInfo(long j17) {
        return this.mJNIInterface.nativeGetEngineLogInfo(j17);
    }

    public int nativeGetGLModelSkeletonAnimationCount(long j17, long j18) {
        return this.mJNIInterface.nativeGetGLModelSkeletonAnimationCount(j17, j18);
    }

    public float[] nativeGetGLModelSkeletonAnimationDuration(long j17, long j18) {
        return this.mJNIInterface.nativeGetGLModelSkeletonAnimationDuration(j17, j18);
    }

    public java.lang.String[] nativeGetGLModelSkeletonAnimationName(long j17, long j18) {
        return this.mJNIInterface.nativeGetGLModelSkeletonAnimationName(j17, j18);
    }

    public android.graphics.Rect nativeGetIndoorBound(long j17) {
        return this.mJNIInterface.nativeGetIndoorBound(j17);
    }

    public int nativeGetIndoorCurrentFloorId(long j17) {
        return this.mJNIInterface.nativeGetIndoorCurrentFloorId(j17);
    }

    public java.lang.String[] nativeGetIndoorFloorNames(long j17) {
        return this.mJNIInterface.nativeGetIndoorFloorNames(j17);
    }

    public int nativeGetLanguage(long j17) {
        return this.mJNIInterface.nativeGetLanguage(j17);
    }

    public java.lang.String nativeGetMapEngineVersion(long j17) {
        return this.mJNIInterface.nativeGetDataEngineVersion(j17);
    }

    public int nativeGetMapStyle(long j17) {
        return this.mJNIInterface.nativeGetMapStyle(j17);
    }

    public java.util.ArrayList nativeGetPoisInScreen(long j17) {
        return this.mJNIInterface.nativeGetPoisInScreen(j17);
    }

    public float nativeGetRotate(long j17) {
        return this.mJNIInterface.nativeGetRotate(j17);
    }

    public double nativeGetScale(long j17) {
        return this.mJNIInterface.nativeGetScale(j17);
    }

    public int nativeGetScaleLevel(long j17) {
        return this.mJNIInterface.nativeGetScaleLevel(j17);
    }

    public float nativeGetSkew(long j17) {
        return this.mJNIInterface.nativeGetSkew(j17);
    }

    public double nativeGetTargetScale(long j17, android.graphics.Rect rect, android.graphics.Rect rect2) {
        return this.mJNIInterface.nativeGetTargetScale(j17, rect, rect2);
    }

    public boolean nativeGetTrafficCityInfo(long j17, java.lang.String str, com.tencent.map.lib.models.CityTrafficInfo cityTrafficInfo) {
        return this.mJNIInterface.nativeGetTrafficCityInfo(j17, str, cityTrafficInfo);
    }

    public java.lang.String[] nativeGetVariantNames(long j17, long j18) {
        return this.mJNIInterface.nativeGetVariantNames(j17, j18);
    }

    public boolean nativeHasStreetRoad(long j17, java.lang.String str) {
        return this.mJNIInterface.nativeHasStreetRoad(j17, str);
    }

    public void nativeHideCompass(long j17) {
        this.mJNIInterface.nativeHideCompass(j17);
    }

    public void nativeHideIcons(long j17, int[] iArr, int i17) {
        this.mJNIInterface.nativeHideIcons(j17, iArr, i17);
    }

    public void nativeHideStreetRoad(long j17) {
        this.mJNIInterface.nativeHideStreetRoad(j17);
    }

    public void nativeHideTraffic(long j17) {
        this.mJNIInterface.nativeHideTraffic(j17);
    }

    public void nativeIndoorBuildingEnabled(long j17, boolean z17) {
        this.mJNIInterface.nativeIndoorBuildingEnabled(j17, z17);
    }

    public long nativeInitEngine(java.lang.String str, java.lang.String str2, java.lang.String str3, float f17, int i17, float f18, int[] iArr, boolean z17, int i18) {
        return this.mJNIInterface.nativeInitEngine(str, str2, str3, f17, i17, f18, iArr, z17, i18);
    }

    public int nativeIsCityHasTraffic(long j17, java.lang.String str) {
        return this.mJNIInterface.nativeIsCityHasTraffic(j17, str);
    }

    @java.lang.Deprecated
    public boolean nativeIsMapDrawFinished(long j17) {
        return this.mJNIInterface.nativeIsMapDrawFinished(j17);
    }

    public boolean nativeIsTileOverlayEnabled(long j17) {
        return this.mJNIInterface.nativeIsTileOverlayEnabled(j17);
    }

    public void nativeLandMarkEnabled(long j17, boolean z17) {
        this.mJNIInterface.nativeLandMarkEnabled(j17, z17);
    }

    public void nativeLineClearPoint(long j17, long j18, com.tencent.map.lib.models.GeoPoint geoPoint, int i17) {
        this.mJNIInterface.nativeLineClearPoint(j17, j18, geoPoint, i17);
    }

    public void nativeLineInsertPoint(long j17, long j18, com.tencent.map.lib.models.GeoPoint geoPoint, int i17) {
        this.mJNIInterface.nativeLineInsertPoint(j17, j18, geoPoint, i17);
    }

    public void nativeLoadBlockRouteCityList(long j17, int[] iArr, int[] iArr2, int i17) {
        this.mJNIInterface.nativeLoadBlockRouteCityList(j17, iArr, iArr2, i17);
    }

    public void nativeLockEngine(long j17) {
        this.mJNIInterface.nativeLockEngine(j17);
    }

    public void nativeMapLoadKMLFile(long j17, java.lang.String str) {
        this.mJNIInterface.nativeMapLoadKMLFile(j17, str);
    }

    public void nativeMapSetSatelliteServerFullUrl(long j17, java.lang.String str) {
        this.mJNIInterface.nativeMapSetSatelliteServerFullUrl(j17, str);
    }

    public float nativeMapSightGetOnScreenHeight(long j17) {
        return this.mJNIInterface.nativeMapSightGetOnScreenHeight(j17);
    }

    public void nativeMoveBy(long j17, float f17, float f18, boolean z17) {
        this.mJNIInterface.nativeMoveBy(j17, f17, f18, z17);
    }

    public boolean nativeNeedDispaly(long j17) {
        return this.mJNIInterface.nativeNeedDispaly(j17);
    }

    public boolean nativeNeedRedraw(long j17) {
        return this.mJNIInterface.nativeNeedRedraw(j17);
    }

    public byte[] nativeOnTap(long j17, float f17, float f18) {
        return this.mJNIInterface.nativeOnTap(j17, f17, f18);
    }

    public boolean nativeOnTapLine(long j17, float f17, float f18) {
        return this.mJNIInterface.nativeOnTapLine(j17, f17, f18);
    }

    public int nativeQueryCityCodeList(long j17, android.graphics.Rect rect, int i17, int[] iArr, int i18) {
        return this.mJNIInterface.nativeQueryCityCodeList(j17, rect, i17, iArr, i18);
    }

    public int nativeRefreshTrafficData(long j17, byte[] bArr, int i17, boolean z17, boolean z18) {
        return this.mJNIInterface.nativeRefreshTrafficData(j17, bArr, i17, z17, z18);
    }

    public void nativeReloadTileOverlay(long j17, int i17) {
        this.mJNIInterface.nativeReloadTileOverlay(j17, i17);
    }

    public void nativeRemoveEngineOverlay(long j17) {
        this.mJNIInterface.nativeRemoveEngineOverlay(j17);
    }

    public void nativeRemoveGLVisualizationOverlay(long j17, long j18) {
        this.mJNIInterface.nativeRemoveGLVisualizationOverlay(j17, j18);
    }

    public void nativeRemoveMaskLayer(long j17, int i17) {
        this.mJNIInterface.nativeRemoveMaskLayer(j17, i17);
    }

    public void nativeRemovePolygon(long j17, int i17, int i18, int[] iArr) {
        this.mJNIInterface.nativeDeletePolygon(j17, i17, i18, iArr);
    }

    public void nativeRemoveTileOverlay(long j17, int i17) {
        this.mJNIInterface.nativeRemoveTileOverlay(j17, i17);
    }

    public void nativeResetEnginePath(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.mJNIInterface.nativeResetEnginePath(j17, str, str2, str3);
    }

    public void nativeResetIndoorCellInfo(long j17) {
        this.mJNIInterface.nativeResetIndoorCellInfo(j17);
    }

    public void nativeResetMonoColor(long j17, long j18) {
        this.mJNIInterface.nativeResetMonoColor(j17, j18);
    }

    public void nativeResumeRenderMsgQueue(long j17) {
        this.mJNIInterface.nativeMapResumeRenderMsgQueue(j17);
    }

    public void nativeSetAmbientLight(long j17, com.tencent.tencentmap.mapsdk.maps.model.LightColor lightColor, float f17) {
        this.mJNIInterface.nativeSetAmbientLight(j17, lightColor.getR(), lightColor.getG(), lightColor.getB(), f17);
    }

    public void nativeSetBlockRouteVisible(long j17, boolean z17) {
        this.mJNIInterface.nativeSetBlockRouteVisible(j17, z17);
    }

    public void nativeSetBuilding3DEffect(long j17, boolean z17) {
        this.mJNIInterface.nativeSetBuilding3DEffect(j17, z17);
    }

    public void nativeSetBuildingBlackList(long j17, com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds[] latLngBoundsArr) {
        this.mJNIInterface.nativeSetBuildingBlackList(j17, latLngBoundsArr);
    }

    public void nativeSetBuildingToSpecificFloor(long j17, java.lang.String str, java.lang.String str2) {
        this.mJNIInterface.nativeSetBuildingToSpecificFloor(j17, str, str2);
    }

    public void nativeSetCallback(long j17) {
        this.mJNIInterface.nativeSetCallback(j17);
    }

    public void nativeSetCenter(long j17, com.tencent.map.lib.models.GeoPoint geoPoint, boolean z17) {
        this.mJNIInterface.nativeSetCenter(j17, geoPoint, z17);
    }

    public void nativeSetCenterMapPointAndScaleLevel(long j17, com.tencent.map.lib.models.GeoPoint geoPoint, int i17, boolean z17) {
        this.mJNIInterface.nativeSetCenterMapPointAndScaleLevel(j17, geoPoint, i17, z17);
    }

    public void nativeSetCompassImage(long j17, java.lang.String str) {
        this.mJNIInterface.nativeSetCompassImage(j17, str);
    }

    public void nativeSetCompassPosition(long j17, int i17, int i18) {
        this.mJNIInterface.nativeSetCompassPosition(j17, i17, i18);
    }

    public void nativeSetCompassVisible(long j17, boolean z17) {
        this.mJNIInterface.nativeSetCompassVisible(j17, z17);
    }

    public void nativeSetDrawCap(long j17, long j18, boolean z17) {
        this.mJNIInterface.nativeSetDrawCap(j17, j18, z17);
    }

    public void nativeSetFlagOfZoomToSpanForLocation(long j17, float f17, float f18, float f19, float f27) {
        this.mJNIInterface.nativeSetFlagOfZoomToSpanForLocation(j17, f17, f18, f19, f27);
    }

    public void nativeSetIconsHidden(long j17, int[] iArr, int i17, boolean z17) {
        this.mJNIInterface.nativeSetIconsHidden(j17, iArr, i17, z17);
    }

    public void nativeSetIndoorActiveScreenArea(long j17, float f17, float f18, float f19, float f27) {
        this.mJNIInterface.nativeSetIndoorActiveScreenArea(j17, f17, f18, f19, f27);
    }

    public void nativeSetIndoorBuildingPickEnabled(long j17, boolean z17) {
        this.mJNIInterface.nativeSetIndoorBuildingPickEnabled(j17, z17);
    }

    public void nativeSetIndoorBuildingStyle(long j17, int i17) {
        com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50206g, "nativeSetIndoorBuildingStyle:".concat(java.lang.String.valueOf(i17)));
        this.mJNIInterface.nativeSetIndoorBuildingStyle(j17, i17);
    }

    public void nativeSetIndoorCellInfo(long j17, java.util.List<com.tencent.map.lib.models.IndoorCellInfo> list) {
        if (list != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (com.tencent.map.lib.models.IndoorCellInfo indoorCellInfo : list) {
                if (indoorCellInfo != null && indoorCellInfo.getStyle() != null) {
                    arrayList.add(indoorCellInfo);
                }
            }
            this.mJNIInterface.nativeSetIndoorCellInfo(j17, (com.tencent.map.lib.models.IndoorCellInfo[]) arrayList.toArray(new com.tencent.map.lib.models.IndoorCellInfo[0]));
        }
    }

    public void nativeSetIndoorConfigType(long j17, int i17) {
        this.mJNIInterface.nativeSetIndoorConfigType(j17, i17);
    }

    public void nativeSetIndoorFloor(long j17, int i17) {
        this.mJNIInterface.nativeSetIndoorFloor(j17, i17);
    }

    public void nativeSetIndoorMaskColor(long j17, int i17) {
        this.mJNIInterface.nativeSetIndoorMaskColor(j17, i17);
    }

    public void nativeSetLanguage(long j17, int i17) {
        this.mJNIInterface.nativeSetLanguage(j17, i17);
    }

    public void nativeSetLineArrowSpacing(long j17, int i17, float f17) {
        this.mJNIInterface.nativeSetLineArrowSpacing(j17, i17, f17);
    }

    public void nativeSetLineDirectionArrowTextureName(long j17, long j18, java.lang.String str) {
        this.mJNIInterface.nativeSetLineDirectionArrowTextureName(j17, j18, str);
    }

    public void nativeSetLineDrawArrow(long j17, long j18, boolean z17) {
        this.mJNIInterface.nativeSetLineDrawArrow(j17, j18, z17);
    }

    public void nativeSetLineFootPrintSpacing(long j17, int i17, float f17) {
        this.mJNIInterface.nativeSetLineFootPrintSpacing(j17, i17, f17);
    }

    public void nativeSetLineSelected(long j17, long j18, boolean z17) {
        this.mJNIInterface.nativeSetLineSelected(j17, j18, z17);
    }

    public void nativeSetLocationCircleColor(long j17, int i17) {
        this.mJNIInterface.nativeSetLocationCircleColor(j17, i17);
    }

    public void nativeSetLocationCircleHidden(long j17, boolean z17) {
        this.mJNIInterface.nativeSetLocationCircleHidden(j17, z17);
    }

    public void nativeSetLocationCompassGroupImages(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this.mJNIInterface.nativeSetLocationCompassGroupImages(j17, str, str2, str3, str4, str5);
    }

    public void nativeSetLocationCompassMarkerHidden(long j17, boolean z17) {
        this.mJNIInterface.nativeSetLocationCompassMarkerHidden(j17, z17);
    }

    public void nativeSetLocationCompassMarkerImage(long j17, java.lang.String str) {
        this.mJNIInterface.nativeSetLocationCompassMarkerImage(j17, str);
    }

    public void nativeSetLocationFollow(long j17, boolean z17, boolean z18, boolean z19, boolean z27) {
        this.mJNIInterface.nativeSetLocationFollow(j17, z17, z18, z19, z27);
    }

    public void nativeSetLocationHeading(long j17, float f17) {
        this.mJNIInterface.nativeSetLocationHeading(j17, f17);
    }

    public void nativeSetLocationInfo(long j17, double d17, double d18, float f17, float f18, boolean z17) {
        this.mJNIInterface.nativeSetLocationInfo(j17, d17, d18, f17, f18, z17);
    }

    public void nativeSetLocationMarkerHidden(long j17, boolean z17) {
        this.mJNIInterface.nativeSetLocationMarkerHidden(j17, z17);
    }

    public int nativeSetLocationMarkerImage(long j17, java.lang.String str, float f17, float f18) {
        return this.mJNIInterface.nativeSetLocationMarkerImage(j17, str, f17, f18);
    }

    public void nativeSetLocationMarkerLevel(long j17, int i17) {
        this.mJNIInterface.nativeSetLocationMarkerLevel(j17, i17);
    }

    public void nativeSetLocationMarkerZIndex(long j17, int i17) {
        this.mJNIInterface.nativeSetLocationMarkerZIndex(j17, i17);
    }

    public void nativeSetLocationRedLineHidden(long j17, boolean z17) {
        this.mJNIInterface.nativeSetLocationRedLineHidden(j17, z17);
    }

    public void nativeSetLocationRedLineInfo(long j17, float f17, int i17, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        this.mJNIInterface.nativeSetLocationRedLineInfo(j17, f17, i17, latLng);
    }

    public void nativeSetMapFontSize(long j17, int i17) {
        this.mJNIInterface.nativeSetMapFontSize(j17, i17);
    }

    public void nativeSetMapParam(long j17, byte[] bArr) {
        this.mJNIInterface.nativeSetMapParam(j17, bArr);
    }

    public void nativeSetMapStyle(long j17, int i17, boolean z17) {
        this.mJNIInterface.nativeSetMapStyle(j17, i17, z17);
    }

    public void nativeSetMarkerMainSubRelation(long j17, int i17, int i18, boolean z17) {
        this.mJNIInterface.nativeSetMarkerMainSubRelation(j17, i17, i18, z17);
    }

    public void nativeSetMarkerScaleLevelRange(long j17, int i17, int i18, int i19) {
        this.mJNIInterface.nativeSetMarkerScaleLevelRange(j17, i17, i18, i19);
    }

    public void nativeSetMaterialVariant(long j17, long j18, int i17) {
        this.mJNIInterface.nativeSetMaterialVariant(j17, j18, i17);
    }

    public void nativeSetMaxScaleLevel(long j17, int i17) {
        this.mJNIInterface.nativeSetMaxScaleLevel(j17, i17);
    }

    public void nativeSetMinScaleLevel(long j17, int i17) {
        this.mJNIInterface.nativeSetMinScaleLevel(j17, i17);
    }

    public void nativeSetMonoColor(long j17, long j18, float f17, float f18, float f19) {
        this.mJNIInterface.nativeSetMonoColor(j17, j18, f17, f18, f19);
    }

    public void nativeSetNeedDisplay(long j17, boolean z17) {
        this.mJNIInterface.nativeSetNeedDisplay(j17, z17);
    }

    public void nativeSetPolygonHidden(long j17, int i17, int i18, boolean z17, int[] iArr) {
        int[] iArr2 = new int[iArr.length + 2];
        iArr2[0] = i17;
        iArr2[1] = i18;
        for (int i19 = 0; i19 < iArr.length; i19++) {
            iArr2[i19 + 2] = iArr[i19];
        }
        nativeSetIconsHidden(j17, iArr2, iArr.length + 2, z17);
    }

    public void nativeSetPriority(long j17, int i17, float f17) {
        this.mJNIInterface.nativeSetPriority(j17, i17, f17);
    }

    public void nativeSetRotate(long j17, float f17, boolean z17) {
        this.mJNIInterface.nativeSetRotate(j17, f17, z17);
    }

    public void nativeSetSatelliteEnabled(long j17, boolean z17) {
        this.mJNIInterface.nativeSetSatelliteEnabled(j17, z17);
    }

    public void nativeSetScale(long j17, double d17, boolean z17) {
        this.mJNIInterface.nativeSetScale(j17, d17, z17);
    }

    public void nativeSetScaleLevel(long j17, int i17, boolean z17) {
        this.mJNIInterface.nativeSetScaleLevel(j17, i17, z17);
    }

    public void nativeSetScreenCenterOffset(long j17, float f17, float f18, boolean z17) {
        this.mJNIInterface.nativeSetScreenCenterOffset(j17, f17, f18, z17);
    }

    public void nativeSetServerHost(long j17, java.lang.String str) {
        this.mJNIInterface.nativeSetServerHost(j17, str);
    }

    public void nativeSetShowIndoorBuildingWhiteList(long j17, java.lang.String[] strArr) {
        this.mJNIInterface.nativeSetShowIndoorBuildingWhiteList(j17, strArr);
    }

    public void nativeSetSkew(long j17, float f17, boolean z17) {
        this.mJNIInterface.nativeSetSkew(j17, f17, z17);
    }

    public void nativeSetSkyBoxTexture(long j17, java.lang.String str) {
        this.mJNIInterface.nativeSetSkyBoxTexture(j17, str);
    }

    public void nativeSetSpotOrDirectionalLight(long j17, com.tencent.tencentmap.mapsdk.maps.model.LightType lightType, com.tencent.tencentmap.mapsdk.maps.model.LightColor lightColor, com.tencent.tencentmap.mapsdk.maps.model.LightDirection lightDirection, float f17) {
        this.mJNIInterface.nativeSetSpotOrDirectionalLight(j17, lightType.ordinal(), lightColor.getR(), lightColor.getG(), lightColor.getB(), lightDirection.getX(), lightDirection.getY(), lightDirection.getZ(), f17);
    }

    public void nativeSetTileOverlayDataLevelRange(long j17, int i17, int i18, int i19) {
        this.mJNIInterface.nativeSetTileOverlayDataLevelRange(j17, i17, i18, i19);
    }

    public void nativeSetTileOverlayEnabled(long j17, boolean z17) {
        this.mJNIInterface.nativeSetTileOverlayEnabled(j17, z17);
    }

    public void nativeSetTileOverlayPriority(long j17, int i17, int i18) {
        this.mJNIInterface.nativeSetTileOverlayPriority(j17, i17, i18);
    }

    public void nativeSetTileOverlayVisibleLevelRange(long j17, int i17, int i18, int i19) {
        this.mJNIInterface.nativeSetTileOverlayVisibleLevelRange(j17, i17, i18, i19);
    }

    public void nativeSetTrafficColor(long j17, int i17, int i18, int i19, int i27) {
        this.mJNIInterface.nativeSetTrafficColor(j17, i17, i18, i19, i27);
    }

    public void nativeSetTrafficMode(long j17, int i17, int i18) {
        this.mJNIInterface.nativeSetTrafficMode(j17, i17, i18);
    }

    public void nativeSetTurnArrow(long j17, long j18, java.util.List<com.tencent.map.lib.models.GeoPoint> list, int i17, int i18) {
        if (list != null) {
            this.mJNIInterface.nativeSetTurnArrow(j17, j18, (com.tencent.map.lib.models.GeoPoint[]) list.toArray(new com.tencent.map.lib.models.GeoPoint[0]), i17, i18);
        }
    }

    public void nativeSetTurnArrowStyle(long j17, long j18, int i17, int i18) {
        this.mJNIInterface.nativeSetTurnArrowStyle(j17, j18, i17, i18);
    }

    public void nativeSetViewport(long j17, int i17, int i18, int i19, int i27) {
        this.mJNIInterface.nativeSetViewport(j17, i17, i18, i19, i27);
    }

    public void nativeShowStreetRoad(long j17) {
        this.mJNIInterface.nativeShowStreetRoad(j17);
    }

    public void nativeShowTraffic(long j17) {
        this.mJNIInterface.nativeShowTraffic(j17);
    }

    public void nativeStartGLModelSkeletonAnimation(long j17, long j18, int i17, float f17, boolean z17) {
        this.mJNIInterface.nativeStartGLModelSkeletonAnimation(j17, j18, i17, f17, z17);
    }

    public void nativeStopGLModelSkeletonAnimation(long j17, long j18) {
        this.mJNIInterface.nativeStopGLModelSkeletonAnimation(j17, j18);
    }

    public void nativeSwitchEngineForeGround(long j17, boolean z17) {
        this.mJNIInterface.nativeSwitchEngineForeGround(j17, z17);
    }

    public void nativeToScreenLocation(long j17, byte[] bArr, double d17, double d18, float[] fArr) {
        this.mJNIInterface.nativeToScreenLocation(j17, bArr, d17, d18, fArr);
    }

    public void nativeUnlockEngine(long j17) {
        this.mJNIInterface.nativeUnlockEngine(j17);
    }

    public void nativeUpdateAggregatioinOverlay(long j17, long j18, com.tencent.map.lib.models.AggregationOverlayInfo aggregationOverlayInfo) {
        this.mJNIInterface.nativeUpdateAggregationOverlay(j17, j18, aggregationOverlayInfo);
    }

    public void nativeUpdateArcLineOverlay(long j17, long j18, com.tencent.map.lib.models.ArcLineOverlayInfo arcLineOverlayInfo) {
        this.mJNIInterface.nativeUpdateArcLineOverlay(j17, j18, arcLineOverlayInfo);
    }

    public void nativeUpdateCircle(long j17, int i17, com.tencent.map.lib.models.CircleInfo circleInfo) {
        this.mJNIInterface.nativeUpdateCircle(j17, i17, circleInfo);
    }

    public void nativeUpdateFrame(long j17, double d17) {
        this.mJNIInterface.nativeUpdateFrame(j17, d17);
    }

    public void nativeUpdateGLModel(long j17, long j18, com.tencent.map.lib.models.GLModelInfo gLModelInfo) {
        this.mJNIInterface.nativeUpdateGLModel(j17, j18, gLModelInfo);
    }

    public void nativeUpdateGroundOverlay(long j17, long j18, com.tencent.map.lib.models.GroundOverlayInfo groundOverlayInfo) {
        this.mJNIInterface.nativeUpdateGroundOverlay(j17, j18, groundOverlayInfo);
    }

    public void nativeUpdateHeatmapOverlay(long j17, long j18, com.tencent.map.lib.models.HeatmapInfo heatmapInfo) {
        this.mJNIInterface.nativeUpdateHeatmapOverlay(j17, j18, heatmapInfo);
    }

    public void nativeUpdateIntersectionOverlay(long j17, com.tencent.map.lib.models.IntersectionOverlayInfo intersectionOverlayInfo) {
        this.mJNIInterface.nativeUpdateIntersectionOverlay(j17, intersectionOverlayInfo);
    }

    public void nativeUpdateMapResource(long j17, java.lang.String str) {
        this.mJNIInterface.nativeUpdateMapResource(j17, str);
    }

    public void nativeUpdateMarker(long j17, com.tencent.map.lib.models.MarkerInfo markerInfo) {
        this.mJNIInterface.nativeUpdateMarker(j17, markerInfo);
    }

    public void nativeUpdateMarkerInfo(long j17, int i17, java.lang.String str, double d17, double d18, float f17, float f18, float f19, float f27, float f28, float f29, boolean z17, boolean z18, boolean z19, boolean z27, boolean z28, int i18, int i19, boolean z29) {
        this.mJNIInterface.nativeUpdateMarkerInfo(j17, i17, str, d17, d18, f17, f18, f19, f27, f28, f29, z17, z18, z19, z27, z28, i18, i19, z29);
    }

    public void nativeUpdateMaskLayer(long j17, int i17, int i18) {
        this.mJNIInterface.nativeUpdateMaskLayer(j17, i17, i18);
    }

    public void nativeUpdatePolygon(long j17, int i17, int i18, com.tencent.map.lib.models.PolygonInfo polygonInfo) {
        this.mJNIInterface.nativeUpdatePolygon(j17, i17, i18, polygonInfo);
    }

    public void nativeUpdateScatterPlotOverlay(long j17, long j18, com.tencent.map.lib.models.ScatterPlotInfo scatterPlotInfo) {
        this.mJNIInterface.nativeUpdateScatterPlotOverlay(j17, j18, scatterPlotInfo);
    }

    public void nativeUpdateTextMarker(long j17, int i17, com.tencent.map.lib.models.MarkerInfo markerInfo) {
        this.mJNIInterface.nativeUpdateTextMarker(j17, i17, markerInfo);
    }

    public void nativeUpdateTrailOverlay(long j17, long j18, com.tencent.map.lib.models.TrailOverlayInfo trailOverlayInfo) {
        this.mJNIInterface.nativeUpdateTrailOverlay(j17, j18, trailOverlayInfo);
    }

    public com.tencent.mapsdk.shell.events.EngineWriteDataModel nativeWriteMapDataBlock(long j17, java.lang.String str, byte[] bArr) {
        return this.mJNIInterface.nativeWriteMapDataBlock(j17, str, bArr);
    }

    public void nativeZoomIn(long j17, float f17, float f18) {
        this.mJNIInterface.nativeZoomIn(j17, f17, f18);
    }

    public void nativeZoomOut(long j17) {
        this.mJNIInterface.nativeZoomOut(j17);
    }

    public void nativeZoomToSpan(long j17, android.graphics.Rect rect, android.graphics.Rect rect2, boolean z17) {
        this.mJNIInterface.nativeZoomToSpan(j17, rect, rect2, z17);
    }

    public void nativeZoomToSpanForNavigation(long j17, com.tencent.map.lib.models.GeoPoint geoPoint, int i17, int i18, boolean z17) {
        this.mJNIInterface.nativeZoomToSpanForNavigation(j17, geoPoint, i17, i18, z17);
    }

    public void registerCallback(long j17) {
        nativeSetCallback(j17);
    }

    public void removeLineText(long j17, int i17) {
        this.mJNIInterface.removeLineText(j17, i17);
    }

    public void scheduleClickOnNextRender(long j17, float f17, float f18) {
        this.mJNIInterface.nativeScheduleClickOnNextRender(j17, f17, f18);
    }

    public void setLineTextStyle(long j17, int i17, com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions.Text text) {
        this.mJNIInterface.setLineTextStyle(j17, i17, text);
    }

    public void setMapCallbackGetGLContext(com.tencent.mapsdk.internal.oy oyVar) {
        com.tencent.mapsdk.engine.jni.JNICallback jNICallback = this.mCallback;
        if (jNICallback != null) {
            jNICallback.setMapCallbackGetGLContext(oyVar);
        }
    }

    public void setRestrictBounds(long j17, double[] dArr, double[] dArr2, int i17) {
        this.mJNIInterface.setRestrictBounds(j17, dArr, dArr2, i17);
    }

    public void setTrafficStyle(long j17, com.tencent.tencentmap.mapsdk.maps.model.TrafficStyle trafficStyle) {
        this.mJNIInterface.nativeSetTrafficStyle(j17, trafficStyle);
    }
}
