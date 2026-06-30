package com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.od;

/* renamed from: com.tencent.map.sdk.utilities.visualization.od.ArcLineOverlayProvider */
/* loaded from: classes13.dex */
public final class C4298x4900643b extends com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30 {

    /* renamed from: DEFAULT_COLOR_MAP_SIZE */
    private static final int f16840xb535a87e = 200;

    /* renamed from: DEFAULT_GRADIENT_COLORS */
    private static final int[] f16841x923ca741 = {android.graphics.Color.argb(255, 0, 128, 255), android.graphics.Color.argb(51, 0, 170, 255), android.graphics.Color.argb(255, 0, 128, 255)};

    /* renamed from: DEFAULT_GRADIENT_START_POINTS */
    private static final float[] f16842xd1c2891 = {0.0f, 0.5f, 1.0f};

    /* renamed from: dataList */
    private java.util.List<com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4288x259a94b> f16843x6a9f2f68 = new java.util.ArrayList();

    /* renamed from: mWidth */
    private float f16853xbefb7959 = 6.0f;

    /* renamed from: mRadian */
    private float f16852x177a90ee = 45.0f;

    /* renamed from: mDraw3D */
    private boolean f16850x851982 = false;

    /* renamed from: mAnimate */
    private boolean f16844x6b04e5b4 = true;

    /* renamed from: mHighLightDuration */
    private int f16851xa8d7015b = 200;

    /* renamed from: mAnimationDuration */
    private int f16846x3ca9904b = 2000;

    /* renamed from: mAnimateColor */
    private int f16845xd44eca0f = -10046465;

    /* renamed from: mColors */
    private int[] f16849xfeaae43d = f16841x923ca741;

    /* renamed from: mColorPoints */
    private float[] f16848xdf2f3379 = f16842xd1c2891;

    /* renamed from: mColorMapSize */
    protected int f16847x5076e7a7 = 200;

    /* renamed from: animateColor */
    public final com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.od.C4298x4900643b m35739x3cb9b102(int i17) {
        this.f16845xd44eca0f = i17;
        return this;
    }

    /* renamed from: data */
    public final com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.od.C4298x4900643b m35740x2eefaa(java.util.List<com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4288x259a94b> list) {
        if (list != null) {
            this.f16843x6a9f2f68 = list;
        }
        return this;
    }

    /* renamed from: enable3D */
    public final com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.od.C4298x4900643b m35741x61e1d734(boolean z17) {
        this.f16850x851982 = z17;
        return this;
    }

    /* renamed from: getAnimateColor */
    public final int m35742x9dac4378() {
        return this.f16845xd44eca0f;
    }

    /* renamed from: getAnimateDuration */
    public final int m35743x4040455f() {
        return this.f16846x3ca9904b;
    }

    /* renamed from: getColorMapSize */
    public final int m35744x19d46110() {
        return this.f16847x5076e7a7;
    }

    /* renamed from: getColorPoints */
    public final float[] m35745xef868f0() {
        return this.f16848xdf2f3379;
    }

    /* renamed from: getColors */
    public final int[] m35746x1455e066() {
        return this.f16849xfeaae43d;
    }

    /* renamed from: getData */
    public final java.util.List<com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4288x259a94b> m35747xfb7e5820() {
        return this.f16843x6a9f2f68;
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: getDisplayLevel */
    public final int mo35585xc0274e58() {
        return super.mo35585xc0274e58();
    }

    /* renamed from: getHighLightDuration */
    public final int m35748x5f2a0192() {
        return this.f16851xa8d7015b;
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: getMaxZoom */
    public final int mo35586x70202721() {
        return super.mo35586x70202721();
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: getMinZoom */
    public final int mo35587x7d3a010f() {
        return super.mo35587x7d3a010f();
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: getOpacity */
    public final float mo35589xf24533d5() {
        return super.mo35589xf24533d5();
    }

    /* renamed from: getRadian */
    public final float m35749x2d258d17() {
        return this.f16852x177a90ee;
    }

    /* renamed from: getWidth */
    public final float m35750x755bd410() {
        return this.f16853xbefb7959;
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: getZIndex */
    public final int mo35591x397e976e() {
        return super.mo35591x397e976e();
    }

    /* renamed from: gradient */
    public final com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.od.C4298x4900643b m35751x557f730(int[] iArr) {
        if (iArr != null) {
            if (iArr.length == 1) {
                int i17 = iArr[0];
                this.f16849xfeaae43d = new int[]{i17, i17, i17};
                this.f16848xdf2f3379 = new float[]{0.0f, 0.5f, 1.0f};
            } else if (iArr.length == 2) {
                this.f16849xfeaae43d = iArr;
                this.f16848xdf2f3379 = new float[]{0.0f, 1.0f};
            } else if (iArr.length == 3) {
                this.f16849xfeaae43d = iArr;
                this.f16848xdf2f3379 = new float[]{0.0f, 0.5f, 1.0f};
            }
        }
        return this;
    }

    /* renamed from: isAnimate */
    public final boolean m35752xaa5d7a57() {
        return this.f16844x6b04e5b4;
    }

    /* renamed from: isEnable3D */
    public final boolean m35753x32997e7e() {
        return this.f16850x851982;
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: isVisibility */
    public final boolean mo35593xf5215fdc() {
        return super.mo35593xf5215fdc();
    }

    /* renamed from: radian */
    public final com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.od.C4298x4900643b m35754xc80e6a21(float f17) {
        if (f17 > 0.0f && f17 <= 90.0f) {
            this.f16852x177a90ee = f17;
            java.util.Iterator<com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4288x259a94b> it = this.f16843x6a9f2f68.iterator();
            while (it.hasNext()) {
                it.next().m35642xca025290(this.f16852x177a90ee);
            }
        }
        return this;
    }

    /* renamed from: setAnimateDuration */
    public final com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.od.C4298x4900643b m35755x7716ded3(int i17) {
        if (i17 == 0) {
            this.f16844x6b04e5b4 = false;
            this.f16846x3ca9904b = 0;
        } else if (i17 > 0) {
            this.f16846x3ca9904b = i17;
            this.f16844x6b04e5b4 = true;
        }
        return this;
    }

    /* renamed from: setHighlightDuration */
    public final com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.od.C4298x4900643b m35756xb20de26(int i17) {
        if (i17 >= 0) {
            this.f16851xa8d7015b = i17;
        }
        return this;
    }

    /* renamed from: width */
    public final com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.od.C4298x4900643b m35757x6be2dc6(float f17) {
        if (f17 > 0.0f) {
            this.f16853xbefb7959 = f17;
        }
        return this;
    }

    /* renamed from: zoomRange */
    public final com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.od.C4298x4900643b m35758x61c4912a(int i17, int i18) {
        if (i17 <= i18) {
            super.mo35595x3f6cc545(i17);
            super.mo35594x3252eb57(i18);
        }
        return this;
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: displayLevel */
    public final com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.od.C4298x4900643b mo35583x5f34bbe2(int i17) {
        super.mo35583x5f34bbe2(i17);
        return this;
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: opacity */
    public final com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.od.C4298x4900643b mo35596xb477f80b(float f17) {
        super.mo35596xb477f80b(f17);
        return this;
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: visibility */
    public final com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.od.C4298x4900643b mo35600x73b66312(boolean z17) {
        super.mo35600x73b66312(z17);
        return this;
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: zIndex */
    public final com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.od.C4298x4900643b mo35601xd4677478(int i17) {
        super.mo35601xd4677478(i17);
        return this;
    }
}
