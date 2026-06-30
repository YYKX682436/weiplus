package androidx.camera.camera2.internal;

/* loaded from: classes14.dex */
class Camera2CaptureOptionUnpacker implements androidx.camera.core.impl.CaptureConfig.OptionUnpacker {
    static final androidx.camera.camera2.internal.Camera2CaptureOptionUnpacker INSTANCE = new androidx.camera.camera2.internal.Camera2CaptureOptionUnpacker();

    @Override // androidx.camera.core.impl.CaptureConfig.OptionUnpacker
    public void unpack(androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig, androidx.camera.core.impl.CaptureConfig.Builder builder) {
        androidx.camera.core.impl.CaptureConfig defaultCaptureConfig = useCaseConfig.getDefaultCaptureConfig(null);
        androidx.camera.core.impl.Config emptyBundle = androidx.camera.core.impl.OptionsBundle.emptyBundle();
        int templateType = androidx.camera.core.impl.CaptureConfig.defaultEmptyCaptureConfig().getTemplateType();
        if (defaultCaptureConfig != null) {
            templateType = defaultCaptureConfig.getTemplateType();
            builder.addAllCameraCaptureCallbacks(defaultCaptureConfig.getCameraCaptureCallbacks());
            emptyBundle = defaultCaptureConfig.getImplementationOptions();
        }
        builder.setImplementationOptions(emptyBundle);
        androidx.camera.camera2.impl.Camera2ImplConfig camera2ImplConfig = new androidx.camera.camera2.impl.Camera2ImplConfig(useCaseConfig);
        builder.setTemplateType(camera2ImplConfig.getCaptureRequestTemplate(templateType));
        builder.addCameraCaptureCallback(androidx.camera.camera2.internal.CaptureCallbackContainer.create(camera2ImplConfig.getSessionCaptureCallback(androidx.camera.camera2.internal.Camera2CaptureCallbacks.createNoOpCallback())));
        builder.addImplementationOptions(camera2ImplConfig.getCaptureRequestOptions());
    }
}
