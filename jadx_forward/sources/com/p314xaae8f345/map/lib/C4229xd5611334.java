package com.p314xaae8f345.map.lib;

/* renamed from: com.tencent.map.lib.JNIInterface */
/* loaded from: classes13.dex */
public class C4229xd5611334 implements com.p314xaae8f345.map.lib.InterfaceC4230x101b2399 {

    /* renamed from: mCallback */
    private final com.p314xaae8f345.map.lib.InterfaceC4230x101b2399 f16294x1ab9c7d2;

    public C4229xd5611334(com.p314xaae8f345.map.lib.InterfaceC4230x101b2399 interfaceC4230x101b2399) {
        this.f16294x1ab9c7d2 = interfaceC4230x101b2399;
    }

    /* renamed from: nativeEndProfile */
    public static native synchronized void m35008xe11a37c5();

    /* renamed from: nativeStartProfile */
    public static native synchronized void m35009x3d66449e();

    /* renamed from: addLineText */
    public native int m35010xcc6fb02(long j17, com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df[] c4247x704e24dfArr, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26079x1291dc9e.Text text);

    @Override // com.p314xaae8f345.map.lib.InterfaceC4230x101b2399
    /* renamed from: callback */
    public java.lang.Object mo35011xf5bc2045(int i17, int i18, java.lang.String str, byte[] bArr, java.lang.Object obj) {
        com.p314xaae8f345.map.lib.InterfaceC4230x101b2399 interfaceC4230x101b2399 = this.f16294x1ab9c7d2;
        if (interfaceC4230x101b2399 != null) {
            return interfaceC4230x101b2399.mo35011xf5bc2045(i17, i18, str, bArr, obj);
        }
        return null;
    }

    @Override // com.p314xaae8f345.map.lib.InterfaceC4230x101b2399
    /* renamed from: callbackGetGLContext */
    public int mo35012x9676f59() {
        com.p314xaae8f345.map.lib.InterfaceC4230x101b2399 interfaceC4230x101b2399 = this.f16294x1ab9c7d2;
        if (interfaceC4230x101b2399 != null) {
            return interfaceC4230x101b2399.mo35012x9676f59();
        }
        return 0;
    }

    /* renamed from: checkMapLoadFinishedTask */
    public native boolean m35013x7880f871(long j17, int i17);

    /* renamed from: getIndoorOutlineZoom */
    public native int m35014x445ba62c(long j17, java.lang.String str);

    /* renamed from: getMapEngineRenderStatus */
    public native java.lang.String m35015xc5a10550(long j17);

    /* renamed from: nativeAddAggregationOverlay */
    public native long m35016xb99a85b8(long j17, com.p314xaae8f345.map.lib.p496xc04b6a6a.C4235xdb5660fc c4235xdb5660fc);

    /* renamed from: nativeAddArcLineOverlay */
    public native long m35017x5f604fb4(long j17, com.p314xaae8f345.map.lib.p496xc04b6a6a.C4238x31bc77f8 c4238x31bc77f8);

    /* renamed from: nativeAddCircle */
    public native int m35018xca875e7a(long j17, com.p314xaae8f345.map.lib.p496xc04b6a6a.C4239x349689be c4239x349689be);

    /* renamed from: nativeAddGLModel */
    public native long m35019x267cc4fa(long j17, com.p314xaae8f345.map.lib.p496xc04b6a6a.C4246xd0d06012 c4246xd0d06012);

    /* renamed from: nativeAddGroundOverlay */
    public native long m35020x1ffd97df(long j17, com.p314xaae8f345.map.lib.p496xc04b6a6a.C4248xcb6918f7 c4248xcb6918f7);

    /* renamed from: nativeAddHeatmapOverlay */
    public native long m35021x647b30ee(long j17, com.p314xaae8f345.map.lib.p496xc04b6a6a.C4249xb31cbc1a c4249xb31cbc1a);

    /* renamed from: nativeAddIntersectionOverlay */
    public native long m35022x2ae7581d(long j17, com.p314xaae8f345.map.lib.p496xc04b6a6a.C4251x5f480ab5 c4251x5f480ab5);

    /* renamed from: nativeAddMarker */
    public native int m35023xdb2735e4(long j17, java.lang.String str, java.lang.String str2, double d17, double d18, float f17, float f18, float f19, float f27, float f28, float f29, boolean z17, boolean z18, boolean z19, boolean z27, boolean z28, int i17, int i18);

