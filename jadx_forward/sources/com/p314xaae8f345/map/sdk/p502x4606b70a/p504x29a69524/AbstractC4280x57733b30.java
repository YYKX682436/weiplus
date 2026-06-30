package com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524;

/* renamed from: com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider */
/* loaded from: classes13.dex */
public abstract class AbstractC4280x57733b30 implements com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e {

    /* renamed from: DEFAULT_MAX_OPACITY */
    private static final float f16729x257566d2 = 1.0f;

    /* renamed from: DEFAULT_MAX_ZOOM */
    private static final int f16730xacea7a4c = 22;

    /* renamed from: DEFAULT_MIN_OPACITY */
    private static final float f16731xfd1499c0 = 0.0f;

    /* renamed from: DEFAULT_MIN_ZOOM */
    private static final int f16732x430bde1e = 3;

    /* renamed from: DEFAULT_OPACITY */
    private static final float f16733xf302dbcd = 1.0f;

    /* renamed from: DEFAULT_ZINDEX */
    private static final int f16734xa6a27c76 = 0;

    /* renamed from: mOpacity */
    protected float f16739x5290aade = 1.0f;

    /* renamed from: mVisibility */
    protected boolean f16740x4fe85b5f = true;

    /* renamed from: mMinZoom */
    protected int f16738xdd857818 = 4;

    /* renamed from: mMaxZoom */
    protected int f16737xd06b9e2a = 22;

    /* renamed from: mDisplayLevel */
    protected int f16736xf6c9d4ef = 1;

    /* renamed from: mZIndex */
    protected int f16741x23d39b45 = 0;

    /* renamed from: mClickEnabled */
    protected boolean f16735x58bfada6 = false;

    /* renamed from: onVectorOverlayLoadlistener */
    protected com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26098x1cf1c96d.OnVectorOverlayLoadListener f16743xf190a0a8 = null;

    /* renamed from: onVectorOverlayClickListener */
    protected com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26098x1cf1c96d.OnVectorOverlayClickListener f16742xf052b0e = null;

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: enableClick */
    public void mo35584xa947a9c5(boolean z17) {
        this.f16735x58bfada6 = z17;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: getDisplayLevel */
    public int mo35585xc0274e58() {
        return this.f16736xf6c9d4ef;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: getMaxZoom */
    public int mo35586x70202721() {
        return this.f16737xd06b9e2a;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: getMinZoom */
    public int mo35587x7d3a010f() {
        return this.f16738xdd857818;
    }

    /* renamed from: getOnVectorOverlayClickListener */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26098x1cf1c96d.OnVectorOverlayClickListener m35588x5ae01184() {
        return this.f16742xf052b0e;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: getOpacity */
    public float mo35589xf24533d5() {
        return this.f16739x5290aade;
    }

    /* renamed from: getVectorOverlayLoadedListener */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26098x1cf1c96d.OnVectorOverlayLoadListener m35590x88d92190() {
        return this.f16743xf190a0a8;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: getZIndex */
    public int mo35591x397e976e() {
        return this.f16741x23d39b45;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: isClickEnabled */
    public boolean mo35592x93c986e3() {
        return false;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: isVisibility */
    public boolean mo35593xf5215fdc() {
        return this.f16740x4fe85b5f;
    }

    /* renamed from: setVectorOverlayClickListener */
    public com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30 m35597x8da4ebd1(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26098x1cf1c96d.OnVectorOverlayClickListener onVectorOverlayClickListener) {
        this.f16742xf052b0e = onVectorOverlayClickListener;
        return this;
    }

    /* renamed from: toString */
    public java.lang.String mo35599x9616526c() {
        return "BaseOverlayProvider{mOpacity=" + this.f16739x5290aade + ", mVisibility=" + this.f16740x4fe85b5f + ", mMinZoom=" + this.f16738xdd857818 + ", mMaxZoom=" + this.f16737xd06b9e2a + ", mDisplayLevel=" + this.f16736xf6c9d4ef + ", mZIndex=" + this.f16741x23d39b45 + '}';
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: displayLevel */
    public com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30 mo35583x5f34bbe2(int i17) {
        if (i17 == 1 || i17 == 2) {
            this.f16736xf6c9d4ef = i17;
        }
        return this;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: maxZoom */
    public com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30 mo35594x3252eb57(int i17) {
        if (i17 <= 22) {
            this.f16737xd06b9e2a = i17;
        } else {
            this.f16737xd06b9e2a = 22;
        }
        return this;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: minZoom */
    public com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30 mo35595x3f6cc545(int i17) {
        if (i17 >= 3) {
            this.f16738xdd857818 = i17;
        } else {
            this.f16738xdd857818 = 3;
        }
        return this;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: opacity */
    public com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30 mo35596xb477f80b(float f17) {
        if (f17 > 1.0f) {
            this.f16739x5290aade = 1.0f;
        } else if (f17 < 0.0f) {
            this.f16739x5290aade = 0.0f;
        } else {
            this.f16739x5290aade = f17;
        }
        return this;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: setVectorOverlayLoadedListener */
    public com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30 mo35598x90f12d04(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26098x1cf1c96d.OnVectorOverlayLoadListener onVectorOverlayLoadListener) {
        this.f16743xf190a0a8 = onVectorOverlayLoadListener;
        return this;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: visibility */
    public com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30 mo35600x73b66312(boolean z17) {
        this.f16740x4fe85b5f = z17;
        return this;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: zIndex */
    public com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30 mo35601xd4677478(int i17) {
        this.f16741x23d39b45 = i17;
        return this;
    }
}
