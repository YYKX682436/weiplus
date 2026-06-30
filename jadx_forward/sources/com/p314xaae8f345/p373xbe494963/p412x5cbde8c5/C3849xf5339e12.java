package com.p314xaae8f345.p373xbe494963.p412x5cbde8c5;

@com.p314xaae8f345.p373xbe494963.p378x2e06d1.p379xc6ad7b24.InterfaceC3751x20efb56(m29314x6ac9171 = "liteav::video")
/* renamed from: com.tencent.liteav.videoproducer2.HWEncoderServerConfig */
/* loaded from: classes14.dex */
public class C3849xf5339e12 {

    /* renamed from: hardwareEncoderBitrateModeCBRSupported */
    private java.lang.Boolean f15081x28953017;

    /* renamed from: mHardwareEncodeType */
    private int f15082xda2621c5 = 2;

    /* renamed from: mHardwareEncoderHighProfileEnable */
    private boolean f15083x49f3fae3 = true;

    /* renamed from: mHardwareEncoderHighProfileSupport */
    private boolean f15084xe5ee566f = true;

    /* renamed from: isHWHevcEncodeAllowed */
    public static boolean m31536x7b91e7af() {
        return m31537x484e10bf();
    }

    /* renamed from: nativeIsHardwareHevcEncodeAllowed */
    private static native boolean m31537x484e10bf();

    /* renamed from: getHardwareEncodeType */
    public int m31538xee33286e() {
        return this.f15082xda2621c5;
    }

    /* renamed from: getHardwareEncoderHighProfileEnable */
    public boolean m31539x3997a5cc() {
        return this.f15083x49f3fae3;
    }

    /* renamed from: getHardwareEncoderHighProfileSupport */
    public boolean m31540xeac008a6() {
        return this.f15084xe5ee566f;
    }

    /* renamed from: isHardwareEncoderAllowed */
    public boolean m31541xe09cb6be() {
        return this.f15082xda2621c5 != 0;
    }

    /* renamed from: isHardwareEncoderBitrateModeCBRSupported */
    public java.lang.Boolean m31542x4f879e1() {
        return this.f15081x28953017;
    }

    /* renamed from: isHardwareEncoderHighProfileAllowed */
    public boolean m31543xbbcf172b() {
        return this.f15082xda2621c5 == 2 && this.f15083x49f3fae3 && this.f15084xe5ee566f;
    }

    /* renamed from: setHardwareEncodeType */
    public void m31544x855eaa7a(int i17) {
        this.f15082xda2621c5 = i17;
    }

    /* renamed from: setHardwareEncoderBitrateModeCBRSupported */
    public void m31545x9d74ff19(boolean z17) {
        this.f15081x28953017 = java.lang.Boolean.valueOf(z17);
    }

    /* renamed from: setHardwareEncoderHighProfileEnable */
    public void m31546xbc0a2d8(boolean z17) {
        this.f15083x49f3fae3 = z17;
    }

    /* renamed from: setHardwareEncoderHighProfileSupport */
    public void m31547x5db6ad1a(boolean z17) {
        this.f15084xe5ee566f = z17;
    }
}
