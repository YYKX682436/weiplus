package com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p509x4640c49f;

/* renamed from: com.tencent.map.sdk.utilities.visualization.scatterplot.ScatterPlotOverlayProvider */
/* loaded from: classes13.dex */
public abstract class AbstractC4304xe42503c2 extends com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30 {

    /* renamed from: dataList */
    private java.util.List<com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4289xaab98d44> f16865x6a9f2f68 = new java.util.ArrayList();

    /* renamed from: mType */
    private int f16867x6280547 = 0;

    /* renamed from: mDraw3D */
    private boolean f16866x851982 = false;

    /* renamed from: com.tencent.map.sdk.utilities.visualization.scatterplot.ScatterPlotOverlayProvider$ScatterPlotType */
    /* loaded from: classes13.dex */
    public enum ScatterPlotType {
        Dot,
        Bitmap
    }

    /* renamed from: data */
    public com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p509x4640c49f.AbstractC4304xe42503c2 mo35761x2eefaa(java.util.List<com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4289xaab98d44> list) {
        if (list != null) {
            this.f16865x6a9f2f68 = list;
        }
        return this;
    }

    /* renamed from: enable3D */
    public com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p509x4640c49f.AbstractC4304xe42503c2 mo35762x61e1d734(boolean z17) {
        this.f16866x851982 = z17;
        return this;
    }

    /* renamed from: getData */
    public java.util.List<com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4289xaab98d44> mo35764xfb7e5820() {
        return this.f16865x6a9f2f68;
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: getDisplayLevel */
    public int mo35585xc0274e58() {
        return super.mo35585xc0274e58();
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: getMaxZoom */
    public int mo35586x70202721() {
        return super.mo35586x70202721();
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

    /* renamed from: getType */
    public int m35778xfb85f7b0() {
        return com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p509x4640c49f.AbstractC4304xe42503c2.ScatterPlotType.m35782xcee59d22()[this.f16867x6280547].ordinal();
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: getZIndex */
    public int mo35591x397e976e() {
        return super.mo35591x397e976e();
    }

    /* renamed from: isEnable3D */
    public boolean mo35767x32997e7e() {
        return this.f16866x851982;
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: isVisibility */
    public boolean mo35593xf5215fdc() {
        return super.mo35593xf5215fdc();
    }

    /* renamed from: type */
    public com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p509x4640c49f.AbstractC4304xe42503c2 m35779x368f3a(com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p509x4640c49f.AbstractC4304xe42503c2.ScatterPlotType scatterPlotType) {
        this.f16867x6280547 = scatterPlotType.ordinal();
        return this;
    }

    /* renamed from: zoomRange */
    public com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p509x4640c49f.AbstractC4304xe42503c2 mo35769x61c4912a(int i17, int i18) {
        if (i17 <= i18) {
            super.mo35595x3f6cc545(i17);
            super.mo35594x3252eb57(i18);
        }
        return this;
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: displayLevel */
    public com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p509x4640c49f.AbstractC4304xe42503c2 mo35583x5f34bbe2(int i17) {
        super.mo35583x5f34bbe2(i17);
        return this;
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: opacity */
    public com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p509x4640c49f.AbstractC4304xe42503c2 mo35596xb477f80b(float f17) {
        super.mo35596xb477f80b(f17);
        return this;
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: visibility */
    public com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p509x4640c49f.AbstractC4304xe42503c2 mo35600x73b66312(boolean z17) {
        super.mo35600x73b66312(z17);
        return this;
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: zIndex */
    public com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p509x4640c49f.AbstractC4304xe42503c2 mo35601xd4677478(int i17) {
        super.mo35601xd4677478(i17);
        return this;
    }
}
