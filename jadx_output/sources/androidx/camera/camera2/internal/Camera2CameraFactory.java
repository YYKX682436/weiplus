package androidx.camera.camera2.internal;

/* loaded from: classes14.dex */
public final class Camera2CameraFactory implements androidx.camera.core.impl.CameraFactory {
    private static final int DEFAULT_ALLOWED_CONCURRENT_OPEN_CAMERAS = 1;
    private static final java.lang.String TAG = "Camera2CameraFactory";
    private final java.util.List<java.lang.String> mAvailableCameraIds;
    private final androidx.camera.core.concurrent.CameraCoordinator mCameraCoordinator;
    private final java.util.Map<java.lang.String, androidx.camera.camera2.internal.Camera2CameraInfoImpl> mCameraInfos = new java.util.HashMap();
    private final androidx.camera.camera2.internal.compat.CameraManagerCompat mCameraManager;
    private final long mCameraOpenRetryMaxTimeoutInMs;
    private final androidx.camera.core.impl.CameraStateRegistry mCameraStateRegistry;
    private final android.content.Context mContext;
    private final androidx.camera.camera2.internal.DisplayInfoManager mDisplayInfoManager;
    private final androidx.camera.core.impl.CameraThreadConfig mThreadConfig;

    public Camera2CameraFactory(android.content.Context context, androidx.camera.core.impl.CameraThreadConfig cameraThreadConfig, androidx.camera.core.CameraSelector cameraSelector, long j17) {
        this.mContext = context;
        this.mThreadConfig = cameraThreadConfig;
        androidx.camera.camera2.internal.compat.CameraManagerCompat from = androidx.camera.camera2.internal.compat.CameraManagerCompat.from(context, cameraThreadConfig.getSchedulerHandler());
        this.mCameraManager = from;
        this.mDisplayInfoManager = androidx.camera.camera2.internal.DisplayInfoManager.getInstance(context);
        this.mAvailableCameraIds = getBackwardCompatibleCameraIds(androidx.camera.camera2.internal.CameraSelectionOptimizer.getSelectedAvailableCameraIds(this, cameraSelector));
        androidx.camera.camera2.internal.concurrent.Camera2CameraCoordinator camera2CameraCoordinator = new androidx.camera.camera2.internal.concurrent.Camera2CameraCoordinator(from);
        this.mCameraCoordinator = camera2CameraCoordinator;
        androidx.camera.core.impl.CameraStateRegistry cameraStateRegistry = new androidx.camera.core.impl.CameraStateRegistry(camera2CameraCoordinator, 1);
        this.mCameraStateRegistry = cameraStateRegistry;
        camera2CameraCoordinator.addListener(cameraStateRegistry);
        this.mCameraOpenRetryMaxTimeoutInMs = j17;
    }

    private java.util.List<java.lang.String> getBackwardCompatibleCameraIds(java.util.List<java.lang.String> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : list) {
            if (str.equals("0") || str.equals("1")) {
                arrayList.add(str);
            } else if (androidx.camera.camera2.internal.CameraIdUtil.isBackwardCompatible(this.mCameraManager, str)) {
                arrayList.add(str);
            } else {
                androidx.camera.core.Logger.d(TAG, "Camera " + str + " is filtered out because its capabilities do not contain REQUEST_AVAILABLE_CAPABILITIES_BACKWARD_COMPATIBLE.");
            }
        }
        return arrayList;
    }

    @Override // androidx.camera.core.impl.CameraFactory
    public java.util.Set<java.lang.String> getAvailableCameraIds() {
        return new java.util.LinkedHashSet(this.mAvailableCameraIds);
    }

    @Override // androidx.camera.core.impl.CameraFactory
    public androidx.camera.core.impl.CameraInternal getCamera(java.lang.String str) {
        if (this.mAvailableCameraIds.contains(str)) {
            return new androidx.camera.camera2.internal.Camera2CameraImpl(this.mContext, this.mCameraManager, str, getCameraInfo(str), this.mCameraCoordinator, this.mCameraStateRegistry, this.mThreadConfig.getCameraExecutor(), this.mThreadConfig.getSchedulerHandler(), this.mDisplayInfoManager, this.mCameraOpenRetryMaxTimeoutInMs);
        }
        throw new java.lang.IllegalArgumentException("The given camera id is not on the available camera id list.");
    }

    @Override // androidx.camera.core.impl.CameraFactory
    public androidx.camera.core.concurrent.CameraCoordinator getCameraCoordinator() {
        return this.mCameraCoordinator;
    }

    public androidx.camera.camera2.internal.Camera2CameraInfoImpl getCameraInfo(java.lang.String str) {
        try {
            androidx.camera.camera2.internal.Camera2CameraInfoImpl camera2CameraInfoImpl = this.mCameraInfos.get(str);
            if (camera2CameraInfoImpl != null) {
                return camera2CameraInfoImpl;
            }
            androidx.camera.camera2.internal.Camera2CameraInfoImpl camera2CameraInfoImpl2 = new androidx.camera.camera2.internal.Camera2CameraInfoImpl(str, this.mCameraManager);
            this.mCameraInfos.put(str, camera2CameraInfoImpl2);
            return camera2CameraInfoImpl2;
        } catch (androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat e17) {
            throw androidx.camera.camera2.internal.CameraUnavailableExceptionHelper.createFrom(e17);
        }
    }

    @Override // androidx.camera.core.impl.CameraFactory
    public androidx.camera.camera2.internal.compat.CameraManagerCompat getCameraManager() {
        return this.mCameraManager;
    }
}
