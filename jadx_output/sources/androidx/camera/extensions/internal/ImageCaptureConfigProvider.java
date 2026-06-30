package androidx.camera.extensions.internal;

/* loaded from: classes14.dex */
public class ImageCaptureConfigProvider implements androidx.camera.core.impl.ConfigProvider<androidx.camera.core.impl.ImageCaptureConfig> {
    private final androidx.camera.extensions.internal.VendorExtender mVendorExtender;

    public ImageCaptureConfigProvider(androidx.camera.extensions.internal.VendorExtender vendorExtender) {
        this.mVendorExtender = vendorExtender;
    }

    public void updateBuilderConfig(androidx.camera.core.ImageCapture.Builder builder, androidx.camera.extensions.internal.VendorExtender vendorExtender) {
        builder.setSupportedResolutions(vendorExtender.getSupportedCaptureOutputResolutions());
        builder.setHighResolutionDisabled(true);
    }

    @Override // androidx.camera.core.impl.ConfigProvider
    public androidx.camera.core.impl.ImageCaptureConfig getConfig() {
        androidx.camera.core.ImageCapture.Builder builder = new androidx.camera.core.ImageCapture.Builder();
        updateBuilderConfig(builder, this.mVendorExtender);
        return builder.getUseCaseConfig();
    }
}
