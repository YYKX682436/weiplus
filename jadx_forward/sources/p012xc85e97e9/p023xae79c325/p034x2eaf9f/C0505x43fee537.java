package p012xc85e97e9.p023xae79c325.p034x2eaf9f;

/* renamed from: androidx.camera.core.ImageAnalysis */
/* loaded from: classes14.dex */
public final class C0505x43fee537 extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137 {

    /* renamed from: COORDINATE_SYSTEM_ORIGINAL */
    public static final int f974x85a1911a = 0;

    /* renamed from: COORDINATE_SYSTEM_SENSOR */
    public static final int f975xd71b9d43 = 2;

    /* renamed from: COORDINATE_SYSTEM_VIEW_REFERENCED */
    public static final int f976xc04de4ea = 1;

    /* renamed from: DEFAULT_BACKPRESSURE_STRATEGY */
    private static final int f977x6b236e88 = 0;

    /* renamed from: DEFAULT_IMAGE_QUEUE_DEPTH */
    private static final int f979xe3689233 = 6;

    /* renamed from: DEFAULT_OUTPUT_IMAGE_FORMAT */
    private static final int f981xe7dd4adb = 1;

    /* renamed from: DEFAULT_OUTPUT_IMAGE_ROTATION_ENABLED */
    private static final boolean f982x2ea57144 = false;

    /* renamed from: NON_BLOCKING_IMAGE_DEPTH */
    private static final int f983xb760abe7 = 4;

    /* renamed from: OUTPUT_IMAGE_FORMAT_RGBA_8888 */
    public static final int f984x79cb9b65 = 2;

    /* renamed from: OUTPUT_IMAGE_FORMAT_YUV_420_888 */
    public static final int f985x780b5520 = 1;

    /* renamed from: STRATEGY_BLOCK_PRODUCER */
    public static final int f986x9100f570 = 1;

    /* renamed from: STRATEGY_KEEP_ONLY_LATEST */
    public static final int f987x94c2d50c = 0;
    private static final java.lang.String TAG = "ImageAnalysis";

    /* renamed from: mAnalysisLock */
    private final java.lang.Object f988x2f5cb734;

    /* renamed from: mCloseableErrorListener */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.CloseableErrorListener f989xb6dbcd77;

    /* renamed from: mDeferrableSurface */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293 f990x176749c6;

    /* renamed from: mImageAnalysisAbstractAnalyzer */
    final p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0510x4c133a3f f991x95984cf2;

    /* renamed from: mSessionConfigBuilder */
    p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.Builder f992xcb6d0310;

    /* renamed from: mSubscribedAnalyzer */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0505x43fee537.Analyzer f993xaae8de6d;

    /* renamed from: DEFAULT_CONFIG */
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0505x43fee537.Defaults f978x7fb79b20 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0505x43fee537.Defaults();

    /* renamed from: DEFAULT_ONE_PIXEL_SHIFT_ENABLED */
    private static final java.lang.Boolean f980xf8186694 = null;

    /* renamed from: androidx.camera.core.ImageAnalysis$Analyzer */
    /* loaded from: classes14.dex */
    public interface Analyzer {
        /* renamed from: analyze */
        void mo4440xcc7b5d4c(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 interfaceC0536x1ffeadf3);

        /* renamed from: getDefaultTargetResolution */
        default android.util.Size m4441x546fa548() {
            return null;
        }

        /* renamed from: getTargetCoordinateSystem */
        default int m4442x762c46e() {
            return 0;
        }

