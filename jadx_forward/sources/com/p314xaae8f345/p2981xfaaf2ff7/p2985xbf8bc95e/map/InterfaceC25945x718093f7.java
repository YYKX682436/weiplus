package com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map;

/* renamed from: com.tencent.tencentmap.mapsdk.map.TencentMap */
/* loaded from: classes13.dex */
public interface InterfaceC25945x718093f7 extends com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25941x689711f8 {

    /* renamed from: MAP_STYLE_ID_NIGHT */
    @java.lang.Deprecated
    public static final int f49148xffaa3c25 = 8;

    /* renamed from: MAP_STYLE_ID_NORMAL */
    public static final int f49149xf5f6e65a = 0;

    /* renamed from: MAP_TYPE_DARK */
    public static final int f49150xa7055618 = 1008;

    /* renamed from: MAP_TYPE_NORMAL */
    public static final int f49151xcddff09 = 1000;

    /* renamed from: MAP_TYPE_SATELLITE */
    public static final int f49152xf1b93fb9 = 1011;

    /* renamed from: com.tencent.tencentmap.mapsdk.map.TencentMap$InfoWindowAdapter */
    /* loaded from: classes13.dex */
    public interface InfoWindowAdapter {
        /* renamed from: getInfoWindow */
        android.view.View mo99027xc3c42a34(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a interfaceC4409x88f1805a);

        /* renamed from: onInfoWindowDettached */
        void mo99028xf6653887(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a interfaceC4409x88f1805a, android.view.View view);
    }

    /* renamed from: com.tencent.tencentmap.mapsdk.map.TencentMap$OnErrorListener */
    /* loaded from: classes13.dex */
    public interface OnErrorListener {
        /* renamed from: collectErrorInfo */
        void mo14564xf443d4cc(java.lang.String str);
    }

    /* renamed from: com.tencent.tencentmap.mapsdk.map.TencentMap$OnIndoorStateChangeListener */
    /* loaded from: classes13.dex */
    public interface OnIndoorStateChangeListener {
        /* renamed from: onIndoorBuildingDeactivated */
        boolean mo65975xf3e3a8aa();

        /* renamed from: onIndoorBuildingFocused */
        boolean mo65976xa4a722b1();

        /* renamed from: onIndoorLevelActivated */
        boolean mo65977xc2ec745f(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4401x15ff5647 c4401x15ff5647);
    }

    /* renamed from: com.tencent.tencentmap.mapsdk.map.TencentMap$OnInfoWindowClickListener */
    /* loaded from: classes13.dex */
    public interface OnInfoWindowClickListener {
        /* renamed from: onInfoWindowClick */
        void mo66012xc56a6a0b(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a interfaceC4409x88f1805a);
    }

    /* renamed from: com.tencent.tencentmap.mapsdk.map.TencentMap$OnMapCameraChangeListener */
    /* loaded from: classes13.dex */
    public interface OnMapCameraChangeListener {
        /* renamed from: onCameraChange */
        void mo14565x21a09eb4(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4394xa89e978e c4394xa89e978e);

        /* renamed from: onCameraChangeFinish */
        void mo14566x31824067(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4394xa89e978e c4394xa89e978e);
    }

    /* renamed from: com.tencent.tencentmap.mapsdk.map.TencentMap$OnMapClickListener */
    /* loaded from: classes13.dex */
    public interface OnMapClickListener {
        /* renamed from: onMapClick */
        void mo14567xae384c8b(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 c4406x873d1d26);
    }

    /* renamed from: com.tencent.tencentmap.mapsdk.map.TencentMap$OnMapLoadedListener */
    /* loaded from: classes13.dex */
    public interface OnMapLoadedListener {
        /* renamed from: onMapLoaded */
        void mo14563x28538962();
    }

    /* renamed from: com.tencent.tencentmap.mapsdk.map.TencentMap$OnMapLongClickListener */
    /* loaded from: classes13.dex */
    public interface OnMapLongClickListener {
        /* renamed from: onMapLongClick */
        void m99029x843609ef(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 c4406x873d1d26);
    }

    /* renamed from: com.tencent.tencentmap.mapsdk.map.TencentMap$OnMapPoiClickListener */
    /* loaded from: classes13.dex */
    public interface OnMapPoiClickListener {
        /* renamed from: onClicked */
        void mo14568x82f09148(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4408x88f0336e c4408x88f0336e);
    }

    /* renamed from: com.tencent.tencentmap.mapsdk.map.TencentMap$OnMarkerClickListener */
    /* loaded from: classes13.dex */
    public interface OnMarkerClickListener {
        /* renamed from: onMarkerClick */
        boolean mo14570x289a5e0f(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a interfaceC4409x88f1805a);
    }

