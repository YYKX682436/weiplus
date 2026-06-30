package androidx.camera.camera2.internal;

/* loaded from: classes14.dex */
public final class Camera2UseCaseConfigFactory implements androidx.camera.core.impl.UseCaseConfigFactory {
    final androidx.camera.camera2.internal.DisplayInfoManager mDisplayInfoManager;

    public Camera2UseCaseConfigFactory(android.content.Context context) {
        this.mDisplayInfoManager = androidx.camera.camera2.internal.DisplayInfoManager.getInstance(context);
    }

    @Override // androidx.camera.core.impl.UseCaseConfigFactory
    public androidx.camera.core.impl.Config getConfig(androidx.camera.core.impl.UseCaseConfigFactory.CaptureType captureType, int i17) {
        androidx.camera.core.impl.MutableOptionsBundle create = androidx.camera.core.impl.MutableOptionsBundle.create();
        androidx.camera.core.impl.SessionConfig.Builder builder = new androidx.camera.core.impl.SessionConfig.Builder();
        builder.setTemplateType(androidx.camera.camera2.internal.TemplateTypeUtil.getSessionConfigTemplateType(captureType, i17));
        create.insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_DEFAULT_SESSION_CONFIG, builder.build());
        create.insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_SESSION_CONFIG_UNPACKER, androidx.camera.camera2.internal.Camera2SessionOptionUnpacker.INSTANCE);
        androidx.camera.core.impl.CaptureConfig.Builder builder2 = new androidx.camera.core.impl.CaptureConfig.Builder();
        builder2.setTemplateType(androidx.camera.camera2.internal.TemplateTypeUtil.getCaptureConfigTemplateType(captureType, i17));
        create.insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_DEFAULT_CAPTURE_CONFIG, builder2.build());
        create.insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_CAPTURE_CONFIG_UNPACKER, captureType == androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.IMAGE_CAPTURE ? androidx.camera.camera2.internal.ImageCaptureOptionUnpacker.INSTANCE : androidx.camera.camera2.internal.Camera2CaptureOptionUnpacker.INSTANCE);
        if (captureType == androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.PREVIEW) {
            create.insertOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_MAX_RESOLUTION, this.mDisplayInfoManager.getPreviewSize());
        }
        create.insertOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_TARGET_ROTATION, java.lang.Integer.valueOf(this.mDisplayInfoManager.getMaxSizeDisplay(true).getRotation()));
        if (captureType == androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE || captureType == androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.STREAM_SHARING) {
            create.insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_ZSL_DISABLED, java.lang.Boolean.TRUE);
        }
        return androidx.camera.core.impl.OptionsBundle.from(create);
    }
}
