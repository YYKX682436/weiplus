package com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p509x4640c49f;

/* renamed from: com.tencent.map.sdk.utilities.visualization.scatterplot.BitmapScatterPlotOverlayProvider */
/* loaded from: classes13.dex */
public final class C4300xcbfccc51 extends com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p509x4640c49f.AbstractC4304xe42503c2 {

    /* renamed from: DEFAULT_BITMAP_ICONS */
    private static final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e[] f16854x22f80948 = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e[0];

    /* renamed from: DEFAULT_WIDTH */
    private int f16856x3f041e08 = 30;

    /* renamed from: DEFAULT_HEIGHT */
    private int f16855x87b0a905 = 30;

    /* renamed from: mWidth */
    private int f16859xbefb7959 = 30;

    /* renamed from: mHeight */
    private int f16858x6a4b7f4 = 30;

    /* renamed from: mBitmaps */
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e[] f16857x97fde7f7 = f16854x22f80948;

    public C4300xcbfccc51() {
        m35779x368f3a(com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p509x4640c49f.AbstractC4304xe42503c2.ScatterPlotType.Bitmap);
    }

    /* renamed from: bitmaps */
    public final com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p509x4640c49f.C4300xcbfccc51 m35760xf9e53524(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e[] c26010x4177761eArr) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e[] c26010x4177761eArr2 = this.f16857x97fde7f7;
        if (c26010x4177761eArr2.length <= 0 && c26010x4177761eArr2.length == 0 && c26010x4177761eArr != null) {
            this.f16857x97fde7f7 = c26010x4177761eArr;
        }
        return this;
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p509x4640c49f.AbstractC4304xe42503c2
    /* renamed from: data */
    public final /* bridge */ /* synthetic */ com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p509x4640c49f.AbstractC4304xe42503c2 mo35761x2eefaa(java.util.List list) {
        return mo35761x2eefaa((java.util.List<com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4289xaab98d44>) list);
    }

    /* renamed from: getBitmaps */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e[] m35763x37b270ee() {
        return this.f16857x97fde7f7;
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

    /* renamed from: getHeight */
    public final int m35765x1c4fb41d() {
        return this.f16858x6a4b7f4;
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

    /* renamed from: getWidth */
    public final int m35766x755bd410() {
        return this.f16859xbefb7959;
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p509x4640c49f.AbstractC4304xe42503c2, com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: getZIndex */
    public final int mo35591x397e976e() {
        return super.mo35591x397e976e();
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

    /* renamed from: scale */
    public final com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p509x4640c49f.C4300xcbfccc51 m35768x683094a(int i17, int i18) {
        if (i17 > 0 && i18 > 0) {
            this.f16859xbefb7959 = i17;
            this.f16858x6a4b7f4 = i18;
        }
        return this;
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p509x4640c49f.AbstractC4304xe42503c2
    /* renamed from: data */
    public final com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p509x4640c49f.C4300xcbfccc51 mo35761x2eefaa(java.util.List<com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p506x782e7294.C4289xaab98d44> list) {
        super.mo35761x2eefaa(list);
        return this;
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p509x4640c49f.AbstractC4304xe42503c2
    /* renamed from: enable3D */
    public final com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p509x4640c49f.C4300xcbfccc51 mo35762x61e1d734(boolean z17) {
        super.mo35762x61e1d734(z17);
        return this;
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p509x4640c49f.AbstractC4304xe42503c2
    /* renamed from: zoomRange */
    public final com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p509x4640c49f.C4300xcbfccc51 mo35769x61c4912a(int i17, int i18) {
        super.mo35769x61c4912a(i17, i18);
        return this;
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p509x4640c49f.AbstractC4304xe42503c2, com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: displayLevel */
    public final com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p509x4640c49f.C4300xcbfccc51 mo35583x5f34bbe2(int i17) {
        super.mo35583x5f34bbe2(i17);
        return this;
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p509x4640c49f.AbstractC4304xe42503c2, com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: opacity */
    public final com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p509x4640c49f.C4300xcbfccc51 mo35596xb477f80b(float f17) {
        super.mo35596xb477f80b(f17);
        return this;
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p509x4640c49f.AbstractC4304xe42503c2, com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: visibility */
    public final com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p509x4640c49f.C4300xcbfccc51 mo35600x73b66312(boolean z17) {
        super.mo35600x73b66312(z17);
        return this;
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p509x4640c49f.AbstractC4304xe42503c2, com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: zIndex */
    public final com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p509x4640c49f.C4300xcbfccc51 mo35601xd4677478(int i17) {
        super.mo35601xd4677478(i17);
        return this;
    }
}
