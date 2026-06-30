package p012xc85e97e9.p023xae79c325.p034x2eaf9f;

/* renamed from: androidx.camera.core.ImageCapture */
/* loaded from: classes14.dex */
public final class C0517x4e63dd8b extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137 {

    /* renamed from: CAPTURE_MODE_MAXIMIZE_QUALITY */
    public static final int f1029x9efd992f = 0;

    /* renamed from: CAPTURE_MODE_MINIMIZE_LATENCY */
    public static final int f1030x71979700 = 1;

    /* renamed from: CAPTURE_MODE_ZERO_SHUTTER_LAG */
    public static final int f1031x46ed01ac = 2;

    /* renamed from: DEFAULT_CAPTURE_MODE */
    private static final int f1032x1c7de47a = 1;

    /* renamed from: DEFAULT_FLASH_MODE */
    private static final int f1034xdf475990 = 2;

    /* renamed from: ERROR_CAMERA_CLOSED */
    public static final int f1035x68d4edaf = 3;

    /* renamed from: ERROR_CAPTURE_FAILED */
    public static final int f1036x68f502ad = 2;

    /* renamed from: ERROR_FILE_IO */
    public static final int f1037xd673d772 = 1;

    /* renamed from: ERROR_INVALID_CAMERA */
    public static final int f1038xb804cdc4 = 4;

    /* renamed from: ERROR_UNKNOWN */
    public static final int f1039xf86f50d3 = 0;

    /* renamed from: FLASH_MODE_AUTO */
    public static final int f1041x6499591c = 0;

    /* renamed from: FLASH_MODE_OFF */
    public static final int f1042x8fa20c42 = 2;

    /* renamed from: FLASH_MODE_ON */
    public static final int f1043x362e848c = 1;

    /* renamed from: FLASH_MODE_SCREEN */
    public static final int f1044xc1601099 = 3;

    /* renamed from: FLASH_MODE_UNKNOWN */
    private static final int f1045xe6d5619d = -1;

    /* renamed from: FLASH_TYPE_ONE_SHOT_FLASH */
    public static final int f1046xc0736e9a = 0;

    /* renamed from: FLASH_TYPE_USE_TORCH_AS_FLASH */
    public static final int f1047xdb5aa14 = 1;

    /* renamed from: JPEG_QUALITY_MAXIMIZE_QUALITY_MODE */
    private static final byte f1048x67c7429f = 100;

    /* renamed from: JPEG_QUALITY_MINIMIZE_LATENCY_MODE */
    private static final byte f1049x6b883f6e = 95;

    /* renamed from: MAX_IMAGES */
    private static final int f1050xf73c15d3 = 2;

    /* renamed from: OUTPUT_FORMAT_JPEG */
    public static final int f1051x7f6a7972 = 0;

    /* renamed from: OUTPUT_FORMAT_JPEG_ULTRA_HDR */
    public static final int f1052xcd4b0d16 = 1;

    /* renamed from: SCREEN_FLASH_UI_APPLY_TIMEOUT_SECONDS */
    public static final long f1053x70ae82c7 = 3;
    private static final java.lang.String TAG = "ImageCapture";

    /* renamed from: mCaptureMode */
    private final int f1054xb3c0735c;

    /* renamed from: mCloseableErrorListener */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.CloseableErrorListener f1055xb6dbcd77;

    /* renamed from: mClosingListener */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30.OnImageAvailableListener f1056xbdb2305c;

    /* renamed from: mCropAspectRatio */
    private android.util.Rational f1057x915725b6;

    /* renamed from: mFlashMode */
    private int f1058x36526fc6;

    /* renamed from: mFlashType */
    private final int f1059x3655c55d;

    /* renamed from: mImageCaptureControl */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.InterfaceC0609xb32cdd52 f1060x531523c5;

    /* renamed from: mImagePipeline */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0610x6ae15cfd f1061x965035b0;

    /* renamed from: mLockedFlashMode */
    private final java.util.concurrent.atomic.AtomicReference<java.lang.Integer> f1062x794d0d9c;

    /* renamed from: mScreenFlashWrapper */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.C0836x77bced2f f1063x9488c5c;

    /* renamed from: mSessionConfigBuilder */
    p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.Builder f1064xcb6d0310;

    /* renamed from: mTakePictureManager */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0633xe3071556 f1065x7492b483;

    /* renamed from: DEFAULT_CONFIG */
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.Defaults f1033x7fb79b20 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.Defaults();

    /* renamed from: EXIF_ROTATION_AVAILABILITY */
    static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p046xaf3f3382.p048xe2513c1e.C0863xe40f1549 f1040xc51eca8d = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p046xaf3f3382.p048xe2513c1e.C0863xe40f1549();

    /* renamed from: androidx.camera.core.ImageCapture$Builder */
    /* loaded from: classes14.dex */
    public static final class Builder implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.Builder<p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0713xaaf0b8ad, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.Builder>, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e.Builder<p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.Builder>, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.InterfaceC0835x7adec28.Builder<p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.Builder>, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0716x5f72b371.Builder<p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.Builder> {

        /* renamed from: mMutableConfig */
        private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0731x74f1ef5a f1067x61287a9b;

        public Builder() {
            this(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0731x74f1ef5a.m5524xaf65a0fc());
        }

        /* renamed from: fromConfig */
        public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.Builder m4557x650a9f8c(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 interfaceC0692x78a46f62) {
            return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.Builder(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0731x74f1ef5a.m5525x3017aa(interfaceC0692x78a46f62));
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0501xb43e0567
        /* renamed from: getMutableConfig */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0730x35b9a1e8 mo2889xc37a2e52() {
            return this.f1067x61287a9b;
        }

        /* renamed from: setBufferFormat */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.Builder m4559x66bd5d9(int i17) {
            mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0713xaaf0b8ad.f1670xf700768c, java.lang.Integer.valueOf(i17));
            return this;
        }

        /* renamed from: setCaptureMode */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.Builder m4560x79ef1c47(int i17) {
            mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0713xaaf0b8ad.f1674xa81db3aa, java.lang.Integer.valueOf(i17));
            return this;
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e.Builder
        /* renamed from: setCustomOrderedResolutions */
        public /* bridge */ /* synthetic */ p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.Builder mo4451xd3ebe6d(java.util.List list) {
            return mo4451xd3ebe6d((java.util.List<android.util.Size>) list);
        }

        /* renamed from: setFlashMode */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.Builder m4561x175c5771(int i17) {
            mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0713xaaf0b8ad.f1672x511f42bc, java.lang.Integer.valueOf(i17));
            return this;
        }

