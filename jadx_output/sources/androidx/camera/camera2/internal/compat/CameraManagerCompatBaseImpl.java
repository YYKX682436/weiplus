package androidx.camera.camera2.internal.compat;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public class CameraManagerCompatBaseImpl implements androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl {
    final android.hardware.camera2.CameraManager mCameraManager;
    final java.lang.Object mObject;

    /* loaded from: classes14.dex */
    public static final class CameraManagerCompatParamsApi21 {
        final android.os.Handler mCompatHandler;
        final java.util.Map<android.hardware.camera2.CameraManager.AvailabilityCallback, androidx.camera.camera2.internal.compat.CameraManagerCompat.AvailabilityCallbackExecutorWrapper> mWrapperMap = new java.util.HashMap();

        public CameraManagerCompatParamsApi21(android.os.Handler handler) {
            this.mCompatHandler = handler;
        }
    }

    public CameraManagerCompatBaseImpl(android.content.Context context, java.lang.Object obj) {
        this.mCameraManager = (android.hardware.camera2.CameraManager) context.getSystemService("camera");
        this.mObject = obj;
    }

    public static androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl create(android.content.Context context, android.os.Handler handler) {
        return new androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl(context, new androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl.CameraManagerCompatParamsApi21(handler));
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    public android.hardware.camera2.CameraCharacteristics getCameraCharacteristics(java.lang.String str) {
        try {
            return this.mCameraManager.getCameraCharacteristics(str);
        } catch (android.hardware.camera2.CameraAccessException e17) {
            throw androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat.toCameraAccessExceptionCompat(e17);
        }
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    public java.lang.String[] getCameraIdList() {
        try {
            return this.mCameraManager.getCameraIdList();
        } catch (android.hardware.camera2.CameraAccessException e17) {
            throw androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat.toCameraAccessExceptionCompat(e17);
        }
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    public android.hardware.camera2.CameraManager getCameraManager() {
        return this.mCameraManager;
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    public java.util.Set<java.util.Set<java.lang.String>> getConcurrentCameraIds() {
        return java.util.Collections.emptySet();
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    public void openCamera(java.lang.String str, java.util.concurrent.Executor executor, android.hardware.camera2.CameraDevice.StateCallback stateCallback) {
        executor.getClass();
        stateCallback.getClass();
        androidx.camera.camera2.internal.compat.CameraDeviceCompat.StateCallbackExecutorWrapper stateCallbackExecutorWrapper = new androidx.camera.camera2.internal.compat.CameraDeviceCompat.StateCallbackExecutorWrapper(executor, stateCallback);
        androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl.CameraManagerCompatParamsApi21 cameraManagerCompatParamsApi21 = (androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl.CameraManagerCompatParamsApi21) this.mObject;
        try {
            android.hardware.camera2.CameraManager cameraManager = this.mCameraManager;
            android.os.Handler handler = cameraManagerCompatParamsApi21.mCompatHandler;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(handler);
            arrayList.add(stateCallbackExecutorWrapper);
            arrayList.add(str);
            java.util.Collections.reverse(arrayList);
            yj0.a.k(cameraManager, arrayList.toArray(), "androidx/camera/camera2/internal/compat/CameraManagerCompatBaseImpl", "openCamera", "(Ljava/lang/String;Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraDevice$StateCallback;)V", "android/hardware/camera2/CameraManager", "openCamera", "(Ljava/lang/String;Landroid/hardware/camera2/CameraDevice$StateCallback;Landroid/os/Handler;)V");
        } catch (android.hardware.camera2.CameraAccessException e17) {
            throw androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat.toCameraAccessExceptionCompat(e17);
        }
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    public void registerAvailabilityCallback(java.util.concurrent.Executor executor, android.hardware.camera2.CameraManager.AvailabilityCallback availabilityCallback) {
        androidx.camera.camera2.internal.compat.CameraManagerCompat.AvailabilityCallbackExecutorWrapper availabilityCallbackExecutorWrapper;
        if (executor == null) {
            throw new java.lang.IllegalArgumentException("executor was null");
        }
        androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl.CameraManagerCompatParamsApi21 cameraManagerCompatParamsApi21 = (androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl.CameraManagerCompatParamsApi21) this.mObject;
        if (availabilityCallback != null) {
            synchronized (cameraManagerCompatParamsApi21.mWrapperMap) {
                availabilityCallbackExecutorWrapper = cameraManagerCompatParamsApi21.mWrapperMap.get(availabilityCallback);
                if (availabilityCallbackExecutorWrapper == null) {
                    availabilityCallbackExecutorWrapper = new androidx.camera.camera2.internal.compat.CameraManagerCompat.AvailabilityCallbackExecutorWrapper(executor, availabilityCallback);
                    cameraManagerCompatParamsApi21.mWrapperMap.put(availabilityCallback, availabilityCallbackExecutorWrapper);
                }
            }
        } else {
            availabilityCallbackExecutorWrapper = null;
        }
        this.mCameraManager.registerAvailabilityCallback(availabilityCallbackExecutorWrapper, cameraManagerCompatParamsApi21.mCompatHandler);
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl
    public void unregisterAvailabilityCallback(android.hardware.camera2.CameraManager.AvailabilityCallback availabilityCallback) {
        androidx.camera.camera2.internal.compat.CameraManagerCompat.AvailabilityCallbackExecutorWrapper availabilityCallbackExecutorWrapper;
        if (availabilityCallback != null) {
            androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl.CameraManagerCompatParamsApi21 cameraManagerCompatParamsApi21 = (androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl.CameraManagerCompatParamsApi21) this.mObject;
            synchronized (cameraManagerCompatParamsApi21.mWrapperMap) {
                availabilityCallbackExecutorWrapper = cameraManagerCompatParamsApi21.mWrapperMap.remove(availabilityCallback);
            }
        } else {
            availabilityCallbackExecutorWrapper = null;
        }
        if (availabilityCallbackExecutorWrapper != null) {
            availabilityCallbackExecutorWrapper.setDisabled();
        }
        this.mCameraManager.unregisterAvailabilityCallback(availabilityCallbackExecutorWrapper);
    }
}