    /* renamed from: nativeAddMarker2 */
    public native long m35024x89bf86ce(long j17, com.p314xaae8f345.map.lib.p496xc04b6a6a.C4254xb9489c28 c4254xb9489c28);

    /* renamed from: nativeAddMaskLayer */
    public native int m35025x4b7857db(long j17, com.p314xaae8f345.map.lib.p496xc04b6a6a.C4255x734771a5 c4255x734771a5);

    /* renamed from: nativeAddPolygon */
    public native int m35026x4007e8d0(long j17, com.p314xaae8f345.map.lib.p496xc04b6a6a.C4257x25d9a8e8 c4257x25d9a8e8);

    /* renamed from: nativeAddRouteNameSegments */
    public native void m35027x1a51dc4a(long j17, byte[][] bArr, int i17, com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df[] c4247x704e24dfArr, int i18);

    /* renamed from: nativeAddScatterPlotOverlay */
    public native long m35028xf13f913b(long j17, com.p314xaae8f345.map.lib.p496xc04b6a6a.C4259xc18f51ed c4259xc18f51ed);

    /* renamed from: nativeAddTextMarker */
    public native int m35029x7d62c71(long j17, com.p314xaae8f345.map.lib.p496xc04b6a6a.C4254xb9489c28 c4254xb9489c28);

    /* renamed from: nativeAddTileOverlay */
    public native int m35030x479ca258(long j17, com.p314xaae8f345.map.lib.p494xc1c7e8ce.InterfaceC4232xedf03407 interfaceC4232xedf03407, boolean z17, boolean z18, int i17);

    /* renamed from: nativeAddTrailOverlay */
    public native long m35031x8ba8f194(long j17, com.p314xaae8f345.map.lib.p496xc04b6a6a.C4261xfa710f58 c4261xfa710f58);

    /* renamed from: nativeBringElementAbove */
    public native void m35032xee78455c(long j17, int i17, int i18);

    /* renamed from: nativeBringElementBelow */
    public native void m35033xee87adf0(long j17, int i17, int i18);

    /* renamed from: nativeCalcMapOverLook */
    public native com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26015xa89e978e m35034x384d0863(long j17, double d17, double d18, double d19, double d27, double d28, double d29, double d37, double d38, float f17, float f18);

    /* renamed from: nativeCheckTrafficBlockCache */
    public native void m35035x9198fda1(long j17, int i17, int i18, int i19, int i27, int i28);

    /* renamed from: nativeCheckTrafficBlockCacheForReplay */
    public native void m35036xa5f42d6f(long j17, int i17, int i18, int i19, int i27, int i28);

    /* renamed from: nativeClearCache */
    public native int m35037xb8bb2cac(long j17);

    /* renamed from: nativeClearDownloadURLCache */
    public native void m35038x4c93491(long j17);

    /* renamed from: nativeClearRouteNameSegments */
    public native void m35039xbcf95a5e(long j17);

    /* renamed from: nativeCreateAnnotationText */
    public native com.p314xaae8f345.map.lib.p496xc04b6a6a.C4237x4663f48a m35040x91ef0bcf(long j17, com.p314xaae8f345.map.lib.p496xc04b6a6a.C4236xe186be0d c4236xe186be0d);

    /* renamed from: nativeCreateOrUpdateLine */
    public native int m35041x5b252a33(long j17, int i17, int[] iArr, int[] iArr2, com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df[] c4247x704e24dfArr, java.lang.String str, float f17, int i18, boolean z17, boolean z18, boolean z19, boolean z27, int i19, boolean z28, int[] iArr3, int[] iArr4, float f18, int[] iArr5, float f19, int i27, boolean z29);

    /* renamed from: nativeDeleteCircle */
    public native void m35042xea53c12(long j17, int i17);

    /* renamed from: nativeDeleteIcons */
    public native void m35043x956fe398(long j17, int[] iArr, int i17);

    /* renamed from: nativeDeleteLine */
    public native void m35044x4f2617b6(long j17, long j18, boolean z17);

    /* renamed from: nativeDeletePolygon */
    public native void m35045x7fa5be38(long j17, int i17, int i18, int[] iArr);

    /* renamed from: nativeDestroyEngine */
    public native void m35046xf9bf2005(long j17);

    /* renamed from: nativeDrawFrame */
    public native boolean m35047xedc13032(long j17);

    /* renamed from: nativeEnableBaseMap */
    public native void m35048xd2722ef1(long j17, boolean z17);

    /* renamed from: nativeEnableBuilding */
    public native void m35049x8d2d114e(long j17, boolean z17);

