package androidx.camera.core.impl;

/* loaded from: classes14.dex */
public final class PreviewConfig implements androidx.camera.core.impl.UseCaseConfig<androidx.camera.core.Preview>, androidx.camera.core.impl.ImageOutputConfig, androidx.camera.core.internal.ThreadConfig {
    private final androidx.camera.core.impl.OptionsBundle mConfig;

    public PreviewConfig(androidx.camera.core.impl.OptionsBundle optionsBundle) {
        this.mConfig = optionsBundle;
    }

    @Override // androidx.camera.core.impl.ReadableConfig
    public androidx.camera.core.impl.Config getConfig() {
        return this.mConfig;
    }

    @Override // androidx.camera.core.impl.ImageInputConfig
    public int getInputFormat() {
        return ((java.lang.Integer) retrieveOption(androidx.camera.core.impl.ImageInputConfig.OPTION_INPUT_FORMAT)).intValue();
    }
}
