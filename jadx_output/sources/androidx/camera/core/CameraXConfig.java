package androidx.camera.core;

/* loaded from: classes14.dex */
public final class CameraXConfig implements androidx.camera.core.internal.TargetConfig<androidx.camera.core.CameraX> {
    static final long DEFAULT_OPTION_CAMERA_OPEN_RETRY_MAX_TIMEOUT_IN_MILLIS_WHILE_RESUMING = -1;
    private final androidx.camera.core.impl.OptionsBundle mConfig;
    static final androidx.camera.core.impl.Config.Option<androidx.camera.core.impl.CameraFactory.Provider> OPTION_CAMERA_FACTORY_PROVIDER = androidx.camera.core.impl.Config.Option.create("camerax.core.appConfig.cameraFactoryProvider", androidx.camera.core.impl.CameraFactory.Provider.class);
    static final androidx.camera.core.impl.Config.Option<androidx.camera.core.impl.CameraDeviceSurfaceManager.Provider> OPTION_DEVICE_SURFACE_MANAGER_PROVIDER = androidx.camera.core.impl.Config.Option.create("camerax.core.appConfig.deviceSurfaceManagerProvider", androidx.camera.core.impl.CameraDeviceSurfaceManager.Provider.class);
    static final androidx.camera.core.impl.Config.Option<androidx.camera.core.impl.UseCaseConfigFactory.Provider> OPTION_USECASE_CONFIG_FACTORY_PROVIDER = androidx.camera.core.impl.Config.Option.create("camerax.core.appConfig.useCaseConfigFactoryProvider", androidx.camera.core.impl.UseCaseConfigFactory.Provider.class);
    static final androidx.camera.core.impl.Config.Option<java.util.concurrent.Executor> OPTION_CAMERA_EXECUTOR = androidx.camera.core.impl.Config.Option.create("camerax.core.appConfig.cameraExecutor", java.util.concurrent.Executor.class);
    static final androidx.camera.core.impl.Config.Option<android.os.Handler> OPTION_SCHEDULER_HANDLER = androidx.camera.core.impl.Config.Option.create("camerax.core.appConfig.schedulerHandler", android.os.Handler.class);
    static final androidx.camera.core.impl.Config.Option<java.lang.Integer> OPTION_MIN_LOGGING_LEVEL = androidx.camera.core.impl.Config.Option.create("camerax.core.appConfig.minimumLoggingLevel", java.lang.Integer.TYPE);
    static final androidx.camera.core.impl.Config.Option<androidx.camera.core.CameraSelector> OPTION_AVAILABLE_CAMERAS_LIMITER = androidx.camera.core.impl.Config.Option.create("camerax.core.appConfig.availableCamerasLimiter", androidx.camera.core.CameraSelector.class);
    static final androidx.camera.core.impl.Config.Option<java.lang.Long> OPTION_CAMERA_OPEN_RETRY_MAX_TIMEOUT_IN_MILLIS_WHILE_RESUMING = androidx.camera.core.impl.Config.Option.create("camerax.core.appConfig.cameraOpenRetryMaxTimeoutInMillisWhileResuming", java.lang.Long.TYPE);
    static final androidx.camera.core.impl.Config.Option<androidx.camera.core.RetryPolicy> OPTION_CAMERA_PROVIDER_INIT_RETRY_POLICY = androidx.camera.core.impl.Config.Option.create("camerax.core.appConfig.cameraProviderInitRetryPolicy", androidx.camera.core.RetryPolicy.class);
    static final androidx.camera.core.impl.Config.Option<androidx.camera.core.impl.QuirkSettings> OPTION_QUIRK_SETTINGS = androidx.camera.core.impl.Config.Option.create("camerax.core.appConfig.quirksSettings", androidx.camera.core.impl.QuirkSettings.class);

    /* loaded from: classes14.dex */
    public static final class Builder implements androidx.camera.core.internal.TargetConfig.Builder<androidx.camera.core.CameraX, androidx.camera.core.CameraXConfig.Builder> {
        private final androidx.camera.core.impl.MutableOptionsBundle mMutableConfig;

        public Builder() {
            this(androidx.camera.core.impl.MutableOptionsBundle.create());
        }

        public static androidx.camera.core.CameraXConfig.Builder fromConfig(androidx.camera.core.CameraXConfig cameraXConfig) {
            return new androidx.camera.core.CameraXConfig.Builder(androidx.camera.core.impl.MutableOptionsBundle.from((androidx.camera.core.impl.Config) cameraXConfig));
        }

