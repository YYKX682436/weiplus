package androidx.camera.camera2.internal.compat;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public class CameraDeviceCompatApi24Impl extends androidx.camera.camera2.internal.compat.CameraDeviceCompatApi23Impl {
    public CameraDeviceCompatApi24Impl(android.hardware.camera2.CameraDevice cameraDevice, java.lang.Object obj) {
        super(cameraDevice, obj);
    }

    public static androidx.camera.camera2.internal.compat.CameraDeviceCompatApi24Impl create(android.hardware.camera2.CameraDevice cameraDevice, android.os.Handler handler) {
        return new androidx.camera.camera2.internal.compat.CameraDeviceCompatApi24Impl(cameraDevice, new androidx.camera.camera2.internal.compat.CameraDeviceCompatBaseImpl.CameraDeviceCompatParamsApi21(handler));
    }

    @Override // androidx.camera.camera2.internal.compat.CameraDeviceCompatApi23Impl, androidx.camera.camera2.internal.compat.CameraDeviceCompatBaseImpl, androidx.camera.camera2.internal.compat.CameraDeviceCompat.CameraDeviceCompatImpl
    public void createCaptureSession(androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat sessionConfigurationCompat) {
        androidx.camera.camera2.internal.compat.CameraDeviceCompatBaseImpl.checkPreconditions(this.mCameraDevice, sessionConfigurationCompat);
        androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.StateCallbackExecutorWrapper stateCallbackExecutorWrapper = new androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat.StateCallbackExecutorWrapper(sessionConfigurationCompat.getExecutor(), sessionConfigurationCompat.getStateCallback());
        java.util.List<androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat> outputConfigurations = sessionConfigurationCompat.getOutputConfigurations();
        androidx.camera.camera2.internal.compat.CameraDeviceCompatBaseImpl.CameraDeviceCompatParamsApi21 cameraDeviceCompatParamsApi21 = (androidx.camera.camera2.internal.compat.CameraDeviceCompatBaseImpl.CameraDeviceCompatParamsApi21) this.mImplParams;
        cameraDeviceCompatParamsApi21.getClass();
        android.os.Handler handler = cameraDeviceCompatParamsApi21.mCompatHandler;
        androidx.camera.camera2.internal.compat.params.InputConfigurationCompat inputConfiguration = sessionConfigurationCompat.getInputConfiguration();
        try {
            if (inputConfiguration != null) {
                android.hardware.camera2.params.InputConfiguration inputConfiguration2 = (android.hardware.camera2.params.InputConfiguration) inputConfiguration.unwrap();
                inputConfiguration2.getClass();
                this.mCameraDevice.createReprocessableCaptureSessionByConfigurations(inputConfiguration2, androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.transformFromCompat(outputConfigurations), stateCallbackExecutorWrapper, handler);
            } else if (sessionConfigurationCompat.getSessionType() == 1) {
                this.mCameraDevice.createConstrainedHighSpeedCaptureSession(androidx.camera.camera2.internal.compat.CameraDeviceCompatBaseImpl.unpackSurfaces(outputConfigurations), stateCallbackExecutorWrapper, handler);
            } else {
                this.mCameraDevice.createCaptureSessionByOutputConfigurations(androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat.transformFromCompat(outputConfigurations), stateCallbackExecutorWrapper, handler);
            }
        } catch (android.hardware.camera2.CameraAccessException e17) {
            throw androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat.toCameraAccessExceptionCompat(e17);
        }
    }
}
