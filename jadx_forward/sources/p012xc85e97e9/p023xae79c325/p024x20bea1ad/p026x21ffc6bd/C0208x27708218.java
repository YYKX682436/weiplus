package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd;

/* renamed from: androidx.camera.camera2.internal.CameraDeviceStateCallbacks */
/* loaded from: classes14.dex */
public final class C0208x27708218 {

    /* renamed from: androidx.camera.camera2.internal.CameraDeviceStateCallbacks$ComboDeviceStateCallback */
    /* loaded from: classes14.dex */
    public static final class ComboDeviceStateCallback extends android.hardware.camera2.CameraDevice.StateCallback {

        /* renamed from: mCallbacks */
        private final java.util.List<android.hardware.camera2.CameraDevice.StateCallback> f356x3c7f32e1 = new java.util.ArrayList();

        public ComboDeviceStateCallback(java.util.List<android.hardware.camera2.CameraDevice.StateCallback> list) {
            for (android.hardware.camera2.CameraDevice.StateCallback stateCallback : list) {
                if (!(stateCallback instanceof p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0208x27708218.NoOpDeviceStateCallback)) {
                    this.f356x3c7f32e1.add(stateCallback);
                }
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(android.hardware.camera2.CameraDevice cameraDevice) {
            java.util.Iterator<android.hardware.camera2.CameraDevice.StateCallback> it = this.f356x3c7f32e1.iterator();
            while (it.hasNext()) {
                it.next().onClosed(cameraDevice);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(android.hardware.camera2.CameraDevice cameraDevice) {
            java.util.Iterator<android.hardware.camera2.CameraDevice.StateCallback> it = this.f356x3c7f32e1.iterator();
            while (it.hasNext()) {
                it.next().onDisconnected(cameraDevice);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(android.hardware.camera2.CameraDevice cameraDevice, int i17) {
            java.util.Iterator<android.hardware.camera2.CameraDevice.StateCallback> it = this.f356x3c7f32e1.iterator();
            while (it.hasNext()) {
                it.next().onError(cameraDevice, i17);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(android.hardware.camera2.CameraDevice cameraDevice) {
            java.util.Iterator<android.hardware.camera2.CameraDevice.StateCallback> it = this.f356x3c7f32e1.iterator();
            while (it.hasNext()) {
                it.next().onOpened(cameraDevice);
            }
        }
    }

    /* renamed from: androidx.camera.camera2.internal.CameraDeviceStateCallbacks$NoOpDeviceStateCallback */
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

    private C0208x27708218() {
    }

    /* renamed from: createComboCallback */
    public static android.hardware.camera2.CameraDevice.StateCallback m3306x20225057(java.util.List<android.hardware.camera2.CameraDevice.StateCallback> list) {
        if (list.isEmpty()) {
            return m3308x8e6ae903();
        }
        if (list.size() == 1) {
            return list.get(0);
        }
        return new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0208x27708218.ComboDeviceStateCallback(list);
    }

    /* renamed from: createNoOpCallback */
    public static android.hardware.camera2.CameraDevice.StateCallback m3308x8e6ae903() {
        return new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0208x27708218.NoOpDeviceStateCallback();
    }

    /* renamed from: createComboCallback */
    public static android.hardware.camera2.CameraDevice.StateCallback m3307x20225057(android.hardware.camera2.CameraDevice.StateCallback... stateCallbackArr) {
        return m3306x20225057((java.util.List<android.hardware.camera2.CameraDevice.StateCallback>) java.util.Arrays.asList(stateCallbackArr));
    }
}
