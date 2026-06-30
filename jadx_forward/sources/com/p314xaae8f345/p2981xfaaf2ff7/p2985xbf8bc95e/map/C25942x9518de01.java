package com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map;

/* renamed from: com.tencent.tencentmap.mapsdk.map.MapView */
/* loaded from: classes13.dex */
public class C25942x9518de01 extends android.widget.FrameLayout implements com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25939x344ea998 {

    /* renamed from: mMapProvider */
    private com.p314xaae8f345.p519xbf8bc95e.p536x4beb0e9c.C4423xff8c9b4d f49136x463004c0;

    /* renamed from: mMapType */
    private int f49137xcff84d89;

    /* renamed from: mProjection */
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25943x166a66f f49138x66c6c29c;

    /* renamed from: mUiSettings */
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25947x45d136f7 f49139xab315324;

    /* renamed from: mapView */
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25939x344ea998 f49140x31e04621;

    /* renamed from: com.tencent.tencentmap.mapsdk.map.MapView$LayoutParams */
    /* loaded from: classes13.dex */
    public static class LayoutParams extends android.view.ViewGroup.LayoutParams {

        /* renamed from: BOTTOM_CENTER */
        public static final int f49141xf84bf8e9 = 81;

        /* renamed from: CENTER */
        public static final int f49142x7645c055 = 17;

        /* renamed from: alignment */
        public int f49143x695fa1e3;

        /* renamed from: height */
        public int f49144xb7389127;

        /* renamed from: point */
        public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 f49145x65e5590;

        /* renamed from: width */
        public int f49146x6be2dc6;

        public LayoutParams(int i17, int i18, com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 c4406x873d1d26, int i19) {
            super(i17, i18);
            this.f49146x6be2dc6 = i17;
            this.f49144xb7389127 = i18;
            this.f49145x65e5590 = c4406x873d1d26;
            this.f49143x695fa1e3 = i19;
        }
    }

    public C25942x9518de01(android.content.Context context) {
        this(context, (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.C25946x7e4576a7) null);
    }

