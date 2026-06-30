package com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p508x2f6ed16c;

/* renamed from: com.tencent.map.sdk.utilities.visualization.heatmap.GradientVectorOverlayProvider */
/* loaded from: classes13.dex */
public class C4296xde694d2e extends com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30 {

    /* renamed from: DEFAULT_ANIMATE */
    private static final boolean f16815xb7716a3 = false;

    /* renamed from: DEFAULT_ANIMATE_TIME */
    private static final int f16816x2d0e9ae9 = 0;

    /* renamed from: DEFAULT_COLOR_MAP_SIZE */
    private static final int f16817xb535a87e = 500;

    /* renamed from: DEFAULT_DRAW_3D */
    private static final boolean f16818xb091672e = false;

    /* renamed from: DEFAULT_GRADIENT_COLORS */
    private static final int[] f16819x923ca741 = {android.graphics.Color.argb(255, 77, 111, 255), android.graphics.Color.argb(255, 0, 238, 227), android.graphics.Color.argb(255, 113, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.j6.f34370x366c91de, 80), android.graphics.Color.argb(255, 255, 176, 0), android.graphics.Color.argb(255, 255, 72, 0)};

    /* renamed from: DEFAULT_GRADIENT_START_POINTS */
    private static final float[] f16820xd1c2891 = {0.1f, 0.185f, 0.3571f, 0.6142f, 1.0f};

    /* renamed from: DEFAULT_MAX_HEIGHT */
    public static final float f16821xfcee2960 = 60.0f;

    /* renamed from: DEFAULT_MAX_INTENSITY */
    public static final float f16822x451fed3a = 2000.0f;

    /* renamed from: DEFAULT_MIN_INTENSITY */
    public static final float f16823xb1be1ca8 = 0.0f;

    /* renamed from: DEFAULT_OPACITY */
    public static final float f16824xf302dbcd = 1.0f;

    /* renamed from: DEFAULT_RADIUS */
    public static final int f16825x98868470 = 30;

    /* renamed from: MAX_RADIUS */
    private static final int f16826x5efffed = 150;

    /* renamed from: MIN_RADIUS */
    private static final int f16827x9947b73f = 18;

    /* renamed from: dataList */
    private java.util.List<com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4292x85cd0d1d> f16831x6a9f2f68 = new java.util.ArrayList();

    /* renamed from: maxHeight */
    private float f16836xc9fe87ab = 60.0f;

    /* renamed from: radius */
    private int f16839xc80e6c92 = 30;

    /* renamed from: colors */
    private int[] f16830xaf3ebd70 = f16819x923ca741;

    /* renamed from: colorPoints */
    private float[] f16829x35222226 = f16820xd1c2891;

    /* renamed from: colorMapSize */
    private int f16828xb8e1ce9a = 500;

    /* renamed from: draw3D */
    private boolean f16832xb118f2b5 = false;

    /* renamed from: maxIntensity */
    private float f16837xc8ed632f = 2000.0f;

    /* renamed from: minIntensity */
    private float f16838xe5348e01 = 0.0f;

    /* renamed from: intensityFlag */
    private boolean f16833xd9673a3f = false;

    /* renamed from: mAnimate */
    private boolean f16834x6b04e5b4 = false;

    /* renamed from: mAnimationDuration */
    private int f16835x3ca9904b = 0;

