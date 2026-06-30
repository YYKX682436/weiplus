package com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29;

/* renamed from: com.tencent.tencentmap.mapsdk.maps.model.VectorHeatOverlayOptions */
/* loaded from: classes13.dex */
public final class C26097x63c1ed01 extends com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30 {

    /* renamed from: mColors */
    private int[] f49822xfeaae43d;

    /* renamed from: mGap */
    private float f49824x32a329;

    /* renamed from: mNodes */
    private com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4292x85cd0d1d[] f49831xbe7f5e44;

    /* renamed from: mStartPoints */
    private double[] f49835x3568cd38;

    /* renamed from: mType */
    private int f49836x6280547 = 0;

    /* renamed from: mSize */
    private float f49834x627560e = 2000.0f;

    /* renamed from: mOpacity */
    private float f49832x5290aade = 1.0f;

    /* renamed from: mVisibility */
    private boolean f49837x4fe85b5f = true;

    /* renamed from: mMinZoom */
    private int f49830xdd857818 = 3;

    /* renamed from: mMaxZoom */
    private int f49827xd06b9e2a = 22;

    /* renamed from: mMinIntensity */
    private double f49829x7cc9a70e = 0.0d;

    /* renamed from: mMaxIntensity */
    private double f49826x60827c3c = 2000.0d;

    /* renamed from: mMaxHeight */
    private double f49825x44b5d1be = 2000.0d;

    /* renamed from: mMinHeight */
    private double f49828x72c0e82c = 0.0d;

    /* renamed from: mDraw3D */
    private boolean f49823x851982 = false;

    /* renamed from: mRangeFlag */
    private boolean f49833x4de4105c = false;

    /* renamed from: mAnimateDuration */
    private int f49821x2b8ca368 = 5000;

    /* renamed from: mAnimate */
    private boolean f49820x6b04e5b4 = false;

    /* renamed from: com.tencent.tencentmap.mapsdk.maps.model.VectorHeatOverlayOptions$VectorHeatOverlayType */
    /* loaded from: classes6.dex */
    public enum VectorHeatOverlayType {
        HoneyComb,
        Square
    }

    /* renamed from: animate */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26097x63c1ed01 m100033xccec32e1(boolean z17) {
        this.f49820x6b04e5b4 = z17;
        return this;
    }

    /* renamed from: colors */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26097x63c1ed01 m100034xaf3ebd70(int[] iArr) {
        this.f49822xfeaae43d = iArr;
        return this;
    }

    /* renamed from: draw3D */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26097x63c1ed01 m100035xb118f2b5(boolean z17) {
        this.f49823x851982 = z17;
        return this;
    }

    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26097x63c1ed01 gap(float f17) {
        this.f49824x32a329 = f17;
        return this;
    }

    /* renamed from: getAnimateTime */
    public final int m100036x1de3e818() {
        return this.f49821x2b8ca368;
    }

    /* renamed from: getColors */
    public final int[] m100037x1455e066() {
        return this.f49822xfeaae43d;
    }

    /* renamed from: getGap */
    public final float m100038xb5883fa0() {
        return this.f49824x32a329;
    }

    /* renamed from: getMaxHeight */
    public final double m100039xc96bf8f5() {
        return this.f49825x44b5d1be;
    }