    /* renamed from: nativeEnablePOI */
    public native void m35050xc0bc7770(long j17, boolean z17);

    /* renamed from: nativeFetchLackedTrafficBlocks */
    public native int[] m35051x6b512b64(long j17);

    /* renamed from: nativeFromMapSight */
    public native void m35052xd14ea922(long j17, double[] dArr);

    /* renamed from: nativeFromScreenLocation */
    public native void m35053x58469f02(long j17, byte[] bArr, float f17, float f18, double[] dArr);

    /* renamed from: nativeGLProjectMatrix */
    public native float[] m35054xfd9a7a5e();

    /* renamed from: nativeGLViewMatrix */
    public native double[] m35055xa0c61f22();

    /* renamed from: nativeGLViewScaleRatio */
    public native float m35056x6ae683c2();

    /* renamed from: nativeGLViewport */
    public native int[] m35057x7f081002();

    /* renamed from: nativeGenerateTextures */
    public native boolean m35058x4c0a8984(long j17);

    /* renamed from: nativeGetActiveIndoorBuildingGUID */
    public native java.lang.String m35059x74d845b5(long j17);

    /* renamed from: nativeGetAggregationUnit */
    public native com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26095x1582c113 m35060xcdc159c7(long j17, long j18, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26);

    /* renamed from: nativeGetAndResetDirty */
    public native boolean m35061xc5be077b(long j17);

    /* renamed from: nativeGetBlockRouteInfo */
    public native java.lang.String m35062x60e27629(long j17, int i17, int i18);

    /* renamed from: nativeGetCenterMapPoint */
    public native void m35063x71afd2a8(long j17, com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df);

    /* renamed from: nativeGetCityName */
    public native byte[] m35064xa84b75(long j17, com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df);

    /* renamed from: nativeGetCurIndoorName */
    public native java.lang.String m35065x91b4745f(long j17, com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df);

    /* renamed from: nativeGetCurrentMaterialVariant */
    public native int m35066x602eb144(long j17, long j18);

    /* renamed from: nativeGetDataEngineVersion */
    public native java.lang.String m35067xfbfcaaad(long j17);

    /* renamed from: nativeGetEngineId */
    public native int m35068xc1e7ebdc(long j17);

    /* renamed from: nativeGetEngineLogInfo */
    public native java.lang.String m35069x88036bf1(long j17);

    /* renamed from: nativeGetGLModelSkeletonAnimationCount */
    public native int m35070x99a1ac9d(long j17, long j18);

    /* renamed from: nativeGetGLModelSkeletonAnimationDuration */
    public native float[] m35071xe4a89f46(long j17, long j18);

    /* renamed from: nativeGetGLModelSkeletonAnimationName */
    public native java.lang.String[] m35072x80d8753d(long j17, long j18);

    /* renamed from: nativeGetIndoorBound */
    public native android.graphics.Rect m35073x5cb61dac(long j17);

    /* renamed from: nativeGetIndoorCurrentFloorId */
    public native int m35074xa9e9ba20(long j17);

    /* renamed from: nativeGetIndoorFloorNames */
    public native java.lang.String[] m35075xbd69f32e(long j17);

    /* renamed from: nativeGetLanguage */
    public native int m35076xf5380437(long j17);

    /* renamed from: nativeGetMapEngineVersion */
    public native java.lang.String m35077xfc0e4e19(long j17);

    /* renamed from: nativeGetMapStyle */
    public native int m35078x5f68f294(long j17);

    /* renamed from: nativeGetPoisInScreen */
    public native java.util.ArrayList m35079xf8a0f5d9(long j17);

    /* renamed from: nativeGetRotate */
    public native float m35080x1454f9fa(long j17);

    /* renamed from: nativeGetScale */
    public native double m35081x8d135ccb(long j17);

    /* renamed from: nativeGetScaleLevel */
    public native int m35082x36c9579(long j17);

    /* renamed from: nativeGetSkew */
    public native float m35083xc27c9d69(long j17);

    /* renamed from: nativeGetTargetScale */
    public native double m35084x2ad8e8fa(long j17, android.graphics.Rect rect, android.graphics.Rect rect2);

    /* renamed from: nativeGetTrafficCityInfo */
    public native boolean m35085x730a417(long j17, java.lang.String str, com.p314xaae8f345.map.lib.p496xc04b6a6a.C4240xe09df9c0 c4240xe09df9c0);

    /* renamed from: nativeGetVariantNames */
    public native java.lang.String[] m35086xc26e4b22(long j17, long j18);

    /* renamed from: nativeHasStreetRoad */
    public native boolean m35087x8ca2fd26(long j17, java.lang.String str);

