package androidx.camera.extensions;

/* loaded from: classes14.dex */
class ExtensionsConfig implements androidx.camera.core.impl.CameraConfig {
    public static final androidx.camera.core.impl.Config.Option<java.lang.Integer> OPTION_EXTENSION_MODE = androidx.camera.core.impl.Config.Option.create("camerax.extensions.extensionMode", java.lang.Integer.TYPE);
    private final androidx.camera.core.impl.Config mConfig;

    /* loaded from: classes14.dex */
    public static final class Builder implements androidx.camera.core.impl.CameraConfig.Builder<androidx.camera.extensions.ExtensionsConfig.Builder> {
        private final androidx.camera.core.impl.MutableOptionsBundle mConfig = androidx.camera.core.impl.MutableOptionsBundle.create();

        public androidx.camera.extensions.ExtensionsConfig build() {
            return new androidx.camera.extensions.ExtensionsConfig(this.mConfig);
        }

        public androidx.camera.extensions.ExtensionsConfig.Builder setExtensionMode(int i17) {
            this.mConfig.insertOption(androidx.camera.extensions.ExtensionsConfig.OPTION_EXTENSION_MODE, java.lang.Integer.valueOf(i17));
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.CameraConfig.Builder
        public androidx.camera.extensions.ExtensionsConfig.Builder setCaptureProcessProgressSupported(boolean z17) {
            this.mConfig.insertOption(androidx.camera.core.impl.CameraConfig.OPTION_CAPTURE_PROCESS_PROGRESS_SUPPORTED, java.lang.Boolean.valueOf(z17));
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.CameraConfig.Builder
        public androidx.camera.extensions.ExtensionsConfig.Builder setCompatibilityId(androidx.camera.core.impl.Identifier identifier) {
            this.mConfig.insertOption(androidx.camera.core.impl.CameraConfig.OPTION_COMPATIBILITY_ID, identifier);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.CameraConfig.Builder
        public androidx.camera.extensions.ExtensionsConfig.Builder setPostviewSupported(boolean z17) {
            this.mConfig.insertOption(androidx.camera.core.impl.CameraConfig.OPTION_POSTVIEW_SUPPORTED, java.lang.Boolean.valueOf(z17));
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.CameraConfig.Builder
        public androidx.camera.extensions.ExtensionsConfig.Builder setSessionProcessor(androidx.camera.core.impl.SessionProcessor sessionProcessor) {
            this.mConfig.insertOption(androidx.camera.core.impl.CameraConfig.OPTION_SESSION_PROCESSOR, sessionProcessor);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.CameraConfig.Builder
        public androidx.camera.extensions.ExtensionsConfig.Builder setUseCaseCombinationRequiredRule(int i17) {
            this.mConfig.insertOption(androidx.camera.core.impl.CameraConfig.OPTION_USE_CASE_COMBINATION_REQUIRED_RULE, java.lang.Integer.valueOf(i17));
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.CameraConfig.Builder
        public androidx.camera.extensions.ExtensionsConfig.Builder setUseCaseConfigFactory(androidx.camera.core.impl.UseCaseConfigFactory useCaseConfigFactory) {
            this.mConfig.insertOption(androidx.camera.core.impl.CameraConfig.OPTION_USECASE_CONFIG_FACTORY, useCaseConfigFactory);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.CameraConfig.Builder
        public androidx.camera.extensions.ExtensionsConfig.Builder setZslDisabled(boolean z17) {
            this.mConfig.insertOption(androidx.camera.core.impl.CameraConfig.OPTION_ZSL_DISABLED, java.lang.Boolean.valueOf(z17));
            return this;
        }
    }

    public ExtensionsConfig(androidx.camera.core.impl.Config config) {
        this.mConfig = config;
    }

    @Override // androidx.camera.core.impl.CameraConfig
    public androidx.camera.core.impl.Identifier getCompatibilityId() {
        return (androidx.camera.core.impl.Identifier) retrieveOption(androidx.camera.core.impl.CameraConfig.OPTION_COMPATIBILITY_ID);
    }

    @Override // androidx.camera.core.impl.ReadableConfig
    public androidx.camera.core.impl.Config getConfig() {
        return this.mConfig;
    }

    public int getExtensionMode() {
        return ((java.lang.Integer) retrieveOption(OPTION_EXTENSION_MODE)).intValue();
    }
}
