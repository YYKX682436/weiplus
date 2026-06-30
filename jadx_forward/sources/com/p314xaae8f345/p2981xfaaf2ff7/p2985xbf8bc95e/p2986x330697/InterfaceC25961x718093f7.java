package com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697;

/* renamed from: com.tencent.tencentmap.mapsdk.maps.TencentMap */
/* loaded from: classes13.dex */
public interface InterfaceC25961x718093f7 extends com.p314xaae8f345.map.sdk.p497x5a73344.p498xb96a1653.InterfaceC4262x9875e7fc, com.p314xaae8f345.map.sdk.p497x5a73344.p499x88ed4161.InterfaceC4263x78d07aaa {

    /* renamed from: MAP_MODE_NAV */
    public static final int f49226x84a1b00a = 12;

    /* renamed from: MAP_MODE_NAV_NIGHT */
    public static final int f49227xc825cf83 = 1013;

    /* renamed from: MAP_MODE_NAV_TRAFFIC */
    public static final int f49228xa25b5aa8 = 1009;

    /* renamed from: MAP_MODE_NORMAL */
    public static final int f49229x7c897c80 = 0;

    /* renamed from: MAP_MODE_NORMAL_TRAFFIC */
    public static final int f49230xa342511e = 5;

    /* renamed from: MAP_TYPE_DARK */
    public static final int f49231xa7055618 = 1008;

    /* renamed from: MAP_TYPE_NAVI */
    public static final int f49232xa709e248 = 1012;

    /* renamed from: MAP_TYPE_NIGHT */
    public static final int f49233x3a35d196 = 1013;

    /* renamed from: MAP_TYPE_NONE */
    public static final int f49234xa70a15da = 0;

    /* renamed from: MAP_TYPE_NORMAL */
    public static final int f49235xcddff09 = 1000;

    /* renamed from: MAP_TYPE_SATELLITE */
    public static final int f49236xf1b93fb9 = 1011;

    /* renamed from: MAP_TYPE_TRAFFIC_NAVI */
    public static final int f49237xeaba4d6a = 1009;

    /* renamed from: MAP_TYPE_TRAFFIC_NIGHT */
    public static final int f49238x6c92cab4 = 1010;

    /* renamed from: com.tencent.tencentmap.mapsdk.maps.TencentMap$AsyncOperateCallback */
    /* loaded from: classes13.dex */
    public interface AsyncOperateCallback<T> {
        /* renamed from: onOperateFinished */
        void m99148x6f81ba37(T t17);
    }

    /* renamed from: com.tencent.tencentmap.mapsdk.maps.TencentMap$CancelableCallback */
    /* loaded from: classes13.dex */
    public interface CancelableCallback {
        /* renamed from: onCancel */
        void mo99149x3d6f0539();

        /* renamed from: onFinish */
        void mo99150x42fe6352();
    }

    /* renamed from: com.tencent.tencentmap.mapsdk.maps.TencentMap$IClickedObject */
    /* loaded from: classes13.dex */
    public interface IClickedObject {
        /* renamed from: getIdentifier */
        java.lang.String mo36850x8dc9649f();

        /* renamed from: getName */
        java.lang.String mo36851xfb82e301();

        /* renamed from: getPosition */
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 mo36852xa86cd69f();
    }

    /* renamed from: com.tencent.tencentmap.mapsdk.maps.TencentMap$InfoWindowAdapter */
    /* loaded from: classes13.dex */
    public interface InfoWindowAdapter {
        /* renamed from: getInfoContents */
        android.view.View mo99151x40d285e(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a interfaceC26059x88f1805a);

        /* renamed from: getInfoWindow */
        android.view.View mo99152xc3c42a34(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a interfaceC26059x88f1805a);
    }

    /* renamed from: com.tencent.tencentmap.mapsdk.maps.TencentMap$OnAuthResultCallback */
    /* loaded from: classes13.dex */
    public interface OnAuthResultCallback {
        /* renamed from: onAuthFail */
        void mo36922xfa7237e5(int i17, java.lang.String str);

        /* renamed from: onAuthSuccess */
        void mo36923x833155dc();
    }

    /* renamed from: com.tencent.tencentmap.mapsdk.maps.TencentMap$OnCameraChangeListener */
    /* loaded from: classes13.dex */
    public interface OnCameraChangeListener {
        /* renamed from: onCameraChange */
        void mo36952x21a09eb4(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26015xa89e978e c26015xa89e978e);

