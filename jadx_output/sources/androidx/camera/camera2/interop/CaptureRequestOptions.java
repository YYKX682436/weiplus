package androidx.camera.camera2.interop;

/* loaded from: classes14.dex */
public class CaptureRequestOptions implements androidx.camera.core.impl.ReadableConfig {
    private final androidx.camera.core.impl.Config mConfig;

    /* loaded from: classes14.dex */
    public static final class Builder implements androidx.camera.core.ExtendableBuilder<androidx.camera.camera2.interop.CaptureRequestOptions> {
        private final androidx.camera.core.impl.MutableOptionsBundle mMutableOptionsBundle = androidx.camera.core.impl.MutableOptionsBundle.create();

        public static androidx.camera.camera2.interop.CaptureRequestOptions.Builder from(final androidx.camera.core.impl.Config config) {
            final androidx.camera.camera2.interop.CaptureRequestOptions.Builder builder = new androidx.camera.camera2.interop.CaptureRequestOptions.Builder();
            config.findOptions(androidx.camera.camera2.impl.Camera2ImplConfig.CAPTURE_REQUEST_ID_STEM, new androidx.camera.core.impl.Config.OptionMatcher() { // from class: androidx.camera.camera2.interop.CaptureRequestOptions$Builder$$a
                @Override // androidx.camera.core.impl.Config.OptionMatcher
                public final boolean onOptionMatched(androidx.camera.core.impl.Config.Option option) {
                    boolean lambda$from$0;
                    lambda$from$0 = androidx.camera.camera2.interop.CaptureRequestOptions.Builder.lambda$from$0(androidx.camera.camera2.interop.CaptureRequestOptions.Builder.this, config, option);
                    return lambda$from$0;
                }
            });
            return builder;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$from$0(androidx.camera.camera2.interop.CaptureRequestOptions.Builder builder, androidx.camera.core.impl.Config config, androidx.camera.core.impl.Config.Option option) {
            builder.getMutableConfig().insertOption(option, config.getOptionPriority(option), config.retrieveOption(option));
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public <ValueT> androidx.camera.camera2.interop.CaptureRequestOptions.Builder clearCaptureRequestOption(android.hardware.camera2.CaptureRequest.Key<ValueT> key) {
            this.mMutableOptionsBundle.removeOption(androidx.camera.camera2.impl.Camera2ImplConfig.createCaptureRequestOption(key));
            return this;
        }

        @Override // androidx.camera.core.ExtendableBuilder
        public androidx.camera.core.impl.MutableConfig getMutableConfig() {
            return this.mMutableOptionsBundle;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public <ValueT> androidx.camera.camera2.interop.CaptureRequestOptions.Builder setCaptureRequestOption(android.hardware.camera2.CaptureRequest.Key<ValueT> key, ValueT valuet) {
            this.mMutableOptionsBundle.insertOption(androidx.camera.camera2.impl.Camera2ImplConfig.createCaptureRequestOption(key), valuet);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.ExtendableBuilder
        public androidx.camera.camera2.interop.CaptureRequestOptions build() {
            return new androidx.camera.camera2.interop.CaptureRequestOptions(androidx.camera.core.impl.OptionsBundle.from(this.mMutableOptionsBundle));
        }
    }

    public CaptureRequestOptions(androidx.camera.core.impl.Config config) {
        this.mConfig = config;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <ValueT> ValueT getCaptureRequestOption(android.hardware.camera2.CaptureRequest.Key<ValueT> key) {
        return (ValueT) this.mConfig.retrieveOption(androidx.camera.camera2.impl.Camera2ImplConfig.createCaptureRequestOption(key), null);
    }

    @Override // androidx.camera.core.impl.ReadableConfig
    public androidx.camera.core.impl.Config getConfig() {
        return this.mConfig;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <ValueT> ValueT getCaptureRequestOption(android.hardware.camera2.CaptureRequest.Key<ValueT> key, ValueT valuet) {
        return (ValueT) this.mConfig.retrieveOption(androidx.camera.camera2.impl.Camera2ImplConfig.createCaptureRequestOption(key), valuet);
    }
}
