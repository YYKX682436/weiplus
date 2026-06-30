package androidx.camera.core;

/* loaded from: classes6.dex */
public interface CameraProvider {
    java.util.List<androidx.camera.core.CameraInfo> getAvailableCameraInfos();

    default androidx.camera.core.CameraInfo getCameraInfo(androidx.camera.core.CameraSelector cameraSelector) {
        throw new java.lang.UnsupportedOperationException("The camera provider is not implemented properly.");
    }

    boolean hasCamera(androidx.camera.core.CameraSelector cameraSelector);
}
