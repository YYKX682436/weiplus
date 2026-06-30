package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220;

/* renamed from: androidx.camera.core.impl.UseCaseConfig */
/* loaded from: classes14.dex */
public interface InterfaceC0768x83509b59<T extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137> extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.InterfaceC0840xcdfd0453<T>, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0716x5f72b371 {

    /* renamed from: OPTION_CAPTURE_TYPE */
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.CaptureType> f1829x7803883d;

    /* renamed from: OPTION_HIGH_RESOLUTION_DISABLED */
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<java.lang.Boolean> f1832x6e134b1c;

    /* renamed from: OPTION_PREVIEW_STABILIZATION_MODE */
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<java.lang.Integer> f1833xf56d3424;

    /* renamed from: OPTION_SURFACE_OCCUPANCY_PRIORITY */
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<java.lang.Integer> f1835x80437872;

    /* renamed from: OPTION_TARGET_FRAME_RATE */
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<android.util.Range<java.lang.Integer>> f1836x100ea2b6;

    /* renamed from: OPTION_VIDEO_STABILIZATION_MODE */
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<java.lang.Integer> f1837x7f07e711;

    /* renamed from: OPTION_ZSL_DISABLED */
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<java.lang.Boolean> f1838x83019c92;

    /* renamed from: OPTION_DEFAULT_SESSION_CONFIG */
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958> f1831x26a4ea13 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option.m5382xaf65a0fc("camerax.core.useCase.defaultSessionConfig", p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.class);

    /* renamed from: OPTION_DEFAULT_CAPTURE_CONFIG */
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08> f1830x55dfff63 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option.m5382xaf65a0fc("camerax.core.useCase.defaultCaptureConfig", p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08.class);

    /* renamed from: OPTION_SESSION_CONFIG_UNPACKER */
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.OptionUnpacker> f1834x50776329 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option.m5382xaf65a0fc("camerax.core.useCase.sessionConfigUnpacker", p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.OptionUnpacker.class);

    /* renamed from: OPTION_CAPTURE_CONFIG_UNPACKER */
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08.OptionUnpacker> f1828x70d747d9 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option.m5382xaf65a0fc("camerax.core.useCase.captureConfigUnpacker", p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08.OptionUnpacker.class);

    /* renamed from: androidx.camera.core.impl.UseCaseConfig$Builder */
    /* loaded from: classes14.dex */
    public interface Builder<T extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137, C extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<T>, B> extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.InterfaceC0840xcdfd0453.Builder<T, B>, p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0501xb43e0567<T> {
        /* renamed from: getUseCaseConfig */
        C mo4446x111127c3();

        /* renamed from: setCaptureOptionUnpacker */
        B mo4449x89aad198(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08.OptionUnpacker optionUnpacker);

        /* renamed from: setCaptureType */
        B mo4450x79f271de(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.CaptureType captureType);

        /* renamed from: setDefaultCaptureConfig */
        B mo4452x8bbd60e9(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08 c0690x88f65a08);

        /* renamed from: setDefaultSessionConfig */
        B mo4454xe586039(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 c0750xb915958);

        /* renamed from: setHighResolutionDisabled */
        B mo4456xcfdff38c(boolean z17);

        /* renamed from: setSessionOptionUnpacker */
        B mo4465x523980e8(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.OptionUnpacker optionUnpacker);

        /* renamed from: setSurfaceOccupancyPriority */
        B mo4467x678fae66(int i17);

        /* renamed from: setZslDisabled */
        B mo4471xc3162e2d(boolean z17);
    }

    static {
        java.lang.Class cls = java.lang.Integer.TYPE;
        f1835x80437872 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option.m5382xaf65a0fc("camerax.core.useCase.surfaceOccupancyPriority", cls);
        f1836x100ea2b6 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option.m5382xaf65a0fc("camerax.core.useCase.targetFrameRate", android.util.Range.class);
        java.lang.Class cls2 = java.lang.Boolean.TYPE;
        f1838x83019c92 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option.m5382xaf65a0fc("camerax.core.useCase.zslDisabled", cls2);
        f1832x6e134b1c = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option.m5382xaf65a0fc("camerax.core.useCase.highResolutionDisabled", cls2);
        f1829x7803883d = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option.m5382xaf65a0fc("camerax.core.useCase.captureType", p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.CaptureType.class);
        f1833xf56d3424 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option.m5382xaf65a0fc("camerax.core.useCase.previewStabilizationMode", cls);
        f1837x7f07e711 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option.m5382xaf65a0fc("camerax.core.useCase.videoStabilizationMode", cls);
    }

