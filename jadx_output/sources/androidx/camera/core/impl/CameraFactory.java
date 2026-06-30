package androidx.camera.core.impl;

/* loaded from: classes14.dex */
public interface CameraFactory {

    /* loaded from: classes14.dex */
    public interface Provider {
        androidx.camera.core.impl.CameraFactory newInstance(android.content.Context context, androidx.camera.core.impl.CameraThreadConfig cameraThreadConfig, androidx.camera.core.CameraSelector cameraSelector, long j17);
    }

    java.util.Set<java.lang.String> getAvailableCameraIds();

    androidx.camera.core.impl.CameraInternal getCamera(java.lang.String str);

    androidx.camera.core.concurrent.CameraCoordinator getCameraCoordinator();

    java.lang.Object getCameraManager();
}
