package androidx.camera.camera2.internal.compat.workaround;

/* loaded from: classes14.dex */
public class UseFlashModeTorchFor3aUpdate {
    private static final java.lang.String TAG = "UseFlashModeTorchFor3aUpdate";
    private final androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk mTorchFlashRequiredFor3AUpdateQuirk;

    public UseFlashModeTorchFor3aUpdate(androidx.camera.core.impl.Quirks quirks) {
        this.mTorchFlashRequiredFor3AUpdateQuirk = (androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk) quirks.get(androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk.class);
    }

    public boolean shouldUseFlashModeTorch() {
        androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk torchFlashRequiredFor3aUpdateQuirk = this.mTorchFlashRequiredFor3AUpdateQuirk;
        boolean z17 = torchFlashRequiredFor3aUpdateQuirk != null && torchFlashRequiredFor3aUpdateQuirk.isFlashModeTorchRequired();
        androidx.camera.core.Logger.d(TAG, "shouldUseFlashModeTorch: " + z17);
        return z17;
    }
}
