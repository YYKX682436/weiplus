package androidx.camera.extensions;

/* loaded from: classes14.dex */
class CameraExtensionsControls {
    private CameraExtensionsControls() {
    }

    public static androidx.camera.extensions.CameraExtensionsControl from(androidx.camera.core.CameraControl cameraControl) {
        m3.h.b(cameraControl instanceof androidx.camera.core.impl.RestrictedCameraControl, "The input camera control must be an instance retrieved from the camera that is returned by invoking CameraProvider#bindToLifecycle() with an extension enabled camera selector.");
        androidx.camera.core.impl.SessionProcessor sessionProcessor = ((androidx.camera.core.impl.RestrictedCameraControl) cameraControl).getSessionProcessor();
        if (sessionProcessor instanceof androidx.camera.extensions.CameraExtensionsControl) {
            return (androidx.camera.extensions.CameraExtensionsControl) sessionProcessor;
        }
        return null;
    }
}