    /* renamed from: init */
    private void m98921x316510(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.C25946x7e4576a7 c25946x7e4576a7) {
        android.content.Context context = getContext();
        this.f49136x463004c0 = new com.p314xaae8f345.p519xbf8bc95e.p536x4beb0e9c.C4423xff8c9b4d();
        com.p314xaae8f345.p519xbf8bc95e.p536x4beb0e9c.p537x2eaf9f.C4424xb67884d3.m37446xe9f5beed(context.getApplicationContext());
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25939x344ea998 m37444x6fad81eb = this.f49136x463004c0.m37444x6fad81eb(context.getApplicationContext(), c25946x7e4576a7);
        this.f49140x31e04621 = m37444x6fad81eb;
        if (m37444x6fad81eb != null) {
            addView(this.f49140x31e04621.mo98899x6fad81eb(), new android.view.ViewGroup.LayoutParams(-1, -1));
        }
        if (context instanceof com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.AbstractActivityC25940xd7b4886b) {
            ((com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.AbstractActivityC25940xd7b4886b) context).m98913xe31ecf5f(this);
        }
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25939x344ea998
    /* renamed from: addView */
    public void mo98896xbb8aeee6(android.view.View view, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.C25942x9518de01.LayoutParams layoutParams) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25939x344ea998 interfaceC25939x344ea998 = this.f49140x31e04621;
        if (interfaceC25939x344ea998 == null || layoutParams == null) {
            return;
        }
        interfaceC25939x344ea998.mo98896xbb8aeee6(view, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25939x344ea998
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        this.f49140x31e04621.dispatchTouchEvent(motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25939x344ea998
    /* renamed from: getMap */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7 mo98897xb5885626() {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25939x344ea998 interfaceC25939x344ea998 = this.f49140x31e04621;
        if (interfaceC25939x344ea998 == null) {
            return null;
        }
        return interfaceC25939x344ea998.mo98897xb5885626();
    }

    @java.lang.Deprecated
    /* renamed from: getMapCenter */
    public com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 m98922x19b45a1b() {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25939x344ea998 interfaceC25939x344ea998 = this.f49140x31e04621;
        if (interfaceC25939x344ea998 == null || interfaceC25939x344ea998.mo98897xb5885626() == null) {
            return null;
        }
        return this.f49140x31e04621.mo98897xb5885626().mo98964x19b45a1b();
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25939x344ea998
    /* renamed from: getMapController */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25941x689711f8 mo98898xf6579e62() {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25939x344ea998 interfaceC25939x344ea998 = this.f49140x31e04621;
        if (interfaceC25939x344ea998 == null) {
            return null;
        }
        return interfaceC25939x344ea998.mo98898xf6579e62();
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25939x344ea998
    /* renamed from: getMapView */
    public android.view.View mo98899x6fad81eb() {
        return this;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25939x344ea998
    /* renamed from: getProjection */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25943x166a66f mo98900x78d58245() {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25939x344ea998 interfaceC25939x344ea998 = this.f49140x31e04621;
        if (interfaceC25939x344ea998 == null) {
            return null;
        }
        return interfaceC25939x344ea998.mo98897xb5885626().mo98968x78d58245();
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25939x344ea998
    /* renamed from: getUiSettings */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25947x45d136f7 mo98901xbd4012cd() {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25939x344ea998 interfaceC25939x344ea998 = this.f49140x31e04621;
        if (interfaceC25939x344ea998 == null) {
            return null;
        }
        return interfaceC25939x344ea998.mo98901xbd4012cd();
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25939x344ea998
    /* renamed from: onCreate */
    public void mo98902x3e5a77bb(android.os.Bundle bundle) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25939x344ea998 interfaceC25939x344ea998 = this.f49140x31e04621;
        if (interfaceC25939x344ea998 == null) {
            return;
        }
        interfaceC25939x344ea998.mo98902x3e5a77bb(bundle);
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25939x344ea998
    /* renamed from: onDestroy */
    public void mo98903xac79a11b() {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25939x344ea998 interfaceC25939x344ea998 = this.f49140x31e04621;
        if (interfaceC25939x344ea998 == null) {
            return;
        }
        interfaceC25939x344ea998.mo98903xac79a11b();
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25939x344ea998
    /* renamed from: onDestroyView */
    public void mo98904xa6664a60() {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25939x344ea998 interfaceC25939x344ea998 = this.f49140x31e04621;
        if (interfaceC25939x344ea998 == null) {
            return;
        }
        interfaceC25939x344ea998.mo98904xa6664a60();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        return true;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25939x344ea998
    /* renamed from: onLowMemory */
    public void mo98905xb5d8ba56() {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25939x344ea998 interfaceC25939x344ea998 = this.f49140x31e04621;
        if (interfaceC25939x344ea998 == null) {
            return;
        }
        interfaceC25939x344ea998.mo98905xb5d8ba56();
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25939x344ea998
    /* renamed from: onPause */
    public void mo98906xb01dfb57() {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25939x344ea998 interfaceC25939x344ea998 = this.f49140x31e04621;
        if (interfaceC25939x344ea998 == null) {
            return;
        }
        interfaceC25939x344ea998.mo98906xb01dfb57();
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25939x344ea998
    /* renamed from: onRestart */
    public void mo98907x91109f30() {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25939x344ea998 interfaceC25939x344ea998 = this.f49140x31e04621;
        if (interfaceC25939x344ea998 == null) {
            return;
        }
        interfaceC25939x344ea998.mo98907x91109f30();
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25939x344ea998
    /* renamed from: onResume */
    public void mo98908x57429eec() {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25939x344ea998 interfaceC25939x344ea998 = this.f49140x31e04621;
        if (interfaceC25939x344ea998 == null) {
            return;
        }
        interfaceC25939x344ea998.mo98908x57429eec();
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25939x344ea998
    /* renamed from: onSaveInstanceState */
    public void mo98909xa71a2260(android.os.Bundle bundle) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25939x344ea998 interfaceC25939x344ea998 = this.f49140x31e04621;
        if (interfaceC25939x344ea998 == null) {
            return;
        }
        interfaceC25939x344ea998.mo98909xa71a2260(bundle);
    }

    @Override // android.view.View, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25939x344ea998
    /* renamed from: onSizeChanged */
    public void mo128406x6521d014(int i17, int i18, int i19, int i27) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25939x344ea998 interfaceC25939x344ea998 = this.f49140x31e04621;
        if (interfaceC25939x344ea998 != null) {
            interfaceC25939x344ea998.mo128406x6521d014(i17, i18, i19, i27);
        }
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25939x344ea998
    /* renamed from: onStart */
    public void mo98910xb05099c3() {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25939x344ea998 interfaceC25939x344ea998 = this.f49140x31e04621;
        if (interfaceC25939x344ea998 == null) {
            return;
        }
        interfaceC25939x344ea998.mo98910xb05099c3();
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25939x344ea998
    /* renamed from: onStop */
    public void mo98911xc39f8281() {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25939x344ea998 interfaceC25939x344ea998 = this.f49140x31e04621;
        if (interfaceC25939x344ea998 == null) {
            return;
        }
        interfaceC25939x344ea998.mo98911xc39f8281();
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25939x344ea998
    /* renamed from: onSurfaceChanged */
    public void mo98912xd8f18906(java.lang.Object obj, int i17, int i18) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25939x344ea998 interfaceC25939x344ea998 = this.f49140x31e04621;
        if (interfaceC25939x344ea998 != null) {
            interfaceC25939x344ea998.mo98912xd8f18906(obj, i17, i18);
        }
    }

    @Override // android.view.View, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25939x344ea998
    /* renamed from: onTouchEvent */
    public boolean mo128407x667eb1da(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25939x344ea998 interfaceC25939x344ea998 = this.f49140x31e04621;
        return interfaceC25939x344ea998 != null ? interfaceC25939x344ea998.mo128407x667eb1da(motionEvent) : super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25939x344ea998
    public void updateViewLayout(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25939x344ea998 interfaceC25939x344ea998 = this.f49140x31e04621;
        if (interfaceC25939x344ea998 == null) {
            return;
        }
        interfaceC25939x344ea998.updateViewLayout(view, layoutParams);
    }

    public C25942x9518de01(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f49137xcff84d89 = 1;
        m98921x316510(null);
    }

    public C25942x9518de01(android.content.Context context, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.C25946x7e4576a7 c25946x7e4576a7) {
        super(context);
        this.f49137xcff84d89 = 1;
        m98921x316510(c25946x7e4576a7);
    }
}
