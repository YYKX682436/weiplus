package androidx.camera.core.impl;

/* loaded from: classes14.dex */
public interface UseCaseConfig<T extends androidx.camera.core.UseCase> extends androidx.camera.core.internal.TargetConfig<T>, androidx.camera.core.impl.ImageInputConfig {
    public static final androidx.camera.core.impl.Config.Option<androidx.camera.core.impl.UseCaseConfigFactory.CaptureType> OPTION_CAPTURE_TYPE;
    public static final androidx.camera.core.impl.Config.Option<java.lang.Boolean> OPTION_HIGH_RESOLUTION_DISABLED;
    public static final androidx.camera.core.impl.Config.Option<java.lang.Integer> OPTION_PREVIEW_STABILIZATION_MODE;
    public static final androidx.camera.core.impl.Config.Option<java.lang.Integer> OPTION_SURFACE_OCCUPANCY_PRIORITY;
    public static final androidx.camera.core.impl.Config.Option<android.util.Range<java.lang.Integer>> OPTION_TARGET_FRAME_RATE;
    public static final androidx.camera.core.impl.Config.Option<java.lang.Integer> OPTION_VIDEO_STABILIZATION_MODE;
    public static final androidx.camera.core.impl.Config.Option<java.lang.Boolean> OPTION_ZSL_DISABLED;
    public static final androidx.camera.core.impl.Config.Option<androidx.camera.core.impl.SessionConfig> OPTION_DEFAULT_SESSION_CONFIG = androidx.camera.core.impl.Config.Option.create("camerax.core.useCase.defaultSessionConfig", androidx.camera.core.impl.SessionConfig.class);
    public static final androidx.camera.core.impl.Config.Option<androidx.camera.core.impl.CaptureConfig> OPTION_DEFAULT_CAPTURE_CONFIG = androidx.camera.core.impl.Config.Option.create("camerax.core.useCase.defaultCaptureConfig", androidx.camera.core.impl.CaptureConfig.class);
    public static final androidx.camera.core.impl.Config.Option<androidx.camera.core.impl.SessionConfig.OptionUnpacker> OPTION_SESSION_CONFIG_UNPACKER = androidx.camera.core.impl.Config.Option.create("camerax.core.useCase.sessionConfigUnpacker", androidx.camera.core.impl.SessionConfig.OptionUnpacker.class);
    public static final androidx.camera.core.impl.Config.Option<androidx.camera.core.impl.CaptureConfig.OptionUnpacker> OPTION_CAPTURE_CONFIG_UNPACKER = androidx.camera.core.impl.Config.Option.create("camerax.core.useCase.captureConfigUnpacker", androidx.camera.core.impl.CaptureConfig.OptionUnpacker.class);

    /* loaded from: classes14.dex */
    public interface Builder<T extends androidx.camera.core.UseCase, C extends androidx.camera.core.impl.UseCaseConfig<T>, B> extends androidx.camera.core.internal.TargetConfig.Builder<T, B>, androidx.camera.core.ExtendableBuilder<T> {
        C getUseCaseConfig();

        B setCaptureOptionUnpacker(androidx.camera.core.impl.CaptureConfig.OptionUnpacker optionUnpacker);

        B setCaptureType(androidx.camera.core.impl.UseCaseConfigFactory.CaptureType captureType);

        B setDefaultCaptureConfig(androidx.camera.core.impl.CaptureConfig captureConfig);

        B setDefaultSessionConfig(androidx.camera.core.impl.SessionConfig sessionConfig);

        B setHighResolutionDisabled(boolean z17);

        B setSessionOptionUnpacker(androidx.camera.core.impl.SessionConfig.OptionUnpacker optionUnpacker);

        B setSurfaceOccupancyPriority(int i17);

        B setZslDisabled(boolean z17);
    }

    static {
        java.lang.Class cls = java.lang.Integer.TYPE;
        OPTION_SURFACE_OCCUPANCY_PRIORITY = androidx.camera.core.impl.Config.Option.create("camerax.core.useCase.surfaceOccupancyPriority", cls);
        OPTION_TARGET_FRAME_RATE = androidx.camera.core.impl.Config.Option.create("camerax.core.useCase.targetFrameRate", android.util.Range.class);
        java.lang.Class cls2 = java.lang.Boolean.TYPE;
        OPTION_ZSL_DISABLED = androidx.camera.core.impl.Config.Option.create("camerax.core.useCase.zslDisabled", cls2);
        OPTION_HIGH_RESOLUTION_DISABLED = androidx.camera.core.impl.Config.Option.create("camerax.core.useCase.highResolutionDisabled", cls2);
        OPTION_CAPTURE_TYPE = androidx.camera.core.impl.Config.Option.create("camerax.core.useCase.captureType", androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.class);
        OPTION_PREVIEW_STABILIZATION_MODE = androidx.camera.core.impl.Config.Option.create("camerax.core.useCase.previewStabilizationMode", cls);
        OPTION_VIDEO_STABILIZATION_MODE = androidx.camera.core.impl.Config.Option.create("camerax.core.useCase.videoStabilizationMode", cls);
    }

