package androidx.camera.camera2.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public class CaptureSessionRepository {
    final java.util.concurrent.Executor mExecutor;
    final java.lang.Object mLock = new java.lang.Object();
    final java.util.Set<androidx.camera.camera2.internal.SynchronizedCaptureSession> mCaptureSessions = new java.util.LinkedHashSet();
    final java.util.Set<androidx.camera.camera2.internal.SynchronizedCaptureSession> mClosingCaptureSession = new java.util.LinkedHashSet();
    final java.util.Set<androidx.camera.camera2.internal.SynchronizedCaptureSession> mCreatingCaptureSessions = new java.util.LinkedHashSet();
    private final android.hardware.camera2.CameraDevice.StateCallback mCameraStateCallback = new androidx.camera.camera2.internal.CaptureSessionRepository.AnonymousClass1();

    /* renamed from: androidx.camera.camera2.internal.CaptureSessionRepository$1, reason: invalid class name */
    /* loaded from: classes14.dex */
    public class AnonymousClass1 extends android.hardware.camera2.CameraDevice.StateCallback {
        public AnonymousClass1() {
        }

        private void cameraClosed() {
            java.util.List<androidx.camera.camera2.internal.SynchronizedCaptureSession> sessionsInOrder;
            synchronized (androidx.camera.camera2.internal.CaptureSessionRepository.this.mLock) {
                sessionsInOrder = androidx.camera.camera2.internal.CaptureSessionRepository.this.getSessionsInOrder();
                androidx.camera.camera2.internal.CaptureSessionRepository.this.mCreatingCaptureSessions.clear();
                androidx.camera.camera2.internal.CaptureSessionRepository.this.mCaptureSessions.clear();
                androidx.camera.camera2.internal.CaptureSessionRepository.this.mClosingCaptureSession.clear();
            }
            java.util.Iterator<androidx.camera.camera2.internal.SynchronizedCaptureSession> it = sessionsInOrder.iterator();
            while (it.hasNext()) {
                it.next().finishClose();
            }
        }

        private void dispatchOnError(final int i17) {
            final java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            synchronized (androidx.camera.camera2.internal.CaptureSessionRepository.this.mLock) {
                linkedHashSet.addAll(androidx.camera.camera2.internal.CaptureSessionRepository.this.mCreatingCaptureSessions);
                linkedHashSet.addAll(androidx.camera.camera2.internal.CaptureSessionRepository.this.mCaptureSessions);
            }
            androidx.camera.camera2.internal.CaptureSessionRepository.this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.CaptureSessionRepository$1$$a
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.camera2.internal.CaptureSessionRepository.AnonymousClass1.lambda$dispatchOnError$1(linkedHashSet, i17);
                }
            });
        }

        private void forceOnClosedCaptureSessions() {
            final java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            synchronized (androidx.camera.camera2.internal.CaptureSessionRepository.this.mLock) {
                linkedHashSet.addAll(androidx.camera.camera2.internal.CaptureSessionRepository.this.mCreatingCaptureSessions);
                linkedHashSet.addAll(androidx.camera.camera2.internal.CaptureSessionRepository.this.mCaptureSessions);
            }
            androidx.camera.camera2.internal.CaptureSessionRepository.this.mExecutor.execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.CaptureSessionRepository$1$$b
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.camera2.internal.CaptureSessionRepository.forceOnClosed(linkedHashSet);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$dispatchOnError$1(java.util.LinkedHashSet linkedHashSet, int i17) {
            java.util.Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                ((androidx.camera.camera2.internal.SynchronizedCaptureSession) it.next()).onCameraDeviceError(i17);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(android.hardware.camera2.CameraDevice cameraDevice) {
            forceOnClosedCaptureSessions();
            cameraClosed();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(android.hardware.camera2.CameraDevice cameraDevice) {
            forceOnClosedCaptureSessions();
            cameraClosed();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(android.hardware.camera2.CameraDevice cameraDevice, int i17) {
            forceOnClosedCaptureSessions();
            dispatchOnError(i17);
            cameraClosed();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(android.hardware.camera2.CameraDevice cameraDevice) {
        }
    }

    public CaptureSessionRepository(java.util.concurrent.Executor executor) {
        this.mExecutor = executor;
    }

    private void forceFinishCloseStaleSessions(androidx.camera.camera2.internal.SynchronizedCaptureSession synchronizedCaptureSession) {
        androidx.camera.camera2.internal.SynchronizedCaptureSession next;
        java.util.Iterator<androidx.camera.camera2.internal.SynchronizedCaptureSession> it = getSessionsInOrder().iterator();
        while (it.hasNext() && (next = it.next()) != synchronizedCaptureSession) {
            next.finishClose();
        }
    }

    public static void forceOnClosed(java.util.Set<androidx.camera.camera2.internal.SynchronizedCaptureSession> set) {
        for (androidx.camera.camera2.internal.SynchronizedCaptureSession synchronizedCaptureSession : set) {
            synchronizedCaptureSession.getStateCallback().onClosed(synchronizedCaptureSession);
        }
    }

    public android.hardware.camera2.CameraDevice.StateCallback getCameraStateCallback() {
        return this.mCameraStateCallback;
    }

    public java.util.List<androidx.camera.camera2.internal.SynchronizedCaptureSession> getCaptureSessions() {
        java.util.ArrayList arrayList;
        synchronized (this.mLock) {
            arrayList = new java.util.ArrayList(this.mCaptureSessions);
        }
        return arrayList;
    }

    public java.util.List<androidx.camera.camera2.internal.SynchronizedCaptureSession> getClosingCaptureSession() {
        java.util.ArrayList arrayList;
        synchronized (this.mLock) {
            arrayList = new java.util.ArrayList(this.mClosingCaptureSession);
        }
        return arrayList;
    }

    public java.util.List<androidx.camera.camera2.internal.SynchronizedCaptureSession> getCreatingCaptureSessions() {
        java.util.ArrayList arrayList;
        synchronized (this.mLock) {
            arrayList = new java.util.ArrayList(this.mCreatingCaptureSessions);
        }
        return arrayList;
    }

    public java.util.List<androidx.camera.camera2.internal.SynchronizedCaptureSession> getSessionsInOrder() {
        java.util.ArrayList arrayList;
        synchronized (this.mLock) {
            arrayList = new java.util.ArrayList();
            arrayList.addAll(getCaptureSessions());
            arrayList.addAll(getCreatingCaptureSessions());
        }
        return arrayList;
    }

    public void onCaptureSessionClosed(androidx.camera.camera2.internal.SynchronizedCaptureSession synchronizedCaptureSession) {
        synchronized (this.mLock) {
            this.mCaptureSessions.remove(synchronizedCaptureSession);
            this.mClosingCaptureSession.remove(synchronizedCaptureSession);
        }
    }

    public void onCaptureSessionClosing(androidx.camera.camera2.internal.SynchronizedCaptureSession synchronizedCaptureSession) {
        synchronized (this.mLock) {
            this.mClosingCaptureSession.add(synchronizedCaptureSession);
        }
    }

    public void onCaptureSessionConfigureFail(androidx.camera.camera2.internal.SynchronizedCaptureSession synchronizedCaptureSession) {
        forceFinishCloseStaleSessions(synchronizedCaptureSession);
        synchronized (this.mLock) {
            this.mCreatingCaptureSessions.remove(synchronizedCaptureSession);
        }
    }

    public void onCaptureSessionCreated(androidx.camera.camera2.internal.SynchronizedCaptureSession synchronizedCaptureSession) {
        synchronized (this.mLock) {
            this.mCaptureSessions.add(synchronizedCaptureSession);
            this.mCreatingCaptureSessions.remove(synchronizedCaptureSession);
        }
        forceFinishCloseStaleSessions(synchronizedCaptureSession);
    }

    public void onCreateCaptureSession(androidx.camera.camera2.internal.SynchronizedCaptureSession synchronizedCaptureSession) {
        synchronized (this.mLock) {
            this.mCreatingCaptureSessions.add(synchronizedCaptureSession);
        }
    }
}
