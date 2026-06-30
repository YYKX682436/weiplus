package androidx.camera.camera2.internal;

/* loaded from: classes14.dex */
final class ImageCaptureOptionUnpacker extends androidx.camera.camera2.internal.Camera2CaptureOptionUnpacker {
    static final androidx.camera.camera2.internal.ImageCaptureOptionUnpacker INSTANCE = new androidx.camera.camera2.internal.ImageCaptureOptionUnpacker(new androidx.camera.camera2.internal.compat.workaround.ImageCapturePixelHDRPlus());
    private final androidx.camera.camera2.internal.compat.workaround.ImageCapturePixelHDRPlus mImageCapturePixelHDRPlus;

    private ImageCaptureOptionUnpacker(androidx.camera.camera2.internal.compat.workaround.ImageCapturePixelHDRPlus imageCapturePixelHDRPlus) {
        this.mImageCapturePixelHDRPlus = imageCapturePixelHDRPlus;
    }

    @Override // androidx.camera.camera2.internal.Camera2CaptureOptionUnpacker, androidx.camera.core.impl.CaptureConfig.OptionUnpacker
    public void unpack(androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig, androidx.camera.core.impl.CaptureConfig.Builder builder) {
        super.unpack(useCaseConfig, builder);
        if (!(useCaseConfig instanceof androidx.camera.core.impl.ImageCaptureConfig)) {
            throw new java.lang.IllegalArgumentException("config is not ImageCaptureConfig");
        }
        androidx.camera.core.impl.ImageCaptureConfig imageCaptureConfig = (androidx.camera.core.impl.ImageCaptureConfig) useCaseConfig;
        androidx.camera.camera2.impl.Camera2ImplConfig.Builder builder2 = new androidx.camera.camera2.impl.Camera2ImplConfig.Builder();
        if (imageCaptureConfig.hasCaptureMode()) {
            this.mImageCapturePixelHDRPlus.toggleHDRPlus(imageCaptureConfig.getCaptureMode(), builder2);
        }
        builder.addImplementationOptions(builder2.build());
    }
}
