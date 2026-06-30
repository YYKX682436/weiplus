package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220;

/* renamed from: androidx.camera.core.impl.ImageCaptureConfig */
/* loaded from: classes14.dex */
public final class C0713xaaf0b8ad implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b>, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.InterfaceC0835x7adec28 {

    /* renamed from: OPTION_BUFFER_FORMAT */
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<java.lang.Integer> f1670xf700768c;

    /* renamed from: OPTION_CAPTURE_BUNDLE */
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0689x87960748> f1671x6651f0c5;

    /* renamed from: OPTION_FLASH_MODE */
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<java.lang.Integer> f1672x511f42bc;

    /* renamed from: OPTION_FLASH_TYPE */
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<java.lang.Integer> f1673x51229853;

    /* renamed from: OPTION_IMAGE_CAPTURE_MODE */
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<java.lang.Integer> f1674xa81db3aa;

    /* renamed from: OPTION_IMAGE_READER_PROXY_PROVIDER */
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0539xe9692941> f1675xf3c9daf0;

    /* renamed from: OPTION_JPEG_COMPRESSION_QUALITY */
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<java.lang.Integer> f1676x8b91f119;

    /* renamed from: OPTION_MAX_CAPTURE_STAGES */
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<java.lang.Integer> f1677x42cbdcd3;

    /* renamed from: OPTION_OUTPUT_FORMAT */
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<java.lang.Integer> f1678xd71146ab;

    /* renamed from: OPTION_POSTVIEW_ENABLED */
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<java.lang.Boolean> f1679xbd0ddab1;

    /* renamed from: OPTION_POSTVIEW_RESOLUTION_SELECTOR */
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.C0955xda4820cb> f1680xca481da2;

    /* renamed from: OPTION_SCREEN_FLASH */
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.ScreenFlash> f1681x2ec5a1c7;

    /* renamed from: OPTION_USE_SOFTWARE_JPEG_ENCODER */
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<java.lang.Boolean> f1682xc20b579b;

    /* renamed from: mConfig */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0735xc905e4a0 f1683xfeabaa0f;

    static {
        java.lang.Class cls = java.lang.Integer.TYPE;
        f1674xa81db3aa = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option.m5382xaf65a0fc("camerax.core.imageCapture.captureMode", cls);
        f1672x511f42bc = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option.m5382xaf65a0fc("camerax.core.imageCapture.flashMode", cls);
        f1671x6651f0c5 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option.m5382xaf65a0fc("camerax.core.imageCapture.captureBundle", p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0689x87960748.class);
        f1670xf700768c = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option.m5382xaf65a0fc("camerax.core.imageCapture.bufferFormat", java.lang.Integer.class);
        f1678xd71146ab = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option.m5382xaf65a0fc("camerax.core.imageCapture.outputFormat", java.lang.Integer.class);
        f1677x42cbdcd3 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option.m5382xaf65a0fc("camerax.core.imageCapture.maxCaptureStages", java.lang.Integer.class);
        f1675xf3c9daf0 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option.m5382xaf65a0fc("camerax.core.imageCapture.imageReaderProxyProvider", p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0539xe9692941.class);
        f1682xc20b579b = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option.m5382xaf65a0fc("camerax.core.imageCapture.useSoftwareJpegEncoder", java.lang.Boolean.TYPE);
        f1673x51229853 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option.m5382xaf65a0fc("camerax.core.imageCapture.flashType", cls);
        f1676x8b91f119 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option.m5382xaf65a0fc("camerax.core.imageCapture.jpegCompressionQuality", cls);
        f1681x2ec5a1c7 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option.m5382xaf65a0fc("camerax.core.imageCapture.screenFlash", p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.ScreenFlash.class);
        f1680xca481da2 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option.m5382xaf65a0fc("camerax.core.useCase.postviewResolutionSelector", p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.C0955xda4820cb.class);
        f1679xbd0ddab1 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option.m5382xaf65a0fc("camerax.core.useCase.isPostviewEnabled", java.lang.Boolean.class);
    }

    public C0713xaaf0b8ad(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0735xc905e4a0 c0735xc905e4a0) {
        this.f1683xfeabaa0f = c0735xc905e4a0;
    }

    /* renamed from: getBufferFormat */
    public java.lang.Integer m5452xd022dacd(java.lang.Integer num) {
        return (java.lang.Integer) mo5380x77ba97d1(f1670xf700768c, num);
    }

    /* renamed from: getCaptureBundle */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0689x87960748 m5454x155693b2(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0689x87960748 interfaceC0689x87960748) {
        return (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0689x87960748) mo5380x77ba97d1(f1671x6651f0c5, interfaceC0689x87960748);
    }