        /* renamed from: updateTransform */
        default void m4443x869924a3(android.graphics.Matrix matrix) {
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* renamed from: androidx.camera.core.ImageAnalysis$BackpressureStrategy */
    /* loaded from: classes6.dex */
    public @interface BackpressureStrategy {
    }

    /* renamed from: androidx.camera.core.ImageAnalysis$Builder */
    /* loaded from: classes14.dex */
    public static final class Builder implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e.Builder<p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0505x43fee537.Builder>, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.InterfaceC0841xc9cca20c.Builder<p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0505x43fee537.Builder>, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.Builder<p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0505x43fee537, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0712x969a4f59, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0505x43fee537.Builder>, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0716x5f72b371.Builder<p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0505x43fee537.Builder> {

        /* renamed from: mMutableConfig */
        private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0731x74f1ef5a f994x61287a9b;

        public Builder() {
            this(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0731x74f1ef5a.m5524xaf65a0fc());
        }

        /* renamed from: fromConfig */
        public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0505x43fee537.Builder m4444x650a9f8c(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 interfaceC0692x78a46f62) {
            return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0505x43fee537.Builder(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0731x74f1ef5a.m5525x3017aa(interfaceC0692x78a46f62));
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0501xb43e0567
        /* renamed from: getMutableConfig */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0730x35b9a1e8 mo2889xc37a2e52() {
            return this.f994x61287a9b;
        }

        /* renamed from: setBackpressureStrategy */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0505x43fee537.Builder m4448xa9604b41(int i17) {
            mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0712x969a4f59.f1663x3ef851dc, java.lang.Integer.valueOf(i17));
            return this;
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e.Builder
        /* renamed from: setCustomOrderedResolutions */
        public /* bridge */ /* synthetic */ p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0505x43fee537.Builder mo4451xd3ebe6d(java.util.List list) {
            return mo4451xd3ebe6d((java.util.List<android.util.Size>) list);
        }

        /* renamed from: setImageQueueDepth */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0505x43fee537.Builder m4457x3fd9ff2b(int i17) {
            mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0712x969a4f59.f1664xce3c3f87, java.lang.Integer.valueOf(i17));
            return this;
        }

        /* renamed from: setImageReaderProxyProvider */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0505x43fee537.Builder m4458x49745fa3(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0539xe9692941 interfaceC0539xe9692941) {
            mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0712x969a4f59.f1665xf3c9daf0, interfaceC0539xe9692941);
            return this;
        }

        /* renamed from: setOnePixelShiftEnabled */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0505x43fee537.Builder m4461x6ecee3c1(boolean z17) {
            mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0712x969a4f59.f1666x2a41c4e8, java.lang.Boolean.valueOf(z17));
            return this;
        }

        /* renamed from: setOutputImageFormat */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0505x43fee537.Builder m4462x158f052f(int i17) {
            mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0712x969a4f59.f1667x6c7af32f, java.lang.Integer.valueOf(i17));
            return this;
        }

