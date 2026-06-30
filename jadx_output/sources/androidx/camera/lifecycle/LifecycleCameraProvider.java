package androidx.camera.lifecycle;

/* loaded from: classes14.dex */
interface LifecycleCameraProvider extends androidx.camera.core.CameraProvider {
    boolean isBound(androidx.camera.core.UseCase useCase);

    void unbind(androidx.camera.core.UseCase... useCaseArr);

    void unbindAll();
}