    default androidx.camera.core.impl.CaptureConfig.OptionUnpacker getCaptureOptionUnpacker(androidx.camera.core.impl.CaptureConfig.OptionUnpacker optionUnpacker) {
        return (androidx.camera.core.impl.CaptureConfig.OptionUnpacker) retrieveOption(OPTION_CAPTURE_CONFIG_UNPACKER, optionUnpacker);
    }

    default androidx.camera.core.impl.UseCaseConfigFactory.CaptureType getCaptureType() {
        return (androidx.camera.core.impl.UseCaseConfigFactory.CaptureType) retrieveOption(OPTION_CAPTURE_TYPE);
    }

    default androidx.camera.core.impl.CaptureConfig getDefaultCaptureConfig(androidx.camera.core.impl.CaptureConfig captureConfig) {
        return (androidx.camera.core.impl.CaptureConfig) retrieveOption(OPTION_DEFAULT_CAPTURE_CONFIG, captureConfig);
    }

    default androidx.camera.core.impl.SessionConfig getDefaultSessionConfig(androidx.camera.core.impl.SessionConfig sessionConfig) {
        return (androidx.camera.core.impl.SessionConfig) retrieveOption(OPTION_DEFAULT_SESSION_CONFIG, sessionConfig);
    }

    default int getPreviewStabilizationMode() {
        return ((java.lang.Integer) retrieveOption(OPTION_PREVIEW_STABILIZATION_MODE, 0)).intValue();
    }

    default androidx.camera.core.impl.SessionConfig.OptionUnpacker getSessionOptionUnpacker(androidx.camera.core.impl.SessionConfig.OptionUnpacker optionUnpacker) {
        return (androidx.camera.core.impl.SessionConfig.OptionUnpacker) retrieveOption(OPTION_SESSION_CONFIG_UNPACKER, optionUnpacker);
    }

    default int getSurfaceOccupancyPriority(int i17) {
        return ((java.lang.Integer) retrieveOption(OPTION_SURFACE_OCCUPANCY_PRIORITY, java.lang.Integer.valueOf(i17))).intValue();
    }

    default android.util.Range<java.lang.Integer> getTargetFrameRate(android.util.Range<java.lang.Integer> range) {
        return (android.util.Range) retrieveOption(OPTION_TARGET_FRAME_RATE, range);
    }

    default int getVideoStabilizationMode() {
        return ((java.lang.Integer) retrieveOption(OPTION_VIDEO_STABILIZATION_MODE, 0)).intValue();
    }

    default boolean isHighResolutionDisabled(boolean z17) {
        return ((java.lang.Boolean) retrieveOption(OPTION_HIGH_RESOLUTION_DISABLED, java.lang.Boolean.valueOf(z17))).booleanValue();
    }

    default boolean isZslDisabled(boolean z17) {
        return ((java.lang.Boolean) retrieveOption(OPTION_ZSL_DISABLED, java.lang.Boolean.valueOf(z17))).booleanValue();
    }

    default androidx.camera.core.impl.CaptureConfig.OptionUnpacker getCaptureOptionUnpacker() {
        return (androidx.camera.core.impl.CaptureConfig.OptionUnpacker) retrieveOption(OPTION_CAPTURE_CONFIG_UNPACKER);
    }

    default androidx.camera.core.impl.CaptureConfig getDefaultCaptureConfig() {
        return (androidx.camera.core.impl.CaptureConfig) retrieveOption(OPTION_DEFAULT_CAPTURE_CONFIG);
    }

    default androidx.camera.core.impl.SessionConfig getDefaultSessionConfig() {
        return (androidx.camera.core.impl.SessionConfig) retrieveOption(OPTION_DEFAULT_SESSION_CONFIG);
    }

    default androidx.camera.core.impl.SessionConfig.OptionUnpacker getSessionOptionUnpacker() {
        return (androidx.camera.core.impl.SessionConfig.OptionUnpacker) retrieveOption(OPTION_SESSION_CONFIG_UNPACKER);
    }

    default int getSurfaceOccupancyPriority() {
        return ((java.lang.Integer) retrieveOption(OPTION_SURFACE_OCCUPANCY_PRIORITY)).intValue();
    }

    default android.util.Range<java.lang.Integer> getTargetFrameRate() {
        return (android.util.Range) retrieveOption(OPTION_TARGET_FRAME_RATE);
    }
}
