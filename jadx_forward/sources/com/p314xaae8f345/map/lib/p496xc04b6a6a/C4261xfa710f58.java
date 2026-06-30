package com.p314xaae8f345.map.lib.p496xc04b6a6a;

/* renamed from: com.tencent.map.lib.models.TrailOverlayInfo */
/* loaded from: classes13.dex */
public class C4261xfa710f58 extends com.p314xaae8f345.map.lib.p496xc04b6a6a.C4256x42658bd2 {

    /* renamed from: DEFAULT_MAX_ZOOM */
    private static final int f16647xacea7a4c = 22;

    /* renamed from: DEFAULT_MIN_ZOOM */
    private static final int f16648x430bde1e = 3;

    /* renamed from: colorPoints */
    protected float[] f16651x35222226;

    /* renamed from: colors */
    protected int[] f16652xaf3ebd70;

    /* renamed from: mType */
    protected int f16664x6280547 = 0;

    /* renamed from: mZIndex */
    protected int f16667x23d39b45 = 0;

    /* renamed from: activeIndex */
    protected int f16649xc01d2d6c = 0;

    /* renamed from: mOpacity */
    protected float f16661x5290aade = 1.0f;

    /* renamed from: mVisibility */
    protected boolean f16665x4fe85b5f = true;

    /* renamed from: mMinZoom */
    protected int f16660xdd857818 = 3;

    /* renamed from: mMaxZoom */
    protected int f16659xd06b9e2a = 22;

    /* renamed from: mDisplayLevel */
    protected int f16657xf6c9d4ef = 1;

    /* renamed from: mWidth */
    protected float f16666xbefb7959 = 4.0f;

    /* renamed from: mAnimate */
    protected boolean f16653x6b04e5b4 = true;

    /* renamed from: mHighLightDuration */
    protected int f16658xa8d7015b = 5000;

    /* renamed from: mAnimateStartTime */
    protected int f16656x27d7eefb = 0;

    /* renamed from: mAnimateEndTime */
    protected int f16655x635f09f4 = 2000;

    /* renamed from: mAnimateColor */
    protected int f16654xd44eca0f = -16776961;

    /* renamed from: colorMapSize */
    protected int f16650xb8e1ce9a = 200;

    /* renamed from: mPlayRatio */
    protected float f16662xa0eff4a = 1.0f;

    /* renamed from: mPulseInterval */
    protected int f16663x6ae4c411 = 200;

    /* renamed from: notes */
    protected com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4291x45669a8c[] f16669x6424ec1 = new com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4291x45669a8c[0];

    /* renamed from: nodeIndexes */
    protected int[] f16668xa3bbcc9e = new int[0];

    /* renamed from: getAnimateColor */
    public int m35456x9dac4378() {
        return this.f16654xd44eca0f;
    }

    /* renamed from: getIsAnimate */
    public boolean m35457xa9caeba1() {
        return this.f16653x6b04e5b4;
    }

    /* renamed from: isVisible */
    public boolean m35458xf94337e8() {
        return this.f16665x4fe85b5f;
    }

    /* renamed from: setActiveDataIndex */
    public void m35459x1e511620(int i17) {
        this.f16649xc01d2d6c = i17;
    }

    /* renamed from: setAnimate */
    public void m35460x7e2abc1f(boolean z17) {
        this.f16653x6b04e5b4 = z17;
    }

    /* renamed from: setAnimateColor */
    public void m35461xd3f53e84(int i17) {
        this.f16654xd44eca0f = i17;
    }

    /* renamed from: setAnimateEndTime */
    public void m35462x133a3529(int i17) {
        this.f16655x635f09f4 = i17;
    }

    /* renamed from: setAnimateStartTime */
    public void m35463x4d9520f0(int i17) {
        this.f16656x27d7eefb = i17;
    }

    /* renamed from: setDataList */
    public void m35464xe131cdea(java.util.List<java.util.Collection<com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4291x45669a8c>> list) {
        if (list == null || list.size() == 0) {
            this.f16669x6424ec1 = new com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4291x45669a8c[0];
            this.f16668xa3bbcc9e = new int[0];
            return;
        }
        this.f16668xa3bbcc9e = new int[list.size()];
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 0; i17 < list.size(); i17++) {
            java.util.Collection<com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4291x45669a8c> collection = list.get(i17);
            this.f16668xa3bbcc9e[i17] = collection.size();
            arrayList.addAll(collection);
        }
        this.f16669x6424ec1 = (com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4291x45669a8c[]) arrayList.toArray(new com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4291x45669a8c[0]);
    }

    /* renamed from: setDisplayLevel */
    public void m35465xf6704964(int i17) {
        this.f16657xf6c9d4ef = i17;
    }

    /* renamed from: setHighLightDuration */
    public void m35466x3ac00e06(int i17) {
        this.f16658xa8d7015b = i17;
    }

    /* renamed from: setMaxZoom */
    public void m35467xe3917495(int i17) {
        if (i17 <= 22) {
            this.f16659xd06b9e2a = i17;
        } else {
            this.f16659xd06b9e2a = 22;
        }
    }

    /* renamed from: setMinZoom */
    public void m35468xf0ab4e83(int i17) {
        if (i17 >= 3) {
            this.f16660xdd857818 = i17;
        } else {
            this.f16660xdd857818 = 3;
        }
    }

    /* renamed from: setNodes */
    public void m35469x536dd36f(com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4291x45669a8c[] c4291x45669a8cArr) {
        this.f16669x6424ec1 = c4291x45669a8cArr;
    }

    /* renamed from: setOpacity */
    public void m35470x65b68149(float f17) {
        this.f16661x5290aade = f17;
    }

    /* renamed from: setPlayRatio */
    public void m35471xeb18e6f5(float f17) {
        this.f16662xa0eff4a = f17;
    }

    /* renamed from: setType */
    public void m35472x7650bebc(int i17) {
        this.f16664x6280547 = i17;
    }

    /* renamed from: setVisibility */
    public void m35473x901b6914(boolean z17) {
        this.f16665x4fe85b5f = z17;
    }

    /* renamed from: setWidth */
    public void m35474x53e9ee84(float f17) {
        this.f16666xbefb7959 = f17;
    }

    /* renamed from: setZoomLevelRange */
    public void m35475x2e1094e(int i17, int i18) {
        if (i17 <= i18) {
            m35468xf0ab4e83(i17);
            m35467xe3917495(i18);
        }
    }

    /* renamed from: setzIndex */
    public void m35476x634edf5a(int i17) {
        this.f16667x23d39b45 = i17;
    }
}
