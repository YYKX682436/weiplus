package com.p314xaae8f345.p519xbf8bc95e.p530xb297fa42.jni.p531xc04b6a6a;

/* renamed from: com.tencent.mapsdk.engine.jni.models.TextBitmapInfo */
/* loaded from: classes13.dex */
public class C4390x5841b3aa {

    /* renamed from: density */
    public float f17377x5c8c94e8;

    /* renamed from: height */
    public int f17378xb7389127;

    /* renamed from: mData */
    byte[] f17379x62065b7 = new byte[4];

    /* renamed from: pitch */
    public int f17380x65bc340;

    /* renamed from: weight */
    public int f17381xd0d14278;

    /* renamed from: width */
    public int f17382x6be2dc6;

    /* renamed from: fill */
    public void m36380x2ff583(byte[] bArr) {
        java.util.Arrays.fill(this.f17379x62065b7, (byte) 0);
        java.lang.System.arraycopy(bArr, 0, this.f17379x62065b7, 0, 4);
        this.f17377x5c8c94e8 = java.lang.Float.intBitsToFloat(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mt.a(this.f17379x62065b7));
        java.lang.System.arraycopy(bArr, 4, this.f17379x62065b7, 0, 4);
        this.f17382x6be2dc6 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mt.a(this.f17379x62065b7);
        java.lang.System.arraycopy(bArr, 8, this.f17379x62065b7, 0, 4);
        this.f17378xb7389127 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mt.a(this.f17379x62065b7);
        java.lang.System.arraycopy(bArr, 12, this.f17379x62065b7, 0, 4);
        this.f17380x65bc340 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mt.a(this.f17379x62065b7);
        java.lang.System.arraycopy(bArr, 16, this.f17379x62065b7, 0, 4);
        this.f17381xd0d14278 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mt.a(this.f17379x62065b7);
    }
}
