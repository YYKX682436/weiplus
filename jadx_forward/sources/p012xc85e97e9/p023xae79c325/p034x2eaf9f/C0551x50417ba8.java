package p012xc85e97e9.p023xae79c325.p034x2eaf9f;

/* renamed from: androidx.camera.core.Preview */
/* loaded from: classes14.dex */
public final class C0551x50417ba8 extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137 {

    /* renamed from: DEFAULT_CONFIG */
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0551x50417ba8.Defaults f1164x7fb79b20 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0551x50417ba8.Defaults();

    /* renamed from: DEFAULT_SURFACE_PROVIDER_EXECUTOR */
    private static final java.util.concurrent.Executor f1165x30125f91 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5982x891c9b16();
    private static final java.lang.String TAG = "Preview";

    /* renamed from: mCameraEdge */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea f1166x643c82cf;

    /* renamed from: mCloseableErrorListener */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.CloseableErrorListener f1167xb6dbcd77;

    /* renamed from: mCurrentSurfaceRequest */
    p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0569x83ae3d42 f1168x8992388e;

    /* renamed from: mNode */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0920xc7a30e27 f1169x625240f;

    /* renamed from: mSessionConfigBuilder */
    p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.Builder f1170xcb6d0310;

    /* renamed from: mSessionDeferrableSurface */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293 f1171x63a72c4a;

    /* renamed from: mSurfaceProvider */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0551x50417ba8.SurfaceProvider f1172xd9c98991;

    /* renamed from: mSurfaceProviderExecutor */
    private java.util.concurrent.Executor f1173x1893c584;

    /* renamed from: androidx.camera.core.Preview$Builder */
    /* loaded from: classes14.dex */
    public static final class Builder implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.Builder<p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0551x50417ba8, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0739x29b48d0a, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0551x50417ba8.Builder>, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e.Builder<p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0551x50417ba8.Builder>, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0716x5f72b371.Builder<p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0551x50417ba8.Builder>, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.InterfaceC0841xc9cca20c.Builder<p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0551x50417ba8.Builder> {

        /* renamed from: mMutableConfig */
        private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0731x74f1ef5a f1174x61287a9b;

        public Builder() {
            this(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0731x74f1ef5a.m5524xaf65a0fc());
        }

