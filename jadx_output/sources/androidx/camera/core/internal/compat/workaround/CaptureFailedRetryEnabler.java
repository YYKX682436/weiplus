package androidx.camera.core.internal.compat.workaround;

/* loaded from: classes13.dex */
public class CaptureFailedRetryEnabler {
    private final androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk mCaptureFailedRetryQuirk = (androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk) androidx.camera.core.internal.compat.quirk.DeviceQuirks.get(androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk.class);

    public int getRetryCount() {
        androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk captureFailedRetryQuirk = this.mCaptureFailedRetryQuirk;
        if (captureFailedRetryQuirk == null) {
            return 0;
        }
        return captureFailedRetryQuirk.getRetryCount();
    }
}
