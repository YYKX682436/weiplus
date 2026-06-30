package com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d;

@com.p314xaae8f345.p373xbe494963.p378x2e06d1.p379xc6ad7b24.InterfaceC3751x20efb56(m29314x6ac9171 = "liteav::video")
/* renamed from: com.tencent.liteav.videobase.frame.FrameMetaData */
/* loaded from: classes14.dex */
public class C3815x7ad56fbc {

    /* renamed from: mEncodeMirror */
    private final com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.C3816xdec8292d f14923x59304682;

    /* renamed from: mEncodeRotation */
    private com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k f14924x15804581;

    /* renamed from: mEncodeSize */
    private final com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421 f14925xbed68f84;

    /* renamed from: mPreprocessorRotation */
    private com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k f14929x544f51fa;

    /* renamed from: mPreprocessorScaleType */
    private com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.GLScaleType f14930x102364a8;

    /* renamed from: mRenderMirror */
    private final com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.C3816xdec8292d f14931xb8f4aa02;

    /* renamed from: mRenderRotation */
    private com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k f14932x95b9c901;

    /* renamed from: mRenderSize */
    private final com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421 f14933x235dd304;

    /* renamed from: mCaptureMirror */
    private final com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.C3816xdec8292d f14921xc5231b38 = new com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.C3816xdec8292d();

    /* renamed from: mIsFrontCamera */
    private boolean f14927x7f752fb7 = false;

    /* renamed from: mCaptureRealFrameSize */
    private final com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421 f14922x2f57dd77 = new com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421();

    /* renamed from: mIsBlackFrame */
    private boolean f14926xb5fd6685 = false;

    /* renamed from: mPreprocessorMirror */
    private final com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.C3816xdec8292d f14928x6b1a1d3b = new com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.C3816xdec8292d();

    public C3815x7ad56fbc() {
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k kVar = com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.NORMAL;
        this.f14929x544f51fa = kVar;
        this.f14930x102364a8 = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.GLScaleType.CENTER_CROP;
        this.f14931xb8f4aa02 = new com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.C3816xdec8292d();
        this.f14932x95b9c901 = kVar;
        this.f14933x235dd304 = new com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421();
        this.f14923x59304682 = new com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.C3816xdec8292d();
        this.f14924x15804581 = kVar;
        this.f14925xbed68f84 = new com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421();
    }

    /* renamed from: getCaptureRealSize */
    public com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421 m31019x33e605ef() {
        return this.f14922x2f57dd77;
    }

    /* renamed from: getEncodeHeight */
    public int m31020x19c8e553() {
        return this.f14925xbed68f84.f14763xb7389127;
    }

    /* renamed from: getEncodeRotation */
    public com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k m31021xfd6508aa() {
        return this.f14924x15804581;
    }

    /* renamed from: getEncodeRotationValue */
    public int m31022x678172e7() {
        return this.f14924x15804581.f14773xbee9dd04;
    }

    /* renamed from: getEncodeSize */
    public com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421 m31023xd0e54f2d() {
        return this.f14925xbed68f84;
    }

    /* renamed from: getEncodeWidth */
    public int m31024x4bfca41a() {
        return this.f14925xbed68f84.f14764x6be2dc6;
    }

    /* renamed from: getPreprocessorRotation */
    public com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k m31025x99355263() {
        return this.f14929x544f51fa;
    }

    /* renamed from: getPreprocessorRotationValue */
    public int m31026x7b2754ce() {
        return this.f14929x544f51fa.f14773xbee9dd04;
    }

    /* renamed from: getPreprocessorScaleType */
    public com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.GLScaleType m31027x67fd715f() {
        return this.f14930x102364a8;
    }

    /* renamed from: getPreprocessorScaleTypeValue */
    public int m31028x88c73352() {
        return this.f14930x102364a8.f14883xbee9dd04;
    }

    /* renamed from: getRenderHeight */
    public int m31029x798d48d3() {
        return this.f14933x235dd304.f14763xb7389127;
    }

    /* renamed from: getRenderRotation */
    public com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k m31030x7d9e8c2a() {
        return this.f14932x95b9c901;
    }

    /* renamed from: getRenderRotationValue */
    public int m31031x882e1f67() {
        return this.f14932x95b9c901.f14773xbee9dd04;
    }

    /* renamed from: getRenderSize */
    public com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421 m31032x356c92ad() {
        return this.f14933x235dd304;
    }

    /* renamed from: getRenderWidth */
    public int m31033x785dd09a() {
        return this.f14933x235dd304.f14764x6be2dc6;
    }

    /* renamed from: isBlackFrame */
    public boolean m31034x1e684d78() {
        return this.f14926xb5fd6685;
    }

    /* renamed from: isCaptureMirrorHorizontal */
    public boolean m31035x8fa4cc1f() {
        return this.f14921xc5231b38.f14934xd42088ee;
    }

    /* renamed from: isCaptureMirrorVertical */
    public boolean m31036xbbe16a31() {
        return this.f14921xc5231b38.f14935x5a740ec0;
    }

    /* renamed from: isEncodeMirrorHorizontal */
    public boolean m31037xa5882543() {
        return this.f14923x59304682.f14934xd42088ee;
    }

    /* renamed from: isEncodeMirrorVertical */
    public boolean m31038x3050bc55() {
        return this.f14923x59304682.f14935x5a740ec0;
    }

    /* renamed from: isFrontCamera */
    public boolean m31039x24672724() {
        return this.f14927x7f752fb7;
    }

    /* renamed from: isPreprocessorMirrorHorizontal */
    public boolean m31040x13c836fc() {
        return this.f14928x6b1a1d3b.f14934xd42088ee;
    }

