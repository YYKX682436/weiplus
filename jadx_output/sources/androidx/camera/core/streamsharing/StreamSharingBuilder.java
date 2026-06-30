package androidx.camera.core.streamsharing;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public class StreamSharingBuilder implements androidx.camera.core.impl.UseCaseConfig.Builder<androidx.camera.core.streamsharing.StreamSharing, androidx.camera.core.streamsharing.StreamSharingConfig, androidx.camera.core.streamsharing.StreamSharingBuilder> {
    private static final java.lang.String UNSUPPORTED_MESSAGE = "Operation not supported by StreamSharingBuilder.";
    private final androidx.camera.core.impl.MutableOptionsBundle mMutableConfig;

    public StreamSharingBuilder() {
        this(androidx.camera.core.impl.MutableOptionsBundle.create());
    }

    @Override // androidx.camera.core.ExtendableBuilder
    public androidx.camera.core.impl.MutableConfig getMutableConfig() {
        return this.mMutableConfig;
    }

    @Override // androidx.camera.core.internal.TargetConfig.Builder
    public /* bridge */ /* synthetic */ java.lang.Object setTargetClass(java.lang.Class cls) {
        return setTargetClass((java.lang.Class<androidx.camera.core.streamsharing.StreamSharing>) cls);
    }

    public StreamSharingBuilder(androidx.camera.core.impl.MutableOptionsBundle mutableOptionsBundle) {
        this.mMutableConfig = mutableOptionsBundle;
        java.lang.Class cls = (java.lang.Class) mutableOptionsBundle.retrieveOption(androidx.camera.core.internal.TargetConfig.OPTION_TARGET_CLASS, null);
        if (cls != null && !cls.equals(androidx.camera.core.streamsharing.StreamSharing.class)) {
            throw new java.lang.IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }
        setCaptureType(androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.STREAM_SHARING);
        setTargetClass(androidx.camera.core.streamsharing.StreamSharing.class);
    }

    @Override // androidx.camera.core.ExtendableBuilder
    public androidx.camera.core.streamsharing.StreamSharing build() {
        throw new java.lang.UnsupportedOperationException(UNSUPPORTED_MESSAGE);
    }

    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    public androidx.camera.core.streamsharing.StreamSharingConfig getUseCaseConfig() {
        return new androidx.camera.core.streamsharing.StreamSharingConfig(androidx.camera.core.impl.OptionsBundle.from(this.mMutableConfig));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    public androidx.camera.core.streamsharing.StreamSharingBuilder setCaptureOptionUnpacker(androidx.camera.core.impl.CaptureConfig.OptionUnpacker optionUnpacker) {
        throw new java.lang.UnsupportedOperationException(UNSUPPORTED_MESSAGE);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    public androidx.camera.core.streamsharing.StreamSharingBuilder setCaptureType(androidx.camera.core.impl.UseCaseConfigFactory.CaptureType captureType) {
        getMutableConfig().insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_CAPTURE_TYPE, captureType);
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    public androidx.camera.core.streamsharing.StreamSharingBuilder setDefaultCaptureConfig(androidx.camera.core.impl.CaptureConfig captureConfig) {
        throw new java.lang.UnsupportedOperationException(UNSUPPORTED_MESSAGE);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    public androidx.camera.core.streamsharing.StreamSharingBuilder setDefaultSessionConfig(androidx.camera.core.impl.SessionConfig sessionConfig) {
        throw new java.lang.UnsupportedOperationException(UNSUPPORTED_MESSAGE);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    public androidx.camera.core.streamsharing.StreamSharingBuilder setHighResolutionDisabled(boolean z17) {
        throw new java.lang.UnsupportedOperationException(UNSUPPORTED_MESSAGE);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    public androidx.camera.core.streamsharing.StreamSharingBuilder setSessionOptionUnpacker(androidx.camera.core.impl.SessionConfig.OptionUnpacker optionUnpacker) {
        throw new java.lang.UnsupportedOperationException(UNSUPPORTED_MESSAGE);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    public androidx.camera.core.streamsharing.StreamSharingBuilder setSurfaceOccupancyPriority(int i17) {
        throw new java.lang.UnsupportedOperationException(UNSUPPORTED_MESSAGE);
    }

    @Override // androidx.camera.core.internal.TargetConfig.Builder
    public androidx.camera.core.streamsharing.StreamSharingBuilder setTargetClass(java.lang.Class<androidx.camera.core.streamsharing.StreamSharing> cls) {
        getMutableConfig().insertOption(androidx.camera.core.internal.TargetConfig.OPTION_TARGET_CLASS, cls);
        if (getMutableConfig().retrieveOption(androidx.camera.core.internal.TargetConfig.OPTION_TARGET_NAME, null) == null) {
            setTargetName(cls.getCanonicalName() + "-" + java.util.UUID.randomUUID());
        }
        return this;
    }

    @Override // androidx.camera.core.internal.TargetConfig.Builder
    public androidx.camera.core.streamsharing.StreamSharingBuilder setTargetName(java.lang.String str) {
        getMutableConfig().insertOption(androidx.camera.core.internal.TargetConfig.OPTION_TARGET_NAME, str);
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.camera.core.impl.UseCaseConfig.Builder
    public androidx.camera.core.streamsharing.StreamSharingBuilder setZslDisabled(boolean z17) {
        throw new java.lang.UnsupportedOperationException(UNSUPPORTED_MESSAGE);
    }
}