    /* renamed from: nativeHideCompass */
    public native void m35088xb051cd9(long j17);

    /* renamed from: nativeHideIcons */
    public native void m35089x180778a1(long j17, int[] iArr, int i17);

    /* renamed from: nativeHideStreetRoad */
    public native void m35090x5a3ac09c(long j17);

    /* renamed from: nativeHideTraffic */
    public native void m35091x92c001c4(long j17);

    /* renamed from: nativeIndoorBuildingEnabled */
    public native void m35092x5142f343(long j17, boolean z17);

    /* renamed from: nativeInitEngine */
    public native long m35093xdd2e7ae9(java.lang.String str, java.lang.String str2, java.lang.String str3, float f17, int i17, float f18, int[] iArr, boolean z17, int i18);

    /* renamed from: nativeIsCityHasTraffic */
    public native int m35094x7fc6dfcf(long j17, java.lang.String str);

    @java.lang.Deprecated
    /* renamed from: nativeIsMapDrawFinished */
    public native boolean m35095xe5734f71(long j17);

    /* renamed from: nativeIsTileOverlayEnabled */
    public native boolean m35096x727160a0(long j17);

    /* renamed from: nativeLandMarkEnabled */
    public native void m35097xb949e7b2(long j17, boolean z17);

    /* renamed from: nativeLineClearPoint */
    public native void m35098x42206a4e(long j17, long j18, com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df, int i17);

    /* renamed from: nativeLineInsertPoint */
    public native void m35099x5edafcac(long j17, long j18, com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df, int i17);

    /* renamed from: nativeLoadBlockRouteCityList */
    public native void m35100x81fbdb02(long j17, int[] iArr, int[] iArr2, int i17);

    /* renamed from: nativeLockEngine */
    public native void m35101x2f01ac4(long j17);

    /* renamed from: nativeMapLoadKMLFile */
    public native void m35102x9f89ed1b(long j17, java.lang.String str);

    /* renamed from: nativeMapResumeRenderMsgQueue */
    public native void m35103xea20ecb8(long j17);

    /* renamed from: nativeMapSetSatelliteServerFullUrl */
    public native void m35104xca5eeadf(long j17, java.lang.String str);

    /* renamed from: nativeMapSightGetOnScreenHeight */
    public native float m35105x6c9f530(long j17);

    /* renamed from: nativeMoveBy */
    public native void m35106x84ae22ff(long j17, float f17, float f18, boolean z17);

    /* renamed from: nativeNeedDispaly */
    public native boolean m35107xe9c7ebf(long j17);

    /* renamed from: nativeNeedRedraw */
    public native boolean m35108x93fc51a4(long j17);

    /* renamed from: nativeOnTap */
    public native byte[] m35109x677baf6d(long j17, float f17, float f18);

    /* renamed from: nativeOnTapLine */
    public native boolean m35110xda305501(long j17, float f17, float f18);

    /* renamed from: nativeQueryCityCodeList */
    public native int m35111xf7753847(long j17, android.graphics.Rect rect, int i17, int[] iArr, int i18);

    /* renamed from: nativeRefreshTrafficData */
    public native int m35112x7e9861e3(long j17, byte[] bArr, int i17, boolean z17, boolean z18);

    /* renamed from: nativeReloadTileOverlay */
    public native void m35113xb08a6712(long j17, int i17);

    /* renamed from: nativeRemoveEngineOverlay */
    public native void m35114xe7921bf3(long j17);

    /* renamed from: nativeRemoveGLVisualizationOverlay */
    public native void m35115xd55eb84c(long j17, long j18);

    /* renamed from: nativeRemoveMaskLayer */
    public native void m35116x6a33248a(long j17, int i17);

    /* renamed from: nativeRemoveTileOverlay */
    public native void m35117xa2d6ff47(long j17, int i17);

    /* renamed from: nativeResetEnginePath */
    public native void m35118x82ef1b1f(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3);

    /* renamed from: nativeResetIndoorCellInfo */
    public native void m35119xdafe063b(long j17);

    /* renamed from: nativeResetMonoColor */
    public native void m35120x802b8da8(long j17, long j18);

    /* renamed from: nativeScheduleClickOnNextRender */
    public native void m35121x305db922(long j17, float f17, float f18);

    /* renamed from: nativeSetAmbientLight */
    public native void m35122xacb215c9(long j17, float f17, float f18, float f19, float f27);

    /* renamed from: nativeSetBlockRouteVisible */
    public native void m35123x1509358b(long j17, boolean z17);

