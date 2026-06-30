package androidx.camera.camera2.internal.compat;

/* loaded from: classes14.dex */
public final class CameraManagerCompat {
    private final java.util.Map<java.lang.String, androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat> mCameraCharacteristicsMap = new android.util.ArrayMap(4);
    private final androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl mImpl;

    /* loaded from: classes14.dex */
    public static final class AvailabilityCallbackExecutorWrapper extends android.hardware.camera2.CameraManager.AvailabilityCallback {
        private final java.util.concurrent.Executor mExecutor;
        final android.hardware.camera2.CameraManager.AvailabilityCallback mWrappedCallback;
        private final java.lang.Object mLock = new java.lang.Object();
        private boolean mDisabled = false;

        public AvailabilityCallbackExecutorWrapper(java.util.concurrent.Executor executor, android.hardware.camera2.CameraManager.AvailabilityCallback availabilityCallback) {
            this.mExecutor = executor;
            this.mWrappedCallback = availabilityCallback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCameraAccessPrioritiesChanged$0() {
            androidx.camera.camera2.internal.compat.ApiCompat.Api29Impl.onCameraAccessPrioritiesChanged(this.mWrappedCallback);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCameraAvailable$1(java.lang.String str) {
            this.mWrappedCallback.onCameraAvailable(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCameraUnavailable$2(java.lang.String str) {
            this.mWrappedCallback.onCameraUnavailable(str);
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAccessPrioritiesChanged() {
            synchronized (this.mLock) {
                if (!this.mDisabled) {
                    this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.compat.CameraManagerCompat$AvailabilityCallbackExecutorWrapper$$a
                        @Override // java.lang.Runnable
                        public final void run() {
                            androidx.camera.camera2.internal.compat.CameraManagerCompat.AvailabilityCallbackExecutorWrapper.this.lambda$onCameraAccessPrioritiesChanged$0();
                        }
                    });
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAvailable(final java.lang.String str) {
            synchronized (this.mLock) {
                if (!this.mDisabled) {
                    this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.compat.CameraManagerCompat$AvailabilityCallbackExecutorWrapper$$c
                        @Override // java.lang.Runnable
                        public final void run() {
                            androidx.camera.camera2.internal.compat.CameraManagerCompat.AvailabilityCallbackExecutorWrapper.this.lambda$onCameraAvailable$1(str);
                        }
                    });
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraUnavailable(final java.lang.String str) {
            synchronized (this.mLock) {
                if (!this.mDisabled) {
                    this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.compat.CameraManagerCompat$AvailabilityCallbackExecutorWrapper$$b
                        @Override // java.lang.Runnable
                        public final void run() {
                            androidx.camera.camera2.internal.compat.CameraManagerCompat.AvailabilityCallbackExecutorWrapper.this.lambda$onCameraUnavailable$2(str);
                        }
                    });
                }
            }
        }

        public void setDisabled() {
            synchronized (this.mLock) {
                this.mDisabled = true;
            }
        }
    }

    /* loaded from: classes14.dex */
    public interface CameraManagerCompatImpl {
        static androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl from(android.content.Context context, android.os.Handler handler) {
            int i17 = android.os.Build.VERSION.SDK_INT;
            return i17 >= 30 ? new androidx.camera.camera2.internal.compat.CameraManagerCompatApi30Impl(context) : i17 >= 29 ? new androidx.camera.camera2.internal.compat.CameraManagerCompatApi29Impl(context) : i17 >= 28 ? androidx.camera.camera2.internal.compat.CameraManagerCompatApi28Impl.create(context) : androidx.camera.camera2.internal.compat.CameraManagerCompatBaseImpl.create(context, handler);
        }

        android.hardware.camera2.CameraCharacteristics getCameraCharacteristics(java.lang.String str);

        java.lang.String[] getCameraIdList();

        android.hardware.camera2.CameraManager getCameraManager();

        java.util.Set<java.util.Set<java.lang.String>> getConcurrentCameraIds();

        void openCamera(java.lang.String str, java.util.concurrent.Executor executor, android.hardware.camera2.CameraDevice.StateCallback stateCallback);

        void registerAvailabilityCallback(java.util.concurrent.Executor executor, android.hardware.camera2.CameraManager.AvailabilityCallback availabilityCallback);

        void unregisterAvailabilityCallback(android.hardware.camera2.CameraManager.AvailabilityCallback availabilityCallback);
    }

    private CameraManagerCompat(androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl cameraManagerCompatImpl) {
        this.mImpl = cameraManagerCompatImpl;
    }

    public static androidx.camera.camera2.internal.compat.CameraManagerCompat from(android.content.Context context) {
        return from(context, androidx.camera.core.impl.utils.MainThreadAsyncHandler.getInstance());
    }

    public androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat getCameraCharacteristicsCompat(java.lang.String str) {
        androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat cameraCharacteristicsCompat;
        synchronized (this.mCameraCharacteristicsMap) {
            cameraCharacteristicsCompat = this.mCameraCharacteristicsMap.get(str);
            if (cameraCharacteristicsCompat == null) {
                try {
                    cameraCharacteristicsCompat = androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat.toCameraCharacteristicsCompat(this.mImpl.getCameraCharacteristics(str), str);
                    this.mCameraCharacteristicsMap.put(str, cameraCharacteristicsCompat);
                } catch (java.lang.AssertionError e17) {
                    throw new androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat(10002, e17.getMessage(), e17);
                }
            }
        }
        return cameraCharacteristicsCompat;
    }

    public java.lang.String[] getCameraIdList() {
        return this.mImpl.getCameraIdList();
    }

    public java.util.Set<java.util.Set<java.lang.String>> getConcurrentCameraIds() {
        return this.mImpl.getConcurrentCameraIds();
    }

    public void openCamera(java.lang.String str, java.util.concurrent.Executor executor, android.hardware.camera2.CameraDevice.StateCallback stateCallback) {
        this.mImpl.openCamera(str, executor, stateCallback);
    }

    public void registerAvailabilityCallback(java.util.concurrent.Executor executor, android.hardware.camera2.CameraManager.AvailabilityCallback availabilityCallback) {
        this.mImpl.registerAvailabilityCallback(executor, availabilityCallback);
    }

    public void unregisterAvailabilityCallback(android.hardware.camera2.CameraManager.AvailabilityCallback availabilityCallback) {
        this.mImpl.unregisterAvailabilityCallback(availabilityCallback);
    }

    public android.hardware.camera2.CameraManager unwrap() {
        return this.mImpl.getCameraManager();
    }

    public static androidx.camera.camera2.internal.compat.CameraManagerCompat from(android.content.Context context, android.os.Handler handler) {
        return new androidx.camera.camera2.internal.compat.CameraManagerCompat(androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl.from(context, handler));
    }

    public static androidx.camera.camera2.internal.compat.CameraManagerCompat from(androidx.camera.camera2.internal.compat.CameraManagerCompat.CameraManagerCompatImpl cameraManagerCompatImpl) {
        return new androidx.camera.camera2.internal.compat.CameraManagerCompat(cameraManagerCompatImpl);
    }
}
