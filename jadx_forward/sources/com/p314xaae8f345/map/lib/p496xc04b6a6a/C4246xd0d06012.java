package com.p314xaae8f345.map.lib.p496xc04b6a6a;

/* renamed from: com.tencent.map.lib.models.GLModelInfo */
/* loaded from: classes13.dex */
public class C4246xd0d06012 extends com.p314xaae8f345.map.lib.p496xc04b6a6a.C4256x42658bd2 {

    /* renamed from: DEFAULT_MAX_OPACITY */
    private static final float f16455x257566d2 = 1.0f;

    /* renamed from: DEFAULT_MAX_ZOOM */
    private static final int f16456xacea7a4c = 22;

    /* renamed from: DEFAULT_MIN_OPACITY */
    private static final float f16457xfd1499c0 = 0.0f;

    /* renamed from: DEFAULT_MIN_ZOOM */
    private static final int f16458x430bde1e = 3;

    /* renamed from: mAltitude */
    protected double f16463x9e60f22f;

    /* renamed from: mCoordType */
    protected int f16465x93d605e2;

    /* renamed from: mLatLngBounds */
    protected com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b f16466x591cd068;

    /* renamed from: mModelFilePath */
    protected java.lang.String f16469x2e0dde9d;

    /* renamed from: mPosition */
    protected com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 f16472x519040b6;

    /* renamed from: mRotationX */
    protected float f16473x30402aad;

    /* renamed from: mRotationY */
    protected float f16474x30402aae;

    /* renamed from: mRotationZ */
    protected float f16475x30402aaf;

    /* renamed from: mScale */
    protected double f16476xbec054dd = 1.0d;

    /* renamed from: mAnimate */
    protected int f16464x6b04e5b4 = 0;

    /* renamed from: mMinZoom */
    protected int f16468xdd857818 = 3;

    /* renamed from: mMaxZoom */
    protected int f16467xd06b9e2a = 22;

    /* renamed from: opacity */
    protected float f16477xb477f80b = 1.0f;

    /* renamed from: level */
    protected int f16462x6219b84 = 1;

    /* renamed from: zIndex */
    protected int f16480xd4677478 = 0;

    /* renamed from: visible */
    protected boolean f16479x1bd1f072 = true;

    /* renamed from: exposure */
    protected float f16461x8d337d07 = 1.0f;

    /* renamed from: buildingHidden */
    protected boolean f16459x1a19c57e = true;

    /* renamed from: clickEnabled */
    protected boolean f16460xc12a9499 = false;

    /* renamed from: mPixelWidth */
    protected int f16471xda0e072d = 64;

    /* renamed from: mPixelHeight */
    protected int f16470x4de3e4a0 = 64;

    /* renamed from: unlit */
    protected boolean f16478x6a4615e = false;

    /* renamed from: enableClick */
    public void m35300xa947a9c5(boolean z17) {
        this.f16460xc12a9499 = z17;
    }

    /* renamed from: getExposure */
    public float m35301x90dba7d() {
        return this.f16461x8d337d07;
    }

    /* renamed from: getPosition */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 m35302xa86cd69f() {
        return this.f16472x519040b6;
    }

    /* renamed from: getRotationX */
    public float m35303xb4f651e4() {
        return this.f16473x30402aad;
    }

    /* renamed from: getRotationY */
    public float m35304xb4f651e5() {
        return this.f16474x30402aae;
    }

    /* renamed from: getRotationZ */
    public float m35305xb4f651e6() {
        return this.f16475x30402aaf;
    }

    /* renamed from: getScale */
    public double m35306x7520af94() {
        return this.f16476xbec054dd;
    }

    /* renamed from: getUnlit */
    public boolean m35307x754207a8() {
        return this.f16478x6a4615e;
    }

    /* renamed from: isClickEnabled */
    public boolean m35308x93c986e3() {
        return this.f16460xc12a9499;
    }

    /* renamed from: isVisible */
    public boolean m35309xf94337e8() {
        return this.f16479x1bd1f072;
    }

    /* renamed from: setCoordType */
    public void m35310x74dfed8d(int i17) {
        this.f16465x93d605e2 = i17;
    }

    /* renamed from: setExposure */
    public void m35311x3c61b89(float f17) {
        this.f16461x8d337d07 = f17;
    }

    /* renamed from: setLevel */
    public void m35312x534d5c42(int i17) {
        if (i17 == 1 || i17 == 2) {
            this.f16462x6219b84 = i17;
        }
    }

    /* renamed from: setMaxZoom */
    public void m35313xe3917495(int i17) {
        if (i17 <= 22) {
            this.f16467xd06b9e2a = i17;
        } else {
            this.f16467xd06b9e2a = 22;
        }
    }

    /* renamed from: setMinZoom */
    public void m35314xf0ab4e83(int i17) {
        if (i17 >= 3) {
            this.f16468xdd857818 = i17;
        } else {
            this.f16468xdd857818 = 3;
        }
    }

    /* renamed from: setModelPosition */
    public void m35315x7ba1e230(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26) {
        this.f16472x519040b6 = c26041x873d1d26;
        this.f16463x9e60f22f = c26041x873d1d26.m99508xf53d8818();
    }

    /* renamed from: setOpacity */
    public void m35316x65b68149(float f17) {
        if (f17 > 1.0f) {
            this.f16477xb477f80b = 1.0f;
        } else if (f17 < 0.0f) {
            this.f16477xb477f80b = 0.0f;
        } else {
            this.f16477xb477f80b = f17;
        }
    }

    /* renamed from: setPixelBound */
    public void m35317x191c209a(int i17, int i18) {
        this.f16471xda0e072d = i17;
        this.f16470x4de3e4a0 = i18;
    }

    /* renamed from: setRotationX */
    public void m35318x114a1258(float f17) {
        this.f16473x30402aad = f17;
    }

    /* renamed from: setRotationY */
    public void m35319x114a1259(float f17) {
        this.f16474x30402aae = f17;
    }

    /* renamed from: setRotationZ */
    public void m35320x114a125a(float f17) {
        this.f16475x30402aaf = f17;
    }

    /* renamed from: setScale */
    public void m35321x53aeca08(float f17) {
        this.f16476xbec054dd = f17;
    }

    /* renamed from: setUnlit */
    public void m35322x53d0221c(boolean z17) {
        this.f16478x6a4615e = z17;
    }

    /* renamed from: setVisible */
    public void m35323xcd1079b0(boolean z17) {
        this.f16479x1bd1f072 = z17;
    }

    /* renamed from: setZoomLevelRange */
    public void m35324x2e1094e(int i17, int i18) {
        if (i17 <= i18) {
            m35314xf0ab4e83(i17);
            m35313xe3917495(i18);
        }
    }

    /* renamed from: setzIndex */
    public void m35325x634edf5a(int i17) {
        this.f16480xd4677478 = i17;
    }
}
