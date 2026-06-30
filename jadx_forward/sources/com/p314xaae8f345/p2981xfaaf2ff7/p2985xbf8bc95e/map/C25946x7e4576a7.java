package com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map;

/* renamed from: com.tencent.tencentmap.mapsdk.map.TencentMapOptions */
/* loaded from: classes13.dex */
public class C25946x7e4576a7 {

    /* renamed from: GL_MAP_VIEW */
    public static final int f49153x11b681e2 = 0;

    /* renamed from: MAP_RENDER_LAYER */
    public static final int f49154xc2778f6b = 2;

    /* renamed from: TEXTURE_MAP_VIEW */
    public static final int f49155x7abfe28c = 1;

    /* renamed from: mExtSurface */
    private java.lang.Object f49160xc40a7b99;

    /* renamed from: mExtSurfaceHeight */
    private int f49161xd1392220;

    /* renamed from: mExtSurfaceWidth */
    private int f49162x205b19ad;

    /* renamed from: mProtocolDataDesc */
    private java.lang.Object f49164xadcc22a0;

    /* renamed from: mProtocolFrom */
    private int f49165xa128276f;

    /* renamed from: mSubId */
    private java.lang.String f49166xbec8830e;

    /* renamed from: mSubKey */
    private java.lang.String f49167x1a47e6cc;

    /* renamed from: onAuthResultCallback */
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnAuthResultCallback f49168x77ee3389;

    /* renamed from: mMapType */
    private int f49163xcff84d89 = 0;

    /* renamed from: enableHandDrawMap */
    private boolean f49156x79db1886 = false;

    /* renamed from: isMutipleInfowindowEnabled */
    private boolean f49159x4e999141 = false;

    /* renamed from: enableMSAA */
    private boolean f49158x70d4ec49 = false;

    /* renamed from: enableLogger */
    private boolean f49157x8f3298f3 = false;

    @java.lang.Deprecated
    /* renamed from: enableHandDrawMap */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.C25946x7e4576a7 m99043x79db1886(boolean z17) {
        m99061x994c50aa(z17);
        return this;
    }

    /* renamed from: enableMSAA */
    public boolean m99044x70d4ec49() {
        return this.f49158x70d4ec49;
    }

    /* renamed from: getExtSurface */
    public java.lang.Object m99045xd6193b42() {
        return this.f49160xc40a7b99;
    }

    /* renamed from: getExtSurfaceHeight */
    public final int m99046x52f9bf09() {
        return this.f49161xd1392220;
    }

    /* renamed from: getExtSurfaceWidth */
    public final int m99047x350ebba4() {
        return this.f49162x205b19ad;
    }

    /* renamed from: getMapType */
    public int m99048x6facd680() {
        return this.f49163xcff84d89;
    }

    /* renamed from: getOnAuthResultCallback */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnAuthResultCallback m99049x25b9efff() {
        return this.f49168x77ee3389;
    }

    /* renamed from: getProtocolDataDesc */
    public final java.lang.Object m99050x2f8cbf89() {
        return this.f49164xadcc22a0;
    }

    /* renamed from: getProtocolFrom */
    public final int m99051x6a85a0d8() {
        return this.f49165xa128276f;
    }

    /* renamed from: getSubId */
    public final java.lang.String m99052x7528ddc5() {
        return this.f49166xbec8830e;
    }

    /* renamed from: getSubKey */
    public final java.lang.String m99053x2ff2e2f5() {
        return this.f49167x1a47e6cc;
    }

    /* renamed from: isEnableLogger */
    public boolean m99054x61d18b3d() {
        return this.f49157x8f3298f3;
    }

    /* renamed from: isHandDrawMapEnable */
    public boolean m99055xfdb0a8e2() {
        return this.f49156x79db1886;
    }

    /* renamed from: isMutipleInfowindowEnabled */
    public boolean m99056x4e999141() {
        return this.f49159x4e999141;
    }

    /* renamed from: setEnableLogger */
    public void m99057x266e2675(boolean z17) {
        this.f49157x8f3298f3 = z17;
    }

    /* renamed from: setEnableMSAA */
    public void m99058x8d39f24b(boolean z17) {
        this.f49158x70d4ec49 = z17;
    }

    /* renamed from: setExtSurface */
    public void m99059x43d894e(java.lang.Object obj) {
        if (!(obj instanceof android.view.Surface) && !(obj instanceof android.graphics.SurfaceTexture) && !(obj instanceof android.view.SurfaceHolder)) {
            throw new java.lang.IllegalArgumentException("Parameter Surface should be Surface,SurfaceTexture or SurfaceHolder");
        }
        this.f49160xc40a7b99 = obj;
    }

    /* renamed from: setExtSurfaceDimension */
    public final void m99060x627a9bb8(int i17, int i18) {
        this.f49162x205b19ad = i17;
        this.f49161xd1392220 = i18;
    }

    /* renamed from: setHandDrawMapEnable */
    public void m99061x994c50aa(boolean z17) {
        this.f49156x79db1886 = z17;
    }

    /* renamed from: setMapType */
    public void m99062xe31e23f4(int i17) {
        if (i17 < 0 || i17 > 2) {
            return;
        }
        this.f49163xcff84d89 = i17;
    }

    /* renamed from: setMutipleInfowindowEnabled */
    public void m99063x8acf1879(boolean z17) {
        this.f49159x4e999141 = z17;
    }

    /* renamed from: setOnAuthResultCallback */
    public void m99064xa00d1f0b(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnAuthResultCallback onAuthResultCallback) {
        this.f49168x77ee3389 = onAuthResultCallback;
    }

    /* renamed from: setServiceProtocol */
    public final void m99065x299d9fab(int i17, java.lang.Object obj) {
        this.f49165xa128276f = i17;
        this.f49164xadcc22a0 = obj;
    }

    /* renamed from: setSubInfo */
    public final void m99066x41da004c(java.lang.String str, java.lang.String str2) {
        this.f49166xbec8830e = str2;
        this.f49167x1a47e6cc = str;
    }
}
