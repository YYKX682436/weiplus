package androidx.camera.core.impl;

/* loaded from: classes14.dex */
public final class ImageCaptureConfig implements androidx.camera.core.impl.UseCaseConfig<androidx.camera.core.ImageCapture>, androidx.camera.core.impl.ImageOutputConfig, androidx.camera.core.internal.IoConfig {
    public static final androidx.camera.core.impl.Config.Option<java.lang.Integer> OPTION_BUFFER_FORMAT;
    public static final androidx.camera.core.impl.Config.Option<androidx.camera.core.impl.CaptureBundle> OPTION_CAPTURE_BUNDLE;
    public static final androidx.camera.core.impl.Config.Option<java.lang.Integer> OPTION_FLASH_MODE;
    public static final androidx.camera.core.impl.Config.Option<java.lang.Integer> OPTION_FLASH_TYPE;
    public static final androidx.camera.core.impl.Config.Option<java.lang.Integer> OPTION_IMAGE_CAPTURE_MODE;
    public static final androidx.camera.core.impl.Config.Option<androidx.camera.core.ImageReaderProxyProvider> OPTION_IMAGE_READER_PROXY_PROVIDER;
    public static final androidx.camera.core.impl.Config.Option<java.lang.Integer> OPTION_JPEG_COMPRESSION_QUALITY;
    public static final androidx.camera.core.impl.Config.Option<java.lang.Integer> OPTION_MAX_CAPTURE_STAGES;
    public static final androidx.camera.core.impl.Config.Option<java.lang.Integer> OPTION_OUTPUT_FORMAT;
    public static final androidx.camera.core.impl.Config.Option<java.lang.Boolean> OPTION_POSTVIEW_ENABLED;
    public static final androidx.camera.core.impl.Config.Option<androidx.camera.core.resolutionselector.ResolutionSelector> OPTION_POSTVIEW_RESOLUTION_SELECTOR;
    public static final androidx.camera.core.impl.Config.Option<androidx.camera.core.ImageCapture.ScreenFlash> OPTION_SCREEN_FLASH;
    public static final androidx.camera.core.impl.Config.Option<java.lang.Boolean> OPTION_USE_SOFTWARE_JPEG_ENCODER;
    private final androidx.camera.core.impl.OptionsBundle mConfig;

    static {
        java.lang.Class cls = java.lang.Integer.TYPE;
        OPTION_IMAGE_CAPTURE_MODE = androidx.camera.core.impl.Config.Option.create("camerax.core.imageCapture.captureMode", cls);
        OPTION_FLASH_MODE = androidx.camera.core.impl.Config.Option.create("camerax.core.imageCapture.flashMode", cls);
        OPTION_CAPTURE_BUNDLE = androidx.camera.core.impl.Config.Option.create("camerax.core.imageCapture.captureBundle", androidx.camera.core.impl.CaptureBundle.class);
        OPTION_BUFFER_FORMAT = androidx.camera.core.impl.Config.Option.create("camerax.core.imageCapture.bufferFormat", java.lang.Integer.class);
        OPTION_OUTPUT_FORMAT = androidx.camera.core.impl.Config.Option.create("camerax.core.imageCapture.outputFormat", java.lang.Integer.class);
        OPTION_MAX_CAPTURE_STAGES = androidx.camera.core.impl.Config.Option.create("camerax.core.imageCapture.maxCaptureStages", java.lang.Integer.class);
        OPTION_IMAGE_READER_PROXY_PROVIDER = androidx.camera.core.impl.Config.Option.create("camerax.core.imageCapture.imageReaderProxyProvider", androidx.camera.core.ImageReaderProxyProvider.class);
        OPTION_USE_SOFTWARE_JPEG_ENCODER = androidx.camera.core.impl.Config.Option.create("camerax.core.imageCapture.useSoftwareJpegEncoder", java.lang.Boolean.TYPE);
        OPTION_FLASH_TYPE = androidx.camera.core.impl.Config.Option.create("camerax.core.imageCapture.flashType", cls);
        OPTION_JPEG_COMPRESSION_QUALITY = androidx.camera.core.impl.Config.Option.create("camerax.core.imageCapture.jpegCompressionQuality", cls);
        OPTION_SCREEN_FLASH = androidx.camera.core.impl.Config.Option.create("camerax.core.imageCapture.screenFlash", androidx.camera.core.ImageCapture.ScreenFlash.class);
        OPTION_POSTVIEW_RESOLUTION_SELECTOR = androidx.camera.core.impl.Config.Option.create("camerax.core.useCase.postviewResolutionSelector", androidx.camera.core.resolutionselector.ResolutionSelector.class);
        OPTION_POSTVIEW_ENABLED = androidx.camera.core.impl.Config.Option.create("camerax.core.useCase.isPostviewEnabled", java.lang.Boolean.class);
    }

