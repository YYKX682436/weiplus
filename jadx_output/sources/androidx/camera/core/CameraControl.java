package androidx.camera.core;

/* loaded from: classes14.dex */
public interface CameraControl {

    /* loaded from: classes14.dex */
    public static final class OperationCanceledException extends java.lang.Exception {
        public OperationCanceledException(java.lang.String str) {
            super(str);
        }

        public OperationCanceledException(java.lang.String str, java.lang.Throwable th6) {
            super(str, th6);
        }
    }

    wa.a cancelFocusAndMetering();

    wa.a enableTorch(boolean z17);

    wa.a setExposureCompensationIndex(int i17);

    wa.a setLinearZoom(float f17);

    wa.a setZoomRatio(float f17);

    wa.a startFocusAndMetering(androidx.camera.core.FocusMeteringAction focusMeteringAction);
}
