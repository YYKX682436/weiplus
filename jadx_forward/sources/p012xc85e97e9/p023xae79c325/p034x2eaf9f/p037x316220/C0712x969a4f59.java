package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220;

/* renamed from: androidx.camera.core.impl.ImageAnalysisConfig */
/* loaded from: classes14.dex */
public final class C0712x969a4f59 implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0505x43fee537>, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.InterfaceC0841xc9cca20c {

    /* renamed from: mConfig */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0735xc905e4a0 f1669xfeabaa0f;

    /* renamed from: OPTION_BACKPRESSURE_STRATEGY */
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<java.lang.Integer> f1663x3ef851dc = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option.m5382xaf65a0fc("camerax.core.imageAnalysis.backpressureStrategy", p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0505x43fee537.BackpressureStrategy.class);

    /* renamed from: OPTION_IMAGE_QUEUE_DEPTH */
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<java.lang.Integer> f1664xce3c3f87 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option.m5382xaf65a0fc("camerax.core.imageAnalysis.imageQueueDepth", java.lang.Integer.TYPE);

    /* renamed from: OPTION_IMAGE_READER_PROXY_PROVIDER */
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0539xe9692941> f1665xf3c9daf0 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option.m5382xaf65a0fc("camerax.core.imageAnalysis.imageReaderProxyProvider", p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0539xe9692941.class);

    /* renamed from: OPTION_OUTPUT_IMAGE_FORMAT */
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<java.lang.Integer> f1667x6c7af32f = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option.m5382xaf65a0fc("camerax.core.imageAnalysis.outputImageFormat", p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0505x43fee537.OutputImageFormat.class);

    /* renamed from: OPTION_ONE_PIXEL_SHIFT_ENABLED */
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<java.lang.Boolean> f1666x2a41c4e8 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option.m5382xaf65a0fc("camerax.core.imageAnalysis.onePixelShiftEnabled", java.lang.Boolean.class);

    /* renamed from: OPTION_OUTPUT_IMAGE_ROTATION_ENABLED */
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<java.lang.Boolean> f1668x435bc098 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option.m5382xaf65a0fc("camerax.core.imageAnalysis.outputImageRotationEnabled", java.lang.Boolean.class);

    public C0712x969a4f59(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0735xc905e4a0 c0735xc905e4a0) {
        this.f1669xfeabaa0f = c0735xc905e4a0;
    }

    /* renamed from: getBackpressureStrategy */
    public int m5442x2f0d1c35(int i17) {
        return ((java.lang.Integer) mo5380x77ba97d1(f1663x3ef851dc, java.lang.Integer.valueOf(i17))).intValue();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0745x2e0bb72
    /* renamed from: getConfig */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 mo3494x1456a638() {
        return this.f1669xfeabaa0f;
    }

    /* renamed from: getImageQueueDepth */
    public int m5444x90365b7(int i17) {
        return ((java.lang.Integer) mo5380x77ba97d1(f1664xce3c3f87, java.lang.Integer.valueOf(i17))).intValue();
    }

    /* renamed from: getImageReaderProxyProvider */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0539xe9692941 m5445x99a79697() {
        return (p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0539xe9692941) mo5380x77ba97d1(f1665xf3c9daf0, null);
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0716x5f72b371
    /* renamed from: getInputFormat */
    public int mo5446xb124032b() {
        return 35;
    }

    /* renamed from: getOnePixelShiftEnabled */
    public java.lang.Boolean m5447xf47bb4b5(java.lang.Boolean bool) {
        return (java.lang.Boolean) mo5380x77ba97d1(f1666x2a41c4e8, bool);
    }

    /* renamed from: getOutputImageFormat */
    public int m5448x39f8f8bb(int i17) {
        return ((java.lang.Integer) mo5380x77ba97d1(f1667x6c7af32f, java.lang.Integer.valueOf(i17))).intValue();
    }

    /* renamed from: isOutputImageRotationEnabled */
    public java.lang.Boolean m5449x33940273(java.lang.Boolean bool) {
        return (java.lang.Boolean) mo5380x77ba97d1(f1668x435bc098, bool);
    }

    /* renamed from: getBackpressureStrategy */
    public int m5441x2f0d1c35() {
        return ((java.lang.Integer) mo5379x77ba97d1(f1663x3ef851dc)).intValue();
    }

    /* renamed from: getImageQueueDepth */
    public int m5443x90365b7() {
        return ((java.lang.Integer) mo5379x77ba97d1(f1664xce3c3f87)).intValue();
    }
}