    /* renamed from: nativeSetBuilding3DEffect */
    public native void m35124x77c42901(long j17, boolean z17);

    /* renamed from: nativeSetBuildingBlackList */
    public native void m35125x303d9b5e(long j17, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b[] c26042xcb530b7bArr);

    /* renamed from: nativeSetBuildingToSpecificFloor */
    public native void m35126x6af1ca0(long j17, java.lang.String str, java.lang.String str2);

    /* renamed from: nativeSetCallback */
    public native void m35127x45d9f230(long j17);

    /* renamed from: nativeSetCenter */
    public native void m35128xed621d00(long j17, com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df, boolean z17);

    /* renamed from: nativeSetCenterMapPointAndScaleLevel */
    public native void m35129x231b0f3d(long j17, com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df, int i17, boolean z17);

    /* renamed from: nativeSetCompassImage */
    public native void m35130xda02bbd4(long j17, java.lang.String str);

    /* renamed from: nativeSetCompassPosition */
    public native void m35131x83f04810(long j17, int i17, int i18);

    /* renamed from: nativeSetCompassVisible */
    public native void m35132xe1f48ab(long j17, boolean z17);

    /* renamed from: nativeSetDrawCap */
    public native void m35133x94068a3(long j17, long j18, boolean z17);

    /* renamed from: nativeSetFlagOfZoomToSpanForLocation */
    public native void m35134x12ecebf8(long j17, float f17, float f18, float f19, float f27);

    /* renamed from: nativeSetIconsHidden */
    public native void m35135xf9110399(long j17, int[] iArr, int i17, boolean z17);

    /* renamed from: nativeSetIndoorActiveScreenArea */
    public native void m35136x373da9dd(long j17, float f17, float f18, float f19, float f27);

    /* renamed from: nativeSetIndoorBuildingPickEnabled */
    public native void m35137x31fa5cae(long j17, boolean z17);

    /* renamed from: nativeSetIndoorBuildingStyle */
    public native void m35138x493b40ff(long j17, int i17);

    /* renamed from: nativeSetIndoorCellInfo */
    public native void m35139xfc5dce4e(long j17, com.p314xaae8f345.map.lib.p496xc04b6a6a.C4250x348f24c3[] c4250x348f24c3Arr);

    /* renamed from: nativeSetIndoorConfigType */
    public native void m35140xef5d333a(long j17, int i17);

    /* renamed from: nativeSetIndoorFloor */
    public native void m35141xf3527bae(long j17, int i17);

    /* renamed from: nativeSetIndoorMaskColor */
    public native void m35142x2ac66279(long j17, int i17);

    /* renamed from: nativeSetLanguage */
    public native void m35143xeff06543(long j17, int i17);

    /* renamed from: nativeSetLineArrowSpacing */
    public native void m35144x915d88f9(long j17, int i17, float f17);

    /* renamed from: nativeSetLineDirectionArrowTextureName */
    public native void m35145x578e997d(long j17, long j18, java.lang.String str);

    /* renamed from: nativeSetLineDrawArrow */
    public native void m35146x10cbcc86(long j17, long j18, boolean z17);

    /* renamed from: nativeSetLineFootPrintSpacing */
    public native void m35147x94d2dde3(long j17, int i17, float f17);

    /* renamed from: nativeSetLineSelected */
    public native void m35148x99eab71a(long j17, long j18, boolean z17);

    /* renamed from: nativeSetLocationCircleColor */
    public native void m35149x9f5ff6b3(long j17, int i17);

    /* renamed from: nativeSetLocationCircleHidden */
    public native void m35150x54cec05a(long j17, boolean z17);

    /* renamed from: nativeSetLocationCompassGroupImages */
    public native void m35151x54a33b25(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5);

    /* renamed from: nativeSetLocationCompassMarkerHidden */
    public native void m35152x606cc2f6(long j17, boolean z17);

    /* renamed from: nativeSetLocationCompassMarkerImage */
    public native void m35153x453caa8f(long j17, java.lang.String str);

    /* renamed from: nativeSetLocationFollow */
    public native void m35154x697be171(long j17, boolean z17, boolean z18, boolean z19, boolean z27);

    /* renamed from: nativeSetLocationHeading */
    public native void m35155x1e1d9042(long j17, float f17);

    /* renamed from: nativeSetLocationInfo */
    public native void m35156x843e7a6e(long j17, double d17, double d18, float f17, float f18, boolean z17);

    /* renamed from: nativeSetLocationMarkerHidden */
    public native void m35157x7545e044(long j17, boolean z17);

