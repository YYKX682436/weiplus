package androidx.camera.core.impl;

/* loaded from: classes14.dex */
public final class CameraRepository {
    private static final java.lang.String TAG = "CameraRepository";
    private t2.k mDeinitCompleter;
    private wa.a mDeinitFuture;
    private final java.lang.Object mCamerasLock = new java.lang.Object();
    private final java.util.Map<java.lang.String, androidx.camera.core.impl.CameraInternal> mCameras = new java.util.LinkedHashMap();
    private final java.util.Set<androidx.camera.core.impl.CameraInternal> mReleasingCameras = new java.util.HashSet();

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.lang.Object lambda$deinit$0(t2.k kVar) {
        synchronized (this.mCamerasLock) {
            this.mDeinitCompleter = kVar;
        }
        return "CameraRepository-deinit";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$deinit$1(androidx.camera.core.impl.CameraInternal cameraInternal) {
        synchronized (this.mCamerasLock) {
            this.mReleasingCameras.remove(cameraInternal);
            if (this.mReleasingCameras.isEmpty()) {
                this.mDeinitCompleter.getClass();
                this.mDeinitCompleter.a(null);
                this.mDeinitCompleter = null;
                this.mDeinitFuture = null;
            }
        }
    }

    public wa.a deinit() {
        synchronized (this.mCamerasLock) {
            if (this.mCameras.isEmpty()) {
                wa.a aVar = this.mDeinitFuture;
                if (aVar == null) {
                    aVar = androidx.camera.core.impl.utils.futures.Futures.immediateFuture(null);
                }
                return aVar;
            }
            wa.a aVar2 = this.mDeinitFuture;
            if (aVar2 == null) {
                aVar2 = t2.p.a(new t2.m() { // from class: androidx.camera.core.impl.CameraRepository$$a
                    @Override // t2.m
                    public final java.lang.Object attachCompleter(t2.k kVar) {
                        java.lang.Object lambda$deinit$0;
                        lambda$deinit$0 = androidx.camera.core.impl.CameraRepository.this.lambda$deinit$0(kVar);
                        return lambda$deinit$0;
                    }
                });
                this.mDeinitFuture = aVar2;
            }
            this.mReleasingCameras.addAll(this.mCameras.values());
            for (final androidx.camera.core.impl.CameraInternal cameraInternal : this.mCameras.values()) {
                cameraInternal.release().addListener(new java.lang.Runnable() { // from class: androidx.camera.core.impl.CameraRepository$$b
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.camera.core.impl.CameraRepository.this.lambda$deinit$1(cameraInternal);
                    }
                }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
            }
            this.mCameras.clear();
            return aVar2;
        }
    }

    public androidx.camera.core.impl.CameraInternal getCamera(java.lang.String str) {
        androidx.camera.core.impl.CameraInternal cameraInternal;
        synchronized (this.mCamerasLock) {
            cameraInternal = this.mCameras.get(str);
            if (cameraInternal == null) {
                throw new java.lang.IllegalArgumentException("Invalid camera: " + str);
            }
        }
        return cameraInternal;
    }

    public java.util.Set<java.lang.String> getCameraIds() {
        java.util.LinkedHashSet linkedHashSet;
        synchronized (this.mCamerasLock) {
            linkedHashSet = new java.util.LinkedHashSet(this.mCameras.keySet());
        }
        return linkedHashSet;
    }

    public java.util.LinkedHashSet<androidx.camera.core.impl.CameraInternal> getCameras() {
        java.util.LinkedHashSet<androidx.camera.core.impl.CameraInternal> linkedHashSet;
        synchronized (this.mCamerasLock) {
            linkedHashSet = new java.util.LinkedHashSet<>(this.mCameras.values());
        }
        return linkedHashSet;
    }

    public void init(androidx.camera.core.impl.CameraFactory cameraFactory) {
        synchronized (this.mCamerasLock) {
            try {
                try {
                    for (java.lang.String str : cameraFactory.getAvailableCameraIds()) {
                        androidx.camera.core.Logger.d(TAG, "Added camera: " + str);
                        this.mCameras.put(str, cameraFactory.getCamera(str));
                    }
                } catch (androidx.camera.core.CameraUnavailableException e17) {
                    throw new androidx.camera.core.InitializationException(e17);
                }
            } catch (java.lang.Throwable th6) {
                throw th6;
            }
        }
    }
}
