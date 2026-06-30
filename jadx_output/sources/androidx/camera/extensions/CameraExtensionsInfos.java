package androidx.camera.extensions;

/* loaded from: classes14.dex */
class CameraExtensionsInfos {
    private static final androidx.camera.extensions.CameraExtensionsInfo NORMAL_MODE_CAMERA_EXTENSIONS_INFO = new androidx.camera.extensions.CameraExtensionsInfo() { // from class: androidx.camera.extensions.CameraExtensionsInfos.1
    };

    private CameraExtensionsInfos() {
    }

    public static androidx.camera.extensions.CameraExtensionsInfo from(androidx.camera.core.CameraInfo cameraInfo) {
        m3.h.b(cameraInfo instanceof androidx.camera.core.impl.RestrictedCameraInfo, "The input camera info must be an instance retrieved from the camera that is returned by invoking CameraProvider#bindToLifecycle() with an extension enabled camera selector.");
        androidx.camera.core.impl.SessionProcessor sessionProcessor = ((androidx.camera.core.impl.RestrictedCameraInfo) cameraInfo).getSessionProcessor();
        return sessionProcessor instanceof androidx.camera.extensions.CameraExtensionsInfo ? (androidx.camera.extensions.CameraExtensionsInfo) sessionProcessor : NORMAL_MODE_CAMERA_EXTENSIONS_INFO;
    }
}
