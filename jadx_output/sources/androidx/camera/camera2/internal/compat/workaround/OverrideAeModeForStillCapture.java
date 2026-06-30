package androidx.camera.camera2.internal.compat.workaround;

/* loaded from: classes14.dex */
public class OverrideAeModeForStillCapture {
    private boolean mAePrecaptureStarted = false;
    private final boolean mHasAutoFlashUnderExposedQuirk;

    public OverrideAeModeForStillCapture(androidx.camera.core.impl.Quirks quirks) {
        this.mHasAutoFlashUnderExposedQuirk = quirks.get(androidx.camera.camera2.internal.compat.quirk.AutoFlashUnderExposedQuirk.class) != null;
    }

    public void onAePrecaptureFinished() {
        this.mAePrecaptureStarted = false;
    }

    public void onAePrecaptureStarted() {
        this.mAePrecaptureStarted = true;
    }

    public boolean shouldSetAeModeAlwaysFlash(int i17) {
        return this.mAePrecaptureStarted && i17 == 0 && this.mHasAutoFlashUnderExposedQuirk;
    }
}
