package androidx.camera.camera2.internal.compat;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public class CameraManagerCompatApi30Impl extends androidx.camera.camera2.internal.compat.CameraManagerCompatApi29Impl {
    public CameraManagerCompatApi30Impl(android.content.Context context) {
        super(context);
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl, androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    public java.util.Set<java.util.Set<java.lang.String>> getConcurrentCameraIds() {
        try {
            return this.mCameraManager.getConcurrentCameraIds();
        } catch (android.hardware.camera2.CameraAccessException e17) {
            throw androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat.toCameraAccessExceptionCompat(e17);
        }
    }
}
