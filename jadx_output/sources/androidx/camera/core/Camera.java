package androidx.camera.core;

/* loaded from: classes14.dex */
public interface Camera {
    androidx.camera.core.CameraControl getCameraControl();

    androidx.camera.core.CameraInfo getCameraInfo();

    androidx.camera.core.impl.CameraConfig getExtendedConfig();

    default boolean isUseCasesCombinationSupported(boolean z17, androidx.camera.core.UseCase... useCaseArr) {
        return true;
    }

    default boolean isUseCasesCombinationSupportedByFramework(androidx.camera.core.UseCase... useCaseArr) {
        return isUseCasesCombinationSupported(false, useCaseArr);
    }

    default boolean isUseCasesCombinationSupported(androidx.camera.core.UseCase... useCaseArr) {
        return isUseCasesCombinationSupported(true, useCaseArr);
    }
}
