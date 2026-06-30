package androidx.camera.camera2.internal.compat.workaround;

/* loaded from: classes13.dex */
public class DisplaySizeCorrector {
    private final androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk mSmallDisplaySizeQuirk = (androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk) androidx.camera.camera2.internal.compat.quirk.DeviceQuirks.get(androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk.class);

    public android.util.Size getDisplaySize() {
        androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk smallDisplaySizeQuirk = this.mSmallDisplaySizeQuirk;
        if (smallDisplaySizeQuirk != null) {
            return smallDisplaySizeQuirk.getDisplaySize();
        }
        return null;
    }
}