    /* renamed from: getCaptureOptionUnpacker */
    default p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08.OptionUnpacker m5743xb9981f24(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08.OptionUnpacker optionUnpacker) {
        return (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08.OptionUnpacker) mo5380x77ba97d1(f1828x70d747d9, optionUnpacker);
    }

    /* renamed from: getCaptureType */
    default p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.CaptureType mo3493xe38cfe6a() {
        return (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.CaptureType) mo5379x77ba97d1(f1829x7803883d);
    }

    /* renamed from: getDefaultCaptureConfig */
    default p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08 m5745x116a31dd(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08 c0690x88f65a08) {
        return (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08) mo5380x77ba97d1(f1830x55dfff63, c0690x88f65a08);
    }

    /* renamed from: getDefaultSessionConfig */
    default p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 m5747x9405312d(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 c0750xb915958) {
        return (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958) mo5380x77ba97d1(f1831x26a4ea13, c0750xb915958);
    }

    /* renamed from: getPreviewStabilizationMode */
    default int m5748x732bab0() {
        return ((java.lang.Integer) mo5380x77ba97d1(f1833xf56d3424, 0)).intValue();
    }

    /* renamed from: getSessionOptionUnpacker */
    default p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.OptionUnpacker m5750x8226ce74(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.OptionUnpacker optionUnpacker) {
        return (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.OptionUnpacker) mo5380x77ba97d1(f1834x50776329, optionUnpacker);
    }

    /* renamed from: getSurfaceOccupancyPriority */
    default int m5752xb7c2e55a(int i17) {
        return ((java.lang.Integer) mo5380x77ba97d1(f1835x80437872, java.lang.Integer.valueOf(i17))).intValue();
    }

    /* renamed from: getTargetFrameRate */
    default android.util.Range<java.lang.Integer> m5754x871a9f26(android.util.Range<java.lang.Integer> range) {
        return (android.util.Range) mo5380x77ba97d1(f1836x100ea2b6, range);
    }

    /* renamed from: getVideoStabilizationMode */
    default int m5755x96948bdd() {
        return ((java.lang.Integer) mo5380x77ba97d1(f1837x7f07e711, 0)).intValue();
    }

    /* renamed from: isHighResolutionDisabled */
    default boolean m5756x1401fe54(boolean z17) {
        return ((java.lang.Boolean) mo5380x77ba97d1(f1832x6e134b1c, java.lang.Boolean.valueOf(z17))).booleanValue();
    }

    /* renamed from: isZslDisabled */
    default boolean m5757xfecf1065(boolean z17) {
        return ((java.lang.Boolean) mo5380x77ba97d1(f1838x83019c92, java.lang.Boolean.valueOf(z17))).booleanValue();
    }

    /* renamed from: getCaptureOptionUnpacker */
    default p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08.OptionUnpacker m5742xb9981f24() {
        return (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08.OptionUnpacker) mo5379x77ba97d1(f1828x70d747d9);
    }

    /* renamed from: getDefaultCaptureConfig */
    default p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08 m5744x116a31dd() {
        return (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08) mo5379x77ba97d1(f1830x55dfff63);
    }

    /* renamed from: getDefaultSessionConfig */
    default p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958 m5746x9405312d() {
        return (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958) mo5379x77ba97d1(f1831x26a4ea13);
    }

    /* renamed from: getSessionOptionUnpacker */
    default p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.OptionUnpacker m5749x8226ce74() {
        return (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.OptionUnpacker) mo5379x77ba97d1(f1834x50776329);
    }

    /* renamed from: getSurfaceOccupancyPriority */
    default int m5751xb7c2e55a() {
        return ((java.lang.Integer) mo5379x77ba97d1(f1835x80437872)).intValue();
    }

    /* renamed from: getTargetFrameRate */
    default android.util.Range<java.lang.Integer> m5753x871a9f26() {
        return (android.util.Range) mo5379x77ba97d1(f1836x100ea2b6);
    }
}
