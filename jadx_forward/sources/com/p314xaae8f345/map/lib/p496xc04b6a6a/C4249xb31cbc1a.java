package com.p314xaae8f345.map.lib.p496xc04b6a6a;

/* renamed from: com.tencent.map.lib.models.HeatmapInfo */
/* loaded from: classes13.dex */
public class C4249xb31cbc1a extends com.p314xaae8f345.map.lib.p496xc04b6a6a.C4256x42658bd2 {

    /* renamed from: DEFAULT_MAX_OPACITY */
    private static final float f16492x257566d2 = 1.0f;

    /* renamed from: DEFAULT_MAX_ZOOM */
    private static final int f16493xacea7a4c = 22;

    /* renamed from: DEFAULT_MIN_OPACITY */
    private static final float f16494xfd1499c0 = 0.0f;

    /* renamed from: DEFAULT_MIN_ZOOM */
    private static final int f16495x430bde1e = 3;

    /* renamed from: colorMapSize */
    protected int f16497xb8e1ce9a;

    /* renamed from: colorPoints */
    protected float[] f16498x35222226;

    /* renamed from: colors */
    protected int[] f16499xaf3ebd70;

    /* renamed from: maxZoom */
    protected int f16507x3252eb57;

    /* renamed from: minZoom */
    protected int f16509x3f6cc545;

    /* renamed from: opacity */
    protected float f16512xb477f80b;

    /* renamed from: radius */
    protected int f16513xc80e6c92;

    /* renamed from: visible */
    protected boolean f16515x1bd1f072;

    /* renamed from: activeIndex */
    protected int f16496xc01d2d6c = 0;

    /* renamed from: level */
    protected int f16502x6219b84 = 1;

    /* renamed from: zIndex */
    protected int f16516xd4677478 = 0;

    /* renamed from: sample */
    protected int f16514xc9c775aa = 4;

    /* renamed from: maxHeight */
    protected float f16505xc9fe87ab = 1000.0f;

    /* renamed from: draw3D */
    protected boolean f16500xb118f2b5 = false;

    /* renamed from: intensityFlag */
    protected boolean f16501xd9673a3f = false;

    /* renamed from: maxIntensity */
    protected float f16506xc8ed632f = 0.0f;

    /* renamed from: minIntensity */
    protected float f16508xe5348e01 = 0.0f;

    /* renamed from: mAnimate */
    protected boolean f16503x6b04e5b4 = false;

    /* renamed from: mAnimateDuration */
    protected int f16504x2b8ca368 = 5000;

    /* renamed from: notes */
    protected com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4292x85cd0d1d[] f16511x6424ec1 = new com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4292x85cd0d1d[0];

    /* renamed from: nodeIndexes */
    protected int[] f16510xa3bbcc9e = new int[0];

    /* renamed from: isAnimate */
    public boolean m35346xaa5d7a57() {
        return this.f16503x6b04e5b4;
    }

    /* renamed from: isVisible */
    public boolean m35347xf94337e8() {
        return this.f16515x1bd1f072;
    }

    /* renamed from: setActiveIndex */
    public void m35348x3058e7aa(int i17) {
        this.f16496xc01d2d6c = i17;
    }

    /* renamed from: setAnimate */
    public void m35349x7e2abc1f(boolean z17) {
        this.f16503x6b04e5b4 = z17;
    }

    /* renamed from: setAnimateTime */
    public void m35350xb4495b8c(int i17) {
        this.f16504x2b8ca368 = i17;
    }

    /* renamed from: setColorPoints */
    public void m35351xa55ddc64(float[] fArr) {
        this.f16498x35222226 = fArr;
    }

    /* renamed from: setColors */
    public void m35352x78b1472(int[] iArr) {
        this.f16499xaf3ebd70 = iArr;
    }

    /* renamed from: setDataList */
    public void m35353xe131cdea(java.util.List<java.util.Collection<com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4292x85cd0d1d>> list) {
        if (list == null) {
            this.f16511x6424ec1 = new com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4292x85cd0d1d[0];
            this.f16510xa3bbcc9e = new int[0];
            return;
        }
        this.f16510xa3bbcc9e = new int[list.size()];
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 0; i17 < list.size(); i17++) {
            java.util.Collection<com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4292x85cd0d1d> collection = list.get(i17);
            this.f16510xa3bbcc9e[i17] = collection.size();
            arrayList.addAll(collection);
        }
        this.f16511x6424ec1 = (com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4292x85cd0d1d[]) arrayList.toArray(new com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4292x85cd0d1d[0]);
    }

    /* renamed from: setDraw3D */
    public void m35354x96549b7(boolean z17) {
        this.f16500xb118f2b5 = z17;
    }

    /* renamed from: setLevel */
    public void m35355x534d5c42(int i17) {
        if (i17 == 1 || i17 == 2) {
            this.f16502x6219b84 = i17;
        }
    }

    /* renamed from: setMaxHeight */
    public void m35356x25bfb969(float f17) {
        this.f16505xc9fe87ab = f17;
    }

    /* renamed from: setMaxZoom */
    public void m35357xe3917495(int i17) {
        if (i17 <= 22) {
            this.f16507x3252eb57 = i17;
        } else {
            this.f16507x3252eb57 = 22;
        }
    }

    /* renamed from: setMinZoom */
    public void m35358xf0ab4e83(int i17) {
        if (i17 >= 3) {
            this.f16509x3f6cc545 = i17;
        } else {
            this.f16509x3f6cc545 = 3;
        }
    }

    /* renamed from: setOpacity */
    public void m35359x65b68149(float f17) {
        if (f17 > 1.0f) {
            this.f16512xb477f80b = 1.0f;
        } else if (f17 < 0.0f) {
            this.f16512xb477f80b = 0.0f;
        } else {
            this.f16512xb477f80b = f17;
        }
    }

    /* renamed from: setRadius */
    public void m35360x205ac394(int i17) {
        this.f16513xc80e6c92 = i17;
    }

    /* renamed from: setSample */
    public void m35361x2213ccac(int i17) {
        this.f16514xc9c775aa = i17;
    }

    /* renamed from: setVisible */
    public void m35362xcd1079b0(boolean z17) {
        this.f16515x1bd1f072 = z17;
    }

    /* renamed from: setZoomLevelRange */
    public void m35363x2e1094e(int i17, int i18) {
        if (i17 <= i18) {
            m35358xf0ab4e83(i17);
            m35357xe3917495(i18);
        }
    }

    /* renamed from: setzIndex */
    public void m35364x634edf5a(int i17) {
        this.f16516xd4677478 = i17;
    }
}
