package androidx.camera.camera2.internal;

/* loaded from: classes14.dex */
final class CaptureCallbackConverter {
    private CaptureCallbackConverter() {
    }

    public static android.hardware.camera2.CameraCaptureSession.CaptureCallback toCaptureCallback(androidx.camera.core.impl.CameraCaptureCallback cameraCaptureCallback) {
        if (cameraCaptureCallback == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        toCaptureCallback(cameraCaptureCallback, arrayList);
        if (arrayList.size() == 1) {
            return (android.hardware.camera2.CameraCaptureSession.CaptureCallback) arrayList.get(0);
        }
        return androidx.camera.camera2.internal.Camera2CaptureCallbacks.createComboCallback(arrayList);
    }

    public static void toCaptureCallback(androidx.camera.core.impl.CameraCaptureCallback cameraCaptureCallback, java.util.List<android.hardware.camera2.CameraCaptureSession.CaptureCallback> list) {
        if (cameraCaptureCallback instanceof androidx.camera.core.impl.CameraCaptureCallbacks.ComboCameraCaptureCallback) {
            java.util.Iterator<androidx.camera.core.impl.CameraCaptureCallback> it = ((androidx.camera.core.impl.CameraCaptureCallbacks.ComboCameraCaptureCallback) cameraCaptureCallback).getCallbacks().iterator();
            while (it.hasNext()) {
                toCaptureCallback(it.next(), list);
            }
        } else if (cameraCaptureCallback instanceof androidx.camera.camera2.internal.CaptureCallbackContainer) {
            list.add(((androidx.camera.camera2.internal.CaptureCallbackContainer) cameraCaptureCallback).getCaptureCallback());
        } else {
            list.add(new androidx.camera.camera2.internal.CaptureCallbackAdapter(cameraCaptureCallback));
        }
    }
}
