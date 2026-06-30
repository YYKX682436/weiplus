package androidx.camera.core;

/* loaded from: classes14.dex */
public final class FocusMeteringResult {
    private boolean mIsFocusSuccessful;

    private FocusMeteringResult(boolean z17) {
        this.mIsFocusSuccessful = z17;
    }

    public static androidx.camera.core.FocusMeteringResult create(boolean z17) {
        return new androidx.camera.core.FocusMeteringResult(z17);
    }

    public static androidx.camera.core.FocusMeteringResult emptyInstance() {
        return new androidx.camera.core.FocusMeteringResult(false);
    }

    public boolean isFocusSuccessful() {
        return this.mIsFocusSuccessful;
    }
}
