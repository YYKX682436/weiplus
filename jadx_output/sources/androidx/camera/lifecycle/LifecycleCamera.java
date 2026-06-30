package androidx.camera.lifecycle;

/* loaded from: classes14.dex */
public final class LifecycleCamera implements androidx.lifecycle.x, androidx.camera.core.Camera {
    private final androidx.camera.core.internal.CameraUseCaseAdapter mCameraUseCaseAdapter;
    private final androidx.lifecycle.y mLifecycleOwner;
    private final java.lang.Object mLock = new java.lang.Object();
    private volatile boolean mIsActive = false;
    private boolean mSuspended = false;
    private boolean mReleased = false;

    public LifecycleCamera(androidx.lifecycle.y yVar, androidx.camera.core.internal.CameraUseCaseAdapter cameraUseCaseAdapter) {
        this.mLifecycleOwner = yVar;
        this.mCameraUseCaseAdapter = cameraUseCaseAdapter;
        if (yVar.mo133getLifecycle().b().a(androidx.lifecycle.n.STARTED)) {
            cameraUseCaseAdapter.attachUseCases();
        } else {
            cameraUseCaseAdapter.detachUseCases();
        }
        yVar.mo133getLifecycle().a(this);
    }

    public void bind(java.util.Collection<androidx.camera.core.UseCase> collection) {
        synchronized (this.mLock) {
            this.mCameraUseCaseAdapter.addUseCases(collection);
        }
    }

    @Override // androidx.camera.core.Camera
    public androidx.camera.core.CameraControl getCameraControl() {
        return this.mCameraUseCaseAdapter.getCameraControl();
    }

    @Override // androidx.camera.core.Camera
    public androidx.camera.core.CameraInfo getCameraInfo() {
        return this.mCameraUseCaseAdapter.getCameraInfo();
    }

    public androidx.camera.core.internal.CameraUseCaseAdapter getCameraUseCaseAdapter() {
        return this.mCameraUseCaseAdapter;
    }

    @Override // androidx.camera.core.Camera
    public androidx.camera.core.impl.CameraConfig getExtendedConfig() {
        return this.mCameraUseCaseAdapter.getExtendedConfig();
    }

    public androidx.lifecycle.y getLifecycleOwner() {
        androidx.lifecycle.y yVar;
        synchronized (this.mLock) {
            yVar = this.mLifecycleOwner;
        }
        return yVar;
    }

    public androidx.camera.core.CameraInfo getSecondaryCameraInfo() {
        return this.mCameraUseCaseAdapter.getSecondaryCameraInfo();
    }

    public java.util.List<androidx.camera.core.UseCase> getUseCases() {
        java.util.List<androidx.camera.core.UseCase> unmodifiableList;
        synchronized (this.mLock) {
            unmodifiableList = java.util.Collections.unmodifiableList(this.mCameraUseCaseAdapter.getUseCases());
        }
        return unmodifiableList;
    }

    public boolean isActive() {
        boolean z17;
        synchronized (this.mLock) {
            z17 = this.mIsActive;
        }
        return z17;
    }

    public boolean isBound(androidx.camera.core.UseCase useCase) {
        boolean contains;
        synchronized (this.mLock) {
            contains = this.mCameraUseCaseAdapter.getUseCases().contains(useCase);
        }
        return contains;
    }

    @Override // androidx.camera.core.Camera
    public boolean isUseCasesCombinationSupported(boolean z17, androidx.camera.core.UseCase... useCaseArr) {
        return this.mCameraUseCaseAdapter.isUseCasesCombinationSupported(z17, useCaseArr);
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
    public void onDestroy(androidx.lifecycle.y yVar) {
        synchronized (this.mLock) {
            androidx.camera.core.internal.CameraUseCaseAdapter cameraUseCaseAdapter = this.mCameraUseCaseAdapter;
            cameraUseCaseAdapter.removeUseCases(cameraUseCaseAdapter.getUseCases());
        }
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_PAUSE)
    public void onPause(androidx.lifecycle.y yVar) {
        this.mCameraUseCaseAdapter.setActiveResumingMode(false);
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_RESUME)
    public void onResume(androidx.lifecycle.y yVar) {
        this.mCameraUseCaseAdapter.setActiveResumingMode(true);
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_START)
    public void onStart(androidx.lifecycle.y yVar) {
        synchronized (this.mLock) {
            if (!this.mSuspended && !this.mReleased) {
                this.mCameraUseCaseAdapter.attachUseCases();
                this.mIsActive = true;
            }
        }
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_STOP)
    public void onStop(androidx.lifecycle.y yVar) {
        synchronized (this.mLock) {
            if (!this.mSuspended && !this.mReleased) {
                this.mCameraUseCaseAdapter.detachUseCases();
                this.mIsActive = false;
            }
        }
    }

    public void release() {
        synchronized (this.mLock) {
            this.mReleased = true;
            this.mIsActive = false;
            this.mLifecycleOwner.mo133getLifecycle().c(this);
        }
    }

    public void suspend() {
        synchronized (this.mLock) {
            if (this.mSuspended) {
                return;
            }
            onStop(this.mLifecycleOwner);
            this.mSuspended = true;
        }
    }

    public void unbind(java.util.Collection<androidx.camera.core.UseCase> collection) {
        synchronized (this.mLock) {
            java.util.ArrayList arrayList = new java.util.ArrayList(collection);
            arrayList.retainAll(this.mCameraUseCaseAdapter.getUseCases());
            this.mCameraUseCaseAdapter.removeUseCases(arrayList);
        }
    }

    public void unbindAll() {
        synchronized (this.mLock) {
            androidx.camera.core.internal.CameraUseCaseAdapter cameraUseCaseAdapter = this.mCameraUseCaseAdapter;
            cameraUseCaseAdapter.removeUseCases(cameraUseCaseAdapter.getUseCases());
        }
    }

    public void unsuspend() {
        synchronized (this.mLock) {
            if (this.mSuspended) {
                this.mSuspended = false;
                if (this.mLifecycleOwner.mo133getLifecycle().b().a(androidx.lifecycle.n.STARTED)) {
                    onStart(this.mLifecycleOwner);
                }
            }
        }
    }
}
