package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220;

/* renamed from: androidx.camera.core.impl.ImageOutputConfig */
/* loaded from: classes14.dex */
public interface InterfaceC0717xf80d107e extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0745x2e0bb72 {

    /* renamed from: INVALID_ROTATION */
    public static final int f1688xf65354e6 = -1;

    /* renamed from: OPTION_APP_TARGET_ROTATION */
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<java.lang.Integer> f1689x71bbed64;

    /* renamed from: OPTION_CUSTOM_ORDERED_RESOLUTIONS */
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<java.util.List<android.util.Size>> f1690x228c71;

    /* renamed from: OPTION_DEFAULT_RESOLUTION */
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<android.util.Size> f1691xcde9ad94;

    /* renamed from: OPTION_MAX_RESOLUTION */
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<android.util.Size> f1692xe906b791;

    /* renamed from: OPTION_MIRROR_MODE */
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<java.lang.Integer> f1693xd5f15d59;

    /* renamed from: OPTION_RESOLUTION_SELECTOR */
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.C0955xda4820cb> f1694xa42c6f48;

    /* renamed from: OPTION_SUPPORTED_RESOLUTIONS */
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>>> f1695x2ed2d6ac;

    /* renamed from: OPTION_TARGET_ASPECT_RATIO */
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<java.lang.Integer> f1696x64f6b668 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option.m5382xaf65a0fc("camerax.core.imageOutput.targetAspectRatio", p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0455xa482ea73.class);

    /* renamed from: OPTION_TARGET_RESOLUTION */
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<android.util.Size> f1697xbf0df2d0;

    /* renamed from: OPTION_TARGET_ROTATION */
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<java.lang.Integer> f1698xe496c6a2;

    /* renamed from: ROTATION_NOT_SPECIFIED */
    public static final int f1699x5100d003 = -1;

    /* renamed from: androidx.camera.core.impl.ImageOutputConfig$Builder */
    /* loaded from: classes14.dex */
    public interface Builder<B> {
        /* renamed from: setCustomOrderedResolutions */
        B mo4451xd3ebe6d(java.util.List<android.util.Size> list);

        /* renamed from: setDefaultResolution */
        B mo4453xe20fa18b(android.util.Size size);

        /* renamed from: setMaxResolution */
        B mo4459xaaf6afee(android.util.Size size);

        /* renamed from: setMirrorMode */
        B mo4460x845d2804(int i17);

        /* renamed from: setResolutionSelector */
        B mo4464x170c48ad(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.C0955xda4820cb c0955xda4820cb);

        /* renamed from: setSupportedResolutions */
        B mo4466x9b56433b(java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>> list);

        /* renamed from: setTargetAspectRatio */
        B mo4468x52ad1800(int i17);

        /* renamed from: setTargetResolution */
        B mo4469xb1b6c19f(android.util.Size size);

        /* renamed from: setTargetRotation */
        B mo4470x5541f931(int i17);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* renamed from: androidx.camera.core.impl.ImageOutputConfig$OptionalRotationValue */
    /* loaded from: classes6.dex */
    public @interface OptionalRotationValue {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* renamed from: androidx.camera.core.impl.ImageOutputConfig$RotationDegreesValue */
    /* loaded from: classes6.dex */
    public @interface RotationDegreesValue {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* renamed from: androidx.camera.core.impl.ImageOutputConfig$RotationValue */
    /* loaded from: classes6.dex */
    public @interface RotationValue {
    }

    static {
        java.lang.Class cls = java.lang.Integer.TYPE;
        f1698xe496c6a2 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option.m5382xaf65a0fc("camerax.core.imageOutput.targetRotation", cls);
        f1689x71bbed64 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option.m5382xaf65a0fc("camerax.core.imageOutput.appTargetRotation", cls);
        f1693xd5f15d59 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option.m5382xaf65a0fc("camerax.core.imageOutput.mirrorMode", cls);
        f1697xbf0df2d0 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option.m5382xaf65a0fc("camerax.core.imageOutput.targetResolution", android.util.Size.class);
        f1691xcde9ad94 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option.m5382xaf65a0fc("camerax.core.imageOutput.defaultResolution", android.util.Size.class);
        f1692xe906b791 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option.m5382xaf65a0fc("camerax.core.imageOutput.maxResolution", android.util.Size.class);
        f1695x2ed2d6ac = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option.m5382xaf65a0fc("camerax.core.imageOutput.supportedResolutions", java.util.List.class);
        f1694xa42c6f48 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option.m5382xaf65a0fc("camerax.core.imageOutput.resolutionSelector", p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.C0955xda4820cb.class);
        f1690x228c71 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option.m5382xaf65a0fc("camerax.core.imageOutput.customOrderedResolutions", java.util.List.class);
    }

