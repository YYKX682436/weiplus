package com.p314xaae8f345.map.lib.p496xc04b6a6a;

/* renamed from: com.tencent.map.lib.models.ScatterPlotInfo */
/* loaded from: classes13.dex */
public class C4259xc18f51ed extends com.p314xaae8f345.map.lib.p496xc04b6a6a.C4256x42658bd2 {

    /* renamed from: DEFAULT_MAX_ZOOM */
    private static final int f16612xacea7a4c = 22;

    /* renamed from: DEFAULT_MIN_ZOOM */
    private static final int f16613x430bde1e = 3;

    /* renamed from: circleStartPoints */
    protected double[] f16615xaa2184f5;

    /* renamed from: colors */
    protected int[] f16617xaf3ebd70;

    /* renamed from: colorsPoints */
    protected float[] f16618x76083273;

    /* renamed from: mBitmapHeight */
    protected int f16623x6f77a843;

    /* renamed from: mBitmapWidth */
    protected int f16624x14f1c32a;

    /* renamed from: maxIntensity */
    protected float f16631xc8ed632f;

    /* renamed from: maxZoom */
    protected int f16632x3252eb57;

    /* renamed from: minIntensity */
    protected float f16633xe5348e01;

    /* renamed from: minZoom */
    protected int f16634x3f6cc545;

    /* renamed from: opacity */
    protected float f16637xb477f80b;

    /* renamed from: radius */
    protected int f16638xc80e6c92;

    /* renamed from: visible */
    protected boolean f16639x1bd1f072;

    /* renamed from: activeIndex */
    protected int f16614xc01d2d6c = 0;

    /* renamed from: mType */
    protected int f16630x6280547 = 0;

    /* renamed from: level */
    protected int f16621x6219b84 = 1;

    /* renamed from: zIndex */
    protected int f16640xd4677478 = 0;

    /* renamed from: draw3D */
    protected boolean f16619xb118f2b5 = false;

    /* renamed from: colorMapSize */
    protected int f16616xb8e1ce9a = 200;

    /* renamed from: mAnimate */
    protected boolean f16622x6b04e5b4 = false;

    /* renamed from: intensityFlag */
    protected boolean f16620xd9673a3f = false;

    /* renamed from: mMinRadius */
    protected int f16627x8396c397 = 0;

    /* renamed from: mMaxRadius */
    protected int f16626x558bad29 = 30;

    /* renamed from: mStrokeColor */
    protected int f16628x1ba4fd5e = -1;

    /* renamed from: mStrokeWidth */
    protected int f16629x1cbbfbc1 = 4;

    /* renamed from: notes */
    protected com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4289xaab98d44[] f16636x6424ec1 = new com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4289xaab98d44[0];

    /* renamed from: nodeIndexes */
    protected int[] f16635xa3bbcc9e = new int[0];

    /* renamed from: mBitmaps */
    protected android.graphics.Bitmap[] f16625x97fde7f7 = new android.graphics.Bitmap[0];

    /* renamed from: isAnimate */
    public boolean m35432xaa5d7a57() {
        return this.f16622x6b04e5b4;
    }

    /* renamed from: isVisible */
    public boolean m35433xf94337e8() {
        return this.f16639x1bd1f072;
    }

    /* renamed from: setActiveIndex */
    public void m35434x3058e7aa(int i17) {
        this.f16614xc01d2d6c = i17;
    }

    /* renamed from: setAnimate */
    public void m35435x7e2abc1f(boolean z17) {
        this.f16622x6b04e5b4 = z17;
    }

    /* renamed from: setColors */
    public void m35436x78b1472(int[] iArr) {
        this.f16617xaf3ebd70 = iArr;
    }

    /* renamed from: setColorsPoints */
    public void m35438xd43bff5(float[] fArr) {
        this.f16618x76083273 = fArr;
    }

    /* renamed from: setDataList */
    public void m35439xe131cdea(java.util.List<java.util.Collection<com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4289xaab98d44>> list) {
        if (list == null) {
            this.f16636x6424ec1 = new com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4289xaab98d44[0];
            this.f16635xa3bbcc9e = new int[0];
            return;
        }
        this.f16635xa3bbcc9e = new int[list.size()];
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 0; i17 < list.size(); i17++) {
            java.util.Collection<com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4289xaab98d44> collection = list.get(i17);
            this.f16635xa3bbcc9e[i17] = collection.size();
            arrayList.addAll(collection);
        }
        this.f16636x6424ec1 = (com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4289xaab98d44[]) arrayList.toArray(new com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4289xaab98d44[0]);
    }

    /* renamed from: setDraw3D */
    public void m35440x96549b7(boolean z17) {
        this.f16619xb118f2b5 = z17;
    }

    /* renamed from: setLevel */
    public void m35441x534d5c42(int i17) {
        this.f16621x6219b84 = i17;
    }

    /* renamed from: setMaxZoom */
    public void m35442xe3917495(int i17) {
        if (i17 <= 22) {
            this.f16632x3252eb57 = i17;
        } else {
            this.f16632x3252eb57 = 22;
        }
    }

    /* renamed from: setMinZoom */
    public void m35443xf0ab4e83(int i17) {
        if (i17 >= 3) {
            this.f16634x3f6cc545 = i17;
        } else {
            this.f16634x3f6cc545 = 3;
        }
    }

    /* renamed from: setOpacity */
    public void m35444x65b68149(float f17) {
        this.f16637xb477f80b = f17;
    }

    /* renamed from: setRadius */
    public void m35445x205ac394(int i17) {
        this.f16638xc80e6c92 = i17;
    }

    /* renamed from: setVisible */
    public void m35446xcd1079b0(boolean z17) {
        this.f16639x1bd1f072 = z17;
    }

    /* renamed from: setZoomLevelRange */
    public void m35447x2e1094e(int i17, int i18) {
        if (i17 <= i18) {
            m35443xf0ab4e83(i17);
            m35442xe3917495(i18);
        }
    }

    /* renamed from: setzIndex */
    public void m35448x634edf5a(int i17) {
        this.f16640xd4677478 = i17;
    }

    /* renamed from: setColorsPoints */
    public void m35437xd43bff5(double[] dArr) {
        this.f16615xaa2184f5 = dArr;
    }
}
