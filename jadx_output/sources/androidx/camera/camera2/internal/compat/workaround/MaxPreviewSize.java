package androidx.camera.camera2.internal.compat.workaround;

/* loaded from: classes13.dex */
public class MaxPreviewSize {
    private final androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk mExtraCroppingQuirk;

    public MaxPreviewSize() {
        this((androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk) androidx.camera.camera2.internal.compat.quirk.DeviceQuirks.get(androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk.class));
    }

    public android.util.Size getMaxPreviewResolution(android.util.Size size) {
        android.util.Size verifiedResolution;
        androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk extraCroppingQuirk = this.mExtraCroppingQuirk;
        if (extraCroppingQuirk == null || (verifiedResolution = extraCroppingQuirk.getVerifiedResolution(androidx.camera.core.impl.SurfaceConfig.ConfigType.PRIV)) == null) {
            return size;
        }
        return verifiedResolution.getWidth() * verifiedResolution.getHeight() > size.getWidth() * size.getHeight() ? verifiedResolution : size;
    }

    public MaxPreviewSize(androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk extraCroppingQuirk) {
        this.mExtraCroppingQuirk = extraCroppingQuirk;
    }
}