        /* renamed from: onCameraChangeFinished */
        void mo36953xd9f3cf46(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26015xa89e978e c26015xa89e978e);
    }

    /* renamed from: com.tencent.tencentmap.mapsdk.maps.TencentMap$OnCompassClickedListener */
    /* loaded from: classes13.dex */
    public interface OnCompassClickedListener {
        /* renamed from: onCompassClicked */
        void m99153xc8501a74();
    }

    /* renamed from: com.tencent.tencentmap.mapsdk.maps.TencentMap$OnDismissCallback */
    /* loaded from: classes13.dex */
    public interface OnDismissCallback {
        /* renamed from: onDismiss */
        void m99154xb349b3ab();

        /* renamed from: onNotify */
        void m99155x50fc6e08();
    }

    /* renamed from: com.tencent.tencentmap.mapsdk.maps.TencentMap$OnIndoorStateChangeListener */
    /* loaded from: classes13.dex */
    public interface OnIndoorStateChangeListener {
        /* renamed from: onIndoorBuildingDeactivated */
        boolean mo37004xf3e3a8aa();

        /* renamed from: onIndoorBuildingFocused */
        boolean mo37005xa4a722b1();

        /* renamed from: onIndoorLevelActivated */
        boolean mo37006xc2ec745f(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26034x15ff5647 c26034x15ff5647);
    }

    /* renamed from: com.tencent.tencentmap.mapsdk.maps.TencentMap$OnInfoWindowClickListener */
    /* loaded from: classes13.dex */
    public interface OnInfoWindowClickListener {
        /* renamed from: onInfoWindowClick */
        void mo99156xc56a6a0b(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a interfaceC26059x88f1805a);

        /* renamed from: onInfoWindowClickLocation */
        void mo99157xe57b32e0(int i17, int i18, int i19, int i27);
    }

    /* renamed from: com.tencent.tencentmap.mapsdk.maps.TencentMap$OnMapClickListener */
    /* loaded from: classes13.dex */
    public interface OnMapClickListener {
        /* renamed from: onMapClick */
        void mo99158xae384c8b(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26);
    }

    /* renamed from: com.tencent.tencentmap.mapsdk.maps.TencentMap$OnMapFrameFinishCallback */
    /* loaded from: classes13.dex */
    public interface OnMapFrameFinishCallback {
        /* renamed from: onMapFrameFinished */
        void m99159x7d8e502();

        /* renamed from: onMapFrameStart */
        void m99160x353f69d2();
    }

    /* renamed from: com.tencent.tencentmap.mapsdk.maps.TencentMap$OnMapLoadedCallback */
    /* loaded from: classes13.dex */
    public interface OnMapLoadedCallback {
        /* renamed from: onMapLoaded */
        void mo99142x28538962();
    }

    /* renamed from: com.tencent.tencentmap.mapsdk.maps.TencentMap$OnMapLongClickListener */
    /* loaded from: classes13.dex */
    public interface OnMapLongClickListener {
        /* renamed from: onMapLongClick */
        void mo99161x843609ef(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26);
    }

    /* renamed from: com.tencent.tencentmap.mapsdk.maps.TencentMap$OnMapPoiClickListener */
    /* loaded from: classes13.dex */
    public interface OnMapPoiClickListener {
        /* renamed from: onClicked */
        void mo99162x82f09148(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26055x88f0336e c26055x88f0336e);
    }

    /* renamed from: com.tencent.tencentmap.mapsdk.maps.TencentMap$OnMarkerClickListener */
    /* loaded from: classes13.dex */
    public interface OnMarkerClickListener {
        /* renamed from: onMarkerClick */
        boolean mo36533x289a5e0f(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a interfaceC26059x88f1805a);
    }

    /* renamed from: com.tencent.tencentmap.mapsdk.maps.TencentMap$OnMarkerCollisionStatusListener */
    /* loaded from: classes13.dex */
    public interface OnMarkerCollisionStatusListener {
        /* renamed from: onCollisionHidden */
        void mo99163x1d64739d(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a interfaceC26059x88f1805a, java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26062x676db5b8> list);

        /* renamed from: onCollisionShown */
        void mo99164x1a53a4be(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a interfaceC26059x88f1805a, java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26062x676db5b8> list);
    }

