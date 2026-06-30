package com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p510xcc664f2d;

/* renamed from: com.tencent.map.sdk.utilities.visualization.trails.TrailOverlayProvider */
/* loaded from: classes13.dex */
public final class C4306xecda4b9b extends com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30 {

    /* renamed from: DEFAULT_COLOR_MAP_SIZE */
    private static final int f16870xb535a87e = 200;

    /* renamed from: DEFAULT_GRADIENT_COLORS */
    private static final int[] f16871x923ca741 = {android.graphics.Color.argb(255, 0, 128, 255), android.graphics.Color.argb(0, 0, 128, 255)};

    /* renamed from: DEFAULT_GRADIENT_START_POINTS */
    private static final float[] f16872xd1c2891 = {0.0f, 1.0f};

    /* renamed from: mType */
    private int f16886x6280547 = 0;

    /* renamed from: dataList */
    private java.util.List<com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4291x45669a8c> f16878x6a9f2f68 = new java.util.ArrayList();

    /* renamed from: DEFAULT_WIDTH */
    private final float f16877x3f041e08 = 6.0f;

    /* renamed from: mWidth */
    private float f16887xbefb7959 = 6.0f;

    /* renamed from: DEFAULT_HIGHLIGHT_DURATION */
    private final int f16875xb0beffbd = 1000;

    /* renamed from: DEFAULT_ANIMATE_START_TIME */
    private final int f16874x20425bc6 = 0;

    /* renamed from: DEFAULT_ANIMATE_END_TIME */
    private final int f16873x618c95ed = 2000;

    /* renamed from: mHighLightDuration */
    private int f16884xa8d7015b = 1000;

    /* renamed from: mAnimationStartTime */
    private int f16880x3a589e78 = 0;

    /* renamed from: mAnimatationEndTime */
    private int f16879x17257ce4 = 2000;

    /* renamed from: DEFAULT_PLAY_RATIO */
    private final float f16876xce0e0bfe = 1.0f;

    /* renamed from: mPlayRatio */
    private float f16885xa0eff4a = 1.0f;

    /* renamed from: mColors */
    private int[] f16883xfeaae43d = f16871x923ca741;

    /* renamed from: mColorPoints */
    private float[] f16882xdf2f3379 = f16872xd1c2891;

    /* renamed from: mColorMapSize */
    protected int f16881x5076e7a7 = 200;

    /* renamed from: com.tencent.map.sdk.utilities.visualization.trails.TrailOverlayProvider$TrailOverlayType */
    /* loaded from: classes6.dex */
    public enum TrailOverlayType {
        Trail
    }

    /* renamed from: data */
    public final com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p510xcc664f2d.C4306xecda4b9b m35784x2eefaa(java.util.List<com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4291x45669a8c> list) {
        if (list != null) {
            this.f16878x6a9f2f68 = list;
        }
        return this;
    }

    /* renamed from: getAnimateEndTime */
    public final int m35785x4b43cd1d() {
        return this.f16879x17257ce4;
    }

    /* renamed from: getAnimateStartTime */
    public final int m35786xa9988be4() {
        return this.f16880x3a589e78;
    }

    /* renamed from: getColorMapSize */
    public final int m35787x19d46110() {
        return this.f16881x5076e7a7;
    }

    /* renamed from: getColorPoints */
    public final float[] m35788xef868f0() {
        return this.f16882xdf2f3379;
    }

    /* renamed from: getColors */
    public final int[] m35789x1455e066() {
        return this.f16883xfeaae43d;
    }