    public ImageCaptureConfig(androidx.camera.core.impl.OptionsBundle optionsBundle) {
        this.mConfig = optionsBundle;
    }

    public java.lang.Integer getBufferFormat(java.lang.Integer num) {
        return (java.lang.Integer) retrieveOption(OPTION_BUFFER_FORMAT, num);
    }

    public androidx.camera.core.impl.CaptureBundle getCaptureBundle(androidx.camera.core.impl.CaptureBundle captureBundle) {
        return (androidx.camera.core.impl.CaptureBundle) retrieveOption(OPTION_CAPTURE_BUNDLE, captureBundle);
    }

    public int getCaptureMode() {
        return ((java.lang.Integer) retrieveOption(OPTION_IMAGE_CAPTURE_MODE)).intValue();
    }

    @Override // androidx.camera.core.impl.ReadableConfig
    public androidx.camera.core.impl.Config getConfig() {
        return this.mConfig;
    }

    public int getFlashMode(int i17) {
        return ((java.lang.Integer) retrieveOption(OPTION_FLASH_MODE, java.lang.Integer.valueOf(i17))).intValue();
    }

    public int getFlashType(int i17) {
        return ((java.lang.Integer) retrieveOption(OPTION_FLASH_TYPE, java.lang.Integer.valueOf(i17))).intValue();
    }

    public androidx.camera.core.ImageReaderProxyProvider getImageReaderProxyProvider() {
        return (androidx.camera.core.ImageReaderProxyProvider) retrieveOption(OPTION_IMAGE_READER_PROXY_PROVIDER, null);
    }

    @Override // androidx.camera.core.impl.ImageInputConfig
    public int getInputFormat() {
        return ((java.lang.Integer) retrieveOption(androidx.camera.core.impl.ImageInputConfig.OPTION_INPUT_FORMAT)).intValue();
    }

    @Override // androidx.camera.core.internal.IoConfig
    public java.util.concurrent.Executor getIoExecutor(java.util.concurrent.Executor executor) {
        return (java.util.concurrent.Executor) retrieveOption(androidx.camera.core.internal.IoConfig.OPTION_IO_EXECUTOR, executor);
    }

    public int getJpegQuality(int i17) {
        return ((java.lang.Integer) retrieveOption(OPTION_JPEG_COMPRESSION_QUALITY, java.lang.Integer.valueOf(i17))).intValue();
    }

    public int getMaxCaptureStages(int i17) {
        return ((java.lang.Integer) retrieveOption(OPTION_MAX_CAPTURE_STAGES, java.lang.Integer.valueOf(i17))).intValue();
    }

    public androidx.camera.core.resolutionselector.ResolutionSelector getPostviewResolutionSelector() {
        return (androidx.camera.core.resolutionselector.ResolutionSelector) retrieveOption(OPTION_POSTVIEW_RESOLUTION_SELECTOR, null);
    }

    public androidx.camera.core.ImageCapture.ScreenFlash getScreenFlash() {
        return (androidx.camera.core.ImageCapture.ScreenFlash) retrieveOption(OPTION_SCREEN_FLASH, null);
    }

    public boolean hasCaptureMode() {
        return containsOption(OPTION_IMAGE_CAPTURE_MODE);
    }

    public boolean isPostviewEnabled() {
        return ((java.lang.Boolean) retrieveOption(OPTION_POSTVIEW_ENABLED, java.lang.Boolean.FALSE)).booleanValue();
    }

    public boolean isSoftwareJpegEncoderRequested() {
        return ((java.lang.Boolean) retrieveOption(OPTION_USE_SOFTWARE_JPEG_ENCODER, java.lang.Boolean.FALSE)).booleanValue();
    }

    public java.lang.Integer getBufferFormat() {
        return (java.lang.Integer) retrieveOption(OPTION_BUFFER_FORMAT);
    }

    public androidx.camera.core.impl.CaptureBundle getCaptureBundle() {
        return (androidx.camera.core.impl.CaptureBundle) retrieveOption(OPTION_CAPTURE_BUNDLE);
    }

    public int getFlashMode() {
        return ((java.lang.Integer) retrieveOption(OPTION_FLASH_MODE)).intValue();
    }

    public int getFlashType() {
        return ((java.lang.Integer) retrieveOption(OPTION_FLASH_TYPE)).intValue();
    }

    @Override // androidx.camera.core.internal.IoConfig
    public java.util.concurrent.Executor getIoExecutor() {
        return (java.util.concurrent.Executor) retrieveOption(androidx.camera.core.internal.IoConfig.OPTION_IO_EXECUTOR);
    }

    public int getJpegQuality() {
        return ((java.lang.Integer) retrieveOption(OPTION_JPEG_COMPRESSION_QUALITY)).intValue();
    }

    public int getMaxCaptureStages() {
        return ((java.lang.Integer) retrieveOption(OPTION_MAX_CAPTURE_STAGES)).intValue();
    }
}
