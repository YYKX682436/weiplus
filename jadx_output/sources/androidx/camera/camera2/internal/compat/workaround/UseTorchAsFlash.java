package androidx.camera.camera2.internal.compat.workaround;

/* loaded from: classes14.dex */
public class UseTorchAsFlash {
    private final boolean mHasUseTorchAsFlashQuirk;

    public UseTorchAsFlash(androidx.camera.core.impl.Quirks quirks) {
        this.mHasUseTorchAsFlashQuirk = quirks.contains(androidx.camera.camera2.internal.compat.quirk.UseTorchAsFlashQuirk.class);
    }

    public boolean shouldUseTorchAsFlash() {
        return this.mHasUseTorchAsFlashQuirk;
    }
}
