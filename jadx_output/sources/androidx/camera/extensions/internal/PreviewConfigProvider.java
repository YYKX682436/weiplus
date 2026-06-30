package androidx.camera.extensions.internal;

/* loaded from: classes14.dex */
public class PreviewConfigProvider implements androidx.camera.core.impl.ConfigProvider<androidx.camera.core.impl.PreviewConfig> {
    private static final java.lang.String TAG = "PreviewConfigProvider";
    private final androidx.camera.extensions.internal.VendorExtender mVendorExtender;

    public PreviewConfigProvider(androidx.camera.extensions.internal.VendorExtender vendorExtender) {
        this.mVendorExtender = vendorExtender;
    }

    public void updateBuilderConfig(androidx.camera.core.Preview.Builder builder, androidx.camera.extensions.internal.VendorExtender vendorExtender) {
        builder.setSupportedResolutions(vendorExtender.getSupportedPreviewOutputResolutions());
        builder.setHighResolutionDisabled(true);
    }

    @Override // androidx.camera.core.impl.ConfigProvider
    public androidx.camera.core.impl.PreviewConfig getConfig() {
        androidx.camera.core.Preview.Builder builder = new androidx.camera.core.Preview.Builder();
        updateBuilderConfig(builder, this.mVendorExtender);
        return builder.getUseCaseConfig();
    }
}