    /* renamed from: validateConfig */
    static void m5478xd0bfdff8(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e interfaceC0717xf80d107e) {
        boolean m5496x637d78c8 = interfaceC0717xf80d107e.m5496x637d78c8();
        boolean z17 = interfaceC0717xf80d107e.m5493xdba2c93(null) != null;
        if (m5496x637d78c8 && z17) {
            throw new java.lang.IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        }
        if (interfaceC0717xf80d107e.m5488x7fe0c6a1(null) != null) {
            if (m5496x637d78c8 || z17) {
                throw new java.lang.IllegalArgumentException("Cannot use setTargetResolution or setTargetAspectRatio with setResolutionSelector on the same config.");
            }
        }
    }

    /* renamed from: getAppTargetRotation */
    default int m5479x465bc3fa(int i17) {
        return ((java.lang.Integer) mo5380x77ba97d1(f1689x71bbed64, java.lang.Integer.valueOf(i17))).intValue();
    }

    /* renamed from: getCustomOrderedResolutions */
    default java.util.List<android.util.Size> m5481x5d71f561(java.util.List<android.util.Size> list) {
        java.util.List list2 = (java.util.List) mo5380x77ba97d1(f1690x228c71, list);
        if (list2 != null) {
            return new java.util.ArrayList(list2);
        }
        return null;
    }

    /* renamed from: getDefaultResolution */
    default android.util.Size m5483x6799517(android.util.Size size) {
        return (android.util.Size) mo5380x77ba97d1(f1691xcde9ad94, size);
    }

    /* renamed from: getMaxResolution */
    default android.util.Size m5485x1820497a(android.util.Size size) {
        return (android.util.Size) mo5380x77ba97d1(f1692xe906b791, size);
    }

    /* renamed from: getMirrorMode */
    default int m5486x5638d9f8(int i17) {
        return ((java.lang.Integer) mo5380x77ba97d1(f1693xd5f15d59, java.lang.Integer.valueOf(i17))).intValue();
    }

    /* renamed from: getResolutionSelector */
    default p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.C0955xda4820cb m5488x7fe0c6a1(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.C0955xda4820cb c0955xda4820cb) {
        return (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.C0955xda4820cb) mo5380x77ba97d1(f1694xa42c6f48, c0955xda4820cb);
    }

    /* renamed from: getSupportedResolutions */
    default java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>> m5490x2103142f(java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>> list) {
        return (java.util.List) mo5380x77ba97d1(f1695x2ed2d6ac, list);
    }

    /* renamed from: getTargetAspectRatio */
    default int m5491x77170b8c() {
        return ((java.lang.Integer) mo5379x77ba97d1(f1696x64f6b668)).intValue();
    }

    /* renamed from: getTargetResolution */
    default android.util.Size m5493xdba2c93(android.util.Size size) {
        return (android.util.Size) mo5380x77ba97d1(f1697xbf0df2d0, size);
    }

    /* renamed from: getTargetRotation */
    default int m5495x8d4b9125(int i17) {
        return ((java.lang.Integer) mo5380x77ba97d1(f1698xe496c6a2, java.lang.Integer.valueOf(i17))).intValue();
    }

    /* renamed from: hasTargetAspectRatio */
    default boolean m5496x637d78c8() {
        return mo5374xdccd9774(f1696x64f6b668);
    }

    /* renamed from: getDefaultResolution */
    default android.util.Size m5482x6799517() {
        return (android.util.Size) mo5379x77ba97d1(f1691xcde9ad94);
    }

    /* renamed from: getMaxResolution */
    default android.util.Size m5484x1820497a() {
        return (android.util.Size) mo5379x77ba97d1(f1692xe906b791);
    }

    /* renamed from: getResolutionSelector */
    default p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.C0955xda4820cb m5487x7fe0c6a1() {
        return (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.C0955xda4820cb) mo5379x77ba97d1(f1694xa42c6f48);
    }

    /* renamed from: getSupportedResolutions */
    default java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>> m5489x2103142f() {
        return (java.util.List) mo5379x77ba97d1(f1695x2ed2d6ac);
    }

    /* renamed from: getTargetResolution */
    default android.util.Size m5492xdba2c93() {
        return (android.util.Size) mo5379x77ba97d1(f1697xbf0df2d0);
    }

    /* renamed from: getTargetRotation */
    default int m5494x8d4b9125() {
        return ((java.lang.Integer) mo5379x77ba97d1(f1698xe496c6a2)).intValue();
    }

    /* renamed from: getCustomOrderedResolutions */
    default java.util.List<android.util.Size> m5480x5d71f561() {
        java.util.List list = (java.util.List) mo5379x77ba97d1(f1690x228c71);
        java.util.Objects.requireNonNull(list);
        return new java.util.ArrayList(list);
    }
}
