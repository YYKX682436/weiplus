package androidx.camera.camera2.internal;

/* loaded from: classes14.dex */
final class Camera2SessionOptionUnpacker implements androidx.camera.core.impl.SessionConfig.OptionUnpacker {
    static final androidx.camera.camera2.internal.Camera2SessionOptionUnpacker INSTANCE = new androidx.camera.camera2.internal.Camera2SessionOptionUnpacker();

    @Override // androidx.camera.core.impl.SessionConfig.OptionUnpacker
    public void unpack(android.util.Size size, androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig, androidx.camera.core.impl.SessionConfig.Builder builder) {
        androidx.camera.core.impl.SessionConfig defaultSessionConfig = useCaseConfig.getDefaultSessionConfig(null);
        androidx.camera.core.impl.Config emptyBundle = androidx.camera.core.impl.OptionsBundle.emptyBundle();
        int templateType = androidx.camera.core.impl.SessionConfig.defaultEmptySessionConfig().getTemplateType();
        if (defaultSessionConfig != null) {
            templateType = defaultSessionConfig.getTemplateType();
            builder.addAllDeviceStateCallbacks(defaultSessionConfig.getDeviceStateCallbacks());
            builder.addAllSessionStateCallbacks(defaultSessionConfig.getSessionStateCallbacks());
            builder.addAllRepeatingCameraCaptureCallbacks(defaultSessionConfig.getRepeatingCameraCaptureCallbacks());
            emptyBundle = defaultSessionConfig.getImplementationOptions();
        }
        builder.setImplementationOptions(emptyBundle);
        if (useCaseConfig instanceof androidx.camera.core.impl.PreviewConfig) {
            androidx.camera.camera2.internal.compat.workaround.PreviewPixelHDRnet.setHDRnet(size, builder);
        }
        androidx.camera.camera2.impl.Camera2ImplConfig camera2ImplConfig = new androidx.camera.camera2.impl.Camera2ImplConfig(useCaseConfig);
        builder.setTemplateType(camera2ImplConfig.getCaptureRequestTemplate(templateType));
        builder.addDeviceStateCallback(camera2ImplConfig.getDeviceStateCallback(androidx.camera.camera2.internal.CameraDeviceStateCallbacks.createNoOpCallback()));
        builder.addSessionStateCallback(camera2ImplConfig.getSessionStateCallback(androidx.camera.camera2.internal.CameraCaptureSessionStateCallbacks.createNoOpCallback()));
        builder.addCameraCaptureCallback(androidx.camera.camera2.internal.CaptureCallbackContainer.create(camera2ImplConfig.getSessionCaptureCallback(androidx.camera.camera2.internal.Camera2CaptureCallbacks.createNoOpCallback())));
        builder.setVideoStabilization(useCaseConfig.getVideoStabilizationMode());
        builder.setPreviewStabilization(useCaseConfig.getPreviewStabilizationMode());
        androidx.camera.core.impl.MutableOptionsBundle create = androidx.camera.core.impl.MutableOptionsBundle.create();
        create.insertOption(androidx.camera.camera2.impl.Camera2ImplConfig.SESSION_PHYSICAL_CAMERA_ID_OPTION, camera2ImplConfig.getPhysicalCameraId(null));
        create.insertOption(androidx.camera.camera2.impl.Camera2ImplConfig.STREAM_USE_CASE_OPTION, java.lang.Long.valueOf(camera2ImplConfig.getStreamUseCase(-1L)));
        builder.addImplementationOptions(create);
        builder.addImplementationOptions(camera2ImplConfig.getCaptureRequestOptions());
    }
}
