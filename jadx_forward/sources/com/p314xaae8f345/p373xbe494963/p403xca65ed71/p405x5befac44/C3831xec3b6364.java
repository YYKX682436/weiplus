package com.p314xaae8f345.p373xbe494963.p403xca65ed71.p405x5befac44;

@com.p314xaae8f345.p373xbe494963.p378x2e06d1.p379xc6ad7b24.InterfaceC3751x20efb56(m29314x6ac9171 = "liteav::video")
/* renamed from: com.tencent.liteav.videoconsumer.decoder.SpsInfo */
/* loaded from: classes13.dex */
public class C3831xec3b6364 {

    /* renamed from: width */
    public int f15004x6be2dc6 = 0;

    /* renamed from: height */
    public int f14998xb7389127 = 0;

    /* renamed from: videoFormat */
    public java.lang.Integer f15002x27b47052 = null;

    /* renamed from: videoFullRangeFlag */
    public java.lang.Integer f15003x16baafbf = null;

    /* renamed from: colourPrimaries */
    public java.lang.Integer f14997x832f8db4 = null;

    /* renamed from: transferCharacteristics */
    public java.lang.Integer f15001x38967ecd = null;

    /* renamed from: matrixCoefficients */
    public java.lang.Integer f14999xb99dd03f = null;

    /* renamed from: maxNumRefFrames */
    public java.lang.Integer f15000x18313db7 = null;

    /* renamed from: nativeDecodeSps */
    public static native com.p314xaae8f345.p373xbe494963.p403xca65ed71.p405x5befac44.C3831xec3b6364 m31272x5183e91(boolean z17, java.nio.ByteBuffer byteBuffer);

    /* renamed from: nativeGetSpsPps */
    public static native byte[] m31273x1617357c(byte[] bArr, boolean z17, boolean z18);

    /* renamed from: equals */
    public boolean m31274xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.p373xbe494963.p403xca65ed71.p405x5befac44.C3831xec3b6364)) {
            return false;
        }
        com.p314xaae8f345.p373xbe494963.p403xca65ed71.p405x5befac44.C3831xec3b6364 c3831xec3b6364 = (com.p314xaae8f345.p373xbe494963.p403xca65ed71.p405x5befac44.C3831xec3b6364) obj;
        return c3831xec3b6364.f15004x6be2dc6 == this.f15004x6be2dc6 && c3831xec3b6364.f14998xb7389127 == this.f14998xb7389127 && com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.h.a(this.f15002x27b47052, c3831xec3b6364.f15002x27b47052) && com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.h.a(this.f15003x16baafbf, c3831xec3b6364.f15003x16baafbf) && com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.h.a(this.f14997x832f8db4, c3831xec3b6364.f14997x832f8db4) && com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.h.a(this.f15001x38967ecd, c3831xec3b6364.f15001x38967ecd) && com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.h.a(this.f14999xb99dd03f, c3831xec3b6364.f14999xb99dd03f) && com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.h.a(this.f15000x18313db7, c3831xec3b6364.f15000x18313db7);
    }

    public void set(com.p314xaae8f345.p373xbe494963.p403xca65ed71.p405x5befac44.C3831xec3b6364 c3831xec3b6364) {
        if (c3831xec3b6364 == null) {
            c3831xec3b6364 = new com.p314xaae8f345.p373xbe494963.p403xca65ed71.p405x5befac44.C3831xec3b6364();
        }
        this.f15004x6be2dc6 = c3831xec3b6364.f15004x6be2dc6;
        this.f14998xb7389127 = c3831xec3b6364.f14998xb7389127;
        this.f15002x27b47052 = c3831xec3b6364.f15002x27b47052;
        this.f15003x16baafbf = c3831xec3b6364.f15003x16baafbf;
        this.f14997x832f8db4 = c3831xec3b6364.f14997x832f8db4;
        this.f15001x38967ecd = c3831xec3b6364.f15001x38967ecd;
        this.f14999xb99dd03f = c3831xec3b6364.f14999xb99dd03f;
        this.f15000x18313db7 = c3831xec3b6364.f15000x18313db7;
    }

    /* renamed from: setColourPrimaries */
    public void m31275x9e67f8f2(int i17) {
        this.f14997x832f8db4 = java.lang.Integer.valueOf(i17);
    }

    /* renamed from: setHeight */
    public void m31276xf84e829(int i17) {
        this.f14998xb7389127 = i17;
    }

    /* renamed from: setMatrixCoefficients */
    public void m31277x6425b441(int i17) {
        this.f14999xb99dd03f = java.lang.Integer.valueOf(i17);
    }

    /* renamed from: setMaxNumRefFrames */
    public void m31278x3369a8f5(int i17) {
        this.f15000x18313db7 = java.lang.Integer.valueOf(i17);
    }

    /* renamed from: setTransferCharacteristics */
    public void m31279x1ec6cc0b(int i17) {
        this.f15001x38967ecd = java.lang.Integer.valueOf(i17);
    }

    /* renamed from: setVideoFormat */
    public void m31280x97f02a90(int i17) {
        this.f15002x27b47052 = java.lang.Integer.valueOf(i17);
    }

    /* renamed from: setVideoFullRangeFlag */
    public void m31281xc14293c1(int i17) {
        this.f15003x16baafbf = java.lang.Integer.valueOf(i17);
    }

    /* renamed from: setWidth */
    public void m31282x53e9ee84(int i17) {
        this.f15004x6be2dc6 = i17;
    }

    /* renamed from: toString */
    public java.lang.String m31283x9616526c() {
        return "SpsInfo(" + ("width=" + this.f15004x6be2dc6 + ",height=" + this.f14998xb7389127 + ",videoFormat=" + this.f15002x27b47052 + ",videoFullRangeFlag=" + this.f15003x16baafbf + ",colourPrimaries=" + this.f14997x832f8db4 + ",transferCharacteristics=" + this.f15001x38967ecd + ",matrixCoefficients=" + this.f14999xb99dd03f + ",maxNumRefFrames=" + this.f15000x18313db7) + ")";
    }
}
