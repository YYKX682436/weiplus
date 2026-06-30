package com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p507x7213564;

/* renamed from: com.tencent.map.sdk.utilities.visualization.glmodel.GLModelOverlayProvider */
/* loaded from: classes13.dex */
public final class C4294x45fc1c7d extends com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30 {

    /* renamed from: mLatLngBounds */
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b f16798x591cd068;

    /* renamed from: mModelFilePath */
    private java.lang.String f16799x2e0dde9d;

    /* renamed from: mPixelHeight */
    private int f16800x4de3e4a0;

    /* renamed from: mPixelWidth */
    private int f16801xda0e072d;

    /* renamed from: mPosition */
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 f16802x519040b6;

    /* renamed from: mRotationX */
    private float f16803x30402aad;

    /* renamed from: mRotationY */
    private float f16804x30402aae;

    /* renamed from: mRotationZ */
    private float f16805x30402aaf;

    /* renamed from: transAnimatorEndListener */
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26027x51ae46b9.IAnimatorEndListener f16808xf306180;

    /* renamed from: mCoordType */
    private com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p507x7213564.C4294x45fc1c7d.CoordType f16796x93d605e2 = com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p507x7213564.C4294x45fc1c7d.CoordType.GeoGraphicType;

    /* renamed from: mScale */
    private double f16806xbec054dd = 1.0d;

    /* renamed from: mAnimated */
    private com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p507x7213564.C4294x45fc1c7d.AnimationType f16794xf597d130 = com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p507x7213564.C4294x45fc1c7d.AnimationType.None;

    /* renamed from: mExposure */
    private float f16797xb2312494 = 1.0f;

    /* renamed from: mBuildingHidden */
    private boolean f16795x20cccf4b = true;

    /* renamed from: mUnlit */
    private boolean f16807xbee1acf1 = false;

    /* renamed from: com.tencent.map.sdk.utilities.visualization.glmodel.GLModelOverlayProvider$AnimationType */
    /* loaded from: classes6.dex */
    public enum AnimationType {
        None,
        FlattenRise
    }

    /* renamed from: com.tencent.map.sdk.utilities.visualization.glmodel.GLModelOverlayProvider$CoordType */
    /* loaded from: classes6.dex */
    public enum CoordType {
        PixelType,
        GeoGraphicType
    }

    public C4294x45fc1c7d(java.lang.String str, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26) {
        if (m35677x33fae281(str)) {
            this.f16799x2e0dde9d = str;
        } else {
            this.f16799x2e0dde9d = "";
        }
        this.f16802x519040b6 = c26041x873d1d26;
    }

    /* renamed from: isModelFileValid */
    private boolean m35677x33fae281(java.lang.String str) {
        return (str.endsWith(".gltf") || str.endsWith(".GLTF")) && new java.io.File(str).exists();
    }

    /* renamed from: animateType */
    public final com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p507x7213564.C4294x45fc1c7d m35678x440dddbb(com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p507x7213564.C4294x45fc1c7d.AnimationType animationType) {
        this.f16794xf597d130 = animationType;
        return this;
    }

    /* renamed from: coordType */
    public final com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p507x7213564.C4294x45fc1c7d m35679x191ebbcf(com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p507x7213564.C4294x45fc1c7d.CoordType coordType) {
        this.f16796x93d605e2 = coordType;
        return this;
    }

    /* renamed from: getAnimationType */
    public final com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p507x7213564.C4294x45fc1c7d.AnimationType m35680x36717928() {
        return this.f16794xf597d130;
    }

