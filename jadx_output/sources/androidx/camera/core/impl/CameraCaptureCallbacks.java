package androidx.camera.core.impl;

/* loaded from: classes14.dex */
public final class CameraCaptureCallbacks {

    /* loaded from: classes14.dex */
    public static final class ComboCameraCaptureCallback extends androidx.camera.core.impl.CameraCaptureCallback {
        private final java.util.List<androidx.camera.core.impl.CameraCaptureCallback> mCallbacks = new java.util.ArrayList();

        public ComboCameraCaptureCallback(java.util.List<androidx.camera.core.impl.CameraCaptureCallback> list) {
            for (androidx.camera.core.impl.CameraCaptureCallback cameraCaptureCallback : list) {
                if (!(cameraCaptureCallback instanceof androidx.camera.core.impl.CameraCaptureCallbacks.NoOpCameraCaptureCallback)) {
                    this.mCallbacks.add(cameraCaptureCallback);
                }
            }
        }

        public java.util.List<androidx.camera.core.impl.CameraCaptureCallback> getCallbacks() {
            return this.mCallbacks;
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureCancelled(int i17) {
            java.util.Iterator<androidx.camera.core.impl.CameraCaptureCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onCaptureCancelled(i17);
            }
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureCompleted(int i17, androidx.camera.core.impl.CameraCaptureResult cameraCaptureResult) {
            java.util.Iterator<androidx.camera.core.impl.CameraCaptureCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onCaptureCompleted(i17, cameraCaptureResult);
            }
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureFailed(int i17, androidx.camera.core.impl.CameraCaptureFailure cameraCaptureFailure) {
            java.util.Iterator<androidx.camera.core.impl.CameraCaptureCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onCaptureFailed(i17, cameraCaptureFailure);
            }
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureProcessProgressed(int i17, int i18) {
            java.util.Iterator<androidx.camera.core.impl.CameraCaptureCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onCaptureProcessProgressed(i17, i18);
            }
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureStarted(int i17) {
            java.util.Iterator<androidx.camera.core.impl.CameraCaptureCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onCaptureStarted(i17);
            }
        }
    }

    /* loaded from: classes14.dex */
    public static final class NoOpCameraCaptureCallback extends androidx.camera.core.impl.CameraCaptureCallback {
        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureCompleted(int i17, androidx.camera.core.impl.CameraCaptureResult cameraCaptureResult) {
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureFailed(int i17, androidx.camera.core.impl.CameraCaptureFailure cameraCaptureFailure) {
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureStarted(int i17) {
        }
    }

    private CameraCaptureCallbacks() {
    }

    public static androidx.camera.core.impl.CameraCaptureCallback createComboCallback(java.util.List<androidx.camera.core.impl.CameraCaptureCallback> list) {
        if (list.isEmpty()) {
            return createNoOpCallback();
        }
        if (list.size() == 1) {
            return list.get(0);
        }
        return new androidx.camera.core.impl.CameraCaptureCallbacks.ComboCameraCaptureCallback(list);
    }

    public static androidx.camera.core.impl.CameraCaptureCallback createNoOpCallback() {
        return new androidx.camera.core.impl.CameraCaptureCallbacks.NoOpCameraCaptureCallback();
    }

    public static androidx.camera.core.impl.CameraCaptureCallback createComboCallback(androidx.camera.core.impl.CameraCaptureCallback... cameraCaptureCallbackArr) {
        return createComboCallback((java.util.List<androidx.camera.core.impl.CameraCaptureCallback>) java.util.Arrays.asList(cameraCaptureCallbackArr));
    }
}
