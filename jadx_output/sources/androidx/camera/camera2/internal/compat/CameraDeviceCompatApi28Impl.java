package androidx.camera.camera2.internal.compat;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public class CameraDeviceCompatApi28Impl extends androidx.camera.camera2.internal.compat.CameraDeviceCompatApi24Impl {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraDeviceCompatApi28Impl(android.hardware.camera2.CameraDevice cameraDevice) {
        super(cameraDevice, null);
        cameraDevice.getClass();
    }

    @Override // androidx.camera.camera2.internal.compat.CameraDeviceCompatApi24Impl, androidx.camera.camera2.internal.compat.CameraDeviceCompatApi23Impl, androidx.camera.camera2.internal.compat.CameraDeviceCompatBaseImpl, androidx.camera.camera2.internal.compat.CameraDeviceCompat.CameraDeviceCompatImpl
    public void createCaptureSession(androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat sessionConfigurationCompat) {
        android.hardware.camera2.params.SessionConfiguration sessionConfiguration = (android.hardware.camera2.params.SessionConfiguration) sessionConfigurationCompat.unwrap();
        sessionConfiguration.getClass();
        try {
            this.mCameraDevice.createCaptureSession(sessionConfiguration);
        } catch (android.hardware.camera2.CameraAccessException e17) {
            throw androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat.toCameraAccessExceptionCompat(e17);
        }
    }
}