        private androidx.camera.core.impl.MutableConfig getMutableConfig() {
            return this.mMutableConfig;
        }

        public androidx.camera.core.CameraXConfig build() {
            return new androidx.camera.core.CameraXConfig(androidx.camera.core.impl.OptionsBundle.from(this.mMutableConfig));
        }

        public androidx.camera.core.CameraXConfig.Builder setAvailableCamerasLimiter(androidx.camera.core.CameraSelector cameraSelector) {
            getMutableConfig().insertOption(androidx.camera.core.CameraXConfig.OPTION_AVAILABLE_CAMERAS_LIMITER, cameraSelector);
            return this;
        }

        public androidx.camera.core.CameraXConfig.Builder setCameraExecutor(java.util.concurrent.Executor executor) {
            getMutableConfig().insertOption(androidx.camera.core.CameraXConfig.OPTION_CAMERA_EXECUTOR, executor);
            return this;
        }

        public androidx.camera.core.CameraXConfig.Builder setCameraFactoryProvider(androidx.camera.core.impl.CameraFactory.Provider provider) {
            getMutableConfig().insertOption(androidx.camera.core.CameraXConfig.OPTION_CAMERA_FACTORY_PROVIDER, provider);
            return this;
        }

        public androidx.camera.core.CameraXConfig.Builder setCameraOpenRetryMaxTimeoutInMillisWhileResuming(long j17) {
            getMutableConfig().insertOption(androidx.camera.core.CameraXConfig.OPTION_CAMERA_OPEN_RETRY_MAX_TIMEOUT_IN_MILLIS_WHILE_RESUMING, java.lang.Long.valueOf(j17));
            return this;
        }

        public androidx.camera.core.CameraXConfig.Builder setCameraProviderInitRetryPolicy(androidx.camera.core.RetryPolicy retryPolicy) {
            getMutableConfig().insertOption(androidx.camera.core.CameraXConfig.OPTION_CAMERA_PROVIDER_INIT_RETRY_POLICY, retryPolicy);
            return this;
        }

        public androidx.camera.core.CameraXConfig.Builder setDeviceSurfaceManagerProvider(androidx.camera.core.impl.CameraDeviceSurfaceManager.Provider provider) {
            getMutableConfig().insertOption(androidx.camera.core.CameraXConfig.OPTION_DEVICE_SURFACE_MANAGER_PROVIDER, provider);
            return this;
        }

        public androidx.camera.core.CameraXConfig.Builder setMinimumLoggingLevel(int i17) {
            getMutableConfig().insertOption(androidx.camera.core.CameraXConfig.OPTION_MIN_LOGGING_LEVEL, java.lang.Integer.valueOf(i17));
            return this;
        }

        public androidx.camera.core.CameraXConfig.Builder setQuirkSettings(androidx.camera.core.impl.QuirkSettings quirkSettings) {
            getMutableConfig().insertOption(androidx.camera.core.CameraXConfig.OPTION_QUIRK_SETTINGS, quirkSettings);
            return this;
        }

        public androidx.camera.core.CameraXConfig.Builder setSchedulerHandler(android.os.Handler handler) {
            getMutableConfig().insertOption(androidx.camera.core.CameraXConfig.OPTION_SCHEDULER_HANDLER, handler);
            return this;
        }

        public androidx.camera.core.CameraXConfig.Builder setUseCaseConfigFactoryProvider(androidx.camera.core.impl.UseCaseConfigFactory.Provider provider) {
            getMutableConfig().insertOption(androidx.camera.core.CameraXConfig.OPTION_USECASE_CONFIG_FACTORY_PROVIDER, provider);
            return this;
        }

