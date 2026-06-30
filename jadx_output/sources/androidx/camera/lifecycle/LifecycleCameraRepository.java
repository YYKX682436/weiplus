package androidx.camera.lifecycle;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public final class LifecycleCameraRepository {
    androidx.camera.core.concurrent.CameraCoordinator mCameraCoordinator;
    private final java.lang.Object mLock = new java.lang.Object();
    private final java.util.Map<androidx.camera.lifecycle.LifecycleCameraRepository.Key, androidx.camera.lifecycle.LifecycleCamera> mCameraMap = new java.util.HashMap();
    private final java.util.Map<androidx.camera.lifecycle.LifecycleCameraRepository.LifecycleCameraRepositoryObserver, java.util.Set<androidx.camera.lifecycle.LifecycleCameraRepository.Key>> mLifecycleObserverMap = new java.util.HashMap();
    private final java.util.ArrayDeque<androidx.lifecycle.y> mActiveLifecycleOwners = new java.util.ArrayDeque<>();

    /* loaded from: classes14.dex */
    public static abstract class Key {
        public static androidx.camera.lifecycle.LifecycleCameraRepository.Key create(androidx.lifecycle.y yVar, androidx.camera.core.internal.CameraUseCaseAdapter.CameraId cameraId) {
            return new androidx.camera.lifecycle.AutoValue_LifecycleCameraRepository_Key(yVar, cameraId);
        }

        public abstract androidx.camera.core.internal.CameraUseCaseAdapter.CameraId getCameraId();

        public abstract androidx.lifecycle.y getLifecycleOwner();
    }

    /* loaded from: classes14.dex */
    public static class LifecycleCameraRepositoryObserver implements androidx.lifecycle.x {
        private final androidx.camera.lifecycle.LifecycleCameraRepository mLifecycleCameraRepository;
        private final androidx.lifecycle.y mLifecycleOwner;

        public LifecycleCameraRepositoryObserver(androidx.lifecycle.y yVar, androidx.camera.lifecycle.LifecycleCameraRepository lifecycleCameraRepository) {
            this.mLifecycleOwner = yVar;
            this.mLifecycleCameraRepository = lifecycleCameraRepository;
        }

        public androidx.lifecycle.y getLifecycleOwner() {
            return this.mLifecycleOwner;
        }

        @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
        public void onDestroy(androidx.lifecycle.y yVar) {
            this.mLifecycleCameraRepository.unregisterLifecycle(yVar);
        }

        @androidx.lifecycle.l0(androidx.lifecycle.m.ON_START)
        public void onStart(androidx.lifecycle.y yVar) {
            this.mLifecycleCameraRepository.setActive(yVar);
        }

        @androidx.lifecycle.l0(androidx.lifecycle.m.ON_STOP)
        public void onStop(androidx.lifecycle.y yVar) {
            this.mLifecycleCameraRepository.setInactive(yVar);
        }
    }

    private androidx.camera.lifecycle.LifecycleCameraRepository.LifecycleCameraRepositoryObserver getLifecycleCameraRepositoryObserver(androidx.lifecycle.y yVar) {
        synchronized (this.mLock) {
            for (androidx.camera.lifecycle.LifecycleCameraRepository.LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver : this.mLifecycleObserverMap.keySet()) {
                if (yVar.equals(lifecycleCameraRepositoryObserver.getLifecycleOwner())) {
                    return lifecycleCameraRepositoryObserver;
                }
            }
            return null;
        }
    }

    private boolean hasUseCaseBound(androidx.lifecycle.y yVar) {
        synchronized (this.mLock) {
            androidx.camera.lifecycle.LifecycleCameraRepository.LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver = getLifecycleCameraRepositoryObserver(yVar);
            if (lifecycleCameraRepositoryObserver == null) {
                return false;
            }
            java.util.Iterator<androidx.camera.lifecycle.LifecycleCameraRepository.Key> it = this.mLifecycleObserverMap.get(lifecycleCameraRepositoryObserver).iterator();
            while (it.hasNext()) {
                androidx.camera.lifecycle.LifecycleCamera lifecycleCamera = this.mCameraMap.get(it.next());
                lifecycleCamera.getClass();
                if (!lifecycleCamera.getUseCases().isEmpty()) {
                    return true;
                }
            }
            return false;
        }
    }

    private void registerCamera(androidx.camera.lifecycle.LifecycleCamera lifecycleCamera) {
        synchronized (this.mLock) {
            androidx.lifecycle.y lifecycleOwner = lifecycleCamera.getLifecycleOwner();
            androidx.camera.lifecycle.LifecycleCameraRepository.Key create = androidx.camera.lifecycle.LifecycleCameraRepository.Key.create(lifecycleOwner, androidx.camera.core.internal.CameraUseCaseAdapter.generateCameraId((androidx.camera.core.impl.RestrictedCameraInfo) lifecycleCamera.getCameraInfo(), (androidx.camera.core.impl.RestrictedCameraInfo) lifecycleCamera.getSecondaryCameraInfo()));
            androidx.camera.lifecycle.LifecycleCameraRepository.LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver = getLifecycleCameraRepositoryObserver(lifecycleOwner);
            java.util.Set<androidx.camera.lifecycle.LifecycleCameraRepository.Key> hashSet = lifecycleCameraRepositoryObserver != null ? this.mLifecycleObserverMap.get(lifecycleCameraRepositoryObserver) : new java.util.HashSet<>();
            hashSet.add(create);
            this.mCameraMap.put(create, lifecycleCamera);
            if (lifecycleCameraRepositoryObserver == null) {
                androidx.camera.lifecycle.LifecycleCameraRepository.LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver2 = new androidx.camera.lifecycle.LifecycleCameraRepository.LifecycleCameraRepositoryObserver(lifecycleOwner, this);
                this.mLifecycleObserverMap.put(lifecycleCameraRepositoryObserver2, hashSet);
                lifecycleOwner.mo133getLifecycle().a(lifecycleCameraRepositoryObserver2);
            }
        }
    }

    private void suspendUseCases(androidx.lifecycle.y yVar) {
        synchronized (this.mLock) {
            androidx.camera.lifecycle.LifecycleCameraRepository.LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver = getLifecycleCameraRepositoryObserver(yVar);
            if (lifecycleCameraRepositoryObserver == null) {
                return;
            }
            java.util.Iterator<androidx.camera.lifecycle.LifecycleCameraRepository.Key> it = this.mLifecycleObserverMap.get(lifecycleCameraRepositoryObserver).iterator();
            while (it.hasNext()) {
                androidx.camera.lifecycle.LifecycleCamera lifecycleCamera = this.mCameraMap.get(it.next());
                lifecycleCamera.getClass();
                lifecycleCamera.suspend();
            }
        }
    }

    private void unsuspendUseCases(androidx.lifecycle.y yVar) {
        synchronized (this.mLock) {
            java.util.Iterator<androidx.camera.lifecycle.LifecycleCameraRepository.Key> it = this.mLifecycleObserverMap.get(getLifecycleCameraRepositoryObserver(yVar)).iterator();
            while (it.hasNext()) {
                androidx.camera.lifecycle.LifecycleCamera lifecycleCamera = this.mCameraMap.get(it.next());
                lifecycleCamera.getClass();
                if (!lifecycleCamera.getUseCases().isEmpty()) {
                    lifecycleCamera.unsuspend();
                }
            }
        }
    }

    public void bindToLifecycleCamera(androidx.camera.lifecycle.LifecycleCamera lifecycleCamera, androidx.camera.core.ViewPort viewPort, java.util.List<androidx.camera.core.CameraEffect> list, java.util.Collection<androidx.camera.core.UseCase> collection, androidx.camera.core.concurrent.CameraCoordinator cameraCoordinator) {
        synchronized (this.mLock) {
            m3.h.a(!collection.isEmpty());
            this.mCameraCoordinator = cameraCoordinator;
            androidx.lifecycle.y lifecycleOwner = lifecycleCamera.getLifecycleOwner();
            androidx.camera.lifecycle.LifecycleCameraRepository.LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver = getLifecycleCameraRepositoryObserver(lifecycleOwner);
            if (lifecycleCameraRepositoryObserver == null) {
                return;
            }
            java.util.Set<androidx.camera.lifecycle.LifecycleCameraRepository.Key> set = this.mLifecycleObserverMap.get(lifecycleCameraRepositoryObserver);
            androidx.camera.core.concurrent.CameraCoordinator cameraCoordinator2 = this.mCameraCoordinator;
            if (cameraCoordinator2 == null || cameraCoordinator2.getCameraOperatingMode() != 2) {
                java.util.Iterator<androidx.camera.lifecycle.LifecycleCameraRepository.Key> it = set.iterator();
                while (it.hasNext()) {
                    androidx.camera.lifecycle.LifecycleCamera lifecycleCamera2 = this.mCameraMap.get(it.next());
                    lifecycleCamera2.getClass();
                    if (!lifecycleCamera2.equals(lifecycleCamera) && !lifecycleCamera2.getUseCases().isEmpty()) {
                        throw new java.lang.IllegalArgumentException("Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner.");
                    }
                }
            }
            try {
                lifecycleCamera.getCameraUseCaseAdapter().setViewPort(viewPort);
                lifecycleCamera.getCameraUseCaseAdapter().setEffects(list);
                lifecycleCamera.bind(collection);
                if (lifecycleOwner.mo133getLifecycle().b().a(androidx.lifecycle.n.STARTED)) {
                    setActive(lifecycleOwner);
                }
            } catch (androidx.camera.core.internal.CameraUseCaseAdapter.CameraException e17) {
                throw new java.lang.IllegalArgumentException(e17);
            }
        }
    }

    public void clear() {
        synchronized (this.mLock) {
            java.util.Iterator it = new java.util.HashSet(this.mLifecycleObserverMap.keySet()).iterator();
            while (it.hasNext()) {
                unregisterLifecycle(((androidx.camera.lifecycle.LifecycleCameraRepository.LifecycleCameraRepositoryObserver) it.next()).getLifecycleOwner());
            }
        }
    }

    public androidx.camera.lifecycle.LifecycleCamera createLifecycleCamera(androidx.lifecycle.y yVar, androidx.camera.core.internal.CameraUseCaseAdapter cameraUseCaseAdapter) {
        synchronized (this.mLock) {
            m3.h.b(this.mCameraMap.get(androidx.camera.lifecycle.LifecycleCameraRepository.Key.create(yVar, cameraUseCaseAdapter.getCameraId())) == null, "LifecycleCamera already exists for the given LifecycleOwner and set of cameras");
            androidx.camera.lifecycle.LifecycleCamera lifecycleCamera = new androidx.camera.lifecycle.LifecycleCamera(yVar, cameraUseCaseAdapter);
            if (cameraUseCaseAdapter.getUseCases().isEmpty()) {
                lifecycleCamera.suspend();
            }
            if (yVar.mo133getLifecycle().b() == androidx.lifecycle.n.DESTROYED) {
                return lifecycleCamera;
            }
            registerCamera(lifecycleCamera);
            return lifecycleCamera;
        }
    }

    public androidx.camera.lifecycle.LifecycleCamera getLifecycleCamera(androidx.lifecycle.y yVar, androidx.camera.core.internal.CameraUseCaseAdapter.CameraId cameraId) {
        androidx.camera.lifecycle.LifecycleCamera lifecycleCamera;
        synchronized (this.mLock) {
            lifecycleCamera = this.mCameraMap.get(androidx.camera.lifecycle.LifecycleCameraRepository.Key.create(yVar, cameraId));
        }
        return lifecycleCamera;
    }

    public java.util.Collection<androidx.camera.lifecycle.LifecycleCamera> getLifecycleCameras() {
        java.util.Collection<androidx.camera.lifecycle.LifecycleCamera> unmodifiableCollection;
        synchronized (this.mLock) {
            unmodifiableCollection = java.util.Collections.unmodifiableCollection(this.mCameraMap.values());
        }
        return unmodifiableCollection;
    }

    public void setActive(androidx.lifecycle.y yVar) {
        synchronized (this.mLock) {
            if (hasUseCaseBound(yVar)) {
                if (this.mActiveLifecycleOwners.isEmpty()) {
                    this.mActiveLifecycleOwners.push(yVar);
                } else {
                    androidx.camera.core.concurrent.CameraCoordinator cameraCoordinator = this.mCameraCoordinator;
                    if (cameraCoordinator == null || cameraCoordinator.getCameraOperatingMode() != 2) {
                        androidx.lifecycle.y peek = this.mActiveLifecycleOwners.peek();
                        if (!yVar.equals(peek)) {
                            suspendUseCases(peek);
                            this.mActiveLifecycleOwners.remove(yVar);
                            this.mActiveLifecycleOwners.push(yVar);
                        }
                    }
                }
                unsuspendUseCases(yVar);
            }
        }
    }

    public void setInactive(androidx.lifecycle.y yVar) {
        synchronized (this.mLock) {
            this.mActiveLifecycleOwners.remove(yVar);
            suspendUseCases(yVar);
            if (!this.mActiveLifecycleOwners.isEmpty()) {
                unsuspendUseCases(this.mActiveLifecycleOwners.peek());
            }
        }
    }

    public void unbind(java.util.Collection<androidx.camera.core.UseCase> collection) {
        synchronized (this.mLock) {
            java.util.Iterator<androidx.camera.lifecycle.LifecycleCameraRepository.Key> it = this.mCameraMap.keySet().iterator();
            while (it.hasNext()) {
                androidx.camera.lifecycle.LifecycleCamera lifecycleCamera = this.mCameraMap.get(it.next());
                boolean z17 = !lifecycleCamera.getUseCases().isEmpty();
                lifecycleCamera.unbind(collection);
                if (z17 && lifecycleCamera.getUseCases().isEmpty()) {
                    setInactive(lifecycleCamera.getLifecycleOwner());
                }
            }
        }
    }

    public void unbindAll() {
        synchronized (this.mLock) {
            java.util.Iterator<androidx.camera.lifecycle.LifecycleCameraRepository.Key> it = this.mCameraMap.keySet().iterator();
            while (it.hasNext()) {
                androidx.camera.lifecycle.LifecycleCamera lifecycleCamera = this.mCameraMap.get(it.next());
                lifecycleCamera.unbindAll();
                setInactive(lifecycleCamera.getLifecycleOwner());
            }
        }
    }

    public void unregisterLifecycle(androidx.lifecycle.y yVar) {
        synchronized (this.mLock) {
            androidx.camera.lifecycle.LifecycleCameraRepository.LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver = getLifecycleCameraRepositoryObserver(yVar);
            if (lifecycleCameraRepositoryObserver == null) {
                return;
            }
            setInactive(yVar);
            java.util.Iterator<androidx.camera.lifecycle.LifecycleCameraRepository.Key> it = this.mLifecycleObserverMap.get(lifecycleCameraRepositoryObserver).iterator();
            while (it.hasNext()) {
                this.mCameraMap.remove(it.next());
            }
            this.mLifecycleObserverMap.remove(lifecycleCameraRepositoryObserver);
            lifecycleCameraRepositoryObserver.getLifecycleOwner().mo133getLifecycle().c(lifecycleCameraRepositoryObserver);
        }
    }
}
