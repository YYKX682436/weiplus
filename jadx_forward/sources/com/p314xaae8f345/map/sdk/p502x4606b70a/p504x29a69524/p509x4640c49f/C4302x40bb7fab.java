package com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p509x4640c49f;

/* renamed from: com.tencent.map.sdk.utilities.visualization.scatterplot.DotScatterPlotOverlayProvider */
/* loaded from: classes13.dex */
public final class C4302x40bb7fab extends com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p509x4640c49f.AbstractC4304xe42503c2 {

    /* renamed from: DEFAULT_SCATTER_COLORS */
    private static final int[] f16860x35b0340f = {android.graphics.Color.argb(255, 255, 202, 31), android.graphics.Color.argb(229, 204, 24, 93), android.graphics.Color.argb(127, 148, 28, 230)};

    /* renamed from: DEFAULT_RADIUS */
    private final int f16861x98868470 = 6;

    /* renamed from: mRadius */
    private int f16864x177a935f = 6;

    /* renamed from: mColors */
    private int[] f16863xfeaae43d = f16860x35b0340f;

    /* renamed from: mAnimate */
    private boolean f16862x6b04e5b4 = false;

    public C4302x40bb7fab() {
        m35779x368f3a(com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p509x4640c49f.AbstractC4304xe42503c2.ScatterPlotType.Dot);
    }

    /* renamed from: animate */
    public final com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p509x4640c49f.C4302x40bb7fab m35771xccec32e1(boolean z17) {
        this.f16862x6b04e5b4 = z17;
        return this;
    }

    /* renamed from: colors */
    public final com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p509x4640c49f.C4302x40bb7fab m35772xaf3ebd70(int[] iArr) {
        if (iArr != null) {
            this.f16863xfeaae43d = iArr;
        }
        return this;
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p509x4640c49f.AbstractC4304xe42503c2
    /* renamed from: data */
    public final /* bridge */ /* synthetic */ com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p509x4640c49f.AbstractC4304xe42503c2 mo35761x2eefaa(java.util.List list) {
        return mo35761x2eefaa((java.util.List<com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4289xaab98d44>) list);
    }

    /* renamed from: getColors */
    public final int[] m35773x1455e066() {
        return this.f16863xfeaae43d;
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p509x4640c49f.AbstractC4304xe42503c2
    /* renamed from: getData */
    public final java.util.List<com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4289xaab98d44> mo35764xfb7e5820() {
        return super.mo35764xfb7e5820();
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p509x4640c49f.AbstractC4304xe42503c2, com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: getDisplayLevel */
    public final int mo35585xc0274e58() {
        return super.mo35585xc0274e58();
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p509x4640c49f.AbstractC4304xe42503c2, com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: getMaxZoom */
    public final int mo35586x70202721() {
        return super.mo35586x70202721();
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p509x4640c49f.AbstractC4304xe42503c2, com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: getMinZoom */
    public final int mo35587x7d3a010f() {
        return super.mo35587x7d3a010f();
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p509x4640c49f.AbstractC4304xe42503c2, com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: getOpacity */
    public final float mo35589xf24533d5() {
        return super.mo35589xf24533d5();
    }

    /* renamed from: getRadius */
    public final int m35774x2d258f88() {
        return this.f16864x177a935f;
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p509x4640c49f.AbstractC4304xe42503c2, com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: getZIndex */
    public final int mo35591x397e976e() {
        return super.mo35591x397e976e();
    }

    /* renamed from: isAnimate */
    public final boolean m35775xaa5d7a57() {
        return this.f16862x6b04e5b4;
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p509x4640c49f.AbstractC4304xe42503c2
    /* renamed from: isEnable3D */
    public final boolean mo35767x32997e7e() {
        return super.mo35767x32997e7e();
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p509x4640c49f.AbstractC4304xe42503c2, com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: isVisibility */
    public final boolean mo35593xf5215fdc() {
        return super.mo35593xf5215fdc();
    }

    /* renamed from: radius */
    public final com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p509x4640c49f.C4302x40bb7fab m35776xc80e6c92(int i17) {
        if (i17 > 0) {
            this.f16864x177a935f = i17;
        }
        return this;
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p509x4640c49f.AbstractC4304xe42503c2
    /* renamed from: data */
    public final com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p509x4640c49f.C4302x40bb7fab mo35761x2eefaa(java.util.List<com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4289xaab98d44> list) {
        super.mo35761x2eefaa(list);
        return this;
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p509x4640c49f.AbstractC4304xe42503c2
    /* renamed from: enable3D */
    public final com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p509x4640c49f.C4302x40bb7fab mo35762x61e1d734(boolean z17) {
        super.mo35762x61e1d734(z17);
        return this;
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p509x4640c49f.AbstractC4304xe42503c2
    /* renamed from: zoomRange */
    public final com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p509x4640c49f.C4302x40bb7fab mo35769x61c4912a(int i17, int i18) {
        super.mo35769x61c4912a(i17, i18);
        return this;
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p509x4640c49f.AbstractC4304xe42503c2, com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: displayLevel */
    public final com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p509x4640c49f.C4302x40bb7fab mo35583x5f34bbe2(int i17) {
        super.mo35583x5f34bbe2(i17);
        return this;
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p509x4640c49f.AbstractC4304xe42503c2, com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: opacity */
    public final com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p509x4640c49f.C4302x40bb7fab mo35596xb477f80b(float f17) {
        super.mo35596xb477f80b(f17);
        return this;
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p509x4640c49f.AbstractC4304xe42503c2, com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: visibility */
    public final com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p509x4640c49f.C4302x40bb7fab mo35600x73b66312(boolean z17) {
        super.mo35600x73b66312(z17);
        return this;
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p509x4640c49f.AbstractC4304xe42503c2, com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: zIndex */
    public final com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p509x4640c49f.C4302x40bb7fab mo35601xd4677478(int i17) {
        super.mo35601xd4677478(i17);
        return this;
    }
}
