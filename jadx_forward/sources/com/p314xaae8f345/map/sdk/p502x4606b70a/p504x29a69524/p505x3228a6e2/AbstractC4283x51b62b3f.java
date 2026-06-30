package com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p505x3228a6e2;

/* renamed from: com.tencent.map.sdk.utilities.visualization.aggregation.AggregationOverlayProvider */
/* loaded from: classes13.dex */
public abstract class AbstractC4283x51b62b3f extends com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30 {

    /* renamed from: DEFAULT_MAX_HEIGHT */
    private static final double f16749xfcee2960 = 100.0d;

    /* renamed from: DEFAULT_MAX_INTENSITY */
    private static final int f16750x451fed3a = 2000;

    /* renamed from: DEFAULT_MIN_INTENSITY */
    private static final int f16752xb1be1ca8 = 0;

    /* renamed from: DEFAULT_MIN_SIZE */
    private static final int f16753x43089a4c = 10;

    /* renamed from: DEFAULT_SIZE */
    private static final int f16754x651f5b5f = 2000;

    /* renamed from: mGeoReferencePoint */
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 f16761x581b3dc9;

    /* renamed from: mNodes */
    private com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4292x85cd0d1d[] f16766xbe7f5e44;

    /* renamed from: DEFAULT_COLORS */
    private static final int[] f16748x7fb6d54e = {android.graphics.Color.argb(255, 31, 44, 71), android.graphics.Color.argb(255, 40, 72, 138), android.graphics.Color.argb(255, 38, 97, 217), android.graphics.Color.argb(255, 90, 140, 242), android.graphics.Color.argb(255, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.InterfaceC26399x617a50af.f53180x5a1baf5, 187, 255)};

    /* renamed from: DEFAULT_MIN_HEIGHT */
    private static final double f16751x9045e0b2 = 0.0d;

    /* renamed from: DEFAULT_START_POINTS */
    private static final double[] f16755x856cd8de = {f16751x9045e0b2, 0.10000000149011612d, 0.15000000596046448d, 0.30000001192092896d, 0.5d};

    /* renamed from: mType */
    private int f16770x6280547 = 0;

    /* renamed from: mSize */
    private float f16768x627560e = 2000.0f;

    /* renamed from: mGap */
    private float f16760x32a329 = 0.0f;

    /* renamed from: mColors */
    private int[] f16758xfeaae43d = f16748x7fb6d54e;

    /* renamed from: mStartPoints */
    private double[] f16769x3568cd38 = f16755x856cd8de;

    /* renamed from: mMinIntensity */
    private double f16765x7cc9a70e = f16751x9045e0b2;

    /* renamed from: mMaxIntensity */
    private double f16763x60827c3c = 2000.0d;

    /* renamed from: mRangeFlag */
    private boolean f16767x4de4105c = false;

    /* renamed from: mMaxHeight */
    private double f16762x44b5d1be = f16749xfcee2960;

    /* renamed from: mMinHeight */
    private double f16764x72c0e82c = f16751x9045e0b2;

    /* renamed from: mDraw3D */
    private boolean f16759x851982 = false;

    /* renamed from: mAnimate */
    private boolean f16756x6b04e5b4 = false;

    /* renamed from: mAnimateDuration */
    private int f16757x2b8ca368 = 0;

    /* renamed from: com.tencent.map.sdk.utilities.visualization.aggregation.AggregationOverlayProvider$AggregationOverlayType */
    /* loaded from: classes6.dex */
    public enum AggregationOverlayType {
        HoneyComb,
        Square
    }

    /* renamed from: colors */
    public com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p505x3228a6e2.AbstractC4283x51b62b3f m35607xaf3ebd70(int[] iArr, double[] dArr) {
        boolean z17;
        if (iArr != null && dArr != null && iArr.length > 0 && dArr.length > 0 && iArr.length == dArr.length) {
            int i17 = 1;
            while (true) {
                if (i17 >= dArr.length) {
                    z17 = true;
                    break;
                }
                if (dArr[i17 - 1] > dArr[i17]) {
                    z17 = false;
                    break;
                }
                i17++;
            }
            if (z17 && dArr[0] >= f16751x9045e0b2 && dArr[dArr.length - 1] <= 1.0d) {
                this.f16758xfeaae43d = iArr;
                this.f16769x3568cd38 = dArr;
            }
        }
        return this;
    }

    /* renamed from: enable3D */
    public com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p505x3228a6e2.AbstractC4283x51b62b3f m35608x61e1d734(boolean z17) {
        this.f16759x851982 = z17;
        return this;
    }

    public com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p505x3228a6e2.AbstractC4283x51b62b3f gap(float f17) {
        if (f17 >= 0.0f) {
            this.f16760x32a329 = f17;
        }
        return this;
    }

    /* renamed from: getAnimateDuration */
    public int m35609x4040455f() {
        return this.f16757x2b8ca368;
    }