    /* renamed from: com.tencent.tencentmap.mapsdk.maps.TencentMap$OnMarkerDragListener */
    /* loaded from: classes13.dex */
    public interface OnMarkerDragListener {
        /* renamed from: onMarkerDrag */
        void mo99165x991e7cd(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a interfaceC26059x88f1805a);

        /* renamed from: onMarkerDragEnd */
        void mo99166xaa2ef9ce(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a interfaceC26059x88f1805a);

        /* renamed from: onMarkerDragStart */
        void mo99167xdb1fc495(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a interfaceC26059x88f1805a);
    }

    /* renamed from: com.tencent.tencentmap.mapsdk.maps.TencentMap$OnMyLocationChangeListener */
    /* loaded from: classes13.dex */
    public interface OnMyLocationChangeListener {
        /* renamed from: onMyLocationChange */
        void m99168xd1fa7490(android.location.Location location);
    }

    /* renamed from: com.tencent.tencentmap.mapsdk.maps.TencentMap$OnMyLocationClickListener */
    /* loaded from: classes13.dex */
    public interface OnMyLocationClickListener {
        /* renamed from: onMyLocationClicked */
        boolean m99169x74934b47(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26);
    }

    /* renamed from: com.tencent.tencentmap.mapsdk.maps.TencentMap$OnPolygonClickListener */
    /* loaded from: classes13.dex */
    public interface OnPolygonClickListener {
        /* renamed from: onPolygonClick */
        void m99170x7d3fed(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26076x4b86ed1a interfaceC26076x4b86ed1a, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26);
    }

    /* renamed from: com.tencent.tencentmap.mapsdk.maps.TencentMap$OnPolylineClickListener */
    /* loaded from: classes13.dex */
    public interface OnPolylineClickListener {
        /* renamed from: onPolylineClick */
        void mo14569xbcfe5009(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26078x2558e5e0 interfaceC26078x2558e5e0, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26);
    }

    /* renamed from: com.tencent.tencentmap.mapsdk.maps.TencentMap$OnScaleViewChangedListener */
    /* loaded from: classes13.dex */
    public interface OnScaleViewChangedListener {
        /* renamed from: onScaleViewChanged */
        void mo36381x92aceca4(float f17);
    }

    /* renamed from: com.tencent.tencentmap.mapsdk.maps.TencentMap$OnTrafficEventClickListener */
    /* loaded from: classes13.dex */
    public interface OnTrafficEventClickListener {
        /* renamed from: onTrafficEventClicked */
        void m99171x947f2e6b(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26091x3a536abd interfaceC26091x3a536abd);
    }

    /* renamed from: com.tencent.tencentmap.mapsdk.maps.TencentMap$OnVectorOverlayClickListener */
    /* loaded from: classes13.dex */
    public interface OnVectorOverlayClickListener {
        /* renamed from: onClicked */
        void m99172x82f09148(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26098x1cf1c96d interfaceC26098x1cf1c96d, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.IClickedObject iClickedObject);
    }

    /* renamed from: com.tencent.tencentmap.mapsdk.maps.TencentMap$SnapshotReadyCallback */
    /* loaded from: classes13.dex */
    public interface SnapshotReadyCallback {
        /* renamed from: onSnapshotReady */
        void mo99173x79b9f2a0(android.graphics.Bitmap bitmap);
    }

    /* renamed from: addAoiLayer */
    com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26006x789d436 mo36535xc99d1bd7(java.lang.String str, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26007x97be4188 c26007x97be4188, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26006x789d436.OnAoiLayerLoadListener onAoiLayerLoadListener);

    /* renamed from: addArc */
    com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.Arc mo36536xab35b9f1(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26008x51f2a00c c26008x51f2a00c);

    /* renamed from: addCircle */
    com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26016x7851a8f0 mo36537xe42464d1(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26017xfbda878e c26017xfbda878e);

    /* renamed from: addCustomLayer */
    com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26018xf8628040 mo36538xb9ff08ff(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26019xdcd7d63e c26019xdcd7d63e);

    /* renamed from: addGroundOverlay */
    com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26023x33b6bca9 mo36539x5411a8(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26024x5ce381b5 c26024x5ce381b5);

    /* renamed from: addMarker */
    com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a mo36540xf4c43c3b(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26064xea4764e4 c26064xea4764e4);

    /* renamed from: addOnMapLoadedCallback */
    void mo36541x2adaad66(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMapLoadedCallback onMapLoadedCallback);