    /* renamed from: com.tencent.tencentmap.mapsdk.map.TencentMap$OnMarkerDraggedListener */
    /* loaded from: classes13.dex */
    public interface OnMarkerDraggedListener {
        /* renamed from: onMarkerDrag */
        void m99030x991e7cd(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a interfaceC4409x88f1805a);

        /* renamed from: onMarkerDragEnd */
        void m99031xaa2ef9ce(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a interfaceC4409x88f1805a);

        /* renamed from: onMarkerDragStart */
        void m99032xdb1fc495(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a interfaceC4409x88f1805a);
    }

    /* renamed from: com.tencent.tencentmap.mapsdk.map.TencentMap$OnScreenShotListener */
    /* loaded from: classes13.dex */
    public interface OnScreenShotListener {
        /* renamed from: onMapScreenShot */
        void mo99033x2d275c63(android.graphics.Bitmap bitmap);
    }

    /* renamed from: com.tencent.tencentmap.mapsdk.map.TencentMap$TencentMapGestureListener */
    /* loaded from: classes13.dex */
    public interface TencentMapGestureListener {
        /* renamed from: onDoubleTap */
        boolean mo99034xce1d2af3(float f17, float f18);

        /* renamed from: onDown */
        boolean mo99035xc3989f21(float f17, float f18);

        /* renamed from: onFling */
        boolean mo99036xaf95e2bd(float f17, float f18);

        /* renamed from: onLongPress */
        boolean mo99037x4f8d808(float f17, float f18);

        /* renamed from: onMapStable */
        void mo99038x348be498();

        /* renamed from: onScroll */
        boolean mo99039x58dabd8c(float f17, float f18);

        /* renamed from: onSingleTap */
        boolean mo99040xa5153b1c(float f17, float f18);

        /* renamed from: onTwoFingerMoveAgainst */
        boolean mo99041x56a01d1a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26085x16ab0426.TwoFingerMoveAgainstStatus twoFingerMoveAgainstStatus, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26015xa89e978e c26015xa89e978e);

