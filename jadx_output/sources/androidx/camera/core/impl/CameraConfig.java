package androidx.camera.core.impl;

/* loaded from: classes14.dex */
public interface CameraConfig extends androidx.camera.core.impl.ReadableConfig {
    public static final int REQUIRED_RULE_COEXISTING_PREVIEW_AND_IMAGE_CAPTURE = 1;
    public static final int REQUIRED_RULE_NONE = 0;
    public static final androidx.camera.core.impl.Config.Option<androidx.camera.core.impl.UseCaseConfigFactory> OPTION_USECASE_CONFIG_FACTORY = androidx.camera.core.impl.Config.Option.create("camerax.core.camera.useCaseConfigFactory", androidx.camera.core.impl.UseCaseConfigFactory.class);
    public static final androidx.camera.core.impl.Config.Option<androidx.camera.core.impl.Identifier> OPTION_COMPATIBILITY_ID = androidx.camera.core.impl.Config.Option.create("camerax.core.camera.compatibilityId", androidx.camera.core.impl.Identifier.class);
    public static final androidx.camera.core.impl.Config.Option<java.lang.Integer> OPTION_USE_CASE_COMBINATION_REQUIRED_RULE = androidx.camera.core.impl.Config.Option.create("camerax.core.camera.useCaseCombinationRequiredRule", java.lang.Integer.class);
    public static final androidx.camera.core.impl.Config.Option<androidx.camera.core.impl.SessionProcessor> OPTION_SESSION_PROCESSOR = androidx.camera.core.impl.Config.Option.create("camerax.core.camera.SessionProcessor", androidx.camera.core.impl.SessionProcessor.class);
    public static final androidx.camera.core.impl.Config.Option<java.lang.Boolean> OPTION_ZSL_DISABLED = androidx.camera.core.impl.Config.Option.create("camerax.core.camera.isZslDisabled", java.lang.Boolean.class);
    public static final androidx.camera.core.impl.Config.Option<java.lang.Boolean> OPTION_POSTVIEW_SUPPORTED = androidx.camera.core.impl.Config.Option.create("camerax.core.camera.isPostviewSupported", java.lang.Boolean.class);
    public static final androidx.camera.core.impl.Config.Option<java.lang.Boolean> OPTION_CAPTURE_PROCESS_PROGRESS_SUPPORTED = androidx.camera.core.impl.Config.Option.create("camerax.core.camera.isCaptureProcessProgressSupported", java.lang.Boolean.class);

    /* loaded from: classes14.dex */
    public interface Builder<B> {
        B setCaptureProcessProgressSupported(boolean z17);

        B setCompatibilityId(androidx.camera.core.impl.Identifier identifier);

        B setPostviewSupported(boolean z17);

        B setSessionProcessor(androidx.camera.core.impl.SessionProcessor sessionProcessor);

        B setUseCaseCombinationRequiredRule(int i17);

        B setUseCaseConfigFactory(androidx.camera.core.impl.UseCaseConfigFactory useCaseConfigFactory);

        B setZslDisabled(boolean z17);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface RequiredRule {
    }

    androidx.camera.core.impl.Identifier getCompatibilityId();

    default androidx.camera.core.impl.SessionProcessor getSessionProcessor(androidx.camera.core.impl.SessionProcessor sessionProcessor) {
        return (androidx.camera.core.impl.SessionProcessor) retrieveOption(OPTION_SESSION_PROCESSOR, sessionProcessor);
    }

    default int getUseCaseCombinationRequiredRule() {
        return ((java.lang.Integer) retrieveOption(OPTION_USE_CASE_COMBINATION_REQUIRED_RULE, 0)).intValue();
    }

    default androidx.camera.core.impl.UseCaseConfigFactory getUseCaseConfigFactory() {
        return (androidx.camera.core.impl.UseCaseConfigFactory) retrieveOption(OPTION_USECASE_CONFIG_FACTORY, androidx.camera.core.impl.UseCaseConfigFactory.EMPTY_INSTANCE);
    }

    default boolean isCaptureProcessProgressSupported() {
        return ((java.lang.Boolean) retrieveOption(OPTION_CAPTURE_PROCESS_PROGRESS_SUPPORTED, java.lang.Boolean.FALSE)).booleanValue();
    }

    default boolean isPostviewSupported() {
        return ((java.lang.Boolean) retrieveOption(OPTION_POSTVIEW_SUPPORTED, java.lang.Boolean.FALSE)).booleanValue();
    }

    default androidx.camera.core.impl.SessionProcessor getSessionProcessor() {
        return (androidx.camera.core.impl.SessionProcessor) retrieveOption(OPTION_SESSION_PROCESSOR);
    }
}