        /* renamed from: setOutputImageRotationEnabled */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0505x43fee537.Builder m4463x38849bab(boolean z17) {
            mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0712x969a4f59.f1668x435bc098, java.lang.Boolean.valueOf(z17));
            return this;
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e.Builder
        /* renamed from: setSupportedResolutions */
        public /* bridge */ /* synthetic */ p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0505x43fee537.Builder mo4466x9b56433b(java.util.List list) {
            return mo4466x9b56433b((java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>>) list);
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.InterfaceC0840xcdfd0453.Builder
        /* renamed from: setTargetClass */
        public /* bridge */ /* synthetic */ java.lang.Object mo4354xf26d54a5(java.lang.Class cls) {
            return mo4354xf26d54a5((java.lang.Class<p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0505x43fee537>) cls);
        }

        private Builder(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0731x74f1ef5a c0731x74f1ef5a) {
            this.f994x61287a9b = c0731x74f1ef5a;
            java.lang.Class cls = (java.lang.Class) c0731x74f1ef5a.mo5380x77ba97d1(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.InterfaceC0840xcdfd0453.f2094x7271dcb4, null);
            if (cls != null && !cls.equals(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0505x43fee537.class)) {
                throw new java.lang.IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            mo4450x79f271de(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.CaptureType.IMAGE_ANALYSIS);
            mo4354xf26d54a5(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0505x43fee537.class);
        }

        /* renamed from: fromConfig */
        public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0505x43fee537.Builder m4445x650a9f8c(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0712x969a4f59 c0712x969a4f59) {
            return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0505x43fee537.Builder(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0731x74f1ef5a.m5525x3017aa((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62) c0712x969a4f59));
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0501xb43e0567
        /* renamed from: build */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0505x43fee537 mo2888x59bc66e() {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0712x969a4f59 mo4446x111127c3 = mo4446x111127c3();
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e.m5478xd0bfdff8(mo4446x111127c3);
            return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0505x43fee537(mo4446x111127c3);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.Builder
        /* renamed from: getUseCaseConfig */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0712x969a4f59 mo4446x111127c3() {
            return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0712x969a4f59(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0735xc905e4a0.m5538x3017aa(this.f994x61287a9b));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.InterfaceC0841xc9cca20c.Builder
        /* renamed from: setBackgroundExecutor */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0505x43fee537.Builder mo4447x1de78823(java.util.concurrent.Executor executor) {
            mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.InterfaceC0841xc9cca20c.f2096x863889fa, executor);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.Builder
        /* renamed from: setCaptureOptionUnpacker */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0505x43fee537.Builder mo4449x89aad198(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08.OptionUnpacker optionUnpacker) {
            mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.f1828x70d747d9, optionUnpacker);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.Builder
        /* renamed from: setCaptureType */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0505x43fee537.Builder mo4450x79f271de(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.CaptureType captureType) {
            mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.f1829x7803883d, captureType);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e.Builder
        /* renamed from: setCustomOrderedResolutions */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0505x43fee537.Builder mo4451xd3ebe6d(java.util.List<android.util.Size> list) {
            mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e.f1690x228c71, list);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.Builder
        /* renamed from: setDefaultCaptureConfig */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0505x43fee537.Builder mo4452x8bbd60e9(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08 c0690x88f65a08) {
            mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.f1830x55dfff63, c0690x88f65a08);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e.Builder
        /* renamed from: setDefaultResolution */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0505x43fee537.Builder mo4453xe20fa18b(android.util.Size size) {
            mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e.f1691xcde9ad94, size);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.Builder
        /* renamed from: setDefaultSessionConfig */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0505x43fee537.Builder mo4454xe586039(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 c0750xb915958) {
            mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.f1831x26a4ea13, c0750xb915958);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0716x5f72b371.Builder
        /* renamed from: setDynamicRange */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0505x43fee537.Builder mo4455xb924c5c0(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e c0491x2bb48c5e) {
            if (java.util.Objects.equals(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e.SDR, c0491x2bb48c5e)) {
                mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0716x5f72b371.f1686x1d477a5e, c0491x2bb48c5e);
                return this;
            }
            throw new java.lang.UnsupportedOperationException("ImageAnalysis currently only supports SDR");
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.Builder
        /* renamed from: setHighResolutionDisabled */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0505x43fee537.Builder mo4456xcfdff38c(boolean z17) {
            mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.f1832x6e134b1c, java.lang.Boolean.valueOf(z17));
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e.Builder
        /* renamed from: setMaxResolution */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0505x43fee537.Builder mo4459xaaf6afee(android.util.Size size) {
            mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e.f1692xe906b791, size);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e.Builder
        /* renamed from: setMirrorMode */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0505x43fee537.Builder mo4460x845d2804(int i17) {
            throw new java.lang.UnsupportedOperationException("setMirrorMode is not supported.");
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e.Builder
        /* renamed from: setResolutionSelector */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0505x43fee537.Builder mo4464x170c48ad(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.C0955xda4820cb c0955xda4820cb) {
            mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e.f1694xa42c6f48, c0955xda4820cb);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.Builder
        /* renamed from: setSessionOptionUnpacker */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0505x43fee537.Builder mo4465x523980e8(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.OptionUnpacker optionUnpacker) {
            mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.f1834x50776329, optionUnpacker);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e.Builder
        /* renamed from: setSupportedResolutions */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0505x43fee537.Builder mo4466x9b56433b(java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>> list) {
            mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e.f1695x2ed2d6ac, list);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.Builder
        /* renamed from: setSurfaceOccupancyPriority */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0505x43fee537.Builder mo4467x678fae66(int i17) {
            mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.f1835x80437872, java.lang.Integer.valueOf(i17));
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e.Builder
        @java.lang.Deprecated
        /* renamed from: setTargetAspectRatio */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0505x43fee537.Builder mo4468x52ad1800(int i17) {
            if (i17 == -1) {
                i17 = 0;
            }
            mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e.f1696x64f6b668, java.lang.Integer.valueOf(i17));
            return this;
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.InterfaceC0840xcdfd0453.Builder
        /* renamed from: setTargetClass */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0505x43fee537.Builder mo4354xf26d54a5(java.lang.Class<p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0505x43fee537> cls) {
            mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.InterfaceC0840xcdfd0453.f2094x7271dcb4, cls);
            if (mo2889xc37a2e52().mo5380x77ba97d1(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.InterfaceC0840xcdfd0453.f2095xc1a56baf, null) == null) {
                mo4355x396335be(cls.getCanonicalName() + "-" + java.util.UUID.randomUUID());
            }
            return this;
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.InterfaceC0840xcdfd0453.Builder
        /* renamed from: setTargetName */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0505x43fee537.Builder mo4355x396335be(java.lang.String str) {
            mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.InterfaceC0840xcdfd0453.f2095xc1a56baf, str);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e.Builder
        @java.lang.Deprecated
        /* renamed from: setTargetResolution */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0505x43fee537.Builder mo4469xb1b6c19f(android.util.Size size) {
            mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e.f1697xbf0df2d0, size);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e.Builder
        /* renamed from: setTargetRotation */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0505x43fee537.Builder mo4470x5541f931(int i17) {
            mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e.f1698xe496c6a2, java.lang.Integer.valueOf(i17));
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.Builder
        /* renamed from: setZslDisabled */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0505x43fee537.Builder mo4471xc3162e2d(boolean z17) {
            mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.f1838x83019c92, java.lang.Boolean.valueOf(z17));
            return this;
        }
    }

    /* renamed from: androidx.camera.core.ImageAnalysis$Defaults */
    /* loaded from: classes14.dex */
    public static final class Defaults implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0693xcbf65773<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0712x969a4f59> {

        /* renamed from: DEFAULT_ASPECT_RATIO */
        private static final int f995x1cc566a2 = 0;

        /* renamed from: DEFAULT_CONFIG */
        private static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0712x969a4f59 f996x7fb79b20;

        /* renamed from: DEFAULT_DYNAMIC_RANGE */
        private static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e f997x1c92235f;

        /* renamed from: DEFAULT_RESOLUTION_SELECTOR */
        private static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.C0955xda4820cb f998x1f8ec6f4;

        /* renamed from: DEFAULT_SURFACE_OCCUPANCY_PRIORITY */
        private static final int f999x242b6746 = 1;

        /* renamed from: DEFAULT_TARGET_RESOLUTION */
        private static final android.util.Size f1000xd43a457c;

        static {
            android.util.Size size = new android.util.Size(640, 480);
            f1000xd43a457c = size;
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e c0491x2bb48c5e = p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e.SDR;
            f997x1c92235f = c0491x2bb48c5e;
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.C0955xda4820cb m6501x59bc66e = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.C0955xda4820cb.Builder().m6503xf4e1a364(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.C0953x9920cf06.f2302xcd77a971).m6505x3a95f841(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.C0956xfdd1d05f(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1.C0871x3656bfc3.f2129x8adda99d, 1)).m6501x59bc66e();
            f998x1f8ec6f4 = m6501x59bc66e;
            f996x7fb79b20 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0505x43fee537.Builder().mo4453xe20fa18b(size).mo4467x678fae66(1).mo4468x52ad1800(0).mo4464x170c48ad(m6501x59bc66e).mo4455xb924c5c0(c0491x2bb48c5e).mo4446x111127c3();
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0693xcbf65773
        /* renamed from: getConfig, reason: avoid collision after fix types in other method */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0712x969a4f59 mo4473x1456a638() {
            return f996x7fb79b20;
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* renamed from: androidx.camera.core.ImageAnalysis$OutputImageFormat */
    /* loaded from: classes6.dex */
    public @interface OutputImageFormat {
    }

    public C0505x43fee537(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0712x969a4f59 c0712x969a4f59) {
        super(c0712x969a4f59);
        this.f988x2f5cb734 = new java.lang.Object();
        if (((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0712x969a4f59) m4814x27802a65()).m5442x2f0d1c35(0) == 1) {
            this.f991x95984cf2 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0513xbb04f352();
        } else {
            this.f991x95984cf2 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0514x90e39e31(c0712x969a4f59.m6142x86bc0617(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5979xa2909059()));
        }
        this.f991x95984cf2.m4490x158f052f(m4423x39f8f8bb());
        this.f991x95984cf2.m4491x38849bab(m4428x33940273());
    }

    /* renamed from: isFlipWH */
    private boolean m4409xdc5e95c8(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 interfaceC0677x9e0bc522) {
        return m4428x33940273() && m4820xe02e49e0(interfaceC0677x9e0bc522) % 180 != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$createPipeline$1 */
    public static /* synthetic */ void m4410xa5070c08(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0561xf076f77b c0561xf076f77b, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0561xf076f77b c0561xf076f77b2) {
        c0561xf076f77b.m4764xbb07de6b();
        if (c0561xf076f77b2 != null) {
            c0561xf076f77b2.m4764xbb07de6b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$createPipeline$2 */
    public void m4411xa5070c09(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 c0750xb915958, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.SessionError sessionError) {
        if (m4811x1390e61b() == null) {
            return;
        }
        m4416xbdd2280f();
        this.f991x95984cf2.mo4485xd2bef135();
        java.lang.String m4813x72efd496 = m4813x72efd496();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0712x969a4f59 c0712x969a4f59 = (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0712x969a4f59) m4814x27802a65();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b m4809xfdddfa15 = m4809xfdddfa15();
        m4809xfdddfa15.getClass();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.Builder m4417x20cff3be = m4417x20cff3be(m4813x72efd496, c0712x969a4f59, m4809xfdddfa15);
        this.f992xcb6d0310 = m4417x20cff3be;
        java.lang.Object[] objArr = {m4417x20cff3be.m5619x59bc66e()};
        java.util.ArrayList arrayList = new java.util.ArrayList(1);
        java.lang.Object obj = objArr[0];
        java.util.Objects.requireNonNull(obj);
        arrayList.add(obj);
        m4844xd8cf6f2f(java.util.Collections.unmodifiableList(arrayList));
        m4836x9763bb86();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onMergeConfig$0 */
    public static /* synthetic */ java.util.List m4412xb4f70d2a(android.util.Size size, java.util.List list, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list);
        if (arrayList.contains(size)) {
            arrayList.remove(size);
            arrayList.add(0, size);
        }
        return arrayList;
    }

    /* renamed from: tryUpdateRelativeRotation */
    private void m4414xb1584cee() {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 m4811x1390e61b = m4811x1390e61b();
        if (m4811x1390e61b != null) {
            this.f991x95984cf2.m4493x842adeec(m4820xe02e49e0(m4811x1390e61b));
        }
    }

    /* renamed from: clearAnalyzer */
    public void m4415x96efca13() {
        synchronized (this.f988x2f5cb734) {
            this.f991x95984cf2.m4488x3982eb28(null, null);
            if (this.f993xaae8de6d != null) {
                m4835x7556fed4();
            }
            this.f993xaae8de6d = null;
        }
    }

    /* renamed from: clearPipeline */
    public void m4416xbdd2280f() {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0799x13794b89.m5939x6483284b();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.CloseableErrorListener closeableErrorListener = this.f989xb6dbcd77;
        if (closeableErrorListener != null) {
            closeableErrorListener.m5633x5a5ddf8();
            this.f989xb6dbcd77 = null;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293 abstractC0697x654a0293 = this.f990x176749c6;
        if (abstractC0697x654a0293 != null) {
            abstractC0697x654a0293.mo5401x5a5ddf8();
            this.f990x176749c6 = null;
        }
    }

    /* renamed from: createPipeline */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.Builder m4417x20cff3be(java.lang.String str, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0712x969a4f59 c0712x969a4f59, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b abstractC0756x2f9ad77b) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0799x13794b89.m5939x6483284b();
        android.util.Size mo5191x8ee230a2 = abstractC0756x2f9ad77b.mo5191x8ee230a2();
        java.util.concurrent.Executor m6142x86bc0617 = c0712x969a4f59.m6142x86bc0617(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5979xa2909059());
        m6142x86bc0617.getClass();
        boolean z17 = true;
        int m4421x90365b7 = m4419x2f0d1c35() == 1 ? m4421x90365b7() : 4;
        final p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0561xf076f77b c0561xf076f77b = c0712x969a4f59.m5445x99a79697() != null ? new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0561xf076f77b(c0712x969a4f59.m5445x99a79697().m4656x6bff0255(mo5191x8ee230a2.getWidth(), mo5191x8ee230a2.getHeight(), m4816x450a23fc(), m4421x90365b7, 0L)) : new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0561xf076f77b(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0540xdaa8f743.m4657x9aed0758(mo5191x8ee230a2.getWidth(), mo5191x8ee230a2.getHeight(), m4816x450a23fc(), m4421x90365b7));
        boolean m4409xdc5e95c8 = m4811x1390e61b() != null ? m4409xdc5e95c8(m4811x1390e61b()) : false;
        int height = m4409xdc5e95c8 ? mo5191x8ee230a2.getHeight() : mo5191x8ee230a2.getWidth();
        int width = m4409xdc5e95c8 ? mo5191x8ee230a2.getWidth() : mo5191x8ee230a2.getHeight();
        int i17 = m4423x39f8f8bb() == 2 ? 1 : 35;
        boolean z18 = m4816x450a23fc() == 35 && m4423x39f8f8bb() == 2;
        if (m4816x450a23fc() != 35 || ((m4811x1390e61b() == null || m4820xe02e49e0(m4811x1390e61b()) == 0) && !java.lang.Boolean.TRUE.equals(m4422xf47bb4b5()))) {
            z17 = false;
        }
        final p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0561xf076f77b c0561xf076f77b2 = (z18 || z17) ? new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0561xf076f77b(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0540xdaa8f743.m4657x9aed0758(height, width, i17, c0561xf076f77b.mo4189xcb8dea46())) : null;
        if (c0561xf076f77b2 != null) {
            this.f991x95984cf2.m4492x77d1d43c(c0561xf076f77b2);
        }
        m4414xb1584cee();
        c0561xf076f77b.mo4192x6034c5c3(this.f991x95984cf2, m6142x86bc0617);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.Builder m5603x51964ec6 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.Builder.m5603x51964ec6(c0712x969a4f59, abstractC0756x2f9ad77b.mo5191x8ee230a2());
        if (abstractC0756x2f9ad77b.mo5190xca0018d6() != null) {
            m5603x51964ec6.m5610x2f697c6b(abstractC0756x2f9ad77b.mo5190xca0018d6());
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293 abstractC0697x654a0293 = this.f990x176749c6;
        if (abstractC0697x654a0293 != null) {
            abstractC0697x654a0293.mo5401x5a5ddf8();
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0720x9cc637dc c0720x9cc637dc = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0720x9cc637dc(c0561xf076f77b.mo4190xcf572877(), mo5191x8ee230a2, m4816x450a23fc());
        this.f990x176749c6 = c0720x9cc637dc;
        c0720x9cc637dc.m5408x5f9b7531().mo606x162a7075(new java.lang.Runnable() { // from class: androidx.camera.core.ImageAnalysis$$a
            @Override // java.lang.Runnable
            public final void run() {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0505x43fee537.m4410xa5070c08(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0561xf076f77b.this, c0561xf076f77b2);
            }
        }, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5982x891c9b16());
        m5603x51964ec6.m5625xe875cd2a(abstractC0756x2f9ad77b.mo5189xb632311e());
        m5603x51964ec6.m5617x34744cc(this.f990x176749c6, abstractC0756x2f9ad77b.mo5188x82dbcab4(), null, -1);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.CloseableErrorListener closeableErrorListener = this.f989xb6dbcd77;
        if (closeableErrorListener != null) {
            closeableErrorListener.m5633x5a5ddf8();
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.CloseableErrorListener closeableErrorListener2 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.CloseableErrorListener(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.ErrorListener() { // from class: androidx.camera.core.ImageAnalysis$$b
            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.ErrorListener
            /* renamed from: onError */
            public final void mo3491xaf8aa769(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 c0750xb915958, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.SessionError sessionError) {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0505x43fee537.this.m4411xa5070c09(c0750xb915958, sessionError);
            }
        });
        this.f989xb6dbcd77 = closeableErrorListener2;
        m5603x51964ec6.m5624x6b43959a(closeableErrorListener2);
        return m5603x51964ec6;
    }

    /* renamed from: getBackgroundExecutor */
    public java.util.concurrent.Executor m4418x86bc0617() {
        return ((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0712x969a4f59) m4814x27802a65()).m6142x86bc0617(null);
    }

    /* renamed from: getBackpressureStrategy */
    public int m4419x2f0d1c35() {
        return ((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0712x969a4f59) m4814x27802a65()).m5442x2f0d1c35(0);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [androidx.camera.core.impl.UseCaseConfig, androidx.camera.core.impl.UseCaseConfig<?>] */
    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137
    /* renamed from: getDefaultConfig */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?> mo4420xdbd48d2d(boolean z17, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771 interfaceC0769xb8476771) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0505x43fee537.Defaults defaults = f978x7fb79b20;
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 mo3297x1456a638 = interfaceC0769xb8476771.mo3297x1456a638(defaults.mo4473x1456a638().mo3493xe38cfe6a(), 1);
        if (z17) {
            mo3297x1456a638 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.m5372xcdb2a19(mo3297x1456a638, defaults.mo4473x1456a638());
        }
        if (mo3297x1456a638 == null) {
            return null;
        }
        return mo4427xa926ae58(mo3297x1456a638).mo4446x111127c3();
    }

    /* renamed from: getImageQueueDepth */
    public int m4421x90365b7() {
        return ((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0712x969a4f59) m4814x27802a65()).m5444x90365b7(6);
    }

    /* renamed from: getOnePixelShiftEnabled */
    public java.lang.Boolean m4422xf47bb4b5() {
        return ((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0712x969a4f59) m4814x27802a65()).m5447xf47bb4b5(f980xf8186694);
    }

    /* renamed from: getOutputImageFormat */
    public int m4423x39f8f8bb() {
        return ((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0712x969a4f59) m4814x27802a65()).m5448x39f8f8bb(1);
    }

    /* renamed from: getResolutionInfo */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0558xd106e79a m4424xfb57e870() {
        return mo4534xbcbaa34d();
    }

    /* renamed from: getResolutionSelector */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.C0955xda4820cb m4425x7fe0c6a1() {
        return ((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e) m4814x27802a65()).m5488x7fe0c6a1(null);
    }

    /* renamed from: getTargetRotation */
    public int m4426x8d4b9125() {
        return m4828x68e8c702();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137
    /* renamed from: getUseCaseConfigBuilder */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.Builder<?, ?, ?> mo4427xa926ae58(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 interfaceC0692x78a46f62) {
        return p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0505x43fee537.Builder.m4444x650a9f8c(interfaceC0692x78a46f62);
    }

    /* renamed from: isOutputImageRotationEnabled */
    public boolean m4428x33940273() {
        return ((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0712x969a4f59) m4814x27802a65()).m5449x33940273(java.lang.Boolean.FALSE).booleanValue();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137
    /* renamed from: onBind */
    public void mo4429xc3979ebc() {
        this.f991x95984cf2.m4484xac1eee45();
    }

    /* JADX WARN: Type inference failed for: r6v16, types: [androidx.camera.core.impl.UseCaseConfig, androidx.camera.core.impl.UseCaseConfig<?>] */
    /* JADX WARN: Type inference failed for: r6v4, types: [androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.UseCaseConfig] */
    /* JADX WARN: Type inference failed for: r6v6, types: [androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.UseCaseConfig] */
    /* JADX WARN: Type inference failed for: r6v8, types: [androidx.camera.core.impl.UseCaseConfig, androidx.camera.core.impl.UseCaseConfig<?>] */
    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137
    /* renamed from: onMergeConfig */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?> mo4430xc74923b(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0675x66574570 interfaceC0675x66574570, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.Builder<?, ?, ?> builder) {
        final android.util.Size m4441x546fa548;
        java.lang.Boolean m4422xf47bb4b5 = m4422xf47bb4b5();
        boolean m5568xde2d761f = interfaceC0675x66574570.mo3162x25ef6270().m5568xde2d761f(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p046xaf3f3382.p047x66f27be.InterfaceC0858x9966785c.class);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0510x4c133a3f abstractC0510x4c133a3f = this.f991x95984cf2;
        if (m4422xf47bb4b5 != null) {
            m5568xde2d761f = m4422xf47bb4b5.booleanValue();
        }
        abstractC0510x4c133a3f.m4489x6ecee3c1(m5568xde2d761f);
        synchronized (this.f988x2f5cb734) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0505x43fee537.Analyzer analyzer = this.f993xaae8de6d;
            m4441x546fa548 = analyzer != null ? analyzer.m4441x546fa548() : null;
        }
        if (m4441x546fa548 == null) {
            return builder.mo4446x111127c3();
        }
        if (interfaceC0675x66574570.mo3173x3b4734f9(((java.lang.Integer) builder.mo2889xc37a2e52().mo5380x77ba97d1(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e.f1698xe496c6a2, 0)).intValue()) % 180 == 90) {
            m4441x546fa548 = new android.util.Size(m4441x546fa548.getHeight(), m4441x546fa548.getWidth());
        }
        ?? mo4446x111127c3 = builder.mo4446x111127c3();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<android.util.Size> option = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e.f1697xbf0df2d0;
        if (!mo4446x111127c3.mo5374xdccd9774(option)) {
            builder.mo2889xc37a2e52().mo5521x25e7888e(option, m4441x546fa548);
        }
        ?? mo4446x111127c32 = builder.mo4446x111127c3();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option option2 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e.f1694xa42c6f48;
        if (mo4446x111127c32.mo5374xdccd9774(option2)) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.C0955xda4820cb c0955xda4820cb = (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.C0955xda4820cb) m4807x3d3d7e0d().mo5380x77ba97d1(option2, null);
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.C0955xda4820cb.Builder builder2 = c0955xda4820cb == null ? new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.C0955xda4820cb.Builder() : p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.C0955xda4820cb.Builder.m6500x106561f5(c0955xda4820cb);
            if (c0955xda4820cb == null || c0955xda4820cb.m6499xa36a7635() == null) {
                builder2.m6505x3a95f841(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.C0956xfdd1d05f(m4441x546fa548, 1));
            }
            if (c0955xda4820cb == null) {
                builder2.m6504x2399fbc6(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.InterfaceC0954xa5894364() { // from class: androidx.camera.core.ImageAnalysis$$c
                    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.InterfaceC0954xa5894364
                    /* renamed from: filter */
                    public final java.util.List mo4439xb408cb78(java.util.List list, int i17) {
                        java.util.List m4412xb4f70d2a;
                        m4412xb4f70d2a = p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0505x43fee537.m4412xb4f70d2a(m4441x546fa548, list, i17);
                        return m4412xb4f70d2a;
                    }
                });
            }
            builder.mo2889xc37a2e52().mo5521x25e7888e(option2, builder2.m6501x59bc66e());
        }
        return builder.mo4446x111127c3();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137
    /* renamed from: onSuggestedStreamSpecImplementationOptionsUpdated */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b mo4431x6f6af6ae(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 interfaceC0692x78a46f62) {
        this.f992xcb6d0310.m5610x2f697c6b(interfaceC0692x78a46f62);
        java.lang.Object[] objArr = {this.f992xcb6d0310.m5619x59bc66e()};
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
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.Builder m4417x20cff3be = m4417x20cff3be(m4813x72efd496(), (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0712x969a4f59) m4814x27802a65(), abstractC0756x2f9ad77b);
        this.f992xcb6d0310 = m4417x20cff3be;
        java.lang.Object[] objArr = {m4417x20cff3be.m5619x59bc66e()};
        java.util.ArrayList arrayList = new java.util.ArrayList(1);
        java.lang.Object obj = objArr[0];
        java.util.Objects.requireNonNull(obj);
        arrayList.add(obj);
        m4844xd8cf6f2f(java.util.Collections.unmodifiableList(arrayList));
        return abstractC0756x2f9ad77b;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137
    /* renamed from: onUnbind */
    public void mo4433x5cd81515() {
        m4416xbdd2280f();
        this.f991x95984cf2.m4486xb06a1793();
    }

    /* renamed from: setAnalyzer */
    public void m4434x3982eb28(java.util.concurrent.Executor executor, final p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0505x43fee537.Analyzer analyzer) {
        synchronized (this.f988x2f5cb734) {
            this.f991x95984cf2.m4488x3982eb28(executor, new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0505x43fee537.Analyzer() { // from class: androidx.camera.core.ImageAnalysis$$d
                @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0505x43fee537.Analyzer
                /* renamed from: analyze */
                public final void mo4440xcc7b5d4c(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 interfaceC0536x1ffeadf3) {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0505x43fee537.Analyzer.this.mo4440xcc7b5d4c(interfaceC0536x1ffeadf3);
                }
            });
            if (this.f993xaae8de6d == null) {
                m4834x37f5a7af();
            }
            this.f993xaae8de6d = analyzer;
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137
    /* renamed from: setSensorToBufferTransformMatrix */
    public void mo4435x6864fd6(android.graphics.Matrix matrix) {
        super.mo4435x6864fd6(matrix);
        this.f991x95984cf2.m4494x6864fd6(matrix);
    }

    /* renamed from: setTargetRotation */
    public void m4436x5541f931(int i17) {
        if (m4842x9b2c630e(i17)) {
            m4414xb1584cee();
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137
    /* renamed from: setViewPortCropRect */
    public void mo4437x8c0c67fc(android.graphics.Rect rect) {
        super.mo4437x8c0c67fc(rect);
        this.f991x95984cf2.m4495x8c0c67fc(rect);
    }

    /* renamed from: toString */
    public java.lang.String m4438x9616526c() {
        return "ImageAnalysis:" + m4818xfb82e301();
    }
}
