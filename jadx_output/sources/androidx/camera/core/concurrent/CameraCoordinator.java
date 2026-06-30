package androidx.camera.core.concurrent;

/* loaded from: classes14.dex */
public interface CameraCoordinator {
    public static final int CAMERA_OPERATING_MODE_CONCURRENT = 2;
    public static final int CAMERA_OPERATING_MODE_SINGLE = 1;
    public static final int CAMERA_OPERATING_MODE_UNSPECIFIED = 0;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface CameraOperatingMode {
    }

    /* loaded from: classes14.dex */
    public interface ConcurrentCameraModeListener {
        void onCameraOperatingModeUpdated(int i17, int i18);
    }

    void addListener(androidx.camera.core.concurrent.CameraCoordinator.ConcurrentCameraModeListener concurrentCameraModeListener);

    java.util.List<androidx.camera.core.CameraInfo> getActiveConcurrentCameraInfos();

    int getCameraOperatingMode();

    java.util.List<java.util.List<androidx.camera.core.CameraSelector>> getConcurrentCameraSelectors();

    java.lang.String getPairedConcurrentCameraId(java.lang.String str);

    void removeListener(androidx.camera.core.concurrent.CameraCoordinator.ConcurrentCameraModeListener concurrentCameraModeListener);

    void setActiveConcurrentCameraInfos(java.util.List<androidx.camera.core.CameraInfo> list);

    void setCameraOperatingMode(int i17);

    void shutdown();
}