    /* renamed from: addPolygon */
    com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26076x4b86ed1a mo36542x5a0bad59(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26077xede22024 c26077xede22024);

    /* renamed from: addPolyline */
    com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26078x2558e5e0 mo36543xe76c2d81(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26079x1291dc9e c26079x1291dc9e);

    /* renamed from: addTencentMapGestureListener */
    void mo36544x726dd2a5(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26085x16ab0426 interfaceC26085x16ab0426);

    /* renamed from: addTileOverlay */
    com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26088xb80c71a2 mo36545x79a8fa61(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26089x9c7ff29c c26089x9c7ff29c);

    /* renamed from: addVectorHeatOverlay */
    com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26096xab512edd mo36546x8f2dec5c(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26097x63c1ed01 c26097x63c1ed01);

    /* renamed from: addVectorOverlay */
    <L extends com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26098x1cf1c96d> L mo36547xe98f1e6c(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e interfaceC26099x413a767e);

    /* renamed from: addVisualLayer */
    com.p314xaae8f345.map.sdk.p497x5a73344.vis.InterfaceC4273x137f8dd1 mo36548xd51c1690(com.p314xaae8f345.map.sdk.p497x5a73344.vis.C4274xbcec938d c4274xbcec938d);

    /* renamed from: animateCamera */
    void mo36549x59b77566(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25950xd5528c6e c25950xd5528c6e);

    /* renamed from: animateCamera */
    void mo36550x59b77566(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25950xd5528c6e c25950xd5528c6e, long j17, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.CancelableCallback cancelableCallback);

    /* renamed from: animateCamera */
    void mo36551x59b77566(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25950xd5528c6e c25950xd5528c6e, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.CancelableCallback cancelableCallback);

    /* renamed from: calculateMapOverLook */
    com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26015xa89e978e mo37449xac0983c9(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b c26042xcb530b7b, android.graphics.RectF rectF, float f17, float f18, int i17, int i18, int i19, int i27);

    /* renamed from: calculateZoomToSpanLevel */
    com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26015xa89e978e mo36552x27428c06(java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26030xc162a7c7> list, java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26> list2, int i17, int i18, int i19, int i27);

    /* renamed from: clear */
    void mo36553x5a5b64d();

    /* renamed from: clearAllOverlays */
    void mo36554x9a95e257();

    /* renamed from: clearCache */
    void mo36555xd2bef135();

    /* renamed from: enableAutoMaxSkew */
    void mo36556x2de8765c(boolean z17);

    /* renamed from: enableMultipleInfowindow */
    void mo36557x51865b31(boolean z17);

    /* renamed from: executeVisualLayerCommand */
    java.lang.String mo36558xae93d06f(com.p314xaae8f345.map.sdk.p497x5a73344.vis.InterfaceC4273x137f8dd1 interfaceC4273x137f8dd1, java.lang.String str);

    /* renamed from: getBounderPoints */
    java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26> mo37450x698cf7b8(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a interfaceC26059x88f1805a);

    /* renamed from: getCameraPosition */
    com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26015xa89e978e mo37451xd2ef9864();

    /* renamed from: getCityName */
    java.lang.String mo37452x271d180c(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26);

    /* renamed from: getDebugError */
    java.lang.String mo37453x7f21ff6b();

    /* renamed from: getLanguage */
    com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26040xa3acf778 mo37454x1bacd0ce();

    /* renamed from: getMapComponent */
    <T extends com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25962x41522ec6.Component> T mo36559x16607177(java.lang.Class<T> cls);

    /* renamed from: getMapContext */
    com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25963x17625b8 mo37455x2de760a9();

    /* renamed from: getMapHeight */
    int mo37456x223a1eed();

    /* renamed from: getMapPadding */
    android.graphics.Rect mo37457xc520670b();

    /* renamed from: getMapStyle */
    int mo37459x85ddbf2b();

    /* renamed from: getMapType */
    int mo37460x6facd680();

    /* renamed from: getMapWidth */
    int mo37461x8610cf40();

    /* renamed from: getMaxZoomLevel */
    float mo37462x6d8ed0e3();

    /* renamed from: getMinZoomLevel */
    float mo37463x89d5fbb5();

    /* renamed from: getProjection */
    com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25959x166a66f mo37464x78d58245();