        /* renamed from: fromConfig */
        public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0551x50417ba8.Builder m4725x650a9f8c(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 interfaceC0692x78a46f62) {
            return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0551x50417ba8.Builder(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0731x74f1ef5a.m5525x3017aa(interfaceC0692x78a46f62));
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0501xb43e0567
        /* renamed from: getMutableConfig */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0730x35b9a1e8 mo2889xc37a2e52() {
            return this.f1174x61287a9b;
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e.Builder
        /* renamed from: setCustomOrderedResolutions */
        public /* bridge */ /* synthetic */ p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0551x50417ba8.Builder mo4451xd3ebe6d(java.util.List list) {
            return mo4451xd3ebe6d((java.util.List<android.util.Size>) list);
        }

        /* renamed from: setPreviewStabilizationEnabled */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0551x50417ba8.Builder m4727x7725e88(boolean z17) {
            mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.f1833xf56d3424, java.lang.Integer.valueOf(z17 ? 2 : 1));
            return this;
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e.Builder
        /* renamed from: setSupportedResolutions */
        public /* bridge */ /* synthetic */ p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0551x50417ba8.Builder mo4466x9b56433b(java.util.List list) {
            return mo4466x9b56433b((java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>>) list);
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.InterfaceC0840xcdfd0453.Builder
        /* renamed from: setTargetClass */
        public /* bridge */ /* synthetic */ java.lang.Object mo4354xf26d54a5(java.lang.Class cls) {
            return mo4354xf26d54a5((java.lang.Class<p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0551x50417ba8>) cls);
        }

        /* renamed from: setTargetFrameRate */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0551x50417ba8.Builder m4728xbdf1389a(android.util.Range<java.lang.Integer> range) {
            mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.f1836x100ea2b6, range);
            return this;
        }

        private Builder(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0731x74f1ef5a c0731x74f1ef5a) {
            this.f1174x61287a9b = c0731x74f1ef5a;
            java.lang.Class cls = (java.lang.Class) c0731x74f1ef5a.mo5380x77ba97d1(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.InterfaceC0840xcdfd0453.f2094x7271dcb4, null);
            if (cls != null && !cls.equals(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0551x50417ba8.class)) {
                throw new java.lang.IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            mo4450x79f271de(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.CaptureType.PREVIEW);
            mo4354xf26d54a5(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0551x50417ba8.class);
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<java.lang.Integer> option = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e.f1693xd5f15d59;
            if (((java.lang.Integer) c0731x74f1ef5a.mo5380x77ba97d1(option, -1)).intValue() == -1) {
                c0731x74f1ef5a.mo5521x25e7888e(option, 2);
            }
        }

        /* renamed from: fromConfig */
        public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0551x50417ba8.Builder m4726x650a9f8c(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0739x29b48d0a c0739x29b48d0a) {
            return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0551x50417ba8.Builder(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0731x74f1ef5a.m5525x3017aa((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62) c0739x29b48d0a));
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0501xb43e0567
        /* renamed from: build */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0551x50417ba8 mo2888x59bc66e() {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0739x29b48d0a mo4446x111127c3 = mo4446x111127c3();
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e.m5478xd0bfdff8(mo4446x111127c3);
            return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0551x50417ba8(mo4446x111127c3);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.Builder
        /* renamed from: getUseCaseConfig */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0739x29b48d0a mo4446x111127c3() {
            return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0739x29b48d0a(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0735xc905e4a0.m5538x3017aa(this.f1174x61287a9b));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.InterfaceC0841xc9cca20c.Builder
        /* renamed from: setBackgroundExecutor */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0551x50417ba8.Builder mo4447x1de78823(java.util.concurrent.Executor executor) {
            mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.InterfaceC0841xc9cca20c.f2096x863889fa, executor);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.Builder
        /* renamed from: setCaptureOptionUnpacker */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0551x50417ba8.Builder mo4449x89aad198(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08.OptionUnpacker optionUnpacker) {
            mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.f1828x70d747d9, optionUnpacker);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.Builder
        /* renamed from: setCaptureType */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0551x50417ba8.Builder mo4450x79f271de(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.CaptureType captureType) {
            mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.f1829x7803883d, captureType);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e.Builder
        /* renamed from: setCustomOrderedResolutions */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0551x50417ba8.Builder mo4451xd3ebe6d(java.util.List<android.util.Size> list) {
            mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e.f1690x228c71, list);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.Builder
        /* renamed from: setDefaultCaptureConfig */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0551x50417ba8.Builder mo4452x8bbd60e9(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08 c0690x88f65a08) {
            mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.f1830x55dfff63, c0690x88f65a08);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e.Builder
        /* renamed from: setDefaultResolution */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0551x50417ba8.Builder mo4453xe20fa18b(android.util.Size size) {
            mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e.f1691xcde9ad94, size);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.Builder
        /* renamed from: setDefaultSessionConfig */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0551x50417ba8.Builder mo4454xe586039(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 c0750xb915958) {
            mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.f1831x26a4ea13, c0750xb915958);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0716x5f72b371.Builder
        /* renamed from: setDynamicRange */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0551x50417ba8.Builder mo4455xb924c5c0(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e c0491x2bb48c5e) {
            mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0716x5f72b371.f1686x1d477a5e, c0491x2bb48c5e);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.Builder
        /* renamed from: setHighResolutionDisabled */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0551x50417ba8.Builder mo4456xcfdff38c(boolean z17) {
            mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.f1832x6e134b1c, java.lang.Boolean.valueOf(z17));
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e.Builder
        /* renamed from: setMaxResolution */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0551x50417ba8.Builder mo4459xaaf6afee(android.util.Size size) {
            mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e.f1692xe906b791, size);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e.Builder
        /* renamed from: setMirrorMode */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0551x50417ba8.Builder mo4460x845d2804(int i17) {
            if (android.os.Build.VERSION.SDK_INT >= 33) {
                mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e.f1693xd5f15d59, java.lang.Integer.valueOf(i17));
            }
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e.Builder
        /* renamed from: setResolutionSelector */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0551x50417ba8.Builder mo4464x170c48ad(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.C0955xda4820cb c0955xda4820cb) {
            mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e.f1694xa42c6f48, c0955xda4820cb);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.Builder
        /* renamed from: setSessionOptionUnpacker */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0551x50417ba8.Builder mo4465x523980e8(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.OptionUnpacker optionUnpacker) {
            mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.f1834x50776329, optionUnpacker);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e.Builder
        /* renamed from: setSupportedResolutions */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0551x50417ba8.Builder mo4466x9b56433b(java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>> list) {
            mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e.f1695x2ed2d6ac, list);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.Builder
        /* renamed from: setSurfaceOccupancyPriority */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0551x50417ba8.Builder mo4467x678fae66(int i17) {
            mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.f1835x80437872, java.lang.Integer.valueOf(i17));
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e.Builder
        @java.lang.Deprecated
        /* renamed from: setTargetAspectRatio */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0551x50417ba8.Builder mo4468x52ad1800(int i17) {
            if (i17 == -1) {
                i17 = 0;
            }
            mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e.f1696x64f6b668, java.lang.Integer.valueOf(i17));
            return this;
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.InterfaceC0840xcdfd0453.Builder
        /* renamed from: setTargetClass */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0551x50417ba8.Builder mo4354xf26d54a5(java.lang.Class<p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0551x50417ba8> cls) {
            mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.InterfaceC0840xcdfd0453.f2094x7271dcb4, cls);
            if (mo2889xc37a2e52().mo5380x77ba97d1(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.InterfaceC0840xcdfd0453.f2095xc1a56baf, null) == null) {
                mo4355x396335be(cls.getCanonicalName() + "-" + java.util.UUID.randomUUID());
            }
            return this;
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.InterfaceC0840xcdfd0453.Builder
        /* renamed from: setTargetName */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0551x50417ba8.Builder mo4355x396335be(java.lang.String str) {
            mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.InterfaceC0840xcdfd0453.f2095xc1a56baf, str);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e.Builder
        @java.lang.Deprecated
        /* renamed from: setTargetResolution */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0551x50417ba8.Builder mo4469xb1b6c19f(android.util.Size size) {
            mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e.f1697xbf0df2d0, size);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e.Builder
        /* renamed from: setTargetRotation */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0551x50417ba8.Builder mo4470x5541f931(int i17) {
            mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e.f1698xe496c6a2, java.lang.Integer.valueOf(i17));
            mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e.f1689x71bbed64, java.lang.Integer.valueOf(i17));
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.Builder
        /* renamed from: setZslDisabled */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0551x50417ba8.Builder mo4471xc3162e2d(boolean z17) {
            mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.f1838x83019c92, java.lang.Boolean.valueOf(z17));
            return this;
        }
    }

    /* renamed from: androidx.camera.core.Preview$Defaults */
    /* loaded from: classes14.dex */
    public static final class Defaults implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0693xcbf65773<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0739x29b48d0a> {

        /* renamed from: DEFAULT_ASPECT_RATIO */
        private static final int f1175x1cc566a2 = 0;

        /* renamed from: DEFAULT_CONFIG */
        private static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0739x29b48d0a f1176x7fb79b20;

        /* renamed from: DEFAULT_DYNAMIC_RANGE */
        private static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e f1177x1c92235f;

        /* renamed from: DEFAULT_MIRROR_MODE */
        private static final int f1178xccc2105 = 2;

        /* renamed from: DEFAULT_RESOLUTION_SELECTOR */
        private static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.C0955xda4820cb f1179x1f8ec6f4;

        /* renamed from: DEFAULT_SURFACE_OCCUPANCY_PRIORITY */
        private static final int f1180x242b6746 = 2;

        static {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.C0955xda4820cb m6501x59bc66e = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.C0955xda4820cb.Builder().m6503xf4e1a364(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.C0953x9920cf06.f2302xcd77a971).m6505x3a95f841(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.C0956xfdd1d05f.f2320xcf28abe4).m6501x59bc66e();
            f1179x1f8ec6f4 = m6501x59bc66e;
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e c0491x2bb48c5e = p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e.f954x1f661f17;
            f1177x1c92235f = c0491x2bb48c5e;
            f1176x7fb79b20 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0551x50417ba8.Builder().mo4467x678fae66(2).mo4468x52ad1800(0).mo4464x170c48ad(m6501x59bc66e).mo4455xb924c5c0(c0491x2bb48c5e).mo4446x111127c3();
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0693xcbf65773
        /* renamed from: getConfig, reason: avoid collision after fix types in other method */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0739x29b48d0a mo4473x1456a638() {
            return f1176x7fb79b20;
        }
    }

    /* renamed from: androidx.camera.core.Preview$SurfaceProvider */
    /* loaded from: classes14.dex */
    public interface SurfaceProvider {
        /* renamed from: onSurfaceRequested */
        void mo4731x35527140(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0569x83ae3d42 c0569x83ae3d42);
    }

    public C0551x50417ba8(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0739x29b48d0a c0739x29b48d0a) {
        super(c0739x29b48d0a);
        this.f1173x1893c584 = f1165x30125f91;
    }

    /* renamed from: addCameraSurfaceAndErrorListener */
    private void m4700x308b970c(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.Builder builder, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b abstractC0756x2f9ad77b) {
        if (this.f1172xd9c98991 != null) {
            builder.m5617x34744cc(this.f1171x63a72c4a, abstractC0756x2f9ad77b.mo5188x82dbcab4(), m4819x936d7c8d(), m4817x68758cd5());
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.CloseableErrorListener closeableErrorListener = this.f1167xb6dbcd77;
        if (closeableErrorListener != null) {
            closeableErrorListener.m5633x5a5ddf8();
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.CloseableErrorListener closeableErrorListener2 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.CloseableErrorListener(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.ErrorListener() { // from class: androidx.camera.core.Preview$$d
            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.ErrorListener
            /* renamed from: onError */
            public final void mo3491xaf8aa769(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 c0750xb915958, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.SessionError sessionError) {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0551x50417ba8.this.m4705x98f39e96(c0750xb915958, sessionError);
            }
        });
        this.f1167xb6dbcd77 = closeableErrorListener2;
        builder.m5624x6b43959a(closeableErrorListener2);
    }

    /* renamed from: clearPipeline */
    private void m4701xbdd2280f() {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.CloseableErrorListener closeableErrorListener = this.f1167xb6dbcd77;
        if (closeableErrorListener != null) {
            closeableErrorListener.m5633x5a5ddf8();
            this.f1167xb6dbcd77 = null;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293 abstractC0697x654a0293 = this.f1171x63a72c4a;
        if (abstractC0697x654a0293 != null) {
            abstractC0697x654a0293.mo5401x5a5ddf8();
            this.f1171x63a72c4a = null;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0920xc7a30e27 c0920xc7a30e27 = this.f1169x625240f;
        if (c0920xc7a30e27 != null) {
            c0920xc7a30e27.mo4945x41012807();
            this.f1169x625240f = null;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea c0905xfc457ea = this.f1166x643c82cf;
        if (c0905xfc457ea != null) {
            c0905xfc457ea.m6329x5a5ddf8();
            this.f1166x643c82cf = null;
        }
        this.f1168x8992388e = null;
    }

    /* renamed from: createPipeline */
    private p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.Builder m4702x20cff3be(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0739x29b48d0a c0739x29b48d0a, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b abstractC0756x2f9ad77b) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0799x13794b89.m5939x6483284b();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 m4811x1390e61b = m4811x1390e61b();
        java.util.Objects.requireNonNull(m4811x1390e61b);
        final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 interfaceC0677x9e0bc522 = m4811x1390e61b;
        m4701xbdd2280f();
        m3.h.e(this.f1166x643c82cf == null, null);
        android.graphics.Matrix m4825xa4435162 = m4825xa4435162();
        boolean mo5289x5ef3d868 = interfaceC0677x9e0bc522.mo5289x5ef3d868();
        android.graphics.Rect m4703xfa2ffe0a = m4703xfa2ffe0a(abstractC0756x2f9ad77b.mo5191x8ee230a2());
        java.util.Objects.requireNonNull(m4703xfa2ffe0a);
        this.f1166x643c82cf = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea(1, 34, abstractC0756x2f9ad77b, m4825xa4435162, mo5289x5ef3d868, m4703xfa2ffe0a, m4821xe02e49e0(interfaceC0677x9e0bc522, m4832x7e0b2878(interfaceC0677x9e0bc522)), m4808x465bc3fa(), m4711xa7251b52(interfaceC0677x9e0bc522));
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0468xb9790d36 m4815x173ddc87 = m4815x173ddc87();
        if (m4815x173ddc87 != null) {
            this.f1169x625240f = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0920xc7a30e27(interfaceC0677x9e0bc522, m4815x173ddc87.m4258x44d9f95e());
            this.f1166x643c82cf.m6327xeb3c13dd(new java.lang.Runnable() { // from class: androidx.camera.core.Preview$$b
                @Override // java.lang.Runnable
                public final void run() {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0551x50417ba8.this.m4836x9763bb86();
                }
            });
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0951xabff0c10 of6 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.p052x36f002.AbstractC0951xabff0c10.of(this.f1166x643c82cf);
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea c0905xfc457ea = this.f1169x625240f.mo4948x3ebe6b6c(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0920xc7a30e27.In.of(this.f1166x643c82cf, java.util.Collections.singletonList(of6))).get(of6);
            java.util.Objects.requireNonNull(c0905xfc457ea);
            c0905xfc457ea.m6327xeb3c13dd(new java.lang.Runnable() { // from class: androidx.camera.core.Preview$$c
                @Override // java.lang.Runnable
                public final void run() {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0551x50417ba8.this.m4706xa5070c07(interfaceC0677x9e0bc522);
                }
            });
            this.f1168x8992388e = c0905xfc457ea.m6331x74b8753e(interfaceC0677x9e0bc522);
            this.f1171x63a72c4a = this.f1166x643c82cf.m6335xcdba49fd();
        } else {
            this.f1166x643c82cf.m6327xeb3c13dd(new java.lang.Runnable() { // from class: androidx.camera.core.Preview$$b
                @Override // java.lang.Runnable
                public final void run() {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0551x50417ba8.this.m4836x9763bb86();
                }
            });
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0569x83ae3d42 m6331x74b8753e = this.f1166x643c82cf.m6331x74b8753e(interfaceC0677x9e0bc522);
            this.f1168x8992388e = m6331x74b8753e;
            this.f1171x63a72c4a = m6331x74b8753e.m4790xcdba49fd();
        }
        if (this.f1172xd9c98991 != null) {
            m4709xaa9e3eca();
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.Builder m5603x51964ec6 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.Builder.m5603x51964ec6(c0739x29b48d0a, abstractC0756x2f9ad77b.mo5191x8ee230a2());
        m5603x51964ec6.m5625xe875cd2a(abstractC0756x2f9ad77b.mo5189xb632311e());
        m5603x51964ec6.m5629xb21eba79(c0739x29b48d0a.m5748x732bab0());
        if (abstractC0756x2f9ad77b.mo5190xca0018d6() != null) {
            m5603x51964ec6.m5610x2f697c6b(abstractC0756x2f9ad77b.mo5190xca0018d6());
        }
        m4700x308b970c(m5603x51964ec6, abstractC0756x2f9ad77b);
        return m5603x51964ec6;
    }

    /* renamed from: getCropRect */
    private android.graphics.Rect m4703xfa2ffe0a(android.util.Size size) {
        if (m4829xe80fd2f0() != null) {
            return m4829xe80fd2f0();
        }
        if (size != null) {
            return new android.graphics.Rect(0, 0, size.getWidth(), size.getHeight());
        }
        return null;
    }

    /* renamed from: getPreviewCapabilities */
    public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0556x21fda37e m4704x2f79b868(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93 interfaceC0472xfede5d93) {
        return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p039xd14a2518.C0771xdb868abe.m5765x3017aa(interfaceC0472xfede5d93);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$addCameraSurfaceAndErrorListener$1 */
    public /* synthetic */ void m4705x98f39e96(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 c0750xb915958, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.SessionError sessionError) {
        if (m4811x1390e61b() == null) {
            return;
        }
        m4712x519c5c8d((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0739x29b48d0a) m4814x27802a65(), m4809xfdddfa15());
        m4836x9763bb86();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$createPipeline$0 */
    public /* synthetic */ void m4706xa5070c07(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 interfaceC0677x9e0bc522) {
        m4708x4ec2706a(this.f1166x643c82cf, interfaceC0677x9e0bc522);
    }

    /* renamed from: onAppEdgeInvalidated */
    private void m4708x4ec2706a(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea c0905xfc457ea, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 interfaceC0677x9e0bc522) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0799x13794b89.m5939x6483284b();
        if (interfaceC0677x9e0bc522 == m4811x1390e61b()) {
            c0905xfc457ea.m6344x92d0313b();
        }
    }

    /* renamed from: sendSurfaceRequest */
    private void m4709xaa9e3eca() {
        m4710x4f1fd887();
        final p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0551x50417ba8.SurfaceProvider surfaceProvider = this.f1172xd9c98991;
        surfaceProvider.getClass();
        final p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0569x83ae3d42 c0569x83ae3d42 = this.f1168x8992388e;
        c0569x83ae3d42.getClass();
        this.f1173x1893c584.execute(new java.lang.Runnable() { // from class: androidx.camera.core.Preview$$a
            @Override // java.lang.Runnable
            public final void run() {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0551x50417ba8.SurfaceProvider.this.mo4731x35527140(c0569x83ae3d42);
            }
        });
    }

    /* renamed from: sendTransformationInfoIfReady */
    private void m4710x4f1fd887() {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 m4811x1390e61b = m4811x1390e61b();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea c0905xfc457ea = this.f1166x643c82cf;
        if (m4811x1390e61b == null || c0905xfc457ea == null) {
            return;
        }
        c0905xfc457ea.m6350x3b308432(m4821xe02e49e0(m4811x1390e61b, m4832x7e0b2878(m4811x1390e61b)), m4808x465bc3fa());
    }

    /* renamed from: shouldMirror */
    private boolean m4711xa7251b52(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0677x9e0bc522 interfaceC0677x9e0bc522) {
        return interfaceC0677x9e0bc522.mo5289x5ef3d868() && m4832x7e0b2878(interfaceC0677x9e0bc522);
    }

    /* renamed from: updateConfigAndOutput */
    private void m4712x519c5c8d(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0739x29b48d0a c0739x29b48d0a, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b abstractC0756x2f9ad77b) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.Builder m4702x20cff3be = m4702x20cff3be(c0739x29b48d0a, abstractC0756x2f9ad77b);
        this.f1170xcb6d0310 = m4702x20cff3be;
        java.lang.Object[] objArr = {m4702x20cff3be.m5619x59bc66e()};
        java.util.ArrayList arrayList = new java.util.ArrayList(1);
        java.lang.Object obj = objArr[0];
        java.util.Objects.requireNonNull(obj);
        arrayList.add(obj);
        m4844xd8cf6f2f(java.util.Collections.unmodifiableList(arrayList));
    }

    /* renamed from: getCameraEdge */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea m4713x764b4278() {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13.C0905xfc457ea c0905xfc457ea = this.f1166x643c82cf;
        java.util.Objects.requireNonNull(c0905xfc457ea);
        return c0905xfc457ea;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [androidx.camera.core.impl.UseCaseConfig, androidx.camera.core.impl.UseCaseConfig<?>] */
    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137
    /* renamed from: getDefaultConfig */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?> mo4420xdbd48d2d(boolean z17, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771 interfaceC0769xb8476771) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0551x50417ba8.Defaults defaults = f1164x7fb79b20;
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 mo3297x1456a638 = interfaceC0769xb8476771.mo3297x1456a638(defaults.mo4473x1456a638().mo3493xe38cfe6a(), 1);
        if (z17) {
            mo3297x1456a638 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.m5372xcdb2a19(mo3297x1456a638, defaults.mo4473x1456a638());
        }
        if (mo3297x1456a638 == null) {
            return null;
        }
        return mo4427xa926ae58(mo3297x1456a638).mo4446x111127c3();
    }

    /* renamed from: getDynamicRange */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e m4714x82dbcab4() {
        return m4814x27802a65().m5476x66bd07f8() ? m4814x27802a65().m5475x82dbcab4() : p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0551x50417ba8.Defaults.f1177x1c92235f;
    }

    /* renamed from: getResolutionInfo */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0558xd106e79a m4715xfb57e870() {
        return mo4534xbcbaa34d();
    }

    /* renamed from: getResolutionSelector */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.C0955xda4820cb m4716x7fe0c6a1() {
        return ((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e) m4814x27802a65()).m5488x7fe0c6a1(null);
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137
    /* renamed from: getSupportedEffectTargets */
    public java.util.Set<java.lang.Integer> mo4537x748d4719() {
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add(1);
        return hashSet;
    }

    /* renamed from: getSurfaceProvider */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0551x50417ba8.SurfaceProvider m4717xee7d2b88() {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0799x13794b89.m5939x6483284b();
        return this.f1172xd9c98991;
    }

    /* renamed from: getTargetFrameRate */
    public android.util.Range<java.lang.Integer> m4718x871a9f26() {
        return m4827x760e4403();
    }

    /* renamed from: getTargetRotation */
    public int m4719x8d4b9125() {
        return m4828x68e8c702();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137
    /* renamed from: getUseCaseConfigBuilder */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.Builder<?, ?, ?> mo4427xa926ae58(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 interfaceC0692x78a46f62) {
        return p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0551x50417ba8.Builder.m4725x650a9f8c(interfaceC0692x78a46f62);
    }

    /* renamed from: isPreviewStabilizationEnabled */
    public boolean m4720x6e4fd0c0() {
        return m4814x27802a65().m5748x732bab0() == 2;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.camera.core.impl.UseCaseConfig, androidx.camera.core.impl.UseCaseConfig<?>] */
    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137
    /* renamed from: onMergeConfig */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?> mo4430xc74923b(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0675x66574570 interfaceC0675x66574570, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.Builder<?, ?, ?> builder) {
        builder.mo2889xc37a2e52().mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0716x5f72b371.f1687x12b109b6, 34);
        return builder.mo4446x111127c3();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137
    /* renamed from: onSuggestedStreamSpecImplementationOptionsUpdated */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b mo4431x6f6af6ae(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 interfaceC0692x78a46f62) {
        this.f1170xcb6d0310.m5610x2f697c6b(interfaceC0692x78a46f62);
        java.lang.Object[] objArr = {this.f1170xcb6d0310.m5619x59bc66e()};
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
        m4712x519c5c8d((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0739x29b48d0a) m4814x27802a65(), abstractC0756x2f9ad77b);
        return abstractC0756x2f9ad77b;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137
    /* renamed from: onUnbind */
    public void mo4433x5cd81515() {
        m4701xbdd2280f();
    }

    /* renamed from: setSurfaceProvider */
    public void m4722x2553c4fc(java.util.concurrent.Executor executor, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0551x50417ba8.SurfaceProvider surfaceProvider) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0799x13794b89.m5939x6483284b();
        if (surfaceProvider == null) {
            this.f1172xd9c98991 = null;
            m4835x7556fed4();
            return;
        }
        this.f1172xd9c98991 = surfaceProvider;
        this.f1173x1893c584 = executor;
        if (m4810x59ee93f() != null) {
            m4712x519c5c8d((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0739x29b48d0a) m4814x27802a65(), m4809xfdddfa15());
            m4836x9763bb86();
        }
        m4834x37f5a7af();
    }

    /* renamed from: setTargetRotation */
    public void m4723x5541f931(int i17) {
        if (m4842x9b2c630e(i17)) {
            m4710x4f1fd887();
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137
    /* renamed from: setViewPortCropRect */
    public void mo4437x8c0c67fc(android.graphics.Rect rect) {
        super.mo4437x8c0c67fc(rect);
        m4710x4f1fd887();
    }

    /* renamed from: toString */
    public java.lang.String m4724x9616526c() {
        return "Preview:" + m4818xfb82e301();
    }

    /* renamed from: setSurfaceProvider */
    public void m4721x2553c4fc(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0551x50417ba8.SurfaceProvider surfaceProvider) {
        m4722x2553c4fc(f1165x30125f91, surfaceProvider);
    }
}
