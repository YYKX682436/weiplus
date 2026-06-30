package androidx.camera.extensions.internal;

/* loaded from: classes14.dex */
public class RequestOptionConfig implements androidx.camera.core.impl.ReadableConfig {
    static final java.lang.String CAPTURE_REQUEST_ID_STEM = "camera2.captureRequest.option.";
    private androidx.camera.core.impl.Config mConfig;

    /* loaded from: classes14.dex */
    public static class Builder {
        private androidx.camera.core.impl.MutableOptionsBundle mMutableOptionsBundle = androidx.camera.core.impl.MutableOptionsBundle.create();

        public static androidx.camera.extensions.internal.RequestOptionConfig.Builder from(final androidx.camera.core.impl.Config config) {
            final androidx.camera.extensions.internal.RequestOptionConfig.Builder builder = new androidx.camera.extensions.internal.RequestOptionConfig.Builder();
            config.findOptions("camera2.captureRequest.option.", new androidx.camera.core.impl.Config.OptionMatcher() { // from class: androidx.camera.extensions.internal.RequestOptionConfig$Builder$$a
                @Override // androidx.camera.core.impl.Config.OptionMatcher
                public final boolean onOptionMatched(androidx.camera.core.impl.Config.Option option) {
                    boolean lambda$from$0;
                    lambda$from$0 = androidx.camera.extensions.internal.RequestOptionConfig.Builder.lambda$from$0(androidx.camera.extensions.internal.RequestOptionConfig.Builder.this, config, option);
                    return lambda$from$0;
                }
            });
            return builder;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$from$0(androidx.camera.extensions.internal.RequestOptionConfig.Builder builder, androidx.camera.core.impl.Config config, androidx.camera.core.impl.Config.Option option) {
            builder.mMutableOptionsBundle.insertOption(option, config.getOptionPriority(option), config.retrieveOption(option));
            return true;
        }

        public androidx.camera.extensions.internal.RequestOptionConfig build() {
            return new androidx.camera.extensions.internal.RequestOptionConfig(androidx.camera.core.impl.OptionsBundle.from(this.mMutableOptionsBundle));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public <ValueT> androidx.camera.extensions.internal.RequestOptionConfig.Builder setCaptureRequestOption(android.hardware.camera2.CaptureRequest.Key<ValueT> key, ValueT valuet) {
            this.mMutableOptionsBundle.insertOption(androidx.camera.extensions.internal.RequestOptionConfig.createOptionFromKey(key), valuet);
            return this;
        }
    }

    public static androidx.camera.core.impl.Config.Option<java.lang.Object> createOptionFromKey(android.hardware.camera2.CaptureRequest.Key<?> key) {
        return androidx.camera.core.impl.Config.Option.create("camera2.captureRequest.option." + key.getName(), java.lang.Object.class, key);
    }

    @Override // androidx.camera.core.impl.ReadableConfig
    public androidx.camera.core.impl.Config getConfig() {
        return this.mConfig;
    }

    private RequestOptionConfig(androidx.camera.core.impl.Config config) {
        this.mConfig = config;
    }
}
