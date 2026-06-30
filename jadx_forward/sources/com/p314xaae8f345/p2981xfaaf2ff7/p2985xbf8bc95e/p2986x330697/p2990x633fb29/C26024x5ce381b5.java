package com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29;

/* renamed from: com.tencent.tencentmap.mapsdk.maps.model.GroundOverlayOptions */
/* loaded from: classes13.dex */
public final class C26024x5ce381b5 {

    /* renamed from: TRANSPARENT_PIXEL */
    public static android.graphics.Bitmap f49466xc3950119 = android.graphics.Bitmap.createBitmap(new int[]{0}, 1, 1, android.graphics.Bitmap.Config.ARGB_8888);

    /* renamed from: mLatLngBounds */
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b f49471x591cd068;

    /* renamed from: mPosition */
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 f49473x519040b6;

    /* renamed from: mZIndex */
    private int f49475x23d39b45;

    /* renamed from: mBitmapDescriptor */
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e f49470x99cafc8b = com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26011x93ded50c.m99335x63040d79(f49466xc3950119);

    /* renamed from: mZoom */
    private float f49476x62a99e0 = 18.0f;

    /* renamed from: mAnchorU */
    private float f49468x6aae4713 = 0.5f;

    /* renamed from: mAnchorV */
    private float f49469x6aae4714 = 0.5f;

    /* renamed from: mAlpha */
    private float f49467xbdc6fcf1 = 1.0f;

    /* renamed from: mVisibility */
    private boolean f49474x4fe85b5f = true;

    /* renamed from: mLevel */
    private int f49472xbe5ee717 = 1;

    /* renamed from: alpha */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26024x5ce381b5 m99443x589b15e(float f17) {
        this.f49467xbdc6fcf1 = f17;
        return this;
    }

    /* renamed from: anchor */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26024x5ce381b5 m99444xabc2c2b5(float f17, float f18) {
        this.f49468x6aae4713 = f17;
        this.f49469x6aae4714 = f18;
        return this;
    }

    /* renamed from: bitmap */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26024x5ce381b5 m99445xad38f12f(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e c26010x4177761e) {
        this.f49470x99cafc8b = c26010x4177761e;
        return this;
    }

    /* renamed from: getAlpha */
    public final float m99446x742757a8() {
        return this.f49467xbdc6fcf1;
    }

    /* renamed from: getAnchorU */
    public final float m99447xa62d00a() {
        return this.f49468x6aae4713;
    }

    /* renamed from: getAnchorV */
    public final float m99448xa62d00b() {
        return this.f49469x6aae4714;
    }

    /* renamed from: getBitmap */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e m99449x12501425() {
        return this.f49470x99cafc8b;
    }

    /* renamed from: getLatLngBounds */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b m99450x227a49d1() {
        return this.f49471x591cd068;
    }

    /* renamed from: getLevel */
    public final int m99451x74bf41ce() {
        return this.f49472xbe5ee717;
    }

    /* renamed from: getPosition */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 m99452xa86cd69f() {
        return this.f49473x519040b6;
    }

    /* renamed from: getZIndex */
    public final int m99453x397e976e() {
        return this.f49475x23d39b45;
    }

    /* renamed from: getZoom */
    public final float m99454xfb888c49() {
        return this.f49476x62a99e0;
    }

    /* renamed from: isVisible */
    public final boolean m99455xf94337e8() {
        return this.f49474x4fe85b5f;
    }

    /* renamed from: latLngBounds */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26024x5ce381b5 m99456xc187b75b(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b c26042xcb530b7b) {
        this.f49471x591cd068 = c26042xcb530b7b;
        return this;
    }

    /* renamed from: level */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26024x5ce381b5 m99457x6219b84(int i17) {
        if (i17 >= 0 && i17 <= 2) {
            this.f49472xbe5ee717 = i17;
        }
        return this;
    }

    /* renamed from: position */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26024x5ce381b5 m99458x2c929929(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26) {
        this.f49473x519040b6 = c26041x873d1d26;
        return this;
    }

    /* renamed from: toString */
    public final java.lang.String m99459x9616526c() {
        return "GroundOverlayOptions{mBitmapDescriptor=" + this.f49470x99cafc8b + ", mLatLngBounds=" + this.f49471x591cd068 + ", mPosition=" + this.f49473x519040b6 + ", mZoom=" + this.f49476x62a99e0 + ", mAnchorU=" + this.f49468x6aae4713 + ", mAnchorV=" + this.f49469x6aae4714 + ", mAlpha=" + this.f49467xbdc6fcf1 + ", mVisibility=" + this.f49474x4fe85b5f + ", mZIndex=" + this.f49475x23d39b45 + ", mLevel=" + this.f49472xbe5ee717 + '}';
    }

    /* renamed from: visible */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26024x5ce381b5 m99460x1bd1f072(boolean z17) {
        this.f49474x4fe85b5f = z17;
        return this;
    }

    /* renamed from: zIndex */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26024x5ce381b5 m99461xd4677478(int i17) {
        this.f49475x23d39b45 = i17;
        return this;
    }

    /* renamed from: zoom */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26024x5ce381b5 m99462x3923d3(float f17) {
        this.f49476x62a99e0 = f17;
        return this;
    }
}
