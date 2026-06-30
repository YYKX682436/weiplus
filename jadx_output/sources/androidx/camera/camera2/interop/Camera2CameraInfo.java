package androidx.camera.camera2.interop;

/* loaded from: classes14.dex */
public final class Camera2CameraInfo {
    private static final java.lang.String TAG = "Camera2CameraInfo";
    private androidx.camera.camera2.internal.Camera2CameraInfoImpl mCamera2CameraInfoImpl;
    private androidx.camera.camera2.internal.Camera2PhysicalCameraInfoImpl mCamera2PhysicalCameraInfo;

    public Camera2CameraInfo(androidx.camera.camera2.internal.Camera2CameraInfoImpl camera2CameraInfoImpl) {
        this.mCamera2CameraInfoImpl = camera2CameraInfoImpl;
    }

    public static android.hardware.camera2.CameraCharacteristics extractCameraCharacteristics(androidx.camera.core.CameraInfo cameraInfo) {
        if (cameraInfo instanceof androidx.camera.camera2.internal.Camera2PhysicalCameraInfoImpl) {
            return ((androidx.camera.camera2.internal.Camera2PhysicalCameraInfoImpl) cameraInfo).getCameraCharacteristicsCompat().toCameraCharacteristics();
        }
        androidx.camera.core.impl.CameraInfoInternal implementation = ((androidx.camera.core.impl.CameraInfoInternal) cameraInfo).getImplementation();
        m3.h.e(implementation instanceof androidx.camera.camera2.internal.Camera2CameraInfoImpl, "CameraInfo does not contain any Camera2 information.");
        return ((androidx.camera.camera2.internal.Camera2CameraInfoImpl) implementation).getCameraCharacteristicsCompat().toCameraCharacteristics();
    }

    public static androidx.camera.camera2.interop.Camera2CameraInfo from(androidx.camera.core.CameraInfo cameraInfo) {
        if (cameraInfo instanceof androidx.camera.camera2.internal.Camera2PhysicalCameraInfoImpl) {
            return ((androidx.camera.camera2.internal.Camera2PhysicalCameraInfoImpl) cameraInfo).getCamera2CameraInfo();
        }
        androidx.camera.core.impl.CameraInfoInternal implementation = ((androidx.camera.core.impl.CameraInfoInternal) cameraInfo).getImplementation();
        m3.h.b(implementation instanceof androidx.camera.camera2.internal.Camera2CameraInfoImpl, "CameraInfo doesn't contain Camera2 implementation.");
        return ((androidx.camera.camera2.internal.Camera2CameraInfoImpl) implementation).getCamera2CameraInfo();
    }

    public <T> T getCameraCharacteristic(android.hardware.camera2.CameraCharacteristics.Key<T> key) {
        androidx.camera.camera2.internal.Camera2PhysicalCameraInfoImpl camera2PhysicalCameraInfoImpl = this.mCamera2PhysicalCameraInfo;
        return camera2PhysicalCameraInfoImpl != null ? (T) camera2PhysicalCameraInfoImpl.getCameraCharacteristicsCompat().get(key) : (T) this.mCamera2CameraInfoImpl.getCameraCharacteristicsCompat().get(key);
    }

    public java.util.Map<java.lang.String, android.hardware.camera2.CameraCharacteristics> getCameraCharacteristicsMap() {
        return this.mCamera2PhysicalCameraInfo != null ? java.util.Collections.emptyMap() : this.mCamera2CameraInfoImpl.getCameraCharacteristicsMap();
    }

    public java.lang.String getCameraId() {
        androidx.camera.camera2.internal.Camera2PhysicalCameraInfoImpl camera2PhysicalCameraInfoImpl = this.mCamera2PhysicalCameraInfo;
        return camera2PhysicalCameraInfoImpl != null ? camera2PhysicalCameraInfoImpl.getCameraId() : this.mCamera2CameraInfoImpl.getCameraId();
    }

    public Camera2CameraInfo(androidx.camera.camera2.internal.Camera2PhysicalCameraInfoImpl camera2PhysicalCameraInfoImpl) {
        this.mCamera2PhysicalCameraInfo = camera2PhysicalCameraInfoImpl;
    }
}
