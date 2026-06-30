package androidx.camera.camera2.interop;

/* loaded from: classes6.dex */
public final class Camera2Interop {

    /* loaded from: classes14.dex */
    public static final class Extender<T> {
        androidx.camera.core.ExtendableBuilder<T> mBaseBuilder;

        public Extender(androidx.camera.core.ExtendableBuilder<T> extendableBuilder) {
            this.mBaseBuilder = extendableBuilder;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public <ValueT> androidx.camera.camera2.interop.Camera2Interop.Extender<T> setCaptureRequestOption(android.hardware.camera2.CaptureRequest.Key<ValueT> key, ValueT valuet) {
            this.mBaseBuilder.getMutableConfig().insertOption(androidx.camera.camera2.impl.Camera2ImplConfig.createCaptureRequestOption(key), androidx.camera.core.impl.Config.OptionPriority.ALWAYS_OVERRIDE, valuet);
            return this;
        }

        public androidx.camera.camera2.interop.Camera2Interop.Extender<T> setCaptureRequestTemplate(int i17) {
            this.mBaseBuilder.getMutableConfig().insertOption(androidx.camera.camera2.impl.Camera2ImplConfig.TEMPLATE_TYPE_OPTION, java.lang.Integer.valueOf(i17));
            return this;
        }

        public androidx.camera.camera2.interop.Camera2Interop.Extender<T> setDeviceStateCallback(android.hardware.camera2.CameraDevice.StateCallback stateCallback) {
            this.mBaseBuilder.getMutableConfig().insertOption(androidx.camera.camera2.impl.Camera2ImplConfig.DEVICE_STATE_CALLBACK_OPTION, stateCallback);
            return this;
        }

        public androidx.camera.camera2.interop.Camera2Interop.Extender<T> setPhysicalCameraId(java.lang.String str) {
            this.mBaseBuilder.getMutableConfig().insertOption(androidx.camera.camera2.impl.Camera2ImplConfig.SESSION_PHYSICAL_CAMERA_ID_OPTION, str);
            return this;
        }

        public androidx.camera.camera2.interop.Camera2Interop.Extender<T> setSessionCaptureCallback(android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback) {
            this.mBaseBuilder.getMutableConfig().insertOption(androidx.camera.camera2.impl.Camera2ImplConfig.SESSION_CAPTURE_CALLBACK_OPTION, captureCallback);
            return this;
        }

        public androidx.camera.camera2.interop.Camera2Interop.Extender<T> setSessionStateCallback(android.hardware.camera2.CameraCaptureSession.StateCallback stateCallback) {
            this.mBaseBuilder.getMutableConfig().insertOption(androidx.camera.camera2.impl.Camera2ImplConfig.SESSION_STATE_CALLBACK_OPTION, stateCallback);
            return this;
        }

        public androidx.camera.camera2.interop.Camera2Interop.Extender<T> setStreamUseCase(long j17) {
            this.mBaseBuilder.getMutableConfig().insertOption(androidx.camera.camera2.impl.Camera2ImplConfig.STREAM_USE_CASE_OPTION, java.lang.Long.valueOf(j17));
            return this;
        }
    }

    private Camera2Interop() {
    }
}