    /* renamed from: getCaptureMode */
    public int m5455xe389a8d3() {
        return ((java.lang.Integer) mo5379x77ba97d1(f1674xa81db3aa)).intValue();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0745x2e0bb72
    /* renamed from: getConfig */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 mo3494x1456a638() {
        return this.f1683xfeabaa0f;
    }

    /* renamed from: getFlashMode */
    public int m5457xbb0896fd(int i17) {
        return ((java.lang.Integer) mo5380x77ba97d1(f1672x511f42bc, java.lang.Integer.valueOf(i17))).intValue();
    }

    /* renamed from: getFlashType */
    public int m5459xbb0bec94(int i17) {
        return ((java.lang.Integer) mo5380x77ba97d1(f1673x51229853, java.lang.Integer.valueOf(i17))).intValue();
    }

    /* renamed from: getImageReaderProxyProvider */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0539xe9692941 m5460x99a79697() {
        return (p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0539xe9692941) mo5380x77ba97d1(f1675xf3c9daf0, null);
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0716x5f72b371
    /* renamed from: getInputFormat */
    public int mo5446xb124032b() {
        return ((java.lang.Integer) mo5379x77ba97d1(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0716x5f72b371.f1687x12b109b6)).intValue();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.InterfaceC0835x7adec28
    /* renamed from: getIoExecutor */
    public java.util.concurrent.Executor mo5462xe7ac9c0f(java.util.concurrent.Executor executor) {
        return (java.util.concurrent.Executor) mo5380x77ba97d1(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.InterfaceC0835x7adec28.f2079x4183cf02, executor);
    }

    /* renamed from: getJpegQuality */
    public int m5464x354bfa41(int i17) {
        return ((java.lang.Integer) mo5380x77ba97d1(f1676x8b91f119, java.lang.Integer.valueOf(i17))).intValue();
    }

    /* renamed from: getMaxCaptureStages */
    public int m5466x4392188d(int i17) {
        return ((java.lang.Integer) mo5380x77ba97d1(f1677x42cbdcd3, java.lang.Integer.valueOf(i17))).intValue();
    }

    /* renamed from: getPostviewResolutionSelector */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.C0955xda4820cb m5467x561648c6() {
        return (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.C0955xda4820cb) mo5380x77ba97d1(f1680xca481da2, null);
    }

    /* renamed from: getScreenFlash */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.ScreenFlash m5468xd5e0e9ae() {
        return (p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.ScreenFlash) mo5380x77ba97d1(f1681x2ec5a1c7, null);
    }

    /* renamed from: hasCaptureMode */
    public boolean m5469x3a9b30f() {
        return mo5374xdccd9774(f1674xa81db3aa);
    }

    /* renamed from: isPostviewEnabled */
    public boolean m5470xaec6c9b2() {
        return ((java.lang.Boolean) mo5380x77ba97d1(f1679xbd0ddab1, java.lang.Boolean.FALSE)).booleanValue();
    }

    /* renamed from: isSoftwareJpegEncoderRequested */
    public boolean m5471xce0ee0cb() {
        return ((java.lang.Boolean) mo5380x77ba97d1(f1682xc20b579b, java.lang.Boolean.FALSE)).booleanValue();
    }

    /* renamed from: getBufferFormat */
    public java.lang.Integer m5451xd022dacd() {
        return (java.lang.Integer) mo5379x77ba97d1(f1670xf700768c);
    }

    /* renamed from: getCaptureBundle */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0689x87960748 m5453x155693b2() {
        return (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0689x87960748) mo5379x77ba97d1(f1671x6651f0c5);
    }

    /* renamed from: getFlashMode */
    public int m5456xbb0896fd() {
        return ((java.lang.Integer) mo5379x77ba97d1(f1672x511f42bc)).intValue();
    }

    /* renamed from: getFlashType */
    public int m5458xbb0bec94() {
        return ((java.lang.Integer) mo5379x77ba97d1(f1673x51229853)).intValue();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.InterfaceC0835x7adec28
    /* renamed from: getIoExecutor */
    public java.util.concurrent.Executor mo5461xe7ac9c0f() {
        return (java.util.concurrent.Executor) mo5379x77ba97d1(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.InterfaceC0835x7adec28.f2079x4183cf02);
    }

    /* renamed from: getJpegQuality */
    public int m5463x354bfa41() {
        return ((java.lang.Integer) mo5379x77ba97d1(f1676x8b91f119)).intValue();
    }

    /* renamed from: getMaxCaptureStages */
    public int m5465x4392188d() {
        return ((java.lang.Integer) mo5379x77ba97d1(f1677x42cbdcd3)).intValue();
    }
}
