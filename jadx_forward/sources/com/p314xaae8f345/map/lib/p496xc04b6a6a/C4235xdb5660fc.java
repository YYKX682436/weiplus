package com.p314xaae8f345.map.lib.p496xc04b6a6a;

/* renamed from: com.tencent.map.lib.models.AggregationOverlayInfo */
/* loaded from: classes13.dex */
public class C4235xdb5660fc extends com.p314xaae8f345.map.lib.p496xc04b6a6a.C4256x42658bd2 {

    /* renamed from: DEFAULT_MAX_OPACITY */
    private static final float f16301x257566d2 = 1.0f;

    /* renamed from: DEFAULT_MAX_ZOOM */
    private static final int f16302xacea7a4c = 22;

    /* renamed from: DEFAULT_MIN_OPACITY */
    private static final float f16303xfd1499c0 = 0.0f;

    /* renamed from: DEFAULT_MIN_ZOOM */
    private static final int f16304x430bde1e = 3;

    /* renamed from: mGeoReferencePoint */
    protected com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 f16311x581b3dc9;

    /* renamed from: mType */
    protected int f16323x6280547 = 0;

    /* renamed from: mSize */
    protected float f16321x627560e = 2000.0f;

    /* renamed from: mGap */
    protected float f16310x32a329 = 0.0f;

    /* renamed from: mOpacity */
    protected float f16319x5290aade = 1.0f;

    /* renamed from: mVisibility */
    protected boolean f16324x4fe85b5f = true;

    /* renamed from: mMinZoom */
    protected int f16317xdd857818 = 3;

    /* renamed from: mMaxZoom */
    protected int f16314xd06b9e2a = 22;

    /* renamed from: mDisplayLevel */
    protected int f16308xf6c9d4ef = 1;

    /* renamed from: mZIndex */
    protected int f16325x23d39b45 = 0;

    /* renamed from: mMinHeight */
    protected double f16315x72c0e82c = 0.0d;

    /* renamed from: mMaxHeight */
    protected double f16312x44b5d1be = 1000.0d;

    /* renamed from: mMinIntensity */
    protected double f16316x7cc9a70e = 0.0d;

    /* renamed from: mMaxIntensity */
    protected double f16313x60827c3c = 2000.0d;

    /* renamed from: mRangeFlag */
    protected boolean f16320x4de4105c = false;

    /* renamed from: mColors */
    protected int[] f16307xfeaae43d = {1174031124, -1711650028, -637908204};

    /* renamed from: mStartPoints */
    protected double[] f16322x3568cd38 = {0.0d, 0.6d, 0.8d};

    /* renamed from: mDraw3D */
    protected boolean f16309x851982 = false;

    /* renamed from: mAnimate */
    protected boolean f16305x6b04e5b4 = false;

    /* renamed from: mAnimateDuration */
    protected int f16306x2b8ca368 = 5000;

    /* renamed from: mNodes */
    protected com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4292x85cd0d1d[] f16318xbe7f5e44 = new com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4292x85cd0d1d[0];

    /* renamed from: isAnimate */
    public boolean m35241xaa5d7a57() {
        return this.f16305x6b04e5b4;
    }

    /* renamed from: isVisible */
    public boolean m35242xf94337e8() {
        return this.f16324x4fe85b5f;
    }

    /* renamed from: setAnimate */
    public void m35243x7e2abc1f(boolean z17) {
        this.f16305x6b04e5b4 = z17;
    }

    /* renamed from: setAnimateTime */
    public void m35244xb4495b8c(int i17) {
        this.f16306x2b8ca368 = i17;
    }

    /* renamed from: setColors */
    public void m35245x78b1472(int[] iArr) {
        this.f16307xfeaae43d = iArr;
    }

    /* renamed from: setDisplayLevel */
    public void m35246xf6704964(int i17) {
        if (i17 == 1 || i17 == 2) {
            this.f16308xf6c9d4ef = i17;
        }
    }

    /* renamed from: setDraw3D */
    public void m35247x96549b7(boolean z17) {
        this.f16309x851982 = z17;
    }

    /* renamed from: setGap */
    public void m35248xca026714(float f17) {
        this.f16310x32a329 = f17;
    }

    /* renamed from: setHeightRange */
    public void m35249x31f41294(double d17, double d18) {
        if (d17 > d18 || d17 < 0.0d) {
            this.f16315x72c0e82c = 0.0d;
            this.f16312x44b5d1be = 1000.0d;
        } else {
            this.f16312x44b5d1be = d18;
            this.f16315x72c0e82c = d17;
        }
    }

    /* renamed from: setMaxZoom */
    public void m35250xe3917495(int i17) {
        if (i17 <= 22) {
            this.f16314xd06b9e2a = i17;
        } else {
            this.f16314xd06b9e2a = 22;
        }
    }

    /* renamed from: setMinZoom */
    public void m35251xf0ab4e83(int i17) {
        if (i17 >= 3) {
            this.f16317xdd857818 = i17;
        } else {
            this.f16317xdd857818 = 3;
        }
    }

    /* renamed from: setNodes */
    public void m35252x536dd36f(com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4292x85cd0d1d[] c4292x85cd0d1dArr) {
        this.f16318xbe7f5e44 = c4292x85cd0d1dArr;
    }

    /* renamed from: setOpacity */
    public void m35253x65b68149(float f17) {
        if (f17 > 1.0f) {
            this.f16319x5290aade = 1.0f;
        } else if (f17 < 0.0f) {
            this.f16319x5290aade = 0.0f;
        } else {
            this.f16319x5290aade = f17;
        }
    }

    /* renamed from: setShowRange */
    public void m35254xe98ef5fe(double d17, double d18) {
        if (d17 > d18 || d17 < 0.0d) {
            this.f16316x7cc9a70e = 0.0d;
            this.f16313x60827c3c = 2000.0d;
            this.f16320x4de4105c = false;
        } else {
            this.f16316x7cc9a70e = d17;
            this.f16313x60827c3c = d18;
            this.f16320x4de4105c = true;
        }
    }

    /* renamed from: setSize */
    public void m35255x76500f83(float f17) {
        this.f16321x627560e = f17;
    }

    /* renamed from: setStartPoints */
    public void m35256xfb977623(double[] dArr) {
        this.f16322x3568cd38 = dArr;
    }

    /* renamed from: setType */
    public void m35257x7650bebc(int i17) {
        this.f16323x6280547 = i17;
    }

    /* renamed from: setVisibility */
    public void m35258x901b6914(boolean z17) {
        this.f16324x4fe85b5f = z17;
    }

    /* renamed from: setZIndex */
    public void m35259x2cb3cb7a(int i17) {
        this.f16325x23d39b45 = i17;
    }

    /* renamed from: setZoomLevelRange */
    public void m35260x2e1094e(int i17, int i18) {
        if (i17 <= i18) {
            m35251xf0ab4e83(i17);
            m35250xe3917495(i18);
        }
    }
}