    /* renamed from: getScreenMarkers */
    java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26059x88f1805a> mo37465x41bf75b7();

    /* renamed from: getUiSettings */
    com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25971x45d136f7 mo37466xbd4012cd();

    /* renamed from: getVersion */
    java.lang.String mo37467x52c258a2();

    /* renamed from: getVisualSettings */
    com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25972xaba233a3 mo37468xd5f33479();

    /* renamed from: getZoomToSpanLevel */
    float mo37469x6e76a216(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d262);

    /* renamed from: isBlockRouteEnabled */
    boolean mo37470x772d95db();

    /* renamed from: isDestroyed */
    boolean mo37471xbca8d80f();

    /* renamed from: isHandDrawMapEnable */
    boolean mo37472xfdb0a8e2();

    /* renamed from: isSateLiteEnable */
    boolean mo37473x7a62ea3a();

    /* renamed from: isTrafficEnabled */
    boolean mo37474xc7a3c24e();

    /* renamed from: loadKMLFile */
    void mo36560x855ff420(java.lang.String str);

    /* renamed from: moveCamera */
    void mo36561x85700a56(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25950xd5528c6e c25950xd5528c6e);

    /* renamed from: removeOnMapLoadedCallback */
    void mo36562x31cbe4a3(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMapLoadedCallback onMapLoadedCallback);

    /* renamed from: removeTencentMapGestureListener */
    void mo36563xd235e822(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26085x16ab0426 interfaceC26085x16ab0426);

    /* renamed from: setBaseMapEnabled */
    void mo36564xddf384f8(boolean z17);

    /* renamed from: setBlockRouteEnabled */
    void mo36565x12c93da3(boolean z17);

    /* renamed from: setBuilding3dEffectEnable */
    void mo36566x9a0dfe5b(boolean z17);

    /* renamed from: setBuildingBlackList */
    void mo36567xa9c008a7(java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b> list);

    /* renamed from: setBuildingEnable */
    void mo36568xcbce8259(boolean z17);

    /* renamed from: setCameraCenterProportion */
    void mo36569x8a3a3716(float f17, float f18);

    /* renamed from: setCameraCenterProportion */
    void mo36570x8a3a3716(float f17, float f18, boolean z17);

    /* renamed from: setCustomRender */
    void mo36571xabce2de9(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25953x1e5df487 interfaceC25953x1e5df487);

    /* renamed from: setDrawPillarWith2DStyle */
    void mo36572xefd95d49(boolean z17);