        /* renamed from: onUp */
        boolean mo99042x341cda(float f17, float f18);
    }

    /* renamed from: addArc */
    com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.Arc mo98935xab35b9f1(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26008x51f2a00c c26008x51f2a00c);

    /* renamed from: addCircle */
    com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4395x7851a8f0 mo98936xe42464d1(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4396xfbda878e c4396xfbda878e);

    /* renamed from: addCustomLayer */
    com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4397xf8628040 mo98937xb9ff08ff(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4398xdcd7d63e c4398xdcd7d63e);

    /* renamed from: addGroundOverlay */
    com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26023x33b6bca9 mo98938x5411a8(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26024x5ce381b5 c26024x5ce381b5);

    /* renamed from: addInfoWindowAdapter */
    void mo98939xdce76490(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.InfoWindowAdapter infoWindowAdapter);

    /* renamed from: addMarker */
    com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a mo98940xf4c43c3b(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4410xea4764e4 c4410xea4764e4);

    /* renamed from: addOnInfoWindowClickListener */
    void mo98941x9a21863e(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnInfoWindowClickListener onInfoWindowClickListener);

    /* renamed from: addOnMapCameraChangeListener */
    void mo98942xd07a9805(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnMapCameraChangeListener onMapCameraChangeListener);

    /* renamed from: addOnMapClickListener */
    void mo98943x21ea68e0(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnMapClickListener onMapClickListener);

    /* renamed from: addOnMapLoadedListener */
    void mo98944x855b51d5(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnMapLoadedListener onMapLoadedListener);

    /* renamed from: addOnMapLongClickListener */
    void mo98945xc7a959c4(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnMapLongClickListener onMapLongClickListener);

    /* renamed from: addOnMarkerClickListener */
    void mo98946x848b3dc2(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnMarkerClickListener onMarkerClickListener);

    /* renamed from: addOnMarkerDraggedListener */
    void mo98947x7fb8724c(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnMarkerDraggedListener onMarkerDraggedListener);

    /* renamed from: addPolygon */
    com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4412x4b86ed1a mo98948x5a0bad59(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4413xede22024 c4413xede22024);

    /* renamed from: addPolyline */
    com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4414x2558e5e0 mo98949xe76c2d81(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4415x1291dc9e c4415x1291dc9e);

    /* renamed from: addTileOverlay */
    com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4417xb80c71a2 mo98950x79a8fa61(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4418x9c7ff29c c4418x9c7ff29c);

    /* renamed from: addVisualLayer */
    com.p314xaae8f345.map.sdk.p497x5a73344.vis.InterfaceC4273x137f8dd1 mo98951xd51c1690(com.p314xaae8f345.map.sdk.p497x5a73344.vis.C4274xbcec938d c4274xbcec938d);

    /* renamed from: animateCamera */
    void mo98952x59b77566(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.C25936xd5528c6e c25936xd5528c6e);

    /* renamed from: animateCamera */
    void mo98953x59b77566(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.C25936xd5528c6e c25936xd5528c6e, long j17, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25938xdc482359 interfaceC25938xdc482359);

    /* renamed from: clearAllOverlays */
    void mo98954x9a95e257();

    /* renamed from: clearCache */
    boolean mo98955xd2bef135();

    /* renamed from: enableAutoMaxOverlooking */
    void mo98956x35bb73fd(boolean z17);

    /* renamed from: enableMultipleInfowindow */
    void mo98957x51865b31(boolean z17);

    /* renamed from: executeMapVisualLayerCommand */
    java.lang.String mo98958x60c07621(com.p314xaae8f345.map.sdk.p497x5a73344.vis.InterfaceC4273x137f8dd1 interfaceC4273x137f8dd1, java.lang.String str);

    /* renamed from: getActivedIndoorBuilding */
    java.lang.String mo98959x92ce7e2f(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 c4406x873d1d26);

    /* renamed from: getActivedIndoorFloorNames */
    java.lang.String[] mo98960xd840e357();

    /* renamed from: getCameraPosition */
    com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4394xa89e978e mo98961xd2ef9864();

    /* renamed from: getDebugError */
    java.lang.String mo98962x7f21ff6b();

    /* renamed from: getIndoorFloorId */
    int mo98963xb62264be();

    /* renamed from: getMapCenter */
    com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 mo98964x19b45a1b();

    /* renamed from: getMapType */
    int mo98965x6facd680();

    /* renamed from: getMaxZoomLevel */
    int mo98966x6d8ed0e3();

    /* renamed from: getMinZoomLevel */
    int mo98967x89d5fbb5();

    /* renamed from: getProjection */
    com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25943x166a66f mo98968x78d58245();

    /* renamed from: getScreenShot */
    void mo98969xd55fb17c(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnScreenShotListener onScreenShotListener);

    /* renamed from: getScreenShot */
    void mo98970xd55fb17c(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnScreenShotListener onScreenShotListener, android.graphics.Rect rect);

    /* renamed from: getVersion */
    java.lang.String mo98971x52c258a2();

    /* renamed from: getZoomLevel */
    int mo98972x60df64bb();

    /* renamed from: isAppKeyAvailable */
    boolean mo98973x26f3dd61();

    /* renamed from: isHandDrawMapEnable */
    boolean mo98974xfdb0a8e2();

    /* renamed from: isSatelliteEnabled */
    boolean mo98975xec714ed0();

    /* renamed from: isTrafficEnabled */
    boolean mo98976xc7a3c24e();

    /* renamed from: moveCamera */
    void mo98977x85700a56(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.C25936xd5528c6e c25936xd5528c6e);

    /* renamed from: remmoveOnInfoWindowClickListener */
    void mo98978x94f93eb4(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnInfoWindowClickListener onInfoWindowClickListener);

    /* renamed from: removeInfoWindowAdapter */
    void mo98979x3c47470d(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.InfoWindowAdapter infoWindowAdapter);

    /* renamed from: removeOnMapCameraChangeListener */
    void mo98980x3042ad82(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnMapCameraChangeListener onMapCameraChangeListener);

    /* renamed from: removeOnMapClickListener */
    void mo98981xae86d603(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnMapClickListener onMapClickListener);

    /* renamed from: removeOnMapLoadedListener */
    void mo98982x8c4c8912(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnMapLoadedListener onMapLoadedListener);

    /* renamed from: removeOnMapLongClickListener */
    void mo98983xa8347d67(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnMapLongClickListener onMapLongClickListener);

    /* renamed from: removeOnMarkerClickListener */
    void mo98984x940b99bf(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnMarkerClickListener onMarkerClickListener);

    /* renamed from: removeOnMarkerDraggedListener */
    void mo98985xb091c309(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnMarkerDraggedListener onMarkerDraggedListener);

    /* renamed from: removeTencentMapGestureListener */
    void mo98986xd235e822(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.TencentMapGestureListener tencentMapGestureListener);

    /* renamed from: scrollBy */
    void mo98987xe8077004(float f17, float f18);

    /* renamed from: scrollBy */
    void mo98988xe8077004(float f17, float f18, long j17, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25938xdc482359 interfaceC25938xdc482359);

    /* renamed from: set3DEnable */
    void mo98989xadb5f9b6(boolean z17);

    /* renamed from: setBuilding3dEffectEnable */
    void mo98990x9a0dfe5b(boolean z17);

    /* renamed from: setErrorListener */
    void mo98991x6b43959a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnErrorListener onErrorListener);

    /* renamed from: setForeignLanguage */
    void mo98992xcbaccf8a(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.EnumC4405xa3acf778 enumC4405xa3acf778);

    /* renamed from: setHandDrawMapEnable */
    void mo98993x994c50aa(boolean z17);

    /* renamed from: setIndoorEnabled */
    void mo98994x16b0fc2c(boolean z17);

    /* renamed from: setIndoorFloor */
    void mo98995x255ed3b7(int i17);

    /* renamed from: setIndoorFloor */
    void mo98996x255ed3b7(java.lang.String str, java.lang.String str2);

    /* renamed from: setIndoorMaskColor */
    void mo98997x4f658e02(int i17);

    /* renamed from: setInfoWindowAdapter */
    void mo98998x3d10faef(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.InfoWindowAdapter infoWindowAdapter);

    /* renamed from: setMapAnchor */
    void mo98999x731810ef(float f17, float f18);

    /* renamed from: setMapBoundary */
    void mo99000xc9258fe4(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b c26042xcb530b7b);

    /* renamed from: setMapStyle */
    void mo99001x80962037(int i17);

    /* renamed from: setMapType */
    void mo99002xe31e23f4(int i17);

    /* renamed from: setMaxZoomLevel */
    void mo99003xa3d7cbef(int i17);

    /* renamed from: setMinZoomLevel */
    void mo99004xc01ef6c1(int i17);

    /* renamed from: setOnIndoorStateChangeListener */
    void mo99005x18419741(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnIndoorStateChangeListener onIndoorStateChangeListener);

    /* renamed from: setOnInfoWindowClickListener */
    void mo99006xdfba4d9d(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnInfoWindowClickListener onInfoWindowClickListener);

    /* renamed from: setOnMapCameraChangeListener */
    void mo99007x16135f64(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnMapCameraChangeListener onMapCameraChangeListener);

    /* renamed from: setOnMapClickListener */
    void mo99008xc6f39e61(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnMapClickListener onMapClickListener);

    /* renamed from: setOnMapLoadedListener */
    void mo99009x8178cc74(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnMapLoadedListener onMapLoadedListener);

    /* renamed from: setOnMapLongClickListener */
    void mo99010xb229e6c5(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnMapLongClickListener onMapLongClickListener);

    /* renamed from: setOnMapPoiClickListener */
    void mo99011x15447a0d(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnMapPoiClickListener onMapPoiClickListener);

    /* renamed from: setOnMarkerClickListener */
    void mo99012xef348ca1(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnMarkerClickListener onMarkerClickListener);

    /* renamed from: setOnMarkerCollisionStatusListener */
    void mo99013x1c31ce9d(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMarkerCollisionStatusListener onMarkerCollisionStatusListener);

    /* renamed from: setOnMarkerDraggedListener */
    void mo99014xe549856b(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnMarkerDraggedListener onMarkerDraggedListener);

    /* renamed from: setOnPolylineClickListener */
    void mo99015xb25dad1b(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnPolylineClickListener onPolylineClickListener);

    /* renamed from: setOnScaleViewChangedListener */
    void mo99016xdbdbf37a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnScaleViewChangedListener onScaleViewChangedListener);

    /* renamed from: setPoisEnabled */
    void mo99017xfda2cdd6(boolean z17);

    /* renamed from: setSatelliteEnabled */
    void mo99018x8e5d8e08(boolean z17);

    /* renamed from: setTencentMapGestureListener */
    void mo99019xb8069a04(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.TencentMapGestureListener tencentMapGestureListener);

    /* renamed from: setTrafficEnabled */
    void mo99020xd7866f86(boolean z17);

    /* renamed from: showBuilding */
    void mo99021x77f204d1(boolean z17);

    /* renamed from: stopAnimation */
    void mo99022xcac315a2();

    /* renamed from: zoomIn */
    void mo99023xd67f8458();

    /* renamed from: zoomInFixing */
    void mo99024x1e63e625(int i17, int i18);

    /* renamed from: zoomOut */
    void mo99025xf9711e7b();

    /* renamed from: zoomOutFixing */
    void mo99026x43b41a08(int i17, int i18);

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25941x689711f8
    /* renamed from: zoomToSpan */
    void mo98919xdaf06a18(double d17, double d18);

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25941x689711f8
    /* renamed from: zoomToSpan */
    void mo98920xdaf06a18(com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 c4406x873d1d26, com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 c4406x873d1d262);
}
