package com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c;

@com.p314xaae8f345.p373xbe494963.p378x2e06d1.p379xc6ad7b24.InterfaceC3751x20efb56(m29314x6ac9171 = "liteav::video")
/* renamed from: com.tencent.liteav.videoproducer.encoder.NativeEncoderDataListener */
/* loaded from: classes14.dex */
public class C3845xbb3af803 extends com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.InterfaceC3847xf09fac04.b {
    public static final java.lang.String TAG = "NativeEncoderDataListener";

    /* renamed from: mNativeVideoEncodeDataListener */
    private long f15046x9d20980b;

    /* renamed from: mStreamType */
    private int f15047x94fb8b27;

    public C3845xbb3af803(long j17, int i17) {
        this.f15046x9d20980b = j17;
        this.f15047x94fb8b27 = i17;
    }

    /* renamed from: nativeOnEncodedFail */
    private native void m31429x32e81f16(long j17, int i17, int i18);

    /* renamed from: nativeOnEncodedNAL */
    private native void m31430x1a47e21(long j17, int i17, com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.C3811xcc176140 c3811xcc176140, java.nio.ByteBuffer byteBuffer, com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.C3823xe6ee1ba7 c3823xe6ee1ba7, int i18, int i19, int i27, int i28, long j18, long j19, long j27, long j28, long j29, long j37, int i29, int i37, boolean z17, int i38);

    @Override // com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.InterfaceC3847xf09fac04.b
    /* renamed from: onEncodedFail */
    public synchronized void mo31431x8f5c21ed(com.tencent.liteav.videobase.videobase.e.a aVar) {
        long j17 = this.f15046x9d20980b;
        if (j17 != 0) {
            m31429x32e81f16(j17, this.f15047x94fb8b27, com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p402x4f7965cc.e.a(aVar));
        } else {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(TAG, "onEncodedFail nativeclient is zero.");
        }
    }

    @Override // com.p314xaae8f345.p373xbe494963.p408xb069390d.p410xa031851c.InterfaceC3847xf09fac04.b
    /* renamed from: onEncodedNAL */
    public synchronized void mo31432xa9c9446a(com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p399xaf3f29eb.C3811xcc176140 c3811xcc176140, boolean z17) {
        int i17;
        int intValue;
        long j17 = this.f15046x9d20980b;
        if (j17 == 0 || z17) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.d(TAG, "onEncodedNAL mNativeVideoEncodeDataListener=%d,isEos=%b", java.lang.Long.valueOf(j17), java.lang.Boolean.valueOf(z17));
            return;
        }
        int i18 = this.f15047x94fb8b27;
        java.nio.ByteBuffer byteBuffer = c3811xcc176140.f14889x2eefaa;
        com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.C3823xe6ee1ba7 c3823xe6ee1ba7 = c3811xcc176140.f14899xb7a56f87;
        int i19 = c3811xcc176140.f14897x668d77f3.f14909xbee9dd04;
        int i27 = c3811xcc176140.f14900xa979083.f14910xbee9dd04;
        int i28 = c3811xcc176140.f14887xbcfd1870.f14886xbee9dd04;
        int i29 = c3811xcc176140.f14902xfd990f7e;
        long j18 = c3811xcc176140.dts;
        long j19 = c3811xcc176140.pts;
        long j27 = c3811xcc176140.f14892x7ec3bd2a;
        long j28 = c3811xcc176140.f14891xd645ce0d;
        long j29 = c3811xcc176140.f14890xeea76b65;
        long j37 = c3811xcc176140.f14901xf807a458;
        int i37 = c3811xcc176140.f14905x6be2dc6;
        int i38 = c3811xcc176140.f14894xb7389127;
        java.lang.Integer num = c3811xcc176140.f14903x925e672e;
        boolean z18 = num != null;
        if (num == null) {
            i17 = i37;
            intValue = 0;
        } else {
            i17 = i37;
            intValue = num.intValue();
        }
        m31430x1a47e21(j17, i18, c3811xcc176140, byteBuffer, c3823xe6ee1ba7, i19, i27, i28, i29, j18, j19, j27, j28, j29, j37, i17, i38, z18, intValue);
    }

    /* renamed from: reset */
    public synchronized void m31433x6761d4f() {
        this.f15046x9d20980b = 0L;
    }
}