    /* renamed from: setForeignLanguage */
    void mo36573xcbaccf8a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26040xa3acf778 enumC26040xa3acf778);

    /* renamed from: setHandDrawMapEnable */
    void mo36574x994c50aa(boolean z17);

    /* renamed from: setInfoWindowAdapter */
    void mo36575x3d10faef(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.InfoWindowAdapter infoWindowAdapter);

    /* renamed from: setLanguage */
    void mo36576x166531da(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26040xa3acf778 enumC26040xa3acf778);

    /* renamed from: setLocationCompassHidden */
    void mo36577xd9013465(boolean z17);

    /* renamed from: setLocationNavigationGravityLineHidden */
    void mo36578x3c705741(boolean z17);

    /* renamed from: setMapCenterAndScale */
    void mo36579x7e06ad62(float f17, float f18, float f19);

    /* renamed from: setMapFontSize */
    void mo36580x5d0548aa(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26053x5033364c enumC26053x5033364c);

    /* renamed from: setMapFrameRate */
    void mo36581xc0973b73(float f17);

    /* renamed from: setMapStyle */
    void mo36582x80962037(int i17);

    /* renamed from: setMapType */
    void mo36583xe31e23f4(int i17);

    /* renamed from: setMaxZoomLevel */
    void mo36584xa3d7cbef(int i17);

    /* renamed from: setMinZoomLevel */
    void mo36585xc01ef6c1(int i17);

    /* renamed from: setMyLocationStyle */
    void mo35494xe3593bee(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26072x8cb38890 c26072x8cb38890);

    /* renamed from: setOnCameraChangeListener */
    void mo36586xee69e68a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnCameraChangeListener onCameraChangeListener);

    /* renamed from: setOnCompassClickedListener */
    void mo36587xce88e9ca(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnCompassClickedListener onCompassClickedListener);

    /* renamed from: setOnInfoWindowClickListener */
    void mo36588xdfba4d9d(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnInfoWindowClickListener onInfoWindowClickListener);

    /* renamed from: setOnMapClickListener */
    void mo36589xc6f39e61(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMapClickListener onMapClickListener);

    /* renamed from: setOnMapFrameFinished */
    void mo36590xb260c904(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMapFrameFinishCallback onMapFrameFinishCallback);

    /* renamed from: setOnMapLoadedCallback */
    void mo36591x26f82805(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMapLoadedCallback onMapLoadedCallback);

    /* renamed from: setOnMapLongClickListener */
    void mo36592xb229e6c5(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMapLongClickListener onMapLongClickListener);

    /* renamed from: setOnMapPoiClickListener */
    void mo36593x15447a0d(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMapPoiClickListener onMapPoiClickListener);

    /* renamed from: setOnMarkerClickListener */
    void mo36594xef348ca1(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMarkerClickListener onMarkerClickListener);

    /* renamed from: setOnMarkerCollisionStatusListener */
    void mo36595x1c31ce9d(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMarkerCollisionStatusListener onMarkerCollisionStatusListener);

    /* renamed from: setOnMarkerDragListener */
    void mo36596xdfbddf23(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnMarkerDragListener onMarkerDragListener);

    /* renamed from: setOnPolygonClickListener */
    void mo36597x3e523ec3(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnPolygonClickListener onPolygonClickListener);

    /* renamed from: setOnPolylineClickListener */
    void mo36598xb25dad1b(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnPolylineClickListener onPolylineClickListener);

    /* renamed from: setOnScaleViewChangedListener */
    void mo36599xdbdbf37a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnScaleViewChangedListener onScaleViewChangedListener);

    /* renamed from: setOnTapMapViewInfoWindowHidden */
    void mo36600x54cd7967(boolean z17);

    /* renamed from: setOnTrafficEventClickListener */
    void mo36601xb11c3fde(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnTrafficEventClickListener onTrafficEventClickListener);

    /* renamed from: setOnVectorOverlayClickListener */
    void mo36602x55c97490(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnVectorOverlayClickListener onVectorOverlayClickListener);

    /* renamed from: setOverSeaEnable */
    void mo36603x63144afc(boolean z17);

    /* renamed from: setOverSeaTileProvider */
    void mo36604x41e79578(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.AbstractC26074xe626c11a abstractC26074xe626c11a);

    /* renamed from: setPadding */
    void mo36605x812ec54f(int i17, int i18, int i19, int i27);

    /* renamed from: setPadding */
    void mo36606x812ec54f(int i17, int i18, int i19, int i27, boolean z17);

    /* renamed from: setPointToCenter */
    void mo36607xb5bc0b1e(int i17, int i18);

    /* renamed from: setPoisEnabled */
    void mo36608xfda2cdd6(boolean z17);

    /* renamed from: setRestrictBounds */
    void mo36609x8591d593(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b c26042xcb530b7b, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26080x7bc7b63 enumC26080x7bc7b63);

    /* renamed from: setSatelliteEnabled */
    void mo36610x8e5d8e08(boolean z17);

    /* renamed from: setSceneByTag */
    void mo36611x96d1bc99(java.lang.String str);

    /* renamed from: setTencentMapGestureListener */
    void mo36612xb8069a04(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26085x16ab0426 interfaceC26085x16ab0426);

    /* renamed from: setTrafficEnabled */
    void mo36613xd7866f86(boolean z17);

    /* renamed from: setTrafficMode */
    void mo36614xeb7437e(int i17, int i18);

    /* renamed from: showBuilding */
    void mo36615x77f204d1(boolean z17);

    /* renamed from: snapshot */
    void mo36616x10fad5c4(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.SnapshotReadyCallback snapshotReadyCallback);

    /* renamed from: snapshot */
    void mo36617x10fad5c4(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.SnapshotReadyCallback snapshotReadyCallback, android.graphics.Bitmap.Config config);

    /* renamed from: snapshot */
    void mo36618x10fad5c4(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.SnapshotReadyCallback snapshotReadyCallback, android.graphics.Bitmap.Config config, int i17);

    /* renamed from: stopAnimation */
    void mo36619xcac315a2();

    /* renamed from: updateVectorOverlay */
    void mo36620xea2fdf44(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26098x1cf1c96d interfaceC26098x1cf1c96d, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e interfaceC26099x413a767e);
}
