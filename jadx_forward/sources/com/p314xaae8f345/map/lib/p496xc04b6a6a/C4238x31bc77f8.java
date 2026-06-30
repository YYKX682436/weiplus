package com.p314xaae8f345.map.lib.p496xc04b6a6a;

/* renamed from: com.tencent.map.lib.models.ArcLineOverlayInfo */
/* loaded from: classes13.dex */
public class C4238x31bc77f8 extends com.p314xaae8f345.map.lib.p496xc04b6a6a.C4256x42658bd2 {

    /* renamed from: DEFAULT_MAX_OPACITY */
    private static final float f16337x257566d2 = 1.0f;

    /* renamed from: DEFAULT_MAX_ZOOM */
    private static final int f16338xacea7a4c = 22;

    /* renamed from: DEFAULT_MIN_OPACITY */
    private static final float f16339xfd1499c0 = 0.0f;

    /* renamed from: DEFAULT_MIN_ZOOM */
    private static final int f16340x430bde1e = 3;

    /* renamed from: mType */
    protected int f16354x6280547 = 0;

    /* renamed from: mZIndex */
    protected int f16357x23d39b45 = 0;

    /* renamed from: activeIndex */
    protected int f16341xc01d2d6c = 0;

    /* renamed from: mOpacity */
    protected float f16353x5290aade = 1.0f;

    /* renamed from: mVisibility */
    protected boolean f16355x4fe85b5f = true;

    /* renamed from: mMinZoom */
    protected int f16352xdd857818 = 3;

    /* renamed from: mMaxZoom */
    protected int f16351xd06b9e2a = 22;

    /* renamed from: mDisplayLevel */
    protected int f16348xf6c9d4ef = 1;

    /* renamed from: mWidth */
    protected float f16356xbefb7959 = 4.0f;

    /* renamed from: mColors */
    protected int[] f16347xfeaae43d = {android.graphics.Color.argb(255, 0, 255, 170), android.graphics.Color.argb(255, 0, 255, 170), android.graphics.Color.argb(255, 0, 255, 170)};

    /* renamed from: mColorPoints */
    protected float[] f16346xdf2f3379 = {0.0f, 0.5f, 1.0f};

    /* renamed from: mColorMapSize */
    protected int f16345x5076e7a7 = 200;

    /* renamed from: mDraw3D */
    protected boolean f16349x851982 = false;

    /* renamed from: mAnimate */
    protected boolean f16342x6b04e5b4 = false;

    /* renamed from: mHighLightDuration */
    protected int f16350xa8d7015b = 5000;

    /* renamed from: mAnimateDuration */
    protected int f16344x2b8ca368 = 5000;

    /* renamed from: mAnimateColor */
    protected int f16343xd44eca0f = -16776961;

    /* renamed from: notes */
    protected com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4288x259a94b[] f16359x6424ec1 = new com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4288x259a94b[0];

    /* renamed from: nodeIndexes */
    protected int[] f16358xa3bbcc9e = new int[0];

    /* renamed from: getAnimateColor */
    public int m35261x9dac4378() {
        return this.f16343xd44eca0f;
    }

    /* renamed from: getIsAnimate */
    public boolean m35262xa9caeba1() {
        return this.f16342x6b04e5b4;
    }

    /* renamed from: isVisible */
    public boolean m35263xf94337e8() {
        return this.f16355x4fe85b5f;
    }

    /* renamed from: setActiveDataIndex */
    public void m35264x1e511620(int i17) {
        this.f16341xc01d2d6c = i17;
    }

    /* renamed from: setAnimate */
    public void m35265x7e2abc1f(boolean z17) {
        this.f16342x6b04e5b4 = z17;
    }

    /* renamed from: setAnimateColor */
    public void m35266xd3f53e84(int i17) {
        this.f16343xd44eca0f = i17;
    }

    /* renamed from: setAnimateDuration */
    public void m35267x7716ded3(int i17) {
        this.f16344x2b8ca368 = i17;
    }

    /* renamed from: setDataList */
    public void m35268xe131cdea(java.util.List<java.util.Collection<com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4288x259a94b>> list) {
        if (list == null || list.size() == 0) {
            this.f16359x6424ec1 = new com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4288x259a94b[0];
            this.f16358xa3bbcc9e = new int[0];
            return;
        }
        this.f16358xa3bbcc9e = new int[list.size()];
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 0; i17 < list.size(); i17++) {
            java.util.Collection<com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4288x259a94b> collection = list.get(i17);
            this.f16358xa3bbcc9e[i17] = collection.size();
            arrayList.addAll(collection);
        }
        this.f16359x6424ec1 = (com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4288x259a94b[]) arrayList.toArray(new com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4288x259a94b[0]);
    }

    /* renamed from: setDisplayLevel */
    public void m35269xf6704964(int i17) {
        if (i17 == 1 || i17 == 2) {
            this.f16348xf6c9d4ef = i17;
        }
    }

    /* renamed from: setDraw3D */
    public void m35270x96549b7(boolean z17) {
        this.f16349x851982 = z17;
    }

    /* renamed from: setHighLightDuration */
    public void m35271x3ac00e06(int i17) {
        this.f16350xa8d7015b = i17;
    }

    /* renamed from: setMaxZoom */
    public void m35272xe3917495(int i17) {
        if (i17 <= 22) {
            this.f16351xd06b9e2a = i17;
        } else {
            this.f16351xd06b9e2a = 22;
        }
    }

    /* renamed from: setMinZoom */
    public void m35273xf0ab4e83(int i17) {
        if (i17 >= 3) {
            this.f16352xdd857818 = i17;
        } else {
            this.f16352xdd857818 = 3;
        }
    }

    /* renamed from: setNodes */
    public void m35274x536dd36f(com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4288x259a94b[] c4288x259a94bArr) {
        this.f16359x6424ec1 = c4288x259a94bArr;
    }

    /* renamed from: setOpacity */
    public void m35275x65b68149(float f17) {
        if (f17 > 1.0f) {
            this.f16353x5290aade = 1.0f;
        } else if (f17 < 0.0f) {
            this.f16353x5290aade = 0.0f;
        } else {
            this.f16353x5290aade = f17;
        }
    }

    /* renamed from: setType */
    public void m35276x7650bebc(int i17) {
        this.f16354x6280547 = i17;
    }

    /* renamed from: setVisibility */
    public void m35277x901b6914(boolean z17) {
        this.f16355x4fe85b5f = z17;
    }

    /* renamed from: setWidth */
    public void m35278x53e9ee84(float f17) {
        this.f16356xbefb7959 = f17;
    }

    /* renamed from: setZoomLevelRange */
    public void m35279x2e1094e(int i17, int i18) {
        if (i17 <= i18) {
            m35273xf0ab4e83(i17);
            m35272xe3917495(i18);
        }
    }

    /* renamed from: setzIndex */
    public void m35280x634edf5a(int i17) {
        this.f16357x23d39b45 = i17;
    }
}
