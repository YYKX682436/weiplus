package com.p314xaae8f345.p373xbe494963.p408xb069390d.p411xc42bcf92;

@com.p314xaae8f345.p373xbe494963.p378x2e06d1.p379xc6ad7b24.InterfaceC3751x20efb56(m29314x6ac9171 = "liteav::video")
/* renamed from: com.tencent.liteav.videoproducer.producer.ServerVideoProducerConfig */
/* loaded from: classes14.dex */
public class C3848xea956a6c {

    /* renamed from: gsensorRotationCorrection */
    private com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k f15073x8fc5963d;

    /* renamed from: hardwareEncoderBitrateModeCBRSupported */
    private java.lang.Boolean f15075x28953017;

    /* renamed from: mTAG */
    private final java.lang.String f15079x32cfed = "ServerVideoProducerConfig_" + hashCode();

    /* renamed from: hardwareEncodeType */
    private int f15074xdad6c678 = 2;

    /* renamed from: hardwareEncoderHighProfileEnable */
    private boolean f15076xbb20ea56 = true;

    /* renamed from: hardwareEncoderHighProfileSupport */
    private boolean f15077x9a5f555c = true;

    /* renamed from: camera2SupportMinApiLevel */
    private int f15071xf85fb73a = Integer.MAX_VALUE;

    /* renamed from: cameraRotationCorrection */
    private int f15072x4f292581 = 0;

    /* renamed from: mEnableCameraFpsCorrectionLogic */
    private boolean f15078x7fc4c6ec = true;

    /* renamed from: cameraCloudConfigEnumToRotation */
    private com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k m31510x729f150c(int i17) {
        if (i17 == 1) {
            return com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.NORMAL;
        }
        if (i17 == 2) {
            return com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.ROTATION_90;
        }
        if (i17 == 3) {
            return com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.ROTATION_180;
        }
        if (i17 != 4) {
            return null;
        }
        return com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.ROTATION_270;
    }

    /* renamed from: isHWHevcEncodeAllowed */
    public static boolean m31511x7b91e7af() {
        return m31512x484e10bf();
    }

    /* renamed from: nativeIsHardwareHevcEncodeAllowed */
    private static native boolean m31512x484e10bf();

    /* renamed from: getCamera2SupportMinApiLevel */
    public int m31513xc9e55484() {
        return this.f15071xf85fb73a;
    }

    /* renamed from: getCameraRotationCorrectionInfo */
    public java.lang.String m31514xef263c45() {
        return "[CameraV1Front:" + m31516xf097b4af() + ", CameraV1Back:" + m31515xfef14059() + ", CameraV2Front:" + m31518xec99438e() + ", CameraV2Back:" + m31517x4922d99a() + "]";
    }

    /* renamed from: getCameraV1BackRotationCorrection */
    public com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k m31515xfef14059() {
        return m31510x729f150c((this.f15072x4f292581 >> 8) & 255);
    }

    /* renamed from: getCameraV1FrontRotationCorrection */
    public com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k m31516xf097b4af() {
        return m31510x729f150c(this.f15072x4f292581 & 255);
    }

    /* renamed from: getCameraV2BackRotationCorrection */
    public com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k m31517x4922d99a() {
        return m31510x729f150c((this.f15072x4f292581 >> 24) & 255);
    }

    /* renamed from: getCameraV2FrontRotationCorrection */
    public com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k m31518xec99438e() {
        return m31510x729f150c((this.f15072x4f292581 >> 16) & 255);
    }

    /* renamed from: getGsensorRotationCorrection */
    public com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k m31519x614b3387() {
        return this.f15073x8fc5963d;
    }

    /* renamed from: isCameraFpsCorrectionLogicEnabled */
    public boolean m31520xd68d9e9b() {
        return this.f15078x7fc4c6ec;
    }

    /* renamed from: isHardwareEncoderAllowed */
    public boolean m31521xe09cb6be() {
        return this.f15074xdad6c678 != 0;
    }

    /* renamed from: isHardwareEncoderBitrateModeCBRSupported */
    public java.lang.Boolean m31522x4f879e1() {
        return this.f15075x28953017;
    }

    /* renamed from: isHardwareEncoderHighProfileAllowed */
    public boolean m31523xbbcf172b() {
        return this.f15074xdad6c678 == 2 && this.f15076xbb20ea56 && this.f15077x9a5f555c;
    }

    /* renamed from: setCamera2SupportMinApiLevel */
    public void m31524x13b1acf8(int i17) {
        this.f15071xf85fb73a = i17;
    }

    /* renamed from: setCameraFpsCorrectionLogicEnabled */
    public void m31525xdca40863(boolean z17) {
        this.f15078x7fc4c6ec = z17;
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(this.f15079x32cfed, "set camera fps correction logic enabled value is ".concat(java.lang.String.valueOf(z17)));
    }

    /* renamed from: setCameraRotationCorrection */
    public void m31526x2f028003(int i17) {
        this.f15072x4f292581 = i17;
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.i(this.f15079x32cfed, "set camera rotation correction raw value is %#x.", java.lang.Integer.valueOf(i17));
    }

    /* renamed from: setGSensorRotationCorrection */
    public void m31527x2ae5b01b(int i17) {
        if (i17 < 0 || i17 > 3) {
            return;
        }
        this.f15073x8fc5963d = com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.k.a(i17 * 90);
    }

    /* renamed from: setHardwareEncodeType */
    public void m31528x855eaa7a(int i17) {
        this.f15074xdad6c678 = i17;
    }

    /* renamed from: setHardwareEncoderBitrateModeCBRSupported */
    public void m31529x9d74ff19(boolean z17) {
        this.f15075x28953017 = java.lang.Boolean.valueOf(z17);
    }

    /* renamed from: setHardwareEncoderHighProfileEnable */
    public void m31530xbc0a2d8(boolean z17) {
        this.f15076xbb20ea56 = z17;
    }

    /* renamed from: setHardwareEncoderHighProfileSupport */
    public void m31531x5db6ad1a(boolean z17) {
        this.f15077x9a5f555c = z17;
    }

    /* renamed from: toString */
    public java.lang.String m31532x9616526c() {
        return "hardwareEncodeType: " + this.f15074xdad6c678 + ", hardwareEncoderHighProfileEnable: " + this.f15076xbb20ea56 + ", hardwareEncoderHighProfileSupport: " + this.f15077x9a5f555c + ", camera2SupportMinApiLevel: " + this.f15071xf85fb73a + ", hardwareEncoderBitrateModeCBRSupported: " + this.f15075x28953017 + ", gsensorRotationCorrection: " + this.f15073x8fc5963d + ", cameraRotationCorrection: " + m31514xef263c45();
    }
}
