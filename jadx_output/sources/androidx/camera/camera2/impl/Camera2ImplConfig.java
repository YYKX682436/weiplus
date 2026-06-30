package androidx.camera.camera2.impl;

/* loaded from: classes14.dex */
public final class Camera2ImplConfig extends androidx.camera.camera2.interop.CaptureRequestOptions {
    public static final java.lang.String CAPTURE_REQUEST_ID_STEM = "camera2.captureRequest.option.";
    public static final androidx.camera.core.impl.Config.Option<java.lang.Integer> TEMPLATE_TYPE_OPTION = androidx.camera.core.impl.Config.Option.create("camera2.captureRequest.templateType", java.lang.Integer.TYPE);
    public static final androidx.camera.core.impl.Config.Option<java.lang.Long> STREAM_USE_CASE_OPTION = androidx.camera.core.impl.Config.Option.create("camera2.cameraCaptureSession.streamUseCase", java.lang.Long.TYPE);
    public static final androidx.camera.core.impl.Config.Option<android.hardware.camera2.CameraDevice.StateCallback> DEVICE_STATE_CALLBACK_OPTION = androidx.camera.core.impl.Config.Option.create("camera2.cameraDevice.stateCallback", android.hardware.camera2.CameraDevice.StateCallback.class);
    public static final androidx.camera.core.impl.Config.Option<android.hardware.camera2.CameraCaptureSession.StateCallback> SESSION_STATE_CALLBACK_OPTION = androidx.camera.core.impl.Config.Option.create("camera2.cameraCaptureSession.stateCallback", android.hardware.camera2.CameraCaptureSession.StateCallback.class);
    public static final androidx.camera.core.impl.Config.Option<android.hardware.camera2.CameraCaptureSession.CaptureCallback> SESSION_CAPTURE_CALLBACK_OPTION = androidx.camera.core.impl.Config.Option.create("camera2.cameraCaptureSession.captureCallback", android.hardware.camera2.CameraCaptureSession.CaptureCallback.class);
    public static final androidx.camera.core.impl.Config.Option<java.lang.Object> CAPTURE_REQUEST_TAG_OPTION = androidx.camera.core.impl.Config.Option.create("camera2.captureRequest.tag", java.lang.Object.class);
    public static final androidx.camera.core.impl.Config.Option<java.lang.String> SESSION_PHYSICAL_CAMERA_ID_OPTION = androidx.camera.core.impl.Config.Option.create("camera2.cameraCaptureSession.physicalCameraId", java.lang.String.class);

    /* loaded from: classes14.dex */
    public static final class Builder implements androidx.camera.core.ExtendableBuilder<androidx.camera.camera2.impl.Camera2ImplConfig> {
        private final androidx.camera.core.impl.MutableOptionsBundle mMutableOptionsBundle = androidx.camera.core.impl.MutableOptionsBundle.create();

        @Override // androidx.camera.core.ExtendableBuilder
        public androidx.camera.core.impl.MutableConfig getMutableConfig() {
            return this.mMutableOptionsBundle;
        }

        public androidx.camera.camera2.impl.Camera2ImplConfig.Builder insertAllOptions(androidx.camera.core.impl.Config config) {
            insertAllOptions(config, androidx.camera.core.impl.Config.OptionPriority.OPTIONAL);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public <ValueT> androidx.camera.camera2.impl.Camera2ImplConfig.Builder setCaptureRequestOption(android.hardware.camera2.CaptureRequest.Key<ValueT> key, ValueT valuet) {
            this.mMutableOptionsBundle.insertOption(androidx.camera.camera2.impl.Camera2ImplConfig.createCaptureRequestOption(key), valuet);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public <ValueT> androidx.camera.camera2.impl.Camera2ImplConfig.Builder setCaptureRequestOptionWithPriority(android.hardware.camera2.CaptureRequest.Key<ValueT> key, ValueT valuet, androidx.camera.core.impl.Config.OptionPriority optionPriority) {
            this.mMutableOptionsBundle.insertOption(androidx.camera.camera2.impl.Camera2ImplConfig.createCaptureRequestOption(key), optionPriority, valuet);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.ExtendableBuilder
        public androidx.camera.camera2.impl.Camera2ImplConfig build() {
            return new androidx.camera.camera2.impl.Camera2ImplConfig(androidx.camera.core.impl.OptionsBundle.from(this.mMutableOptionsBundle));
        }

        public androidx.camera.camera2.impl.Camera2ImplConfig.Builder insertAllOptions(androidx.camera.core.impl.Config config, androidx.camera.core.impl.Config.OptionPriority optionPriority) {
            for (androidx.camera.core.impl.Config.Option<?> option : config.listOptions()) {
                this.mMutableOptionsBundle.insertOption(option, optionPriority, config.retrieveOption(option));
            }
            return this;
        }
    }

    public Camera2ImplConfig(androidx.camera.core.impl.Config config) {
        super(config);
    }

    public static androidx.camera.core.impl.Config.Option<java.lang.Object> createCaptureRequestOption(android.hardware.camera2.CaptureRequest.Key<?> key) {
        return androidx.camera.core.impl.Config.Option.create(CAPTURE_REQUEST_ID_STEM + key.getName(), java.lang.Object.class, key);
    }

    public androidx.camera.camera2.interop.CaptureRequestOptions getCaptureRequestOptions() {
        return androidx.camera.camera2.interop.CaptureRequestOptions.Builder.from(getConfig()).build();
    }

    public java.lang.Object getCaptureRequestTag(java.lang.Object obj) {
        return getConfig().retrieveOption(CAPTURE_REQUEST_TAG_OPTION, obj);
    }

    public int getCaptureRequestTemplate(int i17) {
        return ((java.lang.Integer) getConfig().retrieveOption(TEMPLATE_TYPE_OPTION, java.lang.Integer.valueOf(i17))).intValue();
    }

    public android.hardware.camera2.CameraDevice.StateCallback getDeviceStateCallback(android.hardware.camera2.CameraDevice.StateCallback stateCallback) {
        return (android.hardware.camera2.CameraDevice.StateCallback) getConfig().retrieveOption(DEVICE_STATE_CALLBACK_OPTION, stateCallback);
    }

    public java.lang.String getPhysicalCameraId(java.lang.String str) {
        return (java.lang.String) getConfig().retrieveOption(SESSION_PHYSICAL_CAMERA_ID_OPTION, str);
    }

    public android.hardware.camera2.CameraCaptureSession.CaptureCallback getSessionCaptureCallback(android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback) {
        return (android.hardware.camera2.CameraCaptureSession.CaptureCallback) getConfig().retrieveOption(SESSION_CAPTURE_CALLBACK_OPTION, captureCallback);
    }

    public android.hardware.camera2.CameraCaptureSession.StateCallback getSessionStateCallback(android.hardware.camera2.CameraCaptureSession.StateCallback stateCallback) {
        return (android.hardware.camera2.CameraCaptureSession.StateCallback) getConfig().retrieveOption(SESSION_STATE_CALLBACK_OPTION, stateCallback);
    }

    public long getStreamUseCase(long j17) {
        return ((java.lang.Long) getConfig().retrieveOption(STREAM_USE_CASE_OPTION, java.lang.Long.valueOf(j17))).longValue();
    }
}
