package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220;

/* renamed from: androidx.camera.core.impl.CameraConfig */
/* loaded from: classes14.dex */
public interface InterfaceC0665xb691d6e7 extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0745x2e0bb72 {

    /* renamed from: REQUIRED_RULE_COEXISTING_PREVIEW_AND_IMAGE_CAPTURE */
    public static final int f1551x795b7d3e = 1;

    /* renamed from: REQUIRED_RULE_NONE */
    public static final int f1552x29c429fb = 0;

    /* renamed from: OPTION_USECASE_CONFIG_FACTORY */
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771> f1548xadbb341f = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option.m5382xaf65a0fc("camerax.core.camera.useCaseConfigFactory", p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.class);

    /* renamed from: OPTION_COMPATIBILITY_ID */
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0711x165a88c9> f1545x2cb08cf4 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option.m5382xaf65a0fc("camerax.core.camera.compatibilityId", p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0711x165a88c9.class);

    /* renamed from: OPTION_USE_CASE_COMBINATION_REQUIRED_RULE */
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<java.lang.Integer> f1549x73a9939f = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option.m5382xaf65a0fc("camerax.core.camera.useCaseCombinationRequiredRule", java.lang.Integer.class);

    /* renamed from: OPTION_SESSION_PROCESSOR */
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0752x161fb6bc> f1547xe3dd5c9f = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option.m5382xaf65a0fc("camerax.core.camera.SessionProcessor", p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0752x161fb6bc.class);

    /* renamed from: OPTION_ZSL_DISABLED */
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<java.lang.Boolean> f1550x83019c92 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option.m5382xaf65a0fc("camerax.core.camera.isZslDisabled", java.lang.Boolean.class);

    /* renamed from: OPTION_POSTVIEW_SUPPORTED */
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<java.lang.Boolean> f1546xd57a041e = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option.m5382xaf65a0fc("camerax.core.camera.isPostviewSupported", java.lang.Boolean.class);

    /* renamed from: OPTION_CAPTURE_PROCESS_PROGRESS_SUPPORTED */
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<java.lang.Boolean> f1544x585b0daf = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option.m5382xaf65a0fc("camerax.core.camera.isCaptureProcessProgressSupported", java.lang.Boolean.class);

    /* renamed from: androidx.camera.core.impl.CameraConfig$Builder */
    /* loaded from: classes14.dex */
    public interface Builder<B> {
        /* renamed from: setCaptureProcessProgressSupported */
        B mo5265xce9e6af6(boolean z17);

        /* renamed from: setCompatibilityId */
        B mo5266xd6aa9de9(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0711x165a88c9 abstractC0711x165a88c9);

        /* renamed from: setPostviewSupported */
        B mo5267xd84ee2a7(boolean z17);

        /* renamed from: setSessionProcessor */
        B mo5268x94306f1e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0752x161fb6bc interfaceC0752x161fb6bc);

        /* renamed from: setUseCaseCombinationRequiredRule */
        B mo5269x583cbd55(int i17);

        /* renamed from: setUseCaseConfigFactory */
        B mo5270xd4a11ed3(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771 interfaceC0769xb8476771);

        /* renamed from: setZslDisabled */
        B mo5271xc3162e2d(boolean z17);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* renamed from: androidx.camera.core.impl.CameraConfig$RequiredRule */
    /* loaded from: classes6.dex */
    public @interface RequiredRule {
    }

    /* renamed from: getCompatibilityId */
    p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0711x165a88c9 mo5258x9fd40475();

    /* renamed from: getSessionProcessor */
    default p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0752x161fb6bc m5260xf033da12(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0752x161fb6bc interfaceC0752x161fb6bc) {
        return (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0752x161fb6bc) mo5380x77ba97d1(f1547xe3dd5c9f, interfaceC0752x161fb6bc);
    }

    /* renamed from: getUseCaseCombinationRequiredRule */
    default int m5261x721fed49() {
        return ((java.lang.Integer) mo5380x77ba97d1(f1549x73a9939f, 0)).intValue();
    }

    /* renamed from: getUseCaseConfigFactory */
    default p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771 m5262x5a4defc7() {
        return (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771) mo5380x77ba97d1(f1548xadbb341f, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.f1839x2368ab67);
    }

    /* renamed from: isCaptureProcessProgressSupported */
    default boolean m5263xc888012e() {
        return ((java.lang.Boolean) mo5380x77ba97d1(f1544x585b0daf, java.lang.Boolean.FALSE)).booleanValue();
    }

    /* renamed from: isPostviewSupported */
    default boolean m5264x3cb33adf() {
        return ((java.lang.Boolean) mo5380x77ba97d1(f1546xd57a041e, java.lang.Boolean.FALSE)).booleanValue();
    }

    /* renamed from: getSessionProcessor */
    default p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0752x161fb6bc m5259xf033da12() {
        return (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0752x161fb6bc) mo5379x77ba97d1(f1547xe3dd5c9f);
    }
}