        private Builder(androidx.camera.core.impl.MutableOptionsBundle mutableOptionsBundle) {
            this.mMutableConfig = mutableOptionsBundle;
            java.lang.Class cls = (java.lang.Class) mutableOptionsBundle.retrieveOption(androidx.camera.core.internal.TargetConfig.OPTION_TARGET_CLASS, null);
            if (cls != null && !cls.equals(androidx.camera.core.CameraX.class)) {
                throw new java.lang.IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            setTargetClass(androidx.camera.core.CameraX.class);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.internal.TargetConfig.Builder
        public androidx.camera.core.CameraXConfig.Builder setTargetClass(java.lang.Class<androidx.camera.core.CameraX> cls) {
            getMutableConfig().insertOption(androidx.camera.core.internal.TargetConfig.OPTION_TARGET_CLASS, cls);
            if (getMutableConfig().retrieveOption(androidx.camera.core.internal.TargetConfig.OPTION_TARGET_NAME, null) == null) {
                setTargetName(cls.getCanonicalName() + "-" + java.util.UUID.randomUUID());
            }
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.internal.TargetConfig.Builder
        public androidx.camera.core.CameraXConfig.Builder setTargetName(java.lang.String str) {
            getMutableConfig().insertOption(androidx.camera.core.internal.TargetConfig.OPTION_TARGET_NAME, str);
            return this;
        }
    }

    /* loaded from: classes14.dex */
    public interface Provider {
        androidx.camera.core.CameraXConfig getCameraXConfig();
    }

    public CameraXConfig(androidx.camera.core.impl.OptionsBundle optionsBundle) {
        this.mConfig = optionsBundle;
    }

    public androidx.camera.core.CameraSelector getAvailableCamerasLimiter(androidx.camera.core.CameraSelector cameraSelector) {
        return (androidx.camera.core.CameraSelector) this.mConfig.retrieveOption(OPTION_AVAILABLE_CAMERAS_LIMITER, cameraSelector);
    }

    public java.util.concurrent.Executor getCameraExecutor(java.util.concurrent.Executor executor) {
        return (java.util.concurrent.Executor) this.mConfig.retrieveOption(OPTION_CAMERA_EXECUTOR, executor);
    }

    public androidx.camera.core.impl.CameraFactory.Provider getCameraFactoryProvider(androidx.camera.core.impl.CameraFactory.Provider provider) {
        return (androidx.camera.core.impl.CameraFactory.Provider) this.mConfig.retrieveOption(OPTION_CAMERA_FACTORY_PROVIDER, provider);
    }

    public long getCameraOpenRetryMaxTimeoutInMillisWhileResuming() {
        return ((java.lang.Long) this.mConfig.retrieveOption(OPTION_CAMERA_OPEN_RETRY_MAX_TIMEOUT_IN_MILLIS_WHILE_RESUMING, -1L)).longValue();
    }

    public androidx.camera.core.RetryPolicy getCameraProviderInitRetryPolicy() {
        androidx.camera.core.RetryPolicy retryPolicy = (androidx.camera.core.RetryPolicy) this.mConfig.retrieveOption(OPTION_CAMERA_PROVIDER_INIT_RETRY_POLICY, androidx.camera.core.RetryPolicy.DEFAULT);
        java.util.Objects.requireNonNull(retryPolicy);
        return retryPolicy;
    }

    @Override // androidx.camera.core.impl.ReadableConfig
    public androidx.camera.core.impl.Config getConfig() {
        return this.mConfig;
    }

    public androidx.camera.core.impl.CameraDeviceSurfaceManager.Provider getDeviceSurfaceManagerProvider(androidx.camera.core.impl.CameraDeviceSurfaceManager.Provider provider) {
        return (androidx.camera.core.impl.CameraDeviceSurfaceManager.Provider) this.mConfig.retrieveOption(OPTION_DEVICE_SURFACE_MANAGER_PROVIDER, provider);
    }

    public int getMinimumLoggingLevel() {
        return ((java.lang.Integer) this.mConfig.retrieveOption(OPTION_MIN_LOGGING_LEVEL, 3)).intValue();
    }

    public androidx.camera.core.impl.QuirkSettings getQuirkSettings() {
        return (androidx.camera.core.impl.QuirkSettings) this.mConfig.retrieveOption(OPTION_QUIRK_SETTINGS, null);
    }

    public android.os.Handler getSchedulerHandler(android.os.Handler handler) {
        return (android.os.Handler) this.mConfig.retrieveOption(OPTION_SCHEDULER_HANDLER, handler);
    }

    public androidx.camera.core.impl.UseCaseConfigFactory.Provider getUseCaseConfigFactoryProvider(androidx.camera.core.impl.UseCaseConfigFactory.Provider provider) {
        return (androidx.camera.core.impl.UseCaseConfigFactory.Provider) this.mConfig.retrieveOption(OPTION_USECASE_CONFIG_FACTORY_PROVIDER, provider);
    }
}