    /* renamed from: getCoordType */
    public final com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p507x7213564.C4294x45fc1c7d.CoordType m35681x188c2d19() {
        return this.f16796x93d605e2;
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: getDisplayLevel */
    public final int mo35585xc0274e58() {
        return super.mo35585xc0274e58();
    }

    /* renamed from: getExposure */
    public final float m35682x90dba7d() {
        return this.f16797xb2312494;
    }

    /* renamed from: getLatLngBounds */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b m35683x227a49d1() {
        return this.f16798x591cd068;
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

    /* renamed from: getModelFilePath */
    public final java.lang.String m35684x905f9254() {
        return this.f16799x2e0dde9d;
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: getOpacity */
    public final float mo35589xf24533d5() {
        return super.mo35589xf24533d5();
    }

    /* renamed from: getPixelHeight */
    public final int m35685x7dad1a17() {
        return this.f16800x4de3e4a0;
    }

    /* renamed from: getPixelWidth */
    public final int m35686xec1cc6d6() {
        return this.f16801xda0e072d;
    }

    /* renamed from: getPosition */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 m35687xa86cd69f() {
        return this.f16802x519040b6;
    }

    /* renamed from: getRotationX */
    public final float m35688xb4f651e4() {
        return this.f16803x30402aad;
    }

    /* renamed from: getRotationY */
    public final float m35689xb4f651e5() {
        return this.f16804x30402aae;
    }

    /* renamed from: getRotationZ */
    public final float m35690xb4f651e6() {
        return this.f16805x30402aaf;
    }

    /* renamed from: getScale */
    public final double m35691x7520af94() {
        return this.f16806xbec054dd;
    }

    /* renamed from: getTransAnimatorEndListener */
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26027x51ae46b9.IAnimatorEndListener m35692x3f3cf2f6() {
        return this.f16808xf306180;
    }

    /* renamed from: getUnlit */
    public final boolean m35693x754207a8() {
        return this.f16807xbee1acf1;
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: getZIndex */
    public final int mo35591x397e976e() {
        return super.mo35591x397e976e();
    }

    /* renamed from: isBuildingHidden */
    public final boolean m35694xc0c54d48() {
        return this.f16795x20cccf4b;
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: isClickEnabled */
    public final boolean mo35592x93c986e3() {
        return this.f16735x58bfada6;
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: isVisibility */
    public final boolean mo35593xf5215fdc() {
        return super.mo35593xf5215fdc();
    }

    /* renamed from: latLngBounds */
    public final com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p507x7213564.C4294x45fc1c7d m35695xc187b75b(java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26> list) {
        if (list == null || list.size() < 2) {
            this.f16798x591cd068 = null;
        } else {
            this.f16798x591cd068 = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26042xcb530b7b.Builder().m99565x73c954a8(list).m99563x59bc66e();
        }
        return this;
    }

    /* renamed from: modelFilePath */
    public final com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p507x7213564.C4294x45fc1c7d m35696xd2ffd60a(java.lang.String str) {
        if (m35677x33fae281(str)) {
            this.f16799x2e0dde9d = str;
        }
        return this;
    }

    /* renamed from: pixelBounds */
    public final com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p507x7213564.C4294x45fc1c7d m35697x9a2c38db(int i17, int i18) {
        this.f16801xda0e072d = i17;
        this.f16800x4de3e4a0 = i18;
        return this;
    }

    /* renamed from: position */
    public final com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p507x7213564.C4294x45fc1c7d m35698x2c929929(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26) {
        this.f16802x519040b6 = c26041x873d1d26;
        return this;
    }

    /* renamed from: rotationX */
    public final com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p507x7213564.C4294x45fc1c7d m35699xb588e09a(float f17) {
        this.f16803x30402aad = f17;
        return this;
    }

    /* renamed from: rotationY */
    public final com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p507x7213564.C4294x45fc1c7d m35700xb588e09b(float f17) {
        this.f16804x30402aae = f17;
        return this;
    }

    /* renamed from: rotationZ */
    public final com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p507x7213564.C4294x45fc1c7d m35701xb588e09c(float f17) {
        this.f16805x30402aaf = f17;
        return this;
    }

    /* renamed from: scale */
    public final com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p507x7213564.C4294x45fc1c7d m35702x683094a(double d17) {
        if (d17 > 0.0d) {
            this.f16806xbec054dd = d17;
        }
        return this;
    }

    /* renamed from: setBuildingHidden */
    public final com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p507x7213564.C4294x45fc1c7d m35703xd0a7fa80(boolean z17) {
        this.f16795x20cccf4b = z17;
        return this;
    }

    /* renamed from: setClickEnable */
    public final com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p507x7213564.C4294x45fc1c7d m35704xa8034b69(boolean z17) {
        super.mo35584xa947a9c5(z17);
        return this;
    }

    /* renamed from: setExposure */
    public final com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p507x7213564.C4294x45fc1c7d m35705x3c61b89(float f17) {
        this.f16797xb2312494 = f17;
        return this;
    }

    /* renamed from: setTransAnimatorEndListener */
    public final void m35706xef09bc02(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26027x51ae46b9.IAnimatorEndListener iAnimatorEndListener) {
        this.f16808xf306180 = iAnimatorEndListener;
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30
    /* renamed from: toString */
    public final java.lang.String mo35599x9616526c() {
        return "GLModelOverlayProvider{mOpacity=" + this.f16739x5290aade + ", mVisibility=" + this.f16740x4fe85b5f + ", mMinZoom=" + this.f16738xdd857818 + ", mMaxZoom=" + this.f16737xd06b9e2a + ", mDisplayLevel=" + this.f16736xf6c9d4ef + ", mZIndex=" + this.f16741x23d39b45 + ", mCoordType=" + this.f16796x93d605e2 + ", mModelFilePath='" + this.f16799x2e0dde9d + "', mPosition=" + this.f16802x519040b6 + ", mScale=" + this.f16806xbec054dd + ", mRotationX=" + this.f16803x30402aad + ", mRotationY=" + this.f16804x30402aae + ", mRotationZ=" + this.f16805x30402aaf + ", mLatLngBounds=" + this.f16798x591cd068 + ", mAnimated=" + this.f16794xf597d130 + ", mExposure=" + this.f16797xb2312494 + ", mBuildingHidden=" + this.f16795x20cccf4b + ", mClickEnabled=" + this.f16735x58bfada6 + '}';
    }

    /* renamed from: unlit */
    public final com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p507x7213564.C4294x45fc1c7d m35707x6a4615e(boolean z17) {
        this.f16807xbee1acf1 = z17;
        return this;
    }

    /* renamed from: zoomRange */
    public final com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p507x7213564.C4294x45fc1c7d m35708x61c4912a(int i17, int i18) {
        if (i17 <= i18) {
            super.mo35595x3f6cc545(i17);
            super.mo35594x3252eb57(i18);
        }
        return this;
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: displayLevel */
    public final com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p507x7213564.C4294x45fc1c7d mo35583x5f34bbe2(int i17) {
        super.mo35583x5f34bbe2(i17);
        return this;
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: opacity */
    public final com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p507x7213564.C4294x45fc1c7d mo35596xb477f80b(float f17) {
        super.mo35596xb477f80b(f17);
        return this;
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: visibility */
    public final com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p507x7213564.C4294x45fc1c7d mo35600x73b66312(boolean z17) {
        super.mo35600x73b66312(z17);
        return this;
    }

    @Override // com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.AbstractC4280x57733b30, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26099x413a767e
    /* renamed from: zIndex */
    public final com.p314xaae8f345.map.sdk.p502x4606b70a.p504x29a69524.p507x7213564.C4294x45fc1c7d mo35601xd4677478(int i17) {
        super.mo35601xd4677478(i17);
        return this;
    }
}
