package androidx.camera.core.impl;

/* loaded from: classes14.dex */
public class CameraCaptureFailure {
    private final androidx.camera.core.impl.CameraCaptureFailure.Reason mReason;

    /* loaded from: classes6.dex */
    public enum Reason {
        ERROR
    }

    public CameraCaptureFailure(androidx.camera.core.impl.CameraCaptureFailure.Reason reason) {
        this.mReason = reason;
    }

    public java.lang.Object getCaptureFailure() {
        return null;
    }

    public androidx.camera.core.impl.CameraCaptureFailure.Reason getReason() {
        return this.mReason;
    }
}