    /* renamed from: getMaxIntensity */
    public final double m100040x29dff5a5() {
        return this.f49826x60827c3c;
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: getMaxZoom */
    public final int mo35586x70202721() {
        return this.f49827xd06b9e2a;
    }

    /* renamed from: getMinHeight */
    public final double m100041xf7770f63() {
        return this.f49828x72c0e82c;
    }

    /* renamed from: getMinIntensity */
    public final double m100042x46272077() {
        return this.f49829x7cc9a70e;
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: getMinZoom */
    public final int mo35587x7d3a010f() {
        return this.f49830xdd857818;
    }

    /* renamed from: getNodes */
    public final com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4292x85cd0d1d[] m100043x74dfb8fb() {
        return this.f49831xbe7f5e44;
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: getOpacity */
    public final float mo35589xf24533d5() {
        return this.f49832x5290aade;
    }

    /* renamed from: getRangeFlag */
    public final boolean m100044xd29a3793() {
        return this.f49833x4de4105c;
    }

    /* renamed from: getSize */
    public final float m100045xfb854877() {
        return this.f49834x627560e;
    }

    /* renamed from: getStartPoints */
    public final double[] m100046x653202af() {
        return this.f49835x3568cd38;
    }

    /* renamed from: getType */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26097x63c1ed01.VectorHeatOverlayType m100047xfb85f7b0() {
        return com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26097x63c1ed01.VectorHeatOverlayType.m100059xcee59d22()[this.f49836x6280547];
    }

    /* renamed from: heightRange */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26097x63c1ed01 m100048xc1b85856(double d17, double d18) {
        if (d17 > d18 || d17 < 0.0d) {
            this.f49828x72c0e82c = 0.0d;
            this.f49825x44b5d1be = 2000.0d;
        } else {
            this.f49825x44b5d1be = d18;
            this.f49828x72c0e82c = d17;
        }
        return this;
    }

    /* renamed from: isAnimate */
    public final boolean m100049xaa5d7a57() {
        return this.f49820x6b04e5b4;
    }

    /* renamed from: isDraw3D */
    public final boolean m100050xd945e47f() {
        return this.f49823x851982;
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: isVisibility */
    public final boolean mo35593xf5215fdc() {
        return this.f49837x4fe85b5f;
    }

    /* renamed from: nodes */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26097x63c1ed01 m100051x64212b1(com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4292x85cd0d1d[] c4292x85cd0d1dArr) {
        this.f49831xbe7f5e44 = c4292x85cd0d1dArr;
        return this;
    }

    /* renamed from: setAnimateTime */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26097x63c1ed01 m100052xb4495b8c(int i17) {
        this.f49821x2b8ca368 = i17;
        return this;
    }

    /* renamed from: showRange */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26097x63c1ed01 m100053x8dcdc440(double d17, double d18) {
        if (d17 > d18 || d17 < 0.0d) {
            this.f49829x7cc9a70e = 0.0d;
            this.f49826x60827c3c = 2000.0d;
            this.f49833x4de4105c = false;
        } else {
            this.f49826x60827c3c = d18;
            this.f49829x7cc9a70e = d17;
            this.f49833x4de4105c = true;
        }
        return this;
    }

    /* renamed from: size */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26097x63c1ed01 m100054x35e001(float f17) {
        this.f49834x627560e = f17;
        return this;
    }

    /* renamed from: startPoints */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26097x63c1ed01 m100055x8b5bbbe5(double[] dArr) {
        this.f49835x3568cd38 = dArr;
        return this;
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30
    /* renamed from: toString */
    public final java.lang.String mo35599x9616526c() {
        return "VectorHeatOverlayOptions{mOpacity=" + this.f49832x5290aade + ", mVisibility=" + this.f49837x4fe85b5f + ", mMinZoom=" + this.f49830xdd857818 + ", mMaxZoom=" + this.f49827xd06b9e2a + ", mDisplayLevel=" + this.f16736xf6c9d4ef + ", mZIndex=" + this.f16741x23d39b45 + ", mClickEnabled=" + this.f16735x58bfada6 + ", onVectorOverlayLoadlistener=" + this.f16743xf190a0a8 + ", onVectorOverlayClickListener=" + this.f16742xf052b0e + ", mType=" + this.f49836x6280547 + ", mNodes=" + java.util.Arrays.toString(this.f49831xbe7f5e44) + ", mSize=" + this.f49834x627560e + ", mGap=" + this.f49824x32a329 + ", mOpacity=" + this.f49832x5290aade + ", mVisibility=" + this.f49837x4fe85b5f + ", mMinZoom=" + this.f49830xdd857818 + ", mMaxZoom=" + this.f49827xd06b9e2a + ", mColors=" + java.util.Arrays.toString(this.f49822xfeaae43d) + ", mStartPoints=" + java.util.Arrays.toString(this.f49835x3568cd38) + ", mMinIntensity=" + this.f49829x7cc9a70e + ", mMaxIntensity=" + this.f49826x60827c3c + ", mMaxHeight=" + this.f49825x44b5d1be + ", mMinHeight=" + this.f49828x72c0e82c + ", mDraw3D=" + this.f49823x851982 + ", mRangeFlag=" + this.f49833x4de4105c + ", mAnimateDuration=" + this.f49821x2b8ca368 + ", mAnimate=" + this.f49820x6b04e5b4 + '}';
    }

    /* renamed from: type */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26097x63c1ed01 m100056x368f3a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26097x63c1ed01.VectorHeatOverlayType vectorHeatOverlayType) {
        this.f49836x6280547 = vectorHeatOverlayType.ordinal();
        return this;
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: maxZoom */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26097x63c1ed01 mo35594x3252eb57(int i17) {
        this.f49827xd06b9e2a = i17;
        return this;
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: minZoom */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26097x63c1ed01 mo35595x3f6cc545(int i17) {
        this.f49830xdd857818 = i17;
        return this;
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: opacity */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26097x63c1ed01 mo35596xb477f80b(float f17) {
        this.f49832x5290aade = f17;
        return this;
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: visibility */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26097x63c1ed01 mo35600x73b66312(boolean z17) {
        this.f49837x4fe85b5f = z17;
        return this;
    }
}