    /* renamed from: nativeSetLocationMarkerImage */
    public native int m35158xb143ab81(long j17, java.lang.String str, float f17, float f18);

    /* renamed from: nativeSetLocationMarkerLevel */
    public native void m35159xb16a9daa(long j17, int i17);

    /* renamed from: nativeSetLocationMarkerZIndex */
    public native void m35160x923eb712(long j17, int i17);

    /* renamed from: nativeSetLocationRedLineHidden */
    public native void m35161xb8fda86f(long j17, boolean z17);

    /* renamed from: nativeSetLocationRedLineInfo */
    public native void m35162x891e5cb3(long j17, float f17, int i17, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26);

    /* renamed from: nativeSetMapFontSize */
    public native void m35163x2af8f0a1(long j17, int i17);

    /* renamed from: nativeSetMapParam */
    public native void m35164x59ee4e7c(long j17, byte[] bArr);

    /* renamed from: nativeSetMapStyle */
    public native void m35165x5a2153a0(long j17, int i17, boolean z17);

    /* renamed from: nativeSetMarkerMainSubRelation */
    public native void m35166x644dad3e(long j17, int i17, int i18, boolean z17);

    /* renamed from: nativeSetMarkerScaleLevelRange */
    public native void m35167x6f9f5d5e(long j17, int i17, int i18, int i19);

    /* renamed from: nativeSetMarsXLogLevel */
    public native void m35168x652380d8(int i17, boolean z17, boolean z18);

    /* renamed from: nativeSetMaterialVariant */
    public native void m35169xdcbdb913(long j17, long j18, int i17);

    /* renamed from: nativeSetMaxScaleLevel */
    public native void m35170x9b9e9dd3(long j17, int i17);

    /* renamed from: nativeSetMinScaleLevel */
    public native void m35171x83ccd41(long j17, int i17);

    /* renamed from: nativeSetMonoColor */
    public native void m35172x5b9dc5b5(long j17, long j18, float f17, float f18, float f19);

    /* renamed from: nativeSetNeedDisplay */
    public native void m35173x7340d581(long j17, boolean z17);

    /* renamed from: nativeSetPriority */
    public native void m35174xaa64b8f(long j17, int i17, float f17);

    /* renamed from: nativeSetRotate */
    public native void m35175x78a2e06(long j17, float f17, boolean z17);

    /* renamed from: nativeSetSatelliteEnabled */
    public native void m35176x1f174871(long j17, boolean z17);

    /* renamed from: nativeSetScale */
    public native void m35177x6ba1773f(long j17, double d17, boolean z17);

    /* renamed from: nativeSetScaleLevel */
    public native void m35178x3190e385(long j17, int i17, boolean z17);

    /* renamed from: nativeSetScreenCenterOffset */
    public native void m35179xf18c43ff(long j17, float f17, float f18, boolean z17);

    /* renamed from: nativeSetServerHost */
    public native void m35180x531642b6(long j17, java.lang.String str);

    /* renamed from: nativeSetShowIndoorBuildingWhiteList */
    public native void m35181x69c50e78(long j17, java.lang.String[] strArr);

    /* renamed from: nativeSetSkew */
    public native void m35182x3d476475(long j17, float f17, boolean z17);

    /* renamed from: nativeSetSkyBoxTexture */
    public native void m35183x30f2f1c6(long j17, java.lang.String str);

    /* renamed from: nativeSetSpotOrDirectionalLight */
    public native void m35184xe98a769c(long j17, int i17, float f17, float f18, float f19, float f27, float f28, float f29, float f37);

    /* renamed from: nativeSetTileOverlayDataLevelRange */
    public native void m35185x90fe3b3a(long j17, int i17, int i18, int i19);

    /* renamed from: nativeSetTileOverlayEnabled */
    public native void m35186xd01e34a(long j17, boolean z17);

    /* renamed from: nativeSetTileOverlayPriority */
    public native void m35187xebe122bb(long j17, int i17, int i18);

    /* renamed from: nativeSetTileOverlayVisibleLevelRange */
    public native void m35188xc25646f4(long j17, int i17, int i18, int i19);

    /* renamed from: nativeSetTrafficColor */
    public native void m35189xb825b7d1(long j17, int i17, int i18, int i19, int i27);

    /* renamed from: nativeSetTrafficMode */
    public native void m35190xdcaaeb75(long j17, int i17, int i18);

    /* renamed from: nativeSetTrafficStyle */
    public native void m35191xb909a61f(long j17, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26092x3b1815d4 c26092x3b1815d4);