        /* renamed from: setFlashType */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.Builder m4562x175fad08(int i17) {
            mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0713xaaf0b8ad.f1673x51229853, java.lang.Integer.valueOf(i17));
            return this;
        }

        /* renamed from: setImageReaderProxyProvider */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.Builder m4563x49745fa3(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0539xe9692941 interfaceC0539xe9692941) {
            mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0713xaaf0b8ad.f1675xf3c9daf0, interfaceC0539xe9692941);
            return this;
        }

        /* renamed from: setJpegQuality */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.Builder m4565xcbb16db5(int i17) {
            m3.h.c(i17, 1, 100, "jpegQuality");
            mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0713xaaf0b8ad.f1676x8b91f119, java.lang.Integer.valueOf(i17));
            return this;
        }

        /* renamed from: setOutputFormat */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.Builder m4566x790105da(int i17) {
            mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0713xaaf0b8ad.f1678xd71146ab, java.lang.Integer.valueOf(i17));
            return this;
        }

        /* renamed from: setPostviewEnabled */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.Builder m4567x9b39c37a(boolean z17) {
            mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0713xaaf0b8ad.f1679xbd0ddab1, java.lang.Boolean.valueOf(z17));
            return this;
        }

        /* renamed from: setPostviewResolutionSelector */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.Builder m4568x45d4fed2(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.C0955xda4820cb c0955xda4820cb) {
            mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0713xaaf0b8ad.f1680xca481da2, c0955xda4820cb);
            return this;
        }

        /* renamed from: setScreenFlash */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.Builder m4569x6c465d22(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.ScreenFlash screenFlash) {
            mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0713xaaf0b8ad.f1681x2ec5a1c7, screenFlash);
            return this;
        }

        /* renamed from: setSoftwareJpegEncoderRequested */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.Builder m4570x593e0c03(boolean z17) {
            mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0713xaaf0b8ad.f1682xc20b579b, java.lang.Boolean.valueOf(z17));
            return this;
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e.Builder
        /* renamed from: setSupportedResolutions */
        public /* bridge */ /* synthetic */ p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.Builder mo4466x9b56433b(java.util.List list) {
            return mo4466x9b56433b((java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>>) list);
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.InterfaceC0840xcdfd0453.Builder
        /* renamed from: setTargetClass */
        public /* bridge */ /* synthetic */ java.lang.Object mo4354xf26d54a5(java.lang.Class cls) {
            return mo4354xf26d54a5((java.lang.Class<p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b>) cls);
        }

        private Builder(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0731x74f1ef5a c0731x74f1ef5a) {
            this.f1067x61287a9b = c0731x74f1ef5a;
            java.lang.Class cls = (java.lang.Class) c0731x74f1ef5a.mo5380x77ba97d1(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.InterfaceC0840xcdfd0453.f2094x7271dcb4, null);
            if (cls != null && !cls.equals(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.class)) {
                throw new java.lang.IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            mo4450x79f271de(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.CaptureType.IMAGE_CAPTURE);
            mo4354xf26d54a5(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.class);
        }

        /* renamed from: fromConfig */
        public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.Builder m4558x650a9f8c(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0713xaaf0b8ad c0713xaaf0b8ad) {
            return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.Builder(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0731x74f1ef5a.m5525x3017aa((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62) c0713xaaf0b8ad));
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0501xb43e0567
        /* renamed from: build */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b mo2888x59bc66e() {
            java.lang.Integer num = (java.lang.Integer) mo2889xc37a2e52().mo5380x77ba97d1(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0713xaaf0b8ad.f1670xf700768c, null);
            if (num != null) {
                mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0716x5f72b371.f1687x12b109b6, num);
            } else if (p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.m4513xd4f3606c(mo2889xc37a2e52())) {
                mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0716x5f72b371.f1687x12b109b6, 4101);
                mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0716x5f72b371.f1686x1d477a5e, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e.f954x1f661f17);
            } else {
                mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0716x5f72b371.f1687x12b109b6, 256);
            }
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0713xaaf0b8ad mo4446x111127c3 = mo4446x111127c3();
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e.m5478xd0bfdff8(mo4446x111127c3);
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b c0517x4e63dd8b = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b(mo4446x111127c3);
            android.util.Size size = (android.util.Size) mo2889xc37a2e52().mo5380x77ba97d1(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e.f1697xbf0df2d0, null);
            if (size != null) {
                c0517x4e63dd8b.m4545xdce16121(new android.util.Rational(size.getWidth(), size.getHeight()));
            }
            m3.h.d((java.util.concurrent.Executor) mo2889xc37a2e52().mo5380x77ba97d1(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.InterfaceC0835x7adec28.f2079x4183cf02, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5980xf96be419()), "The IO executor can't be null");
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0730x35b9a1e8 mo2889xc37a2e52 = mo2889xc37a2e52();
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<java.lang.Integer> option = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0713xaaf0b8ad.f1672x511f42bc;
            if (mo2889xc37a2e52.mo5374xdccd9774(option)) {
                java.lang.Integer num2 = (java.lang.Integer) mo2889xc37a2e52().mo5379x77ba97d1(option);
                if (num2 != null && (num2.intValue() == 0 || num2.intValue() == 1 || num2.intValue() == 3 || num2.intValue() == 2)) {
                    if (num2.intValue() == 3 && mo2889xc37a2e52().mo5380x77ba97d1(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0713xaaf0b8ad.f1681x2ec5a1c7, null) == null) {
                        throw new java.lang.IllegalArgumentException("The flash mode is not allowed to set to FLASH_MODE_SCREEN without setting ScreenFlash");
                    }
                } else {
                    throw new java.lang.IllegalArgumentException("The flash mode is not allowed to set: " + num2);
                }
            }
            return c0517x4e63dd8b;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.Builder
        /* renamed from: getUseCaseConfig */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0713xaaf0b8ad mo4446x111127c3() {
            return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0713xaaf0b8ad(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0735xc905e4a0.m5538x3017aa(this.f1067x61287a9b));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.Builder
        /* renamed from: setCaptureOptionUnpacker */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.Builder mo4449x89aad198(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08.OptionUnpacker optionUnpacker) {
            mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.f1828x70d747d9, optionUnpacker);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.Builder
        /* renamed from: setCaptureType */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.Builder mo4450x79f271de(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.CaptureType captureType) {
            mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.f1829x7803883d, captureType);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e.Builder
        /* renamed from: setCustomOrderedResolutions */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.Builder mo4451xd3ebe6d(java.util.List<android.util.Size> list) {
            mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e.f1690x228c71, list);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.Builder
        /* renamed from: setDefaultCaptureConfig */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.Builder mo4452x8bbd60e9(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08 c0690x88f65a08) {
            mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.f1830x55dfff63, c0690x88f65a08);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e.Builder
        /* renamed from: setDefaultResolution */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.Builder mo4453xe20fa18b(android.util.Size size) {
            mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e.f1691xcde9ad94, size);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.Builder
        /* renamed from: setDefaultSessionConfig */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.Builder mo4454xe586039(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 c0750xb915958) {
            mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.f1831x26a4ea13, c0750xb915958);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0716x5f72b371.Builder
        /* renamed from: setDynamicRange */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.Builder mo4455xb924c5c0(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e c0491x2bb48c5e) {
            mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0716x5f72b371.f1686x1d477a5e, c0491x2bb48c5e);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.Builder
        /* renamed from: setHighResolutionDisabled */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.Builder mo4456xcfdff38c(boolean z17) {
            mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.f1832x6e134b1c, java.lang.Boolean.valueOf(z17));
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.InterfaceC0835x7adec28.Builder
        /* renamed from: setIoExecutor */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.Builder mo4564x15d0ea1b(java.util.concurrent.Executor executor) {
            mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.InterfaceC0835x7adec28.f2079x4183cf02, executor);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e.Builder
        /* renamed from: setMaxResolution */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.Builder mo4459xaaf6afee(android.util.Size size) {
            mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e.f1692xe906b791, size);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e.Builder
        /* renamed from: setMirrorMode */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.Builder mo4460x845d2804(int i17) {
            throw new java.lang.UnsupportedOperationException("setMirrorMode is not supported.");
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e.Builder
        /* renamed from: setResolutionSelector */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.Builder mo4464x170c48ad(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.C0955xda4820cb c0955xda4820cb) {
            mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e.f1694xa42c6f48, c0955xda4820cb);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.Builder
        /* renamed from: setSessionOptionUnpacker */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.Builder mo4465x523980e8(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.OptionUnpacker optionUnpacker) {
            mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.f1834x50776329, optionUnpacker);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e.Builder
        /* renamed from: setSupportedResolutions */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.Builder mo4466x9b56433b(java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>> list) {
            mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e.f1695x2ed2d6ac, list);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.Builder
        /* renamed from: setSurfaceOccupancyPriority */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.Builder mo4467x678fae66(int i17) {
            mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.f1835x80437872, java.lang.Integer.valueOf(i17));
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e.Builder
        @java.lang.Deprecated
        /* renamed from: setTargetAspectRatio */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.Builder mo4468x52ad1800(int i17) {
            if (i17 == -1) {
                i17 = 0;
            }
            mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e.f1696x64f6b668, java.lang.Integer.valueOf(i17));
            return this;
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.InterfaceC0840xcdfd0453.Builder
        /* renamed from: setTargetClass */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.Builder mo4354xf26d54a5(java.lang.Class<p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b> cls) {
            mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.InterfaceC0840xcdfd0453.f2094x7271dcb4, cls);
            if (mo2889xc37a2e52().mo5380x77ba97d1(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.InterfaceC0840xcdfd0453.f2095xc1a56baf, null) == null) {
                mo4355x396335be(cls.getCanonicalName() + "-" + java.util.UUID.randomUUID());
            }
            return this;
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.InterfaceC0840xcdfd0453.Builder
        /* renamed from: setTargetName */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.Builder mo4355x396335be(java.lang.String str) {
            mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.InterfaceC0840xcdfd0453.f2095xc1a56baf, str);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e.Builder
        @java.lang.Deprecated
        /* renamed from: setTargetResolution */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.Builder mo4469xb1b6c19f(android.util.Size size) {
            mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e.f1697xbf0df2d0, size);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e.Builder
        /* renamed from: setTargetRotation */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.Builder mo4470x5541f931(int i17) {
            mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e.f1698xe496c6a2, java.lang.Integer.valueOf(i17));
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.Builder
        /* renamed from: setZslDisabled */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.Builder mo4471xc3162e2d(boolean z17) {
            mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.f1838x83019c92, java.lang.Boolean.valueOf(z17));
            return this;
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* renamed from: androidx.camera.core.ImageCapture$CaptureMode */
    /* loaded from: classes6.dex */
    public @interface CaptureMode {
    }

    /* renamed from: androidx.camera.core.ImageCapture$Defaults */
    /* loaded from: classes14.dex */
    public static final class Defaults implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0693xcbf65773<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0713xaaf0b8ad> {

        /* renamed from: DEFAULT_ASPECT_RATIO */
        private static final int f1068x1cc566a2 = 0;

        /* renamed from: DEFAULT_CONFIG */
        private static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0713xaaf0b8ad f1069x7fb79b20;

        /* renamed from: DEFAULT_DYNAMIC_RANGE */
        private static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e f1070x1c92235f;

        /* renamed from: DEFAULT_OUTPUT_FORMAT */
        private static final int f1071xc249cf57 = 0;

        /* renamed from: DEFAULT_RESOLUTION_SELECTOR */
        private static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.C0955xda4820cb f1072x1f8ec6f4;

        /* renamed from: DEFAULT_SURFACE_OCCUPANCY_PRIORITY */
        private static final int f1073x242b6746 = 4;

        static {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.C0955xda4820cb m6501x59bc66e = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.C0955xda4820cb.Builder().m6503xf4e1a364(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.C0953x9920cf06.f2302xcd77a971).m6505x3a95f841(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.C0956xfdd1d05f.f2320xcf28abe4).m6501x59bc66e();
            f1072x1f8ec6f4 = m6501x59bc66e;
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e c0491x2bb48c5e = p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e.SDR;
            f1070x1c92235f = c0491x2bb48c5e;
            f1069x7fb79b20 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.Builder().mo4467x678fae66(4).mo4468x52ad1800(0).mo4464x170c48ad(m6501x59bc66e).m4566x790105da(0).mo4455xb924c5c0(c0491x2bb48c5e).mo4446x111127c3();
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0693xcbf65773
        /* renamed from: getConfig, reason: avoid collision after fix types in other method */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0713xaaf0b8ad mo4473x1456a638() {
            return f1069x7fb79b20;
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* renamed from: androidx.camera.core.ImageCapture$FlashMode */
    /* loaded from: classes6.dex */
    public @interface FlashMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* renamed from: androidx.camera.core.ImageCapture$FlashType */
    /* loaded from: classes6.dex */
    public @interface FlashType {
    }

    /* renamed from: androidx.camera.core.ImageCapture$ImageCaptureCapabilitiesImpl */
    /* loaded from: classes14.dex */
    public static class ImageCaptureCapabilitiesImpl implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0523x20c548e1 {

        /* renamed from: mCameraInfo */
        private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93 f1074x643e79c0;

        public ImageCaptureCapabilitiesImpl(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93 interfaceC0472xfede5d93) {
            this.f1074x643e79c0 = interfaceC0472xfede5d93;
        }

        /* renamed from: isUltraHdrSupported */
        private boolean m4572xd8750c1a() {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93 interfaceC0472xfede5d93 = this.f1074x643e79c0;
            if (interfaceC0472xfede5d93 instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0675x66574570) {
                return ((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0675x66574570) interfaceC0472xfede5d93).mo3178x7cdcf003().contains(4101);
            }
            return false;
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0523x20c548e1
        /* renamed from: getSupportedOutputFormats */
        public java.util.Set<java.lang.Integer> mo4573x7cdcf003() {
            java.util.HashSet hashSet = new java.util.HashSet();
            hashSet.add(0);
            if (m4572xd8750c1a()) {
                hashSet.add(1);
            }
            return hashSet;
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0523x20c548e1
        /* renamed from: isCaptureProcessProgressSupported */
        public boolean mo4574xc888012e() {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93 interfaceC0472xfede5d93 = this.f1074x643e79c0;
            if (interfaceC0472xfede5d93 instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0675x66574570) {
                return ((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0675x66574570) interfaceC0472xfede5d93).mo5287xc888012e();
            }
            return false;
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0523x20c548e1
        /* renamed from: isPostviewSupported */
        public boolean mo4575x3cb33adf() {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93 interfaceC0472xfede5d93 = this.f1074x643e79c0;
            if (interfaceC0472xfede5d93 instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0675x66574570) {
                return ((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0675x66574570) interfaceC0472xfede5d93).mo5288x3cb33adf();
            }
            return false;
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* renamed from: androidx.camera.core.ImageCapture$ImageCaptureError */
    /* loaded from: classes6.dex */
    public @interface ImageCaptureError {
    }

    /* renamed from: androidx.camera.core.ImageCapture$Metadata */
    /* loaded from: classes13.dex */
    public static final class Metadata {

        /* renamed from: mIsReversedHorizontal */
        private boolean f1075xb9eff65d;

        /* renamed from: mIsReversedHorizontalSet */
        private boolean f1076xbbafd4c5 = false;

        /* renamed from: mIsReversedVertical */
        private boolean f1077xeece0bef;

        /* renamed from: mLocation */
        private android.location.Location f1078x964d4742;

        /* renamed from: getLocation */
        public android.location.Location m4576xed29dd2b() {
            return this.f1078x964d4742;
        }

        /* renamed from: isReversedHorizontal */
        public boolean m4577x510a3a50() {
            return this.f1075xb9eff65d;
        }

        /* renamed from: isReversedHorizontalSet */
        public boolean m4578xb53927f2() {
            return this.f1076xbbafd4c5;
        }

        /* renamed from: isReversedVertical */
        public boolean m4579xef7eb0a2() {
            return this.f1077xeece0bef;
        }

        /* renamed from: setLocation */
        public void m4580xe7e23e37(android.location.Location location) {
            this.f1078x964d4742 = location;
        }

        /* renamed from: setReversedHorizontal */
        public void m4581x28e38b88(boolean z17) {
            this.f1075xb9eff65d = z17;
            this.f1076xbbafd4c5 = true;
        }

        /* renamed from: setReversedVertical */
        public void m4582x916aefda(boolean z17) {
            this.f1077xeece0bef = z17;
        }

        /* renamed from: toString */
        public java.lang.String m4583x9616526c() {
            return "Metadata{mIsReversedHorizontal=" + this.f1075xb9eff65d + ", mIsReversedVertical=" + this.f1077xeece0bef + ", mLocation=" + this.f1078x964d4742 + "}";
        }
    }

    /* renamed from: androidx.camera.core.ImageCapture$OnImageCapturedCallback */
    /* loaded from: classes14.dex */
    public static abstract class OnImageCapturedCallback {
        /* renamed from: onCaptureProcessProgressed */
        public void mo4368x1c9165b4(int i17) {
        }

        /* renamed from: onCaptureStarted */
        public void mo4369x56961e1a() {
        }

        /* renamed from: onCaptureSuccess */
        public void mo4370x58601d9c(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 interfaceC0536x1ffeadf3) {
        }

        /* renamed from: onError */
        public void mo4371xaf8aa769(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0524xb471f04 c0524xb471f04) {
        }

        /* renamed from: onPostviewBitmapAvailable */
        public void mo4372x945ddf76(android.graphics.Bitmap bitmap) {
        }
    }

    /* renamed from: androidx.camera.core.ImageCapture$OnImageSavedCallback */
    /* loaded from: classes14.dex */
    public interface OnImageSavedCallback {
        /* renamed from: onCaptureProcessProgressed */
        default void mo4375x1c9165b4(int i17) {
        }

        /* renamed from: onCaptureStarted */
        default void mo4376x56961e1a() {
        }

        /* renamed from: onError */
        void mo4377xaf8aa769(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0524xb471f04 c0524xb471f04);

        /* renamed from: onImageSaved */
        void mo4378x706cd52b(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OutputFileResults outputFileResults);

        /* renamed from: onPostviewBitmapAvailable */
        default void mo4379x945ddf76(android.graphics.Bitmap bitmap) {
        }
    }

    /* renamed from: androidx.camera.core.ImageCapture$OutputFileOptions */
    /* loaded from: classes13.dex */
    public static final class OutputFileOptions {

        /* renamed from: mContentResolver */
        private final android.content.ContentResolver f1079x4bcbfb72;

        /* renamed from: mContentValues */
        private final android.content.ContentValues f1080x4baac78e;

        /* renamed from: mFile */
        private final java.io.File f1081x6216b89;

        /* renamed from: mMetadata */
        private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.Metadata f1082xa2b22bc;

        /* renamed from: mOutputStream */
        private final java.io.OutputStream f1083x8fcfe8ee;

        /* renamed from: mSaveCollection */
        private final android.net.Uri f1084x361e5dc8;

        public OutputFileOptions(java.io.File file, android.content.ContentResolver contentResolver, android.net.Uri uri, android.content.ContentValues contentValues, java.io.OutputStream outputStream, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.Metadata metadata) {
            this.f1081x6216b89 = file;
            this.f1079x4bcbfb72 = contentResolver;
            this.f1084x361e5dc8 = uri;
            this.f1080x4baac78e = contentValues;
            this.f1083x8fcfe8ee = outputStream;
            this.f1082xa2b22bc = metadata == null ? new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.Metadata() : metadata;
        }

        /* renamed from: getContentResolver */
        public android.content.ContentResolver m4584x607f9d69() {
            return this.f1079x4bcbfb72;
        }

        /* renamed from: getContentValues */
        public android.content.ContentValues m4585xadfc7b45() {
            return this.f1080x4baac78e;
        }

        /* renamed from: getFile */
        public java.io.File m4586xfb7f5df2() {
            return this.f1081x6216b89;
        }

        /* renamed from: getMetadata */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.Metadata m4587x6107b8a5() {
            return this.f1082xa2b22bc;
        }

        /* renamed from: getOutputStream */
        public java.io.OutputStream m4588x592d6257() {
            return this.f1083x8fcfe8ee;
        }

        /* renamed from: getSaveCollection */
        public android.net.Uri m4589x1e0320f1() {
            return this.f1084x361e5dc8;
        }

        /* renamed from: toString */
        public java.lang.String m4590x9616526c() {
            return "OutputFileOptions{mFile=" + this.f1081x6216b89 + ", mContentResolver=" + this.f1079x4bcbfb72 + ", mSaveCollection=" + this.f1084x361e5dc8 + ", mContentValues=" + this.f1080x4baac78e + ", mOutputStream=" + this.f1083x8fcfe8ee + ", mMetadata=" + this.f1082xa2b22bc + "}";
        }

        /* renamed from: androidx.camera.core.ImageCapture$OutputFileOptions$Builder */
        /* loaded from: classes13.dex */
        public static final class Builder {

            /* renamed from: mContentResolver */
            private android.content.ContentResolver f1085x4bcbfb72;

            /* renamed from: mContentValues */
            private android.content.ContentValues f1086x4baac78e;

            /* renamed from: mFile */
            private java.io.File f1087x6216b89;

            /* renamed from: mMetadata */
            private p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.Metadata f1088xa2b22bc;

            /* renamed from: mOutputStream */
            private java.io.OutputStream f1089x8fcfe8ee;

            /* renamed from: mSaveCollection */
            private android.net.Uri f1090x361e5dc8;

            public Builder(java.io.File file) {
                this.f1087x6216b89 = file;
            }

            /* renamed from: build */
            public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OutputFileOptions m4591x59bc66e() {
                return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OutputFileOptions(this.f1087x6216b89, this.f1085x4bcbfb72, this.f1090x361e5dc8, this.f1086x4baac78e, this.f1089x8fcfe8ee, this.f1088xa2b22bc);
            }

            /* renamed from: setMetadata */
            public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OutputFileOptions.Builder m4592x5bc019b1(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.Metadata metadata) {
                this.f1088xa2b22bc = metadata;
                return this;
            }

            public Builder(android.content.ContentResolver contentResolver, android.net.Uri uri, android.content.ContentValues contentValues) {
                this.f1085x4bcbfb72 = contentResolver;
                this.f1090x361e5dc8 = uri;
                this.f1086x4baac78e = contentValues;
            }

            public Builder(java.io.OutputStream outputStream) {
                this.f1089x8fcfe8ee = outputStream;
            }
        }
    }

    /* renamed from: androidx.camera.core.ImageCapture$OutputFileResults */
    /* loaded from: classes6.dex */
    public static class OutputFileResults {

        /* renamed from: mSavedUri */
        private final android.net.Uri f1091xa97b24f2;

        public OutputFileResults(android.net.Uri uri) {
            this.f1091xa97b24f2 = uri;
        }

        /* renamed from: getSavedUri */
        public android.net.Uri m4593x57badb() {
            return this.f1091xa97b24f2;
        }
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* renamed from: androidx.camera.core.ImageCapture$OutputFormat */
    /* loaded from: classes6.dex */
    public @interface OutputFormat {
    }

    /* renamed from: androidx.camera.core.ImageCapture$ScreenFlash */
    /* loaded from: classes14.dex */
    public interface ScreenFlash {
        /* renamed from: apply */
        void mo4594x58b836e(long j17, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.ScreenFlashListener screenFlashListener);

        /* renamed from: clear */
        void mo4595x5a5b64d();
    }

    /* renamed from: androidx.camera.core.ImageCapture$ScreenFlashListener */
    /* loaded from: classes14.dex */
    public interface ScreenFlashListener {
        /* renamed from: onCompleted */
        void mo3213xaa8b332c();
    }

    public C0517x4e63dd8b(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0713xaaf0b8ad c0713xaaf0b8ad) {
        super(c0713xaaf0b8ad);
        this.f1056xbdb2305c = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0518x5772be76();
        this.f1062x794d0d9c = new java.util.concurrent.atomic.AtomicReference<>(null);
        this.f1058x36526fc6 = -1;
        this.f1057x915725b6 = null;
        this.f1060x531523c5 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.InterfaceC0609xb32cdd52() { // from class: androidx.camera.core.ImageCapture.1
            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.InterfaceC0609xb32cdd52
            /* renamed from: lockFlashMode */
            public void mo4554xd77e20c8() {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.this.m4542xd77e20c8();
            }

            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.InterfaceC0609xb32cdd52
            /* renamed from: submitStillCaptureRequests */
            public wa.a mo4555x7c34ae9a(java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08> list) {
                return p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.this.m4549xe2f970f9(list);
            }

            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.InterfaceC0609xb32cdd52
            /* renamed from: unlockFlashMode */
            public void mo4556xf61252cf() {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.this.m4553xf61252cf();
            }
        };
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0713xaaf0b8ad c0713xaaf0b8ad2 = (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0713xaaf0b8ad) m4814x27802a65();
        if (c0713xaaf0b8ad2.mo5374xdccd9774(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0713xaaf0b8ad.f1674xa81db3aa)) {
            this.f1054xb3c0735c = c0713xaaf0b8ad2.m5455xe389a8d3();
        } else {
            this.f1054xb3c0735c = 1;
        }
        this.f1059x3655c55d = c0713xaaf0b8ad2.m5459xbb0bec94(0);
        this.f1063x9488c5c = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.C0836x77bced2f.m6106x3017aa(c0713xaaf0b8ad2.m5468xd5e0e9ae());
    }

    /* renamed from: abortImageCaptureRequests */
    private void m4500x140c919f() {
        this.f1063x9488c5c.m6107xdf11e010();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0633xe3071556 c0633xe3071556 = this.f1065x7492b483;
        if (c0633xe3071556 != null) {
            c0633xe3071556.m5068xc4f0b714();
        }
    }

    /* renamed from: clearPipeline */
    private void m4502xbdd2280f() {
        m4503xbdd2280f(false);
    }

    /* renamed from: computeDispatchCropRect */
    public static android.graphics.Rect m4504xcb1ccd85(android.graphics.Rect rect, android.util.Rational rational, int i17, android.util.Size size, int i18) {
        if (rect != null) {
            return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.C0869x431b07dd.m6210x29b1211d(rect, i17, size, i18);
        }
        if (rational != null) {
            if (i18 % 180 != 0) {
                rational = new android.util.Rational(rational.getDenominator(), rational.getNumerator());
            }
            if (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.C0869x431b07dd.m6220xd00abe73(size, rational)) {
                android.graphics.Rect m6209x6601831e = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.C0869x431b07dd.m6209x6601831e(size, rational);
                java.util.Objects.requireNonNull(m6209x6601831e);
                return m6209x6601831e;
            }
        }
        return new android.graphics.Rect(0, 0, size.getWidth(), size.getHeight());
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0136  */
    /* renamed from: createPipeline */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.Builder m4505x20cff3be(java.lang.String r17, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0713xaaf0b8ad r18, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b r19) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.m4505x20cff3be(java.lang.String, androidx.camera.core.impl.ImageCaptureConfig, androidx.camera.core.impl.StreamSpec):androidx.camera.core.impl.SessionConfig$Builder");
    }

    /* renamed from: getCameraLens */
    private int m4506x764e75b9() {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 m4811x1390e61b = m4811x1390e61b();
        if (m4811x1390e61b != null) {
            return m4811x1390e61b.mo4253x764d3969().mo3168x5f62de6e();
        }
        return -1;
    }

    /* renamed from: getError */
    public static int m4507x74627852(java.lang.Throwable th6) {
        if (th6 instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0466x3ba5de3e) {
            return 3;
        }
        if (th6 instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0524xb471f04) {
            return ((p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0524xb471f04) th6).m4596xb0220aa7();
        }
        return 0;
    }

    /* renamed from: getImageCaptureCapabilities */
    public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0523x20c548e1 m4508xd103b637(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93 interfaceC0472xfede5d93) {
        return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.ImageCaptureCapabilitiesImpl(interfaceC0472xfede5d93);
    }

    /* renamed from: getJpegQualityInternal */
    private int m4509x59ec541e() {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0713xaaf0b8ad c0713xaaf0b8ad = (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0713xaaf0b8ad) m4814x27802a65();
        if (c0713xaaf0b8ad.mo5374xdccd9774(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0713xaaf0b8ad.f1676x8b91f119)) {
            return c0713xaaf0b8ad.m5463x354bfa41();
        }
        int i17 = this.f1054xb3c0735c;
        if (i17 == 0) {
            return 100;
        }
        if (i17 == 1 || i17 == 2) {
            return 95;
        }
        throw new java.lang.IllegalStateException("CaptureMode " + this.f1054xb3c0735c + " is invalid");
    }

    /* renamed from: getSessionProcessor */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0752x161fb6bc m4510xf033da12() {
        return m4811x1390e61b().mo3093x13f11ad1().m5260xf033da12(null);
    }

    /* renamed from: getTakePictureCropRect */
    private android.graphics.Rect m4511x25484f5() {
        android.graphics.Rect m4829xe80fd2f0 = m4829xe80fd2f0();
        android.util.Size m4810x59ee93f = m4810x59ee93f();
        java.util.Objects.requireNonNull(m4810x59ee93f);
        if (m4829xe80fd2f0 != null) {
            return m4829xe80fd2f0;
        }
        if (!p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.C0869x431b07dd.m6219xd00abe73(this.f1057x915725b6)) {
            return new android.graphics.Rect(0, 0, m4810x59ee93f.getWidth(), m4810x59ee93f.getHeight());
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 m4811x1390e61b = m4811x1390e61b();
        java.util.Objects.requireNonNull(m4811x1390e61b);
        int m4820xe02e49e0 = m4820xe02e49e0(m4811x1390e61b);
        android.util.Rational rational = new android.util.Rational(this.f1057x915725b6.getDenominator(), this.f1057x915725b6.getNumerator());
        if (!p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0801x6002c4c5.m5956x99b544a7(m4820xe02e49e0)) {
            rational = this.f1057x915725b6;
        }
        android.graphics.Rect m6209x6601831e = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.C0869x431b07dd.m6209x6601831e(m4810x59ee93f, rational);
        java.util.Objects.requireNonNull(m6209x6601831e);
        return m6209x6601831e;
    }

    /* renamed from: isImageFormatSupported */
    private static boolean m4512xf2c5d7e6(java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>> list, int i17) {
        if (list == null) {
            return false;
        }
        java.util.Iterator<android.util.Pair<java.lang.Integer, android.util.Size[]>> it = list.iterator();
        while (it.hasNext()) {
            if (((java.lang.Integer) it.next().first).equals(java.lang.Integer.valueOf(i17))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isOutputFormatUltraHdr */
    public static boolean m4513xd4f3606c(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0730x35b9a1e8 interfaceC0730x35b9a1e8) {
        return java.util.Objects.equals(interfaceC0730x35b9a1e8.mo5380x77ba97d1(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0713xaaf0b8ad.f1678xd71146ab, null), 1);
    }

    /* renamed from: isSessionProcessorEnabledInCurrentCamera */
    private boolean m4514x39a982de() {
        return (m4811x1390e61b() == null || m4811x1390e61b().mo3093x13f11ad1().m5260xf033da12(null) == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$createPipeline$3 */
    public void m4515xa5070c0a(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 c0750xb915958, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.SessionError sessionError) {
        if (m4811x1390e61b() == null) {
            return;
        }
        this.f1065x7492b483.m5075x65825f6();
        m4503xbdd2280f(true);
        java.lang.String m4813x72efd496 = m4813x72efd496();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0713xaaf0b8ad c0713xaaf0b8ad = (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0713xaaf0b8ad) m4814x27802a65();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b m4809xfdddfa15 = m4809xfdddfa15();
        m4809xfdddfa15.getClass();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.Builder m4505x20cff3be = m4505x20cff3be(m4813x72efd496, c0713xaaf0b8ad, m4809xfdddfa15);
        this.f1064xcb6d0310 = m4505x20cff3be;
        java.lang.Object[] objArr = {m4505x20cff3be.m5619x59bc66e()};
        java.util.ArrayList arrayList = new java.util.ArrayList(1);
        java.lang.Object obj = objArr[0];
        java.util.Objects.requireNonNull(obj);
        arrayList.add(obj);
        m4844xd8cf6f2f(java.util.Collections.unmodifiableList(arrayList));
        m4836x9763bb86();
        this.f1065x7492b483.m5076xc84dc82d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$new$0 */
    public static /* synthetic */ void m4516x51ef5f0f(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30 interfaceC0719xa3f4ef30) {
        try {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 mo4183xaf314b5e = interfaceC0719xa3f4ef30.mo4183xaf314b5e();
            try {
                java.util.Objects.toString(mo4183xaf314b5e);
                if (mo4183xaf314b5e != null) {
                    mo4183xaf314b5e.close();
                }
            } finally {
            }
        } catch (java.lang.IllegalStateException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$submitStillCaptureRequest$4 */
    public static /* synthetic */ java.lang.Void m4517x484b97ec(java.util.List list) {
        return null;
    }

    /* renamed from: sendInvalidCameraError */
    private void m4520xfbe4ad14(java.util.concurrent.Executor executor, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OnImageCapturedCallback onImageCapturedCallback, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OnImageSavedCallback onImageSavedCallback) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0524xb471f04 c0524xb471f04 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0524xb471f04(4, "Not bound to a valid Camera [" + this + "]", null);
        if (onImageCapturedCallback != null) {
            onImageCapturedCallback.mo4371xaf8aa769(c0524xb471f04);
        } else {
            if (onImageSavedCallback == null) {
                throw new java.lang.IllegalArgumentException("Must have either in-memory or on-disk callback.");
            }
            onImageSavedCallback.mo4377xaf8aa769(c0524xb471f04);
        }
    }

    /* renamed from: setScreenFlashToCameraControl */
    private void m4521x38cc4a3b() {
        m4522x38cc4a3b(this.f1063x9488c5c);
    }

    /* renamed from: takePictureInternal */
    private void m4523x4dceae54(java.util.concurrent.Executor executor, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OnImageCapturedCallback onImageCapturedCallback, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OnImageSavedCallback onImageSavedCallback, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OutputFileOptions outputFileOptions) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0799x13794b89.m5939x6483284b();
        if (m4527xbb0896fd() == 3 && this.f1063x9488c5c.getScreenFlash() == null) {
            throw new java.lang.IllegalArgumentException("ScreenFlash not set for FLASH_MODE_SCREEN");
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 m4811x1390e61b = m4811x1390e61b();
        if (m4811x1390e61b == null) {
            m4520xfbe4ad14(executor, onImageCapturedCallback, onImageSavedCallback);
            return;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0633xe3071556 c0633xe3071556 = this.f1065x7492b483;
        java.util.Objects.requireNonNull(c0633xe3071556);
        c0633xe3071556.m5074x64365093(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.AbstractC0637xf28cf838.of(executor, onImageCapturedCallback, onImageSavedCallback, outputFileOptions, m4511x25484f5(), m4825xa4435162(), m4820xe02e49e0(m4811x1390e61b), m4509x59ec541e(), m4526xe389a8d3(), this.f1064xcb6d0310.m5621xcb685e4b()));
    }

    /* renamed from: trySetFlashModeToCameraControl */
    private void m4524xcc427151() {
        synchronized (this.f1062x794d0d9c) {
            if (this.f1062x794d0d9c.get() != null) {
                return;
            }
            m4812xa97012c2().mo2995x175c5771(m4527xbb0896fd());
        }
    }

    /* renamed from: enforceSoftwareJpegConstraints */
    public boolean m4525x8c3da9c5(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0730x35b9a1e8 interfaceC0730x35b9a1e8) {
        boolean z17;
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<java.lang.Boolean> option = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0713xaaf0b8ad.f1682xc20b579b;
        java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
        boolean z18 = false;
        if (bool.equals(interfaceC0730x35b9a1e8.mo5380x77ba97d1(option, bool2))) {
            if (m4514x39a982de()) {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.w(TAG, "Software JPEG cannot be used with Extensions.");
                z17 = false;
            } else {
                z17 = true;
            }
            java.lang.Integer num = (java.lang.Integer) interfaceC0730x35b9a1e8.mo5380x77ba97d1(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0713xaaf0b8ad.f1670xf700768c, null);
            if (num == null || num.intValue() == 256) {
                z18 = z17;
            } else {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.w(TAG, "Software JPEG cannot be used with non-JPEG output buffer format.");
            }
            if (!z18) {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.w(TAG, "Unable to support software JPEG. Disabling.");
                interfaceC0730x35b9a1e8.mo5521x25e7888e(option, bool2);
            }
        }
        return z18;
    }

    /* renamed from: getCaptureMode */
    public int m4526xe389a8d3() {
        return this.f1054xb3c0735c;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [androidx.camera.core.impl.UseCaseConfig, androidx.camera.core.impl.UseCaseConfig<?>] */
    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137
    /* renamed from: getDefaultConfig */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?> mo4420xdbd48d2d(boolean z17, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771 interfaceC0769xb8476771) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.Defaults defaults = f1033x7fb79b20;
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 mo3297x1456a638 = interfaceC0769xb8476771.mo3297x1456a638(defaults.mo4473x1456a638().mo3493xe38cfe6a(), m4526xe389a8d3());
        if (z17) {
            mo3297x1456a638 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.m5372xcdb2a19(mo3297x1456a638, defaults.mo4473x1456a638());
        }
        if (mo3297x1456a638 == null) {
            return null;
        }
        return mo4427xa926ae58(mo3297x1456a638).mo4446x111127c3();
    }

    /* renamed from: getFlashMode */
    public int m4527xbb0896fd() {
        int i17;
        synchronized (this.f1062x794d0d9c) {
            i17 = this.f1058x36526fc6;
            if (i17 == -1) {
                i17 = ((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0713xaaf0b8ad) m4814x27802a65()).m5457xbb0896fd(2);
            }
        }
        return i17;
    }

    /* renamed from: getImagePipeline */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0610x6ae15cfd m4528xf8a1e967() {
        return this.f1061x965035b0;
    }

    /* renamed from: getJpegQuality */
    public int m4529x354bfa41() {
        return m4509x59ec541e();
    }

    /* renamed from: getOutputFormat */
    public int m4530x42b80ace() {
        java.lang.Integer num = (java.lang.Integer) m4814x27802a65().mo5380x77ba97d1(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0713xaaf0b8ad.f1678xd71146ab, 0);
        num.getClass();
        return num.intValue();
    }

    /* renamed from: getPostviewResolutionSelector */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.C0955xda4820cb m4531x561648c6() {
        return (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.C0955xda4820cb) m4814x27802a65().mo5380x77ba97d1(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0713xaaf0b8ad.f1680xca481da2, null);
    }

    /* renamed from: getRealtimeCaptureLatencyEstimate */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0530x9aaaab3b m4532x20957c61() {
        android.util.Pair<java.lang.Long, java.lang.Long> mo5650xd2b81c19;
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 m4811x1390e61b = m4811x1390e61b();
        if (m4811x1390e61b != null && (mo5650xd2b81c19 = m4811x1390e61b.mo3093x13f11ad1().m5259xf033da12().mo5650xd2b81c19()) != null) {
            return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0530x9aaaab3b(((java.lang.Long) mo5650xd2b81c19.first).longValue(), ((java.lang.Long) mo5650xd2b81c19.second).longValue());
        }
        return p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0530x9aaaab3b.f1106xc8ed2bf2;
    }

    /* renamed from: getResolutionInfo */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0558xd106e79a m4533xfb57e870() {
        return mo4534xbcbaa34d();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137
    /* renamed from: getResolutionInfoInternal */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0558xd106e79a mo4534xbcbaa34d() {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 m4811x1390e61b = m4811x1390e61b();
        android.util.Size m4810x59ee93f = m4810x59ee93f();
        if (m4811x1390e61b == null || m4810x59ee93f == null) {
            return null;
        }
        android.graphics.Rect m4829xe80fd2f0 = m4829xe80fd2f0();
        android.util.Rational rational = this.f1057x915725b6;
        if (m4829xe80fd2f0 == null) {
            m4829xe80fd2f0 = rational != null ? p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.C0869x431b07dd.m6209x6601831e(m4810x59ee93f, rational) : new android.graphics.Rect(0, 0, m4810x59ee93f.getWidth(), m4810x59ee93f.getHeight());
        }
        int m4820xe02e49e0 = m4820xe02e49e0(m4811x1390e61b);
        java.util.Objects.requireNonNull(m4829xe80fd2f0);
        return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0558xd106e79a(m4810x59ee93f, m4829xe80fd2f0, m4820xe02e49e0);
    }

    /* renamed from: getResolutionSelector */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.C0955xda4820cb m4535x7fe0c6a1() {
        return ((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e) m4814x27802a65()).m5488x7fe0c6a1(null);
    }

    /* renamed from: getScreenFlash */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.ScreenFlash m4536xd5e0e9ae() {
        return this.f1063x9488c5c.getScreenFlash();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137
    /* renamed from: getSupportedEffectTargets */
    public java.util.Set<java.lang.Integer> mo4537x748d4719() {
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add(4);
        return hashSet;
    }

    /* renamed from: getTakePictureManager */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0633xe3071556 m4538x889fbb2c() {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0633xe3071556 c0633xe3071556 = this.f1065x7492b483;
        java.util.Objects.requireNonNull(c0633xe3071556);
        return c0633xe3071556;
    }

    /* renamed from: getTargetRotation */
    public int m4539x8d4b9125() {
        return m4828x68e8c702();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137
    /* renamed from: getUseCaseConfigBuilder */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.Builder<?, ?, ?> mo4427xa926ae58(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 interfaceC0692x78a46f62) {
        return p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.Builder.m4557x650a9f8c(interfaceC0692x78a46f62);
    }

    /* renamed from: isPostviewEnabled */
    public boolean m4540xaec6c9b2() {
        return ((java.lang.Boolean) m4814x27802a65().mo5380x77ba97d1(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0713xaaf0b8ad.f1679xbd0ddab1, java.lang.Boolean.FALSE)).booleanValue();
    }

    /* renamed from: isProcessingPipelineEnabled */
    public boolean m4541x560f54a2() {
        return (this.f1061x965035b0 == null || this.f1065x7492b483 == null) ? false : true;
    }

    /* renamed from: lockFlashMode */
    public void m4542xd77e20c8() {
        synchronized (this.f1062x794d0d9c) {
            if (this.f1062x794d0d9c.get() != null) {
                return;
            }
            this.f1062x794d0d9c.set(java.lang.Integer.valueOf(m4527xbb0896fd()));
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137
    /* renamed from: onBind */
    public void mo4429xc3979ebc() {
        m3.h.d(m4811x1390e61b(), "Attached camera cannot be null");
        if (m4527xbb0896fd() == 3 && m4506x764e75b9() != 0) {
            throw new java.lang.IllegalArgumentException("Not a front camera despite setting FLASH_MODE_SCREEN in ImageCapture");
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137
    /* renamed from: onCameraControlReady */
    public void mo4543xec538e4a() {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "onCameraControlReady");
        m4524xcc427151();
        m4521x38cc4a3b();
    }

    /* JADX WARN: Type inference failed for: r5v15, types: [androidx.camera.core.impl.UseCaseConfig, androidx.camera.core.impl.UseCaseConfig<?>] */
    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137
    /* renamed from: onMergeConfig */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?> mo4430xc74923b(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0675x66574570 interfaceC0675x66574570, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.Builder<?, ?, ?> builder) {
        if (interfaceC0675x66574570.mo3162x25ef6270().m5568xde2d761f(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p046xaf3f3382.p047x66f27be.InterfaceC0859x5340759f.class)) {
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0730x35b9a1e8 mo2889xc37a2e52 = builder.mo2889xc37a2e52();
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<java.lang.Boolean> option = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0713xaaf0b8ad.f1682xc20b579b;
            java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
            if (bool.equals(mo2889xc37a2e52.mo5380x77ba97d1(option, bool2))) {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.w(TAG, "Device quirk suggests software JPEG encoder, but it has been explicitly disabled.");
            } else {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.i(TAG, "Requesting software JPEG due to device quirk.");
                builder.mo2889xc37a2e52().mo5521x25e7888e(option, bool2);
            }
        }
        boolean m4525x8c3da9c5 = m4525x8c3da9c5(builder.mo2889xc37a2e52());
        java.lang.Integer num = (java.lang.Integer) builder.mo2889xc37a2e52().mo5380x77ba97d1(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0713xaaf0b8ad.f1670xf700768c, null);
        if (num != null) {
            m3.h.b(!m4514x39a982de() || num.intValue() == 256, "Cannot set non-JPEG buffer format with Extensions enabled.");
            builder.mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0716x5f72b371.f1687x12b109b6, java.lang.Integer.valueOf(m4525x8c3da9c5 ? 35 : num.intValue()));
        } else if (m4513xd4f3606c(builder.mo2889xc37a2e52())) {
            builder.mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0716x5f72b371.f1687x12b109b6, 4101);
            builder.mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0716x5f72b371.f1686x1d477a5e, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e.f954x1f661f17);
        } else if (m4525x8c3da9c5) {
            builder.mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0716x5f72b371.f1687x12b109b6, 35);
        } else {
            java.util.List list = (java.util.List) builder.mo2889xc37a2e52().mo5380x77ba97d1(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e.f1695x2ed2d6ac, null);
            if (list == null) {
                builder.mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0716x5f72b371.f1687x12b109b6, 256);
            } else if (m4512xf2c5d7e6(list, 256)) {
                builder.mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0716x5f72b371.f1687x12b109b6, 256);
            } else if (m4512xf2c5d7e6(list, 35)) {
                builder.mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0716x5f72b371.f1687x12b109b6, 35);
            }
        }
        return builder.mo4446x111127c3();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137
    /* renamed from: onStateDetached */
    public void mo4544xb1757784() {
        m4500x140c919f();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137
    /* renamed from: onSuggestedStreamSpecImplementationOptionsUpdated */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b mo4431x6f6af6ae(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 interfaceC0692x78a46f62) {
        this.f1064xcb6d0310.m5610x2f697c6b(interfaceC0692x78a46f62);
        java.lang.Object[] objArr = {this.f1064xcb6d0310.m5619x59bc66e()};
        java.util.ArrayList arrayList = new java.util.ArrayList(1);
        java.lang.Object obj = objArr[0];
        java.util.Objects.requireNonNull(obj);
        arrayList.add(obj);
        m4844xd8cf6f2f(java.util.Collections.unmodifiableList(arrayList));
        return m4809xfdddfa15().mo5194xaaa148a0().mo5199x9a12cb4a(interfaceC0692x78a46f62).mo5196x59bc66e();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137
    /* renamed from: onSuggestedStreamSpecUpdated */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b mo4432x35ddf13c(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b abstractC0756x2f9ad77b, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b abstractC0756x2f9ad77b2) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.Builder m4505x20cff3be = m4505x20cff3be(m4813x72efd496(), (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0713xaaf0b8ad) m4814x27802a65(), abstractC0756x2f9ad77b);
        this.f1064xcb6d0310 = m4505x20cff3be;
        java.lang.Object[] objArr = {m4505x20cff3be.m5619x59bc66e()};
        java.util.ArrayList arrayList = new java.util.ArrayList(1);
        java.lang.Object obj = objArr[0];
        java.util.Objects.requireNonNull(obj);
        arrayList.add(obj);
        m4844xd8cf6f2f(java.util.Collections.unmodifiableList(arrayList));
        m4834x37f5a7af();
        return abstractC0756x2f9ad77b;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137
    /* renamed from: onUnbind */
    public void mo4433x5cd81515() {
        m4500x140c919f();
        m4502xbdd2280f();
        m4522x38cc4a3b(null);
    }

    /* renamed from: setCropAspectRatio */
    public void m4545xdce16121(android.util.Rational rational) {
        this.f1057x915725b6 = rational;
    }

    /* renamed from: setFlashMode */
    public void m4546x175c5771(int i17) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "setFlashMode: flashMode = " + i17);
        if (i17 != 0 && i17 != 1 && i17 != 2) {
            if (i17 != 3) {
                throw new java.lang.IllegalArgumentException("Invalid flash mode: " + i17);
            }
            if (this.f1063x9488c5c.getScreenFlash() == null) {
                throw new java.lang.IllegalArgumentException("ScreenFlash not set for FLASH_MODE_SCREEN");
            }
            if (m4811x1390e61b() != null && m4506x764e75b9() != 0) {
                throw new java.lang.IllegalArgumentException("Not a front camera despite setting FLASH_MODE_SCREEN");
            }
        }
        synchronized (this.f1062x794d0d9c) {
            this.f1058x36526fc6 = i17;
            m4524xcc427151();
        }
    }

    /* renamed from: setScreenFlash */
    public void m4547x6c465d22(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.ScreenFlash screenFlash) {
        this.f1063x9488c5c = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.C0836x77bced2f.m6106x3017aa(screenFlash);
        m4521x38cc4a3b();
    }

    /* renamed from: setTargetRotation */
    public void m4548x5541f931(int i17) {
        int m4539x8d4b9125 = m4539x8d4b9125();
        if (!m4842x9b2c630e(i17) || this.f1057x915725b6 == null) {
            return;
        }
        this.f1057x915725b6 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.C0869x431b07dd.m6217xf04e9260(java.lang.Math.abs(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0781x213ce7ed.m5808x82c0521(i17) - p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0781x213ce7ed.m5808x82c0521(m4539x8d4b9125)), this.f1057x915725b6);
    }

    /* renamed from: submitStillCaptureRequest */
    public wa.a m4549xe2f970f9(java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08> list) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0799x13794b89.m5939x6483284b();
        return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6030x3ebe6b6c(m4812xa97012c2().mo3004x7c34ae9a(list, this.f1054xb3c0735c, this.f1059x3655c55d), new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0520x5772be78(), p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5978x5ebfffdc());
    }

    /* renamed from: takePicture, reason: merged with bridge method [inline-methods] */
    public void m4518xf1e63327(final java.util.concurrent.Executor executor, final p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OnImageCapturedCallback onImageCapturedCallback) {
        if (android.os.Looper.getMainLooper() != android.os.Looper.myLooper()) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5982x891c9b16().execute(new java.lang.Runnable() { // from class: androidx.camera.core.ImageCapture$$e
                @Override // java.lang.Runnable
                public final void run() {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.this.m4518xf1e63327(executor, onImageCapturedCallback);
                }
            });
        } else {
            m4523x4dceae54(executor, onImageCapturedCallback, null, null);
        }
    }

    /* renamed from: toString */
    public java.lang.String m4552x9616526c() {
        return "ImageCapture:" + m4818xfb82e301();
    }

    /* renamed from: unlockFlashMode */
    public void m4553xf61252cf() {
        synchronized (this.f1062x794d0d9c) {
            java.lang.Integer andSet = this.f1062x794d0d9c.getAndSet(null);
            if (andSet == null) {
                return;
            }
            if (andSet.intValue() != m4527xbb0896fd()) {
                m4524xcc427151();
            }
        }
    }

    /* renamed from: clearPipeline */
    private void m4503xbdd2280f(boolean z17) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0633xe3071556 c0633xe3071556;
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0799x13794b89.m5939x6483284b();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.CloseableErrorListener closeableErrorListener = this.f1055xb6dbcd77;
        if (closeableErrorListener != null) {
            closeableErrorListener.m5633x5a5ddf8();
            this.f1055xb6dbcd77 = null;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0610x6ae15cfd c0610x6ae15cfd = this.f1061x965035b0;
        if (c0610x6ae15cfd != null) {
            c0610x6ae15cfd.m4968x5a5ddf8();
            this.f1061x965035b0 = null;
        }
        if (z17 || (c0633xe3071556 = this.f1065x7492b483) == null) {
            return;
        }
        c0633xe3071556.m5068xc4f0b714();
        this.f1065x7492b483 = null;
    }

    /* renamed from: setScreenFlashToCameraControl */
    private void m4522x38cc4a3b(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.ScreenFlash screenFlash) {
        m4812xa97012c2().mo2998x6c465d22(screenFlash);
    }

    /* renamed from: takePicture, reason: merged with bridge method [inline-methods] */
    public void m4519xf1e63328(final p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OutputFileOptions outputFileOptions, final java.util.concurrent.Executor executor, final p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.OnImageSavedCallback onImageSavedCallback) {
        if (android.os.Looper.getMainLooper() != android.os.Looper.myLooper()) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5982x891c9b16().execute(new java.lang.Runnable() { // from class: androidx.camera.core.ImageCapture$$b
                @Override // java.lang.Runnable
                public final void run() {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.this.m4519xf1e63328(outputFileOptions, executor, onImageSavedCallback);
                }
            });
        } else {
            m4523x4dceae54(executor, null, onImageSavedCallback, outputFileOptions);
        }
    }
}
