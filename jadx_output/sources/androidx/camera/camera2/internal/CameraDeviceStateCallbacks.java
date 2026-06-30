package androidx.camera.camera2.internal;

/* loaded from: classes14.dex */
public final class CameraDeviceStateCallbacks {

    /* loaded from: classes14.dex */
    public static final class ComboDeviceStateCallback extends android.hardware.camera2.CameraDevice.StateCallback {
        private final java.util.List<android.hardware.camera2.CameraDevice.StateCallback> mCallbacks = new java.util.ArrayList();

        public ComboDeviceStateCallback(java.util.List<android.hardware.camera2.CameraDevice.StateCallback> list) {
            for (android.hardware.camera2.CameraDevice.StateCallback stateCallback : list) {
                if (!(stateCallback instanceof androidx.camera.camera2.internal.CameraDeviceStateCallbacks.NoOpDeviceStateCallback)) {
                    this.mCallbacks.add(stateCallback);
                }
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(android.hardware.camera2.CameraDevice cameraDevice) {
            java.util.Iterator<android.hardware.camera2.CameraDevice.StateCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onClosed(cameraDevice);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(android.hardware.camera2.CameraDevice cameraDevice) {
            java.util.Iterator<android.hardware.camera2.CameraDevice.StateCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onDisconnected(cameraDevice);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(android.hardware.camera2.CameraDevice cameraDevice, int i17) {
            java.util.Iterator<android.hardware.camera2.CameraDevice.StateCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onError(cameraDevice, i17);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(android.hardware.camera2.CameraDevice cameraDevice) {
            java.util.Iterator<android.hardware.camera2.CameraDevice.StateCallback> it = this.mCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onOpened(cameraDevice);
            }
        }
    }

    /* loaded from: classes14.dex */
    public static final class NoOpDeviceStateCallback extends android.hardware.camera2.CameraDevice.StateCallback {
        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(android.hardware.camera2.CameraDevice cameraDevice) {
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(android.hardware.camera2.CameraDevice cameraDevice) {
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(android.hardware.camera2.CameraDevice cameraDevice, int i17) {
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(android.hardware.camera2.CameraDevice cameraDevice) {
        }
    }

    private CameraDeviceStateCallbacks() {
    }

    public static android.hardware.camera2.CameraDevice.StateCallback createComboCallback(java.util.List<android.hardware.camera2.CameraDevice.StateCallback> list) {
        if (list.isEmpty()) {
            return createNoOpCallback();
        }
        if (list.size() == 1) {
            return list.get(0);
        }
        return new androidx.camera.camera2.internal.CameraDeviceStateCallbacks.ComboDeviceStateCallback(list);
    }

    public static android.hardware.camera2.CameraDevice.StateCallback createNoOpCallback() {
        return new androidx.camera.camera2.internal.CameraDeviceStateCallbacks.NoOpDeviceStateCallback();
    }

    public static android.hardware.camera2.CameraDevice.StateCallback createComboCallback(android.hardware.camera2.CameraDevice.StateCallback... stateCallbackArr) {
        return createComboCallback((java.util.List<android.hardware.camera2.CameraDevice.StateCallback>) java.util.Arrays.asList(stateCallbackArr));
    }
}