    /* renamed from: nativeSetTurnArrow */
    public native void m35192xaa8d3501(long j17, long j18, com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df[] c4247x704e24dfArr, int i17, int i18);

    /* renamed from: nativeSetTurnArrowStyle */
    public native void m35193x5ce8f130(long j17, long j18, int i17, int i18);

    /* renamed from: nativeSetViewport */
    public native void m35194x9771ca91(long j17, int i17, int i18, int i19, int i27);

    /* renamed from: nativeShowStreetRoad */
    public native void m35195xecf61097(long j17);

    /* renamed from: nativeShowTraffic */
    public native void m35196xb1102ba9(long j17);

    /* renamed from: nativeStartGLModelSkeletonAnimation */
    public native void m35197x7f04ba5e(long j17, long j18, int i17, float f17, boolean z17);

    /* renamed from: nativeStopGLModelSkeletonAnimation */
    public native void m35198xee977e8c(long j17, long j18);

    /* renamed from: nativeSwitchEngineForeGround */
    public native void m35199x2339590(long j17, boolean z17);

    /* renamed from: nativeToScreenLocation */
    public native void m35200x7a5a85d3(long j17, byte[] bArr, double d17, double d18, float[] fArr);

    /* renamed from: nativeUnlockEngine */
    public native void m35201xf3447c5d(long j17);

    /* renamed from: nativeUpdateAggregationOverlay */
    public native void m35202xfa4b26ee(long j17, long j18, com.p314xaae8f345.map.lib.p496xc04b6a6a.C4235xdb5660fc c4235xdb5660fc);

    /* renamed from: nativeUpdateArcLineOverlay */
    public native void m35203x23cdfbea(long j17, long j18, com.p314xaae8f345.map.lib.p496xc04b6a6a.C4238x31bc77f8 c4238x31bc77f8);

    /* renamed from: nativeUpdateCircle */
    public native void m35204x3e7a0b0(long j17, int i17, com.p314xaae8f345.map.lib.p496xc04b6a6a.C4239x349689be c4239x349689be);

    /* renamed from: nativeUpdateFrame */
    public native void m35205xb5fbc98d(long j17, double d17);

    /* renamed from: nativeUpdateGLModel */
    public native void m35206x1924c984(long j17, long j18, com.p314xaae8f345.map.lib.p496xc04b6a6a.C4246xd0d06012 c4246xd0d06012);

    /* renamed from: nativeUpdateGroundOverlay */
    public native void m35207x91ae8ce9(long j17, long j18, com.p314xaae8f345.map.lib.p496xc04b6a6a.C4248xcb6918f7 c4248xcb6918f7);

    /* renamed from: nativeUpdateHeatmapOverlay */
    public native void m35208x28e8dd24(long j17, long j18, com.p314xaae8f345.map.lib.p496xc04b6a6a.C4249xb31cbc1a c4249xb31cbc1a);

    /* renamed from: nativeUpdateIntersectionOverlay */
    public native void m35209x4adda7(long j17, com.p314xaae8f345.map.lib.p496xc04b6a6a.C4251x5f480ab5 c4251x5f480ab5);

    /* renamed from: nativeUpdateMapResource */
    public native void m35210x544339aa(long j17, java.lang.String str);

    /* renamed from: nativeUpdateMarker */
    public native void m35211x1487781a(long j17, com.p314xaae8f345.map.lib.p496xc04b6a6a.C4254xb9489c28 c4254xb9489c28);

    /* renamed from: nativeUpdateMarkerInfo */
    public native void m35212x159cb3e8(long j17, int i17, java.lang.String str, double d17, double d18, float f17, float f18, float f19, float f27, float f28, float f29, boolean z17, boolean z18, boolean z19, boolean z27, boolean z28, int i18, int i19, boolean z29);

    /* renamed from: nativeUpdateMaskLayer */
    public native void m35213x343161e5(long j17, int i17, int i18);

    /* renamed from: nativeUpdatePolygon */
    public native void m35214x32afed5a(long j17, int i17, int i18, com.p314xaae8f345.map.lib.p496xc04b6a6a.C4257x25d9a8e8 c4257x25d9a8e8);

    /* renamed from: nativeUpdateScatterPlotOverlay */
    public native void m35215x31f03271(long j17, long j18, com.p314xaae8f345.map.lib.p496xc04b6a6a.C4259xc18f51ed c4259xc18f51ed);