    /* renamed from: getData */
    public final java.util.List<com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4291x45669a8c> m35790xfb7e5820() {
        return this.f16878x6a9f2f68;
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: getDisplayLevel */
    public final int mo35585xc0274e58() {
        return super.mo35585xc0274e58();
    }

    /* renamed from: getHighLightDuration */
    public final int m35791x5f2a0192() {
        return this.f16884xa8d7015b;
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

    /* renamed from: getOverlayType */
    public final com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p510xcc664f2d.C4306xecda4b9b.TrailOverlayType m35792xc197e674() {
        return com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p510xcc664f2d.C4306xecda4b9b.TrailOverlayType.m35805xcee59d22()[this.f16886x6280547];
    }

    /* renamed from: getPlayRatio */
    public final float m35793x8ec52681() {
        return this.f16885xa0eff4a;
    }

    /* renamed from: getType */
    public final int m35794xfb85f7b0() {
        return m35792xc197e674().ordinal();
    }

    /* renamed from: getWidth */
    public final float m35795x755bd410() {
        return this.f16887xbefb7959;
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: getZIndex */
    public final int mo35591x397e976e() {
        return super.mo35591x397e976e();
    }

    /* renamed from: gradient */
    public final com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p510xcc664f2d.C4306xecda4b9b m35796x557f730(int[] iArr) {
        if (iArr != null) {
            if (iArr.length == 1) {
                int i17 = iArr[0];
                this.f16883xfeaae43d = new int[]{i17, i17, i17};
                this.f16882xdf2f3379 = new float[]{0.0f, 0.5f, 1.0f};
            } else if (iArr.length == 2) {
                this.f16883xfeaae43d = iArr;
                this.f16882xdf2f3379 = new float[]{0.0f, 1.0f};
            } else if (iArr.length == 3) {
                this.f16883xfeaae43d = iArr;
                this.f16882xdf2f3379 = new float[]{0.0f, 0.5f, 1.0f};
            }
        }
        return this;
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: isVisibility */
    public final boolean mo35593xf5215fdc() {
        return super.mo35593xf5215fdc();
    }

    /* renamed from: setAnimateStartTime */
    public final com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p510xcc664f2d.C4306xecda4b9b m35797x4d9520f0(int i17, int i18) {
        if (i17 < i18 && i17 >= 0) {
            this.f16880x3a589e78 = i17;
            this.f16879x17257ce4 = i18;
        }
        return this;
    }

    /* renamed from: setHighlightDuration */
    public final com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p510xcc664f2d.C4306xecda4b9b m35798xb20de26(int i17) {
        if (i17 > 0) {
            this.f16884xa8d7015b = i17;
        }
        return this;
    }

    /* renamed from: setPlayRatio */
    public final com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p510xcc664f2d.C4306xecda4b9b m35799xeb18e6f5(float f17) {
        if (f17 > 0.0f) {
            this.f16885xa0eff4a = f17;
        }
        return this;
    }

    /* renamed from: type */
    public final com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p510xcc664f2d.C4306xecda4b9b m35800x368f3a(com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p510xcc664f2d.C4306xecda4b9b.TrailOverlayType trailOverlayType) {
        this.f16886x6280547 = trailOverlayType.ordinal();
        return this;
    }

    /* renamed from: width */
    public final com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p510xcc664f2d.C4306xecda4b9b m35801x6be2dc6(float f17) {
        if (f17 > 0.0f) {
            this.f16887xbefb7959 = f17;
        }
        return this;
    }

    /* renamed from: zoomRange */
    public final com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p510xcc664f2d.C4306xecda4b9b m35802x61c4912a(int i17, int i18) {
        if (i17 <= i18) {
            super.mo35595x3f6cc545(i17);
            super.mo35594x3252eb57(i18);
        }
        return this;
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: displayLevel */
    public final com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p510xcc664f2d.C4306xecda4b9b mo35583x5f34bbe2(int i17) {
        super.mo35583x5f34bbe2(i17);
        return this;
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: opacity */
    public final com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p510xcc664f2d.C4306xecda4b9b mo35596xb477f80b(float f17) {
        super.mo35596xb477f80b(f17);
        return this;
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: visibility */
    public final com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p510xcc664f2d.C4306xecda4b9b mo35600x73b66312(boolean z17) {
        super.mo35600x73b66312(z17);
        return this;
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: zIndex */
    public final com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p510xcc664f2d.C4306xecda4b9b mo35601xd4677478(int i17) {
        super.mo35601xd4677478(i17);
        return this;
    }
}
