package androidx.camera.camera2.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public final class ZoomControl {
    public static final float DEFAULT_ZOOM_RATIO = 1.0f;
    private static final java.lang.String TAG = "ZoomControl";
    private final androidx.camera.camera2.internal.Camera2CameraControlImpl mCamera2CameraControlImpl;
    private final androidx.camera.camera2.internal.ZoomStateImpl mCurrentZoomState;
    private final java.util.concurrent.Executor mExecutor;
    final androidx.camera.camera2.internal.ZoomControl.ZoomImpl mZoomImpl;
    private final androidx.lifecycle.j0 mZoomStateLiveData;
    private boolean mIsActive = false;
    private androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener mCaptureResultListener = new androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener() { // from class: androidx.camera.camera2.internal.ZoomControl.1
        @Override // androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener
        public boolean onCaptureResult(android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
            androidx.camera.camera2.internal.ZoomControl.this.mZoomImpl.onCaptureResult(totalCaptureResult);
            return false;
        }
    };

    /* loaded from: classes14.dex */
    public interface ZoomImpl {
        void addRequestOption(androidx.camera.camera2.impl.Camera2ImplConfig.Builder builder);

        android.graphics.Rect getCropSensorRegion();

        float getMaxZoom();

        float getMinZoom();

        void onCaptureResult(android.hardware.camera2.TotalCaptureResult totalCaptureResult);

        void resetZoom();

        void setZoomRatio(float f17, t2.k kVar);
    }

    public ZoomControl(androidx.camera.camera2.internal.Camera2CameraControlImpl camera2CameraControlImpl, androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat cameraCharacteristicsCompat, java.util.concurrent.Executor executor) {
        this.mCamera2CameraControlImpl = camera2CameraControlImpl;
        this.mExecutor = executor;
        androidx.camera.camera2.internal.ZoomControl.ZoomImpl createZoomImpl = createZoomImpl(cameraCharacteristicsCompat);
        this.mZoomImpl = createZoomImpl;
        androidx.camera.camera2.internal.ZoomStateImpl zoomStateImpl = new androidx.camera.camera2.internal.ZoomStateImpl(createZoomImpl.getMaxZoom(), createZoomImpl.getMinZoom());
        this.mCurrentZoomState = zoomStateImpl;
        zoomStateImpl.setZoomRatio(1.0f);
        this.mZoomStateLiveData = new androidx.lifecycle.j0(androidx.camera.core.internal.ImmutableZoomState.create(zoomStateImpl));
        camera2CameraControlImpl.addCaptureResultListener(this.mCaptureResultListener);
    }

    private static androidx.camera.camera2.internal.ZoomControl.ZoomImpl createZoomImpl(androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        return isAndroidRZoomSupported(cameraCharacteristicsCompat) ? new androidx.camera.camera2.internal.AndroidRZoomImpl(cameraCharacteristicsCompat) : new androidx.camera.camera2.internal.CropRegionZoomImpl(cameraCharacteristicsCompat);
    }

    public static androidx.camera.core.ZoomState getDefaultZoomState(androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        androidx.camera.camera2.internal.ZoomControl.ZoomImpl createZoomImpl = createZoomImpl(cameraCharacteristicsCompat);
        androidx.camera.camera2.internal.ZoomStateImpl zoomStateImpl = new androidx.camera.camera2.internal.ZoomStateImpl(createZoomImpl.getMaxZoom(), createZoomImpl.getMinZoom());
        zoomStateImpl.setZoomRatio(1.0f);
        return androidx.camera.core.internal.ImmutableZoomState.create(zoomStateImpl);
    }

    private static android.util.Range<java.lang.Float> getZoomRatioRange(androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        try {
            return (android.util.Range) cameraCharacteristicsCompat.get(android.hardware.camera2.CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
        } catch (java.lang.AssertionError e17) {
            androidx.camera.core.Logger.w(TAG, "AssertionError, fail to get camera characteristic.", e17);
            return null;
        }
    }

    public static boolean isAndroidRZoomSupported(androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        return android.os.Build.VERSION.SDK_INT >= 30 && getZoomRatioRange(cameraCharacteristicsCompat) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.lang.Object lambda$setLinearZoom$3(final androidx.camera.core.ZoomState zoomState, final t2.k kVar) {
        this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.ZoomControl$$b
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.camera2.internal.ZoomControl.this.lambda$setLinearZoom$2(kVar, zoomState);
            }
        });
        return "setLinearZoom";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.lang.Object lambda$setZoomRatio$1(final androidx.camera.core.ZoomState zoomState, final t2.k kVar) {
        this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.ZoomControl$$c
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.camera2.internal.ZoomControl.this.lambda$setZoomRatio$0(kVar, zoomState);
            }
        });
        return "setZoomRatio";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: submitCameraZoomRatio, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void lambda$setZoomRatio$0(t2.k kVar, androidx.camera.core.ZoomState zoomState) {
        androidx.camera.core.ZoomState create;
        if (this.mIsActive) {
            this.mZoomImpl.setZoomRatio(zoomState.getZoomRatio(), kVar);
            this.mCamera2CameraControlImpl.updateSessionConfigSynchronous();
            return;
        }
        synchronized (this.mCurrentZoomState) {
            this.mCurrentZoomState.setZoomRatio(1.0f);
            create = androidx.camera.core.internal.ImmutableZoomState.create(this.mCurrentZoomState);
        }
        updateLiveData(create);
        kVar.b(new androidx.camera.core.CameraControl.OperationCanceledException("Camera is not active."));
    }

    private void updateLiveData(androidx.camera.core.ZoomState zoomState) {
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            this.mZoomStateLiveData.setValue(zoomState);
        } else {
            this.mZoomStateLiveData.postValue(zoomState);
        }
    }

    public void addZoomOption(androidx.camera.camera2.impl.Camera2ImplConfig.Builder builder) {
        this.mZoomImpl.addRequestOption(builder);
    }

    public android.graphics.Rect getCropSensorRegion() {
        return this.mZoomImpl.getCropSensorRegion();
    }

    public androidx.lifecycle.g0 getZoomState() {
        return this.mZoomStateLiveData;
    }

    public void setActive(boolean z17) {
        androidx.camera.core.ZoomState create;
        if (this.mIsActive == z17) {
            return;
        }
        this.mIsActive = z17;
        if (z17) {
            return;
        }
        synchronized (this.mCurrentZoomState) {
            this.mCurrentZoomState.setZoomRatio(1.0f);
            create = androidx.camera.core.internal.ImmutableZoomState.create(this.mCurrentZoomState);
        }
        updateLiveData(create);
        this.mZoomImpl.resetZoom();
        this.mCamera2CameraControlImpl.updateSessionConfigSynchronous();
    }

    public wa.a setLinearZoom(float f17) {
        final androidx.camera.core.ZoomState create;
        synchronized (this.mCurrentZoomState) {
            try {
                this.mCurrentZoomState.setLinearZoom(f17);
                create = androidx.camera.core.internal.ImmutableZoomState.create(this.mCurrentZoomState);
            } catch (java.lang.IllegalArgumentException e17) {
                return androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(e17);
            }
        }
        updateLiveData(create);
        return t2.p.a(new t2.m() { // from class: androidx.camera.camera2.internal.ZoomControl$$d
            @Override // t2.m
            public final java.lang.Object attachCompleter(t2.k kVar) {
                java.lang.Object lambda$setLinearZoom$3;
                lambda$setLinearZoom$3 = androidx.camera.camera2.internal.ZoomControl.this.lambda$setLinearZoom$3(create, kVar);
                return lambda$setLinearZoom$3;
            }
        });
    }

    public wa.a setZoomRatio(float f17) {
        final androidx.camera.core.ZoomState create;
        synchronized (this.mCurrentZoomState) {
            try {
                this.mCurrentZoomState.setZoomRatio(f17);
                create = androidx.camera.core.internal.ImmutableZoomState.create(this.mCurrentZoomState);
            } catch (java.lang.IllegalArgumentException e17) {
                return androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(e17);
            }
        }
        updateLiveData(create);
        return t2.p.a(new t2.m() { // from class: androidx.camera.camera2.internal.ZoomControl$$a
            @Override // t2.m
            public final java.lang.Object attachCompleter(t2.k kVar) {
                java.lang.Object lambda$setZoomRatio$1;
                lambda$setZoomRatio$1 = androidx.camera.camera2.internal.ZoomControl.this.lambda$setZoomRatio$1(create, kVar);
                return lambda$setZoomRatio$1;
            }
        });
    }
}