    /* renamed from: isPreprocessorMirrorVertical */
    public boolean m31041x48abe84e() {
        return this.f14928x6b1a1d3b.f14935x5a740ec0;
    }

    /* renamed from: isRenderMirrorHorizontal */
    public boolean m31042x3c628c3() {
        return this.f14931xb8f4aa02.f14934xd42088ee;
    }

    /* renamed from: isRenderMirrorVertical */
    public boolean m31043x25399fd5() {
        return this.f14931xb8f4aa02.f14935x5a740ec0;
    }

    /* renamed from: setCaptureMetaData */
    public void m31044x8320dff3(boolean z17, boolean z18, boolean z19, int i17, int i18) {
        com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.C3816xdec8292d c3816xdec8292d = this.f14921xc5231b38;
        c3816xdec8292d.f14934xd42088ee = z17;
        c3816xdec8292d.f14935x5a740ec0 = z18;
        this.f14927x7f752fb7 = z19;
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421 c3779x275421 = this.f14922x2f57dd77;
        c3779x275421.f14764x6be2dc6 = i17;
        c3779x275421.f14763xb7389127 = i18;
    }

    /* renamed from: setEncodeMetaData */
    public void m31045xace15087(boolean z17, boolean z18, int i17, int i18, int i19) {
        com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.C3816xdec8292d c3816xdec8292d = this.f14923x59304682;
        c3816xdec8292d.f14934xd42088ee = z17;
        c3816xdec8292d.f14935x5a740ec0 = z18;
        this.f14924x15804581 = com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.a(i17);
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421 c3779x275421 = this.f14925xbed68f84;
        c3779x275421.f14764x6be2dc6 = i18;
        c3779x275421.f14763xb7389127 = i19;
    }

    /* renamed from: setEncodeMirror */
    public void m31046x58d6baf7(com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.C3816xdec8292d c3816xdec8292d) {
        if (c3816xdec8292d == null) {
            return;
        }
        com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.C3816xdec8292d c3816xdec8292d2 = this.f14923x59304682;
        c3816xdec8292d2.f14934xd42088ee = c3816xdec8292d.f14934xd42088ee;
        c3816xdec8292d2.f14935x5a740ec0 = c3816xdec8292d.f14935x5a740ec0;
    }

    /* renamed from: setEncodeRotation */
    public void m31047xc55b70b6(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k kVar) {
        if (kVar == null) {
            return;
        }
        this.f14924x15804581 = kVar;
    }

    /* renamed from: setEncodeSize */
    public void m31048xff099d39(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421 c3779x275421) {
        this.f14925xbed68f84.set(c3779x275421);
    }

    /* renamed from: setIsBlackFrame */
    public void m31049xb5a3dafa(boolean z17) {
        this.f14926xb5fd6685 = z17;
    }

    /* renamed from: setPreprocessorMetaData */
    public void m31050xfb0e6140(boolean z17, boolean z18, int i17, int i18) {
        com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.C3816xdec8292d c3816xdec8292d = this.f14928x6b1a1d3b;
        c3816xdec8292d.f14934xd42088ee = z17;
        c3816xdec8292d.f14935x5a740ec0 = z18;
        this.f14929x544f51fa = com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.a(i17);
        this.f14930x102364a8 = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.GLScaleType.a(i18);
    }

    /* renamed from: setPreprocessorMirror */
    public void m31051x1652a5f0(com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.C3816xdec8292d c3816xdec8292d) {
        if (c3816xdec8292d == null) {
            return;
        }
        com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.C3816xdec8292d c3816xdec8292d2 = this.f14928x6b1a1d3b;
        c3816xdec8292d2.f14934xd42088ee = c3816xdec8292d.f14934xd42088ee;
        c3816xdec8292d2.f14935x5a740ec0 = c3816xdec8292d.f14935x5a740ec0;
    }

    /* renamed from: setPreprocessorRotation */
    public void m31052x1388816f(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k kVar) {
        if (kVar == null) {
            return;
        }
        this.f14929x544f51fa = kVar;
    }

    /* renamed from: setPreprocessorScaleType */
    public void m31053x381023d3(com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.GLScaleType gLScaleType) {
        if (gLScaleType == null) {
            return;
        }
        this.f14930x102364a8 = gLScaleType;
    }

    /* renamed from: setRenderMetaData */
    public void m31054x2d1ad407(boolean z17, boolean z18, int i17, int i18, int i19) {
        com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.C3816xdec8292d c3816xdec8292d = this.f14931xb8f4aa02;
        c3816xdec8292d.f14934xd42088ee = z17;
        c3816xdec8292d.f14935x5a740ec0 = z18;
        this.f14932x95b9c901 = com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.a(i17);
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421 c3779x275421 = this.f14933x235dd304;
        c3779x275421.f14764x6be2dc6 = i18;
        c3779x275421.f14763xb7389127 = i19;
    }

    /* renamed from: setRenderMirror */
    public void m31055xb89b1e77(com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.C3816xdec8292d c3816xdec8292d) {
        if (c3816xdec8292d == null) {
            return;
        }
        com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.C3816xdec8292d c3816xdec8292d2 = this.f14931xb8f4aa02;
        c3816xdec8292d2.f14934xd42088ee = c3816xdec8292d.f14934xd42088ee;
        c3816xdec8292d2.f14935x5a740ec0 = c3816xdec8292d.f14935x5a740ec0;
    }

    /* renamed from: setRenderRotation */
    public void m31056x4594f436(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k kVar) {
        if (kVar == null) {
            return;
        }
        this.f14932x95b9c901 = kVar;
    }

    /* renamed from: setRenderSize */
    public void m31057x6390e0b9(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3779x275421 c3779x275421) {
        this.f14933x235dd304.set(c3779x275421);
    }
}