    /* renamed from: nativeUpdateTextMarker */
    public native void m35216x363e63a7(long j17, int i17, com.p314xaae8f345.map.lib.p496xc04b6a6a.C4254xb9489c28 c4254xb9489c28);

    /* renamed from: nativeUpdateTrailOverlay */
    public native void m35217xc0e0334a(long j17, long j18, com.p314xaae8f345.map.lib.p496xc04b6a6a.C4261xfa710f58 c4261xfa710f58);

    /* renamed from: nativeWriteMapDataBlock */
    public native com.p314xaae8f345.p519xbf8bc95e.p539x6855e30.p540xb307e119.C4426xb46a6782 m35218x1006f72f(long j17, java.lang.String str, byte[] bArr);

    /* renamed from: nativeZoomIn */
    public native void m35219x9ada134f(long j17, float f17, float f18);

    /* renamed from: nativeZoomOut */
    public native void m35220xc0686e64(long j17);

    /* renamed from: nativeZoomToSpan */
    public native void m35221xc0eca58f(long j17, android.graphics.Rect rect, android.graphics.Rect rect2, boolean z17);

    /* renamed from: nativeZoomToSpanForNavigation */
    public native void m35222xfdf5166e(long j17, com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df, int i17, int i18, boolean z17);

    @Override // com.p314xaae8f345.map.lib.InterfaceC4230x101b2399
    /* renamed from: onJniCallbackRenderMapFrame */
    public boolean mo35223x2f175b2(int i17) {
        com.p314xaae8f345.map.lib.InterfaceC4230x101b2399 interfaceC4230x101b2399 = this.f16294x1ab9c7d2;
        if (interfaceC4230x101b2399 != null) {
            return interfaceC4230x101b2399.mo35223x2f175b2(i17);
        }
        return false;
    }

    @Override // com.p314xaae8f345.map.lib.InterfaceC4230x101b2399
    /* renamed from: onMapCameraChangeStopped */
    public void mo35224x7c69869b() {
        com.p314xaae8f345.map.lib.InterfaceC4230x101b2399 interfaceC4230x101b2399 = this.f16294x1ab9c7d2;
        if (interfaceC4230x101b2399 != null) {
            interfaceC4230x101b2399.mo35224x7c69869b();
        }
    }

    @Override // com.p314xaae8f345.map.lib.InterfaceC4230x101b2399
    /* renamed from: onMapCameraChanged */
    public void mo35225xa94d27d2() {
        com.p314xaae8f345.map.lib.InterfaceC4230x101b2399 interfaceC4230x101b2399 = this.f16294x1ab9c7d2;
        if (interfaceC4230x101b2399 != null) {
            interfaceC4230x101b2399.mo35225xa94d27d2();
        }
    }

    @Override // com.p314xaae8f345.map.lib.InterfaceC4230x101b2399
    /* renamed from: onMapLoaded */
    public void mo35226x28538962() {
        com.p314xaae8f345.map.lib.InterfaceC4230x101b2399 interfaceC4230x101b2399 = this.f16294x1ab9c7d2;
        if (interfaceC4230x101b2399 != null) {
            interfaceC4230x101b2399.mo35226x28538962();
        }
    }

    @Override // com.p314xaae8f345.map.lib.InterfaceC4230x101b2399
    /* renamed from: onMarkerCollisionCallback */
    public void mo35227xf297f9e(int[] iArr, int[] iArr2) {
        com.p314xaae8f345.map.lib.InterfaceC4230x101b2399 interfaceC4230x101b2399 = this.f16294x1ab9c7d2;
        if (interfaceC4230x101b2399 != null) {
            interfaceC4230x101b2399.mo35227xf297f9e(iArr, iArr2);
        }
    }

    @Override // com.p314xaae8f345.map.lib.InterfaceC4230x101b2399
    /* renamed from: onVisualLayerClickResult */
    public void mo35228xe24fdd3(float f17, float f18, long j17, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.map.lib.InterfaceC4230x101b2399 interfaceC4230x101b2399 = this.f16294x1ab9c7d2;
        if (interfaceC4230x101b2399 != null) {
            interfaceC4230x101b2399.mo35228xe24fdd3(f17, f18, j17, str, str2);
        }
    }

    /* renamed from: removeLineText */
    public native void m35229xe7cfe7e5(long j17, int i17);

    /* renamed from: setLineTextStyle */
    public native void m35230xab8961ae(long j17, int i17, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26079x1291dc9e.Text text);

    /* renamed from: setRestrictBounds */
    public native void m35231x8591d593(long j17, double[] dArr, double[] dArr2, int i17);
}