    /* renamed from: getColors */
    public int[] m35610x1455e066() {
        return this.f16758xfeaae43d;
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: getDisplayLevel */
    public int mo35585xc0274e58() {
        return super.mo35585xc0274e58();
    }

    /* renamed from: getGap */
    public float m35611xb5883fa0() {
        return this.f16760x32a329;
    }

    /* renamed from: getGeoReferencePoint */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 m35612xe6e3e00() {
        return this.f16761x581b3dc9;
    }

    /* renamed from: getMaxHeight */
    public double m35613xc96bf8f5() {
        return this.f16762x44b5d1be;
    }

    /* renamed from: getMaxIntensity */
    public double m35614x29dff5a5() {
        return this.f16763x60827c3c;
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: getMaxZoom */
    public int mo35586x70202721() {
        return super.mo35586x70202721();
    }

    /* renamed from: getMinHeight */
    public double m35615xf7770f63() {
        return this.f16764x72c0e82c;
    }

    /* renamed from: getMinIntensity */
    public double m35616x46272077() {
        return this.f16765x7cc9a70e;
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: getMinZoom */
    public int mo35587x7d3a010f() {
        return super.mo35587x7d3a010f();
    }

    /* renamed from: getNodes */
    public com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4292x85cd0d1d[] m35617x74dfb8fb() {
        return this.f16766xbe7f5e44;
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: getOpacity */
    public float mo35589xf24533d5() {
        return super.mo35589xf24533d5();
    }

    /* renamed from: getOverlayType */
    public com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p505x3228a6e2.AbstractC4283x51b62b3f.AggregationOverlayType m35618xc197e674() {
        return com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p505x3228a6e2.AbstractC4283x51b62b3f.AggregationOverlayType.m35635xcee59d22()[this.f16770x6280547];
    }

    /* renamed from: getRangeFlag */
    public boolean m35619xd29a3793() {
        return this.f16767x4de4105c;
    }

    /* renamed from: getSize */
    public float m35620xfb854877() {
        return this.f16768x627560e;
    }

    /* renamed from: getStartPoints */
    public double[] m35621x653202af() {
        return this.f16769x3568cd38;
    }

    /* renamed from: getType */
    public int m35622xfb85f7b0() {
        return m35618xc197e674().ordinal();
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: getZIndex */
    public int mo35591x397e976e() {
        return super.mo35591x397e976e();
    }

    /* renamed from: isAnimate */
    public boolean m35623xaa5d7a57() {
        return this.f16756x6b04e5b4;
    }

    /* renamed from: isEnable3D */
    public boolean m35624x32997e7e() {
        return this.f16759x851982;
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: isVisibility */
    public boolean mo35593xf5215fdc() {
        return super.mo35593xf5215fdc();
    }

    /* renamed from: nodes */
    public com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p505x3228a6e2.AbstractC4283x51b62b3f m35625x64212b1(com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4292x85cd0d1d[] c4292x85cd0d1dArr) {
        if (c4292x85cd0d1dArr != null) {
            this.f16766xbe7f5e44 = c4292x85cd0d1dArr;
        }
        return this;
    }

    /* renamed from: setAnimateDuration */
    public com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p505x3228a6e2.AbstractC4283x51b62b3f m35626x7716ded3(int i17) {
        if (i17 == 0) {
            this.f16756x6b04e5b4 = false;
            this.f16757x2b8ca368 = 0;
        } else if (i17 > 0) {
            this.f16757x2b8ca368 = i17;
            this.f16756x6b04e5b4 = true;
        }
        return this;
    }

    /* renamed from: setGeoReferencePoint */
    public void m35627xea044a74(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26) {
        this.f16761x581b3dc9 = c26041x873d1d26;
    }

    /* renamed from: setHeightRange */
    public com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p505x3228a6e2.AbstractC4283x51b62b3f m35628x31f41294(double d17, double d18) {
        if (d17 <= d18 && d17 >= f16751x9045e0b2) {
            this.f16762x44b5d1be = d18;
            this.f16764x72c0e82c = d17;
        }
        return this;
    }

    /* renamed from: setIntensityRange */
    public com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p505x3228a6e2.AbstractC4283x51b62b3f m35629xab28dcc(double d17, double d18) {
        if (d17 < d18 && d17 >= f16751x9045e0b2) {
            this.f16763x60827c3c = d18;
            this.f16765x7cc9a70e = d17;
            this.f16767x4de4105c = true;
        }
        return this;
    }

    /* renamed from: size */
    public com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p505x3228a6e2.AbstractC4283x51b62b3f m35630x35e001(float f17) {
        if (f17 < 10.0f) {
            return this;
        }
        this.f16768x627560e = f17;
        return this;
    }

    /* renamed from: type */
    public com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p505x3228a6e2.AbstractC4283x51b62b3f m35631x368f3a(com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p505x3228a6e2.AbstractC4283x51b62b3f.AggregationOverlayType aggregationOverlayType) {
        this.f16770x6280547 = aggregationOverlayType.ordinal();
        return this;
    }

    /* renamed from: zoomRange */
    public com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p505x3228a6e2.AbstractC4283x51b62b3f m35632x61c4912a(int i17, int i18) {
        if (i17 <= i18) {
            super.mo35595x3f6cc545(i17);
            super.mo35594x3252eb57(i18);
        }
        return this;
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: displayLevel */
    public com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p505x3228a6e2.AbstractC4283x51b62b3f mo35583x5f34bbe2(int i17) {
        super.mo35583x5f34bbe2(i17);
        return this;
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: opacity */
    public com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p505x3228a6e2.AbstractC4283x51b62b3f mo35596xb477f80b(float f17) {
        super.mo35596xb477f80b(f17);
        return this;
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: visibility */
    public com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p505x3228a6e2.AbstractC4283x51b62b3f mo35600x73b66312(boolean z17) {
        super.mo35600x73b66312(z17);
        return this;
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: zIndex */
    public com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p505x3228a6e2.AbstractC4283x51b62b3f mo35601xd4677478(int i17) {
        super.mo35601xd4677478(i17);
        return this;
    }
}