    /* renamed from: wrapData */
    private static java.util.List<com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4292x85cd0d1d> m35716x8402ff14(java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4292x85cd0d1d(it.next()));
        }
        return arrayList;
    }

    /* renamed from: data */
    public com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p508x2f6ed16c.C4296xde694d2e m35717x2eefaa(java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26> list) {
        return m35736x93e9161(m35716x8402ff14(list));
    }

    /* renamed from: enable3D */
    public com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p508x2f6ed16c.C4296xde694d2e m35718x61e1d734(boolean z17) {
        this.f16832xb118f2b5 = z17;
        return this;
    }

    /* renamed from: getAnimateDuration */
    public int m35719x4040455f() {
        return this.f16835x3ca9904b;
    }

    /* renamed from: getColorMapSize */
    public int m35720x19d46110() {
        return this.f16828xb8e1ce9a;
    }

    /* renamed from: getColorPoints */
    public float[] m35721xef868f0() {
        return this.f16829x35222226;
    }

    /* renamed from: getColors */
    public int[] m35722x1455e066() {
        return this.f16830xaf3ebd70;
    }

    /* renamed from: getData */
    public java.util.List<com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4292x85cd0d1d> m35723xfb7e5820() {
        return this.f16831x6a9f2f68;
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: getDisplayLevel */
    public int mo35585xc0274e58() {
        return super.mo35585xc0274e58();
    }

    /* renamed from: getMaxHeight */
    public float m35724xc96bf8f5() {
        return this.f16836xc9fe87ab;
    }

    /* renamed from: getMaxIntensity */
    public float m35725x29dff5a5() {
        return this.f16837xc8ed632f;
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: getMaxZoom */
    public int mo35586x70202721() {
        return super.mo35586x70202721();
    }

    /* renamed from: getMinIntensity */
    public float m35726x46272077() {
        return this.f16838xe5348e01;
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: getMinZoom */
    public int mo35587x7d3a010f() {
        return super.mo35587x7d3a010f();
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: getOpacity */
    public float mo35589xf24533d5() {
        return super.mo35589xf24533d5();
    }

    /* renamed from: getRadius */
    public int m35727x2d258f88() {
        return this.f16839xc80e6c92;
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: getZIndex */
    public int mo35591x397e976e() {
        return super.mo35591x397e976e();
    }

    /* renamed from: gradient */
    public com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p508x2f6ed16c.C4296xde694d2e m35728x557f730(int[] iArr, float[] fArr) {
        boolean z17;
        if (iArr != null && fArr != null && iArr.length > 0 && fArr.length > 0 && iArr.length == fArr.length) {
            int i17 = 1;
            while (true) {
                if (i17 >= fArr.length) {
                    z17 = true;
                    break;
                }
                if (fArr[i17 - 1] > fArr[i17]) {
                    z17 = false;
                    break;
                }
                i17++;
            }
            if (z17 && fArr[0] >= 0.0f && fArr[fArr.length - 1] <= 1.0f) {
                this.f16830xaf3ebd70 = iArr;
                this.f16829x35222226 = fArr;
            }
        }
        return this;
    }

    /* renamed from: isAnimate */
    public boolean m35729xaa5d7a57() {
        return this.f16834x6b04e5b4;
    }

    /* renamed from: isEnable3D */
    public boolean m35730x32997e7e() {
        return this.f16832xb118f2b5;
    }

    /* renamed from: isIntensityFlag */
    public boolean m35731x5aa69135() {
        return this.f16833xd9673a3f;
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: isVisibility */
    public boolean mo35593xf5215fdc() {
        return super.mo35593xf5215fdc();
    }

    /* renamed from: radius */
    public com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p508x2f6ed16c.C4296xde694d2e m35732xc80e6c92(int i17) {
        if (i17 >= 18 && i17 <= 150) {
            this.f16839xc80e6c92 = i17;
        }
        return this;
    }

    /* renamed from: setAnimateDuration */
    public com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p508x2f6ed16c.C4296xde694d2e m35733x7716ded3(int i17) {
        if (i17 == 0) {
            this.f16834x6b04e5b4 = false;
            this.f16835x3ca9904b = 0;
        } else if (i17 > 0) {
            this.f16835x3ca9904b = i17;
            this.f16834x6b04e5b4 = true;
        }
        return this;
    }

    /* renamed from: setIntensityRange */
    public com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p508x2f6ed16c.C4296xde694d2e m35734xab28dcc(float f17, float f18) {
        if (f17 >= f18 || f17 < 0.0f) {
            this.f16833xd9673a3f = false;
        } else {
            this.f16837xc8ed632f = f18;
            this.f16838xe5348e01 = f17;
            this.f16833xd9673a3f = true;
        }
        return this;
    }

    /* renamed from: setMaxHeight */
    public com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p508x2f6ed16c.C4296xde694d2e m35735x25bfb969(float f17) {
        if (f17 >= 0.0f) {
            this.f16836xc9fe87ab = f17;
        }
        return this;
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30
    /* renamed from: toString */
    public java.lang.String mo35599x9616526c() {
        return "GradientVectorOverlayProvider{dataList=" + this.f16831x6a9f2f68.size() + ", maxHeight=" + this.f16836xc9fe87ab + ", radius=" + this.f16839xc80e6c92 + ", colors=" + java.util.Arrays.toString(this.f16830xaf3ebd70) + ", colorPoints=" + java.util.Arrays.toString(this.f16829x35222226) + ", colorMapSize=" + this.f16828xb8e1ce9a + ", draw3D=" + this.f16832xb118f2b5 + ", maxIntensity=" + this.f16837xc8ed632f + ", minIntensity=" + this.f16838xe5348e01 + ", intensityFlag=" + this.f16833xd9673a3f + ", mAnimate=" + this.f16834x6b04e5b4 + ", mAnimationDuration=" + this.f16835x3ca9904b + ", mOpacity=" + this.f16739x5290aade + ", mVisibility=" + this.f16740x4fe85b5f + ", mMinZoom=" + this.f16738xdd857818 + ", mMaxZoom=" + this.f16737xd06b9e2a + ", mDisplayLevel=" + this.f16736xf6c9d4ef + ", mZIndex=" + this.f16741x23d39b45 + '}';
    }

    /* renamed from: weightedData */
    public com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p508x2f6ed16c.C4296xde694d2e m35736x93e9161(java.util.List<com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4292x85cd0d1d> list) {
        if (list != null) {
            this.f16831x6a9f2f68 = list;
        }
        return this;
    }

    /* renamed from: zoomRange */
    public com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p508x2f6ed16c.C4296xde694d2e m35737x61c4912a(int i17, int i18) {
        if (i17 <= i18) {
            super.mo35595x3f6cc545(i17);
            super.mo35594x3252eb57(i18);
        }
        return this;
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: displayLevel */
    public com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p508x2f6ed16c.C4296xde694d2e mo35583x5f34bbe2(int i17) {
        super.mo35583x5f34bbe2(i17);
        return this;
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: opacity */
    public com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p508x2f6ed16c.C4296xde694d2e mo35596xb477f80b(float f17) {
        super.mo35596xb477f80b(f17);
        return this;
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: visibility */
    public com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p508x2f6ed16c.C4296xde694d2e mo35600x73b66312(boolean z17) {
        super.mo35600x73b66312(z17);
        return this;
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: zIndex */
    public com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p508x2f6ed16c.C4296xde694d2e mo35601xd4677478(int i17) {
        super.mo35601xd4677478(i17);
        return this;
    }
}
